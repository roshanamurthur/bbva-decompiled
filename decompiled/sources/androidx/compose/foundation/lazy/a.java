package androidx.compose.foundation.lazy;

import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: LazyDsl.kt */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a {

    /* JADX INFO: renamed from: androidx.compose.foundation.lazy.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: LazyDsl.kt */
    public static final class C0031a extends Lambda implements Function1 {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final C0031a f4691p0 = new C0031a(1);

        @Override // kotlin.jvm.functions.Function1
        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            ((Number) obj).intValue();
            return null;
        }
    }

    /* JADX INFO: compiled from: LazyDsl.kt */
    public static final class b extends Lambda implements Function1<Integer, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final b f4692p0 = new b(1);

        @Override // kotlin.jvm.functions.Function1
        public final /* bridge */ /* synthetic */ Object invoke(Integer num) {
            num.intValue();
            return null;
        }
    }

    public static void a(LazyListScope lazyListScope, @Nullable Object obj, @Nullable Object obj2, @NotNull Function3 content) {
        Intrinsics.checkNotNullParameter(content, "content");
        throw new IllegalStateException("The method is not implemented".toString());
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Use the non deprecated overload")
    public static /* synthetic */ void b(LazyListScope lazyListScope, Object obj, Function3 content) {
        Intrinsics.checkNotNullParameter(content, "content");
        lazyListScope.item(obj, null, content);
    }

    public static void c(LazyListScope lazyListScope, int i10, @Nullable Function1 function1, @NotNull Function1 contentType, @NotNull Function4 itemContent) {
        Intrinsics.checkNotNullParameter(contentType, "contentType");
        Intrinsics.checkNotNullParameter(itemContent, "itemContent");
        throw new IllegalStateException("The method is not implemented".toString());
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Use the non deprecated overload")
    public static /* synthetic */ void d(LazyListScope lazyListScope, int i10, Function1 function1, Function4 itemContent) {
        Intrinsics.checkNotNullParameter(itemContent, "itemContent");
        lazyListScope.items(i10, function1, b.f4692p0, itemContent);
    }

    public static /* synthetic */ void i(LazyListScope lazyListScope, Object obj, Object obj2, Function3 function3, int i10, Object obj3) {
        if (obj3 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: item");
        }
        if ((i10 & 1) != 0) {
            obj = null;
        }
        if ((i10 & 2) != 0) {
            obj2 = null;
        }
        lazyListScope.item(obj, obj2, function3);
    }

    public static /* synthetic */ void j(LazyListScope lazyListScope, Object obj, Function3 function3, int i10, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: item");
        }
        if ((i10 & 1) != 0) {
            obj = null;
        }
        lazyListScope.item(obj, function3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void k(LazyListScope lazyListScope, int i10, Function1 function1, Function1 function2, Function4 function4, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: items");
        }
        if ((i11 & 2) != 0) {
            function1 = null;
        }
        if ((i11 & 4) != 0) {
            function2 = C0031a.f4691p0;
        }
        lazyListScope.items(i10, function1, function2, function4);
    }

    public static /* synthetic */ void l(LazyListScope lazyListScope, int i10, Function1 function1, Function4 function4, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: items");
        }
        if ((i11 & 2) != 0) {
            function1 = null;
        }
        lazyListScope.items(i10, function1, function4);
    }

    public static /* synthetic */ void m(LazyListScope lazyListScope, Object obj, Object obj2, Function3 function3, int i10, Object obj3) {
        if (obj3 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: stickyHeader");
        }
        if ((i10 & 1) != 0) {
            obj = null;
        }
        if ((i10 & 2) != 0) {
            obj2 = null;
        }
        lazyListScope.stickyHeader(obj, obj2, function3);
    }
}
