package week11;

import java.util.ArrayList;
import java.util.HashMap;

public class Graph<N>{
    private HashMap<N, ArrayList<N>> adjacencyList;

    public Graph(){
        this.adjacencyList=new HashMap<>();
    }
    private void addNode(N a){
        if (!this.adjacencyList.containsKey(a)){
            this.adjacencyList.put(a,new ArrayList<>());
        }
    }
    public void addEdge(N from,N to){
        this.addNode(from);
        this.addNode(to);
        this.adjacencyList.get(from).add(to);
    }
    public String toString(){
        return this.adjacencyList.toString();
    }

    public static void main(String[] args) {
        Graph<String> graph=new Graph<>();
        graph.addEdge("LAX","JFK");
        graph.addEdge("LAX","BWI");
        graph.addEdge("DET","JFK");
        graph.addEdge("BUF","JFK");
        graph.addEdge("JFK","BUF");
        graph.addEdge("JFK","LAX");
        graph.addEdge("JFK","BWI");
        graph.addEdge("BWI","DET");
        graph.addEdge("BWI","BUF");
        graph.addEdge("BWI","JFK");
        graph.addEdge("BWI","LAX");
        System.out.println(graph);
    }
}

















