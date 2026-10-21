package kotlin.random;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: PlatformRandom.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0005\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\b"}, d2 = {"Lkotlin/random/FallbackThreadLocalRandom;", "Lkotlin/random/AbstractPlatformRandom;", "Ljava/util/Random;", "getImpl", "()Ljava/util/Random;", "impl", "<init>", "()V", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0})
public final class FallbackThreadLocalRandom extends AbstractPlatformRandom {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    @NotNull
    public final FallbackThreadLocalRandom$implStorage$1 f79766q0 = new ThreadLocal<java.util.Random>() { // from class: kotlin.random.FallbackThreadLocalRandom$implStorage$1
        @Override // java.lang.ThreadLocal
        @NotNull
        public java.util.Random initialValue() {
            return new java.util.Random();
        }
    };

    @Override // kotlin.random.AbstractPlatformRandom
    @NotNull
    public java.util.Random getImpl() {
        java.util.Random random = get();
        Intrinsics.checkNotNullExpressionValue(random, "get(...)");
        return random;
    }
}
