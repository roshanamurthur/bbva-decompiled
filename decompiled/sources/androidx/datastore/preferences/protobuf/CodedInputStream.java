package androidx.datastore.preferences.protobuf;

import com.bbva.tohu.android.product.valkyria.sdk.payments.paywave.Constants;
import com.vierge.pinpadsdk.message.base.MessageUtils;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public abstract class CodedInputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f20809a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f20810b = 100;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f20811c = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public g f20812d;

    public static a a(byte[] bArr, int i10, int i11, boolean z10) {
        a aVar = new a(bArr, i10, i11, z10);
        try {
            aVar.pushLimit(i11);
            return aVar;
        } catch (InvalidProtocolBufferException e5) {
            throw new IllegalArgumentException(e5);
        }
    }

    public static CodedInputStream b(ByteBuffer byteBuffer, boolean z10) {
        if (byteBuffer.hasArray()) {
            return a(byteBuffer.array(), byteBuffer.position() + byteBuffer.arrayOffset(), byteBuffer.remaining(), z10);
        }
        if (byteBuffer.isDirect() && v0.f21152e) {
            return new d(byteBuffer, z10);
        }
        int iRemaining = byteBuffer.remaining();
        byte[] bArr = new byte[iRemaining];
        byteBuffer.duplicate().get(bArr);
        return a(bArr, 0, iRemaining, true);
    }

    public static int decodeZigZag32(int i10) {
        return (-(i10 & 1)) ^ (i10 >>> 1);
    }

    public static long decodeZigZag64(long j10) {
        return (-(j10 & 1)) ^ (j10 >>> 1);
    }

    public static CodedInputStream newInstance(InputStream inputStream) {
        return newInstance(inputStream, 4096);
    }

    public static int readRawVarint32(int i10, InputStream inputStream) throws IOException {
        if ((i10 & 128) == 0) {
            return i10;
        }
        int i11 = i10 & 127;
        int i12 = 7;
        while (i12 < 32) {
            int i13 = inputStream.read();
            if (i13 == -1) {
                throw InvalidProtocolBufferException.i();
            }
            i11 |= (i13 & 127) << i12;
            if ((i13 & 128) == 0) {
                return i11;
            }
            i12 += 7;
        }
        while (i12 < 64) {
            int i14 = inputStream.read();
            if (i14 == -1) {
                throw InvalidProtocolBufferException.i();
            }
            if ((i14 & 128) == 0) {
                return i11;
            }
            i12 += 7;
        }
        throw InvalidProtocolBufferException.e();
    }

    public abstract void checkLastTagWas(int i10) throws InvalidProtocolBufferException;

    public abstract void enableAliasing(boolean z10);

    public abstract int getBytesUntilLimit();

    public abstract int getLastTag();

    public abstract int getTotalBytesRead();

    public abstract boolean isAtEnd() throws IOException;

    public abstract void popLimit(int i10);

    public abstract int pushLimit(int i10) throws InvalidProtocolBufferException;

    public abstract boolean readBool() throws IOException;

    public abstract byte[] readByteArray() throws IOException;

    public abstract ByteBuffer readByteBuffer() throws IOException;

    public abstract ByteString readBytes() throws IOException;

    public abstract double readDouble() throws IOException;

    public abstract int readEnum() throws IOException;

    public abstract int readFixed32() throws IOException;

    public abstract long readFixed64() throws IOException;

    public abstract float readFloat() throws IOException;

    public abstract <T extends MessageLite> T readGroup(int i10, Parser<T> parser, ExtensionRegistryLite extensionRegistryLite) throws IOException;

    public abstract void readGroup(int i10, MessageLite.Builder builder, ExtensionRegistryLite extensionRegistryLite) throws IOException;

    public abstract int readInt32() throws IOException;

    public abstract long readInt64() throws IOException;

    public abstract <T extends MessageLite> T readMessage(Parser<T> parser, ExtensionRegistryLite extensionRegistryLite) throws IOException;

    public abstract void readMessage(MessageLite.Builder builder, ExtensionRegistryLite extensionRegistryLite) throws IOException;

    public abstract byte readRawByte() throws IOException;

    public abstract byte[] readRawBytes(int i10) throws IOException;

    public abstract int readRawLittleEndian32() throws IOException;

    public abstract long readRawLittleEndian64() throws IOException;

    public abstract int readRawVarint32() throws IOException;

    public abstract long readRawVarint64() throws IOException;

    public abstract int readSFixed32() throws IOException;

    public abstract long readSFixed64() throws IOException;

    public abstract int readSInt32() throws IOException;

    public abstract long readSInt64() throws IOException;

    public abstract String readString() throws IOException;

    public abstract String readStringRequireUtf8() throws IOException;

    public abstract int readTag() throws IOException;

    public abstract int readUInt32() throws IOException;

    public abstract long readUInt64() throws IOException;

    @Deprecated
    public abstract void readUnknownGroup(int i10, MessageLite.Builder builder) throws IOException;

    public abstract void resetSizeCounter();

    public final int setRecursionLimit(int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException(androidx.appcompat.widget.g0.c("Recursion limit cannot be negative: ", i10));
        }
        int i11 = this.f20810b;
        this.f20810b = i10;
        return i11;
    }

    public final int setSizeLimit(int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException(androidx.appcompat.widget.g0.c("Size limit cannot be negative: ", i10));
        }
        int i11 = this.f20811c;
        this.f20811c = i10;
        return i11;
    }

    public abstract boolean skipField(int i10) throws IOException;

    @Deprecated
    public abstract boolean skipField(int i10, CodedOutputStream codedOutputStream) throws IOException;

    public abstract void skipMessage() throws IOException;

    public abstract void skipMessage(CodedOutputStream codedOutputStream) throws IOException;

    public abstract void skipRawBytes(int i10) throws IOException;

    public static final class a extends CodedInputStream {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final byte[] f20813e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final boolean f20814f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f20815g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f20816h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f20817i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f20818j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public int f20819k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public boolean f20820l;
        public int m = Integer.MAX_VALUE;

        public a(byte[] bArr, int i10, int i11, boolean z10) {
            this.f20813e = bArr;
            this.f20815g = i11 + i10;
            this.f20817i = i10;
            this.f20818j = i10;
            this.f20814f = z10;
        }

        public final long c() throws IOException {
            long j10 = 0;
            for (int i10 = 0; i10 < 64; i10 += 7) {
                byte rawByte = readRawByte();
                j10 |= ((long) (rawByte & 127)) << i10;
                if ((rawByte & 128) == 0) {
                    return j10;
                }
            }
            throw InvalidProtocolBufferException.e();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public final void checkLastTagWas(int i10) throws InvalidProtocolBufferException {
            if (this.f20819k != i10) {
                throw InvalidProtocolBufferException.a();
            }
        }

        public final void d() {
            int i10 = this.f20815g + this.f20816h;
            this.f20815g = i10;
            int i11 = i10 - this.f20818j;
            int i12 = this.m;
            if (i11 <= i12) {
                this.f20816h = 0;
                return;
            }
            int i13 = i11 - i12;
            this.f20816h = i13;
            this.f20815g = i10 - i13;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public final void enableAliasing(boolean z10) {
            this.f20820l = z10;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public final int getBytesUntilLimit() {
            int i10 = this.m;
            if (i10 == Integer.MAX_VALUE) {
                return -1;
            }
            return i10 - getTotalBytesRead();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public final int getLastTag() {
            return this.f20819k;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public final int getTotalBytesRead() {
            return this.f20817i - this.f20818j;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public final boolean isAtEnd() throws IOException {
            return this.f20817i == this.f20815g;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public final void popLimit(int i10) {
            this.m = i10;
            d();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public final int pushLimit(int i10) throws InvalidProtocolBufferException {
            if (i10 < 0) {
                throw InvalidProtocolBufferException.f();
            }
            int totalBytesRead = getTotalBytesRead() + i10;
            int i11 = this.m;
            if (totalBytesRead > i11) {
                throw InvalidProtocolBufferException.i();
            }
            this.m = totalBytesRead;
            d();
            return i11;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public final boolean readBool() throws IOException {
            return readRawVarint64() != 0;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public final byte[] readByteArray() throws IOException {
            return readRawBytes(readRawVarint32());
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public final ByteBuffer readByteBuffer() throws IOException {
            int rawVarint32 = readRawVarint32();
            if (rawVarint32 > 0) {
                int i10 = this.f20815g;
                int i11 = this.f20817i;
                if (rawVarint32 <= i10 - i11) {
                    boolean z10 = this.f20814f;
                    byte[] bArr = this.f20813e;
                    ByteBuffer byteBufferWrap = (z10 || !this.f20820l) ? ByteBuffer.wrap(Arrays.copyOfRange(bArr, i11, i11 + rawVarint32)) : ByteBuffer.wrap(bArr, i11, rawVarint32).slice();
                    this.f20817i += rawVarint32;
                    return byteBufferWrap;
                }
            }
            if (rawVarint32 == 0) {
                return Internal.EMPTY_BYTE_BUFFER;
            }
            if (rawVarint32 < 0) {
                throw InvalidProtocolBufferException.f();
            }
            throw InvalidProtocolBufferException.i();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public final ByteString readBytes() throws IOException {
            ByteString byteStringCopyFrom;
            int rawVarint32 = readRawVarint32();
            if (rawVarint32 > 0) {
                int i10 = this.f20815g;
                int i11 = this.f20817i;
                if (rawVarint32 <= i10 - i11) {
                    boolean z10 = this.f20814f;
                    byte[] bArr = this.f20813e;
                    if (z10 && this.f20820l) {
                        ByteString byteString = ByteString.EMPTY;
                        byteStringCopyFrom = new ByteString.e(bArr, i11, rawVarint32);
                    } else {
                        byteStringCopyFrom = ByteString.copyFrom(bArr, i11, rawVarint32);
                    }
                    this.f20817i += rawVarint32;
                    return byteStringCopyFrom;
                }
            }
            if (rawVarint32 == 0) {
                return ByteString.EMPTY;
            }
            byte[] rawBytes = readRawBytes(rawVarint32);
            ByteString byteString2 = ByteString.EMPTY;
            return new ByteString.h(rawBytes);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public final double readDouble() throws IOException {
            return Double.longBitsToDouble(readRawLittleEndian64());
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public final int readEnum() throws IOException {
            return readRawVarint32();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public final int readFixed32() throws IOException {
            return readRawLittleEndian32();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public final long readFixed64() throws IOException {
            return readRawLittleEndian64();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public final float readFloat() throws IOException {
            return Float.intBitsToFloat(readRawLittleEndian32());
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public final void readGroup(int i10, MessageLite.Builder builder, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            int i11 = this.f20809a;
            if (i11 >= this.f20810b) {
                throw InvalidProtocolBufferException.h();
            }
            this.f20809a = i11 + 1;
            builder.mergeFrom(this, extensionRegistryLite);
            checkLastTagWas((i10 << 3) | 4);
            this.f20809a--;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public final int readInt32() throws IOException {
            return readRawVarint32();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public final long readInt64() throws IOException {
            return readRawVarint64();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public final void readMessage(MessageLite.Builder builder, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            int rawVarint32 = readRawVarint32();
            if (this.f20809a >= this.f20810b) {
                throw InvalidProtocolBufferException.h();
            }
            int iPushLimit = pushLimit(rawVarint32);
            this.f20809a++;
            builder.mergeFrom(this, extensionRegistryLite);
            checkLastTagWas(0);
            this.f20809a--;
            popLimit(iPushLimit);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public final byte readRawByte() throws IOException {
            int i10 = this.f20817i;
            if (i10 == this.f20815g) {
                throw InvalidProtocolBufferException.i();
            }
            this.f20817i = i10 + 1;
            return this.f20813e[i10];
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public final byte[] readRawBytes(int i10) throws IOException {
            if (i10 > 0) {
                int i11 = this.f20815g;
                int i12 = this.f20817i;
                if (i10 <= i11 - i12) {
                    int i13 = i10 + i12;
                    this.f20817i = i13;
                    return Arrays.copyOfRange(this.f20813e, i12, i13);
                }
            }
            if (i10 > 0) {
                throw InvalidProtocolBufferException.i();
            }
            if (i10 == 0) {
                return Internal.EMPTY_BYTE_ARRAY;
            }
            throw InvalidProtocolBufferException.f();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public final int readRawLittleEndian32() throws IOException {
            int i10 = this.f20817i;
            if (this.f20815g - i10 < 4) {
                throw InvalidProtocolBufferException.i();
            }
            this.f20817i = i10 + 4;
            byte[] bArr = this.f20813e;
            return ((bArr[i10 + 3] & 255) << 24) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public final long readRawLittleEndian64() throws IOException {
            int i10 = this.f20817i;
            if (this.f20815g - i10 < 8) {
                throw InvalidProtocolBufferException.i();
            }
            this.f20817i = i10 + 8;
            byte[] bArr = this.f20813e;
            return ((((long) bArr[i10 + 7]) & 255) << 56) | (((long) bArr[i10]) & 255) | ((((long) bArr[i10 + 1]) & 255) << 8) | ((((long) bArr[i10 + 2]) & 255) << 16) | ((((long) bArr[i10 + 3]) & 255) << 24) | ((((long) bArr[i10 + 4]) & 255) << 32) | ((((long) bArr[i10 + 5]) & 255) << 40) | ((((long) bArr[i10 + 6]) & 255) << 48);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public final int readRawVarint32() throws IOException {
            int i10;
            int i11 = this.f20817i;
            int i12 = this.f20815g;
            if (i12 != i11) {
                int i13 = i11 + 1;
                byte[] bArr = this.f20813e;
                byte b10 = bArr[i11];
                if (b10 >= 0) {
                    this.f20817i = i13;
                    return b10;
                }
                if (i12 - i13 >= 9) {
                    int i14 = i11 + 2;
                    int i15 = (bArr[i13] << 7) ^ b10;
                    if (i15 < 0) {
                        i10 = i15 ^ (-128);
                    } else {
                        int i16 = i11 + 3;
                        int i17 = (bArr[i14] << Constants.CVR_B1b41_1110_ONLINE_PIN) ^ i15;
                        if (i17 >= 0) {
                            i10 = i17 ^ 16256;
                        } else {
                            int i18 = i11 + 4;
                            int i19 = i17 ^ (bArr[i16] << MessageUtils.MESSAGE_21_NAK);
                            if (i19 < 0) {
                                i10 = (-2080896) ^ i19;
                            } else {
                                i16 = i11 + 5;
                                byte b11 = bArr[i18];
                                int i20 = (i19 ^ (b11 << 28)) ^ 266354560;
                                if (b11 < 0) {
                                    i18 = i11 + 6;
                                    if (bArr[i16] < 0) {
                                        i16 = i11 + 7;
                                        if (bArr[i18] < 0) {
                                            i18 = i11 + 8;
                                            if (bArr[i16] < 0) {
                                                i16 = i11 + 9;
                                                if (bArr[i18] < 0) {
                                                    int i21 = i11 + 10;
                                                    if (bArr[i16] >= 0) {
                                                        i14 = i21;
                                                        i10 = i20;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    i10 = i20;
                                }
                                i10 = i20;
                            }
                            i14 = i18;
                        }
                        i14 = i16;
                    }
                    this.f20817i = i14;
                    return i10;
                }
            }
            return (int) c();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public final long readRawVarint64() throws IOException {
            long j10;
            long j11;
            long j12;
            long j13;
            int i10 = this.f20817i;
            int i11 = this.f20815g;
            if (i11 != i10) {
                int i12 = i10 + 1;
                byte[] bArr = this.f20813e;
                byte b10 = bArr[i10];
                if (b10 >= 0) {
                    this.f20817i = i12;
                    return b10;
                }
                if (i11 - i12 >= 9) {
                    int i13 = i10 + 2;
                    int i14 = (bArr[i12] << 7) ^ b10;
                    if (i14 < 0) {
                        j10 = i14 ^ (-128);
                    } else {
                        int i15 = i10 + 3;
                        int i16 = (bArr[i13] << Constants.CVR_B1b41_1110_ONLINE_PIN) ^ i14;
                        if (i16 >= 0) {
                            j10 = i16 ^ 16256;
                            i13 = i15;
                        } else {
                            int i17 = i10 + 4;
                            int i18 = i16 ^ (bArr[i15] << MessageUtils.MESSAGE_21_NAK);
                            if (i18 < 0) {
                                j13 = (-2080896) ^ i18;
                            } else {
                                long j14 = i18;
                                i13 = i10 + 5;
                                long j15 = j14 ^ (((long) bArr[i17]) << 28);
                                if (j15 >= 0) {
                                    j12 = 266354560;
                                } else {
                                    i17 = i10 + 6;
                                    long j16 = j15 ^ (((long) bArr[i13]) << 35);
                                    if (j16 < 0) {
                                        j11 = -34093383808L;
                                    } else {
                                        i13 = i10 + 7;
                                        j15 = j16 ^ (((long) bArr[i17]) << 42);
                                        if (j15 >= 0) {
                                            j12 = 4363953127296L;
                                        } else {
                                            i17 = i10 + 8;
                                            j16 = j15 ^ (((long) bArr[i13]) << 49);
                                            if (j16 < 0) {
                                                j11 = -558586000294016L;
                                            } else {
                                                i13 = i10 + 9;
                                                long j17 = (j16 ^ (((long) bArr[i17]) << 56)) ^ 71499008037633920L;
                                                if (j17 < 0) {
                                                    int i19 = i10 + 10;
                                                    if (bArr[i13] >= 0) {
                                                        i13 = i19;
                                                    }
                                                }
                                                j10 = j17;
                                            }
                                        }
                                    }
                                    j13 = j11 ^ j16;
                                }
                                j10 = j12 ^ j15;
                            }
                            i13 = i17;
                            j10 = j13;
                        }
                    }
                    this.f20817i = i13;
                    return j10;
                }
            }
            return c();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public final int readSFixed32() throws IOException {
            return readRawLittleEndian32();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public final long readSFixed64() throws IOException {
            return readRawLittleEndian64();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public final int readSInt32() throws IOException {
            return CodedInputStream.decodeZigZag32(readRawVarint32());
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public final long readSInt64() throws IOException {
            return CodedInputStream.decodeZigZag64(readRawVarint64());
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public final String readString() throws IOException {
            int rawVarint32 = readRawVarint32();
            if (rawVarint32 > 0) {
                int i10 = this.f20815g;
                int i11 = this.f20817i;
                if (rawVarint32 <= i10 - i11) {
                    String str = new String(this.f20813e, i11, rawVarint32, Internal.f20943a);
                    this.f20817i += rawVarint32;
                    return str;
                }
            }
            if (rawVarint32 == 0) {
                return "";
            }
            if (rawVarint32 < 0) {
                throw InvalidProtocolBufferException.f();
            }
            throw InvalidProtocolBufferException.i();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public final String readStringRequireUtf8() throws IOException {
            int rawVarint32 = readRawVarint32();
            if (rawVarint32 > 0) {
                int i10 = this.f20815g;
                int i11 = this.f20817i;
                if (rawVarint32 <= i10 - i11) {
                    String strA = w0.f21158a.a(i11, rawVarint32, this.f20813e);
                    this.f20817i += rawVarint32;
                    return strA;
                }
            }
            if (rawVarint32 == 0) {
                return "";
            }
            if (rawVarint32 <= 0) {
                throw InvalidProtocolBufferException.f();
            }
            throw InvalidProtocolBufferException.i();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public final int readTag() throws IOException {
            if (isAtEnd()) {
                this.f20819k = 0;
                return 0;
            }
            int rawVarint32 = readRawVarint32();
            this.f20819k = rawVarint32;
            if (WireFormat.getTagFieldNumber(rawVarint32) != 0) {
                return this.f20819k;
            }
            throw InvalidProtocolBufferException.b();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public final int readUInt32() throws IOException {
            return readRawVarint32();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public final long readUInt64() throws IOException {
            return readRawVarint64();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        @Deprecated
        public final void readUnknownGroup(int i10, MessageLite.Builder builder) throws IOException {
            readGroup(i10, builder, ExtensionRegistryLite.getEmptyRegistry());
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public final void resetSizeCounter() {
            this.f20818j = this.f20817i;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public final boolean skipField(int i10) throws IOException {
            int tagWireType = WireFormat.getTagWireType(i10);
            int i11 = 0;
            if (tagWireType == 0) {
                if (this.f20815g - this.f20817i < 10) {
                    while (i11 < 10) {
                        if (readRawByte() < 0) {
                            i11++;
                        }
                    }
                    throw InvalidProtocolBufferException.e();
                }
                while (i11 < 10) {
                    int i12 = this.f20817i;
                    this.f20817i = i12 + 1;
                    if (this.f20813e[i12] < 0) {
                        i11++;
                    }
                }
                throw InvalidProtocolBufferException.e();
                return true;
            }
            if (tagWireType == 1) {
                skipRawBytes(8);
                return true;
            }
            if (tagWireType == 2) {
                skipRawBytes(readRawVarint32());
                return true;
            }
            if (tagWireType == 3) {
                skipMessage();
                checkLastTagWas((WireFormat.getTagFieldNumber(i10) << 3) | 4);
                return true;
            }
            if (tagWireType == 4) {
                return false;
            }
            if (tagWireType != 5) {
                throw InvalidProtocolBufferException.d();
            }
            skipRawBytes(4);
            return true;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public final void skipMessage() throws IOException {
            int tag;
            do {
                tag = readTag();
                if (tag == 0) {
                    return;
                }
            } while (skipField(tag));
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public final void skipRawBytes(int i10) throws IOException {
            if (i10 >= 0) {
                int i11 = this.f20815g;
                int i12 = this.f20817i;
                if (i10 <= i11 - i12) {
                    this.f20817i = i12 + i10;
                    return;
                }
            }
            if (i10 >= 0) {
                throw InvalidProtocolBufferException.i();
            }
            throw InvalidProtocolBufferException.f();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public final void skipMessage(CodedOutputStream codedOutputStream) throws IOException {
            int tag;
            do {
                tag = readTag();
                if (tag == 0) {
                    return;
                }
            } while (skipField(tag, codedOutputStream));
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public final <T extends MessageLite> T readGroup(int i10, Parser<T> parser, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            int i11 = this.f20809a;
            if (i11 < this.f20810b) {
                this.f20809a = i11 + 1;
                T partialFrom = parser.parsePartialFrom(this, extensionRegistryLite);
                checkLastTagWas((i10 << 3) | 4);
                this.f20809a--;
                return partialFrom;
            }
            throw InvalidProtocolBufferException.h();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public final <T extends MessageLite> T readMessage(Parser<T> parser, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            int rawVarint32 = readRawVarint32();
            if (this.f20809a < this.f20810b) {
                int iPushLimit = pushLimit(rawVarint32);
                this.f20809a++;
                T partialFrom = parser.parsePartialFrom(this, extensionRegistryLite);
                checkLastTagWas(0);
                this.f20809a--;
                popLimit(iPushLimit);
                return partialFrom;
            }
            throw InvalidProtocolBufferException.h();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public final boolean skipField(int i10, CodedOutputStream codedOutputStream) throws IOException {
            int tagWireType = WireFormat.getTagWireType(i10);
            if (tagWireType == 0) {
                long rawVarint64 = readRawVarint64();
                codedOutputStream.writeRawVarint32(i10);
                codedOutputStream.writeUInt64NoTag(rawVarint64);
                return true;
            }
            if (tagWireType == 1) {
                long rawLittleEndian64 = readRawLittleEndian64();
                codedOutputStream.writeRawVarint32(i10);
                codedOutputStream.writeFixed64NoTag(rawLittleEndian64);
                return true;
            }
            if (tagWireType == 2) {
                ByteString bytes = readBytes();
                codedOutputStream.writeRawVarint32(i10);
                codedOutputStream.writeBytesNoTag(bytes);
                return true;
            }
            if (tagWireType == 3) {
                codedOutputStream.writeRawVarint32(i10);
                skipMessage(codedOutputStream);
                int tagFieldNumber = (WireFormat.getTagFieldNumber(i10) << 3) | 4;
                checkLastTagWas(tagFieldNumber);
                codedOutputStream.writeRawVarint32(tagFieldNumber);
                return true;
            }
            if (tagWireType == 4) {
                return false;
            }
            if (tagWireType == 5) {
                int rawLittleEndian32 = readRawLittleEndian32();
                codedOutputStream.writeRawVarint32(i10);
                codedOutputStream.writeFixed32NoTag(rawLittleEndian32);
                return true;
            }
            throw InvalidProtocolBufferException.d();
        }
    }

    public static final class b extends CodedInputStream {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Iterable<ByteBuffer> f20821e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public Iterator<ByteBuffer> f20822f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public ByteBuffer f20823g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public boolean f20824h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public boolean f20825i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f20826j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public int f20827k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public int f20828l;
        public int m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public int f20829n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public int f20830o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public long f20831p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public long f20832q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public long f20833r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public long f20834s;

        public final long c() {
            return this.f20834s - this.f20831p;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public final void checkLastTagWas(int i10) throws InvalidProtocolBufferException {
            if (this.m != i10) {
                throw InvalidProtocolBufferException.a();
            }
        }

        public final void d(int i10, byte[] bArr) throws IOException {
            if (i10 < 0 || i10 > g()) {
                if (i10 > 0) {
                    throw InvalidProtocolBufferException.i();
                }
                if (i10 != 0) {
                    throw InvalidProtocolBufferException.f();
                }
                return;
            }
            int i11 = i10;
            while (i11 > 0) {
                if (c() == 0) {
                    if (!this.f20822f.hasNext()) {
                        throw InvalidProtocolBufferException.i();
                    }
                    i();
                }
                int iMin = Math.min(i11, (int) c());
                long j10 = iMin;
                v0.f(this.f20831p, bArr, i10 - i11, j10);
                i11 -= iMin;
                this.f20831p += j10;
            }
        }

        public final long e() throws IOException {
            long j10 = 0;
            for (int i10 = 0; i10 < 64; i10 += 7) {
                byte rawByte = readRawByte();
                j10 |= ((long) (rawByte & 127)) << i10;
                if ((rawByte & 128) == 0) {
                    return j10;
                }
            }
            throw InvalidProtocolBufferException.e();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public final void enableAliasing(boolean z10) {
            this.f20825i = z10;
        }

        public final void f() {
            int i10 = this.f20826j + this.f20827k;
            this.f20826j = i10;
            int i11 = i10 - this.f20830o;
            int i12 = this.f20828l;
            if (i11 <= i12) {
                this.f20827k = 0;
                return;
            }
            int i13 = i11 - i12;
            this.f20827k = i13;
            this.f20826j = i10 - i13;
        }

        public final int g() {
            return (int) ((((long) (this.f20826j - this.f20829n)) - this.f20831p) + this.f20832q);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public final int getBytesUntilLimit() {
            int i10 = this.f20828l;
            if (i10 == Integer.MAX_VALUE) {
                return -1;
            }
            return i10 - getTotalBytesRead();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public final int getLastTag() {
            return this.m;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public final int getTotalBytesRead() {
            return (int) ((((long) (this.f20829n - this.f20830o)) + this.f20831p) - this.f20832q);
        }

        public final ByteBuffer h(int i10, int i11) throws IOException {
            int iPosition = this.f20823g.position();
            int iLimit = this.f20823g.limit();
            try {
                try {
                    this.f20823g.position(i10);
                    this.f20823g.limit(i11);
                    ByteBuffer byteBufferSlice = this.f20823g.slice();
                    this.f20823g.position(iPosition);
                    this.f20823g.limit(iLimit);
                    return byteBufferSlice;
                } catch (IllegalArgumentException unused) {
                    throw InvalidProtocolBufferException.i();
                }
            } catch (Throwable th2) {
                this.f20823g.position(iPosition);
                this.f20823g.limit(iLimit);
                throw th2;
            }
        }

        public final void i() {
            ByteBuffer next = this.f20822f.next();
            this.f20823g = next;
            this.f20829n += (int) (this.f20831p - this.f20832q);
            long jPosition = next.position();
            this.f20831p = jPosition;
            this.f20832q = jPosition;
            this.f20834s = this.f20823g.limit();
            long jA = v0.a(this.f20823g);
            this.f20833r = jA;
            this.f20831p += jA;
            this.f20832q += jA;
            this.f20834s += jA;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public final boolean isAtEnd() throws IOException {
            return (((long) this.f20829n) + this.f20831p) - this.f20832q == ((long) this.f20826j);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public final void popLimit(int i10) {
            this.f20828l = i10;
            f();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public final int pushLimit(int i10) throws InvalidProtocolBufferException {
            if (i10 < 0) {
                throw InvalidProtocolBufferException.f();
            }
            int totalBytesRead = getTotalBytesRead() + i10;
            int i11 = this.f20828l;
            if (totalBytesRead > i11) {
                throw InvalidProtocolBufferException.i();
            }
            this.f20828l = totalBytesRead;
            f();
            return i11;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public final boolean readBool() throws IOException {
            return readRawVarint64() != 0;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public final byte[] readByteArray() throws IOException {
            return readRawBytes(readRawVarint32());
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public final ByteBuffer readByteBuffer() throws IOException {
            int rawVarint32 = readRawVarint32();
            if (rawVarint32 > 0) {
                long j10 = rawVarint32;
                if (j10 <= c()) {
                    if (this.f20824h || !this.f20825i) {
                        byte[] bArr = new byte[rawVarint32];
                        v0.f(this.f20831p, bArr, 0L, j10);
                        this.f20831p += j10;
                        return ByteBuffer.wrap(bArr);
                    }
                    long j11 = this.f20831p + j10;
                    this.f20831p = j11;
                    long j12 = j11 - this.f20833r;
                    return h((int) (j12 - j10), (int) j12);
                }
            }
            if (rawVarint32 > 0 && rawVarint32 <= g()) {
                byte[] bArr2 = new byte[rawVarint32];
                d(rawVarint32, bArr2);
                return ByteBuffer.wrap(bArr2);
            }
            if (rawVarint32 == 0) {
                return Internal.EMPTY_BYTE_BUFFER;
            }
            if (rawVarint32 < 0) {
                throw InvalidProtocolBufferException.f();
            }
            throw InvalidProtocolBufferException.i();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public final ByteString readBytes() throws IOException {
            int rawVarint32 = readRawVarint32();
            if (rawVarint32 > 0) {
                long j10 = rawVarint32;
                long j11 = this.f20834s;
                long j12 = this.f20831p;
                if (j10 <= j11 - j12) {
                    if (this.f20824h && this.f20825i) {
                        int i10 = (int) (j12 - this.f20833r);
                        ByteString.g gVarE = ByteString.e(h(i10, rawVarint32 + i10));
                        this.f20831p += j10;
                        return gVarE;
                    }
                    byte[] bArr = new byte[rawVarint32];
                    v0.f(j12, bArr, 0L, j10);
                    this.f20831p += j10;
                    ByteString byteString = ByteString.EMPTY;
                    return new ByteString.h(bArr);
                }
            }
            if (rawVarint32 > 0 && rawVarint32 <= g()) {
                byte[] bArr2 = new byte[rawVarint32];
                d(rawVarint32, bArr2);
                ByteString byteString2 = ByteString.EMPTY;
                return new ByteString.h(bArr2);
            }
            if (rawVarint32 == 0) {
                return ByteString.EMPTY;
            }
            if (rawVarint32 < 0) {
                throw InvalidProtocolBufferException.f();
            }
            throw InvalidProtocolBufferException.i();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public final double readDouble() throws IOException {
            return Double.longBitsToDouble(readRawLittleEndian64());
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public final int readEnum() throws IOException {
            return readRawVarint32();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public final int readFixed32() throws IOException {
            return readRawLittleEndian32();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public final long readFixed64() throws IOException {
            return readRawLittleEndian64();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public final float readFloat() throws IOException {
            return Float.intBitsToFloat(readRawLittleEndian32());
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public final void readGroup(int i10, MessageLite.Builder builder, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            int i11 = this.f20809a;
            if (i11 >= this.f20810b) {
                throw InvalidProtocolBufferException.h();
            }
            this.f20809a = i11 + 1;
            builder.mergeFrom(this, extensionRegistryLite);
            checkLastTagWas((i10 << 3) | 4);
            this.f20809a--;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public final int readInt32() throws IOException {
            return readRawVarint32();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public final long readInt64() throws IOException {
            return readRawVarint64();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public final void readMessage(MessageLite.Builder builder, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            int rawVarint32 = readRawVarint32();
            if (this.f20809a >= this.f20810b) {
                throw InvalidProtocolBufferException.h();
            }
            int iPushLimit = pushLimit(rawVarint32);
            this.f20809a++;
            builder.mergeFrom(this, extensionRegistryLite);
            checkLastTagWas(0);
            this.f20809a--;
            popLimit(iPushLimit);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public final byte readRawByte() throws IOException {
            if (c() == 0) {
                if (!this.f20822f.hasNext()) {
                    throw InvalidProtocolBufferException.i();
                }
                i();
            }
            long j10 = this.f20831p;
            this.f20831p = 1 + j10;
            return v0.f21151d.f(j10);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public final byte[] readRawBytes(int i10) throws IOException {
            if (i10 >= 0) {
                long j10 = i10;
                if (j10 <= c()) {
                    byte[] bArr = new byte[i10];
                    v0.f(this.f20831p, bArr, 0L, j10);
                    this.f20831p += j10;
                    return bArr;
                }
            }
            if (i10 >= 0 && i10 <= g()) {
                byte[] bArr2 = new byte[i10];
                d(i10, bArr2);
                return bArr2;
            }
            if (i10 > 0) {
                throw InvalidProtocolBufferException.i();
            }
            if (i10 == 0) {
                return Internal.EMPTY_BYTE_ARRAY;
            }
            throw InvalidProtocolBufferException.f();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public final int readRawLittleEndian32() throws IOException {
            if (c() < 4) {
                return (readRawByte() & 255) | ((readRawByte() & 255) << 8) | ((readRawByte() & 255) << 16) | ((readRawByte() & 255) << 24);
            }
            long j10 = this.f20831p;
            this.f20831p = 4 + j10;
            v0.e eVar = v0.f21151d;
            return ((eVar.f(j10 + 3) & 255) << 24) | (eVar.f(j10) & 255) | ((eVar.f(1 + j10) & 255) << 8) | ((eVar.f(2 + j10) & 255) << 16);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public final long readRawLittleEndian64() throws IOException {
            long rawByte;
            byte rawByte2;
            if (c() >= 8) {
                long j10 = this.f20831p;
                this.f20831p = 8 + j10;
                v0.e eVar = v0.f21151d;
                rawByte = (((long) eVar.f(j10)) & 255) | ((((long) eVar.f(j10 + 1)) & 255) << 8) | ((((long) eVar.f(2 + j10)) & 255) << 16) | ((((long) eVar.f(3 + j10)) & 255) << 24) | ((((long) eVar.f(4 + j10)) & 255) << 32) | ((((long) eVar.f(5 + j10)) & 255) << 40) | ((((long) eVar.f(6 + j10)) & 255) << 48);
                rawByte2 = eVar.f(j10 + 7);
            } else {
                rawByte = (((long) readRawByte()) & 255) | ((((long) readRawByte()) & 255) << 8) | ((((long) readRawByte()) & 255) << 16) | ((((long) readRawByte()) & 255) << 24) | ((((long) readRawByte()) & 255) << 32) | ((((long) readRawByte()) & 255) << 40) | ((((long) readRawByte()) & 255) << 48);
                rawByte2 = readRawByte();
            }
            return ((((long) rawByte2) & 255) << 56) | rawByte;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public final int readRawVarint32() throws IOException {
            int i10;
            long j10 = this.f20831p;
            if (this.f20834s != j10) {
                long j11 = j10 + 1;
                v0.e eVar = v0.f21151d;
                byte bF = eVar.f(j10);
                if (bF >= 0) {
                    this.f20831p++;
                    return bF;
                }
                if (this.f20834s - this.f20831p >= 10) {
                    long j12 = 2 + j10;
                    int iF = (eVar.f(j11) << 7) ^ bF;
                    if (iF < 0) {
                        i10 = iF ^ (-128);
                    } else {
                        long j13 = 3 + j10;
                        int iF2 = (eVar.f(j12) << Constants.CVR_B1b41_1110_ONLINE_PIN) ^ iF;
                        if (iF2 >= 0) {
                            i10 = iF2 ^ 16256;
                        } else {
                            long j14 = 4 + j10;
                            int iF3 = iF2 ^ (eVar.f(j13) << MessageUtils.MESSAGE_21_NAK);
                            if (iF3 < 0) {
                                i10 = (-2080896) ^ iF3;
                            } else {
                                j13 = 5 + j10;
                                byte bF2 = eVar.f(j14);
                                int i11 = (iF3 ^ (bF2 << 28)) ^ 266354560;
                                if (bF2 < 0) {
                                    j14 = 6 + j10;
                                    if (eVar.f(j13) < 0) {
                                        j13 = 7 + j10;
                                        if (eVar.f(j14) < 0) {
                                            j14 = 8 + j10;
                                            if (eVar.f(j13) < 0) {
                                                j13 = 9 + j10;
                                                if (eVar.f(j14) < 0) {
                                                    long j15 = j10 + 10;
                                                    if (eVar.f(j13) >= 0) {
                                                        i10 = i11;
                                                        j12 = j15;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    i10 = i11;
                                }
                                i10 = i11;
                            }
                            j12 = j14;
                        }
                        j12 = j13;
                    }
                    this.f20831p = j12;
                    return i10;
                }
            }
            return (int) e();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public final long readRawVarint64() throws IOException {
            long j10;
            long j11;
            long j12;
            long j13 = this.f20831p;
            if (this.f20834s != j13) {
                long j14 = j13 + 1;
                v0.e eVar = v0.f21151d;
                byte bF = eVar.f(j13);
                if (bF >= 0) {
                    this.f20831p++;
                    return bF;
                }
                if (this.f20834s - this.f20831p >= 10) {
                    long j15 = 2 + j13;
                    int iF = (eVar.f(j14) << 7) ^ bF;
                    if (iF < 0) {
                        j10 = iF ^ (-128);
                    } else {
                        long j16 = 3 + j13;
                        int iF2 = (eVar.f(j15) << Constants.CVR_B1b41_1110_ONLINE_PIN) ^ iF;
                        if (iF2 >= 0) {
                            j10 = iF2 ^ 16256;
                        } else {
                            long j17 = 4 + j13;
                            int iF3 = iF2 ^ (eVar.f(j16) << MessageUtils.MESSAGE_21_NAK);
                            if (iF3 < 0) {
                                j10 = (-2080896) ^ iF3;
                                j15 = j17;
                            } else {
                                long j18 = 5 + j13;
                                long jF = (((long) eVar.f(j17)) << 28) ^ ((long) iF3);
                                if (jF >= 0) {
                                    j12 = 266354560;
                                } else {
                                    j16 = 6 + j13;
                                    long jF2 = jF ^ (((long) eVar.f(j18)) << 35);
                                    if (jF2 < 0) {
                                        j11 = -34093383808L;
                                    } else {
                                        j18 = 7 + j13;
                                        jF = jF2 ^ (((long) eVar.f(j16)) << 42);
                                        if (jF >= 0) {
                                            j12 = 4363953127296L;
                                        } else {
                                            j16 = 8 + j13;
                                            jF2 = jF ^ (((long) eVar.f(j18)) << 49);
                                            if (jF2 < 0) {
                                                j11 = -558586000294016L;
                                            } else {
                                                j18 = 9 + j13;
                                                long jF3 = (jF2 ^ (((long) eVar.f(j16)) << 56)) ^ 71499008037633920L;
                                                if (jF3 < 0) {
                                                    long j19 = j13 + 10;
                                                    if (eVar.f(j18) >= 0) {
                                                        j10 = jF3;
                                                        j15 = j19;
                                                    }
                                                } else {
                                                    j10 = jF3;
                                                    j15 = j18;
                                                }
                                            }
                                        }
                                    }
                                    j10 = j11 ^ jF2;
                                }
                                j10 = j12 ^ jF;
                                j15 = j18;
                            }
                        }
                        j15 = j16;
                    }
                    this.f20831p = j15;
                    return j10;
                }
            }
            return e();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public final int readSFixed32() throws IOException {
            return readRawLittleEndian32();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public final long readSFixed64() throws IOException {
            return readRawLittleEndian64();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public final int readSInt32() throws IOException {
            return CodedInputStream.decodeZigZag32(readRawVarint32());
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public final long readSInt64() throws IOException {
            return CodedInputStream.decodeZigZag64(readRawVarint64());
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public final String readString() throws IOException {
            int rawVarint32 = readRawVarint32();
            if (rawVarint32 > 0) {
                long j10 = rawVarint32;
                long j11 = this.f20834s;
                long j12 = this.f20831p;
                if (j10 <= j11 - j12) {
                    byte[] bArr = new byte[rawVarint32];
                    v0.f(j12, bArr, 0L, j10);
                    String str = new String(bArr, Internal.f20943a);
                    this.f20831p += j10;
                    return str;
                }
            }
            if (rawVarint32 > 0 && rawVarint32 <= g()) {
                byte[] bArr2 = new byte[rawVarint32];
                d(rawVarint32, bArr2);
                return new String(bArr2, Internal.f20943a);
            }
            if (rawVarint32 == 0) {
                return "";
            }
            if (rawVarint32 < 0) {
                throw InvalidProtocolBufferException.f();
            }
            throw InvalidProtocolBufferException.i();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public final String readStringRequireUtf8() throws IOException {
            int rawVarint32 = readRawVarint32();
            if (rawVarint32 > 0) {
                long j10 = rawVarint32;
                long j11 = this.f20834s;
                long j12 = this.f20831p;
                if (j10 <= j11 - j12) {
                    String strC = w0.c(this.f20823g, (int) (j12 - this.f20832q), rawVarint32);
                    this.f20831p += j10;
                    return strC;
                }
            }
            if (rawVarint32 >= 0 && rawVarint32 <= g()) {
                byte[] bArr = new byte[rawVarint32];
                d(rawVarint32, bArr);
                return w0.f21158a.a(0, rawVarint32, bArr);
            }
            if (rawVarint32 == 0) {
                return "";
            }
            if (rawVarint32 <= 0) {
                throw InvalidProtocolBufferException.f();
            }
            throw InvalidProtocolBufferException.i();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public final int readTag() throws IOException {
            if (isAtEnd()) {
                this.m = 0;
                return 0;
            }
            int rawVarint32 = readRawVarint32();
            this.m = rawVarint32;
            if (WireFormat.getTagFieldNumber(rawVarint32) != 0) {
                return this.m;
            }
            throw InvalidProtocolBufferException.b();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public final int readUInt32() throws IOException {
            return readRawVarint32();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public final long readUInt64() throws IOException {
            return readRawVarint64();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        @Deprecated
        public final void readUnknownGroup(int i10, MessageLite.Builder builder) throws IOException {
            readGroup(i10, builder, ExtensionRegistryLite.getEmptyRegistry());
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public final void resetSizeCounter() {
            this.f20830o = (int) ((((long) this.f20829n) + this.f20831p) - this.f20832q);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public final boolean skipField(int i10) throws IOException {
            int tagWireType = WireFormat.getTagWireType(i10);
            if (tagWireType == 0) {
                for (int i11 = 0; i11 < 10; i11++) {
                    if (readRawByte() >= 0) {
                        return true;
                    }
                }
                throw InvalidProtocolBufferException.e();
            }
            if (tagWireType == 1) {
                skipRawBytes(8);
                return true;
            }
            if (tagWireType == 2) {
                skipRawBytes(readRawVarint32());
                return true;
            }
            if (tagWireType == 3) {
                skipMessage();
                checkLastTagWas((WireFormat.getTagFieldNumber(i10) << 3) | 4);
                return true;
            }
            if (tagWireType == 4) {
                return false;
            }
            if (tagWireType != 5) {
                throw InvalidProtocolBufferException.d();
            }
            skipRawBytes(4);
            return true;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public final void skipMessage() throws IOException {
            int tag;
            do {
                tag = readTag();
                if (tag == 0) {
                    return;
                }
            } while (skipField(tag));
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public final void skipRawBytes(int i10) throws IOException {
            if (i10 < 0 || i10 > (((long) (this.f20826j - this.f20829n)) - this.f20831p) + this.f20832q) {
                if (i10 >= 0) {
                    throw InvalidProtocolBufferException.i();
                }
                throw InvalidProtocolBufferException.f();
            }
            while (i10 > 0) {
                if (c() == 0) {
                    if (!this.f20822f.hasNext()) {
                        throw InvalidProtocolBufferException.i();
                    }
                    i();
                }
                int iMin = Math.min(i10, (int) c());
                i10 -= iMin;
                this.f20831p += (long) iMin;
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public final void skipMessage(CodedOutputStream codedOutputStream) throws IOException {
            int tag;
            do {
                tag = readTag();
                if (tag == 0) {
                    return;
                }
            } while (skipField(tag, codedOutputStream));
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public final <T extends MessageLite> T readGroup(int i10, Parser<T> parser, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            int i11 = this.f20809a;
            if (i11 < this.f20810b) {
                this.f20809a = i11 + 1;
                T partialFrom = parser.parsePartialFrom(this, extensionRegistryLite);
                checkLastTagWas((i10 << 3) | 4);
                this.f20809a--;
                return partialFrom;
            }
            throw InvalidProtocolBufferException.h();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public final <T extends MessageLite> T readMessage(Parser<T> parser, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            int rawVarint32 = readRawVarint32();
            if (this.f20809a < this.f20810b) {
                int iPushLimit = pushLimit(rawVarint32);
                this.f20809a++;
                T partialFrom = parser.parsePartialFrom(this, extensionRegistryLite);
                checkLastTagWas(0);
                this.f20809a--;
                popLimit(iPushLimit);
                return partialFrom;
            }
            throw InvalidProtocolBufferException.h();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public final boolean skipField(int i10, CodedOutputStream codedOutputStream) throws IOException {
            int tagWireType = WireFormat.getTagWireType(i10);
            if (tagWireType == 0) {
                long rawVarint64 = readRawVarint64();
                codedOutputStream.writeRawVarint32(i10);
                codedOutputStream.writeUInt64NoTag(rawVarint64);
                return true;
            }
            if (tagWireType == 1) {
                long rawLittleEndian64 = readRawLittleEndian64();
                codedOutputStream.writeRawVarint32(i10);
                codedOutputStream.writeFixed64NoTag(rawLittleEndian64);
                return true;
            }
            if (tagWireType == 2) {
                ByteString bytes = readBytes();
                codedOutputStream.writeRawVarint32(i10);
                codedOutputStream.writeBytesNoTag(bytes);
                return true;
            }
            if (tagWireType == 3) {
                codedOutputStream.writeRawVarint32(i10);
                skipMessage(codedOutputStream);
                int tagFieldNumber = (WireFormat.getTagFieldNumber(i10) << 3) | 4;
                checkLastTagWas(tagFieldNumber);
                codedOutputStream.writeRawVarint32(tagFieldNumber);
                return true;
            }
            if (tagWireType == 4) {
                return false;
            }
            if (tagWireType == 5) {
                int rawLittleEndian32 = readRawLittleEndian32();
                codedOutputStream.writeRawVarint32(i10);
                codedOutputStream.writeFixed32NoTag(rawLittleEndian32);
                return true;
            }
            throw InvalidProtocolBufferException.d();
        }
    }

    public static final class c extends CodedInputStream {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final InputStream f20835e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final byte[] f20836f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f20837g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f20838h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f20839i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f20840j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public int f20841k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public int f20842l = Integer.MAX_VALUE;

        public c(InputStream inputStream, int i10) {
            Charset charset = Internal.f20943a;
            if (inputStream == null) {
                throw new NullPointerException("input");
            }
            this.f20835e = inputStream;
            this.f20836f = new byte[i10];
            this.f20837g = 0;
            this.f20839i = 0;
            this.f20841k = 0;
        }

        public final byte[] c(int i10, boolean z10) throws IOException {
            byte[] bArrD = d(i10);
            if (bArrD != null) {
                return z10 ? (byte[]) bArrD.clone() : bArrD;
            }
            int i11 = this.f20839i;
            int i12 = this.f20837g;
            int length = i12 - i11;
            this.f20841k += i12;
            this.f20839i = 0;
            this.f20837g = 0;
            ArrayList<byte[]> arrayListE = e(i10 - length);
            byte[] bArr = new byte[i10];
            System.arraycopy(this.f20836f, i11, bArr, 0, length);
            for (byte[] bArr2 : arrayListE) {
                System.arraycopy(bArr2, 0, bArr, length, bArr2.length);
                length += bArr2.length;
            }
            return bArr;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public final void checkLastTagWas(int i10) throws InvalidProtocolBufferException {
            if (this.f20840j != i10) {
                throw InvalidProtocolBufferException.a();
            }
        }

        public final byte[] d(int i10) throws IOException {
            if (i10 == 0) {
                return Internal.EMPTY_BYTE_ARRAY;
            }
            if (i10 < 0) {
                throw InvalidProtocolBufferException.f();
            }
            int i11 = this.f20841k;
            int i12 = this.f20839i;
            int i13 = i11 + i12 + i10;
            if (i13 - this.f20811c > 0) {
                throw new InvalidProtocolBufferException("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
            }
            int i14 = this.f20842l;
            if (i13 > i14) {
                skipRawBytes((i14 - i11) - i12);
                throw InvalidProtocolBufferException.i();
            }
            int i15 = this.f20837g - i12;
            int i16 = i10 - i15;
            InputStream inputStream = this.f20835e;
            if (i16 >= 4096 && i16 > inputStream.available()) {
                return null;
            }
            byte[] bArr = new byte[i10];
            System.arraycopy(this.f20836f, this.f20839i, bArr, 0, i15);
            this.f20841k += this.f20837g;
            this.f20839i = 0;
            this.f20837g = 0;
            while (i15 < i10) {
                int i17 = inputStream.read(bArr, i15, i10 - i15);
                if (i17 == -1) {
                    throw InvalidProtocolBufferException.i();
                }
                this.f20841k += i17;
                i15 += i17;
            }
            return bArr;
        }

        public final ArrayList e(int i10) throws IOException {
            ArrayList arrayList = new ArrayList();
            while (i10 > 0) {
                int iMin = Math.min(i10, 4096);
                byte[] bArr = new byte[iMin];
                int i11 = 0;
                while (i11 < iMin) {
                    int i12 = this.f20835e.read(bArr, i11, iMin - i11);
                    if (i12 == -1) {
                        throw InvalidProtocolBufferException.i();
                    }
                    this.f20841k += i12;
                    i11 += i12;
                }
                i10 -= iMin;
                arrayList.add(bArr);
            }
            return arrayList;
        }

        public final long f() throws IOException {
            long j10 = 0;
            for (int i10 = 0; i10 < 64; i10 += 7) {
                byte rawByte = readRawByte();
                j10 |= ((long) (rawByte & 127)) << i10;
                if ((rawByte & 128) == 0) {
                    return j10;
                }
            }
            throw InvalidProtocolBufferException.e();
        }

        public final void g() {
            int i10 = this.f20837g + this.f20838h;
            this.f20837g = i10;
            int i11 = this.f20841k + i10;
            int i12 = this.f20842l;
            if (i11 <= i12) {
                this.f20838h = 0;
                return;
            }
            int i13 = i11 - i12;
            this.f20838h = i13;
            this.f20837g = i10 - i13;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public final int getBytesUntilLimit() {
            int i10 = this.f20842l;
            if (i10 == Integer.MAX_VALUE) {
                return -1;
            }
            return i10 - (this.f20841k + this.f20839i);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public final int getLastTag() {
            return this.f20840j;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public final int getTotalBytesRead() {
            return this.f20841k + this.f20839i;
        }

        public final void h(int i10) throws IOException {
            if (i(i10)) {
                return;
            }
            if (i10 <= (this.f20811c - this.f20841k) - this.f20839i) {
                throw InvalidProtocolBufferException.i();
            }
            throw new InvalidProtocolBufferException("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
        }

        public final boolean i(int i10) throws IOException {
            int i11 = this.f20839i;
            int i12 = i11 + i10;
            int i13 = this.f20837g;
            if (i12 <= i13) {
                throw new IllegalStateException(androidx.camera.core.impl.utils.b.a("refillBuffer() called when ", i10, " bytes were already available in buffer"));
            }
            int i14 = this.f20811c;
            int i15 = this.f20841k;
            if (i10 > (i14 - i15) - i11 || i15 + i11 + i10 > this.f20842l) {
                return false;
            }
            byte[] bArr = this.f20836f;
            if (i11 > 0) {
                if (i13 > i11) {
                    System.arraycopy(bArr, i11, bArr, 0, i13 - i11);
                }
                this.f20841k += i11;
                this.f20837g -= i11;
                this.f20839i = 0;
            }
            int i16 = this.f20837g;
            int iMin = Math.min(bArr.length - i16, (this.f20811c - this.f20841k) - i16);
            InputStream inputStream = this.f20835e;
            int i17 = inputStream.read(bArr, i16, iMin);
            if (i17 == 0 || i17 < -1 || i17 > bArr.length) {
                throw new IllegalStateException(inputStream.getClass() + "#read(byte[]) returned invalid result: " + i17 + "\nThe InputStream implementation is buggy.");
            }
            if (i17 <= 0) {
                return false;
            }
            this.f20837g += i17;
            g();
            if (this.f20837g >= i10) {
                return true;
            }
            return i(i10);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public final boolean isAtEnd() throws IOException {
            return this.f20839i == this.f20837g && !i(1);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public final void popLimit(int i10) {
            this.f20842l = i10;
            g();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public final int pushLimit(int i10) throws InvalidProtocolBufferException {
            if (i10 < 0) {
                throw InvalidProtocolBufferException.f();
            }
            int i11 = this.f20841k + this.f20839i + i10;
            int i12 = this.f20842l;
            if (i11 > i12) {
                throw InvalidProtocolBufferException.i();
            }
            this.f20842l = i11;
            g();
            return i12;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public final boolean readBool() throws IOException {
            return readRawVarint64() != 0;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public final byte[] readByteArray() throws IOException {
            int rawVarint32 = readRawVarint32();
            int i10 = this.f20837g;
            int i11 = this.f20839i;
            if (rawVarint32 > i10 - i11 || rawVarint32 <= 0) {
                return c(rawVarint32, false);
            }
            byte[] bArrCopyOfRange = Arrays.copyOfRange(this.f20836f, i11, i11 + rawVarint32);
            this.f20839i += rawVarint32;
            return bArrCopyOfRange;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public final ByteBuffer readByteBuffer() throws IOException {
            int rawVarint32 = readRawVarint32();
            int i10 = this.f20837g;
            int i11 = this.f20839i;
            if (rawVarint32 > i10 - i11 || rawVarint32 <= 0) {
                return rawVarint32 == 0 ? Internal.EMPTY_BYTE_BUFFER : ByteBuffer.wrap(c(rawVarint32, true));
            }
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(Arrays.copyOfRange(this.f20836f, i11, i11 + rawVarint32));
            this.f20839i += rawVarint32;
            return byteBufferWrap;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public final ByteString readBytes() throws IOException {
            int rawVarint32 = readRawVarint32();
            int i10 = this.f20837g;
            int i11 = this.f20839i;
            int i12 = i10 - i11;
            byte[] bArr = this.f20836f;
            if (rawVarint32 <= i12 && rawVarint32 > 0) {
                ByteString byteStringCopyFrom = ByteString.copyFrom(bArr, i11, rawVarint32);
                this.f20839i += rawVarint32;
                return byteStringCopyFrom;
            }
            if (rawVarint32 == 0) {
                return ByteString.EMPTY;
            }
            byte[] bArrD = d(rawVarint32);
            if (bArrD != null) {
                return ByteString.copyFrom(bArrD);
            }
            int i13 = this.f20839i;
            int i14 = this.f20837g;
            int length = i14 - i13;
            this.f20841k += i14;
            this.f20839i = 0;
            this.f20837g = 0;
            ArrayList<byte[]> arrayListE = e(rawVarint32 - length);
            byte[] bArr2 = new byte[rawVarint32];
            System.arraycopy(bArr, i13, bArr2, 0, length);
            for (byte[] bArr3 : arrayListE) {
                System.arraycopy(bArr3, 0, bArr2, length, bArr3.length);
                length += bArr3.length;
            }
            ByteString byteString = ByteString.EMPTY;
            return new ByteString.h(bArr2);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public final double readDouble() throws IOException {
            return Double.longBitsToDouble(readRawLittleEndian64());
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public final int readEnum() throws IOException {
            return readRawVarint32();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public final int readFixed32() throws IOException {
            return readRawLittleEndian32();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public final long readFixed64() throws IOException {
            return readRawLittleEndian64();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public final float readFloat() throws IOException {
            return Float.intBitsToFloat(readRawLittleEndian32());
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public final void readGroup(int i10, MessageLite.Builder builder, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            int i11 = this.f20809a;
            if (i11 >= this.f20810b) {
                throw InvalidProtocolBufferException.h();
            }
            this.f20809a = i11 + 1;
            builder.mergeFrom(this, extensionRegistryLite);
            checkLastTagWas((i10 << 3) | 4);
            this.f20809a--;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public final int readInt32() throws IOException {
            return readRawVarint32();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public final long readInt64() throws IOException {
            return readRawVarint64();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public final void readMessage(MessageLite.Builder builder, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            int rawVarint32 = readRawVarint32();
            if (this.f20809a >= this.f20810b) {
                throw InvalidProtocolBufferException.h();
            }
            int iPushLimit = pushLimit(rawVarint32);
            this.f20809a++;
            builder.mergeFrom(this, extensionRegistryLite);
            checkLastTagWas(0);
            this.f20809a--;
            popLimit(iPushLimit);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public final byte readRawByte() throws IOException {
            if (this.f20839i == this.f20837g) {
                h(1);
            }
            int i10 = this.f20839i;
            this.f20839i = i10 + 1;
            return this.f20836f[i10];
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public final byte[] readRawBytes(int i10) throws IOException {
            int i11 = this.f20839i;
            if (i10 > this.f20837g - i11 || i10 <= 0) {
                return c(i10, false);
            }
            int i12 = i10 + i11;
            this.f20839i = i12;
            return Arrays.copyOfRange(this.f20836f, i11, i12);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public final int readRawLittleEndian32() throws IOException {
            int i10 = this.f20839i;
            if (this.f20837g - i10 < 4) {
                h(4);
                i10 = this.f20839i;
            }
            this.f20839i = i10 + 4;
            byte[] bArr = this.f20836f;
            return ((bArr[i10 + 3] & 255) << 24) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public final long readRawLittleEndian64() throws IOException {
            int i10 = this.f20839i;
            if (this.f20837g - i10 < 8) {
                h(8);
                i10 = this.f20839i;
            }
            this.f20839i = i10 + 8;
            byte[] bArr = this.f20836f;
            return ((((long) bArr[i10 + 7]) & 255) << 56) | (((long) bArr[i10]) & 255) | ((((long) bArr[i10 + 1]) & 255) << 8) | ((((long) bArr[i10 + 2]) & 255) << 16) | ((((long) bArr[i10 + 3]) & 255) << 24) | ((((long) bArr[i10 + 4]) & 255) << 32) | ((((long) bArr[i10 + 5]) & 255) << 40) | ((((long) bArr[i10 + 6]) & 255) << 48);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public final int readRawVarint32() throws IOException {
            int i10;
            int i11 = this.f20839i;
            int i12 = this.f20837g;
            if (i12 != i11) {
                int i13 = i11 + 1;
                byte[] bArr = this.f20836f;
                byte b10 = bArr[i11];
                if (b10 >= 0) {
                    this.f20839i = i13;
                    return b10;
                }
                if (i12 - i13 >= 9) {
                    int i14 = i11 + 2;
                    int i15 = (bArr[i13] << 7) ^ b10;
                    if (i15 < 0) {
                        i10 = i15 ^ (-128);
                    } else {
                        int i16 = i11 + 3;
                        int i17 = (bArr[i14] << Constants.CVR_B1b41_1110_ONLINE_PIN) ^ i15;
                        if (i17 >= 0) {
                            i10 = i17 ^ 16256;
                        } else {
                            int i18 = i11 + 4;
                            int i19 = i17 ^ (bArr[i16] << MessageUtils.MESSAGE_21_NAK);
                            if (i19 < 0) {
                                i10 = (-2080896) ^ i19;
                            } else {
                                i16 = i11 + 5;
                                byte b11 = bArr[i18];
                                int i20 = (i19 ^ (b11 << 28)) ^ 266354560;
                                if (b11 < 0) {
                                    i18 = i11 + 6;
                                    if (bArr[i16] < 0) {
                                        i16 = i11 + 7;
                                        if (bArr[i18] < 0) {
                                            i18 = i11 + 8;
                                            if (bArr[i16] < 0) {
                                                i16 = i11 + 9;
                                                if (bArr[i18] < 0) {
                                                    int i21 = i11 + 10;
                                                    if (bArr[i16] >= 0) {
                                                        i14 = i21;
                                                        i10 = i20;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    i10 = i20;
                                }
                                i10 = i20;
                            }
                            i14 = i18;
                        }
                        i14 = i16;
                    }
                    this.f20839i = i14;
                    return i10;
                }
            }
            return (int) f();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public final long readRawVarint64() throws IOException {
            long j10;
            long j11;
            long j12;
            long j13;
            int i10 = this.f20839i;
            int i11 = this.f20837g;
            if (i11 != i10) {
                int i12 = i10 + 1;
                byte[] bArr = this.f20836f;
                byte b10 = bArr[i10];
                if (b10 >= 0) {
                    this.f20839i = i12;
                    return b10;
                }
                if (i11 - i12 >= 9) {
                    int i13 = i10 + 2;
                    int i14 = (bArr[i12] << 7) ^ b10;
                    if (i14 < 0) {
                        j10 = i14 ^ (-128);
                    } else {
                        int i15 = i10 + 3;
                        int i16 = (bArr[i13] << Constants.CVR_B1b41_1110_ONLINE_PIN) ^ i14;
                        if (i16 >= 0) {
                            j10 = i16 ^ 16256;
                            i13 = i15;
                        } else {
                            int i17 = i10 + 4;
                            int i18 = i16 ^ (bArr[i15] << MessageUtils.MESSAGE_21_NAK);
                            if (i18 < 0) {
                                j13 = (-2080896) ^ i18;
                            } else {
                                long j14 = i18;
                                i13 = i10 + 5;
                                long j15 = j14 ^ (((long) bArr[i17]) << 28);
                                if (j15 >= 0) {
                                    j12 = 266354560;
                                } else {
                                    i17 = i10 + 6;
                                    long j16 = j15 ^ (((long) bArr[i13]) << 35);
                                    if (j16 < 0) {
                                        j11 = -34093383808L;
                                    } else {
                                        i13 = i10 + 7;
                                        j15 = j16 ^ (((long) bArr[i17]) << 42);
                                        if (j15 >= 0) {
                                            j12 = 4363953127296L;
                                        } else {
                                            i17 = i10 + 8;
                                            j16 = j15 ^ (((long) bArr[i13]) << 49);
                                            if (j16 < 0) {
                                                j11 = -558586000294016L;
                                            } else {
                                                i13 = i10 + 9;
                                                long j17 = (j16 ^ (((long) bArr[i17]) << 56)) ^ 71499008037633920L;
                                                if (j17 < 0) {
                                                    int i19 = i10 + 10;
                                                    if (bArr[i13] >= 0) {
                                                        i13 = i19;
                                                    }
                                                }
                                                j10 = j17;
                                            }
                                        }
                                    }
                                    j13 = j11 ^ j16;
                                }
                                j10 = j12 ^ j15;
                            }
                            i13 = i17;
                            j10 = j13;
                        }
                    }
                    this.f20839i = i13;
                    return j10;
                }
            }
            return f();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public final int readSFixed32() throws IOException {
            return readRawLittleEndian32();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public final long readSFixed64() throws IOException {
            return readRawLittleEndian64();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public final int readSInt32() throws IOException {
            return CodedInputStream.decodeZigZag32(readRawVarint32());
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public final long readSInt64() throws IOException {
            return CodedInputStream.decodeZigZag64(readRawVarint64());
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public final String readString() throws IOException {
            int rawVarint32 = readRawVarint32();
            byte[] bArr = this.f20836f;
            if (rawVarint32 > 0) {
                int i10 = this.f20837g;
                int i11 = this.f20839i;
                if (rawVarint32 <= i10 - i11) {
                    String str = new String(bArr, i11, rawVarint32, Internal.f20943a);
                    this.f20839i += rawVarint32;
                    return str;
                }
            }
            if (rawVarint32 == 0) {
                return "";
            }
            if (rawVarint32 > this.f20837g) {
                return new String(c(rawVarint32, false), Internal.f20943a);
            }
            h(rawVarint32);
            String str2 = new String(bArr, this.f20839i, rawVarint32, Internal.f20943a);
            this.f20839i += rawVarint32;
            return str2;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public final String readStringRequireUtf8() throws IOException {
            int rawVarint32 = readRawVarint32();
            int i10 = this.f20839i;
            int i11 = this.f20837g;
            int i12 = i11 - i10;
            byte[] bArrC = this.f20836f;
            if (rawVarint32 <= i12 && rawVarint32 > 0) {
                this.f20839i = i10 + rawVarint32;
            } else {
                if (rawVarint32 == 0) {
                    return "";
                }
                i10 = 0;
                if (rawVarint32 <= i11) {
                    h(rawVarint32);
                    this.f20839i = rawVarint32;
                } else {
                    bArrC = c(rawVarint32, false);
                }
            }
            return w0.f21158a.a(i10, rawVarint32, bArrC);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public final int readTag() throws IOException {
            if (isAtEnd()) {
                this.f20840j = 0;
                return 0;
            }
            int rawVarint32 = readRawVarint32();
            this.f20840j = rawVarint32;
            if (WireFormat.getTagFieldNumber(rawVarint32) != 0) {
                return this.f20840j;
            }
            throw InvalidProtocolBufferException.b();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public final int readUInt32() throws IOException {
            return readRawVarint32();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public final long readUInt64() throws IOException {
            return readRawVarint64();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        @Deprecated
        public final void readUnknownGroup(int i10, MessageLite.Builder builder) throws IOException {
            readGroup(i10, builder, ExtensionRegistryLite.getEmptyRegistry());
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public final void resetSizeCounter() {
            this.f20841k = -this.f20839i;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public final boolean skipField(int i10) throws IOException {
            int tagWireType = WireFormat.getTagWireType(i10);
            int i11 = 0;
            if (tagWireType == 0) {
                if (this.f20837g - this.f20839i < 10) {
                    while (i11 < 10) {
                        if (readRawByte() < 0) {
                            i11++;
                        }
                    }
                    throw InvalidProtocolBufferException.e();
                }
                while (i11 < 10) {
                    int i12 = this.f20839i;
                    this.f20839i = i12 + 1;
                    if (this.f20836f[i12] < 0) {
                        i11++;
                    }
                }
                throw InvalidProtocolBufferException.e();
                return true;
            }
            if (tagWireType == 1) {
                skipRawBytes(8);
                return true;
            }
            if (tagWireType == 2) {
                skipRawBytes(readRawVarint32());
                return true;
            }
            if (tagWireType == 3) {
                skipMessage();
                checkLastTagWas((WireFormat.getTagFieldNumber(i10) << 3) | 4);
                return true;
            }
            if (tagWireType == 4) {
                return false;
            }
            if (tagWireType != 5) {
                throw InvalidProtocolBufferException.d();
            }
            skipRawBytes(4);
            return true;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public final void skipMessage() throws IOException {
            int tag;
            do {
                tag = readTag();
                if (tag == 0) {
                    return;
                }
            } while (skipField(tag));
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public final void skipRawBytes(int i10) throws IOException {
            int i11 = this.f20837g;
            int i12 = this.f20839i;
            if (i10 <= i11 - i12 && i10 >= 0) {
                this.f20839i = i12 + i10;
                return;
            }
            InputStream inputStream = this.f20835e;
            if (i10 < 0) {
                throw InvalidProtocolBufferException.f();
            }
            int i13 = this.f20841k;
            int i14 = i13 + i12;
            int i15 = i14 + i10;
            int i16 = this.f20842l;
            if (i15 > i16) {
                skipRawBytes((i16 - i13) - i12);
                throw InvalidProtocolBufferException.i();
            }
            this.f20841k = i14;
            int i17 = i11 - i12;
            this.f20837g = 0;
            this.f20839i = 0;
            while (i17 < i10) {
                long j10 = i10 - i17;
                try {
                    long jSkip = inputStream.skip(j10);
                    if (jSkip < 0 || jSkip > j10) {
                        throw new IllegalStateException(inputStream.getClass() + "#skip returned invalid result: " + jSkip + "\nThe InputStream implementation is buggy.");
                    }
                    if (jSkip == 0) {
                        break;
                    } else {
                        i17 += (int) jSkip;
                    }
                } finally {
                    this.f20841k += i17;
                    g();
                }
            }
            if (i17 >= i10) {
                return;
            }
            int i18 = this.f20837g;
            int i19 = i18 - this.f20839i;
            this.f20839i = i18;
            h(1);
            while (true) {
                int i20 = i10 - i19;
                int i21 = this.f20837g;
                if (i20 <= i21) {
                    this.f20839i = i20;
                    return;
                } else {
                    i19 += i21;
                    this.f20839i = i21;
                    h(1);
                }
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public final void skipMessage(CodedOutputStream codedOutputStream) throws IOException {
            int tag;
            do {
                tag = readTag();
                if (tag == 0) {
                    return;
                }
            } while (skipField(tag, codedOutputStream));
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public final <T extends MessageLite> T readGroup(int i10, Parser<T> parser, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            int i11 = this.f20809a;
            if (i11 < this.f20810b) {
                this.f20809a = i11 + 1;
                T partialFrom = parser.parsePartialFrom(this, extensionRegistryLite);
                checkLastTagWas((i10 << 3) | 4);
                this.f20809a--;
                return partialFrom;
            }
            throw InvalidProtocolBufferException.h();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public final <T extends MessageLite> T readMessage(Parser<T> parser, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            int rawVarint32 = readRawVarint32();
            if (this.f20809a < this.f20810b) {
                int iPushLimit = pushLimit(rawVarint32);
                this.f20809a++;
                T partialFrom = parser.parsePartialFrom(this, extensionRegistryLite);
                checkLastTagWas(0);
                this.f20809a--;
                popLimit(iPushLimit);
                return partialFrom;
            }
            throw InvalidProtocolBufferException.h();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public final boolean skipField(int i10, CodedOutputStream codedOutputStream) throws IOException {
            int tagWireType = WireFormat.getTagWireType(i10);
            if (tagWireType == 0) {
                long rawVarint64 = readRawVarint64();
                codedOutputStream.writeRawVarint32(i10);
                codedOutputStream.writeUInt64NoTag(rawVarint64);
                return true;
            }
            if (tagWireType == 1) {
                long rawLittleEndian64 = readRawLittleEndian64();
                codedOutputStream.writeRawVarint32(i10);
                codedOutputStream.writeFixed64NoTag(rawLittleEndian64);
                return true;
            }
            if (tagWireType == 2) {
                ByteString bytes = readBytes();
                codedOutputStream.writeRawVarint32(i10);
                codedOutputStream.writeBytesNoTag(bytes);
                return true;
            }
            if (tagWireType == 3) {
                codedOutputStream.writeRawVarint32(i10);
                skipMessage(codedOutputStream);
                int tagFieldNumber = (WireFormat.getTagFieldNumber(i10) << 3) | 4;
                checkLastTagWas(tagFieldNumber);
                codedOutputStream.writeRawVarint32(tagFieldNumber);
                return true;
            }
            if (tagWireType == 4) {
                return false;
            }
            if (tagWireType == 5) {
                int rawLittleEndian32 = readRawLittleEndian32();
                codedOutputStream.writeRawVarint32(i10);
                codedOutputStream.writeFixed32NoTag(rawLittleEndian32);
                return true;
            }
            throw InvalidProtocolBufferException.d();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public final void enableAliasing(boolean z10) {
        }
    }

    public static final class d extends CodedInputStream {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final ByteBuffer f20843e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final boolean f20844f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final long f20845g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public long f20846h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public long f20847i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public long f20848j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public int f20849k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public int f20850l;
        public boolean m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public int f20851n = Integer.MAX_VALUE;

        public d(ByteBuffer byteBuffer, boolean z10) {
            this.f20843e = byteBuffer;
            long jA = v0.a(byteBuffer);
            this.f20845g = jA;
            this.f20846h = ((long) byteBuffer.limit()) + jA;
            long jPosition = jA + ((long) byteBuffer.position());
            this.f20847i = jPosition;
            this.f20848j = jPosition;
            this.f20844f = z10;
        }

        public final long c() throws IOException {
            long j10 = 0;
            for (int i10 = 0; i10 < 64; i10 += 7) {
                byte rawByte = readRawByte();
                j10 |= ((long) (rawByte & 127)) << i10;
                if ((rawByte & 128) == 0) {
                    return j10;
                }
            }
            throw InvalidProtocolBufferException.e();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public final void checkLastTagWas(int i10) throws InvalidProtocolBufferException {
            if (this.f20850l != i10) {
                throw InvalidProtocolBufferException.a();
            }
        }

        public final void d() {
            long j10 = this.f20846h + ((long) this.f20849k);
            this.f20846h = j10;
            int i10 = (int) (j10 - this.f20848j);
            int i11 = this.f20851n;
            if (i10 <= i11) {
                this.f20849k = 0;
                return;
            }
            int i12 = i10 - i11;
            this.f20849k = i12;
            this.f20846h = j10 - ((long) i12);
        }

        public final int e() {
            return (int) (this.f20846h - this.f20847i);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public final void enableAliasing(boolean z10) {
            this.m = z10;
        }

        public final ByteBuffer f(long j10, long j11) throws IOException {
            ByteBuffer byteBuffer = this.f20843e;
            int iPosition = byteBuffer.position();
            int iLimit = byteBuffer.limit();
            long j12 = this.f20845g;
            try {
                try {
                    byteBuffer.position((int) (j10 - j12));
                    byteBuffer.limit((int) (j11 - j12));
                    ByteBuffer byteBufferSlice = byteBuffer.slice();
                    byteBuffer.position(iPosition);
                    byteBuffer.limit(iLimit);
                    return byteBufferSlice;
                } catch (IllegalArgumentException unused) {
                    throw InvalidProtocolBufferException.i();
                }
            } catch (Throwable th2) {
                byteBuffer.position(iPosition);
                byteBuffer.limit(iLimit);
                throw th2;
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public final int getBytesUntilLimit() {
            int i10 = this.f20851n;
            if (i10 == Integer.MAX_VALUE) {
                return -1;
            }
            return i10 - getTotalBytesRead();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public final int getLastTag() {
            return this.f20850l;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public final int getTotalBytesRead() {
            return (int) (this.f20847i - this.f20848j);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public final boolean isAtEnd() throws IOException {
            return this.f20847i == this.f20846h;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public final void popLimit(int i10) {
            this.f20851n = i10;
            d();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public final int pushLimit(int i10) throws InvalidProtocolBufferException {
            if (i10 < 0) {
                throw InvalidProtocolBufferException.f();
            }
            int totalBytesRead = getTotalBytesRead() + i10;
            int i11 = this.f20851n;
            if (totalBytesRead > i11) {
                throw InvalidProtocolBufferException.i();
            }
            this.f20851n = totalBytesRead;
            d();
            return i11;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public final boolean readBool() throws IOException {
            return readRawVarint64() != 0;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public final byte[] readByteArray() throws IOException {
            return readRawBytes(readRawVarint32());
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public final ByteBuffer readByteBuffer() throws IOException {
            int rawVarint32 = readRawVarint32();
            if (rawVarint32 <= 0 || rawVarint32 > e()) {
                if (rawVarint32 == 0) {
                    return Internal.EMPTY_BYTE_BUFFER;
                }
                if (rawVarint32 < 0) {
                    throw InvalidProtocolBufferException.f();
                }
                throw InvalidProtocolBufferException.i();
            }
            if (this.f20844f || !this.m) {
                byte[] bArr = new byte[rawVarint32];
                long j10 = rawVarint32;
                v0.f(this.f20847i, bArr, 0L, j10);
                this.f20847i += j10;
                return ByteBuffer.wrap(bArr);
            }
            long j11 = this.f20847i;
            long j12 = rawVarint32;
            ByteBuffer byteBufferF = f(j11, j11 + j12);
            this.f20847i += j12;
            return byteBufferF;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public final ByteString readBytes() throws IOException {
            int rawVarint32 = readRawVarint32();
            if (rawVarint32 <= 0 || rawVarint32 > e()) {
                if (rawVarint32 == 0) {
                    return ByteString.EMPTY;
                }
                if (rawVarint32 < 0) {
                    throw InvalidProtocolBufferException.f();
                }
                throw InvalidProtocolBufferException.i();
            }
            if (this.f20844f && this.m) {
                long j10 = this.f20847i;
                long j11 = rawVarint32;
                ByteBuffer byteBufferF = f(j10, j10 + j11);
                this.f20847i += j11;
                return ByteString.e(byteBufferF);
            }
            byte[] bArr = new byte[rawVarint32];
            long j12 = rawVarint32;
            v0.f(this.f20847i, bArr, 0L, j12);
            this.f20847i += j12;
            ByteString byteString = ByteString.EMPTY;
            return new ByteString.h(bArr);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public final double readDouble() throws IOException {
            return Double.longBitsToDouble(readRawLittleEndian64());
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public final int readEnum() throws IOException {
            return readRawVarint32();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public final int readFixed32() throws IOException {
            return readRawLittleEndian32();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public final long readFixed64() throws IOException {
            return readRawLittleEndian64();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public final float readFloat() throws IOException {
            return Float.intBitsToFloat(readRawLittleEndian32());
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public final void readGroup(int i10, MessageLite.Builder builder, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            int i11 = this.f20809a;
            if (i11 >= this.f20810b) {
                throw InvalidProtocolBufferException.h();
            }
            this.f20809a = i11 + 1;
            builder.mergeFrom(this, extensionRegistryLite);
            checkLastTagWas((i10 << 3) | 4);
            this.f20809a--;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public final int readInt32() throws IOException {
            return readRawVarint32();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public final long readInt64() throws IOException {
            return readRawVarint64();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public final void readMessage(MessageLite.Builder builder, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            int rawVarint32 = readRawVarint32();
            if (this.f20809a >= this.f20810b) {
                throw InvalidProtocolBufferException.h();
            }
            int iPushLimit = pushLimit(rawVarint32);
            this.f20809a++;
            builder.mergeFrom(this, extensionRegistryLite);
            checkLastTagWas(0);
            this.f20809a--;
            popLimit(iPushLimit);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public final byte readRawByte() throws IOException {
            long j10 = this.f20847i;
            if (j10 == this.f20846h) {
                throw InvalidProtocolBufferException.i();
            }
            this.f20847i = 1 + j10;
            return v0.f21151d.f(j10);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public final byte[] readRawBytes(int i10) throws IOException {
            if (i10 < 0 || i10 > e()) {
                if (i10 > 0) {
                    throw InvalidProtocolBufferException.i();
                }
                if (i10 == 0) {
                    return Internal.EMPTY_BYTE_ARRAY;
                }
                throw InvalidProtocolBufferException.f();
            }
            byte[] bArr = new byte[i10];
            long j10 = this.f20847i;
            long j11 = i10;
            f(j10, j10 + j11).get(bArr);
            this.f20847i += j11;
            return bArr;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public final int readRawLittleEndian32() throws IOException {
            long j10 = this.f20847i;
            if (this.f20846h - j10 < 4) {
                throw InvalidProtocolBufferException.i();
            }
            this.f20847i = 4 + j10;
            v0.e eVar = v0.f21151d;
            return ((eVar.f(j10 + 3) & 255) << 24) | (eVar.f(j10) & 255) | ((eVar.f(1 + j10) & 255) << 8) | ((eVar.f(2 + j10) & 255) << 16);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public final long readRawLittleEndian64() throws IOException {
            long j10 = this.f20847i;
            if (this.f20846h - j10 < 8) {
                throw InvalidProtocolBufferException.i();
            }
            this.f20847i = 8 + j10;
            v0.e eVar = v0.f21151d;
            return ((((long) eVar.f(j10 + 7)) & 255) << 56) | (((long) eVar.f(j10)) & 255) | ((((long) eVar.f(1 + j10)) & 255) << 8) | ((((long) eVar.f(2 + j10)) & 255) << 16) | ((((long) eVar.f(3 + j10)) & 255) << 24) | ((((long) eVar.f(4 + j10)) & 255) << 32) | ((((long) eVar.f(5 + j10)) & 255) << 40) | ((((long) eVar.f(6 + j10)) & 255) << 48);
        }

        /* JADX WARN: Code duplicated, block: B:36:0x0099 A[PHI: r6
          0x0099: PHI (r6v7 long) = (r6v6 long), (r6v8 long), (r6v10 long) binds: [B:25:0x006d, B:29:0x0080, B:33:0x0091] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code restructure failed: missing block: B:33:0x0091, code lost:
        
            if (r4.f(r8) < 0) goto L34;
         */
        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final int readRawVarint32() throws java.io.IOException {
            /*
                r12 = this;
                long r0 = r12.f20847i
                long r2 = r12.f20846h
                int r2 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
                if (r2 != 0) goto La
                goto L93
            La:
                r2 = 1
                long r2 = r2 + r0
                androidx.datastore.preferences.protobuf.v0$e r4 = androidx.datastore.preferences.protobuf.v0.f21151d
                byte r5 = r4.f(r0)
                if (r5 < 0) goto L18
                r12.f20847i = r2
                return r5
            L18:
                long r6 = r12.f20846h
                long r6 = r6 - r2
                r8 = 9
                int r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
                if (r6 >= 0) goto L23
                goto L93
            L23:
                r6 = 2
                long r6 = r6 + r0
                byte r2 = r4.f(r2)
                int r2 = r2 << 7
                r2 = r2 ^ r5
                if (r2 >= 0) goto L33
                r0 = r2 ^ (-128(0xffffffffffffff80, float:NaN))
                goto La0
            L33:
                r10 = 3
                long r10 = r10 + r0
                byte r3 = r4.f(r6)
                int r3 = r3 << 14
                r2 = r2 ^ r3
                if (r2 < 0) goto L43
                r0 = r2 ^ 16256(0x3f80, float:2.278E-41)
            L41:
                r6 = r10
                goto La0
            L43:
                r5 = 4
                long r6 = r0 + r5
                byte r3 = r4.f(r10)
                int r3 = r3 << 21
                r2 = r2 ^ r3
                if (r2 >= 0) goto L55
                r0 = -2080896(0xffffffffffe03f80, float:NaN)
                r0 = r0 ^ r2
                goto La0
            L55:
                r10 = 5
                long r10 = r10 + r0
                byte r3 = r4.f(r6)
                int r5 = r3 << 28
                r2 = r2 ^ r5
                r5 = 266354560(0xfe03f80, float:2.2112565E-29)
                r2 = r2 ^ r5
                if (r3 >= 0) goto L9e
                r5 = 6
                long r6 = r0 + r5
                byte r3 = r4.f(r10)
                if (r3 >= 0) goto L99
                r10 = 7
                long r10 = r10 + r0
                byte r3 = r4.f(r6)
                if (r3 >= 0) goto L9e
                r5 = 8
                long r6 = r0 + r5
                byte r3 = r4.f(r10)
                if (r3 >= 0) goto L99
                long r8 = r8 + r0
                byte r3 = r4.f(r6)
                if (r3 >= 0) goto L9b
                r5 = 10
                long r6 = r0 + r5
                byte r0 = r4.f(r8)
                if (r0 >= 0) goto L99
            L93:
                long r0 = r12.c()
                int r0 = (int) r0
                return r0
            L99:
                r0 = r2
                goto La0
            L9b:
                r0 = r2
                r6 = r8
                goto La0
            L9e:
                r0 = r2
                goto L41
            La0:
                r12.f20847i = r6
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.CodedInputStream.d.readRawVarint32():int");
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public final long readRawVarint64() throws IOException {
            long j10;
            long j11;
            long j12;
            int i10;
            long j13 = this.f20847i;
            if (this.f20846h != j13) {
                long j14 = 1 + j13;
                v0.e eVar = v0.f21151d;
                byte bF = eVar.f(j13);
                if (bF >= 0) {
                    this.f20847i = j14;
                    return bF;
                }
                if (this.f20846h - j14 >= 9) {
                    long j15 = 2 + j13;
                    int iF = (eVar.f(j14) << 7) ^ bF;
                    if (iF >= 0) {
                        long j16 = 3 + j13;
                        int iF2 = iF ^ (eVar.f(j15) << Constants.CVR_B1b41_1110_ONLINE_PIN);
                        if (iF2 < 0) {
                            j15 = j13 + 4;
                            int iF3 = iF2 ^ (eVar.f(j16) << MessageUtils.MESSAGE_21_NAK);
                            if (iF3 < 0) {
                                i10 = (-2080896) ^ iF3;
                            } else {
                                j16 = 5 + j13;
                                long jF = ((long) iF3) ^ (((long) eVar.f(j15)) << 28);
                                if (jF >= 0) {
                                    j12 = 266354560;
                                } else {
                                    long j17 = 6 + j13;
                                    long jF2 = jF ^ (((long) eVar.f(j16)) << 35);
                                    if (jF2 < 0) {
                                        j11 = -34093383808L;
                                    } else {
                                        j16 = 7 + j13;
                                        jF = jF2 ^ (((long) eVar.f(j17)) << 42);
                                        if (jF >= 0) {
                                            j12 = 4363953127296L;
                                        } else {
                                            j17 = 8 + j13;
                                            jF2 = jF ^ (((long) eVar.f(j16)) << 49);
                                            if (jF2 < 0) {
                                                j11 = -558586000294016L;
                                            } else {
                                                long j18 = j13 + 9;
                                                long jF3 = (jF2 ^ (((long) eVar.f(j17)) << 56)) ^ 71499008037633920L;
                                                if (jF3 < 0) {
                                                    long j19 = j13 + 10;
                                                    if (eVar.f(j18) >= 0) {
                                                        j15 = j19;
                                                        j10 = jF3;
                                                    }
                                                } else {
                                                    j10 = jF3;
                                                    j15 = j18;
                                                }
                                            }
                                        }
                                    }
                                    j10 = j11 ^ jF2;
                                    j15 = j17;
                                }
                                j10 = j12 ^ jF;
                            }
                            this.f20847i = j15;
                            return j10;
                        }
                        j10 = iF2 ^ 16256;
                        j15 = j16;
                        this.f20847i = j15;
                        return j10;
                    }
                    i10 = iF ^ (-128);
                    j10 = i10;
                    this.f20847i = j15;
                    return j10;
                }
            }
            return c();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public final int readSFixed32() throws IOException {
            return readRawLittleEndian32();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public final long readSFixed64() throws IOException {
            return readRawLittleEndian64();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public final int readSInt32() throws IOException {
            return CodedInputStream.decodeZigZag32(readRawVarint32());
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public final long readSInt64() throws IOException {
            return CodedInputStream.decodeZigZag64(readRawVarint64());
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public final String readString() throws IOException {
            int rawVarint32 = readRawVarint32();
            if (rawVarint32 <= 0 || rawVarint32 > e()) {
                if (rawVarint32 == 0) {
                    return "";
                }
                if (rawVarint32 < 0) {
                    throw InvalidProtocolBufferException.f();
                }
                throw InvalidProtocolBufferException.i();
            }
            byte[] bArr = new byte[rawVarint32];
            long j10 = rawVarint32;
            v0.f(this.f20847i, bArr, 0L, j10);
            String str = new String(bArr, Internal.f20943a);
            this.f20847i += j10;
            return str;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public final String readStringRequireUtf8() throws IOException {
            int rawVarint32 = readRawVarint32();
            if (rawVarint32 > 0 && rawVarint32 <= e()) {
                String strC = w0.c(this.f20843e, (int) (this.f20847i - this.f20845g), rawVarint32);
                this.f20847i += (long) rawVarint32;
                return strC;
            }
            if (rawVarint32 == 0) {
                return "";
            }
            if (rawVarint32 <= 0) {
                throw InvalidProtocolBufferException.f();
            }
            throw InvalidProtocolBufferException.i();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public final int readTag() throws IOException {
            if (isAtEnd()) {
                this.f20850l = 0;
                return 0;
            }
            int rawVarint32 = readRawVarint32();
            this.f20850l = rawVarint32;
            if (WireFormat.getTagFieldNumber(rawVarint32) != 0) {
                return this.f20850l;
            }
            throw InvalidProtocolBufferException.b();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public final int readUInt32() throws IOException {
            return readRawVarint32();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public final long readUInt64() throws IOException {
            return readRawVarint64();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        @Deprecated
        public final void readUnknownGroup(int i10, MessageLite.Builder builder) throws IOException {
            readGroup(i10, builder, ExtensionRegistryLite.getEmptyRegistry());
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public final void resetSizeCounter() {
            this.f20848j = this.f20847i;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public final boolean skipField(int i10) throws IOException {
            int tagWireType = WireFormat.getTagWireType(i10);
            int i11 = 0;
            if (tagWireType == 0) {
                if (e() < 10) {
                    while (i11 < 10) {
                        if (readRawByte() < 0) {
                            i11++;
                        }
                    }
                    throw InvalidProtocolBufferException.e();
                }
                while (i11 < 10) {
                    long j10 = this.f20847i;
                    this.f20847i = 1 + j10;
                    if (v0.f21151d.f(j10) < 0) {
                        i11++;
                    }
                }
                throw InvalidProtocolBufferException.e();
                return true;
            }
            if (tagWireType == 1) {
                skipRawBytes(8);
                return true;
            }
            if (tagWireType == 2) {
                skipRawBytes(readRawVarint32());
                return true;
            }
            if (tagWireType == 3) {
                skipMessage();
                checkLastTagWas((WireFormat.getTagFieldNumber(i10) << 3) | 4);
                return true;
            }
            if (tagWireType == 4) {
                return false;
            }
            if (tagWireType != 5) {
                throw InvalidProtocolBufferException.d();
            }
            skipRawBytes(4);
            return true;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public final void skipMessage() throws IOException {
            int tag;
            do {
                tag = readTag();
                if (tag == 0) {
                    return;
                }
            } while (skipField(tag));
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public final void skipRawBytes(int i10) throws IOException {
            if (i10 >= 0 && i10 <= e()) {
                this.f20847i += (long) i10;
            } else {
                if (i10 >= 0) {
                    throw InvalidProtocolBufferException.i();
                }
                throw InvalidProtocolBufferException.f();
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public final void skipMessage(CodedOutputStream codedOutputStream) throws IOException {
            int tag;
            do {
                tag = readTag();
                if (tag == 0) {
                    return;
                }
            } while (skipField(tag, codedOutputStream));
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public final <T extends MessageLite> T readGroup(int i10, Parser<T> parser, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            int i11 = this.f20809a;
            if (i11 < this.f20810b) {
                this.f20809a = i11 + 1;
                T partialFrom = parser.parsePartialFrom(this, extensionRegistryLite);
                checkLastTagWas((i10 << 3) | 4);
                this.f20809a--;
                return partialFrom;
            }
            throw InvalidProtocolBufferException.h();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public final <T extends MessageLite> T readMessage(Parser<T> parser, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            int rawVarint32 = readRawVarint32();
            if (this.f20809a < this.f20810b) {
                int iPushLimit = pushLimit(rawVarint32);
                this.f20809a++;
                T partialFrom = parser.parsePartialFrom(this, extensionRegistryLite);
                checkLastTagWas(0);
                this.f20809a--;
                popLimit(iPushLimit);
                return partialFrom;
            }
            throw InvalidProtocolBufferException.h();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public final boolean skipField(int i10, CodedOutputStream codedOutputStream) throws IOException {
            int tagWireType = WireFormat.getTagWireType(i10);
            if (tagWireType == 0) {
                long rawVarint64 = readRawVarint64();
                codedOutputStream.writeRawVarint32(i10);
                codedOutputStream.writeUInt64NoTag(rawVarint64);
                return true;
            }
            if (tagWireType == 1) {
                long rawLittleEndian64 = readRawLittleEndian64();
                codedOutputStream.writeRawVarint32(i10);
                codedOutputStream.writeFixed64NoTag(rawLittleEndian64);
                return true;
            }
            if (tagWireType == 2) {
                ByteString bytes = readBytes();
                codedOutputStream.writeRawVarint32(i10);
                codedOutputStream.writeBytesNoTag(bytes);
                return true;
            }
            if (tagWireType == 3) {
                codedOutputStream.writeRawVarint32(i10);
                skipMessage(codedOutputStream);
                int tagFieldNumber = (WireFormat.getTagFieldNumber(i10) << 3) | 4;
                checkLastTagWas(tagFieldNumber);
                codedOutputStream.writeRawVarint32(tagFieldNumber);
                return true;
            }
            if (tagWireType == 4) {
                return false;
            }
            if (tagWireType == 5) {
                int rawLittleEndian32 = readRawLittleEndian32();
                codedOutputStream.writeRawVarint32(i10);
                codedOutputStream.writeFixed32NoTag(rawLittleEndian32);
                return true;
            }
            throw InvalidProtocolBufferException.d();
        }
    }

    public static CodedInputStream newInstance(InputStream inputStream, int i10) {
        if (i10 > 0) {
            return inputStream == null ? newInstance(Internal.EMPTY_BYTE_ARRAY) : new c(inputStream, i10);
        }
        throw new IllegalArgumentException("bufferSize must be > 0");
    }

    public static CodedInputStream newInstance(Iterable<ByteBuffer> iterable) {
        if (!v0.f21152e) {
            return newInstance(new r(iterable));
        }
        int i10 = 0;
        int iRemaining = 0;
        for (ByteBuffer byteBuffer : iterable) {
            iRemaining += byteBuffer.remaining();
            if (byteBuffer.hasArray()) {
                i10 |= 1;
            } else {
                i10 = byteBuffer.isDirect() ? i10 | 2 : i10 | 4;
            }
        }
        if (i10 == 2) {
            b bVar = new b();
            bVar.f20828l = Integer.MAX_VALUE;
            bVar.f20826j = iRemaining;
            bVar.f20821e = iterable;
            bVar.f20822f = iterable.iterator();
            bVar.f20824h = false;
            bVar.f20829n = 0;
            bVar.f20830o = 0;
            if (iRemaining == 0) {
                bVar.f20823g = Internal.EMPTY_BYTE_BUFFER;
                bVar.f20831p = 0L;
                bVar.f20832q = 0L;
                bVar.f20834s = 0L;
                bVar.f20833r = 0L;
                return bVar;
            }
            bVar.i();
            return bVar;
        }
        return newInstance(new r(iterable));
    }

    public static CodedInputStream newInstance(byte[] bArr) {
        return newInstance(bArr, 0, bArr.length);
    }

    public static CodedInputStream newInstance(byte[] bArr, int i10, int i11) {
        return a(bArr, i10, i11, false);
    }

    public static CodedInputStream newInstance(ByteBuffer byteBuffer) {
        return b(byteBuffer, false);
    }
}
