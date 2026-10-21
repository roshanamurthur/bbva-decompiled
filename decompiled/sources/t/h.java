package t;

import androidx.compose.foundation.BorderKt;
import androidx.compose.ui.geometry.CornerRadius;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.ClipOp;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawContext;
import androidx.compose.ui.graphics.drawscope.Stroke;
import com.bbva.sl.ar.core.libmcrypt.exception.ErrorCodes;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Border.kt */
/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nBorder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Border.kt\nandroidx/compose/foundation/BorderModifierNode$drawRoundRectBorder$1\n+ 2 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n*L\n1#1,512:1\n221#2:513\n261#2,11:514\n*S KotlinDebug\n*F\n+ 1 Border.kt\nandroidx/compose/foundation/BorderModifierNode$drawRoundRectBorder$1\n*L\n325#1:513\n325#1:514,11\n*E\n"})
public final class h extends Lambda implements Function1<ContentDrawScope, Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ boolean f93387p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ Brush f93388q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ long f93389r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final /* synthetic */ float f93390s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final /* synthetic */ float f93391t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public final /* synthetic */ long f93392u0;
    public final /* synthetic */ long v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public final /* synthetic */ Stroke f93393w0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(boolean z10, Brush brush, long j10, float f6, float f10, long j11, long j12, Stroke stroke) {
        super(1);
        this.f93387p0 = z10;
        this.f93388q0 = brush;
        this.f93389r0 = j10;
        this.f93390s0 = f6;
        this.f93391t0 = f10;
        this.f93392u0 = j11;
        this.v0 = j12;
        this.f93393w0 = stroke;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(ContentDrawScope contentDrawScope) {
        ContentDrawScope onDrawWithContent = contentDrawScope;
        Intrinsics.checkNotNullParameter(onDrawWithContent, "$this$onDrawWithContent");
        onDrawWithContent.drawContent();
        if (this.f93387p0) {
            a1.b.L(onDrawWithContent, this.f93388q0, 0L, 0L, this.f93389r0, 0.0f, null, null, 0, 246, null);
        } else {
            long j10 = this.f93389r0;
            float fM2250getXimpl = CornerRadius.m2250getXimpl(j10);
            float f6 = this.f93390s0;
            if (fM2250getXimpl < f6) {
                float f10 = this.f93391t0;
                float fM2344getWidthimpl = Size.m2344getWidthimpl(onDrawWithContent.mo2909getSizeNHjbRc());
                float f11 = this.f93391t0;
                float f12 = fM2344getWidthimpl - f11;
                float fM2341getHeightimpl = Size.m2341getHeightimpl(onDrawWithContent.mo2909getSizeNHjbRc()) - f11;
                int iM2496getDifferencertfAjoo = ClipOp.INSTANCE.m2496getDifferencertfAjoo();
                Brush brush = this.f93388q0;
                long j11 = this.f93389r0;
                DrawContext drawContext = onDrawWithContent.getDrawContext();
                long jMo2915getSizeNHjbRc = drawContext.mo2915getSizeNHjbRc();
                drawContext.getCanvas().save();
                drawContext.getTransform().mo2918clipRectN_I0leg(f10, f10, f12, fM2341getHeightimpl, iM2496getDifferencertfAjoo);
                a1.b.L(onDrawWithContent, brush, 0L, 0L, j11, 0.0f, null, null, 0, 246, null);
                drawContext.getCanvas().restore();
                drawContext.mo2916setSizeuvyYCjk(jMo2915getSizeNHjbRc);
            } else {
                a1.b.L(onDrawWithContent, this.f93388q0, this.f93392u0, this.v0, BorderKt.a(j10, f6), 0.0f, this.f93393w0, null, 0, ErrorCodes.ERR_CRY_BAD_REC_RSA_PUBKEY, null);
            }
        }
        return Unit.INSTANCE;
    }
}
