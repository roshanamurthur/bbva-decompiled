package com.mypinpad.tsdk.isolation;

import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.util.zip.CRC32;
import java.util.zip.Inflater;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class aca implements acp {

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public static int f52370u0 = 0;
    public static int v0 = 1;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public byte f52371p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    @NotNull
    public final acm f52372q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    @NotNull
    public final Inflater f52373r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    @NotNull
    public final acb f52374s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    @NotNull
    public final CRC32 f52375t0;

    public aca(@NotNull acp acpVar) {
        Intrinsics.checkNotNullParameter(acpVar, "");
        acm acmVar = new acm(acpVar);
        this.f52372q0 = acmVar;
        Inflater inflater = new Inflater(true);
        this.f52373r0 = inflater;
        this.f52374s0 = new acb(acmVar, inflater);
        this.f52375t0 = new CRC32();
    }

    public static /* synthetic */ void a(Object[] objArr) {
        aca acaVar = (aca) objArr[0];
        abx abxVar = (abx) objArr[1];
        long jLongValue = ((Number) objArr[2]).longValue();
        long jLongValue2 = ((Number) objArr[3]).longValue();
        int i10 = f52370u0;
        int i11 = i10 & 55;
        int i12 = -(-((i10 ^ 55) | i11));
        int i13 = ((i11 | i12) << 1) - (i12 ^ i11);
        v0 = i13 % 128;
        if (i13 % 2 == 0) {
            Intrinsics.checkNotNull(abxVar.setDividerPadding);
            throw null;
        }
        acj acjVar = abxVar.setDividerPadding;
        Intrinsics.checkNotNull(acjVar);
        while (true) {
            int i14 = acjVar.setX;
            int i15 = acjVar.setCompoundDrawableTintBlendMode;
            int i16 = -i15;
            int i17 = i14 & i16;
            int i18 = i16 | i14;
            int i19 = -(-i18);
            if (jLongValue < (i17 ^ i19) + ((i19 & i17) << 1)) {
                break;
            }
            int i20 = f52370u0;
            int i21 = ((i20 | 17) << 1) - (i20 ^ 17);
            v0 = i21 % 128;
            jLongValue = i21 % 2 == 0 ? jLongValue & ((long) (i14 / i15)) : jLongValue - ((long) ((((~i17) & i18) - (~(-(-(i17 << 1))))) - 1));
            acjVar = acjVar.setDividerPadding;
            Intrinsics.checkNotNull(acjVar);
            int i22 = f52370u0 + 87;
            v0 = i22 % 128;
            int i23 = i22 % 2;
        }
        while (jLongValue2 > 0) {
            int i24 = f52370u0;
            int i25 = i24 & 79;
            int i26 = -(-((i24 ^ 79) | i25));
            int i27 = (i25 & i26) + (i26 | i25);
            v0 = i27 % 128;
            int i28 = i27 % 2;
            int i29 = (int) (((long) acjVar.setCompoundDrawableTintBlendMode) + jLongValue);
            int i30 = acjVar.setX;
            int i31 = -i29;
            int iMin = (int) Math.min((i30 ^ i31) + ((i30 & i31) << 1), jLongValue2);
            acaVar.f52375t0.update(acjVar.setOnFocusChangeListener, i29, iMin);
            jLongValue2 -= (long) iMin;
            acjVar = acjVar.setDividerPadding;
            Intrinsics.checkNotNull(acjVar);
            int i32 = v0;
            int i33 = ((i32 & 124) + (i32 | 124)) - 1;
            f52370u0 = i33 % 128;
            int i34 = i33 % 2;
            jLongValue = 0;
        }
        int i35 = f52370u0;
        int i36 = ((i35 ^ 98) + ((i35 & 98) << 1)) - 1;
        v0 = i36 % 128;
        if (i36 % 2 == 0) {
            throw null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:37:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:39:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:42:0x01de  */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x08f3, code lost:
    
        if (r2 == r1) goto L128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x08f6, code lost:
    
        if (r2 == r1) goto L128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x08f8, code lost:
    
        r0 = r3 & 113;
        r0 = (r0 - (~(-(-((r3 ^ 113) | r0))))) - 1;
        com.mypinpad.tsdk.isolation.aca.f52370u0 = r0 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x0907, code lost:
    
        if ((r0 % 2) != 0) goto L132;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x090d, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x0929, code lost:
    
        throw new java.io.IOException(ai.a.i(new java.lang.Object[]{r0, java.lang.Integer.valueOf(r2), java.lang.Integer.valueOf(r1)}, 3, "%s: actual 0x%08x != expected 0x%08x", ""));
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x01db, code lost:
    
        if (((java.lang.Boolean) com.mypinpad.tsdk.isolation.acm.setCompoundDrawableTintBlendMode(new java.lang.Object[]{r6}, -602565760, 602565766, java.lang.System.identityHashCode(r6))).booleanValue() != false) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x01fd, code lost:
    
        if (((java.lang.Boolean) com.mypinpad.tsdk.isolation.acm.setCompoundDrawableTintBlendMode(new java.lang.Object[]{r6}, -602565760, 602565766, java.lang.System.identityHashCode(r6))).booleanValue() != false) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0207, code lost:
    
        throw new java.io.IOException("gzip finished without exhausting source");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ java.lang.Object setCompoundDrawableTintBlendMode(java.lang.Object[] r31, int r32, int r33, int r34) throws java.security.NoSuchAlgorithmException, java.io.IOException {
        /*
            Method dump skipped, instruction units count: 2362
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.aca.setCompoundDrawableTintBlendMode(java.lang.Object[], int, int, int):java.lang.Object");
    }

    @Override // com.mypinpad.tsdk.isolation.acp, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws NoSuchAlgorithmException, IOException {
        setCompoundDrawableTintBlendMode(new Object[]{this}, -1369991503, 1369991507, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.acp
    @NotNull
    public final acq setY() {
        return (acq) setCompoundDrawableTintBlendMode(new Object[]{this}, 966152174, -966152172, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.acp
    public final long setY(@NotNull abx abxVar, long j10) throws IOException {
        return ((Long) setCompoundDrawableTintBlendMode(new Object[]{this, abxVar, Long.valueOf(j10)}, 763404245, -763404245, System.identityHashCode(this))).longValue();
    }
}
