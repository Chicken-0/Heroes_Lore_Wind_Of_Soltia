package rpg;

/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 *  javax.microedition.lcdui.Image
 */
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public final class aj
extends ck {
    public Image var_javax_microedition_lcdui_Image_a;
    private short var_short_a;
    private short b;
    private short e;

    public aj(short posX, short posY, byte by2, byte by3, Image image) {
        super(posX, posY, by2, by3);
        this.var_javax_microedition_lcdui_Image_a = image;
        if (image != null) {
            this.var_short_a = (short)(-(image.getWidth() >> 1));
            this.b = (short)(as.var_int_a + (image.getWidth() >> 1));
            this.e = (short)(as.b + image.getHeight());
        }
    }

    public final void a(Graphics graphics, int n2, int n3) {
        int n4 = n2 + this.posX + this.var_byte_c;
        int n5 = n3 + this.posY + this.var_byte_d;
        if (n4 < this.var_short_a || n4 > this.b || n5 < 0 || n5 > this.e) {
            return;
        }
        graphics.drawImage(this.var_javax_microedition_lcdui_Image_a, n4, n5, 33);
    }
}

