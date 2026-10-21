package androidx.emoji2.text.flatbuffer;

/* JADX INFO: compiled from: ReadWriteBuf.java */
/* JADX INFO: loaded from: classes2.dex */
public interface c extends b {
    void put(byte b10);

    void put(byte[] bArr, int i10, int i11);

    void putDouble(double d2);

    void putFloat(float f6);

    void putInt(int i10);

    void putLong(long j10);

    void putShort(short s4);

    int writePosition();
}
