package designpattern.singleton;

public enum  EnumInitialization {

    INSTANCE;

    public void doSomething(){
        System.out.println("Enum instance");
    }

    public static EnumInitialization getInstance() {
        return INSTANCE;
    }
}
