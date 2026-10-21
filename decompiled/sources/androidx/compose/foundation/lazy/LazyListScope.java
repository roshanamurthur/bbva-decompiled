package androidx.compose.foundation.lazy;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.runtime.Composer;
import com.bbva.component.dm.analytics.constants.AnalyticsConstants;
import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: LazyDsl.kt */
/* JADX INFO: loaded from: classes.dex */
@LazyScopeMarker
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J7\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00012\u001c\u0010\u0005\u001a\u0018\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00030\u0006¢\u0006\u0002\b\b¢\u0006\u0002\b\tH\u0017¢\u0006\u0002\u0010\nJC\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00012\u001c\u0010\u0005\u001a\u0018\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00030\u0006¢\u0006\u0002\b\b¢\u0006\u0002\b\tH\u0016¢\u0006\u0002\u0010\fJ\u0096\u0001\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u000f2%\b\u0002\u0010\u0004\u001a\u001f\u0012\u0013\u0012\u00110\u000f¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0012\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00062%\b\u0002\u0010\u000b\u001a\u001f\u0012\u0013\u0012\u00110\u000f¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000621\u0010\u0013\u001a-\u0012\u0004\u0012\u00020\u0007\u0012\u0013\u0012\u00110\u000f¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0012\u0012\u0004\u0012\u00020\u00030\u0014¢\u0006\u0002\b\b¢\u0006\u0002\b\tH\u0016¢\u0006\u0002\u0010\u0015Jo\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u000f2%\b\u0002\u0010\u0004\u001a\u001f\u0012\u0013\u0012\u00110\u000f¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0012\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000621\u0010\u0013\u001a-\u0012\u0004\u0012\u00020\u0007\u0012\u0013\u0012\u00110\u000f¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0012\u0012\u0004\u0012\u00020\u00030\u0014¢\u0006\u0002\b\b¢\u0006\u0002\b\tH\u0017¢\u0006\u0002\u0010\u0016JC\u0010\u0017\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00012\u001c\u0010\u0005\u001a\u0018\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00030\u0006¢\u0006\u0002\b\b¢\u0006\u0002\b\tH'¢\u0006\u0002\u0010\fø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0018À\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/lazy/LazyListScope;", "", AnalyticsConstants.Key.ITEM, "", "key", "content", "Lkotlin/Function1;", "Landroidx/compose/foundation/lazy/LazyItemScope;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function3;)V", "contentType", "(Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function3;)V", FirebaseAnalytics.Param.ITEMS, "count", "", "Lkotlin/ParameterName;", "name", FirebaseAnalytics.Param.INDEX, "itemContent", "Lkotlin/Function2;", "(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function4;)V", "(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function4;)V", "stickyHeader", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface LazyListScope {

    /* JADX INFO: compiled from: LazyDsl.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class DefaultImpls {
        @Deprecated
        public static void item(@NotNull LazyListScope lazyListScope, @Nullable Object obj, @Nullable Object obj2, @NotNull Function3<? super LazyItemScope, ? super Composer, ? super Integer, Unit> content) {
            Intrinsics.checkNotNullParameter(content, "content");
            a.a(lazyListScope, obj, obj2, content);
        }

        @Deprecated
        public static void items(@NotNull LazyListScope lazyListScope, int i10, @Nullable Function1<? super Integer, ? extends Object> function1, @NotNull Function1<? super Integer, ? extends Object> contentType, @NotNull Function4<? super LazyItemScope, ? super Integer, ? super Composer, ? super Integer, Unit> itemContent) {
            Intrinsics.checkNotNullParameter(contentType, "contentType");
            Intrinsics.checkNotNullParameter(itemContent, "itemContent");
            a.c(lazyListScope, i10, function1, contentType, itemContent);
        }

        @Deprecated(level = DeprecationLevel.HIDDEN, message = "Use the non deprecated overload")
        @Deprecated
        public static /* synthetic */ void item(LazyListScope lazyListScope, Object obj, Function3 content) {
            Intrinsics.checkNotNullParameter(content, "content");
            a.b(lazyListScope, obj, content);
        }

        @Deprecated(level = DeprecationLevel.HIDDEN, message = "Use the non deprecated overload")
        @Deprecated
        public static /* synthetic */ void items(LazyListScope lazyListScope, int i10, Function1 function1, Function4 itemContent) {
            Intrinsics.checkNotNullParameter(itemContent, "itemContent");
            a.d(lazyListScope, i10, function1, itemContent);
        }
    }

    void item(@Nullable Object key, @Nullable Object contentType, @NotNull Function3<? super LazyItemScope, ? super Composer, ? super Integer, Unit> content);

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Use the non deprecated overload")
    /* synthetic */ void item(Object key, Function3 content);

    void items(int count, @Nullable Function1<? super Integer, ? extends Object> key, @NotNull Function1<? super Integer, ? extends Object> contentType, @NotNull Function4<? super LazyItemScope, ? super Integer, ? super Composer, ? super Integer, Unit> itemContent);

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Use the non deprecated overload")
    /* synthetic */ void items(int count, Function1 key, Function4 itemContent);

    @ExperimentalFoundationApi
    void stickyHeader(@Nullable Object key, @Nullable Object contentType, @NotNull Function3<? super LazyItemScope, ? super Composer, ? super Integer, Unit> content);
}
