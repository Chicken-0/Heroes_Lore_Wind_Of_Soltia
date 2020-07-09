package rpg;

import javax.microedition.midlet.MIDlet;
import main.GameMIDlet;

// $FF: renamed from: w
public final class class_w {
   // $FF: renamed from: a javax.microedition.midlet.MIDlet
   public static MIDlet field_class_javax_microedition_midlet_MIDlet_a;
   // $FF: renamed from: a java.lang.String[]
   public static String[] field_array_class_java_lang_String_a;
   // $FF: renamed from: a java.lang.String
   public static String field_class_java_lang_String_a;
   // $FF: renamed from: a boolean
   public static boolean field_boolean_a;
   // $FF: renamed from: b boolean
   public static boolean field_boolean_b;
   // $FF: renamed from: c boolean
   public static boolean field_boolean_c;
   // $FF: renamed from: a boolean[]
   public static boolean[] field_array_boolean_a;

   // $FF: renamed from: a (javax.microedition.midlet.MIDlet) void
   public static final void func_void_a(MIDlet var0) {
      field_class_javax_microedition_midlet_MIDlet_a = var0;
      field_boolean_c = func_boolean_c();
      class_x.field_boolean_a = field_boolean_c;
   }

   // $FF: renamed from: a () void
   public static final void func_void_a() {
      if (func_boolean_a(true)) {
         field_boolean_a = true;
      }

      if (func_boolean_a(false)) {
         field_boolean_b = true;
      }

      if (field_boolean_a) {
         class_bh.field_array_array_char_a[5] = func_class_java_lang_String_a().toCharArray();
      } else {
         class_bh.field_array_array_char_a[5] = class_bh.field_array_array_char_a[6];
      }

      field_class_java_lang_String_a = func_class_java_lang_String_b();

      try {
         String var0;
         if ((var0 = GameMIDlet.field_class_rpg_GameMIDlet_a.getAppProperty("MIDlet-Version")) != null) {
            if (field_boolean_c) {
               var0 = var0 + " " + class_bh.func_class_java_lang_String_a(3917);
            }

            class_bh.field_array_char_r = var0.toCharArray();
         }

      } catch (Exception var1) {
      }
   }

   // $FF: renamed from: c () boolean
   private static boolean func_boolean_c() {
      String var0 = field_class_javax_microedition_midlet_MIDlet_a.getAppProperty("HO-Demo");
      boolean var1 = true;
      if (var0 != null && var0.trim().equals("BEJ8K52N7A")) {
         var1 = false;
      }

      return var1;
   }

   // $FF: renamed from: a () boolean
   public static final boolean func_boolean_a() {
      return field_boolean_c && field_boolean_a && field_class_java_lang_String_a != null;
   }

   // $FF: renamed from: b () boolean
   public static final boolean func_boolean_b() {
      return !field_boolean_c && field_boolean_a && field_class_java_lang_String_a != null;
   }

   // $FF: renamed from: a () int
   public static final int func_int_a() {
      int var0;
      field_array_boolean_a = new boolean[var0 = field_array_class_java_lang_String_a.length];
      int var1 = 0;
      int var2 = -1;
      String var3;
      int var4;
      if ((var3 = field_class_javax_microedition_midlet_MIDlet_a.getAppProperty("HO-LangList")) != null) {
         for(var4 = 0; var4 < var0; ++var4) {
            if (var3.indexOf(field_array_class_java_lang_String_a[var4]) >= 0) {
               System.out.println(field_array_class_java_lang_String_a[var4]);
               field_array_boolean_a[var4] = true;
               var2 = var4;
               ++var1;
            }
         }
      }

      if (var1 == 1) {
         return var2;
      } else {
         if (var1 == 0) {
            for(var4 = 0; var4 < var0; ++var4) {
               field_array_boolean_a[var4] = true;
            }
         }

         return -1;
      }
   }

   // $FF: renamed from: a () java.lang.String
   public static final String func_class_java_lang_String_a() {
      String var0 = "HO-Label-" + field_array_class_java_lang_String_a[class_cj.field_class_cj_a.field_byte_a];
      String var1;
      if ((var1 = field_class_javax_microedition_midlet_MIDlet_a.getAppProperty(var0)) != null && var1.length() != 0) {
         int var3;
         if (var1.indexOf("\\u") < 0) {
            var3 = var1.length();
            return var1.substring(0, var3 < 16 ? var3 : 16);
         } else {
            StringBuffer var2 = new StringBuffer(var1);
            var3 = 0;
            char[] var4 = new char[4];

            do {
               if (var2.charAt(var3++) == '\\' && var2.charAt(var3) == 'u') {
                  var2.getChars(var3 + 1, var3 + 5, var4, 0);
                  var2.setCharAt(var3 - 1, (char)Integer.parseInt(class_bh.func_class_java_lang_String_a(var4), 16));
                  var2.delete(var3, var3 + 5);
               }
            } while(var3 < var2.length());

            String var5;
            int var6 = (var5 = var2.toString()).length();
            return var5.substring(0, var6 < 16 ? var6 : 16);
         }
      } else {
         return field_boolean_c ? class_cj.field_class_cj_a.func_class_java_lang_String_a(3931) : class_cj.field_class_cj_a.func_class_java_lang_String_a(3925);
      }
   }

   // $FF: renamed from: b () java.lang.String
   private static String func_class_java_lang_String_b() {
      String var0 = "HO-URL-" + field_array_class_java_lang_String_a[class_cj.field_class_cj_a.field_byte_a];
      String var1;
      return (var1 = field_class_javax_microedition_midlet_MIDlet_a.getAppProperty(var0)) != null && var1.length() != 0 ? var1 : null;
   }

   // $FF: renamed from: a (boolean) boolean
   private static boolean func_boolean_a(boolean var0) {
      String var1 = field_class_javax_microedition_midlet_MIDlet_a.getAppProperty("HO-BuySetup");
      String var2 = "HO-URL-" + field_array_class_java_lang_String_a[class_cj.field_class_cj_a.field_byte_a];
      String var3 = field_class_javax_microedition_midlet_MIDlet_a.getAppProperty(var2);
      if (var1 != null && var1.length() != 0) {
         if (var3 != null && var3.length() != 0) {
            if (var0) {
               return var1.indexOf("menu") > -1;
            } else {
               return var1.indexOf("exit") > -1;
            }
         } else {
            return false;
         }
      } else {
         return false;
      }
   }

   static {
      field_array_class_java_lang_String_a = class_cj.field_class_cj_a.field_array_class_java_lang_String_a;
   }
}
