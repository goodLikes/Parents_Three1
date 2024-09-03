
package app.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FamilyMember {
    private String name;
    private Date dateOfBirth;
    private Gender gender;
    private List<FamilyMember> parents;
    private List<FamilyMember> children;

    public FamilyMember(String name, Date dateOfBirth, Gender gender) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
        this.parents = new ArrayList<>();
        this.children = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public Gender getGender() {
        return gender;
    }

    public List<FamilyMember> getParents() {
        return parents;
    }

    public List<FamilyMember> getChildren() {
        return children;
    }

    public void addParent(FamilyMember parent) {
        parents.add(parent);
    }

    public void addChild(FamilyMember child) {
        children.add(child);
    }

    @Override
    public String toString() {
        return name + " (" + gender + ", " + dateOfBirth + ")";
    }
}
