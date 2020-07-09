package rpg;

import javax.microedition.lcdui.Graphics;
import main.GameMIDlet;

// $FF: renamed from: bl
public final class class_bl extends class_cb {
   // $FF: renamed from: a char[]
   private char[] field_array_char_a;
   // $FF: renamed from: a short[]
   private short[] field_array_short_a;

   public class_bl(class_cb var1, boolean var2) {
      super(var1, (byte)1);
      GameMIDlet var3 = GameMIDlet.field_class_rpg_GameMIDlet_a;
      String var4 = class_bh.func_class_java_lang_String_a(3927);
      String var5 = class_bh.func_class_java_lang_String_a(3928);
      String var6 = var3.getAppProperty("MIDlet-Name").toUpperCase();
      String var7 = class_bh.func_class_java_lang_String_a(class_bh.field_array_char_r);
      String var8 = var3.getAppProperty("MIDlet-Vendor");
      String var9 = class_bh.func_class_java_lang_String_a(class_bh.field_array_char_b);
      String var10 = class_bh.func_class_java_lang_String_a(3905);
      String var11 = var6 + "\n\n" + var10 + "\n\n" + var4 + '\n' + var8 + '\n' + var9 + "\n\n" + var5 + "\nv." + var7;
      this.field_array_char_a = var11.toCharArray();
      short[] var12 = new short[20];
      int var13 = 0;

      int var14;
      for(var14 = 0; var13 < this.field_array_char_a.length; var13 += class_bh.func_int_a((char[])this.field_array_char_a, var13, 130, 11)) {
         var12[var14++] = (short)var13;
      }

      this.field_array_short_a = new short[var14];
      System.arraycopy(var12, 0, this.field_array_short_a, 0, this.field_array_short_a.length);
      super.field_byte_a = (byte)this.field_array_short_a.length;
      class_bh.field_class_b_a.field_boolean_b = false;
      class_bh.field_class_b_b.field_boolean_b = false;
      class_bh.field_class_b_c.field_boolean_b = false;
   }

   // $FF: renamed from: a (int, int) boolean
   public final boolean func_boolean_a(int var1, int var2) {
      if (this.func_boolean_b(var1, var2)) {
         return true;
      } else if (this.func_boolean_c(var1, var2)) {
         return true;
      } else if (var2 == -8) {
         super.field_class_cb_a.func_void_a();
         class_bh.field_class_b_a.field_boolean_b = true;
         class_bh.field_class_b_b.field_boolean_b = true;
         class_bh.field_class_b_c.field_boolean_b = true;
         return true;
      } else {
         return true;
      }
   }

   // $FF: renamed from: a (javax.microedition.lcdui.Graphics, int, int) void
   public final void func_void_a(Graphics var1, int var2, int var3) {
      boolean var4 = false;
      boolean var5 = false;
      var1.setColor(4136767);
      var1.fillRect(0, 0, class_r.field_int_g, class_r.field_int_h);
      class_bf.func_void_c(var1, var2, var3);
      class_bh.func_void_a(var1, 9, var2 + 155 >> 1, var3 + 5);
      class_bf.func_void_b(var1, var2, var3 + 24, 3);
      var2 += 12;
      var3 += 42;
      if (super.field_byte_a > 1) {
         if (super.field_byte_b > 0) {
            var1.drawImage(class_ce.field_class_javax_microedition_lcdui_Image_k, var2 + 62, var3 - 6, 20);
         }

         if (super.field_byte_b < super.field_byte_a - 1) {
            var1.drawImage(class_ce.field_class_javax_microedition_lcdui_Image_n, var2 + 62, var3 + 114, 20);
         }
      }

      class_r.func_void_d(var1, var2 + 155 - 25, var3 - 8, super.field_byte_b + 1, super.field_byte_a);
      short var6 = this.field_array_short_a[super.field_byte_b];
      short var7 = super.field_byte_b == super.field_byte_a - 1 ? (short)this.field_array_char_a.length : this.field_array_short_a[super.field_byte_b + 1];
      if (this.field_array_char_a[0] == '!' && var6 == 0) {
         var6 = 1;
      }

      var1.setColor(0);
      class_bh.func_void_b(var1, var2 + 155 >> 1, var3 + 3, 130, 1, this.field_array_char_a, var6, 0, var7 - var6);
      class_bh.func_void_a(var1, (char[])null, class_bh.field_array_char_e);
   }
}
