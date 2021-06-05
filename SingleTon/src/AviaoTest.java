public class AviaoTest {
    public static void main(String[] args) {

        agendarAssento("A1");
        agendarAssento("A1");
    }

    static void agendarAssento(String assento){
        Aviao aviao = Aviao.getInstance();
        System.out.println(aviao.bookAssento(assento));
    }
}
