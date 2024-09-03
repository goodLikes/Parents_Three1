package util.operations;

import app.model.FamilyMember;
import app.model.FamilyTree;
import app.presenter.IView;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

public class FilterByDateOfBirthOperation implements FamilyTreeOperation {
    private final Date dateOfBirth;

    public FilterByDateOfBirthOperation(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public void execute(FamilyTree tree, IView view) {
        List<FamilyMember> filteredMembers = tree.getMembers().stream()
                .filter(member -> member.getDateOfBirth().equals(dateOfBirth))
                .collect(Collectors.toList());
        StringBuilder builder = new StringBuilder("Filtered by Date of Birth (" + dateOfBirth + "):\n");
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
