package l0;

import androidx.compose.ui.input.pointer.PointerInputChange;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;

/* JADX INFO: compiled from: Slider.kt */
/* JADX INFO: loaded from: classes.dex */
public final class r3 extends Lambda implements Function2<PointerInputChange, Float, Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ Ref.FloatRef f82843p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r3(Ref.FloatRef floatRef) {
        super(2);
        this.f82843p0 = floatRef;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(PointerInputChange pointerInputChange, Float f6) {
        PointerInputChange pointerInput = pointerInputChange;
        float fFloatValue = f6.floatValue();
        Intrinsics.checkNotNullParameter(pointerInput, "pointerInput");
        pointerInput.consume();
        this.f82843p0.element = fFloatValue;
        return Unit.INSTANCE;
    }
}
