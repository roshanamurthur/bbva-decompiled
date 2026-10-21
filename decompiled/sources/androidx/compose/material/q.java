package androidx.compose.material;

import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: BackdropScaffold.kt */
/* JADX INFO: loaded from: classes.dex */
public final class q extends Lambda implements Function1<SemanticsPropertyReceiver, Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ BackdropScaffoldState f8909p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ CoroutineScope f8910q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(BackdropScaffoldState backdropScaffoldState, CoroutineScope coroutineScope) {
        super(1);
        this.f8909p0 = backdropScaffoldState;
        this.f8910q0 = coroutineScope;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        SemanticsPropertyReceiver semantics = semanticsPropertyReceiver;
        Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
        BackdropScaffoldState backdropScaffoldState = this.f8909p0;
        boolean zIsConcealed = backdropScaffoldState.isConcealed();
        CoroutineScope coroutineScope = this.f8910q0;
        if (zIsConcealed) {
            SemanticsPropertiesKt.collapse$default(semantics, null, new n(backdropScaffoldState, coroutineScope), 1, null);
        } else {
            SemanticsPropertiesKt.expand$default(semantics, null, new p(backdropScaffoldState, coroutineScope), 1, null);
        }
        return Unit.INSTANCE;
    }
}
