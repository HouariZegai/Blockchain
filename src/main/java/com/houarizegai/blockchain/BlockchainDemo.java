package com.houarizegai.blockchain;

public class BlockchainDemo {

    public static void main(String[] args) {
        Blockchain blockchain = new Blockchain();
        blockchain.addBlock(new String[]{"Houari send mohamed 120 bitcoin.", "Abdelkader send 6 bitcoin to houari."});
        blockchain.addBlock(new String[]{"Mohamed send 60 bitcoin to mom."});
        blockchain.addBlock(new String[]{"Omar send 13 bitcoin to karim."});

        System.out.println("Blocks hash:");
        for(Block block : blockchain.getBlocks()) {
            System.out.println("block #" + block.getIndex()  + ": " + block.getHash());
        }
    }
}
