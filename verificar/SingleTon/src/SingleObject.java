public class SingleObject {

    //Criando um objeto Single
    private static SingleObject instance = new SingleObject();

    private SingleObject(){}

    public static SingleObject getInstance() {
        return instance;
    }

    public void showMessage() {
    }
}
