package rpg;

/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 */
import javax.microedition.lcdui.Graphics;

public final class d
extends cb {
    private byte c = 0;

    public d(cb cb2) {
        super(cb2, (byte)4);
    }

    public final synchronized boolean a(int n2, int n3) {
        if (this.b(n2, n3)) {
            return true;
        }
        if (this.c != 0) {
            return true;
        }
        if (this.a(n2, n3, false)) {
            return true;
        }
        if (n3 == 53 || n2 == 8) {
            switch (this.var_byte_b) {
                case 0: {
                    if (MIDletConfig.isDemoVersion) {
                        this.void_d();
                        break;
                    }
                    ae ae2 = n.var_ae_a;
                    if (ae2.var_boolean_a) {
                        this.a(new Object[]{ai.var_z_a.loadByIndex(51), ai.var_z_a.loadByIndex(52)});
                        break;
                    }
                    this.c = (byte)2;
                    this.void_b();
                    break;
                }
                case 1: {
                    this.var_cb_b = new bt((cb)this, true);
                    break;
                }
                case 2: {
                    this.var_cb_b = new be((cb)this, true);
                    break;
                }
                case 3: {
                    this.void_d();
                }
            }
            return true;
        }
        return false;
    }

    public final void void_d() {
        if (MIDletConfig.isDemoVersion) {
            Object[] arrobject = new Object[]{bh.getTextById(3919).toCharArray()};
            this.a((byte)12, (byte)2, arrobject, bh.labelTextBuy, bh.labelTextExit);
            return;
        }
        Object[] arrobject = new Object[]{bh.labelTextAreYouSure};
        this.a((byte)2, (byte)2, arrobject);
    }

    public final void a(byte by2, byte by3) {
        super.a(by2, by3);
        if (by2 == 12 || by2 == 2) {
            if (MIDletConfig.isDemoVersion) {
                if (by3 == 0) {
                    bh.void_a(MIDletConfig.urlApp);
                    return;
                }
                n.a((byte)14, (byte)1);
                bw.f();
                bf.var_boolean_d = true;
                return;
            }
            if (by3 == 0) {
                n.a((byte)14, (byte)1);
                bw.f();
            }
        }
    }

    public final void a(Graphics graphics, int n2, int n3) {
        MyGameCanvas.a(graphics, ai.var_z_a.loadByIndex(41), n2 + 5, n3 += 15);
        boolean bl2 = false;
        n2 = MyGameCanvas.g - 108 >> 1;
        cb.a(graphics, n2, n3 + 15, 108, ai.var_z_a.loadByIndex(42), this.var_byte_b == 0);
        cb.a(graphics, n2, n3 + 37, 108, ai.var_z_a.loadByIndex(43), this.var_byte_b == 1);
        cb.a(graphics, n2, n3 + 59, 108, ai.var_z_a.loadByIndex(44), this.var_byte_b == 2);
        cb.a(graphics, n2, n3 + 81, 108, ai.var_z_a.loadByIndex(45), this.var_byte_b == 3);
        if (this.c == 2) {
            this.c = 1;
            int n4 = MyGameCanvas.i - 55;
            int n5 = MyGameCanvas.j - 11;
            cb.a(graphics, n4, n5, 110, 22);
            cb.b(graphics, n4, n5, 110, 22);
            graphics.setColor(0xFFFFFF);
            bh.int_a(graphics, n4 + 5, n5 + 5, ai.var_z_a.loadByIndex(53), 1);
            this.void_b();
            return;
        }
        if (this.c == 1) {
            this.c = 0;
            try {
                n.o();
                this.a(new Object[]{ai.var_z_a.loadByIndex(46)});
                return;
            }
            catch (Exception exception) {
                this.a(new Object[]{ai.var_z_a.loadByIndex(47), ai.var_z_a.loadByIndex(48)});
            } catch (Throwable ex) {
                ex.printStackTrace();
            }
        }
    }
}

