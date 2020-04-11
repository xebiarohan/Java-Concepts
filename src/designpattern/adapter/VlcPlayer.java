package designpattern.adapter;

public class VlcPlayer implements AdvanceMediaPlayer {
    @Override
    public void play(String songName) {
        System.out.println("Play song on VLC");
    }

}
