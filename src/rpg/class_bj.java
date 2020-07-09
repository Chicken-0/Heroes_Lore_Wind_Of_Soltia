package rpg;

import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

// $FF: renamed from: bj
public final class class_bj extends class_f {
   // $FF: renamed from: a byte
   private byte field_byte_a;
   // $FF: renamed from: b byte
   private byte field_byte_b;
   // $FF: renamed from: c short
   private short field_short_c;
   // $FF: renamed from: a javax.microedition.lcdui.Image[]
   private Image[] field_array_class_javax_microedition_lcdui_Image_a;
   // $FF: renamed from: b javax.microedition.lcdui.Image[]
   private Image[] field_array_class_javax_microedition_lcdui_Image_b;
   // $FF: renamed from: a java.lang.Object[]
   private Object[] field_array_class_java_lang_Object_a;

   public class_bj(short var1, short var2, byte var3, byte var4) {
      super(var2);
      this.field_short_c = var1;
      this.field_byte_b = var3;
      this.field_byte_a = var4;
      this.field_array_class_javax_microedition_lcdui_Image_a = new Image[2];
      Image[] var5 = (Image[])class_ce.field_array_array_class_javax_microedition_lcdui_Image_a[12];
      this.field_array_class_javax_microedition_lcdui_Image_a[0] = var5[0];
      this.field_array_class_javax_microedition_lcdui_Image_a[1] = var5[1];
      this.field_array_class_javax_microedition_lcdui_Image_b = (Image[])class_ce.field_array_array_class_javax_microedition_lcdui_Image_a[12];
      this.field_array_class_java_lang_Object_a = class_ce.field_array_class_java_lang_Object_d;
   }

   // $FF: renamed from: a (javax.microedition.lcdui.Graphics, int, int) void
   public final void func_void_a(Graphics var1, int var2, int var3) {
      if (this.field_short_c > 0) {
         --this.field_short_c;
      } else {
         if (this.field_byte_b == 0 && this.field_byte_a == 0) {
            switch(super.field_short_b) {
            case 0:
               var1.drawImage(this.field_array_class_javax_microedition_lcdui_Image_b[7], var2, var3, 33);
               break;
            case 1:
               var1.drawImage(this.field_array_class_javax_microedition_lcdui_Image_b[8], var2, var3 - 1, 33);
               break;
            case 2:
               var1.drawImage(this.field_array_class_javax_microedition_lcdui_Image_b[7], var2, var3 - 2, 33);
               break;
            case 3:
               var1.drawImage(this.field_array_class_javax_microedition_lcdui_Image_b[8], var2, var3 - 3, 33);
               break;
            case 4:
            case 5:
               var1.drawImage(this.field_array_class_javax_microedition_lcdui_Image_b[9], var2, var3 - 4, 33);
            }
         } else if (this.field_byte_b == 0 && this.field_byte_a == 2 || this.field_byte_b == 1 && this.field_byte_a == 2) {
            switch(super.field_short_b % 4) {
            case 1:
               var1.drawImage(this.field_array_class_javax_microedition_lcdui_Image_a[0], var2, var3 + 9, 33);
               break;
            case 2:
               var1.drawImage(this.field_array_class_javax_microedition_lcdui_Image_a[0], var2, var3 + 9, 33);
               var1.drawImage(this.field_array_class_javax_microedition_lcdui_Image_a[1], var2, var3 + 12, 33);
               break;
            case 3:
               var1.drawImage(this.field_array_class_javax_microedition_lcdui_Image_a[1], var2, var3 + 12, 33);
            }
         } else {
            class_as.func_void_b(var1, (byte[])((byte[])this.field_array_class_java_lang_Object_a[this.field_byte_a]), (byte)super.field_short_b, var2, var3);
         }

         ++super.field_short_b;
         if (super.field_short_b >= super.field_short_a) {
            super.field_boolean_a = true;
         }

      }
   }
}
