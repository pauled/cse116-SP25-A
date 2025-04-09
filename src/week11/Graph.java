package week11;

import java.util.ArrayList;
import java.util.Arrays;
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
    public boolean connected(N from,N to){
        return this.adjacencyList.containsKey(from) &&
                this.adjacencyList.get(from).contains(to);
    }
    public boolean validPath(ArrayList<N> path){
        for (int x=0; x<path.size()-1; x++){
            N from=path.get(x);
            N to=path.get(x+1);
            if(!this.connected(from,to)){
                return false;
            }
        }
        return true;
    }
    public HashMap<N,Integer> countDestination(){
        HashMap<N,Integer> out=new HashMap<>();
        for (ArrayList<N> destinations : this.adjacencyList.values()){
            for (N to : destinations){
                if (!out.containsKey(to)){
                    out.put(to,1);
                } else {
                    out.put(to,out.get(to)+1);
                }
            }
        }
        return out;
    }
    public int findMaxIncoming(HashMap<N,Integer> counts){
        int max=0;
        for (Integer num : counts.values()){
            if (num>max){
                max=num;
            }
        }
        return max;
    }
    public ArrayList<N> nodesWithMax(int max,HashMap<N,Integer> counts){
        ArrayList<N> out=new ArrayList<>();
        for (N node : this.adjacencyList.keySet()){
            if (counts.get(node)==max){
                out.add(node);
            }
        }
        return out;
    }
    public ArrayList<N> mostIncomingConnections(){
        HashMap<N,Integer> reversed=this.countDestination();
        int maxIncoming=this.findMaxIncoming(reversed);
        return this.nodesWithMax(maxIncoming,reversed);
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

        ArrayList<String> path=new
                ArrayList<>(Arrays.asList("LAX","BWI","JFK","BUF"));
        System.out.println(graph.validPath(path));

        ArrayList<String> path2=new
                ArrayList<>(Arrays.asList("LAX","BWI","DET","BUF"));
        System.out.println(graph.validPath(path2));

        ArrayList<String> path3=new
                ArrayList<>(Arrays.asList("LAX","BWI","JFK","BUF","JFK","BWI","DET"));
        System.out.println(graph.validPath(path3));
    }
}

















