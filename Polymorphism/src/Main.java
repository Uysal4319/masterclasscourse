import sun.net.idn.StringPrep;

import java.util.Map;
import java.util.Random;

class Movie{
    private String name;

    public Movie(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String plot(){
        return "no plot here";
    }
}

    class Jaws extends Movie{
    public Jaws(){
        super("Jaws" );
    }
    @Override
    public String plot(){
        return "A shark eats a lot of peoples";
    }

    }

    class IndependenceDay extends Movie{
    public IndependenceDay(){
        super("Indipendence Day");
    }
    @Override
        public String plot(){
        return "Aliens attempt to take over planet earth";
    }
    }

    class MazeRunner extends  Movie{
    public MazeRunner(){super("Maze Runner");}

        @Override
        public String plot(){
            return "Kids try and escape maze";
        }
    }
    class StarsWars extends Movie{
        public StarsWars() {
            super("Stars Wars");
        }
        @Override
        public String plot(){
            return "Imperial Forces try to take over the universe ";
        }
    }

    class Forgetable extends Movie{
        public Forgetable() {
            super("Forgetable");
        }
    
    }


public class Main {

    public static void main(String[] args) {
        for (int i=0 ;i<11;i++){
            Movie movie =randomMovie();
            System.out.println("Movie #"+i+" : "+movie.getName()+"\n"+
                    "Plot : "+movie.plot()+"\n");
        }
	// write your code here
    }

    public static Movie randomMovie(){
        int randomNumber= (int) (Math.random()*5)+1;
        System.out.println("Random number generate was : " + randomNumber);
        switch (randomNumber){
            case 1:
                return new Jaws();
            case 2:
                return new IndependenceDay();
            case 3:
                return new MazeRunner();
            case 4:
                return new StarsWars();
            case 5:
                return new Forgetable();

        }
        return null;
    }
}
