package androidx.compose.foundation.text.selection;

import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.ImageBitmap;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawContext;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: AndroidSelectionHandles.android.kt */
/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nAndroidSelectionHandles.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidSelectionHandles.android.kt\nandroidx/compose/foundation/text/selection/AndroidSelectionHandles_androidKt$drawSelectionHandle$1$1$1$1\n+ 2 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n*L\n1#1,330:1\n173#2,6:331\n261#2,11:337\n*S KotlinDebug\n*F\n+ 1 AndroidSelectionHandles.android.kt\nandroidx/compose/foundation/text/selection/AndroidSelectionHandles_androidKt$drawSelectionHandle$1$1$1$1\n*L\n124#1:331,6\n124#1:337,11\n*E\n"})
public final class b extends Lambda implements Function1<ContentDrawScope, Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ boolean f6460p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ ResolvedTextDirection f6461q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ boolean f6462r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final /* synthetic */ ImageBitmap f6463s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final /* synthetic */ ColorFilter f6464t0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(boolean z10, ResolvedTextDirection resolvedTextDirection, boolean z11, ImageBitmap imageBitmap, ColorFilter colorFilter) {
        super(1);
        this.f6460p0 = z10;
        this.f6461q0 = resolvedTextDirection;
        this.f6462r0 = z11;
        this.f6463s0 = imageBitmap;
        this.f6464t0 = colorFilter;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(ContentDrawScope contentDrawScope) {
        ContentDrawScope onDrawWithContent = contentDrawScope;
        Intrinsics.checkNotNullParameter(onDrawWithContent, "$this$onDrawWithContent");
        onDrawWithContent.drawContent();
        if (AndroidSelectionHandles_androidKt.access$isLeft(this.f6460p0, this.f6461q0, this.f6462r0)) {
            ImageBitmap imageBitmap = this.f6463s0;
            ColorFilter colorFilter = this.f6464t0;
            long jMo2908getCenterF1C5BW0 = onDrawWithContent.mo2908getCenterF1C5BW0();
            DrawContext drawContext = onDrawWithContent.getDrawContext();
            long jMo2915getSizeNHjbRc = drawContext.mo2915getSizeNHjbRc();
            drawContext.getCanvas().save();
            drawContext.getTransform().mo2922scale0AR0LA0(-1.0f, 1.0f, jMo2908getCenterF1C5BW0);
            a1.b.A(onDrawWithContent, imageBitmap, 0L, 0.0f, null, colorFilter, 0, 46, null);
            drawContext.getCanvas().restore();
            drawContext.mo2916setSizeuvyYCjk(jMo2915getSizeNHjbRc);
        } else {
            a1.b.A(onDrawWithContent, this.f6463s0, 0L, 0.0f, null, this.f6464t0, 0, 46, null);
        }
        return Unit.INSTANCE;
    }
}
