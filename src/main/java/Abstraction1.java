public class Abstraction1 implements Abstraction {
    private Implementor implementor;

    @org.jetbrains.annotations.Contract(pure = true)
    public Abstraction1(Implementor implementor) {
        this.implementor = implementor;
    }

    public String operationAbstr() {
        return "Abstraction1: Delegating implementation to an implementor.\n"
                + implementor.operationImp();
    }
}
