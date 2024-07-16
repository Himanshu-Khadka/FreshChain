package himanshukhadka;
import java.security.MessageDigest;

public class StringUtil {
    public static String applysha256(String input){
        try{

            MessageDigest digest = MessageDigest.getInstance("SHA-256");//Creates a SHA-256 hash
            byte[] hash = digest.digest(input.getBytes("UTF-8"));//Applies sha256 to our input
            StringBuffer hexString = new StringBuffer();// This will contain hash as hexidecimal
            for (int i = 0; i < hash.length; i++){
                String hex = Integer.toHexString(0xff & hash[i]); //Converts byte to integer
                if (hex.length() == 1) hexString.append(0); //If hex is less than 2 digits, add a 0
                hexString.append(hex);
            }
            return hexString.toString();

        }catch (Exception e){
            e.printStackTrace();
            throw new RuntimeException(e);
        }

    }
}
