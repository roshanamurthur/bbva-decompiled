package com.mypinpad.tsdk.isolation;

import ek.a;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
public abstract class fe {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f55516a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f55517b = 1;

    public static /* synthetic */ Object setY(Object[] objArr, int i10, int i11, int i12) throws Exception {
        int i13 = ~i11;
        int i14 = i10 | i12;
        int i15 = ((i13 | i14) * 668) + ((i10 | (~(i13 | i12))) * 1336) + (((~i14) | i13) * (-668)) + (i11 * (-667)) + (i10 * (-1335));
        if (i15 == 1) {
            setScrollBarDefaultDelayBeforeFade setscrollbardefaultdelaybeforefade = (setScrollBarDefaultDelayBeforeFade) objArr[0];
            setTextKeepState settextkeepstate = (setTextKeepState) objArr[1];
            eu euVar = (eu) objArr[2];
            int i16 = f55517b;
            int i17 = (i16 ^ 124) + ((i16 & 124) << 1);
            int i18 = (i17 ^ (-1)) + (i17 << 1);
            f55516a = i18 % 128;
            int i19 = i18 % 2;
            Object compoundDrawableTintBlendMode = euVar.setCompoundDrawableTintBlendMode(setscrollbardefaultdelaybeforefade, settextkeepstate);
            if (compoundDrawableTintBlendMode == a.getCOROUTINE_SUSPENDED()) {
                int i20 = f55517b;
                int i21 = i20 & 9;
                int i22 = (((i20 ^ 9) | i21) << 1) - ((i20 | 9) & (~i21));
                f55516a = i22 % 128;
                if (i22 % 2 != 0) {
                    throw null;
                }
            } else {
                compoundDrawableTintBlendMode = Unit.INSTANCE;
                int i23 = f55516a;
                int i24 = (i23 ^ 121) + ((i23 & 121) << 1);
                f55517b = i24 % 128;
                if (i24 % 2 == 0) {
                    throw null;
                }
            }
            return compoundDrawableTintBlendMode;
        }
        if (i15 == 2) {
            fe feVar = (fe) objArr[0];
            setScrollBarDefaultDelayBeforeFade setscrollbardefaultdelaybeforefade2 = (setScrollBarDefaultDelayBeforeFade) objArr[1];
            setTextKeepState settextkeepstate2 = (setTextKeepState) objArr[2];
            eu euVar2 = (eu) objArr[3];
            a aVar = (a) objArr[4];
            Continuation continuation = (Continuation) objArr[5];
            int i25 = f55516a;
            int i26 = i25 ^ 19;
            int i27 = ((i25 & 19) | i26) << 1;
            int i28 = -i26;
            int i29 = (i27 ^ i28) + ((i27 & i28) << 1);
            f55517b = i29 % 128;
            Object[] objArr2 = new Object[6];
            if (i29 % 2 != 0) {
                objArr2[0] = feVar;
                objArr2[1] = setscrollbardefaultdelaybeforefade2;
                objArr2[2] = settextkeepstate2;
                objArr2[3] = euVar2;
                objArr2[4] = aVar;
                objArr2[5] = continuation;
                return setY(objArr2, 277618739, -277618739, (int) System.currentTimeMillis());
            }
            objArr2[0] = feVar;
            objArr2[1] = setscrollbardefaultdelaybeforefade2;
            objArr2[2] = settextkeepstate2;
            objArr2[3] = euVar2;
            objArr2[4] = aVar;
            objArr2[5] = continuation;
            setY(objArr2, 277618739, -277618739, (int) System.currentTimeMillis());
            throw null;
        }
        fe feVar2 = (fe) objArr[0];
        setScrollBarDefaultDelayBeforeFade setscrollbardefaultdelaybeforefade3 = (setScrollBarDefaultDelayBeforeFade) objArr[1];
        setTextKeepState settextkeepstate3 = (setTextKeepState) objArr[2];
        eu euVar3 = (eu) objArr[3];
        a aVar2 = (a) objArr[4];
        Continuation<? super Unit> continuation2 = (Continuation) objArr[5];
        int i30 = f55516a;
        int i31 = i30 & 63;
        int i32 = i30 | 63;
        int i33 = (i31 & i32) + (i32 | i31);
        f55517b = i33 % 128;
        int i34 = i33 % 2;
        TransactionProcessingResult transactionProcessingResult = (TransactionProcessingResult) a.setX(new Object[]{aVar2}, 1133945330, -1133945329, System.identityHashCode(aVar2));
        Intrinsics.checkNotNull(transactionProcessingResult);
        SouthPacificEndpoint southPacificEndpoint = SouthPacificEndpoint.setX;
        SouthPacificEndpoint.setX(new Object[]{Intrinsics.stringPlus("handlePinEntryResult: ", transactionProcessingResult)}, 818541572, -818541572, (int) System.currentTimeMillis());
        setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{setscrollbardefaultdelaybeforefade3, transactionProcessingResult}, 1881890266, -1881890248, System.identityHashCode(setscrollbardefaultdelaybeforefade3));
        feVar2.setCompoundDrawableTintBlendMode(setscrollbardefaultdelaybeforefade3, transactionProcessingResult);
        Object y7 = feVar2.setY(setscrollbardefaultdelaybeforefade3, settextkeepstate3, euVar3, continuation2);
        if (y7 == a.getCOROUTINE_SUSPENDED()) {
            int i35 = f55517b;
            int i36 = (((i35 | 8) << 1) - (i35 ^ 8)) - 1;
            f55516a = i36 % 128;
            if (i36 % 2 == 0) {
                return y7;
            }
            throw null;
        }
        Unit unit = Unit.INSTANCE;
        int i37 = f55517b;
        int i38 = (i37 ^ 3) + ((i37 & 3) << 1);
        f55516a = i38 % 128;
        if (i38 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    public void setCompoundDrawableTintBlendMode(@NotNull setScrollBarDefaultDelayBeforeFade setscrollbardefaultdelaybeforefade, @NotNull TransactionProcessingResult transactionProcessingResult) {
        int i10 = f55516a;
        int i11 = i10 & 89;
        int i12 = ((i10 ^ 89) | i11) << 1;
        int i13 = -((i10 | 89) & (~i11));
        int i14 = ((i12 | i13) << 1) - (i13 ^ i12);
        f55517b = i14 % 128;
        if (i14 % 2 == 0) {
            Intrinsics.checkNotNullParameter(setscrollbardefaultdelaybeforefade, "");
            Intrinsics.checkNotNullParameter(transactionProcessingResult, "");
            throw null;
        }
        Intrinsics.checkNotNullParameter(setscrollbardefaultdelaybeforefade, "");
        Intrinsics.checkNotNullParameter(transactionProcessingResult, "");
        int i15 = f55516a;
        int i16 = i15 & 37;
        int i17 = ((i15 ^ 37) | i16) << 1;
        int i18 = -((i15 | 37) & (~i16));
        int i19 = ((i17 | i18) << 1) - (i18 ^ i17);
        f55517b = i19 % 128;
        if (i19 % 2 == 0) {
            throw null;
        }
    }

    @Nullable
    public Object setY(@NotNull setScrollBarDefaultDelayBeforeFade setscrollbardefaultdelaybeforefade, @NotNull setTextKeepState settextkeepstate, @NotNull eu euVar, @NotNull Continuation<? super Unit> continuation) throws Exception {
        int i10 = f55517b;
        int i11 = i10 & 73;
        int i12 = -(-(i10 | 73));
        int i13 = (i11 & i12) + (i12 | i11);
        f55516a = i13 % 128;
        int i14 = i13 % 2;
        Object y7 = setY(new Object[]{setscrollbardefaultdelaybeforefade, settextkeepstate, euVar}, 880538790, -880538789, (int) System.currentTimeMillis());
        int i15 = f55516a + 103;
        f55517b = i15 % 128;
        int i16 = i15 % 2;
        return y7;
    }

    @Nullable
    public final Object setY(@NotNull setScrollBarDefaultDelayBeforeFade setscrollbardefaultdelaybeforefade, @NotNull setTextKeepState settextkeepstate, @NotNull eu euVar, @NotNull a aVar, @NotNull Continuation<? super Unit> continuation) {
        return setY(new Object[]{this, setscrollbardefaultdelaybeforefade, settextkeepstate, euVar, aVar, continuation}, 54480390, -54480388, System.identityHashCode(this));
    }
}
