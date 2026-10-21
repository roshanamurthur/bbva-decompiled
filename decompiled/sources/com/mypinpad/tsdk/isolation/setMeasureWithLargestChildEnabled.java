package com.mypinpad.tsdk.isolation;

import com.vasco.digipass.sdk.utils.utilities.UtilitiesSDKConstants;
import java.io.Serializable;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class setMeasureWithLargestChildEnabled implements Serializable {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public static final char[] f60104q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public static final char f60105r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public static int f60106s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public static int f60107t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public static int f60108u0;
    public static int v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public static final byte[] f60109w0 = null;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NotNull
    public final byte[] f60110p0;

    static {
        b();
        f60108u0 = 0;
        v0 = 1;
        f60106s0 = 0;
        f60107t0 = 1;
        f60105r0 = (char) 53956;
        f60104q0 = new char[]{59191, 59193, 59186, 58561, 59147, 59195, 59190, 59197, 59259, 59154, 59176, 59188, 59182, 59253, 59170, 59254, 59177, 59198, 59179, 59196, 59192, 59199, 59194, 59189, 59183};
    }

    public setMeasureWithLargestChildEnabled(@NotNull byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "");
        this.f60110p0 = bArr;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x002a  */
    /* JADX WARN: Code duplicated, block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002a -> B:11:0x0034). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x002a
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static void a(int r6, short r7, int r8, java.lang.Object[] r9) {
        /*
            int r8 = r8 * 4
            int r8 = 4 - r8
            int r6 = 106 - r6
            int r7 = r7 * 4
            int r0 = 1 - r7
            byte[] r0 = new byte[r0]
            r1 = 0
            int r7 = 0 - r7
            byte[] r2 = com.mypinpad.tsdk.isolation.setMeasureWithLargestChildEnabled.f60109w0
            if (r2 != 0) goto L1a
            r4 = r1
            r3 = r2
            r2 = r0
            r0 = r9
            r9 = r8
            r8 = r7
            goto L34
        L1a:
            r3 = r1
        L1b:
            byte r4 = (byte) r6
            r0[r3] = r4
            int r4 = r3 + 1
            if (r3 != r7) goto L2a
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r1)
            r9[r1] = r6
            return
        L2a:
            r3 = r2[r8]
            r5 = r7
            r7 = r6
            r6 = r3
            r3 = r2
            r2 = r0
            r0 = r9
            r9 = r8
            r8 = r5
        L34:
            int r6 = r6 + r7
            int r7 = r9 + 1
            r9 = r0
            r0 = r2
            r2 = r3
            r3 = r4
            r5 = r8
            r8 = r7
            r7 = r5
            goto L1b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.setMeasureWithLargestChildEnabled.a(int, short, int, java.lang.Object[]):void");
    }

    public static void b() {
        f60109w0 = new byte[]{91, -14, -6, UtilitiesSDKConstants.SRP_LABEL_MAC};
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v8 java.lang.NullPointerException, still in use, count: 2, list:
          (r0v8 java.lang.NullPointerException) from 0x0107: MOVE (r24v0 java.lang.NullPointerException) = (r0v8 java.lang.NullPointerException) (LINE:264)
          (r0v8 java.lang.NullPointerException) from 0x0066: PHI (r0v19 java.lang.NullPointerException) = (r0v8 java.lang.NullPointerException), (r0v29 java.lang.NullPointerException) binds: [B:18:0x0062, B:26:0x00e5] A[DONT_GENERATE, DONT_INLINE]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
        	at jadx.core.utils.InsnRemover.addAndUnbind(InsnRemover.java:59)
        	at jadx.core.dex.visitors.ModVisitor.removeStep(ModVisitor.java:463)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:97)
        */
    public final boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object r33) {
        /*
            Method dump skipped, instruction units count: 985
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.setMeasureWithLargestChildEnabled.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int iHashCode;
        int i10 = f60106s0 + 33;
        f60107t0 = i10 % 128;
        int i11 = i10 % 2;
        byte[] bArr = this.f60110p0;
        if (i11 == 0) {
            iHashCode = Arrays.hashCode(bArr);
            int i12 = 93 / 0;
        } else {
            iHashCode = Arrays.hashCode(bArr);
        }
        int i13 = f60107t0 + 95;
        f60106s0 = i13 % 128;
        if (i13 % 2 == 0) {
            return iHashCode;
        }
        throw null;
    }

    @NotNull
    public final byte[] setCompoundDrawableTintBlendMode() {
        int i10 = f60106s0 + 55;
        int i11 = i10 % 128;
        f60107t0 = i11;
        int i12 = i10 % 2;
        int i13 = i11 + 91;
        f60106s0 = i13 % 128;
        int i14 = i13 % 2;
        return this.f60110p0;
    }
}
