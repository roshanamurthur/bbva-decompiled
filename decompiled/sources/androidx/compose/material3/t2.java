package androidx.compose.material3;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: NavigationDrawer.kt */
/* JADX INFO: loaded from: classes.dex */
public final class t2 extends Lambda implements Function0<Boolean> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ DrawerState f13111p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ CoroutineScope f13112q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t2(DrawerState drawerState, CoroutineScope coroutineScope) {
        super(0);
        this.f13111p0 = drawerState;
        this.f13112q0 = coroutineScope;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        DrawerState drawerState = this.f13111p0;
        if (drawerState.getSwipeableState$material3_release().getConfirmStateChange$material3_release().invoke(DrawerValue.Closed).booleanValue()) {
            BuildersKt__Builders_commonKt.launch$default(this.f13112q0, null, null, new s2(drawerState, null), 3, null);
        }
        return Boolean.TRUE;
    }
}
