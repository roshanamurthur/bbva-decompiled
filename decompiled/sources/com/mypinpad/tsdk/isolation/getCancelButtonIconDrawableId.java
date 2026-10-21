package com.mypinpad.tsdk.isolation;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class getCancelButtonIconDrawableId {

    public static final class setOnFocusChangeListener implements getDetailsFieldTextSizeSp {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ long f55712a;

        public static /* synthetic */ Object setDividerPadding(Object[] objArr, int i10, int i11, int i12) {
            return String.valueOf(((setOnFocusChangeListener) objArr[0]).f55712a);
        }

        @Override // com.mypinpad.tsdk.isolation.getDetailsFieldTextSizeSp
        @NotNull
        public final String setCompoundDrawableTintBlendMode() {
            return (String) setDividerPadding(new Object[]{this}, 1346537243, -1346537243, System.identityHashCode(this));
        }
    }

    public static final class setY implements getDetailsFieldTextSizeSp {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static int f55713b = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static int f55714c = 1;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ int f55715a;

        public static /* synthetic */ Object setX(Object[] objArr, int i10, int i11, int i12) {
            setY sety = (setY) objArr[0];
            int i13 = f55713b;
            int i14 = i13 & 55;
            int i15 = -(-(i13 | 55));
            int i16 = (i14 & i15) + (i15 | i14);
            f55714c = i16 % 128;
            int i17 = i16 % 2;
            String strValueOf = String.valueOf(sety.f55715a);
            int i18 = f55714c;
            int i19 = i18 & 25;
            int i20 = -(-((i18 ^ 25) | i19));
            int i21 = (i19 & i20) + (i20 | i19);
            f55713b = i21 % 128;
            int i22 = i21 % 2;
            return strValueOf;
        }

        @Override // com.mypinpad.tsdk.isolation.getDetailsFieldTextSizeSp
        @NotNull
        public final String setCompoundDrawableTintBlendMode() {
            return (String) setX(new Object[]{this}, -1602477130, 1602477130, System.identityHashCode(this));
        }
    }

    @NotNull
    public static final getDetailsFieldTextSizeSp setCompoundDrawableTintBlendMode(int i10) {
        return (getDetailsFieldTextSizeSp) setY(new Object[]{Integer.valueOf(i10)}, -2102169182, 2102169182, i10);
    }

    @NotNull
    public static final getDetailsFieldTextSizeSp setOnFocusChangeListener(long j10) {
        return (getDetailsFieldTextSizeSp) setY(new Object[]{Long.valueOf(j10)}, -1045620830, 1045620831, (int) System.currentTimeMillis());
    }

    public static Object setY(Object[] objArr, int i10, int i11, int i12) {
        int i13 = (i11 * 334) + (i10 * (-665));
        int i14 = ~i10;
        int i15 = (i14 * (-333)) + i13;
        int i16 = ~i12;
        if ((((~(i14 | i12)) | (~(i11 | i16))) * 333) + (((~(i14 | i16)) | (~(i11 | i12))) * 333) + i15 != 1) {
            int iIntValue = ((Number) objArr[0]).intValue();
            setY sety = new setY();
            sety.f55715a = iIntValue;
            return sety;
        }
        long jLongValue = ((Number) objArr[0]).longValue();
        setOnFocusChangeListener setonfocuschangelistener = new setOnFocusChangeListener();
        setonfocuschangelistener.f55712a = jLongValue;
        return setonfocuschangelistener;
    }
}
