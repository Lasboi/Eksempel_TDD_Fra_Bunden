public class Hello {

    public static void helloWorld() {
        System.out.println("Hello");
    }

    public static void helloNavn(String navn){
        System.out.println("Hello " + navn + "!");
    }

    public static String getHelloNavn(String navn) {

        // TODO - If russian name, then Привет
        if (navn.trim().equals("")) { // Vi benytter .trim() til at fjerne alle mellemrum som der skulle være i stringen
            return "Hello!";
        } else {
            return "Hello " + navn + "!";
        }

    }
}
