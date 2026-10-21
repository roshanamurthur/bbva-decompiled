package androidx.compose.material;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: Drawer.kt */
/* JADX INFO: loaded from: classes.dex */
public final class k0 extends Lambda implements Function0<Boolean> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ BottomDrawerState f8808p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ CoroutineScope f8809q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(BottomDrawerState bottomDrawerState, CoroutineScope coroutineScope) {
        super(0);
        this.f8808p0 = bottomDrawerState;
        this.f8809q0 = coroutineScope;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        BottomDrawerValue bottomDrawerValue = BottomDrawerValue.Closed;
        BottomDrawerState bottomDrawerState = this.f8808p0;
        if (bottomDrawerState.confirmStateChange$material_release(bottomDrawerValue)) {
            BuildersKt__Builders_commonKt.launch$default(this.f8809q0, null, null, new j0(bottomDrawerState, null), 3, null);
        }
        return Boolean.TRUE;
    }
}
