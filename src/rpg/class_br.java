package rpg;

import java.io.IOException;
import javax.microedition.lcdui.Image;

// $FF: renamed from: br
public final class class_br {
   // $FF: renamed from: a java.lang.String[]
   private static final String[] field_array_class_java_lang_String_a = new String[]{"IHDR", "cHRM", "gAMA", "iCCP", "sBIT", "sRGB", "tEXt", "zTXt", "iTXt", "pHYs", "sPLT", "tIME", "PLTE", "tRNS", "hIST", "bKGD", "IDAT", "IEND"};
   // $FF: renamed from: a byte[]
   private static final byte[] field_array_byte_a = new byte[]{-119, 80, 78, 71, 13, 10, 26, 10};
   // $FF: renamed from: b byte[]
   private static final byte[] field_array_byte_b = new byte[]{0, 0, 0, 0, 73, 69, 78, 68, -82, 66, 96, -126};
   // $FF: renamed from: a java.lang.String
   private String field_class_java_lang_String_a;
   // $FF: renamed from: b boolean
   private boolean field_boolean_b;
   // $FF: renamed from: c boolean
   private boolean field_boolean_c;
   // $FF: renamed from: a int
   private int field_int_a;
   // $FF: renamed from: a int[]
   private int[] field_array_int_a;
   // $FF: renamed from: c byte[]
   private byte[] field_array_byte_c;
   // $FF: renamed from: a java.lang.Object[]
   private Object[] field_array_class_java_lang_Object_a;
   // $FF: renamed from: a char[]
   private char[] field_array_char_a;
   // $FF: renamed from: b int
   private int field_int_b;
   // $FF: renamed from: c int
   private int field_int_c;
   // $FF: renamed from: a boolean
   public boolean field_boolean_a = false;
   // $FF: renamed from: a ca
   private static class_ca field_class_ca_a = new class_ca();
   // $FF: renamed from: a an
   private static class_an field_class_an_a = new class_an();

   public class_br() {
   }

   public class_br(String var1) throws IOException {
      this.func_void_a(var1);
   }

   // $FF: renamed from: a (java.lang.String) void
   public final void func_void_a(String var1) throws IOException {
      this.field_array_int_a = null;
      this.field_array_byte_c = null;
      this.field_array_class_java_lang_Object_a = null;
      this.field_array_char_a = null;
      this.field_class_java_lang_String_a = var1;
      this.func_void_b();
   }

   // $FF: renamed from: b () void
   private void func_void_b() throws IOException {
      this.field_array_byte_c = class_ce.func_array_byte_a(this.field_class_java_lang_String_a + ".mph");
      this.func_void_c();
   }

   // $FF: renamed from: a (int) void
   public final void func_void_a(int var1) throws IOException {
      this.field_array_class_java_lang_Object_a[var1] = class_ce.func_array_byte_a(this.field_class_java_lang_String_a + "_" + var1 + ".mpd");
   }

   // $FF: renamed from: b (int) void
   public final void func_void_b(int var1) {
      this.field_array_class_java_lang_Object_a[var1] = null;
   }

   // $FF: renamed from: a () void
   public final void func_void_a() {
      for(int var1 = 0; var1 < this.field_int_a; ++var1) {
         this.func_void_b(var1);
      }

      System.gc();
   }

   // $FF: renamed from: c () void
   private void func_void_c() {
      int var1 = func_int_a(this.field_array_byte_c, 0);
      this.field_boolean_b = (var1 >> 27) % 2 == 1;
      this.field_boolean_c = (var1 >> 26) % 2 == 1;
      int var2 = this.func_int_a();
      this.field_int_a = 0;

      int var3;
      for(var3 = 0; var3 < var2; ++var3) {
         if (this.field_int_a < func_char_a(this.field_array_byte_c, 8 + 8 * var3) + 1) {
            this.field_int_a = func_char_a(this.field_array_byte_c, 8 + 8 * var3) + 1;
         }
      }

      this.field_array_int_a = new int[this.field_int_a];

      for(var3 = 0; var3 < var2; ++var3) {
         int var10002 = this.field_array_int_a[func_char_a(this.field_array_byte_c, 8 + 8 * var3)]++;
      }

      this.field_array_class_java_lang_Object_a = new Object[this.field_int_a];
      this.field_array_char_a = new char[var2];

      for(var3 = 0; var3 < var2; ++var3) {
         this.field_array_char_a[var3] = func_char_a(this.field_array_byte_c, 8 + 8 * var3 + 6);
      }

      this.field_int_b = func_int_b(this.field_array_byte_c, 12);
      this.field_int_c = func_int_b(this.field_array_byte_c, 13);
   }

   // $FF: renamed from: a () int
   public final int func_int_a() {
      return func_int_a(this.field_array_byte_c, 4);
   }

   // $FF: renamed from: a (int) javax.microedition.lcdui.Image
   public final Image func_class_javax_microedition_lcdui_Image_a(int var1) {
      byte[] var2;
      return Image.createImage(var2 = this.func_array_byte_b(var1), 0, var2.length);
   }

   // $FF: renamed from: a () javax.microedition.lcdui.Image[]
   public final Image[] func_array_class_javax_microedition_lcdui_Image_a() {
      this.field_boolean_a = true;
      int var1;
      Image[] var2 = new Image[var1 = this.func_int_a()];

      for(int var3 = 0; var3 < var1; ++var3) {
         var2[var3] = this.func_class_javax_microedition_lcdui_Image_a(var3);
         class_r.func_void_k();
      }

      this.func_void_a();
      return var2;
   }

   // $FF: renamed from: b (int) javax.microedition.lcdui.Image
   public final Image func_class_javax_microedition_lcdui_Image_b(int var1) {
      if (!this.field_boolean_c) {
         return this.func_class_javax_microedition_lcdui_Image_a(var1);
      } else {
         byte[] var2;
         func_void_a(var2 = this.func_array_byte_b(var1));
         return Image.createImage(var2, 0, var2.length);
      }
   }

   // $FF: renamed from: c (int) javax.microedition.lcdui.Image
   public final Image func_class_javax_microedition_lcdui_Image_c(int var1) {
      byte[] var2;
      func_void_a(var2 = this.func_array_byte_b(var1), 1);
      return Image.createImage(var2, 0, var2.length);
   }

   // $FF: renamed from: a (int, int) void
   public final void func_void_a(int var1, int var2) {
      if (this.field_boolean_b) {
         func_void_b(this.field_array_byte_c, this.field_int_b, 4, var1, var2);
      }
   }

   // $FF: renamed from: a (int) byte[]
   private byte[] func_array_byte_a(int var1) {
      int var2 = this.func_int_a(var1);
      if (this.field_boolean_a && this.field_array_class_java_lang_Object_a[var2] == null) {
         this.func_void_a();

         try {
            this.func_void_a(var2);
         } catch (IOException var4) {
            System.out.println("[PNGMerger ERROR] cannot load mpd '" + this.field_class_java_lang_String_a + "' no." + var2);
            var4.printStackTrace();
         }
      }

      return (byte[])((byte[])this.field_array_class_java_lang_Object_a[var2]);
   }

   // $FF: renamed from: a (int) int
   private int func_int_a(int var1) {
      return func_char_a(this.field_array_byte_c, 8 + 8 * var1);
   }

   // $FF: renamed from: b (int) byte[]
   private byte[] func_array_byte_b(int var1) {
      return this.field_boolean_b ? this.func_array_byte_d(var1) : this.func_array_byte_c(var1);
   }

   // $FF: renamed from: c (int) byte[]
   private byte[] func_array_byte_c(int var1) {
      byte[] var2 = this.func_array_byte_a(var1);
      boolean var4 = false;
      int var5 = func_int_a(this.field_array_byte_c, 8 + var1 * 8 + 2);
      int var6 = this.func_int_b(var1);
      boolean var7 = false;
      int var9 = 8 + var6;
      var9 += 12;
      byte[] var3 = new byte[var9];
      System.arraycopy(field_array_byte_a, 0, var3, 0, 8);
      System.arraycopy(var2, var5, var3, 8, var6);
      int var8 = 8 + var6;
      System.arraycopy(field_array_byte_b, 0, var3, var8, 12);
      return var3;
   }

   // $FF: renamed from: d (int) byte[]
   private byte[] func_array_byte_d(int var1) {
      byte[] var2 = this.func_array_byte_a(var1);
      boolean var4 = false;
      int var7 = func_int_a(this.field_array_byte_c, 8 + var1 * 8 + 2);
      int var8 = this.func_int_b(var1);
      boolean var9 = false;
      int var12 = (var12 = 8 + (this.field_array_byte_c.length - (func_int_a(this.field_array_byte_c, 4) * 8 + 8))) + var8;
      var12 += 12;
      byte[] var3 = new byte[var12];
      System.arraycopy(field_array_byte_a, 0, var3, 0, 8);
      int var5;
      if ((var5 = func_int_a(var2, 0, var7, var8)) == -1) {
         return null;
      } else {
         int var6 = func_int_a(var2, var5) + 12;
         System.arraycopy(var2, var5, var3, 8, var6);
         int var11 = 8 + var6;

         for(int var10 = 0; var10 < 18; ++var10) {
            if (this.func_boolean_a(var1, var10)) {
               switch(var10) {
               case 1:
               case 2:
               case 3:
               case 4:
               case 5:
               case 9:
               case 10:
                  if ((var5 = func_int_a(var2, var10, var7, var8)) != -1) {
                     var6 = func_int_a(var2, var5) + 12;
                     System.arraycopy(var2, var5, var3, var11, var6);
                     var11 += var6;
                  }
               case 6:
               case 7:
               case 8:
               }
            }
         }

         var5 = this.field_int_b;
         var6 = func_int_a(this.field_array_byte_c, var5) + 12;
         System.arraycopy(this.field_array_byte_c, var5, var3, var11, var6);
         var11 += var6;
         if ((var5 = this.field_int_c) != -1) {
            var6 = func_int_a(this.field_array_byte_c, var5) + 12;
            System.arraycopy(this.field_array_byte_c, var5, var3, var11, var6);
            var11 += var6;
         }

         if (this.func_boolean_a(var1, 14) && (var5 = func_int_a(var2, 14, var7, var8)) != -1) {
            var6 = func_int_a(var2, var5) + 12;
            System.arraycopy(var2, var5, var3, var11, var6);
            var11 += var6;
         }

         if (this.func_boolean_a(var1, 15) && (var5 = func_int_a(var2, 15, var7, var8)) != -1) {
            var6 = func_int_a(var2, var5) + 12;
            System.arraycopy(var2, var5, var3, var11, var6);
            var11 += var6;
         }

         var5 = func_int_a(var2, 16, var7, var8);
         var6 = func_int_a(var2, var5) + 12;
         System.arraycopy(var2, var5, var3, var11, var6);
         var11 += var6;
         System.arraycopy(field_array_byte_b, 0, var3, var11, 12);
         return var3;
      }
   }

   // $FF: renamed from: b (int) int
   private int func_int_b(int var1) {
      byte[] var2 = this.func_array_byte_a(var1);
      boolean var3 = false;
      boolean var4 = false;
      int var5 = func_int_a(this.field_array_byte_c, 8 + var1 * 8 + 2);
      int var6;
      if (var1 != this.func_int_a() - 1 && func_char_a(this.field_array_byte_c, 8 + var1 * 8) == func_char_a(this.field_array_byte_c, 8 + (var1 + 1) * 8)) {
         var6 = func_int_a(this.field_array_byte_c, 8 + (var1 + 1) * 8 + 2);
      } else {
         var6 = var2.length;
      }

      return var6 - var5;
   }

   // $FF: renamed from: a (byte[], int, int, int) int
   private static int func_int_a(byte[] var0, int var1, int var2, int var3) {
      String var4 = field_array_class_java_lang_String_a[var1];
      int var5;
      if (var3 == -1) {
         var5 = var0.length;
      } else {
         var5 = var2 + var3;
      }

      for(int var6 = var2; var6 < var5; var6 += func_int_a(var0, var6) + 12) {
         if (var0[var6 + 4] == var4.charAt(0) && var0[var6 + 5] == var4.charAt(1) && var0[var6 + 6] == var4.charAt(2) && var0[var6 + 7] == var4.charAt(3)) {
            return var6;
         }
      }

      return -1;
   }

   // $FF: renamed from: a (byte[], int) int
   private static int func_int_a(byte[] var0, int var1) {
      if (var0.length - 4 < var1) {
         throw new ArrayIndexOutOfBoundsException();
      } else {
         boolean var2 = false;
         int var3;
         return (var3 = 0 + (var0[var1] & 255) * 16777216) + (var0[var1 + 1] & 255) * 65536 + (var0[var1 + 2] & 255) * 256 + (var0[var1 + 3] & 255);
      }
   }

   // $FF: renamed from: a (byte[], int) char
   private static char func_char_a(byte[] var0, int var1) {
      if (var0.length - 2 < var1) {
         throw new ArrayIndexOutOfBoundsException();
      } else {
         boolean var2 = false;
         char var3;
         return (char)((var3 = (char)(0 + (var0[var1] & 255) * 256)) + (var0[var1 + 1] & 255));
      }
   }

   // $FF: renamed from: a (int, int) boolean
   private boolean func_boolean_a(int var1, int var2) {
      char var3 = this.field_array_char_a[var1];
      if (var2 >= 1 && var2 <= 16) {
         return (var3 >> var2 - 1 & 1) == 1;
      } else {
         return false;
      }
   }

   // $FF: renamed from: b (byte[], int) int
   private static int func_int_b(byte[] var0, int var1) {
      String var2 = field_array_class_java_lang_String_a[var1];
      int var3 = var0.length;

      for(int var4 = 0; var4 < var3 - 3; ++var4) {
         if (var0[var4] == var2.charAt(0) && var0[var4 + 1] == var2.charAt(1) && var0[var4 + 2] == var2.charAt(2) && var0[var4 + 3] == var2.charAt(3)) {
            return var4 - 4;
         }
      }

      return -1;
   }

   // $FF: renamed from: a (byte[]) void
   public static final void func_void_a(byte[] var0) {
      int var4 = func_int_a(var0, 16, 8, var0.length);
      int var5 = func_int_a(var0, 0, 8, var0.length);
      int var1 = func_int_a(var0, var5 + 8);
      int var2 = func_int_a(var0, var5 + 12);
      byte var3 = var0[var5 + 16];
      func_void_a(var0, var4, var1, var2, var3);
   }

   // $FF: renamed from: a (byte[], int, int, int, int) void
   private static void func_void_a(byte[] var0, int var1, int var2, int var3, int var4) {
      int var5 = 8 / var4;
      int var6 = var3;
      int var7 = (var2 - 1) / var5 + 1;
      byte var8 = (byte)(255 >> 8 - var4);
      int var9 = var1 + 15;
      int var10 = (var7 + 1) * var3;
      int var11 = var2 / 2;
      int var12;
      int var13 = (var12 = var9 + var10) + 4;
      int var14 = var1 + 4;

      int var15;
      for(var15 = 0; var15 < var6; ++var15) {
         if (var0[var9 + (var7 + 1) * var15] != 0) {
            return;
         }
      }

      for(int var24 = 0; var24 < var6; ++var24) {
         var15 = var9 + (var7 + 1) * var24 + 1;

         for(int var25 = 0; var25 < var11; ++var25) {
            int var26 = var2 - 1 - var25;
            int var16 = var15 + var25 / var5;
            int var17 = var15 + var26 / var5;
            int var18 = var25 % var5;
            int var19 = var26 % var5;
            byte var20 = (byte)((var5 - var18 - 1) * var4);
            byte var21 = (byte)((var5 - var19 - 1) * var4);
            byte var22 = (byte)(var0[var16] >> var20 & var8);
            byte var23 = (byte)(var0[var17] >> var21 & var8);
            var0[var16] = (byte)(var0[var16] & ~(var8 << var20) | var23 << var20);
            var0[var17] = (byte)(var0[var17] & ~(var8 << var21) | var22 << var21);
         }
      }

      field_class_an_a.func_void_a();
      field_class_an_a.func_void_a(var0, var9, var10);
      System.arraycopy(func_array_byte_e((int)field_class_an_a.func_long_a()), 0, var0, var12, 4);
      field_class_ca_a.func_void_a();
      field_class_ca_a.func_void_a(var0, var14, var10 + 15);
      System.arraycopy(func_array_byte_e(field_class_ca_a.func_int_a()), 0, var0, var13, 4);
   }

   // $FF: renamed from: a (byte[], int) void
   public static final void func_void_a(byte[] var0, int var1) {
      func_void_a(var0, var1, 0);
   }

   // $FF: renamed from: a (byte[], int, int) void
   public static final void func_void_a(byte[] var0, int var1, int var2) {
      int var3 = func_int_a(var0, 12, 8, var0.length);
      func_void_b(var0, var3, var1, var2, 0);
   }

   // $FF: renamed from: b (byte[], int, int, int, int) void
   private static void func_void_b(byte[] var0, int var1, int var2, int var3, int var4) {
      int var5;
      int var7;
      var5 = func_int_a(var0, var1);
      int var6;
      var7 = (var6 = var1 + 8) + var5;
      byte var9;
      byte var12;
      int var15;
      int var16;
      int var17;
      int var18;
      label113:
      switch(var2) {
      case 0:
         switch(var3) {
         case 0:
            var15 = 0;

            while(true) {
               if (var15 >= var5 / 3) {
                  break label113;
               }

               var9 = var0[var6 + var15 * 3];
               var0[var6 + var15 * 3] = var0[var6 + var15 * 3 + 1];
               var0[var6 + var15 * 3 + 1] = var9;
               ++var15;
            }
         case 1:
            var15 = 0;

            while(true) {
               if (var15 >= var5 / 3) {
                  break label113;
               }

               var9 = var0[var6 + var15 * 3 + 1];
               var0[var6 + var15 * 3 + 1] = var0[var6 + var15 * 3 + 2];
               var0[var6 + var15 * 3 + 2] = var9;
               ++var15;
            }
         case 2:
            var15 = 0;

            while(true) {
               if (var15 >= var5 / 3) {
                  break label113;
               }

               var9 = var0[var6 + var15 * 3];
               var0[var6 + var15 * 3] = var0[var6 + var15 * 3 + 2];
               var0[var6 + var15 * 3 + 2] = var9;
               ++var15;
            }
         case 3:
            var15 = 0;

            while(true) {
               if (var15 >= var5 / 3) {
                  break label113;
               }

               var9 = var0[var6 + var15 * 3];
               var0[var6 + var15 * 3] = var0[var6 + var15 * 3 + 2];
               var0[var6 + var15 * 3 + 2] = var0[var6 + var15 * 3 + 1];
               var0[var6 + var15 * 3 + 1] = var9;
               ++var15;
            }
         case 4:
            for(var15 = 0; var15 < var5 / 3; ++var15) {
               var9 = var0[var6 + var15 * 3];
               var0[var6 + var15 * 3] = var0[var6 + var15 * 3 + 1];
               var0[var6 + var15 * 3 + 1] = var0[var6 + var15 * 3 + 2];
               var0[var6 + var15 * 3 + 2] = var9;
            }
         default:
            break label113;
         }
      case 1:
         var15 = 0;

         while(true) {
            if (var15 >= var5 / 3) {
               break label113;
            }

            var16 = var0[var6 + var15 * 3] & 255;
            var17 = var0[var6 + var15 * 3 + 1] & 255;
            var18 = var0[var6 + var15 * 3 + 2] & 255;
            var12 = (byte)((var16 + var17 + var18) / 3);
            var0[var6 + var15 * 3] = var12;
            var0[var6 + var15 * 3 + 1] = var12;
            var0[var6 + var15 * 3 + 2] = var12;
            ++var15;
         }
      case 2:
         var15 = 0;

         while(true) {
            if (var15 >= var5 / 3) {
               break label113;
            }

            var16 = var0[var6 + var15 * 3] & 255;
            var17 = var0[var6 + var15 * 3 + 1] & 255;
            var18 = var0[var6 + var15 * 3 + 2] & 255;
            var0[var6 + var15 * 3] = (byte)(var16 * var3 * 10 / 1000 < 255 ? var16 * var3 * 10 / 1000 : 255);
            var0[var6 + var15 * 3 + 1] = (byte)(var17 * var3 * 10 / 1000 < 255 ? var17 * var3 * 10 / 1000 : 255);
            var0[var6 + var15 * 3 + 2] = (byte)(var18 * var3 * 10 / 1000 < 255 ? var18 * var3 * 10 / 1000 : 255);
            ++var15;
         }
      case 3:
         var15 = 0;

         while(true) {
            if (var15 >= var5 / 3) {
               break label113;
            }

            var0[var6 + var15 * 3] = (byte)(~var0[var6 + var15 * 3]);
            var0[var6 + var15 * 3 + 1] = (byte)(~var0[var6 + var15 * 3 + 1]);
            var0[var6 + var15 * 3 + 2] = (byte)(~var0[var6 + var15 * 3 + 2]);
            ++var15;
         }
      case 4:
         byte var8 = (byte)(var3 >> 16 & 255);
         var9 = (byte)(var3 >> 8 & 255);
         byte var10 = (byte)(var3 & 255);
         byte var11 = (byte)(var4 >> 16 & 255);
         var12 = (byte)(var4 >> 8 & 255);
         byte var13 = (byte)(var4 & 255);

         for(int var14 = 0; var14 < var5 / 3; ++var14) {
            if (var0[var6 + var14 * 3] == var8 && var0[var6 + var14 * 3 + 1] == var9 && var0[var6 + var14 * 3 + 2] == var10) {
               var0[var6 + var14 * 3] = var11;
               var0[var6 + var14 * 3 + 1] = var12;
               var0[var6 + var14 * 3 + 2] = var13;
            }
         }
      }

      field_class_ca_a.func_void_a();
      field_class_ca_a.func_void_a(var0, var1 + 4, var5 + 4);
      System.arraycopy(func_array_byte_e(field_class_ca_a.func_int_a()), 0, var0, var7, 4);
   }

   // $FF: renamed from: e (int) byte[]
   private static byte[] func_array_byte_e(int var0) {
      byte[] var1;
      (var1 = new byte[4])[0] = (byte)(var0 >> 24 & 255);
      var1[1] = (byte)(var0 >> 16 & 255);
      var1[2] = (byte)(var0 >> 8 & 255);
      var1[3] = (byte)(var0 & 255);
      return var1;
   }
}
