package com.mypinpad.tsdk.isolation;

import ek.a;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.Channel;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
public final class b10 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public static int f54245r0 = 0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public static int f54246s0 = 1;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public int f54247p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ xi f54248q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b10(xi xiVar, Continuation<? super b10> continuation) {
        super(2, continuation);
        this.f54248q0 = xiVar;
    }

    public static /* synthetic */ Object a(Object[] objArr, int i10, int i11, int i12) {
        int i13 = ~i10;
        int i14 = ~i11;
        int i15 = ((~(i10 | i14)) * 69) + (((~(i11 | i12)) | (~(i13 | i12)) | (~(i13 | i11))) * (-69)) + (((~(i13 | i14 | i12)) | (~(i10 | i11 | i12))) * 69) + (i11 * (-68)) + (i10 * 70);
        if (i15 == 1) {
            b10 b10Var = (b10) objArr[0];
            Object obj = objArr[1];
            b10 b10Var2 = new b10(b10Var.f54248q0, (Continuation) objArr[2]);
            int i16 = f54246s0;
            int i17 = i16 & 33;
            int i18 = (i17 - (~(-(-((i16 ^ 33) | i17))))) - 1;
            f54245r0 = i18 % 128;
            if (i18 % 2 == 0) {
                return b10Var2;
            }
            throw null;
        }
        if (i15 != 2) {
            if (i15 == 3) {
                b10 b10Var3 = (b10) objArr[0];
                Object obj2 = objArr[1];
                Object obj3 = objArr[2];
                int i19 = f54246s0 + 5;
                f54245r0 = i19 % 128;
                CoroutineScope coroutineScope = (CoroutineScope) obj2;
                Continuation continuation = (Continuation) obj3;
                if (i19 % 2 == 0) {
                    return a(new Object[]{b10Var3, coroutineScope, continuation}, 1930799237, -1930799237, System.identityHashCode(b10Var3));
                }
                a(new Object[]{b10Var3, coroutineScope, continuation}, 1930799237, -1930799237, System.identityHashCode(b10Var3));
                throw null;
            }
            b10 b10Var4 = (b10) objArr[0];
            CoroutineScope coroutineScope2 = (CoroutineScope) objArr[1];
            Continuation continuation2 = (Continuation) objArr[2];
            int i20 = f54245r0;
            int i21 = (i20 ^ 43) + ((i20 & 43) << 1);
            f54246s0 = i21 % 128;
            int i22 = i21 % 2;
            b10 b10Var5 = (b10) ((Continuation) a(new Object[]{b10Var4, coroutineScope2, continuation2}, 1933939805, -1933939804, System.identityHashCode(b10Var4)));
            Object objA = a(new Object[]{b10Var5, Unit.INSTANCE}, -937571104, 937571106, System.identityHashCode(b10Var5));
            int i23 = f54246s0;
            int i24 = i23 ^ 121;
            int i25 = (((i23 & 121) | i24) << 1) - i24;
            f54245r0 = i25 % 128;
            if (i25 % 2 == 0) {
                return objA;
            }
            throw null;
        }
        b10 b10Var6 = (b10) objArr[0];
        Object obj4 = objArr[1];
        int i26 = f54245r0;
        int i27 = i26 & 87;
        int i28 = -(-(i26 | 87));
        int i29 = (i27 ^ i28) + ((i28 & i27) << 1);
        f54246s0 = i29 % 128;
        if (i29 % 2 == 0) {
            a.getCOROUTINE_SUSPENDED();
            int i30 = b10Var6.f54247p0;
            throw null;
        }
        Object coroutine_suspended = a.getCOROUTINE_SUSPENDED();
        int i31 = b10Var6.f54247p0;
        if (i31 == 0) {
            ResultKt.throwOnFailure(obj4);
            xi xiVar = b10Var6.f54248q0;
            Channel channel = (Channel) xi.setDividerPadding(new Object[]{xiVar}, 1223832607, -1223832600, (int) System.currentTimeMillis());
            b10Var6.f54247p0 = 1;
            if (xi.setDividerPadding(new Object[]{xiVar, channel, b10Var6}, 1150949458, -1150949441, (int) System.currentTimeMillis()) == coroutine_suspended) {
                int i32 = f54245r0;
                int i33 = (i32 & 25) + (i32 | 25);
                int i34 = i33 % 128;
                f54246s0 = i34;
                if (i33 % 2 == 0) {
                    throw null;
                }
                int i35 = (i34 & 49) + (i34 | 49);
                f54245r0 = i35 % 128;
                if (i35 % 2 == 0) {
                    return coroutine_suspended;
                }
                throw null;
            }
        } else {
            if (i31 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj4);
            int i36 = f54246s0 + 105;
            f54245r0 = i36 % 128;
            int i37 = i36 % 2;
        }
        Unit unit = Unit.INSTANCE;
        int i38 = f54246s0;
        int i39 = i38 & 21;
        int i40 = ((((i38 ^ 21) | i39) << 1) - (~(-((i38 | 21) & (~i39))))) - 1;
        f54245r0 = i40 % 128;
        int i41 = i40 % 2;
        return unit;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return (Continuation) a(new Object[]{this, obj, continuation}, 1933939805, -1933939804, System.identityHashCode(this));
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return a(new Object[]{this, coroutineScope, continuation}, -2131120891, 2131120894, System.identityHashCode(this));
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        return a(new Object[]{this, obj}, -937571104, 937571106, System.identityHashCode(this));
    }
}
