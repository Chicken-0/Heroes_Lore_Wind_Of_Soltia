package rpg;

import javax.microedition.lcdui.Display;

// $FF: renamed from: bs
public final class class_bs implements Runnable {
   // $FF: renamed from: a int[]
   public static final int[] field_array_int_a = new int[]{8, 10, 14, 18};
   // $FF: renamed from: a javax.microedition.lcdui.Display
   private Display field_class_javax_microedition_lcdui_Display_a;
   // $FF: renamed from: a r
   private class_r field_class_r_a;
   // $FF: renamed from: a as
   public static class_as field_class_as_a;
   // $FF: renamed from: c int
   private int field_int_c;
   // $FF: renamed from: d int
   private int field_int_d;
   // $FF: renamed from: a int
   public int field_int_a;
   // $FF: renamed from: a boolean
   public boolean field_boolean_a;
   // $FF: renamed from: b boolean
   public boolean field_boolean_b;
   // $FF: renamed from: c boolean
   public boolean field_boolean_c;
   // $FF: renamed from: d boolean
   public boolean field_boolean_d;
   // $FF: renamed from: a byte
   public byte field_byte_a;
   // $FF: renamed from: b byte
   public byte field_byte_b;
   // $FF: renamed from: b int
   public int field_int_b;
   // $FF: renamed from: a long
   private long field_long_a;
   // $FF: renamed from: e boolean
   public boolean field_boolean_e;
   // $FF: renamed from: f boolean
   private boolean field_boolean_f;
   // $FF: renamed from: a java.lang.Object
   public static Object field_class_java_lang_Object_a = new Object();
   // $FF: renamed from: a bs
   public static class_bs field_class_bs_a;

   // $FF: renamed from: a (javax.microedition.lcdui.Display) void
   public static final void func_void_a(Display var0) {
      field_class_bs_a = new class_bs(var0);
   }

   private class_bs(Display var1) {
      this.field_int_a = class_bw.field_int_a;
      this.field_boolean_a = !class_x.field_boolean_a;
      this.field_boolean_b = false;
      this.field_boolean_c = false;
      this.field_boolean_d = true;
      this.field_byte_a = 2;
      this.field_byte_b = 0;
      this.field_int_b = 0;
      this.field_boolean_f = true;
      this.field_class_javax_microedition_lcdui_Display_a = var1;
      this.field_int_c = field_array_int_a[this.field_byte_a];
      this.func_void_f();
      this.field_byte_b = (byte)(this.field_byte_b | 8);
   }

   public final void run() {
      if (this.field_boolean_f) {
         this.field_boolean_f = false;
         this.field_class_r_a = new class_bg();
         this.field_class_javax_microedition_lcdui_Display_a.setCurrent(this.field_class_r_a);
         ((class_bg)this.field_class_r_a).func_void_a();
         class_bw.func_void_g();
         this.func_void_g();
      }

      synchronized(field_class_java_lang_Object_a) {
         if (!this.field_boolean_e) {
            this.func_void_a();
            this.field_class_r_a.func_void_i();
            this.field_class_r_a.func_void_j();
            this.field_class_javax_microedition_lcdui_Display_a.callSerially(this);
         }
      }
   }

   // $FF: renamed from: a () void
   public final void func_void_a() {
      this.field_long_a = System.currentTimeMillis();
   }

   // $FF: renamed from: b () void
   public final void func_void_b() {
      if (!class_ah.field_boolean_a) {
         this.func_void_a(this.field_long_a, (long)this.field_int_d);
      }

   }

   // $FF: renamed from: a (long, long) void
   public final void func_void_a(long var1, long var3) {
      long var5;
      if ((var5 = System.currentTimeMillis() - var1) < var3) {
         try {
            Thread.sleep(var3 - var5);
         } catch (InterruptedException var8) {
         }
      } else {
         Thread.yield();
      }
   }

   // $FF: renamed from: c () void
   public final void func_void_c() {
      this.field_boolean_f = true;
      (new Thread(this)).start();
   }

   // $FF: renamed from: d () void
   public final void func_void_d() {
      this.field_class_r_a = new class_as();
      field_class_as_a = (class_as)this.field_class_r_a;
      this.field_class_javax_microedition_lcdui_Display_a.setCurrent(this.field_class_r_a);
      class_n.func_void_p();
   }

   // $FF: renamed from: e () void
   public final void func_void_e() {
      this.field_class_r_a = new class_bg();
      field_class_as_a = null;
      ((class_bg)this.field_class_r_a).func_void_a(false, (byte)2);
      this.field_class_javax_microedition_lcdui_Display_a.setCurrent(this.field_class_r_a);
      field_class_bs_a.func_void_g();
   }

   // $FF: renamed from: a (int) void
   public final void func_void_a(int var1) {
      this.field_int_d = 1000 / var1;
   }

   // $FF: renamed from: f () void
   public final void func_void_f() {
      this.func_void_a(this.field_int_c);
   }

   // $FF: renamed from: g () void
   public final void func_void_g() {
      this.func_void_a((int)5);
   }

   // $FF: renamed from: h () void
   public final void func_void_h() {
      this.func_void_a((int)20);
   }

   // $FF: renamed from: a (byte) void
   public final void func_void_a(byte var1) {
      this.field_byte_a = var1;
      this.field_int_c = field_array_int_a[var1];
   }

   // $FF: renamed from: a () byte[]
   public final byte[] func_array_byte_a() {
      boolean var1 = false;
      int var3 = 0 | (this.field_int_a & 15) << 4;
      if (class_x.field_boolean_a && this.field_boolean_a) {
         var3 |= 8;
      }

      if (this.field_boolean_b) {
         var3 |= 4;
      }

      if (this.field_boolean_c) {
         var3 |= 2;
      }

      if (this.field_boolean_d) {
         var3 |= 1;
      }

      byte[] var2;
      (var2 = new byte[6])[0] = (byte)var3;
      var2[1] = (byte)((this.field_byte_a & 15) << 4 | this.field_byte_b);
      class_h.func_void_a(this.field_int_b ^ -504331042, var2, 2);
      return var2;
   }

   // $FF: renamed from: a (byte[]) void
   public final void func_void_a(byte[] var1) {
      this.field_int_a = (byte)((var1[0] & 240) >> 4);
      if (class_x.field_boolean_a) {
         this.field_boolean_a = (var1[0] & 8) != 0;
      }

      this.field_boolean_b = (var1[0] & 4) != 0;
      this.field_boolean_c = (var1[0] & 2) != 0;
      this.field_boolean_d = (var1[0] & 1) != 0;
      this.field_byte_a = (byte)((var1[1] & 240) >> 4);
      this.field_byte_b = (byte)(var1[1] & 15);
      class_bw.func_void_a(this.field_int_a);
      this.func_void_a(this.field_byte_a);
      this.field_int_b = class_h.func_int_a(var1, 2) ^ -504331042;
   }

   // $FF: renamed from: i () void
   public final void func_void_i() throws Exception {
      byte[] var1 = this.func_array_byte_a();
      class_au var2;
      (var2 = new class_au("/c", 0)).func_void_a(var1, 0, var1.length);
      var2.func_void_a();
   }

   // $FF: renamed from: j () void
   public final void func_void_j() throws Exception {
      byte[] var1 = new byte[6];
      class_au var2;
      (var2 = new class_au("/c", 1)).func_void_b(var1, 0, var1.length);
      var2.func_void_a();
      this.func_void_a(var1);
   }
}
