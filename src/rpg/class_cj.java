package rpg;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;

// $FF: renamed from: cj
public final class class_cj {
   // $FF: renamed from: a cj
   public static class_cj field_class_cj_a = new class_cj();
   // $FF: renamed from: a byte[]
   public byte[] field_array_byte_a;
   // $FF: renamed from: a byte
   public byte field_byte_a = 0;
   // $FF: renamed from: a java.io.DataInputStream
   public DataInputStream field_class_java_io_DataInputStream_a;
   // $FF: renamed from: a java.lang.String[]
   public final String[] field_array_class_java_lang_String_a = new String[]{"en-GB", "fr-FR", "de-DE", "it-IT", "es-ES"};

   public class_cj() {
      String[] var10000 = new String[]{"Select", "Sélection.", "Wählen", "Selez.", "Elegir"};
      var10000 = new String[]{"Exit", "Quitter", "Beenden", "Esci", "Salir"};
   }

   // $FF: renamed from: a (java.lang.String) int
   private int func_int_a(String var1) {
      int var2 = -1;

      try {
         if (var1 == null) {
            var1 = System.getProperty("microedition.locale");
         }
      } catch (Exception var4) {
         var1 = null;
      }

      if (var1 != null) {
         int var3;
         for(var3 = 0; var3 < this.field_array_class_java_lang_String_a.length; ++var3) {
            if (this.field_array_class_java_lang_String_a[var3].toLowerCase().compareTo(var1.toLowerCase()) == 0) {
               var2 = var3;
               break;
            }
         }

         if (var2 == -1) {
            for(var3 = 0; var3 < this.field_array_class_java_lang_String_a.length; ++var3) {
               if (this.field_array_class_java_lang_String_a[var3].toLowerCase().substring(0, 2).compareTo(var1.toLowerCase().substring(0, 2)) == 0) {
                  var2 = var3 | '耀';
                  break;
               }
            }
         }
      }

      return var2;
   }

   // $FF: renamed from: a (java.lang.String, java.lang.String, int) void
   public final void func_void_a(String var1, String var2, int var3) {
      try {
         if (var3 < 0 && (var3 = this.func_int_a(var2)) == -1) {
            var3 = 0;
         }

         this.field_byte_a = (byte)(var3 & 32767);
         InputStream var4 = Runtime.getRuntime().getClass().getResourceAsStream(var1 + "." + this.field_array_class_java_lang_String_a[this.field_byte_a]);
         DataInputStream var5;
         int var6 = (var5 = new DataInputStream(var4)).readInt();
         this.field_array_byte_a = new byte[var6];
         int var7 = 0;

         int var8;
         do {
            var8 = var5.read(this.field_array_byte_a, var7, var6 - var7);
         } while((var7 += var8) < var6);
      } catch (IOException var9) {
         System.out.println("ERROR: Couldn't load babble file." + var9);
      }

      this.field_class_java_io_DataInputStream_a = new DataInputStream(new ByteArrayInputStream(this.field_array_byte_a));
   }

   // $FF: renamed from: a (int) java.lang.String
   public final String func_class_java_lang_String_a(int var1) {
      try {
         boolean var2 = false;
         var1 -= 0;
         this.field_class_java_io_DataInputStream_a.reset();
         this.field_class_java_io_DataInputStream_a.skip((long)(var1 << 2));
         this.field_class_java_io_DataInputStream_a.skip((long)this.field_class_java_io_DataInputStream_a.readInt());
         this.field_class_java_io_DataInputStream_a.skip(2L);
         return this.field_class_java_io_DataInputStream_a.readUTF();
      } catch (Exception var4) {
         return var1 + "." + var4.toString();
      }
   }

   static {
      String[] var10000 = new String[]{"English", "FranÇais", "Deutsch", "Italiano", "EspaÑol"};
   }
}
