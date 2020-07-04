package rpg;

/*
 * Decompiled with CFR 0.150.
 */
public final class j {
    public static j[] var_j_arr_a;
    public static final byte[] var_byte_arr_a = new byte[]{3, 2, 6, 2, 2, 1, 3, 4, 3, 2, 3, 4, 2, 3, 2, 2, 2, 3, 3, 3, 3, 3, 6, 3, 3, 3, 2, 2, 2, 3, 3, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
    public char[] var_char_arr_a;
    public byte var_byte_a;
    public byte var_byte_b;
    public byte var_byte_c;
    public byte var_byte_d;
    public boolean var_boolean_a;
    public boolean var_boolean_b;
    public boolean var_boolean_c;
    public boolean var_boolean_d;
    public byte var_byte_e;
    public byte f;
    public short var_short_a;
    public short var_short_b;
    public short var_short_c;
    public short var_short_d;
    public byte g;
    public byte h;
    public byte i;
    public short var_short_e;
    public byte[] var_byte_arr_b;
    public byte j;
    public byte k;
    public byte l;
    public byte m;

    public static final void a(int n2) {
        var_j_arr_a = new j[n2];
    }

    public static final void a(byte[] arrby, byte n2, byte by2) {
        int n3 = 1;
        for (int i2 = 0; i2 < n2; ++i2) {
            short s2 = rpg.h.short_a(arrby, n3);
            n3 += 2 + s2;
        }
        n3 += 2;
        j j2 = new j();
        int n4 = ++n3;
        byte by3 = arrby[n4];
        j2.var_char_arr_a = bh.char_arr_a(new String(arrby, ++n3, (int)by3));
        n3 += by3;
        by3 = arrby[n3++];
        j2.var_byte_a = (byte)(by3 >> 6 & 3);
        j2.var_byte_b = (byte)(by3 >> 4 & 3);
        j2.var_byte_c = (byte)(by3 >> 2 & 3);
        j2.var_byte_d = (byte)(by3 & 3);
        j2.var_boolean_a = ((by3 = arrby[n3++]) >> 3 & 1) == 1;
        j2.var_boolean_b = (by3 >> 2 & 1) == 1;
        j2.var_boolean_c = (by3 >> 1 & 1) == 1;
        boolean bl2 = j2.var_boolean_d = (by3 & 1) == 1;
        if (j2.var_boolean_c) {
            j2.var_byte_e = (byte)(by3 >> 6 & 3);
        }
        j2.f = arrby[n3++];
        j2.var_short_a = rpg.h.short_a(arrby, n3);
        j2.var_short_b = rpg.h.short_a(arrby, n3 += 2);
        j2.var_short_c = rpg.h.short_a(arrby, n3 += 2);
        j2.var_short_d = rpg.h.short_a(arrby, n3 += 2);
        n3 += 2;
        j2.g = arrby[n3++];
        j2.h = arrby[n3++];
        j2.i = arrby[n3++];
        j2.var_short_e = rpg.h.short_a(arrby, n3);
        n3 += 2;
        by3 = arrby[n3++];
        j2.var_byte_arr_b = new byte[3 * by3];
        System.arraycopy(arrby, n3, j2.var_byte_arr_b, 0, j2.var_byte_arr_b.length);
        rpg.j.var_j_arr_a[by2] = j2;
    }

    public static final void a(byte by2) {
        j j2 = var_j_arr_a[by2];
        byte[] arrby = (byte[])ce.var_java_lang_Object_arr_e[by2 * 12 + 0];
        x.a(arrby != null);
        j2.j = arrby[0];
        arrby = (byte[])ce.var_java_lang_Object_arr_e[by2 * 12 + 4];
        x.a(arrby != null);
        j2.k = arrby[0];
        arrby = (byte[])ce.var_java_lang_Object_arr_e[by2 * 12 + 8];
        x.a(arrby != null);
        j2.l = arrby[0];
    }

    public static final void b(byte by2) {
        j j2 = var_j_arr_a[by2];
        byte[] arrby = (byte[])ce.var_java_lang_Object_arr_h[by2 * 16 + 0];
        x.a(arrby != null);
        j2.j = arrby[0];
        arrby = (byte[])ce.var_java_lang_Object_arr_h[by2 * 16 + 4];
        j2.k = arrby != null ? arrby[0] : (byte)-1;
        arrby = (byte[])ce.var_java_lang_Object_arr_h[by2 * 16 + 12];
        j2.l = arrby != null ? arrby[0] : (byte)-1;
        arrby = (byte[])ce.var_java_lang_Object_arr_h[by2 * 16 + 8];
        if (arrby != null) {
            j2.m = arrby[0];
            return;
        }
        j2.m = (byte)-1;
    }

//    public static {
//        var_byte_arr_a = new byte[]{3, 2, 6, 2, 2, 1, 3, 4, 3, 2, 3, 4, 2, 3, 2, 2, 2, 3, 3, 3, 3, 3, 6, 3, 3, 3, 2, 2, 2, 3, 3, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
//    }
}

