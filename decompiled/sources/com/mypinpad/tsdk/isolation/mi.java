package com.mypinpad.tsdk.isolation;

import com.bbva.sl.ar.core.libmcrypt.exception.ErrorCodes;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@SourceDebugExtension({"SMAP\nAttestation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Attestation.kt\ncom/mypinpad/tsdk/internal/attestation/AttestationKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,378:1\n766#2:379\n857#2,2:380\n2624#2,3:382\n*S KotlinDebug\n*F\n+ 1 Attestation.kt\ncom/mypinpad/tsdk/internal/attestation/AttestationKt\n*L\n299#1:379\n299#1:380,2\n306#1:382,3\n*E\n"})
public final class mi {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f57084a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f57085b = 1;

    public /* synthetic */ class setX {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int f57086a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f57087b;
        public static final /* synthetic */ int[] setY;

        static {
            int[] iArr = new int[getTransactionPortrait.values().length];
            try {
                iArr[getTransactionPortrait.setY.ordinal()] = 1;
                int i10 = (0 - (-10)) - 1;
                f57087b = i10 % 128;
                int i11 = i10 % 2;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[getTransactionPortrait.setNavigationOnClickListener.ordinal()] = 2;
                int i12 = f57086a;
                int i13 = ((i12 ^ 46) + ((i12 & 46) << 1)) - 1;
                f57087b = i13 % 128;
                int i14 = i13 % 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[getTransactionPortrait.setDividerPadding.ordinal()] = 3;
                int i15 = f57086a;
                int i16 = ((((i15 ^ 121) | (i15 & 121)) << 1) - (~(-(((~i15) & 121) | (i15 & (-122)))))) - 1;
                f57087b = i16 % 128;
                int i17 = i16 % 2;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[getTransactionPortrait.setOnFocusChangeListener.ordinal()] = 4;
                int i18 = f57087b;
                int i19 = i18 & 109;
                int i20 = ((i18 ^ 109) | i19) << 1;
                int i21 = -((i18 | 109) & (~i19));
                int i22 = ((i20 | i21) << 1) - (i21 ^ i20);
                f57086a = i22 % 128;
                int i23 = i22 % 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[getTransactionPortrait.setOnDragListener.ordinal()] = 5;
                int i24 = f57086a;
                int i25 = (i24 ^ 35) + ((i24 & 35) << 1);
                f57087b = i25 % 128;
                int i26 = i25 % 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[getTransactionPortrait.getNavBarTitleString.ordinal()] = 6;
                int i27 = f57086a;
                int i28 = ((i27 ^ 96) + ((i27 & 96) << 1)) - 1;
                f57087b = i28 % 128;
                int i29 = i28 % 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[getTransactionPortrait.setAlwaysDrawnWithCacheEnabled.ordinal()] = 7;
                int i30 = f57087b + 115;
                f57086a = i30 % 128;
                int i31 = i30 % 2;
            } catch (NoSuchFieldError unused7) {
            }
            setY = iArr;
            int i32 = f57086a;
            int i33 = i32 & 85;
            int i34 = (i32 ^ 85) | i33;
            int i35 = ((i33 | i34) << 1) - (i34 ^ i33);
            f57087b = i35 % 128;
            int i36 = i35 % 2;
        }
    }

    public static /* synthetic */ Boolean a(Object[] objArr) {
        hashCode.setX setx = (hashCode.setX) objArr[0];
        int i10 = f57085b;
        int i11 = ((i10 | 67) << 1) - (i10 ^ 67);
        f57084a = i11 % 128;
        int i12 = i11 % 2;
        List list = (List) hashCode.setX.setX(new Object[]{setx}, 1826201742, -1826201742, System.identityHashCode(setx));
        if (list == null) {
            int i13 = f57085b;
            int i14 = (i13 & 13) + (i13 | 13);
            f57084a = i14 % 128;
            if (i14 % 2 == 0) {
                return Boolean.FALSE;
            }
            int i15 = 6 / 0;
            return Boolean.FALSE;
        }
        int i16 = f57085b;
        int i17 = i16 & 99;
        int i18 = (i17 - (~(-(-((i16 ^ 99) | i17))))) - 1;
        f57084a = i18 % 128;
        List<setAutoSizeTextTypeUniformWithPresetSizes> list2 = list;
        if (i18 % 2 != 0) {
            boolean z10 = list2 instanceof Collection;
            throw null;
        }
        if (!(list2 instanceof Collection) || !list2.isEmpty()) {
            int i19 = f57085b;
            int i20 = i19 ^ 75;
            int i21 = ((i19 & 75) | i20) << 1;
            int i22 = -i20;
            int i23 = (i21 ^ i22) + ((i21 & i22) << 1);
            f57084a = i23 % 128;
            int i24 = i23 % 2;
            for (setAutoSizeTextTypeUniformWithPresetSizes setautosizetexttypeuniformwithpresetsizes : list2) {
                int i25 = f57085b + 104;
                int i26 = (i25 ^ (-1)) + (i25 << 1);
                f57084a = i26 % 128;
                int i27 = i26 % 2;
                if (!((Boolean) setAutoSizeTextTypeUniformWithPresetSizes.setCompoundDrawableTintBlendMode(new Object[]{setautosizetexttypeuniformwithpresetsizes}, -418746983, 418746985, System.identityHashCode(setautosizetexttypeuniformwithpresetsizes))).booleanValue()) {
                    int i28 = f57084a;
                    int i29 = (((i28 ^ 113) | (i28 & 113)) << 1) - (((~i28) & 113) | (i28 & (-114)));
                    f57085b = i29 % 128;
                    int i30 = i29 % 2;
                    if (((getTransactionPortrait) setAutoSizeTextTypeUniformWithPresetSizes.setCompoundDrawableTintBlendMode(new Object[]{setautosizetexttypeuniformwithpresetsizes}, -2144215474, 2144215475, System.identityHashCode(setautosizetexttypeuniformwithpresetsizes))) != getTransactionPortrait.getAmountFieldTextColor) {
                        int i31 = f57084a;
                        int i32 = i31 ^ 47;
                        int i33 = ((i31 & 47) | i32) << 1;
                        int i34 = -i32;
                        int i35 = (i33 & i34) + (i34 | i33);
                        f57085b = i35 % 128;
                        int i36 = i35 % 2;
                        int i37 = (((i31 | 76) << 1) - (i31 ^ 76)) - 1;
                        f57085b = i37 % 128;
                        int i38 = i37 % 2;
                        int i39 = (((i31 | 61) << 1) - (~(-(i31 ^ 61)))) - 1;
                        int i40 = i39 % 128;
                        f57085b = i40;
                        int i41 = i39 % 2;
                        int i42 = i40 + 103;
                        f57084a = i42 % 128;
                        int i43 = i42 % 2;
                        return Boolean.FALSE;
                    }
                }
                int i44 = f57085b;
                int i45 = (((i44 & (-124)) | ((~i44) & 123)) - (~(-(-((i44 & 123) << 1))))) - 1;
                f57084a = i45 % 128;
                int i46 = i45 % 2;
            }
        }
        int i47 = f57085b;
        int i48 = i47 & 55;
        int i49 = (i47 ^ 55) | i48;
        int i50 = (i48 & i49) + (i49 | i48);
        f57084a = i50 % 128;
        int i51 = i50 % 2;
        return Boolean.TRUE;
    }

    public static /* synthetic */ Boolean b(Object[] objArr) {
        vf vfVar;
        rk rkVar;
        vj vjVar = (vj) objArr[0];
        int i10 = f57084a;
        int i11 = (i10 & 39) + (i10 | 39);
        f57085b = i11 % 128;
        if (i11 % 2 == 0) {
            Intrinsics.checkNotNullParameter(vjVar, "");
            boolean z10 = vjVar instanceof vf;
            throw null;
        }
        Intrinsics.checkNotNullParameter(vjVar, "");
        if (vjVar instanceof vf) {
            int i12 = f57085b;
            int i13 = i12 & 91;
            int i14 = (i12 ^ 91) | i13;
            int i15 = ((i13 | i14) << 1) - (i13 ^ i14);
            f57084a = i15 % 128;
            int i16 = i15 % 2;
            vfVar = (vf) vjVar;
            int i17 = i12 & 113;
            int i18 = ((i12 ^ 113) | i17) << 1;
            int i19 = -((i12 | 113) & (~i17));
            int i20 = (i18 & i19) + (i19 | i18);
            f57084a = i20 % 128;
            int i21 = i20 % 2;
        } else {
            int i22 = f57084a;
            int i23 = i22 & 117;
            int i24 = (i22 ^ 117) | i23;
            int i25 = ((i23 | i24) << 1) - (i24 ^ i23);
            f57085b = i25 % 128;
            int i26 = i25 % 2;
            vfVar = null;
        }
        if (vfVar != null) {
            int i27 = f57085b;
            int i28 = i27 ^ 35;
            int i29 = (((i27 & 35) | i28) << 1) - i28;
            f57084a = i29 % 128;
            int i30 = i29 % 2;
            rkVar = (rk) vf.setY(new Object[]{vfVar}, 2080870193, -2080870192, System.identityHashCode(vfVar));
            int i31 = f57085b;
            int i32 = i31 & 91;
            int i33 = (i31 | 91) & (~i32);
            int i34 = -(-(i32 << 1));
            int i35 = (i33 & i34) + (i33 | i34);
            f57084a = i35 % 128;
            int i36 = i35 % 2;
        } else {
            int i37 = (-2) - ((f57084a + 94) ^ (-1));
            f57085b = i37 % 128;
            int i38 = i37 % 2;
            rkVar = null;
        }
        if (rkVar == rk.setX) {
            int i39 = f57084a;
            int i40 = (((i39 | 120) << 1) - (i39 ^ 120)) - 1;
            f57085b = i40 % 128;
            int i41 = i40 % 2;
            return Boolean.TRUE;
        }
        int i42 = (-2) - ((f57085b + 32) ^ (-1));
        f57084a = i42 % 128;
        if (i42 % 2 == 0) {
            return Boolean.FALSE;
        }
        throw null;
    }

    public static /* synthetic */ Boolean c(Object[] objArr) {
        rn rnVar;
        rs rsVar = (rs) objArr[0];
        int i10 = f57084a + 36;
        int i11 = (i10 ^ (-1)) + (i10 << 1);
        f57085b = i11 % 128;
        int i12 = i11 % 2;
        Intrinsics.checkNotNullParameter(rsVar, "");
        rq rqVar = null;
        if (rsVar instanceof rn) {
            int i13 = f57085b;
            int i14 = i13 | 87;
            int i15 = (i14 << 1) - ((~(i13 & 87)) & i14);
            int i16 = i15 % 128;
            f57084a = i16;
            rnVar = (rn) rsVar;
            if (i15 % 2 != 0) {
                throw null;
            }
            int i17 = ((i16 & 86) + (i16 | 86)) - 1;
            f57085b = i17 % 128;
            int i18 = i17 % 2;
        } else {
            int i19 = f57084a;
            int i20 = (((i19 & (-108)) | ((~i19) & 107)) - (~((i19 & 107) << 1))) - 1;
            f57085b = i20 % 128;
            int i21 = i20 % 2;
            rnVar = null;
        }
        if (rnVar != null) {
            int i22 = f57084a + 105;
            f57085b = i22 % 128;
            if (i22 % 2 == 0) {
                throw null;
            }
            rqVar = (rq) rn.setCompoundDrawableTintBlendMode(new Object[]{rnVar}, -1499104483, 1499104483, System.identityHashCode(rnVar));
            int i23 = f57084a;
            int i24 = (i23 & (-4)) | ((~i23) & 3);
            int i25 = (i23 & 3) << 1;
            int i26 = (i24 & i25) + (i25 | i24);
            f57085b = i26 % 128;
            int i27 = i26 % 2;
        } else {
            int i28 = f57085b;
            int i29 = (((i28 & (-76)) | ((~i28) & 75)) - (~((i28 & 75) << 1))) - 1;
            f57084a = i29 % 128;
            int i30 = i29 % 2;
        }
        if (rqVar == rq.setX) {
            int i31 = f57085b;
            int i32 = ((i31 ^ 83) | (i31 & 83)) << 1;
            int i33 = -(((~i31) & 83) | (i31 & (-84)));
            int i34 = ((i32 | i33) << 1) - (i33 ^ i32);
            f57084a = i34 % 128;
            return Boolean.valueOf(i34 % 2 == 0);
        }
        int i35 = f57084a;
        int i36 = i35 ^ 43;
        int i37 = (i35 & 43) << 1;
        int i38 = (i36 & i37) + (i37 | i36);
        f57085b = i38 % 128;
        if (i38 % 2 != 0) {
            return Boolean.FALSE;
        }
        int i39 = 0 / 0;
        return Boolean.FALSE;
    }

    public static final /* synthetic */ List setCompoundDrawableTintBlendMode(hashCode hashcode) {
        return (List) setX(new Object[]{hashcode}, -908642657, 908642670, (int) System.currentTimeMillis());
    }

    public static final boolean setDividerPadding(@NotNull rs rsVar) {
        return ((Boolean) setX(new Object[]{rsVar}, 1163131396, -1163131394, (int) System.currentTimeMillis())).booleanValue();
    }

    public static final boolean setOnFocusChangeListener(@NotNull vj vjVar) {
        return ((Boolean) setX(new Object[]{vjVar}, -594807234, 594807237, (int) System.currentTimeMillis())).booleanValue();
    }

    public static /* synthetic */ Object setX(Object[] objArr, int i10, int i11, int i12) {
        Object next;
        setAutoSizeTextTypeUniformWithPresetSizes setautosizetexttypeuniformwithpresetsizes;
        Object obj;
        ps psVar;
        vk vkVar;
        int i13 = ~i10;
        int i14 = ~i11;
        int i15 = ((~(i13 | i14)) * ErrorCodes.ERR_CRY_IO_PROPERTIES) + (i11 * (-209)) + (i10 * (-209));
        int i16 = ~i12;
        ri riVar = null;
        switch ((((~(i10 | i14 | i12)) | (~(i11 | i13 | i16))) * ErrorCodes.ERR_CRY_IO_PROPERTIES) + (((~(i14 | i16)) | (~(i13 | i12))) * ErrorCodes.ERR_CRY_IO_PROPERTIES) + i15) {
            case 1:
                getTransactionPortrait gettransactionportrait = (getTransactionPortrait) objArr[0];
                int i17 = f57084a;
                int i18 = (((i17 & (-24)) | ((~i17) & 23)) - (~(-(-((i17 & 23) << 1))))) - 1;
                f57085b = i18 % 128;
                int i19 = i18 % 2;
                switch (setX.setY[gettransactionportrait.ordinal()]) {
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                        int i20 = f57084a;
                        int i21 = (i20 ^ 39) + ((i20 & 39) << 1);
                        f57085b = i21 % 128;
                        int i22 = i21 % 2;
                        return Boolean.TRUE;
                    default:
                        int i23 = f57084a + 105;
                        f57085b = i23 % 128;
                        int i24 = i23 % 2;
                        return Boolean.FALSE;
                }
            case 2:
                return c(objArr);
            case 3:
                return b(objArr);
            case 4:
                return a(objArr);
            case 5:
                hashCode hashcode = (hashCode) objArr[0];
                int i25 = f57085b;
                int i26 = ((i25 & 54) + (i25 | 54)) - 1;
                int i27 = i26 % 128;
                f57084a = i27;
                int i28 = i26 % 2;
                if (!(!(hashcode instanceof hashCode.setX))) {
                    int i29 = (i27 & 27) + (i27 | 27);
                    f57085b = i29 % 128;
                    int i30 = i29 % 2;
                    hashCode.setX setx = (hashCode.setX) hashcode;
                    List list = (List) hashCode.setX.setX(new Object[]{setx}, 1826201742, -1826201742, System.identityHashCode(setx));
                    if (list != null) {
                        ArrayList arrayList = new ArrayList();
                        Iterator it = list.iterator();
                        int i31 = f57085b;
                        int i32 = i31 & 121;
                        int i33 = (i31 ^ 121) | i32;
                        int i34 = (i32 ^ i33) + ((i33 & i32) << 1);
                        f57084a = i34 % 128;
                        while (true) {
                            int i35 = i34 % 2;
                            do {
                                if (!it.hasNext()) {
                                    int i36 = f57084a;
                                    int i37 = ((i36 ^ 83) | (i36 & 83)) << 1;
                                    int i38 = -(((~i36) & 83) | (i36 & (-84)));
                                    int i39 = (i37 & i38) + (i38 | i37);
                                    f57085b = i39 % 128;
                                    int i40 = i39 % 2;
                                    obj = arrayList;
                                } else {
                                    int i41 = f57085b + 91;
                                    f57084a = i41 % 128;
                                    if (i41 % 2 != 0) {
                                        setAutoSizeTextTypeUniformWithPresetSizes setautosizetexttypeuniformwithpresetsizes2 = (setAutoSizeTextTypeUniformWithPresetSizes) it.next();
                                        ((Boolean) setX(new Object[]{(getTransactionPortrait) setAutoSizeTextTypeUniformWithPresetSizes.setCompoundDrawableTintBlendMode(new Object[]{setautosizetexttypeuniformwithpresetsizes2}, -2144215474, 2144215475, System.identityHashCode(setautosizetexttypeuniformwithpresetsizes2))}, -465185626, 465185627, (int) System.currentTimeMillis())).booleanValue();
                                        throw null;
                                    }
                                    next = it.next();
                                    setautosizetexttypeuniformwithpresetsizes = (setAutoSizeTextTypeUniformWithPresetSizes) next;
                                }
                                break;
                            } while (!((Boolean) setX(new Object[]{(getTransactionPortrait) setAutoSizeTextTypeUniformWithPresetSizes.setCompoundDrawableTintBlendMode(new Object[]{setautosizetexttypeuniformwithpresetsizes}, -2144215474, 2144215475, System.identityHashCode(setautosizetexttypeuniformwithpresetsizes))}, -465185626, 465185627, (int) System.currentTimeMillis())).booleanValue());
                            arrayList.add(next);
                            int i42 = f57084a;
                            int i43 = i42 & 99;
                            int i44 = (i42 ^ 99) | i43;
                            i34 = ((i43 | i44) << 1) - (i44 ^ i43);
                            f57085b = i34 % 128;
                        }
                    } else {
                        int i45 = f57085b;
                        int i46 = ((i45 & 20) + (i45 | 20)) - 1;
                        f57084a = i46 % 128;
                        int i47 = i46 % 2;
                    }
                }
                List listEmptyList = CollectionsKt__CollectionsKt.emptyList();
                int i48 = f57085b;
                int i49 = i48 ^ 11;
                int i50 = ((i48 & 11) | i49) << 1;
                int i51 = -i49;
                int i52 = ((i50 | i51) << 1) - (i50 ^ i51);
                f57084a = i52 % 128;
                int i53 = i52 % 2;
                return listEmptyList;
            case 6:
                hashCode.setX setx2 = (hashCode.setX) objArr[0];
                int i54 = f57085b;
                int i55 = i54 ^ 15;
                int i56 = ((((i54 & 15) | i55) << 1) - (~(-i55))) - 1;
                f57084a = i56 % 128;
                if (i56 % 2 != 0) {
                    Intrinsics.checkNotNullParameter(setx2, "");
                    ((Boolean) setX(new Object[]{setx2}, -1909287511, 1909287511, (int) System.currentTimeMillis())).booleanValue();
                    throw null;
                }
                Intrinsics.checkNotNullParameter(setx2, "");
                if (((Boolean) setX(new Object[]{setx2}, -1909287511, 1909287511, (int) System.currentTimeMillis())).booleanValue()) {
                    int i57 = f57084a;
                    int i58 = ((i57 | 85) << 1) - (i57 ^ 85);
                    f57085b = i58 % 128;
                    if (i58 % 2 != 0) {
                        return rk.setX;
                    }
                    rk rkVar = rk.setDividerPadding;
                    throw null;
                }
                rk rkVar2 = rk.setY;
                int i59 = f57085b;
                int i60 = (i59 | 3) << 1;
                int i61 = -(((~i59) & 3) | (i59 & (-4)));
                int i62 = ((i60 | i61) << 1) - (i61 ^ i60);
                f57084a = i62 % 128;
                int i63 = i62 % 2;
                return rkVar2;
            case 7:
                List list2 = (List) objArr[0];
                int i64 = f57084a;
                int i65 = i64 & 101;
                int i66 = i65 + ((i64 ^ 101) | i65);
                f57085b = i66 % 128;
                int i67 = i66 % 2;
                setAutoSizeTextTypeUniformWithPresetSizes.Companion companion = setAutoSizeTextTypeUniformWithPresetSizes.INSTANCE;
                getDynamicButtonIconTextSpacingDp y7 = getDisplayExponent.setY((String) setAutoSizeTextTypeUniformWithPresetSizes.Companion.setCompoundDrawableTintBlendMode(new Object[]{list2}, -698795434, 698795434, (int) System.currentTimeMillis()));
                int i68 = f57084a;
                int i69 = (i68 ^ 24) + ((i68 & 24) << 1);
                int i70 = (i69 ^ (-1)) + (i69 << 1);
                f57085b = i70 % 128;
                int i71 = i70 % 2;
                return y7;
            case 8:
                hashCode.setX setx3 = (hashCode.setX) objArr[0];
                int i72 = f57084a;
                int i73 = (i72 & (-34)) | ((~i72) & 33);
                int i74 = (i72 & 33) << 1;
                int i75 = ((i73 | i74) << 1) - (i74 ^ i73);
                f57085b = i75 % 128;
                int i76 = i75 % 2;
                Intrinsics.checkNotNullParameter(setx3, "");
                if (((Boolean) setX(new Object[]{setx3}, -1909287511, 1909287511, (int) System.currentTimeMillis())).booleanValue()) {
                    int i77 = f57085b;
                    int i78 = ((i77 | 117) << 1) - (i77 ^ 117);
                    f57084a = i78 % 128;
                    if (i78 % 2 != 0) {
                        pr prVar = pr.INSTANCE;
                        throw null;
                    }
                    pr prVar2 = pr.INSTANCE;
                    int i79 = f57085b;
                    int i80 = i79 & 69;
                    int i81 = (i79 ^ 69) | i80;
                    int i82 = (i80 ^ i81) + ((i81 & i80) << 1);
                    f57084a = i82 % 128;
                    int i83 = i82 % 2;
                    return prVar2;
                }
                psVar = new ps(new oo((String) hashCode.setX.setX(new Object[]{setx3}, 1995127706, -1995127705, System.identityHashCode(setx3))));
                int i84 = f57085b;
                int i85 = i84 & 87;
                int i86 = ((i84 ^ 87) | i85) << 1;
                int i87 = -((i84 | 87) & (~i85));
                int i88 = (i86 ^ i87) + ((i87 & i86) << 1);
                f57084a = i88 % 128;
                if (i88 % 2 != 0) {
                    obj = psVar;
                    int i89 = 27 / 0;
                    obj = psVar;
                }
                break;
            case 9:
                hashCode.setX setx4 = (hashCode.setX) objArr[0];
                int i90 = f57085b + 49;
                f57084a = i90 % 128;
                if (i90 % 2 != 0) {
                    Intrinsics.checkNotNullParameter(setx4, "");
                    ((Boolean) setX(new Object[]{setx4}, -1909287511, 1909287511, (int) System.currentTimeMillis())).booleanValue();
                    throw null;
                }
                Intrinsics.checkNotNullParameter(setx4, "");
                if (!((Boolean) setX(new Object[]{setx4}, -1909287511, 1909287511, (int) System.currentTimeMillis())).booleanValue()) {
                    ri riVar2 = ri.setY;
                    int i91 = f57085b;
                    int i92 = (((i91 | 66) << 1) - (i91 ^ 66)) - 1;
                    f57084a = i92 % 128;
                    int i93 = i92 % 2;
                    return riVar2;
                }
                ri riVar3 = ri.setCompoundDrawableTintBlendMode;
                int i94 = f57085b;
                int i95 = i94 & 21;
                int i96 = (i94 | 21) & (~i95);
                int i97 = -(-(i95 << 1));
                int i98 = ((i96 | i97) << 1) - (i96 ^ i97);
                f57084a = i98 % 128;
                int i99 = i98 % 2;
                return riVar3;
            case 10:
                vr vrVar = (vr) objArr[0];
                int i100 = f57084a;
                int i101 = i100 & 25;
                int i102 = (((i100 | 25) & (~i101)) - (~(-(-(i101 << 1))))) - 1;
                f57085b = i102 % 128;
                if (i102 % 2 == 0) {
                    Intrinsics.checkNotNullParameter(vrVar, "");
                    boolean z10 = vrVar instanceof vk;
                    throw null;
                }
                Intrinsics.checkNotNullParameter(vrVar, "");
                if (vrVar instanceof vk) {
                    vkVar = (vk) vrVar;
                    int i103 = f57085b;
                    int i104 = (i103 ^ 57) + ((i103 & 57) << 1);
                    f57084a = i104 % 128;
                    int i105 = i104 % 2;
                } else {
                    int i106 = f57085b;
                    int i107 = i106 & 69;
                    int i108 = -(-(i106 | 69));
                    int i109 = (i107 & i108) + (i108 | i107);
                    f57084a = i109 % 128;
                    int i110 = i109 % 2;
                    vkVar = null;
                }
                if (vkVar != null) {
                    int i111 = f57085b;
                    int i112 = (i111 ^ 125) + ((i111 & 125) << 1);
                    f57084a = i112 % 128;
                    int i113 = i112 % 2;
                    riVar = (ri) vk.setY(new Object[]{vkVar}, -404755490, 404755490, System.identityHashCode(vkVar));
                    int i114 = f57085b;
                    int i115 = i114 & 69;
                    int i116 = ((i114 ^ 69) | i115) << 1;
                    int i117 = -((i114 | 69) & (~i115));
                    int i118 = (i116 ^ i117) + ((i117 & i116) << 1);
                    f57084a = i118 % 128;
                    int i119 = i118 % 2;
                } else {
                    int i120 = f57085b + 47;
                    f57084a = i120 % 128;
                    int i121 = i120 % 2;
                }
                if (riVar != ri.setCompoundDrawableTintBlendMode) {
                    int i122 = f57085b;
                    int i123 = i122 & 109;
                    int i124 = (((i122 ^ 109) | i123) << 1) - ((i122 | 109) & (~i123));
                    f57084a = i124 % 128;
                    int i125 = i124 % 2;
                    return Boolean.FALSE;
                }
                int i126 = f57085b;
                int i127 = i126 & 7;
                int i128 = (i126 ^ 7) | i127;
                int i129 = (i127 ^ i128) + ((i127 & i128) << 1);
                f57084a = i129 % 128;
                int i130 = i129 % 2;
                int i131 = i126 & 39;
                int i132 = (i126 | 39) & (~i131);
                int i133 = -(-(i131 << 1));
                int i134 = (i132 & i133) + (i132 | i133);
                f57084a = i134 % 128;
                int i135 = i134 % 2;
                return Boolean.TRUE;
            case 11:
                List list3 = (List) objArr[0];
                int i136 = f57084a;
                int i137 = ((i136 & 79) - (~(-(-(i136 | 79))))) - 1;
                f57085b = i137 % 128;
                int i138 = i137 % 2;
                getDynamicButtonIconTextSpacingDp getdynamicbuttonicontextspacingdp = (getDynamicButtonIconTextSpacingDp) setX(new Object[]{list3}, -935671309, 935671316, (int) System.currentTimeMillis());
                int i139 = f57085b;
                int i140 = (i139 & 119) + (i139 | 119);
                f57084a = i140 % 128;
                int i141 = i140 % 2;
                return getdynamicbuttonicontextspacingdp;
            case 12:
                hashCode.setX setx5 = (hashCode.setX) objArr[0];
                int iCurrentTimeMillis = (int) System.currentTimeMillis();
                int i142 = ~iCurrentTimeMillis;
                int i143 = (i142 | iCurrentTimeMillis) & i142;
                int i144 = -(~(((i143 & 263219) | ((-263220) & i143) | ((~i143) & 263219)) * (-192)));
                int i145 = ((1559925187 ^ i144) + ((i144 & 1559925187) << 1)) - 1;
                int i146 = (-2147089097) & i142;
                int i147 = (~i146) & ((-2147089097) | i142);
                int i148 = ~((i147 & i146) | (i147 ^ i146));
                int i149 = ((~i148) & 130609288) | (i148 & (-130609289));
                int i150 = i148 & 130609288;
                int i151 = -(-(((i150 & i149) | (i149 ^ i150)) * (-384)));
                int i152 = i145 & i151;
                int i153 = ((i145 ^ i151) | i152) << 1;
                int i154 = -((i145 | i151) & (~i152));
                int i155 = (i153 & i154) + (i154 | i153);
                int i156 = ~(((-130609289) ^ iCurrentTimeMillis) | ((-130609289) & iCurrentTimeMillis));
                int i157 = (i142 ^ (-2147089097)) | i146;
                int i158 = i157 ^ 130872507;
                int i159 = i157 & 130872507;
                int i160 = ~((i159 & i158) | (i158 ^ i159));
                int i161 = i156 & i160;
                int i162 = (i160 | i156) & (~i161);
                int i163 = (i162 & i161) | (i162 ^ i161);
                int i164 = 2147352315 & iCurrentTimeMillis;
                int i165 = (iCurrentTimeMillis | 2147352315) & (~i164);
                int i166 = ~((i165 & i164) | (i165 ^ i164));
                int i167 = -(-(((i166 & i163) | (i163 ^ i166)) * 192));
                int i168 = ((~i167) & i155) | ((~i155) & i167);
                int i169 = (i167 & i155) << 1;
                int i170 = ((i168 | i169) << 1) - (i169 ^ i168);
                int iCurrentTimeMillis2 = (int) System.currentTimeMillis();
                int i171 = ~iCurrentTimeMillis2;
                int i172 = (i171 | iCurrentTimeMillis2) & i171;
                int i173 = (-1618014935) ^ i172;
                int i174 = i172 & (-1618014935);
                int i175 = ~((i174 & i173) | (i173 ^ i174));
                int i176 = (i175 & 1074798740) | (1074798740 ^ i175);
                int i177 = ~((iCurrentTimeMillis2 & (-8783146)) | ((-8783146) & i171) | (8783145 & iCurrentTimeMillis2));
                int i178 = (-2) - (((-880994367) - (~(-(~(-(-(((i176 & i177) | (i176 ^ i177)) * (-252)))))))) ^ (-1));
                int i179 = i178 & (-2081614504);
                int i180 = -(-((i178 ^ (-2081614504)) | i179));
                int i181 = (i179 ^ i180) + ((i180 & i179) << 1);
                int i182 = ((~i171) & (-1618014935)) | (1618014934 & i171);
                int i183 = i171 & (-1618014935);
                int i184 = (i183 & i182) | (i182 ^ i183);
                int i185 = i184 ^ (-551999340);
                int i186 = i184 & (-551999340);
                int i187 = ~((i186 & i185) | (i185 ^ i186));
                int i188 = i187 ^ i177;
                int i189 = i177 & i187;
                int i190 = ((i189 & i188) | (i188 ^ i189)) * 252;
                int i191 = i181 & i190;
                if (i170 > ((((i181 ^ i190) | i191) << 1) - (~(-((i190 | i181) & (~i191))))) - 1) {
                    Intrinsics.checkNotNullParameter(setx5, "");
                    ((Boolean) setX(new Object[]{setx5}, 1566660439, -1566660435, (int) System.currentTimeMillis())).booleanValue();
                    throw null;
                }
                Intrinsics.checkNotNullParameter(setx5, "");
                if (((Boolean) setX(new Object[]{setx5}, 1566660439, -1566660435, (int) System.currentTimeMillis())).booleanValue()) {
                    int i192 = f57085b + 91;
                    f57084a = i192 % 128;
                    if (i192 % 2 == 0) {
                        return rq.getNavBarTitleString;
                    }
                    int i193 = 37 / 0;
                    return rq.getNavBarTitleString;
                }
                if (!((Boolean) setX(new Object[]{setx5}, -1909287511, 1909287511, (int) System.currentTimeMillis())).booleanValue()) {
                    rq rqVar = rq.setY;
                    int i194 = f57084a;
                    int i195 = i194 & 105;
                    int i196 = (i195 - (~((i194 ^ 105) | i195))) - 1;
                    f57085b = i196 % 128;
                    int i197 = i196 % 2;
                    return rqVar;
                }
                int i198 = f57085b;
                int i199 = ((i198 ^ 115) | (i198 & 115)) << 1;
                int i200 = -(((~i198) & 115) | (i198 & (-116)));
                int i201 = ((i199 | i200) << 1) - (i200 ^ i199);
                f57084a = i201 % 128;
                int i202 = i201 % 2;
                rq rqVar2 = rq.setX;
                int i203 = f57085b;
                int i204 = i203 & 7;
                int i205 = ((i203 | 7) & (~i204)) + (i204 << 1);
                f57084a = i205 % 128;
                int i206 = i205 % 2;
                return rqVar2;
            case 13:
                hashCode hashcode2 = (hashCode) objArr[0];
                int i207 = f57085b;
                int i208 = (i207 ^ 119) + ((i207 & 119) << 1);
                f57084a = i208 % 128;
                Object[] objArr2 = new Object[1];
                if (i208 % 2 != 0) {
                    objArr2[0] = hashcode2;
                    throw null;
                }
                objArr2[0] = hashcode2;
                List list4 = (List) setX(objArr2, 378428592, -378428587, (int) System.currentTimeMillis());
                int i209 = f57085b + 7;
                f57084a = i209 % 128;
                int i210 = i209 % 2;
                return list4;
            default:
                hashCode.setX setx6 = (hashCode.setX) objArr[0];
                int i211 = f57084a;
                int i212 = (i211 ^ 85) + ((i211 & 85) << 1);
                f57085b = i212 % 128;
                int i213 = i212 % 2;
                Intrinsics.checkNotNullParameter(setx6, "");
                if (((List) setX(new Object[]{setx6}, 378428592, -378428587, (int) System.currentTimeMillis())).isEmpty()) {
                    int i214 = f57085b + 21;
                    f57084a = i214 % 128;
                    if (i214 % 2 != 0) {
                        int i215 = 72 / 0;
                    }
                    return Boolean.FALSE;
                }
                int iCurrentTimeMillis3 = (int) System.currentTimeMillis();
                int i216 = 342173448 & iCurrentTimeMillis3;
                int i217 = (~i216) & (342173448 | iCurrentTimeMillis3);
                int i218 = ~iCurrentTimeMillis3;
                int i219 = ~((i217 & i216) | (i217 ^ i216));
                int i220 = (i219 & 1770557461) | ((~i219) & 1770557461) | ((-1770557462) & i219);
                int i221 = (-2110566686) & iCurrentTimeMillis3;
                int i222 = ~((((-2110566686) | iCurrentTimeMillis3) & (~i221)) | i221);
                int i223 = i220 & i222;
                int i224 = (i220 | i222) & (~i223);
                int i225 = ((i224 & i223) | (i224 ^ i223)) * (-880);
                int i226 = (-1118687532) & i225;
                int i227 = (i225 | (-1118687532)) & (~i226);
                int i228 = i226 << 1;
                int i229 = (i227 & i228) + (i227 | i228);
                int i230 = i218 & (-342173449);
                int i231 = ~((342173448 & i218) | ((~i218) & 342173448) | i230);
                int i232 = 2110566685 ^ i231;
                int i233 = i231 & 2110566685;
                int i234 = (i233 & i232) | (i232 ^ i233);
                int i235 = (-342173449) & iCurrentTimeMillis3;
                int i236 = (iCurrentTimeMillis3 | (-342173449)) & (~i235);
                int i237 = ~((i236 & i235) | (i236 ^ i235));
                int i238 = i234 & i237;
                int i239 = (i237 | i234) & (~i238);
                int i240 = -(~(-(-(((i239 & i238) | (i239 ^ i238)) * (-880)))));
                int i241 = ((i229 & i240) + (i240 | i229)) - 1;
                int i242 = i230 | i216;
                int i243 = (~((i242 & i235) | (i242 ^ i235))) * 880;
                int i244 = ((~i243) & i241) | ((~i241) & i243);
                int i245 = (i243 & i241) << 1;
                int i246 = (i244 & i245) + (i245 | i244);
                int iCurrentTimeMillis4 = (int) System.currentTimeMillis();
                int i247 = ~iCurrentTimeMillis4;
                int i248 = (i247 & 183375761) | ((~i247) & 183375761) | ((-183375762) & i247);
                int i249 = -(~((~((i248 & (-241184176)) | (241184175 & i248) | ((~i248) & (-241184176)))) * 130));
                int i250 = ((((-1499400710) | i249) << 1) - (i249 ^ (-1499400710))) - 1;
                int i251 = (i250 ^ (-271109816)) + (((-271109816) & i250) << 1);
                int i252 = ~((iCurrentTimeMillis4 & (-67119151)) | ((-67119151) ^ iCurrentTimeMillis4));
                int i253 = 9310736 ^ i252;
                int i254 = i252 & 9310736;
                int i255 = ((i254 & i253) | (i253 ^ i254)) * 130;
                return Boolean.valueOf(i246 > (((i251 ^ i255) | (i251 & i255)) << 1) - ((i255 & (~i251)) | ((~i255) & i251)));
        }
        obj = psVar;
        return obj;
    }

    @NotNull
    public static final px setY(@NotNull hashCode.setX setx) {
        return (px) setX(new Object[]{setx}, -598260002, 598260010, (int) System.currentTimeMillis());
    }

    public static final /* synthetic */ getDynamicButtonIconTextSpacingDp setCompoundDrawableTintBlendMode(List list) {
        return (getDynamicButtonIconTextSpacingDp) setX(new Object[]{list}, -456774774, 456774785, (int) System.currentTimeMillis());
    }

    @NotNull
    public static final ri setDividerPadding(@NotNull hashCode.setX setx) {
        return (ri) setX(new Object[]{setx}, -585522747, 585522756, (int) System.currentTimeMillis());
    }

    @NotNull
    public static final rk setOnFocusChangeListener(@NotNull hashCode.setX setx) {
        return (rk) setX(new Object[]{setx}, 1277052993, -1277052987, (int) System.currentTimeMillis());
    }

    public static final boolean setCompoundDrawableTintBlendMode(@NotNull vr vrVar) {
        return ((Boolean) setX(new Object[]{vrVar}, -355129756, 355129766, (int) System.currentTimeMillis())).booleanValue();
    }

    @NotNull
    public static final rq setCompoundDrawableTintBlendMode(@NotNull hashCode.setX setx) {
        return (rq) setX(new Object[]{setx}, -280726533, 280726545, (int) System.currentTimeMillis());
    }
}
