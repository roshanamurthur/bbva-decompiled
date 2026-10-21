package j0;

import androidx.compose.material.pullrefresh.PullRefreshIndicatorKt;
import androidx.compose.material.pullrefresh.PullRefreshState;
import androidx.compose.runtime.State;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.drawscope.DrawContext;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.Stroke;
import com.google.android.material.internal.ViewUtils;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: PullRefreshIndicator.kt */
/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nPullRefreshIndicator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PullRefreshIndicator.kt\nandroidx/compose/material/pullrefresh/PullRefreshIndicatorKt$CircularArrowIndicator$2\n+ 2 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n*L\n1#1,250:1\n136#2,5:251\n261#2,11:256\n*S KotlinDebug\n*F\n+ 1 PullRefreshIndicator.kt\nandroidx/compose/material/pullrefresh/PullRefreshIndicatorKt$CircularArrowIndicator$2\n*L\n150#1:251,5\n150#1:256,11\n*E\n"})
public final class c extends Lambda implements Function1<DrawScope, Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ PullRefreshState f78736p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ State<Float> f78737q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ long f78738r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final /* synthetic */ Path f78739s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(PullRefreshState pullRefreshState, State<Float> state, long j10, Path path) {
        super(1);
        this.f78736p0 = pullRefreshState;
        this.f78737q0 = state;
        this.f78738r0 = j10;
        this.f78739s0 = path;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(DrawScope drawScope) {
        DrawScope Canvas = drawScope;
        Intrinsics.checkNotNullParameter(Canvas, "$this$Canvas");
        a aVarAccess$ArrowValues = PullRefreshIndicatorKt.access$ArrowValues(this.f78736p0.getProgress());
        float fFloatValue = this.f78737q0.getValue().floatValue();
        float f6 = aVarAccess$ArrowValues.f78731a;
        long j10 = this.f78738r0;
        Path path = this.f78739s0;
        long jMo2908getCenterF1C5BW0 = Canvas.mo2908getCenterF1C5BW0();
        DrawContext drawContext = Canvas.getDrawContext();
        long jMo2915getSizeNHjbRc = drawContext.mo2915getSizeNHjbRc();
        drawContext.getCanvas().save();
        drawContext.getTransform().mo2921rotateUv8p0NA(f6, jMo2908getCenterF1C5BW0);
        float fMo415toPx0680j_4 = (Canvas.mo415toPx0680j_4(PullRefreshIndicatorKt.f8868d) / 2.0f) + Canvas.mo415toPx0680j_4(PullRefreshIndicatorKt.f8867c);
        Rect rect = new Rect(Offset.m2275getXimpl(SizeKt.m2354getCenteruvyYCjk(Canvas.mo2909getSizeNHjbRc())) - fMo415toPx0680j_4, Offset.m2276getYimpl(SizeKt.m2354getCenteruvyYCjk(Canvas.mo2909getSizeNHjbRc())) - fMo415toPx0680j_4, Offset.m2275getXimpl(SizeKt.m2354getCenteruvyYCjk(Canvas.mo2909getSizeNHjbRc())) + fMo415toPx0680j_4, Offset.m2276getYimpl(SizeKt.m2354getCenteruvyYCjk(Canvas.mo2909getSizeNHjbRc())) + fMo415toPx0680j_4);
        float f10 = aVarAccess$ArrowValues.f78732b;
        a1.b.v(Canvas, j10, f10, aVarAccess$ArrowValues.f78733c - f10, false, rect.m2310getTopLeftF1C5BW0(), rect.m2308getSizeNHjbRc(), fFloatValue, new Stroke(Canvas.mo415toPx0680j_4(PullRefreshIndicatorKt.f8868d), 0.0f, StrokeCap.INSTANCE.m2810getSquareKaPHkGw(), 0, null, 26, null), null, 0, ViewUtils.EDGE_TO_EDGE_FLAGS, null);
        PullRefreshIndicatorKt.m891access$drawArrowBx497Mc(Canvas, path, rect, j10, fFloatValue, aVarAccess$ArrowValues);
        drawContext.getCanvas().restore();
        drawContext.mo2916setSizeuvyYCjk(jMo2915getSizeNHjbRc);
        return Unit.INSTANCE;
    }
}
