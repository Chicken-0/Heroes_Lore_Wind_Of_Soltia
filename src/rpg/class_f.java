package rpg;

import javax.microedition.lcdui.Graphics;

// $FF: renamed from: f
public abstract class class_f implements class_u {
   // $FF: renamed from: a short
   public short field_short_a;
   // $FF: renamed from: b short
   public short field_short_b;
   // $FF: renamed from: a boolean
   public boolean field_boolean_a;

   public class_f(short var1) {
      this.field_short_a = var1;
      this.field_short_b = 0;
      this.field_boolean_a = false;
   }

   // $FF: renamed from: a (javax.microedition.lcdui.Graphics, int, int) void
   public abstract void func_void_a(Graphics var1, int var2, int var3);
}
