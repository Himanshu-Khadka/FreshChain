package himanshukhadka;

public class Block {
    public String hash;
    public String prevousHash;
    private String data;
    private long timeStamp;
    public int nonce;

    public Block(String data, String prevousHash) {
        this.data = data;
        this.prevousHash = prevousHash;
        this.timeStamp = System.currentTimeMillis();
        this.hash = calculateHash();
    }

    // Calculate the hash of the block
    public String calculateHash() {
        String calculatedhash = StringUtil.applysha256(
            prevousHash +
            Long.toString(timeStamp) +
                    Integer.toString(nonce) +
                    data
        );
        return calculatedhash;
    }

    public void mineBlock(int difficulty){
         String target = new String(new char[difficulty]).replace('\0', '0'); //Create a string with difficulty * "0"
         while(!hash.substring( 0, difficulty).equals(target)){
             nonce ++;
             hash = calculateHash();
             System.out.println("Nonce: " + nonce + " Hash: " + hash);
         }
            System.out.println("Block Mined!!! : " + hash);
    }
}
