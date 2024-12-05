package graphs_basic;
import java.util.*;
public class Graphs {
	int vertices;
	//adjacenncy list representation
	LinkedList<Integer> adjListArray[];
	
	public Graphs(int vertices) {

		this.vertices = vertices;
		//initialize  new LinkedList[vertices] creates an array of size 
		//vertices where each element is null initially.
		adjListArray=new LinkedList[vertices];
		for(int i=0;i<vertices;i++) {
			//The loop adjListArray[i] = new LinkedList<>(); assigns a 
			//new LinkedList to each index of the array, so now each 
			//element points to a valid LinkedList.
			adjListArray[i]=new LinkedList<>();
		}
	}
	//for undirected graphs
	//insertion
	public void insertion(int src,int dest) {
		adjListArray[src].add(dest);
		adjListArray[dest].add(src);
		
	}
	//for directed graphs
	public void directedinsertion(int src,int dest) {
		adjListArray[src].add(dest);
	}
	//display
	public void display() {
		for(int i=0;i<vertices;i++) {
			System.out.print(i);
			//for(int vertex=0;adjListArray[i].size();vertex++)
			for(int vertex: adjListArray[i]) {
				System.out.print("->"+vertex);
				
			}
			System.out.println();
		}
	}
	//dfs
	public void dfs(int node,boolean[]visited) {
		visited[node]=true;
		System.out.println(node);
		
		for(int neighbor: adjListArray[node]) {
			if(!visited[neighbor]) {
				dfs(neighbor,visited);
			}
		}
	}





	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int V=5;
		Graphs graph=new Graphs(V);
		//undirected graph
		graph.insertion(0,4);
		graph.insertion(0,1);
		graph.insertion(0,3);
		graph.insertion(1,3);
		graph.display();
		
		Graphs directedgraph=new Graphs(V);
		//directed graph
		directedgraph.directedinsertion(0, 3);
		directedgraph.directedinsertion(1, 4);
		directedgraph.directedinsertion(2, 3);
		directedgraph.directedinsertion(1, 3);
		System.out.println("directwed");
		directedgraph.display();
		//dfs
		boolean[] visited=new boolean[V];
		directedgraph.dfs(0,visited);
		

	}

}
