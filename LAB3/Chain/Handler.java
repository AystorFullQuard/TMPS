package Chain;

public interface Handler {
    public abstract void setNext(Handler nextInOrder);

    public abstract void handle(Dimension responsability) throws Exception;
}
