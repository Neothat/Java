package ru.neothat;

import java.util.Stack;

public interface IGraph {

    void addVertex(String label);

    void addEdge(String startLabel, String endLabel);

    void addEdges(String startLabel, String secondLabel, String... others);

    int getSize();

    void display();

    void dfs(String startLabel);


    void bfs(String startLabel);

    Stack<String> findShortPathViaBfs(String startLabel, String finishLabel);
}
