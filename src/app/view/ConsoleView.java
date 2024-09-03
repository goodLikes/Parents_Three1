package app.view;

import app.model.FamilyMember;
import app.model.Relationship;
import app.presenter.IView;

import java.util.List;

public class ConsoleView implements IView {
    @Override
    public void showFamilyMembers(List<FamilyMember> members) {
        System.out.println("Family Members:");
        for (FamilyMember member : members) {
            System.out.println(member);
        }
    }

    @Override
    public void showRelationships(List<Relationship> relationships) {
        System.out.println("Relationships:");
        for (Relationship relationship : relationships) {
            System.out.println(relationship);
        }
    }

    @Override
    public void showMessage(String message) {
        System.out.println(message);
    }
}
