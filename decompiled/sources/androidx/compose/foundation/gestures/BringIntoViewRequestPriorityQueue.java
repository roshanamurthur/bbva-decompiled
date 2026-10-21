package androidx.compose.foundation.gestures;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.geometry.Rect;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntRange;
import kotlinx.coroutines.CancellableContinuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: BringIntoViewRequestPriorityQueue.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0018\u0010\u0019J\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J<\u0010\u000e\u001a\u00020\f2#\u0010\r\u001a\u001f\u0012\u0015\u0012\u0013\u0018\u00010\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\f0\u0007H\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001J\u0006\u0010\u000f\u001a\u00020\fJ<\u0010\u0010\u001a\u00020\f2#\u0010\r\u001a\u001f\u0012\u0015\u0012\u0013\u0018\u00010\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\u00020\u0007H\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001J\u0010\u0010\u0013\u001a\u00020\f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011R\u0011\u0010\u0017\u001a\u00020\u00148F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u001a"}, d2 = {"Landroidx/compose/foundation/gestures/BringIntoViewRequestPriorityQueue;", "", "", "isEmpty", "Landroidx/compose/foundation/gestures/ContentInViewModifier$Request;", "request", "enqueue", "Lkotlin/Function1;", "Landroidx/compose/ui/geometry/Rect;", "Lkotlin/ParameterName;", "name", "bounds", "", "block", "forEachFromSmallest", "resumeAndRemoveAll", "resumeAndRemoveWhile", "", "cause", "cancelAndRemoveAll", "", "getSize", "()I", "size", "<init>", "()V", "foundation_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nBringIntoViewRequestPriorityQueue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BringIntoViewRequestPriorityQueue.kt\nandroidx/compose/foundation/gestures/BringIntoViewRequestPriorityQueue\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 4 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,137:1\n1182#2:138\n1161#2,2:139\n53#3:141\n523#3:142\n523#3:143\n492#3,11:144\n53#3:155\n523#3:156\n48#3:157\n664#3,2:158\n523#3:160\n13579#4,2:161\n*S KotlinDebug\n*F\n+ 1 BringIntoViewRequestPriorityQueue.kt\nandroidx/compose/foundation/gestures/BringIntoViewRequestPriorityQueue\n*L\n43#1:138\n43#1:139,2\n72#1:141\n73#1:142\n91#1:143\n107#1:144,11\n111#1:155\n112#1:156\n121#1:157\n132#1:158,2\n132#1:160\n132#1:161,2\n*E\n"})
public final class BringIntoViewRequestPriorityQueue {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final MutableVector<ContentInViewModifier.Request> f3508a = new MutableVector<>(new ContentInViewModifier.Request[16], 0);

    /* JADX INFO: compiled from: BringIntoViewRequestPriorityQueue.kt */
    public static final class a extends Lambda implements Function1<Throwable, Unit> {

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ ContentInViewModifier.Request f3510q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ContentInViewModifier.Request request) {
            super(1);
            this.f3510q0 = request;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Throwable th2) {
            BringIntoViewRequestPriorityQueue.this.f3508a.remove(this.f3510q0);
            return Unit.INSTANCE;
        }
    }

    public final void cancelAndRemoveAll(@Nullable Throwable cause) {
        MutableVector<ContentInViewModifier.Request> mutableVector = this.f3508a;
        int size = mutableVector.getSize();
        CancellableContinuation[] cancellableContinuationArr = new CancellableContinuation[size];
        for (int i10 = 0; i10 < size; i10++) {
            cancellableContinuationArr[i10] = mutableVector.getContent()[i10].getContinuation();
        }
        for (int i11 = 0; i11 < size; i11++) {
            cancellableContinuationArr[i11].cancel(cause);
        }
        if (!mutableVector.isEmpty()) {
            throw new IllegalStateException("Check failed.".toString());
        }
    }

    public final boolean enqueue(@NotNull ContentInViewModifier.Request request) {
        Intrinsics.checkNotNullParameter(request, "request");
        Rect rectInvoke = request.getCurrentBounds().invoke();
        if (rectInvoke == null) {
            CancellableContinuation<Unit> continuation = request.getContinuation();
            Result.Companion companion = Result.INSTANCE;
            continuation.resumeWith(Result.m5535constructorimpl(Unit.INSTANCE));
            return false;
        }
        request.getContinuation().invokeOnCancellation(new a(request));
        MutableVector<ContentInViewModifier.Request> mutableVector = this.f3508a;
        IntRange intRange = new IntRange(0, mutableVector.getSize() - 1);
        int first = intRange.getFirst();
        int last = intRange.getLast();
        if (first <= last) {
            while (true) {
                Rect rectInvoke2 = mutableVector.getContent()[last].getCurrentBounds().invoke();
                if (rectInvoke2 != null) {
                    Rect rectIntersect = rectInvoke.intersect(rectInvoke2);
                    if (!Intrinsics.areEqual(rectIntersect, rectInvoke)) {
                        if (!Intrinsics.areEqual(rectIntersect, rectInvoke2)) {
                            CancellationException cancellationException = new CancellationException("bringIntoView call interrupted by a newer, non-overlapping call");
                            int size = mutableVector.getSize() - 1;
                            if (size <= last) {
                                while (true) {
                                    mutableVector.getContent()[last].getContinuation().cancel(cancellationException);
                                    if (size == last) {
                                        break;
                                    }
                                    size++;
                                }
                            }
                        }
                    } else {
                        mutableVector.add(last + 1, request);
                        return true;
                    }
                }
                if (last != first) {
                    last--;
                }
            }
        }
        mutableVector.add(0, request);
        return true;
    }

    public final void forEachFromSmallest(@NotNull Function1<? super Rect, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        MutableVector mutableVector = this.f3508a;
        int size = mutableVector.getSize();
        if (size > 0) {
            int i10 = size - 1;
            Object[] content = mutableVector.getContent();
            do {
                block.invoke(((ContentInViewModifier.Request) content[i10]).getCurrentBounds().invoke());
                i10--;
            } while (i10 >= 0);
        }
    }

    public final int getSize() {
        return this.f3508a.getSize();
    }

    public final boolean isEmpty() {
        return this.f3508a.isEmpty();
    }

    public final void resumeAndRemoveAll() {
        MutableVector<ContentInViewModifier.Request> mutableVector = this.f3508a;
        IntRange intRange = new IntRange(0, mutableVector.getSize() - 1);
        int first = intRange.getFirst();
        int last = intRange.getLast();
        if (first <= last) {
            while (true) {
                mutableVector.getContent()[first].getContinuation().resumeWith(Result.m5535constructorimpl(Unit.INSTANCE));
                if (first == last) {
                    break;
                } else {
                    first++;
                }
            }
        }
        mutableVector.clear();
    }

    public final void resumeAndRemoveWhile(@NotNull Function1<? super Rect, Boolean> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        while (this.f3508a.isNotEmpty() && block.invoke(((ContentInViewModifier.Request) this.f3508a.last()).getCurrentBounds().invoke()).booleanValue()) {
            ((ContentInViewModifier.Request) this.f3508a.removeAt(this.f3508a.getSize() - 1)).getContinuation().resumeWith(Result.m5535constructorimpl(Unit.INSTANCE));
        }
    }
}
