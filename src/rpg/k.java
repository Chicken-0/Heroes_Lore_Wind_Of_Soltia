package rpg;

/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 */
import javax.microedition.lcdui.Graphics;

public final class k
extends cb {
    private ad[] a = new ad[3];

    public k(cb cb2) {
        super(cb2, (byte)4);
    }

    public final boolean a(int n2, int n3) {
        if (this.b(n2, n3)) {
            return true;
        }
        if (this.var_cb_b != null && this.var_cb_b.a(n2, n3)) {
            return true;
        }
        if (this.c(n2, n3)) {
            return true;
        }
        if (n3 == 53 || n2 == 8) {
            ao ao2 = n.ao_a();
            if (this.var_byte_b < 3) {
                byte[] arrby = ao2.var_g_a.byte_arr_b();
                if (arrby.length < 1) {
                    Object[] arrobject = new Object[]{ax.var_z_a.loadByIndex(20)};
                    this.a(arrobject);
                } else {
                    this.var_cb_b = new m(this, arrby, this.var_byte_b, ax.var_z_a.loadByIndex(21));
                }
            } else {
                int n4 = 0;
                Object[] arrobject = new Object[3];
                if (this.a[0] != null) {
                    n4 = 1;
                    arrobject[0] = this.a[0].var_char_arr_a;
                }
                if (this.a[1] != null) {
                    int n5 = n4;
                    n4 = (byte)(n4 + 1);
                    arrobject[n5] = this.a[1].var_char_arr_a;
                }
                if (this.a[2] != null) {
                    int n6 = n4;
                    n4 = (byte)(n4 + 1);
                    arrobject[n6] = this.a[2].var_char_arr_a;
                }
                if (n4 < 2) {
                    Object[] arrobject2 = new Object[]{ax.var_z_a.loadByIndex(22), ax.var_z_a.loadByIndex(23)};
                    this.a(arrobject2);
                } else if (500 > ao2.var_g_a.var_int_a) {
                    Object[] arrobject3 = new Object[]{ax.var_z_a.loadByIndex(24)};
                    this.a(arrobject3);
                } else {
                    this.var_cb_b = new bo(this, ax.var_z_a.loadByIndex(25), arrobject, ax.var_z_a.loadByIndex(26), 500, (byte)20);
                }
            }
            return true;
        }
        return false;
    }

    public final void a(byte n2, byte by2) {
        cb cb2 = this.var_cb_b;
        super.a((byte)n2, by2);
        if (cb2 instanceof af && n2 == 2 && by2 == 0) {
            ao ao2 = n.ao_a();
            ad ad2 = ad.a(this.a[0], this.a[1], this.a[2]);
            if (ad2 != null) {
                if (this.a[0] != null) {
                    ao2.var_g_a.void_a(this.a[0], (byte)1);
                }
                if (this.a[1] != null) {
                    ao2.var_g_a.void_a(this.a[1], (byte)1);
                }
                if (this.a[2] != null) {
                    ao2.var_g_a.void_a(this.a[2], (byte)1);
                }
                if (ao2.var_g_a.a(ad2, 1)) {
                    byte[] arrby = new byte[]{ao2.var_g_a.byte_a(ad2.f, ad2.g)};
                    this.var_cb_b = new m(this, arrby, (byte)10, ax.var_z_a.loadByIndex(27));
                    this.a[0] = null;
                    this.a[1] = null;
                    this.a[2] = null;
                } else {
                    if (this.a[0] != null) {
                        ao2.var_g_a.a(this.a[0], 1);
                    }
                    if (this.a[1] != null) {
                        ao2.var_g_a.a(this.a[1], 1);
                    }
                    if (this.a[2] != null) {
                        ao2.var_g_a.a(this.a[2], 1);
                    }
                    Object[] arrobject = new Object[]{ax.var_z_a.loadByIndex(28), ax.var_z_a.loadByIndex(29)};
                    this.a(arrobject);
                }
            } else {
                if (this.a[0] != null) {
                    ao2.var_g_a.void_a(this.a[0], (byte)1);
                }
                if (this.a[1] != null) {
                    ao2.var_g_a.void_a(this.a[1], (byte)1);
                }
                if (this.a[2] != null) {
                    ao2.var_g_a.void_a(this.a[2], (byte)1);
                }
                this.a[0] = null;
                this.a[1] = null;
                this.a[2] = null;
                Object[] arrobject = new Object[]{ax.var_z_a.loadByIndex(30)};
                this.a(arrobject);
            }
            return;
        }
        if (cb2 instanceof m && (n2 == 0 || n2 == 1 || n2 == 2)) {
            ao ao3 = n.ao_a();
            ad ad3 = by2 >= 100 ? n.ao_a().ad_a(by2 - 100) : n.ao_a().var_g_a.a((int)by2);
            x.a(ad.c[ad3.f]);
            int n3 = 0;
            for (int i2 = 0; i2 < 3; ++i2) {
                if (n2 == i2 || this.a[i2] == null || this.a[i2].f != ad3.f || this.a[i2].g != ad3.g) continue;
                ++n3;
            }
            if (ao3.var_g_a.int_a(ad3.f, ad3.g) <= n3) {
                Object[] arrobject = new Object[]{ax.var_z_a.loadByIndex(31)};
                this.a(arrobject);
            } else {
                this.a[n2] = ad3;
            }
            return;
        }
        if (cb2 instanceof bo && n2 == 20) {
            Object[] arrobject = new Object[]{ax.var_z_a.loadByIndex(32)};
            this.a((byte)2, (byte)2, arrobject);
        }
    }

    public final void a(Graphics graphics, int n2, int n3) {
        graphics.setColor(0x3F1F3F);
        graphics.fillRect(n2, n3, 155, 170);
        cb.c(graphics, n2 + 2, n3 + 4, 151, 162);
        MyGameCanvas.a(graphics, ax.var_z_a.loadByIndex(14), n2 + 3, n3 - 2);
        cb.a(graphics, n2 + 4, n3 + 9, this.a[0], (byte)1, ax.var_z_a.loadByIndex(33), this.var_byte_b == 0);
        cb.a(graphics, n2 + 4, n3 + 9 + 36, this.a[1], (byte)2, ax.var_z_a.loadByIndex(33), this.var_byte_b == 1);
        cb.a(graphics, n2 + 4, n3 + 9 + 72, this.a[2], (byte)3, ax.var_z_a.loadByIndex(33), this.var_byte_b == 2);
        int n4 = bh.a(155, 80);
        cb.a(graphics, n2 + (155 - n4 >> 1), n3 + 138, n4, ax.var_z_a.loadByIndex(25), this.var_byte_b == 3);
    }
}

