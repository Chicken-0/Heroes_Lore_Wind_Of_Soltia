package rpg;

// $FF: renamed from: aq
public final class class_aq {
   // $FF: renamed from: a int
   public int field_int_a = 0;
   // $FF: renamed from: a ck
   public class_ck field_class_ck_a = null;
   // $FF: renamed from: b ck
   public class_ck field_class_ck_b = null;

   // $FF: renamed from: a (ck) void
   public final void func_void_a(class_ck var1) {
      var1.field_class_ck_a = this.field_class_ck_a;
      var1.field_class_ck_b = null;
      if (this.field_class_ck_a != null) {
         this.field_class_ck_a.field_class_ck_b = var1;
      }

      this.field_class_ck_a = var1;
      if (this.field_class_ck_b == null) {
         this.field_class_ck_b = this.field_class_ck_a;
      }

      ++this.field_int_a;
   }

   // $FF: renamed from: b (ck) void
   public final void func_void_b(class_ck var1) {
      var1.field_class_ck_b = this.field_class_ck_b;
      var1.field_class_ck_a = null;
      if (this.field_class_ck_b != null) {
         this.field_class_ck_b.field_class_ck_a = var1;
      }

      this.field_class_ck_b = var1;
      if (this.field_class_ck_a == null) {
         this.field_class_ck_a = this.field_class_ck_b;
      }

      ++this.field_int_a;
   }

   // $FF: renamed from: a (ck) ck
   public final class_ck func_class_ck_a(class_ck var1) {
      class_ck var2;
      for(var2 = this.field_class_ck_a; var2 != null && !var2.equals(var1); var2 = var2.field_class_ck_a) {
      }

      if (var2 != null) {
         if (var2.field_class_ck_b != null) {
            var2.field_class_ck_b.field_class_ck_a = var2.field_class_ck_a;
         } else {
            this.field_class_ck_a = var2.field_class_ck_a;
         }

         if (var2.field_class_ck_a != null) {
            var2.field_class_ck_a.field_class_ck_b = var2.field_class_ck_b;
         } else {
            this.field_class_ck_b = var2.field_class_ck_b;
         }

         --this.field_int_a;
         return var2;
      } else {
         return null;
      }
   }

   // $FF: renamed from: c (ck) void
   public final void func_void_c(class_ck var1) {
      class_ck var2;
      if (var1.field_class_ck_b != null && var1.field_byte_d + var1.field_short_d < var1.field_class_ck_b.field_byte_d + var1.field_class_ck_b.field_short_d) {
         var1.field_class_ck_b.field_class_ck_a = var1.field_class_ck_a;
         if (var1.field_class_ck_a == null) {
            this.field_class_ck_b = var1.field_class_ck_b;
         } else {
            var1.field_class_ck_a.field_class_ck_b = var1.field_class_ck_b;
         }

         for(var2 = var1.field_class_ck_b; var2 != null && var1.field_byte_d + var1.field_short_d < var2.field_byte_d + var2.field_short_d; var2 = var2.field_class_ck_b) {
         }

         if (var2 == null) {
            this.func_void_a(var1);
         } else {
            var2.field_class_ck_a.field_class_ck_b = var1;
            var1.field_class_ck_a = var2.field_class_ck_a;
            var2.field_class_ck_a = var1;
            var1.field_class_ck_b = var2;
         }
      } else {
         if (var1.field_class_ck_a != null && var1.field_byte_d + var1.field_short_d > var1.field_class_ck_a.field_byte_d + var1.field_class_ck_a.field_short_d) {
            var1.field_boolean_c = true;
            var1.field_class_ck_a.field_class_ck_b = var1.field_class_ck_b;
            if (var1.field_class_ck_b == null) {
               this.field_class_ck_a = var1.field_class_ck_a;
            } else {
               var1.field_class_ck_b.field_class_ck_a = var1.field_class_ck_a;
            }

            for(var2 = var1.field_class_ck_a; var2 != null && var1.field_byte_d + var1.field_short_d > var2.field_byte_d + var2.field_short_d; var2 = var2.field_class_ck_a) {
            }

            if (var2 == null) {
               this.func_void_b(var1);
               return;
            }

            var2.field_class_ck_b.field_class_ck_a = var1;
            var1.field_class_ck_b = var2.field_class_ck_b;
            var2.field_class_ck_b = var1;
            var1.field_class_ck_a = var2;
         }

      }
   }
}
