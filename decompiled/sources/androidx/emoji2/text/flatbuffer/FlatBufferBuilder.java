package androidx.emoji2.text.flatbuffer;

import java.io.IOException;
import java.io.InputStream;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public class FlatBufferBuilder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ByteBuffer f21340a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f21341b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f21342c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int[] f21343d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f21344e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f21345f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f21346g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f21347h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int[] f21348i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f21349j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f21350k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f21351l;
    public ByteBufferFactory m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Utf8 f21352n;

    public static final class HeapByteBufferFactory extends ByteBufferFactory {
        public static final HeapByteBufferFactory INSTANCE = new HeapByteBufferFactory();

        @Override // androidx.emoji2.text.flatbuffer.FlatBufferBuilder.ByteBufferFactory
        public ByteBuffer newByteBuffer(int i10) {
            return ByteBuffer.allocate(i10).order(ByteOrder.LITTLE_ENDIAN);
        }
    }

    public static class a extends InputStream {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public ByteBuffer f21353p0;

        @Override // java.io.InputStream
        public final int read() throws IOException {
            try {
                return this.f21353p0.get() & 255;
            } catch (BufferUnderflowException unused) {
                return -1;
            }
        }
    }

    public FlatBufferBuilder(int i10, ByteBufferFactory byteBufferFactory) {
        this(i10, byteBufferFactory, null, Utf8.getDefault());
    }

    public static boolean isFieldPresent(Table table, int i10) {
        return table.__offset(i10) != 0;
    }

    public void Nested(int i10) {
        if (i10 != offset()) {
            throw new AssertionError("FlatBuffers: struct must be serialized inline.");
        }
    }

    public void addBoolean(boolean z10) {
        prep(1, 0);
        putBoolean(z10);
    }

    public void addByte(byte b10) {
        prep(1, 0);
        putByte(b10);
    }

    public void addDouble(double d2) {
        prep(8, 0);
        putDouble(d2);
    }

    public void addFloat(float f6) {
        prep(4, 0);
        putFloat(f6);
    }

    public void addInt(int i10) {
        prep(4, 0);
        putInt(i10);
    }

    public void addLong(long j10) {
        prep(8, 0);
        putLong(j10);
    }

    public void addOffset(int i10) {
        prep(4, 0);
        putInt((offset() - i10) + 4);
    }

    public void addShort(short s4) {
        prep(2, 0);
        putShort(s4);
    }

    public void addStruct(int i10, int i11, int i12) {
        if (i11 != i12) {
            Nested(i11);
            slot(i10);
        }
    }

    public void clear() {
        this.f21341b = this.f21340a.capacity();
        this.f21340a.clear();
        this.f21342c = 1;
        while (true) {
            int i10 = this.f21344e;
            if (i10 <= 0) {
                this.f21344e = 0;
                this.f21345f = false;
                this.f21346g = false;
                this.f21347h = 0;
                this.f21349j = 0;
                this.f21350k = 0;
                return;
            }
            int[] iArr = this.f21343d;
            int i11 = i10 - 1;
            this.f21344e = i11;
            iArr[i11] = 0;
        }
    }

    public int createByteVector(byte[] bArr) {
        int length = bArr.length;
        startVector(1, length, 1);
        ByteBuffer byteBuffer = this.f21340a;
        int i10 = this.f21341b - length;
        this.f21341b = i10;
        byteBuffer.position(i10);
        this.f21340a.put(bArr);
        return endVector();
    }

    public <T extends Table> int createSortedVectorOfTables(T t10, int[] iArr) {
        t10.sortTables(iArr, this.f21340a);
        return createVectorOfTables(iArr);
    }

    public int createString(CharSequence charSequence) {
        Utf8 utf8 = this.f21352n;
        int iEncodedLength = utf8.encodedLength(charSequence);
        addByte((byte) 0);
        startVector(1, iEncodedLength, 1);
        ByteBuffer byteBuffer = this.f21340a;
        int i10 = this.f21341b - iEncodedLength;
        this.f21341b = i10;
        byteBuffer.position(i10);
        utf8.encodeUtf8(charSequence, this.f21340a);
        return endVector();
    }

    public ByteBuffer createUnintializedVector(int i10, int i11, int i12) {
        int i13 = i10 * i11;
        startVector(i10, i11, i12);
        ByteBuffer byteBuffer = this.f21340a;
        int i14 = this.f21341b - i13;
        this.f21341b = i14;
        byteBuffer.position(i14);
        ByteBuffer byteBufferOrder = this.f21340a.slice().order(ByteOrder.LITTLE_ENDIAN);
        byteBufferOrder.limit(i13);
        return byteBufferOrder;
    }

    public int createVectorOfTables(int[] iArr) {
        notNested();
        startVector(4, iArr.length, 4);
        for (int length = iArr.length - 1; length >= 0; length--) {
            addOffset(iArr[length]);
        }
        return endVector();
    }

    public ByteBuffer dataBuffer() {
        finished();
        return this.f21340a;
    }

    public int endTable() {
        int i10;
        if (this.f21343d == null || !this.f21345f) {
            throw new AssertionError("FlatBuffers: endTable called without startTable");
        }
        addInt(0);
        int iOffset = offset();
        int i11 = this.f21344e - 1;
        while (i11 >= 0 && this.f21343d[i11] == 0) {
            i11--;
        }
        for (int i12 = i11; i12 >= 0; i12--) {
            int i13 = this.f21343d[i12];
            addShort((short) (i13 != 0 ? iOffset - i13 : 0));
        }
        addShort((short) (iOffset - this.f21347h));
        addShort((short) ((i11 + 3) * 2));
        int i14 = 0;
        loop2: while (true) {
            if (i14 >= this.f21349j) {
                i10 = 0;
                break;
            }
            int iCapacity = this.f21340a.capacity() - this.f21348i[i14];
            int i15 = this.f21341b;
            short s4 = this.f21340a.getShort(iCapacity);
            if (s4 == this.f21340a.getShort(i15)) {
                int i16 = 2;
                while (true) {
                    if (i16 >= s4) {
                        i10 = this.f21348i[i14];
                        break loop2;
                    }
                    if (this.f21340a.getShort(iCapacity + i16) != this.f21340a.getShort(i15 + i16)) {
                        break;
                    }
                    i16 += 2;
                }
            }
            i14++;
        }
        if (i10 != 0) {
            int iCapacity2 = this.f21340a.capacity() - iOffset;
            this.f21341b = iCapacity2;
            this.f21340a.putInt(iCapacity2, i10 - iOffset);
        } else {
            int i17 = this.f21349j;
            int[] iArr = this.f21348i;
            if (i17 == iArr.length) {
                this.f21348i = Arrays.copyOf(iArr, i17 * 2);
            }
            int[] iArr2 = this.f21348i;
            int i18 = this.f21349j;
            this.f21349j = i18 + 1;
            iArr2[i18] = offset();
            ByteBuffer byteBuffer = this.f21340a;
            byteBuffer.putInt(byteBuffer.capacity() - iOffset, offset() - iOffset);
        }
        this.f21345f = false;
        return iOffset;
    }

    public int endVector() {
        if (!this.f21345f) {
            throw new AssertionError("FlatBuffers: endVector called without startVector");
        }
        this.f21345f = false;
        putInt(this.f21350k);
        return offset();
    }

    public void finish(int i10, boolean z10) {
        prep(this.f21342c, (z10 ? 4 : 0) + 4);
        addOffset(i10);
        if (z10) {
            addInt(this.f21340a.capacity() - this.f21341b);
        }
        this.f21340a.position(this.f21341b);
        this.f21346g = true;
    }

    public void finishSizePrefixed(int i10) {
        finish(i10, true);
    }

    public void finished() {
        if (!this.f21346g) {
            throw new AssertionError("FlatBuffers: you can only access the serialized buffer after it has been finished by FlatBufferBuilder.finish().");
        }
    }

    public FlatBufferBuilder forceDefaults(boolean z10) {
        this.f21351l = z10;
        return this;
    }

    public FlatBufferBuilder init(ByteBuffer byteBuffer, ByteBufferFactory byteBufferFactory) {
        this.m = byteBufferFactory;
        this.f21340a = byteBuffer;
        byteBuffer.clear();
        this.f21340a.order(ByteOrder.LITTLE_ENDIAN);
        this.f21342c = 1;
        this.f21341b = this.f21340a.capacity();
        this.f21344e = 0;
        this.f21345f = false;
        this.f21346g = false;
        this.f21347h = 0;
        this.f21349j = 0;
        this.f21350k = 0;
        return this;
    }

    public void notNested() {
        if (this.f21345f) {
            throw new AssertionError("FlatBuffers: object serialization must not be nested.");
        }
    }

    public int offset() {
        return this.f21340a.capacity() - this.f21341b;
    }

    public void pad(int i10) {
        for (int i11 = 0; i11 < i10; i11++) {
            ByteBuffer byteBuffer = this.f21340a;
            int i12 = this.f21341b - 1;
            this.f21341b = i12;
            byteBuffer.put(i12, (byte) 0);
        }
    }

    public void prep(int i10, int i11) {
        if (i10 > this.f21342c) {
            this.f21342c = i10;
        }
        int i12 = ((~((this.f21340a.capacity() - this.f21341b) + i11)) + 1) & (i10 - 1);
        while (this.f21341b < i12 + i10 + i11) {
            int iCapacity = this.f21340a.capacity();
            ByteBuffer byteBuffer = this.f21340a;
            ByteBufferFactory byteBufferFactory = this.m;
            int iCapacity2 = byteBuffer.capacity();
            if (((-1073741824) & iCapacity2) != 0) {
                throw new AssertionError("FlatBuffers: cannot grow buffer beyond 2 gigabytes.");
            }
            int i13 = iCapacity2 == 0 ? 1 : iCapacity2 << 1;
            byteBuffer.position(0);
            ByteBuffer byteBufferNewByteBuffer = byteBufferFactory.newByteBuffer(i13);
            byteBufferNewByteBuffer.position(byteBufferNewByteBuffer.clear().capacity() - iCapacity2);
            byteBufferNewByteBuffer.put(byteBuffer);
            this.f21340a = byteBufferNewByteBuffer;
            if (byteBuffer != byteBufferNewByteBuffer) {
                this.m.releaseByteBuffer(byteBuffer);
            }
            this.f21341b = (this.f21340a.capacity() - iCapacity) + this.f21341b;
        }
        pad(i12);
    }

    public void putBoolean(boolean z10) {
        ByteBuffer byteBuffer = this.f21340a;
        int i10 = this.f21341b - 1;
        this.f21341b = i10;
        byteBuffer.put(i10, z10 ? (byte) 1 : (byte) 0);
    }

    public void putByte(byte b10) {
        ByteBuffer byteBuffer = this.f21340a;
        int i10 = this.f21341b - 1;
        this.f21341b = i10;
        byteBuffer.put(i10, b10);
    }

    public void putDouble(double d2) {
        ByteBuffer byteBuffer = this.f21340a;
        int i10 = this.f21341b - 8;
        this.f21341b = i10;
        byteBuffer.putDouble(i10, d2);
    }

    public void putFloat(float f6) {
        ByteBuffer byteBuffer = this.f21340a;
        int i10 = this.f21341b - 4;
        this.f21341b = i10;
        byteBuffer.putFloat(i10, f6);
    }

    public void putInt(int i10) {
        ByteBuffer byteBuffer = this.f21340a;
        int i11 = this.f21341b - 4;
        this.f21341b = i11;
        byteBuffer.putInt(i11, i10);
    }

    public void putLong(long j10) {
        ByteBuffer byteBuffer = this.f21340a;
        int i10 = this.f21341b - 8;
        this.f21341b = i10;
        byteBuffer.putLong(i10, j10);
    }

    public void putShort(short s4) {
        ByteBuffer byteBuffer = this.f21340a;
        int i10 = this.f21341b - 2;
        this.f21341b = i10;
        byteBuffer.putShort(i10, s4);
    }

    public void required(int i10, int i11) {
        int iCapacity = this.f21340a.capacity() - i10;
        if (this.f21340a.getShort((iCapacity - this.f21340a.getInt(iCapacity)) + i11) == 0) {
            throw new AssertionError(androidx.camera.core.impl.utils.b.a("FlatBuffers: field ", i11, " must be set"));
        }
    }

    public byte[] sizedByteArray(int i10, int i11) {
        finished();
        byte[] bArr = new byte[i11];
        this.f21340a.position(i10);
        this.f21340a.get(bArr);
        return bArr;
    }

    public InputStream sizedInputStream() {
        finished();
        ByteBuffer byteBufferDuplicate = this.f21340a.duplicate();
        byteBufferDuplicate.position(this.f21341b);
        byteBufferDuplicate.limit(this.f21340a.capacity());
        a aVar = new a();
        aVar.f21353p0 = byteBufferDuplicate;
        return aVar;
    }

    public void slot(int i10) {
        this.f21343d[i10] = offset();
    }

    public void startTable(int i10) {
        notNested();
        int[] iArr = this.f21343d;
        if (iArr == null || iArr.length < i10) {
            this.f21343d = new int[i10];
        }
        this.f21344e = i10;
        Arrays.fill(this.f21343d, 0, i10, 0);
        this.f21345f = true;
        this.f21347h = offset();
    }

    public void startVector(int i10, int i11, int i12) {
        notNested();
        this.f21350k = i11;
        int i13 = i10 * i11;
        prep(4, i13);
        prep(i12, i13);
        this.f21345f = true;
    }

    public FlatBufferBuilder(int i10, ByteBufferFactory byteBufferFactory, ByteBuffer byteBuffer, Utf8 utf8) {
        this.f21342c = 1;
        this.f21343d = null;
        this.f21344e = 0;
        this.f21345f = false;
        this.f21346g = false;
        this.f21348i = new int[16];
        this.f21349j = 0;
        this.f21350k = 0;
        this.f21351l = false;
        i10 = i10 <= 0 ? 1 : i10;
        this.m = byteBufferFactory;
        if (byteBuffer != null) {
            this.f21340a = byteBuffer;
            byteBuffer.clear();
            this.f21340a.order(ByteOrder.LITTLE_ENDIAN);
        } else {
            this.f21340a = byteBufferFactory.newByteBuffer(i10);
        }
        this.f21352n = utf8;
        this.f21341b = this.f21340a.capacity();
    }

    public void addBoolean(int i10, boolean z10, boolean z11) {
        if (this.f21351l || z10 != z11) {
            addBoolean(z10);
            slot(i10);
        }
    }

    public void addByte(int i10, byte b10, int i11) {
        if (this.f21351l || b10 != i11) {
            addByte(b10);
            slot(i10);
        }
    }

    public void addDouble(int i10, double d2, double d3) {
        if (this.f21351l || d2 != d3) {
            addDouble(d2);
            slot(i10);
        }
    }

    public void addFloat(int i10, float f6, double d2) {
        if (this.f21351l || f6 != d2) {
            addFloat(f6);
            slot(i10);
        }
    }

    public void addInt(int i10, int i11, int i12) {
        if (this.f21351l || i11 != i12) {
            addInt(i11);
            slot(i10);
        }
    }

    public void addLong(int i10, long j10, long j11) {
        if (this.f21351l || j10 != j11) {
            addLong(j10);
            slot(i10);
        }
    }

    public void addShort(int i10, short s4, int i11) {
        if (this.f21351l || s4 != i11) {
            addShort(s4);
            slot(i10);
        }
    }

    public void finishSizePrefixed(int i10, String str) {
        finish(i10, str, true);
    }

    public void addOffset(int i10, int i11, int i12) {
        if (this.f21351l || i11 != i12) {
            addOffset(i11);
            slot(i10);
        }
    }

    public byte[] sizedByteArray() {
        return sizedByteArray(this.f21341b, this.f21340a.capacity() - this.f21341b);
    }

    public int createByteVector(byte[] bArr, int i10, int i11) {
        startVector(1, i11, 1);
        ByteBuffer byteBuffer = this.f21340a;
        int i12 = this.f21341b - i11;
        this.f21341b = i12;
        byteBuffer.position(i12);
        this.f21340a.put(bArr, i10, i11);
        return endVector();
    }

    public void finish(int i10) {
        finish(i10, false);
    }

    public int createString(ByteBuffer byteBuffer) {
        int iRemaining = byteBuffer.remaining();
        addByte((byte) 0);
        startVector(1, iRemaining, 1);
        ByteBuffer byteBuffer2 = this.f21340a;
        int i10 = this.f21341b - iRemaining;
        this.f21341b = i10;
        byteBuffer2.position(i10);
        this.f21340a.put(byteBuffer);
        return endVector();
    }

    public void finish(int i10, String str, boolean z10) {
        prep(this.f21342c, (z10 ? 4 : 0) + 8);
        if (str.length() == 4) {
            for (int i11 = 3; i11 >= 0; i11--) {
                addByte((byte) str.charAt(i11));
            }
            finish(i10, z10);
            return;
        }
        throw new AssertionError("FlatBuffers: file identifier must be length 4");
    }

    public int createByteVector(ByteBuffer byteBuffer) {
        int iRemaining = byteBuffer.remaining();
        startVector(1, iRemaining, 1);
        ByteBuffer byteBuffer2 = this.f21340a;
        int i10 = this.f21341b - iRemaining;
        this.f21341b = i10;
        byteBuffer2.position(i10);
        this.f21340a.put(byteBuffer);
        return endVector();
    }

    public void finish(int i10, String str) {
        finish(i10, str, false);
    }

    public FlatBufferBuilder(int i10) {
        this(i10, HeapByteBufferFactory.INSTANCE, null, Utf8.getDefault());
    }

    public FlatBufferBuilder() {
        this(1024);
    }

    public FlatBufferBuilder(ByteBuffer byteBuffer, ByteBufferFactory byteBufferFactory) {
        this(byteBuffer.capacity(), byteBufferFactory, byteBuffer, Utf8.getDefault());
    }

    public FlatBufferBuilder(ByteBuffer byteBuffer) {
        this(byteBuffer, new HeapByteBufferFactory());
    }

    public static abstract class ByteBufferFactory {
        public abstract ByteBuffer newByteBuffer(int i10);

        public void releaseByteBuffer(ByteBuffer byteBuffer) {
        }
    }
}
