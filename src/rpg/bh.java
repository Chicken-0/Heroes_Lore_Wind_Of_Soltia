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
    public static String var_java_lang_String_a;
    public static String var_java_lang_String_b;
    public static char[] var_char_arr_a;
    public static char[] var_char_arr_b;
    public static char[] var_char_arr_c;
    public static char[] var_char_arr_d;
    public static char[] var_char_arr_e;
    public static char[] var_char_arr_f;
    public static char[] var_char_arr_g;
    public static char[] h;
    public static char[] i;
    public static char[] j;
    public static char[] k;
    public static char[] l;
    public static char[][] var_char_arr_arr_a = new char[7][];
    public static char[] m = "               ".toCharArray();
    public static char[] n = null;
    public static char[] o;
    public static char[] p;
    public static String var_java_lang_String_c;
    public static char[] q;
    public static char[] r;
    public static char[] s;
    public static char[] t;
    public static String var_java_lang_String_d;
    public static boolean var_boolean_a = false;
    private static b var_b_g;
    public static b var_b_a;
    public static b var_b_b;
    public static b var_b_c;
    public static b var_b_d;
    public static b var_b_e;
    public static b var_b_f;
    public static Vector var_java_util_Vector_a = new Vector();
    public static String var_java_lang_String_e = "";

    public static final void a(Graphics graphics, char[] arrc, char[] arrc2) {
        int n2;
        int n3;
        int n4;
        char[] arrc3;
        graphics.setClip(0, 0, rpg.r.g, rpg.r.h);
        int n5 = bh.int_a() + 5;
        if (arrc != null) {
            arrc3 = arrc;
            n4 = bh.int_a(arrc) + 2;
            n3 = 0;
            n2 = rpg.r.h - n5 + 3;
            graphics.setColor(0);
            graphics.fillRect(0, n2, n4, n5);
            graphics.setColor(0xFFFFFF);
            bh.int_a(graphics, 1, n2 + 1, arrc3, 1);
        }
        if (arrc2 != null) {
            arrc3 = arrc2;
            n4 = bh.int_a(arrc2) + 2;
            n3 = rpg.r.g - n4;
            n2 = rpg.r.h - n5 + 3;
            graphics.setColor(0);
            graphics.fillRect(n3, n2, n4, n5);
            graphics.setColor(0xFFFFFF);
            bh.int_a(graphics, n3 + 1, n2 + 1, arrc3, 1);
        }
    }

    public static final void a(Graphics graphics) {
        graphics.setClip(0, 0, rpg.r.g, rpg.r.h);
        graphics.setColor(0);
        graphics.fillRect(0, 0, rpg.r.g, rpg.r.h);
    }

    public static final void void_a(String string) {
        try {
            GameMIDlet.var_rpg_GameMIDlet_a.platformRequest(w.var_java_lang_String_a);
        }
        catch (Exception exception) {
            Exception exception2 = exception;
            exception.printStackTrace();
        }
        GameMIDlet.var_rpg_GameMIDlet_a.a();
    }

    public static final void a(Graphics graphics, int n2, int n3, int n4) {
        n3 = rpg.r.g >> 1;
        bh.a(true);
        int n5 = n2 >> 1;
        if (n2 % 2 == 0) {
            graphics.setColor(0xFFFFFF);
        } else {
            graphics.setColor(0);
        }
        bh.void_a(graphics, n3, n4 + 4, var_char_arr_arr_a[n5], 1);
        bh.a(false);
    }

    public static final void a(boolean bl2) {
        var_boolean_a = bl2;
        if (var_boolean_a) {
            var_b_g = var_b_d;
            return;
        }
        var_b_g = var_b_a;
    }

    public static final int a(int n2, int n3) {
        return n2 * n3 / 100;
    }

    public static final void a(BabbleText cj2) {
        var_java_lang_String_a = bh.java_lang_String_a(3902) + " "; // Gain
        var_java_lang_String_b = bh.java_lang_String_a(3903); // Progress:
        var_char_arr_a = bh.java_lang_String_a(3904).toCharArray();// Are You Sure?
        var_char_arr_b = bh.java_lang_String_a(3906).toCharArray();// www.HandsOn.com/Heroes
        var_char_arr_c = bh.java_lang_String_a(3907).toCharArray();// Exit
        var_char_arr_d = bh.java_lang_String_a(3908).toCharArray();// Ok
        var_char_arr_e = bh.java_lang_String_a(3909).toCharArray();// Back
        var_char_arr_f = bh.java_lang_String_a(3910).toCharArray();// Skip
        var_char_arr_g = bh.java_lang_String_a(3911).toCharArray();// Next
        h = bh.java_lang_String_a(3912).toCharArray();// Sell
        i = bh.java_lang_String_a(3913).toCharArray();// Select
        j = bh.java_lang_String_a(3914).toCharArray();// Buy
        k = bh.java_lang_String_a(3915).toCharArray();// Yes
        l = bh.java_lang_String_a(3916).toCharArray();// No
        bh.var_char_arr_arr_a[0] = bh.java_lang_String_a(3920).toCharArray();// New Game
        bh.var_char_arr_arr_a[1] = bh.java_lang_String_a(3921).toCharArray();// Load game
        bh.var_char_arr_arr_a[2] = bh.java_lang_String_a(3922).toCharArray();// Options
        bh.var_char_arr_arr_a[3] = bh.java_lang_String_a(3923).toCharArray();// Help
        bh.var_char_arr_arr_a[4] = bh.java_lang_String_a(3924).toCharArray();// About
        bh.var_char_arr_arr_a[5] = bh.java_lang_String_a(3924).toCharArray();// About
        bh.var_char_arr_arr_a[6] = bh.java_lang_String_a(3926).toCharArray();// Exit
        s = bh.java_lang_String_a(3932).toCharArray();// LEVEL
        n = bh.java_lang_String_a(3946).toCharArray();// Paused
        t = bh.java_lang_String_a(3947).toCharArray();// no space
        var_java_lang_String_d = bh.java_lang_String_a(3948);// G
        var_java_lang_String_c = bh.java_lang_String_a(3949);// LV
        q = bh.java_lang_String_a(3950).toCharArray(); // PRESS ANY KEY
    }

    public static final String java_lang_String_a(int n2) {
        return BabbleText.instance.getTextById(n2).replace(';', '\n');
    }

    public static final char[] char_arr_a(String string) {
        try {
            return BabbleText.instance.getTextById(Integer.parseInt(string.trim())).replace(';', '\n').toCharArray();
        }
        catch (Exception exception) {
            return ("2." + exception.toString()).toCharArray();
        }
    }

    public static final void void_a() {
        var_b_a = (b)b.a("fonts/small", 0, false);
        var_b_b = (b)b.a("fonts/small", 0xFFFFFF, false);
        var_b_c = (b)b.a("fonts/small", 0xFF8800, false);
        var_b_d = (b)b.a("fonts/big", 0, 0xFFFFFF, true);
        var_b_e = (b)b.a("fonts/big", 0xFFFFFF, 0, true);
        var_b_f = var_b_d;
        bh.var_b_a.var_boolean_b = true;
        bh.var_b_b.var_boolean_b = true;
        bh.var_b_c.var_boolean_b = true;
        bh.var_b_d.var_boolean_b = true;
        bh.var_b_e.var_boolean_b = true;
        bh.var_b_f.var_boolean_b = true;
        var_b_g = var_b_a;
    }

    public static final int int_a() {
        return bh.var_b_g.var_int_a;
    }

    public static final int int_a(char[] arrc) {
        return var_b_g.a(bh.java_lang_String_a(arrc));
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
        return var_b_g.a(string, n3, n4);
    }

    public static final int a(char[] arrc, int n2) {
        String string = bh.java_lang_String_a(arrc);
        Vector vector = bh.a(string, n2);
        return vector.size();
    }

    public static final int a(int n2, int n3, char[] arrc, int n4, int n5, int n6) {
        return bh.a(new String(arrc), 0, 0, n2);
    }

    private static int b() {
        return bh.var_b_g.var_int_b;
    }

    private static int a(String string, int n2, int n3, int n4) {
        int n5 = var_b_g.a(bh.a(string, n4));
        return n5 - bh.b();
    }

    private static Vector a(String string, int n2) {
        if (!string.equals(var_java_lang_String_e)) {
            var_java_util_Vector_a.setSize(0);
            var_b_g.a(var_java_util_Vector_a, string, n2);
        }
        return var_java_util_Vector_a;
    }

    public static final int int_a(Graphics graphics, int n2, int n3, char[] arrc, int n4) {
        az az2 = bh.az_a(graphics.getColor());
        return az2.a(graphics, arrc, n2, n3, 20);
    }

    private static az az_a(int n2) {
        if (var_boolean_a) {
            if (n2 == 0) {
                return var_b_d;
            }
            if (n2 == 0xFFFFFF) {
                return var_b_e;
            }
            return var_b_f;
        }
        if (n2 == 0) {
            return var_b_a;
        }
        if (n2 == 0xFFFFFF) {
            return var_b_b;
        }
        return var_b_c;
    }

    public static final void void_a(Graphics graphics, int n2, int n3, char[] arrc, int n4) {
        az az2 = bh.az_a(graphics.getColor());
        az2.a(graphics, arrc, n2, n3, 17);
    }

    public static final void a(Graphics graphics, int n2, int n3, int n4, int n5, char[] arrc, int n6, int n7, int n8) {
        graphics.setClip(0, 0, rpg.r.g, rpg.r.h);
        az az2 = bh.az_a(graphics.getColor());
        if (n6 + n8 > arrc.length) {
            n8 = arrc.length - n6;
        }
        String string = new String(arrc, n6, n8);
        az2.a(graphics, bh.a(string, n4), n2, n3, rpg.r.h, 20);
    }

    public static final void b(Graphics graphics, int n2, int n3, int n4, int n5, char[] arrc, int n6, int n7, int n8) {
        graphics.setClip(0, 0, rpg.r.g, rpg.r.h);
        az az2 = bh.az_a(graphics.getColor());
        if (n6 + n8 > arrc.length) {
            n8 = arrc.length - n6;
        }
        String string = new String(arrc, n6, n8);
        az2.a(graphics, bh.a(string, n4), n2, n3, rpg.r.h, 17);
    }

    public static final void c(Graphics graphics, int n2, int n3, int n4, int n5, char[] arrc, int n6, int n7, int n8) {
        graphics.setClip(0, 0, rpg.r.g, rpg.r.h);
        az az2 = bh.az_a(graphics.getColor());
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
            n3 += bh.var_b_g.var_int_a + 2;
        }
        graphics.setColor(0xFFFFFF);
    }

    public static final int a(Graphics graphics, int n2, int n3, int n4, int n5, char[] arrc, int n6) {
        graphics.setClip(0, 0, rpg.r.g, rpg.r.h);
        az az2 = bh.az_a(graphics.getColor());
        String string = bh.java_lang_String_a(arrc);
        return az2.a(graphics, bh.a(string, n4), n2, n3, rpg.r.h, n6);
    }

    public static final int a(Graphics graphics, int n2, int n3, int n4, int n5, char[] arrc) {
        return bh.a(graphics, n2, n3, n4, n5, arrc, 20);
    }

    public static final String java_lang_String_a(char[] arrc) {
        return new String(arrc);
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
        string = "/" + BabbleText.instance.var_java_lang_String_arr_a[BabbleText.instance.var_byte_a] + "/" + string;
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

