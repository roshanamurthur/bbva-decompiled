package androidx.compose.material;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.ranges.ClosedFloatingPointRange;

/* JADX INFO: compiled from: Slider.kt */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c2 extends FunctionReferenceImpl implements Function1<Float, Float> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ ClosedFloatingPointRange<Float> f8403p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ Ref.FloatRef f8404q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ Ref.FloatRef f8405r0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c2(ClosedFloatingPointRange<Float> closedFloatingPointRange, Ref.FloatRef floatRef, Ref.FloatRef floatRef2) {
        super(1, Intrinsics.Kotlin.class, "scaleToOffset", "invoke$scaleToOffset(Lkotlin/ranges/ClosedFloatingPointRange;Lkotlin/jvm/internal/Ref$FloatRef;Lkotlin/jvm/internal/Ref$FloatRef;F)F", 0);
        this.f8403p0 = closedFloatingPointRange;
        this.f8404q0 = floatRef;
        this.f8405r0 = floatRef2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Float invoke(Float f6) {
        float fFloatValue = f6.floatValue();
        ClosedFloatingPointRange<Float> closedFloatingPointRange = this.f8403p0;
        return Float.valueOf(SliderKt.access$scale(closedFloatingPointRange.getStart().floatValue(), closedFloatingPointRange.getEndInclusive().floatValue(), fFloatValue, this.f8404q0.element, this.f8405r0.element));
    }
}
