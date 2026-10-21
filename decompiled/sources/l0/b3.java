package l0;

import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.material3.ScaffoldKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: Scaffold.kt */
/* JADX INFO: loaded from: classes.dex */
public final class b3 extends Lambda implements Function2<Composer, Integer, Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ int f82445p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ Function2<Composer, Integer, Unit> f82446q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ Function3<PaddingValues, Composer, Integer, Unit> f82447r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final /* synthetic */ Function2<Composer, Integer, Unit> f82448s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final /* synthetic */ Function2<Composer, Integer, Unit> f82449t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public final /* synthetic */ WindowInsets f82450u0;
    public final /* synthetic */ Function2<Composer, Integer, Unit> v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public final /* synthetic */ int f82451w0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b3(int i10, int i11, WindowInsets windowInsets, Function2 function2, Function2 function3, Function2 function4, Function2 function5, Function3 function6) {
        super(2);
        this.f82445p0 = i10;
        this.f82446q0 = function2;
        this.f82447r0 = function6;
        this.f82448s0 = function3;
        this.f82449t0 = function4;
        this.f82450u0 = windowInsets;
        this.v0 = function5;
        this.f82451w0 = i11;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Composer composer, Integer num) {
        num.intValue();
        ScaffoldKt.m1225access$ScaffoldLayoutFMILGgc(this.f82445p0, this.f82446q0, this.f82447r0, this.f82448s0, this.f82449t0, this.f82450u0, this.v0, composer, RecomposeScopeImplKt.updateChangedFlags(this.f82451w0 | 1));
        return Unit.INSTANCE;
    }
}
