package l0;

import androidx.compose.material3.SheetState;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: BottomSheetScaffold.kt */
/* JADX INFO: loaded from: classes.dex */
public final class l extends Lambda implements Function1<Float, Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ CoroutineScope f82672p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ SheetState f82673q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(SheetState sheetState, CoroutineScope coroutineScope) {
        super(1);
        this.f82672p0 = coroutineScope;
        this.f82673q0 = sheetState;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Float f6) {
        BuildersKt__Builders_commonKt.launch$default(this.f82672p0, null, null, new k(this.f82673q0, f6.floatValue(), null), 3, null);
        return Unit.INSTANCE;
    }
}
