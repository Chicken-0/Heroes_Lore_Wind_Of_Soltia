/*
 * Decompiled with CFR 0.150.
 */
import java.io.IOException;

public final class z {
    private int[] var_int_arr_a;
    public short var_short_a;

    public z(String string) throws IOException {
        byte[] arrby = ce.a(string + ".tdf");
        int n2 = 0;
        ++n2;
        this.var_short_a = (short)(arrby[0] & 0xFF);
        this.var_int_arr_a = new int[this.var_short_a];
        for (int i2 = 0; i2 < this.var_short_a; ++i2) {
            int n3 = (arrby[n2++] & 0xFF) << 8;
            String string2 = new String(arrby, n2, n3 += arrby[n2++] & 0xFF);
            this.var_int_arr_a[i2] = Integer.parseInt(string2.trim());
            n2 += n3;
        }
    }

    public final char[] a(int n2) {
        return cj.var_cj_a.a(this.var_int_arr_a[n2]).replace(';', '\n').toCharArray();
    }
}

