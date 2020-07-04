package rpg;

/*
 * Decompiled with CFR 0.150.
 */
public final class bq {
    public static final byte[] a(byte[] arrby, byte[] arrby2) {
        byte[] arrby3 = new byte[arrby.length + 1];
        int n2 = 0;
        int n3 = 0;
        for (int i2 = 0; i2 < arrby.length; ++i2) {
            int n4 = arrby[i2];
            if (++n3 == arrby2.length) {
                n3 = 0;
            }
            n2 += arrby2[n3] & 0xFF;
            arrby3[i2] = (byte)(n4 ^= arrby2[n3]);
        }
        arrby3[arrby.length] = (byte)n2;
        return arrby3;
    }

    public static final byte[] b(byte[] arrby, byte[] arrby2) {
        int n2;
        byte[] arrby3 = new byte[arrby.length + 1];
        int n3 = 0;
        if (arrby.length < 1) {
            return null;
        }
        int n4 = 0;
        try {
            for (n2 = 0; n2 < arrby.length - 1; ++n2) {
                int n5 = arrby[n2];
                if (++n4 == arrby2.length) {
                    n4 = 0;
                }
                n3 += arrby2[n4] & 0xFF;
                arrby3[n2] = (byte)(n5 ^= arrby2[n4]);
            }
        }
        catch (Exception exception) {
            return null;
        }
        if ((n3 & 0xFF) != (arrby[n2] & 0xFF)) {
            return null;
        }
        return arrby3;
    }
}

