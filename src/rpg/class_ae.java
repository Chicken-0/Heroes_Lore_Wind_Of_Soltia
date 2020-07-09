package rpg;

import java.io.IOException;
import java.util.Vector;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

// $FF: renamed from: ae
public final class class_ae implements class_u {
   // $FF: renamed from: a int[]
   private static final int[] field_array_int_a = new int[]{16768831, 4136767, 16768831, 4136767, 16768959, 8339263, 12582719, 2047807, 0, 0, 12582719, 2047807, 4177919, 2047807, 12582719, 2047807, 12582719, 2047807, 12582719, 2047807, 0, 0, 16768959, 8339263, 14680063, 2047871, 14680063, 2047871, 16768959, 8339263};
   // $FF: renamed from: c byte
   private static byte field_byte_c = 2;
   // $FF: renamed from: h byte[]
   private static final byte[] field_array_byte_h = new byte[]{28, 0, 27, 29, -1, 1, 26, 31, 31, 2, -1, 25, 24, 24, 30, 3, -1, -1, -1, -1};
   // $FF: renamed from: d byte
   private static byte field_byte_d;
   // $FF: renamed from: a byte
   public byte field_byte_a;
   // $FF: renamed from: b byte
   public byte field_byte_b;
   // $FF: renamed from: a boolean
   public boolean field_boolean_a;
   // $FF: renamed from: b boolean
   public boolean field_boolean_b;
   // $FF: renamed from: e byte
   private byte field_byte_e;
   // $FF: renamed from: c boolean
   public boolean field_boolean_c;
   // $FF: renamed from: a int
   public int field_int_a;
   // $FF: renamed from: b int
   public int field_int_b;
   // $FF: renamed from: c int
   public int field_int_c;
   // $FF: renamed from: d int
   public int field_int_d;
   // $FF: renamed from: b byte[][]
   public byte[][] field_array_array_byte_b;
   // $FF: renamed from: c byte[][]
   public byte[][] field_array_array_byte_c;
   // $FF: renamed from: a ck[][]
   public class_ck[][] field_array_array_class_ck_a;
   // $FF: renamed from: a ac[]
   public class_ac[] field_array_class_ac_a;
   // $FF: renamed from: a aj[]
   public class_aj[] field_array_class_aj_a;
   // $FF: renamed from: a aq
   private class_aq field_class_aq_a;
   // $FF: renamed from: a java.util.Vector
   private Vector field_class_java_util_Vector_a;
   // $FF: renamed from: b java.util.Vector
   private Vector field_class_java_util_Vector_b;
   // $FF: renamed from: g int
   private int field_int_g;
   // $FF: renamed from: e int
   public int field_int_e = 0;
   // $FF: renamed from: f int
   public int field_int_f = 0;
   // $FF: renamed from: a java.lang.Object[]
   public Object[] field_array_class_java_lang_Object_a;
   // $FF: renamed from: b java.lang.Object[]
   public Object[] field_array_class_java_lang_Object_b;
   // $FF: renamed from: c java.lang.Object[]
   public Object[] field_array_class_java_lang_Object_c;
   // $FF: renamed from: d boolean
   private boolean field_boolean_d;
   // $FF: renamed from: i byte[]
   private byte[] field_array_byte_i;
   // $FF: renamed from: a char[]
   public char[] field_array_char_a;

   // $FF: renamed from: a (int) boolean
   public static final boolean func_boolean_a(int var0) {
      return var0 == 11 || var0 == 13 || var0 == 15 || var0 == 82;
   }

   public class_ae(byte var1) {
      this.field_byte_a = var1;
      this.field_boolean_c = false;
      this.field_boolean_a = func_boolean_a(var1);
      this.field_boolean_b = var1 == 13 || var1 == 15;
      this.field_class_aq_a = new class_aq();
      this.field_class_java_util_Vector_b = new Vector();
      this.field_int_g = 16;
      this.field_class_java_util_Vector_a = new Vector();
      if (class_r.field_int_g >= 240 && class_r.field_int_h >= 240) {
         field_byte_c = 3;
      }

   }

   // $FF: renamed from: a () void
   public final void func_void_a() {
      System.out.println("map : " + class_n.field_byte_f);
      class_ce.func_void_c();
      class_ce.func_void_d();
      class_ce.func_void_e();
      class_ce.func_void_m();
      this.field_array_class_java_lang_Object_a = null;
      this.field_array_class_java_lang_Object_b = null;
      this.field_array_class_java_lang_Object_c = null;
      this.func_void_l();

      byte var1;
      for(var1 = 0; var1 <= 4; ++var1) {
         class_bw.func_void_b(var1);
      }

      for(var1 = 24; var1 <= 31; ++var1) {
         class_bw.func_void_b(var1);
      }

      class_r.func_void_k();
      this.field_array_byte_i = class_ce.func_array_byte_a("/m/" + (class_n.field_byte_f < 10 ? "0" : "") + class_n.field_byte_f + ".map");
      class_r.func_void_k();
      this.field_byte_b = this.field_array_byte_i[0];
      this.field_int_a = this.field_array_byte_i[1];
      this.field_int_b = this.field_array_byte_i[2];
      if (this.field_byte_b != 1 && this.field_byte_b != 5 && this.field_byte_b != 9 && this.field_byte_b != 15) {
         this.field_boolean_c = true;
      }

      this.field_array_array_class_ck_a = new class_ck[this.field_int_b][this.field_int_a];
      class_r.func_void_k();
      this.field_int_c = this.field_int_a * 16;
      this.field_int_d = this.field_int_b * 16;
      class_r.func_void_k();
      this.func_void_a(this.field_array_byte_i, 3);
      this.field_array_byte_i = null;
      if (field_byte_d != this.field_byte_b) {
         class_ce.func_void_b();
      }

      System.gc();
      this.field_array_byte_i = class_ce.func_array_byte_a("/m/" + class_n.field_byte_a + "/" + (class_n.field_byte_f < 10 ? "0" : "") + class_n.field_byte_f + ".evt");
      class_r.func_void_k();
      class_r.func_void_k();
      this.func_void_b(this.field_array_byte_i, 0);
      int var4 = 0 + this.field_int_a * this.field_int_b;
      class_r.func_void_k();
      var4 += this.func_int_a(this.field_array_byte_i, var4);
      class_r.func_void_k();
      var4 += this.func_int_b(this.field_array_byte_i, var4);
      class_r.func_void_k();
      var4 += this.func_int_c(this.field_array_byte_i, var4);
      class_r.func_void_k();
      var4 += this.func_int_d(this.field_array_byte_i, var4);
      class_r.func_void_k();
      var4 += this.func_int_e(this.field_array_byte_i, var4);
      this.func_void_c(this.field_array_byte_i, var4);
      this.field_array_byte_i = null;
      switch(this.field_byte_a) {
      case 11:
         func_void_e();
         this.func_void_f();
         break;
      case 13:
         func_void_g();
         this.func_void_a(true);
         break;
      case 15:
         func_void_h();
         this.func_void_i();
         break;
      case 82:
         func_void_j();
         this.func_void_k();
      }

      if (class_ce.field_array_class_javax_microedition_lcdui_Image_e == null) {
         class_r.func_void_k();

         try {
            class_ce.field_array_class_javax_microedition_lcdui_Image_e = (new class_br("/m/t/t" + (this.field_byte_b < 10 ? "0" : "") + this.field_byte_b)).func_array_class_javax_microedition_lcdui_Image_a();
            class_r.func_void_k();
         } catch (IOException var3) {
         }
      }

      field_byte_d = this.field_byte_b;
      if (class_n.field_byte_a == 8 && this.field_byte_a == 65) {
         this.field_array_char_a = class_ce.field_class_z_d.func_array_char_a(85);
      } else {
         this.field_array_char_a = class_ce.field_class_z_d.func_array_char_a(this.field_byte_a);
      }

      if (this.field_array_char_a != null && this.field_array_char_a.length > 0) {
         this.field_byte_e = 10;
      } else {
         this.field_byte_e = 0;
      }

      if (this.field_byte_a != 79 && this.field_byte_a != 80 && this.field_byte_a != 81) {
         if (this.field_byte_b == 1 || this.field_byte_b == 5 || this.field_byte_b == 9 || this.field_byte_b == 15) {
            class_bw.func_void_a((byte)8);
         }

         if (field_array_byte_h[this.field_byte_b] != -1) {
            class_bw.func_void_a(field_array_byte_h[this.field_byte_b]);
            class_bw.func_void_b((int)field_array_byte_h[this.field_byte_b]);
         }
      } else {
         class_bw.func_void_a((byte)4);
         class_bw.func_void_a((byte)8);
         class_bw.func_void_b((int)4);
      }

      class_n.func_class_ao_a().func_void_c();
   }

   // $FF: renamed from: a (byte[], int) void
   private final void func_void_a(byte[] var1, int var2) {
      this.field_array_array_byte_b = new byte[this.field_int_b][this.field_int_a];
      class_r.func_void_k();

      for(int var3 = 0; var3 < this.field_int_b; ++var3) {
         System.arraycopy(var1, var2, this.field_array_array_byte_b[var3], 0, this.field_int_a);
         var2 += this.field_int_a;
      }

      class_r.func_void_k();
   }

   // $FF: renamed from: b (byte[], int) void
   private final void func_void_b(byte[] var1, int var2) {
      this.field_array_array_byte_c = new byte[this.field_int_b][this.field_int_a];
      class_r.func_void_k();

      for(int var3 = 0; var3 < this.field_int_b; ++var3) {
         System.arraycopy(var1, var2, this.field_array_array_byte_c[var3], 0, this.field_int_a);
         var2 += this.field_int_a;
      }

      class_r.func_void_k();
   }

   // $FF: renamed from: a (byte[], int) int
   private final int func_int_a(byte[] var1, int var2) {
      Image[] var3 = null;
      int var4;
      int var6;
      if ((var4 = var1[var2++] & 255) > 0) {
         try {
            class_br var5;
            (var5 = new class_br("/m/t/o" + (this.field_byte_b < 10 ? "0" : "") + this.field_byte_b)).field_boolean_a = true;
            class_r.func_void_k();
            class_ce.field_array_class_javax_microedition_lcdui_Image_f = new Image[var5.func_int_a()];
            var3 = class_ce.field_array_class_javax_microedition_lcdui_Image_f;
            class_r.func_void_k();

            for(var6 = 0; var6 < var4; ++var6) {
               int var7 = var1[var2++] & 255;
               var3[var7] = var5.func_class_javax_microedition_lcdui_Image_a(var7);
               class_r.func_void_k();
            }
         } catch (IOException var13) {
            var13.printStackTrace();
         }
      }

      class_r.func_void_k();
      int var14 = var1[var2++] & 255;
      this.field_array_class_aj_a = new class_aj[var14];

      for(var6 = 0; var6 < var14; ++var6) {
         short var15 = (short)((var1[var2++] & 255) * 16);
         short var8 = (short)((var1[var2++] & 255) * 16);
         byte var9 = var1[var2++];
         byte var10 = var1[var2++];
         int var11 = var1[var2++] & 255;
         class_aj var12 = new class_aj(var15, var8, var9, var10, var3[var11]);
         this.field_class_aq_a.func_void_b(var12);
         this.field_class_aq_a.func_void_c(var12);
         this.field_array_class_aj_a[var6] = var12;
      }

      class_r.func_void_k();
      return 1 + var4 + 1 + var14 * 5;
   }

   // $FF: renamed from: b (byte[], int) int
   private final int func_int_b(byte[] var1, int var2) {
      byte var3 = 0;
      Image[] var4 = null;
      int var5 = var1[var2++] & 255;
      int var14 = var3 + 1;

      byte var6;
      for(var6 = 0; var6 < 5; ++var6) {
         class_ce.func_void_d(var6);
      }

      class_ce.field_array_byte_l = new byte[5];

      for(var6 = 0; var6 < 5; ++var6) {
         class_ce.field_array_byte_l[var6] = -1;
      }

      byte var8;
      byte var9;
      try {
         class_br var15;
         (var15 = new class_br("/npc/all")).field_boolean_a = true;
         class_r.func_void_k();
         class_ce.field_array_class_javax_microedition_lcdui_Image_g = new Image[var15.func_int_a()];
         var4 = class_ce.field_array_class_javax_microedition_lcdui_Image_g;
         byte var7 = 0;

         for(var8 = 0; var8 < var5; ++var8) {
            var9 = var1[var2++];
            ++var14;
            if (var9 >= 18) {
               var4[var9 - 18] = var15.func_class_javax_microedition_lcdui_Image_a(var9 - 18);
               class_r.func_void_k();
            } else if (var9 == 3) {
               class_ce.field_array_byte_l[var7] = var9;
               class_ce.func_void_a((short)17, var7, true);
               ++var7;
            } else if (var9 == 6) {
               class_ce.field_array_byte_l[var7] = var9;
               class_ce.func_void_a((short)20, var7, true);
               ++var7;
            } else {
               class_ce.field_array_byte_l[var7] = var9;
               class_r.func_void_k();
               class_ce.func_void_b(var9, var7);
               ++var7;
               (new StringBuffer()).append("Npc Loaded - ").append(var9).toString();
            }
         }
      } catch (IOException var13) {
         var13.printStackTrace();
      }

      class_r.func_void_k();
      int var16 = var1[var2++] & 255;
      ++var14;
      this.field_array_class_ac_a = new class_ac[var16];

      for(int var17 = 0; var17 < var16; ++var17) {
         var8 = var1[var2++];
         var9 = var1[var2++];
         byte var10 = var1[var2++];
         byte var11 = -1;
         if (var10 >= 18) {
            var11 = -1;
         } else {
            for(byte var12 = 0; var12 < class_ce.field_array_byte_l.length; ++var12) {
               if (class_ce.field_array_byte_l[var12] == var10) {
                  var11 = var12;
                  break;
               }
            }

            class_x.func_void_a(var11 != -1);
         }

         class_ac var18 = new class_ac((short)(var8 * 16), (short)(var9 * 16), var10, var11);
         this.field_class_aq_a.func_void_b(var18);
         this.field_class_aq_a.func_void_c(var18);
         var18.func_void_g();
         var14 += 3;
         this.field_array_class_ac_a[var17] = var18;
      }

      class_r.func_void_k();
      return var14;
   }

   // $FF: renamed from: c (byte[], int) int
   private final int func_int_c(byte[] var1, int var2) {
      byte var3;
      for(var3 = 0; var3 < 5; ++var3) {
         class_ce.func_void_c(var3);
      }

      class_ce.field_array_byte_k = new byte[5];

      for(var3 = 0; var3 < 5; ++var3) {
         class_ce.field_array_byte_k[var3] = -1;
      }

      byte var11 = 0;
      int var4;
      class_x.func_void_a((var4 = var1[var2++] & 255) <= 5);
      int var12 = var11 + 1;
      class_r.func_void_k();
      byte[] var5 = null;
      if (var4 != 0) {
         class_j.func_void_a((int)5);
         var5 = class_ce.func_array_byte_a("/enm/data" + (class_n.field_byte_g >= 2 ? 2 : class_n.field_byte_g));
         class_r.func_void_k();
      }

      for(byte var6 = 0; var6 < var4; ++var6) {
         byte var7 = (byte)(var1[var2++] & 255);
         ++var12;
         class_ce.field_array_byte_k[var6] = var7;
         class_j.func_void_a(var5, var7, var6);
         class_r.func_void_k();
         class_ce.func_void_a((short)var7, var6, false);
         class_j.func_void_a(var6);
         class_r.func_void_k();
         (new StringBuffer()).append("Enemy Loaded - ").append(var7).toString();
      }

      class_r.func_void_k();
      int var13 = var1[var2++] & 255;
      ++var12;

      for(int var14 = 0; var14 < var13; ++var14) {
         int var8 = var1[var2++] & 255;
         int var9 = var1[var2++] & 255;
         byte var10 = var1[var2++];
         var12 += 3;
         this.func_void_a((int)var10, (int)0, (int)var8, (int)var9);
         class_r.func_void_k();
      }

      return var12;
   }

   // $FF: renamed from: d (byte[], int) int
   private final int func_int_d(byte[] var1, int var2) {
      byte var3 = var1[var2++];

      try {
         class_br var4;
         (var4 = new class_br("/m/face")).field_boolean_a = true;
         class_ce.field_array_class_javax_microedition_lcdui_Image_h = new Image[var4.func_int_a()];

         for(int var5 = 0; var5 < var3; ++var5) {
            byte var6 = var1[var2++];
            class_ce.field_array_class_javax_microedition_lcdui_Image_h[var6] = var4.func_class_javax_microedition_lcdui_Image_a(var6);
         }
      } catch (IOException var7) {
         var7.printStackTrace();
      }

      return var3 + 1;
   }

   // $FF: renamed from: l () void
   private final void func_void_l() {
      class_ce.field_array_class_javax_microedition_lcdui_Image_h = null;
   }

   // $FF: renamed from: e (byte[], int) int
   private final int func_int_e(byte[] var1, int var2) {
      byte var3 = 0;
      int var4 = var1[var2++] & 255;
      int var10 = var3 + 1;
      this.field_array_class_java_lang_Object_a = new Object[var4];
      class_r.func_void_k();

      int var5;
      int var6;
      int var8;
      for(var5 = 0; var5 < var4; ++var5) {
         var6 = var1[var2++] & 255;
         ++var10;
         if (var6 > 0) {
            byte[][] var7 = new byte[var6][7];

            for(var8 = 0; var8 < var6; ++var8) {
               System.arraycopy(var1, var2, var7[var8], 0, 7);
               var2 += 7;
               var10 += 7;
            }

            this.field_array_class_java_lang_Object_a[var5] = var7;
         }
      }

      class_r.func_void_k();
      var5 = var1[var2++] & 255;
      ++var10;
      this.field_array_class_java_lang_Object_b = new Object[var5];

      int var11;
      for(var6 = 0; var6 < var5; ++var6) {
         var11 = var1[var2++] & 255;
         ++var10;
         if (var11 > 0) {
            byte[][] var12 = new byte[var11][3];

            for(int var9 = 0; var9 < var11; ++var9) {
               System.arraycopy(var1, var2, var12[var9], 0, 3);
               var2 += 3;
               var10 += 3;
            }

            this.field_array_class_java_lang_Object_b[var6] = var12;
         }
      }

      class_r.func_void_k();
      var6 = var1[var2++] & 255;
      ++var10;
      this.field_array_class_java_lang_Object_c = new Object[var6];

      for(var11 = 0; var11 < var6; ++var11) {
         var8 = var1[var2++] & 255;
         ++var10;
         this.field_array_class_java_lang_Object_c[var11] = class_bh.func_array_char_a(new String(var1, var2, var8));
         var2 += var8;
         var10 += var8;
      }

      class_r.func_void_k();
      return var10;
   }

   // $FF: renamed from: c (byte[], int) void
   private final void func_void_c(byte[] var1, int var2) {
      byte var3 = -1;
      byte var4 = var1[var2++];

      byte var5;
      for(var5 = 0; var5 < var4; ++var5) {
         boolean var6 = false;
         int var13;
         if (class_n.func_boolean_a((var13 = 0 | (var1[var2++] & 3) << 8) | var1[var2++]) && var3 == -1) {
            var3 = var1[var2];
         }

         ++var2;
      }

      var5 = var1[var2++];

      for(byte var14 = 0; var14 < var5; ++var14) {
         byte var7 = var1[var2++];
         if (var3 == var14) {
            for(byte var8 = 0; var8 < var7; ++var8) {
               byte var9 = var1[var2++];
               byte var10 = var1[var2++];
               byte var11 = var1[var2++];
               byte var12 = var1[var2++];
               this.func_void_b(var9, var10, var11, var12);
            }
         } else {
            var2 += var7 * 4;
         }
      }

   }

   // $FF: renamed from: b (byte, byte, byte, byte) void
   private final void func_void_b(byte var1, byte var2, byte var3, byte var4) {
      switch(var1) {
      case 100:
         this.field_array_array_byte_b[var3][var2] = var4;
         return;
      case 101:
         this.field_array_array_byte_c[var3][var2] = var4;
         return;
      case 102:
         this.field_array_class_aj_a[var4 & 255].func_void_a((short)((var2 & 255) << 4), (short)((var3 & 255) << 4));
         return;
      case 103:
         class_aj var7 = this.field_array_class_aj_a[var2 & 255];
         this.func_void_a((class_ck)var7);
         this.field_array_class_aj_a[var2 & 255] = null;
         return;
      case 104:
         this.field_array_class_ac_a[var4 & 255].func_void_a((short)((var2 & 255) << 4), (short)((var3 & 255) << 4));
         return;
      case 105:
         class_ac var9;
         (var9 = this.field_array_class_ac_a[var2 & 255]).field_boolean_d = false;
         var9.func_void_f();
         return;
      case 106:
         class_x.func_void_a(false);
         return;
      case 107:
         class_x.func_void_a(false);
         return;
      case 108:
         return;
      case 109:
         this.field_array_class_aj_a[var2 & 255].field_class_javax_microedition_lcdui_Image_a = class_ce.field_array_class_javax_microedition_lcdui_Image_f[var3 & 255];
         return;
      case 110:
         this.field_array_class_ac_a[var2 & 255].field_byte_f = var3;
         return;
      case 111:
         class_ao var11;
         (var11 = class_n.func_class_ao_a()).func_void_c();
         if (var2 != 0) {
            var11.func_void_a(new class_aw((byte)10, (short)-1, (short)(var2 - 1)));
            return;
         }
         break;
      case 112:
         class_ac var5;
         (var5 = this.field_array_class_ac_a[var2]).func_void_c();
         if (var3 != 0) {
            var5.func_void_a(new class_aw((byte)10, (short)-1, (short)(var3 - 1)));
         }
      }

   }

   // $FF: renamed from: a (javax.microedition.lcdui.Graphics) void
   public final void func_void_a(Graphics var1) {
      int var2 = class_bs.field_class_bs_a.field_boolean_d ? class_n.field_int_c : class_n.field_int_a;
      int var3 = class_bs.field_class_bs_a.field_boolean_d ? class_n.field_int_d : class_n.field_int_b;
      int var4 = class_as.field_int_a;
      int var5 = class_as.field_int_b;
      if (this.field_boolean_b) {
         var2 = class_n.field_int_a;
         var3 = class_n.field_int_b + 30;
      }

      if (var2 > 0) {
         var2 = 0;
      }

      if (var2 < var4 - this.field_int_c) {
         var2 = var4 - this.field_int_c;
      }

      if (var3 > 0) {
         var3 = 0;
      }

      if (var3 < var5 - this.field_int_d) {
         var3 = var5 - this.field_int_d;
      }

      if (var2 > 0) {
         var2 = (var4 - this.field_int_c) / 2;
         var1.setColor(0);
         var1.fillRect(0, 0, var4, var5);
      }

      if (var3 > 0) {
         var3 = (var5 - this.field_int_d) / 2;
         var1.setColor(0);
         var1.fillRect(0, 0, var4, var5);
      }

      var1.setClip(0, 0, var4, var5);
      if (this.field_int_e != 0) {
         var2 += this.field_int_e;
         this.field_int_e = 0;
      }

      if (this.field_int_f != 0) {
         var3 += this.field_int_f;
         this.field_int_f = 0;
      }

      this.func_void_a(var1, var2, var3, var4, var5);
      this.func_void_a(var1, var2, var3);
      this.func_void_b(var1, var2, var3);
      if (this.field_byte_e > 0) {
         int var6 = var5 / 4;
         if (this.field_byte_e > 8) {
            var1.setClip(0, var6 + 4 * (this.field_byte_e - 8), var4, 8 * (10 - this.field_byte_e + 1));
         } else if (this.field_byte_e < 3) {
            var1.setClip(0, var6 + 4 * (3 - this.field_byte_e), var4, 8 * this.field_byte_e);
         } else {
            var1.setClip(0, 0, class_r.field_int_g, class_r.field_int_h);
         }

         var1.setColor(0);
         var1.fillRect(0, var6, var4, 22);
         var1.setColor(14663551);
         var1.drawLine(0, var6, var4, var6);
         var1.drawLine(0, var6 + 21, var4, var6 + 21);
         var1.setColor(16777215);
         class_bh.func_void_a(var1, var4 / 2, var6 + 12 - 4, this.field_array_char_a, 1);
         --this.field_byte_e;
      }

      var1.setClip(0, 0, class_r.field_int_g, class_r.field_int_h);
   }

   // $FF: renamed from: a (javax.microedition.lcdui.Graphics, int, int, int, int) void
   private final void func_void_a(Graphics var1, int var2, int var3, int var4, int var5) {
      int var6 = -var2 / 16;
      int var7 = -var3 / 16;
      int var8 = (var4 - var2 - 1) / 16;
      int var9 = (var5 - var3 - 1) / 16;
      if (var6 < 0) {
         var6 = 0;
      }

      if (var7 < 0) {
         var7 = 0;
      }

      if (var8 >= this.field_int_a) {
         var8 = this.field_int_a - 1;
      }

      if (var9 >= this.field_int_b) {
         var9 = this.field_int_b - 1;
      }

      Image[] var12 = class_ce.field_array_class_javax_microedition_lcdui_Image_e;

      for(int var13 = var7; var13 <= var9; ++var13) {
         int var11 = var3 + var13 * 16;
         int var10 = var2 + var6 * 16;

         for(int var14 = var6; var14 <= var8; ++var14) {
            Image var15;
            if ((var15 = var12[this.field_array_array_byte_b[var13][var14]]) == null) {
               if (this.field_array_array_byte_c[var13][var14] < 0) {
                  var1.setColor(0);
               } else if (this.field_array_array_byte_c[var13][var14] >= 0) {
                  var1.setColor(16777215);
               }

               var1.fillRect(var10, var11, 16, 16);
            } else {
               var1.drawImage(var15, var10, var11, 20);
            }

            var10 += 16;
         }
      }

   }

   // $FF: renamed from: a (javax.microedition.lcdui.Graphics, int, int) void
   private final void func_void_a(Graphics var1, int var2, int var3) {
      for(int var5 = 0; var5 < this.field_class_java_util_Vector_a.size(); ++var5) {
         byte[] var4;
         if ((var4 = (byte[])((byte[])this.field_class_java_util_Vector_a.elementAt(var5)))[5] > 16 || var4[5] % 3 != 0) {
            var1.drawImage(var4[2] == -1 ? class_ce.field_class_javax_microedition_lcdui_Image_B : class_ce.field_class_javax_microedition_lcdui_Image_A, var2 + (var4[0] << 4) + 8, var3 + (var4[1] << 4) + 8, 33);
         }
      }

   }

   // $FF: renamed from: b (javax.microedition.lcdui.Graphics, int, int) void
   private final void func_void_b(Graphics var1, int var2, int var3) {
      for(class_ck var4 = this.field_class_aq_a.field_class_ck_a; var4 != null; var4 = var4.field_class_ck_a) {
         var4.func_void_a(var1, var2, var3);
      }

   }

   // $FF: renamed from: b (javax.microedition.lcdui.Graphics) void
   public final void func_void_b(Graphics var1) {
      int var2 = this.field_int_a * field_byte_c;
      int var3 = this.field_int_b * field_byte_c;
      int var4 = class_r.field_int_i - var2 / 2;
      int var5 = class_r.field_int_j - var3 / 2;
      var1.setColor(0);
      var1.drawRect(var4 - 1, var5 - 1, var2 + 1, var3 + 1);

      for(byte var6 = 0; var6 < this.field_int_b; ++var6) {
         for(byte var7 = 0; var7 < this.field_int_a; ++var7) {
            if (this.field_array_array_byte_c[var6][var7] < 0) {
               var1.setColor(field_array_int_a[this.field_byte_b * 2 + 1]);
            } else if (this.field_array_array_byte_c[var6][var7] >= 0) {
               var1.setColor(field_array_int_a[this.field_byte_b * 2]);
            }

            if (this.field_array_array_byte_c[var6][var7] != 0 && this.field_array_array_byte_c[var6][var7] != -128 && class_ah.func_boolean_a(this.field_array_array_byte_c[var6][var7] < 0 ? (byte)(-this.field_array_array_byte_c[var6][var7]) : this.field_array_array_byte_c[var6][var7])) {
               if (this.field_byte_b == 6) {
                  var1.setColor(16727999);
               } else {
                  var1.setColor(4161535);
               }
            }

            var1.fillRect(var4, var5, field_byte_c, field_byte_c);
            var4 += field_byte_c;
         }

         var5 += field_byte_c;
         var4 = class_r.field_int_i - var2 / 2;
      }

      if (this.field_boolean_d) {
         class_ao var8 = class_n.func_class_ao_a();
         var1.setColor(16727871);
         var1.fillRect(class_r.field_int_i - var2 / 2 + var8.field_byte_a * field_byte_c, class_r.field_int_j - var3 / 2 + var8.field_byte_b * field_byte_c, field_byte_c, field_byte_c);
      }

      this.field_boolean_d = !this.field_boolean_d;
      var1.setColor(0);
      var1.fillRect(0, 0, class_r.field_int_g, 20);
      var1.setColor(16777215);
      class_bh.func_void_a(var1, class_r.field_int_i, 8, this.field_array_char_a, 1);
   }

   // $FF: renamed from: b () void
   public final void func_void_b() {
      this.func_void_a(true, (byte)3);
      this.func_void_o();
      this.func_void_m();
   }

   // $FF: renamed from: c () void
   public final void func_void_c() {
      this.func_void_n();
   }

   // $FF: renamed from: d () void
   public final void func_void_d() {
      this.field_int_g = 0;
      this.func_void_a(false, (byte)3);
   }

   // $FF: renamed from: a (boolean, byte) void
   private final void func_void_a(boolean var1, byte var2) {
      --this.field_int_g;
      if (this.field_int_g < 0) {
         this.field_int_g = 16;

         for(int var4 = this.field_class_java_util_Vector_b.size() - 1; var4 >= 0; --var4) {
            int[] var3;
            int[] var10000 = var3 = (int[])((int[])this.field_class_java_util_Vector_b.elementAt(var4));
            var10000[0] -= 16;
            if (var3[0] < 0) {
               byte var5 = (byte)var3[1];
               byte var6 = (byte)var3[2];
               byte var7 = (byte)var3[3];
               byte var8 = -1;

               for(byte var9 = 0; var9 < class_ce.field_array_byte_k.length; ++var9) {
                  if (class_ce.field_array_byte_k[var9] == var5) {
                     var8 = var9;
                     break;
                  }
               }

               if (class_j.field_array_class_j_a[var8].field_byte_a == 2 && var6 >= this.field_int_a - 1) {
                  System.out.println("INVALID location for enemy - delayed creation.");
                  this.field_class_java_util_Vector_b.removeElementAt(var4);
                  this.func_void_a((int)var3[1], (int)0, (int)(var6 - 1), (int)var7);
               } else if (this.func_boolean_a(var6, var7, var5, var8, var1, var2, (byte)5)) {
                  this.field_class_java_util_Vector_b.removeElementAt(var4);
               } else {
                  var3[0] = 0;
               }
            }
         }
      }

   }

   // $FF: renamed from: a (byte, byte, byte, byte, boolean, byte, byte) boolean
   public final boolean func_boolean_a(byte var1, byte var2, byte var3, byte var4, boolean var5, byte var6, byte var7) {
      byte var8 = 1;
      if (class_j.field_array_class_j_a[var4].field_byte_a == 2) {
         var8 = 2;
      }

      if (var5) {
         var1 = (byte)(var1 + class_h.func_int_a(-var6, var6));
         var2 = (byte)(var2 + class_h.func_int_a(-var6, var6));
      }

      while(!this.func_boolean_a(var1, var2, var8) && var7 > 0) {
         --var7;
         var1 = (byte)(var1 + class_h.func_int_a(-var6, var6));
         var2 = (byte)(var2 + class_h.func_int_a(-var6, var6));
      }

      if (var7 > 0) {
         class_al var9 = new class_al((short)(var1 << 4), (short)(var2 << 4), var3, var4);
         this.field_class_aq_a.func_void_b(var9);
         this.field_class_aq_a.func_void_c(var9);
         var9.func_void_a((byte)1);
         var9.func_void_b((byte)2);
         return true;
      } else {
         return false;
      }
   }

   // $FF: renamed from: m () void
   private final void func_void_m() {
      class_ck var1 = this.field_class_aq_a.field_class_ck_a;

      while(true) {
         while(var1 != null) {
            if (var1 instanceof class_aj) {
               var1 = var1.field_class_ck_a;
            } else if (var1 instanceof class_al && !var1.field_boolean_c) {
               class_al var2;
               (var2 = (class_al)var1).func_void_d();
               var1 = var1.field_class_ck_a;
               this.field_class_aq_a.func_void_c(var2);
               if (var2.field_byte_h == 6) {
                  this.func_void_a((class_ck)var2);
               }
            } else if (var1 instanceof class_y && !var1.field_boolean_c) {
               class_y var3;
               (var3 = (class_y)var1).func_void_a();
               var1 = var1.field_class_ck_a;
               this.field_class_aq_a.func_void_c(var3);
               if (var3.func_boolean_a()) {
                  this.func_void_a((class_ck)var3);
               }
            } else if (var1.field_boolean_c) {
               var1.field_boolean_c = false;
               var1 = var1.field_class_ck_a;
            } else {
               var1 = var1.field_class_ck_a;
            }
         }

         return;
      }
   }

   // $FF: renamed from: n () void
   private final void func_void_n() {
      class_ck var1 = this.field_class_aq_a.field_class_ck_a;

      while(true) {
         while(var1 != null) {
            if (var1 instanceof class_ac && !var1.field_boolean_c) {
               class_ac var2;
               (var2 = (class_ac)var1).func_void_d();
               var1 = var1.field_class_ck_a;
               this.field_class_aq_a.func_void_c(var2);
            } else if (var1.field_boolean_c) {
               var1.field_boolean_c = false;
               var1 = var1.field_class_ck_a;
            } else {
               var1 = var1.field_class_ck_a;
            }
         }

         return;
      }
   }

   // $FF: renamed from: o () void
   private final void func_void_o() {
      for(int var2 = this.field_class_java_util_Vector_a.size() - 1; var2 >= 0; --var2) {
         byte[] var1;
         --(var1 = (byte[])((byte[])this.field_class_java_util_Vector_a.elementAt(var2)))[5];
         if (var1[5] < 0) {
            this.field_class_java_util_Vector_a.removeElementAt(var2);
         }
      }

   }

   // $FF: renamed from: a (int, int) boolean
   public final boolean func_boolean_a(int var1, int var2) {
      if (var1 >= 0 && var2 >= 0 && var1 < this.field_int_a && var2 < this.field_int_b) {
         return this.field_array_array_byte_c[var2][var1] >= 0 && this.field_array_array_class_ck_a[var2][var1] == null;
      } else {
         return false;
      }
   }

   // $FF: renamed from: a (int, int, byte) boolean
   public final boolean func_boolean_a(int var1, int var2, byte var3) {
      for(int var4 = 0; var4 < var3; ++var4) {
         if (!this.func_boolean_a(var1 + var4, var2)) {
            return false;
         }
      }

      return true;
   }

   // $FF: renamed from: a (o, int, int) boolean
   public final boolean func_boolean_a(class_o var1, int var2, int var3) {
      for(int var4 = 0; var4 < var1.field_byte_e; ++var4) {
         if (var2 + var4 < 0 || var3 < 0 || var2 + var4 >= this.field_int_a || var3 >= this.field_int_b) {
            return false;
         }

         if (!this.func_boolean_a(var2 + var4, var3) && this.field_array_array_class_ck_a[var3][var2 + var4] != var1) {
            return false;
         }
      }

      return true;
   }

   // $FF: renamed from: a (o, byte) boolean
   public final boolean func_boolean_a(class_o var1, byte var2) {
      return this.func_boolean_a(var1, var1.field_byte_a + class_u.field_array_byte_a[var2], var1.field_byte_b + class_u.field_array_byte_b[var2]);
   }

   // $FF: renamed from: a (ck) void
   public final void func_void_a(class_ck var1) {
      if (var1 instanceof class_o) {
         ((class_o)var1).func_void_f();
      }

      this.field_class_aq_a.func_class_ck_a(var1);
   }

   // $FF: renamed from: b (ck) void
   public final void func_void_b(class_ck var1) {
      this.field_class_aq_a.func_void_b(var1);
      this.field_class_aq_a.func_void_c(var1);
   }

   // $FF: renamed from: c (ck) void
   public final void func_void_c(class_ck var1) {
      this.field_class_aq_a.func_void_c(var1);
   }

   // $FF: renamed from: a (int, int, int, int) void
   public final void func_void_a(int var1, int var2, int var3, int var4) {
      int[] var5;
      (var5 = new int[4])[0] = var2;
      var5[1] = var1;
      var5[2] = var3;
      var5[3] = var4;
      this.field_class_java_util_Vector_b.addElement(var5);
   }

   // $FF: renamed from: a (byte, byte, byte, byte) void
   public final void func_void_a(byte var1, byte var2, byte var3, byte var4) {
      if (var3 != 22) {
         byte[] var5 = new byte[]{var1, var2, var3, var4, 1, 120};
         this.field_class_java_util_Vector_a.addElement(var5);
      }
   }

   // $FF: renamed from: a (byte, byte, short) void
   public final void func_void_a(byte var1, byte var2, short var3) {
      byte[] var4 = new byte[]{var1, var2, -1, (byte)(var3 / 100), (byte)(var3 % 100), 120};
      this.field_class_java_util_Vector_a.addElement(var4);
   }

   // $FF: renamed from: a (byte, byte) byte[]
   public final byte[] func_array_byte_a(byte var1, byte var2) {
      byte[] var3 = null;

      int var5;
      for(var5 = 0; var5 < this.field_class_java_util_Vector_a.size(); ++var5) {
         byte[] var4;
         if ((var4 = (byte[])((byte[])this.field_class_java_util_Vector_a.elementAt(var5)))[0] == var1 && var4[1] == var2) {
            if (var4[2] == -1) {
               var3 = var4;
               break;
            }

            if (var4[2] == 22) {
               if (class_n.func_class_ao_a().field_class_g_b.func_boolean_a(var4[2], var4[3], (int)var4[4])) {
                  var3 = var4;
                  break;
               }
            } else if (class_n.func_class_ao_a().field_class_g_a.func_boolean_a(var4[2], var4[3], (int)var4[4])) {
               var3 = var4;
               break;
            }
         }
      }

      if (var3 != null) {
         this.field_class_java_util_Vector_a.removeElementAt(var5);
         return var3;
      } else {
         return null;
      }
   }

   // $FF: renamed from: a (byte, byte) boolean
   public final boolean func_boolean_a(byte var1, byte var2) {
      for(int var4 = 0; var4 < this.field_class_java_util_Vector_a.size(); ++var4) {
         byte[] var3;
         if ((var3 = (byte[])((byte[])this.field_class_java_util_Vector_a.elementAt(var4)))[0] == var1 && var3[1] == var2) {
            return true;
         }
      }

      return false;
   }

   // $FF: renamed from: e () void
   public static final void func_void_e() {
      class_j.func_void_a((int)5);
      byte[] var0 = class_ce.func_array_byte_a("/enm/data" + (class_n.field_byte_g >= 2 ? 2 : class_n.field_byte_g));
      class_ce.field_array_byte_k[0] = 32;
      class_j.func_void_a(var0, (byte)32, (byte)0);
      class_ce.func_void_e((byte)1);
      class_j.func_void_b((byte)0);
   }

   // $FF: renamed from: f () void
   public final void func_void_f() {
      class_cc var1 = new class_cc((byte)10, (byte)9, (byte)32, (byte)0);
      this.func_void_b((class_ck)var1);
      var1.func_void_a((byte)1);
      var1.func_void_b((byte)2);
   }

   // $FF: renamed from: g () void
   public static final void func_void_g() {
      class_j.func_void_a((int)5);
      byte[] var0 = class_ce.func_array_byte_a("/enm/data" + (class_n.field_byte_g >= 2 ? 2 : class_n.field_byte_g));
      class_ce.field_array_byte_k[0] = 35;
      class_ce.field_array_byte_k[1] = 36;
      class_ce.field_array_byte_k[2] = 37;
      class_ce.field_array_byte_k[3] = 38;
      class_ce.field_array_byte_k[4] = 4;
      class_j.func_void_a(var0, (byte)35, (byte)0);
      class_j.func_void_a(var0, (byte)36, (byte)1);
      class_j.func_void_a(var0, (byte)37, (byte)2);
      class_j.func_void_a(var0, (byte)38, (byte)3);
      class_j.func_void_a(var0, (byte)4, (byte)4);
      class_ce.func_void_e((byte)2);
      class_ce.func_void_a((short)4, (byte)4, false);
      class_j.func_void_b((byte)0);
      class_j.func_void_b((byte)1);
      class_j.func_void_b((byte)2);
      class_j.func_void_b((byte)3);
      class_j.func_void_a((byte)4);
   }

   // $FF: renamed from: a (boolean) void
   public final void func_void_a(boolean var1) {
      if (var1) {
         class_ar var5 = new class_ar((byte)9, (byte)5, (byte)35, (byte)0);
         this.func_void_b((class_ck)var5);
         var5.func_void_a((byte)1);
         var5.func_void_b((byte)2);
      } else {
         class_ag var2 = new class_ag((byte)9, (byte)5, (byte)36, (byte)1);
         this.func_void_b((class_ck)var2);
         var2.func_void_a((byte)2);
         var2.func_void_b((byte)2);
         class_bd var3 = new class_bd((byte)6, (byte)5, (byte)37, (byte)2);
         this.func_void_b((class_ck)var3);
         var3.func_void_a((byte)2);
         var3.func_void_b((byte)2);
         class_cd var4 = new class_cd((byte)13, (byte)5, (byte)38, (byte)3);
         this.func_void_b((class_ck)var4);
         var4.func_void_a((byte)2);
         var4.func_void_b((byte)2);
         var4.func_void_a(var2, var3);
         var2.func_void_a(var4, var3);
      }
   }

   // $FF: renamed from: h () void
   public static final void func_void_h() {
      class_j.func_void_a((int)5);
      byte[] var0 = class_ce.func_array_byte_a("/enm/data" + (class_n.field_byte_g >= 2 ? 2 : class_n.field_byte_g));
      class_ce.field_array_byte_k[0] = 39;
      class_ce.field_array_byte_k[1] = 40;
      class_ce.field_array_byte_k[2] = 41;
      class_j.func_void_a(var0, (byte)39, (byte)0);
      class_j.func_void_a(var0, (byte)40, (byte)1);
      class_j.func_void_a(var0, (byte)41, (byte)2);
      class_ce.func_void_e((byte)3);
      class_j.func_void_b((byte)0);
      class_j.func_void_b((byte)1);
      class_j.func_void_b((byte)2);
   }

   // $FF: renamed from: i () void
   public final void func_void_i() {
      class_ba var1 = new class_ba(this, (byte)0, (byte)7, (byte)40, (byte)1);
      this.func_void_b((class_ck)var1);
      var1.func_void_a((byte)1);
      var1.func_void_b((byte)1);
      class_ak var2 = new class_ak(this, (byte)13, (byte)7, (byte)41, (byte)2);
      this.func_void_b((class_ck)var2);
      var2.func_void_a((byte)1);
      var2.func_void_b((byte)1);
      class_cg var3 = new class_cg((byte)7, (byte)7, (byte)39, (byte)0, var1, var2);
      this.func_void_b((class_ck)var3);
      var3.func_void_a((byte)2);
      var3.func_void_b((byte)1);
   }

   // $FF: renamed from: j () void
   public static final void func_void_j() {
      byte[] var0 = class_ce.func_array_byte_a("/enm/data" + (class_n.field_byte_g >= 2 ? 2 : class_n.field_byte_g));
      class_ce.field_array_byte_k[1] = 42;
      class_j.func_void_a(var0, (byte)42, (byte)1);
      class_ce.func_void_e((byte)4);
      class_j.func_void_b((byte)1);
   }

   // $FF: renamed from: k () void
   public final void func_void_k() {
      class_bv var1 = new class_bv(this, (byte)7, (byte)10, (byte)42, (byte)1);
      this.func_void_b((class_ck)var1);
      var1.func_void_a((byte)1);
      var1.func_void_b((byte)2);
   }

   static {
      String[] var10000 = new String[]{"SET_TILE", "SET_COLI", "OBJ_XY  ", "OBJ_DEL ", "NPC_XY  ", "NPC_DEL ", "ENM_XY  ", "ENM_DEL ", "END     ", "OBJ_NUM ", "NPC_NUM ", "EMO_HERO", "EMO_NPC "};
      field_byte_d = -1;
   }
}
