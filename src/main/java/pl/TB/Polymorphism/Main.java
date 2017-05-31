package pl.TB.Polymorphism;

class Movie {
    private String name;

    public Movie(String name) {
        this.name = name;
    }

    public String plot() {
        return "No plot here";
    }

    public String getName() {
        return name;
    }
}

class Jaws extends Movie{

    public Jaws(){
        super("Jaws");
    }

    public String plot(){
        return "Shark is attacking other ppl";
    }
}

class IndepedenceDay extends Movie{

    public IndepedenceDay() {
        super("Independence Day");
    }

    @Override
    public String plot(){
        return "Alien attack on earth";
    }
}

class MazeRunner extends Movie{

    public MazeRunner(){
        super("Maze Runner");
    }

    public String plot(){
        return "Kids are trying to escape the Maze";
    }
}

class StarWars extends Movie{

    public StarWars(){
        super("StarWars");
    }
    @Override
    public String plot(){
        return "War between Dark and Light side of the force";
    }
}

class ForgetableMovie extends Movie{
    public ForgetableMovie() {
        super("Forgetable movie");
    }
    //no plot method
}


public class Main {

    public static void main(String[] args) {

        for (int i = 1; i < 11; i++) {
            Movie generatedMovie = randomMovie();
            System.out.println("Movie#" + i +
                    " is: " + generatedMovie.getName() + "\n" +
                    "Plot: " + generatedMovie.plot() + "\n");
        }

    }

    public static Movie randomMovie(){
        int randomNumber =(int) (Math.random() * 5) +1;
        System.out.println("Generated number was: " + randomNumber);
        switch (randomNumber){
            case 1:
                return new Jaws();
            case 2:
                return new IndepedenceDay();
            case 3:
                return new MazeRunner();
            case 4:
                return new StarWars();
            case 5:
                return new ForgetableMovie();
            default:
                return null;
        }
    }
}

