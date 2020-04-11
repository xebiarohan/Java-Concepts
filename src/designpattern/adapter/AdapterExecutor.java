package designpattern.adapter;

public class AdapterExecutor {
    public static void main(String[] args) {
        AudioPlayer player = new AudioPlayer();
        player.play("vlc","any song");
    }
}
