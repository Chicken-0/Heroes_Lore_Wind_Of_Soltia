package rpg;

import javax.microedition.lcdui.Graphics;

// $FF: renamed from: cf
public final class class_cf extends class_f {
   // $FF: renamed from: a byte
   public byte field_byte_a;
   // $FF: renamed from: a short[]
   private static final short[] field_array_short_a = new short[]{40, 40, 40, 40, 40, 140, 160, 80};

   public class_cf(byte var1) {
      super(field_array_short_a[var1]);
      this.field_byte_a = var1;
   }

   // $FF: renamed from: a () void
   public final void func_void_a() {
      ++super.field_short_b;
      if (super.field_short_b >= super.field_short_a) {
         super.field_boolean_a = true;
      }

   }

   // $FF: renamed from: b () void
   public final void func_void_b() {
      super.field_boolean_a = true;
   }

   // $FF: renamed from: a (javax.microedition.lcdui.Graphics, int, int) void
   public final void func_void_a(Graphics var1, int var2, int var3) {
      var1.drawImage(class_ce.field_class_javax_microedition_lcdui_Image_D, var2, var3 - 30, 17);
      var1.drawImage(class_ce.field_array_class_javax_microedition_lcdui_Image_v[this.field_byte_a], var2, var3 - 29 + super.field_short_b % 2, 17);
   }

   // $FF: renamed from: c () void
   public final void func_void_c() {
      super.field_short_b = 0;
   }

   // $FF: renamed from: a () short
   public final short func_short_a() {
      return super.field_short_b;
   }
}
