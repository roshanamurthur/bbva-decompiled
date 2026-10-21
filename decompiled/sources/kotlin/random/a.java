package kotlin.random;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: PlatformRandom.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\b\u0002\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001cB\u000f\u0012\u0006\u0010\u0018\u001a\u00020\u0013¢\u0006\u0004\b\u0019\u0010\u001aJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016J\b\u0010\n\u001a\u00020\tH\u0016J\b\u0010\f\u001a\u00020\u000bH\u0016J\u0010\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0016J\u0010\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u0007H\u0016R\u0017\u0010\u0018\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001d"}, d2 = {"Lkotlin/random/a;", "Ljava/util/Random;", "", "nextInt", "bound", "", "nextBoolean", "", "nextLong", "", "nextFloat", "", "nextDouble", "", "bytes", "", "nextBytes", "seed", "setSeed", "Lkotlin/random/Random;", "p0", "Lkotlin/random/Random;", "getImpl", "()Lkotlin/random/Random;", "impl", "<init>", "(Lkotlin/random/Random;)V", "r0", "a", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0})
final class a extends java.util.Random {

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    @NotNull
    private static final C0436a f79775r0 = new C0436a(null);

    /* JADX INFO: renamed from: p0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Random impl;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public boolean f79777q0;

    /* JADX INFO: renamed from: kotlin.random.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: PlatformRandom.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lkotlin/random/a$a;", "", "", "serialVersionUID", "J", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0})
    public static final class C0436a {
        public C0436a(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public a(@NotNull Random impl) {
        Intrinsics.checkNotNullParameter(impl, "impl");
        this.impl = impl;
    }

    @NotNull
    public final Random getImpl() {
        return this.impl;
    }

    @Override // java.util.Random
    public final int next(int i10) {
        return this.impl.nextBits(i10);
    }

    @Override // java.util.Random
    public boolean nextBoolean() {
        return this.impl.nextBoolean();
    }

    @Override // java.util.Random
    public void nextBytes(@NotNull byte[] bytes) {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        this.impl.nextBytes(bytes);
    }

    @Override // java.util.Random
    public double nextDouble() {
        return this.impl.nextDouble();
    }

    @Override // java.util.Random
    public float nextFloat() {
        return this.impl.nextFloat();
    }

    @Override // java.util.Random
    public int nextInt() {
        return this.impl.nextInt();
    }

    @Override // java.util.Random
    public long nextLong() {
        return this.impl.nextLong();
    }

    @Override // java.util.Random
    public void setSeed(long seed) {
        if (this.f79777q0) {
            throw new UnsupportedOperationException("Setting seed is not supported.");
        }
        this.f79777q0 = true;
    }

    @Override // java.util.Random
    public int nextInt(int bound) {
        return this.impl.nextInt(bound);
    }
}
