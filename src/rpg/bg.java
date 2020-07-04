package rpg;

/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 */
import java.io.IOException;
import javax.microedition.lcdui.Graphics;
import main.GameMIDlet;

public final class bg
extends MyGameCanvas
implements Runnable {
    private final int LANG_CODE_IDX_DEFAULT = 1;
    private byte var_byte_a;
    private byte var_byte_b;
    private int var_int_a;
    private short var_short_a;
    private short var_short_b;
    private byte var_byte_c;
    private short var_short_c;
    private short var_short_d;
    private byte var_byte_d;
    private boolean var_boolean_c = false;
    public static bg var_bg_a;

    public bg() {
//        new Object();
        this.var_byte_b = 0;
    }

    public final void keyPressed(int n2) {
        this.getGameAction(n2);
        if (bs.var_bs_a == null || bs.var_bs_a.e) {
            return;
        }
        switch (this.var_byte_a) {
            case 0: {
                return;
            }
            case 10: {
                this.c();
                return;
            }
            case 1: {
                bw.f();
                ce.x();
                ce.z();
                this.a(false, (byte)1);
                return;
            }
            case 2: {
                this.var_byte_a = (byte)3;
                this.var_int_a = 0;
                bs.var_bs_a.g();
                var_bg_a = this;
                new Thread(var_bg_a).start();
                return;
            }
            case 6: {
                GameMIDlet.instance.destroyApp(true);
            }
        }
    }

    public final void run() {
        switch (this.var_byte_a) {
            case 0: {
                switch (this.var_byte_b) {
                    case 1: {
                        ce.loadGlobalImage();
                        MyGameCanvas.k();
                        try {
                            ad.var_z_b = new TableDefineTextFile("/itm/itmtp");
                            MyGameCanvas.k();
                            t.a = new TableDefineTextFile("/itm/itmatt");
                            MyGameCanvas.k();
                        }
                        catch (IOException iOException) {}
                        ce.w();
                        ce.y();
                        try {
                            if (RecordStoreData.isRecordExists("/c")) {
                                bs.var_bs_a.j();
                            } else {
                                if (!RecordStoreData.isRecordExists("/c")) {
                                    if (RecordStoreData.isRecordExists(n.var_java_lang_String_arr_a[0])) {
                                        RecordStoreData.deleteRecord(n.var_java_lang_String_arr_a[0]);
                                    }
                                    if (RecordStoreData.isRecordExists(n.var_java_lang_String_arr_a[1])) {
                                        RecordStoreData.deleteRecord(n.var_java_lang_String_arr_a[1]);
                                    }
                                    if (RecordStoreData.isRecordExists(n.var_java_lang_String_arr_a[2])) {
                                        RecordStoreData.deleteRecord(n.var_java_lang_String_arr_a[2]);
                                    }
                                    if (RecordStoreData.isRecordExists("/o")) {
                                        RecordStoreData.deleteRecord("/o");
                                    }
                                }
                                bs.var_bs_a.i();
                            }
                        }
                        catch (Exception exception) {}
                        this.b();
                        MyGameCanvas.k();
                        return;
                    }
                    case 2: {
                        bu.e();
                        ce.A();
                    try {
                        bs.var_bs_a.d();
                    } catch (Throwable ex) {
                        ex.printStackTrace();
                    }
                        this.var_byte_a = (byte)-1;
                        this.var_byte_b = 0;
                    }
                }
            }
        }
    }

    public final void paint(Graphics graphics) {
        this.void_a(graphics.getClipHeight());
        switch (this.var_byte_a) {
            case 0: {
                break;
            }
            case 10: {
                graphics.setColor(0xFFFFFF);
                graphics.fillRect(0, 0, MyGameCanvas.g, MyGameCanvas.h);
                if (this.var_byte_c > 40) {
                    this.var_short_a = (short)(this.var_short_a * 2);
                }
                graphics.drawImage(ce.var_javax_microedition_lcdui_Image_arr_i[4], MyGameCanvas.i, this.var_int_a - this.var_short_a, 3);
                if (this.var_byte_c == 0) {
                    if (this.var_int_a < MyGameCanvas.j - 1) {
                        this.var_int_a += (MyGameCanvas.j - this.var_int_a) / 2;
                    } else {
                        this.var_byte_c = 1;
                    }
                } else {
                    switch (this.var_byte_c) {
                        case 1: 
                        case 3: {
                            this.var_int_a = MyGameCanvas.j - 1;
                            break;
                        }
                        case 2: 
                        case 4: {
                            this.var_int_a = MyGameCanvas.j;
                        }
                    }
                    this.var_byte_c = (byte)(this.var_byte_c + 1);
                }
                if (this.var_short_a <= MyGameCanvas.h) break;
                this.c();
                break;
            }
            case 1: {
                graphics.setColor(0xFFFFFF);
                graphics.fillRect(0, 0, MyGameCanvas.g, MyGameCanvas.h);
                int n2 = MyGameCanvas.j - 68;
                int n3 = MyGameCanvas.i - 60;
                graphics.drawImage(ce.var_javax_microedition_lcdui_Image_arr_j[2], n3 + 0, n2 + 25, 20);
                graphics.drawImage(ce.var_javax_microedition_lcdui_Image_arr_j[3], n3 + 52, n2 + 25, 20);
                graphics.drawImage(ce.var_javax_microedition_lcdui_Image_arr_j[4], n3 + 93, n2 + 2, 20);
                boolean bl2 = false;
                graphics.setColor(0x3F1F3F);
                if (bh.labelTextVersion != null) {
                    bh.int_a(graphics, MyGameCanvas.g - 2 - bh.getTextWidth(bh.labelTextVersion), MyGameCanvas.h - 31, bh.labelTextVersion, 0);
                }
                graphics.drawImage(ce.var_javax_microedition_lcdui_Image_arr_k[this.var_byte_c < 4 ? this.var_byte_c : 8 - this.var_byte_c], (int)this.var_short_a, (int)this.var_short_b, 33);
                graphics.drawImage(ce.var_javax_microedition_lcdui_Image_arr_k[(this.var_byte_d < 4 ? this.var_byte_d : 8 - this.var_byte_d) + 5], (int)this.var_short_c, (int)this.var_short_d, 33);
                this.var_short_a = (short)(this.var_short_a + 10 * (this.var_byte_c < 4 ? 1 : -1));
                this.var_short_b = (short)(this.var_short_b + rpg.h.a(-1, 4));
                this.var_short_c = (short)(this.var_short_c + 10 * (this.var_byte_d < 4 ? -1 : 1));
                this.var_short_d = (short)(this.var_short_d + rpg.h.a(-1, 4));
                this.var_byte_c = (byte)(this.var_byte_c + 1);
                this.var_byte_d = (byte)(this.var_byte_d + 1);
                if (this.var_byte_c > 7) {
                    this.var_byte_c = 0;
                }
                if (this.var_byte_d > 7) {
                    this.var_byte_d = 0;
                }
                if (this.var_short_b > MyGameCanvas.h + 10) {
                    this.var_short_a = (short)rpg.h.a(10, MyGameCanvas.g / 2 - 10);
                    this.var_short_b = (short)(-10 * rpg.h.a(0, 4));
                    this.var_byte_c = (byte)rpg.h.a(0, 7);
                }
                if (this.var_short_d > MyGameCanvas.h + 10) {
                    this.var_short_c = (short)rpg.h.a(MyGameCanvas.g / 2 + 10, MyGameCanvas.g - 10);
                    this.var_short_d = (short)(-10 * rpg.h.a(3, 7));
                    this.var_byte_d = (byte)rpg.h.a(0, 7);
                }
                if (this.var_int_a % 4 < 2) {
                    graphics.setColor(0);
                    bh.void_a(graphics, MyGameCanvas.i, MyGameCanvas.h - 45, bh.labelTextPressAnyKey, 1);
                }
                ++this.var_int_a;
            }
        }
        bs.var_bs_a.b();
    }

    public final void a() {
        MyGameCanvas.a("- INITIALIZE", 30);
        bh.loadAllFont();
        MIDletConfig.init(GameMIDlet.instance);
        int langIdx = MIDletConfig.getLangIdx();
        if (langIdx >= 0) {
            System.out.println("langChoice " + langIdx);
            MyGameCanvas.m = 3;
            this.var_byte_b = 1;
            this.var_byte_a = 0;
            this.loadLanguage(langIdx);
            new Thread(this).start();
            return;
        }
        MyGameCanvas.m = 3;
        this.var_byte_b = 1;
        this.var_byte_a = 0;
        this.loadLanguage(LANG_CODE_IDX_DEFAULT);// default lang idx = 1
        new Thread(this).start();
    }

    private void loadLanguage(int langIdx) {
        BabbleText.instance.a("/lang/language", "", langIdx);
        bh.loadCommonText();
        MIDletConfig.setVersionText();
        try {
            ce.var_z_g = new TableDefineTextFile("/sgui/com");
            bh.labelTextNowLoading = ce.var_z_g.loadByIndex(37);// NOW LOADING
            bh.labelTextHandsOnMobile = ce.var_z_g.loadByIndex(38);// Hands-On Mobile
            MyGameCanvas.k();// nghi 50 ms moi 6 lan goi
            this.var_byte_b = 1;
            return;
        }
        catch (IOException iOException) {
            return;
        }
    }

    public final void b() {
        bs.var_bs_a.a(20);
        this.var_int_a = -20;
        this.var_byte_c = 0;
        this.var_short_a = 1;
        this.var_byte_a = (byte)10;
    }

    public final void hideNotify() {
        bw.a();
    }

    public final void showNotify() {
        bw.b();
    }

    private final void c() {
        bs.var_bs_a.a(15);
        this.var_int_a = 0;
        this.var_byte_a = 1;
        this.var_short_a = (short)rpg.h.a(0, MyGameCanvas.g / 2 - 10);
        this.var_short_b = (short)(10 * rpg.h.a(0, 4));
        this.var_byte_c = (byte)rpg.h.a(0, 7);
        this.var_short_c = (short)rpg.h.a(MyGameCanvas.g / 2, MyGameCanvas.g - 10);
        this.var_short_d = (short)(10 * rpg.h.a(3, 7));
        this.var_byte_d = (byte)rpg.h.a(0, 7);
        bw.b(22);
    }

    public final void a(boolean bl2, byte by2) {
        bw.d();
        if (!bl2 && (bs.var_bs_a.var_byte_b & (by2 == 1 ? 8 : 2)) != 0) {
            bl2 = true;
        }
        if (!bl2 || this.var_boolean_c) {
            this.var_byte_a = (byte)2;
            return;
        }
        this.var_byte_a = 0;
        this.var_byte_b = (byte)2;
        MyGameCanvas.a("- STORY MODE", 52);
        bs.var_bs_a.g();
        new Thread(this).start();
    }

//    public static {
//        "*:MAP UPDATE".toCharArray();
//    }
}

