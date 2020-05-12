package denisPackage;

import denisPackage.ClassicalMusic;
import denisPackage.Music;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;


@Component
public class MusicPlayer {
    private String name;
    private int volume;
    private Music musicpl;

    @Autowired
    @Qualifier("popMusic")
    public void setMusic(Music music) {
        this.musicpl = music;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return musicpl.getSong();
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getVolume() {
        return volume;
    }

    public void play(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.tld");

        musicpl.play();
    }
}

/*
@Component
public class MusicPlayer {
    private String music;
    private String name;
    private int volume;
    private Music musicpl;

    public void setMusic(String music) {
        this.music = music;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return musicpl.getSong();
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getVolume() {
        return volume;
    }

    public void play(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.tld");
        if(music.equals("RockMusic"))
            musicpl = context.getBean("rockMusic", RockMusic.class);
        else if(music.equals("PopMusic"))
            musicpl = context.getBean("popMusic", PopMusic.class);
        else
            musicpl = context.getBean("classicalMusic", ClassicalMusic.class);
        musicpl.play();
    }
}
*/