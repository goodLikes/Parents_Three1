package util.operations;

import app.model.FamilyMember;
import app.model.FamilyTree;
import app.model.Gender;
import app.presenter.IView;

import java.util.List;
import java.util.stream.Collectors;

public class FilterByGenderOperation implements FamilyTreeOperation {
    private final Gender gender;

    public FilterByGenderOperation(Gender gender) {
        this.gender = gender;
    }

    @Override
    public void execute(FamilyTree tree, IView view) {
        List<FamilyMember> filteredMembers = tree.getMembers().stream()
                .filter(member -> member.getGender() == gender)
                .collect(Collectors.toList());
        StringBuilder builder = new StringBuilder("Filtered by Gender (" + gender + "):\n");
        for (FamilyMember member : filteredMembers) {
            builder.append(member.getName())
                   .append(" (")
                   .append(member.getGender())
                   .append(") - ")
                   .append(member.getDateOfBirth())
                   .append("\n");
        }
        view.display(builder.toString());
    }
}
