package androidx.compose.foundation.lazy.layout;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: LazyLayoutItemContentFactory.kt */
/* JADX INFO: loaded from: classes.dex */
public final class h extends Lambda implements Function2<Composer, Integer, Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ LazyLayoutItemProvider f5092p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ Object f5093q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ int f5094r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final /* synthetic */ Object f5095s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final /* synthetic */ int f5096t0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(LazyLayoutItemProvider lazyLayoutItemProvider, Object obj, int i10, Object obj2, int i11) {
        super(2);
        this.f5092p0 = lazyLayoutItemProvider;
        this.f5093q0 = obj;
        this.f5094r0 = i10;
        this.f5095s0 = obj2;
        this.f5096t0 = i11;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Composer composer, Integer num) {
        num.intValue();
        LazyLayoutItemContentFactoryKt.m402access$SkippableItemJVlU9Rs(this.f5092p0, this.f5093q0, this.f5094r0, this.f5095s0, composer, RecomposeScopeImplKt.updateChangedFlags(this.f5096t0 | 1));
        return Unit.INSTANCE;
    }
}
