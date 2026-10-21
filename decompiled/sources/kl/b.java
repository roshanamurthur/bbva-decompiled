package kl;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;
import kotlin.sequences.SequenceScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: SequenceBuilder.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class b<T> extends SequenceScope<T> implements Iterator<T>, Continuation<Unit>, KMappedMarker {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public int f79370p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    @Nullable
    public T f79371q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    @Nullable
    public Iterator<? extends T> f79372r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    @Nullable
    public Continuation<? super Unit> f79373s0;

    public final RuntimeException a() {
        int i10 = this.f79370p0;
        if (i10 == 4) {
            return new NoSuchElementException();
        }
        if (i10 == 5) {
            return new IllegalStateException("Iterator has failed.");
        }
        return new IllegalStateException("Unexpected state of the iterator: " + this.f79370p0);
    }

    @Override // kotlin.coroutines.Continuation
    @NotNull
    public CoroutineContext getContext() {
        return EmptyCoroutineContext.INSTANCE;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        while (true) {
            int i10 = this.f79370p0;
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 == 2 || i10 == 3) {
                        return true;
                    }
                    if (i10 == 4) {
                        return false;
                    }
                    throw a();
                }
                Iterator<? extends T> it = this.f79372r0;
                Intrinsics.checkNotNull(it);
                if (it.hasNext()) {
                    this.f79370p0 = 2;
                    return true;
                }
                this.f79372r0 = null;
            }
            this.f79370p0 = 5;
            Continuation<? super Unit> continuation = this.f79373s0;
            Intrinsics.checkNotNull(continuation);
            this.f79373s0 = null;
            Result.Companion companion = Result.INSTANCE;
            continuation.resumeWith(Result.m5535constructorimpl(Unit.INSTANCE));
        }
    }

    @Override // java.util.Iterator
    public T next() {
        int i10 = this.f79370p0;
        if (i10 == 0 || i10 == 1) {
            if (hasNext()) {
                return next();
            }
            throw new NoSuchElementException();
        }
        if (i10 == 2) {
            this.f79370p0 = 1;
            Iterator<? extends T> it = this.f79372r0;
            Intrinsics.checkNotNull(it);
            return it.next();
        }
        if (i10 != 3) {
            throw a();
        }
        this.f79370p0 = 0;
        T t10 = this.f79371q0;
        this.f79371q0 = null;
        return t10;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // kotlin.coroutines.Continuation
    public void resumeWith(@NotNull Object obj) {
        ResultKt.throwOnFailure(obj);
        this.f79370p0 = 4;
    }

    public final void setNextStep(@Nullable Continuation<? super Unit> continuation) {
        this.f79373s0 = continuation;
    }

    @Override // kotlin.sequences.SequenceScope
    @Nullable
    public Object yield(T t10, @NotNull Continuation<? super Unit> continuation) {
        this.f79371q0 = t10;
        this.f79370p0 = 3;
        this.f79373s0 = continuation;
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        if (coroutine_suspended == ek.a.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return coroutine_suspended == ek.a.getCOROUTINE_SUSPENDED() ? coroutine_suspended : Unit.INSTANCE;
    }

    @Override // kotlin.sequences.SequenceScope
    @Nullable
    public Object yieldAll(@NotNull Iterator<? extends T> it, @NotNull Continuation<? super Unit> continuation) {
        if (!it.hasNext()) {
            return Unit.INSTANCE;
        }
        this.f79372r0 = it;
        this.f79370p0 = 2;
        this.f79373s0 = continuation;
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        if (coroutine_suspended == ek.a.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return coroutine_suspended == ek.a.getCOROUTINE_SUSPENDED() ? coroutine_suspended : Unit.INSTANCE;
    }
}
