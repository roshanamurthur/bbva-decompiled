package androidx.compose.foundation.text;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.ImageBitmap;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawContext;
import androidx.compose.ui.graphics.drawscope.DrawTransform;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: AndroidCursorHandle.android.kt */
/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nAndroidCursorHandle.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidCursorHandle.android.kt\nandroidx/compose/foundation/text/AndroidCursorHandle_androidKt$drawCursorHandle$1$1$1$1\n+ 2 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n*L\n1#1,81:1\n261#2,11:82\n*S KotlinDebug\n*F\n+ 1 AndroidCursorHandle.android.kt\nandroidx/compose/foundation/text/AndroidCursorHandle_androidKt$drawCursorHandle$1$1$1$1\n*L\n72#1:82,11\n*E\n"})
public final class a extends Lambda implements Function1<ContentDrawScope, Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ float f6082p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ ImageBitmap f6083q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ ColorFilter f6084r0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(float f6, ImageBitmap imageBitmap, ColorFilter colorFilter) {
        super(1);
        this.f6082p0 = f6;
        this.f6083q0 = imageBitmap;
        this.f6084r0 = colorFilter;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(ContentDrawScope contentDrawScope) {
        ContentDrawScope onDrawWithContent = contentDrawScope;
        Intrinsics.checkNotNullParameter(onDrawWithContent, "$this$onDrawWithContent");
        onDrawWithContent.drawContent();
        ImageBitmap imageBitmap = this.f6083q0;
        ColorFilter colorFilter = this.f6084r0;
        DrawContext drawContext = onDrawWithContent.getDrawContext();
        long jMo2915getSizeNHjbRc = drawContext.mo2915getSizeNHjbRc();
        drawContext.getCanvas().save();
        DrawTransform transform = drawContext.getTransform();
        a1.c.g(transform, this.f6082p0, 0.0f, 2, null);
        transform.mo2921rotateUv8p0NA(45.0f, Offset.INSTANCE.m2291getZeroF1C5BW0());
        a1.b.A(onDrawWithContent, imageBitmap, 0L, 0.0f, null, colorFilter, 0, 46, null);
        drawContext.getCanvas().restore();
        drawContext.mo2916setSizeuvyYCjk(jMo2915getSizeNHjbRc);
        return Unit.INSTANCE;
    }
}
