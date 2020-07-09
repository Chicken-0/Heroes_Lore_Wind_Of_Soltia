package rpg;

/*
 * Decompiled with CFR 0.150.
 */
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;

public final class BabbleText {
    public static BabbleText instance = new BabbleText();
    public byte[] textData;
    public byte idxLangCode = 0;
    public DataInputStream textDataStream;
    public final String[] arrayLanguageCode = new String[]{"en-GB", "fr-FR", "de-DE", "it-IT", "es-ES"};

    public BabbleText() {
//        String[] arrayLangText = new String[]{"English", "Fran\u00c7ais", "Deutsch", "Italiano", "Espa\u00d1ol"};
//        String[] arrstring = new String[]{"Select", "S\u00e9lection.", "W\u00e4hlen", "Selez.", "Elegir"};
//        String[] arrstring2 = new String[]{"Exit", "Quitter", "Beenden", "Esci", "Salir"};
    }

    private int a(String string) {
        int n2 = -1;
        try {
            if (string == null) {
                string = System.getProperty("microedition.locale");
            }
        }
        catch (Exception exception) {
            string = null;
        }
        if (string != null) {
            int n3;
            for (n3 = 0; n3 < this.arrayLanguageCode.length; ++n3) {
                if (this.arrayLanguageCode[n3].toLowerCase().compareTo(string.toLowerCase()) != 0) continue;
                n2 = n3;
                break;
            }
            if (n2 == -1) {
                for (n3 = 0; n3 < this.arrayLanguageCode.length; ++n3) {
                    if (this.arrayLanguageCode[n3].toLowerCase().substring(0, 2).compareTo(string.toLowerCase().substring(0, 2)) != 0) continue;
                    n2 = n3 | 0x8000;
                    break;
                }
            }
        }
        return n2;
    }

    public final void a(String filePath, String string2, int n2) {
        try {
            int n3;
            if (n2 < 0 && (n2 = this.a(string2)) == -1) { // n2 alway >= 0 ???
                n2 = 0;
            }
            this.idxLangCode = (byte)(n2 & 0x7FFF);
            InputStream inputStream = Runtime.getRuntime().getClass().getResourceAsStream(filePath + "." + this.arrayLanguageCode[this.idxLangCode]);
            DataInputStream dataInputStream = new DataInputStream(inputStream);
            int n4 = dataInputStream.readInt();// size data (skip first 4 byte)
            this.textData = new byte[n4];
            int n5 = 0;
            while ((n5 += (n3 = dataInputStream.read(this.textData, n5, n4 - n5))) < n4) {
            }
        }
        catch (IOException iOException) {
            System.out.println("ERROR: Couldn't load babble file." + iOException);
        }
        this.textDataStream = new DataInputStream(new ByteArrayInputStream(this.textData));
    }

    public final String getTextById(int textId) {
        try {
            this.textDataStream.reset();
            this.textDataStream.skip(textId << 2);
            this.textDataStream.skip(this.textDataStream.readInt());
            this.textDataStream.skip(2L);
            String string = this.textDataStream.readUTF();
            return string;
        }
        catch (IOException exception) {
            return textId + "." + exception.toString();
        }
    }

//    public static {
//        var_cj_a = new cj();
//        String[] arrstring = new String[]{"English", "Fran\u00c7ais", "Deutsch", "Italiano", "Espa\u00d1ol"};
//    }
}

