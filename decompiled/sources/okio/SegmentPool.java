package okio;

import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: SegmentPool.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u0003\u001a\u00020\u0002H\u0007J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0002H\u0007R\u001a\u0010\f\u001a\u00020\u00078\u0006X\u0086D¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u000e\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\r\u0010\u000b¨\u0006\u0011"}, d2 = {"Lokio/SegmentPool;", "", "Lokio/Segment;", "take", "segment", "", "recycle", "", "a", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getMAX_SIZE", "()I", "MAX_SIZE", "getByteCount", "byteCount", "<init>", "()V", "okio"}, k = 1, mv = {1, 9, 0})
public final class SegmentPool {

    @NotNull
    public static final SegmentPool INSTANCE = new SegmentPool();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public static final int MAX_SIZE = 65536;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final Segment f86425b = new Segment(new byte[0], 0, 0, false, false);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f86426c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final AtomicReference<Segment>[] f86427d;

    static {
        int iHighestOneBit = Integer.highestOneBit((Runtime.getRuntime().availableProcessors() * 2) - 1);
        f86426c = iHighestOneBit;
        AtomicReference<Segment>[] atomicReferenceArr = new AtomicReference[iHighestOneBit];
        for (int i10 = 0; i10 < iHighestOneBit; i10++) {
            atomicReferenceArr[i10] = new AtomicReference<>();
        }
        f86427d = atomicReferenceArr;
    }

    public static AtomicReference a() {
        return f86427d[(int) (Thread.currentThread().getId() & (((long) f86426c) - 1))];
    }

    @JvmStatic
    public static final void recycle(@NotNull Segment segment) {
        Intrinsics.checkNotNullParameter(segment, "segment");
        if (segment.next != null || segment.prev != null) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (segment.shared) {
            return;
        }
        INSTANCE.getClass();
        AtomicReference atomicReferenceA = a();
        Segment segment2 = f86425b;
        Segment segment3 = (Segment) atomicReferenceA.getAndSet(segment2);
        if (segment3 == segment2) {
            return;
        }
        int i10 = segment3 != null ? segment3.limit : 0;
        if (i10 >= MAX_SIZE) {
            atomicReferenceA.set(segment3);
            return;
        }
        segment.next = segment3;
        segment.pos = 0;
        segment.limit = i10 + 8192;
        atomicReferenceA.set(segment);
    }

    @JvmStatic
    @NotNull
    public static final Segment take() {
        INSTANCE.getClass();
        AtomicReference atomicReferenceA = a();
        Segment segment = f86425b;
        Segment segment2 = (Segment) atomicReferenceA.getAndSet(segment);
        if (segment2 == segment) {
            return new Segment();
        }
        if (segment2 == null) {
            atomicReferenceA.set(null);
            return new Segment();
        }
        atomicReferenceA.set(segment2.next);
        segment2.next = null;
        segment2.limit = 0;
        return segment2;
    }

    public final int getByteCount() {
        Segment segment = (Segment) a().get();
        if (segment == null) {
            return 0;
        }
        return segment.limit;
    }

    public final int getMAX_SIZE() {
        return MAX_SIZE;
    }
}
