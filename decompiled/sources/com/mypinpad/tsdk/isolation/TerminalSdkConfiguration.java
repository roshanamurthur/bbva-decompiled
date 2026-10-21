package com.mypinpad.tsdk.isolation;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class TerminalSdkConfiguration {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f51846b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static int f51847c = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final amj f51848a;

    public TerminalSdkConfiguration(@NotNull byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "");
        amj amjVar = new amj(new alp());
        amj.setCompoundDrawableTintBlendMode(new Object[]{amjVar, new ann(bArr)}, 156325013, -156325007, System.identityHashCode(amjVar));
        Unit unit = Unit.INSTANCE;
        this.f51848a = amjVar;
    }

    public static /* synthetic */ Object setCompoundDrawableTintBlendMode(Object[] objArr, int i10, int i11, int i12) {
        TerminalSdkConfiguration terminalSdkConfiguration = (TerminalSdkConfiguration) objArr[0];
        byte[] bArr = (byte[]) objArr[1];
        int i13 = f51846b + 39;
        f51847c = i13 % 128;
        if (i13 % 2 == 0) {
            Intrinsics.checkNotNullParameter(bArr, "");
            amj amjVar = terminalSdkConfiguration.f51848a;
            int length = bArr.length;
            amj.setCompoundDrawableTintBlendMode(new Object[]{amjVar, bArr, Integer.valueOf(length)}, 1913310697, -1913310697, length);
            ((Integer) amj.setCompoundDrawableTintBlendMode(new Object[]{amjVar, new byte[((Integer) amj.setCompoundDrawableTintBlendMode(new Object[]{amjVar}, 587204740, -587204738, System.identityHashCode(amjVar))).intValue()]}, -2044201634, 2044201635, System.identityHashCode(amjVar))).intValue();
            throw null;
        }
        Intrinsics.checkNotNullParameter(bArr, "");
        amj amjVar2 = terminalSdkConfiguration.f51848a;
        int length2 = bArr.length;
        amj.setCompoundDrawableTintBlendMode(new Object[]{amjVar2, bArr, Integer.valueOf(length2)}, 1913310697, -1913310697, length2);
        byte[] bArr2 = new byte[((Integer) amj.setCompoundDrawableTintBlendMode(new Object[]{amjVar2}, 587204740, -587204738, System.identityHashCode(amjVar2))).intValue()];
        ((Integer) amj.setCompoundDrawableTintBlendMode(new Object[]{amjVar2, bArr2}, -2044201634, 2044201635, System.identityHashCode(amjVar2))).intValue();
        int i14 = f51847c + 15;
        f51846b = i14 % 128;
        int i15 = i14 % 2;
        return bArr2;
    }

    @NotNull
    public final byte[] setOnFocusChangeListener(@NotNull byte[] bArr) {
        return (byte[]) setCompoundDrawableTintBlendMode(new Object[]{this, bArr}, 1126200817, -1126200817, System.identityHashCode(this));
    }
}
