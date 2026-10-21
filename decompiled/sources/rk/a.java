package rk;

import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.CacheByClass;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: CacheByClass.kt */
/* JADX INFO: loaded from: classes12.dex */
@SourceDebugExtension({"SMAP\nCacheByClass.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CacheByClass.kt\nkotlin/reflect/jvm/internal/ConcurrentHashMapCache\n+ 2 MapsJVM.kt\nkotlin/collections/MapsKt__MapsJVMKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,98:1\n72#2,2:99\n1#3:101\n*S KotlinDebug\n*F\n+ 1 CacheByClass.kt\nkotlin/reflect/jvm/internal/ConcurrentHashMapCache\n*L\n92#1:99,2\n92#1:101\n*E\n"})
public final class a<V> extends CacheByClass<V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Function1<Class<?>, V> f93101a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final ConcurrentHashMap<Class<?>, V> f93102b;

    /* JADX WARN: Multi-variable type inference failed */
    public a(@NotNull Function1<? super Class<?>, ? extends V> compute) {
        Intrinsics.checkNotNullParameter(compute, "compute");
        this.f93101a = compute;
        this.f93102b = new ConcurrentHashMap<>();
    }

    @Override // kotlin.reflect.jvm.internal.CacheByClass
    public void clear() {
        this.f93102b.clear();
    }

    @Override // kotlin.reflect.jvm.internal.CacheByClass
    public V get(@NotNull Class<?> key) {
        Intrinsics.checkNotNullParameter(key, "key");
        ConcurrentHashMap<Class<?>, V> concurrentHashMap = this.f93102b;
        V v3 = (V) concurrentHashMap.get(key);
        if (v3 != null) {
            return v3;
        }
        V vInvoke = this.f93101a.invoke(key);
        V v6 = (V) concurrentHashMap.putIfAbsent(key, vInvoke);
        return v6 == null ? vInvoke : v6;
    }
}
