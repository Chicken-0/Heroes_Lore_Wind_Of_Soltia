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
    private static final byte[] PNGTagData = new byte[]{-119, 80, 78, 71, 13, 10, 26, 10};
    private static final byte[] IENDTagData = new byte[]{0, 0, 0, 0, 73, 69, 78, 68, -82, 66, 96, -126};
    private String imgFilePath;
    private boolean isSplitAdvance;
    private boolean flagFlip;
    private int var_int_a;
    private int[] var_int_arr_a;
    private byte[] mphFileData;
    private Object[] arrayMpdData;
    private short[] arrayFlagExtra;
    private int PLTEMphPos;
    private int tRNSMphPos;
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
        this.mphFileData = null;
        this.arrayMpdData = null;
        this.arrayFlagExtra = null;
        this.imgFilePath = filePath;
        this.loadMphFile();
    }

    private void loadMphFile() throws IOException {
        this.mphFileData = ce.getResourceByName(this.imgFilePath + ".mph");
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
        int n3 = PNGMerger.readInt(this.mphFileData, 0);
        this.isSplitAdvance = (n3 >> 27) % 2 == 1;
        this.flagFlip = (n3 >> 26) % 2 == 1;
        int imgCount = this.getImgCount();
        this.var_int_a = 0;
        for (n2 = 0; n2 < imgCount; ++n2) {
            if (this.var_int_a >= PNGMerger.readShort(this.mphFileData, 8 + 8 * n2) + 1) continue;
            this.var_int_a = PNGMerger.readShort(this.mphFileData, 8 + 8 * n2) + 1;
        }
        this.var_int_arr_a = new int[this.var_int_a];
        for (n2 = 0; n2 < imgCount; ++n2) {
            short c2 = PNGMerger.readShort(this.mphFileData, 8 + 8 * n2);
            this.var_int_arr_a[c2] = this.var_int_arr_a[c2] + 1;
        }
        this.arrayMpdData = new Object[this.var_int_a];
        this.arrayFlagExtra = new short[imgCount];
        for (n2 = 0; n2 < imgCount; ++n2) {
            this.arrayFlagExtra[n2] = PNGMerger.readShort(this.mphFileData, 8 + 8 * n2 + 6);
        }
        this.PLTEMphPos = PNGMerger.getPosChunkDataWithExtraByte(this.mphFileData, 12);
        this.tRNSMphPos = PNGMerger.getPosChunkDataWithExtraByte(this.mphFileData, 13);
    }

    public final int getImgCount() {
        return PNGMerger.readInt(this.mphFileData, 4);
    }

    public final Image getImageById(int imgId) {
        byte[] arrby = this.getDataMerged(imgId);
        Image image = Image.createImage((byte[])arrby, (int)0, (int)arrby.length);
        return image;
    }

    public final Image[] getAllImage() {
        this.enableLoad = true;
        int imgCount = this.getImgCount();
        Image[] arrimage = new Image[imgCount];
        for (int imgId = 0; imgId < imgCount; ++imgId) {
            arrimage[imgId] = this.getImageById(imgId);
            MyGameCanvas.k();
        }
        this.void_a();
        return arrimage;
    }

    public final Image getFlipImageById(int imgId) {
        if (!this.flagFlip) {
            return this.getImageById(imgId);
        }
//        System.out.println("[IMG_FLIP]: " + this.imgFilePath);
        byte[] arrby = this.getDataMerged(imgId);
        PNGMerger.setupFlipImg(arrby);
        return Image.createImage((byte[])arrby, (int)0, (int)arrby.length);
    }

    public final Image getImageGrayscale(int imgId) {
//        System.out.println("[IMG_GRAYSCALE]: " + this.imgFilePath);
        byte[] arrby = this.getDataMerged(imgId);
        PNGMerger.convertImgColor(arrby, 1);
        return Image.createImage((byte[])arrby, (int)0, (int)arrby.length);
    }

    public final void convertImgColor(int key1, int key2) {
        if (!this.isSplitAdvance) {
            return;
        }
//        System.out.println("[IMG_COLOR_CONV]: " + this.imgFilePath);
        PNGMerger.convertImgColor(this.mphFileData, this.PLTEMphPos, 4, key1, key2);
    }

    private byte[] getMpdDataHasImg(int imgId) {
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
        return PNGMerger.readShort(this.mphFileData, 8 + 8 * imgId);
    }

    private byte[] getDataMerged(int imgId) {
        if (this.isSplitAdvance) {
            return this.mergeAdvance(imgId);
        }
        return this.mergeBasic(imgId);
    }

    private byte[] mergeBasic(int imgId) {
        byte[] mpdData = this.getMpdDataHasImg(imgId);
        int currentSizeResult = 0;
        int srcPos = PNGMerger.readInt(this.mphFileData, 8 + imgId * 8 + 2);
        int sizeCopy = this.getSizeImgData(imgId);
        int n6 = 0;
        n6 = 8 + sizeCopy;
        byte[] arrayByteResult = new byte[n6 += 12];
        System.arraycopy(PNGTagData, 0, arrayByteResult, 0, 8);
        System.arraycopy(mpdData, srcPos, arrayByteResult, 8, sizeCopy);
        currentSizeResult = 8 + sizeCopy;
        System.arraycopy(IENDTagData, 0, arrayByteResult, currentSizeResult, 12);
        return arrayByteResult;
    }

    private byte[] mergeAdvance(int imgId) {
        byte[] mpdData = this.getMpdDataHasImg(imgId);
        int currentSizeResult = 0;
        int posStartSearch = PNGMerger.readInt(this.mphFileData, 8 + imgId * 8 + 2);
        int sizeChunkData = this.getSizeImgData(imgId);
        int n6 = 0;
        // get PLTE section size
        n6 = 8 + (this.mphFileData.length - (PNGMerger.readInt(this.mphFileData, 4) * 8 + 8));
        n6 += sizeChunkData;
        byte[] arrayByteResult = new byte[n6 += 12];
        System.arraycopy(PNGTagData, 0, arrayByteResult, 0, 8);
        int posChunkData = PNGMerger.getPosChunkData(mpdData, 0, posStartSearch, sizeChunkData);
        if (posChunkData == -1) {
            return null;
        }
        int sizeCopy = PNGMerger.readInt(mpdData, posChunkData) + 12;
        System.arraycopy(mpdData, posChunkData, arrayByteResult, 8, sizeCopy);
        currentSizeResult = 8 + sizeCopy;
        block3: for (int tagExtraIdx = 0; tagExtraIdx < 18; ++tagExtraIdx) {
            if (!this.isHasTagExtra(imgId, tagExtraIdx)) continue;
            switch (tagExtraIdx) {
                case 1: 
                case 2: 
                case 3: 
                case 4: 
                case 5: 
                case 9: 
                case 10: {
                    posChunkData = PNGMerger.getPosChunkData(mpdData, tagExtraIdx, posStartSearch, sizeChunkData);
                    if (posChunkData == -1) continue block3;
                    sizeCopy = PNGMerger.readInt(mpdData, posChunkData) + 12;
                    System.arraycopy(mpdData, posChunkData, arrayByteResult, currentSizeResult, sizeCopy);
                    currentSizeResult += sizeCopy;
                }
            }
        }
        posChunkData = this.PLTEMphPos;
        sizeCopy = PNGMerger.readInt(this.mphFileData, posChunkData) + 12;
        System.arraycopy(this.mphFileData, posChunkData, arrayByteResult, currentSizeResult, sizeCopy);
        currentSizeResult += sizeCopy;
        posChunkData = this.tRNSMphPos;
        if (posChunkData != -1) {
            sizeCopy = PNGMerger.readInt(this.mphFileData, posChunkData) + 12;
            System.arraycopy(this.mphFileData, posChunkData, arrayByteResult, currentSizeResult, sizeCopy);
            currentSizeResult += sizeCopy;
        }
        // hIST tag
        if (this.isHasTagExtra(imgId, 14) && (posChunkData = PNGMerger.getPosChunkData(mpdData, 14, posStartSearch, sizeChunkData)) != -1) {
            sizeCopy = PNGMerger.readInt(mpdData, posChunkData) + 12;
            System.arraycopy(mpdData, posChunkData, arrayByteResult, currentSizeResult, sizeCopy);
            currentSizeResult += sizeCopy;
        }
        // bKGD tag
        if (this.isHasTagExtra(imgId, 15) && (posChunkData = PNGMerger.getPosChunkData(mpdData, 15, posStartSearch, sizeChunkData)) != -1) {
            sizeCopy = PNGMerger.readInt(mpdData, posChunkData) + 12;
            System.arraycopy(mpdData, posChunkData, arrayByteResult, currentSizeResult, sizeCopy);
            currentSizeResult += sizeCopy;
        }
        // IDAT tag
        posChunkData = PNGMerger.getPosChunkData(mpdData, 16, posStartSearch, sizeChunkData);
        sizeCopy = PNGMerger.readInt(mpdData, posChunkData) + 12;
        System.arraycopy(mpdData, posChunkData, arrayByteResult, currentSizeResult, sizeCopy);
        System.arraycopy(IENDTagData, 0, arrayByteResult, currentSizeResult += sizeCopy, 12);
        return arrayByteResult;
    }

    private int getSizeImgData(int imgId) {
        byte[] arrby = this.getMpdDataHasImg(imgId);
        int n3 = 0;
        int n4 = 0;
        n3 = PNGMerger.readInt(this.mphFileData, 8 + imgId * 8 + 2);
        n4 = imgId == this.getImgCount() - 1 || PNGMerger.readShort(this.mphFileData, 8 + imgId * 8) != PNGMerger.readShort(this.mphFileData, 8 + (imgId + 1) * 8) ? arrby.length : PNGMerger.readInt(this.mphFileData, 8 + (imgId + 1) * 8 + 2);
        return n4 - n3;
    }

    private static int getPosChunkData(byte[] arrby, int tagIdx, int posStart, int size) {
        String tagName = pngChunkHeaderTag[tagIdx];
        int posEnd = size == -1 ? arrby.length : posStart + size;
        for (int currentPos = posStart; currentPos < posEnd; currentPos += PNGMerger.readInt(arrby, currentPos) + 12) {
            if (arrby[currentPos + 4] != tagName.charAt(0) 
                    || arrby[currentPos + 5] != tagName.charAt(1) 
                    || arrby[currentPos + 6] != tagName.charAt(2) 
                    || arrby[currentPos + 7] != tagName.charAt(3)) continue;
            return currentPos;
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

    private boolean isHasTagExtra(int imgId, int tagExtraIdx) {
        short c2 = this.arrayFlagExtra[imgId];
        if (tagExtraIdx < 1 || tagExtraIdx > 16) {
            return false;
        }
        return (c2 >> tagExtraIdx - 1 & 1) == 1;
    }

    private static int getPosChunkDataWithExtraByte(byte[] arrby, int tagIdx) {
        String tagName = pngChunkHeaderTag[tagIdx];
        int n3 = arrby.length;
        for (int currentPos = 0; currentPos < n3 - 3; ++currentPos) {
            if (arrby[currentPos] != tagName.charAt(0) 
                    || arrby[currentPos + 1] != tagName.charAt(1) 
                    || arrby[currentPos + 2] != tagName.charAt(2) 
                    || arrby[currentPos + 3] != tagName.charAt(3)) continue;
            return currentPos - 4;
        }
        return -1;
    }

    public static final void setupFlipImg(byte[] arrby) {
        // IDAT
        int IDATPos = PNGMerger.getPosChunkData(arrby, 16, 8, arrby.length);
        // IHDR
        int IHDRPos = PNGMerger.getPosChunkData(arrby, 0, 8, arrby.length);
        int n4 = PNGMerger.readInt(arrby, IHDRPos + 8);
        int n5 = PNGMerger.readInt(arrby, IHDRPos + 12);
        byte by2 = arrby[IHDRPos + 16];
        PNGMerger.a(arrby, IDATPos, n4, n5, by2);
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
        System.arraycopy(PNGMerger.intToByteArray((int)l2), 0, arrby, n14, 4);
        var_ca_a.void_a();
        var_ca_a.a(arrby, n16, n12 + 15);
        n6 = var_ca_a.int_a();
        System.arraycopy(PNGMerger.intToByteArray(n6), 0, arrby, n15, 4);
    }

    public static final void convertImgColor(byte[] arrby, int mode) {
        PNGMerger.convertImgColor(arrby, mode, 0);
    }

    public static final void convertImgColor(byte[] arrby, int mode, int color) {
        int n4 = PNGMerger.getPosChunkData(arrby, 12, 8, arrby.length);
        PNGMerger.convertImgColor(arrby, n4, mode, color, 0);
    }

    private static void convertImgColor(byte[] arrby, int posTagData, int mode, int color1, int color2) {
        int n6;
        int n7 = PNGMerger.readInt(arrby, posTagData);
        int n8 = posTagData + 8;
        int n9 = n8 + n7;
        block0 : switch (mode) {
            case 0: {
                switch (color1) {
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
                    arrby[n8 + n6 * 3] = (byte)(n13 * (color1 * 10) / 1000 < 255 ? n13 * (color1 * 10) / 1000 : 255);
                    arrby[n8 + n6 * 3 + 1] = (byte)(n14 * (color1 * 10) / 1000 < 255 ? n14 * (color1 * 10) / 1000 : 255);
                    arrby[n8 + n6 * 3 + 2] = (byte)(n15 * (color1 * 10) / 1000 < 255 ? n15 * (color1 * 10) / 1000 : 255);
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
                n6 = (byte)(color1 >> 16 & 0xFF);
                byte by8 = (byte)(color1 >> 8 & 0xFF);
                byte by9 = (byte)(color1 & 0xFF);
                byte by10 = (byte)(color2 >> 16 & 0xFF);
                byte by11 = (byte)(color2 >> 8 & 0xFF);
                byte by12 = (byte)(color2 & 0xFF);
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
        var_ca_a.a(arrby, posTagData + 4, n7 + 4);
        n6 = var_ca_a.int_a();
        System.arraycopy(PNGMerger.intToByteArray(n6), 0, arrby, n9, 4);
    }

    private static byte[] intToByteArray(int number) {
        byte[] result = new byte[4];
        result[0] = (byte)(number >> 24 & 0xFF);
        result[1] = (byte)(number >> 16 & 0xFF);
        result[2] = (byte)(number >> 8 & 0xFF);
        result[3] = (byte)(number & 0xFF);
        return result;
    }

//    public static {
//        var_java_lang_String_arr_a = new String[]{"IHDR", "cHRM", "gAMA", "iCCP", "sBIT", "sRGB", "tEXt", "zTXt", "iTXt", "pHYs", "sPLT", "tIME", "PLTE", "tRNS", "hIST", "bKGD", "IDAT", "IEND"};
//        var_byte_arr_a = new byte[]{-119, 80, 78, 71, 13, 10, 26, 10};
//        var_byte_arr_b = new byte[]{0, 0, 0, 0, 73, 69, 78, 68, -82, 66, 96, -126};
//        var_ca_a = new ca();
//        var_an_a = new an();
//    }
}

