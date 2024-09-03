package util.operations;

import app.model.FamilyMember;
import app.service.FamilyTreeService;

import java.util.List;
import java.util.stream.Collectors;

public class FindMemberByNameOperation {
    private final FamilyTreeService service;

    public FindMemberByNameOperation(FamilyTreeService service) {
        this.service = service;
    }

    public FamilyMember execute(String name) {
        List<FamilyMember> members = service.getFamilyTree().getMembers();
        return members.stream()
                .filter(member -> member.getName().equalsIgnoreCase(name))
                .findFirst()
                .orElse(null);
    }
}
