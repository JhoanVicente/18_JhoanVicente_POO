package S03_18;

public class S3_18_If_IfElse {

/**
* @param args the command line arguments
*/
public static void main(String[] args) {

boolean a = false;
int b = 8;
// if simple
if (a) {
System.out.println("Hola");
}
// if else
if (a) {
System.out.println("Ejecucin true");
} else {
System.out.println("Ejecucion false");
}

    switch (b) {
        case 10 -> System.out.println("b vale 10");
        case 20 -> System.out.println("b vale 20");
        case 30 -> System.out.println("b vale 30");
        default -> System.out.println("No cumple");
    }
}

}
