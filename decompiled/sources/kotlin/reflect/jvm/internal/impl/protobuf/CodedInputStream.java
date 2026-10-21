package kotlin.reflect.jvm.internal.impl.protobuf;

import androidx.core.view.accessibility.AccessibilityEventCompat;
import com.bbva.tohu.android.product.valkyria.sdk.payments.paywave.Constants;
import com.vierge.pinpadsdk.message.base.MessageUtils;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes12.dex */
public final class CodedInputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f81372a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f81373b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f81374c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f81375d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final InputStream f81376e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f81377f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f81378g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f81379h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f81380i;

    public CodedInputStream(InputStream inputStream) {
        this.f81379h = Integer.MAX_VALUE;
        this.f81372a = new byte[4096];
        this.f81373b = 0;
        this.f81375d = 0;
        this.f81378g = 0;
        this.f81376e = inputStream;
    }

    public static int decodeZigZag32(int i10) {
        return (-(i10 & 1)) ^ (i10 >>> 1);
    }

    public static long decodeZigZag64(long j10) {
        return (-(j10 & 1)) ^ (j10 >>> 1);
    }

    public static CodedInputStream newInstance(InputStream inputStream) {
        return new CodedInputStream(inputStream);
    }

    public final byte[] a(int i10) throws IOException {
        if (i10 <= 0) {
            if (i10 == 0) {
                return Internal.EMPTY_BYTE_ARRAY;
            }
            throw new InvalidProtocolBufferException("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        int i11 = this.f81378g;
        int i12 = this.f81375d;
        int i13 = i11 + i12 + i10;
        int i14 = this.f81379h;
        if (i13 > i14) {
            skipRawBytes((i14 - i11) - i12);
            throw InvalidProtocolBufferException.a();
        }
        byte[] bArr = this.f81372a;
        if (i10 < 4096) {
            byte[] bArr2 = new byte[i10];
            int i15 = this.f81373b - i12;
            System.arraycopy(bArr, i12, bArr2, 0, i15);
            int i16 = this.f81373b;
            this.f81375d = i16;
            int i17 = i10 - i15;
            if (i16 - i16 < i17) {
                d(i17);
            }
            System.arraycopy(bArr, 0, bArr2, i15, i17);
            this.f81375d = i17;
            return bArr2;
        }
        int i18 = this.f81373b;
        this.f81378g = i11 + i18;
        this.f81375d = 0;
        this.f81373b = 0;
        int length = i18 - i12;
        int i19 = i10 - length;
        ArrayList<byte[]> arrayList = new ArrayList();
        while (i19 > 0) {
            int iMin = Math.min(i19, 4096);
            byte[] bArr3 = new byte[iMin];
            int i20 = 0;
            while (i20 < iMin) {
                InputStream inputStream = this.f81376e;
                int i21 = inputStream == null ? -1 : inputStream.read(bArr3, i20, iMin - i20);
                if (i21 == -1) {
                    throw InvalidProtocolBufferException.a();
                }
                this.f81378g += i21;
                i20 += i21;
            }
            i19 -= iMin;
            arrayList.add(bArr3);
        }
        byte[] bArr4 = new byte[i10];
        System.arraycopy(bArr, i12, bArr4, 0, length);
        for (byte[] bArr5 : arrayList) {
            System.arraycopy(bArr5, 0, bArr4, length, bArr5.length);
            length += bArr5.length;
        }
        return bArr4;
    }

    public final long b() throws IOException {
        long j10 = 0;
        for (int i10 = 0; i10 < 64; i10 += 7) {
            byte rawByte = readRawByte();
            j10 |= ((long) (rawByte & 127)) << i10;
            if ((rawByte & 128) == 0) {
                return j10;
            }
        }
        throw new InvalidProtocolBufferException("CodedInputStream encountered a malformed varint.");
    }

    public final void c() {
        int i10 = this.f81373b + this.f81374c;
        this.f81373b = i10;
        int i11 = this.f81378g + i10;
        int i12 = this.f81379h;
        if (i11 <= i12) {
            this.f81374c = 0;
            return;
        }
        int i13 = i11 - i12;
        this.f81374c = i13;
        this.f81373b = i10 - i13;
    }

    public void checkLastTagWas(int i10) throws InvalidProtocolBufferException {
        if (this.f81377f != i10) {
            throw new InvalidProtocolBufferException("Protocol message end-group tag did not match expected tag.");
        }
    }

    public final void d(int i10) throws IOException {
        if (!e(i10)) {
            throw InvalidProtocolBufferException.a();
        }
    }

    public final boolean e(int i10) throws IOException {
        InputStream inputStream;
        int i11 = this.f81375d;
        int i12 = i11 + i10;
        int i13 = this.f81373b;
        if (i12 <= i13) {
            StringBuilder sb2 = new StringBuilder(77);
            sb2.append("refillBuffer() called when ");
            sb2.append(i10);
            sb2.append(" bytes were already available in buffer");
            throw new IllegalStateException(sb2.toString());
        }
        if (this.f81378g + i11 + i10 <= this.f81379h && (inputStream = this.f81376e) != null) {
            byte[] bArr = this.f81372a;
            if (i11 > 0) {
                if (i13 > i11) {
                    System.arraycopy(bArr, i11, bArr, 0, i13 - i11);
                }
                this.f81378g += i11;
                this.f81373b -= i11;
                this.f81375d = 0;
            }
            int i14 = this.f81373b;
            int i15 = inputStream.read(bArr, i14, bArr.length - i14);
            if (i15 == 0 || i15 < -1 || i15 > bArr.length) {
                StringBuilder sb3 = new StringBuilder(102);
                sb3.append("InputStream#read(byte[]) returned invalid result: ");
                sb3.append(i15);
                sb3.append("\nThe InputStream implementation is buggy.");
                throw new IllegalStateException(sb3.toString());
            }
            if (i15 > 0) {
                this.f81373b += i15;
                if ((this.f81378g + i10) - AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL > 0) {
                    throw new InvalidProtocolBufferException("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
                }
                c();
                if (this.f81373b >= i10) {
                    return true;
                }
                return e(i10);
            }
        }
        return false;
    }

    public int getBytesUntilLimit() {
        int i10 = this.f81379h;
        if (i10 == Integer.MAX_VALUE) {
            return -1;
        }
        return i10 - (this.f81378g + this.f81375d);
    }

    public boolean isAtEnd() throws IOException {
        return this.f81375d == this.f81373b && !e(1);
    }

    public void popLimit(int i10) {
        this.f81379h = i10;
        c();
    }

    public int pushLimit(int i10) throws InvalidProtocolBufferException {
        if (i10 < 0) {
            throw new InvalidProtocolBufferException("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        int i11 = this.f81378g + this.f81375d + i10;
        int i12 = this.f81379h;
        if (i11 > i12) {
            throw InvalidProtocolBufferException.a();
        }
        this.f81379h = i11;
        c();
        return i12;
    }

    public boolean readBool() throws IOException {
        return readRawVarint64() != 0;
    }

    public ByteString readBytes() throws IOException {
        int rawVarint32 = readRawVarint32();
        int i10 = this.f81373b;
        int i11 = this.f81375d;
        if (rawVarint32 > i10 - i11 || rawVarint32 <= 0) {
            return rawVarint32 == 0 ? ByteString.EMPTY : new a(a(rawVarint32));
        }
        ByteString byteStringCopyFrom = ByteString.copyFrom(this.f81372a, i11, rawVarint32);
        this.f81375d += rawVarint32;
        return byteStringCopyFrom;
    }

    public double readDouble() throws IOException {
        return Double.longBitsToDouble(readRawLittleEndian64());
    }

    public int readEnum() throws IOException {
        return readRawVarint32();
    }

    public int readFixed32() throws IOException {
        return readRawLittleEndian32();
    }

    public long readFixed64() throws IOException {
        return readRawLittleEndian64();
    }

    public float readFloat() throws IOException {
        return Float.intBitsToFloat(readRawLittleEndian32());
    }

    public void readGroup(int i10, MessageLite.Builder builder, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        int i11 = this.f81380i;
        if (i11 >= 64) {
            throw new InvalidProtocolBufferException("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
        }
        this.f81380i = i11 + 1;
        builder.mergeFrom(this, extensionRegistryLite);
        checkLastTagWas((i10 << 3) | 4);
        this.f81380i--;
    }

    public int readInt32() throws IOException {
        return readRawVarint32();
    }

    public long readInt64() throws IOException {
        return readRawVarint64();
    }

    public void readMessage(MessageLite.Builder builder, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        int rawVarint32 = readRawVarint32();
        if (this.f81380i >= 64) {
            throw new InvalidProtocolBufferException("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
        }
        int iPushLimit = pushLimit(rawVarint32);
        this.f81380i++;
        builder.mergeFrom(this, extensionRegistryLite);
        checkLastTagWas(0);
        this.f81380i--;
        popLimit(iPushLimit);
    }

    public byte readRawByte() throws IOException {
        if (this.f81375d == this.f81373b) {
            d(1);
        }
        int i10 = this.f81375d;
        this.f81375d = i10 + 1;
        return this.f81372a[i10];
    }

    public int readRawLittleEndian32() throws IOException {
        int i10 = this.f81375d;
        if (this.f81373b - i10 < 4) {
            d(4);
            i10 = this.f81375d;
        }
        this.f81375d = i10 + 4;
        byte[] bArr = this.f81372a;
        return ((bArr[i10 + 3] & 255) << 24) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16);
    }

    public long readRawLittleEndian64() throws IOException {
        int i10 = this.f81375d;
        if (this.f81373b - i10 < 8) {
            d(8);
            i10 = this.f81375d;
        }
        this.f81375d = i10 + 8;
        byte[] bArr = this.f81372a;
        return ((((long) bArr[i10 + 7]) & 255) << 56) | (((long) bArr[i10]) & 255) | ((((long) bArr[i10 + 1]) & 255) << 8) | ((((long) bArr[i10 + 2]) & 255) << 16) | ((((long) bArr[i10 + 3]) & 255) << 24) | ((((long) bArr[i10 + 4]) & 255) << 32) | ((((long) bArr[i10 + 5]) & 255) << 40) | ((((long) bArr[i10 + 6]) & 255) << 48);
    }

    public int readRawVarint32() throws IOException {
        int i10;
        int i11 = this.f81375d;
        int i12 = this.f81373b;
        if (i12 != i11) {
            int i13 = i11 + 1;
            byte[] bArr = this.f81372a;
            byte b10 = bArr[i11];
            if (b10 >= 0) {
                this.f81375d = i13;
                return b10;
            }
            if (i12 - i13 >= 9) {
                int i14 = i11 + 2;
                int i15 = (bArr[i13] << 7) ^ b10;
                long j10 = i15;
                if (j10 < 0) {
                    i10 = (int) ((-128) ^ j10);
                } else {
                    int i16 = i11 + 3;
                    int i17 = (bArr[i14] << Constants.CVR_B1b41_1110_ONLINE_PIN) ^ i15;
                    long j11 = i17;
                    if (j11 >= 0) {
                        i10 = (int) (16256 ^ j11);
                    } else {
                        int i18 = i11 + 4;
                        int i19 = i17 ^ (bArr[i16] << MessageUtils.MESSAGE_21_NAK);
                        long j12 = i19;
                        if (j12 < 0) {
                            i10 = (int) ((-2080896) ^ j12);
                        } else {
                            i16 = i11 + 5;
                            byte b11 = bArr[i18];
                            int i20 = (int) (((long) (i19 ^ (b11 << 28))) ^ 266354560);
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
                this.f81375d = i14;
                return i10;
            }
        }
        return (int) b();
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x00b6, code lost:
    
        if (r3[r2] < 0) goto L39;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public long readRawVarint64() throws java.io.IOException {
        /*
            r12 = this;
            int r0 = r12.f81375d
            int r1 = r12.f81373b
            if (r1 != r0) goto L8
            goto Lb8
        L8:
            int r2 = r0 + 1
            byte[] r3 = r12.f81372a
            r4 = r3[r0]
            if (r4 < 0) goto L14
            r12.f81375d = r2
            long r0 = (long) r4
            return r0
        L14:
            int r1 = r1 - r2
            r5 = 9
            if (r1 >= r5) goto L1b
            goto Lb8
        L1b:
            int r1 = r0 + 2
            r2 = r3[r2]
            int r2 = r2 << 7
            r2 = r2 ^ r4
            long r4 = (long) r2
            r6 = 0
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r2 >= 0) goto L2e
            r2 = -128(0xffffffffffffff80, double:NaN)
        L2b:
            long r2 = r2 ^ r4
            goto Lc1
        L2e:
            int r2 = r0 + 3
            r1 = r3[r1]
            int r1 = r1 << 14
            long r8 = (long) r1
            long r4 = r4 ^ r8
            int r1 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r1 < 0) goto L42
            r0 = 16256(0x3f80, double:8.0315E-320)
        L3c:
            long r0 = r0 ^ r4
            r10 = r0
            r1 = r2
            r2 = r10
            goto Lc1
        L42:
            int r1 = r0 + 4
            r2 = r3[r2]
            int r2 = r2 << 21
            long r8 = (long) r2
            long r4 = r4 ^ r8
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r2 >= 0) goto L52
            r2 = -2080896(0xffffffffffe03f80, double:NaN)
            goto L2b
        L52:
            int r2 = r0 + 5
            r1 = r3[r1]
            long r8 = (long) r1
            r1 = 28
            long r8 = r8 << r1
            long r4 = r4 ^ r8
            int r1 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r1 < 0) goto L63
            r0 = 266354560(0xfe03f80, double:1.315966377E-315)
            goto L3c
        L63:
            int r1 = r0 + 6
            r2 = r3[r2]
            long r8 = (long) r2
            r2 = 35
            long r8 = r8 << r2
            long r4 = r4 ^ r8
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r2 >= 0) goto L76
            r2 = -34093383808(0xfffffff80fe03f80, double:NaN)
            goto L2b
        L76:
            int r2 = r0 + 7
            r1 = r3[r1]
            long r8 = (long) r1
            r1 = 42
            long r8 = r8 << r1
            long r4 = r4 ^ r8
            int r1 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r1 < 0) goto L89
            r0 = 4363953127296(0x3f80fe03f80, double:2.1560793202584E-311)
            goto L3c
        L89:
            int r1 = r0 + 8
            r2 = r3[r2]
            long r8 = (long) r2
            r2 = 49
            long r8 = r8 << r2
            long r4 = r4 ^ r8
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r2 >= 0) goto L9c
            r2 = -558586000294016(0xfffe03f80fe03f80, double:NaN)
            goto L2b
        L9c:
            int r2 = r0 + 9
            r1 = r3[r1]
            long r8 = (long) r1
            r1 = 56
            long r8 = r8 << r1
            long r4 = r4 ^ r8
            r8 = 71499008037633920(0xfe03f80fe03f80, double:6.838959413692434E-304)
            long r4 = r4 ^ r8
            int r1 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r1 >= 0) goto Lbf
            int r1 = r0 + 10
            r0 = r3[r2]
            long r2 = (long) r0
            int r0 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r0 >= 0) goto Lbd
        Lb8:
            long r0 = r12.b()
            return r0
        Lbd:
            r2 = r4
            goto Lc1
        Lbf:
            r1 = r2
            goto Lbd
        Lc1:
            r12.f81375d = r1
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream.readRawVarint64():long");
    }

    public int readSFixed32() throws IOException {
        return readRawLittleEndian32();
    }

    public long readSFixed64() throws IOException {
        return readRawLittleEndian64();
    }

    public int readSInt32() throws IOException {
        return decodeZigZag32(readRawVarint32());
    }

    public long readSInt64() throws IOException {
        return decodeZigZag64(readRawVarint64());
    }

    public String readString() throws IOException {
        int rawVarint32 = readRawVarint32();
        int i10 = this.f81373b;
        int i11 = this.f81375d;
        if (rawVarint32 > i10 - i11 || rawVarint32 <= 0) {
            return rawVarint32 == 0 ? "" : new String(a(rawVarint32), "UTF-8");
        }
        String str = new String(this.f81372a, i11, rawVarint32, "UTF-8");
        this.f81375d += rawVarint32;
        return str;
    }

    public String readStringRequireUtf8() throws IOException {
        byte[] bArrA;
        int rawVarint32 = readRawVarint32();
        int i10 = this.f81375d;
        if (rawVarint32 <= this.f81373b - i10 && rawVarint32 > 0) {
            this.f81375d = i10 + rawVarint32;
            bArrA = this.f81372a;
        } else {
            if (rawVarint32 == 0) {
                return "";
            }
            bArrA = a(rawVarint32);
            i10 = 0;
        }
        if (e.isValidUtf8(bArrA, i10, i10 + rawVarint32)) {
            return new String(bArrA, i10, rawVarint32, "UTF-8");
        }
        throw new InvalidProtocolBufferException("Protocol message had invalid UTF-8.");
    }

    public int readTag() throws IOException {
        if (isAtEnd()) {
            this.f81377f = 0;
            return 0;
        }
        int rawVarint32 = readRawVarint32();
        this.f81377f = rawVarint32;
        if (WireFormat.getTagFieldNumber(rawVarint32) != 0) {
            return this.f81377f;
        }
        throw new InvalidProtocolBufferException("Protocol message contained an invalid tag (zero).");
    }

    public int readUInt32() throws IOException {
        return readRawVarint32();
    }

    public long readUInt64() throws IOException {
        return readRawVarint64();
    }

    public boolean skipField(int i10, CodedOutputStream codedOutputStream) throws IOException {
        int i11 = i10 & 7;
        if (i11 == 0) {
            long int64 = readInt64();
            codedOutputStream.writeRawVarint32(i10);
            codedOutputStream.writeUInt64NoTag(int64);
            return true;
        }
        if (i11 == 1) {
            long rawLittleEndian64 = readRawLittleEndian64();
            codedOutputStream.writeRawVarint32(i10);
            codedOutputStream.writeFixed64NoTag(rawLittleEndian64);
            return true;
        }
        if (i11 == 2) {
            ByteString bytes = readBytes();
            codedOutputStream.writeRawVarint32(i10);
            codedOutputStream.writeBytesNoTag(bytes);
            return true;
        }
        if (i11 == 3) {
            codedOutputStream.writeRawVarint32(i10);
            skipMessage(codedOutputStream);
            int tagFieldNumber = (WireFormat.getTagFieldNumber(i10) << 3) | 4;
            checkLastTagWas(tagFieldNumber);
            codedOutputStream.writeRawVarint32(tagFieldNumber);
            return true;
        }
        if (i11 == 4) {
            return false;
        }
        if (i11 != 5) {
            throw new InvalidProtocolBufferException("Protocol message tag had invalid wire type.");
        }
        int rawLittleEndian32 = readRawLittleEndian32();
        codedOutputStream.writeRawVarint32(i10);
        codedOutputStream.writeFixed32NoTag(rawLittleEndian32);
        return true;
    }

    public void skipMessage(CodedOutputStream codedOutputStream) throws IOException {
        int tag;
        do {
            tag = readTag();
            if (tag == 0) {
                return;
            }
        } while (skipField(tag, codedOutputStream));
    }

    public void skipRawBytes(int i10) throws IOException {
        int i11 = this.f81373b;
        int i12 = this.f81375d;
        int i13 = i11 - i12;
        if (i10 <= i13 && i10 >= 0) {
            this.f81375d = i12 + i10;
            return;
        }
        if (i10 < 0) {
            throw new InvalidProtocolBufferException("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        int i14 = this.f81378g;
        int i15 = i14 + i12 + i10;
        int i16 = this.f81379h;
        if (i15 > i16) {
            skipRawBytes((i16 - i14) - i12);
            throw InvalidProtocolBufferException.a();
        }
        this.f81375d = i11;
        d(1);
        while (true) {
            int i17 = i10 - i13;
            int i18 = this.f81373b;
            if (i17 <= i18) {
                this.f81375d = i17;
                return;
            } else {
                i13 += i18;
                this.f81375d = i18;
                d(1);
            }
        }
    }

    public CodedInputStream(a aVar) {
        this.f81379h = Integer.MAX_VALUE;
        this.f81372a = aVar.f81421p0;
        this.f81375d = 0;
        this.f81373b = aVar.size();
        this.f81378g = -this.f81375d;
        this.f81376e = null;
    }

    public <T extends MessageLite> T readMessage(Parser<T> parser, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        int rawVarint32 = readRawVarint32();
        if (this.f81380i < 64) {
            int iPushLimit = pushLimit(rawVarint32);
            this.f81380i++;
            T partialFrom = parser.parsePartialFrom(this, extensionRegistryLite);
            checkLastTagWas(0);
            this.f81380i--;
            popLimit(iPushLimit);
            return partialFrom;
        }
        throw new InvalidProtocolBufferException("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
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
                throw InvalidProtocolBufferException.a();
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
                throw InvalidProtocolBufferException.a();
            }
            if ((i14 & 128) == 0) {
                return i11;
            }
            i12 += 7;
        }
        throw new InvalidProtocolBufferException("CodedInputStream encountered a malformed varint.");
    }
}
