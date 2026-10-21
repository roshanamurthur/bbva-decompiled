package com.mypinpad.tsdk.isolation;

import androidx.constraintlayout.core.motion.utils.TypedValues;
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
public final class wy extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public static int f61696u0 = 0;
    public static int v0 = 1;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public int f61697p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ valueOf f61698q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ gz f61699r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final /* synthetic */ me f61700s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final /* synthetic */ getValue f61701t0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wy(valueOf valueof, gz gzVar, me meVar, getValue getvalue, Continuation<? super wy> continuation) {
        super(2, continuation);
        this.f61698q0 = valueof;
        this.f61699r0 = gzVar;
        this.f61700s0 = meVar;
        this.f61701t0 = getvalue;
    }

    public static /* synthetic */ Object a(Object[] objArr, int i10, int i11, int i12) {
        int i13 = (((~(i10 | (~i12))) | (~i11)) * 305) + (((~(i10 | i11)) | (~(i10 | i12))) * 305) + (i11 * 306) + (i10 * 306) + TypedValues.MotionType.TYPE_QUANTIZE_MOTIONSTEPS;
        if (i13 == 1) {
            wy wyVar = (wy) objArr[0];
            Object obj = objArr[1];
            int i14 = v0;
            int i15 = i14 & 33;
            int i16 = i15 + ((33 ^ i14) | i15);
            f61696u0 = i16 % 128;
            if (i16 % 2 != 0) {
                a.getCOROUTINE_SUSPENDED();
                int i17 = wyVar.f61697p0;
                throw null;
            }
            Object coroutine_suspended = a.getCOROUTINE_SUSPENDED();
            int i18 = wyVar.f61697p0;
            if (i18 == 0) {
                ResultKt.throwOnFailure(obj);
                valueOf valueof = wyVar.f61698q0;
                writeObject layoutAnimation = valueOf.setLayoutAnimation(valueof);
                Intrinsics.checkNotNull(layoutAnimation);
                setAccessibilityPaneTitle setaccessibilitypanetitle = (setAccessibilityPaneTitle) valueOf.setOnFocusChangeListener(new Object[]{valueof}, 1137740596, -1137740561, System.identityHashCode(valueof));
                Intrinsics.checkNotNull(setaccessibilitypanetitle);
                setMaxLines setmaxlines = setMaxLines.setX;
                wyVar.f61697p0 = 1;
                if (writeObject.setY(new Object[]{layoutAnimation, setaccessibilitypanetitle, setmaxlines, wyVar.f61699r0, wyVar.f61700s0, wyVar.f61701t0, wyVar}, -1852746218, 1852746219, System.identityHashCode(layoutAnimation)) == coroutine_suspended) {
                    int i19 = f61696u0;
                    int i20 = (i19 & (-96)) | ((~i19) & 95);
                    int i21 = -(-((i19 & 95) << 1));
                    int i22 = ((i20 | i21) << 1) - (i20 ^ i21);
                    v0 = i22 % 128;
                    if (i22 % 2 == 0) {
                        throw null;
                    }
                    int i23 = ((i19 | 77) << 1) - (i19 ^ 77);
                    v0 = i23 % 128;
                    int i24 = i23 % 2;
                    return coroutine_suspended;
                }
            } else {
                if (i18 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                int i25 = v0 + 41;
                f61696u0 = i25 % 128;
                int i26 = i25 % 2;
            }
            Unit unit = Unit.INSTANCE;
            int i27 = v0;
            int i28 = (i27 | 3) << 1;
            int i29 = -(((~i27) & 3) | (i27 & (-4)));
            int i30 = (i28 ^ i29) + ((i29 & i28) << 1);
            f61696u0 = i30 % 128;
            int i31 = i30 % 2;
            return unit;
        }
        if (i13 == 2) {
            wy wyVar2 = (wy) objArr[0];
            Object obj2 = objArr[1];
            Object obj3 = objArr[2];
            int i32 = f61696u0;
            int i33 = i32 & 87;
            int i34 = ((i32 ^ 87) | i33) << 1;
            int i35 = -((i32 | 87) & (~i33));
            int i36 = ((i34 | i35) << 1) - (i35 ^ i34);
            v0 = i36 % 128;
            int i37 = i36 % 2;
            Object objA = a(new Object[]{wyVar2, (CoroutineScope) obj2, (Continuation) obj3}, -1167354502, 1167354502, System.identityHashCode(wyVar2));
            int i38 = v0;
            int i39 = (-2) - (((i38 & 76) + (i38 | 76)) ^ (-1));
            f61696u0 = i39 % 128;
            if (i39 % 2 == 0) {
                return objA;
            }
            int i40 = 22 / 0;
            return objA;
        }
        if (i13 == 3) {
            wy wyVar3 = (wy) objArr[0];
            Object obj4 = objArr[1];
            wy wyVar4 = new wy(wyVar3.f61698q0, wyVar3.f61699r0, wyVar3.f61700s0, wyVar3.f61701t0, (Continuation) objArr[2]);
            int i41 = v0;
            int i42 = i41 & 115;
            int i43 = (i41 | 115) & (~i42);
            int i44 = i42 << 1;
            int i45 = (i43 & i44) + (i43 | i44);
            f61696u0 = i45 % 128;
            int i46 = i45 % 2;
            return wyVar4;
        }
        wy wyVar5 = (wy) objArr[0];
        CoroutineScope coroutineScope = (CoroutineScope) objArr[1];
        Continuation continuation = (Continuation) objArr[2];
        int i47 = v0 + 103;
        f61696u0 = i47 % 128;
        if (i47 % 2 != 0) {
            wy wyVar6 = (wy) ((Continuation) a(new Object[]{wyVar5, coroutineScope, continuation}, -693074436, 693074439, System.identityHashCode(wyVar5)));
            a(new Object[]{wyVar6, Unit.INSTANCE}, -1062811324, 1062811325, System.identityHashCode(wyVar6));
            throw null;
        }
        wy wyVar7 = (wy) ((Continuation) a(new Object[]{wyVar5, coroutineScope, continuation}, -693074436, 693074439, System.identityHashCode(wyVar5)));
        Object objA2 = a(new Object[]{wyVar7, Unit.INSTANCE}, -1062811324, 1062811325, System.identityHashCode(wyVar7));
        int i48 = f61696u0;
        int i49 = (((i48 & (-4)) | ((~i48) & 3)) - (~(-(-((i48 & 3) << 1))))) - 1;
        v0 = i49 % 128;
        if (i49 % 2 != 0) {
            return objA2;
        }
        int i50 = 33 / 0;
        return objA2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return (Continuation) a(new Object[]{this, obj, continuation}, -693074436, 693074439, System.identityHashCode(this));
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return a(new Object[]{this, coroutineScope, continuation}, 852668954, -852668952, System.identityHashCode(this));
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        return a(new Object[]{this, obj}, -1062811324, 1062811325, System.identityHashCode(this));
    }
}
