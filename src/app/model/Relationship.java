package app.model;

public class Relationship {
    private final FamilyMember member1;
    private final FamilyMember member2;
    private final String relationshipType;

    public Relationship(FamilyMember member1, FamilyMember member2, String relationshipType) {
        this.member1 = member1;
        this.member2 = member2;
        this.relationshipType = relationshipType;
    }

    public FamilyMember getMember1() {
        return member1;
    }

    public FamilyMember getMember2() {
        return member2;
    }

    public String getRelationshipType() {
        return relationshipType;
    }
}
