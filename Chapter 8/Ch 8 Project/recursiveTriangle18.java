import javax.swing.JApplet;
import java.awt.*;

public class recursiveTriangle18 extends JApplet
{
   private final int APPLET_WIDTH = 800;
   private final int APPLET_HEIGHT = 800;
   private double distance; 
   /*
   //x is accross and y is down
   point 1 - Right  A x[0],y[0] (720,600)
   point 2 - Left   B x[1],y[1]
   point 3 - Top    C x[2],y[2]
   point 4 draws back to point 1 to complete triangle

   */  private int[] xPos = {720, 80, 400, 720};
    private int[] yPos = {600, 600, 40, 600};
    private int midX[] = new int[xPos.length];
    private int midY[] = new int[yPos.length];
    private int midX1, midX2, midX3;
    private int midY1, midY2, midY3; 
    
   //-----------------------------------------------------------------
   //  Sets up the basic applet environment.
   //-----------------------------------------------------------------
   public void init()
   {
      setBackground (Color.white);
      setSize (APPLET_WIDTH, APPLET_HEIGHT);
   }

   //-----------------------------------------------------------------
   //  Draws a rocket using polygons and polylines.
   //-----------------------------------------------------------------
   public void paint (Graphics page)
   {

        page.setColor(Color.blue);
        page.drawPolyline (xPos, yPos, xPos.length);

        Triangle(xPos,yPos,page);

   }//end of paint

   public void Triangle(int[] xPos, int[] yPos, Graphics page)
   {
        //Find the distance between 2 points ex. - x,y & x1,y1
       distance = Math.sqrt((Math.pow((xPos[1] - xPos[2]), 2) + Math.pow((yPos[1] - yPos[2]), 2)));
        //if the segment/distance is 20 or so, good length to stop
        if (distance > 9)
        {
            //find the mid points of each line segment !
            //make the x and y array (3 points + first point to finish triangle) !
            
            //connect the midpoints together to make another triangle
            midX1 = (xPos[0] + xPos[2])/2;
            midX2 = (xPos[0] + xPos[1])/2;
            midX3 = (xPos[1] + xPos[2])/2;
            
            midY1 = (yPos[0] + yPos[2])/2;
            midY2 = (yPos[0] + yPos[1])/2;
            midY3 = (yPos[1] + yPos[2])/2;
            
            //polyLine uses arrays, so we make arrays
            midX[0] = midX1;
            midX[1] = midX2;
            midX[2] = midX3;
            midX[3] = midX1;
            
            midY[0] = midY1;
            midY[1] = midY2;
            midY[2] = midY3;
            midY[3] = midY1;
            
            //top triangle
            int[] x1 = {midX1, midX3, xPos[2], midX1};
            int[] y1 = {midY1, midY3, yPos[2], midY1};
            //bottom right triangle
            int[] x2 = {xPos[0], midX2, midX1, xPos[0]};
            int[] y2 = {yPos[0], midY2, midY1, yPos[0]};
            //bottom left triangle
            int[] x3 = {midX2, xPos[1], midX3, midX2};
            int[] y3 = {midY2, yPos[1], midY3, midY2};
           
            //draw the Triangle
            page.setColor(Color.blue);
            page.drawPolyline (midX,midY, midX.length);



            // Recursive calls for each section of triangle
            Triangle(x1, y1, page);
            Triangle(x2, y2, page);
            Triangle(x3, y3, page);
        }



   }//end of Triangle
}
