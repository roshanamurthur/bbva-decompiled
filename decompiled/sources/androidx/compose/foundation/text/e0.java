package androidx.compose.foundation.text;

import androidx.compose.ui.layout.Placeable;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: TextFieldSize.kt */
/* JADX INFO: loaded from: classes.dex */
public final class e0 extends Lambda implements Function1<Placeable.PlacementScope, Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ Placeable f6130p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(Placeable placeable) {
        super(1);
        this.f6130p0 = placeable;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Placeable.PlacementScope placementScope) {
        Placeable.PlacementScope layout = placementScope;
        Intrinsics.checkNotNullParameter(layout, "$this$layout");
        Placeable.PlacementScope.placeRelative$default(layout, this.f6130p0, 0, 0, 0.0f, 4, null);
        return Unit.INSTANCE;
    }
}
