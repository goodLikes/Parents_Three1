package util.operations;

import app.model.FamilyMember;
import app.model.FamilyTree;
import app.service.FamilyTreeService;

public class DeleteMemberOperation {
    private final FamilyTreeService service;

    public DeleteMemberOperation(FamilyTreeService service) {
        this.service = service;
    }

    public void execute(FamilyMember member) {
        FamilyTree tree = service.getFamilyTree();
        tree.getMembers().removeIf(existingMember -> existingMember.getName().equalsIgnoreCase(member.getName()));
        tree.getRelationships().removeIf(relationship -> 
            relationship.getMember1().getName().equalsIgnoreCase(member.getName()) ||
            relationship.getMember2().getName().equalsIgnoreCase(member.getName())
        );
        service.saveFamilyTree(tree);
    }
}
