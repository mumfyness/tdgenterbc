package com.tdgenterprise.blockchain;

public class Block {
    private int previousBlockHash;
    private Data blockData;
    private int blockHash;
    private long blockCreationTime;

    public Block(int previousBlockHash, Data blockData, int blockHash) {
        this.previousBlockHash = previousBlockHash;
        this.blockData = blockData;
        this.blockHash = blockHash;
        this.blockCreationTime = System.currentTimeMillis();
    }

    public long getBlockCreationTime() {
        return blockCreationTime;
    }

    public int getPreviousBlockHash() {
        return previousBlockHash;
    }

    public void setPreviousBlockHash(int previousBlockHash) {
        this.previousBlockHash = previousBlockHash;
    }

    public Data getBlockData() {
        return blockData;
    }

    public void setBlockData(Data blockData) {
        this.blockData = blockData;
    }

    public int getBlockHash() {
        return blockHash;
    }

    public void setBlockHash(int blockHash) {
        this.blockHash = blockHash;
    }
}
