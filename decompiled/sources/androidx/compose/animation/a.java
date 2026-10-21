package androidx.compose.animation;

import androidx.compose.ui.layout.Placeable;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: AnimatedContent.kt */
/* JADX INFO: loaded from: classes.dex */
public final class a extends Lambda implements Function1<Placeable.PlacementScope, Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ Placeable f2824p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ ContentTransform f2825q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Placeable placeable, ContentTransform contentTransform) {
        super(1);
        this.f2824p0 = placeable;
        this.f2825q0 = contentTransform;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Placeable.PlacementScope placementScope) {
        Placeable.PlacementScope layout = placementScope;
        Intrinsics.checkNotNullParameter(layout, "$this$layout");
        layout.place(this.f2824p0, 0, 0, this.f2825q0.getTargetContentZIndex());
        return Unit.INSTANCE;
    }
}
