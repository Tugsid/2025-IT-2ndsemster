import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Регистэр:");
        String Register = myObj.nextLine().trim();
        
        if (Register.length() > 0) {
            char firstChar = Register.charAt(0);
            
            if (firstChar == 'У') {
                System.out.println("Төрсөн хот: Улаанбаатар");
            } else if (firstChar == 'Д') {
                System.out.println("Төрсөн хот: Дархан");
            } else if (firstChar == 'Э') {
                System.out.println("Төрсөн хот: Эрдэнэт");
            } else if (firstChar == 'Х') {
                System.out.println("Төрсөн хот: Ховд");
            } else if (firstChar == 'С') {
                System.out.println("Төрсөн хот: Сэлэнгэ");
            } else if (firstChar == 'Т') {
                System.out.println("Төрсөн хот: Төв");
            } else if (firstChar == 'Б') {
                System.out.println("Төрсөн хот: Баян-Өлгий");
            } else if (firstChar == 'Г') {
                System.out.println("Төрсөн хот: Говь-Алтай");
            } else {
                System.out.println("Төрсөн хот тодорхойгүй");
            }
            
        } else {
            System.out.println("Medku");
        }
    }
}
