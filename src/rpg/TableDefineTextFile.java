package rpg;

import java.io.IOException;

// $FF: renamed from: z
public final class TableDefineTextFile {
   private int[] arrayIdText;
    public short numberEntry;

    public TableDefineTextFile(String resouceName) throws IOException {
        byte[] arrayByteData = class_ce.getResourceByName(resouceName + ".tdf");
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

    public final char[] loadByIndex(int idx) {
        String text = BabbleText.instance.getTextById(this.arrayIdText[idx]).replace(';', '\n');
        return text.toCharArray();
    }
}
