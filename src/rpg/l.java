package rpg;

/*
 * Decompiled with CFR 0.150.
 */
public final class l
extends t {
    public byte a;
    public byte b;

    public l(byte by2, byte by3) {
        super(by2, by3);
    }

    public final int a(boolean bl2, byte[] arrby, int n2) {
        n2 += this.a(arrby, n2);
        n2 += this.b(arrby, n2);
        n2 += this.c(arrby, n2);
        n2 += this.a(arrby, n2, bl2);
        this.a = arrby[n2++];
        this.b = arrby[n2++];
        this.c = arrby[n2++];
        return n2;
    }
}

