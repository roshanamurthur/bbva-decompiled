package kotlin.collections;

import androidx.camera.core.impl.utils.b;
import androidx.collection.k;
import androidx.exifinterface.media.ExifInterface;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequenceScope;
import kotlin.sequences.SequencesKt__SequenceBuilderKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: SlidingWindow.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000*\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010(\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0018\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\u0000\u001aH\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\b0\u00070\u0006\"\u0004\b\u0000\u0010\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\b0\u00062\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH\u0000\u001aD\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\b0\u00070\u000e\"\u0004\b\u0000\u0010\b*\b\u0012\u0004\u0012\u0002H\b0\u000e2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH\u0000¨\u0006\u000f"}, d2 = {"checkWindowSizeStep", "", "size", "", "step", "windowedIterator", "", "", ExifInterface.GPS_DIRECTION_TRUE, "iterator", "partialWindows", "", "reuseBuffer", "windowedSequence", "Lkotlin/sequences/Sequence;", "kotlin-stdlib"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class SlidingWindowKt {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: compiled from: SlidingWindow.kt */
    @DebugMetadata(c = "kotlin.collections.SlidingWindowKt$windowedIterator$1", f = "SlidingWindow.kt", i = {0, 0, 0, 2, 2, 3, 3}, l = {34, 40, 49, 55, 58}, m = "invokeSuspend", n = {"$this$iterator", "buffer", "gap", "$this$iterator", "buffer", "$this$iterator", "buffer"}, s = {"L$0", "L$1", "I$0", "L$0", "L$1", "L$0", "L$1"})
    public static final class a<T> extends RestrictedSuspendLambda implements Function2<SequenceScope<? super List<? extends T>>, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public Object f79504p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public Iterator f79505q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public int f79506r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public int f79507s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public /* synthetic */ Object f79508t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final /* synthetic */ int f79509u0;
        public final /* synthetic */ int v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public final /* synthetic */ Iterator<T> f79510w0;

        /* JADX INFO: renamed from: x0, reason: collision with root package name */
        public final /* synthetic */ boolean f79511x0;

        /* JADX INFO: renamed from: y0, reason: collision with root package name */
        public final /* synthetic */ boolean f79512y0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(int i10, int i11, Iterator<? extends T> it, boolean z10, boolean z11, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f79509u0 = i10;
            this.v0 = i11;
            this.f79510w0 = it;
            this.f79511x0 = z10;
            this.f79512y0 = z11;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            a aVar = new a(this.f79509u0, this.v0, this.f79510w0, this.f79511x0, this.f79512y0, continuation);
            aVar.f79508t0 = obj;
            return aVar;
        }

        /* JADX WARN: Code duplicated, block: B:47:0x00e2  */
        /* JADX WARN: Code duplicated, block: B:54:0x0100  */
        /* JADX WARN: Code duplicated, block: B:55:0x0102  */
        /* JADX WARN: Code duplicated, block: B:58:0x0115 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:80:0x00ef A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:82:0x00fc A[SYNTHETIC] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x00a0 -> B:16:0x0054). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:57:0x0113 -> B:59:0x0116). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:70:0x0141 -> B:72:0x0144). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @org.jetbrains.annotations.Nullable
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r12) {
            /*
                Method dump skipped, instruction units count: 355
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.collections.SlidingWindowKt.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull SequenceScope<? super List<? extends T>> sequenceScope, @Nullable Continuation<? super Unit> continuation) {
            return ((a) create(sequenceScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public static final void checkWindowSizeStep(int i10, int i11) {
        if (i10 <= 0 || i11 <= 0) {
            throw new IllegalArgumentException((i10 != i11 ? k.c("Both size ", i10, " and step ", i11, " must be greater than zero.") : b.a("size ", i10, " must be greater than zero.")).toString());
        }
    }

    @NotNull
    public static final <T> Iterator<List<T>> windowedIterator(@NotNull Iterator<? extends T> iterator, int i10, int i11, boolean z10, boolean z11) {
        Intrinsics.checkNotNullParameter(iterator, "iterator");
        return !iterator.hasNext() ? EmptyIterator.INSTANCE : SequencesKt__SequenceBuilderKt.iterator(new a(i10, i11, iterator, z11, z10, null));
    }

    @NotNull
    public static final <T> Sequence<List<T>> windowedSequence(@NotNull final Sequence<? extends T> sequence, final int i10, final int i11, final boolean z10, final boolean z11) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        checkWindowSizeStep(i10, i11);
        return new Sequence<List<? extends T>>() { // from class: kotlin.collections.SlidingWindowKt$windowedSequence$$inlined$Sequence$1
            @Override // kotlin.sequences.Sequence
            @NotNull
            public Iterator<List<? extends T>> iterator() {
                return SlidingWindowKt.windowedIterator(sequence.iterator(), i10, i11, z10, z11);
            }
        };
    }
}
