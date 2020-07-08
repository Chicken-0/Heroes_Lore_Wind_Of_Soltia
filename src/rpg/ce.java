package rpg;

/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Image
 */
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import javax.microedition.lcdui.Image;

public final class ce
implements u {
    public static Object[] var_java_lang_Object_arr_a;
    public static Object[] var_java_lang_Object_arr_b;
    public static Object[] var_java_lang_Object_arr_c;
    public static Object[] var_java_lang_Object_arr_d = new Object[3];
    public static byte[] var_byte_arr_h;
    public static Object[] var_java_lang_Object_arr_e = new Object[60];
    public static Object[] var_java_lang_Object_arr_f = new Object[5];
    public static Object[] var_java_lang_Object_arr_g = new Object[3];
    public static Object[] var_java_lang_Object_arr_h = new Object[80];
    public static Object[] var_java_lang_Object_arr_i = new Object[12];
    public static Object[] var_java_lang_Object_arr_j = new Object[60];
    public static byte[] var_byte_arr_i = new byte[5];
    public static byte[] var_byte_arr_j = new byte[5];
    public static byte[] var_byte_arr_k = new byte[5];
    public static byte[] var_byte_arr_l = new byte[5];
    public static Image[][] var_javax_microedition_lcdui_Image_arr_arr_a = new Image[38][];
    public static TableDefineTextFile var_z_a;
    public static Image[] var_javax_microedition_lcdui_Image_arr_a;
    public static Image[] var_javax_microedition_lcdui_Image_arr_b;
    public static Image[] var_javax_microedition_lcdui_Image_arr_c;
    public static TableDefineTextFile var_z_b;
    public static TableDefineTextFile var_z_c;
    public static Image[] var_javax_microedition_lcdui_Image_arr_d;
    public static Image[] var_javax_microedition_lcdui_Image_arr_e;
    public static Image[] arrayImgMap;
    public static Image[] var_javax_microedition_lcdui_Image_arr_g;
    public static Image[] var_javax_microedition_lcdui_Image_arr_h;
    public static TableDefineTextFile var_z_d;
    public static Image[] var_javax_microedition_lcdui_Image_arr_i;
    public static Image[] var_javax_microedition_lcdui_Image_arr_j;
    public static Image[] var_javax_microedition_lcdui_Image_arr_k;
    public static Image[] var_javax_microedition_lcdui_Image_arr_l;
    public static Image[] var_javax_microedition_lcdui_Image_arr_m;
    public static Image[][] var_javax_microedition_lcdui_Image_arr_arr_b;
    public static Image[] var_javax_microedition_lcdui_Image_arr_n;
    public static Image[] var_javax_microedition_lcdui_Image_arr_o;
    public static Image var_javax_microedition_lcdui_Image_a;
    public static Image var_javax_microedition_lcdui_Image_b;
    public static Image var_javax_microedition_lcdui_Image_c;
    public static Image var_javax_microedition_lcdui_Image_d;
    public static Image var_javax_microedition_lcdui_Image_e;
    public static Image var_javax_microedition_lcdui_Image_f;
    public static Image var_javax_microedition_lcdui_Image_g;
    public static Image var_javax_microedition_lcdui_Image_h;
    public static Image var_javax_microedition_lcdui_Image_i;
    public static Image var_javax_microedition_lcdui_Image_j;
    public static Image var_javax_microedition_lcdui_Image_k;
    public static Image var_javax_microedition_lcdui_Image_l;
    public static Image var_javax_microedition_lcdui_Image_m;
    public static Image var_javax_microedition_lcdui_Image_n;
    public static Image var_javax_microedition_lcdui_Image_o;
    public static Image[] var_javax_microedition_lcdui_Image_arr_p;
    public static Image var_javax_microedition_lcdui_Image_p;
    public static Image var_javax_microedition_lcdui_Image_q;
    public static TableDefineTextFile var_z_e;
    public static Image[] var_javax_microedition_lcdui_Image_arr_q;
    public static Image var_javax_microedition_lcdui_Image_r;
    public static Image[] var_javax_microedition_lcdui_Image_arr_r;
    public static TableDefineTextFile var_z_f;
    public static byte[] var_byte_arr_m;
    public static Image[] var_javax_microedition_lcdui_Image_arr_s;
    public static Image[] var_javax_microedition_lcdui_Image_arr_t;
    public static Image[] var_javax_microedition_lcdui_Image_arr_u;
    public static Image var_javax_microedition_lcdui_Image_s;
    public static Image var_javax_microedition_lcdui_Image_t;
    public static Image var_javax_microedition_lcdui_Image_u;
    public static Image var_javax_microedition_lcdui_Image_v;
    public static Image var_javax_microedition_lcdui_Image_w;
    public static Image x;
    public static Image y;
    public static Image z;
    public static Image A;
    public static Image B;
    public static Image C;
    public static Image D;
    public static Image[] var_javax_microedition_lcdui_Image_arr_v;
    public static Image[] var_javax_microedition_lcdui_Image_arr_w;
    public static TableDefineTextFile var_z_g;
    public static byte[] var_byte_arr_n = new byte[512];

    private ce() {
    }

    public static final void void_a(byte by2) {
        try {
            PNGMerger br2 = new PNGMerger("/img/atteff1");
            br2.enableLoad = true;
            ce.a(br2, by2);
            var_javax_microedition_lcdui_Image_arr_s = new Image[3];
            ce.var_javax_microedition_lcdui_Image_arr_s[0] = br2.getImageById(0);
            ce.var_javax_microedition_lcdui_Image_arr_s[1] = br2.getImageById(1);
            ce.var_javax_microedition_lcdui_Image_arr_s[2] = br2.getImageById(2);
            MyGameCanvas.k();
            br2.fromImgPath("/img/atteff2");
            ce.a(br2, by2);
            var_javax_microedition_lcdui_Image_arr_t = new Image[3];
            ce.var_javax_microedition_lcdui_Image_arr_t[0] = br2.getImageById(0);
            ce.var_javax_microedition_lcdui_Image_arr_t[1] = br2.getImageById(1);
            ce.var_javax_microedition_lcdui_Image_arr_t[2] = br2.getImageById(2);
            MyGameCanvas.k();
            br2.fromImgPath("/img/atteff3");
            var_javax_microedition_lcdui_Image_arr_u = new Image[3];
            ce.var_javax_microedition_lcdui_Image_arr_u[0] = br2.getImageById(0);
            ce.var_javax_microedition_lcdui_Image_arr_u[1] = br2.getImageById(1);
            ce.var_javax_microedition_lcdui_Image_arr_u[2] = br2.getImageById(2);
            MyGameCanvas.k();
            return;
        }
        catch (IOException iOException) {
            IOException iOException2 = iOException;
            iOException.printStackTrace();
            return;
        }
    }

    public static final void void_a() {
        var_javax_microedition_lcdui_Image_arr_s = null;
        var_javax_microedition_lcdui_Image_arr_t = null;
        var_javax_microedition_lcdui_Image_arr_u = null;
    }

    private static final void a(PNGMerger br2, byte by2) {
        switch (by2) {
            case 1: {
                br2.convertImgColor(0xBFDFFF, 0xFFFFC0);
                br2.convertImgColor(0x9FBFFF, 0xFFBF7F);
                br2.convertImgColor(6258623, 0xFF7F3F);
                return;
            }
            case 3: {
                br2.convertImgColor(0xBFDFFF, 0xDFFFBF);
                br2.convertImgColor(0x9FBFFF, 0xBFDFBF);
                br2.convertImgColor(6258623, 10469247);
            }
        }
    }

    public static final void cleanArrayMapImg() {//clean image map data ??
        var_javax_microedition_lcdui_Image_arr_e = null;
    }

    public static final void c() {
        arrayImgMap = null;
    }

    public static final void d() {
        var_javax_microedition_lcdui_Image_arr_g = null;
    }

    public static final void e() {
        var_java_lang_Object_arr_e = new Object[60];
        var_java_lang_Object_arr_h = new Object[80];
        var_byte_arr_k = new byte[5];
        for (int i2 = 0; i2 < 10; ++i2) {
            ce.var_javax_microedition_lcdui_Image_arr_arr_a[15 + i2] = null;
        }
    }

    public static final void void_a(byte by2, byte by3) {
        if (by2 == 0 && by3 == 0) {
            ce.var_java_lang_Object_arr_d[by3] = ce.getResourceByName("/grd/spr/0_01.eif");
            ce.a(true, (byte[])var_java_lang_Object_arr_d[by3], 0, (byte)12, (byte)-1, null);
            var_byte_arr_m = ce.getResourceByName("/grd/spr/0_02.eif");
            ce.a(true, var_byte_arr_m, 0, (byte)12, (byte)-1, null);
        } else {
            String string = "/grd/spr/" + by2 + "_" + by3 + ".eif";
            ce.var_java_lang_Object_arr_d[by3] = ce.getResourceByName(string);
            ce.a(true, (byte[])var_java_lang_Object_arr_d[by3], 0, (byte)12, (byte)-1, null);
        }
        String cfr_ignored_0 = "GuardianSprite : " + by2 + ", " + by3;
    }

    public static final void f() {
        var_java_lang_Object_arr_d = new Object[3];
        var_byte_arr_m = null;
    }

    public static final void a(boolean bl2, byte[] arrby, int n2, byte by2, byte by3, PNGMerger br2) {
        int n3 = arrby[n2++];
        if (br2 != null) {
            br2.enableLoad = true;
            if (var_javax_microedition_lcdui_Image_arr_arr_a[by2] == null) {
                ce.var_javax_microedition_lcdui_Image_arr_arr_a[by2] = new Image[br2.getImgCount()];
            }
            if (by3 != -1 && var_javax_microedition_lcdui_Image_arr_arr_a[by3] == null) {
                ce.var_javax_microedition_lcdui_Image_arr_arr_a[by3] = new Image[br2.getImgCount()];
            }
        }
        MyGameCanvas.k();
        for (int i2 = 0; i2 < n3; ++i2) {
            int n4 = bl2 ? arrby[n2++] : 1;
            for (int i3 = 0; i3 < n4; ++i3) {
                Image[] arrimage;
                ++n2;
                int n5 = ++n2;
                ++n2;
                boolean bl3 = arrby[n5] != 0;
                byte by4 = arrby[n2++];
                byte by5 = bl3 ? by3 : by2;
                arrby[n2 - 2] = by5;
                rpg.x.a(by5 > 0);
                if (br2 == null || (arrimage = var_javax_microedition_lcdui_Image_arr_arr_a[by5])[by4] != null) continue;
                arrimage[by4] = bl3 ? br2.getFlipImageById(by4) : br2.getImageById(by4);
                MyGameCanvas.k();
            }
        }
    }

    public static final void g() {
        PNGMerger br2 = null;
        try {
            br2 = new PNGMerger("/img/uifrm");
            br2.enableLoad = true;
            var_javax_microedition_lcdui_Image_arr_q = new Image[7];
            for (int i2 = 0; i2 < 7; ++i2) {
                ce.var_javax_microedition_lcdui_Image_arr_q[i2] = br2.getImageById(i2);
                MyGameCanvas.k();
            }
            var_javax_microedition_lcdui_Image_arr_r = new Image[4];
            ce.var_javax_microedition_lcdui_Image_arr_r[0] = br2.getImageById(7);
            ce.var_javax_microedition_lcdui_Image_arr_r[1] = br2.getFlipImageById(7);
            MyGameCanvas.k();
            ce.var_javax_microedition_lcdui_Image_arr_r[2] = br2.getImageById(8);
            ce.var_javax_microedition_lcdui_Image_arr_r[3] = br2.getFlipImageById(8);
            MyGameCanvas.k();
            br2 = new PNGMerger("/img/etcui");
            br2.enableLoad = true;
            var_javax_microedition_lcdui_Image_s = bh.javax_microedition_lcdui_Image_a("_img_etcui__0.png");
            var_javax_microedition_lcdui_Image_t = bh.javax_microedition_lcdui_Image_a("_img_etcui__1.png");
            br2.getImageById(2);
            MyGameCanvas.k();
            var_javax_microedition_lcdui_Image_u = br2.getImageById(3);
            var_javax_microedition_lcdui_Image_v = bh.javax_microedition_lcdui_Image_a("_img_etcui__4.png");
            var_javax_microedition_lcdui_Image_w = br2.getImageById(5);
            x = br2.getImageById(6);
            MyGameCanvas.k();
            y = br2.getImageById(7);
            z = br2.getImageById(8);
            A = br2.getImageById(9);
            B = br2.getImageById(10);
            C = br2.getImageById(11);
            MyGameCanvas.k();
            br2 = new PNGMerger("/char/lvup");
            var_byte_arr_h = ce.getResourceByName("/char/lvup.eif");
            MyGameCanvas.k();
            ce.a(true, var_byte_arr_h, 0, (byte)13, (byte)-1, br2);
            return;
        }
        catch (Exception exception) {
            System.out.println(exception);
            return;
        }
    }

    public static final void h() {
        var_javax_microedition_lcdui_Image_arr_q = null;
        var_javax_microedition_lcdui_Image_arr_r = null;
        var_javax_microedition_lcdui_Image_s = null;
        var_javax_microedition_lcdui_Image_t = null;
        var_javax_microedition_lcdui_Image_u = null;
        var_javax_microedition_lcdui_Image_v = null;
        var_javax_microedition_lcdui_Image_w = null;
        x = null;
        y = null;
        z = null;
        A = null;
        B = null;
        C = null;
        var_byte_arr_h = null;
        ce.var_javax_microedition_lcdui_Image_arr_arr_a[13] = null;
    }

    public static final void i() {
        PNGMerger br2 = null;
        try {
            br2 = new PNGMerger("/img/keepst");
            br2.enableLoad = true;
            D = br2.getImageById(0);
            MyGameCanvas.k();
            var_javax_microedition_lcdui_Image_arr_v = new Image[8];
            for (int i2 = 0; i2 < 8; ++i2) {
                ce.var_javax_microedition_lcdui_Image_arr_v[i2] = br2.getImageById(i2 + 1);
            }
            MyGameCanvas.k();
            br2 = new PNGMerger("/img/emoti");
            var_javax_microedition_lcdui_Image_arr_w = br2.getAllImage();
            MyGameCanvas.k();
            return;
        }
        catch (Exception exception) {
            System.out.println(exception);
            return;
        }
    }

    public static final void j() {
        D = null;
        var_javax_microedition_lcdui_Image_arr_v = null;
        var_javax_microedition_lcdui_Image_arr_w = null;
    }

    public static final void b(byte by2) {
        var_javax_microedition_lcdui_Image_arr_a = new Image[2];
        PNGMerger br2 = null;
        try {
            switch (by2) {
                case 0: 
                case 3: {
                    br2 = new PNGMerger("/grd/fi");
                    break;
                }
                case 1: 
                case 4: {
                    br2 = new PNGMerger("/grd/wa");
                    break;
                }
                case 2: 
                case 5: {
                    br2 = new PNGMerger("/grd/gr");
                }
            }
            ce.var_javax_microedition_lcdui_Image_arr_arr_a[12] = br2.getAllImage();
            br2 = new PNGMerger("/grd/" + by2);
            br2.enableLoad = true;
            ce.var_javax_microedition_lcdui_Image_arr_a[0] = br2.getImageById(0);
            ce.var_javax_microedition_lcdui_Image_arr_a[1] = br2.getImageById(1);
            return;
        }
        catch (IOException iOException) {
            IOException iOException2 = iOException;
            iOException.printStackTrace();
            return;
        }
    }

    public static final void k() {
        var_javax_microedition_lcdui_Image_arr_a = null;
        ce.var_javax_microedition_lcdui_Image_arr_arr_a[12] = null;
    }

    public static final void a(short s2, byte by2, boolean bl2) {
        try {
            byte by3;
            PNGMerger br2 = new PNGMerger("/enm/" + (s2 < 10 ? "0" : "") + s2);
            br2.enableLoad = true;
            MyGameCanvas.k();
            byte[] arrby = ce.getResourceByName("/enm/spr/" + (s2 < 10 ? "0" : "") + s2);
            MyGameCanvas.k();
            for (int i2 = 0; i2 < arrby.length; i2 += by3) {
                byte by4 = arrby[i2++];
                byte by5 = arrby[i2++];
                by3 = arrby[i2++];
                if (bl2) {
                    if (by4 == 0) {
                        ce.var_byte_arr_i[by2] = arrby[i2];
                    } else if (by4 == 1) {
                        ce.var_byte_arr_j[by2] = arrby[i2];
                    }
                    ce.var_java_lang_Object_arr_j[by2 * 12 + by4 * 4 + by5] = new byte[by3];
                    ce.a(true, arrby, i2, (byte)(27 + by2), (byte)(27 + by2 + 5), br2);
                    System.arraycopy(arrby, i2, var_java_lang_Object_arr_j[by2 * 12 + by4 * 4 + by5], 0, by3);
                } else {
                    ce.var_java_lang_Object_arr_e[by2 * 12 + by4 * 4 + by5] = new byte[by3];
                    ce.a(true, arrby, i2, (byte)(15 + by2), (byte)(15 + by2 + 5), br2);
                    System.arraycopy(arrby, i2, var_java_lang_Object_arr_e[by2 * 12 + by4 * 4 + by5], 0, by3);
                }
                MyGameCanvas.k();
            }
            if (!bl2 && j.var_j_arr_a[by2].var_byte_d >= 2) {
                arrby = ce.getResourceByName("/enm/atef/" + (s2 < 10 ? "0" : "") + s2);
                ce.a(true, arrby, 0, (byte)(15 + by2), (byte)(15 + by2 + 5), br2);
                ce.var_java_lang_Object_arr_f[by2] = arrby;
            }
            MyGameCanvas.k();
            return;
        }
        catch (IOException iOException) {
            IOException iOException2 = iOException;
            iOException.printStackTrace();
            return;
        }
    }

    public static final void c(byte by2) {
        ce.var_javax_microedition_lcdui_Image_arr_arr_a[15 + by2] = null;
        ce.var_javax_microedition_lcdui_Image_arr_arr_a[15 + by2 + 5] = null;
        for (int i2 = 0; i2 < 12; ++i2) {
            ce.var_java_lang_Object_arr_e[by2 * 12 + i2] = null;
        }
    }

    public static final void l() {
        try {
            PNGMerger br2 = new PNGMerger("/enm/die/bang");
            br2.enableLoad = true;
            for (int i2 = 0; i2 < 3; ++i2) {
                byte[] arrby = ce.getResourceByName("/enm/die/" + i2);
                ce.a(true, arrby, 0, (byte)37, (byte)-1, br2);
                ce.var_java_lang_Object_arr_g[i2] = arrby;
            }
            return;
        }
        catch (IOException iOException) {
            return;
        }
    }

    public static final void b(byte by2, byte by3) {
        try {
            byte by4;
            PNGMerger br2 = new PNGMerger("/npc/" + (by2 < 10 ? "0" : "") + by2);
            br2.enableLoad = true;
            MyGameCanvas.k();
            byte[] arrby = ce.getResourceByName("/npc/spr/" + (by2 < 10 ? "0" : "") + by2);
            MyGameCanvas.k();
            for (int i2 = 0; i2 < arrby.length; i2 += by4) {
                byte by5 = arrby[i2++];
                byte by6 = arrby[i2++];
                by4 = arrby[i2++];
                ce.var_java_lang_Object_arr_j[by3 * 12 + by5 * 4 + by6] = new byte[by4];
                if (by5 == 0) {
                    ce.var_byte_arr_i[by3] = arrby[i2];
                } else if (by5 == 1) {
                    ce.var_byte_arr_j[by3] = arrby[i2];
                }
                ce.a(true, arrby, i2, (byte)(27 + by3), (byte)(27 + by3 + 5), br2);
                System.arraycopy(arrby, i2, var_java_lang_Object_arr_j[by3 * 12 + by5 * 4 + by6], 0, by4);
                MyGameCanvas.k();
            }
            return;
        }
        catch (IOException iOException) {
            IOException iOException2 = iOException;
            iOException.printStackTrace();
            return;
        }
    }

    public static final void d(byte by2) {
        ce.var_javax_microedition_lcdui_Image_arr_arr_a[27 + by2] = null;
        ce.var_javax_microedition_lcdui_Image_arr_arr_a[27 + by2 + 5] = null;
        for (int i2 = 0; i2 < 12; ++i2) {
            ce.var_java_lang_Object_arr_j[by2 * 12 + i2] = null;
        }
    }

    public static final void e(byte by2) {
        try {
            int n2;
            byte by3 = 0;
            PNGMerger br2 = new PNGMerger("/boss/" + by2);
            br2.enableLoad = true;
            switch (by2) {
                case 1: {
                    by3 = 32;
                    n2 = 32;
                    break;
                }
                case 2: {
                    by3 = 35;
                    n2 = 38;
                    break;
                }
                case 3: {
                    by3 = 39;
                    n2 = 41;
                    break;
                }
                case 4: {
                    by3 = 42;
                    n2 = 42;
                    break;
                }
                default: {
                    rpg.x.a(false);
                    by3 = -1;
                    n2 = -1;
                }
            }
            for (byte by4 = by3; by4 <= n2; by4 = (byte)(by4 + 1)) {
                byte[] arrby = ce.getResourceByName("/boss/spr/" + by2 + "_" + by4);
                int n3 = 0;
                while (n3 < arrby.length) {
                    byte by5 = ce.byte_a(by4);
                    byte by6 = arrby[n3++];
                    byte by7 = arrby[n3++];
                    byte by8 = arrby[n3++];
                    byte[] arrby2 = new byte[by8 & 0xFF];
                    ce.a(true, arrby, n3, (byte)25, (byte)26, br2);
                    System.arraycopy(arrby, n3, arrby2, 0, arrby2.length);
                    n3 += arrby2.length;
                    if (by6 <= 3) {
                        ce.var_java_lang_Object_arr_h[by5 * 16 + by6 * 4 + by7] = arrby2;
                    }
                    if (by2 != 1 || by6 < 3) continue;
                    ce.var_java_lang_Object_arr_i[(by6 - 3) * 4 + by7] = arrby2;
                }
                arrby = ce.getResourceByName("/boss/atef/" + (by4 < 10 ? "0" : "") + by4);
                if (arrby == null) continue;
                ce.a(true, arrby, 0, (byte)25, (byte)26, br2);
                ce.var_java_lang_Object_arr_f[ce.byte_a((byte)by4)] = arrby;
            }
            return;
        }
        catch (IOException iOException) {
            IOException iOException2 = iOException;
            iOException.printStackTrace();
            return;
        }
    }

    public static final void m() {
        ce.var_javax_microedition_lcdui_Image_arr_arr_a[25] = null;
        ce.var_javax_microedition_lcdui_Image_arr_arr_a[26] = null;
        var_java_lang_Object_arr_i = new Object[12];
    }

    public static final void n() {
        PNGMerger br2 = null;
        var_javax_microedition_lcdui_Image_arr_n = new Image[6];
        var_javax_microedition_lcdui_Image_arr_o = new Image[5];
        try {
            int n2;
            br2 = new PNGMerger("/sgui/gmico");
            br2.enableLoad = true;
            for (n2 = 0; n2 < 6; n2 = (int)((byte)(n2 + 1))) {
                ce.var_javax_microedition_lcdui_Image_arr_n[n2] = br2.getImageById(n2 == 5 ? 6 : n2);
            }
            for (n2 = 0; n2 < 5; n2 = (int)((byte)(n2 + 1))) {
                ce.var_javax_microedition_lcdui_Image_arr_o[n2] = br2.getImageById(n2 + 7);
            }
            return;
        }
        catch (Exception exception) {
            System.out.println(exception);
            return;
        }
    }

    public static final void loadGlobalImage() {
        PNGMerger br2 = null;
        try {
            br2 = new PNGMerger("/img/glb");
            br2.enableLoad = true;
            var_javax_microedition_lcdui_Image_k = br2.getImageById(0);
            var_javax_microedition_lcdui_Image_n = br2.getImageById(1);
            var_javax_microedition_lcdui_Image_o = br2.getImageById(2);
            var_javax_microedition_lcdui_Image_d = br2.getImageById(3);
            var_javax_microedition_lcdui_Image_r = br2.getImageById(5);
            var_javax_microedition_lcdui_Image_l = br2.getImageById(6);
            var_javax_microedition_lcdui_Image_m = br2.getImageById(7);
            var_javax_microedition_lcdui_Image_a = br2.getImageById(8);
            var_javax_microedition_lcdui_Image_e = bh.javax_microedition_lcdui_Image_a("_img_glb__9.png");
            var_javax_microedition_lcdui_Image_f = bh.javax_microedition_lcdui_Image_a("_img_glb__10.png");
            var_javax_microedition_lcdui_Image_g = bh.javax_microedition_lcdui_Image_a("_img_glb__11.png");
            var_javax_microedition_lcdui_Image_h = bh.javax_microedition_lcdui_Image_a("_img_glb__12.png");
            bh.javax_microedition_lcdui_Image_a("_img_glb__13.png");
            var_javax_microedition_lcdui_Image_i = br2.getImageById(14);
            var_javax_microedition_lcdui_Image_j = bh.javax_microedition_lcdui_Image_a("_img_glb__15.png");
            br2.getImageById(16);
            var_z_e = new TableDefineTextFile("/sgui/help");
            return;
        }
        catch (Exception exception) {
            System.out.println(exception);
            return;
        }
    }

    public static final void p() {
        try {
            PNGMerger br2 = new PNGMerger("/img/icoitm");
            var_javax_microedition_lcdui_Image_arr_d = br2.getAllImage();
            return;
        }
        catch (Exception exception) {
            Exception exception2 = exception;
            exception.printStackTrace();
            return;
        }
    }

    public static final void q() {
        var_javax_microedition_lcdui_Image_arr_d = null;
    }

    public static final void r() {
        MyGameCanvas.k();
        var_javax_microedition_lcdui_Image_arr_p = new Image[6];
        PNGMerger br2 = null;
        try {
            br2 = new PNGMerger("/sgui/shop");
            br2.enableLoad = true;
            MyGameCanvas.k();
            for (int n2 = 0; n2 < 6; n2 = (int)((byte)(n2 + 1))) {
                ce.var_javax_microedition_lcdui_Image_arr_p[n2] = br2.getImageById(n2);
            }
            var_javax_microedition_lcdui_Image_q = br2.getImageById(6);
            var_javax_microedition_lcdui_Image_p = br2.getImageById(7);
            MyGameCanvas.k();
            var_javax_microedition_lcdui_Image_b = bh.javax_microedition_lcdui_Image_a("_sgui_shop__8.png");
            var_javax_microedition_lcdui_Image_c = bh.javax_microedition_lcdui_Image_a("_sgui_shop__9.png");
            return;
        }
        catch (Exception exception) {
            System.out.println(exception);
            return;
        }
    }

    public static final void s() {
        var_javax_microedition_lcdui_Image_arr_p = null;
        var_javax_microedition_lcdui_Image_q = null;
        var_javax_microedition_lcdui_Image_p = null;
        var_javax_microedition_lcdui_Image_b = null;
        var_javax_microedition_lcdui_Image_c = null;
    }

    public static final void t() {
        var_javax_microedition_lcdui_Image_arr_b = new Image[6];
        var_javax_microedition_lcdui_Image_arr_c = new Image[24];
        PNGMerger br2 = null;
        try {
            br2 = new PNGMerger("/grd/grdico");
            br2.enableLoad = true;
            for (int n2 = 0; n2 < 6; n2 = (int)((byte)(n2 + 1))) {
                ce.var_javax_microedition_lcdui_Image_arr_b[n2] = br2.getImageById(n2);
                for (int n3 = 0; n3 < 4; n3 = (int)((byte)(n3 + 1))) {
                    ce.var_javax_microedition_lcdui_Image_arr_c[n2 * 4 + n3] = br2.getImageById(6 + n2 * 4 + n3);
                }
                MyGameCanvas.k();
            }
            return;
        }
        catch (Exception exception) {
            System.out.println(exception);
            return;
        }
    }

    public static final void u() {
        var_javax_microedition_lcdui_Image_arr_b = null;
        var_javax_microedition_lcdui_Image_arr_c = null;
    }

    public static final byte[] byte_arr_a(byte by2, byte n2) {
        InputStream inputStream = null;
        byte[] arrby = null;
        String string = String.valueOf(by2);
        if (by2 < 10) {
            string = "0" + string;
        }
        try {
            inputStream = new Object().getClass().getResourceAsStream("/itm/" + string);
            int n3 = 0;
            for (int i2 = 0; i2 < n2; ++i2) {
                n3 = inputStream.read();
                inputStream.skip(n3);
            }
            n3 = inputStream.read();
            arrby = new byte[n3];
            inputStream.read(arrby);
            inputStream.close();
        }
        catch (IOException iOException) {
            IOException iOException2 = iOException;
            iOException.printStackTrace();
        }
        return arrby;
    }

    public static final byte[] byte_arr_a() {
        return ce.getResourceByName("/itm/forshop");
    }

    public static final void f(byte by2) {
        MyGameCanvas.k();
        ce.b(by2);
        switch (by2) {
            case 0: {
                ce.void_a(by2, (byte)0);
                ce.void_a(by2, (byte)1);
                return;
            }
            case 1: {
                ce.void_a(by2, (byte)0);
                ce.void_a(by2, (byte)1);
                return;
            }
            case 2: 
            case 3: 
            case 4: 
            case 5: {
                ce.void_a(by2, (byte)0);
                ce.void_a(by2, (byte)1);
                ce.void_a(by2, (byte)2);
            }
        }
    }

    public static final void v() {
        ce.k();
        ce.f();
    }

    public static final void w() {
        try {
            PNGMerger br2 = new PNGMerger("/img/logo");
            var_javax_microedition_lcdui_Image_arr_i = br2.getAllImage();
            return;
        }
        catch (IOException iOException) {
            return;
        }
    }

    public static final void x() {
        var_javax_microedition_lcdui_Image_arr_i = null;
    }

    public static final void y() {
        try {
            PNGMerger br2 = new PNGMerger("/img/title1");
            var_javax_microedition_lcdui_Image_arr_j = br2.getAllImage();
            
            MyGameCanvas.k();
            br2 = new PNGMerger("/img/title2");
            br2.enableLoad = true;
            var_javax_microedition_lcdui_Image_arr_k = new Image[10];
            for (int i2 = 0; i2 < 5; ++i2) {
                ce.var_javax_microedition_lcdui_Image_arr_k[i2] = br2.getImageById(i2);
                ce.var_javax_microedition_lcdui_Image_arr_k[i2 + 5] = br2.getFlipImageById(i2);
                MyGameCanvas.k();
            }
            MyGameCanvas.k();
            SoundPlayerManager.setupSoundPlayer((byte)22);
            return;
        }
        catch (IOException iOException) {
            IOException iOException2 = iOException;
            iOException.printStackTrace();
            return;
        }
    }

    public static final void z() {
        var_javax_microedition_lcdui_Image_arr_j = null;
        var_javax_microedition_lcdui_Image_arr_k = null;
        SoundPlayerManager.b((byte)22);
    }

    public static final void A() {
        try {
            PNGMerger br2 = new PNGMerger("/sgui/mm/face");
            br2.enableLoad = true;
            var_javax_microedition_lcdui_Image_arr_m = new Image[6];
            ce.var_javax_microedition_lcdui_Image_arr_m[0] = br2.getImageById(0);
            ce.var_javax_microedition_lcdui_Image_arr_m[1] = br2.getImageById(1);
            ce.var_javax_microedition_lcdui_Image_arr_m[2] = br2.getImageById(2);
            MyGameCanvas.k();
            ce.var_javax_microedition_lcdui_Image_arr_m[3] = br2.getImageGrayscale(0);
            ce.var_javax_microedition_lcdui_Image_arr_m[4] = br2.getImageGrayscale(1);
            ce.var_javax_microedition_lcdui_Image_arr_m[5] = br2.getImageGrayscale(2);
            MyGameCanvas.k();
            br2 = new PNGMerger("/sgui/mm/etc");
            var_javax_microedition_lcdui_Image_arr_l = br2.getAllImage();
            var_javax_microedition_lcdui_Image_arr_arr_b = new Image[3][2];
            for (int i2 = 0; i2 < 3; ++i2) {
                br2 = new PNGMerger("/grd/" + i2);
                br2.enableLoad = true;
                ce.var_javax_microedition_lcdui_Image_arr_arr_b[i2][0] = br2.getImageById(0);
                ce.var_javax_microedition_lcdui_Image_arr_arr_b[i2][1] = br2.getImageById(1);
                MyGameCanvas.k();
            }
            return;
        }
        catch (IOException iOException) {
            IOException iOException2 = iOException;
            iOException.printStackTrace();
            return;
        }
    }

    public static final void B() {
        var_javax_microedition_lcdui_Image_arr_l = null;
        var_javax_microedition_lcdui_Image_arr_m = null;
        var_javax_microedition_lcdui_Image_arr_arr_b = null;
    }

    public static final byte[] getResourceByName(String string) {
        Object object;
        System.gc();
        String string2 = string;
        InputStream inputStream = null;
        byte[] arrby = null;
        try {
            int n2;
            inputStream = new Object().getClass().getResourceAsStream(string);
            if (inputStream == null) {
                return null;
            }
            object = new ByteArrayOutputStream();
            while ((n2 = inputStream.read(var_byte_arr_n)) != -1) {
                ((ByteArrayOutputStream)object).write(var_byte_arr_n, 0, n2);
            }
            arrby = ((ByteArrayOutputStream)object).toByteArray();
            ((ByteArrayOutputStream)object).close();
        }
        catch (Exception exception) {
            String cfr_ignored_0 = "miss - " + string2;
            exception.printStackTrace();
        }
        while (n.var_int_e == 15) {
            try {
                Thread.sleep(100L);
            }
            catch (InterruptedException interruptedException) {
                object = interruptedException;
                interruptedException.printStackTrace();
            }
        }
        return arrby;
    }

    public static final byte byte_a(byte by2) {
        for (byte by3 = 0; by3 < var_byte_arr_k.length; by3 = (byte)(by3 + 1)) {
            if (var_byte_arr_k[by3] != by2) continue;
            return by3;
        }
        return -1;
    }

//    public static {
//        var_java_lang_Object_arr_d = new Object[3];
//        var_java_lang_Object_arr_e = new Object[60];
//        var_java_lang_Object_arr_f = new Object[5];
//        var_java_lang_Object_arr_g = new Object[3];
//        var_java_lang_Object_arr_h = new Object[80];
//        var_java_lang_Object_arr_i = new Object[12];
//        var_java_lang_Object_arr_j = new Object[60];
//        var_byte_arr_i = new byte[5];
//        var_byte_arr_j = new byte[5];
//        var_byte_arr_k = new byte[5];
//        var_byte_arr_l = new byte[5];
//        var_javax_microedition_lcdui_Image_arr_arr_a = new Image[38][];
//        var_byte_arr_n = new byte[512];
//    }
}

