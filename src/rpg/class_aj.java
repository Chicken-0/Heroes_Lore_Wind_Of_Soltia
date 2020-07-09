package rpg;

import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

// $FF: renamed from: aj
public final class class_aj extends class_ck {
   // $FF: renamed from: a javax.microedition.lcdui.Image
   public Image field_class_javax_microedition_lcdui_Image_a;
   // $FF: renamed from: a short
   private short field_short_a;
   // $FF: renamed from: b short
   private short field_short_b;
   // $FF: renamed from: e short
   private short field_short_e;

   public class_aj(short var1, short var2, byte var3, byte var4, Image var5) {
      super(var1, var2, var3, var4);
      this.field_class_javax_microedition_lcdui_Image_a = var5;
      if (var5 != null) {
         this.field_short_a = (short)(-(var5.getWidth() >> 1));
         this.field_short_b = (short)(class_as.field_int_a + (var5.getWidth() >> 1));
         this.field_short_e = (short)(class_as.field_int_b + var5.getHeight());
      }

   }

   // $FF: renamed from: a (javax.microedition.lcdui.Graphics, int, int) void
   public final void func_void_a(Graphics var1, int var2, int var3) {
      int var4 = var2 + super.field_short_c + super.field_byte_c;
      int var5 = var3 + super.field_short_d + super.field_byte_d;
      if (var4 >= this.field_short_a && var4 <= this.field_short_b && var5 >= 0 && var5 <= this.field_short_e) {
         var1.drawImage(this.field_class_javax_microedition_lcdui_Image_a, var4, var5, 33);
      }
   }
}
