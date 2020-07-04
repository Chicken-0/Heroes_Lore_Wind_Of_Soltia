package rpg;

/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  javax.microedition.midlet.MIDlet
 */
import javax.microedition.midlet.MIDlet;
import main.GameMIDlet;

public final class w {
    public static MIDlet var_javax_microedition_midlet_MIDlet_a;
    public static String[] var_java_lang_String_arr_a = BabbleText.instance.var_java_lang_String_arr_a;
    public static String var_java_lang_String_a;
    public static boolean var_boolean_a;
    public static boolean b;
    public static boolean c;
    public static boolean[] var_boolean_arr_a;

    public static final void a(MIDlet mIDlet) {
        var_javax_microedition_midlet_MIDlet_a = mIDlet;
        x.a = c = w.isDemoVersion();
    }

    public static final void void_a() {
        if (w.a(true)) {
            var_boolean_a = true;
        }
        if (w.a(false)) {
            b = true;
        }
        bh.var_char_arr_arr_a[5] = var_boolean_a ? w.java_lang_String_a().toCharArray() : bh.var_char_arr_arr_a[6];
        var_java_lang_String_a = w.java_lang_String_b();
        try {
            String string = GameMIDlet.var_rpg_GameMIDlet_a.getAppProperty("MIDlet-Version");
            if (string != null) {
                if (c) {
                    string = string + " " + bh.java_lang_String_a(3917);
                }
                bh.r = string.toCharArray();
            }
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    // Check demo key in manifest
    private static boolean isDemoVersion() {
        String string = var_javax_microedition_midlet_MIDlet_a.getAppProperty("HO-Demo");
//        boolean bl2 = true;
        boolean bl2 = false;

        if (string != null && string.trim().equals("BEJ8K52N7A")) {
            bl2 = false;
        }
        return bl2;
    }

    public static final boolean boolean_a() {
        return c && var_boolean_a && var_java_lang_String_a != null;
    }

    public static final boolean boolean_b() {
        return !c && var_boolean_a && var_java_lang_String_a != null;
    }

    public static final int int_a() {
        int n2;
        int n3 = var_java_lang_String_arr_a.length;
        var_boolean_arr_a = new boolean[n3];
        int n4 = 0;
        int n5 = -1;
        String string = var_javax_microedition_midlet_MIDlet_a.getAppProperty("HO-LangList");
        if (string != null) {
            for (n2 = 0; n2 < n3; ++n2) {
                if (string.indexOf(var_java_lang_String_arr_a[n2]) < 0) continue;
                System.out.println(var_java_lang_String_arr_a[n2]);
                w.var_boolean_arr_a[n2] = true;
                n5 = n2;
                ++n4;
            }
        }
        if (n4 == 1) {
            return n5;
        }
        if (n4 == 0) {
            for (n2 = 0; n2 < n3; ++n2) {
                w.var_boolean_arr_a[n2] = true;
            }
        }
        return -1;
    }

    public static final String java_lang_String_a() {
        String string;
        String string2 = "HO-Label-" + var_java_lang_String_arr_a[BabbleText.instance.var_byte_a];
        String string3 = var_javax_microedition_midlet_MIDlet_a.getAppProperty(string2);
        if (string3 == null || string3.length() == 0) {
            if (c) {
                return BabbleText.instance.getTextById(3931);
            }
            return BabbleText.instance.getTextById(3925);
        }
        if (string3.indexOf("\\u") >= 0) {
            String string4;
            StringBuffer stringBuffer = new StringBuffer(string3);
            int n2 = 0;
            char[] arrc = new char[4];
            do {
                if (stringBuffer.charAt(n2++) != '\\' || stringBuffer.charAt(n2) != 'u') continue;
                stringBuffer.getChars(n2 + 1, n2 + 5, arrc, 0);
                stringBuffer.setCharAt(n2 - 1, (char)Integer.parseInt(bh.java_lang_String_a(arrc), 16));
                stringBuffer.delete(n2, n2 + 5);
            } while (n2 < stringBuffer.length());
            int n3 = (string4 = stringBuffer.toString()).length();
            return string4.substring(0, n3 < 16 ? n3 : 16);
        }
        int n4 = (string = string3).length();
        return string.substring(0, n4 < 16 ? n4 : 16);
    }

    private static String java_lang_String_b() {
        String string = "HO-URL-" + var_java_lang_String_arr_a[BabbleText.instance.var_byte_a];
        String string2 = var_javax_microedition_midlet_MIDlet_a.getAppProperty(string);
        if (string2 == null || string2.length() == 0) {
            return null;
        }
        return string2;
    }

    private static boolean a(boolean bl2) {
        String string = var_javax_microedition_midlet_MIDlet_a.getAppProperty("HO-BuySetup");
        String string2 = "HO-URL-" + var_java_lang_String_arr_a[BabbleText.instance.var_byte_a];
        String string3 = var_javax_microedition_midlet_MIDlet_a.getAppProperty(string2);
        if (string == null || string.length() == 0) {
            return false;
        }
        if (string3 == null || string3.length() == 0) {
            return false;
        }
        if (bl2) {
            return string.indexOf("menu") > -1;
        }
        return string.indexOf("exit") > -1;
    }

//    public static {
//        var_java_lang_String_arr_a = cj.var_cj_a.var_java_lang_String_arr_a;
//    }
}

