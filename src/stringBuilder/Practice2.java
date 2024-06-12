package stringBuilder;

public class Practice2 {
    public static void main(String[] args) {

        StringBuilder email = new StringBuilder("Hi John,");
        email.append(" I will be on leave next week.");
        email.append("\nWould you approve my paid time off from May 1st till the 7th.").append("\nBest Regards,").append("\nPatel Man");
        System.out.println(email);




    }
}
