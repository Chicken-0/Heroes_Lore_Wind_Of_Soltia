package rpg;

// $FF: renamed from: cg
public final class class_cg extends class_av {
   // $FF: renamed from: a ba
   private class_ba field_class_ba_a;
   // $FF: renamed from: a ak
   private class_ak field_class_ak_a;
   // $FF: renamed from: g boolean
   private boolean field_boolean_g;
   // $FF: renamed from: v byte
   private byte field_byte_v;

   public class_cg(byte var1, byte var2, byte var3, byte var4, class_ba var5, class_ak var6) {
      super(var1, var2, var3, var4, (byte)2);
      this.field_class_ba_a = var5;
      this.field_class_ak_a = var6;
      this.field_boolean_g = false;
      this.field_byte_v = 0;
   }

   // $FF: renamed from: d () void
   public final void func_void_d() {
      ++super.field_byte_k;
      this.func_void_n();
      this.func_void_o();
   }

   // $FF: renamed from: h () void
   public final void func_void_h() {
      if (super.field_byte_k >= super.field_class_j_a.field_byte_k) {
         this.func_void_a((byte)1);
      }

   }

   // $FF: renamed from: i () void
   public final void func_void_i() {
      if (this.field_byte_v >= 3) {
         super.field_byte_p = 40;
         this.field_byte_v = 0;
      }

      if (super.field_byte_p == 0) {
         this.func_void_b((byte)2);
         this.func_void_q();
         ++this.field_byte_v;
      }
   }

   // $FF: renamed from: j () void
   public final void func_void_j() {
      class_ao var1 = class_n.func_class_ao_a();
      class_ae var2 = class_n.field_class_ae_a;
      switch(super.field_byte_k) {
      case 6:
         this.func_void_a(var1, var2, super.field_byte_b);
         return;
      case 7:
         this.func_void_a(var1, var2, (byte)(super.field_byte_b + 1));
         return;
      case 8:
         this.func_void_a(var1, var2, (byte)(super.field_byte_b + 2));
         return;
      case 9:
         this.func_void_a(var1, var2, (byte)(super.field_byte_b + 3));
         return;
      case 11:
         this.func_void_a(var1, var2, (byte)(super.field_byte_b + 4));
         return;
      case 12:
         for(byte var3 = 6; var3 <= 9; ++var3) {
            if (var2.field_array_array_class_ck_a[super.field_byte_b + 4][var3] == this) {
               var2.field_array_array_class_ck_a[super.field_byte_b + 4][var3] = null;
            }
         }

         if (var1.field_byte_a >= 6 && var1.field_byte_a <= 9 && var1.field_byte_b >= super.field_byte_b + 5 && var1.field_byte_b <= super.field_byte_b + 8) {
            var1.func_void_a((class_al)this, (short)((short)(super.field_class_j_a.field_short_b / 2)), (byte)2);
         }
      case 10:
      default:
      }
   }

   // $FF: renamed from: k () void
   public final void func_void_k() {
      if (super.field_byte_k >= super.field_class_j_a.field_byte_m) {
         super.field_byte_k = (byte)(super.field_class_j_a.field_byte_m - 1);
      }

   }

   // $FF: renamed from: a (ao, ae, byte) void
   private void func_void_a(class_ao var1, class_ae var2, byte var3) {
      byte var4;
      for(var4 = 6; var4 <= 9; ++var4) {
         if (var2.field_array_array_class_ck_a[var3][var4] == var1) {
            var1.func_void_a((byte)2, (byte)16);
            var1.func_void_a(this, (byte)2);
            break;
         }
      }

      for(var4 = 6; var4 <= 9; ++var4) {
         if (var2.field_array_array_class_ck_a[var3 - 1][var4] == this) {
            var2.field_array_array_class_ck_a[var3 - 1][var4] = null;
         }
      }

      for(var4 = 6; var4 <= 9; ++var4) {
         class_x.func_void_a(var2.field_array_array_class_ck_a[var3][var4] != var1);
         var2.field_array_array_class_ck_a[var3][var4] = this;
      }

      this.func_void_g();
   }

   // $FF: renamed from: l () void
   public final void func_void_l() {
      if (!this.field_boolean_g) {
         class_ae var1 = class_n.field_class_ae_a;

         for(byte var2 = 6; var2 <= 9; ++var2) {
            for(byte var3 = super.field_byte_b; var3 <= super.field_byte_b + 2; ++var3) {
               var1.field_array_array_byte_c[var3][var2] = 1;
            }
         }

         this.field_boolean_g = true;
      }

   }

   // $FF: renamed from: m () void
   public final void func_void_m() {
      super.field_byte_q = 12;
      class_ae var1 = class_n.field_class_ae_a;

      for(byte var2 = 6; var2 <= 9; ++var2) {
         for(int var3 = super.field_byte_b + 1; var3 <= super.field_byte_b + 5; ++var3) {
            if (var1.field_array_array_class_ck_a[var3][var2] == this) {
               var1.field_array_array_class_ck_a[var3][var2] = null;
            }
         }
      }

      class_n.field_class_ae_a.func_void_a((class_ck)this.field_class_ba_a);
      class_n.field_class_ae_a.func_void_a((class_ck)this.field_class_ak_a);
   }
}
