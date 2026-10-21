package kotlinx.coroutines.sync;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.internal.Segment;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Semaphore.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B!\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0000\u0012\u0006\u0010\u0015\u001a\u00020\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\"\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\u000b\u001a\u00020\nH\u0016R\u0014\u0010\u000e\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0010\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u000f8\u0006¨\u0006\u0018"}, d2 = {"Lkotlinx/coroutines/sync/SemaphoreSegment;", "Lkotlinx/coroutines/internal/Segment;", "", FirebaseAnalytics.Param.INDEX, "", "cause", "Lkotlin/coroutines/CoroutineContext;", "context", "", "onCancellation", "", "toString", "getNumberOfSlots", "()I", "numberOfSlots", "Lkotlinx/atomicfu/AtomicArray;", "", "acquirers", "", "id", "prev", "pointers", "<init>", "(JLkotlinx/coroutines/sync/SemaphoreSegment;I)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nSemaphore.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Semaphore.kt\nkotlinx/coroutines/sync/SemaphoreSegment\n*L\n1#1,397:1\n371#1,2:398\n*S KotlinDebug\n*F\n+ 1 Semaphore.kt\nkotlinx/coroutines/sync/SemaphoreSegment\n*L\n384#1:398,2\n*E\n"})
final class SemaphoreSegment extends Segment<SemaphoreSegment> {

    @NotNull
    private final AtomicReferenceArray acquirers;

    public SemaphoreSegment(long j10, @Nullable SemaphoreSegment semaphoreSegment, int i10) {
        super(j10, semaphoreSegment, i10);
        this.acquirers = new AtomicReferenceArray(SemaphoreKt.SEGMENT_SIZE);
    }

    @NotNull
    public final AtomicReferenceArray getAcquirers() {
        return this.acquirers;
    }

    @Override // kotlinx.coroutines.internal.Segment
    public int getNumberOfSlots() {
        return SemaphoreKt.SEGMENT_SIZE;
    }

    @Override // kotlinx.coroutines.internal.Segment
    public void onCancellation(int index, @Nullable Throwable cause, @NotNull CoroutineContext context) {
        getAcquirers().set(index, SemaphoreKt.CANCELLED);
        onSlotCleaned();
    }

    @NotNull
    public String toString() {
        return "SemaphoreSegment[id=" + this.id + ", hashCode=" + hashCode() + AbstractJsonLexerKt.END_LIST;
    }
}
