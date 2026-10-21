package t;

import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: Border.kt */
/* JADX INFO: loaded from: classes.dex */
public final class e extends Lambda implements Function1<ContentDrawScope, Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ Brush f93370p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ long f93371q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ long f93372r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final /* synthetic */ DrawStyle f93373s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(Brush brush, long j10, long j11, DrawStyle drawStyle) {
        super(1);
        this.f93370p0 = brush;
        this.f93371q0 = j10;
        this.f93372r0 = j11;
        this.f93373s0 = drawStyle;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(ContentDrawScope contentDrawScope) {
        ContentDrawScope onDrawWithContent = contentDrawScope;
        Intrinsics.checkNotNullParameter(onDrawWithContent, "$this$onDrawWithContent");
        onDrawWithContent.drawContent();
        a1.b.J(onDrawWithContent, this.f93370p0, this.f93371q0, this.f93372r0, 0.0f, this.f93373s0, null, 0, 104, null);
        return Unit.INSTANCE;
    }
}
