package rpg;

import java.io.InputStream;
import javax.microedition.media.Manager;
import javax.microedition.media.MediaException;
import javax.microedition.media.Player;
import javax.microedition.media.PlayerListener;
import javax.microedition.media.control.VolumeControl;

// $FF: renamed from: ci
public final class SoundPlayer implements PlayerListener {
   private Player player;

   public SoundPlayer(String sourcePath) {
      this.createPlayer(sourcePath);
   }

   public final void setLoopCount(int loopCount) {
      if (this.player != null) {
         this.player.setLoopCount(loopCount);
      }
   }

   public final void play() {
      if (class_bs.field_class_bs_a.soundVolumeLevel > 0) {
         this.start();
      }

   }

   public final void stop() {
      try {
         if (this.player != null) {
            this.player.stop();
         }

      } catch (MediaException ex) {
         ex.printStackTrace();
      }
   }

   public final void close() {
      if (this.player != null) {
         this.player.close();
         this.player = null;
      }

   }

   public final boolean isStarted() {
      return this.player != null && this.player.getState() == Player.STARTED;
   }

   private static String getSoundType(String sourcePath) throws Exception {
      String var1;
      if (sourcePath.endsWith("wav")) {
         var1 = "audio/x-wav";
      } else if (sourcePath.endsWith("jts")) {
         var1 = "audio/x-tone-seq";
      } else {
         if (!sourcePath.endsWith("mid")) {
            throw new Exception("Cannot guess content type from URL: " + sourcePath);
         }

         var1 = "audio/midi";
      }

      return var1;
   }

   private void createPlayer(String sourcePath) {
      if (this.player == null) {
         try {
            if (sourcePath.startsWith("http:")) {
               this.player = Manager.createPlayer(sourcePath);
            } else if (sourcePath.startsWith("resource")) {
               int pos = sourcePath.indexOf(':');
               String soundPath = sourcePath.substring(pos + 1);
               
               InputStream soundData = this.getClass().getResourceAsStream(soundPath);
               String mimeType = getSoundType(sourcePath);
               this.player = Manager.createPlayer(soundData, mimeType);
               this.player.realize();
            }

            this.player.addPlayerListener(this);
            return;
         } catch (Exception ex) {
            if (this.player != null) {
               this.player.close();
               this.player = null;
            }
         }
      }

   }

   public final void setVolumeLevel(int level) {
      VolumeControl volumeControl;
      if (this.player != null && (volumeControl = (VolumeControl)this.player.getControl("VolumeControl")) != null) {
         volumeControl.setLevel(level);
      }

   }

   public final void start() {
      if (this.player != null) {
         try {
            this.player.realize();
            this.player.prefetch();
            this.player.start();
         } catch (MediaException var2) {
            var2.printStackTrace();
         }
      }
   }

   public final void playerUpdate(Player var1, String var2, Object var3) {
   }
}
