package androidx.compose.material;

import androidx.compose.ui.util.MathHelpersKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.ClosedFloatingPointRange;

/* JADX INFO: compiled from: Slider.kt */
/* JADX INFO: loaded from: classes.dex */
public final class h2 extends Lambda implements Function1<Float, Boolean> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ ClosedFloatingPointRange<Float> f8495p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ int f8496q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ float f8497r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final /* synthetic */ Function1<Float, Unit> f8498s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final /* synthetic */ Function0<Unit> f8499t0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public h2(ClosedFloatingPointRange<Float> closedFloatingPointRange, int i10, float f6, Function1<? super Float, Unit> function1, Function0<Unit> function0) {
        super(1);
        this.f8495p0 = closedFloatingPointRange;
        this.f8496q0 = i10;
        this.f8497r0 = f6;
        this.f8498s0 = function1;
        this.f8499t0 = function0;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(Float f6) {
        int i10;
        float fFloatValue = f6.floatValue();
        ClosedFloatingPointRange<Float> closedFloatingPointRange = this.f8495p0;
        float fCoerceIn = kotlin.ranges.c.coerceIn(fFloatValue, closedFloatingPointRange.getStart().floatValue(), closedFloatingPointRange.getEndInclusive().floatValue());
        boolean z10 = true;
        int i11 = this.f8496q0;
        if (i11 > 0 && (i10 = i11 + 1) >= 0) {
            float fAbs = fCoerceIn;
            float f10 = fAbs;
            int i12 = 0;
            while (true) {
                float fLerp = MathHelpersKt.lerp(closedFloatingPointRange.getStart().floatValue(), closedFloatingPointRange.getEndInclusive().floatValue(), i12 / i10);
                float f11 = fLerp - fCoerceIn;
                if (Math.abs(f11) <= fAbs) {
                    fAbs = Math.abs(f11);
                    f10 = fLerp;
                }
                if (i12 == i10) {
                    break;
                }
                i12++;
            }
            fCoerceIn = f10;
        }
        if (fCoerceIn == this.f8497r0) {
            z10 = false;
        } else {
            this.f8498s0.invoke(Float.valueOf(fCoerceIn));
            Function0<Unit> function0 = this.f8499t0;
            if (function0 != null) {
                function0.invoke();
            }
        }
        return Boolean.valueOf(z10);
    }
}
