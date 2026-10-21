package com.mypinpad.tsdk.isolation;

import ek.a;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
public final class c10 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super byte[]>, Object> {

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public static int f54759r0 = 0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public static int f54760s0 = 1;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public int f54761p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ CompletableDeferred<byte[]> f54762q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c10(CompletableDeferred<byte[]> completableDeferred, Continuation<? super c10> continuation) {
        super(2, continuation);
        this.f54762q0 = completableDeferred;
    }

    public static /* synthetic */ Object a(Object[] objArr, int i10, int i11, int i12) {
        Object objA;
        int i13 = ~i11;
        int i14 = ~i12;
        int i15 = ~(i13 | i14);
        int i16 = ~i10;
        int i17 = (((~(i10 | i12)) | (~(i13 | i12)) | (~(i16 | i14))) * 959) + ((~(i11 | i10)) * (-959)) + ((i15 | (~(i16 | i12)) | (~(i14 | i10))) * 959) + (i11 * (-958)) + (i10 * (-958));
        if (i17 == 1) {
            c10 c10Var = (c10) objArr[0];
            Object obj = objArr[1];
            c10 c10Var2 = new c10(c10Var.f54762q0, (Continuation) objArr[2]);
            int i18 = f54759r0;
            int i19 = i18 ^ 63;
            int i20 = ((i18 & 63) | i19) << 1;
            int i21 = -i19;
            int i22 = ((i20 | i21) << 1) - (i20 ^ i21);
            f54760s0 = i22 % 128;
            int i23 = i22 % 2;
            return c10Var2;
        }
        if (i17 == 2) {
            c10 c10Var3 = (c10) objArr[0];
            Object obj2 = objArr[1];
            Object obj3 = objArr[2];
            int i24 = f54759r0;
            int i25 = i24 ^ 109;
            int i26 = (((i24 & 109) | i25) << 1) - i25;
            f54760s0 = i26 % 128;
            CoroutineScope coroutineScope = (CoroutineScope) obj2;
            Continuation continuation = (Continuation) obj3;
            if (i26 % 2 != 0) {
                return a(new Object[]{c10Var3, coroutineScope, continuation}, -1534588293, 1534588296, System.identityHashCode(c10Var3));
            }
            a(new Object[]{c10Var3, coroutineScope, continuation}, -1534588293, 1534588296, System.identityHashCode(c10Var3));
            throw null;
        }
        if (i17 != 3) {
            c10 c10Var4 = (c10) objArr[0];
            objA = objArr[1];
            int i27 = (-2) - ((f54760s0 + 120) ^ (-1));
            f54759r0 = i27 % 128;
            int i28 = i27 % 2;
            Object coroutine_suspended = a.getCOROUTINE_SUSPENDED();
            int i29 = c10Var4.f54761p0;
            if (i29 == 0) {
                ResultKt.throwOnFailure(objA);
                c10Var4.f54761p0 = 1;
                objA = c10Var4.f54762q0.await(c10Var4);
                if (objA == coroutine_suspended) {
                    int i30 = f54759r0 + 25;
                    int i31 = i30 % 128;
                    f54760s0 = i31;
                    int i32 = i30 % 2;
                    int i33 = i31 & 29;
                    int i34 = ((i31 | 29) & (~i33)) + (i33 << 1);
                    f54759r0 = i34 % 128;
                    if (i34 % 2 == 0) {
                        return coroutine_suspended;
                    }
                    throw null;
                }
            } else {
                if (i29 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objA);
                int i35 = f54760s0;
                int i36 = ((i35 ^ 117) | (i35 & 117)) << 1;
                int i37 = -(((~i35) & 117) | (i35 & (-118)));
                int i38 = (i36 & i37) + (i37 | i36);
                f54759r0 = i38 % 128;
                int i39 = i38 % 2;
            }
            int i40 = f54760s0;
            int i41 = ((i40 ^ 21) | (i40 & 21)) << 1;
            int i42 = -(((~i40) & 21) | (i40 & (-22)));
            int i43 = (i41 & i42) + (i42 | i41);
            f54759r0 = i43 % 128;
            int i44 = i43 % 2;
        } else {
            c10 c10Var5 = (c10) objArr[0];
            CoroutineScope coroutineScope2 = (CoroutineScope) objArr[1];
            Continuation continuation2 = (Continuation) objArr[2];
            int i45 = f54759r0;
            int i46 = (-2) - ((((i45 | 56) << 1) - (i45 ^ 56)) ^ (-1));
            f54760s0 = i46 % 128;
            Object[] objArr2 = new Object[3];
            if (i46 % 2 == 0) {
                objArr2[0] = c10Var5;
                objArr2[1] = coroutineScope2;
                objArr2[2] = continuation2;
                c10 c10Var6 = (c10) ((Continuation) a(objArr2, 1092805773, -1092805772, System.identityHashCode(c10Var5)));
                objA = a(new Object[]{c10Var6, Unit.INSTANCE}, -1989093488, 1989093488, System.identityHashCode(c10Var6));
                int i47 = 45 / 0;
            } else {
                objArr2[0] = c10Var5;
                objArr2[1] = coroutineScope2;
                objArr2[2] = continuation2;
                c10 c10Var7 = (c10) ((Continuation) a(objArr2, 1092805773, -1092805772, System.identityHashCode(c10Var5)));
                objA = a(new Object[]{c10Var7, Unit.INSTANCE}, -1989093488, 1989093488, System.identityHashCode(c10Var7));
            }
        }
        return objA;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return (Continuation) a(new Object[]{this, obj, continuation}, 1092805773, -1092805772, System.identityHashCode(this));
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super byte[]> continuation) {
        return a(new Object[]{this, coroutineScope, continuation}, -878842838, 878842840, System.identityHashCode(this));
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        return a(new Object[]{this, obj}, -1989093488, 1989093488, System.identityHashCode(this));
    }
}
