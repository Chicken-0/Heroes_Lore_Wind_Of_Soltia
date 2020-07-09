package rpg;

/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 *  javax.microedition.lcdui.Image
 */
import java.io.IOException;
import java.util.Vector;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;
import main.GameMIDlet;

public final class bh {
    public static String labelTextGain;
    public static String labelTextProgress;
    public static char[] labelTextAreYouSure;
    public static char[] labelTextAppUrl;
    public static char[] labelTextExit;
    public static char[] labelTextOk;
    public static char[] labelTextBack;
    public static char[] labelTextSkip;
    public static char[] labelTextNext;
    public static char[] labelTextSell;
    public static char[] labelTextSelect;
    public static char[] labelTextBuy;
    public static char[] labelTextYes;
    public static char[] labelTextNo;
    public static char[][] arrayTitleMenuText = new char[7][];
    public static char[] m = "               ".toCharArray();
    public static char[] labelTextPaused = null;
    public static char[] labelTextHandsOnMobile;
    public static char[] labelTextNowLoading;
    public static String labelTextLV;
    public static char[] labelTextPressAnyKey;
    public static char[] labelTextVersion;
    public static char[] labelTextLEVEL;
    public static char[] labelTextNoSpace;
    public static String labelTextG;
    public static boolean isBigFont = false;
    private static b fontSmallFontDefault;
    public static b fontSmallBlack;
    public static b fontSmallWhite;
    public static b fontSmallOrange;
    public static b fontBigWhiteBlack;
    public static b fontBigBlackWhite;
    public static b fontBigFontDefault;
    public static Vector var_java_util_Vector_a = new Vector();
    public static String var_java_lang_String_e = "";

    public static final void a(Graphics graphics, char[] arrc, char[] arrc2) {
        int n2;
        int n3;
        int n4;
        char[] arrc3;
        graphics.setClip(0, 0, rpg.MyGameCanvas.g, rpg.MyGameCanvas.h);
        int n5 = bh.int_a() + 5;
        if (arrc != null) {
            arrc3 = arrc;
            n4 = bh.getTextWidth(arrc) + 2;
            n3 = 0;
            n2 = rpg.MyGameCanvas.h - n5 + 3;
            graphics.setColor(0);
            graphics.fillRect(0, n2, n4, n5);
            graphics.setColor(0xFFFFFF);
            bh.int_a(graphics, 1, n2 + 1, arrc3, 1);
        }
        if (arrc2 != null) {
            arrc3 = arrc2;
            n4 = bh.getTextWidth(arrc2) + 2;
            n3 = rpg.MyGameCanvas.g - n4;
            n2 = rpg.MyGameCanvas.h - n5 + 3;
            graphics.setColor(0);
            graphics.fillRect(n3, n2, n4, n5);
            graphics.setColor(0xFFFFFF);
            bh.int_a(graphics, n3 + 1, n2 + 1, arrc3, 1);
        }
    }

    public static final void a(Graphics graphics) {
        graphics.setClip(0, 0, rpg.MyGameCanvas.g, rpg.MyGameCanvas.h);
        graphics.setColor(0);
        graphics.fillRect(0, 0, rpg.MyGameCanvas.g, rpg.MyGameCanvas.h);
    }

    public static final void void_a(String string) {
        try {
            GameMIDlet.instance.platformRequest(MIDletConfig.urlApp);
        }
        catch (Exception exception) {
            Exception exception2 = exception;
            exception.printStackTrace();
        }
        GameMIDlet.instance.endApp();
    }

    public static final void a(Graphics graphics, int n2, int n3, int n4) {
        n3 = rpg.MyGameCanvas.g >> 1;
        bh.setFontDefault(true);
        int n5 = n2 >> 1;
        if (n2 % 2 == 0) {
            graphics.setColor(0xFFFFFF);
        } else {
            graphics.setColor(0);
        }
        bh.void_a(graphics, n3, n4 + 4, arrayTitleMenuText[n5], 1);
        bh.setFontDefault(false);
    }

    public static final void setFontDefault(boolean enableBigFont) {
        isBigFont = enableBigFont;
        if (isBigFont) {
            fontSmallFontDefault = fontBigWhiteBlack;
            return;
        }
        fontSmallFontDefault = fontSmallBlack;
    }

    public static final int a(int n2, int n3) {
        return n2 * n3 / 100;
    }

    public static final void loadCommonText() {
        labelTextGain = bh.getTextById(3902) + " "; // Gain
        labelTextProgress = bh.getTextById(3903); // Progress:
        labelTextAreYouSure = bh.getTextById(3904).toCharArray();// Are You Sure?
        labelTextAppUrl = bh.getTextById(3906).toCharArray();// www.HandsOn.com/Heroes
        labelTextExit = bh.getTextById(3907).toCharArray();// Exit
        labelTextOk = bh.getTextById(3908).toCharArray();// Ok
        labelTextBack = bh.getTextById(3909).toCharArray();// Back
        labelTextSkip = bh.getTextById(3910).toCharArray();// Skip
        labelTextNext = bh.getTextById(3911).toCharArray();// Next
        labelTextSell = bh.getTextById(3912).toCharArray();// Sell
        labelTextSelect = bh.getTextById(3913).toCharArray();// Select
        labelTextBuy = bh.getTextById(3914).toCharArray();// Buy
        labelTextYes = bh.getTextById(3915).toCharArray();// Yes
        labelTextNo = bh.getTextById(3916).toCharArray();// No
        bh.arrayTitleMenuText[0] = bh.getTextById(3920).toCharArray();// New Game
        bh.arrayTitleMenuText[1] = bh.getTextById(3921).toCharArray();// Load game
        bh.arrayTitleMenuText[2] = bh.getTextById(3922).toCharArray();// Options
        bh.arrayTitleMenuText[3] = bh.getTextById(3923).toCharArray();// Help
        bh.arrayTitleMenuText[4] = bh.getTextById(3924).toCharArray();// About
        bh.arrayTitleMenuText[5] = bh.getTextById(3924).toCharArray();// About
        bh.arrayTitleMenuText[6] = bh.getTextById(3926).toCharArray();// Exit
        labelTextLEVEL = bh.getTextById(3932).toCharArray();// LEVEL
        labelTextPaused = bh.getTextById(3946).toCharArray();// Paused
        labelTextNoSpace = bh.getTextById(3947).toCharArray();// no space
        labelTextG = bh.getTextById(3948);// G
        labelTextLV = bh.getTextById(3949);// LV
        labelTextPressAnyKey = bh.getTextById(3950).toCharArray(); // PRESS ANY KEY
    }

    public static final String getTextById(int textId) {
        return BabbleText.instance.getTextById(textId).replace(';', '\n');
    }

    public static final char[] char_arr_a(String string) {
        try {
            return BabbleText.instance.getTextById(Integer.parseInt(string.trim())).replace(';', '\n').toCharArray();
        }
        catch (Exception exception) {
            return ("2." + exception.toString()).toCharArray();
        }
    }

    public static final void loadAllFont() {
        fontSmallBlack = (b)b.createMFont("fonts/small", 0, false);
        fontSmallWhite = (b)b.createMFont("fonts/small", 0xFFFFFF, false);
        fontSmallOrange = (b)b.createMFont("fonts/small", 0xFF8800, false);
        fontBigWhiteBlack = (b)b.createMFont("fonts/big", 0, 0xFFFFFF, true);
        fontBigBlackWhite = (b)b.createMFont("fonts/big", 0xFFFFFF, 0, true);
        fontBigFontDefault = fontBigWhiteBlack;
        bh.fontSmallBlack.activeControlChar = true;
        bh.fontSmallWhite.activeControlChar = true;
        bh.fontSmallOrange.activeControlChar = true;
        bh.fontBigWhiteBlack.activeControlChar = true;
        bh.fontBigBlackWhite.activeControlChar = true;
        bh.fontBigFontDefault.activeControlChar = true;
        fontSmallFontDefault = fontSmallBlack;
    }

    public static final int int_a() {
        return bh.fontSmallFontDefault.var_int_a;
    }

    public static final int getTextWidth(char[] charArray) {
        return fontSmallFontDefault.getTextWidth(bh.toString(charArray));
    }

    private static final boolean a(char c2) {
        return c2 == ';';
    }

    public static final int a(char[] arrc, int n2, int n3) {
        int n4 = n2 + n3;
        boolean bl2 = false;
        while (n4 < arrc.length) {
            if (bh.a(arrc[n4])) {
                ++n4;
                continue;
            }
            if (bl2) {
                return n4 + 1 - n2;
            }
            bl2 = true;
            ++n4;
        }
        return arrc.length - n2;
    }

    public static final int a(char[] arrc, int n2, int n3, int n4) {
        String string = new String(arrc, n2, arrc.length - n2);
        return fontSmallFontDefault.a(string, n3, n4);
    }

    public static final int a(char[] arrc, int n2) {
        String string = bh.toString(arrc);
        Vector vector = bh.a(string, n2);
        return vector.size();
    }

    public static final int a(int n2, int n3, char[] arrc, int n4, int n5, int n6) {
        return bh.a(new String(arrc), 0, 0, n2);
    }

    private static int b() {
        return bh.fontSmallFontDefault.var_int_b;
    }

    private static int a(String string, int n2, int n3, int n4) {
        int n5 = fontSmallFontDefault.a(bh.a(string, n4));
        return n5 - bh.b();
    }

    private static Vector a(String string, int n2) {
        if (!string.equals(var_java_lang_String_e)) {
            var_java_util_Vector_a.setSize(0);
            fontSmallFontDefault.a(var_java_util_Vector_a, string, n2);
        }
        return var_java_util_Vector_a;
    }

    public static final int int_a(Graphics graphics, int n2, int n3, char[] arrc, int n4) {
        MFont az2 = bh.getFontColor(graphics.getColor());
        return az2.a(graphics, arrc, n2, n3, 20);
    }

    private static MFont getFontColor(int color) {
        if (isBigFont) {
            if (color == 0) {
                return fontBigWhiteBlack;
            }
            if (color == 0xFFFFFF) {
                return fontBigBlackWhite;
            }
            return fontBigFontDefault;
        }
        if (color == 0) {
            return fontSmallBlack;
        }
        if (color == 0xFFFFFF) {
            return fontSmallWhite;
        }
        return fontSmallOrange;
    }

    public static final void void_a(Graphics graphics, int n2, int n3, char[] arrc, int n4) {
        MFont az2 = bh.getFontColor(graphics.getColor());
        az2.a(graphics, arrc, n2, n3, 17);
    }

    public static final void a(Graphics graphics, int n2, int n3, int n4, int n5, char[] arrc, int n6, int n7, int n8) {
        graphics.setClip(0, 0, rpg.MyGameCanvas.g, rpg.MyGameCanvas.h);
        MFont az2 = bh.getFontColor(graphics.getColor());
        if (n6 + n8 > arrc.length) {
            n8 = arrc.length - n6;
        }
        String string = new String(arrc, n6, n8);
        az2.a(graphics, bh.a(string, n4), n2, n3, rpg.MyGameCanvas.h, 20);
    }

    public static final void b(Graphics graphics, int n2, int n3, int n4, int n5, char[] arrc, int n6, int n7, int n8) {
        graphics.setClip(0, 0, rpg.MyGameCanvas.g, rpg.MyGameCanvas.h);
        MFont az2 = bh.getFontColor(graphics.getColor());
        if (n6 + n8 > arrc.length) {
            n8 = arrc.length - n6;
        }
        String string = new String(arrc, n6, n8);
        az2.a(graphics, bh.a(string, n4), n2, n3, rpg.MyGameCanvas.h, 17);
    }

    public static final void c(Graphics graphics, int n2, int n3, int n4, int n5, char[] arrc, int n6, int n7, int n8) {
        graphics.setClip(0, 0, rpg.MyGameCanvas.g, rpg.MyGameCanvas.h);
        MFont az2 = bh.getFontColor(graphics.getColor());
        Vector vector = bh.a(new String(arrc, n6, arrc.length - n6), n4);
        int n9 = Math.min(vector.size(), 3);
        for (int i2 = 0; i2 < n9; ++i2) {
            String string = (String)vector.elementAt(i2);
            if (n8 <= string.length()) {
                az2.a(graphics, string, 0, n8, n2, n3, 20);
                return;
            }
            az2.a(graphics, string, n2, n3, 20);
            n8 -= string.length() + 1;
            n3 += bh.fontSmallFontDefault.var_int_a + 2;
        }
        graphics.setColor(0xFFFFFF);
    }

    public static final int a(Graphics graphics, int n2, int n3, int n4, int n5, char[] arrc, int n6) {
        graphics.setClip(0, 0, rpg.MyGameCanvas.g, rpg.MyGameCanvas.h);
        MFont az2 = bh.getFontColor(graphics.getColor());
        String string = bh.toString(arrc);
        return az2.a(graphics, bh.a(string, n4), n2, n3, rpg.MyGameCanvas.h, n6);
    }

    public static final int a(Graphics graphics, int n2, int n3, int n4, int n5, char[] arrc) {
        return bh.a(graphics, n2, n3, n4, n5, arrc, 20);
    }

    public static final String toString(char[] charArray) {
        return new String(charArray);
    }

    public static final String a(String string, String string2, String string3) {
        int n2;
        while ((n2 = string.indexOf(string2)) >= 0) {
            String string4 = string.substring(0, n2);
            String string5 = string.substring(n2 + string2.length());
            string = string4 + string3 + string5;
        }
        return string;
    }

    public static final Image javax_microedition_lcdui_Image_a(String string) throws IOException {
        string = "/" + BabbleText.instance.arrayLanguageCode[BabbleText.instance.idxLangCode] + "/" + string;
        return Image.createImage((String)string);
    }

//    public static {
//        var_char_arr_arr_a = new char[7][];
//        m = "               ".toCharArray();
//        n = null;
//        o = null;
//        p = null;
//        var_java_lang_String_c = null;
//        q = null;
//        r = null;
//        t = null;
//        var_java_lang_String_d = null;
//        var_boolean_a = false;
//        var_java_util_Vector_a = new Vector();
//        var_java_lang_String_e = "";
//    }
}

