package rpg;

/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 *  javax.microedition.lcdui.Image
 */
import java.io.DataInputStream;
import java.io.InputStream;
import java.util.Enumeration;
import java.util.Vector;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public class MFont {
    public boolean isBigFont;
    public boolean activeControlChar;
    private int var_int_c;
    private Image var_javax_microedition_lcdui_Image_a;
    public int var_int_a;
    private int d;
    public int var_int_b = 2;
    private int e;
    private int f;
    private short[] var_short_arr_a;
    private boolean var_boolean_c = true;
    private static final int[] var_int_arr_a = new int[256];

    public MFont(String fontPath, int color, int n3, boolean isBigFont) {
        
        for (int i2 = 0; i2 < 256; ++i2) {
            int n22 = i2;
            for (int i3 = 0; i3 < 8; ++i3) {
                n22 = (n22 & 1) != 0 ? 0xEDB88320 ^ n22 >>> 1 : (n22 >>>= 1);
                MFont.var_int_arr_a[i2] = n22;
            }
        }
        
        this.isBigFont = isBigFont;
        InputStream inputStream = this.getClass().getResourceAsStream("/" + fontPath + ".mf");
        this.a(inputStream, color, n3);
    }

    public final void a(InputStream inputStream, int color, int n3) {
        this.var_int_c = color;
        try {
            int n4;
            int n5;
            int n6;
            inputStream.read();
            inputStream.read();
            inputStream.read();
            inputStream.read();
            this.var_int_a = inputStream.read();
            this.var_boolean_c = false;
            if (this.var_int_a - 100 > 0) {
                this.var_int_a -= 100;
                this.var_boolean_c = true;
            }
            this.d = inputStream.read();
            this.e = inputStream.read();
            this.f = inputStream.read();
            this.var_short_arr_a = new short[95 + (this.var_boolean_c ? 9 : 0)];
            for (n6 = 0; n6 < 95 + (this.var_boolean_c ? 9 : 0); ++n6) {
                n5 = inputStream.read();
                n4 = inputStream.read();
                this.var_short_arr_a[n6] = (short)((n5 & 0xFF) << 8 | n4 & 0xFF);
            }
            n6 = inputStream.read();
            n5 = inputStream.read();
            n4 = (n6 & 0xFF) << 8 | n5 & 0xFF;
            int n7 = inputStream.read();
            int n8 = inputStream.read();
            int n9 = (n7 & 0xFF) << 8 | n8 & 0xFF;
            int n10 = inputStream.read();
            int n11 = inputStream.read();
            int n12 = n10 == 255 && n11 == 255 ? -1 : (n10 & 0xFF) << 8 | n11 & 0xFF;
            int n13 = inputStream.read();
            int n14 = inputStream.read();
            int n15 = (n13 & 0xFF) << 8 | n14 & 0xFF;
            DataInputStream dataInputStream = new DataInputStream(inputStream);
            byte[] arrby = new byte[n4];
            dataInputStream.readFully(arrby);
            dataInputStream.close();
            if (n12 > 0) {
                this.a(arrby, n9, n12, color, n15, n3);
            }
            this.var_javax_microedition_lcdui_Image_a = Image.createImage((byte[])arrby, (int)0, (int)n4);
            return;
        }
        catch (Exception exception) {
            throw new RuntimeException("MFont: " + exception);
        }
    }

    public final int getTextWidth(String string) {
        if (string == null) {
            return 0;
        }
        char[] arrc = string.toCharArray();
        return this.calTextWidth(arrc, 0, arrc.length);
    }

    public final int calTextWidth(char[] arrc, int start, int end) {
        int textWidth = 0;
        int length = start + end;
        for (int i = start; i < length; ++i) {
            if (this.isControlChar(arrc[i])) continue;
            textWidth += this.getCharWidth(arrc[i]) - this.f;
        }
        return textWidth;
    }

    public final int getCharWidth(char c2) {
        if (c2 == '\u0153') {
            return 7;
        }
        if (c2 > ' ' && c2 < '\u0100') {
            boolean bl2 = '\u00c0' <= c2 && '\u00df' > c2;
            if (bl2) {
                c2 = (char)(c2 + 32);
            }
            if (c2 > '\u007f') {
                switch (c2) {
                    case '\u00e8': 
                    case '\u00e9': 
                    case '\u00ea': 
                    case '\u00eb': {
                        c2 = (char)101;
                        break;
                    }
                    case '\u00e0': 
                    case '\u00e1': 
                    case '\u00e2': 
                    case '\u00e3': 
                    case '\u00e4': 
                    case '\u00e5': {
                        c2 = (char)97;
                        break;
                    }
                    case '\u00f9': 
                    case '\u00fa': 
                    case '\u00fb': 
                    case '\u00fc': {
                        c2 = (char)117;
                        break;
                    }
                    case '\u00f2': 
                    case '\u00f3': 
                    case '\u00f4': 
                    case '\u00f5': 
                    case '\u00f6': {
                        c2 = (char)111;
                        break;
                    }
                    case '\u00ec': 
                    case '\u00ed': 
                    case '\u00ee': 
                    case '\u00ef': {
                        c2 = (char)105;
                        break;
                    }
                    case '\u00f1': {
                        c2 = (char)110;
                        break;
                    }
                    case '\u00df': {
                        c2 = (char)127;
                        break;
                    }
                    case '\u00a1': {
                        c2 = (char)129;
                        break;
                    }
                    case '\u00bf': {
                        c2 = (char)130;
                        break;
                    }
                    case '\u00e7': {
                        c2 = (char)(bl2 ? 128 : 137);
                        break;
                    }
                    case '\u00e6': {
                        c2 = (char)(bl2 ? 136 : 138);
                        break;
                    }
                    case '\u00b0': {
                        break;
                    }
                    default: {
                        c2 = (char)46;
                    }
                }
            }
            if (c2 >= '\u0088') {
                switch (c2) {
                    case '\u0088': {
                        return 8;
                    }
                    case '\u0089': {
                        return 5;
                    }
                    case '\u008a': {
                        return 7;
                    }
                    case '\u00b0': {
                        return 4;
                    }
                }
            }
            int n2 = this.var_short_arr_a[c2 - 33 + 1] - this.var_short_arr_a[c2 - 33];
            if ((this.isBigFont || bl2) && c2 >= 'a' && c2 <= 'z') {
                c2 = (char)(c2 - 32);
                n2 = this.var_short_arr_a[c2 - 33 + 1] - this.var_short_arr_a[c2 - 33];
            }
            return n2;
        }
        if (c2 == ' ') {
            return this.e;
        }
        return 0;
    }

    public final int b(char[] arrc, int n2, int n3) {
        int n4 = n2 + n3;
        for (int i2 = n2; i2 < n4; ++i2) {
            char c2 = arrc[i2];
            if ("gjpqy,;_|\u00e7\u00a1\u00bf".indexOf(c2) == -1) continue;
            return this.var_int_a;
        }
        return this.d + 1;
    }

    public final int a(Vector vector) {
        return (this.var_int_a + this.var_int_b) * vector.size();
    }

    public final int a(Graphics graphics, String string, int n2, int n3, int n4) {
        return this.a(graphics, string, 0, string.length(), n2, n3, n4);
    }

    public final int a(Graphics graphics, char[] arrc, int n2, int n3, int n4) {
        return this.a(graphics, arrc, 0, arrc.length, n2, n3, n4);
    }

    public final int a(Graphics graphics, Vector vector, int n2, int n3, int n4, int n5) {
        int n6 = n3;
        int n7 = this.var_int_a + this.var_int_b;
        Enumeration enumeration = vector.elements();
        while (enumeration.hasMoreElements()) {
            String string = (String)enumeration.nextElement();
            if (n6 + n7 >= graphics.getClipY() && n6 < n4) {
                this.a(graphics, string.toCharArray(), 0, string.length(), n2, n6, n5);
            }
            n6 += n7;
        }
        return n6 - n3;
    }

    public final int a(Graphics graphics, String string, int n2, int n3, int n4, int n5, int n6) {
        return this.a(graphics, string.substring(n2, n3).toCharArray(), 0, n3 - n2, n4, n5, n6);
    }

    public final int a(Graphics graphics, char[] arrc, int n2, int n3, int n4, int n5, int n6) {
        int n7 = graphics.getClipX();
        int n8 = graphics.getClipY();
        int n9 = graphics.getClipWidth();
        int n10 = graphics.getClipHeight();
        if ((n6 & 1) != 0) {
            n4 -= this.calTextWidth(arrc, n2, n3) / 2;
        } else if ((n6 & 8) != 0) {
            n4 -= this.calTextWidth(arrc, n2, n3);
        }
        if ((n6 & 0x20) != 0) {
            n5 -= this.b(arrc, n2, n3);
        } else if ((n6 & 0x40) != 0) {
            n5 -= this.d;
        }
        int n11 = 0;
        int n12 = n2 + n3;
        boolean bl2 = false;
        boolean bl3 = false;
        block40: for (int i2 = n2; i2 < n12; ++i2) {
            int n13;
            int n14;
            if (n4 > n7 + n9) {
                graphics.setClip(n7, n8, n9, n10);
                return n11;
            }
            int n15 = arrc[i2];
            if (this.isControlChar((char)n15)) continue;
            int n16 = -1;
            int n17 = 0;
            if (n15 == 32) {
                n4 += this.e;
                n11 += this.e;
                continue;
            }
            boolean bl4 = false;
            if (n15 == 339) {
                n15 = this.isBigFont ? 139 : 140;
            } else {
                if (n15 <= 32 || n15 >= 256) continue;
                bl4 = 192 <= n15 && 223 > n15;
                if (bl4) {
                    n15 = (char)(n15 + 32);
                }
                if (n15 > 127) {
                    switch (n15) {
                        case 232: {
                            n15 = 101;
                            n16 = 0;
                            n17 = 1;
                            break;
                        }
                        case 233: {
                            n15 = 101;
                            n16 = 1;
                            n17 = 1;
                            break;
                        }
                        case 234: {
                            n15 = 101;
                            n16 = 2;
                            n17 = 1;
                            break;
                        }
                        case 235: {
                            n15 = 101;
                            n16 = 3;
                            n17 = 1;
                            break;
                        }
                        case 224: {
                            n15 = 97;
                            n16 = 0;
                            n17 = 1;
                            break;
                        }
                        case 225: {
                            n15 = 97;
                            n16 = 1;
                            n17 = 1;
                            break;
                        }
                        case 226: {
                            n15 = 97;
                            n16 = 2;
                            n17 = 1;
                            break;
                        }
                        case 227: {
                            n15 = 97;
                            n16 = 3;
                            n17 = 1;
                            break;
                        }
                        case 228: {
                            n15 = 97;
                            n16 = 4;
                            n17 = 1;
                            break;
                        }
                        case 229: {
                            n15 = 97;
                            break;
                        }
                        case 249: {
                            n15 = 117;
                            n16 = 0;
                            n17 = 1;
                            break;
                        }
                        case 250: {
                            n15 = 117;
                            n16 = 1;
                            n17 = 1;
                            break;
                        }
                        case 251: {
                            n15 = 117;
                            n16 = 2;
                            n17 = 1;
                            break;
                        }
                        case 252: {
                            n15 = 117;
                            n16 = 4;
                            n17 = 1;
                            break;
                        }
                        case 242: {
                            n15 = 111;
                            n16 = 0;
                            n17 = 1;
                            break;
                        }
                        case 243: {
                            n15 = 111;
                            n16 = 1;
                            n17 = 1;
                            break;
                        }
                        case 244: {
                            n15 = 111;
                            n16 = 2;
                            n17 = 1;
                            break;
                        }
                        case 245: {
                            n15 = 111;
                            n16 = 3;
                            n17 = 1;
                            break;
                        }
                        case 246: {
                            n15 = 111;
                            n16 = 4;
                            n17 = 1;
                            break;
                        }
                        case 236: {
                            n15 = 105;
                            n16 = 0;
                            n17 = -1;
                            break;
                        }
                        case 237: {
                            n15 = 105;
                            n16 = 1;
                            n17 = 0;
                            break;
                        }
                        case 238: {
                            n15 = 105;
                            n16 = 2;
                            n17 = -1;
                            break;
                        }
                        case 239: {
                            n15 = 105;
                            n16 = 4;
                            n17 = -1;
                            break;
                        }
                        case 241: {
                            n15 = 110;
                            n16 = 3;
                            n17 = 1;
                            break;
                        }
                        case 223: {
                            n15 = 127;
                            break;
                        }
                        case 161: {
                            n15 = 129;
                            break;
                        }
                        case 191: {
                            n15 = 130;
                            break;
                        }
                        case 231: {
                            n15 = this.isBigFont || bl4 ? 128 : 137;
                            break;
                        }
                        case 230: {
                            n15 = this.isBigFont || bl4 ? 136 : 138;
                            break;
                        }
                        case 176: {
                            break;
                        }
                        default: {
                            n15 = 46;
                        }
                    }
                }
                if ((this.isBigFont || bl4) && n15 >= 97 && n15 <= 122) {
                    n15 = (char)(n15 - 32);
                }
            }
            short s2 = 0;
            int n18 = 0;
            switch (n15) {
                case 136: {
                    s2 = this.var_short_arr_a[this.var_short_arr_a.length - 1];
                    n18 = 8;
                    break;
                }
                case 137: {
                    s2 = (short)(this.var_short_arr_a[this.var_short_arr_a.length - 1] + 8);
                    n18 = 5;
                    break;
                }
                case 138: {
                    s2 = (short)(this.var_short_arr_a[this.var_short_arr_a.length - 1] + 8 + 5);
                    n18 = 7;
                    break;
                }
                case 139: {
                    s2 = (short)(this.var_short_arr_a[this.var_short_arr_a.length - 1] + 8 + 5 + 7);
                    n18 = 7;
                    break;
                }
                case 140: {
                    s2 = (short)(this.var_short_arr_a[this.var_short_arr_a.length - 1] + 8 + 5 + 7 + 7);
                    n18 = 7;
                    break;
                }
                case 176: {
                    graphics.setColor(this.var_int_c);
                    graphics.setClip(n4, n5, 4, 4);
                    graphics.drawArc(n4, n5, 2, 2, 0, 360);
                    n4 += 4;
                    n11 += 4;
                    continue block40;
                }
                default: {
                    n14 = n15 - 33;
                    if (n14 < 0 || n14 >= this.var_short_arr_a.length - 1) break;
                    s2 = this.var_short_arr_a[n14];
                    n18 = this.var_short_arr_a[n14 + 1] - s2;
                }
            }
            n14 = this.var_boolean_c ? this.var_short_arr_a[98 + n16] : 0;
            int n19 = n13 = this.var_boolean_c ? this.var_short_arr_a[98 + n16 + 1] - n14 : 0;
            if (n4 + n18 - this.f < n7) {
                n4 += n18 - this.f;
                n11 += n18 - this.f;
                continue;
            }
            graphics.setClip(n7, n8, n9, n10);
            if (n15 == 105 && n16 >= 0) {
                graphics.clipRect(n4, n5 + 1, n18, this.var_int_a);
            } else {
                graphics.clipRect(n4, n5, n18, this.var_int_a);
            }
            graphics.drawImage(this.var_javax_microedition_lcdui_Image_a, n4 - s2, n5, 20);
            if (n16 >= 0) {
                graphics.setClip(n7, n8, n9, n10);
                n13 = n16 != 4 ? n13 : n13 + 1;
                int n20 = 0;
                if (this.isBigFont || bl4) {
                    n20 = 2;
                }
                if (n15 == 105 && n16 >= 0) {
                    graphics.clipRect(n4 - 1, n5 - 1 - n20, n13 + n17, this.var_int_a + n20);
                } else {
                    graphics.clipRect(n4, n5 - 1 - n20, n13 + n17, this.var_int_a + n20);
                }
                graphics.drawImage(this.var_javax_microedition_lcdui_Image_a, n4 - n14 + n17, n5 - 1 - n20, 20);
            }
            n4 += n18 - this.f;
            n11 += n18 - this.f;
        }
        graphics.setClip(n7, n8, n9, n10);
        return n11;
    }

    private boolean isControlChar(char c2) {
        if (this.activeControlChar) {
            switch (c2) {
                case '$': 
                case '@': 
                case '|': {
                    return true;
                }
            }
        }
        return false;
    }

    private void a(byte[] arrby, int n2, int n3, int n4, int n5, int n6) {
        int n7 = (arrby[n2] & 0xFF) << 24 | (arrby[n2 + 1] & 0xFF) << 16 | (arrby[n2 + 2] & 0xFF) << 8 | arrby[n2 + 3] & 0xFF;
        arrby[n3] = (byte)(n4 >> 16);
        arrby[n3 + 1] = (byte)(n4 >> 8);
        arrby[n3 + 2] = (byte)n4;
        if (n5 > 0 && n6 >= 0) {
            arrby[n5] = (byte)(n6 >> 16);
            arrby[n5 + 1] = (byte)(n6 >> 8);
            arrby[n5 + 2] = (byte)n6;
        }
        int n8 = this.a(arrby, n2 + 4, n7 + 4);
        int n9 = n2 + 8 + n7;
        arrby[n9] = (byte)(n8 >> 24);
        arrby[n9 + 1] = (byte)(n8 >> 16);
        arrby[n9 + 2] = (byte)(n8 >> 8);
        arrby[n9 + 3] = (byte)n8;
    }

    private int a(byte[] arrby, int n2, int n3) {
        int n4 = -1;
        while (--n3 >= 0) {
            n4 = var_int_arr_a[(n4 ^ arrby[n2++]) & 0xFF] ^ n4 >>> 8;
        }
        return ~n4;
    }

//    public static {
//        var_int_arr_a = new int[256];
//        for (int i2 = 0; i2 < 256; ++i2) {
//            int n2 = i2;
//            for (int i3 = 0; i3 < 8; ++i3) {
//                n2 = (n2 & 1) != 0 ? 0xEDB88320 ^ n2 >>> 1 : (n2 >>>= 1);
//                az.var_int_arr_a[i2] = n2;
//            }
//        }
//    }
}

