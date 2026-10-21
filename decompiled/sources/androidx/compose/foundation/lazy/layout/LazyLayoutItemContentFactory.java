package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.saveable.SaveableStateHolder;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: LazyLayoutItemContentFactory.kt */
/* JADX INFO: loaded from: classes.dex */
@ExperimentalFoundationApi
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0016B\u001d\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\f0\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001J2\u0010\n\u001a\r\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0002\b\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0002\u001a\u00020\u00012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\n\u0010\u000bR\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\f0\u00078\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0017"}, d2 = {"Landroidx/compose/foundation/lazy/layout/LazyLayoutItemContentFactory;", "", "key", "getContentType", "", FirebaseAnalytics.Param.INDEX, "contentType", "Lkotlin/Function0;", "", "Landroidx/compose/runtime/Composable;", "getContent", "(ILjava/lang/Object;Ljava/lang/Object;)Lkotlin/jvm/functions/Function2;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutItemProvider;", "b", "Lkotlin/jvm/functions/Function0;", "getItemProvider", "()Lkotlin/jvm/functions/Function0;", "itemProvider", "Landroidx/compose/runtime/saveable/SaveableStateHolder;", "saveableStateHolder", "<init>", "(Landroidx/compose/runtime/saveable/SaveableStateHolder;Lkotlin/jvm/functions/Function0;)V", "a", "foundation_release"}, k = 1, mv = {1, 8, 0})
public final class LazyLayoutItemContentFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final SaveableStateHolder f4972a;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Function0<LazyLayoutItemProvider> itemProvider;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final LinkedHashMap f4974c;

    /* JADX INFO: compiled from: LazyLayoutItemContentFactory.kt */
    @SourceDebugExtension({"SMAP\nLazyLayoutItemContentFactory.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyLayoutItemContentFactory.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutItemContentFactory$CachedItemContent\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,138:1\n1#2:139\n*E\n"})
    public final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final Object f4976a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        public final Object f4977b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f4978c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @Nullable
        public Function2<? super Composer, ? super Integer, Unit> f4979d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ LazyLayoutItemContentFactory f4980e;

        public a(LazyLayoutItemContentFactory lazyLayoutItemContentFactory, @NotNull int i10, @Nullable Object key, Object obj) {
            Intrinsics.checkNotNullParameter(key, "key");
            this.f4980e = lazyLayoutItemContentFactory;
            this.f4976a = key;
            this.f4977b = obj;
            this.f4978c = i10;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public LazyLayoutItemContentFactory(@NotNull SaveableStateHolder saveableStateHolder, @NotNull Function0<? extends LazyLayoutItemProvider> itemProvider) {
        Intrinsics.checkNotNullParameter(saveableStateHolder, "saveableStateHolder");
        Intrinsics.checkNotNullParameter(itemProvider, "itemProvider");
        this.f4972a = saveableStateHolder;
        this.itemProvider = itemProvider;
        this.f4974c = new LinkedHashMap();
    }

    @NotNull
    public final Function2<Composer, Integer, Unit> getContent(int index, @NotNull Object key, @Nullable Object contentType) {
        Intrinsics.checkNotNullParameter(key, "key");
        LinkedHashMap linkedHashMap = this.f4974c;
        a aVar = (a) linkedHashMap.get(key);
        if (aVar != null && aVar.f4978c == index && Intrinsics.areEqual(aVar.f4977b, contentType)) {
            Function2 function2 = aVar.f4979d;
            if (function2 != null) {
                return function2;
            }
            ComposableLambda composableLambdaComposableLambdaInstance = ComposableLambdaKt.composableLambdaInstance(1403994769, true, new f(aVar.f4980e, aVar));
            aVar.f4979d = composableLambdaComposableLambdaInstance;
            return composableLambdaComposableLambdaInstance;
        }
        a aVar2 = new a(this, index, key, contentType);
        linkedHashMap.put(key, aVar2);
        Function2 function3 = aVar2.f4979d;
        if (function3 != null) {
            return function3;
        }
        ComposableLambda composableLambdaComposableLambdaInstance2 = ComposableLambdaKt.composableLambdaInstance(1403994769, true, new f(this, aVar2));
        aVar2.f4979d = composableLambdaComposableLambdaInstance2;
        return composableLambdaComposableLambdaInstance2;
    }

    @Nullable
    public final Object getContentType(@Nullable Object key) {
        if (key == null) {
            return null;
        }
        a aVar = (a) this.f4974c.get(key);
        if (aVar != null) {
            return aVar.f4977b;
        }
        LazyLayoutItemProvider lazyLayoutItemProviderInvoke = this.itemProvider.invoke();
        int index = lazyLayoutItemProviderInvoke.getIndex(key);
        if (index != -1) {
            return lazyLayoutItemProviderInvoke.getContentType(index);
        }
        return null;
    }

    @NotNull
    public final Function0<LazyLayoutItemProvider> getItemProvider() {
        return this.itemProvider;
    }
}
