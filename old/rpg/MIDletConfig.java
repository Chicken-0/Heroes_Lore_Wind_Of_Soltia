package rpg;

/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  javax.microedition.midlet.MIDlet
 */
import javax.microedition.midlet.MIDlet;
import main.GameMIDlet;

public final class MIDletConfig {
    public static MIDlet mIDletInstance;
    public static String[] arrayLangCode = BabbleText.instance.arrayLanguageCode;
    public static String urlApp;
    public static boolean buySetupOnMenu;
    public static boolean buySetupOnExit;
    public static boolean isDemoVersion;
    public static boolean[] arrayLangActive;

    public static final void init(MIDlet mIDlet) {
        mIDletInstance = mIDlet;
        x.activeDemoVersion = isDemoVersion = MIDletConfig.activeDemo();
    }

    public static final void setVersionText() {
        if (MIDletConfig.activeBuySetup(true)) {
            buySetupOnMenu = true;
        }
        if (MIDletConfig.activeBuySetup(false)) {
            buySetupOnExit = true;
        }
        bh.arrayTitleMenuText[5] = buySetupOnMenu ? MIDletConfig.java_lang_String_a().toCharArray() : bh.arrayTitleMenuText[6];
        urlApp = MIDletConfig.getUrlApp();
        try {
            String versionText = GameMIDlet.instance.getAppProperty("MIDlet-Version");
            if (versionText != null) {
                if (isDemoVersion) {
                    versionText = versionText + " " + bh.getTextById(3917);// Demo text
                }
                bh.labelTextVersion = versionText.toCharArray();// version
            }
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    private static boolean activeDemo() {
        String string = mIDletInstance.getAppProperty("HO-Demo");
        boolean bl2 = true;
//        boolean bl2 = false;

        if (string != null && string.trim().equals("BEJ8K52N7A")) {
            bl2 = false;
        }
        return bl2;
    }

    public static final boolean boolean_a() {
        return isDemoVersion && buySetupOnMenu && urlApp != null;
    }

    public static final boolean boolean_b() {
        return !isDemoVersion && buySetupOnMenu && urlApp != null;
    }

    public static final int getLangIdx() {
        int langCount = arrayLangCode.length;
        arrayLangActive = new boolean[langCount];
        int langActiveCount = 0;
        int idxMain = -1;
        String langList = mIDletInstance.getAppProperty("HO-LangList");
        if (langList != null) {
            for (int i = 0; i < langCount; ++i) {
                if (langList.indexOf(arrayLangCode[i]) < 0) continue;
                
                // Active lang
                System.out.println(arrayLangCode[i]);
                MIDletConfig.arrayLangActive[i] = true;
                idxMain = i;
                ++langActiveCount;
            }
        }
        if (langActiveCount == 1) {
            // One Lang
            return idxMain;
        }
        if (langActiveCount == 0) {
            for (int i = 0; i < langCount; ++i) {
                MIDletConfig.arrayLangActive[i] = true;
            }
        }
        
        // Multi or default lang
        return -1;
    }

    public static final String java_lang_String_a() {
        String string;
        String string2 = "HO-Label-" + arrayLangCode[BabbleText.instance.idxLangCode];
        String string3 = mIDletInstance.getAppProperty(string2);
        if (string3 == null || string3.length() == 0) {
            if (isDemoVersion) {
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
                stringBuffer.setCharAt(n2 - 1, (char)Integer.parseInt(bh.toString(arrc), 16));
                stringBuffer.delete(n2, n2 + 5);
            } while (n2 < stringBuffer.length());
            int n3 = (string4 = stringBuffer.toString()).length();
            return string4.substring(0, n3 < 16 ? n3 : 16);
        }
        int n4 = (string = string3).length();
        return string.substring(0, n4 < 16 ? n4 : 16);
    }

    private static String getUrlApp() {
        String urlKey = "HO-URL-" + arrayLangCode[BabbleText.instance.idxLangCode];
        String urlAddress = mIDletInstance.getAppProperty(urlKey);
        if (urlAddress == null || urlAddress.length() == 0) {
            return null;
        }
        return urlAddress;
    }

    private static boolean activeBuySetup(boolean inMenu) {
        String string = mIDletInstance.getAppProperty("HO-BuySetup");
        String string2 = "HO-URL-" + arrayLangCode[BabbleText.instance.idxLangCode];
        String string3 = mIDletInstance.getAppProperty(string2);
        if (string == null || string.length() == 0) {
            return false;
        }
        if (string3 == null || string3.length() == 0) {
            return false;
        }
        if (inMenu) {
            return string.indexOf("menu") > -1;
        }
        return string.indexOf("exit") > -1;
    }

//    public static {
//        var_java_lang_String_arr_a = cj.var_cj_a.var_java_lang_String_arr_a;
//    }
}

