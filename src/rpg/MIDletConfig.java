package rpg;

import javax.microedition.midlet.MIDlet;
import main.GameMIDlet;

// $FF: renamed from: w
public final class MIDletConfig {

    // $FF: renamed from: a javax.microedition.midlet.MIDlet
    public static MIDlet mIDletInstance;
    // $FF: renamed from: a java.lang.String[]
    public static String[] arrayLangCode;
    // $FF: renamed from: a java.lang.String
    public static String urlApp;
    // $FF: renamed from: a boolean
    public static boolean buySetupOnMenu;
    // $FF: renamed from: b boolean
    public static boolean buySetupOnExit;
    // $FF: renamed from: c boolean
    public static boolean isDemoVersion;
    // $FF: renamed from: a boolean[]
    public static boolean[] arrayLangActive;

    // $FF: renamed from: a (javax.microedition.midlet.MIDlet) void
    public static final void init(MIDlet mIDlet) {
        mIDletInstance = mIDlet;
        isDemoVersion = activeDemo();
        class_x.activeDemoVersion = isDemoVersion;
    }

    // $FF: renamed from: a () void
    public static final void setVersionTextLabel() {
        if (activeBuySetup(true)) {
            buySetupOnMenu = true;
        }

        if (activeBuySetup(false)) {
            buySetupOnExit = true;
        }

        if (buySetupOnMenu) {
            class_bh.arrayTitleMenuText[5] = func_class_java_lang_String_a().toCharArray();
        } else {
            class_bh.arrayTitleMenuText[5] = class_bh.arrayTitleMenuText[6];
        }

        urlApp = getUrlApp();

        try {
            String versionText;
            if ((versionText = GameMIDlet.instance.getAppProperty("MIDlet-Version")) != null) {
                if (isDemoVersion) {
                    versionText = versionText + " " + class_bh.getTextById(3917);
                }

                class_bh.labelTextVersion = versionText.toCharArray();
            }

        } catch (Exception ex) {
        }
    }

    // $FF: renamed from: c () boolean
    private static boolean activeDemo() {
        String var0 = mIDletInstance.getAppProperty("HO-Demo");
        boolean var1 = true;
        if (var0 != null && var0.trim().equals("BEJ8K52N7A")) {
            var1 = false;
        }

        return var1;
    }

    // $FF: renamed from: a () boolean
    public static final boolean func_boolean_a() {
        return isDemoVersion && buySetupOnMenu && urlApp != null;
    }

    // $FF: renamed from: b () boolean
    public static final boolean func_boolean_b() {
        return !isDemoVersion && buySetupOnMenu && urlApp != null;
    }

    // $FF: renamed from: a () int
    public static final int getLangIdx() {
        int langCount;
        arrayLangActive = new boolean[langCount = arrayLangCode.length];
        int langActiveCount = 0;
        int idxDefaultLanguage = -1;
        String langList;
        int i;
        if ((langList = mIDletInstance.getAppProperty("HO-LangList")) != null) {
            for (i = 0; i < langCount; ++i) {
                if (langList.indexOf(arrayLangCode[i]) >= 0) {
                    
                    // Active lang
                    System.out.println(arrayLangCode[i]);
                    arrayLangActive[i] = true;
                    idxDefaultLanguage = i;
                    ++langActiveCount;
                }
            }
        }

        if (langActiveCount == 1) {
            // One Lang
            return idxDefaultLanguage;
        } else {
            if (langActiveCount == 0) {
                for (i = 0; i < langCount; ++i) {
                    arrayLangActive[i] = true;
                }
            }

            // Multi or default lang
            return -1;
        }
    }

    // $FF: renamed from: a () java.lang.String
    public static final String func_class_java_lang_String_a() {
        String var0 = "HO-Label-" + arrayLangCode[BabbleText.instance.idxLangCode];
        String var1;
        if ((var1 = mIDletInstance.getAppProperty(var0)) != null && var1.length() != 0) {
            int var3;
            if (var1.indexOf("\\u") < 0) {
                var3 = var1.length();
                return var1.substring(0, var3 < 16 ? var3 : 16);
            } else {
                StringBuffer var2 = new StringBuffer(var1);
                var3 = 0;
                char[] var4 = new char[4];

                do {
                    if (var2.charAt(var3++) == '\\' && var2.charAt(var3) == 'u') {
                        var2.getChars(var3 + 1, var3 + 5, var4, 0);
                        var2.setCharAt(var3 - 1, (char) Integer.parseInt(class_bh.func_class_java_lang_String_a(var4), 16));
                        var2.delete(var3, var3 + 5);
                    }
                } while (var3 < var2.length());

                String var5;
                int var6 = (var5 = var2.toString()).length();
                return var5.substring(0, var6 < 16 ? var6 : 16);
            }
        } else {
            return isDemoVersion ? BabbleText.instance.getTextById(3931) : BabbleText.instance.getTextById(3925);
        }
    }

    // $FF: renamed from: b () java.lang.String
    private static String getUrlApp() {
        String urlKey = "HO-URL-" + arrayLangCode[BabbleText.instance.idxLangCode];
        String urlAddress;
        return (urlAddress = mIDletInstance.getAppProperty(urlKey)) != null && urlAddress.length() != 0 ? urlAddress : null;
    }

    // $FF: renamed from: a (boolean) boolean
    private static boolean activeBuySetup(boolean var0) {
        String var1 = mIDletInstance.getAppProperty("HO-BuySetup");
        String var2 = "HO-URL-" + arrayLangCode[BabbleText.instance.idxLangCode];
        String var3 = mIDletInstance.getAppProperty(var2);
        if (var1 != null && var1.length() != 0) {
            if (var3 != null && var3.length() != 0) {
                if (var0) {
                    return var1.indexOf("menu") > -1;
                } else {
                    return var1.indexOf("exit") > -1;
                }
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    static {
        arrayLangCode = BabbleText.instance.arrayLanguageCode;
    }
}
