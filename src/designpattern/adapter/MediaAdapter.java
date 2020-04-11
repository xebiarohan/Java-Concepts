package designpattern.adapter;

public class MediaAdapter implements MediaPlayer {

    private AdvanceMediaPlayer adapter;

    public MediaAdapter(String type) {
        if (type == "vlc") {
            adapter = new VlcPlayer();
        } else {
            adapter = new MxPlayer();
        }
    }


    @Override
    public void play(String type, String song) {
        adapter.play(song);
    }
}
