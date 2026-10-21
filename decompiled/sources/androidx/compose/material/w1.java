package androidx.compose.material;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.ranges.ClosedFloatingPointRange;

/* JADX INFO: compiled from: Slider.kt */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class w1 extends FunctionReferenceImpl implements Function1<Float, Float> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ ClosedFloatingPointRange<Float> f9090p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ Ref.FloatRef f9091q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ Ref.FloatRef f9092r0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w1(ClosedFloatingPointRange<Float> closedFloatingPointRange, Ref.FloatRef floatRef, Ref.FloatRef floatRef2) {
        super(1, Intrinsics.Kotlin.class, "scaleToOffset", "invoke$scaleToOffset(Lkotlin/ranges/ClosedFloatingPointRange;Lkotlin/jvm/internal/Ref$FloatRef;Lkotlin/jvm/internal/Ref$FloatRef;F)F", 0);
        this.f9090p0 = closedFloatingPointRange;
        this.f9091q0 = floatRef;
        this.f9092r0 = floatRef2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Float invoke(Float f6) {
        return Float.valueOf(SliderKt.a.a(f6.floatValue(), this.f9091q0, this.f9092r0, this.f9090p0));
    }
}
