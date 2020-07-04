package rpg;

/*
 * Decompiled with CFR 0.150.
 */
//import <any?>;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
//import java.io.FilterInputStream;
//import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public final class n
implements u {
    private static byte[] var_byte_arr_h = new byte[]{60, 30, 10};
    private static byte[] var_byte_arr_i = new byte[]{5, 11, 8, 81, 3, 20};
    private static final byte[] j = new byte[]{0, 22, 4, 60, 5, 36, 77, 10, 18};
    public static final String[] var_java_lang_String_arr_a = new String[]{"/k", "/s", "/w"};
    public static ae var_ae_a;
    public static int var_int_a;
    public static int var_int_b;
    public static int var_int_c;
    public static int var_int_d;
    private static ao var_ao_a;
    public static byte var_byte_a;
    public static int var_int_e = 0;
    public static byte var_byte_b = 0;
    public static byte var_byte_c;
    public static byte var_byte_d;
    public static byte var_byte_e;
    public static byte f;
    private static byte var_byte_h = 0;
    private static byte var_byte_i = 0;
    private static byte[] k = new byte[128];
    private static byte[] l = new byte[128];
    public static byte g;
    public static final boolean[][] var_boolean_arr_arr_a = new boolean[][]{{true, true, true, true, true, true, false, false, false, false, false, false, false, false, false}, {true, false, true, false, false, false, false, true, true, true, true, false, false, true, true}, {true, true, true, true, false, false, false, false, false, false, false, false, false, false, false}};

    private n() {
    }

    public static final void void_a() throws Throwable {
        g = 0;
        var_ao_a.c(var_byte_a);
        try {
            byte[] arrby = new byte[2];
            au au2 = new au("/o", 1);
            au2.b(arrby, 0, arrby.length);
            byte[] arrby2 = new byte[(arrby[0] & 0xFF) << 8 | arrby[1] & 0xFF];
            au2.b(arrby2, 0, arrby2.length);
            arrby2 = bq.b(arrby2, var_byte_arr_i);
            n.var_ao_a.var_g_b.a(arrby2);
            au2.void_a();
        }
        catch (Exception exception) {}
        n.l();
        n.m();
        n.void_b(0);
        f = j[(var_byte_a - 6) * 3];
        var_byte_c = j[(var_byte_a - 6) * 3 + 1];
        var_byte_d = j[(var_byte_a - 6) * 3 + 2];
    }

    public static final void void_b() throws Throwable {
        n.l();
        n.m();
        n.void_b(0);
        try {
            n.r();
            return;
        }
        catch (Exception exception) {
            Exception exception2 = exception;
            exception.printStackTrace();
            n.void_a();
            return;
        }
    }

    public static final void c() {
        n.var_ao_a.var_byte_f = (byte)(n.var_ao_a.var_byte_f + n.byte_a(var_byte_a));
        if (n.var_ao_a.var_byte_f > 100) {
            n.var_ao_a.var_byte_f = (byte)100;
        }
        g = 1;
        bs.var_bs_a.var_boolean_b = true;
        try {
            bs.var_bs_a.i();
        }
        catch (Exception exception) {}
        n.l();
        n.m();
        n.void_b(0);
        n.var_ao_a.var_g_a.void_c();
        n.var_ao_a.var_int_a = n.var_ao_a.var_int_d;
        n.var_ao_a.var_int_b = n.var_ao_a.var_int_e;
        f = j[(var_byte_a - 6) * 3];
        var_byte_c = j[(var_byte_a - 6) * 3 + 1];
        var_byte_d = j[(var_byte_a - 6) * 3 + 2];
    }

    public static final synchronized void a(byte by2, byte by3, byte by4, byte by5) {
        var_byte_c = by3;
        var_byte_d = by4;
        var_byte_e = by5;
        var_byte_b = by2;
    }

    public static final synchronized void a(byte by2, byte by3, byte by4) {
        var_byte_c = by3;
        var_byte_d = by4;
        var_byte_e = 0;
        var_byte_b = by2;
    }

    public static final synchronized void a(byte by2, byte by3) {
        var_byte_c = by3;
        var_byte_d = 0;
        var_byte_e = 0;
        var_byte_b = by2;
    }

    public static final synchronized void void_a(byte by2) {
        var_byte_c = 0;
        var_byte_d = 0;
        var_byte_e = 0;
        var_byte_b = by2;
    }

    public static final void d() {
        var_byte_b = 0;
        var_byte_c = 0;
        var_byte_d = 0;
        var_byte_e = 0;
    }

    public static final void e() throws Throwable {
        if (var_byte_b == 0) {
            return;
        }
        byte by2 = var_byte_b;
        var_byte_b = 0;
        switch (by2) {
            case 1: {
                n.void_a(1);
                bs.var_bs_a.g();
                bu.b();
                return;
            }
            case 11: {
                switch (var_byte_c) {
                    case 0: {
                        n.void_a(6);
                        bp.bp_a().void_d();
                        break;
                    }
                    case 1: {
                        n.void_a(7);
                        ax.ax_a().void_d();
                        break;
                    }
                    case 2: {
                        n.void_a(8);
                        aa.aa_a().void_d();
                    }
                }
                return;
            }
            case 12: {
                n.void_a(2);
                switch (var_byte_c) {
                    case 0: {
                        break;
                    }
                    case 1: {
                        ax.ax_a().e();
                        break;
                    }
                    case 2: {
                        aa.aa_a().e();
                    }
                }
                return;
            }
            case 13: {
                n.void_a(5);
                ai.ai_a().void_d();
                if ((!x.a || var_byte_c != 1) && (!w.c || n.var_ao_a.var_byte_g < 8)) break;
                ai.ai_a().e();
                return;
            }
            case 14: {
                if (var_byte_c == 1) {
                    ai.ai_a().a(false);
                    n.void_a(1);
                    bu.d();
                    return;
                }
                ai.ai_a().a(true);
                return;
            }
            case 2: {
                n.void_a((int)var_byte_c);
                if (var_byte_d == 0) {
                    bs.var_bs_a.a((int)var_byte_e);
                    return;
                }
                if (var_byte_d == 1) {
                    bs.var_bs_a.f();
                    return;
                }
                if (var_byte_d == 2) {
                    bs.var_bs_a.g();
                    return;
                }
                if (var_byte_d != 3) break;
                bs.var_bs_a.h();
                return;
            }
            case 15: {
                n.f();
                return;
            }
            case 16: {
                n.void_a(10);
                bw.a((byte)12);
                bw.a((byte)12, false);
                as.var_int_e = 16;
                return;
            }
            case 21: {
                if (var_byte_c == 1) {
                    n.void_b();
                } else if (var_byte_c == 0) {
                    n.void_a();
                } else if (var_byte_c == 2) {
                    n.c();
                    ai.ai_a().a(false);
                    n.void_a(1);
                    bu.d();
                    bw.f();
                    return;
                }
                n.void_a(1);
                bs.var_bs_a.g();
                bu.void_a();
            }
        }
    }

    public static final void b(byte by2, byte by3, byte by4, byte by5) {
        System.gc();
        n.a((byte)1, by3, by4, by5);
        bw.e();
        bw.f();
        f = by2;
    }

    public static final void f() {
        var_ae_a.b(var_ao_a);
        var_ao_a.m();
        var_ao_a.void_a();
        var_ao_a.b((byte)(var_byte_c + 1));
        n.g();
        var_int_c = var_int_a;
        var_int_d = var_int_b;
        n.d();
        f = (byte)-1;
        var_ao_a.void_a((byte)1);
        var_ao_a.j();
        bs.var_as_a.b();
        n.a((byte)2, (byte)2, (byte)1);
    }

    public static final void g() {
        var_int_a = as.var_int_c - n.var_ao_a.var_short_c;
        var_int_b = as.var_int_d - n.var_ao_a.var_short_d;
    }

    public static final void void_a(int n2) {
        var_int_e = n2;
    }

    public static final void a(ae ae2) {
        var_ae_a = ae2;
    }

    public static final void a(boolean bl2, boolean bl3) {
        if (bl3) {
            byte by2 = n.byte_b();
            if (bl2) {
                var_int_a -= 15 * u.var_byte_arr_a[by2];
            }
            if (!u.var_boolean_arr_a[by2] && var_int_d != (var_int_b -= 15 * u.array_byte_b[by2])) {
                var_int_d += (var_int_b - var_int_d + 1) / 2 - 1;
            }
            if (u.var_boolean_arr_a[by2] && var_int_c != var_int_a) {
                var_int_c += (var_int_a - var_int_c + 1) / 2 - 1;
            }
            return;
        }
        var_int_c += (var_int_a - var_int_c + 1) / 2 - 1;
        var_int_d += (var_int_b - var_int_d + 1) / 2 - 1;
    }

    public static final void b(byte by2) {
        if (n.byte_a() == 1) {
            var_byte_h = 0;
            var_byte_i = 0;
            n.c((byte)2);
            n.d(by2);
            return;
        }
        if (n.byte_a() == 2) {
            var_byte_h = (byte)2;
            var_byte_i = by2;
        }
    }

    public static final void h() {
        var_byte_h = 1;
        var_byte_i = n.byte_b();
    }

    public static final void a(boolean bl2) {
        if (!var_ao_a.boolean_a(bl2)) {
            return;
        }
        if (n.byte_a() == 2) {
            var_byte_h = (byte)3;
            var_byte_i = n.byte_b();
            return;
        }
        if (n.byte_a() == 1) {
            var_ao_a.void_a((byte)3);
            var_ao_a.i();
        }
    }

    public static final void i() {
        n.q();
        n.n();
        var_ae_a.b();
    }

    public static final void j() {
        try {
            ah.void_a();
        } catch (Throwable ex) {
            ex.printStackTrace();
        }
    }

    private static final void q() {
        if (!n.boolean_b()) {
            return;
        }
        if (var_byte_h == 0) {
            return;
        }
        n.c(var_byte_h);
        n.d(var_byte_i);
        var_byte_h = 0;
        var_byte_i = 0;
    }

    public static final void k() {
        var_byte_h = 0;
    }

    public static final boolean boolean_a() {
        byte[] arrby = var_ae_a.byte_arr_a(n.var_ao_a.var_byte_a, n.var_ao_a.var_byte_b);
        if (arrby != null) {
            if (arrby[2] == -1) {
                int n2 = arrby[3] * 100 + arrby[4];
                if (n2 > 0) {
                    n2 *= 9;
                }
                var_ao_a.g(n2);
                bs.var_as_a.a((bh.var_java_lang_String_a + n2 + bh.var_java_lang_String_d).toCharArray(), 16);
            } else if (arrby[2] == 22) {
                n.var_ao_a.var_g_b.a(ad.a(arrby[2], arrby[3], true, true), (int)arrby[4]);
                char[] arrc = h.a(bh.var_java_lang_String_a.toCharArray(), ad.var_z_b.a(arrby[2]));
                bs.var_as_a.a(arrc, 16);
            } else {
                ad ad2 = ad.a(arrby[2], arrby[3], true, true);
                if (ad2 instanceof e && !((e)ad2).var_boolean_a) {
                    ((e)ad2).b = true;
                }
                n.var_ao_a.var_g_a.a(ad2, (int)arrby[4]);
                char[] arrc = h.a(bh.var_java_lang_String_a.toCharArray(), ad.var_z_b.a(arrby[2]));
                bs.var_as_a.a(arrc, 16);
            }
            return true;
        }
        if (var_ae_a.boolean_a(n.var_ao_a.var_byte_a, n.var_ao_a.var_byte_b)) {
            bs.var_as_a.a(bh.t, 16);
        }
        return false;
    }

    public static final void l() {
        for (int i2 = 0; i2 < 128; ++i2) {
            n.k[i2] = 0;
        }
    }

    public static final boolean boolean_a(int n2) {
        byte by2 = k[n2 / 8];
        return (by2 >> n2 % 8 & 1) == 1;
    }

    public static final void void_b(int n2) {
        byte by2 = k[n2 / 8];
        n.k[n2 / 8] = (byte)(by2 | 1 << n2 % 8);
    }

    public static final void c(int n2) {
        byte by2 = k[n2 / 8];
        n.k[n2 / 8] = (byte)(by2 & ~(1 << n2 % 8));
    }

    public static final void d(int n2) {
        if (n.boolean_a(n2)) {
            n.c(n2);
            return;
        }
        n.void_b(n2);
    }

    public static final void m() {
        for (int i2 = 0; i2 < 128; ++i2) {
            n.l[i2] = 0;
        }
    }

    public static final boolean boolean_b(int n2) {
        byte by2 = l[n2 / 8];
        return (by2 >> n2 % 8 & 1) == 1;
    }

    public static final void e(int n2) {
        byte by2 = l[n2 / 8];
        n.l[n2 / 8] = (byte)(by2 | 1 << n2 % 8);
        if (n2 == 29 && var_byte_a == 6) {
            ao ao2 = n.ao_a();
            ao2.d((byte)2);
        }
    }

    public static final void f(int n2) {
        byte by2 = l[n2 / 8];
        n.l[n2 / 8] = (byte)(by2 & ~(1 << n2 % 8));
    }

    public static final void g(int n2) {
        if (n.boolean_b(n2)) {
            n.f(n2);
            return;
        }
        n.e(n2);
    }

    public static final ao ao_a() {
        return var_ao_a;
    }

    public static final byte byte_a() {
        return ((o)n.var_ao_a).byte_h;
    }

    public static final byte byte_b() {
        return ((o)n.var_ao_a).i;
    }

    public static final void c(byte by2) {
        var_ao_a.void_a(by2);
    }

    public static final void d(byte by2) {
        var_ao_a.b(by2);
    }

    public static final void n() {
        var_ao_a.void_d();
        var_ae_a.c(var_ao_a);
        p p2 = var_ao_a.p_a();
        if (p2 != null) {
            p2.e();
            var_ae_a.c(p2);
        }
    }

    public static final void a(int n2, int n3) {
        var_ao_a.a((short)(n2 * 16), (short)(n3 * 16));
        var_ao_a.g();
    }

    public static final boolean boolean_b() {
        return !n.var_ao_a.var_boolean_a && !n.var_ao_a.var_boolean_b;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    private static final byte[] byte_arr_a() throws IOException, Throwable {
        ByteArrayOutputStream byteArrayOutputStream = null;
        DataOutputStream filterOutputStream = null;
        byteArrayOutputStream = new ByteArrayOutputStream();
        filterOutputStream = new DataOutputStream(byteArrayOutputStream);
        ((OutputStream)filterOutputStream).write(k);
        ((OutputStream)filterOutputStream).write(l);
        ((DataOutputStream)filterOutputStream).writeByte(g);
        byte[] arrby = byteArrayOutputStream.toByteArray();
        try {
            filterOutputStream.close();
            byteArrayOutputStream.close();
            return arrby;
        }
//        catch (IOException iOException) {}
//        return arrby;
        catch (IOException iOException) {
            try {
                IOException iOException2 = iOException;
                iOException.printStackTrace();
            }
            catch (Throwable throwable) {
                try {
                    if (filterOutputStream != null) {
                        filterOutputStream.close();
                    }
                    if (byteArrayOutputStream == null) throw throwable;
                    byteArrayOutputStream.close();
                    throw throwable;
                }
                catch (IOException iOException2) {}
                throw throwable;
            }
            try {
                if (filterOutputStream != null) {
                    filterOutputStream.close();
                }
                if (byteArrayOutputStream == null) return null;
                byteArrayOutputStream.close();
                return null;
            }
            catch (IOException iOException3) {
                return null;
            }
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    private static final void a(byte[] arrby) throws IOException, Throwable {
        ByteArrayInputStream byteArrayInputStream = null;
        DataInputStream filterInputStream = null;
        byteArrayInputStream = new ByteArrayInputStream(arrby);
        filterInputStream = new DataInputStream(byteArrayInputStream);
        ((DataInputStream)filterInputStream).read(k);
        ((DataInputStream)filterInputStream).read(l);
        g = ((DataInputStream)filterInputStream).readByte();
        try {
            filterInputStream.close();
            byteArrayInputStream.close();
            return;
        }
//        catch (IOException iOException) {
//            return;
//        }
        catch (IOException iOException) {
            try {
                IOException iOException2 = iOException;
                iOException.printStackTrace();
            }
            catch (Throwable throwable) {
                try {
                    if (filterInputStream != null) {
                        filterInputStream.close();
                    }
                    if (byteArrayInputStream == null) throw throwable;
                    byteArrayInputStream.close();
                    throw throwable;
                }
                catch (IOException iOException2) {}
                throw throwable;
            }
            try {
                if (filterInputStream != null) {
                    filterInputStream.close();
                }
                if (byteArrayInputStream == null) return;
                byteArrayInputStream.close();
                return;
            }
            catch (IOException iOException3) {
                return;
            }
        }
    }

    public static final void o() throws Exception, Throwable {
        ao ao2 = var_ao_a;
        byte[] arrby = ao2.byte_arr_a();
        byte[] arrby2 = ao2.var_g_a.byte_arr_c();
        byte[] arrby3 = n.byte_arr_a();
        byte[] arrby4 = new byte[]{n.var_ae_a.var_byte_a, ao2.var_byte_a, ao2.var_byte_b};
        int n2 = 0;
        arrby = bq.a(arrby, var_byte_arr_i);
        arrby2 = bq.a(arrby2, var_byte_arr_i);
        arrby3 = bq.a(arrby3, var_byte_arr_i);
        arrby4 = bq.a(arrby4, var_byte_arr_i);
        byte[] arrby5 = new byte[arrby.length + arrby2.length + arrby3.length + arrby4.length + 8];
        byte[] arrby6 = arrby5;
        arrby5[0] = (byte)((arrby.length & 0xFF00) >> 8);
        arrby6[1] = (byte)(arrby.length & 0xFF);
        System.arraycopy(arrby, 0, arrby6, 2, arrby.length);
        n2 = 2 + arrby.length;
        arrby6[n2++] = (byte)((arrby2.length & 0xFF00) >> 8);
        arrby6[n2++] = (byte)(arrby2.length & 0xFF);
        System.arraycopy(arrby2, 0, arrby6, n2, arrby2.length);
        n2 += arrby2.length;
        arrby6[n2++] = (byte)((arrby3.length & 0xFF00) >> 8);
        arrby6[n2++] = (byte)(arrby3.length & 0xFF);
        System.arraycopy(arrby3, 0, arrby6, n2, arrby3.length);
        n2 += arrby3.length;
        arrby6[n2++] = (byte)((arrby4.length & 0xFF00) >> 8);
        arrby6[n2++] = (byte)(arrby4.length & 0xFF);
        System.arraycopy(arrby4, 0, arrby6, n2, arrby4.length);
        Object object = new au(var_java_lang_String_arr_a[var_byte_a - 6], 0);
        ((au)object).a(arrby6, 0, arrby6.length);
        ((au)object).void_a();
        byte[] arrby7 = ao2.var_g_b.byte_arr_c();
        object = arrby7;
        byte[] arr_cv = bq.a(arrby7, var_byte_arr_i);
        au au2 = new au("/o", 0);
        arrby6 = new byte[]{(byte)((arr_cv.length & 0xFF00) >> 8), (byte)(arr_cv.length & 0xFF)};
        au2.a(arrby6, 0, arrby6.length);
        au2.a((byte[])object, 0, (arr_cv.length));
        au2.void_a();
    }

    private static final void r() throws Exception, Throwable {
        byte[] arrby = new byte[2];
        au au2 = new au(var_java_lang_String_arr_a[var_byte_a - 6], 1);
        au2.b(arrby, 0, arrby.length);
        byte[] arrby2 = new byte[(arrby[0] & 0xFF) << 8 | arrby[1] & 0xFF];
        au2.b(arrby2, 0, arrby2.length);
        arrby2 = bq.b(arrby2, var_byte_arr_i);
        var_ao_a.a(arrby2);
        au2.b(arrby, 0, arrby.length);
        arrby2 = new byte[(arrby[0] & 0xFF) << 8 | arrby[1] & 0xFF];
        au2.b(arrby2, 0, arrby2.length);
        arrby2 = bq.b(arrby2, var_byte_arr_i);
        n.var_ao_a.var_g_a.a(arrby2);
        au2.b(arrby, 0, arrby.length);
        arrby2 = new byte[(arrby[0] & 0xFF) << 8 | arrby[1] & 0xFF];
        au2.b(arrby2, 0, arrby2.length);
        arrby2 = bq.b(arrby2, var_byte_arr_i);
        n.a(arrby2);
        au2.b(arrby, 0, arrby.length);
        arrby2 = new byte[(arrby[0] & 0xFF) << 8 | arrby[1] & 0xFF];
        au2.b(arrby2, 0, arrby2.length);
        arrby2 = bq.b(arrby2, var_byte_arr_i);
        f = arrby2[0];
        var_byte_c = arrby2[1];
        var_byte_d = arrby2[2];
        au2.void_a();
        au2 = new au("/o", 1);
        au2.b(arrby, 0, arrby.length);
        arrby2 = new byte[(arrby[0] & 0xFF) << 8 | arrby[1] & 0xFF];
        au2.b(arrby2, 0, arrby2.length);
        arrby2 = bq.b(arrby2, var_byte_arr_i);
        n.var_ao_a.var_g_b.a(arrby2);
        au2.void_a();
    }

    private static final byte[] byte_arr_a(byte by2) {
        System.out.println("getSavedDataFor");
        byte[] arrby = null;
        try {
            if (au.boolean_a(var_java_lang_String_arr_a[by2 - 6])) {
                au au2 = new au(var_java_lang_String_arr_a[by2 - 6], 1);
                arrby = new byte[au2.int_a()];
                System.out.println("::::" + au2.int_a());
                au2.b(arrby, 0, arrby.length);
                au2.void_a();
            }
        }
        catch (Exception exception) {}
        return arrby;
    }

    public static final byte byte_a(byte by2) {
        int n2;
        if (g >= 3) {
            return 0;
        }
        int n3 = 0;
        for (n2 = 0; n2 < 20; ++n2) {
            if (!n.boolean_b(1 + n2 * 3 + 1)) continue;
            n3 = (byte)(n3 + 1);
        }
        for (n2 = 100; n2 <= 105; ++n2) {
            if (!n.boolean_a(n2)) continue;
            n3 = (byte)(n3 + 1);
        }
        switch (by2) {
            case 6: {
                return (byte)(n3 * var_byte_arr_h[g] / 19);
            }
            case 7: {
                return (byte)(n3 * var_byte_arr_h[g] / 21);
            }
            case 8: {
                return (byte)(n3 * var_byte_arr_h[g] / 16);
            }
        }
        return 0;
    }

    public static final void p() throws Throwable {
        int n2 = 0;
        Object[] arrobject = new Object[3];
        for (byte by2 = 6; by2 <= 8; by2 = (byte)(by2 + 1)) {
            arrobject[by2 - 6] = n.byte_arr_a(by2);
            if (arrobject[by2 - 6] == null) continue;
            ++n2;
        }
        byte[] arrby = new byte[n2 * 4];
        int n3 = 0;
        for (byte by3 = 6; by3 <= 8; by3 = (byte)((byte)(by3 + 1))) {
            Object object;
            if (arrobject[by3 - 6] == null) continue;
            byte[] arrby2 = (byte[])arrobject[by3 - 6];
            int n4 = 0;
            try {
                short s2 = h.short_a(arrby2, 0);
                object = new byte[s2];
                System.arraycopy(arrby2, 2, object, 0, s2);
                n4 = 2 + s2;
                byte[] arr_byte = bq.b((byte[])object, var_byte_arr_i);
                s2 = h.short_a(arrby2, n4);
                n4 += 2 + s2;
                s2 = h.short_a(arrby2, n4);
                byte[] arrby3 = new byte[s2];
                System.arraycopy(arrby2, n4 += 2, arrby3, 0, s2);
                arrby3 = bq.b(arrby3, var_byte_arr_i);
                n.a(arrby3);
                arrby[n3++] = by3;
                arrby[n3++] = (byte)arr_byte[1];
                arrby[n3++] = (byte)(arr_byte[0] + n.byte_a(by3));
                arrby[n3++] = g;
                continue;
            }
            catch (Exception exception) {
                object = exception;
                exception.printStackTrace();
            }
        }
        bf.a(n2 > 0, arrby);
        bf.bf_a().var_byte_b = n2 > 0 ? (byte)1 : 0;
        n.a((byte)2, (byte)9, (byte)3);
    }

    public static final void a(boolean bl2, byte by2, boolean[] arrbl) {
        bf.void_d();
        ce.B();
        var_byte_a = by2;
        var_ao_a = new ao((short)0, (short)0, (byte)8, (byte)8, by2);
        if (!bl2) {
            if (arrbl[0]) {
                var_ao_a.p_a((byte)0);
            }
            if (arrbl[1]) {
                var_ao_a.p_a((byte)1);
            }
            if (arrbl[2]) {
                var_ao_a.p_a((byte)2);
            }
        }
        n.void_a(0);
        n.a((byte)21, bl2 ? (byte)1 : 0);
    }

//    public static {
//        var_byte_arr_h = new byte[]{60, 30, 10};
//        var_byte_arr_i = new byte[]{5, 11, 8, 81, 3, 20};
//        j = new byte[]{0, 22, 4, 60, 5, 36, 77, 10, 18};
//        var_java_lang_String_arr_a = new String[]{"/k", "/s", "/w"};
//        var_int_e = 0;
//        var_byte_b = 0;
//        var_byte_h = 0;
//        var_byte_i = 0;
//        k = new byte[128];
//        l = new byte[128];
//        var_boolean_arr_arr_a = new boolean[][]{{true, true, true, true, true, true, false, false, false, false, false, false, false, false, false}, {true, false, true, false, false, false, false, true, true, true, true, false, false, true, true}, {true, true, true, true, false, false, false, false, false, false, false, false, false, false, false}};
//    }
}

