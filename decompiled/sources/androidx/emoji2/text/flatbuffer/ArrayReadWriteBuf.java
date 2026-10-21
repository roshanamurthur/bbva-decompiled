package androidx.emoji2.text.flatbuffer;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public class ArrayReadWriteBuf implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte[] f21334a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f21335b;

    public ArrayReadWriteBuf() {
        this(10);
    }

    @Override // androidx.emoji2.text.flatbuffer.b
    public byte[] data() {
        return this.f21334a;
    }

    @Override // androidx.emoji2.text.flatbuffer.b
    public byte get(int i10) {
        return this.f21334a[i10];
    }

    public boolean getBoolean(int i10) {
        return this.f21334a[i10] != 0;
    }

    @Override // androidx.emoji2.text.flatbuffer.b
    public double getDouble(int i10) {
        return Double.longBitsToDouble(getLong(i10));
    }

    @Override // androidx.emoji2.text.flatbuffer.b
    public float getFloat(int i10) {
        return Float.intBitsToFloat(getInt(i10));
    }

    @Override // androidx.emoji2.text.flatbuffer.b
    public int getInt(int i10) {
        byte[] bArr = this.f21334a;
        return (bArr[i10] & 255) | (bArr[i10 + 3] << 24) | ((bArr[i10 + 2] & 255) << 16) | ((bArr[i10 + 1] & 255) << 8);
    }

    @Override // androidx.emoji2.text.flatbuffer.b
    public long getLong(int i10) {
        byte[] bArr = this.f21334a;
        int i11 = i10 + 6;
        return (((long) bArr[i10]) & 255) | ((((long) bArr[i10 + 1]) & 255) << 8) | ((((long) bArr[i10 + 2]) & 255) << 16) | ((((long) bArr[i10 + 3]) & 255) << 24) | ((((long) bArr[i10 + 4]) & 255) << 32) | ((((long) bArr[i10 + 5]) & 255) << 40) | ((((long) bArr[i11]) & 255) << 48) | (((long) bArr[i10 + 7]) << 56);
    }

    @Override // androidx.emoji2.text.flatbuffer.b
    public short getShort(int i10) {
        byte[] bArr = this.f21334a;
        return (short) ((bArr[i10] & 255) | (bArr[i10 + 1] << 8));
    }

    @Override // androidx.emoji2.text.flatbuffer.b
    public String getString(int i10, int i11) {
        return Utf8Safe.decodeUtf8Array(this.f21334a, i10, i11);
    }

    @Override // androidx.emoji2.text.flatbuffer.b
    public int limit() {
        return this.f21335b;
    }

    @Override // androidx.emoji2.text.flatbuffer.c
    public void put(byte[] bArr, int i10, int i11) {
        set(this.f21335b, bArr, i10, i11);
        this.f21335b += i11;
    }

    public void putBoolean(boolean z10) {
        setBoolean(this.f21335b, z10);
        this.f21335b++;
    }

    @Override // androidx.emoji2.text.flatbuffer.c
    public void putDouble(double d2) {
        setDouble(this.f21335b, d2);
        this.f21335b += 8;
    }

    @Override // androidx.emoji2.text.flatbuffer.c
    public void putFloat(float f6) {
        setFloat(this.f21335b, f6);
        this.f21335b += 4;
    }

    @Override // androidx.emoji2.text.flatbuffer.c
    public void putInt(int i10) {
        setInt(this.f21335b, i10);
        this.f21335b += 4;
    }

    @Override // androidx.emoji2.text.flatbuffer.c
    public void putLong(long j10) {
        setLong(this.f21335b, j10);
        this.f21335b += 8;
    }

    @Override // androidx.emoji2.text.flatbuffer.c
    public void putShort(short s4) {
        setShort(this.f21335b, s4);
        this.f21335b += 2;
    }

    public boolean requestCapacity(int i10) {
        byte[] bArr = this.f21334a;
        if (bArr.length > i10) {
            return true;
        }
        int length = bArr.length;
        this.f21334a = Arrays.copyOf(bArr, length + (length >> 1));
        return true;
    }

    public void set(int i10, byte b10) {
        requestCapacity(i10 + 1);
        this.f21334a[i10] = b10;
    }

    public void setBoolean(int i10, boolean z10) {
        set(i10, z10 ? (byte) 1 : (byte) 0);
    }

    public void setDouble(int i10, double d2) {
        requestCapacity(i10 + 8);
        long jDoubleToRawLongBits = Double.doubleToRawLongBits(d2);
        int i11 = (int) jDoubleToRawLongBits;
        byte[] bArr = this.f21334a;
        bArr[i10] = (byte) (i11 & 255);
        bArr[i10 + 1] = (byte) ((i11 >> 8) & 255);
        bArr[i10 + 2] = (byte) ((i11 >> 16) & 255);
        bArr[i10 + 3] = (byte) ((i11 >> 24) & 255);
        int i12 = (int) (jDoubleToRawLongBits >> 32);
        bArr[i10 + 4] = (byte) (i12 & 255);
        bArr[i10 + 5] = (byte) ((i12 >> 8) & 255);
        bArr[i10 + 6] = (byte) ((i12 >> 16) & 255);
        bArr[i10 + 7] = (byte) ((i12 >> 24) & 255);
    }

    public void setFloat(int i10, float f6) {
        requestCapacity(i10 + 4);
        int iFloatToRawIntBits = Float.floatToRawIntBits(f6);
        byte[] bArr = this.f21334a;
        bArr[i10] = (byte) (iFloatToRawIntBits & 255);
        bArr[i10 + 1] = (byte) ((iFloatToRawIntBits >> 8) & 255);
        bArr[i10 + 2] = (byte) ((iFloatToRawIntBits >> 16) & 255);
        bArr[i10 + 3] = (byte) ((iFloatToRawIntBits >> 24) & 255);
    }

    public void setInt(int i10, int i11) {
        requestCapacity(i10 + 4);
        byte[] bArr = this.f21334a;
        bArr[i10] = (byte) (i11 & 255);
        bArr[i10 + 1] = (byte) ((i11 >> 8) & 255);
        bArr[i10 + 2] = (byte) ((i11 >> 16) & 255);
        bArr[i10 + 3] = (byte) ((i11 >> 24) & 255);
    }

    public void setLong(int i10, long j10) {
        requestCapacity(i10 + 8);
        int i11 = (int) j10;
        byte[] bArr = this.f21334a;
        bArr[i10] = (byte) (i11 & 255);
        bArr[i10 + 1] = (byte) ((i11 >> 8) & 255);
        bArr[i10 + 2] = (byte) ((i11 >> 16) & 255);
        bArr[i10 + 3] = (byte) ((i11 >> 24) & 255);
        int i12 = (int) (j10 >> 32);
        bArr[i10 + 4] = (byte) (i12 & 255);
        bArr[i10 + 5] = (byte) ((i12 >> 8) & 255);
        bArr[i10 + 6] = (byte) ((i12 >> 16) & 255);
        bArr[i10 + 7] = (byte) ((i12 >> 24) & 255);
    }

    public void setShort(int i10, short s4) {
        requestCapacity(i10 + 2);
        byte[] bArr = this.f21334a;
        bArr[i10] = (byte) (s4 & 255);
        bArr[i10 + 1] = (byte) ((s4 >> 8) & 255);
    }

    @Override // androidx.emoji2.text.flatbuffer.c
    public int writePosition() {
        return this.f21335b;
    }

    public ArrayReadWriteBuf(int i10) {
        this(new byte[i10]);
    }

    public ArrayReadWriteBuf(byte[] bArr) {
        this.f21334a = bArr;
        this.f21335b = 0;
    }

    @Override // androidx.emoji2.text.flatbuffer.c
    public void put(byte b10) {
        set(this.f21335b, b10);
        this.f21335b++;
    }

    public void set(int i10, byte[] bArr, int i11, int i12) {
        requestCapacity((i12 - i11) + i10);
        System.arraycopy(bArr, i11, this.f21334a, i10, i12);
    }

    public ArrayReadWriteBuf(byte[] bArr, int i10) {
        this.f21334a = bArr;
        this.f21335b = i10;
    }
}
