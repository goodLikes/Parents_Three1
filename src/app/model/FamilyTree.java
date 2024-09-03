
package app.model;

import java.util.HashMap;
import java.util.Map;

public class FamilyTree {
    private Map<String, FamilyMember> members;

    public FamilyTree() {
        this.members = new HashMap<>();
    }

    public void addMember(FamilyMember member) {
        members.put(member.getName(), member);
    }

    public FamilyMember findMemberByName(String name) {
        return members.get(name);
    }

    public Map<String, FamilyMember> getMembers() {
        return members;
    }
}
