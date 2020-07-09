package rpg;

/*
 * Decompiled with CFR 0.150.
 */
import java.util.Vector;

public final class b
extends MFont {
    private b(String fontPath, int color, int n3, boolean isBigFont) {
        super(fontPath, color, n3, isBigFont);
    }

    public final int a(String string, int n2, int n3) {
        int n4 = string == null ? 0 : string.length();
        if (n4 == 0) {
            return 0;
        }
        char[] arrc = string.toCharArray();
        if (n4 < 64 && string.indexOf(10) == -1 && this.calTextWidth(arrc, 0, n4) <= n2) {
            return string.length();
        }
        int n5 = 0;
        int n6 = 0;
        block0: while (n3 > 0) {
            int n7 = n5;
            int n8 = 0;
            int n9 = 1;
            while (n3 > 0) {
                n6 = n7 + n9 - 1;
                if (n6 >= n4) {
                    return n6 + 1;
                }
                char c2 = arrc[n6];
                n8 += this.getCharWidth(c2);
                if (c2 == '\n') {
                    for (n5 = n6 + 1; n5 < n4 && arrc[n5] == ' '; ++n5) {
                    }
                    --n3;
                    continue block0;
                }
                if (n8 < n2) {
                    ++n9;
                    continue;
                }
                while (n6 > n7 && arrc[n6] != ' ') {
                    --n6;
                }
                if (arrc[n6] == ' ') {
                    n5 = n6 + 1;
                    --n3;
                    continue block0;
                }
                n5 = n5 + n9 - 1;
                --n3;
                continue block0;
            }
        }
        return n6 + 1;
    }

    public final Vector a(Vector vector, String string, int n2) {
        vector.removeAllElements();
        int n3 = string == null ? 0 : string.length();
        if (n3 == 0) {
            return vector;
        }
        char[] arrc = string.toCharArray();
        if (n3 < 64 && string.indexOf(10) == -1 && this.calTextWidth(arrc, 0, n3) <= n2) {
            vector.addElement(string);
            return vector;
        }
        int n4 = 0;
        block0: while (true) {
            int n5;
            int n6 = n4;
            int n7 = 0;
            int n8 = 1;
            while (true) {
                if ((n5 = n6 + n8 - 1) >= n3) {
                    if (n6 < n3) {
                        vector.addElement(new String(arrc, n6, n3 - n6));
                    }
                    return vector;
                }
                char c2 = arrc[n5];
                n7 += this.getCharWidth(c2);
                if (c2 == '\n') {
                    for (n4 = n5 + 1; n4 < n3 && arrc[n4] == ' '; ++n4) {
                    }
                    vector.addElement(new String(arrc, n6, n5 - n6));
                    continue block0;
                }
                if (n7 >= n2) break;
                ++n8;
            }
            while (n5 > n6 && arrc[n5] != ' ') {
                --n5;
            }
            if (arrc[n5] == ' ') {
                n4 = n5 + 1;
                vector.addElement(new String(arrc, n6, n5 - n6));
                continue;
            }
            n4 = n4 + n8 - 1;
            vector.addElement(new String(arrc, n6, n4 - n6));
        }
    }

    public static final MFont createMFont(String fontPath, int color, int borderColor, boolean isBigFont) {
        return new b(fontPath, color, borderColor, isBigFont);
    }

    public static final MFont createMFont(String fontPath, int color, boolean isBigFont) {
        return b.createMFont(fontPath, color, -1, isBigFont);
    }
}

