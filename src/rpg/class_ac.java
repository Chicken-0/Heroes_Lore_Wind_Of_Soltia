package rpg;

import javax.microedition.lcdui.Graphics;

// $FF: renamed from: ac
public final class class_ac extends class_o {
   // $FF: renamed from: f byte
   public byte field_byte_f;
   // $FF: renamed from: g byte
   public byte field_byte_g;
   // $FF: renamed from: d boolean
   public boolean field_boolean_d;

   public class_ac(short var1, short var2, byte var3, byte var4) {
      super(var1, var2, (byte)8, (byte)8);
      this.field_byte_f = var3;
      this.field_boolean_d = true;
      this.field_byte_g = var4;
   }

   // $FF: renamed from: a (short, short) void
   public final void func_void_a(short var1, short var2) {
      this.func_void_f();
      super.func_void_a(var1, var2);
      this.func_void_b();
      if (super.field_byte_h == 1) {
         this.func_void_g();
      }

   }

   // $FF: renamed from: a (int) void
   public final void func_void_a(int var1) {
      this.func_void_f();
      super.field_short_c = (short)(super.field_short_c + var1 * class_u.field_array_byte_a[super.field_byte_i]);
      super.field_short_d = (short)(super.field_short_d + var1 * class_u.field_array_byte_b[super.field_byte_i]);
      this.func_void_b();
      if (super.field_byte_h == 1) {
         this.func_void_g();
      }

   }

   // $FF: renamed from: a () boolean
   public final boolean func_boolean_a() {
      return !super.field_boolean_a && !super.field_boolean_b ? false : false;
   }

   // $FF: renamed from: a (javax.microedition.lcdui.Graphics, int, int) void
   public final void func_void_a(Graphics var1, int var2, int var3) {
      if (this.field_boolean_d) {
         int var4 = var2 + super.field_short_c + super.field_byte_c;
         int var5 = var3 + super.field_short_d + super.field_byte_d;
         if (var4 + 16 >= 0 && var5 >= 0 && var4 - 16 <= class_as.field_int_a && var5 <= class_as.field_int_b + 32) {
            var1.drawImage(class_ce.field_class_javax_microedition_lcdui_Image_u, var4, var5 - 3, 17);
            if (this.field_byte_f >= 18) {
               var1.drawImage(class_ce.field_array_class_javax_microedition_lcdui_Image_g[this.field_byte_f - 18], var4, var5, 33);
            } else {
               boolean var6 = false;
               int var7;
               if (super.field_byte_h == 2) {
                  var7 = this.field_byte_g * 12 + 4 + (super.field_byte_j - 1);
               } else {
                  var7 = this.field_byte_g * 12 + 0 + (super.field_byte_j - 1);
               }

               class_as.func_void_b(var1, (byte[])((byte[])class_ce.field_array_class_java_lang_Object_j[var7]), super.field_byte_k, var4, var5);
               ++super.field_byte_k;
               if (super.field_byte_h == 1 && class_ce.field_array_byte_i[this.field_byte_g] <= super.field_byte_k) {
                  super.field_byte_k = 0;
               } else if (super.field_byte_h == 2 && class_ce.field_array_byte_j[this.field_byte_g] <= super.field_byte_k) {
                  super.field_byte_k = 0;
               }
            }

            this.func_void_b(var1, var4, var5);
         }
      }
   }
}
