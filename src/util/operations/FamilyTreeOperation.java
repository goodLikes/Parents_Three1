package util.operations;

import app.model.FamilyTree;
import app.model.Gender;
import app.model.FamilyMember;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class FamilyTreeOperation {

    public void sortMembersByDateOfBirth(FamilyTree tree) {
        List<FamilyMember> sortedMembers = tree.getMembers().stream()
                .sorted(new util.comparators.DateOfBirthComparator())
                .collect(Collectors.toList());
        tree.getMembers().clear();
        tree.getMembers().addAll(sortedMembers);
    }

    public void sortMembersByName(FamilyTree tree) {
        List<FamilyMember> sortedMembers = tree.getMembers().stream()
                .sorted(new util.comparators.NameComparator())
                .collect(Collectors.toList());
        tree.getMembers().clear();
        tree.getMembers().addAll(sortedMembers);
    }

    public List<FamilyMember> filterMembersByGender(FamilyTree tree, Gender gender) {
        return tree.getMembers().stream()
                .filter(member -> member.getGender() == gender)
                .collect(Collectors.toList());
    }
}
