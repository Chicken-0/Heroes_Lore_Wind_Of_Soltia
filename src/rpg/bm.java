package rpg;

/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 */
import javax.microedition.lcdui.Graphics;

public final class bm
extends cb {
    public bm(cb cb2) {
        super(cb2, (byte)5);
        ao ao2 = n.ao_a();
        for (int n2 = 0; n2 < 5; n2 = (int)((byte)(n2 + 1))) {
            if (ao2.var_p_arr_a[n2] != ao2.p_a()) continue;
            this.var_byte_b = (byte)n2;
            return;
        }
    }

    public final boolean a(int n2, int n3) {
        if (this.b(n2, n3)) {
            return true;
        }
        if (this.c(n2, n3)) {
            return true;
        }
        ao ao2 = n.ao_a();
        if ((n3 == 53 || n2 == 8) && ao2.var_p_arr_a[this.var_byte_b] != null) {
            Object[] arrobject = new Object[]{ai.var_z_a.loadByIndex(22), ai.var_z_a.loadByIndex(23)};
            this.a((byte)3, (byte)2, arrobject);
        }
        return false;
    }

    public final void a(byte by2, byte by3) {
        cb cb2 = this.var_cb_b;
        super.a(by2, by3);
        ao ao2 = n.ao_a();
        if (cb2 instanceof af && by2 == 3) {
            switch (by3) {
                case 0: {
                    if (ao2.a(ao2.var_p_arr_a[this.var_byte_b])) {
                        char[] arrc = (BabbleText.instance.getTextById(3933) + " " + new String(ce.var_z_b.loadByIndex(ao2.var_p_arr_a[this.var_byte_b].f))).toCharArray();
                        Object[] arrobject = new Object[]{arrc};
                        this.a(arrobject);
                        return;
                    }
                    Object[] arrobject = new Object[]{ai.var_z_a.loadByIndex(27), ai.var_z_a.loadByIndex(28), ai.var_z_a.loadByIndex(29)};
                    this.a(arrobject);
                    return;
                }
                case 1: {
                    this.var_cb_b = new bn(this, ao2.var_p_arr_a[this.var_byte_b]);
                }
            }
        }
    }

    public final void a(Graphics graphics, int n2, int n3) {
        ao ao2 = n.ao_a();
        MyGameCanvas.a(graphics, ai.var_z_a.loadByIndex(30), (n2 += 2) + 5, n3 += 15);
        this.a(graphics, n2, n3, false);
        for (int i2 = 0; i2 < 5; ++i2) {
            if (ao2.var_p_arr_a[i2] == null) continue;
            graphics.drawImage(ce.var_javax_microedition_lcdui_Image_arr_b[ao2.var_p_arr_a[i2].f], n2 + 15, n3 + 19 + i2 % 5 * 23, 3);
        }
        if (ao2.var_p_arr_a[this.var_byte_b] == null) {
            graphics.setColor(14663551);
            bh.int_a(graphics, n2 + 34, n3 + 18, ai.var_z_a.loadByIndex(31), 1);
            return;
        }
        p p2 = ao2.var_p_arr_a[this.var_byte_b];
        MyGameCanvas.a(graphics, ai.var_z_a.loadByIndex(32), n2 + 89, n3 + 22);
        if (p2 == ao2.p_a()) {
            graphics.drawImage(ce.var_javax_microedition_lcdui_Image_l, n2 + 100, n3 + 26, 36);
        }
        graphics.setColor(0xFFFFFF);
        bh.int_a(graphics, n2 + 34, n3 + 18, ce.var_z_b.loadByIndex(ao2.var_p_arr_a[this.var_byte_b].f), 1);
        graphics.setColor(14663551);
        bh.int_a(graphics, n2 + 34, n3 + 35, ce.var_z_b.loadByIndex(ao2.var_p_arr_a[this.var_byte_b].f + 6), 1);
        graphics.drawImage(ce.var_javax_microedition_lcdui_Image_g, n2 + 34, n3 + 53, 20);
        MyGameCanvas.c(graphics, p2.var_short_a, n2 + 50, n3 + 53, 4);
        graphics.drawImage(ce.var_javax_microedition_lcdui_Image_e, n2 + 34, n3 + 67, 20);
        MyGameCanvas.c(graphics, p2.var_int_a, n2 + 102, n3 + 67, 8);
        graphics.setColor(0x3F1F3F);
        graphics.fillRect(n2 + 34, n3 + 76, 72, 3);
        graphics.setColor(0xFFFFFF);
        graphics.fillRect(n2 + 35, n3 + 77, p2.var_int_a * 70 / p2.var_int_b, 1);
        graphics.drawImage(ce.var_javax_microedition_lcdui_Image_h, n2 + 38, n3 + 81, 20);
        MyGameCanvas.c(graphics, p2.var_int_b, n2 + 102, n3 + 81, 8);
    }
}

