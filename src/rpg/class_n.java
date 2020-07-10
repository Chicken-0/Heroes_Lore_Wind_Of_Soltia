package rpg;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

// $FF: renamed from: n
public final class class_n implements class_u {
   // $FF: renamed from: h byte[]
   private static byte[] field_array_byte_h = new byte[]{60, 30, 10};
   // $FF: renamed from: i byte[]
   private static byte[] field_array_byte_i = new byte[]{5, 11, 8, 81, 3, 20};
   // $FF: renamed from: j byte[]
   private static final byte[] field_array_byte_j = new byte[]{0, 22, 4, 60, 5, 36, 77, 10, 18};
   // $FF: renamed from: a java.lang.String[]
   public static final String[] field_array_class_java_lang_String_a = new String[]{"/k", "/s", "/w"};
   // $FF: renamed from: a ae
   public static class_ae field_class_ae_a;
   // $FF: renamed from: a int
   public static int field_int_a;
   // $FF: renamed from: b int
   public static int field_int_b;
   // $FF: renamed from: c int
   public static int field_int_c;
   // $FF: renamed from: d int
   public static int field_int_d;
   // $FF: renamed from: a ao
   private static class_ao field_class_ao_a;
   // $FF: renamed from: a byte
   public static byte field_byte_a;
   // $FF: renamed from: e int
   public static int field_int_e = 0;
   // $FF: renamed from: b byte
   public static byte field_byte_b = 0;
   // $FF: renamed from: c byte
   public static byte field_byte_c;
   // $FF: renamed from: d byte
   public static byte field_byte_d;
   // $FF: renamed from: e byte
   public static byte field_byte_e;
   // $FF: renamed from: f byte
   public static byte field_byte_f;
   // $FF: renamed from: h byte
   private static byte field_byte_h = 0;
   // $FF: renamed from: i byte
   private static byte field_byte_i = 0;
   // $FF: renamed from: k byte[]
   private static byte[] field_array_byte_k = new byte[128];
   // $FF: renamed from: l byte[]
   private static byte[] field_array_byte_l = new byte[128];
   // $FF: renamed from: g byte
   public static byte field_byte_g;
   // $FF: renamed from: a boolean[][]
   public static final boolean[][] field_array_array_boolean_a = new boolean[][]{{true, true, true, true, true, true, false, false, false, false, false, false, false, false, false}, {true, false, true, false, false, false, false, true, true, true, true, false, false, true, true}, {true, true, true, true, false, false, false, false, false, false, false, false, false, false, false}};

   private class_n() {
   }

   // $FF: renamed from: a () void
   public static final void func_void_a() {
      field_byte_g = 0;
      field_class_ao_a.func_void_c(field_byte_a);

      try {
         byte[] var0 = new byte[2];
         XFile var2;
         (var2 = new XFile("/o", 1)).read(var0, 0, var0.length);
         byte[] var1 = new byte[(var0[0] & 255) << 8 | var0[1] & 255];
         var2.read(var1, 0, var1.length);
         var1 = class_bq.func_array_byte_b(var1, field_array_byte_i);
         field_class_ao_a.field_class_g_b.func_void_a(var1);
         var2.close();
      } catch (Exception var3) {
      }

      func_void_l();
      func_void_m();
      func_void_b((int)0);
      field_byte_f = field_array_byte_j[(field_byte_a - 6) * 3];
      field_byte_c = field_array_byte_j[(field_byte_a - 6) * 3 + 1];
      field_byte_d = field_array_byte_j[(field_byte_a - 6) * 3 + 2];
   }

   // $FF: renamed from: b () void
   public static final void func_void_b() {
      func_void_l();
      func_void_m();
      func_void_b((int)0);

      try {
         func_void_r();
      } catch (Exception var1) {
         var1.printStackTrace();
         func_void_a();
      }
   }

   // $FF: renamed from: c () void
   public static final void func_void_c() {
      class_ao var10000 = field_class_ao_a;
      var10000.field_byte_f += func_byte_a(field_byte_a);
      if (field_class_ao_a.field_byte_f > 100) {
         field_class_ao_a.field_byte_f = 100;
      }

      field_byte_g = 1;
      class_bs.field_class_bs_a.field_boolean_b = true;

      try {
         class_bs.field_class_bs_a.func_void_i();
      } catch (Exception var1) {
      }

      func_void_l();
      func_void_m();
      func_void_b((int)0);
      field_class_ao_a.field_class_g_a.func_void_c();
      field_class_ao_a.field_int_a = field_class_ao_a.field_int_d;
      field_class_ao_a.field_int_b = field_class_ao_a.field_int_e;
      field_byte_f = field_array_byte_j[(field_byte_a - 6) * 3];
      field_byte_c = field_array_byte_j[(field_byte_a - 6) * 3 + 1];
      field_byte_d = field_array_byte_j[(field_byte_a - 6) * 3 + 2];
   }

   // $FF: renamed from: a (byte, byte, byte, byte) void
   public static final synchronized void func_void_a(byte var0, byte var1, byte var2, byte var3) {
      field_byte_c = var1;
      field_byte_d = var2;
      field_byte_e = var3;
      field_byte_b = var0;
   }

   // $FF: renamed from: a (byte, byte, byte) void
   public static final synchronized void func_void_a(byte var0, byte var1, byte var2) {
      field_byte_c = var1;
      field_byte_d = var2;
      field_byte_e = 0;
      field_byte_b = var0;
   }

   // $FF: renamed from: a (byte, byte) void
   public static final synchronized void func_void_a(byte var0, byte var1) {
      field_byte_c = var1;
      field_byte_d = 0;
      field_byte_e = 0;
      field_byte_b = var0;
   }

   // $FF: renamed from: a (byte) void
   public static final synchronized void func_void_a(byte var0) {
      field_byte_c = 0;
      field_byte_d = 0;
      field_byte_e = 0;
      field_byte_b = var0;
   }

   // $FF: renamed from: d () void
   public static final void func_void_d() {
      field_byte_b = 0;
      field_byte_c = 0;
      field_byte_d = 0;
      field_byte_e = 0;
   }

   // $FF: renamed from: e () void
   public static final void func_void_e() {
      if (field_byte_b != 0) {
         byte var0 = field_byte_b;
         field_byte_b = 0;
         switch(var0) {
         case 1:
            func_void_a((int)1);
            class_bs.field_class_bs_a.func_void_g();
            class_bu.func_void_b();
            return;
         case 2:
            func_void_a((int)field_byte_c);
            if (field_byte_d == 0) {
               class_bs.field_class_bs_a.func_void_a((int)field_byte_e);
               return;
            }

            if (field_byte_d == 1) {
               class_bs.field_class_bs_a.func_void_f();
               return;
            }

            if (field_byte_d == 2) {
               class_bs.field_class_bs_a.func_void_g();
               return;
            }

            if (field_byte_d == 3) {
               class_bs.field_class_bs_a.func_void_h();
               return;
            }
         case 3:
         case 4:
         case 5:
         case 6:
         case 7:
         case 8:
         case 9:
         case 10:
         case 17:
         case 18:
         case 19:
         case 20:
         default:
            break;
         case 11:
            switch(field_byte_c) {
            case 0:
               func_void_a((int)6);
               class_bp.func_class_bp_a().func_void_d();
               break;
            case 1:
               func_void_a((int)7);
               class_ax.func_class_ax_a().func_void_d();
               break;
            case 2:
               func_void_a((int)8);
               class_aa.func_class_aa_a().func_void_d();
            }

            return;
         case 12:
            func_void_a((int)2);
            switch(field_byte_c) {
            case 0:
            default:
               break;
            case 1:
               class_ax.func_class_ax_a().func_void_e();
               break;
            case 2:
               class_aa.func_class_aa_a().func_void_e();
            }

            return;
         case 13:
            func_void_a((int)5);
            class_ai.func_class_ai_a().func_void_d();
            if (class_x.activeDemoVersion && field_byte_c == 1 || MIDletConfig.isDemoVersion && field_class_ao_a.field_byte_g >= 8) {
               class_ai.func_class_ai_a().func_void_e();
               return;
            }
            break;
         case 14:
            if (field_byte_c == 1) {
               class_ai.func_class_ai_a().func_void_a(false);
               func_void_a((int)1);
               class_bu.func_void_d();
               return;
            }

            class_ai.func_class_ai_a().func_void_a(true);
            return;
         case 15:
            func_void_f();
            return;
         case 16:
            func_void_a((int)10);
            SoundPlayerManager.setupSoundPlayer((byte)12);
            SoundPlayerManager.startPlayer3((byte)12, false);
            class_as.field_int_e = 16;
            return;
         case 21:
            if (field_byte_c == 1) {
               func_void_b();
            } else if (field_byte_c == 0) {
               func_void_a();
            } else if (field_byte_c == 2) {
               func_void_c();
               class_ai.func_class_ai_a().func_void_a(false);
               func_void_a((int)1);
               class_bu.func_void_d();
               SoundPlayerManager.close();
               return;
            }

            func_void_a((int)1);
            class_bs.field_class_bs_a.func_void_g();
            class_bu.func_void_a();
         }

      }
   }

   // $FF: renamed from: b (byte, byte, byte, byte) void
   public static final void func_void_b(byte var0, byte var1, byte var2, byte var3) {
      System.gc();
      func_void_a((byte)1, var1, var2, var3);
      SoundPlayerManager.stopPlayer1();
      SoundPlayerManager.close();
      field_byte_f = var0;
   }

   // $FF: renamed from: f () void
   public static final void func_void_f() {
      field_class_ae_a.func_void_b((class_ck)field_class_ao_a);
      field_class_ao_a.func_void_m();
      field_class_ao_a.func_void_a();
      field_class_ao_a.func_void_b((byte)(field_byte_c + 1));
      func_void_g();
      field_int_c = field_int_a;
      field_int_d = field_int_b;
      func_void_d();
      field_byte_f = -1;
      field_class_ao_a.func_void_a((byte)1);
      field_class_ao_a.func_void_j();
      class_bs.field_class_as_a.func_void_b();
      func_void_a((byte)2, (byte)2, (byte)1);
   }

   // $FF: renamed from: g () void
   public static final void func_void_g() {
      field_int_a = class_as.field_int_c - field_class_ao_a.field_short_c;
      field_int_b = class_as.field_int_d - field_class_ao_a.field_short_d;
   }

   // $FF: renamed from: a (int) void
   public static final void func_void_a(int var0) {
      field_int_e = var0;
   }

   // $FF: renamed from: a (ae) void
   public static final void func_void_a(class_ae var0) {
      field_class_ae_a = var0;
   }

   // $FF: renamed from: a (boolean, boolean) void
   public static final void func_void_a(boolean var0, boolean var1) {
      if (var1) {
         byte var2 = func_byte_b();
         if (var0) {
            field_int_b -= 15 * class_u.field_array_byte_b[var2];
            field_int_a -= 15 * class_u.field_array_byte_a[var2];
         }

         if (!class_u.field_array_boolean_a[var2] && field_int_d != field_int_b) {
            field_int_d += (field_int_b - field_int_d + 1) / 2 - 1;
         }

         if (class_u.field_array_boolean_a[var2] && field_int_c != field_int_a) {
            field_int_c += (field_int_a - field_int_c + 1) / 2 - 1;
         }

      } else {
         field_int_c += (field_int_a - field_int_c + 1) / 2 - 1;
         field_int_d += (field_int_b - field_int_d + 1) / 2 - 1;
      }
   }

   // $FF: renamed from: b (byte) void
   public static final void func_void_b(byte var0) {
      if (func_byte_a() == 1) {
         field_byte_h = 0;
         field_byte_i = 0;
         func_void_c((byte)2);
         func_void_d(var0);
      } else {
         if (func_byte_a() == 2) {
            field_byte_h = 2;
            field_byte_i = var0;
         }

      }
   }

   // $FF: renamed from: h () void
   public static final void func_void_h() {
      field_byte_h = 1;
      field_byte_i = func_byte_b();
   }

   // $FF: renamed from: a (boolean) void
   public static final void func_void_a(boolean var0) {
      if (field_class_ao_a.func_boolean_a(var0)) {
         if (func_byte_a() == 2) {
            field_byte_h = 3;
            field_byte_i = func_byte_b();
         } else {
            if (func_byte_a() == 1) {
               field_class_ao_a.func_void_a((byte)3);
               field_class_ao_a.func_void_i();
            }

         }
      }
   }

   // $FF: renamed from: i () void
   public static final void func_void_i() {
      func_void_q();
      func_void_n();
      field_class_ae_a.func_void_b();
   }

   // $FF: renamed from: j () void
   public static final void func_void_j() {
      class_ah.func_void_a();
   }

   // $FF: renamed from: q () void
   private static final void func_void_q() {
      if (func_boolean_b()) {
         if (field_byte_h != 0) {
            func_void_c(field_byte_h);
            func_void_d(field_byte_i);
            field_byte_h = 0;
            field_byte_i = 0;
         }
      }
   }

   // $FF: renamed from: k () void
   public static final void func_void_k() {
      field_byte_h = 0;
   }

   // $FF: renamed from: a () boolean
   public static final boolean func_boolean_a() {
      byte[] var0;
      if ((var0 = field_class_ae_a.func_array_byte_a(field_class_ao_a.field_byte_a, field_class_ao_a.field_byte_b)) != null) {
         if (var0[2] == -1) {
            int var1;
            if ((var1 = var0[3] * 100 + var0[4]) > 0) {
               var1 *= 9;
            }

            field_class_ao_a.func_void_g(var1);
            class_bs.field_class_as_a.func_void_a((class_bh.field_class_java_lang_String_a + var1 + class_bh.field_class_java_lang_String_d).toCharArray(), 16);
         } else if (var0[2] == 22) {
            field_class_ao_a.field_class_g_b.func_boolean_a(class_ad.func_class_ad_a(var0[2], var0[3], true, true), var0[4]);
            char[] var3 = class_h.func_array_char_a(class_bh.field_class_java_lang_String_a.toCharArray(), class_ad.field_class_z_b.loadByIndex(var0[2]));
            class_bs.field_class_as_a.func_void_a(var3, 16);
         } else {
            class_ad var4;
            if ((var4 = class_ad.func_class_ad_a(var0[2], var0[3], true, true)) instanceof class_e && !((class_e)var4).field_boolean_a) {
               ((class_e)var4).field_boolean_b = true;
            }

            field_class_ao_a.field_class_g_a.func_boolean_a(var4, var0[4]);
            char[] var2 = class_h.func_array_char_a(class_bh.field_class_java_lang_String_a.toCharArray(), class_ad.field_class_z_b.loadByIndex(var0[2]));
            class_bs.field_class_as_a.func_void_a(var2, 16);
         }

         return true;
      } else {
         if (field_class_ae_a.func_boolean_a(field_class_ao_a.field_byte_a, field_class_ao_a.field_byte_b)) {
            class_bs.field_class_as_a.func_void_a(class_bh.field_array_char_t, 16);
         }

         return false;
      }
   }

   // $FF: renamed from: l () void
   public static final void func_void_l() {
      for(int var0 = 0; var0 < 128; ++var0) {
         field_array_byte_k[var0] = 0;
      }

   }

   // $FF: renamed from: a (int) boolean
   public static final boolean func_boolean_a(int var0) {
      return (field_array_byte_k[var0 / 8] >> var0 % 8 & 1) == 1;
   }

   // $FF: renamed from: b (int) void
   public static final void func_void_b(int var0) {
      byte var1 = field_array_byte_k[var0 / 8];
      field_array_byte_k[var0 / 8] = (byte)(var1 | 1 << var0 % 8);
   }

   // $FF: renamed from: c (int) void
   public static final void func_void_c(int var0) {
      byte var1 = field_array_byte_k[var0 / 8];
      field_array_byte_k[var0 / 8] = (byte)(var1 & ~(1 << var0 % 8));
   }

   // $FF: renamed from: d (int) void
   public static final void func_void_d(int var0) {
      if (func_boolean_a(var0)) {
         func_void_c(var0);
      } else {
         func_void_b(var0);
      }
   }

   // $FF: renamed from: m () void
   public static final void func_void_m() {
      for(int var0 = 0; var0 < 128; ++var0) {
         field_array_byte_l[var0] = 0;
      }

   }

   // $FF: renamed from: b (int) boolean
   public static final boolean func_boolean_b(int var0) {
      return (field_array_byte_l[var0 / 8] >> var0 % 8 & 1) == 1;
   }

   // $FF: renamed from: e (int) void
   public static final void func_void_e(int var0) {
      byte var1 = field_array_byte_l[var0 / 8];
      field_array_byte_l[var0 / 8] = (byte)(var1 | 1 << var0 % 8);
      if (var0 == 29 && field_byte_a == 6) {
         func_class_ao_a().func_void_d((byte)2);
      }

   }

   // $FF: renamed from: f (int) void
   public static final void func_void_f(int var0) {
      byte var1 = field_array_byte_l[var0 / 8];
      field_array_byte_l[var0 / 8] = (byte)(var1 & ~(1 << var0 % 8));
   }

   // $FF: renamed from: g (int) void
   public static final void func_void_g(int var0) {
      if (func_boolean_b(var0)) {
         func_void_f(var0);
      } else {
         func_void_e(var0);
      }
   }

   // $FF: renamed from: a () ao
   public static final class_ao func_class_ao_a() {
      return field_class_ao_a;
   }

   // $FF: renamed from: a () byte
   public static final byte func_byte_a() {
      return field_class_ao_a.field_byte_h;
   }

   // $FF: renamed from: b () byte
   public static final byte func_byte_b() {
      return field_class_ao_a.field_byte_i;
   }

   // $FF: renamed from: c (byte) void
   public static final void func_void_c(byte var0) {
      field_class_ao_a.func_void_a(var0);
   }

   // $FF: renamed from: d (byte) void
   public static final void func_void_d(byte var0) {
      field_class_ao_a.func_void_b(var0);
   }

   // $FF: renamed from: n () void
   public static final void func_void_n() {
      field_class_ao_a.func_void_d();
      field_class_ae_a.func_void_c(field_class_ao_a);
      class_p var0;
      if ((var0 = field_class_ao_a.func_class_p_a()) != null) {
         var0.func_void_e();
         field_class_ae_a.func_void_c(var0);
      }

   }

   // $FF: renamed from: a (int, int) void
   public static final void func_void_a(int var0, int var1) {
      field_class_ao_a.func_void_a((short)(var0 * 16), (short)(var1 * 16));
      field_class_ao_a.func_void_g();
   }

   // $FF: renamed from: b () boolean
   public static final boolean func_boolean_b() {
      return !field_class_ao_a.field_boolean_a && !field_class_ao_a.field_boolean_b;
   }

   // $FF: renamed from: a () byte[]
   private static final byte[] func_array_byte_a() {
      ByteArrayOutputStream var0 = null;
      DataOutputStream var1 = null;
      boolean var11 = false;

      byte[] var2;
      label99: {
         try {
            var11 = true;
            var0 = new ByteArrayOutputStream();
            (var1 = new DataOutputStream(var0)).write(field_array_byte_k);
            var1.write(field_array_byte_l);
            var1.writeByte(field_byte_g);
            var2 = var0.toByteArray();
            var11 = false;
            break label99;
         } catch (IOException var15) {
            var15.printStackTrace();
            var11 = false;
         } finally {
            if (var11) {
               try {
                  if (var1 != null) {
                     var1.close();
                  }

                  if (var0 != null) {
                     var0.close();
                  }
               } catch (IOException var12) {
               }

            }
         }

         try {
            if (var1 != null) {
               var1.close();
            }

            if (var0 != null) {
               var0.close();
            }
         } catch (IOException var13) {
         }

         return null;
      }

      try {
         var1.close();
         var0.close();
      } catch (IOException var14) {
      }

      return var2;
   }

   // $FF: renamed from: a (byte[]) void
   private static final void func_void_a(byte[] var0) {
      ByteArrayInputStream var1 = null;
      DataInputStream var2 = null;
      boolean var11 = false;

      label90: {
         try {
            var11 = true;
            var1 = new ByteArrayInputStream(var0);
            (var2 = new DataInputStream(var1)).read(field_array_byte_k);
            var2.read(field_array_byte_l);
            field_byte_g = var2.readByte();
            var11 = false;
            break label90;
         } catch (IOException var15) {
            var15.printStackTrace();
            var11 = false;
         } finally {
            if (var11) {
               try {
                  if (var2 != null) {
                     var2.close();
                  }

                  if (var1 != null) {
                     var1.close();
                  }
               } catch (IOException var13) {
               }

            }
         }

         try {
            if (var2 != null) {
               var2.close();
            }

            if (var1 != null) {
               var1.close();
            }

            return;
         } catch (IOException var12) {
            return;
         }
      }

      try {
         var2.close();
         var1.close();
      } catch (IOException var14) {
      }
   }

   // $FF: renamed from: o () void
   public static final void func_void_o() throws Exception {
      class_ao var0;
      byte[] var1 = (var0 = field_class_ao_a).func_array_byte_a();
      byte[] var2 = var0.field_class_g_a.func_array_byte_c();
      byte[] var3 = func_array_byte_a();
      byte[] var4 = new byte[]{field_class_ae_a.field_byte_a, var0.field_byte_a, var0.field_byte_b};
      boolean var6 = false;
      var1 = class_bq.func_array_byte_a(var1, field_array_byte_i);
      var2 = class_bq.func_array_byte_a(var2, field_array_byte_i);
      var3 = class_bq.func_array_byte_a(var3, field_array_byte_i);
      var4 = class_bq.func_array_byte_a(var4, field_array_byte_i);
      byte[] var5;
      (var5 = new byte[var1.length + var2.length + var3.length + var4.length + 8])[0] = (byte)((var1.length & '\uff00') >> 8);
      var5[1] = (byte)(var1.length & 255);
      System.arraycopy(var1, 0, var5, 2, var1.length);
      int var9 = 2 + var1.length;
      var5[var9++] = (byte)((var2.length & '\uff00') >> 8);
      var5[var9++] = (byte)(var2.length & 255);
      System.arraycopy(var2, 0, var5, var9, var2.length);
      var9 += var2.length;
      var5[var9++] = (byte)((var3.length & '\uff00') >> 8);
      var5[var9++] = (byte)(var3.length & 255);
      System.arraycopy(var3, 0, var5, var9, var3.length);
      var9 += var3.length;
      var5[var9++] = (byte)((var4.length & '\uff00') >> 8);
      var5[var9++] = (byte)(var4.length & 255);
      System.arraycopy(var4, 0, var5, var9, var4.length);
      XFile var7;
      (var7 = new XFile(field_array_class_java_lang_String_a[field_byte_a - 6], 0)).write(var5, 0, var5.length);
      var7.close();
      byte[] var10 = class_bq.func_array_byte_a(var0.field_class_g_b.func_array_byte_c(), field_array_byte_i);
      XFile var8 = new XFile("/o", 0);
      var5 = new byte[]{(byte)((var10.length & '\uff00') >> 8), (byte)(var10.length & 255)};
      var8.write(var5, 0, var5.length);
      var8.write(var10, 0, var10.length);
      var8.close();
   }

   // $FF: renamed from: r () void
   private static final void func_void_r() throws Exception {
      byte[] var0 = new byte[2];
      XFile var2;
      (var2 = new XFile(field_array_class_java_lang_String_a[field_byte_a - 6], 1)).read(var0, 0, var0.length);
      byte[] var1 = new byte[(var0[0] & 255) << 8 | var0[1] & 255];
      var2.read(var1, 0, var1.length);
      var1 = class_bq.func_array_byte_b(var1, field_array_byte_i);
      field_class_ao_a.func_void_a(var1);
      var2.read(var0, 0, var0.length);
      var1 = new byte[(var0[0] & 255) << 8 | var0[1] & 255];
      var2.read(var1, 0, var1.length);
      var1 = class_bq.func_array_byte_b(var1, field_array_byte_i);
      field_class_ao_a.field_class_g_a.func_void_a(var1);
      var2.read(var0, 0, var0.length);
      var1 = new byte[(var0[0] & 255) << 8 | var0[1] & 255];
      var2.read(var1, 0, var1.length);
      func_void_a(class_bq.func_array_byte_b(var1, field_array_byte_i));
      var2.read(var0, 0, var0.length);
      var1 = new byte[(var0[0] & 255) << 8 | var0[1] & 255];
      var2.read(var1, 0, var1.length);
      field_byte_f = (var1 = class_bq.func_array_byte_b(var1, field_array_byte_i))[0];
      field_byte_c = var1[1];
      field_byte_d = var1[2];
      var2.close();
      (var2 = new XFile("/o", 1)).read(var0, 0, var0.length);
      var1 = new byte[(var0[0] & 255) << 8 | var0[1] & 255];
      var2.read(var1, 0, var1.length);
      var1 = class_bq.func_array_byte_b(var1, field_array_byte_i);
      field_class_ao_a.field_class_g_b.func_void_a(var1);
      var2.close();
   }

   // $FF: renamed from: a (byte) byte[]
   private static final byte[] func_array_byte_a(byte var0) {
      System.out.println("getSavedDataFor");
      byte[] var1 = null;

      try {
         if (XFile.exists(field_array_class_java_lang_String_a[var0 - 6])) {
            XFile var2;
            var1 = new byte[(var2 = new XFile(field_array_class_java_lang_String_a[var0 - 6], 1)).getSize()];
            System.out.println("::::" + var2.getSize());
            var2.read(var1, 0, var1.length);
            var2.close();
         }
      } catch (Exception var3) {
      }

      return var1;
   }

   // $FF: renamed from: a (byte) byte
   public static final byte func_byte_a(byte var0) {
      if (field_byte_g >= 3) {
         return 0;
      } else {
         byte var1 = 0;

         int var2;
         for(var2 = 0; var2 < 20; ++var2) {
            if (func_boolean_b(1 + var2 * 3 + 1)) {
               ++var1;
            }
         }

         for(var2 = 100; var2 <= 105; ++var2) {
            if (func_boolean_a(var2)) {
               ++var1;
            }
         }

         switch(var0) {
         case 6:
            return (byte)(var1 * field_array_byte_h[field_byte_g] / 19);
         case 7:
            return (byte)(var1 * field_array_byte_h[field_byte_g] / 21);
         case 8:
            return (byte)(var1 * field_array_byte_h[field_byte_g] / 16);
         default:
            return 0;
         }
      }
   }

   // $FF: renamed from: p () void
   public static final void func_void_p() {
      int var0 = 0;
      Object[] var1 = new Object[3];

      for(byte var2 = 6; var2 <= 8; ++var2) {
         var1[var2 - 6] = func_array_byte_a(var2);
         if (var1[var2 - 6] != null) {
            ++var0;
         }
      }

      byte[] var11 = new byte[var0 * 4];
      int var3 = 0;

      for(byte var6 = 6; var6 <= 8; ++var6) {
         if (var1[var6 - 6] != null) {
            byte[] var7 = (byte[])((byte[])var1[var6 - 6]);
            boolean var5 = false;

            try {
               short var4;
               byte[] var8 = new byte[var4 = class_h.func_short_a(var7, 0)];
               System.arraycopy(var7, 2, var8, 0, var4);
               int var12 = 2 + var4;
               var8 = class_bq.func_array_byte_b(var8, field_array_byte_i);
               var4 = class_h.func_short_a(var7, var12);
               var12 += 2 + var4;
               var4 = class_h.func_short_a(var7, var12);
               var12 += 2;
               byte[] var9 = new byte[var4];
               System.arraycopy(var7, var12, var9, 0, var4);
               func_void_a(class_bq.func_array_byte_b(var9, field_array_byte_i));
               var11[var3++] = var6;
               var11[var3++] = var8[1];
               var11[var3++] = (byte)(var8[0] + func_byte_a(var6));
               var11[var3++] = field_byte_g;
            } catch (Exception var10) {
               var10.printStackTrace();
            }
         }
      }

      class_bf.func_void_a(var0 > 0, var11);
      class_bf.func_class_bf_a().field_byte_b = (byte)(var0 > 0 ? 1 : 0);
      func_void_a((byte)2, (byte)9, (byte)3);
   }

   // $FF: renamed from: a (boolean, byte, boolean[]) void
   public static final void func_void_a(boolean var0, byte var1, boolean[] var2) {
      class_bf.func_void_d();
      class_ce.func_void_B();
      field_byte_a = var1;
      field_class_ao_a = new class_ao((short)0, (short)0, (byte)8, (byte)8, var1);
      if (!var0) {
         if (var2[0]) {
            field_class_ao_a.func_class_p_a((byte)0);
         }

         if (var2[1]) {
            field_class_ao_a.func_class_p_a((byte)1);
         }

         if (var2[2]) {
            field_class_ao_a.func_class_p_a((byte)2);
         }
      }

      func_void_a((int)0);
      func_void_a((byte)21, (byte)(var0 ? 1 : 0));
   }
}
