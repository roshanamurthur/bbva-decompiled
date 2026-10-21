package com.mypinpad.tsdk.isolation;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0011\u0010\u0012J?\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\u000f\u0010\u0010"}, d2 = {"Lcom/mypinpad/tsdk/i/getProcessingTimeout;", "", "Lcom/mypinpad/tsdk/i/component17;", "p0", "Lcom/mypinpad/tsdk/i/component15;", "p1", "Lcom/mypinpad/tsdk/i/setVerticalScrollbarOverlay;", "p2", "Lcom/mypinpad/tsdk/i/component19;", "p3", "Lcom/mypinpad/tsdk/i/getRevealSystemBarToastMessage;", "p4", "Lcom/mypinpad/tsdk/i/component18;", "p5", "Lcom/mypinpad/tsdk/i/component24;", "setOnFocusChangeListener", "(Lcom/mypinpad/tsdk/i/component17;Lcom/mypinpad/tsdk/i/component15;Lcom/mypinpad/tsdk/i/setVerticalScrollbarOverlay;Lcom/mypinpad/tsdk/i/component19;Lcom/mypinpad/tsdk/i/getRevealSystemBarToastMessage;Lcom/mypinpad/tsdk/i/component18;)Lcom/mypinpad/tsdk/i/component24;", "<init>", "()V"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class getProcessingTimeout {

    @NotNull
    public static final getProcessingTimeout INSTANCE = new getProcessingTimeout();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f55952a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f55953b;

    public static final class setOnFocusChangeListener implements ij {
        public static /* synthetic */ Object setX(Object[] objArr, int i10, int i11, int i12) {
            return (io) ij.setX.setDividerPadding(new Object[]{(setOnFocusChangeListener) objArr[0], (setTextKeepState) objArr[1]}, 1355852393, -1355852393, (int) System.currentTimeMillis());
        }

        @Override // com.mypinpad.tsdk.isolation.ij
        @NotNull
        public final io setY(@NotNull setTextKeepState settextkeepstate) {
            return (io) setX(new Object[]{this, settextkeepstate}, -1231850105, 1231850105, System.identityHashCode(this));
        }
    }

    static {
        int i10 = f55952a;
        int i11 = (i10 ^ 81) + ((i10 & 81) << 1);
        f55953b = i11 % 128;
        int i12 = i11 % 2;
    }

    @NotNull
    public static component24 setOnFocusChangeListener(@NotNull component17 p4, @NotNull component15 p10, @NotNull setVerticalScrollbarOverlay p11, @NotNull component19 p12, @NotNull getRevealSystemBarToastMessage p13, @NotNull component18 p14) {
        return (component24) setX(new Object[]{p4, p10, p11, p12, p13, p14}, 990638892, -990638892, (int) System.currentTimeMillis());
    }

    public static /* synthetic */ Object setX(Object[] objArr, int i10, int i11, int i12) {
        component17 component17Var = (component17) objArr[0];
        component15 component15Var = (component15) objArr[1];
        setVerticalScrollbarOverlay setverticalscrollbaroverlay = (setVerticalScrollbarOverlay) objArr[2];
        component19 component19Var = (component19) objArr[3];
        getRevealSystemBarToastMessage getrevealsystembartoastmessage = (getRevealSystemBarToastMessage) objArr[4];
        component18 component18Var = (component18) objArr[5];
        Intrinsics.checkNotNullParameter(component17Var, "");
        Intrinsics.checkNotNullParameter(component15Var, "");
        Intrinsics.checkNotNullParameter(setverticalscrollbaroverlay, "");
        Intrinsics.checkNotNullParameter(component19Var, "");
        Intrinsics.checkNotNullParameter(getrevealsystembartoastmessage, "");
        Intrinsics.checkNotNullParameter(component18Var, "");
        setTranslationY settranslationy = new setTranslationY(component19Var);
        SouthPacificEndpoint southPacificEndpoint = SouthPacificEndpoint.setX;
        SouthPacificEndpoint.setX(new Object[]{settranslationy}, 517903768, -517903760, (int) System.currentTimeMillis());
        SouthPacificEndpoint.setX(new Object[]{settranslationy}, 1401860534, -1401860531, (int) System.currentTimeMillis());
        setBaselineAligned setbaselinealigned = new setBaselineAligned(component18Var);
        setContextClickable setcontextclickable = new setContextClickable(setverticalscrollbaroverlay);
        valueOf valueof = new valueOf(new setOverscrollFooter(setcontextclickable), setcontextclickable, component15Var, component17Var, setverticalscrollbaroverlay, setbaselinealigned, new di(setcontextclickable, setbaselinealigned), new TerminalSdk(setcontextclickable), new setOnFocusChangeListener(), getrevealsystembartoastmessage, Dispatchers.getDefault());
        int i13 = f55953b;
        int i14 = i13 & 123;
        int i15 = (i13 ^ 123) | i14;
        int i16 = (i14 & i15) + (i15 | i14);
        f55952a = i16 % 128;
        int i17 = i16 % 2;
        return valueof;
    }
}
