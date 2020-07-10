package rpg;

import java.io.IOException;
import java.util.Vector;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;
import main.GameMIDlet;

// $FF: renamed from: bh
public final class UIGeneral {
   // $FF: renamed from: a java.lang.String
   public static String labelTextGain;
   // $FF: renamed from: b java.lang.String
   public static String labelTextProgress;
   // $FF: renamed from: a char[]
   public static char[] labelTextAreYouSure;
   // $FF: renamed from: b char[]
   public static char[] labelTextAppUrl;
   // $FF: renamed from: c char[]
   public static char[] labelTextExit;
   // $FF: renamed from: d char[]
   public static char[] labelTextOk;
   // $FF: renamed from: e char[]
   public static char[] labelTextBack;
   // $FF: renamed from: f char[]
   public static char[] labelTextSkip;
   // $FF: renamed from: g char[]
   public static char[] labelTextNext;
   // $FF: renamed from: h char[]
   public static char[] labelTextSell;
   // $FF: renamed from: i char[]
   public static char[] labelTextSelect;
   // $FF: renamed from: j char[]
   public static char[] labelTextBuy;
   // $FF: renamed from: k char[]
   public static char[] labelTextYes;
   // $FF: renamed from: l char[]
   public static char[] labelTextNo;
   // $FF: renamed from: a char[][]
   public static char[][] arrayTitleMenuText = new char[7][];
   // $FF: renamed from: m char[]
   public static char[] field_array_char_m = "               ".toCharArray();
   // $FF: renamed from: n char[]
   public static char[] labelTextPaused = null;
   // $FF: renamed from: o char[]
   public static char[] labelTextHandsOnMobile = null;
   // $FF: renamed from: p char[]
   public static char[] labelTextNowLoading = null;
   // $FF: renamed from: c java.lang.String
   public static String labelTextLV = null;
   // $FF: renamed from: q char[]
   public static char[] labelTextPressAnyKey = null;
   // $FF: renamed from: r char[]
   public static char[] labelTextVersion = null;
   // $FF: renamed from: s char[]
   public static char[] labelTextLEVEL;
   // $FF: renamed from: t char[]
   public static char[] labelTextNoSpace = null;
   // $FF: renamed from: d java.lang.String
   public static String labelTextG = null;
   // $FF: renamed from: a boolean
   public static boolean isBigFont = false;
   // $FF: renamed from: g b
   private static class_b fontSmallFontDefault;
   // $FF: renamed from: a b
   public static class_b fontSmallBlack;
   // $FF: renamed from: b b
   public static class_b fontSmallWhite;
   // $FF: renamed from: c b
   public static class_b fontSmallOrange;
   // $FF: renamed from: d b
   public static class_b fontBigWhiteBlack;
   // $FF: renamed from: e b
   public static class_b fontBigBlackWhite;
   // $FF: renamed from: f b
   public static class_b fontBigFontDefault;
   // $FF: renamed from: a java.util.Vector
   public static Vector field_class_java_util_Vector_a = new Vector();
   // $FF: renamed from: e java.lang.String
   public static String field_class_java_lang_String_e = "";

   // $FF: renamed from: a (javax.microedition.lcdui.Graphics, char[], char[]) void
   public static final void func_void_a(Graphics var0, char[] var1, char[] var2) {
      var0.setClip(0, 0, MyGameCanvas.canvasWidth, MyGameCanvas.field_int_h);
      int var3 = func_int_a() + 5;
      int var5;
      int var7;
      if (var1 != null) {
         var5 = getTextWidth(var1) + 2;
         boolean var6 = false;
         var7 = MyGameCanvas.field_int_h - var3 + 3;
         var0.setColor(0);
         var0.fillRect(0, var7, var5, var3);
         var0.setColor(16777215);
         func_int_a(var0, 1, var7 + 1, var1, 1);
      }

      if (var2 != null) {
         var5 = getTextWidth(var2) + 2;
         int var8 = MyGameCanvas.canvasWidth - var5;
         var7 = MyGameCanvas.field_int_h - var3 + 3;
         var0.setColor(0);
         var0.fillRect(var8, var7, var5, var3);
         var0.setColor(16777215);
         func_int_a(var0, var8 + 1, var7 + 1, var2, 1);
      }

   }

   // $FF: renamed from: a (javax.microedition.lcdui.Graphics) void
   public static final void func_void_a(Graphics var0) {
      var0.setClip(0, 0, MyGameCanvas.canvasWidth, MyGameCanvas.field_int_h);
      var0.setColor(0);
      var0.fillRect(0, 0, MyGameCanvas.canvasWidth, MyGameCanvas.field_int_h);
   }

   // $FF: renamed from: a (java.lang.String) void
   public static final void func_void_a(String var0) {
      try {
         GameMIDlet.instance.platformRequest(MIDletConfig.urlApp);
      } catch (Exception var2) {
         var2.printStackTrace();
      }

      GameMIDlet.instance.endApp();
   }

   // $FF: renamed from: a (javax.microedition.lcdui.Graphics, int, int, int) void
   public static final void func_void_a(Graphics var0, int var1, int var2, int var3) {
      var2 = MyGameCanvas.canvasWidth >> 1;
      setFontDefault(true);
      int var4 = var1 >> 1;
      if (var1 % 2 == 0) {
         var0.setColor(16777215);
      } else {
         var0.setColor(0);
      }

      func_void_a(var0, var2, var3 + 4, arrayTitleMenuText[var4], 1);
      setFontDefault(false);
   }

   // $FF: renamed from: a (boolean) void
   public static final void setFontDefault(boolean enableBigFont) {
      isBigFont = enableBigFont;
      if (isBigFont) {
         fontSmallFontDefault = fontBigWhiteBlack;
      } else {
         fontSmallFontDefault = fontSmallBlack;
      }
   }

   // $FF: renamed from: a (int, int) int
   public static final int func_int_a(int var0, int var1) {
      return var0 * var1 / 100;
   }

   // $FF: renamed from: a (cj) void
   public static final void loadCommonText(BabbleText babbleText) {
      labelTextGain = getTextById(3902) + " "; // Gain
      labelTextProgress = getTextById(3903); // Progress:
      labelTextAreYouSure = getTextById(3904).toCharArray(); // Are You Sure?
      labelTextAppUrl = getTextById(3906).toCharArray(); // www.HandsOn.com/Heroes
      labelTextExit = getTextById(3907).toCharArray(); // Exit
      labelTextOk = getTextById(3908).toCharArray(); // Ok
      labelTextBack = getTextById(3909).toCharArray(); // Back
      labelTextSkip = getTextById(3910).toCharArray(); // Skip
      labelTextNext = getTextById(3911).toCharArray(); // Next
      labelTextSell = getTextById(3912).toCharArray(); // Sell
      labelTextSelect = getTextById(3913).toCharArray(); // Select
      labelTextBuy = getTextById(3914).toCharArray(); // Buy
      labelTextYes = getTextById(3915).toCharArray(); // Yes
      labelTextNo = getTextById(3916).toCharArray(); // No
      arrayTitleMenuText[0] = getTextById(3920).toCharArray(); // New Game
      arrayTitleMenuText[1] = getTextById(3921).toCharArray(); // Load game
      arrayTitleMenuText[2] = getTextById(3922).toCharArray(); // Options
      arrayTitleMenuText[3] = getTextById(3923).toCharArray(); // Help
      arrayTitleMenuText[4] = getTextById(3924).toCharArray(); // About
      arrayTitleMenuText[5] = getTextById(3924).toCharArray(); // About
      arrayTitleMenuText[6] = getTextById(3926).toCharArray(); // Exit
      labelTextLEVEL = getTextById(3932).toCharArray(); // LEVEL
      labelTextPaused = getTextById(3946).toCharArray(); // Paused
      labelTextNoSpace = getTextById(3947).toCharArray(); // no space
      labelTextG = getTextById(3948); // G
      labelTextLV = getTextById(3949); // LV
      labelTextPressAnyKey = getTextById(3950).toCharArray(); // PRESS ANY KEY
   }

   // $FF: renamed from: a (int) java.lang.String
   public static final String getTextById(int textId) {
      return BabbleText.instance.getTextById(textId).replace(';', '\n');
   }

   // $FF: renamed from: a (java.lang.String) char[]
   public static final char[] func_array_char_a(String var0) {
      try {
         return BabbleText.instance.getTextById(Integer.parseInt(var0.trim())).replace(';', '\n').toCharArray();
      } catch (Exception var2) {
         return ("2." + var2.toString()).toCharArray();
      }
   }

   // $FF: renamed from: a () void
   public static final void loadAllFont() {
      fontSmallBlack = (class_b)class_b.createMFont("fonts/small", 0, false);
      fontSmallWhite = (class_b)class_b.createMFont("fonts/small", 16777215, false);
      fontSmallOrange = (class_b)class_b.createMFont("fonts/small", 16746496, false);
      fontBigWhiteBlack = (class_b)class_b.createMFont("fonts/big", 0, 16777215, true);
      fontBigBlackWhite = (class_b)class_b.createMFont("fonts/big", 16777215, 0, true);
      fontBigFontDefault = fontBigWhiteBlack;
      fontSmallBlack.activeControlChar = true;
      fontSmallWhite.activeControlChar = true;
      fontSmallOrange.activeControlChar = true;
      fontBigWhiteBlack.activeControlChar = true;
      fontBigBlackWhite.activeControlChar = true;
      fontBigFontDefault.activeControlChar = true;
      fontSmallFontDefault = fontSmallBlack;
   }

   // $FF: renamed from: a () int
   public static final int func_int_a() {
      return fontSmallFontDefault.field_int_a;
   }

   // $FF: renamed from: a (char[]) int
   public static final int getTextWidth(char[] charArray) {
      return fontSmallFontDefault.getTextWidth(toString(charArray));
   }

   // $FF: renamed from: a (char) boolean
   private static final boolean func_boolean_a(char var0) {
      return var0 == ';';
   }

   // $FF: renamed from: a (char[], int, int) int
   public static final int func_int_a(char[] var0, int var1, int var2) {
      int var3 = var1 + var2;
      boolean var4 = false;

      while(var3 < var0.length) {
         if (func_boolean_a(var0[var3])) {
            ++var3;
         } else {
            if (var4) {
               return var3 + 1 - var1;
            }

            var4 = true;
            ++var3;
         }
      }

      return var0.length - var1;
   }

   // $FF: renamed from: a (char[], int, int, int) int
   public static final int func_int_a(char[] var0, int var1, int var2, int var3) {
      String var4 = new String(var0, var1, var0.length - var1);
      return fontSmallFontDefault.func_int_a(var4, var2, var3);
   }

   // $FF: renamed from: a (char[], int) int
   public static final int func_int_a(char[] var0, int var1) {
      return func_class_java_util_Vector_a(toString(var0), var1).size();
   }

   // $FF: renamed from: a (int, int, char[], int, int, int) int
   public static final int func_int_a(int var0, int var1, char[] var2, int var3, int var4, int var5) {
      return func_int_a((String)(new String(var2)), 0, 0, var0);
   }

   // $FF: renamed from: b () int
   private static int func_int_b() {
      return fontSmallFontDefault.field_int_b;
   }

   // $FF: renamed from: a (java.lang.String, int, int, int) int
   private static int func_int_a(String var0, int var1, int var2, int var3) {
      return fontSmallFontDefault.func_int_a(func_class_java_util_Vector_a(var0, var3)) - func_int_b();
   }

   // $FF: renamed from: a (java.lang.String, int) java.util.Vector
   private static Vector func_class_java_util_Vector_a(String var0, int var1) {
      if (!var0.equals(field_class_java_lang_String_e)) {
         field_class_java_util_Vector_a.setSize(0);
         fontSmallFontDefault.func_class_java_util_Vector_a(field_class_java_util_Vector_a, var0, var1);
      }

      return field_class_java_util_Vector_a;
   }

   // $FF: renamed from: a (javax.microedition.lcdui.Graphics, int, int, char[], int) int
   public static final int func_int_a(Graphics var0, int var1, int var2, char[] var3, int var4) {
      return getFontByColor(var0.getColor()).func_int_a(var0, (char[])var3, var1, var2, 20);
   }

   // $FF: renamed from: a (int) az
   private static MFont getFontByColor(int color) {
      if (isBigFont) {
         if (color == 0) {
            return fontBigWhiteBlack;
         } else {
            return color == 16777215 ? fontBigBlackWhite : fontBigFontDefault;
         }
      } else if (color == 0) {
         return fontSmallBlack;
      } else {
         return color == 16777215 ? fontSmallWhite : fontSmallOrange;
      }
   }

   // $FF: renamed from: a (javax.microedition.lcdui.Graphics, int, int, char[], int) void
   public static final void func_void_a(Graphics var0, int var1, int var2, char[] var3, int var4) {
      getFontByColor(var0.getColor()).func_int_a(var0, (char[])var3, var1, var2, 17);
   }

   // $FF: renamed from: a (javax.microedition.lcdui.Graphics, int, int, int, int, char[], int, int, int) void
   public static final void func_void_a(Graphics var0, int var1, int var2, int var3, int var4, char[] var5, int var6, int var7, int var8) {
      var0.setClip(0, 0, MyGameCanvas.canvasWidth, MyGameCanvas.field_int_h);
      MFont var9 = getFontByColor(var0.getColor());
      if (var6 + var8 > var5.length) {
         var8 = var5.length - var6;
      }

      String var10 = new String(var5, var6, var8);
      var9.func_int_a(var0, func_class_java_util_Vector_a(var10, var3), var1, var2, MyGameCanvas.field_int_h, 20);
   }

   // $FF: renamed from: b (javax.microedition.lcdui.Graphics, int, int, int, int, char[], int, int, int) void
   public static final void func_void_b(Graphics var0, int var1, int var2, int var3, int var4, char[] var5, int var6, int var7, int var8) {
      var0.setClip(0, 0, MyGameCanvas.canvasWidth, MyGameCanvas.field_int_h);
      MFont var9 = getFontByColor(var0.getColor());
      if (var6 + var8 > var5.length) {
         var8 = var5.length - var6;
      }

      String var10 = new String(var5, var6, var8);
      var9.func_int_a(var0, func_class_java_util_Vector_a(var10, var3), var1, var2, MyGameCanvas.field_int_h, 17);
   }

   // $FF: renamed from: c (javax.microedition.lcdui.Graphics, int, int, int, int, char[], int, int, int) void
   public static final void func_void_c(Graphics var0, int var1, int var2, int var3, int var4, char[] var5, int var6, int var7, int var8) {
      var0.setClip(0, 0, MyGameCanvas.canvasWidth, MyGameCanvas.field_int_h);
      MFont var9 = getFontByColor(var0.getColor());
      Vector var10;
      int var11 = Math.min((var10 = func_class_java_util_Vector_a(new String(var5, var6, var5.length - var6), var3)).size(), 3);

      for(int var12 = 0; var12 < var11; ++var12) {
         String var13 = (String)var10.elementAt(var12);
         if (var8 <= var13.length()) {
            var9.func_int_a(var0, (String)var13, 0, var8, var1, var2, 20);
            return;
         }

         var9.func_int_a(var0, (String)var13, var1, var2, 20);
         var8 -= var13.length() + 1;
         var2 += fontSmallFontDefault.field_int_a + 2;
      }

      var0.setColor(16777215);
   }

   // $FF: renamed from: a (javax.microedition.lcdui.Graphics, int, int, int, int, char[], int) int
   public static final int func_int_a(Graphics var0, int var1, int var2, int var3, int var4, char[] var5, int var6) {
      var0.setClip(0, 0, MyGameCanvas.canvasWidth, MyGameCanvas.field_int_h);
      MFont var7 = getFontByColor(var0.getColor());
      String var8 = toString(var5);
      return var7.func_int_a(var0, func_class_java_util_Vector_a(var8, var3), var1, var2, MyGameCanvas.field_int_h, var6);
   }

   // $FF: renamed from: a (javax.microedition.lcdui.Graphics, int, int, int, int, char[]) int
   public static final int func_int_a(Graphics var0, int var1, int var2, int var3, int var4, char[] var5) {
      return func_int_a(var0, var1, var2, var3, var4, var5, 20);
   }

   // $FF: renamed from: a (char[]) java.lang.String
   public static final String toString(char[] var0) {
      return new String(var0);
   }

   // $FF: renamed from: a (java.lang.String, java.lang.String, java.lang.String) java.lang.String
   public static final String func_class_java_lang_String_a(String var0, String var1, String var2) {
      int var3;
      while((var3 = var0.indexOf(var1)) >= 0) {
         String var4 = var0.substring(0, var3);
         String var5 = var0.substring(var3 + var1.length());
         var0 = var4 + var2 + var5;
      }

      return var0;
   }

   // $FF: renamed from: a (java.lang.String) javax.microedition.lcdui.Image
   public static final Image getImageFromLangCodeFolder(String imgFilename) throws IOException {
      return Image.createImage("/" + BabbleText.instance.arrayLanguageCode[BabbleText.instance.idxLangCode] + "/" + imgFilename);
   }
}
