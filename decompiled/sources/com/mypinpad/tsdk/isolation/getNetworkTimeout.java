package com.mypinpad.tsdk.isolation;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/mypinpad/tsdk/i/getNetworkTimeout;", "", "", "p0", "Lcom/mypinpad/tsdk/i/setScrollBarDefaultDelayBeforeFade;", "p1", "", "setOnFocusChangeListener", "([BLcom/mypinpad/tsdk/i/setScrollBarDefaultDelayBeforeFade;)Z", "<init>", "()V"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class getNetworkTimeout {

    @NotNull
    public static final getNetworkTimeout INSTANCE = new getNetworkTimeout();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f55927a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f55928b = 1;

    static {
        int i10 = f55928b;
        int i11 = (i10 & (-54)) | ((~i10) & 53);
        int i12 = (i10 & 53) << 1;
        int i13 = (i11 ^ i12) + ((i12 & i11) << 1);
        f55927a = i13 % 128;
        if (i13 % 2 != 0) {
            throw null;
        }
    }

    public static /* synthetic */ Object setDividerPadding(Object[] objArr, int i10, int i11, int i12) throws Exception {
        boolean z10;
        int i13;
        boolean zBooleanValue;
        boolean z11 = false;
        byte[] bArr = (byte[]) objArr[0];
        setScrollBarDefaultDelayBeforeFade setscrollbardefaultdelaybeforefade = (setScrollBarDefaultDelayBeforeFade) objArr[1];
        int i14 = f55928b;
        int i15 = ((i14 & 26) + (i14 | 26)) - 1;
        f55927a = i15 % 128;
        int i16 = i15 % 2;
        Intrinsics.checkNotNullParameter(bArr, "");
        Intrinsics.checkNotNullParameter(setscrollbardefaultdelaybeforefade, "");
        if (bArr.length == 0) {
            int i17 = f55927a;
            int i18 = i17 & 17;
            int i19 = (i17 | 17) & (~i18);
            int i20 = i18 << 1;
            int i21 = ((i19 | i20) << 1) - (i19 ^ i20);
            f55928b = i21 % 128;
            z10 = !(i21 % 2 == 0);
        } else {
            int i22 = f55927a;
            int i23 = (((i22 | 10) << 1) - (i22 ^ 10)) - 1;
            f55928b = i23 % 128;
            int i24 = i23 % 2;
            z10 = false;
        }
        if (!(!z10)) {
            int i25 = f55928b;
            int i26 = (((i25 | 68) << 1) - (i25 ^ 68)) - 1;
            f55927a = i26 % 128;
            if (i26 % 2 != 0) {
                SouthPacificEndpoint southPacificEndpoint = SouthPacificEndpoint.setX;
                SouthPacificEndpoint.setX(new Object[]{13551, null, 56}, 1336485880, -1336485874, 13551);
                z11 = true;
            } else {
                SouthPacificEndpoint southPacificEndpoint2 = SouthPacificEndpoint.setX;
                SouthPacificEndpoint.setX(new Object[]{20003, null, 6}, 1336485880, -1336485874, 20003);
            }
            return Boolean.valueOf(z11);
        }
        byte b10 = bArr[0];
        if (b10 == -128) {
            try {
                setTitleTextColor settitletextcolor = new setTitleTextColor(bArr);
                int i27 = f55927a;
                int i28 = i27 | 69;
                int i29 = (i28 << 1) - (i28 & (~(i27 & 69)));
                f55928b = i29 % 128;
                int i30 = i29 % 2;
                int i31 = ((i27 | 74) << 1) - (i27 ^ 74);
                int i32 = (i31 ^ (-1)) + (i31 << 1);
                f55928b = i32 % 128;
                int i33 = i32 % 2;
                if (!(!((Boolean) setTitleTextColor.setY(new Object[]{settitletextcolor, setscrollbardefaultdelaybeforefade.setDividerPadding()}, 1081850552, -1081850548, System.identityHashCode(settitletextcolor))).booleanValue())) {
                    setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{setscrollbardefaultdelaybeforefade, (setMaxWidth) setTitleTextColor.setY(new Object[]{settitletextcolor}, -1049767002, 1049767008, System.identityHashCode(settitletextcolor))}, 1060813790, -1060813751, System.identityHashCode(setscrollbardefaultdelaybeforefade));
                    int i34 = f55928b;
                    int i35 = ((i34 & 78) + (i34 | 78)) - 1;
                    f55927a = i35 % 128;
                    if (i35 % 2 == 0) {
                        return Boolean.TRUE;
                    }
                    int i36 = 95 / 0;
                    return Boolean.TRUE;
                }
                int i37 = f55928b;
                int i38 = (i37 & 87) + (i37 | 87);
                f55927a = i38 % 128;
                int i39 = i38 % 2;
                SouthPacificEndpoint southPacificEndpoint3 = SouthPacificEndpoint.setX;
                SouthPacificEndpoint.setX(new Object[]{20005, null, 6}, 1336485880, -1336485874, 20005);
                int i40 = f55928b;
                i13 = (i40 ^ 65) + ((i40 & 65) << 1);
                f55927a = i13 % 128;
            } catch (fh unused) {
                SouthPacificEndpoint southPacificEndpoint4 = SouthPacificEndpoint.setX;
                SouthPacificEndpoint.setX(new Object[]{20004, null, 6}, 1336485880, -1336485874, 20004);
                return Boolean.FALSE;
            }
        } else {
            if (b10 == 119) {
                int i41 = f55928b;
                int i42 = (i41 ^ 63) + ((i41 & 63) << 1);
                f55927a = i42 % 128;
                if (i42 % 2 != 0) {
                    zBooleanValue = ((Boolean) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{setscrollbardefaultdelaybeforefade, bArr, TerminalCreationFailure.setLayoutAnimation}, 1799308265, -1799308256, System.identityHashCode(setscrollbardefaultdelaybeforefade))).booleanValue();
                    int i43 = 16 / 0;
                } else {
                    zBooleanValue = ((Boolean) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{setscrollbardefaultdelaybeforefade, bArr, TerminalCreationFailure.setLayoutAnimation}, 1799308265, -1799308256, System.identityHashCode(setscrollbardefaultdelaybeforefade))).booleanValue();
                }
                int i44 = f55928b;
                int i45 = i44 & 109;
                int i46 = (i44 | 109) & (~i45);
                int i47 = -(-(i45 << 1));
                int i48 = ((i46 | i47) << 1) - (i46 ^ i47);
                f55927a = i48 % 128;
                if (i48 % 2 == 0) {
                    return Boolean.valueOf(zBooleanValue);
                }
                int i49 = 70 / 0;
                return Boolean.valueOf(zBooleanValue);
            }
            int i50 = f55927a;
            i13 = ((i50 ^ 44) + ((i50 & 44) << 1)) - 1;
            f55928b = i13 % 128;
        }
        int i51 = i13 % 2;
        return Boolean.FALSE;
    }

    public static boolean setOnFocusChangeListener(@NotNull byte[] p4, @NotNull setScrollBarDefaultDelayBeforeFade p10) {
        return ((Boolean) setDividerPadding(new Object[]{p4, p10}, 803823515, -803823515, (int) System.currentTimeMillis())).booleanValue();
    }
}
