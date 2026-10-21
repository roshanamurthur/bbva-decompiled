package com.mypinpad.tsdk.isolation;

import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.security.NoSuchAlgorithmException;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class acn implements abv {

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public static int f52407s0 = 0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public static int f52408t0 = 1;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @JvmField
    @NotNull
    public final aco f52409p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    @JvmField
    @NotNull
    public final abx f52410q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    @JvmField
    public boolean f52411r0;

    public acn(@NotNull aco acoVar) {
        Intrinsics.checkNotNullParameter(acoVar, "");
        this.f52409p0 = acoVar;
        this.f52410q0 = new abx();
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0082, code lost:
    
        return java.lang.Integer.valueOf(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0083, code lost:
    
        r7 = com.mypinpad.tsdk.isolation.acn.f52407s0;
        r0 = r7 & 25;
        r0 = (r0 - (~(-(-((r7 ^ 25) | r0))))) - 1;
        com.mypinpad.tsdk.isolation.acn.f52408t0 = r0 % 128;
        r0 = r0 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x009f, code lost:
    
        throw new java.lang.IllegalStateException("closed".toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001f, code lost:
    
        if (r1.f52411r0 == false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0028, code lost:
    
        if ((!r1.f52411r0) == true) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x002a, code lost:
    
        r3 = com.mypinpad.tsdk.isolation.acn.f52407s0 + 29;
        com.mypinpad.tsdk.isolation.acn.f52408t0 = r3 % 128;
        r3 = r3 % 2;
        r3 = r1.f52410q0;
        r7 = ((java.lang.Integer) com.mypinpad.tsdk.isolation.abx.setOnFocusChangeListener(new java.lang.Object[]{r3, r7}, 936234497, -936234490, java.lang.System.identityHashCode(r3))).intValue();
        r0 = (com.mypinpad.tsdk.isolation.abv) setDividerPadding(new java.lang.Object[]{r1}, -1295783459, 1295783472, java.lang.System.identityHashCode(r1));
        r0 = com.mypinpad.tsdk.isolation.acn.f52408t0;
        r1 = ((r0 ^ 59) | (r0 & 59)) << 1;
        r0 = -(((~r0) & 59) | (r0 & (-60)));
        r2 = ((r1 | r0) << 1) - (r0 ^ r1);
        com.mypinpad.tsdk.isolation.acn.f52407s0 = r2 % 128;
        r2 = r2 % 2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ java.lang.Integer a(java.lang.Object[] r7) {
        /*
            r0 = 0
            r1 = r7[r0]
            com.mypinpad.tsdk.i.acn r1 = (com.mypinpad.tsdk.isolation.acn) r1
            r2 = 1
            r7 = r7[r2]
            java.nio.ByteBuffer r7 = (java.nio.ByteBuffer) r7
            int r3 = com.mypinpad.tsdk.isolation.acn.f52408t0
            int r3 = r3 + 5
            int r4 = r3 % 128
            com.mypinpad.tsdk.isolation.acn.f52407s0 = r4
            r4 = 2
            int r3 = r3 % r4
            java.lang.String r5 = ""
            if (r3 == 0) goto L22
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r5)
            boolean r3 = r1.f52411r0
            r5 = 7
            int r5 = r5 / r0
            if (r3 != 0) goto L83
            goto L2a
        L22:
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r5)
            boolean r3 = r1.f52411r0
            r3 = r3 ^ r2
            if (r3 != r2) goto L83
        L2a:
            int r3 = com.mypinpad.tsdk.isolation.acn.f52407s0
            int r3 = r3 + 29
            int r5 = r3 % 128
            com.mypinpad.tsdk.isolation.acn.f52408t0 = r5
            int r3 = r3 % r4
            com.mypinpad.tsdk.i.abx r3 = r1.f52410q0
            java.lang.Object[] r5 = new java.lang.Object[r4]
            r5[r0] = r3
            r5[r2] = r7
            int r7 = java.lang.System.identityHashCode(r3)
            r3 = 936234497(0x37cdce01, float:2.4533832E-5)
            r6 = -936234490(0xffffffffc8323206, float:-182472.1)
            java.lang.Object r7 = com.mypinpad.tsdk.isolation.abx.setOnFocusChangeListener(r5, r3, r6, r7)
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            java.lang.Object[] r3 = new java.lang.Object[r2]
            r3[r0] = r1
            int r0 = java.lang.System.identityHashCode(r1)
            r1 = -1295783459(0xffffffffb2c3e9dd, float:-2.2807336E-8)
            r5 = 1295783472(0x4d3c1630, float:1.9722317E8)
            java.lang.Object r0 = setDividerPadding(r3, r1, r5, r0)
            com.mypinpad.tsdk.i.abv r0 = (com.mypinpad.tsdk.isolation.abv) r0
            int r0 = com.mypinpad.tsdk.isolation.acn.f52408t0
            r1 = r0 ^ 59
            r3 = r0 & 59
            r1 = r1 | r3
            int r1 = r1 << r2
            r3 = r0 & (-60)
            int r0 = ~r0
            r5 = 59
            r0 = r0 & r5
            r0 = r0 | r3
            int r0 = -r0
            r3 = r1 | r0
            int r2 = r3 << 1
            r0 = r0 ^ r1
            int r2 = r2 - r0
            int r0 = r2 % 128
            com.mypinpad.tsdk.isolation.acn.f52407s0 = r0
            int r2 = r2 % r4
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            return r7
        L83:
            int r7 = com.mypinpad.tsdk.isolation.acn.f52407s0
            r0 = r7 & 25
            r7 = r7 ^ 25
            r7 = r7 | r0
            int r7 = -r7
            int r7 = -r7
            int r7 = ~r7
            int r0 = r0 - r7
            int r0 = r0 - r2
            int r7 = r0 % 128
            com.mypinpad.tsdk.isolation.acn.f52408t0 = r7
            int r0 = r0 % r4
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "closed"
            java.lang.String r0 = r0.toString()
            r7.<init>(r0)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.acn.a(java.lang.Object[]):java.lang.Integer");
    }

    public static /* synthetic */ void b(Object[] objArr) throws IOException {
        acn acnVar = (acn) objArr[0];
        int i10 = f52408t0;
        int i11 = i10 & 89;
        int i12 = (i10 ^ 89) | i11;
        int i13 = (i11 ^ i12) + ((i11 & i12) << 1);
        f52407s0 = i13 % 128;
        int i14 = i13 % 2;
        if (acnVar.f52411r0) {
            int i15 = (i10 & 67) + (i10 | 67);
            f52407s0 = i15 % 128;
            int i16 = i15 % 2;
            throw new IllegalStateException("closed".toString());
        }
        int i17 = ((i10 | 55) << 1) - (i10 ^ 55);
        f52407s0 = i17 % 128;
        int i18 = i17 % 2;
        int i19 = ((i10 | 95) << 1) - (((~i10) & 95) | (i10 & (-96)));
        f52407s0 = i19 % 128;
        int i20 = i19 % 2;
        abx abxVar = acnVar.f52410q0;
        long jLongValue = ((Long) abx.setOnFocusChangeListener(new Object[]{abxVar}, 1395393434, -1395393402, System.identityHashCode(abxVar))).longValue();
        aco acoVar = acnVar.f52409p0;
        if (jLongValue > 0) {
            int i21 = f52408t0;
            int i22 = ((i21 & (-50)) | ((~i21) & 49)) + ((i21 & 49) << 1);
            f52407s0 = i22 % 128;
            if (i22 % 2 != 0) {
                acoVar.setDividerPadding(abxVar, ((Long) abx.setOnFocusChangeListener(new Object[]{abxVar}, 1395393434, -1395393402, System.identityHashCode(abxVar))).longValue());
                throw null;
            }
            acoVar.setDividerPadding(abxVar, ((Long) abx.setOnFocusChangeListener(new Object[]{abxVar}, 1395393434, -1395393402, System.identityHashCode(abxVar))).longValue());
            int i23 = f52408t0 + 11;
            f52407s0 = i23 % 128;
            int i24 = i23 % 2;
        }
        acoVar.flush();
        int i25 = f52407s0;
        int i26 = (i25 & (-12)) | ((~i25) & 11);
        int i27 = -(-((i25 & 11) << 1));
        int i28 = ((i26 | i27) << 1) - (i27 ^ i26);
        f52408t0 = i28 % 128;
        if (i28 % 2 == 0) {
            throw null;
        }
    }

    public static /* synthetic */ abv c(Object[] objArr) {
        acn acnVar = (acn) objArr[0];
        int iIntValue = ((Number) objArr[1]).intValue();
        int i10 = f52407s0;
        int i11 = (((i10 | 44) << 1) - (i10 ^ 44)) - 1;
        int i12 = i11 % 128;
        f52408t0 = i12;
        int i13 = i11 % 2;
        if (acnVar.f52411r0) {
            int i14 = i12 ^ 49;
            int i15 = ((i12 & 49) | i14) << 1;
            int i16 = -i14;
            int i17 = (i15 & i16) + (i16 | i15);
            f52407s0 = i17 % 128;
            int i18 = i17 % 2;
            throw new IllegalStateException("closed".toString());
        }
        int i19 = i12 & 35;
        int i20 = ((i12 ^ 35) | i19) << 1;
        int i21 = -((i12 | 35) & (~i19));
        int i22 = (i20 ^ i21) + ((i21 & i20) << 1);
        int i23 = i22 % 128;
        f52407s0 = i23;
        int i24 = i22 % 2;
        int i25 = (-2) - ((i23 + 84) ^ (-1));
        f52408t0 = i25 % 128;
        int i26 = i25 % 2;
        abv abvVar = (abv) setDividerPadding(new Object[]{acnVar}, -1295783459, 1295783472, System.identityHashCode(acnVar));
        int i27 = f52407s0;
        int i28 = i27 & 45;
        int i29 = -(-((i27 ^ 45) | i28));
        int i30 = ((i28 | i29) << 1) - (i29 ^ i28);
        f52408t0 = i30 % 128;
        if (i30 % 2 != 0) {
            return abvVar;
        }
        throw null;
    }

    public static /* synthetic */ abv d(Object[] objArr) throws NoSuchAlgorithmException, IOException {
        acn acnVar = (acn) objArr[0];
        int iIntValue = ((Number) objArr[1]).intValue();
        int i10 = f52407s0;
        int i11 = i10 & 37;
        int i12 = ((((i10 ^ 37) | i11) << 1) - (~(-((i10 | 37) & (~i11))))) - 1;
        int i13 = i12 % 128;
        f52408t0 = i13;
        int i14 = i12 % 2;
        if (acnVar.f52411r0) {
            int i15 = i13 + 69;
            f52407s0 = i15 % 128;
            int i16 = i15 % 2;
        } else {
            int i17 = i13 & 25;
            int i18 = ((i13 ^ 25) | i17) << 1;
            int i19 = -((~i17) & (i13 | 25));
            int i20 = (i18 & i19) + (i18 | i19);
            f52407s0 = i20 % 128;
            boolean z10 = i20 % 2 == 0;
            int i21 = i13 & 29;
            int i22 = (((i13 | 29) & (~i21)) - (~(i21 << 1))) - 1;
            f52407s0 = i22 % 128;
            int i23 = i22 % 2;
            if (z10) {
                acnVar.f52410q0.setOnFocusChangeListener(iIntValue);
                abv abvVar = (abv) setDividerPadding(new Object[]{acnVar}, -1295783459, 1295783472, System.identityHashCode(acnVar));
                int i24 = f52407s0;
                int i25 = (((i24 | 52) << 1) - (i24 ^ 52)) - 1;
                f52408t0 = i25 % 128;
                if (i25 % 2 == 0) {
                    int i26 = 57 / 0;
                }
                return abvVar;
            }
        }
        throw new IllegalStateException("closed".toString());
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0084, code lost:
    
        if ((r9 % 2) == 0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0086, code lost:
    
        r9 = 79 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0089, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x008a, code lost:
    
        r9 = com.mypinpad.tsdk.isolation.acn.f52407s0;
        r0 = ((r9 ^ 29) | (r9 & 29)) << 1;
        r9 = -(((~r9) & 29) | (r9 & (-30)));
        r1 = (r0 ^ r9) + ((r9 & r0) << 1);
        com.mypinpad.tsdk.isolation.acn.f52408t0 = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x00ae, code lost:
    
        throw new java.lang.IllegalStateException("closed".toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x002e, code lost:
    
        if ((!r1.f52411r0) == true) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0036, code lost:
    
        if (r1.f52411r0 == false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0038, code lost:
    
        r9 = com.mypinpad.tsdk.isolation.acn.f52407s0;
        r7 = r9 & 63;
        r9 = -(-((r9 ^ 63) | r7));
        r8 = ((r7 | r9) << 1) - (r9 ^ r7);
        com.mypinpad.tsdk.isolation.acn.f52408t0 = r8 % 128;
        r8 = r8 % 2;
        r9 = r1.f52410q0;
        com.mypinpad.tsdk.isolation.abx.setOnFocusChangeListener(new java.lang.Object[]{r9, r3, java.lang.Long.valueOf(r5)}, -2065855263, 2065855285, java.lang.System.identityHashCode(r9));
        r9 = (com.mypinpad.tsdk.isolation.abv) setDividerPadding(new java.lang.Object[]{r1}, -1295783459, 1295783472, java.lang.System.identityHashCode(r1));
        r9 = com.mypinpad.tsdk.isolation.acn.f52408t0 + 15;
        com.mypinpad.tsdk.isolation.acn.f52407s0 = r9 % 128;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ void e(java.lang.Object[] r9) throws java.security.NoSuchAlgorithmException, java.io.IOException {
        /*
            r0 = 0
            r1 = r9[r0]
            com.mypinpad.tsdk.i.acn r1 = (com.mypinpad.tsdk.isolation.acn) r1
            r2 = 1
            r3 = r9[r2]
            com.mypinpad.tsdk.i.abx r3 = (com.mypinpad.tsdk.isolation.abx) r3
            r4 = 2
            r9 = r9[r4]
            java.lang.Number r9 = (java.lang.Number) r9
            long r5 = r9.longValue()
            int r9 = com.mypinpad.tsdk.isolation.acn.f52407s0
            r7 = r9 | 8
            int r7 = r7 << r2
            r9 = r9 ^ 8
            int r7 = r7 - r9
            int r7 = r7 - r2
            int r9 = r7 % 128
            com.mypinpad.tsdk.isolation.acn.f52408t0 = r9
            int r7 = r7 % r4
            java.lang.String r9 = ""
            if (r7 != 0) goto L31
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r9)
            boolean r9 = r1.f52411r0
            r7 = 18
            int r7 = r7 / r0
            r9 = r9 ^ r2
            if (r9 != r2) goto L8a
            goto L38
        L31:
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r9)
            boolean r9 = r1.f52411r0
            if (r9 != 0) goto L8a
        L38:
            int r9 = com.mypinpad.tsdk.isolation.acn.f52407s0
            r7 = r9 & 63
            r9 = r9 ^ 63
            r9 = r9 | r7
            int r9 = -r9
            int r9 = -r9
            r8 = r7 | r9
            int r8 = r8 << r2
            r9 = r9 ^ r7
            int r8 = r8 - r9
            int r9 = r8 % 128
            com.mypinpad.tsdk.isolation.acn.f52408t0 = r9
            int r8 = r8 % r4
            com.mypinpad.tsdk.i.abx r9 = r1.f52410q0
            r7 = 3
            java.lang.Object[] r7 = new java.lang.Object[r7]
            r7[r0] = r9
            r7[r2] = r3
            java.lang.Long r3 = java.lang.Long.valueOf(r5)
            r7[r4] = r3
            int r9 = java.lang.System.identityHashCode(r9)
            r3 = -2065855263(0xffffffff84dd8ce1, float:-5.2086227E-36)
            r5 = 2065855285(0x7b227335, float:8.434888E35)
            com.mypinpad.tsdk.isolation.abx.setOnFocusChangeListener(r7, r3, r5, r9)
            java.lang.Object[] r9 = new java.lang.Object[r2]
            r9[r0] = r1
            int r1 = java.lang.System.identityHashCode(r1)
            r2 = -1295783459(0xffffffffb2c3e9dd, float:-2.2807336E-8)
            r3 = 1295783472(0x4d3c1630, float:1.9722317E8)
            java.lang.Object r9 = setDividerPadding(r9, r2, r3, r1)
            com.mypinpad.tsdk.i.abv r9 = (com.mypinpad.tsdk.isolation.abv) r9
            int r9 = com.mypinpad.tsdk.isolation.acn.f52408t0
            int r9 = r9 + 15
            int r1 = r9 % 128
            com.mypinpad.tsdk.isolation.acn.f52407s0 = r1
            int r9 = r9 % r4
            if (r9 == 0) goto L89
            r9 = 79
            int r9 = r9 / r0
        L89:
            return
        L8a:
            int r9 = com.mypinpad.tsdk.isolation.acn.f52407s0
            r0 = r9 ^ 29
            r1 = r9 & 29
            r0 = r0 | r1
            int r0 = r0 << r2
            r1 = r9 & (-30)
            int r9 = ~r9
            r9 = r9 & 29
            r9 = r9 | r1
            int r9 = -r9
            r1 = r0 ^ r9
            r9 = r9 & r0
            int r9 = r9 << r2
            int r1 = r1 + r9
            int r9 = r1 % 128
            com.mypinpad.tsdk.isolation.acn.f52408t0 = r9
            int r1 = r1 % r4
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "closed"
            java.lang.String r0 = r0.toString()
            r9.<init>(r0)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.acn.e(java.lang.Object[]):void");
    }

    public static /* synthetic */ abv f(Object[] objArr) {
        acn acnVar = (acn) objArr[0];
        long jLongValue = ((Number) objArr[1]).longValue();
        int i10 = f52408t0;
        int i11 = (i10 ^ 81) + ((i10 & 81) << 1);
        int i12 = i11 % 128;
        f52407s0 = i12;
        int i13 = i11 % 2;
        if (acnVar.f52411r0) {
            int i14 = (i12 ^ 85) + ((i12 & 85) << 1);
            f52408t0 = i14 % 128;
            int i15 = i14 % 2;
        } else {
            int i16 = i12 | 65;
            int i17 = (i16 << 1) - (i16 & (~(i12 & 65)));
            f52408t0 = i17 % 128;
            boolean z10 = i17 % 2 != 0;
            int i18 = i12 + 123;
            f52408t0 = i18 % 128;
            int i19 = i18 % 2;
            if (z10) {
                abx abxVar = acnVar.f52410q0;
                abv abvVar = (abv) setDividerPadding(new Object[]{acnVar}, -1295783459, 1295783472, System.identityHashCode(acnVar));
                int i20 = f52408t0;
                int i21 = i20 & 23;
                int i22 = (i20 | 23) & (~i21);
                int i23 = i21 << 1;
                int i24 = (i22 & i23) + (i22 | i23);
                f52407s0 = i24 % 128;
                if (i24 % 2 != 0) {
                    int i25 = 49 / 0;
                }
                return abvVar;
            }
        }
        throw new IllegalStateException("closed".toString());
    }

    public static /* synthetic */ Object setDividerPadding(Object[] objArr, int i10, int i11, int i12) throws Throwable {
        Object string;
        int i13 = ~i11;
        int i14 = ~i12;
        switch ((((~(i10 | i11)) | (~(i12 | i13))) * 49) + (((~((~i10) | i14)) | i13 | (~(i10 | i12))) * (-49)) + (((~(i13 | i14)) | (~(i13 | i10))) * 98) + (i11 * (-97)) + (i10 * 50)) {
            case 1:
                acn acnVar = (acn) objArr[0];
                StringBuilder sb2 = new StringBuilder("buffer(");
                sb2.append(acnVar.f52409p0);
                sb2.append(RootService.CLOSE_BRACKET);
                string = sb2.toString();
                int i15 = f52408t0;
                int i16 = i15 & 69;
                int i17 = ((i15 | 69) & (~i16)) + (i16 << 1);
                f52407s0 = i17 % 128;
                if (i17 % 2 != 0) {
                    throw null;
                }
                break;
            case 2:
                acn acnVar2 = (acn) objArr[0];
                long jLongValue = ((Number) objArr[1]).longValue();
                int i18 = f52407s0;
                int i19 = i18 & 59;
                int i20 = (~i19) & (i18 | 59);
                int i21 = i19 << 1;
                int i22 = ((i20 | i21) << 1) - (i21 ^ i20);
                int i23 = i22 % 128;
                f52408t0 = i23;
                int i24 = i22 % 2;
                if (!(!acnVar2.f52411r0)) {
                    int i25 = i18 + 93;
                    f52408t0 = i25 % 128;
                    int i26 = i25 % 2;
                    throw new IllegalStateException("closed".toString());
                }
                int i27 = i23 & 121;
                int i28 = (i23 ^ 121) | i27;
                int i29 = (i27 & i28) + (i27 | i28);
                f52407s0 = i29 % 128;
                int i30 = i29 % 2;
                int i31 = i23 & 63;
                int i32 = ((~i31) & (i23 | 63)) + (i31 << 1);
                f52407s0 = i32 % 128;
                int i33 = i32 % 2;
                acnVar2.f52410q0.setAlwaysDrawnWithCacheEnabled(jLongValue);
                abv abvVar = (abv) setDividerPadding(new Object[]{acnVar2}, -1295783459, 1295783472, System.identityHashCode(acnVar2));
                int i34 = f52408t0;
                int i35 = (i34 ^ 121) + ((i34 & 121) << 1);
                f52407s0 = i35 % 128;
                int i36 = i35 % 2;
                return abvVar;
            case 3:
                return c(objArr);
            case 4:
                b(objArr);
                return null;
            case 5:
                acn acnVar3 = (acn) objArr[0];
                int i37 = f52407s0 + 65;
                int i38 = i37 % 128;
                f52408t0 = i38;
                int i39 = i37 % 2;
                boolean z10 = acnVar3.f52411r0;
                if (i39 == 0) {
                    throw null;
                }
                if (!z10) {
                    int i40 = ((i38 | 97) << 1) - (i38 ^ 97);
                    f52407s0 = i40 % 128;
                    int i41 = i40 % 2;
                    string = Boolean.TRUE;
                } else {
                    int i42 = i38 + 51;
                    f52407s0 = i42 % 128;
                    if (i42 % 2 != 0) {
                        int i43 = 24 / 0;
                    }
                    string = Boolean.FALSE;
                }
                break;
                break;
            case 6:
                return f(objArr);
            case 7:
                return d(objArr);
            case 8:
                e(objArr);
                return null;
            case 9:
                acn acnVar4 = (acn) objArr[0];
                byte[] bArr = (byte[]) objArr[1];
                int iIntValue = ((Number) objArr[2]).intValue();
                int iIntValue2 = ((Number) objArr[3]).intValue();
                int i44 = f52407s0;
                int i45 = i44 & 91;
                int i46 = (i44 | 91) & (~i45);
                int i47 = i45 << 1;
                int i48 = (i46 & i47) + (i46 | i47);
                f52408t0 = i48 % 128;
                int i49 = i48 % 2;
                Intrinsics.checkNotNullParameter(bArr, "");
                if (acnVar4.f52411r0) {
                    int i50 = f52408t0;
                    int i51 = i50 | 85;
                    int i52 = ((i51 << 1) - (~(-((~(i50 & 85)) & i51)))) - 1;
                    f52407s0 = i52 % 128;
                    int i53 = i52 % 2;
                    throw new IllegalStateException("closed".toString());
                }
                int i54 = f52408t0;
                int i55 = i54 ^ 81;
                int i56 = (i54 & 81) << 1;
                int i57 = ((i55 | i56) << 1) - (i55 ^ i56);
                f52407s0 = i57 % 128;
                int i58 = i57 % 2;
                int i59 = i54 & 47;
                int i60 = ((i54 | 47) & (~i59)) + (i59 << 1);
                f52407s0 = i60 % 128;
                int i61 = i60 % 2;
                abv abvVar2 = (abv) setDividerPadding(new Object[]{acnVar4}, -1295783459, 1295783472, System.identityHashCode(acnVar4));
                int i62 = f52407s0;
                int i63 = i62 & 121;
                int i64 = ((i62 | 121) & (~i63)) + (i63 << 1);
                f52408t0 = i64 % 128;
                int i65 = i64 % 2;
                return abvVar2;
            case 10:
                return a(objArr);
            case 11:
                acn acnVar5 = (acn) objArr[0];
                int i66 = f52407s0;
                int i67 = i66 | 123;
                int i68 = i67 << 1;
                int i69 = -(i67 & (~(i66 & 123)));
                int i70 = ((i68 | i69) << 1) - (i69 ^ i68);
                f52408t0 = i70 % 128;
                int i71 = i70 % 2;
                abx abxVar = acnVar5.f52410q0;
                int i72 = ((i66 | 57) << 1) - (i66 ^ 57);
                f52408t0 = i72 % 128;
                int i73 = i72 % 2;
                return abxVar;
            case 12:
                acn acnVar6 = (acn) objArr[0];
                int i74 = f52407s0;
                int i75 = i74 & 25;
                int i76 = ((i74 ^ 25) | i75) << 1;
                int i77 = -((i74 | 25) & (~i75));
                int i78 = (i76 ^ i77) + ((i77 & i76) << 1);
                f52408t0 = i78 % 128;
                if (i78 % 2 == 0) {
                    acnVar6.f52409p0.setY();
                    throw null;
                }
                string = acnVar6.f52409p0.setY();
                int i79 = f52408t0;
                int i80 = ((i79 | 95) << 1) - (i79 ^ 95);
                f52407s0 = i80 % 128;
                if (i80 % 2 != 0) {
                    throw null;
                }
                break;
            case 13:
                acn acnVar7 = (acn) objArr[0];
                int i81 = f52407s0;
                int i82 = i81 ^ 121;
                int i83 = -(-((i81 & 121) << 1));
                int i84 = (i82 ^ i83) + ((i82 & i83) << 1);
                int i85 = i84 % 128;
                f52408t0 = i85;
                int i86 = i84 % 2;
                if (acnVar7.f52411r0) {
                    int i87 = i85 + 71;
                    f52407s0 = i87 % 128;
                    int i88 = i87 % 2;
                    throw new IllegalStateException("closed".toString());
                }
                int i89 = i81 & 123;
                int i90 = (i81 | 123) & (~i89);
                int i91 = -(-(i89 << 1));
                int i92 = (i90 & i91) + (i90 | i91);
                f52408t0 = i92 % 128;
                int i93 = i92 % 2;
                long dividerPadding = acnVar7.f52410q0.setDividerPadding();
                if (dividerPadding > 0) {
                    int i94 = f52407s0;
                    int i95 = i94 & 35;
                    int i96 = ((((i94 ^ 35) | i95) << 1) - (~(-((i94 | 35) & (~i95))))) - 1;
                    f52408t0 = i96 % 128;
                    int i97 = i96 % 2;
                    acnVar7.f52409p0.setDividerPadding(acnVar7.f52410q0, dividerPadding);
                    int i98 = f52408t0;
                    int i99 = ((i98 ^ 123) | (i98 & 123)) << 1;
                    int i100 = -(((~i98) & 123) | (i98 & (-124)));
                    int i101 = (i99 ^ i100) + ((i100 & i99) << 1);
                    f52407s0 = i101 % 128;
                    int i102 = i101 % 2;
                }
                int i103 = f52407s0;
                int i104 = i103 ^ 67;
                int i105 = -(-((i103 & 67) << 1));
                int i106 = (i104 ^ i105) + ((i105 & i104) << 1);
                f52408t0 = i106 % 128;
                int i107 = i106 % 2;
                return acnVar7;
            case 14:
                acn acnVar8 = (acn) objArr[0];
                int iIntValue3 = ((Number) objArr[1]).intValue();
                int i108 = f52408t0;
                int i109 = ~i108;
                int i110 = (((i108 ^ 21) | (i108 & 21)) << 1) - ((i108 & (-22)) | (i109 & 21));
                f52407s0 = i110 % 128;
                int i111 = i110 % 2;
                if (!(!acnVar8.f52411r0)) {
                    int i112 = (i108 & 19) + (i108 | 19);
                    f52407s0 = i112 % 128;
                    int i113 = i112 % 2;
                    throw new IllegalStateException("closed".toString());
                }
                int i114 = (((i108 & (-72)) | (71 & i109)) - (~((i108 & 71) << 1))) - 1;
                int i115 = i114 % 128;
                f52407s0 = i115;
                int i116 = i114 % 2;
                int i117 = ((((i115 ^ 17) | (i115 & 17)) << 1) - (~(-(((~i115) & 17) | (i115 & (-18)))))) - 1;
                f52408t0 = i117 % 128;
                int i118 = i117 % 2;
                abv abvVar3 = (abv) setDividerPadding(new Object[]{acnVar8}, -1295783459, 1295783472, System.identityHashCode(acnVar8));
                int i119 = f52408t0;
                int i120 = i119 & 7;
                int i121 = ((i119 ^ 7) | i120) << 1;
                int i122 = -((i119 | 7) & (~i120));
                int i123 = (i121 ^ i122) + ((i122 & i121) << 1);
                f52407s0 = i123 % 128;
                int i124 = i123 % 2;
                return abvVar3;
            case 15:
                acn acnVar9 = (acn) objArr[0];
                byte[] bArr2 = (byte[]) objArr[1];
                int i125 = f52408t0;
                int i126 = i125 ^ 31;
                int i127 = (((i125 & 31) | i126) << 1) - i126;
                f52407s0 = i127 % 128;
                if (i127 % 2 != 0) {
                    Intrinsics.checkNotNullParameter(bArr2, "");
                    boolean z11 = acnVar9.f52411r0;
                    throw null;
                }
                Intrinsics.checkNotNullParameter(bArr2, "");
                if (acnVar9.f52411r0) {
                    int i128 = f52408t0 + 15;
                    f52407s0 = i128 % 128;
                    int i129 = i128 % 2;
                    throw new IllegalStateException("closed".toString());
                }
                int i130 = f52407s0;
                int i131 = ~i130;
                int i132 = ((((i130 ^ 73) | (i130 & 73)) << 1) - (~(-((i130 & (-74)) | (73 & i131))))) - 1;
                f52408t0 = i132 % 128;
                int i133 = i132 % 2;
                int i134 = ((i130 ^ 109) | (i130 & 109)) << 1;
                int i135 = -((i130 & (-110)) | (i131 & 109));
                int i136 = ((i134 | i135) << 1) - (i135 ^ i134);
                f52408t0 = i136 % 128;
                int i137 = i136 % 2;
                abx abxVar2 = acnVar9.f52410q0;
                abv abvVar4 = (abv) setDividerPadding(new Object[]{acnVar9}, -1295783459, 1295783472, System.identityHashCode(acnVar9));
                int i138 = f52407s0;
                int i139 = (i138 ^ 97) + ((i138 & 97) << 1);
                f52408t0 = i139 % 128;
                int i140 = i139 % 2;
                return abvVar4;
            case 16:
                acn acnVar10 = (acn) objArr[0];
                int i141 = f52408t0;
                int i142 = i141 ^ 19;
                int i143 = -(-((i141 & 19) << 1));
                int i144 = (i142 ^ i143) + ((i143 & i142) << 1);
                f52407s0 = i144 % 128;
                if (i144 % 2 != 0) {
                    boolean z12 = acnVar10.f52411r0;
                    throw null;
                }
                if (!acnVar10.f52411r0) {
                    abx abxVar3 = acnVar10.f52410q0;
                    if (((Long) abx.setOnFocusChangeListener(new Object[]{abxVar3}, 1395393434, -1395393402, System.identityHashCode(abxVar3))).longValue() > 0) {
                        int i145 = f52408t0 + 111;
                        f52407s0 = i145 % 128;
                        int i146 = i145 % 2;
                        aco acoVar = acnVar10.f52409p0;
                        abx abxVar4 = acnVar10.f52410q0;
                        acoVar.setDividerPadding(abxVar4, ((Long) abx.setOnFocusChangeListener(new Object[]{abxVar4}, 1395393434, -1395393402, System.identityHashCode(abxVar4))).longValue());
                        int i147 = f52407s0;
                        int i148 = (i147 ^ 65) + ((i147 & 65) << 1);
                        f52408t0 = i148 % 128;
                        int i149 = i148 % 2;
                    }
                    th = null;
                    try {
                        acnVar10.f52409p0.close();
                        int i150 = f52408t0;
                        int i151 = (((i150 | 68) << 1) - (i150 ^ 68)) - 1;
                        f52407s0 = i151 % 128;
                        int i152 = i151 % 2;
                    } catch (Throwable th2) {
                        if (th == null) {
                            int i153 = f52407s0;
                            int i154 = (i153 & 45) + (i153 | 45);
                            f52408t0 = i154 % 128;
                            int i155 = i154 % 2;
                            th = th2;
                        }
                    }
                    acnVar10.f52411r0 = true;
                    if (th != null) {
                        int i156 = f52407s0;
                        int i157 = i156 & 63;
                        int i158 = (i157 - (~((i156 ^ 63) | i157))) - 1;
                        f52408t0 = i158 % 128;
                        int i159 = i158 % 2;
                        throw th;
                    }
                }
                int i160 = f52408t0 + 10;
                int i161 = (i160 ^ (-1)) + (i160 << 1);
                f52407s0 = i161 % 128;
                if (i161 % 2 == 0) {
                    return null;
                }
                int i162 = 42 / 0;
                return null;
            case 17:
                acn acnVar11 = (acn) objArr[0];
                String str = (String) objArr[1];
                int i163 = f52407s0;
                int i164 = ((i163 & 110) + (i163 | 110)) - 1;
                f52408t0 = i164 % 128;
                if (i164 % 2 == 0) {
                    Intrinsics.checkNotNullParameter(str, "");
                    boolean z13 = acnVar11.f52411r0;
                    throw null;
                }
                Intrinsics.checkNotNullParameter(str, "");
                if (acnVar11.f52411r0) {
                    int i165 = f52408t0 + 46;
                    int i166 = (i165 ^ (-1)) + (i165 << 1);
                    f52407s0 = i166 % 128;
                    int i167 = i166 % 2;
                    throw new IllegalStateException("closed".toString());
                }
                int i168 = f52408t0;
                int i169 = i168 ^ 119;
                int i170 = -(-((i168 & 119) << 1));
                int i171 = (i169 & i170) + (i170 | i169);
                f52407s0 = i171 % 128;
                int i172 = i171 % 2;
                abx abxVar5 = acnVar11.f52410q0;
                string = (abv) setDividerPadding(new Object[]{acnVar11}, -1295783459, 1295783472, System.identityHashCode(acnVar11));
                int i173 = f52407s0;
                int i174 = (-2) - (((i173 ^ 74) + ((i173 & 74) << 1)) ^ (-1));
                f52408t0 = i174 % 128;
                if (i174 % 2 == 0) {
                    throw null;
                }
                break;
            default:
                acn acnVar12 = (acn) objArr[0];
                abw abwVar = (abw) objArr[1];
                int i175 = f52407s0;
                int i176 = i175 & 41;
                int i177 = (i176 - (~(-(-((41 ^ i175) | i176))))) - 1;
                f52408t0 = i177 % 128;
                if (i177 % 2 == 0) {
                    Intrinsics.checkNotNullParameter(abwVar, "");
                    boolean z14 = acnVar12.f52411r0;
                    throw null;
                }
                Intrinsics.checkNotNullParameter(abwVar, "");
                if (acnVar12.f52411r0) {
                    int i178 = f52407s0;
                    int i179 = i178 & 95;
                    int i180 = (i179 - (~(-(-((i178 ^ 95) | i179))))) - 1;
                    f52408t0 = i180 % 128;
                    int i181 = i180 % 2;
                    throw new IllegalStateException("closed".toString());
                }
                int i182 = f52407s0;
                int i183 = ((i182 | 63) << 1) - (i182 ^ 63);
                int i184 = i183 % 128;
                f52408t0 = i184;
                int i185 = i183 % 2;
                int i186 = i184 & 17;
                int i187 = (i184 | 17) & (~i186);
                int i188 = i186 << 1;
                int i189 = (i187 & i188) + (i187 | i188);
                f52407s0 = i189 % 128;
                int i190 = i189 % 2;
                acnVar12.f52410q0.setY(abwVar);
                string = (abv) setDividerPadding(new Object[]{acnVar12}, -1295783459, 1295783472, System.identityHashCode(acnVar12));
                int i191 = f52407s0;
                int i192 = i191 & 87;
                int i193 = -(-((i191 ^ 87) | i192));
                int i194 = (i192 ^ i193) + ((i193 & i192) << 1);
                f52408t0 = i194 % 128;
                if (i194 % 2 == 0) {
                    throw null;
                }
                break;
        }
        return string;
    }

    @Override // com.mypinpad.tsdk.isolation.aco, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws Throwable {
        setDividerPadding(new Object[]{this}, 1395713062, -1395713046, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.abv, com.mypinpad.tsdk.isolation.aco, java.io.Flushable
    public final void flush() throws Throwable {
        setDividerPadding(new Object[]{this}, 1919643495, -1919643491, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.abv
    @NotNull
    public final abv getAmountFieldTextColor() {
        return (abv) setDividerPadding(new Object[]{this}, -1295783459, 1295783472, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.abv
    @NotNull
    public final abv getNavBarTitleString(int i10) {
        return (abv) setDividerPadding(new Object[]{this, Integer.valueOf(i10)}, 1286972024, -1286972010, i10);
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return ((Boolean) setDividerPadding(new Object[]{this}, -1198745497, 1198745502, System.identityHashCode(this))).booleanValue();
    }

    @Override // com.mypinpad.tsdk.isolation.abv
    @NotNull
    public final abv setCompoundDrawableTintBlendMode(@NotNull String str) {
        return (abv) setDividerPadding(new Object[]{this, str}, -1945426173, 1945426190, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.abv
    @NotNull
    public final abv setIncludeFontPadding(long j10) {
        return (abv) setDividerPadding(new Object[]{this, Long.valueOf(j10)}, 1968167261, -1968167259, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.abv
    @NotNull
    public final abv setLayoutAnimation(int i10) {
        return (abv) setDividerPadding(new Object[]{this, Integer.valueOf(i10)}, 2045279566, -2045279563, i10);
    }

    @Override // com.mypinpad.tsdk.isolation.abv
    @NotNull
    public final abv setNavigationOnClickListener(int i10) {
        return (abv) setDividerPadding(new Object[]{this, Integer.valueOf(i10)}, -830666072, 830666079, i10);
    }

    @Override // com.mypinpad.tsdk.isolation.abv, com.mypinpad.tsdk.isolation.aby
    @NotNull
    public final abx setOnFocusChangeListener() {
        return (abx) setDividerPadding(new Object[]{this}, 1077299114, -1077299103, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.abv
    @NotNull
    public final abv setTextAlignment(long j10) {
        return (abv) setDividerPadding(new Object[]{this, Long.valueOf(j10)}, 794382350, -794382344, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.abv
    @NotNull
    public final abv setX(@NotNull byte[] bArr, int i10, int i11) {
        return (abv) setDividerPadding(new Object[]{this, bArr, Integer.valueOf(i10), Integer.valueOf(i11)}, -1300821872, 1300821881, i10);
    }

    @Override // com.mypinpad.tsdk.isolation.aco
    @NotNull
    public final acq setY() {
        return (acq) setDividerPadding(new Object[]{this}, 1022804882, -1022804870, System.identityHashCode(this));
    }

    @NotNull
    public final String toString() {
        return (String) setDividerPadding(new Object[]{this}, -1592846, 1592847, System.identityHashCode(this));
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(@NotNull ByteBuffer byteBuffer) {
        return ((Integer) setDividerPadding(new Object[]{this, byteBuffer}, 2099184519, -2099184509, System.identityHashCode(this))).intValue();
    }

    @Override // com.mypinpad.tsdk.isolation.abv
    @NotNull
    public final abv setCompoundDrawableTintBlendMode(@NotNull abw abwVar) {
        return (abv) setDividerPadding(new Object[]{this, abwVar}, 657075460, -657075460, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.abv
    @NotNull
    public final abv setDividerPadding(@NotNull byte[] bArr) {
        return (abv) setDividerPadding(new Object[]{this, bArr}, 16726623, -16726608, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.aco
    public final void setDividerPadding(@NotNull abx abxVar, long j10) throws Throwable {
        setDividerPadding(new Object[]{this, abxVar, Long.valueOf(j10)}, 219766939, -219766931, System.identityHashCode(this));
    }
}
