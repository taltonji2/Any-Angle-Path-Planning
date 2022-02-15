package src;

import java.util.ArrayList;

public class Cell extends Vertex implements IBinaryHeapElement{ 
    private Cell parent;
    private double g = 0;
    private double h = 0;
    private double f = g + h;
    private boolean visited; 
    protected boolean bFree = true;
    private ArrayList<Cell> neighbors = new ArrayList<Cell>();

    public Cell getParent()
    {
        return parent;
    }
    public void setParent(Cell parentCell)
    {
        this.parent = parentCell;
    }
    public void setGCost(double cost)
    {
        g = cost;
    }
    public double getGCost()
    {
        return g;
    }
    public void setHCost(double cost) //incomplete
    {
        h = cost;
    }
    public double getHCost()
    {
        return h;
    }
    public double getFCost()
    {
        return f;
    }
    public void visit()
    {
        visited = true;
    }
    public boolean isVisited()
    {
       return visited;
    }
    public void setVisited(Boolean b)
    {
        visited = b;
    }
    public boolean getIsCellBlocked()
    {
        return bFree;
    }
    public ArrayList<Cell> getNeighbors ()
    {
        return this.neighbors;
    }
    public void setNeighbors (ArrayList<Cell> neighbors)
    {
        this.neighbors = neighbors;
    }

    protected Cell(int x, int y, int free){
        super(x, y);
        bFree = free == 0;
    }
    //
    // cell < othercell
    // cell.LessThan(othercell)
    public boolean LessThan(IBinaryHeapElement element){
        Cell cell = (Cell) element;
        double thisF = this.f;
        double cellF = cell.f;
        return thisF < cellF;
    }
    public boolean GreaterThan(IBinaryHeapElement element){
        Cell cell = (Cell) element;
        double thisF = this.f;
        double cellF = cell.f;
        return thisF > cellF;
    }
    public boolean Equals(IBinaryHeapElement element){
        Cell cell = (Cell) element;
        double thisF = this.f;
        double cellF = cell.f;
        return thisF == cellF;
    }
}