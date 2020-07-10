package rpg;

import javax.microedition.lcdui.Graphics;

// $FF: renamed from: d
public final class class_d extends class_cb {
   // $FF: renamed from: c byte
   private byte field_byte_c = 0;

   public class_d(class_cb var1) {
      super(var1, (byte)4);
   }

   // $FF: renamed from: a (int, int) boolean
   public final synchronized boolean func_boolean_a(int var1, int var2) {
      if (this.func_boolean_b(var1, var2)) {
         return true;
      } else if (this.field_byte_c != 0) {
         return true;
      } else if (this.func_boolean_a(var1, var2, false)) {
         return true;
      } else if (var2 != 53 && var1 != 8) {
         return false;
      } else {
         switch(super.field_byte_b) {
         case 0:
            if (MIDletConfig.isDemoVersion) {
               this.func_void_d();
            } else if (class_n.field_class_ae_a.field_boolean_a) {
               this.func_void_a(new Object[]{class_ai.field_class_z_a.loadByIndex(51), class_ai.field_class_z_a.loadByIndex(52)});
            } else {
               this.field_byte_c = 2;
               this.func_void_b();
            }
            break;
         case 1:
            super.field_class_cb_b = new class_bt(this, true);
            break;
         case 2:
            super.field_class_cb_b = new class_be(this, true);
            break;
         case 3:
            this.func_void_d();
         }

         return true;
      }
   }

   // $FF: renamed from: d () void
   public final void func_void_d() {
      Object[] var1;
      if (MIDletConfig.isDemoVersion) {
         var1 = new Object[]{UIGeneral.getTextById(3919).toCharArray()};
         this.func_void_a((byte)12, (byte)2, var1, UIGeneral.labelTextBuy, UIGeneral.labelTextExit);
      } else {
         var1 = new Object[]{UIGeneral.labelTextAreYouSure};
         this.func_void_a((byte)2, (byte)2, var1);
      }
   }

   // $FF: renamed from: a (byte, byte) void
   public final void func_void_a(byte var1, byte var2) {
      super.func_void_a(var1, var2);
      if (var1 == 12 || var1 == 2) {
         if (MIDletConfig.isDemoVersion) {
            if (var2 == 0) {
               UIGeneral.func_void_a(MIDletConfig.urlApp);
               return;
            }

            class_n.func_void_a((byte)14, (byte)1);
            SoundPlayerManager.close();
            class_bf.field_boolean_d = true;
            return;
         }

         if (var2 == 0) {
            class_n.func_void_a((byte)14, (byte)1);
            SoundPlayerManager.close();
         }
      }

   }

   // $FF: renamed from: a (javax.microedition.lcdui.Graphics, int, int) void
   public final void func_void_a(Graphics var1, int var2, int var3) {
      var3 += 15;
      MyGameCanvas.func_int_a(var1, class_ai.field_class_z_a.loadByIndex(41), var2 + 5, var3);
      boolean var4 = false;
      var2 = MyGameCanvas.canvasWidth - 108 >> 1;
      class_cb.func_void_a(var1, var2, var3 + 15, 108, class_ai.field_class_z_a.loadByIndex(42), super.field_byte_b == 0);
      class_cb.func_void_a(var1, var2, var3 + 37, 108, class_ai.field_class_z_a.loadByIndex(43), super.field_byte_b == 1);
      class_cb.func_void_a(var1, var2, var3 + 59, 108, class_ai.field_class_z_a.loadByIndex(44), super.field_byte_b == 2);
      class_cb.func_void_a(var1, var2, var3 + 81, 108, class_ai.field_class_z_a.loadByIndex(45), super.field_byte_b == 3);
      if (this.field_byte_c == 2) {
         this.field_byte_c = 1;
         int var5 = MyGameCanvas.canvasHalfWidth - 55;
         int var6 = MyGameCanvas.field_int_j - 11;
         class_cb.func_void_a(var1, var5, var6, 110, 22);
         class_cb.func_void_b(var1, var5, var6, 110, 22);
         var1.setColor(16777215);
         UIGeneral.func_int_a(var1, var5 + 5, var6 + 5, class_ai.field_class_z_a.loadByIndex(53), 1);
         this.func_void_b();
      } else {
         if (this.field_byte_c == 1) {
            this.field_byte_c = 0;

            try {
               class_n.func_void_o();
               this.func_void_a(new Object[]{class_ai.field_class_z_a.loadByIndex(46)});
               return;
            } catch (Exception var7) {
               this.func_void_a(new Object[]{class_ai.field_class_z_a.loadByIndex(47), class_ai.field_class_z_a.loadByIndex(48)});
            }
         }

      }
   }
}
