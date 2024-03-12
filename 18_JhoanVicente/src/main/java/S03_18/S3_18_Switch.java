package S03_18;

/**
*
* @author Lenovo
*/
public class S3_18_Switch {

public static void main(String[] args) {
// TODO code application logic here
int a = 2;

switch(a){
case 1 -> System.out.println("Opción 1");
case 2 -> System.out.println("Opción 2");
default -> System.out.println("No se ha encontrado la opcion");

}

String b= "pantalón";

switch (b){
case "polo" -> System.out.println("Estas comprando un polo");
case "short" -> System.out.println("Estas comprando un short");
case "Chompa" -> System.out.println("Estas comprando una chompa");
default -> System.out.println("No encontre la prenda");
}
}

}