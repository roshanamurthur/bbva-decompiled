package androidx.datastore.preferences.protobuf;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes2.dex */
public abstract class CodedOutputStream extends ByteOutput {
    public static final int DEFAULT_BUFFER_SIZE = 4096;

    @Deprecated
    public static final int LITTLE_ENDIAN_32_SIZE = 4;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Logger f20852c = Logger.getLogger(CodedOutputStream.class.getName());

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final boolean f20853d = v0.f21153f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public h f20854a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f20855b;

    public static abstract class a extends CodedOutputStream {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final byte[] f20856e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f20857f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f20858g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f20859h;

        public a(int i10) {
            if (i10 < 0) {
                throw new IllegalArgumentException("bufferSize must be >= 0");
            }
            byte[] bArr = new byte[Math.max(i10, 20)];
            this.f20856e = bArr;
            this.f20857f = bArr.length;
        }

        public final void e(int i10) {
            int i11 = this.f20858g;
            byte[] bArr = this.f20856e;
            bArr[i11] = (byte) (i10 & 255);
            bArr[i11 + 1] = (byte) ((i10 >> 8) & 255);
            bArr[i11 + 2] = (byte) ((i10 >> 16) & 255);
            this.f20858g = i11 + 4;
            bArr[i11 + 3] = (byte) ((i10 >> 24) & 255);
            this.f20859h += 4;
        }

        public final void f(long j10) {
            int i10 = this.f20858g;
            byte[] bArr = this.f20856e;
            bArr[i10] = (byte) (j10 & 255);
            bArr[i10 + 1] = (byte) ((j10 >> 8) & 255);
            bArr[i10 + 2] = (byte) ((j10 >> 16) & 255);
            bArr[i10 + 3] = (byte) (255 & (j10 >> 24));
            bArr[i10 + 4] = (byte) (((int) (j10 >> 32)) & 255);
            bArr[i10 + 5] = (byte) (((int) (j10 >> 40)) & 255);
            bArr[i10 + 6] = (byte) (((int) (j10 >> 48)) & 255);
            this.f20858g = i10 + 8;
            bArr[i10 + 7] = (byte) (((int) (j10 >> 56)) & 255);
            this.f20859h += 8;
        }

        public final void g(int i10, int i11) {
            h((i10 << 3) | i11);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final int getTotalBytesWritten() {
            return this.f20859h;
        }

        public final void h(int i10) {
            byte[] bArr = this.f20856e;
            if (!CodedOutputStream.f20853d) {
                while ((i10 & (-128)) != 0) {
                    int i11 = this.f20858g;
                    this.f20858g = i11 + 1;
                    bArr[i11] = (byte) ((i10 & 127) | 128);
                    this.f20859h++;
                    i10 >>>= 7;
                }
                int i12 = this.f20858g;
                this.f20858g = i12 + 1;
                bArr[i12] = (byte) i10;
                this.f20859h++;
                return;
            }
            long j10 = this.f20858g;
            while ((i10 & (-128)) != 0) {
                int i13 = this.f20858g;
                this.f20858g = i13 + 1;
                v0.q(bArr, i13, (byte) ((i10 & 127) | 128));
                i10 >>>= 7;
            }
            int i14 = this.f20858g;
            this.f20858g = i14 + 1;
            v0.q(bArr, i14, (byte) i10);
            this.f20859h += (int) (((long) this.f20858g) - j10);
        }

        public final void i(long j10) {
            byte[] bArr = this.f20856e;
            if (!CodedOutputStream.f20853d) {
                while ((j10 & (-128)) != 0) {
                    int i10 = this.f20858g;
                    this.f20858g = i10 + 1;
                    bArr[i10] = (byte) ((((int) j10) & 127) | 128);
                    this.f20859h++;
                    j10 >>>= 7;
                }
                int i11 = this.f20858g;
                this.f20858g = i11 + 1;
                bArr[i11] = (byte) j10;
                this.f20859h++;
                return;
            }
            long j11 = this.f20858g;
            while ((j10 & (-128)) != 0) {
                int i12 = this.f20858g;
                this.f20858g = i12 + 1;
                v0.q(bArr, i12, (byte) ((((int) j10) & 127) | 128));
                j10 >>>= 7;
            }
            int i13 = this.f20858g;
            this.f20858g = i13 + 1;
            v0.q(bArr, i13, (byte) j10);
            this.f20859h += (int) (((long) this.f20858g) - j11);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final int spaceLeft() {
            throw new UnsupportedOperationException("spaceLeft() can only be called on CodedOutputStreams that are writing to a flat array or ByteBuffer.");
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream, androidx.datastore.preferences.protobuf.ByteOutput
        public void writeLazy(byte[] bArr, int i10, int i11) throws IOException {
            write(bArr, i10, i11);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream, androidx.datastore.preferences.protobuf.ByteOutput
        public void writeLazy(ByteBuffer byteBuffer) throws IOException {
            write(byteBuffer);
        }
    }

    public static class b extends CodedOutputStream {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final byte[] f20860e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f20861f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final int f20862g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f20863h;

        public b(byte[] bArr, int i10, int i11) {
            if (bArr == null) {
                throw new NullPointerException("buffer");
            }
            int i12 = i10 + i11;
            if ((i10 | i11 | (bArr.length - i12)) < 0) {
                throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(bArr.length), Integer.valueOf(i10), Integer.valueOf(i11)));
            }
            this.f20860e = bArr;
            this.f20861f = i10;
            this.f20863h = i10;
            this.f20862g = i12;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void c(int i10, int i11, byte[] bArr) throws IOException {
            writeUInt32NoTag(i11);
            write(bArr, i10, i11);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void d(int i10, MessageLite messageLite, o0 o0Var) throws IOException {
            writeTag(i10, 2);
            writeUInt32NoTag(((AbstractMessageLite) messageLite).b(o0Var));
            o0Var.h(messageLite, this.f20854a);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final int getTotalBytesWritten() {
            return this.f20863h - this.f20861f;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final int spaceLeft() {
            return this.f20862g - this.f20863h;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream, androidx.datastore.preferences.protobuf.ByteOutput
        public final void write(byte b10) throws IOException {
            try {
                byte[] bArr = this.f20860e;
                int i10 = this.f20863h;
                this.f20863h = i10 + 1;
                bArr[i10] = b10;
            } catch (IndexOutOfBoundsException e5) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f20863h), Integer.valueOf(this.f20862g), 1), e5);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeBool(int i10, boolean z10) throws IOException {
            writeTag(i10, 0);
            write(z10 ? (byte) 1 : (byte) 0);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeByteArray(int i10, byte[] bArr) throws IOException {
            writeByteArray(i10, bArr, 0, bArr.length);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeByteBuffer(int i10, ByteBuffer byteBuffer) throws IOException {
            writeTag(i10, 2);
            writeUInt32NoTag(byteBuffer.capacity());
            writeRawBytes(byteBuffer);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeBytes(int i10, ByteString byteString) throws IOException {
            writeTag(i10, 2);
            writeBytesNoTag(byteString);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeBytesNoTag(ByteString byteString) throws IOException {
            writeUInt32NoTag(byteString.size());
            byteString.f(this);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeFixed32(int i10, int i11) throws IOException {
            writeTag(i10, 5);
            writeFixed32NoTag(i11);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeFixed32NoTag(int i10) throws IOException {
            try {
                byte[] bArr = this.f20860e;
                int i11 = this.f20863h;
                bArr[i11] = (byte) (i10 & 255);
                bArr[i11 + 1] = (byte) ((i10 >> 8) & 255);
                bArr[i11 + 2] = (byte) ((i10 >> 16) & 255);
                this.f20863h = i11 + 4;
                bArr[i11 + 3] = (byte) ((i10 >> 24) & 255);
            } catch (IndexOutOfBoundsException e5) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f20863h), Integer.valueOf(this.f20862g), 1), e5);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeFixed64(int i10, long j10) throws IOException {
            writeTag(i10, 1);
            writeFixed64NoTag(j10);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeFixed64NoTag(long j10) throws IOException {
            try {
                byte[] bArr = this.f20860e;
                int i10 = this.f20863h;
                bArr[i10] = (byte) (((int) j10) & 255);
                bArr[i10 + 1] = (byte) (((int) (j10 >> 8)) & 255);
                bArr[i10 + 2] = (byte) (((int) (j10 >> 16)) & 255);
                bArr[i10 + 3] = (byte) (((int) (j10 >> 24)) & 255);
                bArr[i10 + 4] = (byte) (((int) (j10 >> 32)) & 255);
                bArr[i10 + 5] = (byte) (((int) (j10 >> 40)) & 255);
                bArr[i10 + 6] = (byte) (((int) (j10 >> 48)) & 255);
                this.f20863h = i10 + 8;
                bArr[i10 + 7] = (byte) (((int) (j10 >> 56)) & 255);
            } catch (IndexOutOfBoundsException e5) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f20863h), Integer.valueOf(this.f20862g), 1), e5);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeInt32(int i10, int i11) throws IOException {
            writeTag(i10, 0);
            writeInt32NoTag(i11);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeInt32NoTag(int i10) throws IOException {
            if (i10 >= 0) {
                writeUInt32NoTag(i10);
            } else {
                writeUInt64NoTag(i10);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream, androidx.datastore.preferences.protobuf.ByteOutput
        public final void writeLazy(byte[] bArr, int i10, int i11) throws IOException {
            write(bArr, i10, i11);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeMessage(int i10, MessageLite messageLite) throws IOException {
            writeTag(i10, 2);
            writeMessageNoTag(messageLite);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeMessageNoTag(MessageLite messageLite) throws IOException {
            writeUInt32NoTag(messageLite.getSerializedSize());
            messageLite.writeTo(this);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeMessageSetExtension(int i10, MessageLite messageLite) throws IOException {
            writeTag(1, 3);
            writeUInt32(2, i10);
            writeMessage(3, messageLite);
            writeTag(1, 4);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeRawBytes(ByteBuffer byteBuffer) throws IOException {
            if (byteBuffer.hasArray()) {
                write(byteBuffer.array(), byteBuffer.arrayOffset(), byteBuffer.capacity());
                return;
            }
            ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
            byteBufferDuplicate.clear();
            write(byteBufferDuplicate);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeRawMessageSetExtension(int i10, ByteString byteString) throws IOException {
            writeTag(1, 3);
            writeUInt32(2, i10);
            writeBytes(3, byteString);
            writeTag(1, 4);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeString(int i10, String str) throws IOException {
            writeTag(i10, 2);
            writeStringNoTag(str);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeStringNoTag(String str) throws IOException {
            int i10 = this.f20863h;
            try {
                int iComputeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(str.length() * 3);
                int iComputeUInt32SizeNoTag2 = CodedOutputStream.computeUInt32SizeNoTag(str.length());
                byte[] bArr = this.f20860e;
                if (iComputeUInt32SizeNoTag2 == iComputeUInt32SizeNoTag) {
                    int i11 = i10 + iComputeUInt32SizeNoTag2;
                    this.f20863h = i11;
                    int iD = w0.f21158a.d(str, bArr, i11, spaceLeft());
                    this.f20863h = i10;
                    writeUInt32NoTag((iD - i10) - iComputeUInt32SizeNoTag2);
                    this.f20863h = iD;
                } else {
                    writeUInt32NoTag(w0.e(str));
                    this.f20863h = w0.f21158a.d(str, bArr, this.f20863h, spaceLeft());
                }
            } catch (w0.d e5) {
                this.f20863h = i10;
                b(str, e5);
            } catch (IndexOutOfBoundsException e7) {
                throw new OutOfSpaceException(e7);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeTag(int i10, int i11) throws IOException {
            writeUInt32NoTag((i10 << 3) | i11);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeUInt32(int i10, int i11) throws IOException {
            writeTag(i10, 0);
            writeUInt32NoTag(i11);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeUInt32NoTag(int i10) throws IOException {
            boolean z10 = CodedOutputStream.f20853d;
            byte[] bArr = this.f20860e;
            if (!z10 || androidx.datastore.preferences.protobuf.b.a() || spaceLeft() < 5) {
                while ((i10 & (-128)) != 0) {
                    try {
                        int i11 = this.f20863h;
                        this.f20863h = i11 + 1;
                        bArr[i11] = (byte) ((i10 & 127) | 128);
                        i10 >>>= 7;
                    } catch (IndexOutOfBoundsException e5) {
                        throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f20863h), Integer.valueOf(this.f20862g), 1), e5);
                    }
                }
                int i12 = this.f20863h;
                this.f20863h = i12 + 1;
                bArr[i12] = (byte) i10;
                return;
            }
            if ((i10 & (-128)) == 0) {
                int i13 = this.f20863h;
                this.f20863h = i13 + 1;
                v0.q(bArr, i13, (byte) i10);
                return;
            }
            int i14 = this.f20863h;
            this.f20863h = i14 + 1;
            v0.q(bArr, i14, (byte) (i10 | 128));
            int i15 = i10 >>> 7;
            if ((i15 & (-128)) == 0) {
                int i16 = this.f20863h;
                this.f20863h = i16 + 1;
                v0.q(bArr, i16, (byte) i15);
                return;
            }
            int i17 = this.f20863h;
            this.f20863h = i17 + 1;
            v0.q(bArr, i17, (byte) (i15 | 128));
            int i18 = i10 >>> 14;
            if ((i18 & (-128)) == 0) {
                int i19 = this.f20863h;
                this.f20863h = i19 + 1;
                v0.q(bArr, i19, (byte) i18);
                return;
            }
            int i20 = this.f20863h;
            this.f20863h = i20 + 1;
            v0.q(bArr, i20, (byte) (i18 | 128));
            int i21 = i10 >>> 21;
            if ((i21 & (-128)) == 0) {
                int i22 = this.f20863h;
                this.f20863h = i22 + 1;
                v0.q(bArr, i22, (byte) i21);
            } else {
                int i23 = this.f20863h;
                this.f20863h = i23 + 1;
                v0.q(bArr, i23, (byte) (i21 | 128));
                int i24 = this.f20863h;
                this.f20863h = i24 + 1;
                v0.q(bArr, i24, (byte) (i10 >>> 28));
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeUInt64(int i10, long j10) throws IOException {
            writeTag(i10, 0);
            writeUInt64NoTag(j10);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeUInt64NoTag(long j10) throws IOException {
            boolean z10 = CodedOutputStream.f20853d;
            byte[] bArr = this.f20860e;
            if (z10 && spaceLeft() >= 10) {
                while ((j10 & (-128)) != 0) {
                    int i10 = this.f20863h;
                    this.f20863h = i10 + 1;
                    v0.q(bArr, i10, (byte) ((((int) j10) & 127) | 128));
                    j10 >>>= 7;
                }
                int i11 = this.f20863h;
                this.f20863h = i11 + 1;
                v0.q(bArr, i11, (byte) j10);
                return;
            }
            while ((j10 & (-128)) != 0) {
                try {
                    int i12 = this.f20863h;
                    this.f20863h = i12 + 1;
                    bArr[i12] = (byte) ((((int) j10) & 127) | 128);
                    j10 >>>= 7;
                } catch (IndexOutOfBoundsException e5) {
                    throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f20863h), Integer.valueOf(this.f20862g), 1), e5);
                }
            }
            int i13 = this.f20863h;
            this.f20863h = i13 + 1;
            bArr[i13] = (byte) j10;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeByteArray(int i10, byte[] bArr, int i11, int i12) throws IOException {
            writeTag(i10, 2);
            c(i11, i12, bArr);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream, androidx.datastore.preferences.protobuf.ByteOutput
        public final void writeLazy(ByteBuffer byteBuffer) throws IOException {
            write(byteBuffer);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream, androidx.datastore.preferences.protobuf.ByteOutput
        public final void write(byte[] bArr, int i10, int i11) throws IOException {
            try {
                System.arraycopy(bArr, i10, this.f20860e, this.f20863h, i11);
                this.f20863h += i11;
            } catch (IndexOutOfBoundsException e5) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f20863h), Integer.valueOf(this.f20862g), Integer.valueOf(i11)), e5);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream, androidx.datastore.preferences.protobuf.ByteOutput
        public final void write(ByteBuffer byteBuffer) throws IOException {
            int iRemaining = byteBuffer.remaining();
            try {
                byteBuffer.get(this.f20860e, this.f20863h, iRemaining);
                this.f20863h += iRemaining;
            } catch (IndexOutOfBoundsException e5) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f20863h), Integer.valueOf(this.f20862g), Integer.valueOf(iRemaining)), e5);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void flush() {
        }
    }

    public static final class c extends b {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final ByteBuffer f20864i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final int f20865j;

        public c(ByteBuffer byteBuffer) {
            super(byteBuffer.array(), byteBuffer.position() + byteBuffer.arrayOffset(), byteBuffer.remaining());
            this.f20864i = byteBuffer;
            this.f20865j = byteBuffer.position();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream.b, androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void flush() {
            this.f20864i.position(getTotalBytesWritten() + this.f20865j);
        }
    }

    public static final class d extends a {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final OutputStream f20866i;

        public d(OutputStream outputStream, int i10) {
            super(i10);
            if (outputStream == null) {
                throw new NullPointerException("out");
            }
            this.f20866i = outputStream;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void c(int i10, int i11, byte[] bArr) throws IOException {
            writeUInt32NoTag(i11);
            write(bArr, i10, i11);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void d(int i10, MessageLite messageLite, o0 o0Var) throws IOException {
            writeTag(i10, 2);
            writeUInt32NoTag(((AbstractMessageLite) messageLite).b(o0Var));
            o0Var.h(messageLite, this.f20854a);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void flush() throws IOException {
            if (this.f20858g > 0) {
                j();
            }
        }

        public final void j() throws IOException {
            this.f20866i.write(this.f20856e, 0, this.f20858g);
            this.f20858g = 0;
        }

        public final void k(int i10) throws IOException {
            if (this.f20857f - this.f20858g < i10) {
                j();
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream, androidx.datastore.preferences.protobuf.ByteOutput
        public final void write(byte b10) throws IOException {
            if (this.f20858g == this.f20857f) {
                j();
            }
            int i10 = this.f20858g;
            this.f20858g = i10 + 1;
            this.f20856e[i10] = b10;
            this.f20859h++;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeBool(int i10, boolean z10) throws IOException {
            k(11);
            g(i10, 0);
            byte b10 = z10 ? (byte) 1 : (byte) 0;
            int i11 = this.f20858g;
            this.f20858g = i11 + 1;
            this.f20856e[i11] = b10;
            this.f20859h++;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeByteArray(int i10, byte[] bArr) throws IOException {
            writeByteArray(i10, bArr, 0, bArr.length);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeByteBuffer(int i10, ByteBuffer byteBuffer) throws IOException {
            writeTag(i10, 2);
            writeUInt32NoTag(byteBuffer.capacity());
            writeRawBytes(byteBuffer);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeBytes(int i10, ByteString byteString) throws IOException {
            writeTag(i10, 2);
            writeBytesNoTag(byteString);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeBytesNoTag(ByteString byteString) throws IOException {
            writeUInt32NoTag(byteString.size());
            byteString.f(this);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeFixed32(int i10, int i11) throws IOException {
            k(14);
            g(i10, 5);
            e(i11);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeFixed32NoTag(int i10) throws IOException {
            k(4);
            e(i10);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeFixed64(int i10, long j10) throws IOException {
            k(18);
            g(i10, 1);
            f(j10);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeFixed64NoTag(long j10) throws IOException {
            k(8);
            f(j10);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeInt32(int i10, int i11) throws IOException {
            k(20);
            g(i10, 0);
            if (i11 >= 0) {
                h(i11);
            } else {
                i(i11);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeInt32NoTag(int i10) throws IOException {
            if (i10 >= 0) {
                writeUInt32NoTag(i10);
            } else {
                writeUInt64NoTag(i10);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeMessage(int i10, MessageLite messageLite) throws IOException {
            writeTag(i10, 2);
            writeMessageNoTag(messageLite);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeMessageNoTag(MessageLite messageLite) throws IOException {
            writeUInt32NoTag(messageLite.getSerializedSize());
            messageLite.writeTo(this);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeMessageSetExtension(int i10, MessageLite messageLite) throws IOException {
            writeTag(1, 3);
            writeUInt32(2, i10);
            writeMessage(3, messageLite);
            writeTag(1, 4);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeRawBytes(ByteBuffer byteBuffer) throws IOException {
            if (byteBuffer.hasArray()) {
                write(byteBuffer.array(), byteBuffer.arrayOffset(), byteBuffer.capacity());
                return;
            }
            ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
            byteBufferDuplicate.clear();
            write(byteBufferDuplicate);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeRawMessageSetExtension(int i10, ByteString byteString) throws IOException {
            writeTag(1, 3);
            writeUInt32(2, i10);
            writeBytes(3, byteString);
            writeTag(1, 4);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeString(int i10, String str) throws IOException {
            writeTag(i10, 2);
            writeStringNoTag(str);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeStringNoTag(String str) throws IOException {
            int iE;
            try {
                int length = str.length() * 3;
                int iComputeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(length);
                int i10 = iComputeUInt32SizeNoTag + length;
                int i11 = this.f20857f;
                if (i10 > i11) {
                    byte[] bArr = new byte[length];
                    int iD = w0.f21158a.d(str, bArr, 0, length);
                    writeUInt32NoTag(iD);
                    write(bArr, 0, iD);
                    return;
                }
                if (i10 > i11 - this.f20858g) {
                    j();
                }
                int iComputeUInt32SizeNoTag2 = CodedOutputStream.computeUInt32SizeNoTag(str.length());
                int i12 = this.f20858g;
                byte[] bArr2 = this.f20856e;
                try {
                    try {
                        if (iComputeUInt32SizeNoTag2 == iComputeUInt32SizeNoTag) {
                            int i13 = i12 + iComputeUInt32SizeNoTag2;
                            this.f20858g = i13;
                            int iD2 = w0.f21158a.d(str, bArr2, i13, i11 - i13);
                            this.f20858g = i12;
                            iE = (iD2 - i12) - iComputeUInt32SizeNoTag2;
                            h(iE);
                            this.f20858g = iD2;
                        } else {
                            iE = w0.e(str);
                            h(iE);
                            this.f20858g = w0.f21158a.d(str, bArr2, this.f20858g, iE);
                        }
                        this.f20859h += iE;
                    } catch (w0.d e5) {
                        this.f20859h -= this.f20858g - i12;
                        this.f20858g = i12;
                        throw e5;
                    }
                } catch (ArrayIndexOutOfBoundsException e7) {
                    throw new OutOfSpaceException(e7);
                }
            } catch (w0.d e10) {
                b(str, e10);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeTag(int i10, int i11) throws IOException {
            writeUInt32NoTag((i10 << 3) | i11);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeUInt32(int i10, int i11) throws IOException {
            k(20);
            g(i10, 0);
            h(i11);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeUInt32NoTag(int i10) throws IOException {
            k(5);
            h(i10);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeUInt64(int i10, long j10) throws IOException {
            k(20);
            g(i10, 0);
            i(j10);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeUInt64NoTag(long j10) throws IOException {
            k(10);
            i(j10);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeByteArray(int i10, byte[] bArr, int i11, int i12) throws IOException {
            writeTag(i10, 2);
            c(i11, i12, bArr);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream, androidx.datastore.preferences.protobuf.ByteOutput
        public final void write(byte[] bArr, int i10, int i11) throws IOException {
            int i12 = this.f20858g;
            int i13 = this.f20857f;
            int i14 = i13 - i12;
            byte[] bArr2 = this.f20856e;
            if (i14 >= i11) {
                System.arraycopy(bArr, i10, bArr2, i12, i11);
                this.f20858g += i11;
                this.f20859h += i11;
                return;
            }
            int i15 = i13 - i12;
            System.arraycopy(bArr, i10, bArr2, i12, i15);
            int i16 = i10 + i15;
            int i17 = i11 - i15;
            this.f20858g = i13;
            this.f20859h += i15;
            j();
            if (i17 <= i13) {
                System.arraycopy(bArr, i16, bArr2, 0, i17);
                this.f20858g = i17;
            } else {
                this.f20866i.write(bArr, i16, i17);
            }
            this.f20859h += i17;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream, androidx.datastore.preferences.protobuf.ByteOutput
        public final void write(ByteBuffer byteBuffer) throws IOException {
            int iRemaining = byteBuffer.remaining();
            int i10 = this.f20858g;
            int i11 = this.f20857f;
            int i12 = i11 - i10;
            byte[] bArr = this.f20856e;
            if (i12 >= iRemaining) {
                byteBuffer.get(bArr, i10, iRemaining);
                this.f20858g += iRemaining;
                this.f20859h += iRemaining;
                return;
            }
            int i13 = i11 - i10;
            byteBuffer.get(bArr, i10, i13);
            int i14 = iRemaining - i13;
            this.f20858g = i11;
            this.f20859h += i13;
            j();
            while (i14 > i11) {
                byteBuffer.get(bArr, 0, i11);
                this.f20866i.write(bArr, 0, i11);
                i14 -= i11;
                this.f20859h += i11;
            }
            byteBuffer.get(bArr, 0, i14);
            this.f20858g = i14;
            this.f20859h += i14;
        }
    }

    public static final class e extends CodedOutputStream {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final ByteBuffer f20867e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final ByteBuffer f20868f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final int f20869g;

        public e(ByteBuffer byteBuffer) {
            this.f20867e = byteBuffer;
            this.f20868f = byteBuffer.duplicate().order(ByteOrder.LITTLE_ENDIAN);
            this.f20869g = byteBuffer.position();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void c(int i10, int i11, byte[] bArr) throws IOException {
            writeUInt32NoTag(i11);
            write(bArr, i10, i11);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void d(int i10, MessageLite messageLite, o0 o0Var) throws IOException {
            writeTag(i10, 2);
            writeUInt32NoTag(((AbstractMessageLite) messageLite).b(o0Var));
            o0Var.h(messageLite, this.f20854a);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void flush() {
            this.f20867e.position(this.f20868f.position());
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final int getTotalBytesWritten() {
            return this.f20868f.position() - this.f20869g;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final int spaceLeft() {
            return this.f20868f.remaining();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream, androidx.datastore.preferences.protobuf.ByteOutput
        public final void write(byte b10) throws IOException {
            try {
                this.f20868f.put(b10);
            } catch (BufferOverflowException e5) {
                throw new OutOfSpaceException(e5);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeBool(int i10, boolean z10) throws IOException {
            writeTag(i10, 0);
            write(z10 ? (byte) 1 : (byte) 0);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeByteArray(int i10, byte[] bArr) throws IOException {
            writeByteArray(i10, bArr, 0, bArr.length);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeByteBuffer(int i10, ByteBuffer byteBuffer) throws IOException {
            writeTag(i10, 2);
            writeUInt32NoTag(byteBuffer.capacity());
            writeRawBytes(byteBuffer);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeBytes(int i10, ByteString byteString) throws IOException {
            writeTag(i10, 2);
            writeBytesNoTag(byteString);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeBytesNoTag(ByteString byteString) throws IOException {
            writeUInt32NoTag(byteString.size());
            byteString.f(this);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeFixed32(int i10, int i11) throws IOException {
            writeTag(i10, 5);
            writeFixed32NoTag(i11);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeFixed32NoTag(int i10) throws IOException {
            try {
                this.f20868f.putInt(i10);
            } catch (BufferOverflowException e5) {
                throw new OutOfSpaceException(e5);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeFixed64(int i10, long j10) throws IOException {
            writeTag(i10, 1);
            writeFixed64NoTag(j10);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeFixed64NoTag(long j10) throws IOException {
            try {
                this.f20868f.putLong(j10);
            } catch (BufferOverflowException e5) {
                throw new OutOfSpaceException(e5);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeInt32(int i10, int i11) throws IOException {
            writeTag(i10, 0);
            writeInt32NoTag(i11);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeInt32NoTag(int i10) throws IOException {
            if (i10 >= 0) {
                writeUInt32NoTag(i10);
            } else {
                writeUInt64NoTag(i10);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream, androidx.datastore.preferences.protobuf.ByteOutput
        public final void writeLazy(byte[] bArr, int i10, int i11) throws IOException {
            write(bArr, i10, i11);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeMessage(int i10, MessageLite messageLite) throws IOException {
            writeTag(i10, 2);
            writeMessageNoTag(messageLite);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeMessageNoTag(MessageLite messageLite) throws IOException {
            writeUInt32NoTag(messageLite.getSerializedSize());
            messageLite.writeTo(this);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeMessageSetExtension(int i10, MessageLite messageLite) throws IOException {
            writeTag(1, 3);
            writeUInt32(2, i10);
            writeMessage(3, messageLite);
            writeTag(1, 4);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeRawBytes(ByteBuffer byteBuffer) throws IOException {
            if (byteBuffer.hasArray()) {
                write(byteBuffer.array(), byteBuffer.arrayOffset(), byteBuffer.capacity());
                return;
            }
            ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
            byteBufferDuplicate.clear();
            write(byteBufferDuplicate);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeRawMessageSetExtension(int i10, ByteString byteString) throws IOException {
            writeTag(1, 3);
            writeUInt32(2, i10);
            writeBytes(3, byteString);
            writeTag(1, 4);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeString(int i10, String str) throws IOException {
            writeTag(i10, 2);
            writeStringNoTag(str);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeStringNoTag(String str) throws IOException {
            ByteBuffer byteBuffer = this.f20868f;
            int iPosition = byteBuffer.position();
            try {
                int iComputeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(str.length() * 3);
                int iComputeUInt32SizeNoTag2 = CodedOutputStream.computeUInt32SizeNoTag(str.length());
                if (iComputeUInt32SizeNoTag2 != iComputeUInt32SizeNoTag) {
                    writeUInt32NoTag(w0.e(str));
                    try {
                        w0.d(str, byteBuffer);
                        return;
                    } catch (IndexOutOfBoundsException e5) {
                        throw new OutOfSpaceException(e5);
                    }
                }
                int iPosition2 = byteBuffer.position() + iComputeUInt32SizeNoTag2;
                byteBuffer.position(iPosition2);
                try {
                    w0.d(str, byteBuffer);
                    int iPosition3 = byteBuffer.position();
                    byteBuffer.position(iPosition);
                    writeUInt32NoTag(iPosition3 - iPosition2);
                    byteBuffer.position(iPosition3);
                } catch (IndexOutOfBoundsException e7) {
                    throw new OutOfSpaceException(e7);
                }
            } catch (w0.d e10) {
                byteBuffer.position(iPosition);
                b(str, e10);
            } catch (IllegalArgumentException e11) {
                throw new OutOfSpaceException(e11);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeTag(int i10, int i11) throws IOException {
            writeUInt32NoTag((i10 << 3) | i11);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeUInt32(int i10, int i11) throws IOException {
            writeTag(i10, 0);
            writeUInt32NoTag(i11);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeUInt32NoTag(int i10) throws IOException {
            while (true) {
                int i11 = i10 & (-128);
                ByteBuffer byteBuffer = this.f20868f;
                if (i11 == 0) {
                    byteBuffer.put((byte) i10);
                    return;
                }
                try {
                    byteBuffer.put((byte) ((i10 & 127) | 128));
                    i10 >>>= 7;
                } catch (BufferOverflowException e5) {
                    throw new OutOfSpaceException(e5);
                }
                throw new OutOfSpaceException(e5);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeUInt64(int i10, long j10) throws IOException {
            writeTag(i10, 0);
            writeUInt64NoTag(j10);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeUInt64NoTag(long j10) throws IOException {
            while (true) {
                long j11 = (-128) & j10;
                ByteBuffer byteBuffer = this.f20868f;
                if (j11 == 0) {
                    byteBuffer.put((byte) j10);
                    return;
                }
                try {
                    byteBuffer.put((byte) ((((int) j10) & 127) | 128));
                    j10 >>>= 7;
                } catch (BufferOverflowException e5) {
                    throw new OutOfSpaceException(e5);
                }
                throw new OutOfSpaceException(e5);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeByteArray(int i10, byte[] bArr, int i11, int i12) throws IOException {
            writeTag(i10, 2);
            c(i11, i12, bArr);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream, androidx.datastore.preferences.protobuf.ByteOutput
        public final void writeLazy(ByteBuffer byteBuffer) throws IOException {
            write(byteBuffer);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream, androidx.datastore.preferences.protobuf.ByteOutput
        public final void write(byte[] bArr, int i10, int i11) throws IOException {
            try {
                this.f20868f.put(bArr, i10, i11);
            } catch (IndexOutOfBoundsException e5) {
                throw new OutOfSpaceException(e5);
            } catch (BufferOverflowException e7) {
                throw new OutOfSpaceException(e7);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream, androidx.datastore.preferences.protobuf.ByteOutput
        public final void write(ByteBuffer byteBuffer) throws IOException {
            try {
                this.f20868f.put(byteBuffer);
            } catch (BufferOverflowException e5) {
                throw new OutOfSpaceException(e5);
            }
        }
    }

    public static final class f extends CodedOutputStream {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final ByteBuffer f20870e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final ByteBuffer f20871f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final long f20872g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final long f20873h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final long f20874i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final long f20875j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public long f20876k;

        public f(ByteBuffer byteBuffer) {
            this.f20870e = byteBuffer;
            this.f20871f = byteBuffer.duplicate().order(ByteOrder.LITTLE_ENDIAN);
            long jA = v0.a(byteBuffer);
            this.f20872g = jA;
            long jPosition = ((long) byteBuffer.position()) + jA;
            this.f20873h = jPosition;
            long jLimit = jA + ((long) byteBuffer.limit());
            this.f20874i = jLimit;
            this.f20875j = jLimit - 10;
            this.f20876k = jPosition;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void c(int i10, int i11, byte[] bArr) throws IOException {
            writeUInt32NoTag(i11);
            write(bArr, i10, i11);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void d(int i10, MessageLite messageLite, o0 o0Var) throws IOException {
            writeTag(i10, 2);
            writeUInt32NoTag(((AbstractMessageLite) messageLite).b(o0Var));
            o0Var.h(messageLite, this.f20854a);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void flush() {
            this.f20870e.position((int) (this.f20876k - this.f20872g));
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final int getTotalBytesWritten() {
            return (int) (this.f20876k - this.f20873h);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final int spaceLeft() {
            return (int) (this.f20874i - this.f20876k);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream, androidx.datastore.preferences.protobuf.ByteOutput
        public final void write(byte b10) throws IOException {
            long j10 = this.f20876k;
            long j11 = this.f20874i;
            if (j10 >= j11) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Long.valueOf(this.f20876k), Long.valueOf(j11), 1));
            }
            this.f20876k = 1 + j10;
            v0.p(j10, b10);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeBool(int i10, boolean z10) throws IOException {
            writeTag(i10, 0);
            write(z10 ? (byte) 1 : (byte) 0);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeByteArray(int i10, byte[] bArr) throws IOException {
            writeByteArray(i10, bArr, 0, bArr.length);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeByteBuffer(int i10, ByteBuffer byteBuffer) throws IOException {
            writeTag(i10, 2);
            writeUInt32NoTag(byteBuffer.capacity());
            writeRawBytes(byteBuffer);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeBytes(int i10, ByteString byteString) throws IOException {
            writeTag(i10, 2);
            writeBytesNoTag(byteString);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeBytesNoTag(ByteString byteString) throws IOException {
            writeUInt32NoTag(byteString.size());
            byteString.f(this);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeFixed32(int i10, int i11) throws IOException {
            writeTag(i10, 5);
            writeFixed32NoTag(i11);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeFixed32NoTag(int i10) throws IOException {
            this.f20871f.putInt((int) (this.f20876k - this.f20872g), i10);
            this.f20876k += 4;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeFixed64(int i10, long j10) throws IOException {
            writeTag(i10, 1);
            writeFixed64NoTag(j10);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeFixed64NoTag(long j10) throws IOException {
            this.f20871f.putLong((int) (this.f20876k - this.f20872g), j10);
            this.f20876k += 8;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeInt32(int i10, int i11) throws IOException {
            writeTag(i10, 0);
            writeInt32NoTag(i11);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeInt32NoTag(int i10) throws IOException {
            if (i10 >= 0) {
                writeUInt32NoTag(i10);
            } else {
                writeUInt64NoTag(i10);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream, androidx.datastore.preferences.protobuf.ByteOutput
        public final void writeLazy(byte[] bArr, int i10, int i11) throws IOException {
            write(bArr, i10, i11);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeMessage(int i10, MessageLite messageLite) throws IOException {
            writeTag(i10, 2);
            writeMessageNoTag(messageLite);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeMessageNoTag(MessageLite messageLite) throws IOException {
            writeUInt32NoTag(messageLite.getSerializedSize());
            messageLite.writeTo(this);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeMessageSetExtension(int i10, MessageLite messageLite) throws IOException {
            writeTag(1, 3);
            writeUInt32(2, i10);
            writeMessage(3, messageLite);
            writeTag(1, 4);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeRawBytes(ByteBuffer byteBuffer) throws IOException {
            if (byteBuffer.hasArray()) {
                write(byteBuffer.array(), byteBuffer.arrayOffset(), byteBuffer.capacity());
                return;
            }
            ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
            byteBufferDuplicate.clear();
            write(byteBufferDuplicate);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeRawMessageSetExtension(int i10, ByteString byteString) throws IOException {
            writeTag(1, 3);
            writeUInt32(2, i10);
            writeBytes(3, byteString);
            writeTag(1, 4);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeString(int i10, String str) throws IOException {
            writeTag(i10, 2);
            writeStringNoTag(str);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeStringNoTag(String str) throws IOException {
            long j10 = this.f20872g;
            ByteBuffer byteBuffer = this.f20871f;
            long j11 = this.f20876k;
            try {
                int iComputeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(str.length() * 3);
                int iComputeUInt32SizeNoTag2 = CodedOutputStream.computeUInt32SizeNoTag(str.length());
                if (iComputeUInt32SizeNoTag2 == iComputeUInt32SizeNoTag) {
                    int i10 = ((int) (this.f20876k - j10)) + iComputeUInt32SizeNoTag2;
                    byteBuffer.position(i10);
                    w0.d(str, byteBuffer);
                    int iPosition = byteBuffer.position() - i10;
                    writeUInt32NoTag(iPosition);
                    this.f20876k += (long) iPosition;
                } else {
                    int iE = w0.e(str);
                    writeUInt32NoTag(iE);
                    byteBuffer.position((int) (this.f20876k - j10));
                    w0.d(str, byteBuffer);
                    this.f20876k += (long) iE;
                }
            } catch (w0.d e5) {
                this.f20876k = j11;
                byteBuffer.position((int) (j11 - j10));
                b(str, e5);
            } catch (IllegalArgumentException e7) {
                throw new OutOfSpaceException(e7);
            } catch (IndexOutOfBoundsException e10) {
                throw new OutOfSpaceException(e10);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeTag(int i10, int i11) throws IOException {
            writeUInt32NoTag((i10 << 3) | i11);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeUInt32(int i10, int i11) throws IOException {
            writeTag(i10, 0);
            writeUInt32NoTag(i11);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeUInt32NoTag(int i10) throws IOException {
            if (this.f20876k <= this.f20875j) {
                while ((i10 & (-128)) != 0) {
                    long j10 = this.f20876k;
                    this.f20876k = j10 + 1;
                    v0.p(j10, (byte) ((i10 & 127) | 128));
                    i10 >>>= 7;
                }
                long j11 = this.f20876k;
                this.f20876k = 1 + j11;
                v0.p(j11, (byte) i10);
                return;
            }
            while (true) {
                long j12 = this.f20876k;
                long j13 = this.f20874i;
                if (j12 >= j13) {
                    throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Long.valueOf(this.f20876k), Long.valueOf(j13), 1));
                }
                if ((i10 & (-128)) == 0) {
                    this.f20876k = 1 + j12;
                    v0.p(j12, (byte) i10);
                    return;
                } else {
                    this.f20876k = j12 + 1;
                    v0.p(j12, (byte) ((i10 & 127) | 128));
                    i10 >>>= 7;
                }
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeUInt64(int i10, long j10) throws IOException {
            writeTag(i10, 0);
            writeUInt64NoTag(j10);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeUInt64NoTag(long j10) throws IOException {
            if (this.f20876k <= this.f20875j) {
                while ((j10 & (-128)) != 0) {
                    long j11 = this.f20876k;
                    this.f20876k = j11 + 1;
                    v0.p(j11, (byte) ((((int) j10) & 127) | 128));
                    j10 >>>= 7;
                }
                long j12 = this.f20876k;
                this.f20876k = 1 + j12;
                v0.p(j12, (byte) j10);
                return;
            }
            while (true) {
                long j13 = this.f20876k;
                long j14 = this.f20874i;
                if (j13 >= j14) {
                    throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Long.valueOf(this.f20876k), Long.valueOf(j14), 1));
                }
                if ((j10 & (-128)) == 0) {
                    this.f20876k = 1 + j13;
                    v0.p(j13, (byte) j10);
                    return;
                } else {
                    this.f20876k = j13 + 1;
                    v0.p(j13, (byte) ((((int) j10) & 127) | 128));
                    j10 >>>= 7;
                }
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeByteArray(int i10, byte[] bArr, int i11, int i12) throws IOException {
            writeTag(i10, 2);
            c(i11, i12, bArr);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream, androidx.datastore.preferences.protobuf.ByteOutput
        public final void writeLazy(ByteBuffer byteBuffer) throws IOException {
            write(byteBuffer);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream, androidx.datastore.preferences.protobuf.ByteOutput
        public final void write(byte[] bArr, int i10, int i11) throws IOException {
            long j10 = this.f20874i;
            if (bArr != null && i10 >= 0 && i11 >= 0 && bArr.length - i11 >= i10) {
                long j11 = i11;
                long j12 = j10 - j11;
                long j13 = this.f20876k;
                if (j12 >= j13) {
                    v0.f21151d.d(bArr, i10, j13, j11);
                    this.f20876k += j11;
                    return;
                }
            }
            if (bArr == null) {
                throw new NullPointerException("value");
            }
            throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Long.valueOf(this.f20876k), Long.valueOf(j10), Integer.valueOf(i11)));
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream, androidx.datastore.preferences.protobuf.ByteOutput
        public final void write(ByteBuffer byteBuffer) throws IOException {
            ByteBuffer byteBuffer2 = this.f20871f;
            try {
                int iRemaining = byteBuffer.remaining();
                byteBuffer2.position((int) (this.f20876k - this.f20872g));
                byteBuffer2.put(byteBuffer);
                this.f20876k += (long) iRemaining;
            } catch (BufferOverflowException e5) {
                throw new OutOfSpaceException(e5);
            }
        }
    }

    @Deprecated
    public static int a(int i10, MessageLite messageLite, o0 o0Var) {
        return ((AbstractMessageLite) messageLite).b(o0Var) + (computeTagSize(i10) * 2);
    }

    public static int computeBoolSize(int i10, boolean z10) {
        return computeBoolSizeNoTag(z10) + computeTagSize(i10);
    }

    public static int computeBoolSizeNoTag(boolean z10) {
        return 1;
    }

    public static int computeByteArraySize(int i10, byte[] bArr) {
        return computeByteArraySizeNoTag(bArr) + computeTagSize(i10);
    }

    public static int computeByteArraySizeNoTag(byte[] bArr) {
        int length = bArr.length;
        return computeUInt32SizeNoTag(length) + length;
    }

    public static int computeByteBufferSize(int i10, ByteBuffer byteBuffer) {
        return computeByteBufferSizeNoTag(byteBuffer) + computeTagSize(i10);
    }

    public static int computeByteBufferSizeNoTag(ByteBuffer byteBuffer) {
        int iCapacity = byteBuffer.capacity();
        return computeUInt32SizeNoTag(iCapacity) + iCapacity;
    }

    public static int computeBytesSize(int i10, ByteString byteString) {
        return computeBytesSizeNoTag(byteString) + computeTagSize(i10);
    }

    public static int computeBytesSizeNoTag(ByteString byteString) {
        int size = byteString.size();
        return computeUInt32SizeNoTag(size) + size;
    }

    public static int computeDoubleSize(int i10, double d2) {
        return computeDoubleSizeNoTag(d2) + computeTagSize(i10);
    }

    public static int computeDoubleSizeNoTag(double d2) {
        return 8;
    }

    public static int computeEnumSize(int i10, int i11) {
        return computeEnumSizeNoTag(i11) + computeTagSize(i10);
    }

    public static int computeEnumSizeNoTag(int i10) {
        return computeInt32SizeNoTag(i10);
    }

    public static int computeFixed32Size(int i10, int i11) {
        return computeFixed32SizeNoTag(i11) + computeTagSize(i10);
    }

    public static int computeFixed32SizeNoTag(int i10) {
        return 4;
    }

    public static int computeFixed64Size(int i10, long j10) {
        return computeFixed64SizeNoTag(j10) + computeTagSize(i10);
    }

    public static int computeFixed64SizeNoTag(long j10) {
        return 8;
    }

    public static int computeFloatSize(int i10, float f6) {
        return computeFloatSizeNoTag(f6) + computeTagSize(i10);
    }

    public static int computeFloatSizeNoTag(float f6) {
        return 4;
    }

    @Deprecated
    public static int computeGroupSize(int i10, MessageLite messageLite) {
        return computeGroupSizeNoTag(messageLite) + (computeTagSize(i10) * 2);
    }

    @Deprecated
    public static int computeGroupSizeNoTag(MessageLite messageLite) {
        return messageLite.getSerializedSize();
    }

    public static int computeInt32Size(int i10, int i11) {
        return computeInt32SizeNoTag(i11) + computeTagSize(i10);
    }

    public static int computeInt32SizeNoTag(int i10) {
        if (i10 >= 0) {
            return computeUInt32SizeNoTag(i10);
        }
        return 10;
    }

    public static int computeInt64Size(int i10, long j10) {
        return computeInt64SizeNoTag(j10) + computeTagSize(i10);
    }

    public static int computeInt64SizeNoTag(long j10) {
        return computeUInt64SizeNoTag(j10);
    }

    public static int computeLazyFieldMessageSetExtensionSize(int i10, LazyFieldLite lazyFieldLite) {
        return computeLazyFieldSize(3, lazyFieldLite) + computeUInt32Size(2, i10) + (computeTagSize(1) * 2);
    }

    public static int computeLazyFieldSize(int i10, LazyFieldLite lazyFieldLite) {
        return computeLazyFieldSizeNoTag(lazyFieldLite) + computeTagSize(i10);
    }

    public static int computeLazyFieldSizeNoTag(LazyFieldLite lazyFieldLite) {
        int serializedSize = lazyFieldLite.getSerializedSize();
        return computeUInt32SizeNoTag(serializedSize) + serializedSize;
    }

    public static int computeMessageSetExtensionSize(int i10, MessageLite messageLite) {
        return computeMessageSize(3, messageLite) + computeUInt32Size(2, i10) + (computeTagSize(1) * 2);
    }

    public static int computeMessageSize(int i10, MessageLite messageLite) {
        return computeMessageSizeNoTag(messageLite) + computeTagSize(i10);
    }

    public static int computeMessageSizeNoTag(MessageLite messageLite) {
        int serializedSize = messageLite.getSerializedSize();
        return computeUInt32SizeNoTag(serializedSize) + serializedSize;
    }

    public static int computeRawMessageSetExtensionSize(int i10, ByteString byteString) {
        return computeBytesSize(3, byteString) + computeUInt32Size(2, i10) + (computeTagSize(1) * 2);
    }

    @Deprecated
    public static int computeRawVarint32Size(int i10) {
        return computeUInt32SizeNoTag(i10);
    }

    @Deprecated
    public static int computeRawVarint64Size(long j10) {
        return computeUInt64SizeNoTag(j10);
    }

    public static int computeSFixed32Size(int i10, int i11) {
        return computeSFixed32SizeNoTag(i11) + computeTagSize(i10);
    }

    public static int computeSFixed32SizeNoTag(int i10) {
        return 4;
    }

    public static int computeSFixed64Size(int i10, long j10) {
        return computeSFixed64SizeNoTag(j10) + computeTagSize(i10);
    }

    public static int computeSFixed64SizeNoTag(long j10) {
        return 8;
    }

    public static int computeSInt32Size(int i10, int i11) {
        return computeSInt32SizeNoTag(i11) + computeTagSize(i10);
    }

    public static int computeSInt32SizeNoTag(int i10) {
        return computeUInt32SizeNoTag(encodeZigZag32(i10));
    }

    public static int computeSInt64Size(int i10, long j10) {
        return computeSInt64SizeNoTag(j10) + computeTagSize(i10);
    }

    public static int computeSInt64SizeNoTag(long j10) {
        return computeUInt64SizeNoTag(encodeZigZag64(j10));
    }

    public static int computeStringSize(int i10, String str) {
        return computeStringSizeNoTag(str) + computeTagSize(i10);
    }

    public static int computeStringSizeNoTag(String str) {
        int length;
        try {
            length = w0.e(str);
        } catch (w0.d unused) {
            length = str.getBytes(Internal.f20943a).length;
        }
        return computeUInt32SizeNoTag(length) + length;
    }

    public static int computeTagSize(int i10) {
        return computeUInt32SizeNoTag(i10 << 3);
    }

    public static int computeUInt32Size(int i10, int i11) {
        return computeUInt32SizeNoTag(i11) + computeTagSize(i10);
    }

    public static int computeUInt32SizeNoTag(int i10) {
        if ((i10 & (-128)) == 0) {
            return 1;
        }
        if ((i10 & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i10) == 0) {
            return 3;
        }
        return (i10 & (-268435456)) == 0 ? 4 : 5;
    }

    public static int computeUInt64Size(int i10, long j10) {
        return computeUInt64SizeNoTag(j10) + computeTagSize(i10);
    }

    public static int computeUInt64SizeNoTag(long j10) {
        int i10;
        if (((-128) & j10) == 0) {
            return 1;
        }
        if (j10 < 0) {
            return 10;
        }
        if (((-34359738368L) & j10) != 0) {
            j10 >>>= 28;
            i10 = 6;
        } else {
            i10 = 2;
        }
        if (((-2097152) & j10) != 0) {
            i10 += 2;
            j10 >>>= 14;
        }
        return (j10 & (-16384)) != 0 ? i10 + 1 : i10;
    }

    public static int encodeZigZag32(int i10) {
        return (i10 >> 31) ^ (i10 << 1);
    }

    public static long encodeZigZag64(long j10) {
        return (j10 >> 63) ^ (j10 << 1);
    }

    public static CodedOutputStream newInstance(OutputStream outputStream) {
        return newInstance(outputStream, 4096);
    }

    public final void b(String str, w0.d dVar) throws IOException {
        f20852c.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) dVar);
        byte[] bytes = str.getBytes(Internal.f20943a);
        try {
            writeUInt32NoTag(bytes.length);
            writeLazy(bytes, 0, bytes.length);
        } catch (OutOfSpaceException e5) {
            throw e5;
        } catch (IndexOutOfBoundsException e7) {
            throw new OutOfSpaceException(e7);
        }
    }

    public abstract void c(int i10, int i11, byte[] bArr) throws IOException;

    public final void checkNoSpaceLeft() {
        if (spaceLeft() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    public abstract void d(int i10, MessageLite messageLite, o0 o0Var) throws IOException;

    public abstract void flush() throws IOException;

    public abstract int getTotalBytesWritten();

    public abstract int spaceLeft();

    public void useDeterministicSerialization() {
        this.f20855b = true;
    }

    @Override // androidx.datastore.preferences.protobuf.ByteOutput
    public abstract void write(byte b10) throws IOException;

    @Override // androidx.datastore.preferences.protobuf.ByteOutput
    public abstract void write(ByteBuffer byteBuffer) throws IOException;

    @Override // androidx.datastore.preferences.protobuf.ByteOutput
    public abstract void write(byte[] bArr, int i10, int i11) throws IOException;

    public abstract void writeBool(int i10, boolean z10) throws IOException;

    public final void writeBoolNoTag(boolean z10) throws IOException {
        write(z10 ? (byte) 1 : (byte) 0);
    }

    public abstract void writeByteArray(int i10, byte[] bArr) throws IOException;

    public abstract void writeByteArray(int i10, byte[] bArr, int i11, int i12) throws IOException;

    public final void writeByteArrayNoTag(byte[] bArr) throws IOException {
        c(0, bArr.length, bArr);
    }

    public abstract void writeByteBuffer(int i10, ByteBuffer byteBuffer) throws IOException;

    public abstract void writeBytes(int i10, ByteString byteString) throws IOException;

    public abstract void writeBytesNoTag(ByteString byteString) throws IOException;

    public final void writeDouble(int i10, double d2) throws IOException {
        writeFixed64(i10, Double.doubleToRawLongBits(d2));
    }

    public final void writeDoubleNoTag(double d2) throws IOException {
        writeFixed64NoTag(Double.doubleToRawLongBits(d2));
    }

    public final void writeEnum(int i10, int i11) throws IOException {
        writeInt32(i10, i11);
    }

    public final void writeEnumNoTag(int i10) throws IOException {
        writeInt32NoTag(i10);
    }

    public abstract void writeFixed32(int i10, int i11) throws IOException;

    public abstract void writeFixed32NoTag(int i10) throws IOException;

    public abstract void writeFixed64(int i10, long j10) throws IOException;

    public abstract void writeFixed64NoTag(long j10) throws IOException;

    public final void writeFloat(int i10, float f6) throws IOException {
        writeFixed32(i10, Float.floatToRawIntBits(f6));
    }

    public final void writeFloatNoTag(float f6) throws IOException {
        writeFixed32NoTag(Float.floatToRawIntBits(f6));
    }

    @Deprecated
    public final void writeGroup(int i10, MessageLite messageLite) throws IOException {
        writeTag(i10, 3);
        writeGroupNoTag(messageLite);
        writeTag(i10, 4);
    }

    @Deprecated
    public final void writeGroupNoTag(MessageLite messageLite) throws IOException {
        messageLite.writeTo(this);
    }

    public abstract void writeInt32(int i10, int i11) throws IOException;

    public abstract void writeInt32NoTag(int i10) throws IOException;

    public final void writeInt64(int i10, long j10) throws IOException {
        writeUInt64(i10, j10);
    }

    public final void writeInt64NoTag(long j10) throws IOException {
        writeUInt64NoTag(j10);
    }

    @Override // androidx.datastore.preferences.protobuf.ByteOutput
    public abstract void writeLazy(ByteBuffer byteBuffer) throws IOException;

    @Override // androidx.datastore.preferences.protobuf.ByteOutput
    public abstract void writeLazy(byte[] bArr, int i10, int i11) throws IOException;

    public abstract void writeMessage(int i10, MessageLite messageLite) throws IOException;

    public abstract void writeMessageNoTag(MessageLite messageLite) throws IOException;

    public abstract void writeMessageSetExtension(int i10, MessageLite messageLite) throws IOException;

    public final void writeRawByte(byte b10) throws IOException {
        write(b10);
    }

    public abstract void writeRawBytes(ByteBuffer byteBuffer) throws IOException;

    public final void writeRawBytes(byte[] bArr) throws IOException {
        write(bArr, 0, bArr.length);
    }

    @Deprecated
    public final void writeRawLittleEndian32(int i10) throws IOException {
        writeFixed32NoTag(i10);
    }

    @Deprecated
    public final void writeRawLittleEndian64(long j10) throws IOException {
        writeFixed64NoTag(j10);
    }

    public abstract void writeRawMessageSetExtension(int i10, ByteString byteString) throws IOException;

    @Deprecated
    public final void writeRawVarint32(int i10) throws IOException {
        writeUInt32NoTag(i10);
    }

    @Deprecated
    public final void writeRawVarint64(long j10) throws IOException {
        writeUInt64NoTag(j10);
    }

    public final void writeSFixed32(int i10, int i11) throws IOException {
        writeFixed32(i10, i11);
    }

    public final void writeSFixed32NoTag(int i10) throws IOException {
        writeFixed32NoTag(i10);
    }

    public final void writeSFixed64(int i10, long j10) throws IOException {
        writeFixed64(i10, j10);
    }

    public final void writeSFixed64NoTag(long j10) throws IOException {
        writeFixed64NoTag(j10);
    }

    public final void writeSInt32(int i10, int i11) throws IOException {
        writeUInt32(i10, encodeZigZag32(i11));
    }

    public final void writeSInt32NoTag(int i10) throws IOException {
        writeUInt32NoTag(encodeZigZag32(i10));
    }

    public final void writeSInt64(int i10, long j10) throws IOException {
        writeUInt64(i10, encodeZigZag64(j10));
    }

    public final void writeSInt64NoTag(long j10) throws IOException {
        writeUInt64NoTag(encodeZigZag64(j10));
    }

    public abstract void writeString(int i10, String str) throws IOException;

    public abstract void writeStringNoTag(String str) throws IOException;

    public abstract void writeTag(int i10, int i11) throws IOException;

    public abstract void writeUInt32(int i10, int i11) throws IOException;

    public abstract void writeUInt32NoTag(int i10) throws IOException;

    public abstract void writeUInt64(int i10, long j10) throws IOException;

    public abstract void writeUInt64NoTag(long j10) throws IOException;

    public static CodedOutputStream newInstance(OutputStream outputStream, int i10) {
        return new d(outputStream, i10);
    }

    public final void writeRawByte(int i10) throws IOException {
        write((byte) i10);
    }

    public final void writeRawBytes(byte[] bArr, int i10, int i11) throws IOException {
        write(bArr, i10, i11);
    }

    public static CodedOutputStream newInstance(byte[] bArr) {
        return newInstance(bArr, 0, bArr.length);
    }

    public final void writeRawBytes(ByteString byteString) throws IOException {
        byteString.f(this);
    }

    public static CodedOutputStream newInstance(byte[] bArr, int i10, int i11) {
        return new b(bArr, i10, i11);
    }

    public static CodedOutputStream newInstance(ByteBuffer byteBuffer) {
        if (byteBuffer.hasArray()) {
            return new c(byteBuffer);
        }
        if (byteBuffer.isDirect() && !byteBuffer.isReadOnly()) {
            if (v0.f21152e) {
                return new f(byteBuffer);
            }
            return new e(byteBuffer);
        }
        throw new IllegalArgumentException("ByteBuffer is read-only");
    }

    public static class OutOfSpaceException extends IOException {
        public OutOfSpaceException(String str) {
            super(androidx.camera.core.processing.f.d("CodedOutputStream was writing to a flat byte array and ran out of space.: ", str));
        }

        public OutOfSpaceException(String str, IndexOutOfBoundsException indexOutOfBoundsException) {
            super(androidx.camera.core.processing.f.d("CodedOutputStream was writing to a flat byte array and ran out of space.: ", str), indexOutOfBoundsException);
        }

        public OutOfSpaceException() {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.");
        }

        public OutOfSpaceException(RuntimeException runtimeException) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.", runtimeException);
        }
    }

    @Deprecated
    public static CodedOutputStream newInstance(ByteBuffer byteBuffer, int i10) {
        return newInstance(byteBuffer);
    }
}
