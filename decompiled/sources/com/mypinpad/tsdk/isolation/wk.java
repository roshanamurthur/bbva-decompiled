package com.mypinpad.tsdk.isolation;

import android.os.Message;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@SourceDebugExtension({"SMAP\nMainProcessManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MainProcessManager.kt\ncom/mypinpad/tsdk/isolation/MainProcessManagerKt\n+ 2 DebugFunctions.kt\ncom/mypinpad/common/buildconstants/DebugFunctionsKt\n*L\n1#1,528:1\n14#2:529\n*S KotlinDebug\n*F\n+ 1 MainProcessManager.kt\ncom/mypinpad/tsdk/isolation/MainProcessManagerKt\n*L\n491#1:529\n*E\n"})
public final class wk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f61659a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f61660b = 1;

    public static final void an_(int i10, @NotNull Message message) {
        setX(new Object[]{Integer.valueOf(i10), message}, -1911741029, 1911741029, i10);
    }

    public static final void ao_(@NotNull String str, @NotNull Message message) {
        setX(new Object[]{str, message}, 384055832, -384055830, (int) System.currentTimeMillis());
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0113  */
    public static /* synthetic */ Object setX(Object[] objArr, int i10, int i11, int i12) {
        Enum r10;
        int iOrdinal;
        int i13 = ~i10;
        int i14 = ~(i13 | i11);
        int i15 = ~i12;
        int i16 = ((i14 | (~(i15 | i11))) * (-108)) + (i11 * (-107)) + (i10 * 55);
        int i17 = ~(i13 | i12);
        int i18 = ~((~i11) | i10);
        int i19 = ((i18 | i12) * 54) + (((~(i10 | i15)) | i17 | i18) * 54) + i16;
        if (i19 != 1) {
            if (i19 != 2) {
                if (i19 == 3) {
                    Message message = (Message) objArr[0];
                    int i20 = f61660b;
                    int i21 = (i20 & 115) + (i20 | 115);
                    f61659a = i21 % 128;
                    if (i21 % 2 == 0) {
                        Intrinsics.checkNotNullParameter(message, "");
                        return String.valueOf(message);
                    }
                    Intrinsics.checkNotNullParameter(message, "");
                    String.valueOf(message);
                    throw null;
                }
                int iIntValue = ((Number) objArr[0]).intValue();
                Message message2 = (Message) objArr[1];
                int i22 = f61659a;
                int i23 = (i22 ^ 27) + ((i22 & 27) << 1);
                f61660b = i23 % 128;
                int i24 = i23 % 2;
                Intrinsics.checkNotNullParameter(message2, "");
                if (message2.what != xk.setOnLongClickListener.setOnFocusChangeListener()) {
                    int i25 = f61660b + 46;
                    int i26 = (i25 ^ (-1)) + (i25 << 1);
                    f61659a = i26 % 128;
                    int i27 = i26 % 2;
                    mu.setCompoundDrawableTintBlendMode(new Object[]{Integer.valueOf(iIntValue), (getDynamicButtonIconTextSpacingDp) setX(new Object[]{message2}, -726635236, 726635237, (int) System.currentTimeMillis()), null, 4}, -1968587119, 1968587120, iIntValue);
                    int i28 = f61659a;
                    int i29 = (i28 & 41) + (i28 | 41);
                    f61660b = i29 % 128;
                    int i30 = i29 % 2;
                }
                int i31 = f61660b;
                int i32 = i31 & 19;
                int i33 = i31 | 19;
                int i34 = (i32 ^ i33) + ((i33 & i32) << 1);
                f61659a = i34 % 128;
                if (i34 % 2 == 0) {
                    return null;
                }
                throw null;
            }
            String str = (String) objArr[0];
            Message message3 = (Message) objArr[1];
            int i35 = f61660b;
            int i36 = i35 ^ 95;
            int i37 = (((i35 & 95) | i36) << 1) - i36;
            f61659a = i37 % 128;
            if (i37 % 2 != 0) {
                Intrinsics.checkNotNullParameter(str, "");
                Intrinsics.checkNotNullParameter(message3, "");
                int i38 = 27 / 0;
                if (message3.what != xk.setOnLongClickListener.setOnFocusChangeListener()) {
                    mr mrVar = mr.setImageResource;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(str);
                    sb2.append(' ');
                    sb2.append((String) setX(new Object[]{message3}, 1564879582, -1564879579, (int) System.currentTimeMillis()));
                    mt.setX(new Object[]{mrVar, sb2.toString()}, 135701020, -135701017, (int) System.currentTimeMillis());
                    int i39 = f61660b + 57;
                    f61659a = i39 % 128;
                    int i40 = i39 % 2;
                }
            } else {
                Intrinsics.checkNotNullParameter(str, "");
                Intrinsics.checkNotNullParameter(message3, "");
                if (message3.what != xk.setOnLongClickListener.setOnFocusChangeListener()) {
                    mr mrVar2 = mr.setImageResource;
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(str);
                    sb3.append(' ');
                    sb3.append((String) setX(new Object[]{message3}, 1564879582, -1564879579, (int) System.currentTimeMillis()));
                    mt.setX(new Object[]{mrVar2, sb3.toString()}, 135701020, -135701017, (int) System.currentTimeMillis());
                    int i310 = f61660b + 57;
                    f61659a = i310 % 128;
                    int i41 = i310 % 2;
                }
            }
            int i42 = f61660b;
            int i43 = ((i42 & (-50)) | ((~i42) & 49)) + ((i42 & 49) << 1);
            f61659a = i43 % 128;
            if (i43 % 2 == 0) {
                return null;
            }
            throw null;
        }
        Message message4 = (Message) objArr[0];
        int i44 = f61660b + 61;
        f61659a = i44 % 128;
        int i45 = i44 % 2;
        Intrinsics.checkNotNullParameter(message4, "");
        int i46 = message4.what;
        if (i46 == xk.setDividerPadding.setOnFocusChangeListener()) {
            int i47 = f61659a;
            int i48 = ((i47 ^ 16) + ((i47 & 16) << 1)) - 1;
            f61660b = i48 % 128;
            int i49 = i48 % 2;
            r10 = (Enum) ArraysKt___ArraysKt.getOrNull(wm.values(), message4.arg2);
            int i50 = f61660b;
            int i51 = (i50 ^ 35) + ((i50 & 35) << 1);
            f61659a = i51 % 128;
            int i52 = i51 % 2;
        } else if (i46 == xk.setOnFocusChangeListener.setOnFocusChangeListener()) {
            int i53 = f61660b;
            int i54 = ((((i53 ^ 45) | (i53 & 45)) << 1) - (~(-(((~i53) & 45) | (i53 & (-46)))))) - 1;
            f61659a = i54 % 128;
            if (i54 % 2 != 0) {
                int i55 = 49 / 0;
                r10 = (Enum) ArraysKt___ArraysKt.getOrNull(wm.values(), message4.arg2);
            } else {
                r10 = (Enum) ArraysKt___ArraysKt.getOrNull(wm.values(), message4.arg2);
            }
        } else if (i46 == xk.setY.setOnFocusChangeListener()) {
            int i56 = f61659a;
            int i57 = ((i56 | 73) << 1) - (i56 ^ 73);
            f61660b = i57 % 128;
            if (i57 % 2 == 0) {
                throw null;
            }
            r10 = (Enum) ArraysKt___ArraysKt.getOrNull(wm.values(), message4.arg2);
        } else if (i46 == xk.setCompoundDrawableTintBlendMode.setOnFocusChangeListener()) {
            int i58 = f61659a;
            int i59 = ((i58 ^ 101) | (i58 & 101)) << 1;
            int i60 = -(((~i58) & 101) | (i58 & (-102)));
            int i61 = (i59 ^ i60) + ((i60 & i59) << 1);
            f61660b = i61 % 128;
            int i62 = i61 % 2;
            r10 = (Enum) ArraysKt___ArraysKt.getOrNull(wf.values(), message4.arg2);
            int i63 = f61660b;
            int i64 = i63 ^ 73;
            int i65 = -(-((i63 & 73) << 1));
            int i66 = (i64 ^ i65) + ((i65 & i64) << 1);
            f61659a = i66 % 128;
            int i67 = i66 % 2;
        } else {
            int i68 = f61659a;
            int i69 = ((i68 & 92) + (i68 | 92)) - 1;
            f61660b = i69 % 128;
            int i70 = i69 % 2;
            r10 = null;
        }
        if (r10 != null) {
            int i71 = f61659a;
            int i72 = ((i71 & (-14)) | ((~i71) & 13)) + ((i71 & 13) << 1);
            f61660b = i72 % 128;
            if (i72 % 2 == 0) {
                r10.ordinal();
                throw null;
            }
            iOrdinal = r10.ordinal();
        } else {
            iOrdinal = message4.arg2;
            int i73 = f61660b;
            int i74 = ((i73 & (-94)) | ((~i73) & 93)) + ((i73 & 93) << 1);
            f61659a = i74 % 128;
            int i75 = i74 % 2;
        }
        StringBuilder sb4 = new StringBuilder();
        sb4.append(message4.what);
        sb4.append(", ");
        sb4.append(message4.arg1);
        sb4.append(", ");
        sb4.append(iOrdinal);
        getDynamicButtonIconTextSpacingDp y7 = getDisplayExponent.setY(sb4.toString());
        int i76 = f61660b;
        int i77 = i76 ^ 59;
        int i78 = -(-((i76 & 59) << 1));
        int i79 = (i77 & i78) + (i78 | i77);
        f61659a = i79 % 128;
        int i80 = i79 % 2;
        return y7;
    }
}
