package kotlin.reflect.jvm.internal.impl.load.java;

import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.FqNamesUtilKt;
import kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager;
import kotlin.reflect.jvm.internal.impl.storage.MemoizedFunctionToNullable;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: JavaNullabilityAnnotationSettings.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class NullabilityAnnotationStatesImpl<T> implements NullabilityAnnotationStates<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Map<FqName, T> f80544a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final MemoizedFunctionToNullable<FqName, T> f80545b;

    /* JADX INFO: compiled from: JavaNullabilityAnnotationSettings.kt */
    public static final class a extends Lambda implements Function1<FqName, T> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ NullabilityAnnotationStatesImpl<T> f80546p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(NullabilityAnnotationStatesImpl<T> nullabilityAnnotationStatesImpl) {
            super(1);
            this.f80546p0 = nullabilityAnnotationStatesImpl;
        }

        @Override // kotlin.jvm.functions.Function1
        @Nullable
        public final T invoke(FqName fqName) {
            Intrinsics.checkNotNull(fqName);
            return (T) FqNamesUtilKt.findValueForMostSpecificFqname(fqName, this.f80546p0.getStates());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public NullabilityAnnotationStatesImpl(@NotNull Map<FqName, ? extends T> states) {
        Intrinsics.checkNotNullParameter(states, "states");
        this.f80544a = states;
        MemoizedFunctionToNullable<FqName, T> memoizedFunctionToNullableCreateMemoizedFunctionWithNullableValues = new LockBasedStorageManager("Java nullability annotation states").createMemoizedFunctionWithNullableValues(new a(this));
        Intrinsics.checkNotNullExpressionValue(memoizedFunctionToNullableCreateMemoizedFunctionWithNullableValues, "createMemoizedFunctionWithNullableValues(...)");
        this.f80545b = memoizedFunctionToNullableCreateMemoizedFunctionWithNullableValues;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.NullabilityAnnotationStates
    @Nullable
    public T get(@NotNull FqName fqName) {
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        return this.f80545b.invoke(fqName);
    }

    @NotNull
    public final Map<FqName, T> getStates() {
        return this.f80544a;
    }
}
