/**
 * Created by Catalin on 15.12.2016.
 */
public class StoryCard extends Story{
    private long storyPoints;

    StoryCard(String newTitle, String newDescription, long newStoryPoints) {
        color = "yellow"; //use color=CardColor.YELLOW.toString();
        currentColumn = BoardColumns.USER_STORIES.toString();
        title = newTitle;
        description = newDescription;
        storyPoints = newStoryPoints;
    }

    public void setStoryPoints(long newStoryPoints) {
        storyPoints = newStoryPoints;
    }

    public long getStoryPoints() {
        return storyPoints;
    }

    public void getInfo() {
        System.out.println("\n\t About [" + title + "]\n*Description: " + description + "\n*Color: " + color +
                "\n*Current column: " + currentColumn + "\n*Story points: " + storyPoints + "\n");
    }
}
