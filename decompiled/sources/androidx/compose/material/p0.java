package androidx.compose.material;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: Drawer.kt */
/* JADX INFO: loaded from: classes.dex */
public final class p0 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ boolean f8857p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ DrawerState f8858q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ CoroutineScope f8859r0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(boolean z10, DrawerState drawerState, CoroutineScope coroutineScope) {
        super(0);
        this.f8857p0 = z10;
        this.f8858q0 = drawerState;
        this.f8859r0 = coroutineScope;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        if (this.f8857p0) {
            DrawerState drawerState = this.f8858q0;
            if (drawerState.getAnchoredDraggableState$material_release().getConfirmValueChange$material_release().invoke(DrawerValue.Closed).booleanValue()) {
                BuildersKt__Builders_commonKt.launch$default(this.f8859r0, null, null, new o0(drawerState, null), 3, null);
            }
        }
        return Unit.INSTANCE;
    }
}
