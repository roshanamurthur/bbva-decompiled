package kotlin.random;

import androidx.collection.h;
import androidx.collection.k;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.internal.PlatformImplementationsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Random.kt */
/* JADX INFO: loaded from: classes12.dex */
@SinceKotlin(version = "1.3")
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\b'\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H&J\b\u0010\u0006\u001a\u00020\u0007H\u0016J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0016J$\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\u00042\b\b\u0002\u0010\f\u001a\u00020\u0004H\u0016J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u0004H\u0016J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016J\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\b\u0010\u0014\u001a\u00020\u0004H\u0016J\u0010\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u0004H\u0016J\u0018\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u0004H\u0016J\b\u0010\u0015\u001a\u00020\u0016H\u0016J\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0010\u001a\u00020\u0016H\u0016J\u0018\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00162\u0006\u0010\u0010\u001a\u00020\u0016H\u0016¨\u0006\u0018"}, d2 = {"Lkotlin/random/Random;", "", "()V", "nextBits", "", "bitCount", "nextBoolean", "", "nextBytes", "", "array", "fromIndex", "toIndex", "size", "nextDouble", "", "until", "from", "nextFloat", "", "nextInt", "nextLong", "", "Default", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nRandom.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Random.kt\nkotlin/random/Random\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,383:1\n1#2:384\n*E\n"})
public abstract class Random {

    /* JADX INFO: renamed from: Default, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NotNull
    public static final Random f79767p0 = PlatformImplementationsKt.IMPLEMENTATIONS.defaultPlatformRandom();

    /* JADX INFO: renamed from: kotlin.random.Random$Default, reason: from kotlin metadata */
    /* JADX INFO: compiled from: Random.kt */
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u000b\b\u0086\u0003\u0018\u00002\u00020\u00012\u00060\u0002j\u0002`\u0003:\u0001\u001eB\t\b\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\b\u0010\u0005\u001a\u00020\u0004H\u0002J\u0010\u0010\b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\t\u001a\u00020\u0006H\u0016J\u0010\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0006H\u0016J\u0018\u0010\t\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0006H\u0016J\b\u0010\r\u001a\u00020\fH\u0016J\u0010\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\fH\u0016J\u0018\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\fH\u0016J\b\u0010\u000f\u001a\u00020\u000eH\u0016J\b\u0010\u0011\u001a\u00020\u0010H\u0016J\u0010\u0010\u0011\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\u0010H\u0016J\u0018\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\u0010H\u0016J\b\u0010\u0013\u001a\u00020\u0012H\u0016J\u0010\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0014H\u0016J\u0010\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0006H\u0016J \u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u0006H\u0016R\u0014\u0010\u001a\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001f"}, d2 = {"Lkotlin/random/Random$Default;", "Lkotlin/random/Random;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "", "writeReplace", "", "bitCount", "nextBits", "nextInt", "until", "from", "", "nextLong", "", "nextBoolean", "", "nextDouble", "", "nextFloat", "", "array", "nextBytes", "size", "fromIndex", "toIndex", "defaultRandom", "Lkotlin/random/Random;", "<init>", "()V", "a", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0})
    public static final class Companion extends Random implements Serializable {

        /* JADX INFO: renamed from: kotlin.random.Random$Default$a */
        /* JADX INFO: compiled from: Random.kt */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bÂ\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002J\b\u0010\u0004\u001a\u00020\u0003H\u0002¨\u0006\u0005"}, d2 = {"Lkotlin/random/Random$Default$a;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "", "readResolve", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0})
        public static final class a implements Serializable {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            @NotNull
            public static final a f79768p0 = new a();

            private final Object readResolve() {
                return Random.INSTANCE;
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final Object writeReplace() {
            return a.f79768p0;
        }

        @Override // kotlin.random.Random
        public int nextBits(int bitCount) {
            return Random.f79767p0.nextBits(bitCount);
        }

        @Override // kotlin.random.Random
        public boolean nextBoolean() {
            return Random.f79767p0.nextBoolean();
        }

        @Override // kotlin.random.Random
        @NotNull
        public byte[] nextBytes(@NotNull byte[] array) {
            Intrinsics.checkNotNullParameter(array, "array");
            return Random.f79767p0.nextBytes(array);
        }

        @Override // kotlin.random.Random
        public double nextDouble() {
            return Random.f79767p0.nextDouble();
        }

        @Override // kotlin.random.Random
        public float nextFloat() {
            return Random.f79767p0.nextFloat();
        }

        @Override // kotlin.random.Random
        public int nextInt() {
            return Random.f79767p0.nextInt();
        }

        @Override // kotlin.random.Random
        public long nextLong() {
            return Random.f79767p0.nextLong();
        }

        public Companion() {
        }

        @Override // kotlin.random.Random
        @NotNull
        public byte[] nextBytes(int size) {
            return Random.f79767p0.nextBytes(size);
        }

        @Override // kotlin.random.Random
        public double nextDouble(double until) {
            return Random.f79767p0.nextDouble(until);
        }

        @Override // kotlin.random.Random
        public int nextInt(int until) {
            return Random.f79767p0.nextInt(until);
        }

        @Override // kotlin.random.Random
        public long nextLong(long until) {
            return Random.f79767p0.nextLong(until);
        }

        @Override // kotlin.random.Random
        @NotNull
        public byte[] nextBytes(@NotNull byte[] array, int fromIndex, int toIndex) {
            Intrinsics.checkNotNullParameter(array, "array");
            return Random.f79767p0.nextBytes(array, fromIndex, toIndex);
        }

        @Override // kotlin.random.Random
        public double nextDouble(double from, double until) {
            return Random.f79767p0.nextDouble(from, until);
        }

        @Override // kotlin.random.Random
        public int nextInt(int from, int until) {
            return Random.f79767p0.nextInt(from, until);
        }

        @Override // kotlin.random.Random
        public long nextLong(long from, long until) {
            return Random.f79767p0.nextLong(from, until);
        }
    }

    public static /* synthetic */ byte[] nextBytes$default(Random random, byte[] bArr, int i10, int i11, int i12, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: nextBytes");
        }
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = bArr.length;
        }
        return random.nextBytes(bArr, i10, i11);
    }

    public abstract int nextBits(int bitCount);

    public boolean nextBoolean() {
        return nextBits(1) != 0;
    }

    @NotNull
    public byte[] nextBytes(@NotNull byte[] array, int fromIndex, int toIndex) {
        Intrinsics.checkNotNullParameter(array, "array");
        if (!new IntRange(0, array.length).contains(fromIndex) || !new IntRange(0, array.length).contains(toIndex)) {
            throw new IllegalArgumentException(androidx.activity.a.d(h.e("fromIndex (", fromIndex, ") or toIndex (", toIndex, ") are out of range: 0.."), array.length, '.').toString());
        }
        if (fromIndex > toIndex) {
            throw new IllegalArgumentException(k.c("fromIndex (", fromIndex, ") must be not greater than toIndex (", toIndex, ").").toString());
        }
        int i10 = (toIndex - fromIndex) / 4;
        for (int i11 = 0; i11 < i10; i11++) {
            int iNextInt = nextInt();
            array[fromIndex] = (byte) iNextInt;
            array[fromIndex + 1] = (byte) (iNextInt >>> 8);
            array[fromIndex + 2] = (byte) (iNextInt >>> 16);
            array[fromIndex + 3] = (byte) (iNextInt >>> 24);
            fromIndex += 4;
        }
        int i12 = toIndex - fromIndex;
        int iNextBits = nextBits(i12 * 8);
        for (int i13 = 0; i13 < i12; i13++) {
            array[fromIndex + i13] = (byte) (iNextBits >>> (i13 * 8));
        }
        return array;
    }

    public double nextDouble() {
        return PlatformRandomKt.doubleFromParts(nextBits(26), nextBits(27));
    }

    public float nextFloat() {
        return nextBits(24) / 1.6777216E7f;
    }

    public int nextInt() {
        return nextBits(32);
    }

    public long nextLong() {
        return (((long) nextInt()) << 32) + ((long) nextInt());
    }

    public double nextDouble(double until) {
        return nextDouble(0.0d, until);
    }

    public int nextInt(int until) {
        return nextInt(0, until);
    }

    public long nextLong(long until) {
        return nextLong(0L, until);
    }

    public double nextDouble(double from, double until) {
        double dNextDouble;
        RandomKt.checkRangeBounds(from, until);
        double d2 = until - from;
        if (Double.isInfinite(d2) && !Double.isInfinite(from) && !Double.isNaN(from) && !Double.isInfinite(until) && !Double.isNaN(until)) {
            double d3 = 2;
            double dNextDouble2 = ((until / d3) - (from / d3)) * nextDouble();
            dNextDouble = from + dNextDouble2 + dNextDouble2;
        } else {
            dNextDouble = from + (nextDouble() * d2);
        }
        return dNextDouble >= until ? Math.nextAfter(until, Double.NEGATIVE_INFINITY) : dNextDouble;
    }

    public int nextInt(int from, int until) {
        int iNextInt;
        int i10;
        int iNextBits;
        RandomKt.checkRangeBounds(from, until);
        int i11 = until - from;
        if (i11 > 0 || i11 == Integer.MIN_VALUE) {
            if (((-i11) & i11) == i11) {
                iNextBits = nextBits(RandomKt.fastLog2(i11));
            } else {
                do {
                    iNextInt = nextInt() >>> 1;
                    i10 = iNextInt % i11;
                } while ((i11 - 1) + (iNextInt - i10) < 0);
                iNextBits = i10;
            }
            return from + iNextBits;
        }
        while (true) {
            int iNextInt2 = nextInt();
            if (from <= iNextInt2 && iNextInt2 < until) {
                return iNextInt2;
            }
        }
    }

    public long nextLong(long from, long until) {
        long jNextLong;
        long j10;
        long jNextBits;
        int iNextInt;
        RandomKt.checkRangeBounds(from, until);
        long j11 = until - from;
        if (j11 > 0) {
            if (((-j11) & j11) == j11) {
                int i10 = (int) j11;
                int i11 = (int) (j11 >>> 32);
                if (i10 != 0) {
                    iNextInt = nextBits(RandomKt.fastLog2(i10));
                } else if (i11 == 1) {
                    iNextInt = nextInt();
                } else {
                    jNextBits = (((long) nextBits(RandomKt.fastLog2(i11))) << 32) + (((long) nextInt()) & 4294967295L);
                }
                jNextBits = ((long) iNextInt) & 4294967295L;
            } else {
                do {
                    jNextLong = nextLong() >>> 1;
                    j10 = jNextLong % j11;
                } while ((j11 - 1) + (jNextLong - j10) < 0);
                jNextBits = j10;
            }
            return from + jNextBits;
        }
        while (true) {
            long jNextLong2 = nextLong();
            if (from <= jNextLong2 && jNextLong2 < until) {
                return jNextLong2;
            }
        }
    }

    @NotNull
    public byte[] nextBytes(@NotNull byte[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        return nextBytes(array, 0, array.length);
    }

    @NotNull
    public byte[] nextBytes(int size) {
        return nextBytes(new byte[size]);
    }
}
