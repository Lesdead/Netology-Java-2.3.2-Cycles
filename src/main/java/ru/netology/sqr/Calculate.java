package ru.netology.sqr;

public class Calculate {
    public static void main(String[] args) {

        SQRService service = new SQRService();

        int sum = service.calculate(2000, 4000);

        System.out.println(sum);
    }
}
