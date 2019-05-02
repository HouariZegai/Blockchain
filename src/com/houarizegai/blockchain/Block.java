package com.houarizegai.blockchain;

import java.util.Arrays;

public class Block {
    private int previousHash;
    private int hash;
    private String[] transactions;

    public Block(int previousHash, String[] transactions) {
        this.previousHash = previousHash;
        this.transactions = transactions;

        Object[] content = {
                Arrays.hashCode(transactions),
                previousHash
        };
        this.hash = Arrays.hashCode(content);
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
