package rpg;

// $FF: renamed from: bw
public final class SoundPlayerManager {
   public static int maxVolumeLevel = 10;
   private static int currentVolumeLevel = 0;
   
   private static SoundPlayer soundPlayer1;
   private static SoundPlayer soundPlayer2;
   private static SoundPlayer soundPlayer3;
   
   private static SoundPlayer[] arraySoundPlayer = new SoundPlayer[32];
   private static final String[] arrayTrackName = new String[]{"00.mid", "01.mid", "02.mid", "03.mid", "04.mid", "05.mid", "06.mid", "07.mid", "08.wav", "def.mid", "def.mid", "def.mid", "12.mid", "13.wav", "14.wav", "15.wav", "16.wav", "17.wav", "18.wav", "def.mid", "20.wav", "21.wav", "22.mid", "23.mid", "24.mid", "25.mid", "26.mid", "27.mid", "28.mid", "29.mid", "30.mid", "31.mid"};

   public static final void stop() {
      if (soundPlayer1 != null) {
         soundPlayer1.stop();
      } else {
         if (soundPlayer2 != null) {
            soundPlayer2.stop();
         }

      }
   }

   public static final void play() {
      if (soundPlayer1 != null) {
         soundPlayer1.play();
      } else {
         if (soundPlayer2 != null) {
            soundPlayer2.play();
         }

      }
   }

   public static final void stopPlayer2() {
      if (soundPlayer2 != null) {
         soundPlayer2.stop();
      }

   }

   public static final void stopPlayer3() {
      if (soundPlayer3 != null) {
         soundPlayer3.stop();
      }

   }

   public static final void stopPlayer1() {
      if (soundPlayer1 != null) {
         soundPlayer1.stop();
      }

   }

   public static final void close() {
      if (soundPlayer1 != null) {
         soundPlayer1.close();
         soundPlayer1 = null;
      }

      if (soundPlayer2 != null) {
         soundPlayer2.close();
         soundPlayer2 = null;
      }

   }

   public static final void startPlayer3(byte trackId, boolean var1) {
      if (arraySoundPlayer[trackId] != null) {
         soundPlayer3 = arraySoundPlayer[trackId];
         soundPlayer3.setVolumeLevel(currentVolumeLevel);
         soundPlayer3.play();
      }

   }

   public static final void startSound(int volume) {
      if (volume <= 0) {
         volume = 0;
      } else if (volume > maxVolumeLevel) {
         volume = maxVolumeLevel;
      }

      if (currentVolumeLevel == 0 && volume != 0) {
         play();
      }

      currentVolumeLevel = volume * 10;
      if (currentVolumeLevel == 0) {
         stop();
      }

      for(int trackId = 0; trackId < arraySoundPlayer.length; ++trackId) {
         if (arraySoundPlayer[trackId] != null) {
            arraySoundPlayer[trackId].setVolumeLevel(currentVolumeLevel);
         }
      }

   }

   public static final void readySound() {
      System.out.println("readySound");

      try {
         class_bs.field_class_bs_a.func_void_j();
      } catch (Exception var1) {
         var1.printStackTrace();
      }

      startSound(class_bs.field_class_bs_a.soundVolumeLevel);
   }

   public static final void setupSoundPlayer(byte trackId) {
      if (arraySoundPlayer[trackId] == null) {
         String path = "resource:/snd/" + arrayTrackName[trackId];
         arraySoundPlayer[trackId] = new SoundPlayer(path);
         arraySoundPlayer[trackId].setVolumeLevel(currentVolumeLevel);
      }

   }

   public static final void stopTrack(byte trackId) {
      if (arraySoundPlayer[trackId] != null) {
         arraySoundPlayer[trackId].close();
         arraySoundPlayer[trackId] = null;
      }

   }

   public static final void startPlayer1(int trackId) {
      soundPlayer1 = arraySoundPlayer[trackId];
      if (soundPlayer1 != null && !soundPlayer1.isStarted()) {
         soundPlayer1.setVolumeLevel(currentVolumeLevel);
         soundPlayer1.setLoopCount(-1);
         soundPlayer1.play();
      }

   }

   public static final void startPlayer2(int trackId) {
      soundPlayer2 = arraySoundPlayer[trackId];
      if (soundPlayer2 != null && !soundPlayer2.isStarted()) {
         soundPlayer2.setVolumeLevel(currentVolumeLevel);
         soundPlayer2.setLoopCount(-1);
         soundPlayer2.play();
      }

   }
}
