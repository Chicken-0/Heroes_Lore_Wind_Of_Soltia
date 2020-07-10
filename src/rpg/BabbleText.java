package rpg;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;

// $FF: renamed from: cj
public final class BabbleText {

    public static BabbleText instance = new BabbleText();
    public byte[] textData;
    public byte idxLangCode = 0;
    public DataInputStream textDataStream;
    public final String[] arrayLanguageCode = new String[]{"en-GB", "fr-FR", "de-DE", "it-IT", "es-ES"};

    public BabbleText() {
        String[] var10000 = new String[]{"Select", "Sélection.", "Wählen", "Selez.", "Elegir"};
        var10000 = new String[]{"Exit", "Quitter", "Beenden", "Esci", "Salir"};
    }

    private int func_int_a(String var1) {
        int var2 = -1;

        try {
            if (var1 == null) {
                var1 = System.getProperty("microedition.locale");
            }
        } catch (Exception var4) {
            var1 = null;
        }

        if (var1 != null) {
            int var3;
            for (var3 = 0; var3 < this.arrayLanguageCode.length; ++var3) {
                if (this.arrayLanguageCode[var3].toLowerCase().compareTo(var1.toLowerCase()) == 0) {
                    var2 = var3;
                    break;
                }
            }

            if (var2 == -1) {
                for (var3 = 0; var3 < this.arrayLanguageCode.length; ++var3) {
                    if (this.arrayLanguageCode[var3].toLowerCase().substring(0, 2).compareTo(var1.toLowerCase().substring(0, 2)) == 0) {
                        var2 = var3 | 0x8000;
                        break;
                    }
                }
            }
        }

        return var2;
    }

    public final void func_void_a(String filePath, String var2, int var3) {
        try {
            if (var3 < 0 && (var3 = this.func_int_a(var2)) == -1) {
                var3 = 0;
            }

            this.idxLangCode = (byte) (var3 & 0x7FFF);
            InputStream inputStream = Runtime.getRuntime().getClass().getResourceAsStream(filePath + "." + this.arrayLanguageCode[this.idxLangCode]);
            DataInputStream dataInputStream = new DataInputStream(inputStream);
            int sizeData = dataInputStream.readInt();// size data (skip first 4 byte)
            this.textData = new byte[sizeData];
            int currentPos = 0;

            int sizeReaded;
            do {
                sizeReaded = dataInputStream.read(this.textData, currentPos, sizeData - currentPos);
            } while ((currentPos += sizeReaded) < sizeData);
        } catch (IOException ex) {
            System.out.println("ERROR: Couldn't load babble file." + ex);
        }

        this.textDataStream = new DataInputStream(new ByteArrayInputStream(this.textData));
    }

    public final String getTextById(int textId) {
        try {
            textId -= 0;
            this.textDataStream.reset();
            this.textDataStream.skip((long) (textId << 2));
            this.textDataStream.skip((long) this.textDataStream.readInt());
            this.textDataStream.skip(2L);
            return this.textDataStream.readUTF();
        } catch (Exception ex) {
            return textId + "." + ex.toString();
        }
    }

    static {
        String[] var10000 = new String[]{"English", "FranÇais", "Deutsch", "Italiano", "EspaÑol"};
    }
}
