package androidx.compose.material;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: Drawer.kt */
/* JADX INFO: loaded from: classes.dex */
public final class t0 extends Lambda implements Function0<Boolean> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ DrawerState f9018p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ CoroutineScope f9019q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0(DrawerState drawerState, CoroutineScope coroutineScope) {
        super(0);
        this.f9018p0 = drawerState;
        this.f9019q0 = coroutineScope;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        DrawerState drawerState = this.f9018p0;
        if (drawerState.getAnchoredDraggableState$material_release().getConfirmValueChange$material_release().invoke(DrawerValue.Closed).booleanValue()) {
            BuildersKt__Builders_commonKt.launch$default(this.f9019q0, null, null, new s0(drawerState, null), 3, null);
        }
        return Boolean.TRUE;
    }
}
