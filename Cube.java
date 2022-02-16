/*
Create a class named Square that contains data fields for 
height, width, and surfaceArea, and a method named 
computeSurfaceArea().  Create  a child  class  named  Cube.
Cube  contains  an  additional  data  field  named  depth,
and  a  computeSurfaceArea()method  that  overrides  the  parent  method. 
Write  an  application  that  instantiates  a Square  object  and  a  Cube  
object  and  displays  the  surface  areas  of  the  objects.  Save  the  files  
as  Cube.java, Square.java, and DemoSquare.java. 
*/

public class Cube extends Square{
    private int depth;
    public Cube(int length) {
        super(length);
        depth = length;
    }
    public void computeSurfaceArea(){
        super.computeSurfaceArea();
        surfaceArea = surfaceArea * 6;
    }
    public String toString(){
        return "depth : " + depth + super.toString();
    }

    
    
}
