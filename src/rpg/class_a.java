package rpg;

import javax.microedition.lcdui.Graphics;

// $FF: renamed from: a
public final class class_a extends class_cb {
   // $FF: renamed from: h byte[]
   private byte[] field_array_byte_h;
   // $FF: renamed from: c byte
   private byte field_byte_c;

   public class_a(class_bf var1, byte[] var2) {
      super(var1, (byte)(var2.length / 4));
      this.field_array_byte_h = var2;
      this.field_byte_c = 0;
   }

   // $FF: renamed from: a (int, int) boolean
   public final boolean func_boolean_a(int var1, int var2) {
      if (this.func_boolean_b(var1, var2)) {
         return true;
      } else if (super.field_byte_a > 1 && this.func_boolean_c(var1, var2)) {
         this.field_byte_c = 0;
         return true;
      } else if (var2 != 53 && var1 != 8) {
         if (var2 == -8) {
            super.field_class_cb_a.func_void_a((byte)-1, (byte)-1);
            return true;
         } else {
            return true;
         }
      } else {
         System.out.println("continue game with " + this.field_array_byte_h[super.field_byte_b * 4]);
         class_n.func_void_a(true, this.field_array_byte_h[super.field_byte_b * 4], (boolean[])null);
         return true;
      }
   }

   // $FF: renamed from: a (javax.microedition.lcdui.Graphics, int, int) void
   public final void func_void_a(Graphics var1, int var2, int var3) {
      var1.setColor(4136767);
      var1.fillRect(0, 0, MyGameCanvas.canvasWidth, MyGameCanvas.field_int_h);
      class_bf.func_void_c(var1, var2, var3);
      UIGeneral.func_void_a(var1, 3, MyGameCanvas.canvasWidth >> 1, var3 + 5);
      class_bf.func_void_b(var1, var2, var3 + 24, 3);
      var3 += 5;
      var2 += 10;

      for(int var4 = 0; var4 < 5; ++var4) {
         var1.drawImage(class_ce.field_array_class_javax_microedition_lcdui_Image_l[19], var2 + 13, var3 + 49 + var4 * 16, 20);
      }

      switch(this.field_byte_c) {
      case 0:
         var1.drawImage(class_ce.field_array_class_javax_microedition_lcdui_Image_l[14], var2 + 5, var3 + 31 + super.field_byte_b * 16, 20);
         break;
      case 1:
         var1.drawImage(class_ce.field_array_class_javax_microedition_lcdui_Image_l[16], var2 + 5, var3 + 31 + super.field_byte_b * 16, 20);
         break;
      default:
         var1.drawImage(class_ce.field_array_class_javax_microedition_lcdui_Image_l[18], var2 + 5, var3 + 31 + super.field_byte_b * 16, 20);
      }

      if (this.field_byte_c < 2) {
         super.field_boolean_a = true;
         ++this.field_byte_c;
      }

      for(byte var5 = 0; var5 < super.field_byte_a; ++var5) {
         if (super.field_byte_b == var5) {
            var1.setColor(16777215);
         } else {
            var1.setColor(10452863);
         }

         UIGeneral.func_int_a(var1, var2 + 21, var3 + 36 + var5 * 16, class_ce.field_class_z_a.loadByIndex(this.field_array_byte_h[var5 * 4] - 6), 1);
      }

      var1.drawImage(class_ce.field_class_javax_microedition_lcdui_Image_g, var2 + 15, var3 + 104, 20);
      MyGameCanvas.func_void_c(var1, this.field_array_byte_h[super.field_byte_b * 4 + 1], var2 + 30, var3 + 104, 4);
      var1.setColor(8347487);
      UIGeneral.func_int_a(var1, var2 + 15, var3 + 117, (UIGeneral.labelTextProgress + this.field_array_byte_h[super.field_byte_b * 4 + 2] + "%").toCharArray(), 1);
      if (MyGameCanvas.canvasWidth > 128) {
         var1.drawImage(class_ce.field_array_class_javax_microedition_lcdui_Image_m[this.field_array_byte_h[super.field_byte_b * 4] - 6], var2 + 61 + 22, var3 + 74 + 15, 20);
      } else {
         var1.drawImage(class_ce.field_array_class_javax_microedition_lcdui_Image_m[this.field_array_byte_h[super.field_byte_b * 4] - 6], var2 + 61, var3 + 74, 20);
      }

      UIGeneral.func_void_a(var1, UIGeneral.labelTextOk, UIGeneral.labelTextBack);
   }
}
