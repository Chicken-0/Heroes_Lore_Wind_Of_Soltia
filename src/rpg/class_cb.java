package rpg;

import javax.microedition.lcdui.Graphics;

// $FF: renamed from: cb
public abstract class class_cb implements class_u {
   // $FF: renamed from: a cb
   public class_cb field_class_cb_a;
   // $FF: renamed from: b cb
   public class_cb field_class_cb_b;
   // $FF: renamed from: b boolean
   private boolean field_boolean_b;
   // $FF: renamed from: a boolean
   public boolean field_boolean_a;
   // $FF: renamed from: a byte
   public byte field_byte_a;
   // $FF: renamed from: b byte
   public byte field_byte_b;

   public class_cb(class_cb var1, byte var2) {
      this.field_class_cb_a = var1;
      this.field_class_cb_b = null;
      this.field_boolean_b = true;
      this.field_boolean_a = true;
      this.field_byte_a = var2;
      this.field_byte_b = 0;
   }

   // $FF: renamed from: a (int, int) boolean
   public abstract boolean func_boolean_a(int var1, int var2);

   // $FF: renamed from: b (int, int) boolean
   public final boolean func_boolean_b(int var1, int var2) {
      if (this.field_class_cb_b != null && this.field_class_cb_b.func_boolean_a(var1, var2)) {
         return true;
      } else {
         this.field_boolean_a = true;
         return false;
      }
   }

   // $FF: renamed from: a (javax.microedition.lcdui.Graphics, int, int) void
   public abstract void func_void_a(Graphics var1, int var2, int var3);

   // $FF: renamed from: b (javax.microedition.lcdui.Graphics, int, int) void
   public final void func_void_b(Graphics var1, int var2, int var3) {
      boolean var4 = false;
      if (this.field_boolean_a) {
         this.field_boolean_a = false;
         this.func_void_a(var1, var2, var3);
         var4 = true;
      }

      if (this.field_class_cb_b == null) {
         if (this.field_boolean_b) {
            if (!var4) {
               this.func_void_a(var1, var2, var3);
            }

            this.field_boolean_b = false;
            return;
         }
      } else {
         this.field_class_cb_b.func_void_b(var1, var2, var3);
      }

   }

   // $FF: renamed from: a (int, int, boolean) boolean
   public final boolean func_boolean_a(int var1, int var2, boolean var3) {
      switch(var2) {
      case 50:
         this.func_void_a((byte)3, var3);
         return true;
      case 56:
         this.func_void_a((byte)4, var3);
         return true;
      default:
         switch(var1) {
         case 1:
            this.func_void_a((byte)3, var3);
            return true;
         case 6:
            this.func_void_a((byte)4, var3);
            return true;
         default:
            return false;
         }
      }
   }

   // $FF: renamed from: c (int, int) boolean
   public final boolean func_boolean_c(int var1, int var2) {
      return this.func_boolean_a(var1, var2, false);
   }

   // $FF: renamed from: d (int, int) boolean
   public final boolean func_boolean_d(int var1, int var2) {
      switch(var2) {
      case 52:
         this.func_void_a((byte)3);
         return true;
      case 54:
         this.func_void_a((byte)4);
         return true;
      default:
         switch(var1) {
         case 2:
            this.func_void_a((byte)3);
            return true;
         case 5:
            this.func_void_a((byte)4);
            return true;
         default:
            return false;
         }
      }
   }

   // $FF: renamed from: a (byte) void
   public void func_void_a(byte var1) {
      this.func_void_a(var1, true);
   }

   // $FF: renamed from: a (byte, boolean) void
   public final void func_void_a(byte var1, boolean var2) {
      if (var1 == 4) {
         ++this.field_byte_b;
         if (this.field_byte_b >= this.field_byte_a) {
            if (var2) {
               this.field_byte_b = 0;
               return;
            }

            this.field_byte_b = (byte)(this.field_byte_a - 1);
            if (this.field_byte_b < 0) {
               this.field_byte_b = 0;
               return;
            }
         }
      } else {
         --this.field_byte_b;
         if (this.field_byte_b < 0) {
            if (var2) {
               this.field_byte_b = (byte)(this.field_byte_a - 1);
               return;
            }

            this.field_byte_b = 0;
         }
      }

   }

   // $FF: renamed from: a (byte, byte) void
   public void func_void_a(byte var1, byte var2) {
      this.field_class_cb_b = null;
      if (class_bs.field_class_as_a != null) {
         class_bs.field_class_as_a.func_void_a();
      }

      this.func_void_b();
   }

   // $FF: renamed from: a () void
   public final void func_void_a() {
      this.field_class_cb_b = null;
      if (class_bs.field_class_as_a != null) {
         class_bs.field_class_as_a.func_void_a();
      }

      this.func_void_b();
   }

   // $FF: renamed from: a (byte, byte, java.lang.Object[]) void
   public final void func_void_a(byte var1, byte var2, Object[] var3) {
      this.field_class_cb_b = new class_af(this, var1, var2, var3, (char[])null, (char[])null);
   }

   // $FF: renamed from: a (byte, byte, java.lang.Object[], char[], char[]) void
   public final void func_void_a(byte var1, byte var2, Object[] var3, char[] var4, char[] var5) {
      this.field_class_cb_b = new class_af(this, var1, var2, var3, var4, var5);
   }

   // $FF: renamed from: a (java.lang.Object[]) void
   public final void func_void_a(Object[] var1) {
      this.field_class_cb_b = new class_af(this, (byte)1, (byte)0, var1, (char[])null, (char[])null);
   }

   // $FF: renamed from: b () void
   public final void func_void_b() {
      if (this.field_class_cb_a != null) {
         this.field_class_cb_a.func_void_b();
      }

      this.field_boolean_a = true;
   }

   // $FF: renamed from: c () void
   public final void func_void_c() {
      if (this.field_class_cb_b != null) {
         this.field_class_cb_b.func_void_c();
      }

      this.field_boolean_a = true;
   }

   // $FF: renamed from: a () int
   public final int func_int_a() {
      return this.field_byte_b / 5 + 1;
   }

   // $FF: renamed from: b () int
   public final int func_int_b() {
      return (this.field_byte_a - 1) / 5 + 1;
   }

   // $FF: renamed from: c () int
   public final int func_int_c() {
      return (this.func_int_a() - 1) * 5;
   }

   // $FF: renamed from: d () int
   public final int func_int_d() {
      int var1;
      return (var1 = this.func_int_a() * 5 - 1) > this.field_byte_a - 1 ? this.field_byte_a - 1 : var1;
   }

   // $FF: renamed from: a (javax.microedition.lcdui.Graphics, int, int, boolean) void
   public final void func_void_a(Graphics var1, int var2, int var3, boolean var4) {
      byte var5 = (byte)(this.field_byte_b % 5);
      int var6;
      if ((var6 = this.field_byte_a - (this.func_int_a() - 1) * 5) > 5) {
         var6 = 5;
      }

      for(byte var7 = 0; var7 < var6; ++var7) {
         if (var7 != var5) {
            func_void_a(var1, var2, var3, var7, false);
         }
      }

      func_void_a(var1, var2 + 27, var3 + 10, 120, 137, 4136767, 10452799, 4144959);
      func_void_a(var1, var2 + 27, var3 + 10, 120, 137, 6242111);
      func_void_a(var1, var2, var3, var5, true);
      if (var4) {
         if (this.func_int_a() > 1) {
            var1.drawImage(class_ce.field_class_javax_microedition_lcdui_Image_k, var2 + 70, var3 + 4, 20);
         }

         if (this.func_int_a() < this.func_int_b()) {
            var1.drawImage(class_ce.field_class_javax_microedition_lcdui_Image_n, var2 + 70, var3 + 148, 20);
         }
      }

   }

   // $FF: renamed from: a (javax.microedition.lcdui.Graphics, int, int, int, int, int, int) void
   private static final void func_void_a(Graphics var0, int var1, int var2, int var3, int var4, int var5, int var6) {
      var0.setColor(var5);
      var0.drawLine(var1 + 1, var2, var1 + var3 - 2, var2);
      var0.drawLine(var1, var2 + 1, var1, var2 + var4 - 2);
      var0.setColor(var6);
      var0.drawLine(var1 + var3 - 1, var2 + 1, var1 + var3 - 1, var2 + var4 - 1);
      var0.drawLine(var1 + 1, var2 + var4 - 1, var1 + var3 - 2, var2 + var4 - 1);
   }

   // $FF: renamed from: c (javax.microedition.lcdui.Graphics, int, int, int, int, int) void
   private static final void func_void_c(Graphics var0, int var1, int var2, int var3, int var4, int var5) {
      var0.setColor(var5);
      var0.fillRect(var1 + 1, var2 + 1, var3 - 2, var4 - 2);
   }

   // $FF: renamed from: a (javax.microedition.lcdui.Graphics, int, int, int, int, int, int, int) void
   public static final void func_void_a(Graphics var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      var0.setColor(var5);
      var0.drawLine(var1 + 1, var2, var1 + var3 - 2, var2);
      var0.drawLine(var1 + var3 - 1, var2 + 1, var1 + var3 - 1, var2 + var4 - 2);
      var0.drawLine(var1 + 1, var2 + var4 - 1, var1 + var3 - 2, var2 + var4 - 1);
      var0.drawLine(var1, var2 + 1, var1, var2 + var4 - 2);
      var0.setColor(var6);
      var0.drawLine(var1 + 1, var2 + 1, var1 + var3 - 3, var2 + 1);
      var0.drawLine(var1 + 1, var2 + 1, var1 + 1, var2 + var4 - 3);
      var0.setColor(var7);
      var0.drawLine(var1 + var3 - 2, var2 + 1, var1 + var3 - 2, var2 + var4 - 3);
      var0.drawLine(var1 + 1, var2 + var4 - 2, var1 + var3 - 2, var2 + var4 - 2);
   }

   // $FF: renamed from: a (javax.microedition.lcdui.Graphics, int, int, int, int, int) void
   public static final void func_void_a(Graphics var0, int var1, int var2, int var3, int var4, int var5) {
      var0.setColor(var5);
      var0.fillRect(var1 + 2, var2 + 2, var3 - 4, var4 - 4);
   }

   // $FF: renamed from: b (javax.microedition.lcdui.Graphics, int, int, int, int, int) void
   public static final void func_void_b(Graphics var0, int var1, int var2, int var3, int var4, int var5) {
      var0.setColor(var5);
      var0.drawLine(var1 + 1, var2, var1 + var3 - 2, var2);
      var0.drawLine(var1, var2 + 1, var1, var2 + var4 - 2);
      var0.drawLine(var1 + var3 - 1, var2 + 1, var1 + var3 - 1, var2 + var4 - 2);
      var0.drawLine(var1 + 1, var2 + var4 - 1, var1 + var3 - 2, var2 + var4 - 1);
      var0.fillRect(var1 + 1, var2 + 1, var3 - 2, var4 - 2);
   }

   // $FF: renamed from: a (javax.microedition.lcdui.Graphics, int, int, int, int) void
   public static final void func_void_a(Graphics var0, int var1, int var2, int var3, int var4) {
      func_void_a(var0, var1, var2, var3, var4, 2039615, 6242111, 2039615);
   }

   // $FF: renamed from: b (javax.microedition.lcdui.Graphics, int, int, int, int) void
   public static final void func_void_b(Graphics var0, int var1, int var2, int var3, int var4) {
      func_void_a(var0, var1, var2, var3, var4, 4136767);
   }

   // $FF: renamed from: a (javax.microedition.lcdui.Graphics, int, int, byte, boolean) void
   public static final void func_void_a(Graphics var0, int var1, int var2, byte var3, boolean var4) {
      int var5 = var1 + 3;
      int var6 = var2 + 10 + var3 * 23;
      var0.setColor(var4 ? 4136767 : 6242111);
      var0.fillRect(var5 + 1, var6, 24, 1);
      var0.fillRect(var5, var6 + 1, 1, 16);
      var0.fillRect(var5 + 1, var6 + 17, 24, 1);
      var0.setColor(var4 ? 10452799 : 14663551);
      var0.fillRect(var5 + 1, var6 + 1, 24, 1);
      var0.fillRect(var5 + 1, var6 + 1, 1, 16);
      var0.setColor(var4 ? 4144959 : 8347519);
      var0.fillRect(var5 + 2, var6 + 16, 23, 1);
      var0.setColor(var4 ? 6242111 : 10452863);
      var0.fillRect(var5 + 2, var6 + 2, 24, 14);
   }

   // $FF: renamed from: a (javax.microedition.lcdui.Graphics, int, int, int) void
   public static final void func_void_a(Graphics var0, int var1, int var2, int var3) {
      MyGameCanvas.func_void_c(var0, var3, var1, var2, 8);
      int var4 = MyGameCanvas.func_int_a(var3);
      var0.drawImage(class_ce.field_class_javax_microedition_lcdui_Image_m, var1 - var4, var2, 24);
   }

   // $FF: renamed from: a (javax.microedition.lcdui.Graphics, int, int, ad, boolean) void
   public static final void func_void_a(Graphics var0, int var1, int var2, class_ad var3, boolean var4) {
      var0.drawImage(class_ce.field_array_class_javax_microedition_lcdui_Image_d[var3.field_byte_f], var1, var2 + 1, 3);
      if (var4 && var3.field_byte_h > 1) {
         MyGameCanvas.func_void_c(var0, var3.field_byte_h, var1 + 11, var2 + 2, 8);
      }

   }

   // $FF: renamed from: a (javax.microedition.lcdui.Graphics, int, int, ad) void
   public static final void func_void_a(Graphics var0, int var1, int var2, class_ad var3) {
      boolean var4 = false;
      if (!(var3 instanceof class_e)) {
         var0.setColor(16777215);
         var2 = var2 + class_bh.func_int_a(var0, var1, var2, 115, 1, var3.field_array_char_a) - (class_bh.func_int_a() + 2);
         var0.setColor(14663551);
         if (MyGameCanvas.canvasWidth > 128) {
            class_bh.func_int_a(var0, var1, var2 + 15, 110, 1, var3.field_array_char_b);
         } else {
            class_bh.func_int_a(var0, var1, var2 + 15, 75, 1, var3.field_array_char_b);
         }
      } else {
         class_e var5;
         if (!(var5 = (class_e)var3).field_boolean_b) {
            var0.setColor(14663551);
            var2 = var2 + class_bh.func_int_a(var0, var1, var2, 115, 1, var5.func_array_char_a()) - (class_bh.func_int_a() + 2);
            var0.setColor(16777215);
            class_bh.func_int_a(var0, var1, var2 + 16, 115, 1, class_ce.field_class_z_g.loadByIndex(5));
         } else {
            var0.setColor(16777215);
            var2 = var2 + class_bh.func_int_a(var0, var1, var2, 115, 1, var5.field_array_char_a) - (class_bh.func_int_a() + 2);
            var0.setColor(14663551);
            class_bh.func_int_a(var0, var1, var2 + 25, class_ce.field_class_z_g.loadByIndex(var5 instanceof class_l ? 4 : 46), 1);
            MyGameCanvas.func_void_c(var0, var5.field_short_a, var1 + 155 - 47, var2 + 25, 8);
            class_t var6;
            if (var3 instanceof class_t && (var6 = (class_t)var3).field_byte_c != -1) {
               var0.setColor(16711680);
               var2 = var2 + class_bh.func_int_a(var0, var1 + 55, var2 + 10, 115, 1, class_t.field_class_z_a.loadByIndex(var6.field_byte_c)) - (class_bh.func_int_a() + 2);
            }

            var0.setColor(14663551);
            class_bh.func_int_a(var0, var1, var2 + 40, class_ce.field_class_z_g.loadByIndex(3), 1);
            MyGameCanvas.func_void_d(var0, var1 + 155 - 47, var2 + 40, var5.field_byte_e, var5.field_byte_d);
            StringBuffer var8 = new StringBuffer();

            for(int var7 = 0; var7 < var5.field_array_byte_j.length; ++var7) {
               if (var5.field_array_byte_j[var7] > 0) {
                  var8.append(class_bh.func_class_java_lang_String_a(class_ce.field_class_z_a.loadByIndex(9 + var7))).append("+").append(var5.field_array_byte_j[var7]).append("  ");
               }
            }

            var8.append(class_bh.func_class_java_lang_String_a(var5.field_array_char_b));
            Object var9 = null;
            char[] var10 = var8.toString().toCharArray();
            if (MyGameCanvas.canvasWidth > 128) {
               class_bh.func_int_a(var0, var1, var2 + 55, 110, 1, var10);
            } else {
               class_bh.func_int_a(var0, var1, var2 + 55, 75, 1, var10);
            }
         }

      }
   }

   // $FF: renamed from: a (javax.microedition.lcdui.Graphics, int, int, ad, byte, char[], boolean) void
   public static final void func_void_a(Graphics var0, int var1, int var2, class_ad var3, byte var4, char[] var5, boolean var6) {
      func_void_b(var0, var1, var2 + 1, 28, 31, 12558207);
      int var7 = MyGameCanvas.func_int_a(var0, class_ce.field_class_z_g.loadByIndex(2), var1 + 2, var2 + 1);
      MyGameCanvas.func_void_c(var0, var4, var7 + 2, var2 + 1, 4);
      var0.setColor(16777215);
      class_bh.func_void_a(var0, var1 + 90, var2 + 2, var5, 1);
      boolean var8 = false;
      if (var6) {
         func_void_a(var0, var1 + 30, var2 + 14, 117, 19, 4136767, 10452799, 4144959);
         func_void_a(var0, var1 + 30, var2 + 14, 117, 19, 6233919);
      } else {
         func_void_a(var0, var1 + 30, var2 + 14, 117, 19, 6242111, 14663551, 8347519);
         func_void_a(var0, var1 + 30, var2 + 14, 117, 19, 10452863);
      }

      if (var3 != null) {
         var0.drawImage(class_ce.field_array_class_javax_microedition_lcdui_Image_d[var3.field_byte_f], var1 + 14, var2 + 19, 3);
         var0.setColor(16777215);
         if (var3 instanceof class_e && !((class_e)var3).field_boolean_b) {
            class_bh.func_int_a(var0, var1 + 34, var2 + 20, var3.func_array_char_a(), 1);
            return;
         }

         class_bh.func_int_a(var0, var1 + 34, var2 + 20, var3.field_array_char_a, 1);
      }

   }

   // $FF: renamed from: a (javax.microedition.lcdui.Graphics, int, int, int, char[], boolean) void
   public static final void func_void_a(Graphics var0, int var1, int var2, int var3, char[] var4, boolean var5) {
      if (var5) {
         func_void_a(var0, var1, var2, var3, 19, 4136767, 10452799, 4144959);
         func_void_a(var0, var1, var2, var3, 19, 6233919);
      } else {
         func_void_a(var0, var1, var2, var3, 19, 6242111, 14663551, 8347519);
         func_void_a(var0, var1, var2, var3, 19, 10452863);
      }

      if (var4 != null) {
         var0.setColor(16777215);
         class_bh.func_int_a(var0, var1 + var3 / 2 - class_bh.func_int_a(var4) / 2, var2 + 5, var4, 1);
      }

   }

   // $FF: renamed from: a (javax.microedition.lcdui.Graphics, int, int, int, int, boolean) void
   public static final void func_void_a(Graphics var0, int var1, int var2, int var3, int var4, boolean var5) {
      if (var5) {
         func_void_a(var0, var1, var2, var3, var4, 6242111, 14663551, 8347519);
      } else {
         func_void_a(var0, var1, var2, var3, var4, 4136767, 10452799, 4144959);
      }
   }

   // $FF: renamed from: a (javax.microedition.lcdui.Graphics, int, int, int, int, char[], int, int, int, int) void
   public static final void func_void_a(Graphics var0, int var1, int var2, int var3, int var4, char[] var5, int var6, int var7, int var8, int var9) {
      var0.setColor(var8);
      var0.fillRect(var1, var2, var3, var4);
      if (var5 != null) {
         var3 = var3 - var6 - var6;
         var0.setColor(var9);
         if (var7 == 1) {
            class_bh.func_void_b(var0, var1 + var6 + (var3 >> 1), var2 + 1, var3, 1, var5, 0, 0, var5.length);
         } else {
            class_bh.func_int_a(var0, var1 + var6, var2 + 1, var3, 1, var5);
         }
      }
   }

   // $FF: renamed from: c (javax.microedition.lcdui.Graphics, int, int, int, int) void
   public static final void func_void_c(Graphics var0, int var1, int var2, int var3, int var4) {
      func_void_a(var0, var1, var2, var3, var4, 16768959, 12558207);
      func_void_c(var0, var1, var2, var3, var4, 14663551);
   }
}
