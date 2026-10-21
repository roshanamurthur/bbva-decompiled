package l0;

import androidx.compose.foundation.layout.RowScope;
import androidx.compose.material3.ListItemKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: ListItem.kt */
/* JADX INFO: loaded from: classes.dex */
public final class c2 extends Lambda implements Function2<Composer, Integer, Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ RowScope f82472p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ long f82473q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ boolean f82474r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final /* synthetic */ Function2<Composer, Integer, Unit> f82475s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final /* synthetic */ int f82476t0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public c2(RowScope rowScope, long j10, boolean z10, Function2<? super Composer, ? super Integer, Unit> function2, int i10) {
        super(2);
        this.f82472p0 = rowScope;
        this.f82473q0 = j10;
        this.f82474r0 = z10;
        this.f82475s0 = function2;
        this.f82476t0 = i10;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Composer composer, Integer num) {
        num.intValue();
        ListItemKt.m1163access$TrailingContent3IgeMak(this.f82472p0, this.f82473q0, this.f82474r0, this.f82475s0, composer, RecomposeScopeImplKt.updateChangedFlags(this.f82476t0 | 1));
        return Unit.INSTANCE;
    }
}
