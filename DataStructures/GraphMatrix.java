/*
 * Graph Represetation in matrix form of node datas
 * 
 */

import java.util.Scanner;
import java.util.ArrayList;

class GraphMatrix{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("The number of vertices(nodes) in the graph : ");
        int vertices = scanner.nextInt();
        System.out.println("The number of edges in the graph : ");
        int edges = scanner.nextInt();
        int[][] graph = new int[vertices][vertices];
        //ArrayList<Integer> edge = new ArrayList<Integer>(2);

        System.out.println("Enter the Edge with source and destination : ");
        for(int i=0;i<edges;i++){
            int source = scanner.nextInt();
            int destination = scanner.nextInt();
            graph[source][destination] = 1;
        }
        System.out.println("The Graph is : ");
        for(int i=0;i<graph.length;i++){
            for(int j=0;j<graph[i].length;j++){
                System.out.print(graph[i][j]+" ");
            }
            System.out.println();
        }
    }
}