package com.tdgenterprise.blockchain;

public class tdgblockchain {

    public static void main(String[] args) {
        /**
         * Blockchain -
         * Block - containing data
         *       - Block hash with contained data.
         *       - Previous Block hash.
         * Blocks chained together.
         */

        /**
         * The Genesis block has no previous block hash.
         */
        Data genesisData   = new Data("V12EngineBlock",0, 1212.0012);
        Block genesisBlock = new Block(0, genesisData, 0);
        int blockHash = genesisBlock.hashCode();
        genesisBlock.setBlockHash(blockHash);
    }
}
