/**
 * Main
 *
 * @author luojun
 * @version v1.0
 * @since 2023-08-18
 */
public class App {

    public static void main(String[] args) {
        System.out.println(getMsg("My"));
    }

    public static String getMsg(String my){
        return String.format("%s say: 'Hello world!'", my);
    }

    public static void mySay(String my){
        System.out.println(getMsg(my));
    }
}
