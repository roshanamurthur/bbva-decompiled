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
public final class s2 extends Lambda implements Function2<Composer, Integer, Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ boolean f69100p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ float f69101q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ List<Float> f69102r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final /* synthetic */ SliderColors f69103s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final /* synthetic */ float f69104t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public final /* synthetic */ MutableInteractionSource f69105u0;
    public final /* synthetic */ Modifier v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public final /* synthetic */ int f69106w0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s2(boolean z10, float f6, List<Float> list, SliderColors sliderColors, float f10, MutableInteractionSource mutableInteractionSource, Modifier modifier, int i10) {
        super(2);
        this.f69100p0 = z10;
        this.f69101q0 = f6;
        this.f69102r0 = list;
        this.f69103s0 = sliderColors;
        this.f69104t0 = f10;
        this.f69105u0 = mutableInteractionSource;
        this.v0 = modifier;
        this.f69106w0 = i10;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Composer composer, Integer num) {
        num.intValue();
        SliderKt.access$SliderImpl(this.f69100p0, this.f69101q0, this.f69102r0, this.f69103s0, this.f69104t0, this.f69105u0, this.v0, composer, RecomposeScopeImplKt.updateChangedFlags(this.f69106w0 | 1));
        return Unit.INSTANCE;
    }
}
