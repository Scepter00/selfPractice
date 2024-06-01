package methodLearning.GreetingMethod;

public class Greeter {
    private void greet(Greeting greeting) {
        greeting.perform();
    }
    public static void main(String[] args) {
        Greeter greeter = new Greeter();
        GreetingsEarthlingsGreeting greetingsEarthlingsGreeting = new GreetingsEarthlingsGreeting();
        greeter.greet(greetingsEarthlingsGreeting);
    }
}
