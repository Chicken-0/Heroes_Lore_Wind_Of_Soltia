package rpg;

import java.io.IOException;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

// $FF: renamed from: bu
public final class class_bu implements Runnable {
   // $FF: renamed from: a byte
   private static byte field_byte_a = 0;
   // $FF: renamed from: g java.lang.String[]
   private static final String[] field_array_class_java_lang_String_g = new String[]{"a", "b", "e", "hA", "hB", "w", "s"};
   // $FF: renamed from: a java.lang.String[]
   public static final String[] field_array_class_java_lang_String_a = new String[]{"/c1/s/", "/c2/s/", "/c3/s/"};
   // $FF: renamed from: b java.lang.String[]
   public static final String[] field_array_class_java_lang_String_b = new String[]{"/c1/i/", "/c2/i/", "/c3/i/"};
   // $FF: renamed from: c java.lang.String[]
   public static final String[] field_array_class_java_lang_String_c = new String[]{"a1", "a2", "a3", "a4", "a5", "a6"};
   // $FF: renamed from: d java.lang.String[]
   public static final String[] field_array_class_java_lang_String_d = new String[]{"h1", "h2", "h3", "h4", "h5", "h6", "h7"};
   // $FF: renamed from: e java.lang.String[]
   public static final String[] field_array_class_java_lang_String_e = new String[]{"w1", "w2", "w3", "w4", "w5"};
   // $FF: renamed from: f java.lang.String[]
   public static final String[] field_array_class_java_lang_String_f = new String[]{"s1", "s2", "s3", "s4", "s5"};
   // $FF: renamed from: a byte[][]
   public static final byte[][] field_array_array_byte_a = new byte[][]{{0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 4, 4, 4, 4, 4, 4, 0, 3, 3, 4, 1, 2, 3}, {0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 4, 4, 4, 4, 4, 4, 0, 1, 2, 4, 3, 4, 1}, {0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 4, 4, 4, 4, 4, 4, 0, 2, 4, 1, 2, 4, -1}};
   // $FF: renamed from: b byte[][]
   public static final byte[][] field_array_array_byte_b = new byte[][]{{-1, 0, 0, 1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 2, 0, 4, 5, 4, 3}, {-1, 0, 0, 1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 2, 0, 4, 5, 4, 3}, {0, 0, 0, 1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 2, 0, 4, 5, 4, 3}};
   // $FF: renamed from: a byte[]
   public static final byte[] field_array_byte_a = new byte[]{0, 0, 0, 0, 1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 6, 6};
   // $FF: renamed from: b byte[]
   public static final byte[] field_array_byte_b = new byte[]{0, 0, 0, 1, 1, 1, 2, 2, 2, 4, 4, 4, 2, 0, 4};
   // $FF: renamed from: a boolean
   private static boolean field_boolean_a = false;

   // $FF: renamed from: a () void
   public static final void func_void_a() {
      field_byte_a = 1;
      MyGameCanvas.func_void_a("- RESOURCE", 500);
      (new Thread(new class_bu())).start();
   }

   // $FF: renamed from: b () void
   public static final void func_void_b() {
      class_bs.field_class_as_a.func_void_f();
      field_byte_a = 2;
      MyGameCanvas.func_void_a("- MAP", 200);
      (new Thread(new class_bu())).start();
   }

   // $FF: renamed from: c () void
   public static final void func_void_c() {
      field_byte_a = 3;
      MyGameCanvas.func_void_a("가디언 소환중..", 120);
      (new Thread(new class_bu())).start();
   }

   // $FF: renamed from: d () void
   public static final void func_void_d() {
      field_byte_a = 5;
      MyGameCanvas.func_void_a("- MAIN MENU", 100);
      (new Thread(new class_bu())).start();
   }

   public final void run() {
      try {
         Thread.sleep(100L);
      } catch (InterruptedException var4) {
      }

      switch(field_byte_a) {
      case 1:
         try {
            Thread.sleep(1000L);
            System.out.println("sleep");
         } catch (InterruptedException var3) {
            var3.printStackTrace();
         }

         MyGameCanvas.func_void_k();
         if (!field_boolean_a) {
            this.func_void_i();
         }

         try {
            class_ce.field_class_z_f = new class_z("/sgui/q" + class_n.field_byte_a);
            MyGameCanvas.func_void_k();
         } catch (Exception var2) {
         }

         this.func_void_j();
         this.func_void_k();
         class_n.func_void_b(class_n.field_byte_f, (byte)1, class_n.field_byte_c, class_n.field_byte_d);
         MyGameCanvas.field_boolean_b = true;
         return;
      case 2:
         this.func_class_ae_a();
         class_n.func_void_a((int)class_n.field_byte_d, (int)class_n.field_byte_e);
         class_n.field_class_ae_a.func_void_d();
         class_n.func_void_a((byte)15, (byte)class_n.field_byte_c);
         return;
      case 3:
         func_void_h();
         this.func_void_k();
         class_n.func_void_a((byte)2, (byte)2, (byte)1);
         return;
      case 5:
         func_void_g();
         func_void_h();
         class_ce.func_void_A();
         class_n.func_void_p();
      case 4:
      default:
      }
   }

   // $FF: renamed from: a () ae
   private final class_ae func_class_ae_a() {
      MyGameCanvas.func_void_k();
      class_ae var1 = class_n.field_class_ae_a;
      class_ao var2 = class_n.func_class_ao_a();
      if (var1 != null) {
         var1.func_void_a((class_ck)var2);
         var2.field_class_ck_a = null;
         var2.field_class_ck_b = null;
         class_p var3;
         if ((var3 = var2.func_class_p_a()) != null) {
            var1.func_void_a((class_ck)var3);
            var3.field_class_ck_a = null;
            var3.field_class_ck_b = null;
         }
      }

      MyGameCanvas.func_void_k();
      class_n.field_class_ae_a = null;
      class_n.func_void_a(var1 = new class_ae(class_n.field_byte_f));
      MyGameCanvas.func_void_k();
      var1.func_void_a();
      MyGameCanvas.func_void_k();
      return var1;
   }

   // $FF: renamed from: e () void
   public static final void func_void_e() {
      try {
         class_ce.field_class_z_b = new class_z("/grd/grd");
         MyGameCanvas.func_void_k();
         class_ce.field_class_z_a = new class_z("/char/hero");
         MyGameCanvas.func_void_k();
      } catch (IOException var1) {
         var1.printStackTrace();
      }
   }

   // $FF: renamed from: i () void
   private final void func_void_i() {
      field_boolean_a = true;
      Object var1 = null;
      MyGameCanvas.func_void_k();
      class_ce.func_void_n();
      MyGameCanvas.func_void_k();
      class_ce.func_void_p();
      MyGameCanvas.func_void_k();
      class_ce.func_void_t();
      MyGameCanvas.func_void_k();
      class_ce.func_void_g();
      MyGameCanvas.func_void_k();
      class_ce.func_void_i();
      MyGameCanvas.func_void_k();
      class_ce.func_void_r();
      MyGameCanvas.func_void_k();
      class_ce.func_void_l();
      MyGameCanvas.func_void_k();

      try {
         class_ce.field_class_z_c = new class_z("/grd/grdsk");
         MyGameCanvas.func_void_k();
         class_ce.field_class_z_d = new class_z("/m/name");
         MyGameCanvas.func_void_k();
      } catch (IOException var3) {
         var3.printStackTrace();
      }

      byte var2;
      for(var2 = 5; var2 <= 8; ++var2) {
         class_bw.func_void_a(var2);
      }

      for(var2 = 12; var2 <= 15; ++var2) {
         class_bw.func_void_a(var2);
      }

   }

   // $FF: renamed from: f () void
   public static final void func_void_f() {
      field_boolean_a = false;
      class_ce.func_void_q();
      class_ce.func_void_u();
      class_ce.func_void_h();
      class_ce.func_void_j();
      class_ce.func_void_s();
      class_ce.field_class_z_c = null;
      class_ce.field_class_z_d = null;

      byte var0;
      for(var0 = 5; var0 <= 8; ++var0) {
         class_bw.func_void_b(var0);
      }

      for(var0 = 12; var0 <= 15; ++var0) {
         class_bw.func_void_b(var0);
      }

   }

   // $FF: renamed from: j () void
   private final void func_void_j() {
      class_ce.field_array_class_java_lang_Object_a = new Object[396];
      class_ao var1;
      if ((var1 = class_n.func_class_ao_a()).func_class_e_a() != null) {
         (new StringBuffer()).append("HERO ARMOR ").append(field_array_array_byte_b[class_n.field_byte_a - 6][var1.func_class_e_a().field_byte_g]).toString();
         MyGameCanvas.func_void_k();
         func_void_a(class_n.field_byte_a, var1.func_class_ad_a(2).field_byte_g);
      }

      MyGameCanvas.func_void_k();
      func_void_a(class_n.field_byte_a, (byte)1, (byte)0, false, (byte)0);
      if (var1.func_class_e_b() != null) {
         (new StringBuffer()).append("HERO HEAD ").append(field_array_byte_a[var1.func_class_e_b().field_byte_g]).toString();
         MyGameCanvas.func_void_k();
         func_void_b(class_n.field_byte_a, var1.func_class_e_b().field_byte_g);
      } else {
         MyGameCanvas.func_void_k();
         func_void_b(class_n.field_byte_a, (byte)0);
      }

      if (class_n.field_byte_a == 8 && var1.func_class_t_a() != null) {
         (new StringBuffer()).append("HERO SHIELD ").append(field_array_byte_b[var1.func_class_t_a().field_byte_g]).toString();
         MyGameCanvas.func_void_k();
         func_void_c(class_n.field_byte_a, var1.func_class_t_a().field_byte_g);
      }

   }

   // $FF: renamed from: g () void
   public static final void func_void_g() {
      func_void_a(0);
      func_void_a(1);
      func_void_a(2);
      func_void_a(5);
   }

   // $FF: renamed from: k () void
   private final void func_void_k() {
      class_ao var1;
      class_p var2 = (var1 = class_n.func_class_ao_a()).func_class_p_a();
      MyGameCanvas.func_void_k();
      Object var3 = null;
      MyGameCanvas.func_void_k();
      class_ce.func_void_f(var2.field_byte_f);
      MyGameCanvas.func_void_k();
      if (var1.func_class_ad_a(0) != null) {
         func_void_a(class_n.field_byte_a, (class_l)((class_l)var1.func_class_ad_a(0)), false, var2.func_byte_a());
      }

      MyGameCanvas.func_void_k();
      func_void_d(class_n.field_byte_a, var2.func_byte_a());
      MyGameCanvas.func_void_k();
      class_ce.func_void_a(var2.func_byte_a());
      MyGameCanvas.func_void_k();
      switch(var2.field_byte_f) {
      case 0:
         class_bw.func_void_a((byte)16);
         class_bw.func_void_a((byte)21);
         return;
      case 1:
         class_bw.func_void_a((byte)20);
         return;
      case 2:
         class_bw.func_void_a((byte)17);
         class_bw.func_void_a((byte)21);
         return;
      case 3:
         class_bw.func_void_a((byte)16);
         return;
      case 4:
         class_bw.func_void_a((byte)18);
         class_bw.func_void_a((byte)20);
         return;
      case 5:
         class_bw.func_void_a((byte)17);
      default:
      }
   }

   // $FF: renamed from: h () void
   public static final void func_void_h() {
      class_ce.func_void_v();
      func_void_a(3);
      func_void_a(4);
      class_ce.func_void_a();

      for(byte var0 = 16; var0 <= 21; ++var0) {
         class_bw.func_void_b(var0);
      }

   }

   // $FF: renamed from: a (byte, l, boolean, byte) void
   public static final void func_void_a(byte var0, class_l var1, boolean var2, byte var3) {
      func_void_a(var0, (byte)5, field_array_array_byte_a[class_n.field_byte_a - 6][var1.field_byte_g], var2, var3);
   }

   // $FF: renamed from: a (byte, byte) void
   public static final void func_void_a(byte var0, byte var1) {
      if (field_array_array_byte_b[class_n.field_byte_a - 6][var1] == -1) {
         func_void_a(0);
      } else {
         func_void_a(var0, (byte)0, field_array_array_byte_b[class_n.field_byte_a - 6][var1], false, (byte)0);
      }
   }

   // $FF: renamed from: b (byte, byte) void
   public static final void func_void_b(byte var0, byte var1) {
      byte var2 = 4;
      if (var0 == 6 && var1 >= 0 && var1 <= 3) {
         var2 = 3;
      }

      func_void_a(var0, var2, field_array_byte_a[var1], false, (byte)0);
   }

   // $FF: renamed from: c (byte, byte) void
   public static final void func_void_c(byte var0, byte var1) {
      func_void_a(var0, (byte)6, field_array_byte_b[var1], false, (byte)0);
   }

   // $FF: renamed from: d (byte, byte) void
   public static final void func_void_d(byte var0, byte var1) {
      func_void_a(var0, (byte)2, (byte)0, false, var1);
   }

   // $FF: renamed from: a (byte, byte, byte, boolean, byte) void
   private static final void func_void_a(byte var0, byte var1, byte var2, boolean var3, byte var4) {
      byte var5 = (byte)(var0 - 6);

      try {
         PNGMerger var6;
         Image[] var7;
         Image[] var8;
         byte var9;
         var6 = null;
         var7 = null;
         var8 = null;
         var9 = -1;
         label102:
         switch(var1) {
         case 0:
            var6 = new PNGMerger(field_array_class_java_lang_String_b[var5] + field_array_class_java_lang_String_c[var2]);
            class_ce.field_array_array_class_javax_microedition_lcdui_Image_a[0] = var7 = new Image[var6.getImgCount()];
            class_ce.field_array_array_class_javax_microedition_lcdui_Image_a[6] = var8 = new Image[var6.getImgCount()];
            var9 = 0;
            break;
         case 1:
            var6 = new PNGMerger(field_array_class_java_lang_String_b[var5] + "b");
            class_ce.field_array_array_class_javax_microedition_lcdui_Image_a[1] = var7 = new Image[var6.getImgCount()];
            class_ce.field_array_array_class_javax_microedition_lcdui_Image_a[7] = var8 = new Image[var6.getImgCount()];
            var9 = 1;
            break;
         case 2:
            var6 = new PNGMerger(field_array_class_java_lang_String_b[var5] + "e");
            class_ce.field_array_array_class_javax_microedition_lcdui_Image_a[4] = var7 = new Image[var6.getImgCount()];
            class_ce.field_array_array_class_javax_microedition_lcdui_Image_a[10] = var8 = new Image[var6.getImgCount()];
            var9 = 4;
            switch(var4) {
            case 1:
               var6.convertImgColor(12574719, 16777152);
               var6.convertImgColor(10469375, 16760703);
               var6.convertImgColor(6258623, 16744255);
               break;
            case 3:
               var6.convertImgColor(12574719, 14679999);
               var6.convertImgColor(10469375, 12574655);
               var6.convertImgColor(6258623, 10469247);
            }

            if (var0 == 8) {
               func_void_a(var6, (byte)4, (byte)10);
            }
            break;
         case 3:
         case 4:
            var6 = new PNGMerger(field_array_class_java_lang_String_b[var5] + field_array_class_java_lang_String_d[var2]);
            class_ce.field_array_array_class_javax_microedition_lcdui_Image_a[2] = var7 = new Image[var6.getImgCount()];
            class_ce.field_array_array_class_javax_microedition_lcdui_Image_a[8] = var8 = new Image[var6.getImgCount()];
            var9 = 2;
            break;
         case 5:
            var6 = new PNGMerger(field_array_class_java_lang_String_b[var5] + field_array_class_java_lang_String_e[var2]);
            if (var3) {
               var7 = new Image[var6.getImgCount()];
               var8 = new Image[var6.getImgCount()];
            } else {
               class_ce.field_array_array_class_javax_microedition_lcdui_Image_a[3] = var7 = new Image[var6.getImgCount()];
               class_ce.field_array_array_class_javax_microedition_lcdui_Image_a[9] = var8 = new Image[var6.getImgCount()];
            }

            var9 = 3;
            if (var4 != 0) {
               switch(var4) {
               case 1:
                  var6.convertImgColor(255, 16744255);
                  break label102;
               case 2:
                  var6.convertImgColor(255, 6258623);
                  break label102;
               case 3:
                  var6.convertImgColor(255, 8388479);
               }
            }
            break;
         case 6:
            var6 = new PNGMerger(field_array_class_java_lang_String_b[var5] + field_array_class_java_lang_String_f[var2]);
            class_ce.field_array_array_class_javax_microedition_lcdui_Image_a[5] = var7 = new Image[var6.getImgCount()];
            class_ce.field_array_array_class_javax_microedition_lcdui_Image_a[11] = var8 = new Image[var6.getImgCount()];
            var9 = 5;
         }

         MyGameCanvas.func_void_k();
         var6.enableLoad = true;
         byte[] var14 = class_ce.getResourceByName(field_array_class_java_lang_String_a[var5] + field_array_class_java_lang_String_g[var1]);
         MyGameCanvas.func_void_k();

         for(int var12 = 0; var12 < var14.length; MyGameCanvas.func_void_k()) {
            byte var15 = var14[var12++];
            byte var16 = var14[var12++];
            byte var17 = var14[var12++];
            byte var18 = var14[var12++];
            byte var10;
            boolean var11;
            int var13;
            byte var24;
            byte[] var25;
            int var26;
            if (var1 != 2) {
               var25 = new byte[1 + var18 * 4];
               var24 = 0;
               var13 = var24 + 1;
               var25[0] = var18;

               for(var26 = 0; var26 < var18; ++var26) {
                  var25[var13++] = var14[var12++];
                  var25[var13++] = var14[var12++];
                  if (var11 = var14[var12++] != 0) {
                     var25[var13++] = (byte)(var9 + 6);
                  } else {
                     var25[var13++] = var9;
                  }

                  if ((var10 = var25[var13++] = var14[var12++]) != -1) {
                     if (!var11 && var7[var10] == null) {
                        var7[var10] = var6.getImageById(var10);
                     } else if (var11 && var8[var10] == null) {
                        var8[var10] = var6.getFlipImageById(var10);
                     }
                  }
               }

               if (!var3) {
                  class_ce.field_array_class_java_lang_Object_a[var16 * 36 + var17 * 9 + var15] = var25;
               } else {
                  class_ce.field_array_class_java_lang_Object_c[var16 * 4 + var17] = var25;
               }
            } else {
               var13 = var12;

               for(int var19 = 0; var19 < var18; ++var19) {
                  byte var20 = var14[var13++];

                  for(int var21 = 0; var21 < var20; ++var21) {
                     var13 += 4;
                  }
               }

               var25 = new byte[1 + (var13 - var12)];
               var24 = 0;
               var13 = var24 + 1;
               var25[0] = var18;

               for(var26 = 0; var26 < var18; ++var26) {
                  byte var27 = var25[var13++] = var14[var12++];

                  for(int var22 = 0; var22 < var27; ++var22) {
                     var25[var13++] = var14[var12++];
                     var25[var13++] = var14[var12++];
                     if (var11 = var14[var12++] != 0) {
                        var25[var13++] = (byte)(var9 + 6);
                     } else {
                        var25[var13++] = var9;
                     }

                     var10 = var25[var13++] = var14[var12++];
                     if (!var11 && var7[var10] == null) {
                        var7[var10] = var6.getImageById(var10);
                     } else if (var11 && var8[var10] == null) {
                        var8[var10] = var6.getFlipImageById(var10);
                     }
                  }
               }

               class_ce.field_array_class_java_lang_Object_a[var16 * 36 + var17 * 9 + var15] = var25;
            }
         }

         var6.func_void_a();
      } catch (IOException var23) {
         var23.printStackTrace();
      }
   }

   // $FF: renamed from: a (int) void
   public static final void func_void_a(int var0) {
      class_ce.field_array_array_class_javax_microedition_lcdui_Image_a[var0] = null;
      class_ce.field_array_array_class_javax_microedition_lcdui_Image_a[var0 + 6] = null;
      if (var0 == 3) {
         class_ce.field_array_class_java_lang_Object_c = null;
      }

      for(int var1 = 0; var1 < 11; ++var1) {
         for(int var2 = 0; var2 < 4; ++var2) {
            switch(var0) {
            case 0:
               class_ce.field_array_class_java_lang_Object_a[var1 * 36 + var2 * 9 + 2] = null;
               class_ce.field_array_class_java_lang_Object_a[var1 * 36 + var2 * 9 + 3] = null;
               class_ce.field_array_class_java_lang_Object_a[var1 * 36 + var2 * 9 + 4] = null;
               class_ce.field_array_class_java_lang_Object_a[var1 * 36 + var2 * 9 + 5] = null;
               break;
            case 1:
               class_ce.field_array_class_java_lang_Object_a[var1 * 36 + var2 * 9 + 0] = null;
               break;
            case 2:
               class_ce.field_array_class_java_lang_Object_a[var1 * 36 + var2 * 9 + 1] = null;
               break;
            case 3:
               class_ce.field_array_class_java_lang_Object_a[var1 * 36 + var2 * 9 + 6] = null;
               break;
            case 4:
               class_ce.field_array_class_java_lang_Object_a[var1 * 36 + var2 * 9 + 7] = null;
               break;
            case 5:
               class_ce.field_array_class_java_lang_Object_a[var1 * 36 + var2 * 9 + 8] = null;
            }
         }
      }

   }

   // $FF: renamed from: a (br, byte, byte) void
   public static final void func_void_a(PNGMerger var0, byte var1, byte var2) {
      var0.enableLoad = true;
      class_ce.field_array_class_java_lang_Object_b = new Object[3];
      byte[] var3;
      class_ce.field_array_class_java_lang_Object_b[0] = var3 = class_ce.getResourceByName(field_array_class_java_lang_String_a[2] + "ea2");
      class_ce.func_void_a(true, var3, 0, var1, var2, var0);
      class_ce.field_array_class_java_lang_Object_b[1] = var3 = class_ce.getResourceByName(field_array_class_java_lang_String_a[2] + "ea3");
      class_ce.func_void_a(true, var3, 0, var1, var2, var0);
      class_ce.field_array_class_java_lang_Object_b[2] = var3 = class_ce.getResourceByName(field_array_class_java_lang_String_a[2] + "ea4");
      class_ce.func_void_a(true, var3, 0, var1, var2, var0);
   }

   // $FF: renamed from: a (javax.microedition.lcdui.Graphics) void
   public static final void func_void_a(Graphics var0) {
      switch(field_byte_a) {
      case 1:
      case 2:
         MyGameCanvas.func_void_c(var0);
         return;
      case 3:
         class_as.func_void_b(var0, MyGameCanvas.canvasWidth - 145 >> 1, MyGameCanvas.field_int_j - 15, 145, 30);
      default:
      }
   }
}
