package rpg;

/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Image
 */
import java.io.IOException;
import javax.microedition.lcdui.Image;

public final class PNGMerger {
    private static final String[] pngChunkHeaderTag = new String[]{"IHDR", "cHRM", "gAMA", "iCCP", "sBIT", "sRGB", "tEXt", "zTXt", "iTXt", "pHYs", "sPLT", "tIME", "PLTE", "tRNS", "hIST", "bKGD", "IDAT", "IEND"};
    private static final byte[] var_byte_arr_a = new byte[]{-119, 80, 78, 71, 13, 10, 26, 10};
    private static final byte[] var_byte_arr_b = new byte[]{0, 0, 0, 0, 73, 69, 78, 68, -82, 66, 96, -126};
    private String imgFilePath;
    private boolean var_boolean_b;
    private boolean var_boolean_c;
    private int var_int_a;
    private int[] var_int_arr_a;
    private byte[] headerFileData;
    private Object[] arrayMpdData;
    private short[] var_short_arr_a;
    private int var_int_b;
    private int var_int_c;
    public boolean enableLoad = true; //fix to true, default = false
    private static ca var_ca_a = new ca();
    private static an var_an_a = new an();

    public PNGMerger() {
    }

    public PNGMerger(String filePath) throws IOException {
        this.fromImgPath(filePath);
    }

    public final void fromImgPath(String filePath) throws IOException {
        this.var_int_arr_a = null;
        this.headerFileData = null;
        this.arrayMpdData = null;
        this.var_short_arr_a = null;
        this.imgFilePath = filePath;
        this.loadMphFile();
    }

    private void loadMphFile() throws IOException {
        this.headerFileData = ce.getResourceByName(this.imgFilePath + ".mph");
        this.c();
    }

    public final void loadMpdByPartNo(int partNo) throws IOException {
        this.arrayMpdData[partNo] = ce.getResourceByName(this.imgFilePath + "_" + partNo + ".mpd");
    }

    public final void void_b(int n2) {
        this.arrayMpdData[n2] = null;
    }

    public final void void_a() {
        for (int i2 = 0; i2 < this.var_int_a; ++i2) {
            this.void_b(i2);
        }
        System.gc();
    }

    private void c() {
        int n2;
        int n3 = PNGMerger.readInt(this.headerFileData, 0);
        this.var_boolean_b = (n3 >> 27) % 2 == 1;
        this.var_boolean_c = (n3 >> 26) % 2 == 1;
        int imgCount = this.getImgCount();
        this.var_int_a = 0;
        for (n2 = 0; n2 < imgCount; ++n2) {
            if (this.var_int_a >= PNGMerger.readShort(this.headerFileData, 8 + 8 * n2) + '\u0001') continue;
            this.var_int_a = PNGMerger.readShort(this.headerFileData, 8 + 8 * n2) + '\u0001';
        }
        this.var_int_arr_a = new int[this.var_int_a];
        for (n2 = 0; n2 < imgCount; ++n2) {
            short c2 = PNGMerger.readShort(this.headerFileData, 8 + 8 * n2);
            this.var_int_arr_a[c2] = this.var_int_arr_a[c2] + 1;
        }
        this.arrayMpdData = new Object[this.var_int_a];
        this.var_short_arr_a = new short[imgCount];
        for (n2 = 0; n2 < imgCount; ++n2) {
            this.var_short_arr_a[n2] = PNGMerger.readShort(this.headerFileData, 8 + 8 * n2 + 6);
        }
        this.var_int_b = PNGMerger.b(this.headerFileData, 12);
        this.var_int_c = PNGMerger.b(this.headerFileData, 13);
    }

    public final int getImgCount() {
        return PNGMerger.readInt(this.headerFileData, 4);
    }

    public final Image getImgById(int imgId) {
        byte[] arrby = this.byte_arr_b(imgId);
        Image image = Image.createImage((byte[])arrby, (int)0, (int)arrby.length);
        return image;
    }

    public final Image[] javax_microedition_lcdui_Image_arr_a() {
        this.enableLoad = true;
        int n2 = this.getImgCount();
        Image[] arrimage = new Image[n2];
        for (int i2 = 0; i2 < n2; ++i2) {
            arrimage[i2] = this.getImgById(i2);
            MyGameCanvas.k();
        }
        this.void_a();
        return arrimage;
    }

    public final Image javax_microedition_lcdui_Image_b(int n2) {
        if (!this.var_boolean_c) {
            return this.getImgById(n2);
        }
        byte[] arrby = this.byte_arr_b(n2);
        PNGMerger.a(arrby);
        return Image.createImage((byte[])arrby, (int)0, (int)arrby.length);
    }

    public final Image javax_microedition_lcdui_Image_c(int n2) {
        byte[] arrby = this.byte_arr_b(n2);
        PNGMerger.void_a(arrby, 1);
        return Image.createImage((byte[])arrby, (int)0, (int)arrby.length);
    }

    public final void void_a(int n2, int n3) {
        if (!this.var_boolean_b) {
            return;
        }
        PNGMerger.b(this.headerFileData, this.var_int_b, 4, n2, n3);
    }

    private byte[] getMpdDataByImgId(int imgId) {
        int mpdPartNo = this.getPartNo(imgId);
        if (this.enableLoad && this.arrayMpdData[mpdPartNo] == null) {
            this.void_a();
            try {
                this.loadMpdByPartNo(mpdPartNo);// start get mpd data
            }
            catch (IOException iOException) {
                System.out.println("[PNGMerger ERROR] cannot load mpd '" + this.imgFilePath + "' no." + mpdPartNo);
                iOException.printStackTrace();
            }
        }
        return (byte[])this.arrayMpdData[mpdPartNo];
    }

    private int getPartNo(int imgId) {
        return PNGMerger.readShort(this.headerFileData, 8 + 8 * imgId);
    }

    private byte[] byte_arr_b(int n2) {
        // encrypt ??
        if (this.var_boolean_b) {
            return this.d(n2);
        }
        // not encrypt ??
        return this.byte_arr_c(n2);
    }

    private byte[] byte_arr_c(int n2) {
        byte[] arrby = this.getMpdDataByImgId(n2);
        int n3 = 0;
        int n4 = PNGMerger.readInt(this.headerFileData, 8 + n2 * 8 + 2);
        int n5 = this.int_b(n2);
        int n6 = 0;
        n6 = 8 + n5;
        byte[] arrby2 = new byte[n6 += 12];
        System.arraycopy(var_byte_arr_a, 0, arrby2, 0, 8);
        System.arraycopy(arrby, n4, arrby2, 8, n5);
        n3 = 8 + n5;
        System.arraycopy(var_byte_arr_b, 0, arrby2, n3, 12);
        return arrby2;
    }

    private byte[] d(int imgId) {// n2 = img id
        byte[] arrby = this.getMpdDataByImgId(imgId);// load mpd
        int n3 = 0;
        int n4 = PNGMerger.readInt(this.headerFileData, 8 + imgId * 8 + 2);// get img size data: mph data, pos
        int n5 = this.int_b(imgId);
        int n6 = 0;
        n6 = 8 + (this.headerFileData.length - (PNGMerger.readInt(this.headerFileData, 4) * 8 + 8));
        n6 += n5;
        byte[] arrby2 = new byte[n6 += 12];
        System.arraycopy(var_byte_arr_a, 0, arrby2, 0, 8);
        int n7 = PNGMerger.a(arrby, 0, n4, n5);
        if (n7 == -1) {
            return null;
        }
        int n8 = PNGMerger.readInt(arrby, n7) + 12;
        System.arraycopy(arrby, n7, arrby2, 8, n8);
        n3 = 8 + n8;
        block3: for (int i2 = 0; i2 < 18; ++i2) {
            if (!this.boolean_a(imgId, i2)) continue;
            switch (i2) {
                case 1: 
                case 2: 
                case 3: 
                case 4: 
                case 5: 
                case 9: 
                case 10: {
                    n7 = PNGMerger.a(arrby, i2, n4, n5);
                    if (n7 == -1) continue block3;
                    n8 = PNGMerger.readInt(arrby, n7) + 12;
                    System.arraycopy(arrby, n7, arrby2, n3, n8);
                    n3 += n8;
                }
            }
        }
        n7 = this.var_int_b;
        n8 = PNGMerger.readInt(this.headerFileData, n7) + 12;
        System.arraycopy(this.headerFileData, n7, arrby2, n3, n8);
        n3 += n8;
        n7 = this.var_int_c;
        if (n7 != -1) {
            n8 = PNGMerger.readInt(this.headerFileData, n7) + 12;
            System.arraycopy(this.headerFileData, n7, arrby2, n3, n8);
            n3 += n8;
        }
        if (this.boolean_a(imgId, 14) && (n7 = PNGMerger.a(arrby, 14, n4, n5)) != -1) {
            n8 = PNGMerger.readInt(arrby, n7) + 12;
            System.arraycopy(arrby, n7, arrby2, n3, n8);
            n3 += n8;
        }
        if (this.boolean_a(imgId, 15) && (n7 = PNGMerger.a(arrby, 15, n4, n5)) != -1) {
            n8 = PNGMerger.readInt(arrby, n7) + 12;
            System.arraycopy(arrby, n7, arrby2, n3, n8);
            n3 += n8;
        }
        n7 = PNGMerger.a(arrby, 16, n4, n5);
        n8 = PNGMerger.readInt(arrby, n7) + 12;
        System.arraycopy(arrby, n7, arrby2, n3, n8);
        System.arraycopy(var_byte_arr_b, 0, arrby2, n3 += n8, 12);
        return arrby2;
    }

    private int int_b(int n2) {
        byte[] arrby = this.getMpdDataByImgId(n2);
        int n3 = 0;
        int n4 = 0;
        n3 = PNGMerger.readInt(this.headerFileData, 8 + n2 * 8 + 2);
        n4 = n2 == this.getImgCount() - 1 || PNGMerger.readShort(this.headerFileData, 8 + n2 * 8) != PNGMerger.readShort(this.headerFileData, 8 + (n2 + 1) * 8) ? arrby.length : PNGMerger.readInt(this.headerFileData, 8 + (n2 + 1) * 8 + 2);
        return n4 - n3;
    }

    private static int a(byte[] arrby, int n2, int n3, int n4) {
        String string = pngChunkHeaderTag[n2];
        int n5 = n4 == -1 ? arrby.length : n3 + n4;
        for (int i2 = n3; i2 < n5; i2 += PNGMerger.readInt(arrby, i2) + 12) {
            if (arrby[i2 + 4] != string.charAt(0) || arrby[i2 + 5] != string.charAt(1) || arrby[i2 + 6] != string.charAt(2) || arrby[i2 + 7] != string.charAt(3)) continue;
            return i2;
        }
        return -1;
    }

    private static int readInt(byte[] arrby, int pos) {
        if (arrby.length - 4 < pos) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int n3 = 0;
        n3 = 0 + (arrby[pos] & 0xFF) * 0x1000000;
        n3 += (arrby[pos + 1] & 0xFF) * 65536;
        n3 += (arrby[pos + 2] & 0xFF) * 256;
        return n3 += arrby[pos + 3] & 0xFF;
    }

    private static short readShort(byte[] arrby, int pos) {
        if (arrby.length - 2 < pos) {
            throw new ArrayIndexOutOfBoundsException();
        }
        short c2 = 0;
        c2 = (short)(0 + (arrby[pos] & 0xFF) * 256);
        c2 = (short)(c2 + (arrby[pos + 1] & 0xFF));
        return c2;
    }

    private boolean boolean_a(int n2, int n3) {
        short c2 = this.var_short_arr_a[n2];
        if (n3 < 1 || n3 > 16) {
            return false;
        }
        return (c2 >> n3 - 1 & 1) == 1;
    }

    private static int b(byte[] arrby, int n2) {
        String tagName = pngChunkHeaderTag[n2];
        int n3 = arrby.length;
        for (int i2 = 0; i2 < n3 - 3; ++i2) {
            if (arrby[i2] != tagName.charAt(0) || arrby[i2 + 1] != tagName.charAt(1) || arrby[i2 + 2] != tagName.charAt(2) || arrby[i2 + 3] != tagName.charAt(3)) continue;
            return i2 - 4;
        }
        return -1;
    }

    public static final void a(byte[] arrby) {
        int n2 = PNGMerger.a(arrby, 16, 8, arrby.length);
        int n3 = PNGMerger.a(arrby, 0, 8, arrby.length);
        int n4 = PNGMerger.readInt(arrby, n3 + 8);
        int n5 = PNGMerger.readInt(arrby, n3 + 12);
        byte by2 = arrby[n3 + 16];
        PNGMerger.a(arrby, n2, n4, n5, by2);
    }

    private static void a(byte[] arrby, int n2, int n3, int n4, int n5) {
        int n6;
        int n7;
        int n8 = 8 / n5;
        int n9 = n4;
        int n10 = (n3 - 1) / n8 + 1;
        byte by2 = (byte)(255 >> 8 - n5);
        int n11 = n2 + 15;
        int n12 = (n10 + 1) * n9;
        int n13 = n3 / 2;
        int n14 = n11 + n12;
        int n15 = n14 + 4;
        int n16 = n2 + 4;
        for (n7 = 0; n7 < n9; ++n7) {
            if (arrby[n11 + (n10 + 1) * n7] == 0) continue;
            return;
        }
        for (int i2 = 0; i2 < n9; ++i2) {
            n7 = n11 + (n10 + 1) * i2 + 1;
            for (int i3 = 0; i3 < n13; ++i3) {
                n6 = n3 - 1 - i3;
                int n17 = n7 + i3 / n8;
                int n18 = n7 + n6 / n8;
                int n19 = i3 % n8;
                int n20 = n6 % n8;
                byte by3 = (byte)((n8 - n19 - 1) * n5);
                byte by4 = (byte)((n8 - n20 - 1) * n5);
                byte by5 = (byte)(arrby[n17] >> by3 & by2);
                byte by6 = (byte)(arrby[n18] >> by4 & by2);
                arrby[n17] = (byte)(arrby[n17] & ~(by2 << by3) | by6 << by3);
                arrby[n18] = (byte)(arrby[n18] & ~(by2 << by4) | by5 << by4);
            }
        }
        var_an_a.void_a();
        var_an_a.a(arrby, n11, n12);
        long l2 = var_an_a.long_a();
        System.arraycopy(PNGMerger.e((int)l2), 0, arrby, n14, 4);
        var_ca_a.void_a();
        var_ca_a.a(arrby, n16, n12 + 15);
        n6 = var_ca_a.int_a();
        System.arraycopy(PNGMerger.e(n6), 0, arrby, n15, 4);
    }

    public static final void void_a(byte[] arrby, int n2) {
        PNGMerger.a(arrby, n2, 0);
    }

    public static final void a(byte[] arrby, int n2, int n3) {
        int n4 = PNGMerger.a(arrby, 12, 8, arrby.length);
        PNGMerger.b(arrby, n4, n2, n3, 0);
    }

    private static void b(byte[] arrby, int n2, int n3, int n4, int n5) {
        int n6;
        int n7 = PNGMerger.readInt(arrby, n2);
        int n8 = n2 + 8;
        int n9 = n8 + n7;
        block0 : switch (n3) {
            case 0: {
                switch (n4) {
                    case 0: {
                        for (n6 = 0; n6 < n7 / 3; ++n6) {
                            byte by2 = arrby[n8 + n6 * 3];
                            arrby[n8 + n6 * 3] = arrby[n8 + n6 * 3 + 1];
                            arrby[n8 + n6 * 3 + 1] = by2;
                        }
                        break block0;
                    }
                    case 1: {
                        for (n6 = 0; n6 < n7 / 3; ++n6) {
                            byte by3 = arrby[n8 + n6 * 3 + 1];
                            arrby[n8 + n6 * 3 + 1] = arrby[n8 + n6 * 3 + 2];
                            arrby[n8 + n6 * 3 + 2] = by3;
                        }
                        break block0;
                    }
                    case 2: {
                        for (n6 = 0; n6 < n7 / 3; ++n6) {
                            byte by4 = arrby[n8 + n6 * 3];
                            arrby[n8 + n6 * 3] = arrby[n8 + n6 * 3 + 2];
                            arrby[n8 + n6 * 3 + 2] = by4;
                        }
                        break block0;
                    }
                    case 3: {
                        for (n6 = 0; n6 < n7 / 3; ++n6) {
                            byte by5 = arrby[n8 + n6 * 3];
                            arrby[n8 + n6 * 3] = arrby[n8 + n6 * 3 + 2];
                            arrby[n8 + n6 * 3 + 2] = arrby[n8 + n6 * 3 + 1];
                            arrby[n8 + n6 * 3 + 1] = by5;
                        }
                        break block0;
                    }
                    case 4: {
                        for (n6 = 0; n6 < n7 / 3; ++n6) {
                            byte by6 = arrby[n8 + n6 * 3];
                            arrby[n8 + n6 * 3] = arrby[n8 + n6 * 3 + 1];
                            arrby[n8 + n6 * 3 + 1] = arrby[n8 + n6 * 3 + 2];
                            arrby[n8 + n6 * 3 + 2] = by6;
                        }
                    }
                }
                break;
            }
            case 1: {
                for (n6 = 0; n6 < n7 / 3; ++n6) {
                    byte by7;
                    int n10 = arrby[n8 + n6 * 3] & 0xFF;
                    int n11 = arrby[n8 + n6 * 3 + 1] & 0xFF;
                    int n12 = arrby[n8 + n6 * 3 + 2] & 0xFF;
                    arrby[n8 + n6 * 3] = by7 = (byte)((n10 + n11 + n12) / 3);
                    arrby[n8 + n6 * 3 + 1] = by7;
                    arrby[n8 + n6 * 3 + 2] = by7;
                }
                break;
            }
            case 2: {
                for (n6 = 0; n6 < n7 / 3; ++n6) {
                    int n13 = arrby[n8 + n6 * 3] & 0xFF;
                    int n14 = arrby[n8 + n6 * 3 + 1] & 0xFF;
                    int n15 = arrby[n8 + n6 * 3 + 2] & 0xFF;
                    arrby[n8 + n6 * 3] = (byte)(n13 * (n4 * 10) / 1000 < 255 ? n13 * (n4 * 10) / 1000 : 255);
                    arrby[n8 + n6 * 3 + 1] = (byte)(n14 * (n4 * 10) / 1000 < 255 ? n14 * (n4 * 10) / 1000 : 255);
                    arrby[n8 + n6 * 3 + 2] = (byte)(n15 * (n4 * 10) / 1000 < 255 ? n15 * (n4 * 10) / 1000 : 255);
                }
                break;
            }
            case 3: {
                for (n6 = 0; n6 < n7 / 3; ++n6) {
                    arrby[n8 + n6 * 3] = (byte)(~arrby[n8 + n6 * 3]);
                    arrby[n8 + n6 * 3 + 1] = (byte)~arrby[n8 + n6 * 3 + 1];
                    arrby[n8 + n6 * 3 + 2] = (byte)~arrby[n8 + n6 * 3 + 2];
                }
                break;
            }
            case 4: {
                n6 = (byte)(n4 >> 16 & 0xFF);
                byte by8 = (byte)(n4 >> 8 & 0xFF);
                byte by9 = (byte)(n4 & 0xFF);
                byte by10 = (byte)(n5 >> 16 & 0xFF);
                byte by11 = (byte)(n5 >> 8 & 0xFF);
                byte by12 = (byte)(n5 & 0xFF);
                for (int i2 = 0; i2 < n7 / 3; ++i2) {
                    if (arrby[n8 + i2 * 3] != n6 || arrby[n8 + i2 * 3 + 1] != by8 || arrby[n8 + i2 * 3 + 2] != by9) continue;
                    arrby[n8 + i2 * 3] = by10;
                    arrby[n8 + i2 * 3 + 1] = by11;
                    arrby[n8 + i2 * 3 + 2] = by12;
                }
                break;
            }
        }
        var_ca_a.void_a();
        var_ca_a.a(arrby, n2 + 4, n7 + 4);
        n6 = var_ca_a.int_a();
        System.arraycopy(PNGMerger.e(n6), 0, arrby, n9, 4);
    }

    private static byte[] e(int n2) {
        byte[] arrby = new byte[4];
        byte[] arrby2 = arrby;
        arrby[0] = (byte)(n2 >> 24 & 0xFF);
        arrby2[1] = (byte)(n2 >> 16 & 0xFF);
        arrby2[2] = (byte)(n2 >> 8 & 0xFF);
        arrby2[3] = (byte)(n2 & 0xFF);
        return arrby2;
    }

//    public static {
//        var_java_lang_String_arr_a = new String[]{"IHDR", "cHRM", "gAMA", "iCCP", "sBIT", "sRGB", "tEXt", "zTXt", "iTXt", "pHYs", "sPLT", "tIME", "PLTE", "tRNS", "hIST", "bKGD", "IDAT", "IEND"};
//        var_byte_arr_a = new byte[]{-119, 80, 78, 71, 13, 10, 26, 10};
//        var_byte_arr_b = new byte[]{0, 0, 0, 0, 73, 69, 78, 68, -82, 66, 96, -126};
//        var_ca_a = new ca();
//        var_an_a = new an();
//    }
}

