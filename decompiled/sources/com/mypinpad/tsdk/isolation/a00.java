package com.mypinpad.tsdk.isolation;

import ek.a;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.SendChannel;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
public final class a00 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public static int f51972u0 = 0;
    public static int v0 = 1;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public int f51973p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ setFastScrollEnabled.setY f51974q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ SendChannel<setSystemGestureExclusionRects> f51975r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final /* synthetic */ setSystemGestureExclusionRects f51976s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final /* synthetic */ valueOf f51977t0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public a00(setFastScrollEnabled.setY sety, SendChannel<? super setSystemGestureExclusionRects> sendChannel, setSystemGestureExclusionRects setsystemgestureexclusionrects, valueOf valueof, Continuation<? super a00> continuation) {
        super(2, continuation);
        this.f51974q0 = sety;
        this.f51975r0 = sendChannel;
        this.f51976s0 = setsystemgestureexclusionrects;
        this.f51977t0 = valueof;
    }

    public static /* synthetic */ Object a(Object[] objArr, int i10, int i11, int i12) {
        int i13 = (((~i10) | i11) * 160) + (i11 * (-159)) + (i10 * (-159));
        int i14 = ~i12;
        int i15 = ((i10 | (~((~i11) | i14))) * 160) + (((~(i14 | i10)) | (~(i10 | i11))) * (-160)) + i13;
        if (i15 == 1) {
            a00 a00Var = (a00) objArr[0];
            Object obj = objArr[1];
            a00 a00Var2 = new a00(a00Var.f51974q0, a00Var.f51975r0, a00Var.f51976s0, a00Var.f51977t0, (Continuation) objArr[2]);
            int i16 = f51972u0;
            int i17 = (((i16 & (-42)) | ((~i16) & 41)) - (~((i16 & 41) << 1))) - 1;
            v0 = i17 % 128;
            int i18 = i17 % 2;
            return a00Var2;
        }
        if (i15 == 2) {
            a00 a00Var3 = (a00) objArr[0];
            Object obj2 = objArr[1];
            Object obj3 = objArr[2];
            int i19 = (-2) - ((v0 + 92) ^ (-1));
            f51972u0 = i19 % 128;
            CoroutineScope coroutineScope = (CoroutineScope) obj2;
            Continuation continuation = (Continuation) obj3;
            Object[] objArr2 = new Object[3];
            if (i19 % 2 == 0) {
                objArr2[0] = a00Var3;
                objArr2[1] = coroutineScope;
                objArr2[2] = continuation;
                return a(objArr2, 198469114, -198469114, System.identityHashCode(a00Var3));
            }
            objArr2[0] = a00Var3;
            objArr2[1] = coroutineScope;
            objArr2[2] = continuation;
            a(objArr2, 198469114, -198469114, System.identityHashCode(a00Var3));
            throw null;
        }
        if (i15 != 3) {
            a00 a00Var4 = (a00) objArr[0];
            CoroutineScope coroutineScope2 = (CoroutineScope) objArr[1];
            Continuation continuation2 = (Continuation) objArr[2];
            int i20 = v0;
            int i21 = (i20 ^ 111) + ((i20 & 111) << 1);
            f51972u0 = i21 % 128;
            int i22 = i21 % 2;
            a00 a00Var5 = (a00) ((Continuation) a(new Object[]{a00Var4, coroutineScope2, continuation2}, 180068995, -180068994, System.identityHashCode(a00Var4)));
            Object objA = a(new Object[]{a00Var5, Unit.INSTANCE}, 1358178224, -1358178221, System.identityHashCode(a00Var5));
            int i23 = v0;
            int i24 = i23 & 111;
            int i25 = (((i23 | 111) & (~i24)) - (~(i24 << 1))) - 1;
            f51972u0 = i25 % 128;
            int i26 = i25 % 2;
            return objA;
        }
        a00 a00Var6 = (a00) objArr[0];
        Object obj4 = objArr[1];
        int i27 = v0;
        int i28 = ((i27 ^ 37) | (i27 & 37)) << 1;
        int i29 = -(((~i27) & 37) | (i27 & (-38)));
        int i30 = (i28 ^ i29) + ((i29 & i28) << 1);
        f51972u0 = i30 % 128;
        int i31 = i30 % 2;
        Object coroutine_suspended = a.getCOROUTINE_SUSPENDED();
        int i32 = a00Var6.f51973p0;
        if (i32 == 0) {
            ResultKt.throwOnFailure(obj4);
            setFastScrollEnabled.setY sety = a00Var6.f51974q0;
            if (sety != null) {
                int i33 = v0;
                int i34 = i33 & 19;
                int i35 = ((i33 ^ 19) | i34) << 1;
                int i36 = -((i33 | 19) & (~i34));
                int i37 = (i35 ^ i36) + ((i36 & i35) << 1);
                f51972u0 = i37 % 128;
                int i38 = i37 % 2;
                valueOf valueof = a00Var6.f51977t0;
                if (i38 != 0) {
                    valueOf.setZ(valueof).setOnFocusChangeListener((getRevealSystemBarToastMessage.setDividerPadding) component11.setX(new Object[]{sety}, 1539106470, -1539106470, (int) System.currentTimeMillis()));
                    throw null;
                }
                valueOf.setZ(valueof).setOnFocusChangeListener((getRevealSystemBarToastMessage.setDividerPadding) component11.setX(new Object[]{sety}, 1539106470, -1539106470, (int) System.currentTimeMillis()));
                int i39 = v0;
                int i40 = (i39 & (-126)) | ((~i39) & 125);
                int i41 = -(-((i39 & 125) << 1));
                int i42 = (i40 ^ i41) + ((i41 & i40) << 1);
                f51972u0 = i42 % 128;
                int i43 = i42 % 2;
            }
            a00Var6.f51973p0 = 1;
            if (a00Var6.f51975r0.send(a00Var6.f51976s0, a00Var6) == coroutine_suspended) {
                int i44 = f51972u0;
                int i45 = i44 ^ 113;
                int i46 = ((((i44 & 113) | i45) << 1) - (~(-i45))) - 1;
                int i47 = i46 % 128;
                v0 = i47;
                int i48 = i46 % 2;
                int i49 = (i47 & 3) + (i47 | 3);
                f51972u0 = i49 % 128;
                int i50 = i49 % 2;
                return coroutine_suspended;
            }
        } else {
            if (i32 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj4);
            int i51 = v0;
            int i52 = ((i51 & (-90)) | ((~i51) & 89)) + ((i51 & 89) << 1);
            f51972u0 = i52 % 128;
            int i53 = i52 % 2;
        }
        Unit unit = Unit.INSTANCE;
        int i54 = v0;
        int i55 = i54 & 43;
        int i56 = -(-((i54 ^ 43) | i55));
        int i57 = ((i55 | i56) << 1) - (i56 ^ i55);
        f51972u0 = i57 % 128;
        if (i57 % 2 == 0) {
            return unit;
        }
        int i58 = 88 / 0;
        return unit;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return (Continuation) a(new Object[]{this, obj, continuation}, 180068995, -180068994, System.identityHashCode(this));
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return a(new Object[]{this, coroutineScope, continuation}, -2066645561, 2066645563, System.identityHashCode(this));
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        return a(new Object[]{this, obj}, 1358178224, -1358178221, System.identityHashCode(this));
    }
}
