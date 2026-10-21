package com.mypinpad.tsdk.isolation;

import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
public final class SouthAmericaEndpoint {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static int f51805c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static int f51806d = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Terminal f51807a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final List<String> f51808b;

    public SouthAmericaEndpoint(@NotNull Terminal terminal, @NotNull List<String> list) {
        Intrinsics.checkNotNullParameter(terminal, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.f51807a = terminal;
        this.f51808b = list;
    }

    public static /* synthetic */ Object setY(Object[] objArr, int i10, int i11, int i12) {
        int i13 = ~i11;
        int i14 = ~i12;
        int i15 = (((~(i10 | i11)) | (~(i12 | i13))) * 49) + (((~((~i10) | i14)) | i13 | (~(i10 | i12))) * (-49)) + (((~(i13 | i14)) | (~(i13 | i10))) * 98) + (i11 * (-97)) + (i10 * 50);
        if (i15 == 1) {
            SouthAmericaEndpoint southAmericaEndpoint = (SouthAmericaEndpoint) objArr[0];
            int i16 = f51805c;
            int i17 = ((i16 & 17) - (~(-(-(i16 | 17))))) - 1;
            f51806d = i17 % 128;
            int i18 = i17 % 2;
            Terminal terminal = southAmericaEndpoint.f51807a;
            int i19 = ((i16 & 29) - (~(i16 | 29))) - 1;
            f51806d = i19 % 128;
            if (i19 % 2 != 0) {
                return terminal;
            }
            int i20 = 70 / 0;
            return terminal;
        }
        if (i15 == 2) {
            SouthAmericaEndpoint southAmericaEndpoint2 = (SouthAmericaEndpoint) objArr[0];
            int i21 = f51806d;
            int i22 = i21 & 77;
            int i23 = i21 | 77;
            int i24 = (i22 & i23) + (i23 | i22);
            f51805c = i24 % 128;
            int i25 = i24 % 2;
            int iHashCode = (southAmericaEndpoint2.f51807a.hashCode() * 31) - (~southAmericaEndpoint2.f51808b.hashCode());
            int i26 = (iHashCode ^ (-1)) + (iHashCode << 1);
            int i27 = f51805c + 64;
            int i28 = (i27 ^ (-1)) + (i27 << 1);
            f51806d = i28 % 128;
            if (i28 % 2 != 0) {
                return Integer.valueOf(i26);
            }
            throw null;
        }
        if (i15 == 3) {
            SouthAmericaEndpoint southAmericaEndpoint3 = (SouthAmericaEndpoint) objArr[0];
            StringBuilder sb2 = new StringBuilder("KernelTags(kernelId=");
            sb2.append(southAmericaEndpoint3.f51807a);
            sb2.append(", tags=");
            sb2.append(southAmericaEndpoint3.f51808b);
            sb2.append(RootService.CLOSE_BRACKET);
            String string = sb2.toString();
            int i29 = f51805c;
            int i30 = i29 & 31;
            int i31 = -(-((i29 ^ 31) | i30));
            int i32 = ((i30 | i31) << 1) - (i31 ^ i30);
            f51806d = i32 % 128;
            if (i32 % 2 != 0) {
                return string;
            }
            throw null;
        }
        if (i15 == 4) {
            SouthAmericaEndpoint southAmericaEndpoint4 = (SouthAmericaEndpoint) objArr[0];
            int i33 = f51806d;
            int i34 = ((i33 | 97) << 1) - (i33 ^ 97);
            f51805c = i34 % 128;
            int i35 = i34 % 2;
            List<String> list = southAmericaEndpoint4.f51808b;
            if (i35 != 0) {
                throw null;
            }
            int i36 = i33 & 31;
            int i37 = (i33 | 31) & (~i36);
            int i38 = i36 << 1;
            int i39 = (i37 ^ i38) + ((i37 & i38) << 1);
            f51805c = i39 % 128;
            int i40 = i39 % 2;
            return list;
        }
        SouthAmericaEndpoint southAmericaEndpoint5 = (SouthAmericaEndpoint) objArr[0];
        Object obj = objArr[1];
        int i41 = f51806d;
        int i42 = i41 + 59;
        int i43 = i42 % 128;
        f51805c = i43;
        if (i42 % 2 != 0) {
            throw null;
        }
        if (southAmericaEndpoint5 != obj) {
            if (!(!(obj instanceof SouthAmericaEndpoint))) {
                SouthAmericaEndpoint southAmericaEndpoint6 = (SouthAmericaEndpoint) obj;
                if (southAmericaEndpoint5.f51807a != southAmericaEndpoint6.f51807a) {
                    int i44 = i43 & 9;
                    int i45 = ((i43 ^ 9) | i44) << 1;
                    int i46 = -((~i44) & (i43 | 9));
                    int i47 = ((i45 | i46) << 1) - (i45 ^ i46);
                    f51806d = i47 % 128;
                    int i48 = i47 % 2;
                    int i49 = i43 & 85;
                    int i50 = ((i43 ^ 85) | i49) << 1;
                    int i51 = -((~i49) & (i43 | 85));
                    int i52 = (i50 & i51) + (i50 | i51);
                    f51806d = i52 % 128;
                    int i53 = i52 % 2;
                } else if (Intrinsics.areEqual(southAmericaEndpoint5.f51808b, southAmericaEndpoint6.f51808b)) {
                    int i54 = f51806d;
                    int i55 = i54 & 119;
                    int i56 = (i54 | 119) & (~i55);
                    int i57 = i55 << 1;
                    int i58 = (i56 ^ i57) + ((i56 & i57) << 1);
                    f51805c = i58 % 128;
                    if (i58 % 2 != 0) {
                        throw null;
                    }
                } else {
                    int i59 = f51806d + 61;
                    f51805c = i59 % 128;
                    int i60 = i59 % 2;
                }
            } else {
                int i61 = i43 + 55;
                f51806d = i61 % 128;
                int i62 = i61 % 2;
                int i63 = (i43 & 45) + (i43 | 45);
                f51806d = i63 % 128;
                if (i63 % 2 == 0) {
                    throw null;
                }
            }
            return Boolean.FALSE;
        }
        int i64 = (i41 & 55) + (i41 | 55);
        f51805c = i64 % 128;
        int i65 = i64 % 2;
        return Boolean.TRUE;
    }

    public final boolean equals(@Nullable Object obj) {
        return ((Boolean) setY(new Object[]{this, obj}, 254675034, -254675034, System.identityHashCode(this))).booleanValue();
    }

    public final int hashCode() {
        return ((Integer) setY(new Object[]{this}, 919403868, -919403866, System.identityHashCode(this))).intValue();
    }

    @NotNull
    public final Terminal setDividerPadding() {
        return (Terminal) setY(new Object[]{this}, 1252185174, -1252185173, System.identityHashCode(this));
    }

    @NotNull
    public final List<String> setOnFocusChangeListener() {
        return (List) setY(new Object[]{this}, 754025851, -754025847, System.identityHashCode(this));
    }

    @NotNull
    public final String toString() {
        return (String) setY(new Object[]{this}, 1881866892, -1881866889, System.identityHashCode(this));
    }
}
