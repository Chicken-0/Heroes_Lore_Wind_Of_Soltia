package rpg;

/*
 * Decompiled with CFR 0.150.
 */
public class e
extends ad {
    public short var_short_a;
    public byte d;
    public boolean var_boolean_a;
    public boolean b;
    public byte e;
    public byte[] j = new byte[4];

    public e(byte by2, byte by3) {
        super(by2, by3);
    }

    public int a(boolean bl2, byte[] arrby, int n2) {
        n2 = super.a(bl2, arrby, n2);
        n2 += this.a(arrby, n2, bl2);
        return n2;
    }

    public final int a(byte[] arrby, int n2, boolean bl2) {
        this.var_short_a = (short)(arrby[n2++] & 0xFF);
        this.d = arrby[n2++];
        this.var_boolean_a = arrby[n2++] != 0;
        boolean bl3 = false;
        for (int i2 = 1; i2 <= 8; ++i2) {
            if (arrby[n2 + i2] == 0) continue;
            bl3 = true;
            break;
        }
        if (!bl3) {
            this.b = true;
        }
        if (bl2 && bl3) {
            byte[] arrby2 = new byte[]{arrby[n2 + 1], arrby[n2 + 3], arrby[n2 + 5], arrby[n2 + 7]};
            byte[] arrby3 = new byte[]{arrby[n2 + 2], arrby[n2 + 4], arrby[n2 + 6], arrby[n2 + 8]};
            this.a(arrby[n2], arrby2, arrby3, (byte)0);
        }
        return 12;
    }

    public byte[] byte_arr_a() {
        byte[] arrby = super.byte_arr_a();
        byte[] arrby2 = arrby;
        arrby[3] = this.b ? (byte)1 : 0;
        arrby2[4] = this.e;
        System.arraycopy(this.j, 0, arrby2, 5, 4);
        return arrby2;
    }

    public final void a(byte n2, byte[] arrby, byte[] arrby2, byte by2) {
        for (int i2 = 0; i2 < n2; ++i2) {
            int n3;
            while (this.j[n3 = rpg.h.a(0, 3)] != 0 || arrby[n3] == 0 && arrby2[n3] == 0) {
            }
            this.j[n3] = (byte)rpg.h.a(arrby[n3], (int)arrby2[n3]);
        }
        this.e = by2;
    }

    public final void a(byte by2, byte by3, byte by4, byte by5) {
        this.j[0] = by2;
        this.j[1] = by3;
        this.j[2] = by4;
        this.j[3] = by5;
    }
}

