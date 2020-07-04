/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 */
import javax.microedition.lcdui.Graphics;

public final class bz
extends cb {
    public bz(cb cb2) {
        super(cb2, (byte)5);
    }

    public final boolean a(int n2, int n3) {
        if (this.b(n2, n3)) {
            return true;
        }
        if (this.c(n2, n3)) {
            this.var_cb_a.var_boolean_a = true;
            return true;
        }
        if (n3 == 53 || n2 == 8) {
            byte by2 = -1;
            block0 : switch (this.var_byte_b) {
                case 0: {
                    switch (n.var_byte_a) {
                        case 6: {
                            by2 = 0;
                            break block0;
                        }
                        case 7: {
                            by2 = 2;
                            break block0;
                        }
                        case 8: {
                            by2 = 1;
                        }
                    }
                    break;
                }
                case 2: {
                    by2 = 5;
                    break;
                }
                case 1: {
                    if (n.var_byte_a != 8) break;
                    by2 = 3;
                    break;
                }
                case 3: {
                    by2 = 6;
                    break;
                }
                case 4: {
                    by2 = 4;
                }
            }
            if (by2 != -1) {
                byte[] arrby = n.ao_a().var_g_a.a(by2);
                if (arrby.length > 0) {
                    this.var_cb_b = new m(this, arrby, this.var_byte_b, ai.var_z_a.a(16));
                } else {
                    Object[] arrobject = new Object[]{cj.var_cj_a.a(3937).toCharArray()};
                    this.a(arrobject);
                }
            } else {
                Object[] arrobject = new Object[]{cj.var_cj_a.a(3937).toCharArray()};
                this.a(arrobject);
            }
            return true;
        }
        return false;
    }

    public final void a(byte by2, byte by3) {
        cb cb2 = this.var_cb_b;
        super.a(by2, by3);
        if (cb2 instanceof m && by2 != -1) {
            ao ao2 = n.ao_a();
            e e2 = (e)ao2.var_g_a.a((int)by3);
            if (!e2.b) {
                Object[] arrobject = new Object[]{ai.var_z_a.a(18), ai.var_z_a.a(19)};
                this.a(arrobject);
                return;
            }
            ao2.b(by3, by2);
        }
    }

    public final void a(Graphics graphics, int n2, int n3) {
        ad ad2;
        ao ao2 = n.ao_a();
        r.a(graphics, ai.var_z_a.a(20), (n2 += 2) + 5, n3 += 15);
        this.a(graphics, n2, n3, false);
        for (int i2 = this.int_c(); i2 <= this.int_d(); ++i2) {
            ad2 = ao2.ad_a(i2);
            if (ad2 != null) {
                cb.a(graphics, n2 + 13, n3 + 18 + 23 * (i2 % 5), ad2, false);
                continue;
            }
            graphics.drawImage(ce.var_javax_microedition_lcdui_Image_arr_o[i2], n2 + 13, n3 + 19 + 23 * (i2 % 5), 3);
        }
        ad2 = ao2.ad_a((int)this.var_byte_b);
        if (ad2 != null) {
            cb.a(graphics, n2 + 33, n3 + 14, ad2);
            return;
        }
        graphics.setColor(0xFFFFFF);
        if (this.var_byte_b == 1 && n.var_byte_a != 8) {
            bh.int_a(graphics, n2 + 30, n3 + 14, ai.var_z_a.a(49), 1);
            return;
        }
        bh.int_a(graphics, n2 + 33, n3 + 14, ai.var_z_a.a(21), 1);
    }
}

