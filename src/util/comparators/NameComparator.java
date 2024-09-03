// File: util/comparators/NameComparator.java
package util.comparators;

import app.model.FamilyMember;

import java.util.Comparator;

public class NameComparator implements Comparator<FamilyMember> {
    @Override
    public int compare(FamilyMember o1, FamilyMember o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
