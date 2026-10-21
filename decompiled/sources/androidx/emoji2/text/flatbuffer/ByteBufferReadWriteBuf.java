package androidx.emoji2.text.flatbuffer;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes2.dex */
public class ByteBufferReadWriteBuf implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ByteBuffer f21339a;

    public ByteBufferReadWriteBuf(ByteBuffer byteBuffer) {
        this.f21339a = byteBuffer;
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
    }

    @Override // androidx.emoji2.text.flatbuffer.b
    public byte[] data() {
        return this.f21339a.array();
    }

    @Override // androidx.emoji2.text.flatbuffer.b
    public byte get(int i10) {
        return this.f21339a.get(i10);
    }

    public boolean getBoolean(int i10) {
        return get(i10) != 0;
    }

    @Override // androidx.emoji2.text.flatbuffer.b
    public double getDouble(int i10) {
        return this.f21339a.getDouble(i10);
    }

    @Override // androidx.emoji2.text.flatbuffer.b
    public float getFloat(int i10) {
        return this.f21339a.getFloat(i10);
    }

    @Override // androidx.emoji2.text.flatbuffer.b
    public int getInt(int i10) {
        return this.f21339a.getInt(i10);
    }

    @Override // androidx.emoji2.text.flatbuffer.b
    public long getLong(int i10) {
        return this.f21339a.getLong(i10);
    }

    @Override // androidx.emoji2.text.flatbuffer.b
    public short getShort(int i10) {
        return this.f21339a.getShort(i10);
    }

    @Override // androidx.emoji2.text.flatbuffer.b
    public String getString(int i10, int i11) {
        return Utf8Safe.decodeUtf8Buffer(this.f21339a, i10, i11);
    }

    @Override // androidx.emoji2.text.flatbuffer.b
    public int limit() {
        return this.f21339a.limit();
    }

    @Override // androidx.emoji2.text.flatbuffer.c
    public void put(byte[] bArr, int i10, int i11) {
        this.f21339a.put(bArr, i10, i11);
    }

    public void putBoolean(boolean z10) {
        this.f21339a.put(z10 ? (byte) 1 : (byte) 0);
    }

    @Override // androidx.emoji2.text.flatbuffer.c
    public void putDouble(double d2) {
        this.f21339a.putDouble(d2);
    }

    @Override // androidx.emoji2.text.flatbuffer.c
    public void putFloat(float f6) {
        this.f21339a.putFloat(f6);
    }

    @Override // androidx.emoji2.text.flatbuffer.c
    public void putInt(int i10) {
        this.f21339a.putInt(i10);
    }

    @Override // androidx.emoji2.text.flatbuffer.c
    public void putLong(long j10) {
        this.f21339a.putLong(j10);
    }

    @Override // androidx.emoji2.text.flatbuffer.c
    public void putShort(short s4) {
        this.f21339a.putShort(s4);
    }

    public boolean requestCapacity(int i10) {
        return i10 <= this.f21339a.limit();
    }

    public void set(int i10, byte b10) {
        requestCapacity(i10 + 1);
        this.f21339a.put(i10, b10);
    }

    public void setBoolean(int i10, boolean z10) {
        set(i10, z10 ? (byte) 1 : (byte) 0);
    }

    public void setDouble(int i10, double d2) {
        requestCapacity(i10 + 8);
        this.f21339a.putDouble(i10, d2);
    }

    public void setFloat(int i10, float f6) {
        requestCapacity(i10 + 4);
        this.f21339a.putFloat(i10, f6);
    }

    public void setInt(int i10, int i11) {
        requestCapacity(i10 + 4);
        this.f21339a.putInt(i10, i11);
    }

    public void setLong(int i10, long j10) {
        requestCapacity(i10 + 8);
        this.f21339a.putLong(i10, j10);
    }

    public void setShort(int i10, short s4) {
        requestCapacity(i10 + 2);
        this.f21339a.putShort(i10, s4);
    }

    @Override // androidx.emoji2.text.flatbuffer.c
    public int writePosition() {
        return this.f21339a.position();
    }

    @Override // androidx.emoji2.text.flatbuffer.c
    public void put(byte b10) {
        this.f21339a.put(b10);
    }

    public void set(int i10, byte[] bArr, int i11, int i12) {
        requestCapacity((i12 - i11) + i10);
        ByteBuffer byteBuffer = this.f21339a;
        int iPosition = byteBuffer.position();
        byteBuffer.position(i10);
        byteBuffer.put(bArr, i11, i12);
        byteBuffer.position(iPosition);
    }
}
