package util.operations;

import app.model.FamilyTree;
import app.model.FamilyMember;
import app.model.Relationship;

public class ViewTreeOperation {
    public void execute(FamilyTree tree) {
        System.out.println("Family Tree:");
        for (FamilyMember member : tree.getMembers()) {
            System.out.println(member);
        }
        for (Relationship relationship : tree.getRelationships()) {
            System.out.println(relationship);
        }
    }
}
