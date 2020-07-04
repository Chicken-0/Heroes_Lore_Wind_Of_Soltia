package rpg;

/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 */
import javax.microedition.lcdui.Graphics;

public final class bt
extends cb {
    private boolean c;
    private char[][] a;

    public bt(cb cb2, boolean bl2) {
        super(cb2, (byte)4);
        if (MIDletConfig.boolean_a() || MIDletConfig.boolean_b()) {
            this.var_byte_a = (byte)(this.var_byte_a + 1);
        }
        this.c = bl2;
        bh.fontSmallBlack.activeControlChar = false;
        bh.fontSmallWhite.activeControlChar = false;
        bh.fontSmallOrange.activeControlChar = false;
        this.a = new char[this.var_byte_a][];
        for (byte by2 = 0; by2 < this.var_byte_a; by2 = (byte)(by2 + 1)) {
            this.a[by2] = by2 == 4 ? MIDletConfig.java_lang_String_a().toCharArray() : ce.var_z_e.loadByIndex(by2);
        }
    }

    public final boolean a(int n2, int n3) {
        if (this.b(n2, n3)) {
            return true;
        }
        if (this.c(n2, n3)) {
            return true;
        }
        if (n3 == 53 || n2 == 8) {
            byte by2 = (byte)(this.var_byte_b + 6);
            if (x.activeDemoVersion && this.var_byte_b == 5) {
                by2 = (byte)(by2 + 1);
            }
            char[] arrc = ce.var_z_e.loadByIndex(by2);
            if (this.var_byte_b == this.var_byte_a - 1) {
                if (MIDletConfig.boolean_a()) {
                    String string = BabbleText.instance.getTextById(3930);
                    arrc = string.toCharArray();
                } else if (MIDletConfig.boolean_b()) {
                    String string = BabbleText.instance.getTextById(3934);
                    string = bh.a(string, "XXX", new String(MIDletConfig.java_lang_String_a()));
                    arrc = string.toCharArray();
                }
            }
            this.var_cb_b = new bx(this, arrc, this.c, this.a[this.var_byte_b]);
            return true;
        }
        if (n3 == -8) {
            this.var_cb_a.a((byte)-1, (byte)-1);
            bh.fontSmallBlack.activeControlChar = true;
            bh.fontSmallWhite.activeControlChar = true;
            bh.fontSmallOrange.activeControlChar = true;
            return true;
        }
        return true;
    }

    public final void a(Graphics graphics, int n2, int n3) {
        int n4 = 0xFFFFFF;
        int n5 = 0;
        if (this.c) {
            cb.a(graphics, n2 += 6, n3 += 25, 143, 139);
            cb.b(graphics, n2, n3, 143, 139);
            n5 = 10452799;
            n3 += 8;
        } else {
            graphics.setColor(0x3F1F3F);
            graphics.fillRect(0, 0, MyGameCanvas.g, MyGameCanvas.h);
            bf.c(graphics, n2, n3);
            bf.b(graphics, n2, n3 + 24, 3);
            bh.a(graphics, 7, MyGameCanvas.g >> 1, n3 + 5);
            n3 += 41;
        }
        n3 += 10;
        bh.setFontDefault(true);
        for (byte by2 = 0; by2 < this.var_byte_a; by2 = (byte)(by2 + 1)) {
            if (this.var_byte_b == by2) {
                graphics.setColor(n4);
            } else {
                graphics.setColor(n5);
            }
            bh.void_a(graphics, MyGameCanvas.g >> 1, n3 + by2 * 15, this.a[by2], 1);
        }
        bh.setFontDefault(false);
        if (!this.c) {
            bh.a(graphics, bh.labelTextOk, bh.labelTextBack);
        }
    }
}

