package rpg;

import java.io.DataInputStream;
import java.io.InputStream;
import java.util.Enumeration;
import java.util.Vector;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

// $FF: renamed from: az
public class MFont {

    // $FF: renamed from: a boolean
    public boolean isBigFont;
    // $FF: renamed from: b boolean
    public boolean activeControlChar;
    // $FF: renamed from: c int
    private int color1;
    // $FF: renamed from: a javax.microedition.lcdui.Image
    private Image fontImage;
    // $FF: renamed from: a int
    public int field_int_a;
    // $FF: renamed from: d int
    private int field_int_d;
    // $FF: renamed from: b int
    public int field_int_b = 2;
    // $FF: renamed from: e int
    private int field_int_e;
    // $FF: renamed from: f int
    private int field_int_f;
    // $FF: renamed from: a short[]
    private short[] field_array_short_a;
    // $FF: renamed from: c boolean
    private boolean field_boolean_c = true;
    // $FF: renamed from: a int[]
    private static final int[] field_array_int_a = new int[256];

    public MFont(String fontPath, int color1, int color2, boolean isBigFont) {
        this.isBigFont = isBigFont;
        InputStream fileStream = this.getClass().getResourceAsStream("/" + fontPath + ".mf");
        this.deserializeFontFile(fileStream, color1, color2);
    }

    // $FF: renamed from: a (java.io.InputStream, int, int) void
    public final void deserializeFontFile(InputStream inputStream, int color1, int color2) {
        this.color1 = color1;

        try {
            inputStream.read();
            inputStream.read();
            inputStream.read();
            inputStream.read();
            this.field_int_a = inputStream.read();
            this.field_boolean_c = false;
            if (this.field_int_a - 100 > 0) {
                this.field_int_a -= 100;
                this.field_boolean_c = true;
            }

            this.field_int_d = inputStream.read();
            this.field_int_e = inputStream.read();
            this.field_int_f = inputStream.read();
            this.field_array_short_a = new short[95 + (this.field_boolean_c ? 9 : 0)];

            int var5;
            int var6;
            int imageLength;
            for (var5 = 0; var5 < 95 + (this.field_boolean_c ? 9 : 0); ++var5) {
                var6 = inputStream.read();
                imageLength = inputStream.read();
                this.field_array_short_a[var5] = (short) ((var6 & 255) << 8 | imageLength & 255);
            }

            var5 = inputStream.read();
            var6 = inputStream.read();
            imageLength = (var5 & 255) << 8 | var6 & 255;
            int var8 = inputStream.read();
            int var9 = inputStream.read();
            int var10 = (var8 & 255) << 8 | var9 & 255;
            int var11 = inputStream.read();
            int var12 = inputStream.read();
            int var13 = var11 == 255 && var12 == 255 ? -1 : (var11 & 255) << 8 | var12 & 255;
            int var14 = inputStream.read();
            int var15 = inputStream.read();
            int var16 = (var14 & 255) << 8 | var15 & 255;
            DataInputStream var17 = new DataInputStream(inputStream);
            byte[] imageData = new byte[imageLength];
            var17.readFully(imageData);
            var17.close();
            if (var13 > 0) {
                this.func_void_a(imageData, var10, var13, color1, var16, color2);
            }

            this.fontImage = Image.createImage(imageData, 0, imageLength);
        } catch (Exception ex) {
            throw new RuntimeException("MFont: " + ex);
        }
    }

    // $FF: renamed from: a (java.lang.String) int
    public final int getTextWidth(String text) {
        if (text == null) {
            return 0;
        } else {
            char[] arrayCharacter = text.toCharArray();
            return this.calTextWidth((char[]) arrayCharacter, 0, arrayCharacter.length);
        }
    }

    // $FF: renamed from: a (char[], int, int) int
    public final int calTextWidth(char[] arrayCharacter, int start, int end) {
        int textWidthResult = 0;
        int length = start + end;

        for (int i = start; i < length; ++i) {
            if (!this.isControlChar(arrayCharacter[i])) {
                textWidthResult += this.getCharWidth(arrayCharacter[i]) - this.field_int_f;
            }
        }

        return textWidthResult;
    }

    // $FF: renamed from: a (char) int
    public final int getCharWidth(char character) {
        if (character == 0x153) {
            return 7;
        } else if (character > 0x20 && character < 0x100) {
            boolean var2;
            if (var2 = 0xC0 <= character && 0xDF > character) {
                character = (char) (character + 0x20);
            }

            if (character > 0x7F) {
                switch (character) {
                    case 161:
                        character = 0x81;
                        break;
                    case 162:
                    case 163:
                    case 164:
                    case 165:
                    case 166:
                    case 167:
                    case 168:
                    case 169:
                    case 170:
                    case 171:
                    case 172:
                    case 173:
                    case 174:
                    case 175:
                    case 177:
                    case 178:
                    case 179:
                    case 180:
                    case 181:
                    case 182:
                    case 183:
                    case 184:
                    case 185:
                    case 186:
                    case 187:
                    case 188:
                    case 189:
                    case 190:
                    case 192:
                    case 193:
                    case 194:
                    case 195:
                    case 196:
                    case 197:
                    case 198:
                    case 199:
                    case 200:
                    case 201:
                    case 202:
                    case 203:
                    case 204:
                    case 205:
                    case 206:
                    case 207:
                    case 208:
                    case 209:
                    case 210:
                    case 211:
                    case 212:
                    case 213:
                    case 214:
                    case 215:
                    case 216:
                    case 217:
                    case 218:
                    case 219:
                    case 220:
                    case 221:
                    case 222:
                    case 240:
                    case 247:
                    case 248:
                    default:
                        character = '.';
                    case 176:
                        break;
                    case 191:
                        character = 0x82;
                        break;
                    case 223:
                        character = 0x7F;
                        break;
                    case 224:
                    case 225:
                    case 226:
                    case 227:
                    case 228:
                    case 229:
                        character = 'a';
                        break;
                    case 230:
                        character = var2 ? (char) 0x88 : (char) 0x8A;
                        break;
                    case 231:
                        character = var2 ? (char) 0x80 : (char) 0x89;
                        break;
                    case 232:
                    case 233:
                    case 234:
                    case 235:
                        character = 101;
                        break;
                    case 236:
                    case 237:
                    case 238:
                    case 239:
                        character = 105;
                        break;
                    case 241:
                        character = 110;
                        break;
                    case 242:
                    case 243:
                    case 244:
                    case 245:
                    case 246:
                        character = 111;
                        break;
                    case 249:
                    case 250:
                    case 251:
                    case 252:
                        character = 117;
                }
            }

            if (character >= 136) {
                switch (character) {
                    case 136:
                        return 8;
                    case 137:
                        return 5;
                    case 138:
                        return 7;
                    case 176:
                        return 4;
                }
            }

            int var3 = this.field_array_short_a[character - 33 + 1] - this.field_array_short_a[character - 33];
            if ((this.isBigFont || var2) && character >= 97 && character <= 122) {
                char var4 = (char) (character - 32);
                var3 = this.field_array_short_a[var4 - 33 + 1] - this.field_array_short_a[var4 - 33];
            }

            return var3;
        } else {
            return character == 32 ? this.field_int_e : 0;
        }
    }

    // $FF: renamed from: b (char[], int, int) int
    public final int func_int_b(char[] var1, int var2, int var3) {
        int var4 = var2 + var3;

        for (int var5 = var2; var5 < var4; ++var5) {
            char var6 = var1[var5];
            if ("gjpqy,;_|ç¡¿".indexOf(var6) != -1) {
                return this.field_int_a;
            }
        }

        return this.field_int_d + 1;
    }

    // $FF: renamed from: a (java.util.Vector) int
    public final int func_int_a(Vector var1) {
        return (this.field_int_a + this.field_int_b) * var1.size();
    }

    // $FF: renamed from: a (javax.microedition.lcdui.Graphics, java.lang.String, int, int, int) int
    public final int func_int_a(Graphics var1, String var2, int var3, int var4, int var5) {
        return this.func_int_a(var1, (String) var2, 0, var2.length(), var3, var4, var5);
    }

    // $FF: renamed from: a (javax.microedition.lcdui.Graphics, char[], int, int, int) int
    public final int func_int_a(Graphics var1, char[] var2, int var3, int var4, int var5) {
        return this.func_int_a(var1, (char[]) var2, 0, var2.length, var3, var4, var5);
    }

    // $FF: renamed from: a (javax.microedition.lcdui.Graphics, java.util.Vector, int, int, int, int) int
    public final int func_int_a(Graphics var1, Vector var2, int var3, int var4, int var5, int var6) {
        int var7 = var4;
        int var8 = this.field_int_a + this.field_int_b;

        for (Enumeration var9 = var2.elements(); var9.hasMoreElements(); var7 += var8) {
            String var10 = (String) var9.nextElement();
            if (var7 + var8 >= var1.getClipY() && var7 < var5) {
                this.func_int_a(var1, (char[]) var10.toCharArray(), 0, var10.length(), var3, var7, var6);
            }
        }

        return var7 - var4;
    }

    // $FF: renamed from: a (javax.microedition.lcdui.Graphics, java.lang.String, int, int, int, int, int) int
    public final int func_int_a(Graphics var1, String var2, int var3, int var4, int var5, int var6, int var7) {
        return this.func_int_a(var1, (char[]) var2.substring(var3, var4).toCharArray(), 0, var4 - var3, var5, var6, var7);
    }

    // $FF: renamed from: a (javax.microedition.lcdui.Graphics, char[], int, int, int, int, int) int
    public final int func_int_a(Graphics var1, char[] var2, int var3, int var4, int var5, int var6, int var7) {
        int var8 = var1.getClipX();
        int var9 = var1.getClipY();
        int var10 = var1.getClipWidth();
        int var11 = var1.getClipHeight();
        if ((var7 & 1) != 0) {
            var5 -= this.calTextWidth(var2, var3, var4) / 2;
        } else if ((var7 & 8) != 0) {
            var5 -= this.calTextWidth(var2, var3, var4);
        }

        if ((var7 & 32) != 0) {
            var6 -= this.func_int_b(var2, var3, var4);
        } else if ((var7 & 64) != 0) {
            var6 -= this.field_int_d;
        }

        int var12 = 0;
        int var13 = var3 + var4;
        boolean var14 = false;
        boolean var15 = false;

        for (int var16 = var3; var16 < var13; ++var16) {
            if (var5 > var8 + var10) {
                var1.setClip(var8, var9, var10, var11);
                return var12;
            }

            int var17 = var2[var16];
            if (!this.isControlChar((char) var17)) {
                byte var18 = -1;
                byte var19 = 0;
                if (var17 == 32) {
                    var5 += this.field_int_e;
                    var12 += this.field_int_e;
                } else {
                    boolean var20 = false;
                    if (var17 == 339) {
                        var17 = this.isBigFont ? 139 : 140;
                    } else {
                        if (var17 <= 32 || var17 >= 256) {
                            continue;
                        }

                        if (var20 = 192 <= var17 && 223 > var17) {
                            var17 = (char) (var17 + 32);
                        }

                        if (var17 > 127) {
                            switch (var17) {
                                case 161:
                                    var17 = 129;
                                    break;
                                case 162:
                                case 163:
                                case 164:
                                case 165:
                                case 166:
                                case 167:
                                case 168:
                                case 169:
                                case 170:
                                case 171:
                                case 172:
                                case 173:
                                case 174:
                                case 175:
                                case 177:
                                case 178:
                                case 179:
                                case 180:
                                case 181:
                                case 182:
                                case 183:
                                case 184:
                                case 185:
                                case 186:
                                case 187:
                                case 188:
                                case 189:
                                case 190:
                                case 192:
                                case 193:
                                case 194:
                                case 195:
                                case 196:
                                case 197:
                                case 198:
                                case 199:
                                case 200:
                                case 201:
                                case 202:
                                case 203:
                                case 204:
                                case 205:
                                case 206:
                                case 207:
                                case 208:
                                case 209:
                                case 210:
                                case 211:
                                case 212:
                                case 213:
                                case 214:
                                case 215:
                                case 216:
                                case 217:
                                case 218:
                                case 219:
                                case 220:
                                case 221:
                                case 222:
                                case 240:
                                case 247:
                                case 248:
                                default:
                                    var17 = 46;
                                case 176:
                                    break;
                                case 191:
                                    var17 = 130;
                                    break;
                                case 223:
                                    var17 = 127;
                                    break;
                                case 224:
                                    var17 = 97;
                                    var18 = 0;
                                    var19 = 1;
                                    break;
                                case 225:
                                    var17 = 97;
                                    var18 = 1;
                                    var19 = 1;
                                    break;
                                case 226:
                                    var17 = 97;
                                    var18 = 2;
                                    var19 = 1;
                                    break;
                                case 227:
                                    var17 = 97;
                                    var18 = 3;
                                    var19 = 1;
                                    break;
                                case 228:
                                    var17 = 97;
                                    var18 = 4;
                                    var19 = 1;
                                    break;
                                case 229:
                                    var17 = 97;
                                    break;
                                case 230:
                                    var17 = !this.isBigFont && !var20 ? 138 : 136;
                                    break;
                                case 231:
                                    var17 = !this.isBigFont && !var20 ? 137 : 128;
                                    break;
                                case 232:
                                    var17 = 101;
                                    var18 = 0;
                                    var19 = 1;
                                    break;
                                case 233:
                                    var17 = 101;
                                    var18 = 1;
                                    var19 = 1;
                                    break;
                                case 234:
                                    var17 = 101;
                                    var18 = 2;
                                    var19 = 1;
                                    break;
                                case 235:
                                    var17 = 101;
                                    var18 = 3;
                                    var19 = 1;
                                    break;
                                case 236:
                                    var17 = 105;
                                    var18 = 0;
                                    var19 = -1;
                                    break;
                                case 237:
                                    var17 = 105;
                                    var18 = 1;
                                    var19 = 0;
                                    break;
                                case 238:
                                    var17 = 105;
                                    var18 = 2;
                                    var19 = -1;
                                    break;
                                case 239:
                                    var17 = 105;
                                    var18 = 4;
                                    var19 = -1;
                                    break;
                                case 241:
                                    var17 = 110;
                                    var18 = 3;
                                    var19 = 1;
                                    break;
                                case 242:
                                    var17 = 111;
                                    var18 = 0;
                                    var19 = 1;
                                    break;
                                case 243:
                                    var17 = 111;
                                    var18 = 1;
                                    var19 = 1;
                                    break;
                                case 244:
                                    var17 = 111;
                                    var18 = 2;
                                    var19 = 1;
                                    break;
                                case 245:
                                    var17 = 111;
                                    var18 = 3;
                                    var19 = 1;
                                    break;
                                case 246:
                                    var17 = 111;
                                    var18 = 4;
                                    var19 = 1;
                                    break;
                                case 249:
                                    var17 = 117;
                                    var18 = 0;
                                    var19 = 1;
                                    break;
                                case 250:
                                    var17 = 117;
                                    var18 = 1;
                                    var19 = 1;
                                    break;
                                case 251:
                                    var17 = 117;
                                    var18 = 2;
                                    var19 = 1;
                                    break;
                                case 252:
                                    var17 = 117;
                                    var18 = 4;
                                    var19 = 1;
                            }
                        }

                        if ((this.isBigFont || var20) && var17 >= 97 && var17 <= 122) {
                            var17 = (char) (var17 - 32);
                        }
                    }

                    short var21 = 0;
                    int var22 = 0;
                    switch (var17) {
                        case 136:
                            var21 = this.field_array_short_a[this.field_array_short_a.length - 1];
                            var22 = 8;
                            break;
                        case 137:
                            var21 = (short) (this.field_array_short_a[this.field_array_short_a.length - 1] + 8);
                            var22 = 5;
                            break;
                        case 138:
                            var21 = (short) (this.field_array_short_a[this.field_array_short_a.length - 1] + 8 + 5);
                            var22 = 7;
                            break;
                        case 139:
                            var21 = (short) (this.field_array_short_a[this.field_array_short_a.length - 1] + 8 + 5 + 7);
                            var22 = 7;
                            break;
                        case 140:
                            var21 = (short) (this.field_array_short_a[this.field_array_short_a.length - 1] + 8 + 5 + 7 + 7);
                            var22 = 7;
                            break;
                        case 176:
                            var1.setColor(this.color1);
                            var1.setClip(var5, var6, 4, 4);
                            var1.drawArc(var5, var6, 2, 2, 0, 360);
                            var5 += 4;
                            var12 += 4;
                            continue;
                        default:
                            int var23;
                            if ((var23 = var17 - 33) >= 0 && var23 < this.field_array_short_a.length - 1) {
                                var21 = this.field_array_short_a[var23];
                                var22 = this.field_array_short_a[var23 + 1] - var21;
                            }
                    }

                    short var26 = this.field_boolean_c ? this.field_array_short_a[98 + var18] : 0;
                    int var24 = this.field_boolean_c ? this.field_array_short_a[98 + var18 + 1] - var26 : 0;
                    if (var5 + var22 - this.field_int_f < var8) {
                        var5 += var22 - this.field_int_f;
                        var12 += var22 - this.field_int_f;
                    } else {
                        var1.setClip(var8, var9, var10, var11);
                        if (var17 == 105 && var18 >= 0) {
                            var1.clipRect(var5, var6 + 1, var22, this.field_int_a);
                        } else {
                            var1.clipRect(var5, var6, var22, this.field_int_a);
                        }

                        var1.drawImage(this.fontImage, var5 - var21, var6, 20);
                        if (var18 >= 0) {
                            var1.setClip(var8, var9, var10, var11);
                            var24 = var18 != 4 ? var24 : var24 + 1;
                            byte var25 = 0;
                            if (this.isBigFont || var20) {
                                var25 = 2;
                            }

                            if (var17 == 105 && var18 >= 0) {
                                var1.clipRect(var5 - 1, var6 - 1 - var25, var24 + var19, this.field_int_a + var25);
                            } else {
                                var1.clipRect(var5, var6 - 1 - var25, var24 + var19, this.field_int_a + var25);
                            }

                            var1.drawImage(this.fontImage, var5 - var26 + var19, var6 - 1 - var25, 20);
                        }

                        var5 += var22 - this.field_int_f;
                        var12 += var22 - this.field_int_f;
                    }
                }
            }
        }

        var1.setClip(var8, var9, var10, var11);
        return var12;
    }

    // $FF: renamed from: a (char) boolean
    private boolean isControlChar(char character) {
        if (this.activeControlChar) {
            switch (character) {
                case '$':
                case '@':
                case '|':
                    return true;
            }
        }

        return false;
    }

    // $FF: renamed from: a (byte[], int, int, int, int, int) void
    private void func_void_a(byte[] var1, int var2, int var3, int color1, int var5, int color2) {
        int var7 = (var1[var2] & 255) << 24 | (var1[var2 + 1] & 255) << 16 | (var1[var2 + 2] & 255) << 8 | var1[var2 + 3] & 255;
        var1[var3] = (byte) (color1 >> 16);
        var1[var3 + 1] = (byte) (color1 >> 8);
        var1[var3 + 2] = (byte) color1;
        if (var5 > 0 && color2 >= 0) {
            var1[var5] = (byte) (color2 >> 16);
            var1[var5 + 1] = (byte) (color2 >> 8);
            var1[var5 + 2] = (byte) color2;
        }

        int var8 = this.func_int_a(var1, var2 + 4, var7 + 4);
        int var9 = var2 + 8 + var7;
        var1[var9] = (byte) (var8 >> 24);
        var1[var9 + 1] = (byte) (var8 >> 16);
        var1[var9 + 2] = (byte) (var8 >> 8);
        var1[var9 + 3] = (byte) var8;
    }

    // $FF: renamed from: a (byte[], int, int) int
    private int func_int_a(byte[] var1, int var2, int var3) {
        int var4 = -1;

        while (true) {
            --var3;
            if (var3 < 0) {
                return ~var4;
            }

            var4 = field_array_int_a[(var4 ^ var1[var2++]) & 255] ^ var4 >>> 8;
        }
    }

    static {
        for (int var0 = 0; var0 < 256; ++var0) {
            int var1 = var0;

            for (int var2 = 0; var2 < 8; ++var2) {
                if ((var1 & 1) != 0) {
                    var1 = -306674912 ^ var1 >>> 1;
                } else {
                    var1 >>>= 1;
                }

                field_array_int_a[var0] = var1;
            }
        }

    }
}
