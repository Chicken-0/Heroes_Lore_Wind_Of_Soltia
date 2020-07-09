package rpg;

import javax.microedition.lcdui.Graphics;

// $FF: renamed from: bk
public final class class_bk extends class_cb {
   // $FF: renamed from: c boolean
   private boolean field_boolean_c = false;
   // $FF: renamed from: d boolean
   private boolean field_boolean_d = false;
   // $FF: renamed from: c byte
   private byte field_byte_c;
   // $FF: renamed from: b boolean[]
   private boolean[] field_array_boolean_b = new boolean[3];
   // $FF: renamed from: e boolean
   private boolean field_boolean_e = true;
   // $FF: renamed from: d byte
   private byte field_byte_d = 0;

   public class_bk(class_by var1, byte var2) {
      super(var1, (byte)3);
      this.field_byte_c = var2;
      this.func_void_a(new Object[]{class_ce.field_class_z_g.func_array_char_a(16), class_ce.field_class_z_g.func_array_char_a(13)});
   }

   // $FF: renamed from: a (int, int) boolean
   public final boolean func_boolean_a(int var1, int var2) {
      if (this.func_boolean_b(var1, var2)) {
         return true;
      } else {
         if (!this.field_boolean_c) {
            if (this.func_boolean_d(var1, var2)) {
               this.field_byte_d = 0;
               return true;
            }

            if (var2 == 53 || var1 == 8) {
               this.field_array_boolean_b[super.field_byte_b] = !this.field_array_boolean_b[super.field_byte_b];
               byte var3 = 0;

               for(int var4 = 0; var4 < 3; ++var4) {
                  if (this.field_array_boolean_b[var4]) {
                     ++var3;
                  }
               }

               if (var3 == 2) {
                  this.field_boolean_c = true;
                  this.field_boolean_d = false;
               }
            }

            if (var2 == -8) {
               super.field_class_cb_a.func_void_a((byte)-1, (byte)-1);
               return true;
            }
         } else {
            switch(var1) {
            case 2:
            case 5:
               this.field_boolean_d = !this.field_boolean_d;
               break;
            case 8:
               if (this.field_boolean_d) {
                  this.func_void_d();
               } else {
                  this.field_array_boolean_b = new boolean[3];
                  this.field_boolean_c = false;
               }
               break;
            default:
               switch(var2) {
               case -8:
                  this.field_array_boolean_b = new boolean[3];
                  this.field_boolean_c = false;
                  break;
               case 52:
               case 54:
                  this.field_boolean_d = !this.field_boolean_d;
                  break;
               case 53:
                  if (this.field_boolean_d) {
                     this.func_void_d();
                  } else {
                     this.field_array_boolean_b = new boolean[3];
                     this.field_boolean_c = false;
                  }
               }
            }
         }

         return true;
      }
   }

   // $FF: renamed from: a (javax.microedition.lcdui.Graphics, int, int) void
   public final void func_void_a(Graphics var1, int var2, int var3) {
      var1.setColor(4136767);
      var1.fillRect(0, 0, class_r.field_int_g, class_r.field_int_h);
      class_bf.func_void_c(var1, var2, var3);
      class_bh.func_void_a(var1, 1, var2 + 155 >> 1, var3 + 5);
      class_bf.func_void_b(var1, var2, var3 + 24, 3);
      var2 += 15;
      var3 += 10;
      var1.drawImage(class_ce.field_array_class_javax_microedition_lcdui_Image_l[19], var2 + 11, var3 + 82, 20);

      for(byte var4 = 0; var4 < 3; ++var4) {
         if (this.field_array_boolean_b[var4]) {
            var1.drawImage(class_ce.field_array_array_class_javax_microedition_lcdui_Image_b[var4][1], var2 + 22 + var4 * 34, var3 + 66 - 5, 3);
         } else {
            var1.drawImage(class_ce.field_array_array_class_javax_microedition_lcdui_Image_b[var4][0], var2 + 22 + var4 * 34, var3 + 59 - 5 + (super.field_byte_b == var4 ? this.field_byte_d : 0), 3);
         }
      }

      if (!this.field_boolean_c) {
         var1.drawImage(class_ce.field_array_class_javax_microedition_lcdui_Image_l[20], var2 + 19 + super.field_byte_b * 34, var3 + 73, 20);
      }

      var1.setColor(0);
      if (!this.field_boolean_c) {
         class_bh.func_int_a(var1, var2 + 11, var3 + 94, class_ce.field_class_z_b.func_array_char_a(super.field_byte_b), 1);
         class_bh.func_int_a(var1, var2 + 11, var3 + 109, 100, 1, class_ce.field_class_z_b.func_array_char_a(12 + super.field_byte_b));
      } else {
         var1.drawImage(class_ce.field_array_class_javax_microedition_lcdui_Image_l[17], var2 + 60 + (this.field_boolean_d ? 0 : 28), var3 + 118, 20);
         class_bh.func_int_a(var1, var2 + 11, var3 + 104, class_ce.field_class_z_g.func_array_char_a(17), 1);
         if (this.field_boolean_d) {
            var1.setColor(16777215);
         } else {
            var1.setColor(0);
         }

         class_bh.func_int_a(var1, var2 + 64, var3 + 121, class_ce.field_class_z_g.func_array_char_a(14), 1);
         if (this.field_boolean_d) {
            var1.setColor(0);
         } else {
            var1.setColor(16777215);
         }

         class_bh.func_int_a(var1, var2 + 92, var3 + 121, class_ce.field_class_z_g.func_array_char_a(15), 1);
      }

      if (this.field_byte_d == 0) {
         ++this.field_byte_d;
         this.field_boolean_e = true;
      } else if (this.field_byte_d == 3) {
         --this.field_byte_d;
         this.field_boolean_e = false;
      } else if (this.field_boolean_e) {
         ++this.field_byte_d;
      } else {
         --this.field_byte_d;
      }

      if (super.field_class_cb_b == null) {
         super.field_boolean_a = true;
      }

      class_bh.func_void_a(var1, class_bh.field_array_char_d, class_bh.field_array_char_e);
   }

   // $FF: renamed from: d () void
   private void func_void_d() {
      class_n.func_void_a(false, this.field_byte_c, this.field_array_boolean_b);
   }
}
