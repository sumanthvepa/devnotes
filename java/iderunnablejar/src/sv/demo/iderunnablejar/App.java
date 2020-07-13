package sv.demo.iderunnablejar;

/**
 *   A Simple application that prints a message about how it was built.
 *
 *   This app is part of a project that demonstrates how the
 *   To build an JAR archive go to File -> Project Structure
 *   Select Artifacts click JAR and then select the main class. That will
 *   create the necessary JAR.
 */
public class App {

    public String greeting() {
        return "This is an app whose runnable jar was created within the IDE";
    }

    public static void main(String[] args) {
        var app = new App();
        System.out.println(app.greeting());
    }
}
