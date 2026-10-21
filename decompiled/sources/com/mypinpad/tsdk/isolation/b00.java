package com.mypinpad.tsdk.isolation;

import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.SendChannel;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
public final class b00 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public static int f54236t0 = 0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public static int f54237u0 = 1;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public int f54238p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ Pair<setSystemGestureExclusionRects, setFastScrollEnabled.setY> f54239q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ SendChannel<setSystemGestureExclusionRects> f54240r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final /* synthetic */ valueOf f54241s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public b00(Pair<? extends setSystemGestureExclusionRects, ? extends setFastScrollEnabled.setY> pair, SendChannel<? super setSystemGestureExclusionRects> sendChannel, valueOf valueof, Continuation<? super b00> continuation) {
        super(2, continuation);
        this.f54239q0 = pair;
        this.f54240r0 = sendChannel;
        this.f54241s0 = valueof;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x015c, code lost:
    
        if (r3.send(r10, r11) == r2) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0165, code lost:
    
        if (r3.send(r10, r11) == r2) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0167, code lost:
    
        r10 = com.mypinpad.tsdk.isolation.b00.f54236t0;
        r11 = (r10 & (-46)) | ((~r10) & 45);
        r10 = -(-((r10 & 45) << 1));
        r12 = ((r11 | r10) << 1) - (r10 ^ r11);
        com.mypinpad.tsdk.isolation.b00.f54237u0 = r12 % 128;
        r12 = r12 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x02b2, code lost:
    
        return r2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ java.lang.Object a(java.lang.Object[] r10, int r11, int r12, int r13) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 692
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.b00.a(java.lang.Object[], int, int, int):java.lang.Object");
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return (Continuation) a(new Object[]{this, obj, continuation}, 493161753, -493161752, System.identityHashCode(this));
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return a(new Object[]{this, coroutineScope, continuation}, -1849264352, 1849264354, System.identityHashCode(this));
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        return a(new Object[]{this, obj}, 265830695, -265830695, System.identityHashCode(this));
    }
}
