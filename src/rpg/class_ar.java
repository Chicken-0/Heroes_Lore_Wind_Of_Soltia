package rpg;

// $FF: renamed from: ar
public final class class_ar extends class_av {
   public class_ar(byte var1, byte var2, byte var3, byte var4) {
      super(var1, var2, var3, var4, (byte)1);
   }

   // $FF: renamed from: a () boolean
   public final boolean func_boolean_a() {
      return false;
   }

   // $FF: renamed from: i () void
   public final void func_void_i() {
      class_ao var1 = class_n.func_class_ao_a();
      if (super.field_byte_p == 0 && super.field_byte_f <= 1) {
         this.func_void_b((byte)2);
         this.func_void_q();
      } else {
         if (super.field_byte_o == 0) {
            if (super.field_byte_f > 1) {
               if (var1.field_byte_a > super.field_byte_a) {
                  this.func_void_a((byte)2);
                  this.func_void_b((byte)4);
                  return;
               }

               if (var1.field_byte_a < super.field_byte_a) {
                  this.func_void_a((byte)2);
                  this.func_void_b((byte)3);
                  return;
               }
            } else {
               this.func_void_a((byte)1);
               this.func_void_b((byte)2);
            }
         }

      }
   }

   // $FF: renamed from: j () void
   public final void func_void_j() {
      if (super.field_byte_k == 2) {
         class_n.field_class_ae_a.func_void_b((class_ck)(new class_i((byte)(super.field_byte_a - 1), super.field_byte_b, (byte[])((byte[])class_ce.field_array_class_java_lang_Object_f[super.field_byte_n]), this, super.field_byte_i, (byte)13, (byte)2)));
         class_n.field_class_ae_a.func_void_b((class_ck)(new class_i((byte)(super.field_byte_a + 1), super.field_byte_b, (byte[])((byte[])class_ce.field_array_class_java_lang_Object_f[super.field_byte_n]), this, super.field_byte_i, (byte)13, (byte)2)));
         class_n.field_class_ae_a.func_void_b((class_ck)(new class_i(super.field_byte_a, (byte)(super.field_byte_b + 1), (byte[])((byte[])class_ce.field_array_class_java_lang_Object_f[super.field_byte_n]), this, super.field_byte_i, (byte)13, (byte)2)));
      }

   }

   // $FF: renamed from: l () void
   public final void func_void_l() {
      super.func_void_l();
      class_n.field_class_ae_a.func_void_a(false);
   }

   // $FF: renamed from: m () void
   public final void func_void_m() {
      super.field_byte_q = 0;
   }
}
