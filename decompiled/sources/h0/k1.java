package h0;

import androidx.compose.material.ListItemKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: ListItem.kt */
/* JADX INFO: loaded from: classes.dex */
public final class k1 extends Lambda implements Function2<Composer, Integer, Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ float f68869p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ Modifier f68870q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ Function2<Composer, Integer, Unit> f68871r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final /* synthetic */ int f68872s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final /* synthetic */ int f68873t0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k1(float f6, int i10, int i11, Modifier modifier, Function2 function2) {
        super(2);
        this.f68869p0 = f6;
        this.f68870q0 = modifier;
        this.f68871r0 = function2;
        this.f68872s0 = i10;
        this.f68873t0 = i11;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Composer composer, Integer num) {
        num.intValue();
        ListItemKt.m782access$OffsetToBaselineOrCenterKz89ssw(this.f68869p0, this.f68870q0, this.f68871r0, composer, RecomposeScopeImplKt.updateChangedFlags(this.f68872s0 | 1), this.f68873t0);
        return Unit.INSTANCE;
    }
}
