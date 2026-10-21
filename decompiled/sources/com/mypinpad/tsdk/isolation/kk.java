package com.mypinpad.tsdk.isolation;

import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class kk extends t {
    static {
        Reflection.property1(new PropertyReference1Impl(kk.class, "derivationKeyIndex_B1", "getDerivationKeyIndex_B1()B", 0));
        Reflection.property1(new PropertyReference1Impl(kk.class, "cryptogramVersionNumber_B2", "getCryptogramVersionNumber_B2()B", 0));
        int i10 = (112 << 1) - 113;
        int i11 = i10 % 128;
        if (i10 % 2 == 0) {
            int i12 = 71 / 0;
        }
    }

    public kk() {
        super(setAnimation.getPinGridButtonBgColor().setDividerPadding());
        new p(0);
        new p(1);
    }

    public static /* synthetic */ Object setOnFocusChangeListener(Object[] objArr, int i10, int i11, int i12) {
        kk kkVar = (kk) objArr[0];
        kf kfVar = new kf();
        if (kkVar.setCompoundDrawableTintBlendMode().length >= 9) {
            kfVar.setX(ArraysKt___ArraysKt.sliceArray(kkVar.setCompoundDrawableTintBlendMode(), new IntRange(2, 9)));
            return kfVar;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(kkVar.setCompoundDrawableTintBlendMode().length);
        sb2.append(" < 9");
        throw new setOnHierarchyChangeListener(2004, sb2.toString());
    }

    @NotNull
    public final kf getNavBarTitleString() {
        return (kf) setOnFocusChangeListener(new Object[]{this}, -1215610348, 1215610348, System.identityHashCode(this));
    }
}
