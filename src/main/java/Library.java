import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Library {
    public static final Logger LOGGER
            = LoggerFactory.getLogger(Library.class);

    public boolean someLibraryMethod() {
        return true;
    }

    public int add (int a, int b) {
        //a += 1;
        //System.out.println(x: "a={}" + a);
        LOGGER.debug("a={}", a);
        return a + b;
    }

    public boolean isNegative (int a) {
        return a < 0;
    }

    public int login (String password) {
        return StringUtils.equals("xxxxx", password);
    }

    public float average(List<float> numbers) {
        float sum = 0;
        for(float num: numbers) {
            sum += num;
        }
        return sum / numbers.size();
    }
}
