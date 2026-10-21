package com.mypinpad.tsdk.isolation;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
public final class o00 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public static int f57380s0 = 0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public static int f57381t0 = 1;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public int f57382p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ boolean f57383q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ writeObject f57384r0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00(boolean z10, writeObject writeobject, Continuation<? super o00> continuation) {
        super(2, continuation);
        this.f57383q0 = z10;
        this.f57384r0 = writeobject;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x013b  */
    /* JADX WARN: Code duplicated, block: B:40:0x014d  */
    /* JADX WARN: Code duplicated, block: B:41:0x014f  */
    /* JADX WARN: Code duplicated, block: B:42:0x0150 A[Catch: component22 -> 0x00d7, PHI: r7
      0x0150: PHI (r7v26 com.mypinpad.tsdk.i.GlobalEndpoint) = (r7v24 com.mypinpad.tsdk.i.GlobalEndpoint), (r7v30 com.mypinpad.tsdk.i.GlobalEndpoint) binds: [B:37:0x0139, B:31:0x0125] A[DONT_GENERATE, DONT_INLINE], TRY_ENTER, TRY_LEAVE, TryCatch #1 {component22 -> 0x00d7, blocks: (B:14:0x00ba, B:20:0x00e2, B:51:0x0193, B:55:0x01a6, B:56:0x01b4, B:23:0x00f3, B:28:0x0114, B:30:0x0124, B:42:0x0150, B:36:0x012b, B:57:0x01b5, B:61:0x01e1, B:64:0x01f4), top: B:86:0x00b4 }] */
    /* JADX WARN: Code duplicated, block: B:44:0x0168  */
    /* JADX WARN: Code duplicated, block: B:46:0x0178  */
    /* JADX WARN: Code duplicated, block: B:48:0x018c  */
    /* JADX WARN: Code duplicated, block: B:50:0x0192  */
    /* JADX WARN: Code duplicated, block: B:55:0x01a6 A[Catch: component22 -> 0x00d7, TRY_ENTER, TryCatch #1 {component22 -> 0x00d7, blocks: (B:14:0x00ba, B:20:0x00e2, B:51:0x0193, B:55:0x01a6, B:56:0x01b4, B:23:0x00f3, B:28:0x0114, B:30:0x0124, B:42:0x0150, B:36:0x012b, B:57:0x01b5, B:61:0x01e1, B:64:0x01f4), top: B:86:0x00b4 }] */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0204, code lost:
    
        if (com.mypinpad.tsdk.isolation.GlobalEndpoint.setCompoundDrawableTintBlendMode(new java.lang.Object[]{r7, r0}, 2037451168, -2037451160, java.lang.System.identityHashCode(r7)) == r8) goto L66;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ java.lang.Object a(java.lang.Object[] r18, int r19, int r20, int r21) {
        /*
            Method dump skipped, instruction units count: 946
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.o00.a(java.lang.Object[], int, int, int):java.lang.Object");
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return (Continuation) a(new Object[]{this, obj, continuation}, -1252369557, 1252369559, System.identityHashCode(this));
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return a(new Object[]{this, coroutineScope, continuation}, -998796531, 998796532, System.identityHashCode(this));
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        return a(new Object[]{this, obj}, 1093798729, -1093798726, System.identityHashCode(this));
    }
}
