package com.mypinpad.tsdk.isolation;

import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/mypinpad/tsdk/i/mf;", "", "Lcom/mypinpad/tsdk/i/setScrollBarDefaultDelayBeforeFade;", "p0", "", "setCompoundDrawableTintBlendMode", "(Lcom/mypinpad/tsdk/i/setScrollBarDefaultDelayBeforeFade;)Z", "<init>", "()V"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class mf {

    @NotNull
    public static final mf INSTANCE = new mf();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f57082a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f57083b = 1;

    public /* synthetic */ class setOnFocusChangeListener {
        public static final /* synthetic */ int[] setOnFocusChangeListener;

        static {
            int[] iArr = new int[md.values().length];
            iArr[md.setDividerPadding.ordinal()] = 1;
            iArr[md.setOnLongClickListener.ordinal()] = 2;
            iArr[md.setCompoundDrawableTintBlendMode.ordinal()] = 3;
            iArr[md.setY.ordinal()] = 4;
            setOnFocusChangeListener = iArr;
            int i10 = 1 & 93;
            int i11 = (i10 - (~((1 ^ 93) | i10))) - 1;
            int i12 = i11 % 128;
            if (i11 % 2 != 0) {
                int i13 = 51 / 0;
            }
        }
    }

    static {
        int i10 = f57082a;
        int i11 = (i10 ^ 67) + ((i10 & 67) << 1);
        f57083b = i11 % 128;
        int i12 = i11 % 2;
    }

    public static boolean setCompoundDrawableTintBlendMode(@NotNull setScrollBarDefaultDelayBeforeFade p4) {
        return ((Boolean) setX(new Object[]{p4}, 1643060178, -1643060178, (int) System.currentTimeMillis())).booleanValue();
    }

    /* JADX WARN: Code duplicated, block: B:58:0x02e0  */
    public static /* synthetic */ Object setX(Object[] objArr, int i10, int i11, int i12) {
        byte[] bArr;
        boolean zBooleanValue;
        setScrollBarDefaultDelayBeforeFade setscrollbardefaultdelaybeforefade = (setScrollBarDefaultDelayBeforeFade) objArr[0];
        int i13 = f57082a + 9;
        f57083b = i13 % 128;
        if (i13 % 2 == 0) {
            Intrinsics.checkNotNullParameter(setscrollbardefaultdelaybeforefade, "");
            getBeepOnFailure getbeeponfailure = (getBeepOnFailure) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{setscrollbardefaultdelaybeforefade, setAnimation.setOnCapturedPointerListener()}, 1431838387, -1431838363, System.identityHashCode(setscrollbardefaultdelaybeforefade));
            throw null;
        }
        Intrinsics.checkNotNullParameter(setscrollbardefaultdelaybeforefade, "");
        getBeepOnFailure getbeeponfailure2 = (getBeepOnFailure) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{setscrollbardefaultdelaybeforefade, setAnimation.setOnCapturedPointerListener()}, 1431838387, -1431838363, System.identityHashCode(setscrollbardefaultdelaybeforefade));
        byte[] bArr2 = (byte[]) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure2}, 252497730, -252497710, System.identityHashCode(getbeeponfailure2));
        getBeepOnFailure getbeeponfailure3 = (getBeepOnFailure) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{setscrollbardefaultdelaybeforefade, setAnimation.TerminalSessionDefaultImpls()}, -1593889019, 1593889062, System.identityHashCode(setscrollbardefaultdelaybeforefade));
        if (getbeeponfailure3 == null) {
            int i14 = f57082a;
            int i15 = i14 & 65;
            int i16 = i15 + ((i14 ^ 65) | i15);
            f57083b = i16 % 128;
            int i17 = i16 % 2;
            bArr = null;
        } else {
            bArr = (byte[]) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure3}, 252497730, -252497710, System.identityHashCode(getbeeponfailure3));
            int i18 = f57083b;
            int i19 = i18 & 13;
            int i20 = (i18 ^ 13) | i19;
            int i21 = (i19 ^ i20) + ((i20 & i19) << 1);
            f57082a = i21 % 128;
            int i22 = i21 % 2;
        }
        ap apVar = new ap(setscrollbardefaultdelaybeforefade);
        ao aoVar = (ao) ((setImageTintList) w.setX(new Object[]{apVar}, 1693919772, -1693919769, System.identityHashCode(apVar)));
        if (bArr != null) {
            boolean zEquals = Arrays.equals(bArr2, bArr);
            de deVar = new de(setscrollbardefaultdelaybeforefade);
            dd ddVar = (dd) ((setImageTintList) w.setX(new Object[]{deVar}, 1693919772, -1693919769, System.identityHashCode(deVar)));
            int i23 = setOnFocusChangeListener.setOnFocusChangeListener[((md) dd.setDividerPadding(new Object[]{ddVar}, -2041109093, 2041109093, System.identityHashCode(ddVar))).ordinal()];
            if (i23 == 1 || i23 == 2) {
                if (!(!zEquals)) {
                    int i24 = f57082a + 4;
                    int i25 = (i24 ^ (-1)) + (i24 << 1);
                    f57083b = i25 % 128;
                    if (i25 % 2 == 0) {
                        ((Boolean) ao.setY(new Object[]{aoVar}, 1150239482, -1150239480, System.identityHashCode(aoVar))).booleanValue();
                        throw null;
                    }
                    zBooleanValue = ((Boolean) ao.setY(new Object[]{aoVar}, 1150239482, -1150239480, System.identityHashCode(aoVar))).booleanValue();
                    int i26 = f57082a;
                    int i27 = i26 ^ 115;
                    int i28 = -(-((i26 & 115) << 1));
                    int i29 = (i27 & i28) + (i28 | i27);
                    f57083b = i29 % 128;
                    int i30 = i29 % 2;
                } else {
                    zBooleanValue = ((Boolean) ao.setY(new Object[]{aoVar}, 743383994, -743383988, System.identityHashCode(aoVar))).booleanValue();
                    int i31 = f57083b;
                    int i32 = ((i31 | 117) << 1) - (i31 ^ 117);
                    f57082a = i32 % 128;
                    int i33 = i32 % 2;
                }
            } else if (i23 != 3) {
                if (i23 != 4) {
                    int i34 = f57082a;
                    int i35 = i34 & 21;
                    int i36 = (i34 ^ 21) | i35;
                    int i37 = (i35 & i36) + (i36 | i35);
                    f57083b = i37 % 128;
                    int i38 = i37 % 2;
                    zBooleanValue = true;
                } else if (zEquals) {
                    int i39 = f57082a;
                    int i40 = (i39 & (-82)) | ((~i39) & 81);
                    int i41 = -(-((i39 & 81) << 1));
                    int i42 = (i40 ^ i41) + ((i41 & i40) << 1);
                    f57083b = i42 % 128;
                    int i43 = i42 % 2;
                    zBooleanValue = ((Boolean) ao.setY(new Object[]{aoVar}, -625784071, 625784076, System.identityHashCode(aoVar))).booleanValue();
                    int i44 = f57082a;
                    int i45 = (((i44 | 43) << 1) - (~(-(((~i44) & 43) | (i44 & (-44)))))) - 1;
                    f57083b = i45 % 128;
                    int i46 = i45 % 2;
                } else {
                    zBooleanValue = ((Boolean) ao.setY(new Object[]{aoVar}, 575922476, -575922476, System.identityHashCode(aoVar))).booleanValue();
                    int i47 = f57083b;
                    int i48 = ((i47 | 113) << 1) - (i47 ^ 113);
                    f57082a = i48 % 128;
                    int i49 = i48 % 2;
                }
            } else if (!zEquals) {
                if (!((Boolean) ao.setY(new Object[]{aoVar}, -1993631086, 1993631090, System.identityHashCode(aoVar))).booleanValue()) {
                    int i50 = f57082a;
                    int i51 = i50 & 95;
                    int i52 = -(-((i50 ^ 95) | i51));
                    int i53 = ((i51 | i52) << 1) - (i52 ^ i51);
                    f57083b = i53 % 128;
                    if (i53 % 2 == 0) {
                        ((Boolean) ao.setY(new Object[]{aoVar}, -1383166788, 1383166797, System.identityHashCode(aoVar))).booleanValue();
                        throw null;
                    }
                    if (!((Boolean) ao.setY(new Object[]{aoVar}, -1383166788, 1383166797, System.identityHashCode(aoVar))).booleanValue()) {
                        int i54 = f57082a;
                        int i55 = (i54 ^ 3) + ((i54 & 3) << 1);
                        f57083b = i55 % 128;
                        int i56 = i55 % 2;
                        zBooleanValue = false;
                    }
                }
                int i57 = f57083b;
                int i58 = ((i57 ^ 75) - (~((i57 & 75) << 1))) - 1;
                f57082a = i58 % 128;
                int i59 = i58 % 2;
                zBooleanValue = true;
            } else {
                int i60 = f57083b + 67;
                f57082a = i60 % 128;
                if (i60 % 2 != 0) {
                    ((Boolean) ao.setY(new Object[]{aoVar}, -1312436044, 1312436045, System.identityHashCode(aoVar))).booleanValue();
                    throw null;
                }
                if (!((Boolean) ao.setY(new Object[]{aoVar}, -1312436044, 1312436045, System.identityHashCode(aoVar))).booleanValue()) {
                    int i61 = f57083b + 115;
                    f57082a = i61 % 128;
                    if (i61 % 2 != 0) {
                        ((Boolean) ao.setY(new Object[]{aoVar}, -1370773042, 1370773045, System.identityHashCode(aoVar))).booleanValue();
                        throw null;
                    }
                    if (!((Boolean) ao.setY(new Object[]{aoVar}, -1370773042, 1370773045, System.identityHashCode(aoVar))).booleanValue()) {
                        int i62 = f57083b;
                        int i63 = (i62 & 107) + (i62 | 107);
                        f57082a = i63 % 128;
                        int i64 = i63 % 2;
                        zBooleanValue = false;
                    }
                }
                int i65 = f57082a;
                int i66 = i65 & 85;
                int i67 = (i65 ^ 85) | i66;
                int i68 = (i66 & i67) + (i67 | i66);
                f57083b = i68 % 128;
                int i69 = i68 % 2;
                zBooleanValue = true;
            }
        } else {
            int i310 = f57082a;
            int i311 = i310 & 21;
            int i312 = (i310 ^ 21) | i311;
            int i313 = (i311 & i312) + (i312 | i311);
            f57083b = i313 % 128;
            int i314 = i313 % 2;
            zBooleanValue = true;
        }
        if (((Boolean) ao.setY(new Object[]{aoVar}, 1416983743, -1416983736, System.identityHashCode(aoVar))).booleanValue()) {
            int i70 = f57082a;
            int i71 = (((i70 | 58) << 1) - (i70 ^ 58)) - 1;
            int i72 = i71 % 128;
            f57083b = i72;
            int i73 = i71 % 2;
            if (!(!zBooleanValue)) {
                int i74 = i72 ^ 119;
                int i75 = ((i72 & 119) | i74) << 1;
                int i76 = -i74;
                int i77 = (i75 ^ i76) + ((i76 & i75) << 1);
                f57082a = i77 % 128;
                int i78 = i77 % 2;
                int i79 = (i72 & 107) + (i72 | 107);
                f57082a = i79 % 128;
                int i80 = i79 % 2;
                return Boolean.TRUE;
            }
        }
        int i81 = f57083b;
        int i82 = (i81 ^ 123) + ((i81 & 123) << 1);
        f57082a = i82 % 128;
        if (i82 % 2 == 0) {
            return Boolean.FALSE;
        }
        int i83 = 40 / 0;
        return Boolean.FALSE;
    }
}
