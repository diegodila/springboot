package escopo;

public class Main {
    public static void main(String[] args) {

        //inicialização da variavel
        double price = 4000;


//        double macarrao; variavel nao inicializada
//        double x = macarrao;

        if (price < 2000.00) {
            double discount = price * 0.1;
        }

        double discount2;
        if (price < 2000.00) {
            discount2 = price * 0.1;
        }

        double discount3;
        if (price < 2000.00) {
            discount3 = price * 0.1;
        } else {
            discount3 = 0;
        }

//        System.out.println(discount); variavel fora do escopo
//        System.out.println(discount2); variavel nao inicializada
        System.out.println(discount3); // tratando o erro
        System.out.println(price);


    }
}
