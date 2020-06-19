import java.io.File;
import javax.sound.sampled.*;

public class AudioPlayer {

    public void play(File path, boolean isLooped) {
        
        try {
            Clip clip = AudioSystem.getClip();
            clip.open(AudioSystem.getAudioInputStream(path));
            FloatControl volume = (FloatControl) clip.getControl(FloatControl.Type.MASTER_GAIN);
            volume.setValue(-20);
            clip.start();

            if (isLooped) clip.loop(10000);

            Thread.sleep(clip.getMicrosecondLength()/1000);
        }
        catch(Exception e) {e.getCause();}
    }
}