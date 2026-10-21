package io.reactivex.rxjava3.internal.functions;

import io.reactivex.rxjava3.functions.BiPredicate;
import java.util.Objects;

/* JADX INFO: loaded from: classes12.dex */
public final class ObjectHelper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f74003a = new a();

    public static final class a implements BiPredicate<Object, Object> {
        @Override // io.reactivex.rxjava3.functions.BiPredicate
        public final boolean test(Object obj, Object obj2) {
            return Objects.equals(obj, obj2);
        }
    }

    public ObjectHelper() {
        throw new IllegalStateException("No instances!");
    }

    public static <T> BiPredicate<T, T> equalsPredicate() {
        return f74003a;
    }

    public static int verifyPositive(int i10, String str) {
        if (i10 > 0) {
            return i10;
        }
        throw new IllegalArgumentException(str + " > 0 required but it was " + i10);
    }

    public static long verifyPositive(long j10, String str) {
        if (j10 > 0) {
            return j10;
        }
        throw new IllegalArgumentException(str + " > 0 required but it was " + j10);
    }
}
