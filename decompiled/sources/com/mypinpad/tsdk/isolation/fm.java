package com.mypinpad.tsdk.isolation;

import java.util.concurrent.CancellationException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelKt;
import kotlinx.coroutines.channels.ChannelResult;
import kotlinx.coroutines.channels.ReceiveChannel;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
public final class fm<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f55558b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static int f55559c = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Channel<T> f55560a = ChannelKt.Channel$default(Integer.MAX_VALUE, null, null, 6, null);

    public static /* synthetic */ Object setOnFocusChangeListener(Object[] objArr, int i10, int i11, int i12) {
        int i13 = ~i10;
        int i14 = ~i11;
        int i15 = i13 | i14;
        int i16 = ~i15;
        int i17 = ~i12;
        int i18 = (((~(i10 | i14 | i12)) | (~(i11 | i13)) | (~(i13 | i17))) * 168) + ((~(i15 | i12)) * 168) + ((i16 | (~(i14 | i17))) * 168) + (i11 * (-167)) + (i10 * (-167));
        if (i18 == 1) {
            fm fmVar = (fm) objArr[0];
            int i19 = f55558b + 119;
            f55559c = i19 % 128;
            int i20 = i19 % 2;
            boolean zIsEmpty = fmVar.f55560a.isEmpty();
            int i21 = f55559c;
            int i22 = (i21 & 95) + (i21 | 95);
            f55558b = i22 % 128;
            int i23 = i22 % 2;
            return Boolean.valueOf(zIsEmpty);
        }
        if (i18 == 2) {
            fm fmVar2 = (fm) objArr[0];
            int i24 = f55558b;
            int i25 = i24 & 63;
            int i26 = (i24 | 63) & (~i25);
            int i27 = i25 << 1;
            int i28 = ((i26 | i27) << 1) - (i26 ^ i27);
            f55559c = i28 % 128;
            int i29 = i28 % 2;
            ReceiveChannel.DefaultImpls.cancel$default((ReceiveChannel) fmVar2.f55560a, (CancellationException) null, 1, (Object) null);
            int i30 = f55559c;
            int i31 = i30 ^ 71;
            int i32 = ((i30 & 71) | i31) << 1;
            int i33 = -i31;
            int i34 = ((i32 | i33) << 1) - (i32 ^ i33);
            f55558b = i34 % 128;
            int i35 = i34 % 2;
            return null;
        }
        if (i18 == 3) {
            while (ChannelResult.m5968getOrNullimpl(((fm) objArr[0]).f55560a.mo5958tryReceivePtdJZtk()) != null) {
            }
            int i36 = f55558b + 3;
            f55559c = i36 % 128;
            int i37 = i36 % 2;
            return null;
        }
        if (i18 == 4) {
            fm fmVar3 = (fm) objArr[0];
            Continuation<? super T> continuation = (Continuation) objArr[1];
            int i38 = f55559c;
            int i39 = i38 & 53;
            int i40 = (((i38 | 53) & (~i39)) - (~(i39 << 1))) - 1;
            f55558b = i40 % 128;
            int i41 = i40 % 2;
            Channel<T> channel = fmVar3.f55560a;
            if (i41 != 0) {
                channel.receive(continuation);
                throw null;
            }
            Object objReceive = channel.receive(continuation);
            int i42 = f55559c;
            int i43 = ((i42 | 121) << 1) - (i42 ^ 121);
            f55558b = i43 % 128;
            int i44 = i43 % 2;
            return objReceive;
        }
        fm fmVar4 = (fm) objArr[0];
        Object obj = objArr[1];
        int i45 = f55558b;
        int i46 = i45 & 9;
        int i47 = (i46 - (~((i45 ^ 9) | i46))) - 1;
        f55559c = i47 % 128;
        int i48 = i47 % 2;
        Intrinsics.checkNotNullParameter(obj, "");
        Object objMo5953trySendJP2dKIU = fmVar4.f55560a.mo5953trySendJP2dKIU((T) obj);
        if (!ChannelResult.m5973isSuccessimpl(objMo5953trySendJP2dKIU)) {
            int i49 = f55558b + 105;
            f55559c = i49 % 128;
            if (i49 % 2 == 0) {
                ChannelResult.m5971isClosedimpl(objMo5953trySendJP2dKIU);
                throw null;
            }
            if (!ChannelResult.m5971isClosedimpl(objMo5953trySendJP2dKIU)) {
                int i50 = f55558b;
                int i51 = i50 & 89;
                int i52 = (i50 | 89) & (~i51);
                int i53 = -(-(i51 << 1));
                int i54 = (i52 ^ i53) + ((i52 & i53) << 1);
                int i55 = i54 % 128;
                f55559c = i55;
                int i56 = i54 % 2;
                int i57 = i55 + 1;
                f55558b = i57 % 128;
                int i58 = i57 % 2;
                throw new fh(41, null, 2, null);
            }
        }
        int i59 = f55558b;
        int i60 = i59 | 47;
        int i61 = ((i60 << 1) - (~(-((~(i59 & 47)) & i60)))) - 1;
        int i62 = i61 % 128;
        f55559c = i62;
        int i63 = i61 % 2;
        int i64 = i62 + 59;
        f55558b = i64 % 128;
        if (i64 % 2 == 0) {
            return null;
        }
        throw null;
    }

    public final void setCompoundDrawableTintBlendMode() {
        setOnFocusChangeListener(new Object[]{this}, -1081673723, 1081673725, System.identityHashCode(this));
    }

    @Nullable
    public final Object setDividerPadding(@NotNull Continuation<? super T> continuation) {
        return setOnFocusChangeListener(new Object[]{this, continuation}, -656090639, 656090643, System.identityHashCode(this));
    }

    public final void setX() {
        setOnFocusChangeListener(new Object[]{this}, 1859548033, -1859548030, System.identityHashCode(this));
    }

    public final boolean setY() {
        return ((Boolean) setOnFocusChangeListener(new Object[]{this}, 1125462724, -1125462723, System.identityHashCode(this))).booleanValue();
    }

    public final void setDividerPadding(@NotNull T t10) {
        setOnFocusChangeListener(new Object[]{this, t10}, -1447780689, 1447780689, System.identityHashCode(this));
    }
}
