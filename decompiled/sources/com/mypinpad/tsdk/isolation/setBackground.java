package com.mypinpad.tsdk.isolation;

import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class setBackground {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final LinkedHashMap f59481a = new LinkedHashMap();

    public static /* synthetic */ Object setX(Object[] objArr, int i10, int i11, int i12) {
        int i13 = (i11 * (-463)) + (i10 * 465);
        int i14 = ~i11;
        int i15 = ~i12;
        int i16 = ~(i14 | i15);
        int i17 = ~(i14 | i10);
        if ((((~(i10 | i12)) | i17) * 464) + ((i14 | (~i10) | i12) * (-464)) + (((~(i15 | i10)) | i16 | i17) * 464) + i13 != 1) {
            setBackground setbackground = (setBackground) objArr[0];
            md mdVar = (md) objArr[1];
            Intrinsics.checkNotNullParameter(mdVar, "");
            setOnHoverListener setonhoverlistener = (setOnHoverListener) setbackground.f59481a.get(mdVar);
            return setonhoverlistener == null ? new setMaxWidth() : (setMaxWidth) setOnHoverListener.setCompoundDrawableTintBlendMode(new Object[]{setonhoverlistener}, 654544735, -654544734, System.identityHashCode(setonhoverlistener));
        }
        setBackground setbackground2 = (setBackground) objArr[0];
        setOnHoverListener setonhoverlistener2 = (setOnHoverListener) objArr[1];
        Intrinsics.checkNotNullParameter(setonhoverlistener2, "");
        setbackground2.f59481a.put((md) setOnHoverListener.setCompoundDrawableTintBlendMode(new Object[]{setonhoverlistener2}, 2039294722, -2039294719, System.identityHashCode(setonhoverlistener2)), setonhoverlistener2);
        return null;
    }

    public final void setDividerPadding(@NotNull setOnHoverListener setonhoverlistener) {
        setX(new Object[]{this, setonhoverlistener}, 154663697, -154663696, System.identityHashCode(this));
    }

    @NotNull
    public final setMaxWidth setOnFocusChangeListener(@NotNull md mdVar) {
        return (setMaxWidth) setX(new Object[]{this, mdVar}, -1192893685, 1192893685, System.identityHashCode(this));
    }
}
