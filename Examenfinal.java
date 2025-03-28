import java.util.Scanner;

public class Examenfinal {
    public static void main(String[]args) {

     //Crea un agoritmo para resolver cada ecuacion 
     System.out.println("[1] La suma de un numero y su tiple: ");   
     System.out.println("[2] El doble de un  numero y su tiple: ");
     System.out.println("[3] La mitad de un numero más su cuadrado: ");
     System.out.println("La suma de un numero, su doble y su tiple: ");
     int EntradaMenu;
     
     switch (EntradaMenu) {
        case 1:
        Scanner Entradamenu = new Scanner(System.in);
        System.out.print("Ingrese un valor para x: ");
        int x = Entradamenu.nextInt();
        int resultado1 = x + (3 * x);
        System.out.println("Resultado de x + 3x: " + resultado1);
          
      break;
        case 2:
        System.out.println("Ingresar otro valor para x: ");
        int resultado2 = (2 * x) - 5;
        System.out.println("Resultado de 2x - 5: " + resultado2);
      break;
        
       case 3:
       if (x != 0) { 
            double resultado3 = (2.0 / x) + (x * x);
            System.out.println("Resultado de 2/x + x2: " + resultado3);
        } else {
            System.out.println("");
        }
         break;
        case 4:
        System.out.println("Ingrese un valor para x :");
        int resultado4 = x + (2 * x) + (3 * x);
        System.out.println("Resultado de x + 2x + 3x: " + resultado4);
        default:
        System.out.println();
        }
        
        Scanner menu= new scanner(system.in);
        int opcion;

        do{
        
        //Menú
        System.out.println("");
        System.out.println("[1] Calcular promedio");
            System.out.println("[2] Saludar por tu nombre");
            System.out.println("[3] Di hola mundo");
            System.out.println("[4] Salir");
           

         switch (menu) {
            case 1:
            System.out.println("Número 1:");
            int num1 = menu.nextInt();
            int promedio = (num1) / 1;
            System.out.println("El promedio de un números es: " + promedio);
            break;
            
            case 2:
            System.out.println("saludar por tu nombre");
         
            default:
                break;
         }
        }
    }
