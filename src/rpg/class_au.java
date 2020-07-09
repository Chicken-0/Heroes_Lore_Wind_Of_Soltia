package rpg;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import javax.microedition.rms.RecordStore;

// $FF: renamed from: au
public final class class_au {
   // $FF: renamed from: a javax.microedition.rms.RecordStore
   public RecordStore field_class_javax_microedition_rms_RecordStore_a = null;
   // $FF: renamed from: a boolean
   public boolean field_boolean_a = true;
   // $FF: renamed from: a java.lang.String
   public String field_class_java_lang_String_a;
   // $FF: renamed from: a java.io.ByteArrayInputStream
   public ByteArrayInputStream field_class_java_io_ByteArrayInputStream_a = null;
   // $FF: renamed from: a java.io.ByteArrayOutputStream
   public ByteArrayOutputStream field_class_java_io_ByteArrayOutputStream_a = null;

   public class_au(String var1, int var2) throws Exception {
      var1 = var1.replace('/', '_');
      this.field_class_java_lang_String_a = var1;

      try {
         System.out.println("XFile " + var1);
         this.field_class_javax_microedition_rms_RecordStore_a = RecordStore.openRecordStore(var1, var2 != 1);
         if (this.field_class_javax_microedition_rms_RecordStore_a == null) {
            throw new Exception("");
         }
      } catch (Exception var4) {
         this.field_boolean_a = false;
         if (var2 == 1) {
            throw var4;
         }
      }
   }

   // $FF: renamed from: a () void
   public final void func_void_a() {
      if (this.field_class_java_io_ByteArrayOutputStream_a != null) {
         try {
            if (this.field_class_javax_microedition_rms_RecordStore_a.getNumRecords() > 0) {
               this.field_class_javax_microedition_rms_RecordStore_a.closeRecordStore();
               RecordStore.deleteRecordStore(this.field_class_java_lang_String_a);
               this.field_class_javax_microedition_rms_RecordStore_a = RecordStore.openRecordStore(this.field_class_java_lang_String_a, true);
            }

            byte[] var1 = this.field_class_java_io_ByteArrayOutputStream_a.toByteArray();
            System.out.println("close : " + var1.length);
            this.field_class_javax_microedition_rms_RecordStore_a.addRecord(var1, 0, var1.length);
         } catch (Exception var3) {
         }
      }

      try {
         this.field_class_javax_microedition_rms_RecordStore_a.closeRecordStore();
      } catch (Exception var2) {
      }
   }

   // $FF: renamed from: a (byte[], int, int) void
   public final void func_void_a(byte[] var1, int var2, int var3) throws Exception {
      System.out.println("write " + this.field_class_java_lang_String_a);
      if (this.field_class_java_io_ByteArrayOutputStream_a == null) {
         this.field_class_java_io_ByteArrayOutputStream_a = new ByteArrayOutputStream();
      }

      this.field_class_java_io_ByteArrayOutputStream_a.write(var1, var2, var3);
   }

   // $FF: renamed from: b (byte[], int, int) void
   public final void func_void_b(byte[] var1, int var2, int var3) throws Exception {
      System.out.println("read " + this.field_class_java_lang_String_a);
      if (this.field_class_java_io_ByteArrayInputStream_a == null) {
         this.field_class_java_io_ByteArrayInputStream_a = new ByteArrayInputStream(this.field_class_javax_microedition_rms_RecordStore_a.getRecord(this.field_class_javax_microedition_rms_RecordStore_a.getNextRecordID() - 1));
      }

      this.field_class_java_io_ByteArrayInputStream_a.read(var1, var2, var3);
   }

   // $FF: renamed from: a () int
   public final int func_int_a() throws Exception {
      System.out.println("available " + this.field_class_java_lang_String_a);
      if (this.field_boolean_a) {
         int var2 = this.field_class_javax_microedition_rms_RecordStore_a.getNextRecordID() - 1;
         return this.field_class_javax_microedition_rms_RecordStore_a.getRecordSize(var2);
      } else {
         System.out.println("available false");
         throw new Exception("");
      }
   }

   // $FF: renamed from: a (java.lang.String) boolean
   public static final boolean func_boolean_a(String var0) {
      var0 = var0.replace('/', '_');
      System.out.println("exists " + var0);

      try {
         RecordStore.openRecordStore(var0, false).closeRecordStore();
         return true;
      } catch (Exception var2) {
         System.out.println("exists false");
         return false;
      }
   }

   // $FF: renamed from: a (java.lang.String) void
   public static final void func_void_a(String var0) {
      var0 = var0.replace('/', '_');
      System.out.println("unlink " + var0);

      try {
         RecordStore.deleteRecordStore(var0);
      } catch (Exception var2) {
      }
   }
}
