package rpg;

/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 */
import javax.microedition.lcdui.Graphics;
import main.GameMIDlet;

public final class bf
extends cb {
    public static int var_int_a;
    public static int b;
    private boolean e;
    private byte[] h;
    private byte var_byte_c;
    private byte var_byte_d;
    private long var_long_a;
    private static int var_int_c = 5;
    private static int var_int_d = 5;
    private static bf var_bf_a;
    public static boolean var_boolean_c;
    public static boolean var_boolean_d;

    public static final bf bf_a() {
        return var_bf_a;
    }

    private bf(boolean bl2, byte[] arrby) {
        super(null, (byte)6);
        if (MIDletConfig.buySetupOnMenu) {
            this.var_byte_a = (byte)(this.var_byte_a + 1);
        }
        this.e = bl2;
        this.h = arrby;
        this.var_byte_c = 0;
        if (var_boolean_d || var_boolean_c) {
            ce.w();
            this.var_long_a = System.currentTimeMillis() + 5000L;
            if (var_boolean_d) {
                this.var_byte_d = (byte)2;
                var_boolean_d = false;
                return;
            }
            if (var_boolean_c) {
                this.var_byte_d = (byte)3;
                var_boolean_c = false;
            }
        }
    }

    public static final void a(boolean bl2, byte[] arrby) {
        var_int_a = MyGameCanvas.i - 77;
        b = MyGameCanvas.j - 85;
        var_bf_a = new bf(bl2, arrby);
        if (MIDletConfig.buySetupOnMenu) {
            var_int_c = 6;
            var_int_d = 5;
        }
    }

    public static final void void_d() {
        var_bf_a = null;
    }

    public final boolean a(int n2, int n3) {
        Object[] arrobject;
        if (this.var_long_a > 0L) {
            if (!MIDletConfig.isDemoVersion && MIDletConfig.buySetupOnExit) {
                if (n3 == 53) {
                    bh.void_a(MIDletConfig.urlApp);
                } else if (n3 == -8) {
                    GameMIDlet.instance.endApp();
                }
            }
            return true;
        }
        if (this.b(n2, n3)) {
            return true;
        }
        if (this.a(n2, n3, false)) {
            if (!this.e && this.var_byte_b == 1) {
                this.var_byte_b = n2 == 6 || n3 == 56 ? (byte)(this.var_byte_b + 1) : (byte)(this.var_byte_b - 1);
            }
            this.var_byte_c = 0;
            return true;
        }
        if (n3 == -8) {
            arrobject = new Object[]{bh.labelTextAreYouSure};
            this.a((byte)2, (byte)2, arrobject);
            this.var_byte_d = (byte)2;
        }
        if (n2 == 8 || n3 == 53) {
            switch (this.var_byte_b) {
                case 0: {
                    if (this.e) {
                        this.var_byte_d = 0;
                        arrobject = new Object[]{bh.getTextById(3929).toCharArray()};
                        this.a((byte)12, (byte)2, arrobject, bh.labelTextOk, bh.labelTextBack);
                        break;
                    }
                    this.var_cb_b = new c(this);
                    break;
                }
                case 1: {
                    this.var_cb_b = new a(this, this.h);
                    break;
                }
                case 2: {
                    this.var_cb_b = new be((cb)this, false);
                    break;
                }
                case 3: {
                    this.var_cb_b = new bt((cb)this, false);
                    break;
                }
                case 4: {
                    this.var_cb_b = new bl((cb)this, false);
                    break;
                }
                default: {
                    if (this.var_byte_b == var_int_c) {
                        arrobject = new Object[]{bh.labelTextAreYouSure};
                        this.var_byte_d = (byte)2;
                        this.a((byte)2, (byte)2, arrobject);
                        break;
                    }
                    if (this.var_byte_b != var_int_d) break;
                    arrobject = new Object[]{bh.getTextById(3918).toCharArray()};
                    this.var_byte_d = (byte)3;
                    this.a((byte)12, (byte)2, arrobject);
                }
            }
        }
        return false;
    }

    public final void a(byte by2, byte by3) {
        super.a(by2, by3);
        if (by2 == 2 || by2 == 12) {
            if (by3 == 0) {
                switch (this.var_byte_d) {
                    case 1: {
                        break;
                    }
                    case 2: {
                        if (MIDletConfig.isDemoVersion) {
                            Object[] arrobject = new Object[]{bh.getTextById(3919).toCharArray()};
                            this.var_byte_d = (byte)4;
                            this.a((byte)12, (byte)2, arrobject, bh.labelTextBuy, bh.labelTextExit);
                            break;
                        }
                        ce.w();
                        this.var_long_a = System.currentTimeMillis() + 5000L;
                        break;
                    }
                    case 3: 
                    case 4: {
                        bh.void_a(MIDletConfig.urlApp);
                        break;
                    }
                    case 0: {
                        this.var_cb_b = new c(this);
                    }
                }
                return;
            }
            switch (this.var_byte_d) {
                case 4: {
                    ce.w();
                    this.var_long_a = System.currentTimeMillis() + 5000L;
                }
            }
        }
    }

    public final void a(Graphics graphics) {
        if (this.var_long_a > 0L) {
            graphics.setColor(0xFFFFFF);
            graphics.fillRect(0, 0, MyGameCanvas.g, MyGameCanvas.h);
            graphics.drawImage(ce.var_javax_microedition_lcdui_Image_arr_i[4], MyGameCanvas.i, as.var_int_d, 3);
            graphics.setColor(0);
            bh.void_a(graphics, MyGameCanvas.g >> 1, MyGameCanvas.h - 23, bh.labelTextAppUrl, 1);
            bh.void_a(graphics, MyGameCanvas.g >> 1, 10, BabbleText.instance.getTextById(3941).toCharArray(), 1);
            if (!MIDletConfig.isDemoVersion && MIDletConfig.buySetupOnExit) {
                bh.a(graphics, MIDletConfig.java_lang_String_a().toCharArray(), bh.labelTextExit);
            }
            if (System.currentTimeMillis() > this.var_long_a) {
                GameMIDlet.instance.endApp();
            }
            return;
        }
        this.b(graphics, var_int_a, b);
        if (this.var_byte_c < 2 && this.var_cb_b == null) {
            this.var_boolean_a = true;
            this.var_byte_c = (byte)(this.var_byte_c + 1);
        }
    }

    public final void a(Graphics graphics, int n2, int n3) {
        graphics.setColor(0x3F1F3F);
        graphics.fillRect(0, 0, MyGameCanvas.g, MyGameCanvas.h);
        bf.b(graphics, n2, (n3 += 13) - 12, 4);
        int n4 = 18;
        if (this.var_byte_c == 0) {
            n4 = 14;
        } else if (this.var_byte_c == 1) {
            n4 = 16;
        }
        graphics.drawImage(ce.var_javax_microedition_lcdui_Image_arr_l[n4], n2 + (155 - ce.var_javax_microedition_lcdui_Image_arr_l[n4].getWidth()) >> 1, n3 + 12 + this.var_byte_b * 16, 20);
        for (int i2 = 0; i2 < this.var_byte_a; ++i2) {
            int n5 = n3 + 14 + i2 * 16;
            n4 = (byte)(i2 * 2);
            if (this.var_byte_b != i2 || this.var_byte_c < 2) {
                n4 = (byte)(n4 + 1);
            }
            bh.a(graphics, n4, n2 + 155 >> 1, n5);
        }
        bh.a(graphics, bh.labelTextOk, bh.labelTextExit);
    }

    public static final void c(Graphics graphics, int n2, int n3) {
        int n4;
        boolean bl2 = false;
        int n5 = n2;
        graphics.drawImage(ce.var_javax_microedition_lcdui_Image_arr_l[0], n5, n3, 20);
        graphics.drawImage(ce.var_javax_microedition_lcdui_Image_arr_l[1], n5 += 12, n3, 20);
        for (n4 = 0; n4 < 3; ++n4) {
            graphics.drawImage(ce.var_javax_microedition_lcdui_Image_arr_l[1], n5 += 32, n3, 20);
        }
        graphics.drawImage(ce.var_javax_microedition_lcdui_Image_arr_l[2], n5 += 32, n3, 20);
        n5 = n2;
        graphics.drawImage(ce.var_javax_microedition_lcdui_Image_arr_l[11], n5, n3 + 12, 20);
        graphics.drawImage(ce.var_javax_microedition_lcdui_Image_arr_l[12], n5 += 12, n3 + 12, 20);
        for (n4 = 0; n4 < 3; ++n4) {
            graphics.drawImage(ce.var_javax_microedition_lcdui_Image_arr_l[12], n5 += 32, n3 + 12, 20);
        }
        graphics.drawImage(ce.var_javax_microedition_lcdui_Image_arr_l[13], n5 += 32, n3 + 12, 20);
    }

    public static final void b(Graphics graphics, int n2, int n3, int n4) {
        int n5;
        int n6;
        boolean bl2 = false;
        ++n4;
        int n7 = n2;
        graphics.drawImage(ce.var_javax_microedition_lcdui_Image_arr_l[3], n7, n3, 20);
        graphics.drawImage(ce.var_javax_microedition_lcdui_Image_arr_l[4], n7 += 12, n3, 20);
        for (n6 = 0; n6 < 3; ++n6) {
            graphics.drawImage(ce.var_javax_microedition_lcdui_Image_arr_l[4], n7 += 32, n3, 20);
        }
        graphics.drawImage(ce.var_javax_microedition_lcdui_Image_arr_l[5], n7 += 32, n3, 20);
        n7 = n2;
        graphics.drawImage(ce.var_javax_microedition_lcdui_Image_arr_l[6], n7, n3 + 12, 20);
        graphics.drawImage(ce.var_javax_microedition_lcdui_Image_arr_l[7], n7 += 12, n3 + 12, 20);
        for (n6 = 0; n6 < 3; ++n6) {
            graphics.drawImage(ce.var_javax_microedition_lcdui_Image_arr_l[7], n7 += 32, n3 + 12, 20);
        }
        graphics.drawImage(ce.var_javax_microedition_lcdui_Image_arr_l[8], n7 += 32, n3 + 12, 20);
        n7 = n2;
        for (n5 = 0; n5 < n4; ++n5) {
            graphics.drawImage(ce.var_javax_microedition_lcdui_Image_arr_l[9], n7, n3 + 36 + 24 * n5, 20);
            graphics.drawImage(ce.var_javax_microedition_lcdui_Image_arr_l[10], n7 + 12 + 128, n3 + 36 + 24 * n5, 20);
        }
        graphics.setColor(16763769);
        graphics.fillRect(n7 + 12, n3 + 36, 128, 24 * n4);
        n7 = n2;
        graphics.drawImage(ce.var_javax_microedition_lcdui_Image_arr_l[11], n7, n3 + 36 + 24 * n4, 20);
        graphics.drawImage(ce.var_javax_microedition_lcdui_Image_arr_l[12], n7 += 12, n3 + 36 + 24 * n4, 20);
        for (n5 = 0; n5 < 3; ++n5) {
            graphics.drawImage(ce.var_javax_microedition_lcdui_Image_arr_l[12], n7 += 32, n3 + 36 + 24 * n4, 20);
        }
        graphics.drawImage(ce.var_javax_microedition_lcdui_Image_arr_l[13], n7 += 32, n3 + 36 + 24 * n4, 20);
    }

//    public static {
//        var_int_c = 5;
//        var_int_d = 5;
//    }
}

