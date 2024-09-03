// File: util/IFamilyTreeStorage.java
package util;

import app.model.FamilyTree;

public interface IFamilyTreeStorage {
    void saveTree(FamilyTree familyTree, String filename);
    FamilyTree loadTree(String filename);
}
