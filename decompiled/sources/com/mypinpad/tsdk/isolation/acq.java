package com.mypinpad.tsdk.isolation;

import com.bbva.sl.ar.android.sslpinning.result.ResultCode;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0016\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u0007¢\u0006\u0004\b\u0016\u0010\u0015J\u001f\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0017¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\tJ\u0017\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0000H\u0017¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0000H\u0017¢\u0006\u0004\b\u0012\u0010\u0011J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015"}, d2 = {"Lcom/mypinpad/tsdk/i/acq;", "", "", "p0", "Ljava/util/concurrent/TimeUnit;", "p1", "setOnFocusChangeListener", "(JLjava/util/concurrent/TimeUnit;)Lcom/mypinpad/tsdk/i/acq;", "a_", "()J", "", "b_", "()Z", "c_", "setY", "(J)Lcom/mypinpad/tsdk/i/acq;", "d_", "()Lcom/mypinpad/tsdk/i/acq;", "setOnDragListener", "", "getNavBarTitleString", "()V", "<init>", "setCompoundDrawableTintBlendMode"}, k = 1, mv = {1, 5, 1})
public class acq {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static int f52412d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static int f52413e = 1;

    /* JADX INFO: renamed from: setCompoundDrawableTintBlendMode, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @JvmField
    @NotNull
    public static final acq setDividerPadding = new setX();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f52414a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f52415b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f52416c;

    /* JADX INFO: renamed from: com.mypinpad.tsdk.i.acq$setCompoundDrawableTintBlendMode, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/mypinpad/tsdk/i/acq$setCompoundDrawableTintBlendMode;", "", "Lcom/mypinpad/tsdk/i/acq;", "setDividerPadding", "Lcom/mypinpad/tsdk/i/acq;", "setOnFocusChangeListener", "<init>", "()V"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static final class setX extends acq {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static int f52417f = 0;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static int f52418g = 1;

        public static /* synthetic */ Object setCompoundDrawableTintBlendMode(Object[] objArr, int i10, int i11, int i12) {
            int i13 = (i11 * (-520)) + (i10 * ResultCode.ERROR_TRUST_CERT_DATE_BEFOREVALIDITY);
            int i14 = ~i12;
            int i15 = ((i11 | i12) * ResultCode.ERROR_TRUST_CERT_DATE_AFTERVALIDITY) + (((~(i14 | i11)) | i10) * (-1042)) + i13;
            int i16 = ~i10;
            int i17 = (((~(i10 | i14 | i11)) | (~(i12 | i16)) | (~((~i11) | i16))) * ResultCode.ERROR_TRUST_CERT_DATE_AFTERVALIDITY) + i15;
            if (i17 == 1) {
                setX setx = (setX) objArr[0];
                ((Number) objArr[1]).longValue();
                int i18 = f52418g + 11;
                int i19 = i18 % 128;
                f52417f = i19;
                int i20 = i18 % 2;
                int i21 = i19 + 15;
                f52418g = i21 % 128;
                if (i21 % 2 != 0) {
                    return setx;
                }
                int i22 = 63 / 0;
                return setx;
            }
            if (i17 == 2) {
                int i23 = f52417f;
                int i24 = i23 ^ 107;
                int i25 = (i23 & 107) << 1;
                int i26 = ((i24 | i25) << 1) - (i25 ^ i24);
                f52418g = i26 % 128;
                if (i26 % 2 != 0) {
                    return null;
                }
                int i27 = 40 / 0;
                return null;
            }
            setX setx2 = (setX) objArr[0];
            ((Number) objArr[1]).longValue();
            TimeUnit timeUnit = (TimeUnit) objArr[2];
            int i28 = f52417f;
            int i29 = i28 | 107;
            int i30 = (i29 << 1) - ((~(i28 & 107)) & i29);
            f52418g = i30 % 128;
            if (i30 % 2 != 0) {
                Intrinsics.checkNotNullParameter(timeUnit, "");
                return setx2;
            }
            Intrinsics.checkNotNullParameter(timeUnit, "");
            throw null;
        }

        @Override // com.mypinpad.tsdk.isolation.acq
        public final void getNavBarTitleString() {
            setCompoundDrawableTintBlendMode(new Object[]{this}, -1872190059, 1872190061, System.identityHashCode(this));
        }

        @Override // com.mypinpad.tsdk.isolation.acq
        @NotNull
        public final acq setOnFocusChangeListener(long j10, @NotNull TimeUnit timeUnit) {
            return (acq) setCompoundDrawableTintBlendMode(new Object[]{this, Long.valueOf(j10), timeUnit}, -585872512, 585872512, System.identityHashCode(this));
        }

        @Override // com.mypinpad.tsdk.isolation.acq
        @NotNull
        public final acq setY(long j10) {
            return (acq) setCompoundDrawableTintBlendMode(new Object[]{this, Long.valueOf(j10)}, -1142146454, 1142146455, System.identityHashCode(this));
        }
    }

    static {
        int i10 = f52412d;
        int i11 = ((i10 | 63) << 1) - (((~i10) & 63) | (i10 & (-64)));
        f52413e = i11 % 128;
        if (i11 % 2 == 0) {
            int i12 = 58 / 0;
        }
    }

    public long a_() {
        int i10 = f52412d;
        int i11 = i10 | 15;
        int i12 = i11 << 1;
        int i13 = -((~(i10 & 15)) & i11);
        int i14 = ((i12 | i13) << 1) - (i13 ^ i12);
        int i15 = i14 % 128;
        f52413e = i15;
        int i16 = i14 % 2;
        long j10 = this.f52416c;
        int i17 = i15 & 69;
        int i18 = (i15 ^ 69) | i17;
        int i19 = (i17 ^ i18) + ((i18 & i17) << 1);
        f52412d = i19 % 128;
        if (i19 % 2 == 0) {
            return j10;
        }
        throw null;
    }

    public boolean b_() {
        int i10 = f52412d;
        int i11 = (i10 & 11) + (i10 | 11);
        f52413e = i11 % 128;
        int i12 = i11 % 2;
        boolean z10 = this.f52414a;
        if (i12 == 0) {
            int i13 = 55 / 0;
        }
        return z10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x003a, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0046, code lost:
    
        throw new java.lang.IllegalStateException("No deadline".toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0019, code lost:
    
        if (r5.f52414a != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001e, code lost:
    
        if (r5.f52414a != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0020, code lost:
    
        r1 = r5.f52415b;
        r4 = r0 & 17;
        r3 = ((r0 ^ 17) | r4) << 1;
        r0 = -((r0 | 17) & (~r4));
        r4 = (r3 ^ r0) + ((r0 & r3) << 1);
        com.mypinpad.tsdk.isolation.acq.f52412d = r4 % 128;
        r4 = r4 % 2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public long c_() {
        /*
            r5 = this;
            int r0 = com.mypinpad.tsdk.isolation.acq.f52413e
            r1 = r0 | 98
            int r1 = r1 << 1
            r2 = r0 ^ 98
            int r1 = r1 - r2
            int r1 = r1 + (-1)
            int r2 = r1 % 128
            com.mypinpad.tsdk.isolation.acq.f52412d = r2
            int r1 = r1 % 2
            if (r1 == 0) goto L1c
            boolean r1 = r5.f52414a
            r2 = 23
            int r2 = r2 / 0
            if (r1 == 0) goto L3b
            goto L20
        L1c:
            boolean r1 = r5.f52414a
            if (r1 == 0) goto L3b
        L20:
            long r1 = r5.f52415b
            r3 = r0 ^ 17
            r4 = r0 & 17
            r3 = r3 | r4
            int r3 = r3 << 1
            int r4 = ~r4
            r0 = r0 | 17
            r0 = r0 & r4
            int r0 = -r0
            r4 = r3 ^ r0
            r0 = r0 & r3
            int r0 = r0 << 1
            int r4 = r4 + r0
            int r0 = r4 % 128
            com.mypinpad.tsdk.isolation.acq.f52412d = r0
            int r4 = r4 % 2
            return r1
        L3b:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "No deadline"
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.acq.c_():long");
    }

    @NotNull
    public acq d_() {
        int i10 = f52413e;
        int i11 = (((i10 ^ 97) | (i10 & 97)) << 1) - ((i10 & (-98)) | ((~i10) & 97));
        f52412d = i11 % 128;
        int i12 = i11 % 2;
        this.f52416c = 0L;
        int i13 = (i10 ^ 59) + ((i10 & 59) << 1);
        f52412d = i13 % 128;
        if (i13 % 2 == 0) {
            return this;
        }
        throw null;
    }

    public void getNavBarTitleString() throws IOException {
        int i10 = f52412d;
        int i11 = ((i10 | 7) << 1) - (i10 ^ 7);
        f52413e = i11 % 128;
        if (i11 % 2 == 0) {
            Thread.currentThread().isInterrupted();
            throw null;
        }
        if (Thread.currentThread().isInterrupted()) {
            throw new InterruptedIOException("interrupted");
        }
        if (this.f52414a) {
            int i12 = f52412d;
            int i13 = i12 ^ 119;
            int i14 = ((i12 & 119) | i13) << 1;
            int i15 = -i13;
            int i16 = (i14 & i15) + (i14 | i15);
            f52413e = i16 % 128;
            int i17 = i16 % 2;
            if (this.f52415b - System.nanoTime() <= 0) {
                throw new InterruptedIOException("deadline reached");
            }
        }
        int i18 = f52413e;
        int i19 = (i18 & (-106)) | ((~i18) & 105);
        int i20 = (i18 & 105) << 1;
        int i21 = (i19 ^ i20) + ((i20 & i19) << 1);
        f52412d = i21 % 128;
        if (i21 % 2 != 0) {
            throw null;
        }
    }

    @NotNull
    public acq setOnDragListener() {
        int i10 = f52413e;
        int i11 = ((i10 ^ 84) + ((i10 & 84) << 1)) - 1;
        f52412d = i11 % 128;
        int i12 = i11 % 2;
        this.f52414a = false;
        return this;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0058, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0059, code lost:
    
        r7 = com.mypinpad.tsdk.isolation.acq.f52413e;
        r0 = (((r7 ^ 21) | (r7 & 21)) << 1) - (((~r7) & 21) | (r7 & (-22)));
        com.mypinpad.tsdk.isolation.acq.f52412d = r0 % 128;
        r0 = r0 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0082, code lost:
    
        throw new java.lang.IllegalArgumentException(kotlin.jvm.internal.Intrinsics.stringPlus("timeout < 0: ", java.lang.Long.valueOf(r5)).toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0021, code lost:
    
        if (r5 >= 0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0029, code lost:
    
        if (r5 >= 0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x002b, code lost:
    
        r0 = com.mypinpad.tsdk.isolation.acq.f52413e;
        r1 = r0 ^ 45;
        r0 = ((r0 & 45) | r1) << 1;
        r1 = -r1;
        r2 = (r0 & r1) + (r0 | r1);
        com.mypinpad.tsdk.isolation.acq.f52412d = r2 % 128;
        r2 = r2 % 2;
        r4.f52416c = r7.toNanos(r5);
        r5 = com.mypinpad.tsdk.isolation.acq.f52412d;
        r6 = r5 & 51;
        r6 = (r6 - (~(-(-((r5 ^ 51) | r6))))) - 1;
        com.mypinpad.tsdk.isolation.acq.f52413e = r6 % 128;
        r6 = r6 % 2;
     */
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.mypinpad.tsdk.isolation.acq setOnFocusChangeListener(long r5, @org.jetbrains.annotations.NotNull java.util.concurrent.TimeUnit r7) {
        /*
            r4 = this;
            int r0 = com.mypinpad.tsdk.isolation.acq.f52412d
            r1 = r0 & (-96)
            int r2 = ~r0
            r3 = 95
            r2 = r2 & r3
            r1 = r1 | r2
            r0 = r0 & r3
            int r0 = r0 << 1
            r2 = r1 & r0
            r0 = r0 | r1
            int r2 = r2 + r0
            int r0 = r2 % 128
            com.mypinpad.tsdk.isolation.acq.f52413e = r0
            int r2 = r2 % 2
            r0 = 0
            java.lang.String r3 = ""
            if (r2 != 0) goto L24
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r3)
            int r0 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r0 < 0) goto L59
            goto L2b
        L24:
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r3)
            int r0 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r0 < 0) goto L59
        L2b:
            int r0 = com.mypinpad.tsdk.isolation.acq.f52413e
            r1 = r0 ^ 45
            r0 = r0 & 45
            r0 = r0 | r1
            int r0 = r0 << 1
            int r1 = -r1
            r2 = r0 & r1
            r0 = r0 | r1
            int r2 = r2 + r0
            int r0 = r2 % 128
            com.mypinpad.tsdk.isolation.acq.f52412d = r0
            int r2 = r2 % 2
            long r5 = r7.toNanos(r5)
            r4.f52416c = r5
            int r5 = com.mypinpad.tsdk.isolation.acq.f52412d
            r6 = r5 & 51
            r5 = r5 ^ 51
            r5 = r5 | r6
            int r5 = -r5
            int r5 = -r5
            int r5 = ~r5
            int r6 = r6 - r5
            int r6 = r6 + (-1)
            int r5 = r6 % 128
            com.mypinpad.tsdk.isolation.acq.f52413e = r5
            int r6 = r6 % 2
            return r4
        L59:
            int r7 = com.mypinpad.tsdk.isolation.acq.f52413e
            r0 = r7 ^ 21
            r1 = r7 & 21
            r0 = r0 | r1
            int r0 = r0 << 1
            r1 = r7 & (-22)
            int r7 = ~r7
            r7 = r7 & 21
            r7 = r7 | r1
            int r0 = r0 - r7
            int r7 = r0 % 128
            com.mypinpad.tsdk.isolation.acq.f52412d = r7
            int r0 = r0 % 2
            java.lang.String r7 = "timeout < 0: "
            java.lang.Long r5 = java.lang.Long.valueOf(r5)
            java.lang.String r5 = kotlin.jvm.internal.Intrinsics.stringPlus(r7, r5)
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r5 = r5.toString()
            r6.<init>(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.acq.setOnFocusChangeListener(long, java.util.concurrent.TimeUnit):com.mypinpad.tsdk.i.acq");
    }

    @NotNull
    public acq setY(long p4) {
        int i10 = f52413e;
        int i11 = ((i10 ^ 44) + ((i10 & 44) << 1)) - 1;
        f52412d = i11 % 128;
        int i12 = i11 % 2;
        this.f52414a = true;
        this.f52415b = p4;
        int i13 = i10 ^ 83;
        int i14 = ((i10 & 83) | i13) << 1;
        int i15 = -i13;
        int i16 = ((i14 | i15) << 1) - (i15 ^ i14);
        f52412d = i16 % 128;
        int i17 = i16 % 2;
        return this;
    }
}
