package graph;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Definition for undirected graph.
 *  */
class UndirectedGraphNode {
	int label;
    ArrayList<UndirectedGraphNode> neighbors;
    UndirectedGraphNode(int x) { 
    	label = x; 
    	neighbors = new ArrayList<UndirectedGraphNode>(); 
    	}
};

public class clone_graph {
    public UndirectedGraphNode cloneGraph(UndirectedGraphNode node){
    	HashMap<Integer,UndirectedGraphNode> map =  new HashMap<>();
		return clone(node,map);
    }
    private UndirectedGraphNode clone(UndirectedGraphNode node,HashMap<Integer,UndirectedGraphNode> map){
    	if(node == null) return null;
    	if(map.containsKey(node.label)){
    		return map.get(node.label);
    	}
    	UndirectedGraphNode clone = new UndirectedGraphNode(node.label);
    	map.put(clone.label, clone);
    	for(UndirectedGraphNode neighbor:node.neighbors){
    		clone.neighbors.add(neighbor);
    	}
		return clone;	
    }
}
