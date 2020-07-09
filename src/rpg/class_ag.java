package rpg;

// $FF: renamed from: ag
public final class class_ag extends class_av {
   // $FF: renamed from: a cd
   private class_cd field_class_cd_a;
   // $FF: renamed from: a bd
   private class_bd field_class_bd_a;

   public class_ag(byte var1, byte var2, byte var3, byte var4) {
      super(var1, var2, var3, var4, (byte)3);
   }

   // $FF: renamed from: a (cd, bd) void
   public final void func_void_a(class_cd var1, class_bd var2) {
      this.field_class_cd_a = var1;
      this.field_class_bd_a = var2;
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
      if (super.field_byte_p == 0) {
         this.func_void_b((byte)2);
         this.func_void_q();
      }
   }

   // $FF: renamed from: j () void
   public final void func_void_j() {
      if (super.field_byte_k == 2) {
         class_n.field_class_ae_a.func_void_b((class_ck)(new class_i((byte)(super.field_byte_a - 1), (byte)(super.field_byte_b - 1), (byte[])((byte[])class_ce.field_array_class_java_lang_Object_f[super.field_byte_n]), this, super.field_byte_i, (byte)13, (byte)2)));
         class_n.field_class_ae_a.func_void_b((class_ck)(new class_i((byte)(super.field_byte_a + 3), (byte)(super.field_byte_b - 1), (byte[])((byte[])class_ce.field_array_class_java_lang_Object_f[super.field_byte_n]), this, super.field_byte_i, (byte)13, (byte)2)));
         class_n.field_class_ae_a.func_void_b((class_ck)(new class_i(super.field_byte_a, super.field_byte_b, (byte[])((byte[])class_ce.field_array_class_java_lang_Object_f[super.field_byte_n]), this, super.field_byte_i, (byte)13, (byte)2)));
         class_n.field_class_ae_a.func_void_b((class_ck)(new class_i((byte)(super.field_byte_a + 2), super.field_byte_b, (byte[])((byte[])class_ce.field_array_class_java_lang_Object_f[super.field_byte_n]), this, super.field_byte_i, (byte)13, (byte)2)));
         class_n.field_class_ae_a.func_void_b((class_ck)(new class_i((byte)(super.field_byte_a + 1), (byte)(super.field_byte_b + 1), (byte[])((byte[])class_ce.field_array_class_java_lang_Object_f[super.field_byte_n]), this, super.field_byte_i, (byte)13, (byte)2)));
      }

   }

   // $FF: renamed from: k () void
   public final void func_void_k() {
      if (super.field_byte_q > 8) {
         class_n.field_class_ae_a.func_void_b((class_ck)(new class_y((byte)(super.field_byte_a + class_h.func_int_a(-2, 2)), (byte)(super.field_byte_b + class_h.func_int_a(-2, 2)), (byte[])((byte[])class_ce.field_array_class_java_lang_Object_f[this.field_class_cd_a.field_byte_n]))));
         class_n.field_class_ae_a.func_void_b((class_ck)(new class_y((byte)(super.field_byte_a + class_h.func_int_a(-2, 2)), (byte)(super.field_byte_b + class_h.func_int_a(-2, 2)), (byte[])((byte[])class_ce.field_array_class_java_lang_Object_f[this.field_class_cd_a.field_byte_n]))));
      }

   }

   // $FF: renamed from: l () void
   public final void func_void_l() {
      super.func_void_l();
      class_ah.func_void_a((byte)1);
   }

   // $FF: renamed from: m () void
   public final void func_void_m() {
      this.field_class_cd_a.func_void_l();
      this.field_class_bd_a.func_void_l();
      super.field_byte_q = 24;
   }
}
