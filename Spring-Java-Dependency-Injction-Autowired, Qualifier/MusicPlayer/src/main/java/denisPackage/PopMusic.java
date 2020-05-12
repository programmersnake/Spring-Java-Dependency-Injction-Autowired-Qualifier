package denisPackage;

import org.springframework.stereotype.Component;

@Component
public class PopMusic implements Music {

    private final String name= "pop";

    PopMusic() {}

    public static PopMusic getMusic(){
        return new PopMusic();
    }

    @Override
    public void play() {
        System.out.println("Play "+name+" music. "+getSong());
    }

    @Override
    public String getSong() {
        return "Время и Стекло 'Троль'";
    }

    public void destroy(){
        System.out.println("My destroy in Pop");
    }

    public void init(){
        System.out.println("My init in Pop");
    }
}
