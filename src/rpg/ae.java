package rpg;

/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 *  javax.microedition.lcdui.Image
 */
import java.io.IOException;
import java.util.Vector;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public final class ae
implements u {
    private static final int[] var_int_arr_a = new int[]{0xFFDF3F, 0x3F1F3F, 0xFFDF3F, 0x3F1F3F, 0xFFDFBF, 0x7F3F3F, 0xBFFF3F, 0x1F3F3F, 0, 0, 0xBFFF3F, 0x1F3F3F, 0x3FBFFF, 0x1F3F3F, 0xBFFF3F, 0x1F3F3F, 0xBFFF3F, 0x1F3F3F, 0xBFFF3F, 0x1F3F3F, 0, 0, 0xFFDFBF, 0x7F3F3F, 0xDFFFFF, 2047871, 0xDFFFFF, 2047871, 0xFFDFBF, 0x7F3F3F};
    private static byte var_byte_c = (byte)2;
    private static final byte[] byte_arr_h = new byte[]{28, 0, 27, 29, -1, 1, 26, 31, 31, 2, -1, 25, 24, 24, 30, 3, -1, -1, -1, -1};
    String[] arrstring = new String[]{"SET_TILE", "SET_COLI", "OBJ_XY  ", "OBJ_DEL ", "NPC_XY  ", "NPC_DEL ", "ENM_XY  ", "ENM_DEL ", "END     ", "OBJ_NUM ", "NPC_NUM ", "EMO_HERO", "EMO_NPC "};
    private static byte var_byte_d = (byte)-1;
    public byte mapId;
    public byte objRefId;
    public boolean var_boolean_a;
    public boolean var_boolean_b;
    private byte var_byte_e;
    public boolean var_boolean_c;
    public int mapTileHorizontalCount;
    public int mapTileVerticalCount;
    public int mapWidth;
    public int mapHeight;
    public byte[][] arrayByteMapConv;
    public byte[][] arrayByteEvtConv;
    public ck[][] arrayMapTileInfo;
    public ac[] var_ac_arr_a;
    public aj[] var_aj_arr_a;
    private aq var_aq_a;
    private Vector var_java_util_Vector_a;
    private Vector var_java_util_Vector_b;
    private int g;
    public int var_int_e = 0;
    public int f = 0;
    public Object[] var_java_lang_Object_arr_a;
    public Object[] var_java_lang_Object_arr_b;
    public Object[] var_java_lang_Object_arr_c;
    private boolean var_boolean_d;
    private byte[] resourceByteData;
    public char[] var_char_arr_a;

    public static final boolean a(int n2) {
        return n2 == 11 || n2 == 13 || n2 == 15 || n2 == 82;
    }

    public ae(byte mapId) {
        this.mapId = mapId;
        this.var_boolean_c = false;
        this.var_boolean_a = ae.a(mapId);
        this.var_boolean_b = mapId == 13 || mapId == 15;
        this.var_aq_a = new aq();
        this.var_java_util_Vector_b = new Vector();
        this.g = 16;
        this.var_java_util_Vector_a = new Vector();
        if (MyGameCanvas.g >= 240 && MyGameCanvas.h >= 240) {
            var_byte_c = (byte)3;
        }
    }

    public final void a() {
        int currentEvtPos;
        System.out.println("map : " + n.mapId);
        ce.c();
        ce.d();
        ce.e();
        ce.m();
        this.var_java_lang_Object_arr_a = null;
        this.var_java_lang_Object_arr_b = null;
        this.var_java_lang_Object_arr_c = null;
        this.l();
        for (currentEvtPos = 0; currentEvtPos <= 4; currentEvtPos = (int)((byte)(currentEvtPos + 1))) {
            SoundPlayerManager.b((byte)currentEvtPos);
        }
        for (currentEvtPos = 24; currentEvtPos <= 31; currentEvtPos = (byte)(currentEvtPos + 1)) {
            SoundPlayerManager.b((byte)currentEvtPos);
        }
        MyGameCanvas.k();
        this.resourceByteData = ce.getResourceByName("/m/" + (n.mapId < 10 ? "0" : "") + n.mapId + ".map");
        MyGameCanvas.k();
        this.objRefId = this.resourceByteData[0];// image id in folder m\t\
        this.mapTileHorizontalCount = this.resourceByteData[1];
        this.mapTileVerticalCount = this.resourceByteData[2];
        if (this.objRefId != 1 && this.objRefId != 5 && this.objRefId != 9 && this.objRefId != 15) {
            this.var_boolean_c = true;
        }
        this.arrayMapTileInfo = new ck[this.mapTileVerticalCount][this.mapTileHorizontalCount];
        MyGameCanvas.k();
        this.mapWidth = this.mapTileHorizontalCount * 16;
        this.mapHeight = this.mapTileVerticalCount * 16;
        MyGameCanvas.k();
        this.convertMapArray(this.resourceByteData, 3);
        this.resourceByteData = null;
        if (var_byte_d != this.objRefId) {
            ce.cleanArrayMapImg();
        }
        System.gc();
        this.resourceByteData = ce.getResourceByName("/m/" + n.var_byte_a + "/" + (n.mapId < 10 ? "0" : "") + n.mapId + ".evt");
        MyGameCanvas.k();
        MyGameCanvas.k();
        this.convertEvtArray(this.resourceByteData, 0);
        currentEvtPos = 0 + this.mapTileHorizontalCount * this.mapTileVerticalCount;
        MyGameCanvas.k();
        currentEvtPos += this.int_a(this.resourceByteData, currentEvtPos);// init img map ??
        MyGameCanvas.k();
        currentEvtPos += this.int_b(this.resourceByteData, currentEvtPos);
        MyGameCanvas.k();
        currentEvtPos += this.int_c(this.resourceByteData, currentEvtPos);
        MyGameCanvas.k();
        currentEvtPos += this.d(this.resourceByteData, currentEvtPos);
        MyGameCanvas.k();
        currentEvtPos += this.e(this.resourceByteData, currentEvtPos);
        this.void_c(this.resourceByteData, currentEvtPos);
        this.resourceByteData = null;
        switch (this.mapId) {
            case 11: {
                ae.e();
                this.f();
                break;
            }
            case 13: {
                ae.g();
                this.a(true);
                break;
            }
            case 15: {
                ae.h();
                this.i();
                break;
            }
            case 82: {
                ae.j();
                this.k();
            }
        }
        if (ce.var_javax_microedition_lcdui_Image_arr_e == null) {
            MyGameCanvas.k();
            try {
                PNGMerger br2 = new PNGMerger("/m/t/t" + (this.objRefId < 10 ? "0" : "") + this.objRefId);
                ce.var_javax_microedition_lcdui_Image_arr_e = br2.getAllImage();
                MyGameCanvas.k();
            }
            catch (IOException iOException) {}
        }
        var_byte_d = this.objRefId;
        this.var_char_arr_a = n.var_byte_a == 8 && this.mapId == 65 ? ce.var_z_d.loadByIndex(85) : ce.var_z_d.loadByIndex(this.mapId);
        this.var_byte_e = this.var_char_arr_a != null && this.var_char_arr_a.length > 0 ? (byte)10 : (byte)0;
        if (this.mapId == 79 || this.mapId == 80 || this.mapId == 81) {
            SoundPlayerManager.setupSoundPlayer((byte)4);
            SoundPlayerManager.setupSoundPlayer((byte)8);
            SoundPlayerManager.startPlayer1(4);
        } else {
            if (this.objRefId == 1 || this.objRefId == 5 || this.objRefId == 9 || this.objRefId == 15) {
                SoundPlayerManager.setupSoundPlayer((byte)8);
            }
            if (byte_arr_h[this.objRefId] != -1) {
                SoundPlayerManager.setupSoundPlayer(byte_arr_h[this.objRefId]);
                SoundPlayerManager.startPlayer1((int)byte_arr_h[this.objRefId]);
            }
        }
        n.ao_a().void_c();
    }

    private final void convertMapArray(byte[] arrby, int pos) {
        this.arrayByteMapConv = new byte[this.mapTileVerticalCount][this.mapTileHorizontalCount];
        MyGameCanvas.k();
        for (int i = 0; i < this.mapTileVerticalCount; ++i) {
            System.arraycopy(arrby, pos, this.arrayByteMapConv[i], 0, this.mapTileHorizontalCount);
            pos += this.mapTileHorizontalCount;
        }
        MyGameCanvas.k();
    }

    private final void convertEvtArray(byte[] arrby, int pos) {
        this.arrayByteEvtConv = new byte[this.mapTileVerticalCount][this.mapTileHorizontalCount];
        MyGameCanvas.k();
        for (int i = 0; i < this.mapTileVerticalCount; ++i) {
            System.arraycopy(arrby, pos, this.arrayByteEvtConv[i], 0, this.mapTileHorizontalCount);
            pos += this.mapTileHorizontalCount;
        }
        MyGameCanvas.k();
    }

    private final int int_a(byte[] evtArray, int evtPos) {
        int n3;
        int imgCount;
        Image[] arrayImgMap = null;
        if ((imgCount = evtArray[evtPos++] & 0xFF) > 0) {
            PNGMerger pngMerger;
            try {
                pngMerger = new PNGMerger("/m/t/o" + (this.objRefId < 10 ? "0" : "") + this.objRefId);
                pngMerger.enableLoad = true;
                MyGameCanvas.k();
                arrayImgMap = ce.arrayImgMap = new Image[pngMerger.getImgCount()];
                MyGameCanvas.k();
                for (n3 = 0; n3 < imgCount; ++n3) {
                    int imgId = evtArray[evtPos++] & 0xFF;
                    arrayImgMap[imgId] = pngMerger.getImageById(imgId);
                    MyGameCanvas.k();
                }
            }
            catch (IOException iOException) {
//                object = iOException;
                iOException.printStackTrace();
            }
        }
        MyGameCanvas.k();
        int n5 = evtArray[evtPos++] & 0xFF;
        this.var_aj_arr_a = new aj[n5];
        for (n3 = 0; n3 < n5; ++n3) {
            short posX = (short)((evtArray[evtPos++] & 0xFF) * 16);
            short posY = (short)((evtArray[evtPos++] & 0xFF) * 16);
            byte by2 = evtArray[evtPos++];
            byte by3 = evtArray[evtPos++];
            int n6 = evtArray[evtPos++] & 0xFF;// img id
            aj aj2 = new aj(posX, posY, by2, by3, arrayImgMap[n6]);
            this.var_aq_a.b(aj2);
            this.var_aq_a.c(aj2);
            this.var_aj_arr_a[n3] = aj2;
        }
        MyGameCanvas.k();
        return 1 + imgCount + 1 + n5 * 5;
    }

    private final int int_b(byte[] arrby, int n2) {
        byte by2;
        int n3;
        int n4;
        PNGMerger object;
        byte by3;
        int n5 = 0;
        Image[] arrimage = null;
        int n6 = arrby[n2++] & 0xFF;
        ++n5;
        for (by3 = 0; by3 < 5; by3 = (byte)(by3 + 1)) {
            ce.d(by3);
        }
        ce.var_byte_arr_l = new byte[5];
        for (by3 = 0; by3 < 5; by3 = (byte)(by3 + 1)) {
            ce.var_byte_arr_l[by3] = -1;
        }
        try {
            object = new PNGMerger("/npc/all");
            object.enableLoad = true;
            MyGameCanvas.k();
            arrimage = ce.var_javax_microedition_lcdui_Image_arr_g = new Image[((PNGMerger)object).getImgCount()];
            n4 = 0;
            for (n3 = 0; n3 < n6; n3 = (int)((byte)(n3 + 1))) {
                by2 = arrby[n2++];
                ++n5;
                if (by2 >= 18) {
                    arrimage[by2 - 18] = ((PNGMerger)object).getImageById(by2 - 18);
                    MyGameCanvas.k();
                    continue;
                }
                if (by2 == 3) {
                    ce.var_byte_arr_l[n4] = by2;
                    ce.a((short)17, (byte)n4, true);
                    n4 = (byte)(n4 + 1);
                    continue;
                }
                if (by2 == 6) {
                    ce.var_byte_arr_l[n4] = by2;
                    ce.a((short)20, (byte)n4, true);
                    n4 = (byte)(n4 + 1);
                    continue;
                }
                ce.var_byte_arr_l[n4] = by2;
                MyGameCanvas.k();
                ce.b(by2, (byte)n4);
                n4 = (byte)(n4 + 1);
                String cfr_ignored_0 = "Npc Loaded - " + by2;
            }
        }
        catch (IOException iOException) {
//            object = iOException;
            iOException.printStackTrace();
        }
        MyGameCanvas.k();
        int n7 = arrby[n2++] & 0xFF;
        ++n5;
        this.var_ac_arr_a = new ac[n7];
        for (n4 = 0; n4 < n7; ++n4) {
            n3 = arrby[n2++];
            by2 = arrby[n2++];
            byte by4 = arrby[n2++];
            byte by5 = -1;
            if (by4 >= 18) {
                by5 = -1;
            } else {
                for (byte by6 = 0; by6 < ce.var_byte_arr_l.length; by6 = (byte)(by6 + 1)) {
                    if (ce.var_byte_arr_l[by6] != by4) continue;
                    by5 = by6;
                    break;
                }
                x.a(by5 != -1);
            }
            ac ac2 = new ac((short)(n3 * 16), (short)(by2 * 16), by4, by5);
            this.var_aq_a.b(ac2);
            this.var_aq_a.c(ac2);
            ac2.g();
            n5 += 3;
            this.var_ac_arr_a[n4] = ac2;
        }
        MyGameCanvas.k();
        return n5;
    }

    private final int int_c(byte[] arrby, int n2) {
        int n3;
        byte by2 = 0;
        int by3;
        int n4;
        for (n4 = 0; n4 < 5; n4 = (byte)(n4 + 1)) {
            ce.c((byte)n4);
        }
        ce.var_byte_arr_k = new byte[5];
        for (n4 = 0; n4 < 5; n4 = (byte)(n4 + 1)) {
            ce.var_byte_arr_k[n4] = -1;
        }
        n4 = 0;
        x.a((by3 = arrby[n2++] & 0xFF) <= 5);
        ++n4;
        MyGameCanvas.k();
        byte[] arrby2 = null;
        if (by3 != 0) {
            j.a(5);
            arrby2 = ce.getResourceByName("/enm/data" + (n.g >= 2 ? 2 : (int)n.g));
            MyGameCanvas.k();
        }
        boolean by22 = false;
        while (by2 < by3) {
            n3 = arrby[n2++] & 0xFF;
            ++n4;
            ce.var_byte_arr_k[by2] = (byte)n3;
            j.a(arrby2, (byte)n3, by2);
            MyGameCanvas.k();
            ce.a((short)n3, by2, false);
            j.a(by2);
            MyGameCanvas.k();
            String cfr_ignored_0 = "Enemy Loaded - " + n3;
            by2 = (byte)(by2 + 1);
        }
        MyGameCanvas.k();
        int n5 = arrby[n2++] & 0xFF;
        ++n4;
        for (n3 = 0; n3 < n5; ++n3) {
            int n6 = arrby[n2++] & 0xFF;
            int n7 = arrby[n2++] & 0xFF;
            byte by4 = arrby[n2++];
            n4 += 3;
            this.a((int)by4, 0, n6, n7);
            MyGameCanvas.k();
        }
        return n4;
    }

    private final int d(byte[] arrby, int n2) {
        int n3 = arrby[n2++];
        try {
            PNGMerger br2 = new PNGMerger("/m/face");
            br2.enableLoad = true;
            ce.var_javax_microedition_lcdui_Image_arr_h = new Image[br2.getImgCount()];
            for (int i2 = 0; i2 < n3; ++i2) {
                byte by2 = arrby[n2++];
                ce.var_javax_microedition_lcdui_Image_arr_h[by2] = br2.getImageById(by2);
            }
        }
        catch (IOException iOException) {
            IOException iOException2 = iOException;
            iOException.printStackTrace();
        }
        return n3 + 1;
    }

    private final void l() {
        ce.var_javax_microedition_lcdui_Image_arr_h = null;
    }

    private final int e(byte[] arrby, int n2) {
        int n3;
        int n4;
        int n5 = 0;
        int n6 = arrby[n2++] & 0xFF;
        ++n5;
        this.var_java_lang_Object_arr_a = new Object[n6];
        MyGameCanvas.k();
        for (n4 = 0; n4 < n6; ++n4) {
            n3 = arrby[n2++] & 0xFF;
            ++n5;
            if (n3 <= 0) continue;
            byte[][] arrby2 = new byte[n3][7];
            for (int i2 = 0; i2 < n3; ++i2) {
                System.arraycopy(arrby, n2, arrby2[i2], 0, 7);
                n2 += 7;
                n5 += 7;
            }
            this.var_java_lang_Object_arr_a[n4] = arrby2;
        }
        MyGameCanvas.k();
        n4 = arrby[n2++] & 0xFF;
        ++n5;
        this.var_java_lang_Object_arr_b = new Object[n4];
        for (n3 = 0; n3 < n4; ++n3) {
            int n7 = arrby[n2++] & 0xFF;
            ++n5;
            if (n7 <= 0) continue;
            byte[][] arrby3 = new byte[n7][3];
            for (int i3 = 0; i3 < n7; ++i3) {
                System.arraycopy(arrby, n2, arrby3[i3], 0, 3);
                n2 += 3;
                n5 += 3;
            }
            this.var_java_lang_Object_arr_b[n3] = arrby3;
        }
        MyGameCanvas.k();
        n3 = arrby[n2++] & 0xFF;
        ++n5;
        this.var_java_lang_Object_arr_c = new Object[n3];
        for (int i4 = 0; i4 < n3; ++i4) {
            int n8 = arrby[n2++] & 0xFF;
            ++n5;
            this.var_java_lang_Object_arr_c[i4] = bh.char_arr_a(new String(arrby, n2, n8));
            n2 += n8;
            n5 += n8;
        }
        MyGameCanvas.k();
        return n5;
    }

    private final void void_c(byte[] arrby, int n2) {
        int n3;
        int n4;
        int n5 = -1;
        int n6 = arrby[n2++];
        for (n4 = 0; n4 < n6; n4 = (int)((byte)(n4 + 1))) {
            n3 = 0;
            n3 = 0 | (arrby[n2++] & 3) << 8;
            if (n.boolean_a(n3 |= arrby[n2++]) && n5 == -1) {
                n5 = arrby[n2];
            }
            ++n2;
        }
        n4 = arrby[n2++];
        for (n3 = 0; n3 < n4; n3 = (int)((byte)(n3 + 1))) {
            byte by2 = arrby[n2++];
            if (n5 == n3) {
                for (byte by3 = 0; by3 < by2; by3 = (byte)(by3 + 1)) {
                    byte by4 = arrby[n2++];
                    byte by5 = arrby[n2++];
                    byte by6 = arrby[n2++];
                    byte by7 = arrby[n2++];
                    this.b(by4, by5, by6, by7);
                }
                continue;
            }
            n2 += by2 * 4;
        }
    }

    private final void b(byte by2, byte by3, byte by4, byte by5) {
        switch (by2) {
            case 100: {
                this.arrayByteMapConv[by4][by3] = by5;
                return;
            }
            case 101: {
                this.arrayByteEvtConv[by4][by3] = by5;
                return;
            }
            case 102: {
                aj aj2 = this.var_aj_arr_a[by5 & 0xFF];
                aj2.a((short)((by3 & 0xFF) << 4), (short)((by4 & 0xFF) << 4));
                return;
            }
            case 103: {
                aj aj3 = this.var_aj_arr_a[by3 & 0xFF];
                this.a(aj3);
                this.var_aj_arr_a[by3 & 255] = null;
                return;
            }
            case 104: {
                ac ac2 = this.var_ac_arr_a[by5 & 0xFF];
                ac2.a((short)((by3 & 0xFF) << 4), (short)((by4 & 0xFF) << 4));
                return;
            }
            case 105: {
                ac ac3 = this.var_ac_arr_a[by3 & 0xFF];
                this.var_ac_arr_a[by3 & 0xFF].d = false;
                ac3.f();
                return;
            }
            case 106: {
                x.a(false);
                return;
            }
            case 107: {
                x.a(false);
                return;
            }
            case 108: {
                return;
            }
            case 109: {
                aj aj4 = this.var_aj_arr_a[by3 & 0xFF];
                this.var_aj_arr_a[by3 & 0xFF].var_javax_microedition_lcdui_Image_a = ce.arrayImgMap[by4 & 0xFF];
                return;
            }
            case 110: {
                ac ac4 = this.var_ac_arr_a[by3 & 0xFF];
                this.var_ac_arr_a[by3 & 0xFF].f = by4;
                return;
            }
            case 111: {
                ao ao2 = n.ao_a();
                ao2.void_c();
                if (by3 == 0) break;
                ao2.a(new aw((byte)10, (byte)-1, (short)(by3 - 1)));
                return;
            }
            case 112: {
                ac ac5 = this.var_ac_arr_a[by3];
                ac5.void_c();
                if (by4 == 0) break;
                ac5.a(new aw((byte)10, (byte)-1, (short)(by4 - 1)));
            }
        }
    }

    public final void a(Graphics graphics) {
        int n2 = bs.var_bs_a.var_boolean_d ? n.var_int_c : n.var_int_a;
        int n3 = bs.var_bs_a.var_boolean_d ? n.var_int_d : n.var_int_b;
        int n4 = as.var_int_a;
        int n5 = as.b;
        if (this.var_boolean_b) {
            n2 = n.var_int_a;
            n3 = n.var_int_b + 30;
        }
        if (n2 > 0) {
            n2 = 0;
        }
        if (n2 < n4 - this.mapWidth) {
            n2 = n4 - this.mapWidth;
        }
        if (n3 > 0) {
            n3 = 0;
        }
        if (n3 < n5 - this.mapHeight) {
            n3 = n5 - this.mapHeight;
        }
        if (n2 > 0) {
            n2 = (n4 - this.mapWidth) / 2;
            graphics.setColor(0);
            graphics.fillRect(0, 0, n4, n5);
        }
        if (n3 > 0) {
            n3 = (n5 - this.mapHeight) / 2;
            graphics.setColor(0);
            graphics.fillRect(0, 0, n4, n5);
        }
        graphics.setClip(0, 0, n4, n5);
        if (this.var_int_e != 0) {
            n2 += this.var_int_e;
            this.var_int_e = 0;
        }
        if (this.f != 0) {
            n3 += this.f;
            this.f = 0;
        }
        this.a(graphics, n2, n3, n4, n5);
        this.a(graphics, n2, n3);
        this.b(graphics, n2, n3);
        if (this.var_byte_e > 0) {
            int n6 = n5 / 4;
            if (this.var_byte_e > 8) {
                graphics.setClip(0, n6 + 4 * (this.var_byte_e - 8), n4, 8 * (10 - this.var_byte_e + 1));
            } else if (this.var_byte_e < 3) {
                graphics.setClip(0, n6 + 4 * (3 - this.var_byte_e), n4, 8 * this.var_byte_e);
            } else {
                graphics.setClip(0, 0, MyGameCanvas.g, MyGameCanvas.h);
            }
            graphics.setColor(0);
            graphics.fillRect(0, n6, n4, 22);
            graphics.setColor(14663551);
            graphics.drawLine(0, n6, n4, n6);
            graphics.drawLine(0, n6 + 21, n4, n6 + 21);
            graphics.setColor(0xFFFFFF);
            bh.void_a(graphics, n4 / 2, n6 + 12 - 4, this.var_char_arr_a, 1);
            this.var_byte_e = (byte)(this.var_byte_e - 1);
        }
        graphics.setClip(0, 0, MyGameCanvas.g, MyGameCanvas.h);
    }

    private final void a(Graphics graphics, int n2, int n3, int n4, int n5) {
        int n6 = -n2 / 16;
        int n7 = -n3 / 16;
        int n8 = (n4 - n2 - 1) / 16;
        int n9 = (n5 - n3 - 1) / 16;
        if (n6 < 0) {
            n6 = 0;
        }
        if (n7 < 0) {
            n7 = 0;
        }
        if (n8 >= this.mapTileHorizontalCount) {
            n8 = this.mapTileHorizontalCount - 1;
        }
        if (n9 >= this.mapTileVerticalCount) {
            n9 = this.mapTileVerticalCount - 1;
        }
        Image[] arrimage = ce.var_javax_microedition_lcdui_Image_arr_e;
        for (int i2 = n7; i2 <= n9; ++i2) {
            int n10 = n3 + i2 * 16;
            int n11 = n2 + n6 * 16;
            for (int i3 = n6; i3 <= n8; ++i3) {
                Image image = arrimage[this.arrayByteMapConv[i2][i3]];
                if (image == null) {
                    if (this.arrayByteEvtConv[i2][i3] < 0) {
                        graphics.setColor(0);
                    } else if (this.arrayByteEvtConv[i2][i3] >= 0) {
                        graphics.setColor(0xFFFFFF);
                    }
                    graphics.fillRect(n11, n10, 16, 16);
                } else {
                    graphics.drawImage(image, n11, n10, 20);
                }
                n11 += 16;
            }
        }
    }

    private final void a(Graphics graphics, int n2, int n3) {
        for (int i2 = 0; i2 < this.var_java_util_Vector_a.size(); ++i2) {
            byte[] arrby = (byte[])this.var_java_util_Vector_a.elementAt(i2);
            if (arrby[5] <= 16 && arrby[5] % 3 == 0) continue;
            graphics.drawImage(arrby[2] == -1 ? ce.B : ce.A, n2 + (arrby[0] << 4) + 8, n3 + (arrby[1] << 4) + 8, 33);
        }
    }

    private final void b(Graphics graphics, int n2, int n3) {
        ck ck2 = this.var_aq_a.var_ck_a;
        while (ck2 != null) {
            ck2.a(graphics, n2, n3);
            ck2 = ck2.var_ck_a;
        }
    }

    public final void b(Graphics graphics) {
        int n2 = this.mapTileHorizontalCount * var_byte_c;
        int n3 = this.mapTileVerticalCount * var_byte_c;
        int n4 = MyGameCanvas.i - n2 / 2;
        int n5 = MyGameCanvas.j - n3 / 2;
        graphics.setColor(0);
        graphics.drawRect(n4 - 1, n5 - 1, n2 + 1, n3 + 1);
        for (int n6 = 0; n6 < this.mapTileVerticalCount; n6 = (int)((byte)(n6 + 1))) {
            for (int n7 = 0; n7 < this.mapTileHorizontalCount; n7 = (int)((byte)(n7 + 1))) {
                if (this.arrayByteEvtConv[n6][n7] < 0) {
                    graphics.setColor(var_int_arr_a[this.objRefId * 2 + 1]);
                } else if (this.arrayByteEvtConv[n6][n7] >= 0) {
                    graphics.setColor(var_int_arr_a[this.objRefId * 2]);
                }
                if (this.arrayByteEvtConv[n6][n7] != 0 && this.arrayByteEvtConv[n6][n7] != -128 && ah.boolean_a(this.arrayByteEvtConv[n6][n7] < 0 ? (byte)(-this.arrayByteEvtConv[n6][n7]) : this.arrayByteEvtConv[n6][n7])) {
                    if (this.objRefId == 6) {
                        graphics.setColor(0xFF3FBF);
                    } else {
                        graphics.setColor(0x3F7FFF);
                    }
                }
                graphics.fillRect(n4, n5, (int)var_byte_c, (int)var_byte_c);
                n4 += var_byte_c;
            }
            n5 += var_byte_c;
            n4 = MyGameCanvas.i - n2 / 2;
        }
        if (this.var_boolean_d) {
            ao ao2 = n.ao_a();
            graphics.setColor(0xFF3F3F);
            graphics.fillRect(MyGameCanvas.i - n2 / 2 + ao2.var_byte_a * var_byte_c, MyGameCanvas.j - n3 / 2 + ao2.var_byte_b * var_byte_c, (int)var_byte_c, (int)var_byte_c);
        }
        this.var_boolean_d = !this.var_boolean_d;
        graphics.setColor(0);
        graphics.fillRect(0, 0, MyGameCanvas.g, 20);
        graphics.setColor(0xFFFFFF);
        bh.void_a(graphics, MyGameCanvas.i, 8, this.var_char_arr_a, 1);
    }

    public final void b() {
        this.a(true, (byte)3);
        this.o();
        this.m();
    }

    public final void c() {
        this.n();
    }

    public final void d() {
        this.g = 0;
        this.a(false, (byte)3);
    }

    private final void a(boolean bl2, byte by2) {
        --this.g;
        if (this.g < 0) {
            this.g = 16;
            for (int i2 = this.var_java_util_Vector_b.size() - 1; i2 >= 0; --i2) {
                int[] arrn = (int[])this.var_java_util_Vector_b.elementAt(i2);
                int[] arrn2 = arrn;
                arrn[0] = arrn[0] - 16;
                if (arrn2[0] >= 0) continue;
                byte by3 = (byte)arrn2[1];
                byte by4 = (byte)arrn2[2];
                byte by5 = (byte)arrn2[3];
                byte by6 = -1;
                for (byte by7 = 0; by7 < ce.var_byte_arr_k.length; by7 = (byte)((byte)(by7 + 1))) {
                    if (ce.var_byte_arr_k[by7] != by3) continue;
                    by6 = by7;
                    break;
                }
                if (j.var_j_arr_a[by6].var_byte_a == 2 && by4 >= this.mapTileHorizontalCount - 1) {
                    System.out.println("INVALID location for enemy - delayed creation.");
                    this.var_java_util_Vector_b.removeElementAt(i2);
                    this.a(arrn2[1], 0, by4 - 1, (int)by5);
                    continue;
                }
                if (this.a(by4, by5, by3, by6, bl2, by2, (byte)5)) {
                    this.var_java_util_Vector_b.removeElementAt(i2);
                    continue;
                }
                arrn2[0] = 0;
            }
        }
    }

    public final boolean a(byte by2, byte by3, byte by4, byte by5, boolean bl2, byte by6, byte by7) {
        byte by8 = 1;
        if (j.var_j_arr_a[by5].var_byte_a == 2) {
            by8 = 2;
        }
        if (bl2) {
            by2 = (byte)(by2 + h.a(-by6, (int)by6));
            by3 = (byte)(by3 + h.a(-by6, (int)by6));
        }
        while (!this.a((int)by2, (int)by3, by8) && by7 > 0) {
            by7 = (byte)(by7 - 1);
            by2 = (byte)(by2 + h.a(-by6, (int)by6));
            by3 = (byte)(by3 + h.a(-by6, (int)by6));
        }
        if (by7 > 0) {
            al al2 = new al((short)(by2 << 4), (short)(by3 << 4), by4, by5);
            this.var_aq_a.b(al2);
            this.var_aq_a.c(al2);
            al2.void_a((byte)1);
            al2.b((byte)2);
            return true;
        }
        return false;
    }

    private final void m() {
        ck ck2 = this.var_aq_a.var_ck_a;
        while (ck2 != null) {
            if (ck2 instanceof aj) {
                ck2 = ck2.var_ck_a;
                continue;
            }
            if (ck2 instanceof al && !ck2.var_boolean_c) {
                al al2 = (al)ck2;
                al2.void_d();
                ck2 = ck2.var_ck_a;
                this.var_aq_a.c(al2);
                if (al2.byte_h != 6) continue;
                this.a(al2);
                continue;
            }
            if (ck2 instanceof y && !ck2.var_boolean_c) {
                y y2 = (y)ck2;
                y2.void_a();
                ck2 = ck2.var_ck_a;
                this.var_aq_a.c(y2);
                if (!y2.boolean_a()) continue;
                this.a(y2);
                continue;
            }
            if (ck2.var_boolean_c) {
                ck2.var_boolean_c = false;
                ck2 = ck2.var_ck_a;
                continue;
            }
            ck2 = ck2.var_ck_a;
        }
    }

    private final void n() {
        ck ck2 = this.var_aq_a.var_ck_a;
        while (ck2 != null) {
            if (ck2 instanceof ac && !ck2.var_boolean_c) {
                ac ac2 = (ac)ck2;
                ac2.void_d();
                ck2 = ck2.var_ck_a;
                this.var_aq_a.c(ac2);
                continue;
            }
            if (ck2.var_boolean_c) {
                ck2.var_boolean_c = false;
                ck2 = ck2.var_ck_a;
                continue;
            }
            ck2 = ck2.var_ck_a;
        }
    }

    private final void o() {
        for (int i2 = this.var_java_util_Vector_a.size() - 1; i2 >= 0; --i2) {
            byte[] arrby = (byte[])this.var_java_util_Vector_a.elementAt(i2);
            byte[] arrby2 = arrby;
            arrby[5] = (byte)(arrby[5] - 1);
            if (arrby2[5] >= 0) continue;
            this.var_java_util_Vector_a.removeElementAt(i2);
        }
    }

    public final boolean a(int n2, int n3) {
        if (n2 < 0 || n3 < 0 || n2 >= this.mapTileHorizontalCount || n3 >= this.mapTileVerticalCount) {
            return false;
        }
        return this.arrayByteEvtConv[n3][n2] >= 0 && this.arrayMapTileInfo[n3][n2] == null;
    }

    public final boolean a(int n2, int n3, byte n4) {
        for (int i2 = 0; i2 < n4; ++i2) {
            if (this.a(n2 + i2, n3)) continue;
            return false;
        }
        return true;
    }

    public final boolean a(o o2, int n2, int n3) {
        for (int i2 = 0; i2 < o2.e; ++i2) {
            if (n2 + i2 < 0 || n3 < 0 || n2 + i2 >= this.mapTileHorizontalCount || n3 >= this.mapTileVerticalCount) {
                return false;
            }
            if (this.a(n2 + i2, n3) || this.arrayMapTileInfo[n3][n2 + i2] == o2) continue;
            return false;
        }
        return true;
    }

    public final boolean a(o o2, byte by2) {
        return this.a(o2, o2.var_byte_a + u.var_byte_arr_a[by2], o2.var_byte_b + u.array_byte_b[by2]);
    }

    public final void a(ck ck2) {
        if (ck2 instanceof o) {
            ((o)ck2).f();
        }
        this.var_aq_a.ck_a(ck2);
    }

    public final void b(ck ck2) {
        this.var_aq_a.b(ck2);
        this.var_aq_a.c(ck2);
    }

    public final void c(ck ck2) {
        this.var_aq_a.c(ck2);
    }

    public final void a(int n2, int n3, int n4, int n5) {
        int[] arrn = new int[4];
        int[] arrn2 = arrn;
        arrn[0] = n3;
        arrn2[1] = n2;
        arrn2[2] = n4;
        arrn2[3] = n5;
        this.var_java_util_Vector_b.addElement(arrn2);
    }

    public final void a(byte by2, byte by3, byte by4, byte by5) {
        if (by4 == 22) {
            return;
        }
        byte[] arrby = new byte[]{by2, by3, by4, by5, 1, 120};
        this.var_java_util_Vector_a.addElement(arrby);
    }

    public final void a(byte by2, byte by3, short s2) {
        byte[] arrby = new byte[]{by2, by3, -1, (byte)(s2 / 100), (byte)(s2 % 100), 120};
        this.var_java_util_Vector_a.addElement(arrby);
    }

    public final byte[] byte_arr_a(byte by2, byte by3) {
        int n2;
        byte[] arrby = null;
        for (n2 = 0; n2 < this.var_java_util_Vector_a.size(); ++n2) {
            byte[] arrby2 = (byte[])this.var_java_util_Vector_a.elementAt(n2);
            if (arrby2[0] != by2 || arrby2[1] != by3) continue;
            if (arrby2[2] == -1) {
                arrby = arrby2;
                break;
            }
            if (arrby2[2] == 22) {
                if (!n.ao_a().var_g_b.a(arrby2[2], arrby2[3], (int)arrby2[4])) continue;
                arrby = arrby2;
                break;
            }
            if (!n.ao_a().var_g_a.a(arrby2[2], arrby2[3], (int)arrby2[4])) continue;
            arrby = arrby2;
            break;
        }
        if (arrby != null) {
            this.var_java_util_Vector_a.removeElementAt(n2);
            return arrby;
        }
        return null;
    }

    public final boolean boolean_a(byte by2, byte by3) {
        for (int i2 = 0; i2 < this.var_java_util_Vector_a.size(); ++i2) {
            byte[] arrby = (byte[])this.var_java_util_Vector_a.elementAt(i2);
            if (arrby[0] != by2 || arrby[1] != by3) continue;
            return true;
        }
        return false;
    }

    public static final void e() {
        j.a(5);
        byte[] arrby = ce.getResourceByName("/enm/data" + (n.g >= 2 ? 2 : (int)n.g));
        ce.var_byte_arr_k[0] = 32;
        j.a(arrby, (byte)32, (byte)0);
        ce.e((byte)1);
        j.b((byte)0);
    }

    public final void f() {
        cc cc2 = new cc((byte)10, (byte)9, (byte)32, (byte)0);
        this.b(cc2);
        cc2.void_a((byte)1);
        cc2.b((byte)2);
    }

    public static final void g() {
        j.a(5);
        byte[] arrby = ce.getResourceByName("/enm/data" + (n.g >= 2 ? 2 : (int)n.g));
        ce.var_byte_arr_k[0] = 35;
        ce.var_byte_arr_k[1] = 36;
        ce.var_byte_arr_k[2] = 37;
        ce.var_byte_arr_k[3] = 38;
        ce.var_byte_arr_k[4] = 4;
        j.a(arrby, (byte)35, (byte)0);
        j.a(arrby, (byte)36, (byte)1);
        j.a(arrby, (byte)37, (byte)2);
        j.a(arrby, (byte)38, (byte)3);
        j.a(arrby, (byte)4, (byte)4);
        ce.e((byte)2);
        ce.a((short)4, (byte)4, false);
        j.b((byte)0);
        j.b((byte)1);
        j.b((byte)2);
        j.b((byte)3);
        j.a((byte)4);
    }

    public final void a(boolean bl2) {
        if (bl2) {
            ar ar2 = new ar((byte)9, (byte)5, (byte)35, (byte)0);
            this.b(ar2);
            ar2.void_a((byte)1);
            ar2.b((byte)2);
            return;
        }
        ag ag2 = new ag((byte)9, (byte)5, (byte)36, (byte)1);
        this.b(ag2);
        ag2.void_a((byte)2);
        ag2.b((byte)2);
        bd bd2 = new bd((byte)6, (byte)5, (byte)37, (byte)2);
        this.b(bd2);
        bd2.void_a((byte)2);
        bd2.b((byte)2);
        cd cd2 = new cd((byte)13, (byte)5, (byte)38, (byte)3);
        this.b(cd2);
        cd2.void_a((byte)2);
        cd2.b((byte)2);
        cd2.a(ag2, bd2);
        ag2.a(cd2, bd2);
    }

    public static final void h() {
        j.a(5);
        byte[] arrby = ce.getResourceByName("/enm/data" + (n.g >= 2 ? 2 : (int)n.g));
        ce.var_byte_arr_k[0] = 39;
        ce.var_byte_arr_k[1] = 40;
        ce.var_byte_arr_k[2] = 41;
        j.a(arrby, (byte)39, (byte)0);
        j.a(arrby, (byte)40, (byte)1);
        j.a(arrby, (byte)41, (byte)2);
        ce.e((byte)3);
        j.b((byte)0);
        j.b((byte)1);
        j.b((byte)2);
    }

    public final void i() {
        ba ba2 = new ba(this, (byte)0, (byte)7, (byte)40, (byte)1);
        this.b(ba2);
        ba2.void_a((byte)1);
        ba2.b((byte)1);
        ak ak2 = new ak(this, (byte)13, (byte)7, (byte)41, (byte)2);
        this.b(ak2);
        ak2.void_a((byte)1);
        ak2.b((byte)1);
        cg cg2 = new cg((byte)7, (byte)7, (byte)39, (byte)0, ba2, ak2);
        this.b(cg2);
        cg2.void_a((byte)2);
        cg2.b((byte)1);
    }

    public static final void j() {
        byte[] arrby = ce.getResourceByName("/enm/data" + (n.g >= 2 ? 2 : (int)n.g));
        ce.var_byte_arr_k[1] = 42;
        j.a(arrby, (byte)42, (byte)1);
        ce.e((byte)4);
        j.b((byte)1);
    }

    public final void k() {
        bv bv2 = new bv(this, (byte)7, (byte)10, (byte)42, (byte)1);
        this.b(bv2);
        bv2.void_a((byte)1);
        bv2.b((byte)2);
    }

//    public static {
//        var_int_arr_a = new int[]{0xFFDF3F, 0x3F1F3F, 0xFFDF3F, 0x3F1F3F, 0xFFDFBF, 0x7F3F3F, 0xBFFF3F, 0x1F3F3F, 0, 0, 0xBFFF3F, 0x1F3F3F, 0x3FBFFF, 0x1F3F3F, 0xBFFF3F, 0x1F3F3F, 0xBFFF3F, 0x1F3F3F, 0xBFFF3F, 0x1F3F3F, 0, 0, 0xFFDFBF, 0x7F3F3F, 0xDFFFFF, 2047871, 0xDFFFFF, 2047871, 0xFFDFBF, 0x7F3F3F};
//        var_byte_c = (byte)2;
//        h = new byte[]{28, 0, 27, 29, -1, 1, 26, 31, 31, 2, -1, 25, 24, 24, 30, 3, -1, -1, -1, -1};
//        String[] arrstring = new String[]{"SET_TILE", "SET_COLI", "OBJ_XY  ", "OBJ_DEL ", "NPC_XY  ", "NPC_DEL ", "ENM_XY  ", "ENM_DEL ", "END     ", "OBJ_NUM ", "NPC_NUM ", "EMO_HERO", "EMO_NPC "};
//        var_byte_d = (byte)-1;
//    }
}

