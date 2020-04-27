/*
 *   Created by IntelliJ IDEA Ultimate, 2020
 *   User: dbc2201
 *   Date: 27/04/20
 *   Time: 10:35 AM
 */

package definition;

import adt.GraphADT;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ListGraph implements GraphADT {
    private int numberOfVertices;
    private boolean isDirectedGraph;

    private List<Edge>[] arrayOfListOfEdges;

    public ListGraph(int numberOfVertices, boolean isDirectedGraph) {
        this.numberOfVertices = numberOfVertices;
        this.isDirectedGraph = isDirectedGraph;
        arrayOfListOfEdges = new List[numberOfVertices];
        for (int i = 0; i < numberOfVertices; i++) {
            arrayOfListOfEdges[i] = new LinkedList<>();
        }
    }


    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (List<Edge> listOfEdges : arrayOfListOfEdges) {
            for (Edge edge : listOfEdges) {
                stringBuilder.append(edge.toString());
            }
        }
        return stringBuilder.toString();
    }

    @Override
    public int getNumberOfVertices() {
        return this.numberOfVertices;
    }

    @Override
    public boolean isDirectedGraph() {
        return this.isDirectedGraph;
    }

    @Override
    public void insertEdgeIntoGraph(Edge edge) {
        arrayOfListOfEdges[edge.getSourceVertex()].add(edge);
        if (!isDirectedGraph()) {
            arrayOfListOfEdges[edge.getSourceVertex()].add(new Edge(edge.getDestinationVertex(),
                    edge.getSourceVertex(),
                    edge.getWeightOfEdge()));
        }
    }

    @Override
    public boolean isEdge(int sourceVertex, int destinationVertex) {
        return arrayOfListOfEdges[sourceVertex].contains(new Edge(sourceVertex, destinationVertex));
    }

    @Override
    public Edge getEdge(int sourceVertex, int destinationVertex) {
        Edge target = new Edge(sourceVertex, destinationVertex, Double.POSITIVE_INFINITY);
        for (Edge edge : arrayOfListOfEdges[sourceVertex]) {
            if (edge.equals(target)) {
                return edge;
            }
        }
        return null;
    }

    @Override
    public Iterator<Edge> edgeIterator(int sourceVertex) {
        return arrayOfListOfEdges[sourceVertex].iterator();
    }
}
