package rpg;

import java.io.IOException;
import javax.microedition.lcdui.Graphics;

// $FF: renamed from: ai
public final class class_ai extends class_cb implements class_u {
   // $FF: renamed from: a int
   public static int field_int_a;
   // $FF: renamed from: b int
   public static int field_int_b;
   // $FF: renamed from: h byte[]
   private byte[] field_array_byte_h = new byte[5];
   // $FF: renamed from: c byte
   private byte field_byte_c;
   // $FF: renamed from: a z
   public static class_z field_class_z_a;
   // $FF: renamed from: a ai
   private static class_ai field_class_ai_a;

   // $FF: renamed from: a () ai
   public static final class_ai func_class_ai_a() {
      if (field_class_ai_a == null) {
         field_class_ai_a = new class_ai();
         field_class_ai_a.field_class_cb_b = new class_q(field_class_ai_a);
         field_int_a = MyGameCanvas.canvasHalfWidth - 77;
         field_int_b = MyGameCanvas.field_int_j - 85;
      }

      return field_class_ai_a;
   }

   private class_ai() {
      super((class_cb)null, (byte)6);
   }

   // $FF: renamed from: d () void
   public final void func_void_d() {
      class_ao var1;
      class_p var2 = (var1 = class_n.func_class_ao_a()).func_class_p_a();

      for(byte var3 = 0; var3 < 5; ++var3) {
         this.field_array_byte_h[var3] = -1;
      }

      if (var1.func_class_l_a() != null) {
         this.field_array_byte_h[0] = class_bu.field_array_array_byte_a[class_n.field_byte_a - 6][var1.func_class_l_a().field_byte_g];
      }

      if (var1.func_class_t_a() != null) {
         this.field_array_byte_h[1] = class_bu.field_array_byte_b[var1.func_class_t_a().field_byte_g];
      }

      if (var1.func_class_e_a() != null) {
         this.field_array_byte_h[2] = class_bu.field_array_array_byte_b[class_n.field_byte_a - 6][var1.func_class_e_a().field_byte_g];
      }

      if (var1.func_class_e_b() != null) {
         this.field_array_byte_h[3] = class_bu.field_array_byte_a[var1.func_class_e_b().field_byte_g];
      }

      this.field_byte_c = -1;
      if (var2 != null) {
         this.field_byte_c = var2.field_byte_f;
      }

      try {
         field_class_z_a = new class_z("/sgui/gm");
      } catch (IOException var4) {
         var4.printStackTrace();
      }

      class_bs.field_class_bs_a.func_void_h();
   }

   // $FF: renamed from: e () void
   public final void func_void_e() {
      super.field_byte_b = 6;
      class_d var1;
      (var1 = new class_d(this)).func_void_d();
      super.field_class_cb_b = var1;
      super.field_class_cb_b.field_byte_b = 1;
   }

   // $FF: renamed from: a (boolean) void
   public final void func_void_a(boolean var1) {
      class_ao var2;
      class_p var3 = (var2 = class_n.func_class_ao_a()).func_class_p_a();
      field_class_ai_a = null;
      if (var1) {
         if (var2.func_class_t_a() != null && this.field_array_byte_h[1] != class_bu.field_array_byte_b[var2.func_class_t_a().field_byte_g]) {
            var2.func_void_e((byte)1);
         }

         if (var2.func_class_e_a() != null && this.field_array_byte_h[2] != class_bu.field_array_array_byte_b[class_n.field_byte_a - 6][var2.func_class_e_a().field_byte_g]) {
            var2.func_void_e((byte)2);
         }

         if (var2.func_class_e_b() != null && this.field_array_byte_h[3] != class_bu.field_array_byte_a[var2.func_class_e_b().field_byte_g]) {
            var2.func_void_e((byte)3);
         }

         if (var3 != null && this.field_byte_c != var3.field_byte_f) {
            var2.func_void_l();
         } else {
            if (var2.func_class_l_a() != null && this.field_array_byte_h[0] != class_bu.field_array_array_byte_a[class_n.field_byte_a - 6][var2.func_class_l_a().field_byte_g]) {
               var2.func_void_e((byte)0);
            }

            class_n.func_void_a((int)2);
            class_bs.field_class_bs_a.func_void_f();
         }

         super.field_class_cb_b = null;
         field_class_ai_a = null;
         this.field_array_byte_h = null;
         field_class_z_a = null;
         class_bs.field_class_as_a.func_void_b();
      }
   }

   // $FF: renamed from: a (int, int) boolean
   public final boolean func_boolean_a(int var1, int var2) {
      if (this.func_boolean_b(var1, var2)) {
         return true;
      } else if (var2 == -8) {
         class_n.func_void_a((byte)14, (byte)0);
         return true;
      } else {
         return this.func_boolean_d(var1, var2);
      }
   }

   // $FF: renamed from: a (javax.microedition.lcdui.Graphics) void
   public final void func_void_a(Graphics var1) {
      this.func_void_b(var1, field_int_a, field_int_b);
   }

   // $FF: renamed from: a (javax.microedition.lcdui.Graphics, int, int) void
   public final void func_void_a(Graphics var1, int var2, int var3) {
      if (super.field_class_cb_b != null) {
         class_bh.func_void_a(var1);
         class_bh.func_void_a(var1, class_bh.field_array_char_d, class_bh.field_array_char_e);
      }

      boolean var4 = false;
      var1.setColor(4136767);
      var1.fillRect(var2, var3, 155, 176);
      class_cb.func_void_c(var1, var2 + 2, var3 + 15, 151, 160);
      var1.setColor(16768959);
      var1.fillRect(var2 + 5 + super.field_byte_b * 16 + 1, var3, 14, 1);
      var1.fillRect(var2 + 5 + super.field_byte_b * 16, var3 + 1, 1, 16);
      var1.setColor(12558207);
      var1.fillRect(var2 + 5 + super.field_byte_b * 16 + 15, var3 + 1, 1, 15);
      var1.setColor(14663551);
      var1.fillRect(var2 + 5 + super.field_byte_b * 16 + 1, var3 + 1, 14, 16);
      int var5 = var2 + 7;

      for(byte var6 = 0; var6 < 6; ++var6) {
         var1.drawImage(class_ce.field_array_class_javax_microedition_lcdui_Image_n[var6], var5, var3 + 1, 20);
         var5 += 16;
      }

   }

   // $FF: renamed from: a (byte) void
   public final void func_void_a(byte var1) {
      super.func_void_a(var1);
      super.field_class_cb_b = null;
      switch(super.field_byte_b) {
      case 0:
         super.field_class_cb_b = new class_q(this);
         break;
      case 1:
         super.field_class_cb_b = new class_ay(this);
         break;
      case 2:
         super.field_class_cb_b = new class_bz(this);
         break;
      case 3:
         super.field_class_cb_b = new class_bm(this);
         break;
      case 4:
         super.field_class_cb_b = new class_s(this);
         break;
      case 5:
         super.field_class_cb_b = new class_d(this);
      }

      super.field_boolean_a = true;
   }
}
