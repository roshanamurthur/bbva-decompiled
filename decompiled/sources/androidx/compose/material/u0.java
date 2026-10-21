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
public final class u0 extends Lambda implements Function1<SemanticsPropertyReceiver, Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ String f9033p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ DrawerState f9034q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ CoroutineScope f9035r0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(String str, DrawerState drawerState, CoroutineScope coroutineScope) {
        super(1);
        this.f9033p0 = str;
        this.f9034q0 = drawerState;
        this.f9035r0 = coroutineScope;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        SemanticsPropertyReceiver semantics = semanticsPropertyReceiver;
        Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
        SemanticsPropertiesKt.setPaneTitle(semantics, this.f9033p0);
        DrawerState drawerState = this.f9034q0;
        if (drawerState.isOpen()) {
            SemanticsPropertiesKt.dismiss$default(semantics, null, new t0(drawerState, this.f9035r0), 1, null);
        }
        return Unit.INSTANCE;
    }
}
