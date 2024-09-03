// File: app/Main.java
package app;

import app.model.FamilyTree;
import app.presenter.FamilyTreePresenter;
import app.presenter.IView;
import app.service.FamilyTreeService;
import util.FileStorage;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        FamilyTree familyTree = new FamilyTree();
        FamilyTreeService familyTreeService = new FamilyTreeService(familyTree);
        IView consoleView = new ConsoleView();
        FamilyTreePresenter presenter = new FamilyTreePresenter(consoleView, familyTreeService);

        presenter.start();
    }

    // Simple console view for demonstration
    static class ConsoleView implements IView {
        private Scanner scanner = new Scanner(System.in);

        @Override
        public void showMessage(String message) {
            System.out.println(message);
        }

        @Override
        public String getUserInput() {
            return scanner.nextLine();
        }
    }
}
