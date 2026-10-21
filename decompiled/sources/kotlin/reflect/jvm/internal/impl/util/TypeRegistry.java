package kotlin.reflect.jvm.internal.impl.util;

import java.util.Collection;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.KClass;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: ArrayMapOwner.kt */
/* JADX INFO: loaded from: classes12.dex */
public abstract class TypeRegistry<K, V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final ConcurrentHashMap<String, Integer> f82089a = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final AtomicInteger f82090b = new AtomicInteger(0);

    /* JADX INFO: compiled from: ArrayMapOwner.kt */
    public static final class a extends Lambda implements Function1<String, Integer> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ TypeRegistry<K, V> f82091p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(TypeRegistry<K, V> typeRegistry) {
            super(1);
            this.f82091p0 = typeRegistry;
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        public final Integer invoke(@NotNull String it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Integer.valueOf(this.f82091p0.f82090b.getAndIncrement());
        }
    }

    public abstract int customComputeIfAbsent(@NotNull ConcurrentHashMap<String, Integer> concurrentHashMap, @NotNull String str, @NotNull Function1<? super String, Integer> function1);

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public final <T extends V, KK extends K> NullableArrayMapAccessor<K, V, T> generateNullableAccessor(@NotNull KClass<KK> kClass) {
        Intrinsics.checkNotNullParameter(kClass, "kClass");
        return new NullableArrayMapAccessor<>(getId(kClass));
    }

    public final <T extends K> int getId(@NotNull KClass<T> kClass) {
        Intrinsics.checkNotNullParameter(kClass, "kClass");
        String qualifiedName = kClass.getQualifiedName();
        Intrinsics.checkNotNull(qualifiedName);
        return getId(qualifiedName);
    }

    @NotNull
    public final Collection<Integer> getIndices() {
        Collection<Integer> collectionValues = this.f82089a.values();
        Intrinsics.checkNotNullExpressionValue(collectionValues, "<get-values>(...)");
        return collectionValues;
    }

    public final int getId(@NotNull String keyQualifiedName) {
        Intrinsics.checkNotNullParameter(keyQualifiedName, "keyQualifiedName");
        return customComputeIfAbsent(this.f82089a, keyQualifiedName, new a(this));
    }
}
