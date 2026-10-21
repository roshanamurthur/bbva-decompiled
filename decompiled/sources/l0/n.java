package l0;

import androidx.compose.material3.SheetState;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: BottomSheetScaffold.kt */
/* JADX INFO: loaded from: classes.dex */
public final class n extends Lambda implements Function0<Boolean> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ CoroutineScope f82712p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ SheetState f82713q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(SheetState sheetState, CoroutineScope coroutineScope) {
        super(0);
        this.f82712p0 = coroutineScope;
        this.f82713q0 = sheetState;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        BuildersKt__Builders_commonKt.launch$default(this.f82712p0, null, null, new m(this.f82713q0, null), 3, null);
        return Boolean.TRUE;
    }
}
