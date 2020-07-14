package rpg;

import java.io.IOException;
import javax.microedition.lcdui.Image;

// $FF: renamed from: br
public final class PNGMerger {

    // $FF: renamed from: a java.lang.String[]
    private static final String[] pngChunkHeaderTag = new String[]{"IHDR", "cHRM", "gAMA", "iCCP", "sBIT", "sRGB", "tEXt", "zTXt", "iTXt", "pHYs", "sPLT", "tIME", "PLTE", "tRNS", "hIST", "bKGD", "IDAT", "IEND"};
    // $FF: renamed from: a byte[]
    private static final byte[] PNGTagData = new byte[]{-119, 80, 78, 71, 13, 10, 26, 10};
    // $FF: renamed from: b byte[]
    private static final byte[] IENDTagData = new byte[]{0, 0, 0, 0, 73, 69, 78, 68, -82, 66, 96, -126};
    // $FF: renamed from: a java.lang.String
    private String imgFilePath;
    // $FF: renamed from: b boolean
    private boolean isSplitAdvance;
    // $FF: renamed from: c boolean
    private boolean flagFlip;
    // $FF: renamed from: a int
    private int field_int_a;
    // $FF: renamed from: a int[]
    private int[] field_array_int_a;
    // $FF: renamed from: c byte[]
    private byte[] mphFileData;
    // $FF: renamed from: a java.lang.Object[]
    private Object[] arrayMpdData;
    // $FF: renamed from: a char[]
    private char[] arrayFlagExtra;
    // $FF: renamed from: b int
    private int PLTEMphPos;
    // $FF: renamed from: c int
    private int tRNSMphPos;
    // $FF: renamed from: a boolean
    public boolean enableLoad = false;
    // $FF: renamed from: a ca
    private static class_ca field_class_ca_a = new class_ca();
    // $FF: renamed from: a an
    private static class_an field_class_an_a = new class_an();

    public PNGMerger() {
    }

    public PNGMerger(String filePath) throws IOException {
        this.fromImgPath(filePath);
    }

    // $FF: renamed from: a (java.lang.String) void
    public final void fromImgPath(String filePath) throws IOException {
        this.field_array_int_a = null;
        this.mphFileData = null;
        this.arrayMpdData = null;
        this.arrayFlagExtra = null;
        this.imgFilePath = filePath;
        this.loadMphFile();
    }

    // $FF: renamed from: b () void
    private void loadMphFile() throws IOException {
        this.mphFileData = class_ce.getResourceByName(this.imgFilePath + ".mph");
        this.func_void_c();
    }

    // $FF: renamed from: a (int) void
    public final void loadMpdByPartNo(int partNo) throws IOException {
        this.arrayMpdData[partNo] = class_ce.getResourceByName(this.imgFilePath + "_" + partNo + ".mpd");
    }

    // $FF: renamed from: b (int) void
    public final void func_void_b(int var1) {
        this.arrayMpdData[var1] = null;
    }

    // $FF: renamed from: a () void
    public final void func_void_a() {
        for (int var1 = 0; var1 < this.field_int_a; ++var1) {
            this.func_void_b(var1);
        }

        System.gc();
    }

    // $FF: renamed from: c () void
    private void func_void_c() {
        int var1 = readInt(this.mphFileData, 0);
        this.isSplitAdvance = (var1 >> 27) % 2 == 1;
        this.flagFlip = (var1 >> 26) % 2 == 1;
        int imgCount = this.getImgCount();
        this.field_int_a = 0;

        int var3;
        for (var3 = 0; var3 < imgCount; ++var3) {
            if (this.field_int_a < readShort(this.mphFileData, 8 + 8 * var3) + 1) {
                this.field_int_a = readShort(this.mphFileData, 8 + 8 * var3) + 1;
            }
        }

        this.field_array_int_a = new int[this.field_int_a];

        for (var3 = 0; var3 < imgCount; ++var3) {
            int var10002 = this.field_array_int_a[readShort(this.mphFileData, 8 + 8 * var3)]++;
        }

        this.arrayMpdData = new Object[this.field_int_a];
        this.arrayFlagExtra = new char[imgCount];

        for (var3 = 0; var3 < imgCount; ++var3) {
            this.arrayFlagExtra[var3] = readShort(this.mphFileData, 8 + 8 * var3 + 6);
        }

        this.PLTEMphPos = getPosChunkData(this.mphFileData, 12);
        this.tRNSMphPos = getPosChunkData(this.mphFileData, 13);
    }

    // $FF: renamed from: a () int
    public final int getImgCount() {
        return readInt(this.mphFileData, 4);
    }

    // $FF: renamed from: a (int) javax.microedition.lcdui.Image
    public final Image getImageById(int imgId) {
        byte[] imageDataMerged;
        return Image.createImage(imageDataMerged = this.getDataMerged(imgId), 0, imageDataMerged.length);
    }

    // $FF: renamed from: a () javax.microedition.lcdui.Image[]
    public final Image[] getAllImage() {
        this.enableLoad = true;
        int imgCount;
        Image[] allImage = new Image[imgCount = this.getImgCount()];

        for (int i = 0; i < imgCount; ++i) {
            allImage[i] = this.getImageById(i);
            MyGameCanvas.func_void_k();
        }

        this.func_void_a();
        return allImage;
    }

    // $FF: renamed from: b (int) javax.microedition.lcdui.Image
    public final Image getFlipImageById(int imgId) {
        if (!this.flagFlip) {
            return this.getImageById(imgId);
        } else {
            byte[] imageDataMerged;
            setupFlipImg(imageDataMerged = this.getDataMerged(imgId));
            return Image.createImage(imageDataMerged, 0, imageDataMerged.length);
        }
    }

    // $FF: renamed from: c (int) javax.microedition.lcdui.Image
    public final Image getImageGrayscale(int imgId) {
        byte[] imageDataMerged;
        convertImgColor(imageDataMerged = this.getDataMerged(imgId), 1);
        return Image.createImage(imageDataMerged, 0, imageDataMerged.length);
    }

    // $FF: renamed from: a (int, int) void
    public final void convertImgColor(int color1, int color2) {
        if (this.isSplitAdvance) {
            convertImgColor(this.mphFileData, this.PLTEMphPos, 4, color1, color2);
        }
    }

    // $FF: renamed from: a (int) byte[]
    private byte[] getMpdPartData(int imgId) {
        int mpdPartNo = this.getPartNo(imgId);
        if (this.enableLoad && this.arrayMpdData[mpdPartNo] == null) {
            this.func_void_a();

            try {
                this.loadMpdByPartNo(mpdPartNo);
            } catch (IOException ex) {
                System.out.println("[PNGMerger ERROR] cannot load mpd '" + this.imgFilePath + "' no." + mpdPartNo);
                ex.printStackTrace();
            }
        }

        return (byte[]) ((byte[]) this.arrayMpdData[mpdPartNo]);
    }

    // $FF: renamed from: a (int) int
    private int getPartNo(int imgId) {
        return readShort(this.mphFileData, 8 + 8 * imgId);
    }

    // $FF: renamed from: b (int) byte[]
    private byte[] getDataMerged(int imgId) {
        return this.isSplitAdvance ? this.mergeAdvance(imgId) : this.mergeBasic(imgId);
    }

    // $FF: renamed from: c (int) byte[]
    private byte[] mergeBasic(int imgId) {
        byte[] mpdData = this.getMpdPartData(imgId);

        int srcPos = readInt(this.mphFileData, 8 + imgId * 8 + 2);
        int sizeCopy = this.getSizeImgData(imgId);
        int sizeResult = 8 + sizeCopy;
        sizeResult += 12;

        byte[] arrayByteResult = new byte[sizeResult];

        System.arraycopy(PNGTagData, 0, arrayByteResult, 0, 8);
        System.arraycopy(mpdData, srcPos, arrayByteResult, 8, sizeCopy);

        int posIENDToResult = 8 + sizeCopy;
        System.arraycopy(IENDTagData, 0, arrayByteResult, posIENDToResult, 12);

        return arrayByteResult;
    }

    // $FF: renamed from: d (int) byte[]
    private byte[] mergeAdvance(int imgId) {
        byte[] mpdData = this.getMpdPartData(imgId);
        int posStartSearch = readInt(this.mphFileData, 8 + imgId * 8 + 2);
        int sizeChunkData = this.getSizeImgData(imgId);

        int sizeResult = (sizeResult = 8 + (this.mphFileData.length - (readInt(this.mphFileData, 4) * 8 + 8))) + sizeChunkData;
        sizeResult += 12;
        byte[] arrayByteResult = new byte[sizeResult];

        System.arraycopy(PNGTagData, 0, arrayByteResult, 0, 8);
        int posChunkData;
        if ((posChunkData = getPosChunkData(mpdData, 0, posStartSearch, sizeChunkData)) == -1) {
            return null;
        } else {
            int sizeCopy = readInt(mpdData, posChunkData) + 12;
            System.arraycopy(mpdData, posChunkData, arrayByteResult, 8, sizeCopy);
            int currentPosResult = 8 + sizeCopy;

            for (int tagExtraIdx = 0; tagExtraIdx < 18; ++tagExtraIdx) {
                if (this.isHasTagExtra(imgId, tagExtraIdx)) {
                    switch (tagExtraIdx) {
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 9:
                        case 10:
                            if ((posChunkData = getPosChunkData(mpdData, tagExtraIdx, posStartSearch, sizeChunkData)) != -1) {
                                sizeCopy = readInt(mpdData, posChunkData) + 12;
                                System.arraycopy(mpdData, posChunkData, arrayByteResult, currentPosResult, sizeCopy);
                                currentPosResult += sizeCopy;
                            }
                        case 6:
                        case 7:
                        case 8:
                    }
                }
            }

            posChunkData = this.PLTEMphPos;
            sizeCopy = readInt(this.mphFileData, posChunkData) + 12;
            System.arraycopy(this.mphFileData, posChunkData, arrayByteResult, currentPosResult, sizeCopy);

            currentPosResult += sizeCopy;
            if ((posChunkData = this.tRNSMphPos) != -1) {
                sizeCopy = readInt(this.mphFileData, posChunkData) + 12;
                System.arraycopy(this.mphFileData, posChunkData, arrayByteResult, currentPosResult, sizeCopy);
                currentPosResult += sizeCopy;
            }

            // hIST tag
            if (this.isHasTagExtra(imgId, 14) && (posChunkData = getPosChunkData(mpdData, 14, posStartSearch, sizeChunkData)) != -1) {
                sizeCopy = readInt(mpdData, posChunkData) + 12;
                System.arraycopy(mpdData, posChunkData, arrayByteResult, currentPosResult, sizeCopy);
                currentPosResult += sizeCopy;
            }

            // bKGD tag
            if (this.isHasTagExtra(imgId, 15) && (posChunkData = getPosChunkData(mpdData, 15, posStartSearch, sizeChunkData)) != -1) {
                sizeCopy = readInt(mpdData, posChunkData) + 12;
                System.arraycopy(mpdData, posChunkData, arrayByteResult, currentPosResult, sizeCopy);
                currentPosResult += sizeCopy;
            }

            // IDAT tag
            posChunkData = getPosChunkData(mpdData, 16, posStartSearch, sizeChunkData);
            sizeCopy = readInt(mpdData, posChunkData) + 12;
            System.arraycopy(mpdData, posChunkData, arrayByteResult, currentPosResult, sizeCopy);
            currentPosResult += sizeCopy;
            System.arraycopy(IENDTagData, 0, arrayByteResult, currentPosResult, 12);
            return arrayByteResult;
        }
    }

    // $FF: renamed from: b (int) int
    private int getSizeImgData(int imgId) {
        byte[] mpdData = this.getMpdPartData(imgId);
        boolean var3 = false;
        boolean var4 = false;
        int var5 = readInt(this.mphFileData, 8 + imgId * 8 + 2);
        int var6;
        if (imgId != this.getImgCount() - 1 && readShort(this.mphFileData, 8 + imgId * 8) == readShort(this.mphFileData, 8 + (imgId + 1) * 8)) {
            var6 = readInt(this.mphFileData, 8 + (imgId + 1) * 8 + 2);
        } else {
            var6 = mpdData.length;
        }

        return var6 - var5;
    }

    // $FF: renamed from: a (byte[], int, int, int) int
    private static int getPosChunkData(byte[] mpdData, int tagIdx, int posStart, int size) {
        String var4 = pngChunkHeaderTag[tagIdx];
        int posEnd;
        if (size == -1) {
            posEnd = mpdData.length;
        } else {
            posEnd = posStart + size;
        }

        for (int currentPos = posStart; currentPos < posEnd; currentPos += readInt(mpdData, currentPos) + 12) {
            if (mpdData[currentPos + 4] == var4.charAt(0)
                    && mpdData[currentPos + 5] == var4.charAt(1)
                    && mpdData[currentPos + 6] == var4.charAt(2)
                    && mpdData[currentPos + 7] == var4.charAt(3)) {
                return currentPos;
            }
        }

        return -1;
    }

    // $FF: renamed from: a (byte[], int) int
    private static int readInt(byte[] arrayByte, int pos) {
        if (arrayByte.length - 4 < pos) {
            throw new ArrayIndexOutOfBoundsException();
        } else {
            boolean var2 = false;
            int var3;
            return (var3 = 0 + (arrayByte[pos] & 255) * 16777216) + (arrayByte[pos + 1] & 255) * 65536 + (arrayByte[pos + 2] & 255) * 256 + (arrayByte[pos + 3] & 255);
        }
    }

    // $FF: renamed from: a (byte[], int) char
    private static char readShort(byte[] arrayByte, int pos) {
        if (arrayByte.length - 2 < pos) {
            throw new ArrayIndexOutOfBoundsException();
        } else {
            boolean var2 = false;
            char var3;
            return (char) ((var3 = (char) (0 + (arrayByte[pos] & 255) * 256)) + (arrayByte[pos + 1] & 255));
        }
    }

    // $FF: renamed from: a (int, int) boolean
    private boolean isHasTagExtra(int imgId, int tagExtraIdx) {
        char var3 = this.arrayFlagExtra[imgId];
        if (tagExtraIdx >= 1 && tagExtraIdx <= 16) {
            return (var3 >> tagExtraIdx - 1 & 1) == 1;
        } else {
            return false;
        }
    }

    // $FF: renamed from: b (byte[], int) int
    private static int getPosChunkData(byte[] arrayByte, int tagIdx) {
        String var2 = pngChunkHeaderTag[tagIdx];
        int var3 = arrayByte.length;

        for (int var4 = 0; var4 < var3 - 3; ++var4) {
            if (arrayByte[var4] == var2.charAt(0) && arrayByte[var4 + 1] == var2.charAt(1) && arrayByte[var4 + 2] == var2.charAt(2) && arrayByte[var4 + 3] == var2.charAt(3)) {
                return var4 - 4;
            }
        }

        return -1;
    }

    // $FF: renamed from: a (byte[]) void
    public static final void setupFlipImg(byte[] arrayByte) {
        int IDATPos = getPosChunkData(arrayByte, 16, 8, arrayByte.length);
        int IHDRPos = getPosChunkData(arrayByte, 0, 8, arrayByte.length);
        
        int var1 = readInt(arrayByte, IHDRPos + 8);
        int var2 = readInt(arrayByte, IHDRPos + 12);
        byte var3 = arrayByte[IHDRPos + 16];
        
        func_void_a(arrayByte, IDATPos, var1, var2, var3);
    }

    // $FF: renamed from: a (byte[], int, int, int, int) void
    private static void func_void_a(byte[] arrayByte, int var1, int var2, int var3, int var4) {
        int var5 = 8 / var4;
        int var6 = var3;
        int var7 = (var2 - 1) / var5 + 1;
        byte var8 = (byte) (255 >> 8 - var4);
        int var9 = var1 + 15;
        int var10 = (var7 + 1) * var3;
        int var11 = var2 / 2;
        int var12;
        int var13 = (var12 = var9 + var10) + 4;
        int var14 = var1 + 4;

        int var15;
        for (var15 = 0; var15 < var6; ++var15) {
            if (arrayByte[var9 + (var7 + 1) * var15] != 0) {
                return;
            }
        }

        for (int var24 = 0; var24 < var6; ++var24) {
            var15 = var9 + (var7 + 1) * var24 + 1;

            for (int var25 = 0; var25 < var11; ++var25) {
                int var26 = var2 - 1 - var25;
                int var16 = var15 + var25 / var5;
                int var17 = var15 + var26 / var5;
                int var18 = var25 % var5;
                int var19 = var26 % var5;
                byte var20 = (byte) ((var5 - var18 - 1) * var4);
                byte var21 = (byte) ((var5 - var19 - 1) * var4);
                byte var22 = (byte) (arrayByte[var16] >> var20 & var8);
                byte var23 = (byte) (arrayByte[var17] >> var21 & var8);
                arrayByte[var16] = (byte) (arrayByte[var16] & ~(var8 << var20) | var23 << var20);
                arrayByte[var17] = (byte) (arrayByte[var17] & ~(var8 << var21) | var22 << var21);
            }
        }

        field_class_an_a.func_void_a();
        field_class_an_a.func_void_a(arrayByte, var9, var10);
        System.arraycopy(intToByteArray((int) field_class_an_a.func_long_a()), 0, arrayByte, var12, 4);
        field_class_ca_a.func_void_a();
        field_class_ca_a.func_void_a(arrayByte, var14, var10 + 15);
        System.arraycopy(intToByteArray(field_class_ca_a.func_int_a()), 0, arrayByte, var13, 4);
    }

    // $FF: renamed from: a (byte[], int) void
    public static final void convertImgColor(byte[] arrayByte, int mode) {
        convertImgColor(arrayByte, mode, 0);
    }

    // $FF: renamed from: a (byte[], int, int) void
    public static final void convertImgColor(byte[] arrayByte, int mode, int color) {
        int posTagData = getPosChunkData(arrayByte, 12, 8, arrayByte.length);
        convertImgColor(arrayByte, posTagData, mode, color, 0);
    }

    // $FF: renamed from: b (byte[], int, int, int, int) void
    private static void convertImgColor(byte[] arrayByte, int posTagData, int mode, int color1, int color2) {
        int var5;
        int var7;
        var5 = readInt(arrayByte, posTagData);
        int var6;
        var7 = (var6 = posTagData + 8) + var5;
        byte var9;
        byte var12;
        int var15;
        int var16;
        int var17;
        int var18;
        label113:
        switch (mode) {
            case 0:
                switch (color1) {
                    case 0:
                        var15 = 0;

                        while (true) {
                            if (var15 >= var5 / 3) {
                                break label113;
                            }

                            var9 = arrayByte[var6 + var15 * 3];
                            arrayByte[var6 + var15 * 3] = arrayByte[var6 + var15 * 3 + 1];
                            arrayByte[var6 + var15 * 3 + 1] = var9;
                            ++var15;
                        }
                    case 1:
                        var15 = 0;

                        while (true) {
                            if (var15 >= var5 / 3) {
                                break label113;
                            }

                            var9 = arrayByte[var6 + var15 * 3 + 1];
                            arrayByte[var6 + var15 * 3 + 1] = arrayByte[var6 + var15 * 3 + 2];
                            arrayByte[var6 + var15 * 3 + 2] = var9;
                            ++var15;
                        }
                    case 2:
                        var15 = 0;

                        while (true) {
                            if (var15 >= var5 / 3) {
                                break label113;
                            }

                            var9 = arrayByte[var6 + var15 * 3];
                            arrayByte[var6 + var15 * 3] = arrayByte[var6 + var15 * 3 + 2];
                            arrayByte[var6 + var15 * 3 + 2] = var9;
                            ++var15;
                        }
                    case 3:
                        var15 = 0;

                        while (true) {
                            if (var15 >= var5 / 3) {
                                break label113;
                            }

                            var9 = arrayByte[var6 + var15 * 3];
                            arrayByte[var6 + var15 * 3] = arrayByte[var6 + var15 * 3 + 2];
                            arrayByte[var6 + var15 * 3 + 2] = arrayByte[var6 + var15 * 3 + 1];
                            arrayByte[var6 + var15 * 3 + 1] = var9;
                            ++var15;
                        }
                    case 4:
                        for (var15 = 0; var15 < var5 / 3; ++var15) {
                            var9 = arrayByte[var6 + var15 * 3];
                            arrayByte[var6 + var15 * 3] = arrayByte[var6 + var15 * 3 + 1];
                            arrayByte[var6 + var15 * 3 + 1] = arrayByte[var6 + var15 * 3 + 2];
                            arrayByte[var6 + var15 * 3 + 2] = var9;
                        }
                    default:
                        break label113;
                }
            case 1:
                var15 = 0;

                while (true) {
                    if (var15 >= var5 / 3) {
                        break label113;
                    }

                    var16 = arrayByte[var6 + var15 * 3] & 255;
                    var17 = arrayByte[var6 + var15 * 3 + 1] & 255;
                    var18 = arrayByte[var6 + var15 * 3 + 2] & 255;
                    var12 = (byte) ((var16 + var17 + var18) / 3);
                    arrayByte[var6 + var15 * 3] = var12;
                    arrayByte[var6 + var15 * 3 + 1] = var12;
                    arrayByte[var6 + var15 * 3 + 2] = var12;
                    ++var15;
                }
            case 2:
                var15 = 0;

                while (true) {
                    if (var15 >= var5 / 3) {
                        break label113;
                    }

                    var16 = arrayByte[var6 + var15 * 3] & 255;
                    var17 = arrayByte[var6 + var15 * 3 + 1] & 255;
                    var18 = arrayByte[var6 + var15 * 3 + 2] & 255;
                    arrayByte[var6 + var15 * 3] = (byte) (var16 * color1 * 10 / 1000 < 255 ? var16 * color1 * 10 / 1000 : 255);
                    arrayByte[var6 + var15 * 3 + 1] = (byte) (var17 * color1 * 10 / 1000 < 255 ? var17 * color1 * 10 / 1000 : 255);
                    arrayByte[var6 + var15 * 3 + 2] = (byte) (var18 * color1 * 10 / 1000 < 255 ? var18 * color1 * 10 / 1000 : 255);
                    ++var15;
                }
            case 3:
                var15 = 0;

                while (true) {
                    if (var15 >= var5 / 3) {
                        break label113;
                    }

                    arrayByte[var6 + var15 * 3] = (byte) (~arrayByte[var6 + var15 * 3]);
                    arrayByte[var6 + var15 * 3 + 1] = (byte) (~arrayByte[var6 + var15 * 3 + 1]);
                    arrayByte[var6 + var15 * 3 + 2] = (byte) (~arrayByte[var6 + var15 * 3 + 2]);
                    ++var15;
                }
            case 4:
                byte var8 = (byte) (color1 >> 16 & 255);
                var9 = (byte) (color1 >> 8 & 255);
                byte var10 = (byte) (color1 & 255);
                byte var11 = (byte) (color2 >> 16 & 255);
                var12 = (byte) (color2 >> 8 & 255);
                byte var13 = (byte) (color2 & 255);

                for (int var14 = 0; var14 < var5 / 3; ++var14) {
                    if (arrayByte[var6 + var14 * 3] == var8 && arrayByte[var6 + var14 * 3 + 1] == var9 && arrayByte[var6 + var14 * 3 + 2] == var10) {
                        arrayByte[var6 + var14 * 3] = var11;
                        arrayByte[var6 + var14 * 3 + 1] = var12;
                        arrayByte[var6 + var14 * 3 + 2] = var13;
                    }
                }
        }

        field_class_ca_a.func_void_a();
        field_class_ca_a.func_void_a(arrayByte, posTagData + 4, var5 + 4);
        System.arraycopy(intToByteArray(field_class_ca_a.func_int_a()), 0, arrayByte, var7, 4);
    }

    // $FF: renamed from: e (int) byte[]
    private static byte[] intToByteArray(int number) {
        byte[] var1;
        (var1 = new byte[4])[0] = (byte) (number >> 24 & 255);
        var1[1] = (byte) (number >> 16 & 255);
        var1[2] = (byte) (number >> 8 & 255);
        var1[3] = (byte) (number & 255);
        return var1;
    }
}
