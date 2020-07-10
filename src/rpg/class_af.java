package rpg;

import javax.microedition.lcdui.Graphics;

// $FF: renamed from: af
public final class class_af extends class_cb {
   // $FF: renamed from: c byte
   private byte field_byte_c;
   // $FF: renamed from: a java.lang.Object[]
   private Object[] field_array_class_java_lang_Object_a;
   // $FF: renamed from: a char[]
   private char[] field_array_char_a;
   // $FF: renamed from: a int
   private int field_int_a;
   // $FF: renamed from: b char[]
   private char[] field_array_char_b;
   // $FF: renamed from: c char[]
   private char[] field_array_char_c;

   public class_af(class_cb var1, byte var2, byte var3, Object[] var4, char[] var5, char[] var6) {
      super(var1, var3);
      this.field_byte_c = var2;
      StringBuffer var7 = new StringBuffer();

      int var8;
      char[] var9;
      for(var8 = 0; var8 < var4.length; ++var8) {
         if ((var9 = (char[])((char[])var4[var8])).length > 0) {
            var7.append(var9);
            if (var8 != var4.length - 1) {
               var7.append('\n');
            }
         }
      }

      this.field_array_char_a = var7.toString().toCharArray();
      this.field_array_class_java_lang_Object_a = var4;
      if (var2 != 2 && var2 != 12) {
         if (var2 != 1 && var2 != 11) {
            if (var2 != 9) {
               if (var5 == null) {
                  var5 = class_bh.field_array_char_d;
               }

               if (var6 == null) {
                  var6 = class_bh.field_array_char_e;
               }
            }
         } else if (var5 == null) {
            var5 = class_bh.field_array_char_d;
         }
      } else {
         if (var5 == null) {
            var5 = class_bh.field_array_char_k;
         }

         if (var6 == null) {
            var6 = class_bh.field_array_char_l;
         }
      }

      this.field_array_char_b = var5;
      this.field_array_char_c = var6;
      label55:
      switch(var2) {
      case 2:
      case 6:
         this.field_int_a = 8 + class_bh.func_int_a(class_bh.func_int_a(MyGameCanvas.canvasWidth, 80) - 10, 1, this.field_array_char_a, 0, 0, this.field_array_char_a.length);
         break;
      case 3:
      case 4:
      case 5:
      case 8:
         this.field_int_a = 12;
         var8 = 0;

         while(true) {
            if (var8 >= this.field_array_class_java_lang_Object_a.length) {
               break label55;
            }

            var9 = (char[])((char[])this.field_array_class_java_lang_Object_a[var8]);
            this.field_int_a += 3 + class_bh.func_int_a(class_bh.func_int_a(MyGameCanvas.canvasWidth, 80) - 10, 1, var9, 0, 0, var9.length);
            ++var8;
         }
      case 7:
      case 9:
      case 10:
      default:
         this.field_int_a = 22 + class_bh.func_int_a(class_bh.func_int_a(MyGameCanvas.canvasWidth, 80) - 10, 1, this.field_array_char_a, 0, 0, this.field_array_char_a.length);
         break;
      case 11:
      case 12:
         this.field_int_a = 8 + class_bh.func_int_a(class_bh.func_int_a(MyGameCanvas.canvasWidth, 80) - 10, 1, this.field_array_char_a, 0, 0, this.field_array_char_a.length);
      }

      if (var2 == 6) {
         super.field_byte_b = 1;
      }

   }

   // $FF: renamed from: a (int, int) boolean
   public final boolean func_boolean_a(int var1, int var2) {
      if (this.func_boolean_b(var1, var2)) {
         return true;
      } else {
         switch(this.field_byte_c) {
         case 1:
         case 11:
            if (var2 != 53 && var1 != 8) {
               break;
            }

            super.field_class_cb_a.func_void_a(this.field_byte_c, (byte)0);
            return true;
         case 2:
         case 6:
         case 12:
            if (var2 == 53) {
               super.field_class_cb_a.func_void_a(this.field_byte_c, (byte)0);
               return true;
            }

            if (var2 == -8) {
               super.field_class_cb_a.func_void_a(this.field_byte_c, (byte)99);
            }
            break;
         case 3:
         case 4:
         case 5:
         case 8:
            if (this.func_boolean_c(var1, var2)) {
               return true;
            }

            if (var2 == 53 || var1 == 8) {
               super.field_class_cb_a.func_void_a(this.field_byte_c, super.field_byte_b);
               return true;
            }

            if (var2 == -8) {
               super.field_class_cb_a.func_void_a(this.field_byte_c, (byte)99);
            }
         case 7:
         case 9:
         case 10:
         }

         return true;
      }
   }

   // $FF: renamed from: a (javax.microedition.lcdui.Graphics, int, int) void
   public final void func_void_a(Graphics var1, int var2, int var3) {
      class_bh.func_void_a(var1);
      int var4 = class_bh.func_int_a(MyGameCanvas.canvasWidth, 80);
      var2 = MyGameCanvas.canvasHalfWidth - (var4 >> 1);
      var3 = MyGameCanvas.field_int_j - (this.field_int_a >> 1);
      class_cb.func_void_a(var1, var2, var3, var4, this.field_int_a);
      class_cb.func_void_b(var1, var2, var3, var4, this.field_int_a);
      int var5;
      byte var6;
      label38:
      switch(this.field_byte_c) {
      case 1:
      case 9:
         var1.setColor(16777215);
         var5 = var3 + 5;
         class_bh.func_int_a(var1, var2 + 5, var5, var4 - 10, 1, this.field_array_char_a);
         if (this.field_byte_c != 9) {
            class_bh.func_void_a(var1, this.field_array_char_b, (char[])null);
         }
         break;
      case 2:
      case 6:
         var5 = var3 + 5;
         var1.setColor(16777215);
         class_bh.func_int_a(var1, var2 + 5, var5, var4 - 10, 1, this.field_array_char_a);
         break;
      case 3:
      case 4:
      case 5:
         var1.setColor(16777215);
         var3 += 7;

         for(var6 = 0; var6 < this.field_array_class_java_lang_Object_a.length; ++var6) {
            if (var6 == super.field_byte_b) {
               var1.drawImage(class_ce.field_class_javax_microedition_lcdui_Image_d, var2 + 5, var3, 20);
            }

            var3 += 3 + class_bh.func_int_a(var1, var2 + 12, var3, var4 - 10, 1, (char[])((char[])this.field_array_class_java_lang_Object_a[var6]));
         }
      case 7:
      case 10:
      default:
         break;
      case 8:
         var1.setColor(16777215);
         var3 += 5;
         var3 += 3 + class_bh.func_int_a(var1, var2 + 5, var3, var4 - 10, 1, (char[])((char[])this.field_array_class_java_lang_Object_a[0]));
         var6 = 1;

         while(true) {
            if (var6 >= this.field_array_class_java_lang_Object_a.length) {
               break label38;
            }

            if (var6 == super.field_byte_b + 1) {
               var1.drawImage(class_ce.field_class_javax_microedition_lcdui_Image_d, var2 + 5, var3, 20);
            }

            var3 += 3 + class_bh.func_int_a(var1, var2 + 12, var3, var4 - 10, 1, (char[])((char[])this.field_array_class_java_lang_Object_a[var6]));
            ++var6;
         }
      case 11:
         var5 = var3 + 5;
         class_bh.func_int_a(var1, var2 + 5, var5, var4 - 10, 1, this.field_array_char_a);
         break;
      case 12:
         var5 = var3 + 5;
         class_bh.func_int_a(var1, var2 + 5, var5, var4 - 10, 1, this.field_array_char_a);
      }

      class_bh.func_void_a(var1, this.field_array_char_b, this.field_array_char_c);
   }
}
