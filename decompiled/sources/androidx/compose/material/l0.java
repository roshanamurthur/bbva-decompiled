package androidx.compose.material;

import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: Drawer.kt */
/* JADX INFO: loaded from: classes.dex */
public final class l0 extends Lambda implements Function1<SemanticsPropertyReceiver, Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ String f8820p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ BottomDrawerState f8821q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ CoroutineScope f8822r0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(String str, BottomDrawerState bottomDrawerState, CoroutineScope coroutineScope) {
        super(1);
        this.f8820p0 = str;
        this.f8821q0 = bottomDrawerState;
        this.f8822r0 = coroutineScope;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        SemanticsPropertyReceiver semantics = semanticsPropertyReceiver;
        Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
        SemanticsPropertiesKt.setPaneTitle(semantics, this.f8820p0);
        BottomDrawerState bottomDrawerState = this.f8821q0;
        if (bottomDrawerState.isOpen()) {
            SemanticsPropertiesKt.dismiss$default(semantics, null, new k0(bottomDrawerState, this.f8822r0), 1, null);
        }
        return Unit.INSTANCE;
    }
}
