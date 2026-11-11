public abstract class NotifierDecorator implements Notifier {
    protected final Notifier wrappee;

    public NotifierDecorator(Notifier wrappee) {
        this.wrappee = wrappee;
    }

    // Delega a chamada ao componente encapsulado
    @Override
    public void send(String message) {
        wrappee.send(message);
    }
}
