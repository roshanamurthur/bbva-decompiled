package kotlin.reflect.jvm.internal.impl.protobuf;

import com.bbva.tohu.android.product.valkyria.sdk.payments.paywave.Constants;

/* JADX INFO: compiled from: Utf8.java */
/* JADX INFO: loaded from: classes12.dex */
public final class e {
    public static int a(int i10, int i11) {
        if (i10 > -12 || i11 > -65) {
            return -1;
        }
        return i10 ^ (i11 << 8);
    }

    public static int b(int i10, int i11, byte[] bArr) {
        byte b10 = bArr[i10 - 1];
        int i12 = i11 - i10;
        if (i12 == 0) {
            if (b10 > -12) {
                return -1;
            }
            return b10;
        }
        if (i12 == 1) {
            return a(b10, bArr[i10]);
        }
        if (i12 != 2) {
            throw new AssertionError();
        }
        byte b11 = bArr[i10];
        byte b12 = bArr[i10 + 1];
        if (b10 > -12 || b11 > -65 || b12 > -65) {
            return -1;
        }
        return ((b11 << 8) ^ b10) ^ (b12 << 16);
    }

    public static boolean isValidUtf8(byte[] bArr) {
        return isValidUtf8(bArr, 0, bArr.length);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0015, code lost:
    
        if (r7[r8] > (-65)) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0046, code lost:
    
        if (r7[r8] > (-65)) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x008f, code lost:
    
        if (r7[r6] > (-65)) goto L58;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int partialIsValidUtf8(int r6, byte[] r7, int r8, int r9) {
        /*
            if (r6 == 0) goto L92
            if (r8 < r9) goto L5
            return r6
        L5:
            byte r0 = (byte) r6
            r1 = -65
            r2 = -1
            r3 = -32
            if (r0 >= r3) goto L1c
            r6 = -62
            if (r0 < r6) goto L1b
            int r6 = r8 + 1
            r8 = r7[r8]
            if (r8 <= r1) goto L18
            goto L1b
        L18:
            r8 = r6
            goto L92
        L1b:
            return r2
        L1c:
            r4 = -16
            if (r0 >= r4) goto L49
            int r6 = r6 >> 8
            int r6 = ~r6
            byte r6 = (byte) r6
            if (r6 != 0) goto L34
            int r6 = r8 + 1
            r8 = r7[r8]
            if (r6 < r9) goto L31
            int r6 = a(r0, r8)
            return r6
        L31:
            r5 = r8
            r8 = r6
            r6 = r5
        L34:
            if (r6 > r1) goto L48
            r4 = -96
            if (r0 != r3) goto L3c
            if (r6 < r4) goto L48
        L3c:
            r3 = -19
            if (r0 != r3) goto L42
            if (r6 >= r4) goto L48
        L42:
            int r6 = r8 + 1
            r8 = r7[r8]
            if (r8 <= r1) goto L18
        L48:
            return r2
        L49:
            int r3 = r6 >> 8
            int r3 = ~r3
            byte r3 = (byte) r3
            if (r3 != 0) goto L5c
            int r6 = r8 + 1
            r3 = r7[r8]
            if (r6 < r9) goto L5a
            int r6 = a(r0, r3)
            return r6
        L5a:
            r8 = 0
            goto L62
        L5c:
            int r6 = r6 >> 16
            byte r6 = (byte) r6
            r5 = r8
            r8 = r6
            r6 = r5
        L62:
            if (r8 != 0) goto L7e
            int r8 = r6 + 1
            r6 = r7[r6]
            if (r8 < r9) goto L7b
            r7 = -12
            if (r0 > r7) goto L7a
            if (r3 > r1) goto L7a
            if (r6 <= r1) goto L73
            goto L7a
        L73:
            int r7 = r3 << 8
            r7 = r7 ^ r0
            int r6 = r6 << 16
            r2 = r7 ^ r6
        L7a:
            return r2
        L7b:
            r5 = r8
            r8 = r6
            r6 = r5
        L7e:
            if (r3 > r1) goto L91
            int r0 = r0 << 28
            int r3 = r3 + 112
            int r3 = r3 + r0
            int r0 = r3 >> 30
            if (r0 != 0) goto L91
            if (r8 > r1) goto L91
            int r8 = r6 + 1
            r6 = r7[r6]
            if (r6 <= r1) goto L92
        L91:
            return r2
        L92:
            int r6 = partialIsValidUtf8(r7, r8, r9)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.protobuf.e.partialIsValidUtf8(int, byte[], int, int):int");
    }

    public static boolean isValidUtf8(byte[] bArr, int i10, int i11) {
        return partialIsValidUtf8(bArr, i10, i11) == 0;
    }

    public static int partialIsValidUtf8(byte[] bArr, int i10, int i11) {
        while (i10 < i11 && bArr[i10] >= 0) {
            i10++;
        }
        if (i10 >= i11) {
            return 0;
        }
        while (i10 < i11) {
            int i12 = i10 + 1;
            byte b10 = bArr[i10];
            if (b10 < 0) {
                if (b10 < -32) {
                    if (i12 >= i11) {
                        return b10;
                    }
                    if (b10 >= -62) {
                        i10 += 2;
                        if (bArr[i12] > -65) {
                        }
                    }
                    return -1;
                }
                if (b10 < -16) {
                    if (i12 >= i11 - 1) {
                        return b(i12, i11, bArr);
                    }
                    int i13 = i10 + 2;
                    byte b11 = bArr[i12];
                    if (b11 <= -65 && ((b10 != -32 || b11 >= -96) && (b10 != -19 || b11 < -96))) {
                        i10 += 3;
                        if (bArr[i13] > -65) {
                        }
                    }
                    return -1;
                }
                if (i12 >= i11 - 2) {
                    return b(i12, i11, bArr);
                }
                int i14 = i10 + 2;
                byte b12 = bArr[i12];
                if (b12 <= -65) {
                    if ((((b12 + Constants.CVR_B1b85_0111_VERIFIED_CLOUD) + (b10 << 28)) >> 30) == 0) {
                        int i15 = i10 + 3;
                        if (bArr[i14] <= -65) {
                            i10 += 4;
                            if (bArr[i15] > -65) {
                            }
                        }
                    }
                }
                return -1;
            }
            i10 = i12;
        }
        return 0;
    }
}
