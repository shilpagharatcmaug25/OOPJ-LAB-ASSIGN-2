interface AudioPlayer{
void playAudio(String song);
}


interface VideoPlayer {
    void playVideo(String movie);
}


class MediaPlayer implements AudioPlayer, VideoPlayer {

    // Implement playAudio from AudioPlayer
    public void playAudio(String song) {
        System.out.println("Playing Audio: " + song);
    }

    // Implement playVideo from VideoPlayer
    public void playVideo(String movie) {
        System.out.println("Playing Video: " + movie);
    }
}

// Main class to test the functionality
public class Music {
    public static void main(String[] args) {
        MediaPlayer mediaPlayer = new MediaPlayer();

        // Sample input
        mediaPlayer.playAudio("Shape of You");
        mediaPlayer.playVideo("Inception");
    }
}