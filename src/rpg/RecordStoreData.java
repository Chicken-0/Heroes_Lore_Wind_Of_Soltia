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
    public RecordStore var_javax_microedition_rms_RecordStore_a = null;
    public boolean var_boolean_a = true;
    public String var_java_lang_String_a;
    public ByteArrayInputStream var_java_io_ByteArrayInputStream_a = null;
    public ByteArrayOutputStream var_java_io_ByteArrayOutputStream_a = null;

    public RecordStoreData(String string, int n2) throws Exception {
        this.var_java_lang_String_a = string = string.replace('/', '_');
        try {
            System.out.println("XFile " + string);
            this.var_javax_microedition_rms_RecordStore_a = RecordStore.openRecordStore((String)string, (n2 != 1 ? 1 : 0) != 0);
            if (this.var_javax_microedition_rms_RecordStore_a == null) {
                throw new Exception("");
            }
            return;
        }
        catch (Exception exception) {
            this.var_boolean_a = false;
            if (n2 == 1) {
                throw exception;
            }
            return;
        }
    }

    public final void commitDataStore() {
        if (this.var_java_io_ByteArrayOutputStream_a != null) {
            try {
                if (this.var_javax_microedition_rms_RecordStore_a.getNumRecords() > 0) {
                    this.var_javax_microedition_rms_RecordStore_a.closeRecordStore();
                    RecordStore.deleteRecordStore((String)this.var_java_lang_String_a);
                    this.var_javax_microedition_rms_RecordStore_a = RecordStore.openRecordStore((String)this.var_java_lang_String_a, (boolean)true);
                }
                byte[] arrby = this.var_java_io_ByteArrayOutputStream_a.toByteArray();
                System.out.println("close : " + arrby.length);
                this.var_javax_microedition_rms_RecordStore_a.addRecord(arrby, 0, arrby.length);
            }
            catch (Exception exception) {}
        }
        try {
            this.var_javax_microedition_rms_RecordStore_a.closeRecordStore();
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    public final void writeRecordToStream(byte[] arrby, int offset, int size) throws Exception {
        System.out.println("write " + this.var_java_lang_String_a);
        if (this.var_java_io_ByteArrayOutputStream_a == null) {
            this.var_java_io_ByteArrayOutputStream_a = new ByteArrayOutputStream();
        }
        this.var_java_io_ByteArrayOutputStream_a.write(arrby, offset, size);
    }

    public final void b(byte[] arrby, int n2, int n3) throws Exception {
        System.out.println("read " + this.var_java_lang_String_a);
        if (this.var_java_io_ByteArrayInputStream_a == null) {
            this.var_java_io_ByteArrayInputStream_a = new ByteArrayInputStream(this.var_javax_microedition_rms_RecordStore_a.getRecord(this.var_javax_microedition_rms_RecordStore_a.getNextRecordID() - 1));
        }
        this.var_java_io_ByteArrayInputStream_a.read(arrby, n2, n3);
    }

    public final int int_a() throws Exception {
        System.out.println("available " + this.var_java_lang_String_a);
        if (this.var_boolean_a) {
            int n2 = this.var_javax_microedition_rms_RecordStore_a.getNextRecordID() - 1;
            int n3 = this.var_javax_microedition_rms_RecordStore_a.getRecordSize(n2);
            return n3;
        }
        System.out.println("available false");
        throw new Exception("");
    }

    public static final boolean boolean_a(String string) {
        string = string.replace('/', '_');
        System.out.println("exists " + string);
        try {
            RecordStore recordStore = RecordStore.openRecordStore((String)string, (boolean)false);
            recordStore.closeRecordStore();
        }
        catch (Exception exception) {
            System.out.println("exists false");
            return false;
        }
        return true;
    }

    public static final void void_a(String string) {
        string = string.replace('/', '_');
        System.out.println("unlink " + string);
        try {
            RecordStore.deleteRecordStore((String)string);
            return;
        }
        catch (Exception exception) {
            return;
        }
    }
}

