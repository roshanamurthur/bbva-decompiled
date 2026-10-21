package h0;

import androidx.compose.material.ListItemKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.Dp;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: ListItem.kt */
/* JADX INFO: loaded from: classes.dex */
public final class i1 extends Lambda implements Function2<Composer, Integer, Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ List<Dp> f68821p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ Modifier f68822q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ Function2<Composer, Integer, Unit> f68823r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final /* synthetic */ int f68824s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final /* synthetic */ int f68825t0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public i1(List<Dp> list, Modifier modifier, Function2<? super Composer, ? super Integer, Unit> function2, int i10, int i11) {
        super(2);
        this.f68821p0 = list;
        this.f68822q0 = modifier;
        this.f68823r0 = function2;
        this.f68824s0 = i10;
        this.f68825t0 = i11;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Composer composer, Integer num) {
        num.intValue();
        ListItemKt.access$BaselinesOffsetColumn(this.f68821p0, this.f68822q0, this.f68823r0, composer, RecomposeScopeImplKt.updateChangedFlags(this.f68824s0 | 1), this.f68825t0);
        return Unit.INSTANCE;
    }
}
