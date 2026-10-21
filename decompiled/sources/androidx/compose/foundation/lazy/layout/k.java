package androidx.compose.foundation.lazy.layout;

import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.SubcomposeMeasureScope;
import androidx.compose.ui.unit.Constraints;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: LazyLayout.kt */
/* JADX INFO: loaded from: classes.dex */
public final class k extends Lambda implements Function2<SubcomposeMeasureScope, Constraints, MeasureResult> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ LazyLayoutItemContentFactory f5099p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ Function2<LazyLayoutMeasureScope, Constraints, MeasureResult> f5100q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public k(LazyLayoutItemContentFactory lazyLayoutItemContentFactory, Function2<? super LazyLayoutMeasureScope, ? super Constraints, ? extends MeasureResult> function2) {
        super(2);
        this.f5099p0 = lazyLayoutItemContentFactory;
        this.f5100q0 = function2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final MeasureResult invoke(SubcomposeMeasureScope subcomposeMeasureScope, Constraints constraints) {
        SubcomposeMeasureScope subcomposeMeasureScope2 = subcomposeMeasureScope;
        long f18296a = constraints.getF18296a();
        Intrinsics.checkNotNullParameter(subcomposeMeasureScope2, "$this$null");
        return this.f5100q0.invoke(new LazyLayoutMeasureScopeImpl(this.f5099p0, subcomposeMeasureScope2), Constraints.m4346boximpl(f18296a));
    }
}
