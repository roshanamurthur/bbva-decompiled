package androidx.compose.material3;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: ModalBottomSheet.android.kt */
/* JADX INFO: loaded from: classes.dex */
public final class x1 extends Lambda implements Function2<CoroutineScope, Float, Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ Function1<Float, Unit> f14372p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public x1(Function1<? super Float, Unit> function1) {
        super(2);
        this.f14372p0 = function1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(CoroutineScope coroutineScope, Float f6) {
        CoroutineScope modalBottomSheetSwipeable = coroutineScope;
        float fFloatValue = f6.floatValue();
        Intrinsics.checkNotNullParameter(modalBottomSheetSwipeable, "$this$modalBottomSheetSwipeable");
        this.f14372p0.invoke(Float.valueOf(fFloatValue));
        return Unit.INSTANCE;
    }
}
