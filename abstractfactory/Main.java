public class Main {
    public static void main(String[] args) {
        System.out.println("=== Tema Claro ===");
        Application lightApp = new Application(new LightThemeFactory());
        lightApp.createUI();
        lightApp.render();

        System.out.println();

        System.out.println("=== Tema Escuro ===");
        Application darkApp = new Application(new DarkThemeFactory());
        darkApp.createUI();
        darkApp.render();
    }
}
