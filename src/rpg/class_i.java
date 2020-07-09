package rpg;

import javax.microedition.lcdui.Graphics;

// $FF: renamed from: i
public final class class_i extends class_y {
   // $FF: renamed from: a o
   private class_o field_class_o_a;
   // $FF: renamed from: d boolean
   private boolean field_boolean_d;
   // $FF: renamed from: f byte
   private byte field_byte_f;
   // $FF: renamed from: g byte
   private byte field_byte_g;
   // $FF: renamed from: h byte
   private byte field_byte_h;
   // $FF: renamed from: e boolean
   private boolean field_boolean_e;
   // $FF: renamed from: a int
   private int field_int_a;
   // $FF: renamed from: i byte
   private byte field_byte_i;
   // $FF: renamed from: f boolean
   private boolean field_boolean_f;

   public class_i(byte var1, byte var2, byte[] var3, class_o var4, byte var5, byte var6, byte var7) {
      super(var1, var2, var3);
      this.field_class_o_a = var4;
      this.field_boolean_d = false;
      this.field_byte_f = var5;
      this.field_byte_g = (byte)(var6 - 1);
      this.field_byte_h = var7;
   }

   public class_i(byte var1, byte var2, byte[] var3, class_o var4, boolean var5, byte var6, byte var7, byte var8, int var9, byte var10, boolean var11) {
      super(var1, var2, var3);
      this.field_class_o_a = var4;
      this.field_boolean_d = var5;
      this.field_byte_f = var6;
      this.field_byte_g = (byte)(var7 - 1);
      this.field_byte_h = var8;
      this.field_int_a = var9;
      this.field_byte_i = var10;
      this.field_boolean_f = var11;
   }

   // $FF: renamed from: a () void
   public final void func_void_a() {
      if (super.field_short_b == this.field_byte_h && this.field_byte_g > 0 && (this.field_boolean_d || !this.field_boolean_e)) {
         class_ae var1 = class_n.field_class_ae_a;
         byte var2 = (byte)(super.field_byte_a + class_u.field_array_byte_a[this.field_byte_f]);
         byte var3 = (byte)(super.field_byte_b + class_u.field_array_byte_b[this.field_byte_f]);
         if (var2 >= 0 && var2 < var1.field_int_a && var3 >= 0 && var3 < var1.field_int_b) {
            if (this.field_class_o_a instanceof class_al) {
               var1.func_void_b((class_ck)(new class_i(var2, var3, super.field_array_byte_h, this.field_class_o_a, this.field_byte_f, this.field_byte_g, this.field_byte_h)));
            } else if (this.field_class_o_a instanceof class_ao) {
               var1.func_void_b((class_ck)(new class_i(var2, var3, super.field_array_byte_h, this.field_class_o_a, this.field_boolean_d, this.field_byte_f, this.field_byte_g, this.field_byte_h, this.field_int_a, this.field_byte_i, this.field_boolean_f)));
            }
         }
      }

      if ((this.field_boolean_d || !this.field_boolean_e) && super.field_short_b == 1) {
         class_ck var4 = class_n.field_class_ae_a.field_array_array_class_ck_a[super.field_byte_b][super.field_byte_a];
         if (this.field_class_o_a instanceof class_al) {
            if (var4 != null && var4 instanceof class_ao) {
               ((class_ao)var4).func_void_a((class_al)this.field_class_o_a, this.field_byte_f);
               this.field_boolean_e = true;
               return;
            }
         } else if (this.field_class_o_a instanceof class_ao && var4 != null && var4 instanceof class_al) {
            ((class_al)var4).func_void_a(this.field_int_a, false, this.field_byte_f, this.field_boolean_f, (byte)1, this.field_byte_i, (class_ao)this.field_class_o_a);
            this.field_boolean_e = true;
         }
      }

   }

   // $FF: renamed from: a () boolean
   public final boolean func_boolean_a() {
      return super.field_short_b == super.field_short_a || super.field_short_a == 2 && !this.field_boolean_d && this.field_boolean_e && super.field_short_b >= 1;
   }

   // $FF: renamed from: a (javax.microedition.lcdui.Graphics, int, int) void
   public final void func_void_a(Graphics var1, int var2, int var3) {
      int var4 = var2 + super.field_short_c + super.field_byte_c;
      int var5 = var3 + super.field_short_d + super.field_byte_d;
      if (super.field_short_a == 2 && super.field_short_b == 1) {
         var4 += class_u.field_array_byte_a[this.field_byte_f] * 8;
         var5 += class_u.field_array_byte_b[this.field_byte_f] * 8;
      }

      this.func_void_b(var1, var4, var5);
      ++super.field_short_b;
   }
}
