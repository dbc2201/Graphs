/*
 *   Created by IntelliJ IDEA Ultimate, 2020
 *   User: dbc2201
 *   Date: 27/04/20
 *   Time: 10:05 AM
 */

package definition;

import java.util.Objects;

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

    public int getSourceVertex() {
        return sourceVertex;
    }

    public int getDestinationVertex() {
        return destinationVertex;
    }

    public double getWeightOfEdge() {
        return weightOfEdge;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Edge edge = (Edge) o;
        return getSourceVertex() == edge.getSourceVertex() &&
                getDestinationVertex() == edge.getDestinationVertex() &&
                Double.compare(edge.getWeightOfEdge(), getWeightOfEdge()) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getSourceVertex(), getDestinationVertex(), getWeightOfEdge());
    }
}
