package ru.neothat;

import java.util.Random;

public class TwentyTrees {
    public static void main(String[] args) {
        Random random = new Random();

        int count = 20;
        int level = 4;
        int value = 25;

        int nodeCount = (int) (Math.pow(2, level) - 1);

        int balanceTreeCount = 0;

        boolean treeView = false;

        for (int i = 0; i < count; i++) {
            Tree<Integer> newTree = new TreeImpl<>(level);
            initTree(random, nodeCount, value, newTree);
            if (newTree.isBalanced()){
                balanceTreeCount++;
                if (!treeView) {
                    treeView = true;
                    newTree.display();
                }
            }
        }
        System.out.println("Balanced Tree Count = " + ((balanceTreeCount / (count * 1.0)) * 100) + "%");
    }

    private static void initTree(Random random, int nodeCount, int value, Tree<Integer> newTree) {
        for (int i = 0; i < nodeCount; i++) {
            newTree.add(random.nextInt(value * 2 + 1) - value);
        }
    }
}
