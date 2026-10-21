package androidx.datastore.preferences.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.InvalidMarkException;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: NioByteString.java */
/* JADX INFO: loaded from: classes2.dex */
public final class g0 extends ByteString.g {

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final ByteBuffer f21062s0;

    public g0(ByteBuffer byteBuffer) {
        Charset charset = Internal.f20943a;
        if (byteBuffer == null) {
            throw new NullPointerException("buffer");
        }
        this.f21062s0 = byteBuffer.slice().order(ByteOrder.nativeOrder());
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException {
        throw new InvalidObjectException("NioByteString instances are not to be serialized directly");
    }

    private Object writeReplace() {
        return ByteString.copyFrom(this.f21062s0.slice());
    }

    @Override // androidx.datastore.preferences.protobuf.ByteString
    public final ByteBuffer asReadOnlyByteBuffer() {
        return this.f21062s0.asReadOnlyBuffer();
    }

    @Override // androidx.datastore.preferences.protobuf.ByteString
    public final List<ByteBuffer> asReadOnlyByteBufferList() {
        return Collections.singletonList(this.f21062s0.asReadOnlyBuffer());
    }

    @Override // androidx.datastore.preferences.protobuf.ByteString
    public final byte byteAt(int i10) {
        try {
            return this.f21062s0.get(i10);
        } catch (ArrayIndexOutOfBoundsException e5) {
            throw e5;
        } catch (IndexOutOfBoundsException e7) {
            throw new ArrayIndexOutOfBoundsException(e7.getMessage());
        }
    }

    @Override // androidx.datastore.preferences.protobuf.ByteString
    public final void copyTo(ByteBuffer byteBuffer) {
        byteBuffer.put(this.f21062s0.slice());
    }

    @Override // androidx.datastore.preferences.protobuf.ByteString
    public final void copyToInternal(byte[] bArr, int i10, int i11, int i12) {
        ByteBuffer byteBufferSlice = this.f21062s0.slice();
        byteBufferSlice.position(i10);
        byteBufferSlice.get(bArr, i11, i12);
    }

    @Override // androidx.datastore.preferences.protobuf.ByteString
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ByteString)) {
            return false;
        }
        ByteString byteString = (ByteString) obj;
        ByteBuffer byteBuffer = this.f21062s0;
        if (byteBuffer.remaining() != byteString.size()) {
            return false;
        }
        if (byteBuffer.remaining() == 0) {
            return true;
        }
        if (obj instanceof g0) {
            return byteBuffer.equals(((g0) obj).f21062s0);
        }
        return obj instanceof n0 ? obj.equals(this) : byteBuffer.equals(byteString.asReadOnlyByteBuffer());
    }

    @Override // androidx.datastore.preferences.protobuf.ByteString
    public final void f(ByteOutput byteOutput) throws IOException {
        byteOutput.writeLazy(this.f21062s0.slice());
    }

    @Override // androidx.datastore.preferences.protobuf.ByteString.g
    public final boolean g(ByteString byteString, int i10, int i11) {
        return substring(0, i11).equals(byteString.substring(i10, i11 + i10));
    }

    public final ByteBuffer h(int i10, int i11) {
        ByteBuffer byteBuffer = this.f21062s0;
        if (i10 < byteBuffer.position() || i11 > byteBuffer.limit() || i10 > i11) {
            throw new IllegalArgumentException(String.format("Invalid indices [%d, %d]", Integer.valueOf(i10), Integer.valueOf(i11)));
        }
        ByteBuffer byteBufferSlice = byteBuffer.slice();
        byteBufferSlice.position(i10 - byteBuffer.position());
        byteBufferSlice.limit(i11 - byteBuffer.position());
        return byteBufferSlice;
    }

    @Override // androidx.datastore.preferences.protobuf.ByteString
    public final boolean isValidUtf8() {
        w0.b bVar = w0.f21158a;
        ByteBuffer byteBuffer = this.f21062s0;
        return w0.f21158a.i(byteBuffer, 0, byteBuffer.position(), byteBuffer.remaining()) == 0;
    }

    @Override // androidx.datastore.preferences.protobuf.ByteString
    public final CodedInputStream newCodedInput() {
        return CodedInputStream.b(this.f21062s0, true);
    }

    @Override // androidx.datastore.preferences.protobuf.ByteString
    public final InputStream newInput() {
        return new a(this);
    }

    @Override // androidx.datastore.preferences.protobuf.ByteString
    public final int partialHash(int i10, int i11, int i12) {
        for (int i13 = i11; i13 < i11 + i12; i13++) {
            i10 = (i10 * 31) + this.f21062s0.get(i13);
        }
        return i10;
    }

    @Override // androidx.datastore.preferences.protobuf.ByteString
    public final int partialIsValidUtf8(int i10, int i11, int i12) {
        return w0.f21158a.i(this.f21062s0, i10, i11, i12 + i11);
    }

    @Override // androidx.datastore.preferences.protobuf.ByteString
    public final int size() {
        return this.f21062s0.remaining();
    }

    @Override // androidx.datastore.preferences.protobuf.ByteString
    public final ByteString substring(int i10, int i11) {
        try {
            return new g0(h(i10, i11));
        } catch (ArrayIndexOutOfBoundsException e5) {
            throw e5;
        } catch (IndexOutOfBoundsException e7) {
            throw new ArrayIndexOutOfBoundsException(e7.getMessage());
        }
    }

    @Override // androidx.datastore.preferences.protobuf.ByteString
    public final String toStringInternal(Charset charset) {
        byte[] byteArray;
        int length;
        int iPosition;
        ByteBuffer byteBuffer = this.f21062s0;
        if (byteBuffer.hasArray()) {
            byteArray = byteBuffer.array();
            iPosition = byteBuffer.position() + byteBuffer.arrayOffset();
            length = byteBuffer.remaining();
        } else {
            byteArray = toByteArray();
            length = byteArray.length;
            iPosition = 0;
        }
        return new String(byteArray, iPosition, length, charset);
    }

    @Override // androidx.datastore.preferences.protobuf.ByteString
    public final void writeTo(OutputStream outputStream) throws IOException {
        outputStream.write(toByteArray());
    }

    /* JADX INFO: compiled from: NioByteString.java */
    public class a extends InputStream {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final ByteBuffer f21063p0;

        public a(g0 g0Var) {
            this.f21063p0 = g0Var.f21062s0.slice();
        }

        @Override // java.io.InputStream
        public final int available() throws IOException {
            return this.f21063p0.remaining();
        }

        @Override // java.io.InputStream
        public final void mark(int i10) {
            this.f21063p0.mark();
        }

        @Override // java.io.InputStream
        public final boolean markSupported() {
            return true;
        }

        @Override // java.io.InputStream
        public final int read() throws IOException {
            ByteBuffer byteBuffer = this.f21063p0;
            if (byteBuffer.hasRemaining()) {
                return byteBuffer.get() & 255;
            }
            return -1;
        }

        @Override // java.io.InputStream
        public final void reset() throws IOException {
            try {
                this.f21063p0.reset();
            } catch (InvalidMarkException e5) {
                throw new IOException(e5);
            }
        }

        @Override // java.io.InputStream
        public final int read(byte[] bArr, int i10, int i11) throws IOException {
            ByteBuffer byteBuffer = this.f21063p0;
            if (!byteBuffer.hasRemaining()) {
                return -1;
            }
            int iMin = Math.min(i11, byteBuffer.remaining());
            byteBuffer.get(bArr, i10, iMin);
            return iMin;
        }
    }
}
