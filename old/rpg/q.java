package rpg;

/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 */
import javax.microedition.lcdui.Graphics;

public final class q
extends cb {
    private char[] a = ce.var_z_a.loadByIndex(n.var_byte_a - 6);
    private char[] b;

    public q(cb cb2) {
        super(cb2, (byte)4);
        int n2 = 3 + n.var_byte_a - 6;
        if (n.g == 1) {
            n2 += 15;
        } else if (n.g >= 2) {
            n2 += 18;
        }
        this.b = ce.var_z_a.loadByIndex(n2);
    }

    public final boolean a(int n2, int n3) {
        if (this.b(n2, n3)) {
            return true;
        }
        if (this.c(n2, n3)) {
            return true;
        }
        if (this.var_byte_b == 3 && (n3 == 53 || n2 == 8)) {
            if (n.ao_a().var_short_a > 0) {
                this.var_cb_b = new bi(this);
            } else {
                Object[] arrobject = new Object[]{ai.var_z_a.loadByIndex(0), ai.var_z_a.loadByIndex(1)};
                this.a(arrobject);
            }
            return true;
        }
        return false;
    }

    public final void a(Graphics graphics, int n2, int n3) {
        ao ao2 = n.ao_a();
        char[] arrc = ai.var_z_a.loadByIndex(2);
        MyGameCanvas.a(graphics, arrc, (n2 += 2) + 5, n3 += 15);
        cb.a(graphics, n2 + 110, n3 + 2, ao2.var_g_a.var_int_a);
        this.a(graphics, n2, n3, false);
        MyGameCanvas.c(graphics, 1, n2 + 12, n3 + 16, 4);
        MyGameCanvas.c(graphics, 2, n2 + 12, n3 + 16 + 23, 4);
        MyGameCanvas.c(graphics, 3, n2 + 12, n3 + 16 + 46, 4);
        graphics.drawImage(ce.var_javax_microedition_lcdui_Image_a, n2 + 10, n3 + 14 + 69, 20);
        if (ao2.var_short_a > 0) {
            graphics.drawImage(ce.var_javax_microedition_lcdui_Image_l, n2 + 3, n3 + 18 + 69, 36);
        }
        switch (this.var_byte_b) {
            case 0: {
                graphics.setColor(0xFFFFFF);
                bh.int_a(graphics, n2 + 35, n3 + 18, this.a, 1);
                graphics.setColor(14663551);
                bh.int_a(graphics, n2 + 33, n3 + 35, this.b, 1);
                graphics.drawImage(ce.var_javax_microedition_lcdui_Image_g, n2 + 35, n3 + 52, 20);
                MyGameCanvas.c(graphics, ao2.var_byte_g, n2 + 52, n3 + 52, 4);
                graphics.drawImage(ce.var_javax_microedition_lcdui_Image_e, n2 + 34, n3 + 70, 20);
                MyGameCanvas.c(graphics, ao2.var_int_c, n2 + 102, n3 + 70, 8);
                graphics.setColor(0x3F1F3F);
                graphics.fillRect(n2 + 34, n3 + 79, 72, 3);
                graphics.setColor(0xFFFFFF);
                graphics.fillRect(n2 + 34 + 1, n3 + 79 + 1, ao2.var_int_c * 70 / ao2.var_int_f, 1);
                graphics.drawImage(ce.var_javax_microedition_lcdui_Image_h, n2 + 38, n3 + 84, 20);
                MyGameCanvas.c(graphics, ao2.var_int_f, n2 + 102, n3 + 84, 8);
                graphics.drawImage(ce.var_javax_microedition_lcdui_Image_f, n2 + 34, n3 + 97, 20);
                MyGameCanvas.d(graphics, n2 + 102, n3 + 96, ao2.var_int_a, ao2.var_int_d);
                graphics.drawImage(ce.var_javax_microedition_lcdui_Image_j, n2 + 34, n3 + 106, 20);
                MyGameCanvas.d(graphics, n2 + 102, n3 + 105, ao2.var_int_b, ao2.var_int_e);
                return;
            }
            case 1: {
                graphics.setColor(14663551);
                for (int i2 = 0; i2 < 6; ++i2) {
                    bh.int_a(graphics, n2 + 38, n3 + 21 + i2 * 15, ce.var_z_a.loadByIndex(9 + i2), 1);
                }
                MyGameCanvas.c(graphics, ao2.var_short_b + ao2.m, n2 + 100, n3 + 22, 8);
                MyGameCanvas.c(graphics, ao2.var_short_e + ao2.byte_n, n2 + 100, n3 + 22 + 15, 8);
                MyGameCanvas.c(graphics, ao2.var_short_f + ao2.o, n2 + 100, n3 + 22 + 30, 8);
                MyGameCanvas.c(graphics, ao2.var_short_g + ao2.p, n2 + 100, n3 + 22 + 45, 8);
                MyGameCanvas.c(graphics, ao2.var_short_h, n2 + 100, n3 + 22 + 60, 8);
                MyGameCanvas.c(graphics, ao2.var_short_i, n2 + 100, n3 + 22 + 75, 8);
                return;
            }
            case 2: {
                graphics.setColor(14663551);
                bh.int_a(graphics, n2 + 34, n3 + 18, this.a, 1);
                graphics.setColor(0xFFFFFF);
                char[] arrc2 = ce.var_z_a.loadByIndex(n.var_byte_a);
                if (MyGameCanvas.g > 128) {
                    bh.a(graphics, n2 + 34, n3 + 30, 110, 1, arrc2);
                    return;
                }
                bh.a(graphics, n2 + 34, n3 + 30, 75, 1, arrc2);
                return;
            }
            case 3: {
                cb.b(graphics, n2 + 34, n3 + 22, 100, 26, 0x3F1F3F);
                graphics.setColor(0xFFFFFF);
                MyGameCanvas.a(graphics, ai.var_z_a.loadByIndex(3), n2 + 37, n3 + 25);
                MyGameCanvas.a(graphics, ai.var_z_a.loadByIndex(4), n2 + 37, n3 + 32 + 4);
                MyGameCanvas.c(graphics, n.ao_a().var_short_a, n2 + 99, n3 + 32 + 4, 8);
                cb.b(graphics, n2 + 34, n3 + 62, 100, 33, 0x3F1F3F);
                graphics.setColor(0xFFFFFF);
                bh.int_a(graphics, n2 + 40, n3 + 72, ai.var_z_a.loadByIndex(5), 1);
                graphics.setColor(14663551);
                bh.int_a(graphics, n2 + 60, n3 + 67, ai.var_z_a.loadByIndex(6), 1);
                bh.int_a(graphics, n2 + 60, n3 + 80, ai.var_z_a.loadByIndex(7), 1);
            }
        }
    }
}

