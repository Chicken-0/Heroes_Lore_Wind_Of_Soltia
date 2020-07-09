package rpg;

// $FF: renamed from: bd
public final class class_bd extends class_av {
   // $FF: renamed from: v byte
   private byte field_byte_v;
   // $FF: renamed from: w byte
   private byte field_byte_w;

   public class_bd(byte var1, byte var2, byte var3, byte var4) {
      super(var1, var2, var3, var4, (byte)2);
   }

   // $FF: renamed from: d () void
   public final void func_void_d() {
      ++super.field_byte_k;
      this.func_void_n();
      this.func_void_o();
   }

   // $FF: renamed from: h () void
   public final void func_void_h() {
      if (super.field_byte_k >= super.field_class_j_a.field_byte_j) {
         this.func_void_a((byte)1);
      }

   }

   // $FF: renamed from: i () void
   public final void func_void_i() {
      if (super.field_byte_p == 0) {
         this.func_void_q();
      }
   }

   // $FF: renamed from: j () void
   public final void func_void_j() {
      class_ao var1 = class_n.func_class_ao_a();
      if (super.field_byte_k == 4) {
         this.func_void_a(var1.field_byte_a, var1.field_byte_b);
         this.field_byte_v = var1.field_byte_a;
         this.field_byte_w = var1.field_byte_b;
      }

      if (super.field_byte_k == 7 && this.field_byte_v == var1.field_byte_a && this.field_byte_w == var1.field_byte_b) {
         var1.func_void_a(this, super.field_byte_i);
      }

   }

   // $FF: renamed from: m () void
   public final void func_void_m() {
      super.field_byte_q = 0;
   }
}
