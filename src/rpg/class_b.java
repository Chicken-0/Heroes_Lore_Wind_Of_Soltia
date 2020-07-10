package rpg;

import java.util.Vector;

// $FF: renamed from: b
public final class class_b extends MFont {
   private class_b(String var1, int var2, int var3, boolean var4) {
      super(var1, var2, var3, var4);
   }

   // $FF: renamed from: a (java.lang.String, int, int) int
   public final int func_int_a(String var1, int var2, int var3) {
      int var10000 = var1 == null ? 0 : var1.length();
      int var4 = var10000;
      if (var10000 == 0) {
         return 0;
      } else {
         char[] var5 = var1.toCharArray();
         if (var4 < 64 && var1.indexOf(10) == -1 && this.calTextWidth((char[])var5, 0, var4) <= var2) {
            return var1.length();
         } else {
            int var7 = 0;
            int var9 = 0;

            while(true) {
               while(var3 > 0) {
                  int var6 = var7;
                  int var10 = 0;

                  for(int var8 = 1; var3 > 0; ++var8) {
                     if ((var9 = var6 + var8 - 1) >= var4) {
                        return var9 + 1;
                     }

                     char var11 = var5[var9];
                     var10 += this.getCharWidth(var11);
                     if (var11 == '\n') {
                        for(var7 = var9 + 1; var7 < var4 && var5[var7] == ' '; ++var7) {
                        }

                        --var3;
                        break;
                     }

                     if (var10 >= var2) {
                        while(var9 > var6 && var5[var9] != ' ') {
                           --var9;
                        }

                        if (var5[var9] == ' ') {
                           var7 = var9 + 1;
                           --var3;
                        } else {
                           var7 = var7 + var8 - 1;
                           --var3;
                        }
                        break;
                     }
                  }
               }

               return var9 + 1;
            }
         }
      }
   }

   // $FF: renamed from: a (java.util.Vector, java.lang.String, int) java.util.Vector
   public final Vector func_class_java_util_Vector_a(Vector var1, String var2, int var3) {
      var1.removeAllElements();
      int var10000 = var2 == null ? 0 : var2.length();
      int var4 = var10000;
      if (var10000 == 0) {
         return var1;
      } else {
         char[] var5 = var2.toCharArray();
         if (var4 < 64 && var2.indexOf(10) == -1 && this.calTextWidth((char[])var5, 0, var4) <= var3) {
            var1.addElement(var2);
            return var1;
         } else {
            int var7 = 0;

            while(true) {
               label60:
               while(true) {
                  int var6 = var7;
                  int var9 = 0;

                  int var10;
                  for(int var8 = 1; (var10 = var6 + var8 - 1) < var4; ++var8) {
                     char var11 = var5[var10];
                     var9 += this.getCharWidth(var11);
                     if (var11 == '\n') {
                        for(var7 = var10 + 1; var7 < var4 && var5[var7] == ' '; ++var7) {
                        }

                        var1.addElement(new String(var5, var6, var10 - var6));
                        continue label60;
                     }

                     if (var9 >= var3) {
                        while(var10 > var6 && var5[var10] != ' ') {
                           --var10;
                        }

                        if (var5[var10] == ' ') {
                           var7 = var10 + 1;
                           var1.addElement(new String(var5, var6, var10 - var6));
                        } else {
                           var7 = var7 + var8 - 1;
                           var1.addElement(new String(var5, var6, var7 - var6));
                        }
                        continue label60;
                     }
                  }

                  if (var6 < var4) {
                     var1.addElement(new String(var5, var6, var4 - var6));
                  }

                  return var1;
               }
            }
         }
      }
   }

   // $FF: renamed from: a (java.lang.String, int, int, boolean) az
   public static final MFont func_class_az_a(String var0, int var1, int var2, boolean var3) {
      return new class_b(var0, var1, var2, var3);
   }

   // $FF: renamed from: a (java.lang.String, int, boolean) az
   public static final MFont func_class_az_a(String var0, int var1, boolean var2) {
      return func_class_az_a(var0, var1, -1, var2);
   }
}
