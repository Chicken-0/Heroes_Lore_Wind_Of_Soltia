/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 */
import javax.microedition.lcdui.Graphics;

public final class bx
extends cb {
    private char[] var_char_arr_a;
    private char[] b;
    private boolean c;
    private short[] var_short_arr_a;

    public bx(bt bt2, char[] arrc, boolean bl2, char[] arrc2) {
        super(bt2, (byte)1);
        this.var_char_arr_a = arrc;
        this.b = arrc2;
        this.c = bl2;
        short[] arrs = new short[20];
        int n2 = 0;
        for (int i2 = 0; i2 < arrc.length; i2 += bh.a(arrc, i2, 130, 11)) {
            arrs[n2++] = (short)i2;
        }
        this.var_short_arr_a = new short[n2];
        System.arraycopy(arrs, 0, this.var_short_arr_a, 0, this.var_short_arr_a.length);
        this.var_byte_a = (byte)this.var_short_arr_a.length;
    }

    public final boolean a(int n2, int n3) {
        if (this.b(n2, n3)) {
            return true;
        }
        if (this.c(n2, n3)) {
            return true;
        }
        if (n3 == -8) {
            this.var_cb_a.a((byte)-1, (byte)-1);
            return true;
        }
        return true;
    }

    public final void a(Graphics graphics, int n2, int n3) {
        short s2;
        boolean bl2 = false;
        if (this.c) {
            cb.b(graphics, (n2 += 2) + 4, (n3 += 15) + 10, 143, 139);
            n2 += 8;
            n3 += 25;
            graphics.setColor(0xFFFFFF);
            bh.a(graphics, bh.m, bh.var_char_arr_e);
        } else {
            graphics.setColor(0x3F1F3F);
            graphics.fillRect(0, 0, r.g, r.h);
            bf.c(graphics, n2, n3);
            bh.a(true);
            graphics.setColor(0);
            bh.void_a(graphics, n2 + 155 >> 1, n3 + 5 + 4, this.b, 1);
            bh.a(false);
            bf.b(graphics, n2, n3 + 24, 3);
            n2 += 10;
            n3 += 43;
            graphics.setColor(0x5F3F3F);
            bh.a(graphics, null, bh.var_char_arr_e);
        }
        r.d(graphics, n2 + 155 - 25, n3 - 8, this.var_byte_b + 1, this.var_byte_a);
        if (this.var_byte_a > 1) {
            if (this.var_byte_b > 0) {
                graphics.drawImage(ce.var_javax_microedition_lcdui_Image_k, n2 + 62, n3 - 6, 20);
            }
            if (this.var_byte_b < this.var_byte_a - 1) {
                graphics.drawImage(ce.var_javax_microedition_lcdui_Image_n, n2 + 62, n3 + 114, 20);
            }
        }
        short s3 = this.var_short_arr_a[this.var_byte_b];
        short s4 = s2 = this.var_byte_b == this.var_byte_a - 1 ? (short)this.var_char_arr_a.length : this.var_short_arr_a[this.var_byte_b + 1];
        if (this.var_char_arr_a[0] == '!' && s3 == 0) {
            s3 = 1;
        }
        if (this.c) {
            graphics.setColor(0xFFFFFF);
        } else {
            graphics.setColor(0);
        }
        bh.a(graphics, n2, n3 + 3, 130, 1, this.var_char_arr_a, s3, 0, s2 - s3);
    }
}

