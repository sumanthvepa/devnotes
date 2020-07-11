package sv.demo.iderunnablejar;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
  AppTest is a unit test for the App class.

  This class was created in the IntelliJ IDEA IDE.
  This was done by positioning the cursor on the
  name of the App class in the file App.java and
  then clicking Alt-Enter (Option-Enter).

  This creates the test but does not cause the
  imports that are automatically included to
  have their corresponding jars imported into
  the project.

  To to this position the cursor on the import that has no corresponding
  JAR in the classpath, then click the light bulb icon and choose JUnit 5.4.
  That will bring in the dependency.
 */
class AppTest {
  @Test
  void hasGreeting() {
    var app = new App();
    assertNotNull(app.greeting());
  }
}
