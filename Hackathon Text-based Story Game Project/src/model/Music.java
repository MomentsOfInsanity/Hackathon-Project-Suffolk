package model;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.JOptionPane;

import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;

public class Music {
	private String filePath;
	private static long pauseTime;
	private Clip clip;
	
	public Music(String filePath) {
		this.filePath = filePath;
		this.pauseTime = 0;
	}

	public void play() {
		try {
			File musicPath = new File(filePath);
			if (musicPath.exists()) {
				AudioInputStream audio = AudioSystem.getAudioInputStream(musicPath);
				clip = AudioSystem.getClip();
				clip.open(audio);
				clip.setMicrosecondPosition(pauseTime);
				clip.start();
//				clip.loop(clip.LOOP_CONTINUOUSLY);
			} else {
				System.out.println("Can't find File");
			}
		} catch (UnsupportedAudioFileException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (LineUnavailableException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void stop() {
		clip.getMicrosecondPosition();
		clip.stop();		
	}
	
	public String getFilePath() {
		return filePath;
	}

	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}

	public static long getPauseTime() {
		return pauseTime;
	}

	public static void setPauseTime(long pauseTime) {
		Music.pauseTime = pauseTime;
	}

	public Clip getClip() {
		return clip;
	}

	public void setClip(Clip clip) {
		this.clip = clip;
	}

	

	
}
