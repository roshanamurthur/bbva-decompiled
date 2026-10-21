package com.mypinpad.tsdk.isolation;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes10.dex */
public final class and extends amy {

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public static final BigInteger f53299u0 = BigInteger.valueOf(1);
    public static final BigInteger v0 = BigInteger.valueOf(2);

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public static int f53300w0 = 0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public static int f53301x0 = 1;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final BigInteger f53302t0;

    static {
        int i10 = f53300w0;
        int i11 = (i10 ^ 105) + ((i10 & 105) << 1);
        f53301x0 = i11 % 128;
        if (i11 % 2 == 0) {
            throw null;
        }
    }

    public and(BigInteger bigInteger, anh anhVar) {
        super(anhVar);
        this.f53302t0 = (BigInteger) setY(new Object[]{bigInteger, anhVar}, -1947207335, 1947207336, (int) System.currentTimeMillis());
    }

    /* JADX WARN: Code duplicated, block: B:16:0x006f  */
    /* JADX WARN: Code duplicated, block: B:18:0x0083  */
    /* JADX WARN: Code duplicated, block: B:20:0x00af  */
    /* JADX WARN: Code duplicated, block: B:22:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:26:0x010b  */
    public static /* synthetic */ Object setY(Object[] objArr, int i10, int i11, int i12) {
        BigInteger bigInteger;
        int i13;
        int i14 = ~i11;
        int i15 = ((~((~i12) | i14 | i10)) * 130) + (i11 * 131) + (i10 * (-129));
        int i16 = i14 | i10;
        if ((((~((~i10) | i11)) | (~(i16 | i12))) * 130) + ((~i16) * (-260)) + i15 != 1) {
            and andVar = (and) objArr[0];
            int i17 = f53300w0;
            int i18 = (((i17 | 88) << 1) - (i17 ^ 88)) - 1;
            f53301x0 = i18 % 128;
            int i19 = i18 % 2;
            BigInteger bigInteger2 = andVar.f53302t0;
            if (i19 == 0) {
                int i20 = 1 / 0;
            }
            int i21 = i17 + 117;
            f53301x0 = i21 % 128;
            if (i21 % 2 != 0) {
                return bigInteger2;
            }
            int i22 = 8 / 0;
            return bigInteger2;
        }
        BigInteger bigInteger3 = (BigInteger) objArr[0];
        anh anhVar = (anh) objArr[1];
        int i23 = f53301x0;
        int i24 = i23 & 63;
        int i25 = (((i23 ^ 63) | i24) << 1) - ((i23 | 63) & (~i24));
        int i26 = i25 % 128;
        f53300w0 = i26;
        if (i25 % 2 != 0) {
            int i27 = 41 / 0;
            if (anhVar != null) {
                int i28 = i26 + 104;
                int i29 = (i28 ^ (-1)) + (i28 << 1);
                f53301x0 = i29 % 128;
                int i30 = i29 % 2;
                bigInteger = v0;
                if (bigInteger.compareTo(bigInteger3) <= 0) {
                    int i31 = f53300w0;
                    int i32 = (i31 ^ 33) + ((i31 & 33) << 1);
                    f53301x0 = i32 % 128;
                    int i33 = i32 % 2;
                    if (((BigInteger) anh.setOnFocusChangeListener(new Object[]{anhVar}, -1766607053, 1766607053, System.identityHashCode(anhVar))).subtract(bigInteger).compareTo(bigInteger3) >= 0) {
                        int i34 = f53301x0 + 77;
                        f53300w0 = i34 % 128;
                        int i35 = i34 % 2;
                        if (f53299u0.equals(bigInteger3.modPow((BigInteger) anh.setOnFocusChangeListener(new Object[]{anhVar}, -11125249, 11125252, System.identityHashCode(anhVar)), (BigInteger) anh.setOnFocusChangeListener(new Object[]{anhVar}, -1766607053, 1766607053, System.identityHashCode(anhVar))))) {
                            int i36 = f53300w0;
                            int i37 = i36 + 75;
                            f53301x0 = i37 % 128;
                            int i38 = i37 % 2;
                            int i39 = i36 & 15;
                            int i40 = (i36 | 15) & (~i39);
                            int i41 = i39 << 1;
                            i13 = (i40 & i41) + (i40 | i41);
                        }
                    }
                }
                throw new IllegalArgumentException("y value does not appear to be in correct group");
            }
            int i42 = i26 | 5;
            int i43 = i42 << 1;
            int i44 = -(i42 & (~(i26 & 5)));
            i13 = ((i43 | i44) << 1) - (i44 ^ i43);
        } else {
            if (anhVar != null) {
                int i210 = i26 + 104;
                int i211 = (i210 ^ (-1)) + (i210 << 1);
                f53301x0 = i211 % 128;
                int i310 = i211 % 2;
                bigInteger = v0;
                if (bigInteger.compareTo(bigInteger3) <= 0) {
                    int i311 = f53300w0;
                    int i312 = (i311 ^ 33) + ((i311 & 33) << 1);
                    f53301x0 = i312 % 128;
                    int i313 = i312 % 2;
                    if (((BigInteger) anh.setOnFocusChangeListener(new Object[]{anhVar}, -1766607053, 1766607053, System.identityHashCode(anhVar))).subtract(bigInteger).compareTo(bigInteger3) >= 0) {
                        int i314 = f53301x0 + 77;
                        f53300w0 = i314 % 128;
                        int i315 = i314 % 2;
                        if (f53299u0.equals(bigInteger3.modPow((BigInteger) anh.setOnFocusChangeListener(new Object[]{anhVar}, -11125249, 11125252, System.identityHashCode(anhVar)), (BigInteger) anh.setOnFocusChangeListener(new Object[]{anhVar}, -1766607053, 1766607053, System.identityHashCode(anhVar))))) {
                            int i316 = f53300w0;
                            int i317 = i316 + 75;
                            f53301x0 = i317 % 128;
                            int i318 = i317 % 2;
                            int i319 = i316 & 15;
                            int i45 = (i316 | 15) & (~i319);
                            int i46 = i319 << 1;
                            i13 = (i45 & i46) + (i45 | i46);
                        }
                    }
                }
                throw new IllegalArgumentException("y value does not appear to be in correct group");
            }
            int i47 = i26 | 5;
            int i48 = i47 << 1;
            int i49 = -(i47 & (~(i26 & 5)));
            i13 = ((i48 | i49) << 1) - (i49 ^ i48);
        }
        f53301x0 = i13 % 128;
        int i50 = i13 % 2;
        return bigInteger3;
    }

    public final BigInteger setDividerPadding() {
        return (BigInteger) setY(new Object[]{this}, -1023585856, 1023585856, System.identityHashCode(this));
    }
}
