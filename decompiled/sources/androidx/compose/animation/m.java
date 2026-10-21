package androidx.compose.animation;

import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: EnterExitTransition.kt */
/* JADX INFO: loaded from: classes.dex */
public final class m extends Lambda implements Function1<EnterExitState, IntOffset> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ SlideModifier f3240p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ long f3241q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(SlideModifier slideModifier, long j10) {
        super(1);
        this.f3240p0 = slideModifier;
        this.f3241q0 = j10;
    }

    @Override // kotlin.jvm.functions.Function1
    public final IntOffset invoke(EnterExitState enterExitState) {
        Function1<IntSize, IntOffset> slideOffset;
        Function1<IntSize, IntOffset> slideOffset2;
        EnterExitState targetState = enterExitState;
        Intrinsics.checkNotNullParameter(targetState, "it");
        SlideModifier slideModifier = this.f3240p0;
        slideModifier.getClass();
        Intrinsics.checkNotNullParameter(targetState, "targetState");
        Slide value = slideModifier.f2811b.getValue();
        long j10 = this.f3241q0;
        long jM4517getZeronOccac = (value == null || (slideOffset2 = value.getSlideOffset()) == null) ? IntOffset.INSTANCE.m4517getZeronOccac() : slideOffset2.invoke(IntSize.m4541boximpl(j10)).getF18312a();
        Slide value2 = slideModifier.f2812c.getValue();
        long jM4517getZeronOccac2 = (value2 == null || (slideOffset = value2.getSlideOffset()) == null) ? IntOffset.INSTANCE.m4517getZeronOccac() : slideOffset.invoke(IntSize.m4541boximpl(j10)).getF18312a();
        int i10 = SlideModifier.WhenMappings.$EnumSwitchMapping$0[targetState.ordinal()];
        if (i10 == 1) {
            jM4517getZeronOccac = IntOffset.INSTANCE.m4517getZeronOccac();
        } else if (i10 != 2) {
            if (i10 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            jM4517getZeronOccac = jM4517getZeronOccac2;
        }
        return IntOffset.m4498boximpl(jM4517getZeronOccac);
    }
}
