/**
 * Created by Catalin on 15.12.2016.
 */
public class TaskBoard {
    public static void main(String[] args) {

        StoryCard nr1 = new StoryCard("Cleanup configuration", "No description", 5);
        nr1.moveTo(BoardColumns.IN_PROGRESS);

        TaskCard n1 = new TaskCard("Test for cancel delete process", "Hurry up!", CardColor.GREEN,
                BoardColumns.TODO, 21);
        n1.setMultipleTags("Jhonny D.", "Anna M.", "None");
        n1.setColor(CardColor.RED);

        TaskCard n2 = new TaskCard("Configure router connection", "Read X documentation", CardColor.GREEN,
                BoardColumns.IN_REVIEW, 14);
        n2.setMultipleTags("Dan A.", "Bucky S.", "Missing test exception");

        n2.getInfo();
    }
}
