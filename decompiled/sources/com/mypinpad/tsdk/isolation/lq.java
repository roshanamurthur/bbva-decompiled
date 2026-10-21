package com.mypinpad.tsdk.isolation;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
public final class lq extends TerminalSdkConfigurationCompanion<getDetailsFieldBgColor> {
    public static int D = 0;
    public static int E = 1;
    public final long A;

    @NotNull
    public ds B;
    public setFitsSystemWindows C;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lq(@NotNull setBackgroundTintList setbackgroundtintlist, @Nullable di diVar, @NotNull setChildIndicator setchildindicator) {
        super(setbackgroundtintlist, diVar, setchildindicator, Terminal.KERNEL_INTERAC);
        Intrinsics.checkNotNullParameter(setbackgroundtintlist, "");
        Intrinsics.checkNotNullParameter(setchildindicator, "");
        getDetailsFieldBgColor x4 = setX();
        this.A = ((Long) setInputExtras.setDividerPadding(new Object[]{(byte[]) setInputExtras.setDividerPadding(new Object[]{(String) getDetailsFieldBgColor.setCompoundDrawableTintBlendMode(new Object[]{x4}, 834747277, -834747272, System.identityHashCode(x4)), 5}, -689525923, 689525942, 5)}, -1575378854, 1575378872, (int) System.currentTimeMillis())).longValue();
        this.B = ds.setCompoundDrawableTintBlendMode;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0085, code lost:
    
        if (r5 != null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0089, code lost:
    
        if (r5 != null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x008c, code lost:
    
        r6 = r6 + 117;
        com.mypinpad.tsdk.isolation.lq.E = r6 % 128;
        r6 = r6 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0095, code lost:
    
        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
        r5 = com.mypinpad.tsdk.isolation.lq.E + 5;
        com.mypinpad.tsdk.isolation.lq.D = r5 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00a1, code lost:
    
        if ((r5 % 2) != 0) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00a5, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:?, code lost:
    
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:?, code lost:
    
        return null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ java.lang.Object setCompoundDrawableTintBlendMode(java.lang.Object[] r5, int r6, int r7, int r8) {
        /*
            Method dump skipped, instruction units count: 297
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.lq.setCompoundDrawableTintBlendMode(java.lang.Object[], int, int, int):java.lang.Object");
    }

    public final long getSuppressed() {
        return ((Long) setCompoundDrawableTintBlendMode(new Object[]{this}, 280097942, -280097941, System.identityHashCode(this))).longValue();
    }

    @NotNull
    public final ds setMaxEms() {
        return (ds) setCompoundDrawableTintBlendMode(new Object[]{this}, 328985409, -328985407, System.identityHashCode(this));
    }

    @NotNull
    public final setFitsSystemWindows setTextSelectHandleRight() {
        return (setFitsSystemWindows) setCompoundDrawableTintBlendMode(new Object[]{this}, -1934930086, 1934930090, System.identityHashCode(this));
    }

    public final void setX(@NotNull setFitsSystemWindows setfitssystemwindows) {
        setCompoundDrawableTintBlendMode(new Object[]{this, setfitssystemwindows}, -704967938, 704967938, System.identityHashCode(this));
    }

    public final void setCompoundDrawableTintBlendMode(@NotNull ds dsVar) {
        setCompoundDrawableTintBlendMode(new Object[]{this, dsVar}, -603530123, 603530126, System.identityHashCode(this));
    }
}
