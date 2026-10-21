package com.mypinpad.tsdk.isolation;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class gj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final fi f56025a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final getValue f56026b;

    public gj(@NotNull fi fiVar, @NotNull getValue getvalue) {
        Intrinsics.checkNotNullParameter(fiVar, "");
        Intrinsics.checkNotNullParameter(getvalue, "");
        this.f56025a = fiVar;
        this.f56026b = getvalue;
    }

    public static /* synthetic */ Object setX(Object[] objArr, int i10, int i11, int i12) {
        gj gjVar = (gj) objArr[0];
        fi fiVar = gjVar.f56025a;
        ee eeVar = ee.setDividerPadding;
        fi.setY(new Object[]{fiVar, (setFitsSystemWindows) ee.setOnFocusChangeListener(new Object[]{fiVar, Long.valueOf(((Long) setInputExtras.setDividerPadding(new Object[]{(byte[]) fi.setY(new Object[]{fiVar}, -571622170, 571622170, System.identityHashCode(fiVar))}, -1575378854, 1575378872, (int) System.currentTimeMillis())).longValue())}, -1226013544, 1226013559, (int) System.currentTimeMillis())}, 2080063025, -2080063023, System.identityHashCode(fiVar));
        fi fiVar2 = gjVar.f56025a;
        return (fk) ee.setOnFocusChangeListener(new Object[]{fiVar2, gjVar.f56026b, new setEms(fiVar2.getSuppressed(), false)}, 1044341421, -1044341412, (int) System.currentTimeMillis());
    }

    @NotNull
    public final fk setOnFocusChangeListener() {
        return (fk) setX(new Object[]{this}, -1399696471, 1399696471, System.identityHashCode(this));
    }
}
