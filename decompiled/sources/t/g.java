package t;

import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.ImageBitmap;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Border.kt */
/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nBorder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Border.kt\nandroidx/compose/foundation/BorderModifierNode$drawGenericBorder$3\n+ 2 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n*L\n1#1,512:1\n120#2,4:513\n*S KotlinDebug\n*F\n+ 1 Border.kt\nandroidx/compose/foundation/BorderModifierNode$drawGenericBorder$3\n*L\n290#1:513,4\n*E\n"})
public final class g extends Lambda implements Function1<ContentDrawScope, Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ Rect f93378p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ Ref.ObjectRef<ImageBitmap> f93379q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ long f93380r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final /* synthetic */ ColorFilter f93381s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(Rect rect, Ref.ObjectRef<ImageBitmap> objectRef, long j10, ColorFilter colorFilter) {
        super(1);
        this.f93378p0 = rect;
        this.f93379q0 = objectRef;
        this.f93380r0 = j10;
        this.f93381s0 = colorFilter;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(ContentDrawScope contentDrawScope) {
        ContentDrawScope onDrawWithContent = contentDrawScope;
        Intrinsics.checkNotNullParameter(onDrawWithContent, "$this$onDrawWithContent");
        onDrawWithContent.drawContent();
        Rect rect = this.f93378p0;
        float left = rect.getLeft();
        float top = rect.getTop();
        long j10 = this.f93380r0;
        ColorFilter colorFilter = this.f93381s0;
        onDrawWithContent.getDrawContext().getTransform().translate(left, top);
        a1.b.z(onDrawWithContent, this.f93379q0.element, 0L, j10, 0L, 0L, 0.0f, null, colorFilter, 0, 0, 890, null);
        onDrawWithContent.getDrawContext().getTransform().translate(-left, -top);
        return Unit.INSTANCE;
    }
}
