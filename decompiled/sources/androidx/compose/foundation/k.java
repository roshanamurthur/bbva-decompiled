package androidx.compose.foundation;

import androidx.compose.ui.graphics.drawscope.DrawScope;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.flow.MutableSharedFlow;

/* JADX INFO: compiled from: Magnifier.kt */
/* JADX INFO: loaded from: classes.dex */
public final class k extends Lambda implements Function1<DrawScope, Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ MutableSharedFlow<Unit> f4136p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(MutableSharedFlow<Unit> mutableSharedFlow) {
        super(1);
        this.f4136p0 = mutableSharedFlow;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(DrawScope drawScope) {
        DrawScope drawBehind = drawScope;
        Intrinsics.checkNotNullParameter(drawBehind, "$this$drawBehind");
        Unit unit = Unit.INSTANCE;
        this.f4136p0.tryEmit(unit);
        return unit;
    }
}
