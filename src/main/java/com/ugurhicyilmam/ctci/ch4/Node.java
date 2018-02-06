package com.ugurhicyilmam.ctci.ch4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Node {
    private final String value;
    private List<Node> nodes = new ArrayList<>();

    public Node(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public List<Node> getNodes() {
        return nodes;
    }

    public void addNode(Node... nodes) {
        this.nodes.addAll(Arrays.asList(nodes));
    }
}
