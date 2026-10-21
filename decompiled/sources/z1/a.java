package z1;

import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import g1.f;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: AndroidDialog.android.kt */
/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nAndroidDialog.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidDialog.android.kt\nandroidx/compose/ui/window/AndroidDialog_androidKt$DialogLayout$1\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,466:1\n151#2,3:467\n33#2,4:470\n154#2,2:474\n38#2:476\n156#2:477\n171#2,13:478\n171#2,13:491\n*S KotlinDebug\n*F\n+ 1 AndroidDialog.android.kt\nandroidx/compose/ui/window/AndroidDialog_androidKt$DialogLayout$1\n*L\n458#1:467,3\n458#1:470,4\n458#1:474,2\n458#1:476\n458#1:477\n459#1:478,13\n460#1:491,13\n*E\n"})
public final class a implements MeasurePolicy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f94928a = new a();

    /* JADX INFO: renamed from: z1.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: AndroidDialog.android.kt */
    @SourceDebugExtension({"SMAP\nAndroidDialog.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidDialog.android.kt\nandroidx/compose/ui/window/AndroidDialog_androidKt$DialogLayout$1$measure$1\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,466:1\n33#2,6:467\n*S KotlinDebug\n*F\n+ 1 AndroidDialog.android.kt\nandroidx/compose/ui/window/AndroidDialog_androidKt$DialogLayout$1$measure$1\n*L\n462#1:467,6\n*E\n"})
    public static final class C0512a extends Lambda implements Function1<Placeable.PlacementScope, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ List<Placeable> f94929p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0512a(ArrayList arrayList) {
            super(1);
            this.f94929p0 = arrayList;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Placeable.PlacementScope placementScope) {
            Placeable.PlacementScope layout = placementScope;
            Intrinsics.checkNotNullParameter(layout, "$this$layout");
            List<Placeable> list = this.f94929p0;
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                Placeable.PlacementScope.placeRelative$default(layout, list.get(i10), 0, 0, 0.0f, 4, null);
            }
            return Unit.INSTANCE;
        }
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public final /* synthetic */ int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i10) {
        return f.a(this, intrinsicMeasureScope, list, i10);
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public final /* synthetic */ int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i10) {
        return f.b(this, intrinsicMeasureScope, list, i10);
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    @NotNull
    /* JADX INFO: renamed from: measure-3p2s80s */
    public final MeasureResult mo113measure3p2s80s(@NotNull MeasureScope Layout, @NotNull List<? extends Measurable> measurables, long j10) {
        Object obj;
        Intrinsics.checkNotNullParameter(Layout, "$this$Layout");
        Intrinsics.checkNotNullParameter(measurables, "measurables");
        ArrayList arrayList = new ArrayList(measurables.size());
        int size = measurables.size();
        for (int i10 = 0; i10 < size; i10++) {
            arrayList.add(measurables.get(i10).mo3575measureBRTryo0(j10));
        }
        int i11 = 1;
        Object obj2 = null;
        if (!arrayList.isEmpty()) {
            obj = arrayList.get(0);
            int width = ((Placeable) obj).getWidth();
            int lastIndex = CollectionsKt__CollectionsKt.getLastIndex(arrayList);
            if (1 <= lastIndex) {
                int i12 = 1;
                while (true) {
                    Object obj3 = arrayList.get(i12);
                    int width2 = ((Placeable) obj3).getWidth();
                    if (width < width2) {
                        obj = obj3;
                        width = width2;
                    }
                    if (i12 == lastIndex) {
                        break;
                    }
                    i12++;
                }
            }
        } else {
            obj = null;
        }
        Placeable placeable = (Placeable) obj;
        int width3 = placeable != null ? placeable.getWidth() : Constraints.m4359getMinWidthimpl(j10);
        if (!arrayList.isEmpty()) {
            Object obj4 = arrayList.get(0);
            int height = ((Placeable) obj4).getHeight();
            int lastIndex2 = CollectionsKt__CollectionsKt.getLastIndex(arrayList);
            if (1 <= lastIndex2) {
                while (true) {
                    Object obj5 = arrayList.get(i11);
                    int height2 = ((Placeable) obj5).getHeight();
                    if (height < height2) {
                        obj4 = obj5;
                        height = height2;
                    }
                    if (i11 == lastIndex2) {
                        break;
                    }
                    i11++;
                }
            }
            obj2 = obj4;
        }
        Placeable placeable2 = (Placeable) obj2;
        return MeasureScope.CC.q(Layout, width3, placeable2 != null ? placeable2.getHeight() : Constraints.m4358getMinHeightimpl(j10), null, new C0512a(arrayList), 4, null);
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public final /* synthetic */ int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i10) {
        return f.c(this, intrinsicMeasureScope, list, i10);
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public final /* synthetic */ int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i10) {
        return f.d(this, intrinsicMeasureScope, list, i10);
    }
}
