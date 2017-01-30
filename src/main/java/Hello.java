/**
 * Created by isaac waweru on 1/30/2017.
 */
import static spark.Spark.get;
public class Hello {
    public static void main(String[] args){
        get("/", (req,res) -> "hello from sparkjava.com");
    }
}
