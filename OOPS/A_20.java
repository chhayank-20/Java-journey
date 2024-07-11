// Create class Tile to store the edge length of a square tile , and create another class Floor to store length and breadth of a rectangular floor. Add method totalTiles(Tile t) in Floor class with Tile as argument to calculate the whole number of tiles needed to cover the floor completely.

class Tile {
    private double edgeLength;
  
    public Tile(double edgeLength) {
      this.edgeLength = edgeLength;
    }
    public double getEdgeLength() {
      return edgeLength;
    }
  }
  
class Floor {
    private double length;
    private double breadth;
  
    public Floor(double length, double breadth) {
      this.length = length;
      this.breadth = breadth;
    }
    public double getLength() {
      return length;
    }
    public double getbreadth() {
      return breadth;
    }
  
    public double totalTiles(Tile tile) {
      double tileArea = tile.getEdgeLength() * tile.getEdgeLength();
      double floorArea = this.length * this.breadth;
  
      // Math.ceil();
    return floorArea/tileArea;
    }
  }
  
public class A_20 {
    public static void main (String args []){

        Tile t_obj =new Tile(20);

        Floor f_obj =new Floor(40,50);
        System.out.println(f_obj.totalTiles(t_obj));

    }
}
