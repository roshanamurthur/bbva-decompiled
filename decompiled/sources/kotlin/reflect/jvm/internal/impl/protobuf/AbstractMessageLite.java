package kotlin.reflect.jvm.internal.impl.protobuf;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes12.dex */
public abstract class AbstractMessageLite implements MessageLite {
    protected int memoizedHashCode = 0;

    public void writeDelimitedTo(OutputStream outputStream) throws IOException {
        int serializedSize = getSerializedSize();
        int iComputeRawVarint32Size = CodedOutputStream.computeRawVarint32Size(serializedSize) + serializedSize;
        if (iComputeRawVarint32Size > 4096) {
            iComputeRawVarint32Size = 4096;
        }
        CodedOutputStream codedOutputStreamNewInstance = CodedOutputStream.newInstance(outputStream, iComputeRawVarint32Size);
        codedOutputStreamNewInstance.writeRawVarint32(serializedSize);
        writeTo(codedOutputStreamNewInstance);
        codedOutputStreamNewInstance.flush();
    }

    public static abstract class Builder<BuilderType extends Builder> implements MessageLite.Builder {
        public static UninitializedMessageException newUninitializedMessageException(MessageLite messageLite) {
            return new UninitializedMessageException(messageLite);
        }

        @Override // 
        /* JADX INFO: renamed from: clone */
        public abstract BuilderType mo5776clone();

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
        public abstract BuilderType mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException;

        public static final class a extends FilterInputStream {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public int f81365p0;

            public a(InputStream inputStream, int i10) {
                super(inputStream);
                this.f81365p0 = i10;
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public int available() throws IOException {
                return Math.min(super.available(), this.f81365p0);
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public int read() throws IOException {
                if (this.f81365p0 <= 0) {
                    return -1;
                }
                int i10 = super.read();
                if (i10 >= 0) {
                    this.f81365p0--;
                }
                return i10;
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public long skip(long j10) throws IOException {
                long jSkip = super.skip(Math.min(j10, this.f81365p0));
                if (jSkip >= 0) {
                    this.f81365p0 = (int) (((long) this.f81365p0) - jSkip);
                }
                return jSkip;
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public int read(byte[] bArr, int i10, int i11) throws IOException {
                int i12 = this.f81365p0;
                if (i12 <= 0) {
                    return -1;
                }
                int i13 = super.read(bArr, i10, Math.min(i11, i12));
                if (i13 >= 0) {
                    this.f81365p0 -= i13;
                }
                return i13;
            }
        }
    }
}
