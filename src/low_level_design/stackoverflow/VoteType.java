package low_level_design.stackoverflow;

public enum VoteType {
    UPVOTE(1),
    DOWNVOTE(-1);

    private final int value;

    VoteType(int value) {
        this.value = value;
    }
    public int getValue() { return value; }
}
