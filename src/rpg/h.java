/*
 * Decompiled with CFR 0.150.
 */
import java.util.Random;

public final class h {
    public static Random a = new Random();

    public static final int a(int n2, int n3) {
        x.a(n2 <= n3);
        int n4 = n3 - n2 + 1;
        if (n4 == 0) {
            return 0;
        }
        int n5 = Math.abs(a.nextInt()) % n4;
        return n2 + n5;
    }

    public static final short short_a(byte[] arrby, int n2) {
        if (arrby.length - 2 < n2) {
            throw new ArrayIndexOutOfBoundsException();
        }
        short s2 = 0;
        s2 = (short)(0 | (arrby[n2] & 0xFF) << 8);
        s2 = (short)(s2 | arrby[n2 + 1] & 0xFF);
        return s2;
    }

    public static final char[] a(char[] arrc, char[] arrc2) {
        char[] arrc3 = new char[arrc.length + arrc2.length];
        System.arraycopy(arrc, 0, arrc3, 0, arrc.length);
        System.arraycopy(arrc2, 0, arrc3, arrc.length, arrc2.length);
        return arrc3;
    }

    public static final int int_a(byte[] arrby, int n2) {
        int n3 = 0;
        if (arrby.length < n2 + 4) {
            return -1;
        }
        n3 = (arrby[n2] & 0xFF) << 24 | (arrby[n2 + 1] & 0xFF) << 16 | (arrby[n2 + 2] & 0xFF) << 8 | arrby[n2 + 3] & 0xFF;
        return n3;
    }

    public static final void a(int n2, byte[] arrby, int n3) {
        byte[] arrby2 = new byte[]{0, 0, 0, 0};
        int n4 = n2 & 0xFFFFFFFF;
        arrby2[0] = (byte)(n4 >> 24 & 0xFF);
        arrby2[1] = (byte)(n4 >> 16 & 0xFF);
        arrby2[2] = (byte)(n4 >> 8 & 0xFF);
        arrby2[3] = (byte)(n4 & 0xFF);
        System.arraycopy(arrby2, 0, arrby, n3, 4);
    }
}

