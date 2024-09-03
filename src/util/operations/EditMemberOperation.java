package util.operations;

import app.model.FamilyMember;
import app.model.FamilyTree;
import app.service.FamilyTreeService;

public class EditMemberOperation {
    private final FamilyTreeService service;

    public EditMemberOperation(FamilyTreeService service) {
        this.service = service;
    }

    public void execute(FamilyMember oldMember, FamilyMember newMember) {
        FamilyTree tree = service.getFamilyTree();
        // Update the member details in the list
        for (int i = 0; i < tree.getMembers().size(); i++) {
            FamilyMember member = tree.getMembers().get(i);
            if (member.getName().equalsIgnoreCase(oldMember.getName())) {
                tree.getMembers().set(i, newMember);
                break;
            }
        }
        // Update relationships that reference the old member
        for (var relationship : tree.getRelationships()) {
            if (relationship.getMember1().getName().equalsIgnoreCase(oldMember.getName())) {
                relationship = new Relationship(newMember, relationship.getMember2(), relationship.getRelationshipType());
            }
            if (relationship.getMember2().getName().equalsIgnoreCase(oldMember.getName())) {
                relationship = new Relationship(relationship.getMember1(), newMember, relationship.getRelationshipType());
            }
        }
        service.saveFamilyTree(tree);
    }
}
