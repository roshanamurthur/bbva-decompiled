package h0;

import androidx.compose.ui.graphics.drawscope.DrawScope;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: Drawer.kt */
/* JADX INFO: loaded from: classes.dex */
public final class w0 extends Lambda implements Function1<DrawScope, Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ long f69148p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ Function0<Float> f69149q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(long j10, Function0<Float> function0) {
        super(1);
        this.f69148p0 = j10;
        this.f69149q0 = function0;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(DrawScope drawScope) {
        DrawScope Canvas = drawScope;
        Intrinsics.checkNotNullParameter(Canvas, "$this$Canvas");
        a1.b.K(Canvas, this.f69148p0, 0L, 0L, this.f69149q0.invoke().floatValue(), null, null, 0, 118, null);
        return Unit.INSTANCE;
    }
}
