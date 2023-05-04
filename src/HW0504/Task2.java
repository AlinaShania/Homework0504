package HW0504;

public class Task2 {

    private String method2 (String word){

        String word1 = word.replaceAll("[^a,o,u,e,i]","");
        return word1;
    }

    public static void main(String[] args) {
        Task2 obj = new Task2();
        System.out.println(obj.method2("paranoia"));
    }
}
