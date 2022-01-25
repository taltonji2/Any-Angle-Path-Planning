import java.util.ArrayList;
import java.util.List;

public class Node implements Comparable<Node> 
{
    public Node parent = null;

    public List<Edge> neighbors;

    public Point f;
    public Point g;
    
    public Point h; 

    Node(Point h)
    {
        this.h = h;
        this.neighbors = new ArrayList<>();
    }

    @Override
    public int compareTo(Node n)
    {
        return Double.compare(this.f, n.f);
    }

    public static class Edge 
    {
        Edge(int weight, Node node)
        {
              this.weight = weight;
              this.node = node;
        }

        public int weight;
        public Node node;
    }

    public void addBranch(int weight, Node node)
    {
        Edge newEdge = new Edge(weight, node);
        neighbors.add(newEdge);
    }

  public double calculateHeuristic(Node target)
    {
        return this.h;
    }
}
