package himanshukhadka;

public class FreshChain {
    public static void main(String[] args) {
        //create a genesis block
        Block genesisBlock = new Block("first block", "0");
        System.out.println("Hash for block 1 : " + genesisBlock.hash);

        //creating blockchain
        Block secondBlock = new Block("Yo im the second block", genesisBlock.hash);
        System.out.println("Hash for block 2 : " + secondBlock.hash);

        Block thirdBlock = new Block("Hey im the third block", secondBlock.hash);
        System.out.println("Hash for block 3 : " + thirdBlock.hash);
    }
}
