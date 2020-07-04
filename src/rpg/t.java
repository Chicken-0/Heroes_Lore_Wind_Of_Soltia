package rpg;

/*
 * Decompiled with CFR 0.150.
 */
public class t
extends e
implements u {
    public static final byte[] h = new byte[]{0, 1, -1, -1, -1, 4, 3, 2, -1};
    public static TableDefineTextFile a;
    public static final byte[] i = new byte[]{20, 16, 6, 13, 13, 10, 10, 10, 10};
    public byte c;

    public t(byte by2, byte by3) {
        super(by2, by3);
    }

    public int a(boolean bl2, byte[] arrby, int n2) {
        n2 = super.a(bl2, arrby, n2);
        this.c = arrby[n2++];
        return n2;
    }

    public final byte[] byte_arr_a() {
        byte[] arrby = super.byte_arr_a();
        byte[] arrby2 = arrby;
        arrby[9] = this.c;
        return arrby2;
    }

//    public static {
//        i = new byte[]{20, 16, 6, 13, 13, 10, 10, 10, 10};
//    }
}

