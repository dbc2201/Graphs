/*
 *   Created by IntelliJ IDEA Ultimate, 2020
 *   User: dbc2201
 *   Date: 27/04/20
 *   Time: 10:05 AM
 */

package definition;

/**
 * We will represent an edge between a pair of vertices with this class.
 */
public class Edge {
    private int sourceVertex;
    private int destinationVertex;
    private double weightOfEdge;

    /**
     * This constructor creates an edge with only the source vertex and the destination vertex.
     * We assume that we do not know the weight for this edge yet.
     */
    public Edge(int sourceVertex, int destinationVertex) {
        this.sourceVertex = sourceVertex;
        this.destinationVertex = destinationVertex;
    }

    /**
     * This constructor creates an edge with a source vertex, a destination vertex and the weight of the edge.
     */
    public Edge(int sourceVertex, int destinationVertex, double weightOfEdge) {
        this.sourceVertex = sourceVertex;
        this.destinationVertex = destinationVertex;
        this.weightOfEdge = weightOfEdge;
    }
}
