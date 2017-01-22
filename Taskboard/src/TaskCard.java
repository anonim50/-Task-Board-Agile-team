import javax.smartcardio.Card;

/**
 * Created by Catalin on 15.12.2016.
 */
public class TaskCard extends Story{
    private String multipleTags;
    private long estimationTime;

    TaskCard(String newTitle, String newDescription, CardColor newColor, BoardColumns newCurrentColumn,
             long newEstimationTime) {
        title = newTitle;
        description = newDescription;
        color = newColor.toString();
        currentColumn = newCurrentColumn.toString();
        estimationTime = newEstimationTime;
    }

    public void setColor(CardColor newColor) {
        color = newColor.toString();
    }

    public void setEstimationTime(long newEstimationTime) {
        estimationTime = newEstimationTime;
    }

    public long getEstimationTime() {
        return estimationTime;
    }

    public void setMultipleTags(String nameOfDeveloperWorking, String nameOfDeveloperReviewing, String blockReason) {
        multipleTags = "Name of the developer working on the task: " + nameOfDeveloperWorking + System.lineSeparator()
                + "Name of the developer reviewing the task: " + nameOfDeveloperReviewing + System.lineSeparator()
                + "Reason of the blocking state: " + blockReason;
    }

    public String getMultipleTags() {
        return multipleTags;
    }

    public void getInfo() {
       System.out.println("\n\t About [" + title + "]\n*Description: " + description + "\n*Color: " + color +
                "\n*Current column: " + currentColumn + "\n*Estimation time: " + estimationTime + "\n");
        System.out.println(getMultipleTags());
    }

}
