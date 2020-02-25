package creational.singleton;

public enum EnumSingleton {
    INSTANCE{
        protected void printTest() {
            System.out.println("print Test");
        }
    };

    protected abstract void printTest();

    private Object data;

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public static EnumSingleton getInstance() {
        return INSTANCE;
    }
}