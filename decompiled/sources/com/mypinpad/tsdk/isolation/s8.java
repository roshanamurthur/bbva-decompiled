package com.mypinpad.tsdk.isolation;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
public final class s8 extends ContinuationImpl {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public setAdjustViewBounds f58202p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public getBeepOnFailure f58203q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public getBeepOnFailure f58204r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public values f58205s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public setPictureListener f58206t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public /* synthetic */ Object f58207u0;
    public final /* synthetic */ setAdjustViewBounds v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public int f58208w0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s8(setAdjustViewBounds setadjustviewbounds, Continuation<? super s8> continuation) {
        super(continuation);
        this.v0 = setadjustviewbounds;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object[] objArr = {this, obj};
        System.identityHashCode(this);
        s8 s8Var = (s8) objArr[0];
        Object obj2 = objArr[1];
        int iIdentityHashCode = System.identityHashCode(s8Var);
        int i10 = ~iIdentityHashCode;
        int i11 = 1109628455 ^ i10;
        int i12 = 1109628455 & i10;
        int i13 = ~((i11 & i12) | (i11 ^ i12));
        int i14 = 687006221 & i13;
        int i15 = (i13 | 687006221) & (~i14);
        int i16 = ((i15 & i14) | (i15 ^ i14)) * (-602);
        int i17 = 1847546223 & i16;
        int i18 = ((i16 | 1847546223) & (~i17)) + (i17 << 1);
        int i19 = 1109628455 & iIdentityHashCode;
        int i20 = (1109628455 | iIdentityHashCode) & (~i19);
        int i21 = ~((i20 & i19) | (i20 ^ i19));
        int i22 = 684744712 & i21;
        int i23 = (i21 | 684744712) & (~i22);
        int i24 = (i23 & i22) | (i23 ^ i22);
        int i25 = i10 & (-1109628456);
        int i26 = ((-1109628456) | i10) & (~i25);
        int i27 = ~((i26 & i25) | (i26 ^ i25) | 687006221);
        int i28 = ((~i27) & i24) | ((~i24) & i27);
        int i29 = i24 & i27;
        int i30 = (i18 - (~(((i29 & i28) | (i28 ^ i29)) * (-301)))) - 1;
        int i31 = (iIdentityHashCode | i10) & i10;
        int i32 = -(~(-(-((~((i31 & 687006221) | (i31 ^ 687006221))) * 301))));
        int i33 = ((i30 | i32) << 1) - (i32 ^ i30);
        int i34 = (i33 ^ (-1)) + (i33 << 1);
        int i35 = ~System.identityHashCode(s8Var);
        int i36 = (-1231589855) & i35;
        int i37 = ((-1231589855) ^ i35) | i36;
        int i38 = ~i37;
        int i39 = (i37 | i38) & i38;
        int i40 = ((i39 & 1208516894) | (1208516894 ^ i39)) * (-241);
        int i41 = (-1380339416) & i40;
        int i42 = i40 | (-1380339416);
        int i43 = (i41 ^ i42) + ((i42 & i41) << 1);
        int i44 = i43 & (-1032237534);
        int i45 = (i44 - (~(-(-(((-1032237534) ^ i43) | i44))))) - 1;
        int i46 = (i35 & 1231589854) | ((-1231589855) & (~i35));
        int i47 = (i46 & i36) | (i46 ^ i36);
        int i48 = i47 ^ 1511712543;
        int i49 = i47 & 1511712543;
        int i50 = (i49 & i48) | (i48 ^ i49);
        int i51 = ~i50;
        int i52 = (i50 | i51) & i51;
        int i53 = 303195649 ^ i52;
        int i54 = i52 & 303195649;
        int i55 = -(-(((i54 & i53) | (i53 ^ i54)) * 241));
        int i56 = i45 ^ i55;
        int i57 = ((i55 & i45) | i56) << 1;
        int i58 = -i56;
        int i59 = ((i57 | i58) << 1) - (i57 ^ i58);
        s8Var.f58207u0 = obj2;
        int i60 = s8Var.f58208w0;
        if (i34 <= i59) {
            int i61 = i60 & Integer.MIN_VALUE;
            s8Var.f58208w0 = ((i60 | Integer.MIN_VALUE) & (~i61)) | i61;
            int i62 = 9 / 0;
            return setAdjustViewBounds.setCompoundDrawableTintBlendMode(new Object[]{s8Var.v0, s8Var}, 1100641042, -1100641015, (int) System.currentTimeMillis());
        }
        int i63 = i60 ^ Integer.MIN_VALUE;
        int i64 = i60 & Integer.MIN_VALUE;
        s8Var.f58208w0 = (i64 & i63) | (i63 ^ i64);
        return setAdjustViewBounds.setCompoundDrawableTintBlendMode(new Object[]{s8Var.v0, s8Var}, 1100641042, -1100641015, (int) System.currentTimeMillis());
    }
}
