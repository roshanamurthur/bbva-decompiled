package com.mypinpad.tsdk.isolation;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
public final class setLayerPaint {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f59960b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static int f59961c = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public getBeepOnFailure f59962a;

    public setLayerPaint(@NotNull byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "");
        setOnFocusChangeListener(new Object[]{this, bArr}, -263695367, 263695368, System.identityHashCode(this));
    }

    /* JADX WARN: Code duplicated, block: B:100:0x037a  */
    /* JADX WARN: Code duplicated, block: B:103:0x03c6  */
    /* JADX WARN: Code duplicated, block: B:111:0x042f  */
    /* JADX WARN: Code duplicated, block: B:113:0x0449 A[Catch: Exception -> 0x048f, TRY_ENTER, TRY_LEAVE, TryCatch #0 {Exception -> 0x048f, blocks: (B:5:0x0044, B:15:0x00c1, B:17:0x00f0, B:109:0x0428, B:113:0x0449, B:115:0x0460, B:117:0x0464, B:23:0x0116, B:27:0x011a, B:32:0x016c, B:38:0x017f, B:43:0x01be, B:47:0x01c2, B:53:0x01e9, B:57:0x01ed, B:58:0x01f8, B:61:0x0207, B:63:0x0253, B:65:0x0281, B:67:0x0288, B:71:0x029a, B:73:0x02ad, B:76:0x02c3, B:91:0x0344, B:93:0x036a, B:95:0x036e, B:80:0x0307, B:82:0x030b, B:101:0x0394, B:104:0x03de, B:125:0x0482, B:126:0x048e, B:10:0x0074, B:13:0x00a5), top: B:131:0x0044 }] */
    /* JADX WARN: Code duplicated, block: B:115:0x0460 A[Catch: Exception -> 0x048f, TRY_ENTER, TRY_LEAVE, TryCatch #0 {Exception -> 0x048f, blocks: (B:5:0x0044, B:15:0x00c1, B:17:0x00f0, B:109:0x0428, B:113:0x0449, B:115:0x0460, B:117:0x0464, B:23:0x0116, B:27:0x011a, B:32:0x016c, B:38:0x017f, B:43:0x01be, B:47:0x01c2, B:53:0x01e9, B:57:0x01ed, B:58:0x01f8, B:61:0x0207, B:63:0x0253, B:65:0x0281, B:67:0x0288, B:71:0x029a, B:73:0x02ad, B:76:0x02c3, B:91:0x0344, B:93:0x036a, B:95:0x036e, B:80:0x0307, B:82:0x030b, B:101:0x0394, B:104:0x03de, B:125:0x0482, B:126:0x048e, B:10:0x0074, B:13:0x00a5), top: B:131:0x0044 }] */
    /* JADX WARN: Code duplicated, block: B:123:0x047c  */
    /* JADX WARN: Code duplicated, block: B:125:0x0482 A[Catch: Exception -> 0x048f, TRY_ENTER, TryCatch #0 {Exception -> 0x048f, blocks: (B:5:0x0044, B:15:0x00c1, B:17:0x00f0, B:109:0x0428, B:113:0x0449, B:115:0x0460, B:117:0x0464, B:23:0x0116, B:27:0x011a, B:32:0x016c, B:38:0x017f, B:43:0x01be, B:47:0x01c2, B:53:0x01e9, B:57:0x01ed, B:58:0x01f8, B:61:0x0207, B:63:0x0253, B:65:0x0281, B:67:0x0288, B:71:0x029a, B:73:0x02ad, B:76:0x02c3, B:91:0x0344, B:93:0x036a, B:95:0x036e, B:80:0x0307, B:82:0x030b, B:101:0x0394, B:104:0x03de, B:125:0x0482, B:126:0x048e, B:10:0x0074, B:13:0x00a5), top: B:131:0x0044 }] */
    /* JADX WARN: Code duplicated, block: B:134:0x0116 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:136:0x01e9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:144:0x01be A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:146:0x0307 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:147:0x0372 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:148:0x036a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:150:0x0372 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:151:0x032d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:157:0x03f1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:158:0x030f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:159:0x02ed A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:17:0x00f0 A[Catch: Exception -> 0x048f, TRY_LEAVE, TryCatch #0 {Exception -> 0x048f, blocks: (B:5:0x0044, B:15:0x00c1, B:17:0x00f0, B:109:0x0428, B:113:0x0449, B:115:0x0460, B:117:0x0464, B:23:0x0116, B:27:0x011a, B:32:0x016c, B:38:0x017f, B:43:0x01be, B:47:0x01c2, B:53:0x01e9, B:57:0x01ed, B:58:0x01f8, B:61:0x0207, B:63:0x0253, B:65:0x0281, B:67:0x0288, B:71:0x029a, B:73:0x02ad, B:76:0x02c3, B:91:0x0344, B:93:0x036a, B:95:0x036e, B:80:0x0307, B:82:0x030b, B:101:0x0394, B:104:0x03de, B:125:0x0482, B:126:0x048e, B:10:0x0074, B:13:0x00a5), top: B:131:0x0044 }] */
    /* JADX WARN: Code duplicated, block: B:19:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:21:0x0104  */
    /* JADX WARN: Code duplicated, block: B:27:0x011a A[Catch: Exception -> 0x048f, TRY_ENTER, TRY_LEAVE, TryCatch #0 {Exception -> 0x048f, blocks: (B:5:0x0044, B:15:0x00c1, B:17:0x00f0, B:109:0x0428, B:113:0x0449, B:115:0x0460, B:117:0x0464, B:23:0x0116, B:27:0x011a, B:32:0x016c, B:38:0x017f, B:43:0x01be, B:47:0x01c2, B:53:0x01e9, B:57:0x01ed, B:58:0x01f8, B:61:0x0207, B:63:0x0253, B:65:0x0281, B:67:0x0288, B:71:0x029a, B:73:0x02ad, B:76:0x02c3, B:91:0x0344, B:93:0x036a, B:95:0x036e, B:80:0x0307, B:82:0x030b, B:101:0x0394, B:104:0x03de, B:125:0x0482, B:126:0x048e, B:10:0x0074, B:13:0x00a5), top: B:131:0x0044 }] */
    /* JADX WARN: Code duplicated, block: B:29:0x0153  */
    /* JADX WARN: Code duplicated, block: B:31:0x016a  */
    /* JADX WARN: Code duplicated, block: B:38:0x017f A[Catch: Exception -> 0x048f, TRY_ENTER, TRY_LEAVE, TryCatch #0 {Exception -> 0x048f, blocks: (B:5:0x0044, B:15:0x00c1, B:17:0x00f0, B:109:0x0428, B:113:0x0449, B:115:0x0460, B:117:0x0464, B:23:0x0116, B:27:0x011a, B:32:0x016c, B:38:0x017f, B:43:0x01be, B:47:0x01c2, B:53:0x01e9, B:57:0x01ed, B:58:0x01f8, B:61:0x0207, B:63:0x0253, B:65:0x0281, B:67:0x0288, B:71:0x029a, B:73:0x02ad, B:76:0x02c3, B:91:0x0344, B:93:0x036a, B:95:0x036e, B:80:0x0307, B:82:0x030b, B:101:0x0394, B:104:0x03de, B:125:0x0482, B:126:0x048e, B:10:0x0074, B:13:0x00a5), top: B:131:0x0044 }] */
    /* JADX WARN: Code duplicated, block: B:40:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:47:0x01c2 A[Catch: Exception -> 0x048f, TRY_ENTER, TRY_LEAVE, TryCatch #0 {Exception -> 0x048f, blocks: (B:5:0x0044, B:15:0x00c1, B:17:0x00f0, B:109:0x0428, B:113:0x0449, B:115:0x0460, B:117:0x0464, B:23:0x0116, B:27:0x011a, B:32:0x016c, B:38:0x017f, B:43:0x01be, B:47:0x01c2, B:53:0x01e9, B:57:0x01ed, B:58:0x01f8, B:61:0x0207, B:63:0x0253, B:65:0x0281, B:67:0x0288, B:71:0x029a, B:73:0x02ad, B:76:0x02c3, B:91:0x0344, B:93:0x036a, B:95:0x036e, B:80:0x0307, B:82:0x030b, B:101:0x0394, B:104:0x03de, B:125:0x0482, B:126:0x048e, B:10:0x0074, B:13:0x00a5), top: B:131:0x0044 }] */
    /* JADX WARN: Code duplicated, block: B:50:0x01d9  */
    /* JADX WARN: Code duplicated, block: B:57:0x01ed A[Catch: Exception -> 0x048f, TRY_ENTER, TryCatch #0 {Exception -> 0x048f, blocks: (B:5:0x0044, B:15:0x00c1, B:17:0x00f0, B:109:0x0428, B:113:0x0449, B:115:0x0460, B:117:0x0464, B:23:0x0116, B:27:0x011a, B:32:0x016c, B:38:0x017f, B:43:0x01be, B:47:0x01c2, B:53:0x01e9, B:57:0x01ed, B:58:0x01f8, B:61:0x0207, B:63:0x0253, B:65:0x0281, B:67:0x0288, B:71:0x029a, B:73:0x02ad, B:76:0x02c3, B:91:0x0344, B:93:0x036a, B:95:0x036e, B:80:0x0307, B:82:0x030b, B:101:0x0394, B:104:0x03de, B:125:0x0482, B:126:0x048e, B:10:0x0074, B:13:0x00a5), top: B:131:0x0044 }] */
    /* JADX WARN: Code duplicated, block: B:60:0x01fe  */
    /* JADX WARN: Code duplicated, block: B:63:0x0253 A[Catch: Exception -> 0x048f, TRY_LEAVE, TryCatch #0 {Exception -> 0x048f, blocks: (B:5:0x0044, B:15:0x00c1, B:17:0x00f0, B:109:0x0428, B:113:0x0449, B:115:0x0460, B:117:0x0464, B:23:0x0116, B:27:0x011a, B:32:0x016c, B:38:0x017f, B:43:0x01be, B:47:0x01c2, B:53:0x01e9, B:57:0x01ed, B:58:0x01f8, B:61:0x0207, B:63:0x0253, B:65:0x0281, B:67:0x0288, B:71:0x029a, B:73:0x02ad, B:76:0x02c3, B:91:0x0344, B:93:0x036a, B:95:0x036e, B:80:0x0307, B:82:0x030b, B:101:0x0394, B:104:0x03de, B:125:0x0482, B:126:0x048e, B:10:0x0074, B:13:0x00a5), top: B:131:0x0044 }] */
    /* JADX WARN: Code duplicated, block: B:69:0x028e  */
    /* JADX WARN: Code duplicated, block: B:71:0x029a A[Catch: Exception -> 0x048f, TRY_ENTER, TRY_LEAVE, TryCatch #0 {Exception -> 0x048f, blocks: (B:5:0x0044, B:15:0x00c1, B:17:0x00f0, B:109:0x0428, B:113:0x0449, B:115:0x0460, B:117:0x0464, B:23:0x0116, B:27:0x011a, B:32:0x016c, B:38:0x017f, B:43:0x01be, B:47:0x01c2, B:53:0x01e9, B:57:0x01ed, B:58:0x01f8, B:61:0x0207, B:63:0x0253, B:65:0x0281, B:67:0x0288, B:71:0x029a, B:73:0x02ad, B:76:0x02c3, B:91:0x0344, B:93:0x036a, B:95:0x036e, B:80:0x0307, B:82:0x030b, B:101:0x0394, B:104:0x03de, B:125:0x0482, B:126:0x048e, B:10:0x0074, B:13:0x00a5), top: B:131:0x0044 }] */
    /* JADX WARN: Code duplicated, block: B:75:0x02b3  */
    /* JADX WARN: Code duplicated, block: B:79:0x0303 A[LOOP:2: B:73:0x02ad->B:79:0x0303, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:86:0x030f A[EDGE_INSN: B:86:0x030f->B:87:0x032a BREAK  A[LOOP:2: B:73:0x02ad->B:79:0x0303]] */
    /* JADX WARN: Code duplicated, block: B:91:0x0344 A[Catch: Exception -> 0x048f, TRY_ENTER, TRY_LEAVE, TryCatch #0 {Exception -> 0x048f, blocks: (B:5:0x0044, B:15:0x00c1, B:17:0x00f0, B:109:0x0428, B:113:0x0449, B:115:0x0460, B:117:0x0464, B:23:0x0116, B:27:0x011a, B:32:0x016c, B:38:0x017f, B:43:0x01be, B:47:0x01c2, B:53:0x01e9, B:57:0x01ed, B:58:0x01f8, B:61:0x0207, B:63:0x0253, B:65:0x0281, B:67:0x0288, B:71:0x029a, B:73:0x02ad, B:76:0x02c3, B:91:0x0344, B:93:0x036a, B:95:0x036e, B:80:0x0307, B:82:0x030b, B:101:0x0394, B:104:0x03de, B:125:0x0482, B:126:0x048e, B:10:0x0074, B:13:0x00a5), top: B:131:0x0044 }] */
    public static /* synthetic */ Object setOnFocusChangeListener(Object[] objArr, int i10, int i11, int i12) {
        setMaxWidth setmaxwidth;
        String str;
        TransactionFailed transactionFailed;
        getBeepOnFailure getbeeponfailure;
        getBeepOnFailure getbeeponfailure2;
        getBeepOnFailure getbeeponfailure3;
        List list;
        ArrayList arrayList;
        getBeepOnFailure getbeeponfailure4;
        String str2;
        TransactionFailed transactionFailed2;
        ArrayList arrayList2;
        Iterator it;
        boolean z10;
        int i13;
        int i14;
        Iterator it2;
        getBeepOnFailure getbeeponfailure5;
        Object next;
        setScrollContainer setscrollcontainer;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22 = ~i10;
        int i23 = ~i12;
        int i24 = ~(i22 | i23);
        int i25 = ~(i22 | i11);
        int i26 = 2;
        if ((((~(i10 | (~i11))) | i12 | i25) * 397) + (i25 * (-397)) + (((~(i23 | i11)) | i24 | i25) * (-397)) + (i11 * (-396)) + (i10 * 398) != 1) {
            setLayerPaint setlayerpaint = (setLayerPaint) objArr[0];
            List list2 = (List) objArr[1];
            int i27 = f59960b;
            int i28 = (i27 & 25) + (i27 | 25);
            f59961c = i28 % 128;
            int i29 = i28 % 2;
            Intrinsics.checkNotNullParameter(list2, "");
            try {
                getBeepOnFailure getbeeponfailure6 = setlayerpaint.f59962a;
                int i30 = 888877739;
                int i31 = -888877733;
                int i32 = -865402437;
                int i33 = 865402441;
                if (getbeeponfailure6 == null) {
                    int i34 = f59961c;
                    int i35 = i34 ^ 125;
                    int i36 = ((i34 & 125) | i35) << 1;
                    int i37 = -i35;
                    int i38 = (i36 ^ i37) + ((i36 & i37) << 1);
                    int i39 = i38 % 128;
                    f59960b = i39;
                    int i40 = i38 % 2;
                    int i41 = i39 + 30;
                    int i42 = (i41 ^ (-1)) + (i41 << 1);
                    f59961c = i42 % 128;
                    int i43 = i42 % 2;
                } else {
                    setScrollContainer setscrollcontainer2 = (setScrollContainer) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure6}, 865402441, -865402437, System.identityHashCode(getbeeponfailure6));
                    if (setscrollcontainer2 == null) {
                        int i44 = f59960b;
                        int i45 = i44 & 91;
                        int i46 = (i45 - (~((i44 ^ 91) | i45))) - 1;
                        int i47 = i46 % 128;
                        f59961c = i47;
                        int i48 = i46 % 2;
                        int i49 = i47 & 101;
                        int i50 = (i47 | 101) & (~i49);
                        int i51 = i49 << 1;
                        int i52 = (i50 ^ i51) + ((i50 & i51) << 1);
                        f59960b = i52 % 128;
                        int i53 = i52 % 2;
                    } else {
                        str = (String) setScrollContainer.setOnFocusChangeListener(new Object[]{setscrollcontainer2}, -888877733, 888877739, System.identityHashCode(setscrollcontainer2));
                        int i54 = f59961c;
                        int i55 = (((i54 | 80) << 1) - (i54 ^ 80)) - 1;
                        f59960b = i55 % 128;
                        int i56 = i55 % 2;
                    }
                    setAnimation setanimation = setAnimation.INSTANCE;
                    transactionFailed = (TransactionFailed) setAnimation.setY(new Object[0], -1189908465, 1189908532, (int) System.currentTimeMillis());
                    if (Intrinsics.areEqual(str, (String) TransactionFailed.setX(new Object[]{transactionFailed}, 1914607362, -1914607356, System.identityHashCode(transactionFailed)))) {
                        throw new setIndeterminateDrawable(9, null, null, 6, null);
                    }
                    getbeeponfailure = setlayerpaint.f59962a;
                    if (getbeeponfailure == null) {
                        int i57 = f59960b;
                        i20 = ((i57 ^ 58) + ((i57 & 58) << 1)) - 1;
                        i21 = i20 % 128;
                        f59961c = i21;
                        if (i20 % 2 != 0) {
                            throw null;
                        }
                        int i58 = ((i21 | 14) << 1) - (i21 ^ 14);
                        int i59 = (i58 ^ (-1)) + (i58 << 1);
                        f59960b = i59 % 128;
                        int i60 = i59 % 2;
                    } else {
                        TransactionFailed transactionFailed3 = (TransactionFailed) setAnimation.setY(new Object[0], 787047871, -787047854, (int) System.currentTimeMillis());
                        getbeeponfailure2 = (getBeepOnFailure) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure, (String) TransactionFailed.setX(new Object[]{transactionFailed3}, 1914607362, -1914607356, System.identityHashCode(transactionFailed3))}, 1895833701, -1895833678, System.identityHashCode(getbeeponfailure));
                        if (getbeeponfailure2 == null) {
                            int i61 = f59960b;
                            int i62 = (i61 & (-42)) | ((~i61) & 41);
                            int i63 = (i61 & 41) << 1;
                            i17 = (i62 ^ i63) + ((i63 & i62) << 1);
                            int i64 = i17 % 128;
                            f59961c = i64;
                            if (i17 % 2 == 0) {
                                int i65 = 14 / 0;
                            }
                            int i66 = i64 & 93;
                            int i67 = (i66 - (~((i64 ^ 93) | i66))) - 1;
                            f59960b = i67 % 128;
                            int i68 = i67 % 2;
                        } else {
                            TransactionFailed transactionFailedCardScheme = setAnimation.CardScheme();
                            getbeeponfailure3 = (getBeepOnFailure) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure2, (String) TransactionFailed.setX(new Object[]{transactionFailedCardScheme}, 1914607362, -1914607356, System.identityHashCode(transactionFailedCardScheme))}, 1895833701, -1895833678, System.identityHashCode(getbeeponfailure2));
                            if (getbeeponfailure3 == null) {
                                int i69 = f59960b;
                                int i70 = i69 & 49;
                                int i71 = ((i69 ^ 49) | i70) << 1;
                                int i72 = -((i69 | 49) & (~i70));
                                i16 = ((i71 | i72) << 1) - (i72 ^ i71);
                                f59961c = i16 % 128;
                                if (i16 % 2 == 0) {
                                    throw null;
                                }
                            } else {
                                list = (List) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure3}, -1797741519, 1797741532, System.identityHashCode(getbeeponfailure3));
                                if (list == null) {
                                    int i73 = f59961c;
                                    int i74 = i73 & 3;
                                    i15 = i74 + ((i73 ^ 3) | i74);
                                    f59960b = i15 % 128;
                                    if (i15 % 2 != 0) {
                                        throw null;
                                    }
                                } else {
                                    arrayList = new ArrayList();
                                    for (Object obj : list) {
                                        int i75 = f59961c + 101;
                                        f59960b = i75 % 128;
                                        int i76 = i75 % i26;
                                        getbeeponfailure4 = (getBeepOnFailure) obj;
                                        setScrollContainer setscrollcontainer3 = (setScrollContainer) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure4}, i33, i32, System.identityHashCode(getbeeponfailure4));
                                        str2 = (String) setScrollContainer.setOnFocusChangeListener(new Object[]{setscrollcontainer3}, i31, i30, System.identityHashCode(setscrollcontainer3));
                                        setAnimation setanimation2 = setAnimation.INSTANCE;
                                        transactionFailed2 = (TransactionFailed) setAnimation.setY(new Object[0], -578632495, 578632574, (int) System.currentTimeMillis());
                                        if (Intrinsics.areEqual(str2, (String) TransactionFailed.setX(new Object[]{transactionFailed2}, 1914607362, -1914607356, System.identityHashCode(transactionFailed2)))) {
                                            List list3 = (List) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure4}, -1797741519, 1797741532, System.identityHashCode(getbeeponfailure4));
                                            arrayList2 = new ArrayList();
                                            it = list3.iterator();
                                            int i77 = f59961c;
                                            int i78 = (-2) - ((((i77 | 66) << 1) - (i77 ^ 66)) ^ (-1));
                                            f59960b = i78 % 128;
                                            int i79 = i78 % 2;
                                            while (!(!it.hasNext())) {
                                                int i80 = f59961c;
                                                int i81 = ((i80 ^ 19) | (i80 & 19)) << 1;
                                                int i82 = -(((~i80) & 19) | (i80 & (-20)));
                                                int i83 = ((i81 | i82) << 1) - (i82 ^ i81);
                                                f59960b = i83 % 128;
                                                int i84 = i83 % 2;
                                                next = it.next();
                                                getBeepOnFailure getbeeponfailure7 = (getBeepOnFailure) next;
                                                setscrollcontainer = (setScrollContainer) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure7}, i33, -865402437, System.identityHashCode(getbeeponfailure7));
                                                if (!list2.contains((String) setScrollContainer.setOnFocusChangeListener(new Object[]{setscrollcontainer}, -888877733, 888877739, System.identityHashCode(setscrollcontainer)))) {
                                                    int i85 = f59961c;
                                                    int i86 = ((i85 | 51) << 1) - (i85 ^ 51);
                                                    int i87 = i86 % 128;
                                                    f59960b = i87;
                                                    int i88 = i86 % 2;
                                                    int i89 = i87 + 125;
                                                    f59961c = i89 % 128;
                                                    int i90 = i89 % 2;
                                                    arrayList2.add(next);
                                                    int i91 = f59961c;
                                                    int i92 = i91 & 97;
                                                    int i93 = ((i91 | 97) & (~i92)) + (i92 << 1);
                                                    f59960b = i93 % 128;
                                                    int i94 = i93 % 2;
                                                }
                                                i33 = 865402441;
                                            }
                                            if (!arrayList2.isEmpty()) {
                                                int i95 = f59961c;
                                                int i96 = ((i95 ^ 33) | (i95 & 33)) << 1;
                                                int i97 = -(((~i95) & 33) | (i95 & (-34)));
                                                int i98 = (i96 ^ i97) + ((i97 & i96) << 1);
                                                f59960b = i98 % 128;
                                                int i99 = i98 % 2;
                                                z10 = true;
                                                break;
                                            }
                                            i14 = f59961c + 109;
                                            f59960b = i14 % 128;
                                            if (i14 % 2 == 0) {
                                                arrayList2.iterator();
                                                throw null;
                                            }
                                            it2 = arrayList2.iterator();
                                            int i100 = f59961c;
                                            int i101 = ((i100 ^ 120) + ((i100 & 120) << 1)) - 1;
                                            f59960b = i101 % 128;
                                            int i102 = i101 % 2;
                                            while (true) {
                                                if (it2.hasNext()) {
                                                    int i910 = f59961c;
                                                    int i911 = ((i910 ^ 33) | (i910 & 33)) << 1;
                                                    int i912 = -(((~i910) & 33) | (i910 & (-34)));
                                                    int i913 = (i911 ^ i912) + ((i912 & i911) << 1);
                                                    f59960b = i913 % 128;
                                                    int i914 = i913 % 2;
                                                    z10 = true;
                                                    break;
                                                }
                                                int i103 = f59961c;
                                                int i104 = i103 & 87;
                                                int i105 = (i104 - (~((i103 ^ 87) | i104))) - 1;
                                                f59960b = i105 % 128;
                                                int i106 = i105 % 2;
                                                getbeeponfailure5 = (getBeepOnFailure) it2.next();
                                                if (!((Boolean) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure5, Terminal.OTHER, new setTextSize[0]}, 1850304748, -1850304736, System.identityHashCode(getbeeponfailure5))).booleanValue()) {
                                                    int i107 = f59960b;
                                                    int i108 = i107 & 55;
                                                    int i109 = -(-((i107 ^ 55) | i108));
                                                    int i110 = ((i108 | i109) << 1) - (i109 ^ i108);
                                                    f59961c = i110 % 128;
                                                    int i111 = i110 % 2;
                                                    z10 = false;
                                                    break;
                                                }
                                            }
                                            if (!(!z10)) {
                                                int i112 = f59960b;
                                                int i113 = i112 & 61;
                                                int i114 = i113 + ((i112 ^ 61) | i113);
                                                int i115 = i114 % 128;
                                                f59961c = i115;
                                                int i116 = i114 % 2;
                                                i13 = i115 + 97;
                                                f59960b = i13 % 128;
                                                if (i13 % 2 == 0) {
                                                    arrayList.add(obj);
                                                    throw null;
                                                }
                                                arrayList.add(obj);
                                                int i117 = f59960b;
                                                int i118 = i117 & 77;
                                                int i119 = (i118 - (~(-(-((i117 ^ 77) | i118))))) - 1;
                                                f59961c = i119 % 128;
                                                int i120 = i119 % 2;
                                                i26 = 2;
                                                i30 = 888877739;
                                                i31 = -888877733;
                                                i32 = -865402437;
                                            }
                                        }
                                        int i121 = f59960b + 21;
                                        f59961c = i121 % 128;
                                        int i122 = i121 % 2;
                                        i30 = 888877739;
                                        i31 = -888877733;
                                        i26 = 2;
                                        i32 = -865402437;
                                        i33 = 865402441;
                                    }
                                    int i123 = f59960b;
                                    int i124 = i123 & 3;
                                    int i125 = (i123 | 3) & (~i124);
                                    int i126 = -(-(i124 << 1));
                                    int i127 = (i125 & i126) + (i125 | i126);
                                    f59961c = i127 % 128;
                                    int i128 = i127 % 2;
                                }
                                setmaxwidth = new setMaxWidth();
                                if (arrayList != null) {
                                    int i129 = f59960b;
                                    int i130 = i129 & 47;
                                    int i131 = ((i129 ^ 47) | i130) << 1;
                                    int i132 = -((i129 | 47) & (~i130));
                                    i19 = (i131 ^ i132) + ((i132 & i131) << 1);
                                    f59961c = i19 % 128;
                                    if (i19 % 2 != 0) {
                                        setmaxwidth.addAll(arrayList);
                                        throw null;
                                    }
                                    setmaxwidth.addAll(arrayList);
                                    int i133 = f59961c;
                                    int i134 = i133 & 119;
                                    int i135 = -(-((i133 ^ 119) | i134));
                                    int i136 = (i134 & i135) + (i135 | i134);
                                    f59960b = i136 % 128;
                                    int i137 = i136 % 2;
                                }
                                int i138 = f59960b;
                                i18 = (-2) - ((-1) ^ (((i138 | 60) << 1) - (i138 ^ 60)));
                                f59961c = i18 % 128;
                                if (i18 % 2 == 0) {
                                    int i139 = 78 / 0;
                                }
                            }
                        }
                    }
                    arrayList = null;
                    setmaxwidth = new setMaxWidth();
                    if (arrayList != null) {
                        int i1210 = f59960b;
                        int i1310 = i1210 & 47;
                        int i1311 = ((i1210 ^ 47) | i1310) << 1;
                        int i1312 = -((i1210 | 47) & (~i1310));
                        i19 = (i1311 ^ i1312) + ((i1312 & i1311) << 1);
                        f59961c = i19 % 128;
                        if (i19 % 2 != 0) {
                            setmaxwidth.addAll(arrayList);
                            throw null;
                        }
                        setmaxwidth.addAll(arrayList);
                        int i1313 = f59961c;
                        int i1314 = i1313 & 119;
                        int i1315 = -(-((i1313 ^ 119) | i1314));
                        int i1316 = (i1314 & i1315) + (i1315 | i1314);
                        f59960b = i1316 % 128;
                        int i1317 = i1316 % 2;
                    }
                    int i1318 = f59960b;
                    i18 = (-2) - ((-1) ^ (((i1318 | 60) << 1) - (i1318 ^ 60)));
                    f59961c = i18 % 128;
                    if (i18 % 2 == 0) {
                        int i1319 = 78 / 0;
                    }
                }
                str = null;
                setAnimation setanimation3 = setAnimation.INSTANCE;
                transactionFailed = (TransactionFailed) setAnimation.setY(new Object[0], -1189908465, 1189908532, (int) System.currentTimeMillis());
                if (Intrinsics.areEqual(str, (String) TransactionFailed.setX(new Object[]{transactionFailed}, 1914607362, -1914607356, System.identityHashCode(transactionFailed)))) {
                    throw new setIndeterminateDrawable(9, null, null, 6, null);
                }
                getbeeponfailure = setlayerpaint.f59962a;
                if (getbeeponfailure == null) {
                    int i510 = f59960b;
                    i20 = ((i510 ^ 58) + ((i510 & 58) << 1)) - 1;
                    i21 = i20 % 128;
                    f59961c = i21;
                    if (i20 % 2 != 0) {
                        throw null;
                    }
                    int i511 = ((i21 | 14) << 1) - (i21 ^ 14);
                    int i512 = (i511 ^ (-1)) + (i511 << 1);
                    f59960b = i512 % 128;
                    int i610 = i512 % 2;
                } else {
                    TransactionFailed transactionFailed4 = (TransactionFailed) setAnimation.setY(new Object[0], 787047871, -787047854, (int) System.currentTimeMillis());
                    getbeeponfailure2 = (getBeepOnFailure) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure, (String) TransactionFailed.setX(new Object[]{transactionFailed4}, 1914607362, -1914607356, System.identityHashCode(transactionFailed4))}, 1895833701, -1895833678, System.identityHashCode(getbeeponfailure));
                    if (getbeeponfailure2 == null) {
                        int i611 = f59960b;
                        int i612 = (i611 & (-42)) | ((~i611) & 41);
                        int i613 = (i611 & 41) << 1;
                        i17 = (i612 ^ i613) + ((i613 & i612) << 1);
                        int i614 = i17 % 128;
                        f59961c = i614;
                        if (i17 % 2 == 0) {
                            int i615 = 14 / 0;
                        }
                        int i616 = i614 & 93;
                        int i617 = (i616 - (~((i614 ^ 93) | i616))) - 1;
                        f59960b = i617 % 128;
                        int i618 = i617 % 2;
                    } else {
                        TransactionFailed transactionFailedCardScheme2 = setAnimation.CardScheme();
                        getbeeponfailure3 = (getBeepOnFailure) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure2, (String) TransactionFailed.setX(new Object[]{transactionFailedCardScheme2}, 1914607362, -1914607356, System.identityHashCode(transactionFailedCardScheme2))}, 1895833701, -1895833678, System.identityHashCode(getbeeponfailure2));
                        if (getbeeponfailure3 == null) {
                            int i619 = f59960b;
                            int i710 = i619 & 49;
                            int i711 = ((i619 ^ 49) | i710) << 1;
                            int i712 = -((i619 | 49) & (~i710));
                            i16 = ((i711 | i712) << 1) - (i712 ^ i711);
                            f59961c = i16 % 128;
                            if (i16 % 2 == 0) {
                                throw null;
                            }
                        } else {
                            list = (List) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure3}, -1797741519, 1797741532, System.identityHashCode(getbeeponfailure3));
                            if (list == null) {
                                int i713 = f59961c;
                                int i714 = i713 & 3;
                                i15 = i714 + ((i713 ^ 3) | i714);
                                f59960b = i15 % 128;
                                if (i15 % 2 != 0) {
                                    throw null;
                                }
                            } else {
                                arrayList = new ArrayList();
                                while (r0.hasNext()) {
                                    int i715 = f59961c + 101;
                                    f59960b = i715 % 128;
                                    int i716 = i715 % i26;
                                    getbeeponfailure4 = (getBeepOnFailure) obj;
                                    setScrollContainer setscrollcontainer4 = (setScrollContainer) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure4}, i33, i32, System.identityHashCode(getbeeponfailure4));
                                    str2 = (String) setScrollContainer.setOnFocusChangeListener(new Object[]{setscrollcontainer4}, i31, i30, System.identityHashCode(setscrollcontainer4));
                                    setAnimation setanimation4 = setAnimation.INSTANCE;
                                    transactionFailed2 = (TransactionFailed) setAnimation.setY(new Object[0], -578632495, 578632574, (int) System.currentTimeMillis());
                                    if (Intrinsics.areEqual(str2, (String) TransactionFailed.setX(new Object[]{transactionFailed2}, 1914607362, -1914607356, System.identityHashCode(transactionFailed2)))) {
                                        List list4 = (List) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure4}, -1797741519, 1797741532, System.identityHashCode(getbeeponfailure4));
                                        arrayList2 = new ArrayList();
                                        it = list4.iterator();
                                        int i717 = f59961c;
                                        int i718 = (-2) - ((((i717 | 66) << 1) - (i717 ^ 66)) ^ (-1));
                                        f59960b = i718 % 128;
                                        int i719 = i718 % 2;
                                        while (!(!it.hasNext())) {
                                            int i810 = f59961c;
                                            int i811 = ((i810 ^ 19) | (i810 & 19)) << 1;
                                            int i812 = -(((~i810) & 19) | (i810 & (-20)));
                                            int i813 = ((i811 | i812) << 1) - (i812 ^ i811);
                                            f59960b = i813 % 128;
                                            int i814 = i813 % 2;
                                            next = it.next();
                                            getBeepOnFailure getbeeponfailure8 = (getBeepOnFailure) next;
                                            setscrollcontainer = (setScrollContainer) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure8}, i33, -865402437, System.identityHashCode(getbeeponfailure8));
                                            if (!list2.contains((String) setScrollContainer.setOnFocusChangeListener(new Object[]{setscrollcontainer}, -888877733, 888877739, System.identityHashCode(setscrollcontainer)))) {
                                                int i815 = f59961c;
                                                int i816 = ((i815 | 51) << 1) - (i815 ^ 51);
                                                int i817 = i816 % 128;
                                                f59960b = i817;
                                                int i818 = i816 % 2;
                                                int i819 = i817 + 125;
                                                f59961c = i819 % 128;
                                                int i915 = i819 % 2;
                                                arrayList2.add(next);
                                                int i916 = f59961c;
                                                int i917 = i916 & 97;
                                                int i918 = ((i916 | 97) & (~i917)) + (i917 << 1);
                                                f59960b = i918 % 128;
                                                int i919 = i918 % 2;
                                            }
                                            i33 = 865402441;
                                        }
                                        if (!arrayList2.isEmpty()) {
                                            int i9110 = f59961c;
                                            int i9111 = ((i9110 ^ 33) | (i9110 & 33)) << 1;
                                            int i9112 = -(((~i9110) & 33) | (i9110 & (-34)));
                                            int i9113 = (i9111 ^ i9112) + ((i9112 & i9111) << 1);
                                            f59960b = i9113 % 128;
                                            int i9114 = i9113 % 2;
                                            z10 = true;
                                            break;
                                        }
                                        i14 = f59961c + 109;
                                        f59960b = i14 % 128;
                                        if (i14 % 2 == 0) {
                                            arrayList2.iterator();
                                            throw null;
                                        }
                                        it2 = arrayList2.iterator();
                                        int i1010 = f59961c;
                                        int i1011 = ((i1010 ^ 120) + ((i1010 & 120) << 1)) - 1;
                                        f59960b = i1011 % 128;
                                        int i1012 = i1011 % 2;
                                        while (true) {
                                            if (it2.hasNext()) {
                                                int i9115 = f59961c;
                                                int i9116 = ((i9115 ^ 33) | (i9115 & 33)) << 1;
                                                int i9117 = -(((~i9115) & 33) | (i9115 & (-34)));
                                                int i9118 = (i9116 ^ i9117) + ((i9117 & i9116) << 1);
                                                f59960b = i9118 % 128;
                                                int i9119 = i9118 % 2;
                                                z10 = true;
                                                break;
                                            }
                                            int i1013 = f59961c;
                                            int i1014 = i1013 & 87;
                                            int i1015 = (i1014 - (~((i1013 ^ 87) | i1014))) - 1;
                                            f59960b = i1015 % 128;
                                            int i1016 = i1015 % 2;
                                            getbeeponfailure5 = (getBeepOnFailure) it2.next();
                                            if (!((Boolean) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure5, Terminal.OTHER, new setTextSize[0]}, 1850304748, -1850304736, System.identityHashCode(getbeeponfailure5))).booleanValue()) {
                                                int i1017 = f59960b;
                                                int i1018 = i1017 & 55;
                                                int i1019 = -(-((i1017 ^ 55) | i1018));
                                                int i1110 = ((i1018 | i1019) << 1) - (i1019 ^ i1018);
                                                f59961c = i1110 % 128;
                                                int i1111 = i1110 % 2;
                                                z10 = false;
                                                break;
                                            }
                                        }
                                        if (!(!z10)) {
                                            int i1112 = f59960b;
                                            int i1113 = i1112 & 61;
                                            int i1114 = i1113 + ((i1112 ^ 61) | i1113);
                                            int i1115 = i1114 % 128;
                                            f59961c = i1115;
                                            int i1116 = i1114 % 2;
                                            i13 = i1115 + 97;
                                            f59960b = i13 % 128;
                                            if (i13 % 2 == 0) {
                                                arrayList.add(obj);
                                                throw null;
                                            }
                                            arrayList.add(obj);
                                            int i1117 = f59960b;
                                            int i1118 = i1117 & 77;
                                            int i1119 = (i1118 - (~(-(-((i1117 ^ 77) | i1118))))) - 1;
                                            f59961c = i1119 % 128;
                                            int i1211 = i1119 % 2;
                                            i26 = 2;
                                            i30 = 888877739;
                                            i31 = -888877733;
                                            i32 = -865402437;
                                        }
                                    }
                                    int i1212 = f59960b + 21;
                                    f59961c = i1212 % 128;
                                    int i1213 = i1212 % 2;
                                    i30 = 888877739;
                                    i31 = -888877733;
                                    i26 = 2;
                                    i32 = -865402437;
                                    i33 = 865402441;
                                }
                                int i1214 = f59960b;
                                int i1215 = i1214 & 3;
                                int i1216 = (i1214 | 3) & (~i1215);
                                int i1217 = -(-(i1215 << 1));
                                int i1218 = (i1216 & i1217) + (i1216 | i1217);
                                f59961c = i1218 % 128;
                                int i1219 = i1218 % 2;
                            }
                            setmaxwidth = new setMaxWidth();
                            if (arrayList != null) {
                                int i12110 = f59960b;
                                int i13110 = i12110 & 47;
                                int i13111 = ((i12110 ^ 47) | i13110) << 1;
                                int i13112 = -((i12110 | 47) & (~i13110));
                                i19 = (i13111 ^ i13112) + ((i13112 & i13111) << 1);
                                f59961c = i19 % 128;
                                if (i19 % 2 != 0) {
                                    setmaxwidth.addAll(arrayList);
                                    throw null;
                                }
                                setmaxwidth.addAll(arrayList);
                                int i13113 = f59961c;
                                int i13114 = i13113 & 119;
                                int i13115 = -(-((i13113 ^ 119) | i13114));
                                int i13116 = (i13114 & i13115) + (i13115 | i13114);
                                f59960b = i13116 % 128;
                                int i13117 = i13116 % 2;
                            }
                            int i13118 = f59960b;
                            i18 = (-2) - ((-1) ^ (((i13118 | 60) << 1) - (i13118 ^ 60)));
                            f59961c = i18 % 128;
                            if (i18 % 2 == 0) {
                                int i13119 = 78 / 0;
                            }
                        }
                    }
                }
                arrayList = null;
                setmaxwidth = new setMaxWidth();
                if (arrayList != null) {
                    int i12111 = f59960b;
                    int i131110 = i12111 & 47;
                    int i131111 = ((i12111 ^ 47) | i131110) << 1;
                    int i131112 = -((i12111 | 47) & (~i131110));
                    i19 = (i131111 ^ i131112) + ((i131112 & i131111) << 1);
                    f59961c = i19 % 128;
                    if (i19 % 2 != 0) {
                        setmaxwidth.addAll(arrayList);
                        throw null;
                    }
                    setmaxwidth.addAll(arrayList);
                    int i131113 = f59961c;
                    int i131114 = i131113 & 119;
                    int i131115 = -(-((i131113 ^ 119) | i131114));
                    int i131116 = (i131114 & i131115) + (i131115 | i131114);
                    f59960b = i131116 % 128;
                    int i131117 = i131116 % 2;
                }
                int i131118 = f59960b;
                i18 = (-2) - ((-1) ^ (((i131118 | 60) << 1) - (i131118 ^ 60)));
                f59961c = i18 % 128;
                if (i18 % 2 == 0) {
                    int i131119 = 78 / 0;
                }
            } catch (Exception unused) {
                SouthPacificEndpoint southPacificEndpoint = SouthPacificEndpoint.setX;
                SouthPacificEndpoint.setX(new Object[]{"GetDirectoryEntries_61 Error"}, -1166612213, 1166612217, (int) System.currentTimeMillis());
                throw new setIndeterminateDrawable(10, null, null, 6, null);
            }
        } else {
            setmaxwidth = null;
            setLayerPaint setlayerpaint2 = (setLayerPaint) objArr[0];
            byte[] bArr = (byte[]) objArr[1];
            int i140 = f59960b;
            int i141 = ((i140 ^ 27) | (i140 & 27)) << 1;
            int i142 = -(((~i140) & 27) | (i140 & (-28)));
            int i143 = (i141 & i142) + (i142 | i141);
            f59961c = i143 % 128;
            int i144 = i143 % 2;
            getBeepOnFailure.setCompoundDrawableTintBlendMode setcompounddrawabletintblendmode = getBeepOnFailure.setOnFocusChangeListener;
            setlayerpaint2.f59962a = (getBeepOnFailure) ((Pair) getBeepOnFailure.setCompoundDrawableTintBlendMode.setDividerPadding(new Object[]{bArr}, 2119034130, -2119034129, (int) System.currentTimeMillis())).getFirst();
            int i145 = f59961c;
            int i146 = ((-1) << 1) - ((-1) ^ (((i145 | 58) << 1) - (i145 ^ 58)));
            f59960b = i146 % 128;
            int i147 = i146 % 2;
        }
        return setmaxwidth;
    }

    @NotNull
    public final setMaxWidth setDividerPadding(@NotNull List<String> list) {
        return (setMaxWidth) setOnFocusChangeListener(new Object[]{this, list}, -656320915, 656320915, System.identityHashCode(this));
    }
}
