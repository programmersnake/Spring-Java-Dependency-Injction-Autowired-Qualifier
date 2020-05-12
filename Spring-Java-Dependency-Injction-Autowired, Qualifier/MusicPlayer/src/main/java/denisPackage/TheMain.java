package denisPackage;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Scanner;

public class TheMain {

    public static void main(String[] args){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.tld");
        MusicPlayer player = context.getBean("musicPlayer", MusicPlayer.class);
        Music rock = context.getBean("rockMusic", RockMusic.class);
        
        player.play();

        player.setMusic(rock);
        player.play();
        context.close();
    }

}
