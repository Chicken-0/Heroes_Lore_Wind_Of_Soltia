package rpg;

/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  javax.microedition.rms.RecordStore
 */
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import javax.microedition.rms.RecordStore;

public final class RecordStoreData {
    public RecordStore recordStore = null;
    public boolean var_boolean_a = true;
    public String recordStoreName;
    public ByteArrayInputStream byteArrayInputStream = null;
    public ByteArrayOutputStream byteArrayOutputStream = null;

    public RecordStoreData(String name, int disableCreateIfNecessary) throws Exception {
        name = name.replace('/', '_');
        this.recordStoreName = name;
        try {
            System.out.println("XFile " + name);
            this.recordStore = RecordStore.openRecordStore(name, (disableCreateIfNecessary != 1));
            if (this.recordStore == null) {
                throw new Exception("");
            }
            return;
        }
        catch (Exception exception) {
            this.var_boolean_a = false;
            if (disableCreateIfNecessary == 1) {
                throw exception;
            }
            return;
        }
    }

    public final void commitDataStore() {
        if (this.byteArrayOutputStream != null) {
            try {
                if (this.recordStore.getNumRecords() > 0) {
                    this.recordStore.closeRecordStore();
                    RecordStore.deleteRecordStore((String)this.recordStoreName);
                    this.recordStore = RecordStore.openRecordStore((String)this.recordStoreName, (boolean)true);
                }
                byte[] arrby = this.byteArrayOutputStream.toByteArray();
                System.out.println("close : " + arrby.length);
                this.recordStore.addRecord(arrby, 0, arrby.length);
            }
            catch (Exception exception) {}
        }
        try {
            this.recordStore.closeRecordStore();
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    public final void writeRecordToStream(byte[] arrby, int offset, int size) throws Exception {
        System.out.println("write " + this.recordStoreName);
        if (this.byteArrayOutputStream == null) {
            this.byteArrayOutputStream = new ByteArrayOutputStream();
        }
        this.byteArrayOutputStream.write(arrby, offset, size);
    }

    public final void b(byte[] arrby, int n2, int n3) throws Exception {
        System.out.println("read " + this.recordStoreName);
        if (this.byteArrayInputStream == null) {
            this.byteArrayInputStream = new ByteArrayInputStream(this.recordStore.getRecord(this.recordStore.getNextRecordID() - 1));
        }
        this.byteArrayInputStream.read(arrby, n2, n3);
    }

    public final int getRecordSize() throws Exception {
        System.out.println("available " + this.recordStoreName);
        if (this.var_boolean_a) {
            int id = this.recordStore.getNextRecordID() - 1;
            int size = this.recordStore.getRecordSize(id);
            return size;
        }
        System.out.println("available false");
        throw new Exception("");
    }

    public static final boolean isRecordExists(String recordName) {
        recordName = recordName.replace('/', '_');
        System.out.println("exists " + recordName);
        try {
            RecordStore recordStore = RecordStore.openRecordStore(recordName, false);
            recordStore.closeRecordStore();
        }
        catch (Exception exception) {
            System.out.println("exists false");
            return false;
        }
        return true;
    }

    public static final void deleteRecord(String recordName) {
        recordName = recordName.replace('/', '_');
        System.out.println("unlink " + recordName);
        try {
            RecordStore.deleteRecordStore((String)recordName);
            return;
        }
        catch (Exception exception) {
            return;
        }
    }
}

