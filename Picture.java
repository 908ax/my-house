/**
 * This class represents a simple picture. You can draw the picture using
 * the draw method. But wait, there's more: being an electronic picture, it
 * can be changed. You can set it to black-and-white display and back to
 * colors (only after it's been drawn, of course).
 *
 * This class was written as an early example for teaching Java with BlueJ.
 * 
 * @author  Michael Kolling and David J. Barnes
 * @version 2011.07.31
 */
public class Picture
{
    private Square wall;
    private Square window;
    private Triangle roof;
    private Circle sun;
    private Circle moon;
    private Square grass;
    private Person persona1;
    private Person persona2;
    
    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    {
        // nothing to do... instance variables are automatically set to null
    }

    /**
     * Draw this picture.
     */
    public void draw()
    {
        wall = new Square();
        wall.moveHorizontal(-140);
        wall.moveVertical(20);
        wall.changeSize(120);
        wall.makeVisible();
        
        window = new Square();
        window.changeColor("black");
        window.moveHorizontal(-100);
        window.moveVertical(40);
        window.changeSize(40);
        window.makeVisible();
        
        grass = new Square();
        grass.changeColor("green");
        grass.moveHorizontal(-340);
        grass.moveVertical(135);
        grass.changeSize(1000);
        grass.makeVisible();

        roof = new Triangle();  
        roof.changeSize(60, 180);
        roof.moveHorizontal(20);
        roof.moveVertical(-60);
        roof.makeVisible();

        sun = new Circle();
        sun.changeColor("yellow");
        sun.moveHorizontal(100);
        sun.moveVertical(-40);
        sun.changeSize(80);
        sun.makeVisible();
        sun.slowMoveVertical(250);
        
        moon = new Circle();
        moon.changeColor("magenta");
        moon.moveHorizontal(-100);
        moon.moveVertical(-40);
        moon.makeVisible();
        
    }

    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {
        if (wall != null)   // only if it's painted already...
        {
            wall.changeColor("black");
            window.changeColor("white");
            roof.changeColor("black");
            sun.changeColor("black");
        }
    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
        if (wall != null)   // only if it's painted already...
        {
            wall.changeColor("red");
            window.changeColor("black");
            roof.changeColor("green");
            sun.changeColor("yellow");
        }
    }
    /**
     * Moon desaparece sun sale
     */
    public void amanecer()
    {
        if (wall != null)
        {
            moon.makeInvisible();
            sun.slowMoveVertical(-250);
            persona1 = new Person();
            persona1.moveHorizontal(-200);
            persona1.moveVertical(20);
            persona1.makeVisible();
            persona1.slowMoveHorizontal(70);
            persona2 = new Person();
            persona2.moveHorizontal(100);
            persona2.moveVertical(20);
            persona2.makeVisible();
            persona2.slowMoveHorizontal(-70);
        }
    }
}