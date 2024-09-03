
package app.service;

import app.model.FamilyMember;
import app.model.FamilyTree;

import java.util.List;
import java.util.ArrayList;

public class FamilyTreeService {
    private FamilyTree familyTree;

    public FamilyTreeService(FamilyTree familyTree) {
        this.familyTree = familyTree;
    }

    public void addMember(FamilyMember member) {
        familyTree.addMember(member);
    }

    public FamilyMember findMemberByName(String name) {
        return familyTree.findMemberByName(name);
    }

    public List<FamilyMember> getAllMembers() {
        return new ArrayList<>(familyTree.getMembers().values());
    }
}
