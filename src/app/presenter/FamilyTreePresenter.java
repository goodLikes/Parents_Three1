
package app.presenter;

import app.model.FamilyMember;
import app.model.FamilyTree;
import app.model.Gender;
import app.service.FamilyTreeService;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FamilyTreePresenter implements IPresenter {
    private IView view;
    private FamilyTreeService familyTreeService;

    public FamilyTreePresenter(IView view, FamilyTreeService service) {
        this.view = view;
        this.familyTreeService = service;
    }

    @Override
    public void start() {
        boolean running = true;
        while (running) {
            view.showMessage("\n--- Family Tree Manager ---");
            view.showMessage("1. Add Member");
            view.showMessage("2. Find Member");
            view.showMessage("3. Display Family Tree");
            view.showMessage("4. Exit");
            view.showMessage("Enter your choice: ");
            String choice = view.getUserInput();

            switch (choice) {
                case "1":
                    addMember();
                    break;
                case "2":
                    findMember();
                    break;
                case "3":
                    displayFamilyTree();
                    break;
                case "4":
                    running = false;
                    break;
                default:
                    view.showMessage("Invalid choice. Please try again.");
            }
        }
    }

    private void addMember() {
        view.showMessage("Enter member name: ");
        String name = view.getUserInput();

        view.showMessage("Enter date of birth (yyyy-mm-dd): ");
        String dobStr = view.getUserInput();
        Date dob;
        try {
            dob = new SimpleDateFormat("yyyy-MM-dd").parse(dobStr);
        } catch (ParseException e) {
            view.showMessage("Invalid date format.");
            return;
        }

        view.showMessage("Enter gender (MALE/FEMALE): ");
        String genderStr = view.getUserInput();
        Gender gender;
        try {
            gender = Gender.valueOf(genderStr.toUpperCase());
        } catch (IllegalArgumentException e) {
            view.showMessage("Invalid gender.");
            return;
        }

        FamilyMember member = new FamilyMember(name, dob, gender);
        familyTreeService.addMember(member);
        view.showMessage("Member added successfully.");
    }

    private void findMember() {
        view.showMessage("Enter member name to find: ");
        String name = view.getUserInput();
        FamilyMember member = familyTreeService.findMemberByName(name);

        if (member != null) {
            view.showMessage("Member found: " + member);
        } else {
            view.showMessage("Member not found.");
        }
    }

    private void displayFamilyTree() {
        view.showMessage("Family Tree:");
        for (FamilyMember member : familyTreeService.getAllMembers()) {
            view.showMessage(member.toString());
        }
    }
}
