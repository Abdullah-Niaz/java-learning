package oop.Principles.Compsition;

class MediaPlayer {
    void play(String song) {
        System.out.println("Playing: " + song);
    }
}

class Speakers {
    void playSound() {
        System.out.println("Sound is playing");
    }
}

class Display {
    void showSongInfo(String song) {
        System.out.println("Now playing: " + song);
    }
}

class MusicPlayer {
    private MediaPlayer mediaPlayer;
    private Speakers speakers;
    private Display display;

    MusicPlayer() {
        mediaPlayer = new MediaPlayer();
        speakers = new Speakers();
        display = new Display();
    }

    void playMusic(String song) {
        mediaPlayer.play(song);
        speakers.playSound();
        display.showSongInfo(song);
    }
}

public class music_player_ex{
    public static void main(String[] args) {
        MusicPlayer myMusicPlayer = new MusicPlayer();
        myMusicPlayer.playMusic("Nasheed");
    }
}

