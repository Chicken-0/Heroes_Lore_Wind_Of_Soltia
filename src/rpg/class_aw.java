package rpg;

import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

// $FF: renamed from: aw
public final class class_aw extends class_f {
   // $FF: renamed from: h byte[]
   public static final byte[] field_array_byte_h = new byte[]{-1, 3, 4, 11, 9, 3, 3, -1, 8, -1, -1};
   // $FF: renamed from: a javax.microedition.lcdui.Image[]
   private Image[] field_array_class_javax_microedition_lcdui_Image_a;
   // $FF: renamed from: i byte[]
   private byte[] field_array_byte_i;
   // $FF: renamed from: a byte
   private byte field_byte_a;
   // $FF: renamed from: c short
   private short field_short_c;

   public class_aw(byte var1) {
      this(var1, (short)field_array_byte_h[var1], (short)0);
   }

   public class_aw(byte var1, short var2, short var3) {
      super(var2);
      this.field_byte_a = var1;
      this.field_short_c = var3;
      this.func_void_a();
   }

   // $FF: renamed from: a () void
   private final void func_void_a() {
      switch(this.field_byte_a) {
      case 1:
         this.field_array_class_javax_microedition_lcdui_Image_a = class_ce.field_array_class_javax_microedition_lcdui_Image_s;
         return;
      case 4:
         this.field_array_byte_i = class_ce.field_array_byte_h;
         return;
      case 5:
         this.field_array_class_javax_microedition_lcdui_Image_a = class_ce.field_array_class_javax_microedition_lcdui_Image_t;
         return;
      case 6:
         this.field_array_class_javax_microedition_lcdui_Image_a = class_ce.field_array_class_javax_microedition_lcdui_Image_u;
         return;
      case 9:
         this.field_array_byte_i = (byte[])((byte[])class_ce.field_array_class_java_lang_Object_f[this.field_short_c]);
         super.field_short_a = (short)this.field_array_byte_i[0];
         return;
      case 10:
         this.field_array_class_javax_microedition_lcdui_Image_a = class_ce.field_array_class_javax_microedition_lcdui_Image_w;
      case 2:
      case 3:
      case 7:
      case 8:
      default:
      }
   }

   // $FF: renamed from: a (javax.microedition.lcdui.Graphics, int, int) void
   public final void func_void_a(Graphics var1, int var2, int var3) {
      switch(this.field_byte_a) {
      case 1:
         if (super.field_short_b == 0) {
            var3 -= 10;
            var2 -= 3;
         } else if (super.field_short_b == 1) {
            var3 -= 8;
         }

         var1.drawImage(this.field_array_class_javax_microedition_lcdui_Image_a[super.field_short_b], var2, var3 + 3, 33);
         break;
      case 2:
         var1.drawImage(class_ce.field_class_javax_microedition_lcdui_Image_t, var2, var3 - 30 - super.field_short_b * 4, 17);
         break;
      case 3:
         if (super.field_short_b % 4 < 3) {
            var1.drawImage(class_ce.field_class_javax_microedition_lcdui_Image_s, var2, var3 + 5, 33);
         }
         break;
      case 4:
      case 9:
         class_as.func_void_b(var1, this.field_array_byte_i, (byte)super.field_short_b, var2, var3);
         break;
      case 5:
         if (super.field_short_b == 2) {
            var3 -= 5;
         }

         var1.drawImage(this.field_array_class_javax_microedition_lcdui_Image_a[super.field_short_b], var2, var3 + 3, 33);
         break;
      case 6:
         if (super.field_short_b == 1) {
            var3 -= 2;
         } else if (super.field_short_b == 2) {
            var3 -= 6;
         }

         var1.drawImage(this.field_array_class_javax_microedition_lcdui_Image_a[super.field_short_b], var2, var3 + 3, 33);
         break;
      case 7:
         int var4;
         if (super.field_short_b < 2) {
            var4 = this.field_short_c < 0 ? 4 : 3;
         } else {
            var4 = this.field_short_c < 0 ? 2 : 1;
         }

         MyGameCanvas.func_void_a(var1, this.field_short_c < 0 ? -this.field_short_c : this.field_short_c, var2 + 1, var3 - 30 - super.field_short_b * 4, 1, var4);
         break;
      case 8:
      default:
         var1.drawImage(this.field_array_class_javax_microedition_lcdui_Image_a[super.field_short_b], var2, var3 + 3, 33);
         break;
      case 10:
         if (this.field_short_c != 8 && this.field_short_c != 9) {
            var1.drawImage(class_ce.field_class_javax_microedition_lcdui_Image_D, var2, var3 - 40, 17);
         }

         var1.drawImage(this.field_array_class_javax_microedition_lcdui_Image_a[this.field_short_c], var2, var3 - 39 + super.field_short_b % 2, 17);
      }

      ++super.field_short_b;
      if (super.field_short_b >= super.field_short_a && super.field_short_a != -1) {
         super.field_boolean_a = true;
      }

   }
}
