package com.ugurhicyilmam.ctci.ch4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Graph {
    private List<Node> nodes = new ArrayList<>();

    public List<Node> getNodes() {
        return nodes;
    }

    public void addNode(Node... nodes) {
        this.nodes.addAll(Arrays.asList(nodes));
    }
}
