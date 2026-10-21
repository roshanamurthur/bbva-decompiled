package androidx.compose.foundation.lazy.grid;

import androidx.compose.runtime.Composer;
import com.bbva.component.dm.analytics.constants.AnalyticsConstants;
import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: LazyGridDsl.kt */
/* JADX INFO: loaded from: classes.dex */
@LazyGridScopeMarker
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001Jc\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00012\u001b\b\u0002\u0010\u0005\u001a\u0015\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006¢\u0006\u0002\b\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00012\u001c\u0010\u000b\u001a\u0018\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00030\u0006¢\u0006\u0002\b\r¢\u0006\u0002\b\tH&ø\u0001\u0000¢\u0006\u0002\u0010\u000eJË\u0001\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u00112%\b\u0002\u0010\u0004\u001a\u001f\u0012\u0013\u0012\u00110\u0011¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0014\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000620\b\u0002\u0010\u0005\u001a*\u0012\u0004\u0012\u00020\u0007\u0012\u0013\u0012\u00110\u0011¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0014\u0012\u0004\u0012\u00020\b\u0018\u00010\u0015¢\u0006\u0002\b\t2%\b\u0002\u0010\n\u001a\u001f\u0012\u0013\u0012\u00110\u0011¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000621\u0010\u0016\u001a-\u0012\u0004\u0012\u00020\f\u0012\u0013\u0012\u00110\u0011¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0014\u0012\u0004\u0012\u00020\u00030\u0015¢\u0006\u0002\b\r¢\u0006\u0002\b\tH&ø\u0001\u0000¢\u0006\u0002\u0010\u0017\u0082\u0001\u0001\u0018ø\u0001\u0001\u0082\u0002\n\n\u0002\b\u0019\n\u0004\b!0\u0001¨\u0006\u0019À\u0006\u0001"}, d2 = {"Landroidx/compose/foundation/lazy/grid/LazyGridScope;", "", AnalyticsConstants.Key.ITEM, "", "key", "span", "Lkotlin/Function1;", "Landroidx/compose/foundation/lazy/grid/LazyGridItemSpanScope;", "Landroidx/compose/foundation/lazy/grid/GridItemSpan;", "Lkotlin/ExtensionFunctionType;", "contentType", "content", "Landroidx/compose/foundation/lazy/grid/LazyGridItemScope;", "Landroidx/compose/runtime/Composable;", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Ljava/lang/Object;Lkotlin/jvm/functions/Function3;)V", FirebaseAnalytics.Param.ITEMS, "count", "", "Lkotlin/ParameterName;", "name", FirebaseAnalytics.Param.INDEX, "Lkotlin/Function2;", "itemContent", "(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function4;)V", "Landroidx/compose/foundation/lazy/grid/LazyGridIntervalContent;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface LazyGridScope {
    void item(@Nullable Object key, @Nullable Function1<? super LazyGridItemSpanScope, GridItemSpan> span, @Nullable Object contentType, @NotNull Function3<? super LazyGridItemScope, ? super Composer, ? super Integer, Unit> content);

    void items(int count, @Nullable Function1<? super Integer, ? extends Object> key, @Nullable Function2<? super LazyGridItemSpanScope, ? super Integer, GridItemSpan> span, @NotNull Function1<? super Integer, ? extends Object> contentType, @NotNull Function4<? super LazyGridItemScope, ? super Integer, ? super Composer, ? super Integer, Unit> itemContent);
}
