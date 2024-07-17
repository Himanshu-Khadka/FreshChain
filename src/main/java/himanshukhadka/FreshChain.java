package himanshukhadka;

import java.util.ArrayList;
import com.google.gson.GsonBuilder;

public class FreshChain {

    public static ArrayList<Block> blockchain = new ArrayList<Block>();

    public static void main(String[] args) {
        blockchain.add(new Block("Genesis Block", "0"));
        blockchain.add(new Block("Second Block", blockchain.get(blockchain.size() - 1).hash));
        blockchain.add(new Block("Third Block", blockchain.get(blockchain.size() - 1).hash));

        String blockJson = new GsonBuilder().setPrettyPrinting().create().toJson(blockchain);
        System.out.println(blockJson);
        System.out.println("Is chain valid? " + isChainValid());
    }


    public static Boolean isChainValid(){
        Block currentBlock;
        Block previousBlock;

        for(int i = 1; i < blockchain.size(); i++){
            currentBlock = blockchain.get(i);
            previousBlock = blockchain.get(i-1);

            if(!currentBlock.hash.equals(currentBlock.calculateHash())){
                System.out.println("Current Hashes not equal");
                return false;
            }
            if(!previousBlock.hash.equals(currentBlock.prevousHash)){
                System.out.println("Previous Hashes not equal");
                return false;
            }
        }
        return true;
    }


}
