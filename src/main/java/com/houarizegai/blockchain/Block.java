package com.houarizegai.blockchain;

import java.util.Arrays;

public class Block {
    private int index;
    private int previousHash;
    private int hash;
    private String[] transactions;

    public Block(int index, int previousHash, String[] transactions) {
        this.index = index;
        this.previousHash = previousHash;
        this.transactions = transactions;

        Object[] content = {
                Arrays.hashCode(transactions),
                previousHash,
                index
        };
        this.hash = Arrays.hashCode(content);
    }

    public int getIndex() {
        return index;
    }

    public int getPreviousHash() {
        return previousHash;
    }

    public int getHash() {
        return hash;
    }

    public String[] getTransactions() {
        return transactions;
    }
}
