package h0;

import androidx.compose.ui.layout.Placeable;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: BackdropScaffold.kt */
/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nBackdropScaffold.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BackdropScaffold.kt\nandroidx/compose/material/BackdropScaffoldKt$BackdropStack$1$1$2\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,522:1\n33#2,6:523\n*S KotlinDebug\n*F\n+ 1 BackdropScaffold.kt\nandroidx/compose/material/BackdropScaffoldKt$BackdropStack$1$1$2\n*L\n479#1:523,6\n*E\n"})
public final class d extends Lambda implements Function1<Placeable.PlacementScope, Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ Placeable f68707p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ List<Placeable> f68708q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(Placeable placeable, ArrayList arrayList) {
        super(1);
        this.f68707p0 = placeable;
        this.f68708q0 = arrayList;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Placeable.PlacementScope placementScope) {
        Placeable.PlacementScope layout = placementScope;
        Intrinsics.checkNotNullParameter(layout, "$this$layout");
        Placeable.PlacementScope.placeRelative$default(layout, this.f68707p0, 0, 0, 0.0f, 4, null);
        List<Placeable> list = this.f68708q0;
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            Placeable.PlacementScope.placeRelative$default(layout, list.get(i10), 0, 0, 0.0f, 4, null);
        }
        return Unit.INSTANCE;
    }
}
