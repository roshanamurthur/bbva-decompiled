package com.mypinpad.tsdk.isolation;

import com.mypinpad.tsdk.api.models.CardScheme;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class sc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f58210a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f58211b = 1;

    public /* synthetic */ class setDividerPadding {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int f58212a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f58213b;
        public static final /* synthetic */ int[] setOnFocusChangeListener;

        static {
            int[] iArr = new int[sg.values().length];
            try {
                iArr[sg.setY.ordinal()] = 1;
                int i10 = (1 & 13) + (1 | 13);
                f58212a = i10 % 128;
                int i11 = i10 % 2;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[sg.setCompoundDrawableTintBlendMode.ordinal()] = 2;
                int i12 = f58212a;
                int i13 = ((i12 | 113) << 1) - (i12 ^ 113);
                f58213b = i13 % 128;
                int i14 = i13 % 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[sg.setOnFocusChangeListener.ordinal()] = 3;
                int i15 = f58212a;
                int i16 = i15 & 51;
                int i17 = i16 + ((i15 ^ 51) | i16);
                f58213b = i17 % 128;
                int i18 = i17 % 2;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[sg.setX.ordinal()] = 4;
                int i19 = f58212a;
                int i20 = (i19 & (-68)) | ((~i19) & 67);
                int i21 = -(-((i19 & 67) << 1));
                int i22 = (i20 ^ i21) + ((i21 & i20) << 1);
                f58213b = i22 % 128;
                int i23 = i22 % 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[sg.setDividerPadding.ordinal()] = 5;
                int i24 = f58212a;
                int i25 = (i24 & 83) + (i24 | 83);
                f58213b = i25 % 128;
                int i26 = i25 % 2;
            } catch (NoSuchFieldError unused5) {
            }
            setOnFocusChangeListener = iArr;
            int i27 = f58213b + 15;
            f58212a = i27 % 128;
            int i28 = i27 % 2;
        }
    }

    public static /* synthetic */ Object setX(Object[] objArr, int i10, int i11, int i12) {
        CardScheme cardScheme;
        int i13;
        sg sgVar = (sg) objArr[0];
        int i14 = f58211b;
        int i15 = (i14 ^ 123) + ((i14 & 123) << 1);
        f58210a = i15 % 128;
        int i16 = i15 % 2;
        Intrinsics.checkNotNullParameter(sgVar, "");
        int i17 = setDividerPadding.setOnFocusChangeListener[sgVar.ordinal()];
        if (i17 == 1) {
            CardScheme cardScheme2 = CardScheme.MASTERCARD;
            int i18 = f58211b;
            int i19 = i18 & 23;
            int i20 = ((i18 ^ 23) | i19) << 1;
            int i21 = -((i18 | 23) & (~i19));
            int i22 = ((i20 | i21) << 1) - (i21 ^ i20);
            f58210a = i22 % 128;
            if (i22 % 2 == 0) {
                return cardScheme2;
            }
            throw null;
        }
        if (i17 == 2) {
            cardScheme = CardScheme.VISA;
            i13 = f58211b + 9;
        } else {
            if (i17 == 3) {
                CardScheme cardScheme3 = CardScheme.AMERICAN_EXPRESS;
                int i23 = f58210a;
                int i24 = i23 & 1;
                int i25 = ((((i23 ^ 1) | i24) << 1) - (~(-((i23 | 1) & (~i24))))) - 1;
                f58211b = i25 % 128;
                int i26 = i25 % 2;
                return cardScheme3;
            }
            if (i17 == 4) {
                CardScheme cardScheme4 = CardScheme.DISCOVER;
                int i27 = f58211b;
                int i28 = i27 & 13;
                int i29 = (i27 ^ 13) | i28;
                int i30 = ((i28 | i29) << 1) - (i29 ^ i28);
                f58210a = i30 % 128;
                if (i30 % 2 == 0) {
                    return cardScheme4;
                }
                int i31 = 60 / 0;
                return cardScheme4;
            }
            if (i17 != 5) {
                throw new NoWhenBranchMatchedException();
            }
            cardScheme = CardScheme.EFTPOS;
            int i32 = f58211b;
            int i33 = i32 & 7;
            i13 = ((i32 | 7) & (~i33)) + (i33 << 1);
        }
        f58210a = i13 % 128;
        int i34 = i13 % 2;
        return cardScheme;
    }

    @NotNull
    public static final CardScheme setX(@NotNull sg sgVar) {
        return (CardScheme) setX(new Object[]{sgVar}, -951340545, 951340545, (int) System.currentTimeMillis());
    }
}
