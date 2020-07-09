package rpg;

import java.io.IOException;
import java.util.Vector;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;
import main.GameMIDlet;

// $FF: renamed from: bh
public final class class_bh {
   // $FF: renamed from: a java.lang.String
   public static String field_class_java_lang_String_a;
   // $FF: renamed from: b java.lang.String
   public static String field_class_java_lang_String_b;
   // $FF: renamed from: a char[]
   public static char[] field_array_char_a;
   // $FF: renamed from: b char[]
   public static char[] field_array_char_b;
   // $FF: renamed from: c char[]
   public static char[] field_array_char_c;
   // $FF: renamed from: d char[]
   public static char[] field_array_char_d;
   // $FF: renamed from: e char[]
   public static char[] field_array_char_e;
   // $FF: renamed from: f char[]
   public static char[] field_array_char_f;
   // $FF: renamed from: g char[]
   public static char[] field_array_char_g;
   // $FF: renamed from: h char[]
   public static char[] field_array_char_h;
   // $FF: renamed from: i char[]
   public static char[] field_array_char_i;
   // $FF: renamed from: j char[]
   public static char[] field_array_char_j;
   // $FF: renamed from: k char[]
   public static char[] field_array_char_k;
   // $FF: renamed from: l char[]
   public static char[] field_array_char_l;
   // $FF: renamed from: a char[][]
   public static char[][] field_array_array_char_a = new char[7][];
   // $FF: renamed from: m char[]
   public static char[] field_array_char_m = "               ".toCharArray();
   // $FF: renamed from: n char[]
   public static char[] field_array_char_n = null;
   // $FF: renamed from: o char[]
   public static char[] field_array_char_o = null;
   // $FF: renamed from: p char[]
   public static char[] field_array_char_p = null;
   // $FF: renamed from: c java.lang.String
   public static String field_class_java_lang_String_c = null;
   // $FF: renamed from: q char[]
   public static char[] field_array_char_q = null;
   // $FF: renamed from: r char[]
   public static char[] field_array_char_r = null;
   // $FF: renamed from: s char[]
   public static char[] field_array_char_s;
   // $FF: renamed from: t char[]
   public static char[] field_array_char_t = null;
   // $FF: renamed from: d java.lang.String
   public static String field_class_java_lang_String_d = null;
   // $FF: renamed from: a boolean
   public static boolean field_boolean_a = false;
   // $FF: renamed from: g b
   private static class_b field_class_b_g;
   // $FF: renamed from: a b
   public static class_b field_class_b_a;
   // $FF: renamed from: b b
   public static class_b field_class_b_b;
   // $FF: renamed from: c b
   public static class_b field_class_b_c;
   // $FF: renamed from: d b
   public static class_b field_class_b_d;
   // $FF: renamed from: e b
   public static class_b field_class_b_e;
   // $FF: renamed from: f b
   public static class_b field_class_b_f;
   // $FF: renamed from: a java.util.Vector
   public static Vector field_class_java_util_Vector_a = new Vector();
   // $FF: renamed from: e java.lang.String
   public static String field_class_java_lang_String_e = "";

   // $FF: renamed from: a (javax.microedition.lcdui.Graphics, char[], char[]) void
   public static final void func_void_a(Graphics var0, char[] var1, char[] var2) {
      var0.setClip(0, 0, class_r.field_int_g, class_r.field_int_h);
      int var3 = func_int_a() + 5;
      int var5;
      int var7;
      if (var1 != null) {
         var5 = func_int_a(var1) + 2;
         boolean var6 = false;
         var7 = class_r.field_int_h - var3 + 3;
         var0.setColor(0);
         var0.fillRect(0, var7, var5, var3);
         var0.setColor(16777215);
         func_int_a(var0, 1, var7 + 1, var1, 1);
      }

      if (var2 != null) {
         var5 = func_int_a(var2) + 2;
         int var8 = class_r.field_int_g - var5;
         var7 = class_r.field_int_h - var3 + 3;
         var0.setColor(0);
         var0.fillRect(var8, var7, var5, var3);
         var0.setColor(16777215);
         func_int_a(var0, var8 + 1, var7 + 1, var2, 1);
      }

   }

   // $FF: renamed from: a (javax.microedition.lcdui.Graphics) void
   public static final void func_void_a(Graphics var0) {
      var0.setClip(0, 0, class_r.field_int_g, class_r.field_int_h);
      var0.setColor(0);
      var0.fillRect(0, 0, class_r.field_int_g, class_r.field_int_h);
   }

   // $FF: renamed from: a (java.lang.String) void
   public static final void func_void_a(String var0) {
      try {
         GameMIDlet.field_class_rpg_GameMIDlet_a.platformRequest(class_w.field_class_java_lang_String_a);
      } catch (Exception var2) {
         var2.printStackTrace();
      }

      GameMIDlet.field_class_rpg_GameMIDlet_a.func_void_a();
   }

   // $FF: renamed from: a (javax.microedition.lcdui.Graphics, int, int, int) void
   public static final void func_void_a(Graphics var0, int var1, int var2, int var3) {
      var2 = class_r.field_int_g >> 1;
      func_void_a(true);
      int var4 = var1 >> 1;
      if (var1 % 2 == 0) {
         var0.setColor(16777215);
      } else {
         var0.setColor(0);
      }

      func_void_a(var0, var2, var3 + 4, field_array_array_char_a[var4], 1);
      func_void_a(false);
   }

   // $FF: renamed from: a (boolean) void
   public static final void func_void_a(boolean var0) {
      field_boolean_a = var0;
      if (field_boolean_a) {
         field_class_b_g = field_class_b_d;
      } else {
         field_class_b_g = field_class_b_a;
      }
   }

   // $FF: renamed from: a (int, int) int
   public static final int func_int_a(int var0, int var1) {
      return var0 * var1 / 100;
   }

   // $FF: renamed from: a (cj) void
   public static final void func_void_a(class_cj var0) {
      field_class_java_lang_String_a = func_class_java_lang_String_a(3902) + " ";
      field_class_java_lang_String_b = func_class_java_lang_String_a(3903);
      field_array_char_a = func_class_java_lang_String_a(3904).toCharArray();
      field_array_char_b = func_class_java_lang_String_a(3906).toCharArray();
      field_array_char_c = func_class_java_lang_String_a(3907).toCharArray();
      field_array_char_d = func_class_java_lang_String_a(3908).toCharArray();
      field_array_char_e = func_class_java_lang_String_a(3909).toCharArray();
      field_array_char_f = func_class_java_lang_String_a(3910).toCharArray();
      field_array_char_g = func_class_java_lang_String_a(3911).toCharArray();
      field_array_char_h = func_class_java_lang_String_a(3912).toCharArray();
      field_array_char_i = func_class_java_lang_String_a(3913).toCharArray();
      field_array_char_j = func_class_java_lang_String_a(3914).toCharArray();
      field_array_char_k = func_class_java_lang_String_a(3915).toCharArray();
      field_array_char_l = func_class_java_lang_String_a(3916).toCharArray();
      field_array_array_char_a[0] = func_class_java_lang_String_a(3920).toCharArray();
      field_array_array_char_a[1] = func_class_java_lang_String_a(3921).toCharArray();
      field_array_array_char_a[2] = func_class_java_lang_String_a(3922).toCharArray();
      field_array_array_char_a[3] = func_class_java_lang_String_a(3923).toCharArray();
      field_array_array_char_a[4] = func_class_java_lang_String_a(3924).toCharArray();
      field_array_array_char_a[5] = func_class_java_lang_String_a(3924).toCharArray();
      field_array_array_char_a[6] = func_class_java_lang_String_a(3926).toCharArray();
      field_array_char_s = func_class_java_lang_String_a(3932).toCharArray();
      field_array_char_n = func_class_java_lang_String_a(3946).toCharArray();
      field_array_char_t = func_class_java_lang_String_a(3947).toCharArray();
      field_class_java_lang_String_d = func_class_java_lang_String_a(3948);
      field_class_java_lang_String_c = func_class_java_lang_String_a(3949);
      field_array_char_q = func_class_java_lang_String_a(3950).toCharArray();
   }

   // $FF: renamed from: a (int) java.lang.String
   public static final String func_class_java_lang_String_a(int var0) {
      return class_cj.field_class_cj_a.func_class_java_lang_String_a(var0).replace(';', '\n');
   }

   // $FF: renamed from: a (java.lang.String) char[]
   public static final char[] func_array_char_a(String var0) {
      try {
         return class_cj.field_class_cj_a.func_class_java_lang_String_a(Integer.parseInt(var0.trim())).replace(';', '\n').toCharArray();
      } catch (Exception var2) {
         return ("2." + var2.toString()).toCharArray();
      }
   }

   // $FF: renamed from: a () void
   public static final void func_void_a() {
      field_class_b_a = (class_b)class_b.func_class_az_a("fonts/small", 0, false);
      field_class_b_b = (class_b)class_b.func_class_az_a("fonts/small", 16777215, false);
      field_class_b_c = (class_b)class_b.func_class_az_a("fonts/small", 16746496, false);
      field_class_b_d = (class_b)class_b.func_class_az_a("fonts/big", 0, 16777215, true);
      field_class_b_e = (class_b)class_b.func_class_az_a("fonts/big", 16777215, 0, true);
      field_class_b_f = field_class_b_d;
      field_class_b_a.field_boolean_b = true;
      field_class_b_b.field_boolean_b = true;
      field_class_b_c.field_boolean_b = true;
      field_class_b_d.field_boolean_b = true;
      field_class_b_e.field_boolean_b = true;
      field_class_b_f.field_boolean_b = true;
      field_class_b_g = field_class_b_a;
   }

   // $FF: renamed from: a () int
   public static final int func_int_a() {
      return field_class_b_g.field_int_a;
   }

   // $FF: renamed from: a (char[]) int
   public static final int func_int_a(char[] var0) {
      return field_class_b_g.func_int_a(func_class_java_lang_String_a(var0));
   }

   // $FF: renamed from: a (char) boolean
   private static final boolean func_boolean_a(char var0) {
      return var0 == ';';
   }

   // $FF: renamed from: a (char[], int, int) int
   public static final int func_int_a(char[] var0, int var1, int var2) {
      int var3 = var1 + var2;
      boolean var4 = false;

      while(var3 < var0.length) {
         if (func_boolean_a(var0[var3])) {
            ++var3;
         } else {
            if (var4) {
               return var3 + 1 - var1;
            }

            var4 = true;
            ++var3;
         }
      }

      return var0.length - var1;
   }

   // $FF: renamed from: a (char[], int, int, int) int
   public static final int func_int_a(char[] var0, int var1, int var2, int var3) {
      String var4 = new String(var0, var1, var0.length - var1);
      return field_class_b_g.func_int_a(var4, var2, var3);
   }

   // $FF: renamed from: a (char[], int) int
   public static final int func_int_a(char[] var0, int var1) {
      return func_class_java_util_Vector_a(func_class_java_lang_String_a(var0), var1).size();
   }

   // $FF: renamed from: a (int, int, char[], int, int, int) int
   public static final int func_int_a(int var0, int var1, char[] var2, int var3, int var4, int var5) {
      return func_int_a((String)(new String(var2)), 0, 0, var0);
   }

   // $FF: renamed from: b () int
   private static int func_int_b() {
      return field_class_b_g.field_int_b;
   }

   // $FF: renamed from: a (java.lang.String, int, int, int) int
   private static int func_int_a(String var0, int var1, int var2, int var3) {
      return field_class_b_g.func_int_a(func_class_java_util_Vector_a(var0, var3)) - func_int_b();
   }

   // $FF: renamed from: a (java.lang.String, int) java.util.Vector
   private static Vector func_class_java_util_Vector_a(String var0, int var1) {
      if (!var0.equals(field_class_java_lang_String_e)) {
         field_class_java_util_Vector_a.setSize(0);
         field_class_b_g.func_class_java_util_Vector_a(field_class_java_util_Vector_a, var0, var1);
      }

      return field_class_java_util_Vector_a;
   }

   // $FF: renamed from: a (javax.microedition.lcdui.Graphics, int, int, char[], int) int
   public static final int func_int_a(Graphics var0, int var1, int var2, char[] var3, int var4) {
      return func_class_az_a(var0.getColor()).func_int_a(var0, (char[])var3, var1, var2, 20);
   }

   // $FF: renamed from: a (int) az
   private static class_az func_class_az_a(int var0) {
      if (field_boolean_a) {
         if (var0 == 0) {
            return field_class_b_d;
         } else {
            return var0 == 16777215 ? field_class_b_e : field_class_b_f;
         }
      } else if (var0 == 0) {
         return field_class_b_a;
      } else {
         return var0 == 16777215 ? field_class_b_b : field_class_b_c;
      }
   }

   // $FF: renamed from: a (javax.microedition.lcdui.Graphics, int, int, char[], int) void
   public static final void func_void_a(Graphics var0, int var1, int var2, char[] var3, int var4) {
      func_class_az_a(var0.getColor()).func_int_a(var0, (char[])var3, var1, var2, 17);
   }

   // $FF: renamed from: a (javax.microedition.lcdui.Graphics, int, int, int, int, char[], int, int, int) void
   public static final void func_void_a(Graphics var0, int var1, int var2, int var3, int var4, char[] var5, int var6, int var7, int var8) {
      var0.setClip(0, 0, class_r.field_int_g, class_r.field_int_h);
      class_az var9 = func_class_az_a(var0.getColor());
      if (var6 + var8 > var5.length) {
         var8 = var5.length - var6;
      }

      String var10 = new String(var5, var6, var8);
      var9.func_int_a(var0, func_class_java_util_Vector_a(var10, var3), var1, var2, class_r.field_int_h, 20);
   }

   // $FF: renamed from: b (javax.microedition.lcdui.Graphics, int, int, int, int, char[], int, int, int) void
   public static final void func_void_b(Graphics var0, int var1, int var2, int var3, int var4, char[] var5, int var6, int var7, int var8) {
      var0.setClip(0, 0, class_r.field_int_g, class_r.field_int_h);
      class_az var9 = func_class_az_a(var0.getColor());
      if (var6 + var8 > var5.length) {
         var8 = var5.length - var6;
      }

      String var10 = new String(var5, var6, var8);
      var9.func_int_a(var0, func_class_java_util_Vector_a(var10, var3), var1, var2, class_r.field_int_h, 17);
   }

   // $FF: renamed from: c (javax.microedition.lcdui.Graphics, int, int, int, int, char[], int, int, int) void
   public static final void func_void_c(Graphics var0, int var1, int var2, int var3, int var4, char[] var5, int var6, int var7, int var8) {
      var0.setClip(0, 0, class_r.field_int_g, class_r.field_int_h);
      class_az var9 = func_class_az_a(var0.getColor());
      Vector var10;
      int var11 = Math.min((var10 = func_class_java_util_Vector_a(new String(var5, var6, var5.length - var6), var3)).size(), 3);

      for(int var12 = 0; var12 < var11; ++var12) {
         String var13 = (String)var10.elementAt(var12);
         if (var8 <= var13.length()) {
            var9.func_int_a(var0, (String)var13, 0, var8, var1, var2, 20);
            return;
         }

         var9.func_int_a(var0, (String)var13, var1, var2, 20);
         var8 -= var13.length() + 1;
         var2 += field_class_b_g.field_int_a + 2;
      }

      var0.setColor(16777215);
   }

   // $FF: renamed from: a (javax.microedition.lcdui.Graphics, int, int, int, int, char[], int) int
   public static final int func_int_a(Graphics var0, int var1, int var2, int var3, int var4, char[] var5, int var6) {
      var0.setClip(0, 0, class_r.field_int_g, class_r.field_int_h);
      class_az var7 = func_class_az_a(var0.getColor());
      String var8 = func_class_java_lang_String_a(var5);
      return var7.func_int_a(var0, func_class_java_util_Vector_a(var8, var3), var1, var2, class_r.field_int_h, var6);
   }

   // $FF: renamed from: a (javax.microedition.lcdui.Graphics, int, int, int, int, char[]) int
   public static final int func_int_a(Graphics var0, int var1, int var2, int var3, int var4, char[] var5) {
      return func_int_a(var0, var1, var2, var3, var4, var5, 20);
   }

   // $FF: renamed from: a (char[]) java.lang.String
   public static final String func_class_java_lang_String_a(char[] var0) {
      return new String(var0);
   }

   // $FF: renamed from: a (java.lang.String, java.lang.String, java.lang.String) java.lang.String
   public static final String func_class_java_lang_String_a(String var0, String var1, String var2) {
      int var3;
      while((var3 = var0.indexOf(var1)) >= 0) {
         String var4 = var0.substring(0, var3);
         String var5 = var0.substring(var3 + var1.length());
         var0 = var4 + var2 + var5;
      }

      return var0;
   }

   // $FF: renamed from: a (java.lang.String) javax.microedition.lcdui.Image
   public static final Image func_class_javax_microedition_lcdui_Image_a(String var0) throws IOException {
      return Image.createImage("/" + class_cj.field_class_cj_a.field_array_class_java_lang_String_a[class_cj.field_class_cj_a.field_byte_a] + "/" + var0);
   }
}
