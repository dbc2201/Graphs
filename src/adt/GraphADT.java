package adt;

import definition.Edge;

import java.util.Iterator;

/**
 * This is the ADT for a Graph.
 * Methods deemed necessary for a Graph will be defined here first.
 * A Graph is a pair of set of vertices, and a set of edges between a pair of vertices.
 * We represent vertices in a Graph with integers from 0 to n-1.
 */
public interface GraphADT {
    /**
     * This method will return the number of veritces in a Graph.
     */
    int getNumberOfVertices();

    /**
     * This method determines whether the graph is a directed graph.
     */
    boolean isDirectedGraph();

    /**
     * This method will insert an edge into the graph.
     */
    void insertEdgeIntoGraph(Edge edge);

    /**
     * This method determines whether an edge exists between a pair of sourceVertex and a destinationVertex.
     *
     * @param sourceVertex      the source vertex
     * @param destinationVertex the destination vertex
     * @return true if there is an edge between the sourceVertex and the destinationVertex.
     */
    boolean isEdge(int sourceVertex, int destinationVertex);

    /**
     * This method will retrieve an edge between a pair of two vertices.
     * It should only be called if said edge exists; you can check if the said edge exists with the isEdge() method.
     *
     * @param sourceVertex      the source vertex
     * @param destinationVertex the destination vertex
     * @return the edge between the two vertices or null if there is no edge.
     */
    Edge getEdge(int sourceVertex, int destinationVertex);

    /**
     * This method will return an Iterator to the edges connected to a given vertex.
     *
     * @param sourceVertex the source vertex
     * @return An Iterator<Edge> to the vertices connected to the source vertex.
     */
    Iterator<Edge> edgeIterator(int sourceVertex);
}
