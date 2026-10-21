package z1;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.window.AndroidDialog_androidKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: AndroidDialog.android.kt */
/* JADX INFO: loaded from: classes.dex */
public final class b extends Lambda implements Function2<Composer, Integer, Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ Modifier f94930p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ Function2<Composer, Integer, Unit> f94931q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ int f94932r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final /* synthetic */ int f94933s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public b(Modifier modifier, Function2<? super Composer, ? super Integer, Unit> function2, int i10, int i11) {
        super(2);
        this.f94930p0 = modifier;
        this.f94931q0 = function2;
        this.f94932r0 = i10;
        this.f94933s0 = i11;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Composer composer, Integer num) {
        num.intValue();
        int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f94932r0 | 1);
        AndroidDialog_androidKt.access$DialogLayout(this.f94930p0, this.f94931q0, composer, iUpdateChangedFlags, this.f94933s0);
        return Unit.INSTANCE;
    }
}
