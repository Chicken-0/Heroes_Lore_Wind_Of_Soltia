package rpg;

/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 */
import java.util.Random;
import javax.microedition.lcdui.Graphics;

public abstract class ck
implements u {
    public byte var_byte_a;
    public byte var_byte_b;
    public boolean var_boolean_a;
    public boolean var_boolean_b;
    public short posX;
    public short posY;
    public byte var_byte_c;
    public byte var_byte_d;
    public byte e = 1;
    public static Random var_java_util_Random_a = new Random();
    public ck var_ck_a;
    public ck var_ck_b;
    public boolean var_boolean_c = false;

    public ck(short posX, short posY, byte by2, byte by3) {
        this.a(posX, posY);
        this.void_b();
        this.var_byte_c = by2;
        this.var_byte_d = by3;
    }

    public void a(short posX, short posY) {
        this.posX = posX;
        this.posY = posY;
    }

    public final void void_b() {
        this.var_byte_b = (byte)(this.posY >> 4);
        this.var_byte_a = (byte)(this.posX >> 4);
        this.var_boolean_b = (this.posY & 0xF) != 0;
        this.var_boolean_a = (this.posX & 0xF) != 0;
    }

    public final ck ck_a(byte by2, byte by3) {
        ae ae2 = n.var_ae_a;
        switch (by2) {
            case 1: {
                if (this.var_byte_b - by3 < 0) {
                    return null;
                }
                return ae2.arrayMapTileInfo[this.var_byte_b - by3][this.var_byte_a];
            }
            case 2: {
                if (this.var_byte_b + by3 >= ae2.mapTileVerticalCount) {
                    return null;
                }
                return ae2.arrayMapTileInfo[this.var_byte_b + by3][this.var_byte_a];
            }
            case 3: {
                if (this.var_byte_a - by3 < 0) {
                    return null;
                }
                return ae2.arrayMapTileInfo[this.var_byte_b][this.var_byte_a - by3];
            }
            case 4: {
                if (this.var_byte_a + by3 >= ae2.mapTileHorizontalCount) {
                    return null;
                }
                return ae2.arrayMapTileInfo[this.var_byte_b][this.var_byte_a + by3];
            }
        }
        return null;
    }

    public abstract void a(Graphics var1, int var2, int var3);

//    public static {
//        var_java_util_Random_a = new Random();
//    }
}

