package rpg;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import javax.microedition.rms.RecordStore;

// $FF: renamed from: au
public final class XFile {
   public RecordStore recordStore = null;
   public boolean field_boolean_a = true;
   public String recordStoreName;
   public ByteArrayInputStream byteArrayInputStream = null;
   public ByteArrayOutputStream byteArrayOutputStream = null;

   public XFile(String filename, int readOnly) throws Exception {
      filename = filename.replace('/', '_');
      this.recordStoreName = filename;

      try {
         System.out.println("XFile " + filename);
         this.recordStore = RecordStore.openRecordStore(filename, readOnly != 1);
         if (this.recordStore == null) {
            throw new Exception("");
         }
      } catch (Exception var4) {
         this.field_boolean_a = false;
         if (readOnly == 1) {
            throw var4;
         }
      }
   }

   public final void close() {
      if (this.byteArrayOutputStream != null) {
         try {
            if (this.recordStore.getNumRecords() > 0) {
               this.recordStore.closeRecordStore();
               RecordStore.deleteRecordStore(this.recordStoreName);
               this.recordStore = RecordStore.openRecordStore(this.recordStoreName, true);
            }

            byte[] arrayByte = this.byteArrayOutputStream.toByteArray();
            System.out.println("close : " + arrayByte.length);
            this.recordStore.addRecord(arrayByte, 0, arrayByte.length);
         } catch (Exception ex) {
         }
      }

      try {
         this.recordStore.closeRecordStore();
      } catch (Exception ex) {
      }
   }

   public final void write(byte[] buffWrite, int offset, int size) throws Exception {
      System.out.println("write " + this.recordStoreName);
      if (this.byteArrayOutputStream == null) {
         this.byteArrayOutputStream = new ByteArrayOutputStream();
      }

      this.byteArrayOutputStream.write(buffWrite, offset, size);
   }

   public final void read(byte[] buffRead, int offset, int size) throws Exception {
      System.out.println("read " + this.recordStoreName);
      if (this.byteArrayInputStream == null) {
         this.byteArrayInputStream = new ByteArrayInputStream(this.recordStore.getRecord(this.recordStore.getNextRecordID() - 1));
      }

      this.byteArrayInputStream.read(buffRead, offset, size);
   }

   public final int getSize() throws Exception {
      System.out.println("available " + this.recordStoreName);
      if (this.field_boolean_a) {
         int recordId = this.recordStore.getNextRecordID() - 1;
         return this.recordStore.getRecordSize(recordId);
      } else {
         System.out.println("available false");
         throw new Exception("");
      }
   }

   public static final boolean exists(String filename) {
      filename = filename.replace('/', '_');
      System.out.println("exists " + filename);

      try {
         RecordStore.openRecordStore(filename, false).closeRecordStore();
         return true;
      } catch (Exception ex) {
         System.out.println("exists false");
         return false;
      }
   }

   public static final void delete(String filename) {
      filename = filename.replace('/', '_');
      System.out.println("unlink " + filename);

      try {
         RecordStore.deleteRecordStore(filename);
      } catch (Exception var2) {
      }
   }
}
