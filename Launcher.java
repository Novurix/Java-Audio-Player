public class Launcher {

    AudioPlayer audioPlayer;
    File audioFile;

    public static void main(String[] args) {

        audioFile = new File("AUDIO/ YOUR .WAV FILE")

        audioPlayer = new AudioPlayer();
        if (audioFile.exists()) audioPlayer.play(audioFile,true);
    }
}