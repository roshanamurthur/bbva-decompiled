package com.mypinpad.tsdk.isolation;

import com.mypinpad.tsdk.api.models.TransactionType;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class sv {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f60936a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f60937b = 1;

    public /* synthetic */ class setCompoundDrawableTintBlendMode {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int f60938a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f60939b;
        public static final /* synthetic */ int[] setCompoundDrawableTintBlendMode;

        static {
            int[] iArr = new int[TransactionType.values().length];
            try {
                iArr[TransactionType.PURCHASE.ordinal()] = 1;
                int i10 = 1 ^ 87;
                int i11 = -(-((1 & 87) << 1));
                int i12 = (i10 ^ i11) + ((i10 & i11) << 1);
                f60938a = i12 % 128;
                int i13 = i12 % 2;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TransactionType.REFUND.ordinal()] = 2;
                int i14 = f60939b;
                int i15 = i14 & 111;
                int i16 = (i14 ^ 111) | i15;
                int i17 = (i15 ^ i16) + ((i16 & i15) << 1);
                f60938a = i17 % 128;
                int i18 = i17 % 2;
            } catch (NoSuchFieldError unused2) {
            }
            setCompoundDrawableTintBlendMode = iArr;
            int i19 = f60938a + 53;
            f60939b = i19 % 128;
            int i20 = i19 % 2;
        }
    }

    @NotNull
    public static final so setDividerPadding(@NotNull TransactionType transactionType) {
        return (so) setY(new Object[]{transactionType}, -237800956, 237800956, (int) System.currentTimeMillis());
    }

    public static /* synthetic */ Object setY(Object[] objArr, int i10, int i11, int i12) {
        so soVar;
        TransactionType transactionType = (TransactionType) objArr[0];
        int i13 = f60937b;
        int i14 = (i13 & 79) + (i13 | 79);
        f60936a = i14 % 128;
        if (i14 % 2 != 0) {
            Intrinsics.checkNotNullParameter(transactionType, "");
            int i15 = setCompoundDrawableTintBlendMode.setCompoundDrawableTintBlendMode[transactionType.ordinal()];
            throw null;
        }
        Intrinsics.checkNotNullParameter(transactionType, "");
        int i16 = setCompoundDrawableTintBlendMode.setCompoundDrawableTintBlendMode[transactionType.ordinal()];
        if (i16 == 1) {
            soVar = so.setY;
            int i17 = f60936a + 53;
            f60937b = i17 % 128;
            if (i17 % 2 == 0) {
                throw null;
            }
        } else {
            if (i16 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            soVar = so.setOnFocusChangeListener;
            int i18 = f60937b;
            int i19 = ((i18 & (-16)) | ((~i18) & 15)) + ((i18 & 15) << 1);
            f60936a = i19 % 128;
            if (i19 % 2 != 0) {
                int i20 = 32 / 0;
            }
        }
        return soVar;
    }
}
