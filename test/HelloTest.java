import junit.framework.TestCase;

public class HelloTest extends TestCase {

    //Test case - Med navne
    //Input: resultat = String
    //Forventet output Hello.getHelloNavn("navn her")

    public void testGetHelloNavn() {
        String resultat;

        resultat = Hello.getHelloNavn("Laila");
        assertEquals("Hello Laila!", resultat);

        resultat = Hello.getHelloNavn("Toke");
        assertEquals("Hello Toke!", resultat);

        resultat = Hello.getHelloNavn("René");
        assertEquals("Hello René!", resultat);

        resultat = Hello.getHelloNavn("System.out.println(\"noget\")");
        assertEquals("Hello System.out.println(\"noget\")!", resultat);
    }

    //Test case - Uden input
    //Input: resultat = String
    //Forventet output: Hello!

    public void testGetHelloNavnForEmptyInput() {
        String resultat;

        resultat = Hello.getHelloNavn("");
        assertEquals("Hello!", resultat);

        resultat = Hello.getHelloNavn(" ");
        assertEquals("Hello!", resultat);

        resultat = Hello.getHelloNavn("    ");
        assertEquals("Hello!", resultat);

    }

    //Test Case - På russisk
    //Input: resultat = String
    //Forventet output: Hello Станислав!
    public void testGetHelloNavnForRussianChars() {
        String resultat;
        resultat = Hello.getHelloNavn("Станислав");
        assertEquals("Hello Станислав!", resultat);


    }

    //Test Case - Med nummer
    //Input: resultat = String
    //Forventet output: Hello 2!
    public void testGetHelloNavnNumber() {
        String resultat;
        resultat = Hello.getHelloNavn("2");
        assertEquals("Hello 2!", resultat);
    }

    //Test Case - Med penge
    //Input resultat = String
    //Forventet Output: Hello 500$!
    public void testGetHelloNavnValuta() {
        String resultat;
        resultat = Hello.getHelloNavn("500$");
        assertEquals("Hello 500$!", resultat);
    }

}