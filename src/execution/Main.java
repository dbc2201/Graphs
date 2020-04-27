/*
 *   Created by IntelliJ IDEA Ultimate, 2020
 *   User: dbc2201
 *   Date: 27/04/20
 *   Time: 10:19 AM
 */

package execution;

import definition.Edge;
import definition.ListGraph;

public class Main {
    public static void main(String[] args) {
        ListGraph listGraph = new ListGraph(5, true);
        for (int i = 0; i < 5; i++) {
            listGraph.insertEdgeIntoGraph
                    (new Edge
                            (i, i + 1, Math.random() * 10));
        }
        System.out.println(listGraph);
    }
}
