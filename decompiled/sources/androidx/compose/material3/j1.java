package androidx.compose.material3;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: ExposedDropdownMenu.kt */
/* JADX INFO: loaded from: classes.dex */
public final class j1 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ Function1<Boolean, Unit> f12941p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ boolean f12942q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public j1(Function1<? super Boolean, Unit> function1, boolean z10) {
        super(0);
        this.f12941p0 = function1;
        this.f12942q0 = z10;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        this.f12941p0.invoke(Boolean.valueOf(!this.f12942q0));
        return Unit.INSTANCE;
    }
}
