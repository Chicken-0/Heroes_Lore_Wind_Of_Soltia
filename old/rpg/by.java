package rpg;

/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 */
import javax.microedition.lcdui.Graphics;

public final class by
extends cb {
    private byte c;

    public by(c c2, byte by2) {
        super(c2, (byte)2);
        this.var_byte_b = 1;
        this.c = by2;
    }

    public final boolean a(int n2, int n3) {
        if (this.b(n2, n3)) {
            return true;
        }
        if (this.d(n2, n3)) {
            return true;
        }
        block0 : switch (n2) {
            case 8: {
                if (this.var_byte_b == 0) {
                    this.var_cb_b = new bk(this, this.c);
                    break;
                }
                this.var_cb_a.void_a();
                break;
            }
            default: {
                switch (n3) {
                    case -8: {
                        this.var_cb_a.void_a();
                        break block0;
                    }
                    case 53: {
                        if (this.var_byte_b == 0) {
                            this.var_cb_b = new bk(this, this.c);
                            break block0;
                        }
                        this.var_cb_a.void_a();
                    }
                }
            }
        }
        return true;
    }

    public final void a(Graphics graphics, int n2, int n3) {
        graphics.setColor(0x3F1F3F);
        graphics.fillRect(0, 0, MyGameCanvas.g, MyGameCanvas.h);
        bf.c(graphics, n2, n3);
        bh.a(graphics, 1, n2 + 77, n3 + 5);
        bf.b(graphics, n2, n3 + 24, 3);
        graphics.setColor(0);
        bh.a(graphics, (n2 += 10) + 11, (n3 += 5) + 34, 133, 1, ce.var_z_a.loadByIndex(15 + this.c - 6));
        graphics.drawImage(ce.var_javax_microedition_lcdui_Image_arr_l[19], n2 + 7, n3 + 80, 20);
        bh.int_a(graphics, n2 + 11, n3 + 84, ce.var_z_a.loadByIndex(this.c - 6), 1);
        graphics.drawImage(ce.var_javax_microedition_lcdui_Image_arr_m[this.c - 6], n2 + 125, n3 + 137, 40);
        graphics.drawImage(ce.var_javax_microedition_lcdui_Image_arr_l[17], n2 + 5 + (this.var_byte_b == 0 ? 0 : 28), n3 + 118, 20);
        if (this.var_byte_b == 0) {
            graphics.setColor(0xFFFFFF);
        } else {
            graphics.setColor(0);
        }
        bh.int_a(graphics, n2 + 9, n3 + 121, ce.var_z_g.loadByIndex(14), 1);
        if (this.var_byte_b == 1) {
            graphics.setColor(0xFFFFFF);
        } else {
            graphics.setColor(0);
        }
        bh.int_a(graphics, n2 + 37, n3 + 121, ce.var_z_g.loadByIndex(15), 1);
        bh.a(graphics, bh.labelTextOk, bh.labelTextBack);
    }
}

