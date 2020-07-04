package rpg;

/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 */
import java.io.IOException;
import javax.microedition.lcdui.Graphics;

public final class ax
extends cb {
    public static int var_int_a;
    public static int b;
    public static TableDefineTextFile var_z_a;
    private static ax var_ax_a;

    public static final ax ax_a() {
        if (var_ax_a == null) {
            var_ax_a = new ax();
            var_int_a = MyGameCanvas.i - 77;
            b = MyGameCanvas.j - 85;
        }
        return var_ax_a;
    }

    public ax() {
        super(null, (byte)0);
    }

    public final void void_d() {
        Object[] arrobject;
        try {
            var_z_a = new TableDefineTextFile("/sgui/refi");
        }
        catch (IOException arrobject2) {
            arrobject2.printStackTrace();
        }
        arrobject = new Object[]{var_z_a.loadByIndex(0), var_z_a.loadByIndex(1), var_z_a.loadByIndex(2)};
        this.a((byte)8, (byte)2, arrobject);
    }

    public final void e() {
        var_ax_a = null;
        var_z_a = null;
        this.var_cb_b = null;
        n.void_a(2);
        bs.var_as_a.b();
        System.gc();
    }

    public final boolean a(int n2, int n3) {
        if (this.b(n2, n3)) {
            return true;
        }
        if (n3 == -8) {
            this.e();
        }
        return false;
    }

    public final void a(byte by2, byte by3) {
        super.a(by2, by3);
        if (by2 == 8 && by3 == 0) {
            this.var_cb_b = new ap(this);
            return;
        }
        if (by2 == 8 && by3 == 1) {
            this.var_cb_b = new k(this);
            return;
        }
        this.e();
    }

    public final void a(Graphics graphics) {
        this.b(graphics, var_int_a, b);
    }

    public final void a(Graphics graphics, int n2, int n3) {
        bh.a(graphics);
        bh.a(graphics, bh.labelTextOk, bh.labelTextBack);
    }
}

