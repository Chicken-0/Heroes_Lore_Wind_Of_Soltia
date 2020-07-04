/*
 * Decompiled with CFR 0.150.
 */
import java.util.Vector;

public class ad {
    public static z var_z_b;
    public static final boolean[] var_boolean_arr_b;
    public static final boolean[] c;
    public byte f;
    public byte g;
    public char[] var_char_arr_a;
    public char[] var_char_arr_b;
    public int var_int_a;
    public byte h;

    public ad(byte by2, byte by3) {
        this.f = by2;
        this.g = by3;
        this.h = 1;
    }

    public final void a(boolean bl2) {
        byte[] arrby = ce.byte_arr_a(this.f, this.g);
        boolean bl3 = false;
        this.a(bl2, arrby, 1);
    }

    public int a(boolean bl2, byte[] arrby, int n2) {
        n2 += this.a(arrby, n2);
        n2 += this.b(arrby, n2);
        n2 += this.c(arrby, n2);
        return n2;
    }

    public final int a(byte[] arrby, int n2) {
        byte by2 = arrby[n2++];
        this.var_char_arr_a = bh.char_arr_a(new String(arrby, n2, (int)by2));
        return 1 + by2;
    }

    public final int b(byte[] arrby, int n2) {
        byte by2 = arrby[n2++];
        this.var_char_arr_b = bh.char_arr_a(new String(arrby, n2, (int)by2));
        return 1 + by2;
    }

    public final int c(byte[] arrby, int n2) {
        this.var_int_a += (arrby[n2 + 3] & 0xFF) * 0x1000000;
        this.var_int_a += (arrby[n2 + 2] & 0xFF) * 65536;
        this.var_int_a += (arrby[n2 + 1] & 0xFF) * 256;
        this.var_int_a += arrby[n2] & 0xFF;
        return 4;
    }

    public byte[] byte_arr_a() {
        byte[] arrby = new byte[10];
        byte[] arrby2 = arrby;
        arrby[0] = this.f;
        arrby2[1] = this.g;
        arrby2[2] = this.h;
        return arrby2;
    }

    public final void a(byte by2) {
        this.h = (byte)(this.h + by2);
    }

    public final void b(byte by2) {
        this.h = (byte)(this.h - by2);
    }

    public final char[] char_arr_a() {
        return var_z_b.a(this.f);
    }

    public final boolean boolean_a() {
        return this.f == 10 || this.f == 7 || this.f == 8 || this.f == 9;
    }

    public final boolean b() {
        return this.f == 18 || this.f == 19 || this.f == 20 || this.f == 21;
    }

    public static final ad a(byte by2, byte by3, boolean bl2, boolean bl3) {
        ad ad2 = null;
        switch (by2) {
            case 0: 
            case 1: 
            case 2: {
                ad2 = new l(by2, by3);
                break;
            }
            case 3: {
                ad2 = new t(by2, by3);
                break;
            }
            case 4: 
            case 5: 
            case 6: {
                ad2 = new e(by2, by3);
                break;
            }
            default: {
                ad2 = new ad(by2, by3);
            }
        }
        if (bl2) {
            ad2.a(bl3);
        }
        ad2.h = 1;
        return ad2;
    }

    public static final ad a(byte[] arrby, int n2, boolean bl2, boolean bl3) {
        ad ad2 = null;
        byte by2 = arrby[n2++];
        byte by3 = arrby[n2++];
        switch (by2) {
            case 0: 
            case 1: 
            case 2: {
                ad2 = new l(by2, by3);
                break;
            }
            case 3: {
                ad2 = new t(by2, by3);
                break;
            }
            case 4: 
            case 5: 
            case 6: {
                ad2 = new e(by2, by3);
                break;
            }
            default: {
                ad2 = new ad(by2, by3);
            }
        }
        if (bl2) {
            ad2.a(bl3, arrby, n2);
        }
        return ad2;
    }

    public static final ad a(byte[] arrby) {
        ad ad2 = ad.a(arrby[0], arrby[1], true, true);
        ad.a(arrby[0], arrby[1], true, true).h = arrby[2];
        if (ad2 instanceof e) {
            ((e)ad2).b = arrby[3] == 1;
            ((e)ad2).e = arrby[4];
            ((e)ad2).a(arrby[5], arrby[6], arrby[7], arrby[8]);
        }
        if (ad2 instanceof t) {
            ((t)ad2).c = arrby[9];
        }
        return ad2;
    }

    public static final Vector[] java_util_Vector_arr_a() {
        Vector[] arrvector = new Vector[6];
        for (int i2 = 0; i2 < 6; ++i2) {
            arrvector[i2] = new Vector();
        }
        byte[] arrby = ce.byte_arr_a();
        int n2 = 0;
        while (n2 < arrby.length) {
            byte by2 = arrby[n2++];
            ad ad2 = ad.a(arrby, n2, true, false);
            n2 += by2;
            switch (ad2.f) {
                case 7: 
                case 9: 
                case 10: {
                    arrvector[0].addElement(ad2);
                    break;
                }
                case 0: 
                case 1: 
                case 2: {
                    ((e)ad2).b = true;
                    arrvector[1].addElement(ad2);
                    break;
                }
                case 3: {
                    ((e)ad2).b = true;
                    arrvector[2].addElement(ad2);
                    break;
                }
                case 5: {
                    ((e)ad2).b = true;
                    arrvector[3].addElement(ad2);
                    break;
                }
                case 6: {
                    ((e)ad2).b = true;
                    arrvector[4].addElement(ad2);
                    break;
                }
                case 4: {
                    ((e)ad2).b = true;
                    arrvector[5].addElement(ad2);
                }
            }
        }
        for (int i3 = 0; i3 < 6; ++i3) {
            arrvector[i3].trimToSize();
        }
        return arrvector;
    }

    public static final ad a(ad ad2, ad ad3, ad ad4) {
        byte by2 = 0;
        if (ad2 != null) {
            ++by2;
        }
        if (ad3 != null) {
            ++by2;
        }
        if (ad4 != null) {
            ++by2;
        }
        byte[] arrby = ce.a("/itm/mixtbl");
        int n2 = 0;
        while (n2 < arrby.length) {
            byte by3;
            byte by4;
            ad[] arrad = new ad[]{ad2, ad3, ad4};
            byte by5 = arrby[n2++];
            boolean bl2 = true;
            for (by4 = 0; by4 < by5; ++by4) {
                by3 = arrby[n2++];
                byte by6 = arrby[n2++];
                boolean bl3 = false;
                for (int i2 = 0; i2 < 3; ++i2) {
                    if (arrad[i2] == null || arrad[i2].f != by3 || arrad[i2].g != by6) continue;
                    bl3 = true;
                    arrad[i2] = null;
                    break;
                }
                if (bl3) continue;
                bl2 = false;
            }
            by4 = arrby[n2++];
            by3 = arrby[n2++];
            if (by5 != by2) {
                bl2 = false;
            }
            if (!bl2) continue;
            return ad.a(by4, by3, true, true);
        }
        return null;
    }

    public static {
        var_boolean_arr_b = new boolean[]{false, false, false, false, false, false, false, true, true, true, true, true, true, true, true, true, true, true, false, false, false, false, true, true};
        c = new boolean[]{false, false, false, false, false, false, false, true, false, true, false, false, true, true, true, true, true, false, false, false, false, false, false, false};
    }
}

