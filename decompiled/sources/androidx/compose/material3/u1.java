package androidx.compose.material3;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: ModalBottomSheet.android.kt */
/* JADX INFO: loaded from: classes.dex */
public final class u1 extends Lambda implements Function1<Throwable, Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ Function0<Unit> f14333p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u1(Function0<Unit> function0) {
        super(1);
        this.f14333p0 = function0;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Throwable th2) {
        this.f14333p0.invoke();
        return Unit.INSTANCE;
    }
}
