package denisPackage;

import org.springframework.stereotype.Component;

@Component
public class ClassicalMusic implements Music {

    ClassicalMusic(){}

    private final String name= "classical";

    public static ClassicalMusic getMusic(){
        return new ClassicalMusic();
    }

    @Override
    public void play() {
        System.out.println("Play "+name+" music. "+getSong());
    }

    @Override
    public String getSong() {
        return "Bethoven 'Hungarian Rhapsody'";
    }

    public void myDestroy(){
        System.out.println("My destroy in Classical");
    }

    public void myInit(){
        System.out.println("My init in Classical");
    }

}
