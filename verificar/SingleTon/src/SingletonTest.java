public class SingletonTest {
    public static void main(String[] args) {
//        SingleObject sigleObject = new SingleObject();

        SingleObject singleObject = SingleObject.getInstance();

        singleObject.showMessage();



    }
}
