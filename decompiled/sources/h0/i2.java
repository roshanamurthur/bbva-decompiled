package h0;

import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.material.ScaffoldKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: Scaffold.kt */
/* JADX INFO: loaded from: classes.dex */
public final class i2 extends Lambda implements Function2<Composer, Integer, Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ boolean f68826p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ int f68827q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ Function2<Composer, Integer, Unit> f68828r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final /* synthetic */ Function3<PaddingValues, Composer, Integer, Unit> f68829s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final /* synthetic */ Function2<Composer, Integer, Unit> f68830t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public final /* synthetic */ Function2<Composer, Integer, Unit> f68831u0;
    public final /* synthetic */ Function2<Composer, Integer, Unit> v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public final /* synthetic */ int f68832w0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i2(int i10, int i11, Function2 function2, Function2 function3, Function2 function4, Function2 function5, Function3 function6, boolean z10) {
        super(2);
        this.f68826p0 = z10;
        this.f68827q0 = i10;
        this.f68828r0 = function2;
        this.f68829s0 = function6;
        this.f68830t0 = function3;
        this.f68831u0 = function4;
        this.v0 = function5;
        this.f68832w0 = i11;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Composer composer, Integer num) {
        num.intValue();
        ScaffoldKt.m813access$ScaffoldLayoutMDYNRJg(this.f68826p0, this.f68827q0, this.f68828r0, this.f68829s0, this.f68830t0, this.f68831u0, this.v0, composer, RecomposeScopeImplKt.updateChangedFlags(this.f68832w0 | 1));
        return Unit.INSTANCE;
    }
}
