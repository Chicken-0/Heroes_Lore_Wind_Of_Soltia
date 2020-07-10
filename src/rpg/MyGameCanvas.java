package rpg;

import javax.microedition.lcdui.Canvas;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

// $FF: renamed from: r
public abstract class MyGameCanvas extends Canvas {

    // $FF: renamed from: a boolean
    public boolean field_boolean_a = false;
    // $FF: renamed from: f int
    public int field_int_f = 0;
    // $FF: renamed from: g int
    public static int canvasWidth;
    // $FF: renamed from: h int
    public static int field_int_h;
    // $FF: renamed from: i int
    public static int canvasHalfWidth;
    // $FF: renamed from: j int
    public static int field_int_j;
    // $FF: renamed from: b boolean
    public static boolean field_boolean_b;
    // $FF: renamed from: k int
    public static int field_int_k;
    // $FF: renamed from: l int
    public static int field_int_l;
    // $FF: renamed from: m int
    public static int field_int_m;

    public MyGameCanvas() {
        System.out.println("MyGameCanvas");
        this.setFullScreenMode(true);
        canvasWidth = this.getWidth();
        canvasHalfWidth = canvasWidth / 2;
    }

    // $FF: renamed from: i () void
    public final void func_void_i() {
        this.field_boolean_a = false;
        if (this.field_int_f != 0) {
            this.keyReleased(this.field_int_f);
            this.field_int_f = 0;
        }

    }

    // $FF: renamed from: c (javax.microedition.lcdui.Graphics, int, int, int, int) void
    public static final void func_void_c(Graphics var0, int var1, int var2, int var3, int var4) {
        func_void_a(var0, var1, var2, var3, var4, 0);
    }

    // $FF: renamed from: a (javax.microedition.lcdui.Graphics, int, int, int, int, int) void
    public static final void func_void_a(Graphics var0, int var1, int var2, int var3, int var4, int var5) {
        byte[] var6 = new byte[9];
        byte var7 = 0;
        byte var8 = 0;
        byte var9 = 0;
        Image var10 = null;
        switch (var5) {
            case 0:
                var7 = 5;
                var8 = 4;
                var9 = 7;
                var10 = class_ce.field_class_javax_microedition_lcdui_Image_r;
                break;
            case 1:
                var7 = 7;
                var8 = 6;
                var9 = 9;
                var10 = class_ce.field_class_javax_microedition_lcdui_Image_w;
                break;
            case 2:
                var7 = 7;
                var8 = 6;
                var9 = 9;
                var10 = class_ce.field_class_javax_microedition_lcdui_Image_x;
                break;
            case 3:
                var7 = 9;
                var8 = 8;
                var9 = 14;
                var10 = class_ce.field_class_javax_microedition_lcdui_Image_y;
                break;
            case 4:
                var7 = 9;
                var8 = 8;
                var9 = 14;
                var10 = class_ce.field_class_javax_microedition_lcdui_Image_z;
        }

        int var11 = var0.getClipX();
        int var12 = var0.getClipY();
        int var13 = var0.getClipWidth();
        int var14 = var0.getClipHeight();
        byte var16 = 0;

        do {
            byte var15 = (byte) (var1 % 10);
            var1 /= 10;
            var6[var16++] = var15;
        } while (var1 != 0);

        int var17 = var2;
        if ((var4 | 1) == var4) {
            var17 = var2 - var16 * var8 / 2;
        } else if ((var4 | 8) == var4) {
            var17 = var2 - var16 * var8;
        }

        for (int var18 = 0; var18 < var16; ++var18) {
            if (var5 != 0) {
                class_as.func_void_a(var0, var17 + var18 * var8, var3, var7, var9);
            } else {
                var0.setClip(var17 + var18 * var8, var3, var7, var9);
            }

            var0.drawImage(var10, var17 + var18 * var8 - var6[var16 - var18 - 1] * var7, var3, 20);
        }

        var0.setClip(var11, var12, var13, var14);
    }

    // $FF: renamed from: d (javax.microedition.lcdui.Graphics, int, int, int, int) void
    public static final void func_void_d(Graphics var0, int var1, int var2, int var3, int var4) {
        func_void_c(var0, var4, var1, var2, 8);
        int var5 = func_int_a(var4);
        var0.drawImage(class_ce.field_class_javax_microedition_lcdui_Image_i, var1 - var5, var2, 24);
        func_void_c(var0, var3, var1 - var5 - 9, var2, 8);
    }

    // $FF: renamed from: a (int) int
    public static final int func_int_a(int var0) {
        int var1 = 1;

        do {
            var0 /= 10;
            var1 += 4;
        } while (var0 != 0);

        return var1;
    }

    // $FF: renamed from: a (javax.microedition.lcdui.Graphics, java.lang.String, int, int) int
    public static final int func_int_a(Graphics var0, String var1, int var2, int var3) {
        return func_int_a(var0, var1.toCharArray(), var2, var3);
    }

    // $FF: renamed from: a (javax.microedition.lcdui.Graphics, char[], int, int) int
    public static final int func_int_a(Graphics var0, char[] var1, int var2, int var3) {
        int var4 = UIGeneral.getTextWidth(var1) + 2;
        int var5 = UIGeneral.func_int_a() + 2;
        var0.setColor(0);
        var0.fillRect(var2 - 1, var3 - 1, var4, var5);
        var0.setColor(16777215);
        UIGeneral.func_int_a(var0, var2, var3, var1, 1);
        return var2 + var4;
    }

    // $FF: renamed from: c (javax.microedition.lcdui.Graphics) void
    public static final void func_void_c(Graphics var0) {
        if (field_int_m >= 3) {
            var0.setColor(0);
            var0.fillRect(0, 0, canvasWidth, field_int_h);
            var0.setColor(14663551);
            UIGeneral.func_int_a(var0, canvasHalfWidth - 48, field_int_j - 12, UIGeneral.labelTextNowLoading, 0);
            var0.drawLine(canvasHalfWidth - 50, field_int_j, canvasHalfWidth + 48, field_int_j);
            var0.fillRect(canvasHalfWidth - 51, field_int_j + 1, 2, 2);
            var0.fillRect(canvasHalfWidth + 48, field_int_j + 1, 2, 2);
            var0.setColor(10452799);
            var0.drawLine(canvasHalfWidth - 50, field_int_j + 5, canvasHalfWidth + 48, field_int_j + 5);
            var0.fillRect(canvasHalfWidth - 51, field_int_j + 3, 2, 2);
            var0.fillRect(canvasHalfWidth + 48, field_int_j + 3, 2, 2);
            char[] var1 = UIGeneral.labelTextHandsOnMobile;
            UIGeneral.func_int_a(var0, canvasHalfWidth - UIGeneral.getTextWidth(var1) / 2, field_int_j + 50, var1, 0);
        }

        if (field_int_m > 3) {
            var0.setColor(0);
            var0.fillRect(canvasHalfWidth + 20, field_int_j - 12, 18, 10);
            var0.setColor(14663551);
            UIGeneral.func_int_a(var0, canvasHalfWidth + 20, field_int_j - 12, "...".substring(0, field_int_m % 4).toCharArray(), 0);
            var0.setColor(14655295);
            var0.fillRect(canvasHalfWidth - 48, field_int_j + 2, 95 * (field_int_k < field_int_l ? field_int_k : field_int_l) / field_int_l, 1);
            var0.setColor(16777087);
            var0.fillRect(canvasHalfWidth - 48, field_int_j + 3, 95 * (field_int_k < field_int_l ? field_int_k : field_int_l) / field_int_l, 1);
        } else if (field_int_m < 3) {
            var0.setColor(0);
            int var3 = (field_int_h + 11) / 12;

            for (int var2 = 0; var2 < var3; ++var2) {
                var0.fillRect(0, var2 * 12 + field_int_m * 4, canvasWidth, 4);
            }
        }

        ++field_int_m;
    }

    // $FF: renamed from: a (java.lang.String, int) void
    public static final void func_void_a(String var0, int var1) {
        class_bs.field_class_bs_a.func_void_g();
        if (field_boolean_b) {
            if (field_int_m < 3) {
                field_int_m = 3;
            }

            field_boolean_b = false;
        } else {
            field_int_l = var1;
            field_int_k = 0;
            field_int_m = 0;
        }
    }

    // $FF: renamed from: j () void
    public final void func_void_j() {
        this.repaint();
    }

    // $FF: renamed from: a (int) void
    public final void func_void_a(int var1) {
        if (var1 >= 0 && var1 >= 350) {
            field_int_h = this.getHeight();
        } else {
            field_int_h = var1;
        }

        field_int_j = field_int_h / 2;
    }

    // $FF: renamed from: k () void
    public static final void func_void_k() {
        ++field_int_k;
        if (field_int_k % 6 == 0) {
            try {
                Thread.sleep(50L);
                return;
            } catch (InterruptedException var1) {
            }
        }

    }

    static {
        int[] var10000 = new int[]{5, 5, 5, 5, 5, 5, 5, 5, 3, 4, 5, 5, 7, 5, 5, 5, 5, 5, 5, 5, 5, 5, 7, 5, 5, 5};
        var10000 = new int[]{0, 4, 8, 12, 16, 20, 24, 28, 32, 34, 37, 41, 45, 51, 55, 59, 63, 67, 71, 75, 79, 83, 87, 93, 97, 101};
        field_boolean_b = false;
        field_int_k = 0;
        field_int_l = 100;
        field_int_m = 0;
    }
}
