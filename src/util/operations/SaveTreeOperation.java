package util.operations;

import app.model.FamilyTree;
import util.IFamilyTreeStorage;

public class SaveTreeOperation {
    private final IFamilyTreeStorage storage;

    public SaveTreeOperation(IFamilyTreeStorage storage) {
        this.storage = storage;
    }

    public void execute(FamilyTree tree) {
        storage.save(tree);
    }
}
