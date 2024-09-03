// File: util/FileStorage.java
package util;

import app.model.FamilyTree;

import java.io.*;

public class FileStorage implements IFamilyTreeStorage {
    @Override
    public void saveTree(FamilyTree familyTree, String filename) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename))) {
            oos.writeObject(familyTree);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public FamilyTree loadTree(String filename) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename))) {
            return (FamilyTree) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return new FamilyTree();
    }
}
