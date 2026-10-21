package com.mypinpad.tsdk.isolation;

import com.mastercard.mpsdk.mcbp.mcmlite.apdu.emv.GenerateAcResponseApdu;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes10.dex */
public final class d1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int[] f55081b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static int f55082c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static int f55083d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final byte[] f55084e = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a[] f55085a;

    public static class a {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static int f55086c = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static int f55087d = 1;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f55088a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f55089b;

        public a(String str) {
            StringBuilder sb2 = new StringBuilder("-----BEGIN ");
            sb2.append(str);
            sb2.append("-----");
            this.f55088a = sb2.toString();
            StringBuilder sb3 = new StringBuilder("-----END ");
            sb3.append(str);
            sb3.append("-----");
            this.f55089b = sb3.toString();
        }

        public static /* synthetic */ Boolean a(Object[] objArr, int i10, int i11, int i12) {
            int i13 = ~i10;
            int i14 = ~i11;
            int i15 = ~i12;
            if ((((~(i10 | i11)) | (~(i13 | i15))) * 564) + ((~(i12 | i13 | i11)) * 1128) + (((~(i14 | i15)) | i13 | (~(i11 | i12))) * (-564)) + (i11 * 565) + (i10 * (-563)) != 1) {
                a aVar = (a) objArr[0];
                String str = (String) objArr[1];
                int i16 = f55087d + 117;
                f55086c = i16 % 128;
                int i17 = i16 % 2;
                String str2 = aVar.f55088a;
                if (i17 == 0) {
                    return Boolean.valueOf(str.startsWith(str2));
                }
                str.startsWith(str2);
                throw null;
            }
            a aVar2 = (a) objArr[0];
            String str3 = (String) objArr[1];
            int i18 = f55087d;
            int i19 = ((i18 & 39) - (~(-(-(i18 | 39))))) - 1;
            f55086c = i19 % 128;
            int i20 = i19 % 2;
            String str4 = aVar2.f55089b;
            if (i20 != 0) {
                str3.startsWith(str4);
                throw null;
            }
            boolean zStartsWith = str3.startsWith(str4);
            int i21 = f55086c;
            int i22 = (i21 ^ 43) + ((i21 & 43) << 1);
            f55087d = i22 % 128;
            if (i22 % 2 == 0) {
                int i23 = 23 / 0;
            }
            return Boolean.valueOf(zStartsWith);
        }
    }

    static {
        b();
        f55082c = 0;
        f55083d = 1;
        f55081b = new int[]{35484435, 879281806, 1654051878, -1139086634, 160899071, 838881762, 475642885, 381051812, -237402485, -1971376584, -55752115, -206679366, -93128641, 1378828201, -1959913903, 1339250144, 121683669, -1192871244};
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r2v2 com.mypinpad.tsdk.i.d1$a, still in use, count: 2, list:
          (r2v2 com.mypinpad.tsdk.i.d1$a) from 0x00e9: MOVE (r22v0 com.mypinpad.tsdk.i.d1$a) = (r2v2 com.mypinpad.tsdk.i.d1$a) (LINE:234)
          (r2v2 com.mypinpad.tsdk.i.d1$a) from 0x0057: PHI (r2v26 com.mypinpad.tsdk.i.d1$a) = (r2v2 com.mypinpad.tsdk.i.d1$a), (r2v31 com.mypinpad.tsdk.i.d1$a) binds: [B:4:0x0053, B:12:0x00cb] A[DONT_GENERATE, DONT_INLINE]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
        	at jadx.core.utils.InsnRemover.addAndUnbind(InsnRemover.java:59)
        	at jadx.core.dex.visitors.ModVisitor.removeStep(ModVisitor.java:463)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:97)
        */
    public d1(java.lang.String r27) {
        /*
            Method dump skipped, instruction units count: 779
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.d1.<init>(java.lang.String):void");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x002a  */
    /* JADX WARN: Code duplicated, block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002a -> B:11:0x0033). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x002a
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static void a(byte r6, int r7, short r8, java.lang.Object[] r9) {
        /*
            int r6 = r6 * 4
            int r6 = 4 - r6
            int r8 = r8 * 4
            int r8 = r8 + 104
            int r7 = r7 * 4
            int r0 = r7 + 1
            byte[] r0 = new byte[r0]
            r1 = 0
            byte[] r2 = com.mypinpad.tsdk.isolation.d1.f55084e
            if (r2 != 0) goto L1a
            r4 = r1
            r3 = r2
            r2 = r0
            r0 = r9
            r9 = r8
            r8 = r7
            goto L33
        L1a:
            r3 = r1
        L1b:
            byte r4 = (byte) r8
            r0[r3] = r4
            int r4 = r3 + 1
            if (r3 != r7) goto L2a
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r1)
            r9[r1] = r6
            return
        L2a:
            r3 = r2[r6]
            r5 = r8
            r8 = r7
            r7 = r3
            r3 = r2
            r2 = r0
            r0 = r9
            r9 = r5
        L33:
            int r6 = r6 + 1
            int r7 = -r7
            int r7 = r7 + r9
            r9 = r0
            r0 = r2
            r2 = r3
            r3 = r4
            r5 = r8
            r8 = r7
            r7 = r5
            goto L1b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.d1.a(byte, int, short, java.lang.Object[]):void");
    }

    public static void b() {
        f55084e = new byte[]{37, 60, 72, GenerateAcResponseApdu.DDA_HEADER};
    }

    public static String c(InputStream inputStream) throws IOException {
        int i10;
        StringBuffer stringBuffer = new StringBuffer();
        while (true) {
            i10 = inputStream.read();
            if (i10 != 13 && i10 != 10) {
                int i11 = f55082c;
                int i12 = i11 + 47;
                f55083d = i12 % 128;
                int i13 = i12 % 2;
                if (i10 >= 0) {
                    int i14 = i11 + 25;
                    f55083d = i14 % 128;
                    int i15 = i14 % 2;
                    stringBuffer.append((char) i10);
                }
            }
            if (i10 < 0 || stringBuffer.length() != 0) {
                break;
            }
        }
        if (i10 < 0) {
            int i16 = f55082c + 65;
            f55083d = i16 % 128;
            int i17 = i16 % 2;
            if (stringBuffer.length() == 0) {
                return null;
            }
            return stringBuffer.toString();
        }
        if (i10 == 13) {
            inputStream.mark(1);
            int i18 = inputStream.read();
            if (i18 == 10) {
                inputStream.mark(1);
            }
            if (i18 > 0) {
                int i19 = f55083d + 39;
                f55082c = i19 % 128;
                int i20 = i19 % 2;
                inputStream.reset();
            }
        }
        return stringBuffer.toString();
    }

    public final aed d(InputStream inputStream, boolean z10) throws IOException {
        String strC;
        StringBuffer stringBuffer = new StringBuffer();
        a aVarE = null;
        while (aVarE == null && (strC = c(inputStream)) != null) {
            int i10 = f55083d + 109;
            f55082c = i10 % 128;
            if (i10 % 2 != 0) {
                e(strC);
                throw null;
            }
            aVarE = e(strC);
            if (aVarE != null) {
                int i11 = f55083d + 81;
                f55082c = i11 % 128;
                Object[] objArr = new Object[2];
                if (i11 % 2 != 0) {
                    objArr[0] = aVarE;
                    objArr[1] = strC;
                    int i12 = 78 / 0;
                    if (!a.a(objArr, -194326023, 194326023, System.identityHashCode(aVarE)).booleanValue()) {
                        throw new IOException("malformed PEM data: found footer where header was expected");
                    }
                } else {
                    objArr[0] = aVarE;
                    objArr[1] = strC;
                    if (!a.a(objArr, -194326023, 194326023, System.identityHashCode(aVarE)).booleanValue()) {
                        throw new IOException("malformed PEM data: found footer where header was expected");
                    }
                }
            }
        }
        if (aVarE == null) {
            if (z10) {
                throw new IOException("malformed PEM data: no header found");
            }
            return null;
        }
        a aVarE2 = null;
        while (aVarE2 == null) {
            String strC2 = c(inputStream);
            if (strC2 == null) {
                break;
            }
            aVarE2 = e(strC2);
            if (aVarE2 == null) {
                stringBuffer.append(strC2);
            } else if (!a.a(new Object[]{aVarE, strC2}, -81367025, 81367026, System.identityHashCode(aVarE)).booleanValue()) {
                throw new IOException("malformed PEM data: header/footer mismatch");
            }
        }
        if (aVarE2 == null) {
            throw new IOException("malformed PEM data: no footer found");
        }
        if (stringBuffer.length() == 0) {
            return null;
        }
        int i13 = f55082c + 11;
        f55083d = i13 % 128;
        try {
            if (i13 % 2 != 0) {
                return (aed) aed.setY(new Object[]{(byte[]) bfa.setCompoundDrawableTintBlendMode(new Object[]{stringBuffer.toString()}, -2077456639, 2077456639, (int) System.currentTimeMillis())}, 691787085, -691787084, (int) System.currentTimeMillis());
            }
            throw null;
        } catch (Exception unused) {
            throw new IOException("malformed PEM data encountered");
        }
    }

    public final a e(String str) {
        int i10 = f55082c + 117;
        int i11 = i10 % 128;
        f55083d = i11;
        int i12 = i10 % 2;
        int i13 = i11 + 115;
        f55082c = i13 % 128;
        int i14 = i13 % 2;
        int i15 = 0;
        while (true) {
            a[] aVarArr = this.f55085a;
            if (i15 == aVarArr.length) {
                return null;
            }
            a aVar = aVarArr[i15];
            if (!a.a(new Object[]{aVar, str}, -194326023, 194326023, System.identityHashCode(aVar)).booleanValue()) {
                int i16 = f55082c + 43;
                f55083d = i16 % 128;
                int i17 = i16 % 2;
                if (!a.a(new Object[]{aVar, str}, -81367025, 81367026, System.identityHashCode(aVar)).booleanValue()) {
                    i15++;
                }
            }
            return aVar;
        }
    }
}
