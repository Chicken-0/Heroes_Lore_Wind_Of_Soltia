package rpg;

import javax.microedition.lcdui.Graphics;

// $FF: renamed from: bt
public final class class_bt extends class_cb {
   // $FF: renamed from: c boolean
   private boolean field_boolean_c;
   // $FF: renamed from: a char[][]
   private char[][] field_array_array_char_a;

   public class_bt(class_cb var1, boolean var2) {
      super(var1, (byte)4);
      if (MIDletConfig.func_boolean_a() || MIDletConfig.func_boolean_b()) {
         ++super.field_byte_a;
      }

      this.field_boolean_c = var2;
      UIGeneral.fontSmallBlack.activeControlChar = false;
      UIGeneral.fontSmallWhite.activeControlChar = false;
      UIGeneral.fontSmallOrange.activeControlChar = false;
      this.field_array_array_char_a = new char[super.field_byte_a][];

      for(byte var3 = 0; var3 < super.field_byte_a; ++var3) {
         if (var3 == 4) {
            this.field_array_array_char_a[var3] = MIDletConfig.func_class_java_lang_String_a().toCharArray();
         } else {
            this.field_array_array_char_a[var3] = class_ce.field_class_z_e.loadByIndex(var3);
         }
      }

   }

   // $FF: renamed from: a (int, int) boolean
   public final boolean func_boolean_a(int var1, int var2) {
      if (this.func_boolean_b(var1, var2)) {
         return true;
      } else if (this.func_boolean_c(var1, var2)) {
         return true;
      } else if (var2 != 53 && var1 != 8) {
         if (var2 == -8) {
            super.field_class_cb_a.func_void_a((byte)-1, (byte)-1);
            UIGeneral.fontSmallBlack.activeControlChar = true;
            UIGeneral.fontSmallWhite.activeControlChar = true;
            UIGeneral.fontSmallOrange.activeControlChar = true;
            return true;
         } else {
            return true;
         }
      } else {
         byte var3 = (byte)(super.field_byte_b + 6);
         if (class_x.activeDemoVersion && super.field_byte_b == 5) {
            ++var3;
         }

         char[] var4 = class_ce.field_class_z_e.loadByIndex(var3);
         if (super.field_byte_b == super.field_byte_a - 1) {
            if (MIDletConfig.func_boolean_a()) {
               var4 = BabbleText.instance.getTextById(3930).toCharArray();
            } else if (MIDletConfig.func_boolean_b()) {
               var4 = UIGeneral.func_class_java_lang_String_a(BabbleText.instance.getTextById(3934), "XXX", new String(MIDletConfig.func_class_java_lang_String_a())).toCharArray();
            }
         }

         super.field_class_cb_b = new class_bx(this, var4, this.field_boolean_c, this.field_array_array_char_a[super.field_byte_b]);
         return true;
      }
   }

   // $FF: renamed from: a (javax.microedition.lcdui.Graphics, int, int) void
   public final void func_void_a(Graphics var1, int var2, int var3) {
      int var4 = 16777215;
      int var5 = 0;
      if (this.field_boolean_c) {
         var2 += 6;
         var3 += 25;
         class_cb.func_void_a(var1, var2, var3, 143, 139);
         class_cb.func_void_b(var1, var2, var3, 143, 139);
         var5 = 10452799;
         var3 += 8;
      } else {
         var1.setColor(4136767);
         var1.fillRect(0, 0, MyGameCanvas.canvasWidth, MyGameCanvas.field_int_h);
         class_bf.func_void_c(var1, var2, var3);
         class_bf.func_void_b(var1, var2, var3 + 24, 3);
         UIGeneral.func_void_a(var1, 7, MyGameCanvas.canvasWidth >> 1, var3 + 5);
         var3 += 41;
      }

      var3 += 10;
      UIGeneral.setFontDefault(true);

      for(byte var6 = 0; var6 < super.field_byte_a; ++var6) {
         if (super.field_byte_b == var6) {
            var1.setColor(var4);
         } else {
            var1.setColor(var5);
         }

         UIGeneral.func_void_a(var1, MyGameCanvas.canvasWidth >> 1, var3 + var6 * 15, this.field_array_array_char_a[var6], 1);
      }

      UIGeneral.setFontDefault(false);
      if (!this.field_boolean_c) {
         UIGeneral.func_void_a(var1, UIGeneral.labelTextOk, UIGeneral.labelTextBack);
      }

   }
}
