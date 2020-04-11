package designpattern.adapter;

public class MxPlayer implements AdvanceMediaPlayer {

    @Override
    public void play(String songName) {
        System.out.println("Play song on MxPlayer");
    }
}
