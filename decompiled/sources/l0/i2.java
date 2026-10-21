package l0;

import androidx.compose.material3.ModalBottomSheet_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: ModalBottomSheet.android.kt */
/* JADX INFO: loaded from: classes.dex */
public final class i2 extends Lambda implements Function2<Composer, Integer, Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ long f82610p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ Function0<Unit> f82611q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ boolean f82612r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final /* synthetic */ int f82613s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i2(long j10, Function0<Unit> function0, boolean z10, int i10) {
        super(2);
        this.f82610p0 = j10;
        this.f82611q0 = function0;
        this.f82612r0 = z10;
        this.f82613s0 = i10;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Composer composer, Integer num) {
        num.intValue();
        ModalBottomSheet_androidKt.m1171access$Scrim3JVO9M(this.f82610p0, this.f82611q0, this.f82612r0, composer, RecomposeScopeImplKt.updateChangedFlags(this.f82613s0 | 1));
        return Unit.INSTANCE;
    }
}
