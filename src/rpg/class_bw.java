package rpg;

// $FF: renamed from: bw
public final class class_bw {
   // $FF: renamed from: a int
   public static int field_int_a = 10;
   // $FF: renamed from: b int
   private static int field_int_b = 0;
   // $FF: renamed from: a ci
   private static class_ci field_class_ci_a;
   // $FF: renamed from: b ci
   private static class_ci field_class_ci_b;
   // $FF: renamed from: c ci
   private static class_ci field_class_ci_c;
   // $FF: renamed from: a ci[]
   private static class_ci[] field_array_class_ci_a = new class_ci[32];
   // $FF: renamed from: a java.lang.String[]
   private static final String[] field_array_class_java_lang_String_a = new String[]{"00.mid", "01.mid", "02.mid", "03.mid", "04.mid", "05.mid", "06.mid", "07.mid", "08.wav", "def.mid", "def.mid", "def.mid", "12.mid", "13.wav", "14.wav", "15.wav", "16.wav", "17.wav", "18.wav", "def.mid", "20.wav", "21.wav", "22.mid", "23.mid", "24.mid", "25.mid", "26.mid", "27.mid", "28.mid", "29.mid", "30.mid", "31.mid"};

   // $FF: renamed from: a () void
   public static final void func_void_a() {
      if (field_class_ci_a != null) {
         field_class_ci_a.func_void_b();
      } else {
         if (field_class_ci_b != null) {
            field_class_ci_b.func_void_b();
         }

      }
   }

   // $FF: renamed from: b () void
   public static final void func_void_b() {
      if (field_class_ci_a != null) {
         field_class_ci_a.func_void_a();
      } else {
         if (field_class_ci_b != null) {
            field_class_ci_b.func_void_a();
         }

      }
   }

   // $FF: renamed from: c () void
   public static final void func_void_c() {
      if (field_class_ci_b != null) {
         field_class_ci_b.func_void_b();
      }

   }

   // $FF: renamed from: d () void
   public static final void func_void_d() {
      if (field_class_ci_c != null) {
         field_class_ci_c.func_void_b();
      }

   }

   // $FF: renamed from: e () void
   public static final void func_void_e() {
      if (field_class_ci_a != null) {
         field_class_ci_a.func_void_b();
      }

   }

   // $FF: renamed from: f () void
   public static final void func_void_f() {
      if (field_class_ci_a != null) {
         field_class_ci_a.func_void_c();
         field_class_ci_a = null;
      }

      if (field_class_ci_b != null) {
         field_class_ci_b.func_void_c();
         field_class_ci_b = null;
      }

   }

   // $FF: renamed from: a (byte, boolean) void
   public static final void func_void_a(byte var0, boolean var1) {
      if (field_array_class_ci_a[var0] != null) {
         field_class_ci_c = field_array_class_ci_a[var0];
         field_class_ci_c.func_void_b(field_int_b);
         field_class_ci_c.func_void_a();
      }

   }

   // $FF: renamed from: a (int) void
   public static final void func_void_a(int var0) {
      if (var0 <= 0) {
         var0 = 0;
      } else if (var0 > field_int_a) {
         var0 = field_int_a;
      }

      if (field_int_b == 0 && var0 != 0) {
         func_void_b();
      }

      field_int_b = var0 * 10;
      if (field_int_b == 0) {
         func_void_a();
      }

      for(int var1 = 0; var1 < field_array_class_ci_a.length; ++var1) {
         if (field_array_class_ci_a[var1] != null) {
            field_array_class_ci_a[var1].func_void_b(field_int_b);
         }
      }

   }

   // $FF: renamed from: g () void
   public static final void func_void_g() {
      System.out.println("readySound");

      try {
         class_bs.field_class_bs_a.func_void_j();
      } catch (Exception var1) {
         var1.printStackTrace();
      }

      func_void_a(class_bs.field_class_bs_a.field_int_a);
   }

   // $FF: renamed from: a (byte) void
   public static final void func_void_a(byte var0) {
      if (field_array_class_ci_a[var0] == null) {
         String var1 = "resource:/snd/" + field_array_class_java_lang_String_a[var0];
         field_array_class_ci_a[var0] = new class_ci(var1);
         field_array_class_ci_a[var0].func_void_b(field_int_b);
      }

   }

   // $FF: renamed from: b (byte) void
   public static final void func_void_b(byte var0) {
      if (field_array_class_ci_a[var0] != null) {
         field_array_class_ci_a[var0].func_void_c();
         field_array_class_ci_a[var0] = null;
      }

   }

   // $FF: renamed from: b (int) void
   public static final void func_void_b(int var0) {
      field_class_ci_a = field_array_class_ci_a[var0];
      if (field_class_ci_a != null && !field_class_ci_a.func_boolean_a()) {
         field_class_ci_a.func_void_b(field_int_b);
         field_class_ci_a.func_void_a(-1);
         field_class_ci_a.func_void_a();
      }

   }

   // $FF: renamed from: c (int) void
   public static final void func_void_c(int var0) {
      field_class_ci_b = field_array_class_ci_a[var0];
      if (field_class_ci_b != null && !field_class_ci_b.func_boolean_a()) {
         field_class_ci_b.func_void_b(field_int_b);
         field_class_ci_b.func_void_a(-1);
         field_class_ci_b.func_void_a();
      }

   }
}
