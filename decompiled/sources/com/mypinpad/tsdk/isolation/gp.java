package com.mypinpad.tsdk.isolation;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class gp {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final fi f56054a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final setTextKeepState f56055b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final gr f56056c;

    public /* synthetic */ class setOnFocusChangeListener {
        public static final /* synthetic */ int[] setCompoundDrawableTintBlendMode;

        static {
            int[] iArr = new int[fd.valuesCustom().length];
            iArr[fd.ONLINE_REQUEST.ordinal()] = 1;
            iArr[fd.DECLINED.ordinal()] = 2;
            setCompoundDrawableTintBlendMode = iArr;
            System.currentTimeMillis();
            System.currentTimeMillis();
        }
    }

    public gp(@NotNull fi fiVar, @NotNull setTextKeepState settextkeepstate, @NotNull gr grVar) {
        Intrinsics.checkNotNullParameter(fiVar, "");
        Intrinsics.checkNotNullParameter(settextkeepstate, "");
        Intrinsics.checkNotNullParameter(grVar, "");
        this.f56054a = fiVar;
        this.f56055b = settextkeepstate;
        this.f56056c = grVar;
    }

    public static /* synthetic */ Object setCompoundDrawableTintBlendMode(Object[] objArr, int i10, int i11, int i12) {
        gp gpVar = (gp) objArr[0];
        fd fdVar = (fd) objArr[1];
        Intrinsics.checkNotNullParameter(fdVar, "");
        fi fiVar = gpVar.f56054a;
        setTransitionVisibility settransitionvisibility = (setTransitionVisibility) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{fiVar}, -672536244, 672536278, System.identityHashCode(fiVar));
        int i13 = setOnFocusChangeListener.setCompoundDrawableTintBlendMode[fdVar.ordinal()];
        setTextKeepState settextkeepstate = gpVar.f56055b;
        fi fiVar2 = gpVar.f56054a;
        gr grVar = gpVar.f56056c;
        if (i13 == 1) {
            return (fk) gr.setCompoundDrawableTintBlendMode(new Object[]{grVar, fiVar2, settextkeepstate, activateSession.AUTHORISING_PLEASE_WAIT, fd.ONLINE_REQUEST, settransitionvisibility}, -1887279096, 1887279110, System.identityHashCode(grVar));
        }
        if (i13 == 2) {
            return (fk) gr.setCompoundDrawableTintBlendMode(new Object[]{grVar, fiVar2, settextkeepstate, activateSession.NOT_AUTHORISED, fd.DECLINED, settransitionvisibility}, -1887279096, 1887279110, System.identityHashCode(grVar));
        }
        throw new fh(23, fdVar.toString());
    }

    @NotNull
    public final fk setDividerPadding(@NotNull fd fdVar) {
        return (fk) setCompoundDrawableTintBlendMode(new Object[]{this, fdVar}, 1880982469, -1880982469, System.identityHashCode(this));
    }
}
