import java.util.ArrayList;

/**
 * This class represents a dotted line.
 * 
 * @authors  Luke Wismer and Michael Kšlling and David J. Barnes
 * @date: 1/24/19
 */
public class DottedLine
{
    private ArrayList<Circle> line;
    private ArrayList<String> colors;

    /**
     * Constructor for objects of class Picture
     */
    public DottedLine()
    {
        line = new ArrayList<Circle>();
        colors = new ArrayList<String>();
        makeColorArray();
    }

    /**
     * Make array of colors
     */
    public void makeColorArray()
    {
        colors.add("yellow");
        colors.add("black");
        colors.add("red");
        colors.add("blue");
        colors.add("green");
    }

    /**
     * Draw this picture.
     */
    public void addCircle()
    {
        Circle circle1;
        String color;
        color = colors.get(line.size() % 5);

        circle1 = new Circle();
        circle1.changeColor(color);
        circle1.changeSize(30);

        line.add(circle1);
        drawLine();
    }

    public void removeCircle(int index)
    {
        Circle circle1;
        circle1 = line.get(index);
        circle1.makeInvisible();
        ArrayList.removeCircle(int index);
        return drawLine;
     
    }

    public void drawLine()
    {
        int counter = 0;
 
        for(Circle circle1 : line)
        {
            circle1.circleRestart();
            circle1.moveHorizontal(counter*50);
            circle1.makeVisible();
            counter++;
        }
    }

}
