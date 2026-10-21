package l0;

import androidx.compose.runtime.State;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: ModalBottomSheet.android.kt */
/* JADX INFO: loaded from: classes.dex */
public final class h2 extends Lambda implements Function1<DrawScope, Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ long f82594p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ State<Float> f82595q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h2(long j10, State<Float> state) {
        super(1);
        this.f82594p0 = j10;
        this.f82595q0 = state;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(DrawScope drawScope) {
        DrawScope Canvas = drawScope;
        Intrinsics.checkNotNullParameter(Canvas, "$this$Canvas");
        a1.b.K(Canvas, this.f82594p0, 0L, 0L, ((Number) this.f82595q0.getValue()).floatValue(), null, null, 0, 118, null);
        return Unit.INSTANCE;
    }
}
