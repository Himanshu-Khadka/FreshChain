package himanshukhadka;

public class Block {
    public String hash;
    public String prevousHash;
    private String data;
    private long timeStamp;

    public Block(String data, String prevousHash) {
        this.data = data;
        this.prevousHash = prevousHash;
        this.timeStamp = System.currentTimeMillis();

    }
}
