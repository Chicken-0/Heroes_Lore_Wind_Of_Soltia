package rpg;

/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 */
import javax.microedition.lcdui.Graphics;

public final class ap
extends cb {
    private t var_t_a;
    private ad var_ad_a;

    public ap(cb cb2) {
        super(cb2, (byte)3);
    }

    public final boolean a(int n2, int n3) {
        if (this.b(n2, n3)) {
            return true;
        }
        if (this.c(n2, n3)) {
            return true;
        }
        if (n3 == 53 || n2 == 8) {
            ao ao2 = n.ao_a();
            if (this.var_byte_b == 0) {
                byte[] arrby = ao2.a(true, (byte)1);
                x.a(arrby.length > 0);
                this.var_cb_b = new m(this, arrby, this.var_byte_b, ax.var_z_a.a(3));
            } else if (this.var_byte_b == 1) {
                byte[] arrby = ao2.var_g_a.a((byte)17);
                if (arrby.length > 0) {
                    this.var_cb_b = new m(this, arrby, this.var_byte_b, ax.var_z_a.a(4));
                } else {
                    Object[] arrobject = new Object[]{ax.var_z_a.a(5)};
                    this.a(arrobject);
                }
            } else if (this.var_byte_b == 2) {
                if (this.var_t_a == null) {
                    Object[] arrobject = new Object[]{ax.var_z_a.a(6)};
                    this.a(arrobject);
                } else if (this.var_ad_a == null) {
                    Object[] arrobject = new Object[]{ax.var_z_a.a(7)};
                    this.a(arrobject);
                } else if (ao2.var_g_a.var_int_a < 500) {
                    Object[] arrobject = new Object[]{ax.var_z_a.a(8)};
                    this.a(arrobject);
                } else {
                    Object[] arrobject = new Object[]{ax.var_z_a.a(9)};
                    this.a((byte)2, (byte)2, arrobject);
                }
            }
            return true;
        }
        return false;
    }

    public final void a(byte by2, byte by3) {
        cb cb2 = this.var_cb_b;
        super.a(by2, by3);
        if (cb2 instanceof af && by2 == 2 && by3 == 0) {
            ao ao2 = n.ao_a();
            this.var_t_a.c = this.var_ad_a.g;
            ao2.var_g_a.var_int_a -= 500;
            ao2.var_g_a.void_a(this.var_ad_a, (byte)1);
            byte[] arrby = new byte[]{ao2.byte_a(this.var_t_a)};
            this.var_cb_b = new m(this, arrby, (byte)10, ax.var_z_a.a(10));
            this.var_t_a = null;
            this.var_ad_a = null;
            return;
        }
        if (cb2 instanceof m && (by2 == 0 || by2 == 1)) {
            ad ad2 = by3 >= 100 ? n.ao_a().ad_a(by3 - 100) : n.ao_a().var_g_a.a((int)by3);
            if (by2 == 0) {
                x.a(ad2 instanceof t);
                t t2 = (t)ad2;
                if (!t2.b) {
                    Object[] arrobject = new Object[]{ax.var_z_a.a(11), ax.var_z_a.a(13)};
                    this.a(arrobject);
                } else if (t2.c != -1) {
                    Object[] arrobject = new Object[]{ax.var_z_a.a(12), ax.var_z_a.a(13)};
                    this.a(arrobject);
                } else {
                    this.var_t_a = (t)ad2;
                }
                return;
            }
            x.a(ad2.f == 17);
            this.var_ad_a = ad2;
        }
    }

    public final void a(Graphics graphics, int n2, int n3) {
        int n4;
        graphics.setColor(0x3F1F3F);
        graphics.fillRect(n2, n3, 155, 170);
        cb.c(graphics, n2 + 2, n3 + 4, 151, 162);
        r.a(graphics, ax.var_z_a.a(14), n2 + 3, n3 - 2);
        cb.a(graphics, n2 + 4, n3 + 9, this.var_t_a, (byte)1, ax.var_z_a.a(15), this.var_byte_b == 0);
        cb.a(graphics, n2 + 4, n3 + 9 + 36, this.var_ad_a, (byte)2, ax.var_z_a.a(16), this.var_byte_b == 1);
        cb.b(graphics, n2 + 4, n3 + 9 + 72, 147, 31, 12558207);
        if (this.var_t_a != null && this.var_ad_a != null) {
            graphics.setColor(0xFFFFFF);
            n4 = n2 + 6;
            n4 += 2 + bh.int_a(graphics, n4, n3 + 9 + 72 + 4, t.a.a(this.var_ad_a.g), 1);
            n4 += 2 + bh.int_a(graphics, n4, n3 + 9 + 72 + 4, ax.var_z_a.a(17), 1);
            bh.int_a(graphics, n4, n3 + 9 + 72 + 4, ax.var_z_a.a(18), 1);
            cb.a(graphics, n2 + 155 - 10, n3 + 9 + 72 + 5, 500);
            cb.a(graphics, n2 + 155 - 10, n3 + 9 + 72 + 20, n.ao_a().var_g_a.var_int_a);
        }
        n4 = bh.a(155, 80);
        cb.a(graphics, n2 + (155 - n4 >> 1), n3 + 138, n4, ax.var_z_a.a(19), this.var_byte_b == 2);
    }
}

