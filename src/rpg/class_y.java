package rpg;

import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

// $FF: renamed from: y
public class class_y extends class_ck {
   // $FF: renamed from: a short[]
   private static final short[] field_array_short_a = new short[]{-1, 4, 8, 6, 10, 11, 7, 9, 6, 4, 3};
   // $FF: renamed from: i byte[]
   private static final byte[] field_array_byte_i = new byte[]{-1, 0, -1, -1, 0, 0, 1, 0, 1, 1, -1};
   // $FF: renamed from: a short
   public short field_short_a;
   // $FF: renamed from: b short
   public short field_short_b;
   // $FF: renamed from: f byte
   private byte field_byte_f;
   // $FF: renamed from: a javax.microedition.lcdui.Image[]
   private Image[] field_array_class_javax_microedition_lcdui_Image_a;
   // $FF: renamed from: h byte[]
   public byte[] field_array_byte_h;

   public class_y(short var1, short var2, byte var3) {
      super(var1, var2, (byte)8, (byte)9);
      this.field_short_a = field_array_short_a[var3];
      this.field_short_b = 0;
      this.field_byte_f = var3;
      this.field_array_class_javax_microedition_lcdui_Image_a = (Image[])class_ce.field_array_array_class_javax_microedition_lcdui_Image_a[12];
      if (field_array_byte_i[var3] != -1) {
         this.field_array_byte_h = (byte[])((byte[])class_ce.field_array_class_java_lang_Object_d[field_array_byte_i[var3]]);
      }

   }

   public class_y(byte var1, byte var2, byte[] var3) {
      super((short)(var1 << 4), (short)(var2 << 4), (byte)8, (byte)9);
      this.field_short_a = (short)var3[0];
      this.field_short_b = 0;
      this.field_byte_f = 100;
      this.field_array_byte_h = var3;
   }

   // $FF: renamed from: a () void
   public void func_void_a() {
   }

   // $FF: renamed from: a () boolean
   public boolean func_boolean_a() {
      return this.field_short_b >= this.field_short_a;
   }

   // $FF: renamed from: a (javax.microedition.lcdui.Graphics, int, int) void
   public void func_void_a(Graphics var1, int var2, int var3) {
      class_n.field_class_ae_a.func_void_c(this);
      int var4 = var2 + super.field_short_c + super.field_byte_c;
      int var5 = var3 + super.field_short_d + super.field_byte_d;
      switch(this.field_byte_f) {
      case 1:
      case 6:
      case 8:
      case 9:
      case 100:
         this.func_void_b(var1, var4, var5);
         break;
      case 2:
         this.func_void_c(var1, var4, var5);
         break;
      case 4:
         this.func_void_a(var1, var4, var5, field_array_short_a[4], this.field_array_class_javax_microedition_lcdui_Image_a[8]);
         break;
      case 5:
         this.func_void_a(var1, var4, var5, field_array_short_a[5], this.field_array_class_javax_microedition_lcdui_Image_a[11]);
         break;
      case 7:
         this.func_void_a(var1, var4, var5, field_array_short_a[7], this.field_array_class_javax_microedition_lcdui_Image_a[11]);
         break;
      case 10:
         this.func_void_d(var1, var4, var5);
      }

      ++this.field_short_b;
      if (this.func_boolean_a()) {
         class_n.field_class_ae_a.func_void_a((class_ck)this);
      }

   }

   // $FF: renamed from: c (javax.microedition.lcdui.Graphics, int, int) void
   private void func_void_c(Graphics var1, int var2, int var3) {
      if (this.field_short_b >= 0 && this.field_short_b < this.field_short_a) {
         class_as.func_void_b(var1, class_ce.field_array_byte_m, (byte)this.field_short_b, var2, var3);
      }

   }

   // $FF: renamed from: a (javax.microedition.lcdui.Graphics, int, int, int, javax.microedition.lcdui.Image) void
   private void func_void_a(Graphics var1, int var2, int var3, int var4, Image var5) {
      if (this.field_short_b < var4) {
         int var6 = var5.getHeight();
         switch(this.field_short_b) {
         case 0:
            var6 = var6 * 7 / 10;
            class_as.func_void_a(var1, var2 - 20, var3 - 50, 40, 50);
            var1.drawImage(var5, var2, var3 + var6, 33);
            var1.setClip(0, 0, class_as.field_int_a, class_as.field_int_b);
            return;
         case 1:
            var6 = var6 * 5 / 10;
            class_as.func_void_a(var1, var2 - 20, var3 - 50, 40, 50);
            var1.drawImage(var5, var2, var3 + var6, 33);
            var1.setClip(0, 0, class_as.field_int_a, class_as.field_int_b);
            return;
         case 2:
            var6 = var6 * 3 / 10;
            class_as.func_void_a(var1, var2 - 20, var3 - 50, 40, 50);
            var1.drawImage(var5, var2, var3 + var6, 33);
            var1.setClip(0, 0, class_as.field_int_a, class_as.field_int_b);
            return;
         default:
            class_as.func_void_b(var1, this.field_array_byte_h, (byte)(this.field_short_b - 3), var2, var3);
         }
      }
   }

   // $FF: renamed from: b (javax.microedition.lcdui.Graphics, int, int) void
   public final void func_void_b(Graphics var1, int var2, int var3) {
      if (this.field_short_b >= 0 && this.field_short_b < this.field_short_a) {
         class_as.func_void_b(var1, this.field_array_byte_h, (byte)this.field_short_b, var2, var3);
      }

   }

   // $FF: renamed from: d (javax.microedition.lcdui.Graphics, int, int) void
   private void func_void_d(Graphics var1, int var2, int var3) {
      switch(this.field_short_b) {
      case 0:
         var1.drawImage(this.field_array_class_javax_microedition_lcdui_Image_a[0], var2, var3, 33);
         return;
      case 1:
         var1.drawImage(this.field_array_class_javax_microedition_lcdui_Image_a[0], var2, var3, 33);
         var1.drawImage(this.field_array_class_javax_microedition_lcdui_Image_a[1], var2, var3 + 3, 33);
         return;
      case 2:
         var1.drawImage(this.field_array_class_javax_microedition_lcdui_Image_a[1], var2, var3 + 3, 33);
      default:
      }
   }
}
