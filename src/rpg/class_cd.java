package rpg;

// $FF: renamed from: cd
public final class class_cd extends class_av {
   // $FF: renamed from: a ag
   private class_ag field_class_ag_a;
   // $FF: renamed from: a bd
   private class_bd field_class_bd_a;
   // $FF: renamed from: v byte
   private byte field_byte_v = 0;

   public class_cd(byte var1, byte var2, byte var3, byte var4) {
      super(var1, var2, var3, var4, (byte)2);
   }

   // $FF: renamed from: a (ag, bd) void
   public final void func_void_a(class_ag var1, class_bd var2) {
      this.field_class_ag_a = var1;
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
      if (super.field_byte_k == 5) {
         if (this.field_class_ag_a.field_byte_h != 6 && this.field_class_ag_a.field_byte_h != 5 && this.field_class_ag_a.field_short_a < this.field_class_ag_a.field_class_j_a.field_short_a / 2) {
            this.func_void_a(this.field_class_ag_a);
            return;
         }

         if (this.field_class_bd_a.field_byte_h != 6 && this.field_class_bd_a.field_byte_h != 5 && this.field_class_bd_a.field_short_a < this.field_class_bd_a.field_class_j_a.field_short_a / 2) {
            this.func_void_a(this.field_class_bd_a);
            return;
         }

         if (super.field_byte_h != 6 && super.field_byte_h != 5 && super.field_short_a < super.field_class_j_a.field_short_a / 2) {
            this.func_void_a(this);
            return;
         }

         switch(this.field_byte_v) {
         case 0:
            if (this.field_class_ag_a.field_short_a < this.field_class_ag_a.field_class_j_a.field_short_a) {
               this.func_void_a(this.field_class_ag_a);
            }

            this.field_byte_v = 1;
            return;
         case 1:
            if (this.field_class_bd_a.field_short_a < this.field_class_bd_a.field_class_j_a.field_short_a) {
               this.func_void_a(this.field_class_bd_a);
            }

            this.field_byte_v = 2;
            return;
         case 2:
            if (super.field_short_a < super.field_class_j_a.field_short_a) {
               this.func_void_a(this);
            }

            this.field_byte_v = 0;
         }
      }

   }

   // $FF: renamed from: a (al) void
   private void func_void_a(class_al var1) {
      var1.func_void_a(new class_aw((byte)9, (short)-1, (short)super.field_byte_n));
      var1.func_void_c(this.field_class_ag_a.field_class_j_a.field_short_a / 10);
      var1.func_void_a(new class_aw((byte)7, (short)4, (short)(-(this.field_class_ag_a.field_class_j_a.field_short_a / 10))));
   }

   // $FF: renamed from: m () void
   public final void func_void_m() {
      super.field_byte_q = 0;
   }
}
