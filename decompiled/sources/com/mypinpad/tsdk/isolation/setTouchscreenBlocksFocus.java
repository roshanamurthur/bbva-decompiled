package com.mypinpad.tsdk.isolation;

import java.time.Clock;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001J%\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\f\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\f\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\f\u0010\u000e"}, d2 = {"Lcom/mypinpad/tsdk/i/setTouchscreenBlocksFocus;", "", "Lcom/mypinpad/tsdk/i/applicationCreated;", "p0", "Lcom/mypinpad/tsdk/i/getHoldTime;", "p1", "", "p2", "", "setX", "(Lcom/mypinpad/tsdk/i/applicationCreated;Lcom/mypinpad/tsdk/i/getHoldTime;J)Z", "Lcom/mypinpad/tsdk/i/getHoldTime$setY;", "setY", "(Lcom/mypinpad/tsdk/i/getHoldTime$setY;J)Z", "(Lcom/mypinpad/tsdk/i/applicationCreated;Lcom/mypinpad/tsdk/i/getHoldTime;)J"}, k = 1, mv = {1, 5, 1})
public final class setTouchscreenBlocksFocus {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f60743b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static int f60744c = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Clock f60745a;

    public setTouchscreenBlocksFocus(Clock clock, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i10 & 1) != 0) {
            clock = Clock.systemUTC();
            Intrinsics.checkNotNullExpressionValue(clock, "");
        }
        Intrinsics.checkNotNullParameter(clock, "");
        this.f60745a = clock;
    }

    /* JADX WARN: Code duplicated, block: B:115:0x03fb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:116:0x03b0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:117:0x03d2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:118:0x038a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:119:0x03d2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:121:0x036b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:122:0x036b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:59:0x0294  */
    /* JADX WARN: Code duplicated, block: B:61:0x02ac  */
    /* JADX WARN: Code duplicated, block: B:62:0x02b2  */
    /* JADX WARN: Code duplicated, block: B:63:0x02b3  */
    /* JADX WARN: Code duplicated, block: B:65:0x02c3  */
    /* JADX WARN: Code duplicated, block: B:66:0x02c9  */
    /* JADX WARN: Code duplicated, block: B:79:0x0355  */
    /* JADX WARN: Code duplicated, block: B:82:0x0371  */
    /* JADX WARN: Code duplicated, block: B:92:0x03fa  */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x0055, code lost:
    
        if (r1 == null) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:?, code lost:
    
        return java.lang.Boolean.FALSE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:?, code lost:
    
        return java.lang.Boolean.valueOf(r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0058, code lost:
    
        if (r1 == null) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x005a, code lost:
    
        r13 = (r12 & (-118)) | ((~r12) & 117);
        r12 = (r12 & 117) << 1;
        r14 = (r13 & r12) + (r12 | r13);
        com.mypinpad.tsdk.isolation.setTouchscreenBlocksFocus.f60743b = r14 % 128;
        r14 = r14 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0070, code lost:
    
        r12 = ((java.lang.Boolean) setY(new java.lang.Object[]{r13, r1, java.lang.Long.valueOf(r2)}, -1938435333, 1938435334, java.lang.System.identityHashCode(r13))).booleanValue();
        r13 = com.mypinpad.tsdk.isolation.setTouchscreenBlocksFocus.f60743b;
        r14 = r13 & 63;
        r13 = (r13 | 63) & (~r14);
        r14 = r14 << 1;
        r0 = (r13 & r14) + (r13 | r14);
        com.mypinpad.tsdk.isolation.setTouchscreenBlocksFocus.f60744c = r0 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x00a2, code lost:
    
        if ((r0 % 2) == 0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00aa, code lost:
    
        throw null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ java.lang.Object setY(java.lang.Object[] r12, int r13, int r14, int r15) {
        /*
            Method dump skipped, instruction units count: 1195
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.setTouchscreenBlocksFocus.setY(java.lang.Object[], int, int, int):java.lang.Object");
    }

    public final boolean setX(@NotNull applicationCreated p4, @NotNull getHoldTime p10, long p11) {
        return ((Boolean) setY(new Object[]{this, p4, p10, Long.valueOf(p11)}, 1846623693, -1846623691, System.identityHashCode(this))).booleanValue();
    }

    public setTouchscreenBlocksFocus() {
        this(null, 1, null);
    }

    public final long setY(@Nullable applicationCreated p4, @NotNull getHoldTime p10) {
        return ((Long) setY(new Object[]{this, p4, p10}, -502758861, 502758864, System.identityHashCode(this))).longValue();
    }

    public final boolean setY(@Nullable getHoldTime.setY p4, long p10) {
        return ((Boolean) setY(new Object[]{this, p4, Long.valueOf(p10)}, 2134189105, -2134189105, System.identityHashCode(this))).booleanValue();
    }
}
