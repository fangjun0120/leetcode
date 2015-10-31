package jfang.leetcode.solution;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import jfang.leetcode.support.UndirectedGraphNode;

public class Solution133 {

	public UndirectedGraphNode cloneGraph(UndirectedGraphNode node) {
        Map<UndirectedGraphNode, UndirectedGraphNode> visited = new HashMap();
        return cloneNode(node, visited);
    }
    
    private UndirectedGraphNode cloneNode(UndirectedGraphNode node, Map<UndirectedGraphNode, UndirectedGraphNode> map) {
        if (node == null)
            return null;
        
        if (map.containsKey(node))
            return map.get(node);
        
        UndirectedGraphNode copy = new UndirectedGraphNode(node.label);
        map.put(node, copy);
        List<UndirectedGraphNode> list = copy.neighbors;
        for (UndirectedGraphNode neighbor: node.neighbors) {
            list.add(cloneNode(neighbor, map));
        }
        
        return copy;
    }
}
