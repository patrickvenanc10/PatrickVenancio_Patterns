public class Application {
    private final UIComponentFactory factory;
    private Button button;
    private TextField textField;
    private Checkbox checkbox;

    public Application(UIComponentFactory factory) {
        this.factory = factory;
    }

    // Cria todos os componentes usando a factory (sem conhecer as classes concretas)
    public void createUI() {
        button = factory.createButton();
        textField = factory.createTextField();
        checkbox = factory.createCheckbox();
    }

    public void render() {
        button.render();
        textField.render();
        checkbox.render();
    }
}
