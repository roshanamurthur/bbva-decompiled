package androidx.compose.foundation.lazy.grid;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: LazyGridDsl.kt */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b {

    /* JADX INFO: compiled from: LazyGridDsl.kt */
    public static final class a extends Lambda implements Function1 {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final a f4916p0 = new a(1);

        @Override // kotlin.jvm.functions.Function1
        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            ((Number) obj).intValue();
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void a(LazyGridScope lazyGridScope, Object obj, Function1 function1, Object obj2, Function3 function3, int i10, Object obj3) {
        if (obj3 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: item");
        }
        if ((i10 & 1) != 0) {
            obj = null;
        }
        if ((i10 & 2) != 0) {
            function1 = null;
        }
        if ((i10 & 4) != 0) {
            obj2 = null;
        }
        lazyGridScope.item(obj, function1, obj2, function3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void b(LazyGridScope lazyGridScope, int i10, Function1 function1, Function2 function2, Function1 function3, Function4 function4, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: items");
        }
        Function1 function5 = (i11 & 2) != 0 ? null : function1;
        Function2 function6 = (i11 & 4) != 0 ? null : function2;
        if ((i11 & 8) != 0) {
            function3 = a.f4916p0;
        }
        lazyGridScope.items(i10, function5, function6, function3, function4);
    }
}
