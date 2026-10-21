package com.mypinpad.tsdk.isolation;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.l;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class zq implements yl {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f62434b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static int f62435c = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final yc f62436a;

    public zq(@NotNull yc ycVar) {
        Intrinsics.checkNotNullParameter(ycVar, "");
        this.f62436a = ycVar;
    }

    /* JADX WARN: Code duplicated, block: B:59:0x03f2  */
    public static /* synthetic */ Object setX(Object[] objArr, int i10, int i11, int i12) throws Throwable {
        boolean z10;
        int i13 = (i11 * 825) + (i10 * 1649);
        int i14 = ~i11;
        if ((((~i10) | i14) * 824) + ((i11 | i10) * (-1648)) + ((i10 | i14) * (-824)) + i13 != 1) {
            List list = (List) objArr[0];
            StringBuilder sb2 = new StringBuilder();
            Iterator it = list.iterator();
            int i15 = f62434b;
            int i16 = (i15 ^ 103) + ((i15 & 103) << 1);
            f62435c = i16 % 128;
            int i17 = i16 % 2;
            int i18 = 0;
            while (!(!it.hasNext())) {
                int i19 = f62435c;
                int i20 = ((((i19 ^ 35) | (i19 & 35)) << 1) - (~(-(((~i19) & 35) | (i19 & (-36)))))) - 1;
                f62434b = i20 % 128;
                int i21 = i20 % 2;
                Object next = it.next();
                int i22 = i18 | 49;
                int i23 = i22 << 1;
                int i24 = -(i22 & (~(i18 & 49)));
                int i25 = ((i23 | i24) << 1) - (i24 ^ i23);
                int i26 = ((i25 ^ (-48)) - (~((i25 & (-48)) << 1))) - 1;
                if (i18 < 0) {
                    int i27 = f62434b;
                    int i28 = i27 & 93;
                    int i29 = -(-((i27 ^ 93) | i28));
                    int i30 = ((i28 | i29) << 1) - (i29 ^ i28);
                    f62435c = i30 % 128;
                    if (i30 % 2 == 0) {
                        CollectionsKt__CollectionsKt.throwIndexOverflow();
                        int i31 = 60 / 0;
                    } else {
                        CollectionsKt__CollectionsKt.throwIndexOverflow();
                    }
                    int i32 = f62434b;
                    int i33 = (i32 ^ 21) + ((i32 & 21) << 1);
                    f62435c = i33 % 128;
                    int i34 = i33 % 2;
                }
                yb ybVar = (yb) next;
                if (i18 > 0) {
                    int i35 = f62434b + 27;
                    f62435c = i35 % 128;
                    if (i35 % 2 == 0) {
                        sb2.append("; ");
                        int i36 = 39 / 0;
                    } else {
                        sb2.append("; ");
                    }
                }
                sb2.append((String) yb.setDividerPadding(new Object[]{ybVar}, -1206018521, 1206018534, System.identityHashCode(ybVar)));
                sb2.append('=');
                sb2.append((String) yb.setDividerPadding(new Object[]{ybVar}, -1173441952, 1173441966, System.identityHashCode(ybVar)));
                int i37 = f62434b;
                int i38 = i37 ^ 69;
                int i39 = (i37 & 69) << 1;
                int i40 = (i38 & i39) + (i39 | i38);
                f62435c = i40 % 128;
                int i41 = i40 % 2;
                i18 = i26;
            }
            String string = sb2.toString();
            Intrinsics.checkNotNullExpressionValue(string, "");
            int i42 = f62435c;
            int i43 = i42 & 25;
            int i44 = ((i42 ^ 25) | i43) << 1;
            int i45 = -((i42 | 25) & (~i43));
            int i46 = (i44 & i45) + (i45 | i44);
            f62434b = i46 % 128;
            int i47 = i46 % 2;
            return string;
        }
        zq zqVar = (zq) objArr[0];
        yl.setCompoundDrawableTintBlendMode setcompounddrawabletintblendmode = (yl.setCompoundDrawableTintBlendMode) objArr[1];
        System.identityHashCode(zqVar);
        System.identityHashCode(zqVar);
        Intrinsics.checkNotNullParameter(setcompounddrawabletintblendmode, "");
        yk compoundDrawableTintBlendMode = setcompounddrawabletintblendmode.setCompoundDrawableTintBlendMode();
        yk.setDividerPadding setdividerpadding = (yk.setDividerPadding) yk.setCompoundDrawableTintBlendMode(new Object[]{compoundDrawableTintBlendMode}, 575496979, -575496977, System.identityHashCode(compoundDrawableTintBlendMode));
        yo yoVar = (yo) yk.setCompoundDrawableTintBlendMode(new Object[]{compoundDrawableTintBlendMode}, -2084954302, 2084954305, System.identityHashCode(compoundDrawableTintBlendMode));
        if (yoVar != null) {
            int i48 = f62435c;
            int i49 = i48 & 119;
            int i50 = (~i49) & (i48 | 119);
            int i51 = i49 << 1;
            int i52 = ((i50 | i51) << 1) - (i51 ^ i50);
            f62434b = i52 % 128;
            int i53 = i52 % 2;
            yj onFocusChangeListener = yoVar.setOnFocusChangeListener();
            if (onFocusChangeListener != null) {
                int i54 = f62434b;
                int i55 = i54 & 45;
                int i56 = (i54 | 45) & (~i55);
                int i57 = -(-(i55 << 1));
                int i58 = ((i56 | i57) << 1) - (i56 ^ i57);
                f62435c = i58 % 128;
                if (i58 % 2 == 0) {
                    throw null;
                }
            }
            long dividerPadding = yoVar.setDividerPadding();
            if (dividerPadding != -1) {
                int i59 = f62434b + 53;
                f62435c = i59 % 128;
                if (i59 % 2 == 0) {
                    throw null;
                }
            } else {
                int i60 = f62435c;
                int i61 = i60 & 75;
                int i62 = -(-(i60 | 75));
                int i63 = (i61 ^ i62) + ((i62 & i61) << 1);
                f62434b = i63 % 128;
                int i64 = i63 % 2;
            }
        }
        if (((String) yk.setCompoundDrawableTintBlendMode(new Object[]{compoundDrawableTintBlendMode, "Host"}, 1273556189, -1273556181, System.identityHashCode(compoundDrawableTintBlendMode))) == null) {
            int i65 = f62435c;
            int i66 = i65 & 89;
            int i67 = (i65 | 89) & (~i66);
            int i68 = i66 << 1;
            int i69 = ((i67 | i68) << 1) - (i67 ^ i68);
            f62434b = i69 % 128;
            int i70 = i69 % 2;
            int i71 = f62434b;
            int i72 = (i71 & (-14)) | ((~i71) & 13);
            int i73 = (i71 & 13) << 1;
            int i74 = ((i72 | i73) << 1) - (i73 ^ i72);
            f62435c = i74 % 128;
            int i75 = i74 % 2;
        }
        if (((String) yk.setCompoundDrawableTintBlendMode(new Object[]{compoundDrawableTintBlendMode, "Connection"}, 1273556189, -1273556181, System.identityHashCode(compoundDrawableTintBlendMode))) == null) {
            int i76 = f62435c;
            int i77 = ((i76 & 43) - (~(-(-(i76 | 43))))) - 1;
            f62434b = i77 % 128;
            if (i77 % 2 != 0) {
                throw null;
            }
            int i78 = f62434b;
            int i79 = i78 & 55;
            int i80 = ((((i78 ^ 55) | i79) << 1) - (~(-((i78 | 55) & (~i79))))) - 1;
            f62435c = i80 % 128;
            int i81 = i80 % 2;
        }
        if (((String) yk.setCompoundDrawableTintBlendMode(new Object[]{compoundDrawableTintBlendMode, "Accept-Encoding"}, 1273556189, -1273556181, System.identityHashCode(compoundDrawableTintBlendMode))) == null) {
            int i82 = f62435c + 78;
            int i83 = (i82 ^ (-1)) + (i82 << 1);
            f62434b = i83 % 128;
            int i84 = i83 % 2;
            if (((String) yk.setCompoundDrawableTintBlendMode(new Object[]{compoundDrawableTintBlendMode, "Range"}, 1273556189, -1273556181, System.identityHashCode(compoundDrawableTintBlendMode))) == null) {
                int i85 = f62435c;
                int i86 = i85 | 51;
                int i87 = (i86 << 1) - ((~(i85 & 51)) & i86);
                f62434b = i87 % 128;
                z10 = true;
            } else {
                z10 = false;
            }
        } else {
            z10 = false;
        }
        List<yb> onFocusChangeListener2 = zqVar.f62436a.setOnFocusChangeListener((yg) yk.setCompoundDrawableTintBlendMode(new Object[]{compoundDrawableTintBlendMode}, -534472234, 534472239, System.identityHashCode(compoundDrawableTintBlendMode)));
        if (onFocusChangeListener2.isEmpty()) {
            int i88 = f62434b;
            int i89 = i88 & 79;
            int i90 = i89 + ((i88 ^ 79) | i89);
            f62435c = i90 % 128;
            int i91 = i90 % 2;
        } else {
            int i92 = f62435c;
            int i93 = i92 ^ 25;
            int i94 = -(-((i92 & 25) << 1));
            int i95 = ((i93 | i94) << 1) - (i93 ^ i94);
            f62434b = i95 % 128;
            int i96 = i95 % 2;
            int i97 = i92 & 53;
            int i98 = (i97 - (~((i92 ^ 53) | i97))) - 1;
            f62434b = i98 % 128;
            int i99 = i98 % 2;
            int i100 = (i92 & 3) + (i92 | 3);
            f62434b = i100 % 128;
            int i101 = i100 % 2;
            int i102 = f62434b + 3;
            f62435c = i102 % 128;
            int i103 = i102 % 2;
        }
        if (((String) yk.setCompoundDrawableTintBlendMode(new Object[]{compoundDrawableTintBlendMode, "User-Agent"}, 1273556189, -1273556181, System.identityHashCode(compoundDrawableTintBlendMode))) == null) {
            int i104 = f62434b + 19;
            f62435c = i104 % 128;
            int i105 = i104 % 2;
            int i106 = f62434b;
            int i107 = i106 ^ 123;
            int i108 = ((i106 & 123) | i107) << 1;
            int i109 = -i107;
            int i110 = (i108 & i109) + (i108 | i109);
            f62435c = i110 % 128;
            int i111 = i110 % 2;
        }
        yr dividerPadding2 = setcompounddrawabletintblendmode.setDividerPadding((yk) yk.setDividerPadding.setOnFocusChangeListener(new Object[]{setdividerpadding}, 721744858, -721744846, System.identityHashCode(setdividerpadding)));
        zt.setX(new Object[]{zqVar.f62436a, (yg) yk.setCompoundDrawableTintBlendMode(new Object[]{compoundDrawableTintBlendMode}, -534472234, 534472239, System.identityHashCode(compoundDrawableTintBlendMode)), (ye) yr.setX(new Object[]{dividerPadding2}, 1547100838, -1547100838, System.identityHashCode(dividerPadding2))}, 1081323009, -1081323003, (int) System.currentTimeMillis());
        yr.setDividerPadding setdividerpadding2 = (yr.setDividerPadding) yr.setX(new Object[]{dividerPadding2}, 142679588, -142679576, System.identityHashCode(dividerPadding2));
        yr.setDividerPadding setdividerpadding3 = (yr.setDividerPadding) yr.setDividerPadding.setDividerPadding(new Object[]{setdividerpadding2, compoundDrawableTintBlendMode}, 1035005502, -1035005479, System.identityHashCode(setdividerpadding2));
        if (!(!z10)) {
            int i112 = f62435c;
            int i113 = i112 & 3;
            int i114 = (((i112 | 3) & (~i113)) - (~(-(-(i113 << 1))))) - 1;
            f62434b = i114 % 128;
            if (i114 % 2 == 0 ? !(!l.equals("gzip", (String) yr.setX(new Object[]{dividerPadding2, "Content-Encoding"}, 401167373, -401167369, (int) System.currentTimeMillis()), true)) : l.equals("gzip", (String) yr.setX(new Object[]{dividerPadding2, "Content-Encoding"}, 401167373, -401167369, (int) System.currentTimeMillis()), true)) {
                if (((Boolean) zt.setX(new Object[]{dividerPadding2}, -1746594724, 1746594725, (int) System.currentTimeMillis())).booleanValue()) {
                    int i115 = f62434b + 51;
                    f62435c = i115 % 128;
                    int i116 = i115 % 2;
                    yn ynVar = (yn) yr.setX(new Object[]{dividerPadding2}, -428621868, 428621887, System.identityHashCode(dividerPadding2));
                    if (ynVar != null) {
                        aca acaVar = new aca(ynVar.setY());
                        ye yeVar = (ye) yr.setX(new Object[]{dividerPadding2}, 1547100838, -1547100838, System.identityHashCode(dividerPadding2));
                        ye.setOnFocusChangeListener setonfocuschangelistener = (ye.setOnFocusChangeListener) ye.setCompoundDrawableTintBlendMode(new Object[]{yeVar}, -1528950893, 1528950899, System.identityHashCode(yeVar));
                        ye.setOnFocusChangeListener setonfocuschangelistener2 = (ye.setOnFocusChangeListener) ye.setOnFocusChangeListener.setOnFocusChangeListener(new Object[]{setonfocuschangelistener, "Content-Encoding"}, -1784117658, 1784117662, System.identityHashCode(setonfocuschangelistener));
                        ye.setOnFocusChangeListener setonfocuschangelistener3 = (ye.setOnFocusChangeListener) ye.setOnFocusChangeListener.setOnFocusChangeListener(new Object[]{setonfocuschangelistener2, "Content-Length"}, -1784117658, 1784117662, System.identityHashCode(setonfocuschangelistener2));
                        int i117 = f62434b;
                        int i118 = ((i117 & (-4)) | ((~i117) & 3)) + ((i117 & 3) << 1);
                        f62435c = i118 % 128;
                        int i119 = i118 % 2;
                    }
                }
            }
        }
        yr yrVar = (yr) yr.setDividerPadding.setDividerPadding(new Object[]{setdividerpadding3}, -92684172, 92684189, System.identityHashCode(setdividerpadding3));
        int i120 = f62434b;
        int i121 = (i120 & 29) + (i120 | 29);
        f62435c = i121 % 128;
        if (i121 % 2 != 0) {
            return yrVar;
        }
        int i122 = 0 / 0;
        return yrVar;
    }

    @Override // com.mypinpad.tsdk.isolation.yl
    @NotNull
    public final yr setX(@NotNull yl.setCompoundDrawableTintBlendMode setcompounddrawabletintblendmode) throws IOException {
        return (yr) setX(new Object[]{this, setcompounddrawabletintblendmode}, -949048446, 949048447, System.identityHashCode(this));
    }
}
