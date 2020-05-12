package denisPackage;

import org.springframework.stereotype.Component;

@Component
public class RockMusic implements Music {

    private final String name= "rock";

    RockMusic() {}

    public static RockMusic getMusic(){
        return new RockMusic();
    }

    @Override
    public void play() {
        System.out.println("Play "+name+" music. "+getSong());
    }

    @Override
    public String getSong() {
        return "Король и Шут 'Король и шут'";
    }

    public void myDestroy(){
        System.out.println("My destroy in Rock");
    }

    public void myInit(){
        System.out.println("My init in Rock");
    }

}
