package rpg;

/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 */
import javax.microedition.lcdui.Graphics;

public final class at
extends cb {
    private e var_e_a;
    private int var_int_a;
    private byte var_byte_c;
    private byte d;
    private boolean var_boolean_c;

    public at(cb cb2) {
        super(cb2, (byte)2);
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
                byte[] arrby = ao2.var_g_a.a(false, (byte)0);
                if (arrby.length > 0) {
                    this.var_cb_b = new m(this, arrby, this.var_byte_b, aa.var_z_a.loadByIndex(3));
                } else {
                    this.a(new Object[]{BabbleText.instance.getTextById(3936).toCharArray()});
                }
            } else if (this.var_byte_b == 1) {
                int n4 = ao2.var_g_a.int_a((byte)11, (byte)0);
                byte by2 = ao2.var_g_a.byte_a((byte)11, (byte)0);
                if (this.var_e_a == null) {
                    this.a(new Object[]{aa.var_z_a.loadByIndex(3)});
                } else if (this.var_e_a.e >= this.var_e_a.d) {
                    this.a(new Object[]{aa.var_z_a.loadByIndex(6), aa.var_z_a.loadByIndex(7)});
                } else if (by2 < 0 || n4 < this.var_byte_c) {
                    this.a(new Object[]{aa.var_z_a.loadByIndex(5)});
                } else if (ao2.var_g_a.var_int_a < this.var_int_a) {
                    this.a(new Object[]{aa.var_z_a.loadByIndex(8)});
                } else {
                    this.a((byte)2, (byte)2, new Object[]{aa.var_z_a.loadByIndex(9)});
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
            x.assertValue(ao2.var_g_a.byte_a((byte)11, (byte)0) != -1);
            ao2.var_g_a.void_a((byte)11, (byte)0, this.var_byte_c);
            ao2.var_g_a.var_int_a -= this.var_int_a;
            if (100 * (this.var_e_a.d - this.var_e_a.e) / this.var_e_a.d + 30 < h.a(1, 100)) {
                this.d = (byte)2;
                this.var_boolean_c = false;
            } else {
                this.d = (byte)2;
                this.var_boolean_c = true;
            }
            return;
        }
        if (cb2 instanceof m && by2 == 0) {
            ad ad2 = by3 >= 100 ? n.ao_a().ad_a(by3 - 100) : n.ao_a().var_g_a.a((int)by3);
            x.assertValue(ad2 instanceof e);
            e e2 = (e)ad2;
            if (!e2.b) {
                this.a(new Object[]{aa.var_z_a.loadByIndex(11), aa.var_z_a.loadByIndex(12)});
                return;
            }
            this.var_e_a = (e)ad2;
            this.var_int_a = this.var_e_a.e * 100;
            this.var_byte_c = (byte)(this.var_e_a.e + 1);
        }
    }

    public final void a(Graphics graphics, int n2, int n3) {
//        Object[] arrobject;
        ao ao2 = n.ao_a();
        graphics.setColor(0x3F1F3F);
        graphics.fillRect(n2, n3, 155, 170);
        cb.c(graphics, n2 + 2, n3 + 4, 151, 162);
        MyGameCanvas.a(graphics, aa.var_z_a.loadByIndex(13), n2 + 3, n3 - 2);
        cb.b(graphics, n2 + 3, n3 + 7, 149, 17, 0x9F7F7F);
        graphics.setColor(0xFFFFFF);
        bh.int_a(graphics, n2 + 6, n3 + 11, aa.var_z_a.loadByIndex(14), 1);
        cb.a(graphics, n2 + 4, n3 + 30, this.var_e_a, (byte)1, aa.var_z_a.loadByIndex(15), this.var_byte_b == 0);
        cb.a(graphics, n2 + 155 - 8, n3 + 65, ao2.var_g_a.var_int_a);
        cb.b(graphics, n2 + 4, n3 + 73, 147, 38, 0x9F7F7F);
        graphics.setColor(0xFFFFFF);
        bh.int_a(graphics, n2 + 8, n3 + 80, aa.var_z_a.loadByIndex(16), 1);
        if (this.var_e_a != null) {
            cb.a(graphics, n2 + 155 - 8, n3 + 80, this.var_int_a);
            char[] arrobject = h.a(aa.var_z_a.loadByIndex(17), (" : " + this.var_byte_c + "\uac1c").toCharArray());
            bh.int_a(graphics, n2 + 8, n3 + 93, arrobject, 1);
        }
        if (this.d == 2) {
            this.d = 1;
            int n4 = MyGameCanvas.i - 55;
            int n5 = MyGameCanvas.j - 11;
            cb.a(graphics, n4, n5, 110, 22);
            cb.b(graphics, n4, n5, 110, 22);
            graphics.setColor(0xFFFFFF);
            bh.int_a(graphics, n4 + 5, n5 + 5, aa.var_z_a.loadByIndex(28), 1);
            this.var_boolean_a = true;
        } else if (this.d == 1) {
            this.d = 0;
            try {
                Thread.sleep(500L);
                if (this.var_boolean_c) {
                    Thread.sleep(1000L);
                    this.var_e_a.e = (byte)(this.var_e_a.e + 1);
                    byte[] arrobject = new byte[]{ao2.byte_a(this.var_e_a)};
                    this.var_cb_b = new m(this, (byte[])arrobject, (byte)10, aa.var_z_a.loadByIndex(10));
                    this.var_int_a = this.var_e_a.e * 100;
                    this.var_byte_c = (byte)(this.var_e_a.e + 1);
                } else {
                    n.ao_a().var_g_a.void_a((ad)this.var_e_a, (byte)1);
                    this.var_e_a = null;
                    n.o();
                    this.a(new Object[]{aa.var_z_a.loadByIndex(26), aa.var_z_a.loadByIndex(29)});
                }
            }
            catch (Exception exception) {} catch (Throwable ex) {
                ex.printStackTrace();
            }
        }
        int n6 = bh.a(155, 80);
        cb.a(graphics, n2 + (155 - n6 >> 1), n3 + 138, n6, aa.var_z_a.loadByIndex(18), this.var_byte_b == 1);
    }
}

