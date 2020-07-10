package rpg;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import javax.microedition.lcdui.Image;

// $FF: renamed from: ce
public final class class_ce implements class_u {
   // $FF: renamed from: a java.lang.Object[]
   public static Object[] field_array_class_java_lang_Object_a;
   // $FF: renamed from: b java.lang.Object[]
   public static Object[] field_array_class_java_lang_Object_b;
   // $FF: renamed from: c java.lang.Object[]
   public static Object[] field_array_class_java_lang_Object_c;
   // $FF: renamed from: d java.lang.Object[]
   public static Object[] field_array_class_java_lang_Object_d = new Object[3];
   // $FF: renamed from: h byte[]
   public static byte[] field_array_byte_h;
   // $FF: renamed from: e java.lang.Object[]
   public static Object[] field_array_class_java_lang_Object_e = new Object[60];
   // $FF: renamed from: f java.lang.Object[]
   public static Object[] field_array_class_java_lang_Object_f = new Object[5];
   // $FF: renamed from: g java.lang.Object[]
   public static Object[] field_array_class_java_lang_Object_g = new Object[3];
   // $FF: renamed from: h java.lang.Object[]
   public static Object[] field_array_class_java_lang_Object_h = new Object[80];
   // $FF: renamed from: i java.lang.Object[]
   public static Object[] field_array_class_java_lang_Object_i = new Object[12];
   // $FF: renamed from: j java.lang.Object[]
   public static Object[] field_array_class_java_lang_Object_j = new Object[60];
   // $FF: renamed from: i byte[]
   public static byte[] field_array_byte_i = new byte[5];
   // $FF: renamed from: j byte[]
   public static byte[] field_array_byte_j = new byte[5];
   // $FF: renamed from: k byte[]
   public static byte[] field_array_byte_k = new byte[5];
   // $FF: renamed from: l byte[]
   public static byte[] field_array_byte_l = new byte[5];
   // $FF: renamed from: a javax.microedition.lcdui.Image[][]
   public static Image[][] field_array_array_class_javax_microedition_lcdui_Image_a = new Image[38][];
   // $FF: renamed from: a z
   public static class_z field_class_z_a;
   // $FF: renamed from: a javax.microedition.lcdui.Image[]
   public static Image[] field_array_class_javax_microedition_lcdui_Image_a;
   // $FF: renamed from: b javax.microedition.lcdui.Image[]
   public static Image[] field_array_class_javax_microedition_lcdui_Image_b;
   // $FF: renamed from: c javax.microedition.lcdui.Image[]
   public static Image[] field_array_class_javax_microedition_lcdui_Image_c;
   // $FF: renamed from: b z
   public static class_z field_class_z_b;
   // $FF: renamed from: c z
   public static class_z field_class_z_c;
   // $FF: renamed from: d javax.microedition.lcdui.Image[]
   public static Image[] field_array_class_javax_microedition_lcdui_Image_d;
   // $FF: renamed from: e javax.microedition.lcdui.Image[]
   public static Image[] field_array_class_javax_microedition_lcdui_Image_e;
   // $FF: renamed from: f javax.microedition.lcdui.Image[]
   public static Image[] field_array_class_javax_microedition_lcdui_Image_f;
   // $FF: renamed from: g javax.microedition.lcdui.Image[]
   public static Image[] field_array_class_javax_microedition_lcdui_Image_g;
   // $FF: renamed from: h javax.microedition.lcdui.Image[]
   public static Image[] field_array_class_javax_microedition_lcdui_Image_h;
   // $FF: renamed from: d z
   public static class_z field_class_z_d;
   // $FF: renamed from: i javax.microedition.lcdui.Image[]
   public static Image[] field_array_class_javax_microedition_lcdui_Image_i;
   // $FF: renamed from: j javax.microedition.lcdui.Image[]
   public static Image[] field_array_class_javax_microedition_lcdui_Image_j;
   // $FF: renamed from: k javax.microedition.lcdui.Image[]
   public static Image[] field_array_class_javax_microedition_lcdui_Image_k;
   // $FF: renamed from: l javax.microedition.lcdui.Image[]
   public static Image[] field_array_class_javax_microedition_lcdui_Image_l;
   // $FF: renamed from: m javax.microedition.lcdui.Image[]
   public static Image[] field_array_class_javax_microedition_lcdui_Image_m;
   // $FF: renamed from: b javax.microedition.lcdui.Image[][]
   public static Image[][] field_array_array_class_javax_microedition_lcdui_Image_b;
   // $FF: renamed from: n javax.microedition.lcdui.Image[]
   public static Image[] field_array_class_javax_microedition_lcdui_Image_n;
   // $FF: renamed from: o javax.microedition.lcdui.Image[]
   public static Image[] field_array_class_javax_microedition_lcdui_Image_o;
   // $FF: renamed from: a javax.microedition.lcdui.Image
   public static Image field_class_javax_microedition_lcdui_Image_a;
   // $FF: renamed from: b javax.microedition.lcdui.Image
   public static Image field_class_javax_microedition_lcdui_Image_b;
   // $FF: renamed from: c javax.microedition.lcdui.Image
   public static Image field_class_javax_microedition_lcdui_Image_c;
   // $FF: renamed from: d javax.microedition.lcdui.Image
   public static Image field_class_javax_microedition_lcdui_Image_d;
   // $FF: renamed from: e javax.microedition.lcdui.Image
   public static Image field_class_javax_microedition_lcdui_Image_e;
   // $FF: renamed from: f javax.microedition.lcdui.Image
   public static Image field_class_javax_microedition_lcdui_Image_f;
   // $FF: renamed from: g javax.microedition.lcdui.Image
   public static Image field_class_javax_microedition_lcdui_Image_g;
   // $FF: renamed from: h javax.microedition.lcdui.Image
   public static Image field_class_javax_microedition_lcdui_Image_h;
   // $FF: renamed from: i javax.microedition.lcdui.Image
   public static Image field_class_javax_microedition_lcdui_Image_i;
   // $FF: renamed from: j javax.microedition.lcdui.Image
   public static Image field_class_javax_microedition_lcdui_Image_j;
   // $FF: renamed from: k javax.microedition.lcdui.Image
   public static Image field_class_javax_microedition_lcdui_Image_k;
   // $FF: renamed from: l javax.microedition.lcdui.Image
   public static Image field_class_javax_microedition_lcdui_Image_l;
   // $FF: renamed from: m javax.microedition.lcdui.Image
   public static Image field_class_javax_microedition_lcdui_Image_m;
   // $FF: renamed from: n javax.microedition.lcdui.Image
   public static Image field_class_javax_microedition_lcdui_Image_n;
   // $FF: renamed from: o javax.microedition.lcdui.Image
   public static Image field_class_javax_microedition_lcdui_Image_o;
   // $FF: renamed from: p javax.microedition.lcdui.Image[]
   public static Image[] field_array_class_javax_microedition_lcdui_Image_p;
   // $FF: renamed from: p javax.microedition.lcdui.Image
   public static Image field_class_javax_microedition_lcdui_Image_p;
   // $FF: renamed from: q javax.microedition.lcdui.Image
   public static Image field_class_javax_microedition_lcdui_Image_q;
   // $FF: renamed from: e z
   public static class_z field_class_z_e;
   // $FF: renamed from: q javax.microedition.lcdui.Image[]
   public static Image[] field_array_class_javax_microedition_lcdui_Image_q;
   // $FF: renamed from: r javax.microedition.lcdui.Image
   public static Image field_class_javax_microedition_lcdui_Image_r;
   // $FF: renamed from: r javax.microedition.lcdui.Image[]
   public static Image[] field_array_class_javax_microedition_lcdui_Image_r;
   // $FF: renamed from: f z
   public static class_z field_class_z_f;
   // $FF: renamed from: m byte[]
   public static byte[] field_array_byte_m;
   // $FF: renamed from: s javax.microedition.lcdui.Image[]
   public static Image[] field_array_class_javax_microedition_lcdui_Image_s;
   // $FF: renamed from: t javax.microedition.lcdui.Image[]
   public static Image[] field_array_class_javax_microedition_lcdui_Image_t;
   // $FF: renamed from: u javax.microedition.lcdui.Image[]
   public static Image[] field_array_class_javax_microedition_lcdui_Image_u;
   // $FF: renamed from: s javax.microedition.lcdui.Image
   public static Image field_class_javax_microedition_lcdui_Image_s;
   // $FF: renamed from: t javax.microedition.lcdui.Image
   public static Image field_class_javax_microedition_lcdui_Image_t;
   // $FF: renamed from: u javax.microedition.lcdui.Image
   public static Image field_class_javax_microedition_lcdui_Image_u;
   // $FF: renamed from: v javax.microedition.lcdui.Image
   public static Image field_class_javax_microedition_lcdui_Image_v;
   // $FF: renamed from: w javax.microedition.lcdui.Image
   public static Image field_class_javax_microedition_lcdui_Image_w;
   // $FF: renamed from: x javax.microedition.lcdui.Image
   public static Image field_class_javax_microedition_lcdui_Image_x;
   // $FF: renamed from: y javax.microedition.lcdui.Image
   public static Image field_class_javax_microedition_lcdui_Image_y;
   // $FF: renamed from: z javax.microedition.lcdui.Image
   public static Image field_class_javax_microedition_lcdui_Image_z;
   // $FF: renamed from: A javax.microedition.lcdui.Image
   public static Image field_class_javax_microedition_lcdui_Image_A;
   // $FF: renamed from: B javax.microedition.lcdui.Image
   public static Image field_class_javax_microedition_lcdui_Image_B;
   // $FF: renamed from: C javax.microedition.lcdui.Image
   public static Image field_class_javax_microedition_lcdui_Image_C;
   // $FF: renamed from: D javax.microedition.lcdui.Image
   public static Image field_class_javax_microedition_lcdui_Image_D;
   // $FF: renamed from: v javax.microedition.lcdui.Image[]
   public static Image[] field_array_class_javax_microedition_lcdui_Image_v;
   // $FF: renamed from: w javax.microedition.lcdui.Image[]
   public static Image[] field_array_class_javax_microedition_lcdui_Image_w;
   // $FF: renamed from: g z
   public static class_z field_class_z_g;
   // $FF: renamed from: n byte[]
   public static byte[] field_array_byte_n = new byte[512];

   private class_ce() {
   }

   // $FF: renamed from: a (byte) void
   public static final void func_void_a(byte var0) {
      try {
         PNGMerger var1;
         (var1 = new PNGMerger("/img/atteff1")).enableLoad = true;
         func_void_a(var1, var0);
         field_array_class_javax_microedition_lcdui_Image_s = new Image[3];
         field_array_class_javax_microedition_lcdui_Image_s[0] = var1.getImageById(0);
         field_array_class_javax_microedition_lcdui_Image_s[1] = var1.getImageById(1);
         field_array_class_javax_microedition_lcdui_Image_s[2] = var1.getImageById(2);
         MyGameCanvas.func_void_k();
         var1.fromImgPath("/img/atteff2");
         func_void_a(var1, var0);
         field_array_class_javax_microedition_lcdui_Image_t = new Image[3];
         field_array_class_javax_microedition_lcdui_Image_t[0] = var1.getImageById(0);
         field_array_class_javax_microedition_lcdui_Image_t[1] = var1.getImageById(1);
         field_array_class_javax_microedition_lcdui_Image_t[2] = var1.getImageById(2);
         MyGameCanvas.func_void_k();
         var1.fromImgPath("/img/atteff3");
         field_array_class_javax_microedition_lcdui_Image_u = new Image[3];
         field_array_class_javax_microedition_lcdui_Image_u[0] = var1.getImageById(0);
         field_array_class_javax_microedition_lcdui_Image_u[1] = var1.getImageById(1);
         field_array_class_javax_microedition_lcdui_Image_u[2] = var1.getImageById(2);
         MyGameCanvas.func_void_k();
      } catch (IOException var2) {
         var2.printStackTrace();
      }
   }

   // $FF: renamed from: a () void
   public static final void func_void_a() {
      field_array_class_javax_microedition_lcdui_Image_s = null;
      field_array_class_javax_microedition_lcdui_Image_t = null;
      field_array_class_javax_microedition_lcdui_Image_u = null;
   }

   // $FF: renamed from: a (br, byte) void
   private static final void func_void_a(PNGMerger var0, byte var1) {
      switch(var1) {
      case 1:
         var0.convertImgColor(12574719, 16777152);
         var0.convertImgColor(10469375, 16760703);
         var0.convertImgColor(6258623, 16744255);
         return;
      case 3:
         var0.convertImgColor(12574719, 14679999);
         var0.convertImgColor(10469375, 12574655);
         var0.convertImgColor(6258623, 10469247);
      default:
      }
   }

   // $FF: renamed from: b () void
   public static final void func_void_b() {
      field_array_class_javax_microedition_lcdui_Image_e = null;
   }

   // $FF: renamed from: c () void
   public static final void func_void_c() {
      field_array_class_javax_microedition_lcdui_Image_f = null;
   }

   // $FF: renamed from: d () void
   public static final void func_void_d() {
      field_array_class_javax_microedition_lcdui_Image_g = null;
   }

   // $FF: renamed from: e () void
   public static final void func_void_e() {
      field_array_class_java_lang_Object_e = new Object[60];
      field_array_class_java_lang_Object_h = new Object[80];
      field_array_byte_k = new byte[5];

      for(int var0 = 0; var0 < 10; ++var0) {
         field_array_array_class_javax_microedition_lcdui_Image_a[15 + var0] = null;
      }

   }

   // $FF: renamed from: a (byte, byte) void
   public static final void func_void_a(byte var0, byte var1) {
      if (var0 == 0 && var1 == 0) {
         field_array_class_java_lang_Object_d[var1] = getResourceByName("/grd/spr/0_01.eif");
         func_void_a(true, (byte[])((byte[])field_array_class_java_lang_Object_d[var1]), 0, (byte)12, (byte)-1, (PNGMerger)null);
         field_array_byte_m = getResourceByName("/grd/spr/0_02.eif");
         func_void_a(true, field_array_byte_m, 0, (byte)12, (byte)-1, (PNGMerger)null);
      } else {
         String var2 = "/grd/spr/" + var0 + "_" + var1 + ".eif";
         field_array_class_java_lang_Object_d[var1] = getResourceByName(var2);
         func_void_a(true, (byte[])((byte[])field_array_class_java_lang_Object_d[var1]), 0, (byte)12, (byte)-1, (PNGMerger)null);
      }

      (new StringBuffer()).append("GuardianSprite : ").append(var0).append(", ").append(var1).toString();
   }

   // $FF: renamed from: f () void
   public static final void func_void_f() {
      field_array_class_java_lang_Object_d = new Object[3];
      field_array_byte_m = null;
   }

   // $FF: renamed from: a (boolean, byte[], int, byte, byte, br) void
   public static final void func_void_a(boolean var0, byte[] var1, int var2, byte var3, byte var4, PNGMerger var5) {
      byte var6 = var1[var2++];
      if (var5 != null) {
         var5.enableLoad = true;
         if (field_array_array_class_javax_microedition_lcdui_Image_a[var3] == null) {
            field_array_array_class_javax_microedition_lcdui_Image_a[var3] = new Image[var5.getImgCount()];
         }

         if (var4 != -1 && field_array_array_class_javax_microedition_lcdui_Image_a[var4] == null) {
            field_array_array_class_javax_microedition_lcdui_Image_a[var4] = new Image[var5.getImgCount()];
         }
      }

      MyGameCanvas.func_void_k();

      for(int var11 = 0; var11 < var6; ++var11) {
         byte var7;
         if (var0) {
            var7 = var1[var2++];
         } else {
            var7 = 1;
         }

         for(int var12 = 0; var12 < var7; ++var12) {
            ++var2;
            ++var2;
            boolean var8 = var1[var2++] != 0;
            byte var13 = var1[var2++];
            byte var9;
            var1[var2 - 2] = var9 = var8 ? var4 : var3;
            class_x.func_void_a(var9 > 0);
            Image[] var10;
            if (var5 != null && (var10 = (Image[])field_array_array_class_javax_microedition_lcdui_Image_a[var9])[var13] == null) {
               var10[var13] = var8 ? var5.getFlipImageById(var13) : var5.getImageById(var13);
               MyGameCanvas.func_void_k();
            }
         }
      }

   }

   // $FF: renamed from: g () void
   public static final void func_void_g() {
      PNGMerger var0 = null;

      try {
         (var0 = new PNGMerger("/img/uifrm")).enableLoad = true;
         field_array_class_javax_microedition_lcdui_Image_q = new Image[7];

         for(int var1 = 0; var1 < 7; ++var1) {
            field_array_class_javax_microedition_lcdui_Image_q[var1] = var0.getImageById(var1);
            MyGameCanvas.func_void_k();
         }

         field_array_class_javax_microedition_lcdui_Image_r = new Image[4];
         field_array_class_javax_microedition_lcdui_Image_r[0] = var0.getImageById(7);
         field_array_class_javax_microedition_lcdui_Image_r[1] = var0.getFlipImageById(7);
         MyGameCanvas.func_void_k();
         field_array_class_javax_microedition_lcdui_Image_r[2] = var0.getImageById(8);
         field_array_class_javax_microedition_lcdui_Image_r[3] = var0.getFlipImageById(8);
         MyGameCanvas.func_void_k();
         (var0 = new PNGMerger("/img/etcui")).enableLoad = true;
         field_class_javax_microedition_lcdui_Image_s = class_bh.func_class_javax_microedition_lcdui_Image_a("_img_etcui__0.png");
         field_class_javax_microedition_lcdui_Image_t = class_bh.func_class_javax_microedition_lcdui_Image_a("_img_etcui__1.png");
         var0.getImageById(2);
         MyGameCanvas.func_void_k();
         field_class_javax_microedition_lcdui_Image_u = var0.getImageById(3);
         field_class_javax_microedition_lcdui_Image_v = class_bh.func_class_javax_microedition_lcdui_Image_a("_img_etcui__4.png");
         field_class_javax_microedition_lcdui_Image_w = var0.getImageById(5);
         field_class_javax_microedition_lcdui_Image_x = var0.getImageById(6);
         MyGameCanvas.func_void_k();
         field_class_javax_microedition_lcdui_Image_y = var0.getImageById(7);
         field_class_javax_microedition_lcdui_Image_z = var0.getImageById(8);
         field_class_javax_microedition_lcdui_Image_A = var0.getImageById(9);
         field_class_javax_microedition_lcdui_Image_B = var0.getImageById(10);
         field_class_javax_microedition_lcdui_Image_C = var0.getImageById(11);
         MyGameCanvas.func_void_k();
         var0 = new PNGMerger("/char/lvup");
         field_array_byte_h = getResourceByName("/char/lvup.eif");
         MyGameCanvas.func_void_k();
         func_void_a(true, field_array_byte_h, 0, (byte)13, (byte)-1, var0);
      } catch (Exception var2) {
         System.out.println(var2);
      }
   }

   // $FF: renamed from: h () void
   public static final void func_void_h() {
      field_array_class_javax_microedition_lcdui_Image_q = null;
      field_array_class_javax_microedition_lcdui_Image_r = null;
      field_class_javax_microedition_lcdui_Image_s = null;
      field_class_javax_microedition_lcdui_Image_t = null;
      field_class_javax_microedition_lcdui_Image_u = null;
      field_class_javax_microedition_lcdui_Image_v = null;
      field_class_javax_microedition_lcdui_Image_w = null;
      field_class_javax_microedition_lcdui_Image_x = null;
      field_class_javax_microedition_lcdui_Image_y = null;
      field_class_javax_microedition_lcdui_Image_z = null;
      field_class_javax_microedition_lcdui_Image_A = null;
      field_class_javax_microedition_lcdui_Image_B = null;
      field_class_javax_microedition_lcdui_Image_C = null;
      field_array_byte_h = null;
      field_array_array_class_javax_microedition_lcdui_Image_a[13] = null;
   }

   // $FF: renamed from: i () void
   public static final void func_void_i() {
      PNGMerger var0 = null;

      try {
         (var0 = new PNGMerger("/img/keepst")).enableLoad = true;
         field_class_javax_microedition_lcdui_Image_D = var0.getImageById(0);
         MyGameCanvas.func_void_k();
         field_array_class_javax_microedition_lcdui_Image_v = new Image[8];

         for(int var1 = 0; var1 < 8; ++var1) {
            field_array_class_javax_microedition_lcdui_Image_v[var1] = var0.getImageById(var1 + 1);
         }

         MyGameCanvas.func_void_k();
         field_array_class_javax_microedition_lcdui_Image_w = (new PNGMerger("/img/emoti")).getAllImage();
         MyGameCanvas.func_void_k();
      } catch (Exception var2) {
         System.out.println(var2);
      }
   }

   // $FF: renamed from: j () void
   public static final void func_void_j() {
      field_class_javax_microedition_lcdui_Image_D = null;
      field_array_class_javax_microedition_lcdui_Image_v = null;
      field_array_class_javax_microedition_lcdui_Image_w = null;
   }

   // $FF: renamed from: b (byte) void
   public static final void func_void_b(byte var0) {
      field_array_class_javax_microedition_lcdui_Image_a = new Image[2];
      PNGMerger var1 = null;

      try {
         switch(var0) {
         case 0:
         case 3:
            var1 = new PNGMerger("/grd/fi");
            break;
         case 1:
         case 4:
            var1 = new PNGMerger("/grd/wa");
            break;
         case 2:
         case 5:
            var1 = new PNGMerger("/grd/gr");
         }

         field_array_array_class_javax_microedition_lcdui_Image_a[12] = var1.getAllImage();
         (var1 = new PNGMerger("/grd/" + var0)).enableLoad = true;
         field_array_class_javax_microedition_lcdui_Image_a[0] = var1.getImageById(0);
         field_array_class_javax_microedition_lcdui_Image_a[1] = var1.getImageById(1);
      } catch (IOException var3) {
         var3.printStackTrace();
      }
   }

   // $FF: renamed from: k () void
   public static final void func_void_k() {
      field_array_class_javax_microedition_lcdui_Image_a = null;
      field_array_array_class_javax_microedition_lcdui_Image_a[12] = null;
   }

   // $FF: renamed from: a (short, byte, boolean) void
   public static final void func_void_a(short var0, byte var1, boolean var2) {
      try {
         PNGMerger var3;
         (var3 = new PNGMerger("/enm/" + (var0 < 10 ? "0" : "") + var0)).enableLoad = true;
         MyGameCanvas.func_void_k();
         byte[] var4 = getResourceByName("/enm/spr/" + (var0 < 10 ? "0" : "") + var0);
         MyGameCanvas.func_void_k();
         int var5 = 0;

         while(var5 < var4.length) {
            byte var6 = var4[var5++];
            byte var7 = var4[var5++];
            byte var8 = var4[var5++];
            if (var2) {
               if (var6 == 0) {
                  field_array_byte_i[var1] = var4[var5];
               } else if (var6 == 1) {
                  field_array_byte_j[var1] = var4[var5];
               }

               field_array_class_java_lang_Object_j[var1 * 12 + var6 * 4 + var7] = new byte[var8];
               func_void_a(true, var4, var5, (byte)(27 + var1), (byte)(27 + var1 + 5), var3);
               System.arraycopy(var4, var5, field_array_class_java_lang_Object_j[var1 * 12 + var6 * 4 + var7], 0, var8);
            } else {
               field_array_class_java_lang_Object_e[var1 * 12 + var6 * 4 + var7] = new byte[var8];
               func_void_a(true, var4, var5, (byte)(15 + var1), (byte)(15 + var1 + 5), var3);
               System.arraycopy(var4, var5, field_array_class_java_lang_Object_e[var1 * 12 + var6 * 4 + var7], 0, var8);
            }

            var5 += var8;
            MyGameCanvas.func_void_k();
         }

         if (!var2 && class_j.field_array_class_j_a[var1].field_byte_d >= 2) {
            var4 = getResourceByName("/enm/atef/" + (var0 < 10 ? "0" : "") + var0);
            func_void_a(true, var4, 0, (byte)(15 + var1), (byte)(15 + var1 + 5), var3);
            field_array_class_java_lang_Object_f[var1] = var4;
         }

         MyGameCanvas.func_void_k();
      } catch (IOException var9) {
         var9.printStackTrace();
      }
   }

   // $FF: renamed from: c (byte) void
   public static final void func_void_c(byte var0) {
      field_array_array_class_javax_microedition_lcdui_Image_a[15 + var0] = null;
      field_array_array_class_javax_microedition_lcdui_Image_a[15 + var0 + 5] = null;

      for(int var1 = 0; var1 < 12; ++var1) {
         field_array_class_java_lang_Object_e[var0 * 12 + var1] = null;
      }

   }

   // $FF: renamed from: l () void
   public static final void func_void_l() {
      try {
         PNGMerger var0;
         (var0 = new PNGMerger("/enm/die/bang")).enableLoad = true;

         for(int var1 = 0; var1 < 3; ++var1) {
            byte[] var2 = getResourceByName("/enm/die/" + var1);
            func_void_a(true, var2, 0, (byte)37, (byte)-1, var0);
            field_array_class_java_lang_Object_g[var1] = var2;
         }

      } catch (IOException var3) {
      }
   }

   // $FF: renamed from: b (byte, byte) void
   public static final void func_void_b(byte var0, byte var1) {
      try {
         PNGMerger var2;
         (var2 = new PNGMerger("/npc/" + (var0 < 10 ? "0" : "") + var0)).enableLoad = true;
         MyGameCanvas.func_void_k();
         byte[] var3 = getResourceByName("/npc/spr/" + (var0 < 10 ? "0" : "") + var0);
         MyGameCanvas.func_void_k();
         int var4 = 0;

         while(var4 < var3.length) {
            byte var5 = var3[var4++];
            byte var6 = var3[var4++];
            byte var7 = var3[var4++];
            field_array_class_java_lang_Object_j[var1 * 12 + var5 * 4 + var6] = new byte[var7];
            if (var5 == 0) {
               field_array_byte_i[var1] = var3[var4];
            } else if (var5 == 1) {
               field_array_byte_j[var1] = var3[var4];
            }

            func_void_a(true, var3, var4, (byte)(27 + var1), (byte)(27 + var1 + 5), var2);
            System.arraycopy(var3, var4, field_array_class_java_lang_Object_j[var1 * 12 + var5 * 4 + var6], 0, var7);
            var4 += var7;
            MyGameCanvas.func_void_k();
         }

      } catch (IOException var8) {
         var8.printStackTrace();
      }
   }

   // $FF: renamed from: d (byte) void
   public static final void func_void_d(byte var0) {
      field_array_array_class_javax_microedition_lcdui_Image_a[27 + var0] = null;
      field_array_array_class_javax_microedition_lcdui_Image_a[27 + var0 + 5] = null;

      for(int var1 = 0; var1 < 12; ++var1) {
         field_array_class_java_lang_Object_j[var0 * 12 + var1] = null;
      }

   }

   // $FF: renamed from: e (byte) void
   public static final void func_void_e(byte var0) {
      try {
         PNGMerger var1;
         (var1 = new PNGMerger("/boss/" + var0)).enableLoad = true;
         byte var2;
         byte var3;
         switch(var0) {
         case 1:
            var2 = 32;
            var3 = 32;
            break;
         case 2:
            var2 = 35;
            var3 = 38;
            break;
         case 3:
            var2 = 39;
            var3 = 41;
            break;
         case 4:
            var2 = 42;
            var3 = 42;
            break;
         default:
            class_x.func_void_a(false);
            var2 = -1;
            var3 = -1;
         }

         for(byte var4 = var2; var4 <= var3; ++var4) {
            byte[] var5 = getResourceByName("/boss/spr/" + var0 + "_" + var4);
            int var6 = 0;

            while(var6 < var5.length) {
               byte var7 = func_byte_a(var4);
               byte var8 = var5[var6++];
               byte var9 = var5[var6++];
               int var10001 = var6++;
               byte var10000 = var5[var10001];
               byte var13 = var5[var10001];
               byte[] var11 = new byte[var10000 & 255];
               func_void_a(true, var5, var6, (byte)25, (byte)26, var1);
               System.arraycopy(var5, var6, var11, 0, var11.length);
               var6 += var11.length;
               if (var8 <= 3) {
                  field_array_class_java_lang_Object_h[var7 * 16 + var8 * 4 + var9] = var11;
               }

               if (var0 == 1 && var8 >= 3) {
                  field_array_class_java_lang_Object_i[(var8 - 3) * 4 + var9] = var11;
               }
            }

            if ((var5 = getResourceByName("/boss/atef/" + (var4 < 10 ? "0" : "") + var4)) != null) {
               func_void_a(true, var5, 0, (byte)25, (byte)26, var1);
               field_array_class_java_lang_Object_f[func_byte_a(var4)] = var5;
            }
         }

      } catch (IOException var12) {
         var12.printStackTrace();
      }
   }

   // $FF: renamed from: m () void
   public static final void func_void_m() {
      field_array_array_class_javax_microedition_lcdui_Image_a[25] = null;
      field_array_array_class_javax_microedition_lcdui_Image_a[26] = null;
      field_array_class_java_lang_Object_i = new Object[12];
   }

   // $FF: renamed from: n () void
   public static final void func_void_n() {
      PNGMerger var0 = null;
      field_array_class_javax_microedition_lcdui_Image_n = new Image[6];
      field_array_class_javax_microedition_lcdui_Image_o = new Image[5];

      try {
         (var0 = new PNGMerger("/sgui/gmico")).enableLoad = true;

         byte var1;
         for(var1 = 0; var1 < 6; ++var1) {
            field_array_class_javax_microedition_lcdui_Image_n[var1] = var0.getImageById(var1 == 5 ? 6 : var1);
         }

         for(var1 = 0; var1 < 5; ++var1) {
            field_array_class_javax_microedition_lcdui_Image_o[var1] = var0.getImageById(var1 + 7);
         }

      } catch (Exception var2) {
         System.out.println(var2);
      }
   }

   // $FF: renamed from: o () void
   public static final void func_void_o() {
      PNGMerger var0 = null;

      try {
         (var0 = new PNGMerger("/img/glb")).enableLoad = true;
         field_class_javax_microedition_lcdui_Image_k = var0.getImageById(0);
         field_class_javax_microedition_lcdui_Image_n = var0.getImageById(1);
         field_class_javax_microedition_lcdui_Image_o = var0.getImageById(2);
         field_class_javax_microedition_lcdui_Image_d = var0.getImageById(3);
         field_class_javax_microedition_lcdui_Image_r = var0.getImageById(5);
         field_class_javax_microedition_lcdui_Image_l = var0.getImageById(6);
         field_class_javax_microedition_lcdui_Image_m = var0.getImageById(7);
         field_class_javax_microedition_lcdui_Image_a = var0.getImageById(8);
         field_class_javax_microedition_lcdui_Image_e = class_bh.func_class_javax_microedition_lcdui_Image_a("_img_glb__9.png");
         field_class_javax_microedition_lcdui_Image_f = class_bh.func_class_javax_microedition_lcdui_Image_a("_img_glb__10.png");
         field_class_javax_microedition_lcdui_Image_g = class_bh.func_class_javax_microedition_lcdui_Image_a("_img_glb__11.png");
         field_class_javax_microedition_lcdui_Image_h = class_bh.func_class_javax_microedition_lcdui_Image_a("_img_glb__12.png");
         class_bh.func_class_javax_microedition_lcdui_Image_a("_img_glb__13.png");
         field_class_javax_microedition_lcdui_Image_i = var0.getImageById(14);
         field_class_javax_microedition_lcdui_Image_j = class_bh.func_class_javax_microedition_lcdui_Image_a("_img_glb__15.png");
         var0.getImageById(16);
         field_class_z_e = new class_z("/sgui/help");
      } catch (Exception var2) {
         System.out.println(var2);
      }
   }

   // $FF: renamed from: p () void
   public static final void func_void_p() {
      try {
         field_array_class_javax_microedition_lcdui_Image_d = (new PNGMerger("/img/icoitm")).getAllImage();
      } catch (Exception var1) {
         var1.printStackTrace();
      }
   }

   // $FF: renamed from: q () void
   public static final void func_void_q() {
      field_array_class_javax_microedition_lcdui_Image_d = null;
   }

   // $FF: renamed from: r () void
   public static final void func_void_r() {
      MyGameCanvas.func_void_k();
      field_array_class_javax_microedition_lcdui_Image_p = new Image[6];
      PNGMerger var0 = null;

      try {
         (var0 = new PNGMerger("/sgui/shop")).enableLoad = true;
         MyGameCanvas.func_void_k();

         for(byte var1 = 0; var1 < 6; ++var1) {
            field_array_class_javax_microedition_lcdui_Image_p[var1] = var0.getImageById(var1);
         }

         field_class_javax_microedition_lcdui_Image_q = var0.getImageById(6);
         field_class_javax_microedition_lcdui_Image_p = var0.getImageById(7);
         MyGameCanvas.func_void_k();
         field_class_javax_microedition_lcdui_Image_b = class_bh.func_class_javax_microedition_lcdui_Image_a("_sgui_shop__8.png");
         field_class_javax_microedition_lcdui_Image_c = class_bh.func_class_javax_microedition_lcdui_Image_a("_sgui_shop__9.png");
      } catch (Exception var2) {
         System.out.println(var2);
      }
   }

   // $FF: renamed from: s () void
   public static final void func_void_s() {
      field_array_class_javax_microedition_lcdui_Image_p = null;
      field_class_javax_microedition_lcdui_Image_q = null;
      field_class_javax_microedition_lcdui_Image_p = null;
      field_class_javax_microedition_lcdui_Image_b = null;
      field_class_javax_microedition_lcdui_Image_c = null;
   }

   // $FF: renamed from: t () void
   public static final void func_void_t() {
      field_array_class_javax_microedition_lcdui_Image_b = new Image[6];
      field_array_class_javax_microedition_lcdui_Image_c = new Image[24];
      PNGMerger var0 = null;

      try {
         (var0 = new PNGMerger("/grd/grdico")).enableLoad = true;

         for(byte var1 = 0; var1 < 6; ++var1) {
            field_array_class_javax_microedition_lcdui_Image_b[var1] = var0.getImageById(var1);

            for(byte var2 = 0; var2 < 4; ++var2) {
               field_array_class_javax_microedition_lcdui_Image_c[var1 * 4 + var2] = var0.getImageById(6 + var1 * 4 + var2);
            }

            MyGameCanvas.func_void_k();
         }

      } catch (Exception var3) {
         System.out.println(var3);
      }
   }

   // $FF: renamed from: u () void
   public static final void func_void_u() {
      field_array_class_javax_microedition_lcdui_Image_b = null;
      field_array_class_javax_microedition_lcdui_Image_c = null;
   }

   // $FF: renamed from: a (byte, byte) byte[]
   public static final byte[] func_array_byte_a(byte var0, byte var1) {
      InputStream var2 = null;
      byte[] var3 = null;
      String var4 = String.valueOf(var0);
      if (var0 < 10) {
         var4 = "0" + var4;
      }

      try {
         var2 = (new Object()).getClass().getResourceAsStream("/itm/" + var4);
         boolean var5 = false;

         for(int var6 = 0; var6 < var1; ++var6) {
            int var8 = var2.read();
            var2.skip((long)var8);
         }

         var3 = new byte[var2.read()];
         var2.read(var3);
         var2.close();
      } catch (IOException var7) {
         var7.printStackTrace();
      }

      return var3;
   }

   // $FF: renamed from: a () byte[]
   public static final byte[] func_array_byte_a() {
      return getResourceByName("/itm/forshop");
   }

   // $FF: renamed from: f (byte) void
   public static final void func_void_f(byte var0) {
      MyGameCanvas.func_void_k();
      func_void_b(var0);
      switch(var0) {
      case 0:
         func_void_a(var0, (byte)0);
         func_void_a(var0, (byte)1);
         return;
      case 1:
         func_void_a(var0, (byte)0);
         func_void_a(var0, (byte)1);
         return;
      case 2:
      case 3:
      case 4:
      case 5:
         func_void_a(var0, (byte)0);
         func_void_a(var0, (byte)1);
         func_void_a(var0, (byte)2);
      default:
      }
   }

   // $FF: renamed from: v () void
   public static final void func_void_v() {
      func_void_k();
      func_void_f();
   }

   // $FF: renamed from: w () void
   public static final void func_void_w() {
      try {
         field_array_class_javax_microedition_lcdui_Image_i = (new PNGMerger("/img/logo")).getAllImage();
      } catch (IOException var2) {
      }
   }

   // $FF: renamed from: x () void
   public static final void func_void_x() {
      field_array_class_javax_microedition_lcdui_Image_i = null;
   }

   // $FF: renamed from: y () void
   public static final void func_void_y() {
      try {
         field_array_class_javax_microedition_lcdui_Image_j = (new PNGMerger("/img/title1")).getAllImage();
         MyGameCanvas.func_void_k();
         PNGMerger var0;
         (var0 = new PNGMerger("/img/title2")).enableLoad = true;
         field_array_class_javax_microedition_lcdui_Image_k = new Image[10];

         for(int var1 = 0; var1 < 5; ++var1) {
            field_array_class_javax_microedition_lcdui_Image_k[var1] = var0.getImageById(var1);
            field_array_class_javax_microedition_lcdui_Image_k[var1 + 5] = var0.getFlipImageById(var1);
            MyGameCanvas.func_void_k();
         }

         MyGameCanvas.func_void_k();
         class_bw.func_void_a((byte)22);
      } catch (IOException var2) {
         var2.printStackTrace();
      }
   }

   // $FF: renamed from: z () void
   public static final void func_void_z() {
      field_array_class_javax_microedition_lcdui_Image_j = null;
      field_array_class_javax_microedition_lcdui_Image_k = null;
      class_bw.func_void_b((byte)22);
   }

   // $FF: renamed from: A () void
   public static final void func_void_A() {
      try {
         PNGMerger var0;
         (var0 = new PNGMerger("/sgui/mm/face")).enableLoad = true;
         field_array_class_javax_microedition_lcdui_Image_m = new Image[6];
         field_array_class_javax_microedition_lcdui_Image_m[0] = var0.getImageById(0);
         field_array_class_javax_microedition_lcdui_Image_m[1] = var0.getImageById(1);
         field_array_class_javax_microedition_lcdui_Image_m[2] = var0.getImageById(2);
         MyGameCanvas.func_void_k();
         field_array_class_javax_microedition_lcdui_Image_m[3] = var0.getImageGrayscale(0);
         field_array_class_javax_microedition_lcdui_Image_m[4] = var0.getImageGrayscale(1);
         field_array_class_javax_microedition_lcdui_Image_m[5] = var0.getImageGrayscale(2);
         MyGameCanvas.func_void_k();
         field_array_class_javax_microedition_lcdui_Image_l = (new PNGMerger("/sgui/mm/etc")).getAllImage();
         field_array_array_class_javax_microedition_lcdui_Image_b = new Image[3][2];

         for(int var1 = 0; var1 < 3; ++var1) {
            (var0 = new PNGMerger("/grd/" + var1)).enableLoad = true;
            field_array_array_class_javax_microedition_lcdui_Image_b[var1][0] = var0.getImageById(0);
            field_array_array_class_javax_microedition_lcdui_Image_b[var1][1] = var0.getImageById(1);
            MyGameCanvas.func_void_k();
         }

      } catch (IOException var2) {
         var2.printStackTrace();
      }
   }

   // $FF: renamed from: B () void
   public static final void func_void_B() {
      field_array_class_javax_microedition_lcdui_Image_l = null;
      field_array_class_javax_microedition_lcdui_Image_m = null;
      field_array_array_class_javax_microedition_lcdui_Image_b = (Image[][])null;
   }

   // $FF: renamed from: a (java.lang.String) byte[]
   public static final byte[] getResourceByName(String var0) {
      System.gc();
      InputStream var2 = null;
      byte[] var3 = null;

      try {
         if ((var2 = (new Object()).getClass().getResourceAsStream(var0)) == null) {
            return null;
         }

         ByteArrayOutputStream var4 = new ByteArrayOutputStream();

         int var5;
         while((var5 = var2.read(field_array_byte_n)) != -1) {
            var4.write(field_array_byte_n, 0, var5);
         }

         var3 = var4.toByteArray();
         var4.close();
      } catch (Exception var7) {
         (new StringBuffer()).append("miss - ").append(var0).toString();
         var7.printStackTrace();
      }

      while(class_n.field_int_e == 15) {
         try {
            Thread.sleep(100L);
         } catch (InterruptedException var6) {
            var6.printStackTrace();
         }
      }

      return var3;
   }

   // $FF: renamed from: a (byte) byte
   public static final byte func_byte_a(byte var0) {
      for(byte var1 = 0; var1 < field_array_byte_k.length; ++var1) {
         if (field_array_byte_k[var1] == var0) {
            return var1;
         }
      }

      return -1;
   }
}
