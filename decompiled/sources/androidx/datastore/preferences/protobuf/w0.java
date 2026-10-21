package androidx.datastore.preferences.protobuf;

import androidx.camera.camera2.internal.n1;
import com.bbva.tohu.android.product.valkyria.sdk.payments.paywave.Constants;
import com.mastercard.sonic.androidsvg.SvgConstantsKt;
import java.nio.ByteBuffer;
import okio.Utf8;

/* JADX INFO: compiled from: Utf8.java */
/* JADX INFO: loaded from: classes2.dex */
public final class w0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f21158a;

    /* JADX INFO: compiled from: Utf8.java */
    public static class a {
        public static void a(byte b10, byte b11, byte b12, byte b13, char[] cArr, int i10) throws InvalidProtocolBufferException {
            if (!e(b11)) {
                if ((((b11 + Constants.CVR_B1b85_0111_VERIFIED_CLOUD) + (b10 << 28)) >> 30) == 0 && !e(b12) && !e(b13)) {
                    int i11 = ((b10 & 7) << 18) | ((b11 & 63) << 12) | ((b12 & 63) << 6) | (b13 & 63);
                    cArr[i10] = (char) ((i11 >>> 10) + Utf8.HIGH_SURROGATE_HEADER);
                    cArr[i10 + 1] = (char) ((i11 & 1023) + 56320);
                    return;
                }
            }
            throw InvalidProtocolBufferException.c();
        }

        public static boolean b(byte b10) {
            return b10 >= 0;
        }

        public static void c(byte b10, byte b11, char[] cArr, int i10) throws InvalidProtocolBufferException {
            if (b10 < -62 || e(b11)) {
                throw InvalidProtocolBufferException.c();
            }
            cArr[i10] = (char) (((b10 & 31) << 6) | (b11 & 63));
        }

        public static void d(byte b10, byte b11, byte b12, char[] cArr, int i10) throws InvalidProtocolBufferException {
            if (e(b11) || ((b10 == -32 && b11 < -96) || ((b10 == -19 && b11 >= -96) || e(b12)))) {
                throw InvalidProtocolBufferException.c();
            }
            cArr[i10] = (char) (((b10 & 15) << 12) | ((b11 & 63) << 6) | (b12 & 63));
        }

        public static boolean e(byte b10) {
            return b10 > -65;
        }
    }

    /* JADX INFO: compiled from: Utf8.java */
    public static abstract class b {
        public static String b(ByteBuffer byteBuffer, int i10, int i11) throws InvalidProtocolBufferException {
            if ((i10 | i11 | ((byteBuffer.limit() - i10) - i11)) < 0) {
                throw new ArrayIndexOutOfBoundsException(String.format("buffer limit=%d, index=%d, limit=%d", Integer.valueOf(byteBuffer.limit()), Integer.valueOf(i10), Integer.valueOf(i11)));
            }
            int i12 = i10 + i11;
            char[] cArr = new char[i11];
            int i13 = 0;
            while (i10 < i12) {
                byte b10 = byteBuffer.get(i10);
                if (!a.b(b10)) {
                    break;
                }
                i10++;
                cArr[i13] = (char) b10;
                i13++;
            }
            int i14 = i13;
            while (i10 < i12) {
                int i15 = i10 + 1;
                byte b11 = byteBuffer.get(i10);
                if (a.b(b11)) {
                    int i16 = i14 + 1;
                    cArr[i14] = (char) b11;
                    while (i15 < i12) {
                        byte b12 = byteBuffer.get(i15);
                        if (!a.b(b12)) {
                            break;
                        }
                        i15++;
                        cArr[i16] = (char) b12;
                        i16++;
                    }
                    i14 = i16;
                    i10 = i15;
                } else if (b11 < -32) {
                    if (i15 >= i12) {
                        throw InvalidProtocolBufferException.c();
                    }
                    i10 += 2;
                    a.c(b11, byteBuffer.get(i15), cArr, i14);
                    i14++;
                } else if (b11 < -16) {
                    if (i15 >= i12 - 1) {
                        throw InvalidProtocolBufferException.c();
                    }
                    int i17 = i10 + 2;
                    i10 += 3;
                    a.d(b11, byteBuffer.get(i15), byteBuffer.get(i17), cArr, i14);
                    i14++;
                } else {
                    if (i15 >= i12 - 2) {
                        throw InvalidProtocolBufferException.c();
                    }
                    byte b13 = byteBuffer.get(i15);
                    int i18 = i10 + 3;
                    byte b14 = byteBuffer.get(i10 + 2);
                    i10 += 4;
                    a.a(b11, b13, b14, byteBuffer.get(i18), cArr, i14);
                    i14 += 2;
                }
            }
            return new String(cArr, 0, i14);
        }

        public static void e(CharSequence charSequence, ByteBuffer byteBuffer) {
            int length = charSequence.length();
            int iPosition = byteBuffer.position();
            int i10 = 0;
            while (i10 < length) {
                try {
                    char cCharAt = charSequence.charAt(i10);
                    if (cCharAt >= 128) {
                        break;
                    }
                    byteBuffer.put(iPosition + i10, (byte) cCharAt);
                    i10++;
                } catch (IndexOutOfBoundsException unused) {
                }
            }
            if (i10 == length) {
                byteBuffer.position(iPosition + i10);
                return;
            }
            iPosition += i10;
            while (i10 < length) {
                char cCharAt2 = charSequence.charAt(i10);
                if (cCharAt2 < 128) {
                    byteBuffer.put(iPosition, (byte) cCharAt2);
                } else if (cCharAt2 < 2048) {
                    int i11 = iPosition + 1;
                    try {
                        byteBuffer.put(iPosition, (byte) ((cCharAt2 >>> 6) | 192));
                        byteBuffer.put(i11, (byte) ((cCharAt2 & '?') | 128));
                        iPosition = i11;
                    } catch (IndexOutOfBoundsException unused2) {
                        iPosition = i11;
                    }
                } else {
                    if (cCharAt2 >= 55296 && 57343 >= cCharAt2) {
                        int i12 = i10 + 1;
                        if (i12 != length) {
                            try {
                                char cCharAt3 = charSequence.charAt(i12);
                                if (Character.isSurrogatePair(cCharAt2, cCharAt3)) {
                                    int codePoint = Character.toCodePoint(cCharAt2, cCharAt3);
                                    int i13 = iPosition + 1;
                                    try {
                                        byteBuffer.put(iPosition, (byte) ((codePoint >>> 18) | 240));
                                        int i14 = iPosition + 2;
                                        try {
                                            byteBuffer.put(i13, (byte) (((codePoint >>> 12) & 63) | 128));
                                            iPosition += 3;
                                            byteBuffer.put(i14, (byte) (((codePoint >>> 6) & 63) | 128));
                                            byteBuffer.put(iPosition, (byte) ((codePoint & 63) | 128));
                                            i10 = i12;
                                        } catch (IndexOutOfBoundsException unused3) {
                                            i10 = i12;
                                            iPosition = i14;
                                        }
                                    } catch (IndexOutOfBoundsException unused4) {
                                        iPosition = i13;
                                        i10 = i12;
                                    }
                                } else {
                                    i10 = i12;
                                }
                            } catch (IndexOutOfBoundsException unused5) {
                            }
                            i10 = i12;
                            throw new ArrayIndexOutOfBoundsException("Failed writing " + charSequence.charAt(i10) + " at index " + (Math.max(i10, (iPosition - byteBuffer.position()) + 1) + byteBuffer.position()));
                        }
                        throw new d(i10, length);
                    }
                    int i15 = iPosition + 1;
                    byteBuffer.put(iPosition, (byte) ((cCharAt2 >>> '\f') | 224));
                    iPosition += 2;
                    byteBuffer.put(i15, (byte) (((cCharAt2 >>> 6) & 63) | 128));
                    byteBuffer.put(iPosition, (byte) ((cCharAt2 & '?') | 128));
                }
                i10++;
                iPosition++;
            }
            byteBuffer.position(iPosition);
        }

        /* JADX WARN: Code restructure failed: missing block: B:28:0x0057, code lost:
        
            if (r18.get(r1) > (-65)) goto L29;
         */
        /* JADX WARN: Code restructure failed: missing block: B:49:0x009e, code lost:
        
            if (r18.get(r1) > (-65)) goto L50;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public static int j(java.nio.ByteBuffer r18, int r19, int r20, int r21) {
            /*
                Method dump skipped, instruction units count: 307
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.w0.b.j(java.nio.ByteBuffer, int, int, int):int");
        }

        public abstract String a(int i10, int i11, byte[] bArr) throws InvalidProtocolBufferException;

        public abstract String c(ByteBuffer byteBuffer, int i10, int i11) throws InvalidProtocolBufferException;

        public abstract int d(CharSequence charSequence, byte[] bArr, int i10, int i11);

        public abstract void f(CharSequence charSequence, ByteBuffer byteBuffer);

        public final boolean g(byte[] bArr, int i10, int i11) {
            return h(0, bArr, i10, i11) == 0;
        }

        public abstract int h(int i10, byte[] bArr, int i11, int i12);

        public final int i(ByteBuffer byteBuffer, int i10, int i11, int i12) {
            if (!byteBuffer.hasArray()) {
                return byteBuffer.isDirect() ? k(byteBuffer, i10, i11, i12) : j(byteBuffer, i10, i11, i12);
            }
            int iArrayOffset = byteBuffer.arrayOffset();
            return h(i10, byteBuffer.array(), i11 + iArrayOffset, iArrayOffset + i12);
        }

        public abstract int k(ByteBuffer byteBuffer, int i10, int i11, int i12);
    }

    /* JADX INFO: compiled from: Utf8.java */
    public static final class c extends b {
        @Override // androidx.datastore.preferences.protobuf.w0.b
        public final String a(int i10, int i11, byte[] bArr) throws InvalidProtocolBufferException {
            if ((i10 | i11 | ((bArr.length - i10) - i11)) < 0) {
                throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(bArr.length), Integer.valueOf(i10), Integer.valueOf(i11)));
            }
            int i12 = i10 + i11;
            char[] cArr = new char[i11];
            int i13 = 0;
            while (i10 < i12) {
                byte b10 = bArr[i10];
                if (!a.b(b10)) {
                    break;
                }
                i10++;
                cArr[i13] = (char) b10;
                i13++;
            }
            int i14 = i13;
            while (i10 < i12) {
                int i15 = i10 + 1;
                byte b11 = bArr[i10];
                if (a.b(b11)) {
                    int i16 = i14 + 1;
                    cArr[i14] = (char) b11;
                    while (i15 < i12) {
                        byte b12 = bArr[i15];
                        if (!a.b(b12)) {
                            break;
                        }
                        i15++;
                        cArr[i16] = (char) b12;
                        i16++;
                    }
                    i14 = i16;
                    i10 = i15;
                } else if (b11 < -32) {
                    if (i15 >= i12) {
                        throw InvalidProtocolBufferException.c();
                    }
                    i10 += 2;
                    a.c(b11, bArr[i15], cArr, i14);
                    i14++;
                } else if (b11 < -16) {
                    if (i15 >= i12 - 1) {
                        throw InvalidProtocolBufferException.c();
                    }
                    int i17 = i10 + 2;
                    i10 += 3;
                    a.d(b11, bArr[i15], bArr[i17], cArr, i14);
                    i14++;
                } else {
                    if (i15 >= i12 - 2) {
                        throw InvalidProtocolBufferException.c();
                    }
                    byte b13 = bArr[i15];
                    int i18 = i10 + 3;
                    byte b14 = bArr[i10 + 2];
                    i10 += 4;
                    a.a(b11, b13, b14, bArr[i18], cArr, i14);
                    i14 += 2;
                }
            }
            return new String(cArr, 0, i14);
        }

        @Override // androidx.datastore.preferences.protobuf.w0.b
        public final String c(ByteBuffer byteBuffer, int i10, int i11) throws InvalidProtocolBufferException {
            return b.b(byteBuffer, i10, i11);
        }

        @Override // androidx.datastore.preferences.protobuf.w0.b
        public final int d(CharSequence charSequence, byte[] bArr, int i10, int i11) {
            int i12;
            int i13;
            char cCharAt;
            int length = charSequence.length();
            int i14 = i11 + i10;
            int i15 = 0;
            while (i15 < length && (i13 = i15 + i10) < i14 && (cCharAt = charSequence.charAt(i15)) < 128) {
                bArr[i13] = (byte) cCharAt;
                i15++;
            }
            if (i15 == length) {
                return i10 + length;
            }
            int i16 = i10 + i15;
            while (i15 < length) {
                char cCharAt2 = charSequence.charAt(i15);
                if (cCharAt2 < 128 && i16 < i14) {
                    bArr[i16] = (byte) cCharAt2;
                    i16++;
                } else if (cCharAt2 < 2048 && i16 <= i14 - 2) {
                    int i17 = i16 + 1;
                    bArr[i16] = (byte) ((cCharAt2 >>> 6) | 960);
                    i16 += 2;
                    bArr[i17] = (byte) ((cCharAt2 & '?') | 128);
                } else {
                    if ((cCharAt2 >= 55296 && 57343 >= cCharAt2) || i16 > i14 - 3) {
                        if (i16 > i14 - 4) {
                            if (55296 <= cCharAt2 && cCharAt2 <= 57343 && ((i12 = i15 + 1) == charSequence.length() || !Character.isSurrogatePair(cCharAt2, charSequence.charAt(i12)))) {
                                throw new d(i15, length);
                            }
                            throw new ArrayIndexOutOfBoundsException("Failed writing " + cCharAt2 + " at index " + i16);
                        }
                        int i18 = i15 + 1;
                        if (i18 != charSequence.length()) {
                            char cCharAt3 = charSequence.charAt(i18);
                            if (Character.isSurrogatePair(cCharAt2, cCharAt3)) {
                                int codePoint = Character.toCodePoint(cCharAt2, cCharAt3);
                                bArr[i16] = (byte) ((codePoint >>> 18) | 240);
                                bArr[i16 + 1] = (byte) (((codePoint >>> 12) & 63) | 128);
                                int i19 = i16 + 3;
                                bArr[i16 + 2] = (byte) (((codePoint >>> 6) & 63) | 128);
                                i16 += 4;
                                bArr[i19] = (byte) ((codePoint & 63) | 128);
                                i15 = i18;
                            } else {
                                i15 = i18;
                            }
                        }
                        throw new d(i15 - 1, length);
                    }
                    bArr[i16] = (byte) ((cCharAt2 >>> '\f') | 480);
                    int i20 = i16 + 2;
                    bArr[i16 + 1] = (byte) (((cCharAt2 >>> 6) & 63) | 128);
                    i16 += 3;
                    bArr[i20] = (byte) ((cCharAt2 & '?') | 128);
                }
                i15++;
            }
            return i16;
        }

        @Override // androidx.datastore.preferences.protobuf.w0.b
        public final void f(CharSequence charSequence, ByteBuffer byteBuffer) {
            b.e(charSequence, byteBuffer);
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x001c, code lost:
        
            if (r13[r14] > (-65)) goto L13;
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x0047, code lost:
        
            if (r13[r14] > (-65)) goto L29;
         */
        /* JADX WARN: Code restructure failed: missing block: B:49:0x0082, code lost:
        
            if (r13[r14] > (-65)) goto L50;
         */
        @Override // androidx.datastore.preferences.protobuf.w0.b
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final int h(int r12, byte[] r13, int r14, int r15) {
            /*
                Method dump skipped, instruction units count: 244
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.w0.c.h(int, byte[], int, int):int");
        }

        @Override // androidx.datastore.preferences.protobuf.w0.b
        public final int k(ByteBuffer byteBuffer, int i10, int i11, int i12) {
            return b.j(byteBuffer, i10, i11, i12);
        }
    }

    /* JADX INFO: compiled from: Utf8.java */
    public static class d extends IllegalArgumentException {
        public d(int i10, int i11) {
            super(n1.e("Unpaired surrogate at index ", i10, " of ", i11));
        }
    }

    /* JADX INFO: compiled from: Utf8.java */
    public static final class e extends b {
        public static int l(int i10, int i11, long j10) {
            if (i11 == 0) {
                b bVar = w0.f21158a;
                if (i10 > -12) {
                    return -1;
                }
                return i10;
            }
            if (i11 == 1) {
                return w0.f(i10, v0.f21151d.f(j10));
            }
            if (i11 != 2) {
                throw new AssertionError();
            }
            v0.e eVar = v0.f21151d;
            return w0.g(i10, eVar.f(j10), eVar.f(j10 + 1));
        }

        public static int m(int i10, int i11, long j10, byte[] bArr) {
            if (i11 == 0) {
                b bVar = w0.f21158a;
                if (i10 > -12) {
                    return -1;
                }
                return i10;
            }
            if (i11 == 1) {
                return w0.f(i10, v0.h(j10, bArr));
            }
            if (i11 == 2) {
                return w0.g(i10, v0.h(j10, bArr), v0.h(j10 + 1, bArr));
            }
            throw new AssertionError();
        }

        @Override // androidx.datastore.preferences.protobuf.w0.b
        public final String a(int i10, int i11, byte[] bArr) throws InvalidProtocolBufferException {
            if ((i10 | i11 | ((bArr.length - i10) - i11)) < 0) {
                throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(bArr.length), Integer.valueOf(i10), Integer.valueOf(i11)));
            }
            int i12 = i10 + i11;
            char[] cArr = new char[i11];
            int i13 = 0;
            while (i10 < i12) {
                byte bH = v0.h(i10, bArr);
                if (!a.b(bH)) {
                    break;
                }
                i10++;
                cArr[i13] = (char) bH;
                i13++;
            }
            int i14 = i13;
            while (i10 < i12) {
                int i15 = i10 + 1;
                byte bH2 = v0.h(i10, bArr);
                if (a.b(bH2)) {
                    int i16 = i14 + 1;
                    cArr[i14] = (char) bH2;
                    while (i15 < i12) {
                        byte bH3 = v0.h(i15, bArr);
                        if (!a.b(bH3)) {
                            break;
                        }
                        i15++;
                        cArr[i16] = (char) bH3;
                        i16++;
                    }
                    i14 = i16;
                    i10 = i15;
                } else if (bH2 < -32) {
                    if (i15 >= i12) {
                        throw InvalidProtocolBufferException.c();
                    }
                    i10 += 2;
                    a.c(bH2, v0.h(i15, bArr), cArr, i14);
                    i14++;
                } else if (bH2 < -16) {
                    if (i15 >= i12 - 1) {
                        throw InvalidProtocolBufferException.c();
                    }
                    int i17 = i10 + 2;
                    i10 += 3;
                    a.d(bH2, v0.h(i15, bArr), v0.h(i17, bArr), cArr, i14);
                    i14++;
                } else {
                    if (i15 >= i12 - 2) {
                        throw InvalidProtocolBufferException.c();
                    }
                    byte bH4 = v0.h(i15, bArr);
                    int i18 = i10 + 3;
                    byte bH5 = v0.h(i10 + 2, bArr);
                    i10 += 4;
                    a.a(bH2, bH4, bH5, v0.h(i18, bArr), cArr, i14);
                    i14 += 2;
                }
            }
            return new String(cArr, 0, i14);
        }

        @Override // androidx.datastore.preferences.protobuf.w0.b
        public final String c(ByteBuffer byteBuffer, int i10, int i11) throws InvalidProtocolBufferException {
            if ((i10 | i11 | ((byteBuffer.limit() - i10) - i11)) < 0) {
                throw new ArrayIndexOutOfBoundsException(String.format("buffer limit=%d, index=%d, limit=%d", Integer.valueOf(byteBuffer.limit()), Integer.valueOf(i10), Integer.valueOf(i11)));
            }
            long jA = v0.a(byteBuffer) + ((long) i10);
            long j10 = ((long) i11) + jA;
            char[] cArr = new char[i11];
            int i12 = 0;
            while (jA < j10) {
                byte bF = v0.f21151d.f(jA);
                if (!a.b(bF)) {
                    break;
                }
                jA++;
                cArr[i12] = (char) bF;
                i12++;
            }
            while (jA < j10) {
                long j11 = jA + 1;
                v0.e eVar = v0.f21151d;
                byte bF2 = eVar.f(jA);
                if (a.b(bF2)) {
                    int i13 = i12 + 1;
                    cArr[i12] = (char) bF2;
                    while (j11 < j10) {
                        byte bF3 = v0.f21151d.f(j11);
                        if (!a.b(bF3)) {
                            break;
                        }
                        j11++;
                        cArr[i13] = (char) bF3;
                        i13++;
                    }
                    i12 = i13;
                    jA = j11;
                } else {
                    if (!(bF2 < -32)) {
                        if (bF2 < -16) {
                            if (j11 >= j10 - 1) {
                                throw InvalidProtocolBufferException.c();
                            }
                            long j12 = 2 + jA;
                            jA += 3;
                            a.d(bF2, eVar.f(j11), eVar.f(j12), cArr, i12);
                            i12++;
                        } else {
                            if (j11 >= j10 - 2) {
                                throw InvalidProtocolBufferException.c();
                            }
                            byte bF4 = eVar.f(j11);
                            long j13 = jA + 3;
                            byte bF5 = eVar.f(2 + jA);
                            jA += 4;
                            a.a(bF2, bF4, bF5, eVar.f(j13), cArr, i12);
                            i12 += 2;
                        }
                    } else {
                        if (j11 >= j10) {
                            throw InvalidProtocolBufferException.c();
                        }
                        jA += 2;
                        a.c(bF2, eVar.f(j11), cArr, i12);
                        i12++;
                    }
                }
            }
            return new String(cArr, 0, i12);
        }

        @Override // androidx.datastore.preferences.protobuf.w0.b
        public final int d(CharSequence charSequence, byte[] bArr, int i10, int i11) {
            long j10;
            String str;
            String str2;
            int i12;
            long j11;
            char cCharAt;
            long j12 = i10;
            long j13 = ((long) i11) + j12;
            int length = charSequence.length();
            String str3 = " at index ";
            String str4 = "Failed writing ";
            if (length > i11 || bArr.length - i11 < i10) {
                throw new ArrayIndexOutOfBoundsException("Failed writing " + charSequence.charAt(length - 1) + " at index " + (i10 + i11));
            }
            int i13 = 0;
            while (true) {
                j10 = 1;
                if (i13 >= length || (cCharAt = charSequence.charAt(i13)) >= 128) {
                    break;
                }
                v0.q(bArr, j12, (byte) cCharAt);
                i13++;
                j12 = 1 + j12;
            }
            if (i13 == length) {
                return (int) j12;
            }
            while (i13 < length) {
                char cCharAt2 = charSequence.charAt(i13);
                if (cCharAt2 >= 128 || j12 >= j13) {
                    if (cCharAt2 >= 2048 || j12 > j13 - 2) {
                        str = str3;
                        str2 = str4;
                        if ((cCharAt2 >= 55296 && 57343 >= cCharAt2) || j12 > j13 - 3) {
                            if (j12 > j13 - 4) {
                                if (55296 <= cCharAt2 && cCharAt2 <= 57343 && ((i12 = i13 + 1) == length || !Character.isSurrogatePair(cCharAt2, charSequence.charAt(i12)))) {
                                    throw new d(i13, length);
                                }
                                throw new ArrayIndexOutOfBoundsException(str2 + cCharAt2 + str + j12);
                            }
                            int i14 = i13 + 1;
                            if (i14 != length) {
                                char cCharAt3 = charSequence.charAt(i14);
                                if (Character.isSurrogatePair(cCharAt2, cCharAt3)) {
                                    int codePoint = Character.toCodePoint(cCharAt2, cCharAt3);
                                    j11 = 1;
                                    v0.q(bArr, j12, (byte) ((codePoint >>> 18) | 240));
                                    v0.q(bArr, j12 + 1, (byte) (((codePoint >>> 12) & 63) | 128));
                                    long j14 = j12 + 3;
                                    v0.q(bArr, j12 + 2, (byte) (((codePoint >>> 6) & 63) | 128));
                                    j12 += 4;
                                    v0.q(bArr, j14, (byte) ((codePoint & 63) | 128));
                                    i13 = i14;
                                } else {
                                    i13 = i14;
                                }
                            }
                            throw new d(i13 - 1, length);
                        }
                        v0.q(bArr, j12, (byte) ((cCharAt2 >>> '\f') | 480));
                        long j15 = j12 + 2;
                        v0.q(bArr, j12 + 1, (byte) (((cCharAt2 >>> 6) & 63) | 128));
                        j12 += 3;
                        v0.q(bArr, j15, (byte) ((cCharAt2 & '?') | 128));
                    } else {
                        str = str3;
                        str2 = str4;
                        long j16 = j12 + j10;
                        v0.q(bArr, j12, (byte) ((cCharAt2 >>> 6) | 960));
                        j12 += 2;
                        v0.q(bArr, j16, (byte) ((cCharAt2 & '?') | 128));
                    }
                    j11 = 1;
                } else {
                    v0.q(bArr, j12, (byte) cCharAt2);
                    str2 = str4;
                    j11 = j10;
                    j12 += j10;
                    str = str3;
                }
                i13++;
                str3 = str;
                str4 = str2;
                j10 = j11;
                j13 = j13;
            }
            return (int) j12;
        }

        @Override // androidx.datastore.preferences.protobuf.w0.b
        public final void f(CharSequence charSequence, ByteBuffer byteBuffer) {
            long j10;
            char c10;
            long j11;
            int i10;
            int i11;
            char c11;
            char cCharAt;
            long jA = v0.a(byteBuffer);
            long jPosition = ((long) byteBuffer.position()) + jA;
            long jLimit = ((long) byteBuffer.limit()) + jA;
            int length = charSequence.length();
            if (length > jLimit - jPosition) {
                throw new ArrayIndexOutOfBoundsException("Failed writing " + charSequence.charAt(length - 1) + " at index " + byteBuffer.limit());
            }
            int i12 = 0;
            while (true) {
                j10 = 1;
                c10 = 128;
                if (i12 >= length || (cCharAt = charSequence.charAt(i12)) >= 128) {
                    break;
                }
                v0.p(jPosition, (byte) cCharAt);
                i12++;
                jPosition = 1 + jPosition;
            }
            if (i12 == length) {
                byteBuffer.position((int) (jPosition - jA));
                return;
            }
            while (i12 < length) {
                char cCharAt2 = charSequence.charAt(i12);
                if (cCharAt2 >= c10 || jPosition >= jLimit) {
                    if (cCharAt2 >= 2048 || jPosition > jLimit - 2) {
                        j11 = jA;
                        if ((cCharAt2 >= 55296 && 57343 >= cCharAt2) || jPosition > jLimit - 3) {
                            if (jPosition > jLimit - 4) {
                                if (55296 <= cCharAt2 && cCharAt2 <= 57343 && ((i10 = i12 + 1) == length || !Character.isSurrogatePair(cCharAt2, charSequence.charAt(i10)))) {
                                    throw new d(i12, length);
                                }
                                throw new ArrayIndexOutOfBoundsException("Failed writing " + cCharAt2 + " at index " + jPosition);
                            }
                            i11 = i12 + 1;
                            if (i11 != length) {
                                char cCharAt3 = charSequence.charAt(i11);
                                if (Character.isSurrogatePair(cCharAt2, cCharAt3)) {
                                    int codePoint = Character.toCodePoint(cCharAt2, cCharAt3);
                                    v0.p(jPosition, (byte) ((codePoint >>> 18) | 240));
                                    c11 = 128;
                                    v0.p(jPosition + 1, (byte) (((codePoint >>> 12) & 63) | 128));
                                    long j12 = jPosition + 3;
                                    v0.p(jPosition + 2, (byte) (((codePoint >>> 6) & 63) | 128));
                                    jPosition += 4;
                                    v0.p(j12, (byte) ((codePoint & 63) | 128));
                                } else {
                                    i12 = i11;
                                }
                            }
                            throw new d(i12 - 1, length);
                        }
                        long j13 = jPosition + j10;
                        v0.p(jPosition, (byte) ((cCharAt2 >>> '\f') | 480));
                        long j14 = jPosition + 2;
                        v0.p(j13, (byte) (((cCharAt2 >>> 6) & 63) | 128));
                        jPosition += 3;
                        v0.p(j14, (byte) ((cCharAt2 & '?') | 128));
                    } else {
                        j11 = jA;
                        long j15 = jPosition + j10;
                        v0.p(jPosition, (byte) ((cCharAt2 >>> 6) | 960));
                        jPosition += 2;
                        v0.p(j15, (byte) ((cCharAt2 & '?') | 128));
                    }
                    i11 = i12;
                    c11 = 128;
                } else {
                    v0.p(jPosition, (byte) cCharAt2);
                    j11 = jA;
                    i11 = i12;
                    c11 = c10;
                    jPosition += j10;
                }
                c10 = c11;
                jA = j11;
                j10 = 1;
                i12 = i11 + 1;
            }
            byteBuffer.position((int) (jPosition - jA));
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x0035, code lost:
        
            if (androidx.datastore.preferences.protobuf.v0.h(r8, r23) > (-65)) goto L16;
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x0066, code lost:
        
            if (androidx.datastore.preferences.protobuf.v0.h(r8, r23) > (-65)) goto L32;
         */
        /* JADX WARN: Code restructure failed: missing block: B:52:0x00aa, code lost:
        
            if (androidx.datastore.preferences.protobuf.v0.h(r8, r23) > (-65)) goto L53;
         */
        @Override // androidx.datastore.preferences.protobuf.w0.b
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final int h(int r22, byte[] r23, int r24, int r25) {
            /*
                Method dump skipped, instruction units count: 378
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.w0.e.h(int, byte[], int, int):int");
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x0041, code lost:
        
            if (androidx.datastore.preferences.protobuf.v0.f21151d.f(r6) > (-65)) goto L16;
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x0075, code lost:
        
            if (androidx.datastore.preferences.protobuf.v0.f21151d.f(r6) > (-65)) goto L32;
         */
        /* JADX WARN: Code restructure failed: missing block: B:52:0x00bf, code lost:
        
            if (androidx.datastore.preferences.protobuf.v0.f21151d.f(r6) > (-65)) goto L53;
         */
        @Override // androidx.datastore.preferences.protobuf.w0.b
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final int k(java.nio.ByteBuffer r24, int r25, int r26, int r27) {
            /*
                Method dump skipped, instruction units count: 451
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.w0.e.k(java.nio.ByteBuffer, int, int, int):int");
        }
    }

    static {
        f21158a = (v0.f21153f && v0.f21152e && !androidx.datastore.preferences.protobuf.b.a()) ? new e() : new c();
    }

    public static int a(int i10, int i11, byte[] bArr) {
        byte b10 = bArr[i10 - 1];
        int i12 = i11 - i10;
        if (i12 == 0) {
            if (b10 > -12) {
                b10 = -1;
            }
            return b10;
        }
        if (i12 == 1) {
            return f(b10, bArr[i10]);
        }
        if (i12 == 2) {
            return g(b10, bArr[i10], bArr[i10 + 1]);
        }
        throw new AssertionError();
    }

    public static int b(ByteBuffer byteBuffer, int i10, int i11, int i12) {
        if (i12 == 0) {
            if (i10 > -12) {
                i10 = -1;
            }
            return i10;
        }
        if (i12 == 1) {
            return f(i10, byteBuffer.get(i11));
        }
        if (i12 == 2) {
            return g(i10, byteBuffer.get(i11), byteBuffer.get(i11 + 1));
        }
        throw new AssertionError();
    }

    public static String c(ByteBuffer byteBuffer, int i10, int i11) throws InvalidProtocolBufferException {
        b bVar = f21158a;
        bVar.getClass();
        if (byteBuffer.hasArray()) {
            return bVar.a(byteBuffer.arrayOffset() + i10, i11, byteBuffer.array());
        }
        return byteBuffer.isDirect() ? bVar.c(byteBuffer, i10, i11) : b.b(byteBuffer, i10, i11);
    }

    public static void d(CharSequence charSequence, ByteBuffer byteBuffer) {
        b bVar = f21158a;
        bVar.getClass();
        if (byteBuffer.hasArray()) {
            int iArrayOffset = byteBuffer.arrayOffset();
            byteBuffer.position(bVar.d(charSequence, byteBuffer.array(), byteBuffer.position() + iArrayOffset, byteBuffer.remaining()) - iArrayOffset);
        } else if (byteBuffer.isDirect()) {
            bVar.f(charSequence, byteBuffer);
        } else {
            b.e(charSequence, byteBuffer);
        }
    }

    public static int e(CharSequence charSequence) {
        int length = charSequence.length();
        int i10 = 0;
        int i11 = 0;
        while (i11 < length && charSequence.charAt(i11) < 128) {
            i11++;
        }
        int i12 = length;
        while (i11 < length) {
            char cCharAt = charSequence.charAt(i11);
            if (cCharAt >= 2048) {
                int length2 = charSequence.length();
                while (i11 < length2) {
                    char cCharAt2 = charSequence.charAt(i11);
                    if (cCharAt2 < 2048) {
                        i10 += (127 - cCharAt2) >>> 31;
                    } else {
                        i10 += 2;
                        if (55296 <= cCharAt2 && cCharAt2 <= 57343) {
                            if (Character.codePointAt(charSequence, i11) < 65536) {
                                throw new d(i11, length2);
                            }
                            i11++;
                        }
                    }
                    i11++;
                }
                i12 += i10;
                break;
            }
            i12 += (127 - cCharAt) >>> 31;
            i11++;
        }
        if (i12 >= length) {
            return i12;
        }
        throw new IllegalArgumentException("UTF-8 length does not fit in int: " + (((long) i12) + SvgConstantsKt.SPECIFIED_SOLID_OPACITY));
    }

    public static int f(int i10, int i11) {
        if (i10 > -12 || i11 > -65) {
            return -1;
        }
        return i10 ^ (i11 << 8);
    }

    public static int g(int i10, int i11, int i12) {
        if (i10 > -12 || i11 > -65 || i12 > -65) {
            return -1;
        }
        return (i10 ^ (i11 << 8)) ^ (i12 << 16);
    }

    public static boolean h(byte[] bArr, int i10, int i11) {
        return f21158a.g(bArr, i10, i11);
    }
}
