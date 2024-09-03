package util.operations;

import app.model.FamilyMember;
import app.service.FamilyTreeService;

public class AddMemberOperation {
    private final FamilyTreeService service;

    public AddMemberOperation(FamilyTreeService service) {
        this.service = service;
    }

    public void execute(FamilyMember member) {
        service.addMember(member);
    }
}
