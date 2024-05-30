import java.util.Stack;

public class TutoringStack {
    public static void main(String[] args) {
      
        Stack<String> tutoringStack = new Stack<>();

       
        tutoringStack.push("Tutoría de Matemáticas");
        tutoringStack.push("Tutoría de Física");
        tutoringStack.push("Tutoría de Química");
        tutoringStack.push("Tutoría de Biología");
        tutoringStack.push("Tutoría de Historia");

      
        System.out.println("Orden de solicitud de tutorías:");
        while (!tutoringStack.isEmpty()) {
            System.out.println(tutoringStack.pop());
        }
    }
}
