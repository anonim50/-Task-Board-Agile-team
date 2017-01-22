/**
 * Created by Catalin on 27.12.2016.
 */
public class Story {
    protected String title;
    protected String description;
    protected String currentColumn = "User Stories";
    protected String color = CardColor.YELLOW.toString();

    public void setTitle(String newTitle) {
        title = newTitle;
    }

    public String getTitle() {
        return title;
    }

    public void setDescription(String newDescription) {
        description = newDescription;
    }

    public String getDescription() {
        return description;
    }

    public void setCurrentColumn(BoardColumns newColumn) {
        currentColumn = newColumn.toString();
    }

    public String getCurrentColumn() {
        return currentColumn;
    }

    public String getColor() {
        return color;
    }

    public void moveTo(BoardColumns newColumn) {
        if (!color.equals(CardColor.YELLOW.toString())) {
            if (!newColumn.equals(BoardColumns.USER_STORIES.toString())) { currentColumn = newColumn.toString(); }
            else { System.out.println("Nu se poate muta pe aceasta coloana."); }
        }
        else { currentColumn = newColumn.toString(); }
    }

    public void getInfo() {
        System.out.println("\n\t About [" + title + "]\n*Description: " + description +
                "\n*Current column: " + currentColumn);
    }
}
