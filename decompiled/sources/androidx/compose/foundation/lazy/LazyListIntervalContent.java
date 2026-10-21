package androidx.compose.foundation.lazy;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.foundation.lazy.layout.LazyLayoutIntervalContent;
import androidx.compose.foundation.lazy.layout.MutableIntervalList;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import com.bbva.component.dm.analytics.constants.AnalyticsConstants;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: LazyListIntervalContent.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0006\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B \u0012\u0017\u0010\u0015\u001a\u0013\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000f0\u0006¢\u0006\u0002\b\u0011¢\u0006\u0004\b#\u0010$J\u0094\u0001\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u00042#\u0010\u000b\u001a\u001f\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\n\u0018\u00010\u00062#\u0010\f\u001a\u001f\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0006\u0012\u0004\u0018\u00010\n0\u000621\u0010\u0012\u001a-\u0012\u0004\u0012\u00020\u000e\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\u000f0\r¢\u0006\u0002\b\u0010¢\u0006\u0002\b\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014JA\u0010\u0016\u001a\u00020\u000f2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\f\u001a\u0004\u0018\u00010\n2\u001c\u0010\u0015\u001a\u0018\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\u0006¢\u0006\u0002\b\u0010¢\u0006\u0002\b\u0011H\u0016¢\u0006\u0004\b\u0016\u0010\u0017JA\u0010\u0018\u001a\u00020\u000f2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\f\u001a\u0004\u0018\u00010\n2\u001c\u0010\u0015\u001a\u0018\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\u0006¢\u0006\u0002\b\u0010¢\u0006\u0002\b\u0011H\u0017¢\u0006\u0004\b\u0018\u0010\u0017R \u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00020\u00198\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00040\u001f8F¢\u0006\u0006\u001a\u0004\b \u0010!¨\u0006%"}, d2 = {"Landroidx/compose/foundation/lazy/LazyListIntervalContent;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutIntervalContent;", "Landroidx/compose/foundation/lazy/LazyListInterval;", "Landroidx/compose/foundation/lazy/LazyListScope;", "", "count", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", FirebaseAnalytics.Param.INDEX, "", "key", "contentType", "Lkotlin/Function2;", "Landroidx/compose/foundation/lazy/LazyItemScope;", "", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "itemContent", FirebaseAnalytics.Param.ITEMS, "(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function4;)V", "content", AnalyticsConstants.Key.ITEM, "(Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function3;)V", "stickyHeader", "Landroidx/compose/foundation/lazy/layout/MutableIntervalList;", "a", "Landroidx/compose/foundation/lazy/layout/MutableIntervalList;", "getIntervals", "()Landroidx/compose/foundation/lazy/layout/MutableIntervalList;", "intervals", "", "getHeaderIndexes", "()Ljava/util/List;", "headerIndexes", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "foundation_release"}, k = 1, mv = {1, 8, 0})
public final class LazyListIntervalContent extends LazyLayoutIntervalContent<LazyListInterval> implements LazyListScope {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final MutableIntervalList<LazyListInterval> intervals;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public ArrayList f4566b;

    /* JADX INFO: compiled from: LazyListIntervalContent.kt */
    public static final class a extends Lambda implements Function1<Integer, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Object f4567p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Object obj) {
            super(1);
            this.f4567p0 = obj;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Integer num) {
            num.intValue();
            return this.f4567p0;
        }
    }

    /* JADX INFO: compiled from: LazyListIntervalContent.kt */
    public static final class b extends Lambda implements Function1<Integer, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Object f4568p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Object obj) {
            super(1);
            this.f4568p0 = obj;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Integer num) {
            num.intValue();
            return this.f4568p0;
        }
    }

    /* JADX INFO: compiled from: LazyListIntervalContent.kt */
    public static final class c extends Lambda implements Function4<LazyItemScope, Integer, Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Function3<LazyItemScope, Composer, Integer, Unit> f4569p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(Function3<? super LazyItemScope, ? super Composer, ? super Integer, Unit> function3) {
            super(4);
            this.f4569p0 = function3;
        }

        @Override // kotlin.jvm.functions.Function4
        public final Unit invoke(LazyItemScope lazyItemScope, Integer num, Composer composer, Integer num2) {
            LazyItemScope $receiver = lazyItemScope;
            num.intValue();
            Composer composer2 = composer;
            int iIntValue = num2.intValue();
            Intrinsics.checkNotNullParameter($receiver, "$this$$receiver");
            if ((iIntValue & 14) == 0) {
                iIntValue |= composer2.changed($receiver) ? 4 : 2;
            }
            if ((iIntValue & 651) == 130 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1010194746, iIntValue, -1, "androidx.compose.foundation.lazy.LazyListIntervalContent.item.<anonymous> (LazyListIntervalContent.kt:58)");
                }
                this.f4569p0.invoke($receiver, composer2, Integer.valueOf(iIntValue & 14));
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }

    public LazyListIntervalContent(@NotNull Function1<? super LazyListScope, Unit> content) {
        Intrinsics.checkNotNullParameter(content, "content");
        this.intervals = new MutableIntervalList<>();
        content.invoke(this);
    }

    @NotNull
    public final List<Integer> getHeaderIndexes() {
        ArrayList arrayList = this.f4566b;
        return arrayList == null ? CollectionsKt__CollectionsKt.emptyList() : arrayList;
    }

    @Override // androidx.compose.foundation.lazy.LazyListScope
    public final /* synthetic */ void item(Object obj, Function3 function3) {
        androidx.compose.foundation.lazy.a.b(this, obj, function3);
    }

    @Override // androidx.compose.foundation.lazy.LazyListScope
    public final /* synthetic */ void items(int i10, Function1 function1, Function4 function4) {
        androidx.compose.foundation.lazy.a.d(this, i10, function1, function4);
    }

    @Override // androidx.compose.foundation.lazy.LazyListScope
    @ExperimentalFoundationApi
    public void stickyHeader(@Nullable Object key, @Nullable Object contentType, @NotNull Function3<? super LazyItemScope, ? super Composer, ? super Integer, Unit> content) {
        Intrinsics.checkNotNullParameter(content, "content");
        ArrayList arrayList = this.f4566b;
        if (arrayList == null) {
            arrayList = new ArrayList();
            this.f4566b = arrayList;
        }
        arrayList.add(Integer.valueOf(getIntervals().getSize()));
        item(key, contentType, content);
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutIntervalContent
    @NotNull
    public MutableIntervalList<LazyListInterval> getIntervals() {
        return this.intervals;
    }

    @Override // androidx.compose.foundation.lazy.LazyListScope
    public void item(@Nullable Object key, @Nullable Object contentType, @NotNull Function3<? super LazyItemScope, ? super Composer, ? super Integer, Unit> content) {
        Intrinsics.checkNotNullParameter(content, "content");
        getIntervals().addInterval(1, new LazyListInterval(key != null ? new a(key) : null, new b(contentType), ComposableLambdaKt.composableLambdaInstance(-1010194746, true, new c(content))));
    }

    @Override // androidx.compose.foundation.lazy.LazyListScope
    public void items(int count, @Nullable Function1<? super Integer, ? extends Object> key, @NotNull Function1<? super Integer, ? extends Object> contentType, @NotNull Function4<? super LazyItemScope, ? super Integer, ? super Composer, ? super Integer, Unit> itemContent) {
        Intrinsics.checkNotNullParameter(contentType, "contentType");
        Intrinsics.checkNotNullParameter(itemContent, "itemContent");
        getIntervals().addInterval(count, new LazyListInterval(key, contentType, itemContent));
    }
}
