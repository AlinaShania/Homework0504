package HW0504;

public class Task1 {

    public String method1 (String word){
        StringBuilder sb = new StringBuilder(word);
        sb = sb.reverse();
        for (int i=sb.length()-1;i>0;i--){
            System.out.println(sb);
            break;
        } return word;
    }

    public static void main(String[] args) {
        Task1 task1 = new Task1();
         task1.method1("pasta");

    }
}
