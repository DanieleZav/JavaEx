import java.util.Scanner;
public class Calcolatrice {
    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);
        Scanner simbolo  = new Scanner(System.in);
        double risultato;
        String operatore;
        operazione calcolo= new operazione();

        System.out.println("Inserisci il primo numero: ");
        calcolo.setNum1(input.nextDouble());
        System.out.println("Inserisci l'operatore: ");
        calcolo.setOp(simbolo.nextLine());
        System.out.println("Inserisci il secondo numero: ");
        calcolo.setNum2(input.nextDouble());

        operatore= calcolo.getOp();

        switch(operatore) {
            case "+":
                risultato = calcolo.getNum1() + calcolo.getNum2();
                System.out.println(risultato);
                break;
            case "-":
                risultato = calcolo.getNum1() - calcolo.getNum2();
                System.out.println(risultato);
                break;
            case "*":
                risultato = calcolo.getNum1() * calcolo.getNum2();
                System.out.println(risultato);
                break;
            case "/":
                risultato = calcolo.getNum1() / calcolo.getNum2();
                System.out.println(risultato);
                break;
            default:
                System.out.println("Operatore non valido");
        }

    }


}