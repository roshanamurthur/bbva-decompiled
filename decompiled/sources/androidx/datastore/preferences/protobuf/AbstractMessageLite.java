package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.AbstractMessageLite;
import androidx.datastore.preferences.protobuf.AbstractMessageLite.Builder;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractMessageLite<MessageType extends AbstractMessageLite<MessageType, BuilderType>, BuilderType extends Builder<MessageType, BuilderType>> implements MessageLite {
    protected int memoizedHashCode = 0;

    public static abstract class Builder<MessageType extends AbstractMessageLite<MessageType, BuilderType>, BuilderType extends Builder<MessageType, BuilderType>> implements MessageLite.Builder {
        @Deprecated
        public static <T> void addAll(Iterable<T> iterable, Collection<? super T> collection) {
            addAll((Iterable) iterable, (List) collection);
        }

        public static UninitializedMessageException newUninitializedMessageException(MessageLite messageLite) {
            return new UninitializedMessageException(messageLite);
        }

        public final String a(String str) {
            return "Reading " + getClass().getName() + " from a " + str + " threw an IOException (should never happen).";
        }

        @Override // 
        /* JADX INFO: renamed from: clone */
        public abstract BuilderType mo4640clone();

        public abstract BuilderType internalMergeFrom(MessageType messagetype);

        @Override // androidx.datastore.preferences.protobuf.MessageLite.Builder
        public boolean mergeDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            int i10 = inputStream.read();
            if (i10 == -1) {
                return false;
            }
            mergeFrom((InputStream) new a(inputStream, CodedInputStream.readRawVarint32(i10, inputStream)), extensionRegistryLite);
            return true;
        }

        @Override // androidx.datastore.preferences.protobuf.MessageLite.Builder
        public abstract BuilderType mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException;

        public static <T> void addAll(Iterable<T> iterable, List<? super T> list) {
            Charset charset = Internal.f20943a;
            iterable.getClass();
            if (iterable instanceof LazyStringList) {
                List<?> underlyingElements = ((LazyStringList) iterable).getUnderlyingElements();
                LazyStringList lazyStringList = (LazyStringList) list;
                int size = list.size();
                for (Object obj : underlyingElements) {
                    if (obj == null) {
                        String str = "Element at index " + (lazyStringList.size() - size) + " is null.";
                        for (int size2 = lazyStringList.size() - 1; size2 >= size; size2--) {
                            lazyStringList.remove(size2);
                        }
                        throw new NullPointerException(str);
                    }
                    if (obj instanceof ByteString) {
                        lazyStringList.add((ByteString) obj);
                    } else {
                        lazyStringList.add((String) obj);
                    }
                }
                return;
            }
            if (iterable instanceof i0) {
                list.addAll((Collection) iterable);
                return;
            }
            if ((list instanceof ArrayList) && (iterable instanceof Collection)) {
                ((ArrayList) list).ensureCapacity(((Collection) iterable).size() + list.size());
            }
            int size3 = list.size();
            for (T t10 : iterable) {
                if (t10 == null) {
                    String str2 = "Element at index " + (list.size() - size3) + " is null.";
                    for (int size4 = list.size() - 1; size4 >= size3; size4--) {
                        list.remove(size4);
                    }
                    throw new NullPointerException(str2);
                }
                list.add(t10);
            }
        }

        public static final class a extends FilterInputStream {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public int f20788p0;

            public a(InputStream inputStream, int i10) {
                super(inputStream);
                this.f20788p0 = i10;
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public final int available() throws IOException {
                return Math.min(super.available(), this.f20788p0);
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public final int read() throws IOException {
                if (this.f20788p0 <= 0) {
                    return -1;
                }
                int i10 = super.read();
                if (i10 >= 0) {
                    this.f20788p0--;
                }
                return i10;
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public final long skip(long j10) throws IOException {
                long jSkip = super.skip(Math.min(j10, this.f20788p0));
                if (jSkip >= 0) {
                    this.f20788p0 = (int) (((long) this.f20788p0) - jSkip);
                }
                return jSkip;
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public final int read(byte[] bArr, int i10, int i11) throws IOException {
                int i12 = this.f20788p0;
                if (i12 <= 0) {
                    return -1;
                }
                int i13 = super.read(bArr, i10, Math.min(i11, i12));
                if (i13 >= 0) {
                    this.f20788p0 -= i13;
                }
                return i13;
            }
        }

        @Override // androidx.datastore.preferences.protobuf.MessageLite.Builder
        public boolean mergeDelimitedFrom(InputStream inputStream) throws IOException {
            return mergeDelimitedFrom(inputStream, ExtensionRegistryLite.getEmptyRegistry());
        }

        @Override // androidx.datastore.preferences.protobuf.MessageLite.Builder
        public BuilderType mergeFrom(CodedInputStream codedInputStream) throws IOException {
            return (BuilderType) mergeFrom(codedInputStream, ExtensionRegistryLite.getEmptyRegistry());
        }

        @Override // androidx.datastore.preferences.protobuf.MessageLite.Builder
        public BuilderType mergeFrom(ByteString byteString) throws InvalidProtocolBufferException {
            try {
                CodedInputStream codedInputStreamNewCodedInput = byteString.newCodedInput();
                mergeFrom(codedInputStreamNewCodedInput);
                codedInputStreamNewCodedInput.checkLastTagWas(0);
                return this;
            } catch (InvalidProtocolBufferException e5) {
                throw e5;
            } catch (IOException e7) {
                throw new RuntimeException(a("ByteString"), e7);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.MessageLite.Builder
        public BuilderType mergeFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            try {
                CodedInputStream codedInputStreamNewCodedInput = byteString.newCodedInput();
                mergeFrom(codedInputStreamNewCodedInput, extensionRegistryLite);
                codedInputStreamNewCodedInput.checkLastTagWas(0);
                return this;
            } catch (InvalidProtocolBufferException e5) {
                throw e5;
            } catch (IOException e7) {
                throw new RuntimeException(a("ByteString"), e7);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.MessageLite.Builder
        public BuilderType mergeFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (BuilderType) mergeFrom(bArr, 0, bArr.length);
        }

        @Override // androidx.datastore.preferences.protobuf.MessageLite.Builder
        public BuilderType mergeFrom(byte[] bArr, int i10, int i11) throws InvalidProtocolBufferException {
            try {
                CodedInputStream codedInputStreamNewInstance = CodedInputStream.newInstance(bArr, i10, i11);
                mergeFrom(codedInputStreamNewInstance);
                codedInputStreamNewInstance.checkLastTagWas(0);
                return this;
            } catch (InvalidProtocolBufferException e5) {
                throw e5;
            } catch (IOException e7) {
                throw new RuntimeException(a("byte array"), e7);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.MessageLite.Builder
        public BuilderType mergeFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (BuilderType) mergeFrom(bArr, 0, bArr.length, extensionRegistryLite);
        }

        @Override // androidx.datastore.preferences.protobuf.MessageLite.Builder
        public BuilderType mergeFrom(byte[] bArr, int i10, int i11, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            try {
                CodedInputStream codedInputStreamNewInstance = CodedInputStream.newInstance(bArr, i10, i11);
                mergeFrom(codedInputStreamNewInstance, extensionRegistryLite);
                codedInputStreamNewInstance.checkLastTagWas(0);
                return this;
            } catch (InvalidProtocolBufferException e5) {
                throw e5;
            } catch (IOException e7) {
                throw new RuntimeException(a("byte array"), e7);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.MessageLite.Builder
        public BuilderType mergeFrom(InputStream inputStream) throws IOException {
            CodedInputStream codedInputStreamNewInstance = CodedInputStream.newInstance(inputStream);
            mergeFrom(codedInputStreamNewInstance);
            codedInputStreamNewInstance.checkLastTagWas(0);
            return this;
        }

        @Override // androidx.datastore.preferences.protobuf.MessageLite.Builder
        public BuilderType mergeFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            CodedInputStream codedInputStreamNewInstance = CodedInputStream.newInstance(inputStream);
            mergeFrom(codedInputStreamNewInstance, extensionRegistryLite);
            codedInputStreamNewInstance.checkLastTagWas(0);
            return this;
        }

        @Override // androidx.datastore.preferences.protobuf.MessageLite.Builder
        public BuilderType mergeFrom(MessageLite messageLite) {
            if (getDefaultInstanceForType().getClass().isInstance(messageLite)) {
                return (BuilderType) internalMergeFrom((AbstractMessageLite) messageLite);
            }
            throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
        }
    }

    public interface InternalOneOfEnum {
        int getNumber();
    }

    @Deprecated
    public static <T> void addAll(Iterable<T> iterable, Collection<? super T> collection) {
        Builder.addAll((Iterable) iterable, (List) collection);
    }

    public static void checkByteStringIsUtf8(ByteString byteString) throws IllegalArgumentException {
        if (!byteString.isValidUtf8()) {
            throw new IllegalArgumentException("Byte string is not UTF-8.");
        }
    }

    public int a() {
        throw new UnsupportedOperationException();
    }

    public final int b(o0 o0Var) {
        int iA = a();
        if (iA != -1) {
            return iA;
        }
        int iD = o0Var.d(this);
        d(iD);
        return iD;
    }

    public final String c(String str) {
        return "Serializing " + getClass().getName() + " to a " + str + " threw an IOException (should never happen).";
    }

    public void d(int i10) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.datastore.preferences.protobuf.MessageLite
    public byte[] toByteArray() {
        try {
            byte[] bArr = new byte[getSerializedSize()];
            CodedOutputStream codedOutputStreamNewInstance = CodedOutputStream.newInstance(bArr);
            writeTo(codedOutputStreamNewInstance);
            codedOutputStreamNewInstance.checkNoSpaceLeft();
            return bArr;
        } catch (IOException e5) {
            throw new RuntimeException(c("byte array"), e5);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.MessageLite
    public ByteString toByteString() {
        try {
            int serializedSize = getSerializedSize();
            ByteString byteString = ByteString.EMPTY;
            byte[] bArr = new byte[serializedSize];
            CodedOutputStream codedOutputStreamNewInstance = CodedOutputStream.newInstance(bArr);
            writeTo(codedOutputStreamNewInstance);
            codedOutputStreamNewInstance.checkNoSpaceLeft();
            return new ByteString.h(bArr);
        } catch (IOException e5) {
            throw new RuntimeException(c("ByteString"), e5);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.MessageLite
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

    @Override // androidx.datastore.preferences.protobuf.MessageLite
    public void writeTo(OutputStream outputStream) throws IOException {
        int serializedSize = getSerializedSize();
        Logger logger = CodedOutputStream.f20852c;
        if (serializedSize > 4096) {
            serializedSize = 4096;
        }
        CodedOutputStream codedOutputStreamNewInstance = CodedOutputStream.newInstance(outputStream, serializedSize);
        writeTo(codedOutputStreamNewInstance);
        codedOutputStreamNewInstance.flush();
    }

    public static <T> void addAll(Iterable<T> iterable, List<? super T> list) {
        Builder.addAll((Iterable) iterable, (List) list);
    }
}
