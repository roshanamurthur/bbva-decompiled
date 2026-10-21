package com.mypinpad.tsdk.isolation;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/mypinpad/tsdk/i/component33;", "", "Lcom/mypinpad/tsdk/i/setColorFilter;", "p0", "Lcom/mypinpad/tsdk/i/TerminalCallbackKt;", "p1", "Lcom/mypinpad/tsdk/i/HandlePinPadLaunchRequestResult;", "setY", "(Lcom/mypinpad/tsdk/i/setColorFilter;Lcom/mypinpad/tsdk/i/TerminalCallbackKt;)Lcom/mypinpad/tsdk/i/HandlePinPadLaunchRequestResult;", "<init>", "()V"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class component33 {

    @NotNull
    public static final component33 INSTANCE = new component33();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f54953a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f54954b = 1;

    static {
        int i10 = f54954b;
        int i11 = (((i10 | 78) << 1) - (i10 ^ 78)) - 1;
        f54953a = i11 % 128;
        if (i11 % 2 != 0) {
            throw null;
        }
    }

    public static /* synthetic */ Object setDividerPadding(Object[] objArr, int i10, int i11, int i12) {
        setColorFilter setcolorfilter = (setColorFilter) objArr[0];
        TerminalCallbackKt terminalCallbackKt = (TerminalCallbackKt) objArr[1];
        Intrinsics.checkNotNullParameter(setcolorfilter, "");
        Intrinsics.checkNotNullParameter(terminalCallbackKt, "");
        MonitoringModuleImplementation monitoringModuleImplementation = new MonitoringModuleImplementation(setcolorfilter, terminalCallbackKt, null, 4, null);
        int i13 = f54953a;
        int i14 = i13 & 83;
        int i15 = (((i13 ^ 83) | i14) << 1) - ((i13 | 83) & (~i14));
        f54954b = i15 % 128;
        if (i15 % 2 != 0) {
            return monitoringModuleImplementation;
        }
        throw null;
    }

    @NotNull
    public static MonitoringModuleApi setY(@NotNull setColorFilter p4, @NotNull TerminalCallbackKt p10) {
        return (MonitoringModuleApi) setDividerPadding(new Object[]{p4, p10}, -2140932970, 2140932970, (int) System.currentTimeMillis());
    }
}
