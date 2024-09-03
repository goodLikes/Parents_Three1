package util.operations;

import app.model.FamilyTree;
import util.IFamilyTreeStorage;

public class LoadTreeOperation {
    private final IFamilyTreeStorage storage;

    public LoadTreeOperation(IFamilyTreeStorage storage) {
        this.storage = storage;
    }

    public FamilyTree execute() {
        return storage.load();
    }
}
