package util.operations;

import app.model.Relationship;
import app.service.FamilyTreeService;

public class AddRelationshipOperation {
    private final FamilyTreeService service;

    public AddRelationshipOperation(FamilyTreeService service) {
        this.service = service;
    }

    public void execute(Relationship relationship) {
        service.addRelationship(relationship);
    }
}
