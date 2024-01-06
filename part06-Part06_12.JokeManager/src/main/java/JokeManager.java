import java.util.ArrayList;
import java.util.Random;


public class JokeManager {
    private ArrayList<String> jokes;
    public JokeManager() {
        this.jokes=new ArrayList<>();
    }
    public void addJoke (String joke) {
        if (joke.isEmpty()) {
            return;
        }
        this.jokes.add(joke);
    }
    public String drawJoke() {
        if (this.jokes.isEmpty()) {
            return "Jokes are in short supply.";
        }
        Random r = new Random();
        int index = r.nextInt(jokes.size());
        return this.jokes.get(index);
    }

    public void printJokes() {
        for (String j:this.jokes) {
            System.out.println(j);
        }
    }
}
