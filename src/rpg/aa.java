package rpg;

/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 */
import java.io.IOException;
import javax.microedition.lcdui.Graphics;

public final class aa
extends cb {
    public static int var_int_a;
    public static int b;
    public static TableDefineTextFile var_z_a;
    private static aa var_aa_a;

    public static final aa aa_a() {
        if (var_aa_a == null) {
            var_aa_a = new aa();
            var_int_a = MyGameCanvas.i - 77;
            b = MyGameCanvas.j - 85;
        }
        return var_aa_a;
    }

    public aa() {
        super(null, (byte)0);
    }

    public final void void_d() {
        try {
            var_z_a = new TableDefineTextFile("/sgui/blak");
        }
        catch (IOException iOException) {}
        this.a((byte)8, (byte)2, new Object[]{var_z_a.loadByIndex(0), var_z_a.loadByIndex(1), var_z_a.loadByIndex(2)});
    }

    public final void e() {
        var_aa_a = null;
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
            this.var_cb_b = new at(this);
            this.var_cb_b.a(new Object[]{var_z_a.loadByIndex(30), var_z_a.loadByIndex(31), var_z_a.loadByIndex(32), var_z_a.loadByIndex(33)});
            return;
        }
        if (by2 == 8 && by3 == 1) {
            this.var_cb_b = new ch(this);
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

