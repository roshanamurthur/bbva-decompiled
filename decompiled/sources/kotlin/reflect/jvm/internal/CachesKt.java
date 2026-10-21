package kotlin.reflect.jvm.internal;

import androidx.exifinterface.media.ExifInterface;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KAnnotatedElement;
import kotlin.reflect.KDeclarationContainer;
import kotlin.reflect.KType;
import kotlin.reflect.KTypeProjection;
import kotlin.reflect.full.KClassifiers;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: caches.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a&\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\b\b\u0000\u0010\u0001*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0000\u001a \u0010\u0007\u001a\u00020\u0006\"\b\b\u0000\u0010\u0001*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0000\u001a\b\u0010\t\u001a\u00020\bH\u0000\u001a6\u0010\u0010\u001a\u00020\u000f\"\b\b\u0000\u0010\u0001*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u000e\u001a\u00020\rH\u0000*0\b\u0002\u0010\u0012\"\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0004\u0012\u00020\r0\u00112\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0004\u0012\u00020\r0\u0011¨\u0006\u0013"}, d2 = {"", ExifInterface.GPS_DIRECTION_TRUE, "Ljava/lang/Class;", "jClass", "Lkotlin/reflect/jvm/internal/KClassImpl;", "getOrCreateKotlinClass", "Lkotlin/reflect/KDeclarationContainer;", "getOrCreateKotlinPackage", "", "clearCaches", "", "Lkotlin/reflect/KTypeProjection;", "arguments", "", "isMarkedNullable", "Lkotlin/reflect/KType;", "getOrCreateKType", "Lkotlin/Pair;", "Key", "kotlin-reflection"}, k = 2, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\ncaches.kt\nKotlin\n*S Kotlin\n*F\n+ 1 caches.kt\nkotlin/reflect/jvm/internal/CachesKt\n+ 2 MapsJVM.kt\nkotlin/collections/MapsKt__MapsJVMKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,74:1\n72#2,2:75\n1#3:77\n*S KotlinDebug\n*F\n+ 1 caches.kt\nkotlin/reflect/jvm/internal/CachesKt\n*L\n68#1:75,2\n68#1:77\n*E\n"})
public final class CachesKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final CacheByClass<KClassImpl<? extends Object>> f79846a = CacheByClassKt.createCache(d.f79854p0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final CacheByClass<KPackageImpl> f79847b = CacheByClassKt.createCache(e.f79855p0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final CacheByClass<KType> f79848c = CacheByClassKt.createCache(a.f79851p0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final CacheByClass<KType> f79849d = CacheByClassKt.createCache(c.f79853p0);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final CacheByClass<ConcurrentHashMap<Pair<List<KTypeProjection>, Boolean>, KType>> f79850e = CacheByClassKt.createCache(b.f79852p0);

    /* JADX INFO: compiled from: caches.kt */
    public static final class a extends Lambda implements Function1<Class<?>, KType> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final a f79851p0 = new a(1);

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        public final KType invoke(@NotNull Class<?> it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return KClassifiers.createType(CachesKt.getOrCreateKotlinClass(it), CollectionsKt__CollectionsKt.emptyList(), false, CollectionsKt__CollectionsKt.emptyList());
        }
    }

    /* JADX INFO: compiled from: caches.kt */
    public static final class b extends Lambda implements Function1<Class<?>, ConcurrentHashMap<Pair<? extends List<? extends KTypeProjection>, ? extends Boolean>, KType>> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final b f79852p0 = new b(1);

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        public final ConcurrentHashMap<Pair<List<KTypeProjection>, Boolean>, KType> invoke(@NotNull Class<?> it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return new ConcurrentHashMap<>();
        }
    }

    /* JADX INFO: compiled from: caches.kt */
    public static final class c extends Lambda implements Function1<Class<?>, KType> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final c f79853p0 = new c(1);

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        public final KType invoke(@NotNull Class<?> it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return KClassifiers.createType(CachesKt.getOrCreateKotlinClass(it), CollectionsKt__CollectionsKt.emptyList(), true, CollectionsKt__CollectionsKt.emptyList());
        }
    }

    /* JADX INFO: compiled from: caches.kt */
    public static final class d extends Lambda implements Function1<Class<?>, KClassImpl<? extends Object>> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final d f79854p0 = new d(1);

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        public final KClassImpl<? extends Object> invoke(@NotNull Class<?> it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return new KClassImpl<>(it);
        }
    }

    /* JADX INFO: compiled from: caches.kt */
    public static final class e extends Lambda implements Function1<Class<?>, KPackageImpl> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final e f79855p0 = new e(1);

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        public final KPackageImpl invoke(@NotNull Class<?> it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return new KPackageImpl(it);
        }
    }

    public static final void clearCaches() {
        f79846a.clear();
        f79847b.clear();
        f79848c.clear();
        f79849d.clear();
        f79850e.clear();
    }

    @NotNull
    public static final <T> KType getOrCreateKType(@NotNull Class<T> jClass, @NotNull List<KTypeProjection> arguments, boolean z10) {
        Intrinsics.checkNotNullParameter(jClass, "jClass");
        Intrinsics.checkNotNullParameter(arguments, "arguments");
        if (arguments.isEmpty()) {
            return z10 ? f79849d.get(jClass) : f79848c.get(jClass);
        }
        ConcurrentHashMap<Pair<List<KTypeProjection>, Boolean>, KType> concurrentHashMap = f79850e.get(jClass);
        Pair<List<KTypeProjection>, Boolean> pair = TuplesKt.to(arguments, Boolean.valueOf(z10));
        KType kType = concurrentHashMap.get(pair);
        if (kType == null) {
            KType kTypeCreateType = KClassifiers.createType(getOrCreateKotlinClass(jClass), arguments, z10, CollectionsKt__CollectionsKt.emptyList());
            KType kTypePutIfAbsent = concurrentHashMap.putIfAbsent(pair, kTypeCreateType);
            kType = kTypePutIfAbsent == null ? kTypeCreateType : kTypePutIfAbsent;
        }
        Intrinsics.checkNotNullExpressionValue(kType, "getOrPut(...)");
        return kType;
    }

    @NotNull
    public static final <T> KClassImpl<T> getOrCreateKotlinClass(@NotNull Class<T> jClass) {
        Intrinsics.checkNotNullParameter(jClass, "jClass");
        KAnnotatedElement kAnnotatedElement = f79846a.get(jClass);
        Intrinsics.checkNotNull(kAnnotatedElement, "null cannot be cast to non-null type kotlin.reflect.jvm.internal.KClassImpl<T of kotlin.reflect.jvm.internal.CachesKt.getOrCreateKotlinClass>");
        return (KClassImpl) kAnnotatedElement;
    }

    @NotNull
    public static final <T> KDeclarationContainer getOrCreateKotlinPackage(@NotNull Class<T> jClass) {
        Intrinsics.checkNotNullParameter(jClass, "jClass");
        return f79847b.get(jClass);
    }
}
