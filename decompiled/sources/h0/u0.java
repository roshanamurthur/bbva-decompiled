package h0;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: Drawer.kt */
/* JADX INFO: loaded from: classes.dex */
public final class u0 extends Lambda implements Function0<Boolean> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ Function0<Unit> f69126p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(Function0<Unit> function0) {
        super(0);
        this.f69126p0 = function0;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        this.f69126p0.invoke();
        return Boolean.TRUE;
    }
}
