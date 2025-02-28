//package test;

//import domain.Exercise;

public class TestResult {

    public static void main(String[] args) {

        int R=626;
        String[] result = Exercise.Calculate(R);
        System.out.println("Купюри потрібні для оплати суми: "+R+" грн");
        for (String str: result){
            System.out.println(str + "грн");
        }
    }
}
