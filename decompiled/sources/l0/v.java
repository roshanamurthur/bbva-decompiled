package l0;

import androidx.compose.material3.SheetState;
import androidx.compose.material3.SheetValue;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: BottomSheetScaffold.kt */
/* JADX INFO: loaded from: classes.dex */
public final class v extends Lambda implements Function2<SheetValue, Float, Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ CoroutineScope f82981p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ SheetState f82982q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(SheetState sheetState, CoroutineScope coroutineScope) {
        super(2);
        this.f82981p0 = coroutineScope;
        this.f82982q0 = sheetState;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(SheetValue sheetValue, Float f6) {
        SheetValue target = sheetValue;
        float fFloatValue = f6.floatValue();
        Intrinsics.checkNotNullParameter(target, "target");
        BuildersKt__Builders_commonKt.launch$default(this.f82981p0, null, null, new u(this.f82982q0, target, fFloatValue, null), 3, null);
        return Unit.INSTANCE;
    }
}
