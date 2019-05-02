package com.houarizegai.blockchain;

import java.util.LinkedList;
import java.util.List;

public class Blockchain {
    private List<Block> blocks;

    public Blockchain() {
        this.blocks = new LinkedList<>();
        // create the first block
        Block firstBlock = new Block(0, new String[]{"First block"});
        this.blocks.add(firstBlock);
    }

    public void addBlock(String[] transactions) {
        Block block = new Block(blocks.get(blocks.size() - 1).getHash(), transactions);
        this.blocks.add(block);
    }

    public List<Block> getBlocks() {
        return blocks;
    }
}
