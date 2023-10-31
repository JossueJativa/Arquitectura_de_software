package arquitectura_de_software;

import groovy.lang.Binding;
import groovy.lang.GroovyShell;

public class App {
    public void getGreeting() {
        try {
            int x = 10;
            int y = 20;
            String groovyScript = "def sum(int x, int y) { return x + y }";
            groovyScript += "println 'Sum: ' + sum(x, y)";

            Binding binding = new Binding();
            binding.setVariable("x", x);
            binding.setVariable("y", y);

            GroovyShell shell = new GroovyShell(binding);
            shell.evaluate(groovyScript);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new App().getGreeting();
    }
}
