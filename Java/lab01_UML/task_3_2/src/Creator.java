public abstract class Creator {
    public void someOperation(){
        System.out.println("Creator is doing some operation.");
        Product p = createProduct();
        p.doSomething();
    };

    public abstract Product createProduct();

}
