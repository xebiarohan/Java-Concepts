package designpattern.adapter;

public class AudioPlayer implements MediaPlayer
{
    @Override
    public void play(String type, String song) {
        if(type=="audio") {
            System.out.println("Play audio song");
        } else {
            MediaAdapter adapter = new MediaAdapter(type);
            adapter.play(type,song);
        }
    }
}
