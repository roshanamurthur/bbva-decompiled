package com.mypinpad.tsdk.isolation;

import ek.a;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
public final class c00 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public static int v0 = 0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public static int f54751w0 = 1;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public int f54752p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ valueOf f54753q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ gz f54754r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final /* synthetic */ me f54755s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final /* synthetic */ getValue f54756t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public final /* synthetic */ setTextColor f54757u0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c00(valueOf valueof, gz gzVar, me meVar, getValue getvalue, setTextColor settextcolor, Continuation<? super c00> continuation) {
        super(2, continuation);
        this.f54753q0 = valueof;
        this.f54754r0 = gzVar;
        this.f54755s0 = meVar;
        this.f54756t0 = getvalue;
        this.f54757u0 = settextcolor;
    }

    public static /* synthetic */ Object a(Object[] objArr, int i10, int i11, int i12) {
        int i13 = ((~(i10 | i11 | i12)) * (-301)) + (i11 * 302) + (i10 * (-300));
        int i14 = ~i11;
        int i15 = (((~((~i10) | i12)) | i14) * 301) + (((~(i14 | i12)) | (~((~i12) | i10))) * (-301)) + i13;
        if (i15 == 1) {
            c00 c00Var = (c00) objArr[0];
            Object obj = objArr[1];
            Object obj2 = objArr[2];
            int i16 = f54751w0 + 31;
            v0 = i16 % 128;
            CoroutineScope coroutineScope = (CoroutineScope) obj;
            Continuation continuation = (Continuation) obj2;
            Object[] objArr2 = new Object[3];
            if (i16 % 2 != 0) {
                objArr2[0] = c00Var;
                objArr2[1] = coroutineScope;
                objArr2[2] = continuation;
                a(objArr2, 658737230, -658737230, System.identityHashCode(c00Var));
                throw null;
            }
            objArr2[0] = c00Var;
            objArr2[1] = coroutineScope;
            objArr2[2] = continuation;
            Object objA = a(objArr2, 658737230, -658737230, System.identityHashCode(c00Var));
            int i17 = v0;
            int i18 = ((i17 & 58) + (i17 | 58)) - 1;
            f54751w0 = i18 % 128;
            if (i18 % 2 != 0) {
                return objA;
            }
            throw null;
        }
        if (i15 == 2) {
            c00 c00Var2 = (c00) objArr[0];
            Object obj3 = objArr[1];
            c00 c00Var3 = new c00(c00Var2.f54753q0, c00Var2.f54754r0, c00Var2.f54755s0, c00Var2.f54756t0, c00Var2.f54757u0, (Continuation) objArr[2]);
            int i19 = f54751w0;
            int i20 = (i19 & (-28)) | ((~i19) & 27);
            int i21 = (i19 & 27) << 1;
            int i22 = (i20 & i21) + (i21 | i20);
            v0 = i22 % 128;
            if (i22 % 2 == 0) {
                return c00Var3;
            }
            throw null;
        }
        if (i15 != 3) {
            c00 c00Var4 = (c00) objArr[0];
            CoroutineScope coroutineScope2 = (CoroutineScope) objArr[1];
            Continuation continuation2 = (Continuation) objArr[2];
            int i23 = v0;
            int i24 = (i23 & (-104)) | ((~i23) & 103);
            int i25 = -(-((i23 & 103) << 1));
            int i26 = ((i24 | i25) << 1) - (i25 ^ i24);
            f54751w0 = i26 % 128;
            int i27 = i26 % 2;
            c00 c00Var5 = (c00) ((Continuation) a(new Object[]{c00Var4, coroutineScope2, continuation2}, -1145788190, 1145788192, System.identityHashCode(c00Var4)));
            Object objA2 = a(new Object[]{c00Var5, Unit.INSTANCE}, -1348924693, 1348924696, System.identityHashCode(c00Var5));
            int i28 = v0 + 81;
            f54751w0 = i28 % 128;
            int i29 = i28 % 2;
            return objA2;
        }
        c00 c00Var6 = (c00) objArr[0];
        Object obj4 = objArr[1];
        int i30 = v0;
        int i31 = ((i30 ^ 119) | (i30 & 119)) << 1;
        int i32 = -(((~i30) & 119) | (i30 & (-120)));
        int i33 = ((i31 | i32) << 1) - (i32 ^ i31);
        f54751w0 = i33 % 128;
        if (i33 % 2 == 0) {
            a.getCOROUTINE_SUSPENDED();
            int i34 = c00Var6.f54752p0;
            throw null;
        }
        Object coroutine_suspended = a.getCOROUTINE_SUSPENDED();
        int i35 = c00Var6.f54752p0;
        if (i35 == 0) {
            ResultKt.throwOnFailure(obj4);
            valueOf valueof = c00Var6.f54753q0;
            writeObject layoutAnimation = valueOf.setLayoutAnimation(valueof);
            Intrinsics.checkNotNull(layoutAnimation);
            setAccessibilityPaneTitle setaccessibilitypanetitle = (setAccessibilityPaneTitle) valueOf.setOnFocusChangeListener(new Object[]{valueof}, 1137740596, -1137740561, System.identityHashCode(valueof));
            Intrinsics.checkNotNull(setaccessibilitypanetitle);
            setMaxLines setmaxlines = setMaxLines.setY;
            c00Var6.f54752p0 = 1;
            if (writeObject.setY(new Object[]{layoutAnimation, setaccessibilitypanetitle, setmaxlines, c00Var6.f54754r0, c00Var6.f54755s0, c00Var6.f54756t0, c00Var6.f54757u0, c00Var6}, -2063732872, 2063732879, System.identityHashCode(layoutAnimation)) == coroutine_suspended) {
                int i36 = v0 + 7;
                f54751w0 = i36 % 128;
                if (i36 % 2 == 0) {
                    int i37 = 80 / 0;
                }
                return coroutine_suspended;
            }
        } else {
            if (i35 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj4);
            int i38 = f54751w0;
            int i39 = (i38 ^ 7) + ((i38 & 7) << 1);
            v0 = i39 % 128;
            int i40 = i39 % 2;
        }
        Unit unit = Unit.INSTANCE;
        int i41 = f54751w0;
        int i42 = ((i41 ^ 84) + ((i41 & 84) << 1)) - 1;
        v0 = i42 % 128;
        if (i42 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return (Continuation) a(new Object[]{this, obj, continuation}, -1145788190, 1145788192, System.identityHashCode(this));
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return a(new Object[]{this, coroutineScope, continuation}, -1050017824, 1050017825, System.identityHashCode(this));
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        return a(new Object[]{this, obj}, -1348924693, 1348924696, System.identityHashCode(this));
    }
}
