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
import java.util.Vector;

public final class g {
    private static final byte[] var_byte_arr_a = new byte[]{7, 8, 9, 10};
    private ad[] var_ad_arr_a;
    private byte var_byte_a;
    private byte b;
    public int var_int_a;

    public g(byte by2) {
        this.var_ad_arr_a = new ad[by2];
        this.void_a();
    }

    public final void void_a() {
        this.var_byte_a = (byte)-1;
        this.b = (byte)-1;
        this.void_b();
    }

    public final ad a(int n2) {
        return this.var_ad_arr_a[n2];
    }

    public final byte[] byte_arr_a() {
        int n2 = 0;
        for (int n3 = 0; n3 < this.var_ad_arr_a.length; n3 = (int)((byte)(n3 + 1))) {
            if (this.var_ad_arr_a[n3] == null) continue;
            ++n2;
        }
        byte[] arrby = new byte[n2];
        int n4 = 0;
        for (int n5 = 0; n5 < this.var_ad_arr_a.length; n5 = (int)((byte)(n5 + 1))) {
            if (this.var_ad_arr_a[n5] == null) continue;
            arrby[n4++] = (byte)n5;
        }
        return arrby;
    }

    public final byte[] a(boolean bl2, byte by2) {
        int n2 = 0;
        for (int n3 = 0; n3 < this.var_ad_arr_a.length; n3 = (int)((byte)(n3 + 1))) {
            if (this.var_ad_arr_a[n3] == null || !(this.var_ad_arr_a[n3] instanceof e) || bl2 && !(this.var_ad_arr_a[n3] instanceof t) || by2 == 1 && !((e)this.var_ad_arr_a[n3]).b || by2 == -1 && ((e)this.var_ad_arr_a[n3]).b) continue;
            ++n2;
        }
        byte[] arrby = new byte[n2];
        int n4 = 0;
        for (int n5 = 0; n5 < this.var_ad_arr_a.length; n5 = (int)((byte)(n5 + 1))) {
            if (this.var_ad_arr_a[n5] == null || !(this.var_ad_arr_a[n5] instanceof e) || bl2 && !(this.var_ad_arr_a[n5] instanceof t) || by2 == 1 && !((e)this.var_ad_arr_a[n5]).b || by2 == -1 && ((e)this.var_ad_arr_a[n5]).b) continue;
            arrby[n4++] = (byte)n5;
        }
        return arrby;
    }

    public final byte[] a(byte by2) {
        int n2 = 0;
        for (int n3 = 0; n3 < this.var_ad_arr_a.length; n3 = (int)((byte)(n3 + 1))) {
            if (this.var_ad_arr_a[n3] == null || this.var_ad_arr_a[n3].f != by2) continue;
            ++n2;
        }
        byte[] arrby = new byte[n2];
        int n4 = 0;
        for (int n5 = 0; n5 < this.var_ad_arr_a.length; n5 = (int)((byte)(n5 + 1))) {
            if (this.var_ad_arr_a[n5] == null || this.var_ad_arr_a[n5].f != by2) continue;
            arrby[n4++] = (byte)n5;
        }
        return arrby;
    }

    public final byte[] byte_arr_b() {
        int n2 = 0;
        for (int n3 = 0; n3 < this.var_ad_arr_a.length; n3 = (int)((byte)(n3 + 1))) {
            if (this.var_ad_arr_a[n3] == null || !ad.c[this.var_ad_arr_a[n3].f]) continue;
            ++n2;
        }
        byte[] arrby = new byte[n2];
        int n4 = 0;
        for (int n5 = 0; n5 < this.var_ad_arr_a.length; n5 = (int)((byte)(n5 + 1))) {
            if (this.var_ad_arr_a[n5] == null || !ad.c[this.var_ad_arr_a[n5].f]) continue;
            arrby[n4++] = (byte)n5;
        }
        return arrby;
    }

    public final ad ad_a(ad ad2, byte by2) {
        ad ad3 = this.var_ad_arr_a[by2];
        this.var_ad_arr_a[by2] = ad2;
        return ad3;
    }

    public final ad ad_a() {
        if (this.var_byte_a == -1) {
            return null;
        }
        return this.var_ad_arr_a[this.var_byte_a];
    }

    public final byte byte_a() {
        return var_byte_arr_a[this.b];
    }

    public final void void_b() {
        this.b = (byte)(this.b + 1);
        if (this.b == 4) {
            this.b = 0;
        }
        this.var_byte_a = this.byte_a(var_byte_arr_a[this.b], (byte)0);
    }

    private final void f() {
        if (this.var_byte_a != -1) {
            if (this.var_ad_arr_a[this.var_byte_a] == null) {
                this.var_byte_a = (byte)-1;
                return;
            }
            if (this.var_ad_arr_a[this.var_byte_a].f != var_byte_arr_a[this.b]) {
                this.var_byte_a = this.byte_a(var_byte_arr_a[this.b], (byte)0);
            }
        }
    }

    private final void g() {
        if (this.var_byte_a == -1) {
            this.var_byte_a = this.byte_a(var_byte_arr_a[this.b], (byte)0);
        }
    }

    public final boolean a(ad ad2, int n2) {
        if (!this.a(ad2.f, ad2.g, n2)) {
            return false;
        }
        byte by2 = this.byte_b();
        if (!ad.var_boolean_arr_b[ad2.f]) {
            if (by2 != -1) {
                x.a(ad2.h == 1);
                this.var_ad_arr_a[by2] = ad2;
                return true;
            }
        } else {
            ad[] arrad = this.ad_arr_a(ad2.f, ad2.g);
            for (int i2 = 0; i2 < arrad.length; ++i2) {
                if (arrad[i2].h + n2 > 99) continue;
                arrad[i2].a((byte)n2);
                this.e();
                this.g();
                return true;
            }
            if (by2 != -1) {
                ad2.h = (byte)n2;
                this.var_ad_arr_a[by2] = ad2;
                this.e();
                this.g();
                return true;
            }
        }
        return false;
    }

    public final void void_a(byte by2, byte by3, byte by4) {
        for (int i2 = this.var_ad_arr_a.length; i2 > 0 && by4 > 0; --i2) {
            ad ad2 = this.ad_a(by2, by3);
            if (ad2 == null) continue;
            byte by5 = ad2.h < by4 ? ad2.h : by4;
            this.void_a(ad2, by5);
            by4 = (byte)(by4 - by5);
        }
        x.a(by4 == 0);
        this.e();
    }

    public final void void_a(byte by2, byte by3) {
        this.void_a(this.var_ad_arr_a[by2], by3);
    }

    public final void void_a(ad ad2, byte by2) {
        x.a(ad2.h >= by2);
        ad2.b(by2);
        if (ad2.h < 1) {
            this.void_a(ad2);
        }
        this.f();
        this.e();
    }

    private void void_a(ad ad2) {
        for (int i2 = 0; i2 < this.var_ad_arr_a.length; ++i2) {
            if (this.var_ad_arr_a[i2] != ad2) continue;
            this.var_ad_arr_a[i2] = null;
            this.d();
            return;
        }
    }

    public final void void_c() {
        for (int i2 = 0; i2 < this.var_ad_arr_a.length; ++i2) {
            if (this.var_ad_arr_a[i2] == null || !this.var_ad_arr_a[i2].b()) continue;
            this.var_ad_arr_a[i2] = null;
            this.d();
        }
    }

    public final void d() {
        for (int i2 = 0; i2 < this.var_ad_arr_a.length; ++i2) {
            if (this.var_ad_arr_a[i2] != null) continue;
            int i3;
            for (i3 = i2; i3 < this.var_ad_arr_a.length - 1; ++i3) {
                this.var_ad_arr_a[i3] = this.var_ad_arr_a[i3 + 1];
            }
            this.var_ad_arr_a[i3] = null;
            return;
        }
    }

    public final ad ad_a(byte by2, byte by3) {
        byte by4 = this.byte_a(by2, by3);
        if (by4 == -1) {
            return null;
        }
        return this.var_ad_arr_a[by4];
    }

    public final ad[] ad_arr_a(byte by2, byte by3) {
//        Vector<ad> vector = new Vector<ad>(2);
        ad[] array_ad = new ad[this.var_ad_arr_a.length];
        int idx = 0;
        
        for (int i2 = 0; i2 < this.var_ad_arr_a.length; ++i2) {
            if (this.var_ad_arr_a[i2] == null || this.var_ad_arr_a[i2].f != by2 || this.var_ad_arr_a[i2].g != by3) continue;
//            vector.addElement(this.var_ad_arr_a[i2]);
            array_ad[idx] = this.var_ad_arr_a[i2];
            idx += 1;
        }
//        ad[] arrad = new ad[vector.size()];
//        for (int i3 = 0; i3 < vector.size(); ++i3) {
//            arrad[i3] = (ad)vector.elementAt(i3);
//        }
        
        ad[] arrad = new ad[idx];
        for (int i3 = 0; i3 < idx; ++i3) {
            arrad[i3] = array_ad[i3];
        }
        
        return arrad;
    }

    public final int int_a(byte by2, byte by3) {
        int n2 = 0;
        for (int i2 = 0; i2 < this.var_ad_arr_a.length; ++i2) {
            if (this.var_ad_arr_a[i2] == null || this.var_ad_arr_a[i2].f != by2 || this.var_ad_arr_a[i2].g != by3) continue;
            n2 += this.var_ad_arr_a[i2].h;
        }
        return n2;
    }

    public final byte byte_a(ad ad2) {
        for (byte by2 = 0; by2 < this.var_ad_arr_a.length; by2 = (byte)(by2 + 1)) {
            if (this.var_ad_arr_a[by2] != ad2) continue;
            return by2;
        }
        return -1;
    }

    public final byte byte_a(byte by2, byte by3) {
        for (byte by4 = 0; by4 < this.var_ad_arr_a.length; by4 = (byte)((byte)(by4 + 1))) {
            if (this.var_ad_arr_a[by4] == null || this.var_ad_arr_a[by4].f != by2 || this.var_ad_arr_a[by4].g != by3) continue;
            return by4;
        }
        return -1;
    }

    public final boolean a(byte by2, byte by3, int n2) {
        this.e();
        byte by4 = this.byte_b();
        if (n2 > 99) {
            return false;
        }
        if (by4 != -1) {
            return true;
        }
        if (!ad.var_boolean_arr_b[by2]) {
            return false;
        }
        ad[] arrad = this.ad_arr_a(by2, by3);
        for (int i2 = 0; i2 < arrad.length; ++i2) {
            if (arrad[i2].h + n2 > 99) continue;
            return true;
        }
        return false;
    }

    private final byte byte_b() {
        for (byte by2 = 0; by2 < this.var_ad_arr_a.length; by2 = (byte)(by2 + 1)) {
            if (this.var_ad_arr_a[by2] != null) continue;
            return by2;
        }
        return -1;
    }

    public final boolean boolean_a(byte by2, byte by3, byte by4) {
        for (int i2 = 0; i2 < this.var_ad_arr_a.length; ++i2) {
            if (this.var_ad_arr_a[i2] == null || this.var_ad_arr_a[i2].f != by2 || this.var_ad_arr_a[i2].g != by3 || this.var_ad_arr_a[i2].h < by4) continue;
            return true;
        }
        return false;
    }

    public final void e() {
        for (int n2 = 0; n2 < this.var_ad_arr_a.length - 1; n2 = (int)((byte)(n2 + 1))) {
            if (this.var_ad_arr_a[n2] == null || !ad.var_boolean_arr_b[this.var_ad_arr_a[n2].f] || this.var_ad_arr_a[n2].h >= 99) continue;
            for (byte by2 = (byte)(n2 + 1); by2 < this.var_ad_arr_a.length; by2 = (byte)(by2 + 1)) {
                if (this.var_ad_arr_a[by2] == null || this.var_ad_arr_a[by2].f != this.var_ad_arr_a[n2].f || this.var_ad_arr_a[by2].g != this.var_ad_arr_a[n2].g) continue;
                byte by3 = this.var_ad_arr_a[n2].h;
                byte by4 = this.var_ad_arr_a[by2].h;
                if (by3 + by4 <= 99) {
                    this.var_ad_arr_a[n2].a(by4);
                    this.var_ad_arr_a[by2] = null;
                    if (this.var_byte_a != by2) continue;
                    this.var_byte_a = (byte)n2;
                    continue;
                }
                byte by5 = (byte)(99 - by3);
                this.var_ad_arr_a[n2].a(by5);
                this.var_ad_arr_a[by2].b(by5);
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
    public final byte[] byte_arr_c() throws IOException, Throwable {
        ByteArrayOutputStream byteArrayOutputStream = null;
        DataOutputStream filterOutputStream = null;
        byteArrayOutputStream = new ByteArrayOutputStream();
        filterOutputStream = new DataOutputStream(byteArrayOutputStream);
        ((DataOutputStream)filterOutputStream).writeInt(this.var_int_a);
        for (int i2 = 0; i2 < this.var_ad_arr_a.length; ++i2) {
            if (this.var_ad_arr_a[i2] == null) {
                ((DataOutputStream)filterOutputStream).writeByte(0);
                continue;
            }
            ((DataOutputStream)filterOutputStream).writeByte(1);
            ((OutputStream)filterOutputStream).write(this.var_ad_arr_a[i2].byte_arr_a());
        }
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
    public final void a(byte[] arrby) throws IOException, Throwable {
        block14: {
            ByteArrayInputStream byteArrayInputStream = null;
            DataInputStream filterInputStream = null;
            byteArrayInputStream = new ByteArrayInputStream(arrby);
            filterInputStream = new DataInputStream(byteArrayInputStream);
            this.var_int_a = ((DataInputStream)filterInputStream).readInt();
            int n2 = 0;
            for (int i2 = 0; i2 < this.var_ad_arr_a.length; ++i2) {
                byte by2 = ((DataInputStream)filterInputStream).readByte();
                if (by2 == 0) continue;
                byte[] arrby2 = new byte[10];
                ((DataInputStream)filterInputStream).read(arrby2);
                this.var_ad_arr_a[n2++] = ad.a(arrby2);
            }
            try {
                filterInputStream.close();
                byteArrayInputStream.close();
            }
//            catch (IOException iOException) {}
//            break block14;
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
                    if (byteArrayInputStream != null) {
                        byteArrayInputStream.close();
                    }
                }
                catch (IOException iOException3) {}
            }
        }
        this.void_a();
    }

//    public static {
//        var_byte_arr_a = new byte[]{7, 8, 9, 10};
//    }
}

