package rpg;

import javax.microedition.lcdui.Graphics;

// $FF: renamed from: ah
public final class class_ah implements class_u {
   // $FF: renamed from: a byte
   private static byte field_byte_a;
   // $FF: renamed from: a int
   private static int field_int_a;
   // $FF: renamed from: b int
   private static int field_int_b;
   // $FF: renamed from: b boolean
   private static boolean field_boolean_b;
   // $FF: renamed from: a char[]
   private static char[] field_array_char_a;
   // $FF: renamed from: c int
   private static int field_int_c;
   // $FF: renamed from: d int
   private static int field_int_d;
   // $FF: renamed from: e int
   private static int field_int_e;
   // $FF: renamed from: f int
   private static int field_int_f;
   // $FF: renamed from: c boolean
   private static boolean field_boolean_c;
   // $FF: renamed from: d boolean
   private static boolean field_boolean_d;
   // $FF: renamed from: b byte[][]
   private static byte[][] field_array_array_byte_b;
   // $FF: renamed from: e boolean
   private static boolean field_boolean_e;
   // $FF: renamed from: b byte
   private static byte field_byte_b;
   // $FF: renamed from: c byte
   private static byte field_byte_c;
   // $FF: renamed from: d byte
   private static byte field_byte_d;
   // $FF: renamed from: h byte[]
   private static byte[] field_array_byte_h;
   // $FF: renamed from: e byte
   private static byte field_byte_e;
   // $FF: renamed from: f byte
   private static byte field_byte_f;
   // $FF: renamed from: b char[]
   private static char[] field_array_char_b;
   // $FF: renamed from: c char[]
   private static char[] field_array_char_c;
   // $FF: renamed from: f boolean
   private static boolean field_boolean_f;
   // $FF: renamed from: a boolean
   public static boolean field_boolean_a;
   // $FF: renamed from: g boolean
   private static boolean field_boolean_g;

   private class_ah() {
   }

   // $FF: renamed from: a (ao) boolean
   public static final boolean func_boolean_a(class_ao var0) {
      if (!var0.field_boolean_a && !var0.field_boolean_b) {
         byte var1;
         return (var1 = class_n.field_class_ae_a.field_array_array_byte_c[var0.field_byte_b][var0.field_byte_a]) == 0 ? false : func_boolean_a((byte)0, var1);
      } else {
         return false;
      }
   }

   // $FF: renamed from: a () boolean
   public static final boolean func_boolean_a() {
      class_ao var0;
      if (!(var0 = class_n.func_class_ao_a()).field_boolean_a && !var0.field_boolean_b) {
         byte var1;
         if ((var1 = (byte)Math.abs(class_n.field_class_ae_a.field_array_array_byte_c[var0.field_byte_b][var0.field_byte_a])) >= 1 && var1 <= 127 && func_boolean_a((byte)1, var1)) {
            return true;
         } else {
            return (var1 = (byte)Math.abs(class_n.field_class_ae_a.field_array_array_byte_c[var0.field_byte_b + class_u.field_array_byte_b[var0.field_byte_i]][var0.field_byte_a + class_u.field_array_byte_a[var0.field_byte_i]])) >= 1 && var1 <= 127 && func_boolean_a((byte)2, var1);
         }
      } else {
         return false;
      }
   }

   // $FF: renamed from: b () boolean
   public static final boolean func_boolean_b() {
      class_ao var0;
      if (!(var0 = class_n.func_class_ao_a()).field_boolean_a && !var0.field_boolean_b) {
         boolean var1 = false;
         byte var2;
         return (var2 = (byte)Math.abs(class_n.field_class_ae_a.field_array_array_byte_c[var0.field_byte_b + class_u.field_array_byte_b[var0.field_byte_i]][var0.field_byte_a + class_u.field_array_byte_a[var0.field_byte_i]])) >= 1 && var2 <= 127 ? func_boolean_a((byte)3, var2) : false;
      } else {
         return false;
      }
   }

   // $FF: renamed from: a (byte) void
   public static final void func_void_a(byte var0) {
      func_boolean_a((byte)0, var0);
   }

   // $FF: renamed from: a (byte, byte) boolean
   private static final boolean func_boolean_a(byte var0, byte var1) {
      byte[][] var2 = (byte[][])((byte[][])class_n.field_class_ae_a.field_array_class_java_lang_Object_a[var1 - 1]);
      byte[] var3 = null;

      for(int var4 = 0; var4 < var2.length && (((var3 = var2[var4])[0] >> 6 & 3) != var0 || !func_boolean_a(var3)); ++var4) {
         var3 = null;
      }

      if (var3 == null) {
         return false;
      } else if (var3[6] == -1) {
         return false;
      } else {
         func_void_a((byte[][])((byte[][])class_n.field_class_ae_a.field_array_class_java_lang_Object_b[var3[6]]));
         return true;
      }
   }

   // $FF: renamed from: a (byte) boolean
   public static final boolean func_boolean_a(byte var0) {
      byte[][] var1 = (byte[][])((byte[][])class_n.field_class_ae_a.field_array_class_java_lang_Object_a[var0 - 1]);

      for(int var2 = 0; var2 < var1.length; ++var2) {
         if (func_boolean_a(var1[var2])) {
            return true;
         }
      }

      return false;
   }

   // $FF: renamed from: a (byte[]) boolean
   private static final boolean func_boolean_a(byte[] var0) {
      class_ao var1 = class_n.func_class_ao_a();
      int var2 = (var0[0] & 12) << 6 | var0[1] & 255;
      int var3 = (var0[0] & 3) << 8 | var0[2] & 255;
      boolean var4 = ((var0[0] & 255) >> 5 & 1) == 0;
      boolean var5 = ((var0[0] & 255) >> 4 & 1) == 0;
      class_x.func_void_a(var2 != -1);
      class_x.func_void_a(var3 != -1);
      if (var4 && !class_n.func_boolean_a(var2)) {
         return false;
      } else if (!var4 && !class_n.func_boolean_b(var2)) {
         return false;
      } else if (var5 && !class_n.func_boolean_a(var3)) {
         return false;
      } else if (!var5 && !class_n.func_boolean_b(var3)) {
         return false;
      } else {
         return var0[3] == -1 || var1.field_class_g_a.func_boolean_a(var0[3], var0[4], var0[5]);
      }
   }

   // $FF: renamed from: b (byte) void
   private static final void func_void_b(byte var0) {
      field_int_b = 0;
      field_byte_a = var0;
   }

   // $FF: renamed from: a (byte[][]) void
   private static final void func_void_a(byte[][] var0) {
      field_boolean_a = false;
      field_array_array_byte_b = var0;
      class_n.func_void_a((int)4);
      class_n.func_void_k();
      field_int_a = 0;
      func_void_b((byte)0);
      field_byte_b = -1;
      field_boolean_e = true;
      field_byte_f = 0;
   }

   // $FF: renamed from: c () void
   private static final void func_void_c() {
      field_byte_a = 0;
      field_array_array_byte_b = (byte[][])null;
      field_boolean_a = false;
      field_byte_b = -1;
      field_boolean_e = true;
      class_bs.field_class_as_a.func_void_b();
      class_ac[] var0 = class_n.field_class_ae_a.field_array_class_ac_a;

      for(int var1 = 0; var1 < var0.length; ++var1) {
         if (var0[var1] != null && var0[var1].field_boolean_d) {
            var0[var1].func_void_g();
         }
      }

      SoundPlayerManager.stopPlayer2();
   }

   // $FF: renamed from: a (int, int) void
   public static final void func_void_a(int var0, int var1) {
      if (var1 == -8) {
         field_boolean_a = true;
      }

      switch(field_byte_a) {
      case 2:
         if (var0 != 8 && var1 != 53) {
            break;
         }

         field_boolean_b = true;
         return;
      case 3:
         if (var0 != 6 && var0 != 1 && var1 != 50 && var1 != 56) {
            if (var0 == 8 || var1 == 53) {
               field_boolean_d = true;
               return;
            }
            break;
         }

         field_boolean_c = !field_boolean_c;
         return;
      case 4:
         if (var0 == 8 || var1 == 53) {
            field_boolean_f = true;
         }
      }

   }

   // $FF: renamed from: a () void
   public static final void func_void_a() {
      if (field_byte_a != 3 && field_boolean_a) {
         field_boolean_b = true;
         field_boolean_f = true;
      }

      class_ao var0 = class_n.func_class_ao_a();
      if (field_byte_a == 0) {
         class_ac var1;
         byte var4;
         switch(field_array_array_byte_b[field_int_a][0]) {
         case 1:
            if (field_boolean_a) {
               ++field_int_a;
            } else {
               field_array_char_a = (char[])((char[])class_n.field_class_ae_a.field_array_class_java_lang_Object_c[field_array_array_byte_b[field_int_a][1]]);
               field_int_c = 0;
               field_int_d = UIGeneral.func_int_a((char[])field_array_char_a, field_int_c, MyGameCanvas.canvasWidth - 28, 3);
               field_int_e = 0;
               field_int_f = 0;
               func_void_b((byte)2);
            }
            break;
         case 2:
            field_boolean_d = false;
            field_boolean_c = true;
            field_boolean_a = false;
            func_void_b((byte)3);
            break;
         case 3:
         case 4:
         case 5:
         case 6:
         case 15:
         case 16:
         case 17:
         case 34:
         case 35:
         case 36:
         case 37:
         case 38:
         case 39:
            func_void_b((byte)1);
            break;
         case 7:
            func_void_i();
            func_void_c();
            break;
         case 8:
            func_void_s();
            break;
         case 9:
            func_void_j();
            break;
         case 10:
            func_void_p();
            break;
         case 11:
            func_void_q();
            break;
         case 12:
            func_void_o();
            break;
         case 13:
            func_void_m();
            break;
         case 14:
            func_void_n();
            break;
         case 18:
            func_void_r();
            break;
         case 19:
            func_void_l();
            break;
         case 20:
            func_void_c();
            class_bs.field_class_as_a.func_void_g();
            class_n.func_void_a((int)12);
         case 21:
         case 28:
         case 33:
         case 43:
         case 51:
         case 52:
         case 53:
         case 54:
         case 55:
         case 56:
         case 57:
         case 58:
         case 59:
         case 60:
         case 61:
         case 62:
         case 63:
         case 64:
         case 65:
         case 66:
         case 67:
         case 68:
         case 69:
         case 70:
         case 71:
         case 72:
         case 73:
         case 74:
         case 75:
         case 76:
         case 77:
         case 78:
         case 79:
         case 80:
         case 81:
         case 82:
         case 83:
         case 84:
         case 85:
         case 86:
         case 87:
         case 88:
         case 89:
         case 90:
         case 91:
         case 92:
         case 93:
         case 94:
         case 95:
         case 96:
         case 97:
         case 98:
         default:
            break;
         case 22:
            field_byte_f = 1;
            ++field_int_a;
            break;
         case 23:
            field_byte_f = 0;
            ++field_int_a;
            break;
         case 24:
            field_byte_e = 5;
            func_void_b((byte)5);
            break;
         case 25:
            field_array_byte_h = new byte[6];

            for(var4 = 0; var4 < 6; ++var4) {
               field_array_byte_h[var4] = (byte)class_h.func_int_a(-5, 5);
            }

            func_void_b((byte)5);
            break;
         case 26:
         case 29:
            var4 = field_array_array_byte_b[field_int_a][1];
            System.out.println("=====[EVENT BGM] " + var4);
            if (var4 != 5 && var4 != 6 && var4 != 7) {
               if (var4 == 8) {
                  SoundPlayerManager.startPlayer3(var4, false);
               }
            } else {
               SoundPlayerManager.startPlayer2(var4);
            }

            ++field_int_a;
            break;
         case 27:
            SoundPlayerManager.stopPlayer2();
            ++field_int_a;
            break;
         case 30:
            func_void_k();
            break;
         case 31:
            field_int_a += field_array_array_byte_b[field_int_a][1];
            break;
         case 32:
            field_int_a -= field_array_array_byte_b[field_int_a][1];
            break;
         case 40:
            func_void_u();
            break;
         case 41:
            func_void_v();
            break;
         case 42:
            func_void_t();
            break;
         case 44:
            class_n.func_void_a((byte)11, (byte)2);
            func_void_c();
            return;
         case 45:
            class_n.func_void_a((byte)11, (byte)0);
            func_void_c();
            return;
         case 46:
            (var1 = class_n.field_class_ae_a.field_array_class_ac_a[field_array_array_byte_b[field_int_a++][1]]).field_boolean_d = false;
            var1.func_void_f();
            break;
         case 47:
            (var1 = class_n.field_class_ae_a.field_array_class_ac_a[field_array_array_byte_b[field_int_a++][1]]).field_boolean_d = true;
            var1.func_void_a(var1.field_short_c, var1.field_short_d);
            break;
         case 48:
            class_n.func_void_a((byte)11, (byte)1);
            func_void_c();
            return;
         case 49:
            byte var2 = field_array_array_byte_b[field_int_a][1];
            var0.func_void_c();
            if (var2 != 0) {
               var0.func_void_a(new class_aw((byte)10, (short)-1, (short)(var2 - 1)));
            }

            ++field_int_a;
            break;
         case 50:
            var1 = class_n.field_class_ae_a.field_array_class_ac_a[field_array_array_byte_b[field_int_a][1]];
            byte var3 = field_array_array_byte_b[field_int_a][2];
            var1.func_void_c();
            if (var3 != 0) {
               var1.func_void_a(new class_aw((byte)10, (short)-1, (short)(var3 - 1)));
            }

            ++field_int_a;
            break;
         case 99:
            func_void_c();
            class_n.func_void_a((int)2);
            return;
         }
      }

      switch(field_byte_a) {
      case 1:
         func_void_d();
         class_n.func_void_n();
         class_n.field_class_ae_a.func_void_c();
         break;
      case 2:
         func_void_e();
         break;
      case 3:
         func_void_f();
         break;
      case 4:
         func_void_g();
         break;
      case 5:
         func_void_h();
      }

      if (field_array_array_byte_b != null && field_int_a >= field_array_array_byte_b.length) {
         func_void_c();
         class_n.func_void_a((int)2);
      }

   }

   // $FF: renamed from: d () void
   private static final void func_void_d() {
      if (field_int_b > 0) {
         --field_int_b;
         if (field_int_b == 0) {
            ++field_int_a;
         }

      } else {
         for(class_ao var0 = class_n.func_class_ao_a(); field_int_a < field_array_array_byte_b.length && field_array_array_byte_b[field_int_a][0] != 4; ++field_int_a) {
            switch(field_array_array_byte_b[field_int_a][0]) {
            case 3:
               var0.func_void_a((byte)2);
               var0.func_void_b(field_array_array_byte_b[field_int_a][1]);
               break;
            case 4:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            default:
               func_void_b((byte)0);
               return;
            case 5:
               var0.func_void_a((byte)1);
               break;
            case 6:
               var0.func_void_b(field_array_array_byte_b[field_int_a][1]);
               break;
            case 15:
               class_ac var1;
               (var1 = class_n.field_class_ae_a.field_array_class_ac_a[field_array_array_byte_b[field_int_a][1]]).func_void_a((byte)2);
               var1.func_void_b(field_array_array_byte_b[field_int_a][2]);
               break;
            case 16:
               class_n.field_class_ae_a.field_array_class_ac_a[field_array_array_byte_b[field_int_a][1]].func_void_a((byte)1);
               break;
            case 17:
               class_n.field_class_ae_a.field_array_class_ac_a[field_array_array_byte_b[field_int_a][1]].func_void_b(field_array_array_byte_b[field_int_a][2]);
               break;
            case 34:
               func_void_w();
               field_boolean_e = true;
               func_void_b();
               class_n.field_int_c = class_n.field_int_a;
               class_n.field_int_d = class_n.field_int_b;
               break;
            case 35:
               func_void_w();
               break;
            case 36:
               func_void_w();
               field_byte_b = field_array_array_byte_b[field_int_a][1];
               break;
            case 37:
               func_void_w();
               field_byte_c = field_array_array_byte_b[field_int_a][1];
               field_byte_d = field_array_array_byte_b[field_int_a][2];
               break;
            case 38:
               func_void_w();
               break;
            case 39:
               func_void_w();
               class_n.field_int_a = -(field_array_array_byte_b[field_int_a][1] * 16) + MyGameCanvas.canvasHalfWidth;
               class_n.field_int_b = -(field_array_array_byte_b[field_int_a][2] * 16) + MyGameCanvas.field_int_j;
            }
         }

         if (field_int_a != field_array_array_byte_b.length) {
            field_int_b = field_array_array_byte_b[field_int_a][1] - 1;
            if (field_int_b == 0) {
               ++field_int_a;
            }
         }

      }
   }

   // $FF: renamed from: e () void
   private static final void func_void_e() {
      if (field_int_e < field_int_d) {
         if (!field_boolean_b && !class_bs.field_class_bs_a.field_boolean_c) {
            field_int_e = UIGeneral.func_int_a(field_array_char_a, field_int_c, field_int_e);
            if (field_int_e + 1 >= field_int_d) {
               field_int_e = field_int_d;
            }
         } else {
            field_int_e = field_int_d;
         }
      } else if (field_int_c + field_int_d >= field_array_char_a.length && field_boolean_b) {
         field_array_char_a = null;
         ++field_int_a;
         func_void_b((byte)0);
      } else if (field_boolean_b) {
         field_int_c += field_int_d;
         field_int_d = UIGeneral.func_int_a((char[])field_array_char_a, field_int_c, MyGameCanvas.canvasWidth - 28, 3);
         field_int_e = 0;
         field_int_f = 0;
      }

      field_boolean_b = false;
   }

   // $FF: renamed from: f () void
   private static final void func_void_f() {
      if (field_boolean_g) {
         if (field_boolean_d) {
            if (field_boolean_c) {
               try {
                  System.out.println("save!!!!!!");
                  class_n.func_void_o();
               } catch (Exception var1) {
                  var1.printStackTrace();
               }
            }

            func_void_i();
            func_void_c();
            field_boolean_g = false;
         }

      } else {
         if (field_boolean_d) {
            if (field_boolean_c) {
               ++field_int_a;
               func_void_b((byte)0);
               return;
            }

            field_int_a += field_array_array_byte_b[field_int_a][2];
            func_void_b((byte)0);
         }

      }
   }

   // $FF: renamed from: g () void
   private static final void func_void_g() {
      if (field_boolean_f) {
         field_array_char_b = null;
         field_array_char_c = null;
         func_void_c();
         class_n.func_void_a((int)2);
      }

   }

   // $FF: renamed from: h () void
   private static final void func_void_h() {
      switch(field_array_array_byte_b[field_int_a][0]) {
      case 24:
         if (field_byte_e > 0) {
            if (field_byte_e % 2 == 1) {
               field_byte_f = 2;
            } else {
               field_byte_f = 0;
            }

            --field_byte_e;
            return;
         } else {
            func_void_b((byte)0);
            ++field_int_a;
            field_byte_f = 0;
         }
      default:
         return;
      case 25:
         if (field_array_byte_h != null && field_array_byte_h.length > 0) {
            class_n.field_class_ae_a.field_int_e = field_array_byte_h[0];
            class_n.field_class_ae_a.field_int_f = field_array_byte_h[1];
            byte[] var0 = new byte[field_array_byte_h.length - 2];
            System.arraycopy(field_array_byte_h, 2, var0, 0, var0.length);
            field_array_byte_h = var0;
         } else {
            func_void_b((byte)0);
            ++field_int_a;
         }
      }
   }

   // $FF: renamed from: i () void
   private static final void func_void_i() {
      byte var0 = field_array_array_byte_b[field_int_a][1];
      byte var1 = field_array_array_byte_b[field_int_a][2];
      ++field_int_a;
      if (field_array_array_byte_b[field_int_a][0] != 8) {
         System.out.println("[ERROR:EventScript] No hero position after map change.");
      } else {
         byte var2 = field_array_array_byte_b[field_int_a][1];
         byte var3 = field_array_array_byte_b[field_int_a][2];
         class_n.func_void_b(var0, var1, var2, var3);
      }
   }

   // $FF: renamed from: j () void
   private static final void func_void_j() {
      int var0 = field_array_array_byte_b[field_int_a][1] & 255 | (field_array_array_byte_b[field_int_a][2] & 255) << 2 & 768;
      switch(field_array_array_byte_b[field_int_a][2] & 3) {
      case 0:
         class_n.func_void_b(var0);
         break;
      case 1:
         class_n.func_void_c(var0);
         break;
      case 2:
         class_n.func_void_d(var0);
      }

      ++field_int_a;
   }

   // $FF: renamed from: k () void
   private static final void func_void_k() {
      int var0 = field_array_array_byte_b[field_int_a][1] & 255 | (field_array_array_byte_b[field_int_a][2] & 255) << 2 & 768;
      switch(field_array_array_byte_b[field_int_a][2] & 3) {
      case 0:
         class_n.func_void_e(var0);
         break;
      case 1:
         class_n.func_void_f(var0);
         break;
      case 2:
         class_n.func_void_g(var0);
      }

      ++field_int_a;
   }

   // $FF: renamed from: l () void
   private static final void func_void_l() {
      class_n.func_class_ao_a().func_void_d(field_array_array_byte_b[field_int_a][1]);
      ++field_int_a;
   }

   // $FF: renamed from: m () void
   private static final void func_void_m() {
      int var0 = field_array_array_byte_b[field_int_a][2] & 255 | (field_array_array_byte_b[field_int_a][1] & 255) << 8;
      class_n.func_class_ao_a().func_void_b(var0);
      ++field_int_a;
   }

   // $FF: renamed from: n () void
   private static final void func_void_n() {
      int var0 = field_array_array_byte_b[field_int_a][2] & 255 | (field_array_array_byte_b[field_int_a][1] & 255) << 8;
      class_n.func_class_ao_a().func_void_d(var0);
      ++field_int_a;
   }

   // $FF: renamed from: o () void
   private static final void func_void_o() {
      int var0 = field_array_array_byte_b[field_int_a][2] & 255 | (field_array_array_byte_b[field_int_a][1] & 255) << 8;
      class_n.func_class_ao_a().func_void_f(var0);
      ++field_int_a;
   }

   // $FF: renamed from: p () void
   private static final void func_void_p() {
      int var0 = field_array_array_byte_b[field_int_a][2] & 255 | (field_array_array_byte_b[field_int_a][1] & 255) << 8;
      class_n.func_class_ao_a().func_void_g(var0);
      ++field_int_a;
   }

   // $FF: renamed from: q () void
   private static final void func_void_q() {
      byte var0 = field_array_array_byte_b[field_int_a][1];
      byte var1 = field_array_array_byte_b[field_int_a][2];
      ++field_int_a;
      if (field_array_array_byte_b[field_int_a][0] != 21) {
         System.out.println("[ERROR:EventScript] No CMD_HANDLE_ITEM_NUM after CMD_HANDLE_ITEM.");
      } else {
         class_ao var2 = class_n.func_class_ao_a();
         byte var3 = field_array_array_byte_b[field_int_a][1];
         ++field_int_a;
         if (var3 > 0) {
            class_ad var4;
            if ((var4 = class_ad.func_class_ad_a(var0, var1, true, true)) instanceof class_e) {
               ((class_e)var4).field_boolean_b = true;
            }

            if (!var2.field_class_g_a.func_boolean_a(var4, var3)) {
               func_void_a(BabbleText.instance.getTextById(3938).toCharArray(), "".toCharArray());
            }

         } else {
            if (var3 < 0) {
               var3 = (byte)(-var3);
               if (var2.field_class_g_a.func_int_a(var0, var1) >= var3) {
                  var2.field_class_g_a.func_void_a(var0, var1, var3);
                  return;
               }

               func_void_a(BabbleText.instance.getTextById(3939).toCharArray(), "".toCharArray());
            }

         }
      }
   }

   // $FF: renamed from: r () void
   private static final void func_void_r() {
      byte var0;
      switch(field_array_array_byte_b[field_int_a][1]) {
      case 0:
         var0 = 4;
         break;
      case 1:
         var0 = 3;
         break;
      case 2:
         var0 = 5;
         break;
      default:
         return;
      }

      ++field_int_a;
      class_n.func_class_ao_a().func_class_p_a(var0);
   }

   // $FF: renamed from: s () void
   private static final void func_void_s() {
      class_ao var0;
      (var0 = class_n.func_class_ao_a()).func_void_f();
      var0.func_void_a((short)(field_array_array_byte_b[field_int_a][1] * 16), (short)(field_array_array_byte_b[field_int_a][2] * 16));
      var0.func_void_g();
      ++field_int_a;
   }

   // $FF: renamed from: t () void
   private static final void func_void_t() {
      class_ae var0 = class_n.field_class_ae_a;
      byte var1 = field_array_array_byte_b[field_int_a][1];
      byte var2 = field_array_array_byte_b[field_int_a][2];
      ++field_int_a;
      if (field_array_array_byte_b[field_int_a][0] != 43) {
         System.out.println("[ERROR:EventScript] No CMD_TILE_PROPERTY after CMD_CHANGE_TILE.");
      } else {
         byte var3 = field_array_array_byte_b[field_int_a][1];
         byte var4 = field_array_array_byte_b[field_int_a][2];
         ++field_int_a;
         var0.field_array_array_byte_c[var2][var1] = var4;
         var0.field_array_array_byte_b[var2][var1] = var3;
      }
   }

   // $FF: renamed from: u () void
   private static final void func_void_u() {
      class_ae var0 = class_n.field_class_ae_a;
      byte var1 = field_array_array_byte_b[field_int_a][1];
      byte var2 = field_array_array_byte_b[field_int_a][2];
      ++field_int_a;
      var0.field_array_class_aj_a[var1].field_class_javax_microedition_lcdui_Image_a = class_ce.field_array_class_javax_microedition_lcdui_Image_f[var2];
   }

   // $FF: renamed from: v () void
   private static final void func_void_v() {
      class_ae var0 = class_n.field_class_ae_a;
      byte var1 = field_array_array_byte_b[field_int_a][1];
      byte var2 = field_array_array_byte_b[field_int_a][2];
      ++field_int_a;
      var0.field_array_class_ac_a[var1].field_byte_f = var2;
   }

   // $FF: renamed from: a (javax.microedition.lcdui.Graphics) void
   public static final void func_void_a(Graphics var0) {
      if (field_byte_a != 0) {
         class_n.func_void_a(false, false);
         if (field_byte_a == 3 || !field_boolean_a) {
            if (field_byte_f == 0) {
               class_n.field_class_ae_a.func_void_a(var0);
            } else {
               if (field_byte_f == 1) {
                  var0.setColor(0);
               } else if (field_byte_f == 2) {
                  var0.setColor(16777215);
               }

               var0.fillRect(0, 0, class_as.field_int_a, class_as.field_int_b);
            }

            class_bs.field_class_as_a.func_void_a(var0);
            switch(field_byte_a) {
            case 2:
               func_void_b(var0);
               class_bs.field_class_as_a.func_void_b();
               UIGeneral.func_void_a(var0, UIGeneral.labelTextNext, UIGeneral.labelTextSkip);
               return;
            case 3:
               func_void_c(var0);
               UIGeneral.func_void_a(var0, UIGeneral.labelTextOk, (char[])null);
               return;
            case 4:
               func_void_a(var0, (MyGameCanvas.canvasWidth >> 1) - 60, (MyGameCanvas.field_int_h >> 1) - 25, 120, 45, field_array_char_b, field_array_char_c);
               UIGeneral.func_void_a(var0, UIGeneral.labelTextOk, (char[])null);
            default:
            }
         }
      }
   }

   // $FF: renamed from: b (javax.microedition.lcdui.Graphics) void
   private static final void func_void_b(Graphics var0) {
      int var1 = MyGameCanvas.canvasWidth - 8;
      boolean var2 = false;
      int var3 = MyGameCanvas.canvasHalfWidth - var1 / 2;
      int var4 = MyGameCanvas.field_int_h - 41 - 10;
      var0.translate(var3, var4);
      var0.setColor(2039615);
      var0.drawRect(0, 0, var1 - 1, 40);
      var0.setColor(6250367);
      var0.drawRect(1, 1, var1 - 3, 38);
      var0.setColor(0);
      var0.fillRect(2, 2, var1 - 4, 37);
      var0.drawImage(class_ce.field_array_class_javax_microedition_lcdui_Image_r[0], 2, 2, 20);
      var0.drawImage(class_ce.field_array_class_javax_microedition_lcdui_Image_r[1], 0 + var1 - 2, 2, 24);
      var0.drawImage(class_ce.field_array_class_javax_microedition_lcdui_Image_r[2], 2, 39, 36);
      var0.drawImage(class_ce.field_array_class_javax_microedition_lcdui_Image_r[3], 0 + var1 - 2, 39, 40);
      var0.setColor(16777215);
      UIGeneral.func_void_c(var0, 10, 5, var1 - 20, 1, field_array_char_a, field_int_c, field_int_f, field_int_e);
      field_int_f = field_int_e;
      var0.translate(-var3, -var4);
      var0.setClip(0, 0, MyGameCanvas.canvasWidth, MyGameCanvas.field_int_h);
      byte var5;
      if ((var5 = field_array_array_byte_b[field_int_a][2]) > 0) {
         var0.drawImage(class_ce.field_array_class_javax_microedition_lcdui_Image_h[var5 - 1], var3, var4, 36);
      } else {
         if (var5 < 0) {
            var0.drawImage(class_ce.field_array_class_javax_microedition_lcdui_Image_h[-var5 - 1], var3 + var1, var4, 40);
         }

      }
   }

   // $FF: renamed from: c (javax.microedition.lcdui.Graphics) void
   private static final void func_void_c(Graphics var0) {
      try {
         char[] var1 = field_boolean_g ? BabbleText.instance.getTextById(3940).toCharArray() : (char[])((char[])class_n.field_class_ae_a.field_array_class_java_lang_Object_c[field_array_array_byte_b[field_int_a][1]]);
         Object[] var2 = new Object[]{var1, BabbleText.instance.getTextById(3915).toCharArray(), BabbleText.instance.getTextById(3916).toCharArray()};
         int var3 = UIGeneral.func_int_a(MyGameCanvas.canvasWidth, 70);
         func_void_a(var0, MyGameCanvas.canvasHalfWidth - (var3 >> 1), MyGameCanvas.field_int_j - 30, var3, 60, var2, 6, 1, field_boolean_c ? 1 : 2);
      } catch (Exception var4) {
      }
   }

   // $FF: renamed from: a (javax.microedition.lcdui.Graphics, int, int, int, int, java.lang.Object[], int, int, int) void
   public static final void func_void_a(Graphics var0, int var1, int var2, int var3, int var4, Object[] var5, int var6, int var7, int var8) {
      class_cb.func_void_a(var0, var1, var2, var3, var4);
      class_cb.func_void_b(var0, var1, var2, var3, var4);
      var0.setColor(255, 255, 255);
      var2 += 6;

      for(int var9 = 0; var9 < var5.length; ++var9) {
         if (var9 >= var7 && var7 != -1) {
            UIGeneral.func_int_a(var0, var1 + var6 + 9, var2, (char[])((char[])var5[var9]), 1);
            if (var9 == var8) {
               var0.drawImage(class_ce.field_class_javax_microedition_lcdui_Image_d, var1 + var6, var2, 20);
            }

            var2 += UIGeneral.func_int_a() + 3;
         } else {
            var2 += UIGeneral.func_int_a(var0, var1 + var6, var2, var3 - var6 - var6, 1, (char[])((char[])var5[var9]));
            var2 += 5;
         }
      }

   }

   // $FF: renamed from: a (javax.microedition.lcdui.Graphics, int, int, int, int, char[], char[]) void
   public static final void func_void_a(Graphics var0, int var1, int var2, int var3, int var4, char[] var5, char[] var6) {
      class_cb.func_void_a(var0, var1, var2, var3, var4);
      class_cb.func_void_b(var0, var1, var2, var3, var4);
      var0.setColor(255, 255, 255);
      UIGeneral.func_int_a(var0, var1 + 6, var2 + 7, var5, 1);
      UIGeneral.func_int_a(var0, var1 + 6, var2 + 23, var6, 1);
   }

   // $FF: renamed from: w () void
   private static void func_void_w() {
      field_boolean_e = false;
      field_byte_b = -1;
      field_byte_c = 0;
      field_byte_d = 0;
   }

   // $FF: renamed from: a (char[], char[]) void
   private static final void func_void_a(char[] var0, char[] var1) {
      field_array_char_b = var0;
      field_array_char_c = var1;
      field_boolean_f = false;
      func_void_b((byte)4);
   }

   // $FF: renamed from: b () void
   public static final void func_void_b() {
      if (field_boolean_e) {
         class_n.func_void_g();
      } else {
         if (!field_boolean_e && field_byte_b == -1 && field_byte_c != 0) {
            class_n.field_int_a -= field_byte_d * class_u.field_array_byte_a[field_byte_c];
            class_n.field_int_b -= field_byte_d * class_u.field_array_byte_b[field_byte_c];
         }

      }
   }

   static {
      String[] var10000 = new String[]{"CMD_IDLE", "TALKTEXT", "YES/NO  ", "MV_H_MOV", "MV_DELAY", "MV_H_STP", "MV_H_DIR", "MAP_CHNG", "MAP_HERO", "SWI_DEF ", "MONEY   ", "ITEM    ", "EXP     ", "HP      ", "SP      ", "MV_N_MOV", "MV_N_STP", "MV_N_DIR", "GUARDIAN", "COMBO   ", "GAMEOVER", "ITEM_NUM", "SCR_DEL ", "SCR_SHOW", "SCR_FLAS", "SCR_SHAK", "BGM_PLAY", "BGM_STOP", "SYSBGM  ", "SOUND   ", "SWI_QUE ", "GOTO_FOR", "GOTO_BAK", "SWI_MAP ", "MV_FO_HE", "MV_FO_NO", "MV_FO_NP", "MV_CA_MV", "MV_CA_ST", "MV_CA_XY", "CHG_OBJ ", "CHG_NPC ", "CHGTL_XY", "CHGTL_VA", "OPN_BLAK", "OPEN_SHP", "HIDE_NPC", "SHOW_NPC", "OPN_REFI", "EMO_HERO", "EMO_NPC ", null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, "END_EVNT"};
      field_byte_a = 0;
      field_int_a = 0;
      field_int_b = 0;
      field_boolean_b = false;
      field_array_char_a = null;
      field_int_c = 0;
      field_int_d = 0;
      field_int_e = 0;
      field_int_f = 0;
      field_boolean_c = true;
      field_boolean_d = false;
      field_boolean_e = true;
      field_byte_b = -1;
      field_byte_c = 0;
      field_byte_d = 0;
      field_byte_f = 0;
      field_boolean_a = false;
   }
}
