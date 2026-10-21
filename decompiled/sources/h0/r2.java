package h0;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.material.SliderColors;
import androidx.compose.material.SliderKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: Slider.kt */
/* JADX INFO: loaded from: classes.dex */
public final class r2 extends Lambda implements Function2<Composer, Integer, Unit> {
    public final /* synthetic */ Modifier E0;
    public final /* synthetic */ int F0;
    public final /* synthetic */ int G0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ boolean f69081p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ float f69082q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ float f69083r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final /* synthetic */ List<Float> f69084s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final /* synthetic */ SliderColors f69085t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public final /* synthetic */ float f69086u0;
    public final /* synthetic */ MutableInteractionSource v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public final /* synthetic */ MutableInteractionSource f69087w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public final /* synthetic */ Modifier f69088x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public final /* synthetic */ Modifier f69089y0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r2(boolean z10, float f6, float f10, List<Float> list, SliderColors sliderColors, float f11, MutableInteractionSource mutableInteractionSource, MutableInteractionSource mutableInteractionSource2, Modifier modifier, Modifier modifier2, Modifier modifier3, int i10, int i11) {
        super(2);
        this.f69081p0 = z10;
        this.f69082q0 = f6;
        this.f69083r0 = f10;
        this.f69084s0 = list;
        this.f69085t0 = sliderColors;
        this.f69086u0 = f11;
        this.v0 = mutableInteractionSource;
        this.f69087w0 = mutableInteractionSource2;
        this.f69088x0 = modifier;
        this.f69089y0 = modifier2;
        this.E0 = modifier3;
        this.F0 = i10;
        this.G0 = i11;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Composer composer, Integer num) {
        num.intValue();
        SliderKt.access$RangeSliderImpl(this.f69081p0, this.f69082q0, this.f69083r0, this.f69084s0, this.f69085t0, this.f69086u0, this.v0, this.f69087w0, this.f69088x0, this.f69089y0, this.E0, composer, RecomposeScopeImplKt.updateChangedFlags(this.F0 | 1), RecomposeScopeImplKt.updateChangedFlags(this.G0));
        return Unit.INSTANCE;
    }
}
