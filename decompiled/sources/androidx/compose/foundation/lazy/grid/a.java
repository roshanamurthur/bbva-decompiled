package androidx.compose.foundation.lazy.grid;

import androidx.compose.ui.unit.Constraints;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: LazyGrid.kt */
/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nLazyGrid.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyGrid.kt\nandroidx/compose/foundation/lazy/grid/LazyGridKt$rememberLazyGridMeasurePolicy$1$1$1\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,375:1\n33#2,6:376\n*S KotlinDebug\n*F\n+ 1 LazyGrid.kt\nandroidx/compose/foundation/lazy/grid/LazyGridKt$rememberLazyGridMeasurePolicy$1$1$1\n*L\n310#1:376,6\n*E\n"})
public final class a extends Lambda implements Function1<Integer, ArrayList<Pair<? extends Integer, ? extends Constraints>>> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ LazyGridSpanLayoutProvider f4914p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ LazyGridKt$rememberLazyGridMeasurePolicy$1$1$measuredLineProvider$1 f4915q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(LazyGridSpanLayoutProvider lazyGridSpanLayoutProvider, LazyGridKt$rememberLazyGridMeasurePolicy$1$1$measuredLineProvider$1 lazyGridKt$rememberLazyGridMeasurePolicy$1$1$measuredLineProvider$1) {
        super(1);
        this.f4914p0 = lazyGridSpanLayoutProvider;
        this.f4915q0 = lazyGridKt$rememberLazyGridMeasurePolicy$1$1$measuredLineProvider$1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final ArrayList<Pair<? extends Integer, ? extends Constraints>> invoke(Integer num) {
        LazyGridSpanLayoutProvider.LineConfiguration lineConfiguration = this.f4914p0.getLineConfiguration(num.intValue());
        int firstItemIndex = lineConfiguration.getFirstItemIndex();
        ArrayList<Pair<? extends Integer, ? extends Constraints>> arrayList = new ArrayList<>(lineConfiguration.getSpans().size());
        List<GridItemSpan> spans = lineConfiguration.getSpans();
        int size = spans.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            int iM378getCurrentLineSpanimpl = GridItemSpan.m378getCurrentLineSpanimpl(spans.get(i11).getF4697a());
            arrayList.add(TuplesKt.to(Integer.valueOf(firstItemIndex), Constraints.m4346boximpl(m392childConstraintsJhjzzOo$foundation_release(i10, iM378getCurrentLineSpanimpl))));
            firstItemIndex++;
            i10 += iM378getCurrentLineSpanimpl;
        }
        return arrayList;
    }
}
