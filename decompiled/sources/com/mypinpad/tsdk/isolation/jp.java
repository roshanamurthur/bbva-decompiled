package com.mypinpad.tsdk.isolation;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class jp extends jh {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static int f56672l = 0;
    public static int m = 1;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final setContentDescription f56673k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jp(@NotNull iv ivVar, @NotNull setTextKeepState settextkeepstate, @NotNull kc kcVar, @NotNull getValue getvalue, @NotNull setContentDescription setcontentdescription) {
        super(ivVar, settextkeepstate, kcVar, getvalue);
        Intrinsics.checkNotNullParameter(ivVar, "");
        Intrinsics.checkNotNullParameter(settextkeepstate, "");
        Intrinsics.checkNotNullParameter(kcVar, "");
        Intrinsics.checkNotNullParameter(getvalue, "");
        Intrinsics.checkNotNullParameter(setcontentdescription, "");
        this.f56673k = setcontentdescription;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x009d, code lost:
    
        if ((r14 % 2) == 0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x00a1, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x00a2, code lost:
    
        r11 = com.mypinpad.tsdk.isolation.jl.INSTANCE;
        r11 = (com.mypinpad.tsdk.isolation.fk) com.mypinpad.tsdk.isolation.jl.setDividerPadding(new java.lang.Object[]{(com.mypinpad.tsdk.isolation.iv) r13.setOnFocusChangeListener(), r13.setCompoundDrawableTintBlendMode(), r13.setY(), r13.f56673k, (com.mypinpad.tsdk.isolation.kc) r13.setX()}, 708475684, -708475683, (int) java.lang.System.currentTimeMillis());
        r12 = com.mypinpad.tsdk.isolation.jp.f56672l;
        r13 = (r12 & (-108)) | ((~r12) & 107);
        r12 = (r12 & 107) << 1;
        r0 = (r13 ^ r12) + ((r12 & r13) << 1);
        com.mypinpad.tsdk.isolation.jp.m = r0 % 128;
        r0 = r0 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x00ed, code lost:
    
        return r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:?, code lost:
    
        return r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x004b, code lost:
    
        if (r11 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0076, code lost:
    
        if (r11 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0078, code lost:
    
        r12 = com.mypinpad.tsdk.isolation.jp.m;
        r0 = r12 & 53;
        r13 = ((((r12 ^ 53) | r0) << 1) - (~(-((r12 | 53) & (~r0))))) - 1;
        r12 = r13 % 128;
        com.mypinpad.tsdk.isolation.jp.f56672l = r12;
        r13 = r13 % 2;
        r13 = r12 ^ 109;
        r12 = -(-((r12 & 109) << 1));
        r14 = (r13 & r12) + (r12 | r13);
        com.mypinpad.tsdk.isolation.jp.m = r14 % 128;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ java.lang.Object setDividerPadding(java.lang.Object[] r11, int r12, int r13, int r14) {
        /*
            Method dump skipped, instruction units count: 238
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.jp.setDividerPadding(java.lang.Object[], int, int, int):java.lang.Object");
    }

    @Override // com.mypinpad.tsdk.isolation.eb
    @NotNull
    public final fk setY(@NotNull setRotationX setrotationx) {
        return (fk) setDividerPadding(new Object[]{this, setrotationx}, 1879265607, -1879265607, System.identityHashCode(this));
    }
}
