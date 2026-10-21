package l0;

import androidx.compose.material3.SheetState;
import androidx.compose.material3.SheetValue;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: BottomSheetScaffold.kt */
/* JADX INFO: loaded from: classes.dex */
public final class x extends Lambda implements Function1<SheetValue, Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ CoroutineScope f83029p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ SheetState f83030q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(SheetState sheetState, CoroutineScope coroutineScope) {
        super(1);
        this.f83029p0 = coroutineScope;
        this.f83030q0 = sheetState;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(SheetValue sheetValue) {
        SheetValue target = sheetValue;
        Intrinsics.checkNotNullParameter(target, "target");
        BuildersKt__Builders_commonKt.launch$default(this.f83029p0, null, null, new w(this.f83030q0, target, null), 3, null);
        return Unit.INSTANCE;
    }
}
