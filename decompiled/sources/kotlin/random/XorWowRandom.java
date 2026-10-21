package kotlin.random;

import com.bbva.ethermobilesdk.tokencompat.storage.local.SharedPrefsStorage;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: XorWowRandom.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0011\b\u0000\u0018\u0000 \u00132\u00020\u00012\u00060\u0002j\u0002`\u0003:\u0001\u0014B9\b\u0000\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\u0004\u0012\u0006\u0010\f\u001a\u00020\u0004\u0012\u0006\u0010\r\u001a\u00020\u0004¢\u0006\u0004\b\u000e\u0010\u000fB\u0019\b\u0010\u0012\u0006\u0010\u0010\u001a\u00020\u0004\u0012\u0006\u0010\u0011\u001a\u00020\u0004¢\u0006\u0004\b\u000e\u0010\u0012J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0016¨\u0006\u0015"}, d2 = {"Lkotlin/random/XorWowRandom;", "Lkotlin/random/Random;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "", "nextInt", "bitCount", "nextBits", "x", "y", "z", "w", SharedPrefsStorage.VERSION_KEY, "addend", "<init>", "(IIIIII)V", "seed1", "seed2", "(II)V", "w0", "a", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nXorWowRandom.kt\nKotlin\n*S Kotlin\n*F\n+ 1 XorWowRandom.kt\nkotlin/random/XorWowRandom\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,60:1\n1#2:61\n*E\n"})
public final class XorWowRandom extends Random implements Serializable {

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    @NotNull
    private static final a f79769w0 = new a(null);

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public int f79770q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public int f79771r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public int f79772s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public int f79773t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public int f79774u0;
    public int v0;

    /* JADX INFO: compiled from: XorWowRandom.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lkotlin/random/XorWowRandom$a;", "", "", "serialVersionUID", "J", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0})
    public static final class a {
        public a(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public XorWowRandom(int i10, int i11, int i12, int i13, int i14, int i15) {
        this.f79770q0 = i10;
        this.f79771r0 = i11;
        this.f79772s0 = i12;
        this.f79773t0 = i13;
        this.f79774u0 = i14;
        this.v0 = i15;
        if ((i10 | i11 | i12 | i13 | i14) == 0) {
            throw new IllegalArgumentException("Initial state must have at least one non-zero element.".toString());
        }
        for (int i16 = 0; i16 < 64; i16++) {
            nextInt();
        }
    }

    @Override // kotlin.random.Random
    public int nextBits(int bitCount) {
        return RandomKt.takeUpperBits(nextInt(), bitCount);
    }

    @Override // kotlin.random.Random
    public int nextInt() {
        int i10 = this.f79770q0;
        int i11 = i10 ^ (i10 >>> 2);
        this.f79770q0 = this.f79771r0;
        this.f79771r0 = this.f79772s0;
        this.f79772s0 = this.f79773t0;
        int i12 = this.f79774u0;
        this.f79773t0 = i12;
        int i13 = ((i11 ^ (i11 << 1)) ^ i12) ^ (i12 << 4);
        this.f79774u0 = i13;
        int i14 = this.v0 + 362437;
        this.v0 = i14;
        return i13 + i14;
    }

    public XorWowRandom(int i10, int i11) {
        this(i10, i11, 0, 0, ~i10, (i10 << 10) ^ (i11 >>> 4));
    }
}
