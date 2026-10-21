package t;

import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: Border.kt */
/* JADX INFO: loaded from: classes.dex */
public final class i extends Lambda implements Function1<ContentDrawScope, Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ Path f93397p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ Brush f93398q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(Path path, Brush brush) {
        super(1);
        this.f93397p0 = path;
        this.f93398q0 = brush;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(ContentDrawScope contentDrawScope) {
        ContentDrawScope onDrawWithContent = contentDrawScope;
        Intrinsics.checkNotNullParameter(onDrawWithContent, "$this$onDrawWithContent");
        onDrawWithContent.drawContent();
        a1.b.F(onDrawWithContent, this.f93397p0, this.f93398q0, 0.0f, null, null, 0, 60, null);
        return Unit.INSTANCE;
    }
}
