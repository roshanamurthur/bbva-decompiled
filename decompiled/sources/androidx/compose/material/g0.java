package androidx.compose.material;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: Drawer.kt */
/* JADX INFO: loaded from: classes.dex */
public final class g0 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ boolean f8474p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ BottomDrawerState f8475q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ CoroutineScope f8476r0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(boolean z10, BottomDrawerState bottomDrawerState, CoroutineScope coroutineScope) {
        super(0);
        this.f8474p0 = z10;
        this.f8475q0 = bottomDrawerState;
        this.f8476r0 = coroutineScope;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        if (this.f8474p0) {
            BottomDrawerValue bottomDrawerValue = BottomDrawerValue.Closed;
            BottomDrawerState bottomDrawerState = this.f8475q0;
            if (bottomDrawerState.confirmStateChange$material_release(bottomDrawerValue)) {
                BuildersKt__Builders_commonKt.launch$default(this.f8476r0, null, null, new f0(bottomDrawerState, null), 3, null);
            }
        }
        return Unit.INSTANCE;
    }
}
