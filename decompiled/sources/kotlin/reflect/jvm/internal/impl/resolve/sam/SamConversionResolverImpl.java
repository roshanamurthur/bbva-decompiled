package kotlin.reflect.jvm.internal.impl.resolve.sam;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.storage.CacheWithNullableValues;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: SamConversionResolverImpl.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class SamConversionResolverImpl implements SamConversionResolver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Iterable<Object> f81569a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final CacheWithNullableValues<ClassDescriptor, SimpleType> f81570b;

    public SamConversionResolverImpl(@NotNull StorageManager storageManager, @NotNull Iterable<? extends Object> samWithReceiverResolvers) {
        Intrinsics.checkNotNullParameter(storageManager, "storageManager");
        Intrinsics.checkNotNullParameter(samWithReceiverResolvers, "samWithReceiverResolvers");
        this.f81569a = samWithReceiverResolvers;
        this.f81570b = storageManager.createCacheWithNullableValues();
    }
}
