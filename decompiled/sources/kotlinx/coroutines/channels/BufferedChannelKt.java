package kotlinx.coroutines.channels;

import androidx.exifinterface.media.ExifInterface;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmField;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.reflect.KFunction;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.internal.Symbol;
import kotlinx.coroutines.internal.SystemPropsKt__SystemProps_commonKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: BufferedChannel.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000N\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0014\u001a,\u0010\u0004\u001a \u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0001\"\u0004\b\u0000\u0010\u0000H\u0000\u001a*\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0005\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0002\u001aN\u0010\u0013\u001a\u00020\u0012\"\u0004\b\u0000\u0010\b*\b\u0012\u0004\u0012\u00028\u00000\t2\u0006\u0010\n\u001a\u00028\u00002%\b\u0002\u0010\u0011\u001a\u001f\u0012\u0013\u0012\u00110\f¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000bH\u0002¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0015H\u0002\u001a\u0018\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u0015H\u0002\u001a\u0018\u0010\u001c\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u0012H\u0002\"\u001c\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001d0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f\"\u0014\u0010 \u001a\u00020\u00158\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b \u0010!\"\u0014\u0010\"\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010!\"\u0014\u0010$\u001a\u00020#8\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b$\u0010%\"\u0014\u0010&\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010%\"\u0014\u0010'\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010%\"\u0014\u0010(\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010%\"\u0014\u0010)\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010%\"\u0014\u0010*\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010%\"\u0014\u0010+\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010%\"\u0014\u0010,\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010%\"\u001a\u0010-\u001a\u00020#8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b-\u0010%\u001a\u0004\b.\u0010/\"\u0014\u00100\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u0010%\"\u0014\u00101\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u0010%\"\u0014\u00102\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u0010%\"\u0014\u00103\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u0010%\"\u0014\u00104\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u0010%\"\u0014\u00105\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u0010%\"\u0014\u00106\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u0010%¨\u00067"}, d2 = {ExifInterface.LONGITUDE_EAST, "Lkotlin/reflect/KFunction2;", "", "Lkotlinx/coroutines/channels/ChannelSegment;", "createSegmentFunction", "id", "prev", "createSegment", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlinx/coroutines/CancellableContinuation;", "value", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "cause", "", "onCancellation", "", "tryResume0", "(Lkotlinx/coroutines/CancellableContinuation;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Z", "", "capacity", "initialBufferEnd", "counter", "closeStatus", "constructSendersAndCloseStatus", "pauseEB", "constructEBCompletedAndPauseFlag", "", "NULL_SEGMENT", "Lkotlinx/coroutines/channels/ChannelSegment;", "SEGMENT_SIZE", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "EXPAND_BUFFER_COMPLETION_WAIT_ITERATIONS", "Lkotlinx/coroutines/internal/Symbol;", "BUFFERED", "Lkotlinx/coroutines/internal/Symbol;", "IN_BUFFER", "RESUMING_BY_RCV", "RESUMING_BY_EB", "POISONED", "DONE_RCV", "INTERRUPTED_SEND", "INTERRUPTED_RCV", "CHANNEL_CLOSED", "getCHANNEL_CLOSED", "()Lkotlinx/coroutines/internal/Symbol;", "SUSPEND", "SUSPEND_NO_WAITER", "FAILED", "NO_RECEIVE_RESULT", "CLOSE_HANDLER_CLOSED", "CLOSE_HANDLER_INVOKED", "NO_CLOSE_CAUSE", "kotlinx-coroutines-core"}, k = 2, mv = {1, 8, 0})
public final class BufferedChannelKt {

    @NotNull
    private static final ChannelSegment<Object> NULL_SEGMENT = new ChannelSegment<>(-1, null, null, 0);

    @JvmField
    public static final int SEGMENT_SIZE = SystemPropsKt__SystemProps_commonKt.systemProp$default("kotlinx.coroutines.bufferedChannel.segmentSize", 32, 0, 0, 12, (Object) null);
    private static final int EXPAND_BUFFER_COMPLETION_WAIT_ITERATIONS = SystemPropsKt__SystemProps_commonKt.systemProp$default("kotlinx.coroutines.bufferedChannel.expandBufferCompletionWaitIterations", 10000, 0, 0, 12, (Object) null);

    @JvmField
    @NotNull
    public static final Symbol BUFFERED = new Symbol("BUFFERED");

    @NotNull
    private static final Symbol IN_BUFFER = new Symbol("SHOULD_BUFFER");

    @NotNull
    private static final Symbol RESUMING_BY_RCV = new Symbol("S_RESUMING_BY_RCV");

    @NotNull
    private static final Symbol RESUMING_BY_EB = new Symbol("RESUMING_BY_EB");

    @NotNull
    private static final Symbol POISONED = new Symbol("POISONED");

    @NotNull
    private static final Symbol DONE_RCV = new Symbol("DONE_RCV");

    @NotNull
    private static final Symbol INTERRUPTED_SEND = new Symbol("INTERRUPTED_SEND");

    @NotNull
    private static final Symbol INTERRUPTED_RCV = new Symbol("INTERRUPTED_RCV");

    @NotNull
    private static final Symbol CHANNEL_CLOSED = new Symbol("CHANNEL_CLOSED");

    @NotNull
    private static final Symbol SUSPEND = new Symbol("SUSPEND");

    @NotNull
    private static final Symbol SUSPEND_NO_WAITER = new Symbol("SUSPEND_NO_WAITER");

    @NotNull
    private static final Symbol FAILED = new Symbol("FAILED");

    @NotNull
    private static final Symbol NO_RECEIVE_RESULT = new Symbol("NO_RECEIVE_RESULT");

    @NotNull
    private static final Symbol CLOSE_HANDLER_CLOSED = new Symbol("CLOSE_HANDLER_CLOSED");

    @NotNull
    private static final Symbol CLOSE_HANDLER_INVOKED = new Symbol("CLOSE_HANDLER_INVOKED");

    @NotNull
    private static final Symbol NO_CLOSE_CAUSE = new Symbol("NO_CLOSE_CAUSE");

    /* JADX INFO: Add missing generic type declarations: [E] */
    /* JADX INFO: renamed from: kotlinx.coroutines.channels.BufferedChannelKt$createSegmentFunction$1, reason: invalid class name */
    /* JADX INFO: compiled from: BufferedChannel.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class AnonymousClass1<E> extends FunctionReferenceImpl implements Function2<Long, ChannelSegment<E>, ChannelSegment<E>> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(2, BufferedChannelKt.class, "createSegment", "createSegment(JLkotlinx/coroutines/channels/ChannelSegment;)Lkotlinx/coroutines/channels/ChannelSegment;", 1);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Long l6, Object obj) {
            return invoke(l6.longValue(), (ChannelSegment) obj);
        }

        @NotNull
        public final ChannelSegment<E> invoke(long j10, @NotNull ChannelSegment<E> channelSegment) {
            return BufferedChannelKt.createSegment(j10, channelSegment);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long constructEBCompletedAndPauseFlag(long j10, boolean z10) {
        return (z10 ? 4611686018427387904L : 0L) + j10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long constructSendersAndCloseStatus(long j10, int i10) {
        return (((long) i10) << 60) + j10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <E> ChannelSegment<E> createSegment(long j10, ChannelSegment<E> channelSegment) {
        return new ChannelSegment<>(j10, channelSegment, channelSegment.getChannel(), 0);
    }

    @NotNull
    public static final <E> KFunction<ChannelSegment<E>> createSegmentFunction() {
        return AnonymousClass1.INSTANCE;
    }

    @NotNull
    public static final Symbol getCHANNEL_CLOSED() {
        return CHANNEL_CLOSED;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long initialBufferEnd(int i10) {
        if (i10 == 0) {
            return 0L;
        }
        if (i10 != Integer.MAX_VALUE) {
            return i10;
        }
        return Long.MAX_VALUE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> boolean tryResume0(CancellableContinuation<? super T> cancellableContinuation, T t10, Function1<? super Throwable, Unit> function1) {
        Object objTryResume = cancellableContinuation.tryResume(t10, null, function1);
        if (objTryResume == null) {
            return false;
        }
        cancellableContinuation.completeResume(objTryResume);
        return true;
    }

    public static /* synthetic */ boolean tryResume0$default(CancellableContinuation cancellableContinuation, Object obj, Function1 function1, int i10, Object obj2) {
        if ((i10 & 2) != 0) {
            function1 = null;
        }
        return tryResume0(cancellableContinuation, obj, function1);
    }
}
