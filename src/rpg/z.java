package rpg;

/*
 * Decompiled with CFR 0.150.
 */
import java.io.IOException;

public final class z {
    private int[] arrayIdText;
    public short numberEntry;

    public z(String resouceName) throws IOException {
        byte[] arrayByteData = ce.getResourceByName(resouceName + ".tdf");
        this.numberEntry = (short)(((arrayByteData[1] & 0xFF) << 8) | (arrayByteData[0] & 0xFF));
        this.arrayIdText = new int[this.numberEntry];
        
        int currentIdx = 2;
        for (int i = 0; i < this.numberEntry; ++i) {
            int sizeTextId = arrayByteData[currentIdx] & 0xFF;
            currentIdx += 1;
            String textId = new String(arrayByteData, currentIdx, sizeTextId);
            
            this.arrayIdText[i] = Integer.parseInt(textId.trim());
            currentIdx += sizeTextId + 1; // End with byte 00
        }
    }

    public final char[] a(int n2) {
        return BabbleText.instance.getTextById(this.arrayIdText[n2]).replace(';', '\n').toCharArray();
    }
}

