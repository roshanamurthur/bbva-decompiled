package com.mypinpad.tsdk.isolation;

import com.bbva.component.dm.headers.EtagInterceptor;
import com.esotericsoftware.asm.Opcodes;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.l;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 \u00112\u00020\u0001:\u0002\u0011\fB\u001d\b\u0000\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001c\u0010\f\u001a\u0004\u0018\u00010\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\u000b"}, d2 = {"Lcom/mypinpad/tsdk/i/yx;", "", "Lcom/mypinpad/tsdk/i/yk;", "a", "Lcom/mypinpad/tsdk/i/yk;", "setY", "()Lcom/mypinpad/tsdk/i/yk;", "setCompoundDrawableTintBlendMode", "Lcom/mypinpad/tsdk/i/yr;", "b", "Lcom/mypinpad/tsdk/i/yr;", "()Lcom/mypinpad/tsdk/i/yr;", "setDividerPadding", "p0", "p1", "<init>", "(Lcom/mypinpad/tsdk/i/yk;Lcom/mypinpad/tsdk/i/yr;)V", "setOnFocusChangeListener"}, k = 1, mv = {1, 6, 0})
public final class yx {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static int f62219c = 1;

    /* JADX INFO: renamed from: setOnFocusChangeListener, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final yk setCompoundDrawableTintBlendMode;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final yr setDividerPadding;

    public static final class setDividerPadding {
        public static int m = 0;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static int f62222n = 1;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f62223a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final yk f62224b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        public final yr f62225c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @Nullable
        public final Date f62226d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @Nullable
        public final String f62227e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @Nullable
        public final Date f62228f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @Nullable
        public final String f62229g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        @Nullable
        public final Date f62230h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final long f62231i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final long f62232j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        @Nullable
        public final String f62233k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final int f62234l;

        public setDividerPadding(long j10, @NotNull yk ykVar, @Nullable yr yrVar) {
            Intrinsics.checkNotNullParameter(ykVar, "");
            this.f62223a = j10;
            this.f62224b = ykVar;
            this.f62225c = yrVar;
            this.f62234l = -1;
            if (yrVar != null) {
                this.f62231i = ((Long) yr.setX(new Object[]{yrVar}, -1353479930, 1353479935, System.identityHashCode(yrVar))).longValue();
                this.f62232j = ((Long) yr.setX(new Object[]{yrVar}, -144747726, 144747740, System.identityHashCode(yrVar))).longValue();
                ye yeVar = (ye) yr.setX(new Object[]{yrVar}, 1547100838, -1547100838, System.identityHashCode(yrVar));
                int iIntValue = ((Integer) ye.setCompoundDrawableTintBlendMode(new Object[]{yeVar}, -1558209065, 1558209065, System.identityHashCode(yeVar))).intValue();
                int i10 = 0;
                while (i10 < iIntValue) {
                    int i11 = (i10 & (-21)) + (i10 | (-21));
                    int i12 = (i11 ^ 22) + ((i11 & 22) << 1);
                    String str = (String) ye.setCompoundDrawableTintBlendMode(new Object[]{yeVar, Integer.valueOf(i10)}, 611642845, -611642844, i10);
                    String str2 = (String) ye.setCompoundDrawableTintBlendMode(new Object[]{yeVar, Integer.valueOf(i10)}, -1668064352, 1668064356, i10);
                    if (l.equals(str, "Date", true)) {
                        this.f62226d = (Date) zm.setOnFocusChangeListener(new Object[]{str2}, 413331518, -413331518, (int) System.currentTimeMillis());
                        this.f62227e = str2;
                    } else if (l.equals(str, "Expires", true)) {
                        this.f62230h = (Date) zm.setOnFocusChangeListener(new Object[]{str2}, 413331518, -413331518, (int) System.currentTimeMillis());
                    } else if (l.equals(str, "Last-Modified", true)) {
                        this.f62228f = (Date) zm.setOnFocusChangeListener(new Object[]{str2}, 413331518, -413331518, (int) System.currentTimeMillis());
                        this.f62229g = str2;
                    } else if (l.equals(str, "ETag", true)) {
                        this.f62233k = str2;
                    } else if (l.equals(str, "Age", true)) {
                        this.f62234l = yt.setDividerPadding(str2, -1);
                    }
                    i10 = i12;
                }
            }
        }

        public static /* synthetic */ yx a(Object[] objArr) {
            long millis;
            String str;
            setDividerPadding setdividerpadding = (setDividerPadding) objArr[0];
            int i10 = f62222n;
            int i11 = (i10 ^ 29) + ((i10 & 29) << 1);
            m = i11 % 128;
            int i12 = i11 % 2;
            yr yrVar = setdividerpadding.f62225c;
            yk ykVar = setdividerpadding.f62224b;
            if (yrVar == null) {
                yx yxVar = new yx(ykVar, null);
                int i13 = m;
                int i14 = i13 ^ 105;
                int i15 = (((i13 & 105) | i14) << 1) - i14;
                f62222n = i15 % 128;
                int i16 = i15 % 2;
                return yxVar;
            }
            boolean zBooleanValue = ((Boolean) yk.setCompoundDrawableTintBlendMode(new Object[]{ykVar}, 570787113, -570787106, System.identityHashCode(ykVar))).booleanValue();
            yr yrVar2 = setdividerpadding.f62225c;
            if (zBooleanValue) {
                int i17 = m;
                int i18 = (i17 ^ 37) + ((i17 & 37) << 1);
                f62222n = i18 % 128;
                int i19 = i18 % 2;
                if (((yf) yr.setX(new Object[]{yrVar2}, 339520473, -339520467, System.identityHashCode(yrVar2))) == null) {
                    yx yxVar2 = new yx(ykVar, null);
                    int i20 = f62222n;
                    int i21 = (i20 & 35) + (i20 | 35);
                    m = i21 % 128;
                    if (i21 % 2 != 0) {
                        int i22 = 55 / 0;
                    }
                    return yxVar2;
                }
            }
            Companion companion = yx.INSTANCE;
            if (!((Boolean) Companion.setCompoundDrawableTintBlendMode(new Object[]{yrVar2, ykVar}, -977183789, 977183789, (int) System.currentTimeMillis())).booleanValue()) {
                yx yxVar3 = new yx(ykVar, null);
                int i23 = m;
                int i24 = (i23 & 71) + (i23 | 71);
                f62222n = i24 % 128;
                int i25 = i24 % 2;
                return yxVar3;
            }
            xq xqVar = (xq) yk.setCompoundDrawableTintBlendMode(new Object[]{ykVar}, -1948025153, 1948025159, System.identityHashCode(ykVar));
            if (!((Boolean) xq.setX(new Object[]{xqVar}, 223506781, -223506773, System.identityHashCode(xqVar))).booleanValue()) {
                int i26 = f62222n;
                int i27 = ((i26 ^ 117) | (i26 & 117)) << 1;
                int i28 = -(((~i26) & 117) | (i26 & (-118)));
                int i29 = (i27 ^ i28) + ((i28 & i27) << 1);
                m = i29 % 128;
                int i30 = i29 % 2;
                if (!((Boolean) setDividerPadding(new Object[]{ykVar}, 1421581534, -1421581529, (int) System.currentTimeMillis())).booleanValue()) {
                    xq xqVar2 = (xq) yr.setX(new Object[]{yrVar2}, 1413319215, -1413319212, System.identityHashCode(yrVar2));
                    long jLongValue = ((Long) setDividerPadding(new Object[]{setdividerpadding}, 494563974, -494563974, System.identityHashCode(setdividerpadding))).longValue();
                    long jLongValue2 = ((Long) setDividerPadding(new Object[]{setdividerpadding}, -1420121353, 1420121356, System.identityHashCode(setdividerpadding))).longValue();
                    if (((Integer) xq.setX(new Object[]{xqVar}, -782682580, 782682589, System.identityHashCode(xqVar))).intValue() != -1) {
                        int i31 = f62222n;
                        int i32 = (((i31 | 80) << 1) - (i31 ^ 80)) - 1;
                        m = i32 % 128;
                        int i33 = i32 % 2;
                        jLongValue2 = Math.min(jLongValue2, TimeUnit.SECONDS.toMillis(((Integer) xq.setX(new Object[]{xqVar}, -782682580, 782682589, System.identityHashCode(xqVar))).intValue()));
                        int i34 = m + 117;
                        f62222n = i34 % 128;
                        int i35 = i34 % 2;
                    }
                    long millis2 = 0;
                    if (((Integer) xq.setX(new Object[]{xqVar}, -1643188543, 1643188549, System.identityHashCode(xqVar))).intValue() != -1) {
                        int i36 = m;
                        int i37 = (-2) - (((i36 & 12) + (i36 | 12)) ^ (-1));
                        f62222n = i37 % 128;
                        int i38 = i37 % 2;
                        millis = TimeUnit.SECONDS.toMillis(((Integer) xq.setX(new Object[]{xqVar}, -1643188543, 1643188549, System.identityHashCode(xqVar))).intValue());
                        int i39 = f62222n;
                        int i40 = (i39 & 79) + (i39 | 79);
                        m = i40 % 128;
                        int i41 = i40 % 2;
                    } else {
                        millis = 0;
                    }
                    if (!((Boolean) xq.setX(new Object[]{xqVar2}, -846729192, 846729199, System.identityHashCode(xqVar2))).booleanValue()) {
                        int i42 = f62222n;
                        int i43 = ((i42 | 71) << 1) - (i42 ^ 71);
                        m = i43 % 128;
                        int i44 = i43 % 2;
                        if (((Integer) xq.setX(new Object[]{xqVar}, 750343363, -750343351, System.identityHashCode(xqVar))).intValue() != -1) {
                            int i45 = m;
                            int i46 = i45 & 113;
                            int i47 = -(-((i45 ^ 113) | i46));
                            int i48 = ((i46 | i47) << 1) - (i47 ^ i46);
                            f62222n = i48 % 128;
                            int i49 = i48 % 2;
                            millis2 = TimeUnit.SECONDS.toMillis(((Integer) xq.setX(new Object[]{xqVar}, 750343363, -750343351, System.identityHashCode(xqVar))).intValue());
                            int i50 = m + 61;
                            f62222n = i50 % 128;
                            int i51 = i50 % 2;
                        }
                    }
                    if (!((Boolean) xq.setX(new Object[]{xqVar2}, 223506781, -223506773, System.identityHashCode(xqVar2))).booleanValue()) {
                        int i52 = f62222n;
                        int i53 = (((i52 ^ 85) | (i52 & 85)) << 1) - (((~i52) & 85) | (i52 & (-86)));
                        int i54 = i53 % 128;
                        m = i54;
                        int i55 = i53 % 2;
                        long j10 = millis + jLongValue;
                        if (j10 < jLongValue2 + millis2) {
                            int i56 = (((i54 & (-64)) | ((~i54) & 63)) - (~((i54 & 63) << 1))) - 1;
                            f62222n = i56 % 128;
                            int i57 = i56 % 2;
                            yr.setDividerPadding setdividerpadding2 = (yr.setDividerPadding) yr.setX(new Object[]{yrVar2}, 142679588, -142679576, System.identityHashCode(yrVar2));
                            if (j10 >= jLongValue2) {
                                int i58 = f62222n;
                                int i59 = (((i58 ^ 41) | (i58 & 41)) << 1) - (((~i58) & 41) | (i58 & (-42)));
                                m = i59 % 128;
                                if (i59 % 2 != 0) {
                                    throw null;
                                }
                                int i60 = f62222n;
                                int i61 = ((i60 | 45) << 1) - (i60 ^ 45);
                                m = i61 % 128;
                                int i62 = i61 % 2;
                            }
                            if (jLongValue > 86400000) {
                                int i63 = f62222n + 55;
                                m = i63 % 128;
                                int i64 = i63 % 2;
                                if (((Boolean) setDividerPadding(new Object[]{setdividerpadding}, 107040844, -107040840, System.identityHashCode(setdividerpadding))).booleanValue()) {
                                    int i65 = m;
                                    int i66 = i65 & 1;
                                    int i67 = -(-(i65 | 1));
                                    int i68 = (i66 & i67) + (i67 | i66);
                                    f62222n = i68 % 128;
                                    int i69 = i68 % 2;
                                    int i70 = m;
                                    int i71 = ((i70 | 97) << 1) - (i70 ^ 97);
                                    f62222n = i71 % 128;
                                    int i72 = i71 % 2;
                                }
                            }
                            yx yxVar4 = new yx(null, setdividerpadding2.setOnFocusChangeListener());
                            int i73 = m;
                            int i74 = ((i73 & 81) - (~(-(-(i73 | 81))))) - 1;
                            f62222n = i74 % 128;
                            if (i74 % 2 != 0) {
                                return yxVar4;
                            }
                            throw null;
                        }
                    }
                    String str2 = setdividerpadding.f62233k;
                    if (str2 != null) {
                        int i75 = m;
                        int i76 = i75 & 37;
                        int i77 = ((i75 ^ 37) | i76) << 1;
                        int i78 = -((i75 | 37) & (~i76));
                        int i79 = (i77 & i78) + (i78 | i77);
                        f62222n = i79 % 128;
                        if (i79 % 2 == 0) {
                            int i80 = 11 / 0;
                        }
                        str = EtagInterceptor.HEADER_IF_NONE_MATCH;
                    } else {
                        if (setdividerpadding.f62228f != null) {
                            System.identityHashCode(setdividerpadding);
                            System.identityHashCode(setdividerpadding);
                            int i81 = f62222n;
                            int i82 = i81 & 103;
                            int i83 = -(-((i81 ^ 103) | i82));
                            int i84 = (i82 ^ i83) + ((i83 & i82) << 1);
                            m = i84 % 128;
                            int i85 = i84 % 2;
                            str2 = setdividerpadding.f62229g;
                        } else {
                            if (setdividerpadding.f62226d == null) {
                                yx yxVar5 = new yx(ykVar, null);
                                int i86 = m;
                                int i87 = i86 & 13;
                                int i88 = i87 + ((i86 ^ 13) | i87);
                                f62222n = i88 % 128;
                                if (i88 % 2 == 0) {
                                    int i89 = 11 / 0;
                                }
                                return yxVar5;
                            }
                            int i90 = m;
                            int i91 = i90 & 73;
                            int i92 = ((i90 ^ 73) | i91) << 1;
                            int i93 = -((~i91) & (i90 | 73));
                            int i94 = ((i92 | i93) << 1) - (i92 ^ i93);
                            f62222n = i94 % 128;
                            if (i94 % 2 == 0) {
                                throw null;
                            }
                            int i95 = (-2) - ((-1) ^ ((i90 & 24) + (i90 | 24)));
                            f62222n = i95 % 128;
                            int i96 = i95 % 2;
                            str2 = setdividerpadding.f62227e;
                        }
                        str = "If-Modified-Since";
                    }
                    ye yeVar = (ye) yk.setCompoundDrawableTintBlendMode(new Object[]{ykVar}, -1466291161, 1466291162, System.identityHashCode(ykVar));
                    ye.setOnFocusChangeListener setonfocuschangelistener = (ye.setOnFocusChangeListener) ye.setCompoundDrawableTintBlendMode(new Object[]{yeVar}, -1528950893, 1528950899, System.identityHashCode(yeVar));
                    Intrinsics.checkNotNull(str2);
                    yk.setDividerPadding setdividerpadding3 = (yk.setDividerPadding) yk.setCompoundDrawableTintBlendMode(new Object[]{ykVar}, 575496979, -575496977, System.identityHashCode(ykVar));
                    yk.setDividerPadding setdividerpadding4 = (yk.setDividerPadding) yk.setDividerPadding.setOnFocusChangeListener(new Object[]{setdividerpadding3, (ye) ye.setOnFocusChangeListener.setOnFocusChangeListener(new Object[]{setonfocuschangelistener}, -1008790874, 1008790879, System.identityHashCode(setonfocuschangelistener))}, 344210543, -344210527, System.identityHashCode(setdividerpadding3));
                    yx yxVar6 = new yx((yk) yk.setDividerPadding.setOnFocusChangeListener(new Object[]{setdividerpadding4}, 721744858, -721744846, System.identityHashCode(setdividerpadding4)), yrVar2);
                    int i97 = f62222n;
                    int i98 = i97 & 91;
                    int i99 = ((i97 ^ 91) | i98) << 1;
                    int i100 = -((i97 | 91) & (~i98));
                    int i101 = ((i99 | i100) << 1) - (i100 ^ i99);
                    m = i101 % 128;
                    int i102 = i101 % 2;
                    return yxVar6;
                }
            }
            yx yxVar7 = new yx(ykVar, null);
            int i103 = m;
            int i104 = (i103 & 63) + (i103 | 63);
            f62222n = i104 % 128;
            if (i104 % 2 == 0) {
                int i105 = 15 / 0;
            }
            return yxVar7;
        }

        /* JADX WARN: Code duplicated, block: B:39:0x0143  */
        /* JADX WARN: Code duplicated, block: B:42:0x0158  */
        /* JADX WARN: Code duplicated, block: B:44:0x0168  */
        /* JADX WARN: Code duplicated, block: B:45:0x016c  */
        public static /* synthetic */ Object setDividerPadding(Object[] objArr, int i10, int i11, int i12) {
            long millis;
            Long lValueOf;
            long jLongValue;
            long jLongValue2;
            int i13;
            int i14;
            int i15 = ~i12;
            int i16 = ~i10;
            int i17 = ~i11;
            int i18 = (((~(i10 | i17)) | (~(i11 | i16))) * 662) + (((~(i12 | i11)) | (~(i10 | i12))) * (-1324)) + ((i15 | (~(i16 | i17))) * 1324) + (i11 * (-661)) + (i10 * (-661));
            Long lValueOf2 = null;
            if (i18 == 1) {
                setDividerPadding setdividerpadding = (setDividerPadding) objArr[0];
                int i19 = f62222n;
                int i20 = (i19 & (-126)) | ((~i19) & 125);
                int i21 = (i19 & 125) << 1;
                int i22 = ((i20 | i21) << 1) - (i21 ^ i20);
                m = i22 % 128;
                int i23 = i22 % 2;
                yx yxVar = (yx) setDividerPadding(new Object[]{setdividerpadding}, 218923626, -218923624, System.identityHashCode(setdividerpadding));
                if (((yk) yx.setOnFocusChangeListener(new Object[]{yxVar}, 381874110, -381874110, System.identityHashCode(yxVar))) != null) {
                    int i24 = m;
                    int i25 = (i24 & (-92)) | ((~i24) & 91);
                    int i26 = -(-((i24 & 91) << 1));
                    int i27 = (i25 ^ i26) + ((i26 & i25) << 1);
                    f62222n = i27 % 128;
                    int i28 = i27 % 2;
                    yk ykVar = setdividerpadding.f62224b;
                    xq xqVar = (xq) yk.setCompoundDrawableTintBlendMode(new Object[]{ykVar}, -1948025153, 1948025159, System.identityHashCode(ykVar));
                    if (((Boolean) xq.setX(new Object[]{xqVar}, 584308401, -584308399, System.identityHashCode(xqVar))).booleanValue()) {
                        yx yxVar2 = new yx(null, null);
                        int i29 = m;
                        int i30 = i29 & 25;
                        int i31 = i30 + ((i29 ^ 25) | i30);
                        f62222n = i31 % 128;
                        if (i31 % 2 != 0) {
                            return yxVar2;
                        }
                        throw null;
                    }
                }
                int i32 = m;
                int i33 = i32 & 103;
                int i34 = (i32 | 103) & (~i33);
                int i35 = i33 << 1;
                int i36 = (i34 & i35) + (i34 | i35);
                f62222n = i36 % 128;
                int i37 = i36 % 2;
                return yxVar;
            }
            if (i18 == 2) {
                return a(objArr);
            }
            long jMax = 0;
            if (i18 != 3) {
                if (i18 == 4) {
                    setDividerPadding setdividerpadding2 = (setDividerPadding) objArr[0];
                    int i38 = m;
                    int i39 = i38 & 121;
                    int i40 = (i38 ^ 121) | i39;
                    int i41 = (i39 ^ i40) + ((i40 & i39) << 1);
                    f62222n = i41 % 128;
                    int i42 = i41 % 2;
                    yr yrVar = setdividerpadding2.f62225c;
                    Intrinsics.checkNotNull(yrVar);
                    xq xqVar2 = (xq) yr.setX(new Object[]{yrVar}, 1413319215, -1413319212, System.identityHashCode(yrVar));
                    if (((Integer) xq.setX(new Object[]{xqVar2}, -782682580, 782682589, System.identityHashCode(xqVar2))).intValue() == -1) {
                        int i43 = f62222n;
                        int i44 = ((i43 ^ 99) - (~(-(-((i43 & 99) << 1))))) - 1;
                        int i45 = i44 % 128;
                        m = i45;
                        int i46 = i44 % 2;
                        if (setdividerpadding2.f62230h == null) {
                            int i47 = i45 & 109;
                            int i48 = (i45 ^ 109) | i47;
                            int i49 = (i47 ^ i48) + ((i47 & i48) << 1);
                            f62222n = i49 % 128;
                            int i50 = i49 % 2;
                            int i51 = (i45 & (-18)) | ((~i45) & 17);
                            int i52 = (i45 & 17) << 1;
                            int i53 = ((i51 | i52) << 1) - (i51 ^ i52);
                            f62222n = i53 % 128;
                            int i54 = i53 % 2;
                            return Boolean.TRUE;
                        }
                    }
                    int i55 = m;
                    int i56 = i55 & 103;
                    int i57 = (i55 | 103) & (~i56);
                    int i58 = -(-(i56 << 1));
                    int i59 = (i57 & i58) + (i57 | i58);
                    f62222n = i59 % 128;
                    if (i59 % 2 != 0) {
                        return Boolean.FALSE;
                    }
                    throw null;
                }
                if (i18 == 5) {
                    yk ykVar2 = (yk) objArr[0];
                    int i60 = m;
                    int i61 = i60 & 71;
                    int i62 = ((i60 | 71) & (~i61)) + (i61 << 1);
                    f62222n = i62 % 128;
                    if (i62 % 2 == 0) {
                        int i63 = 79 / 0;
                        if (((String) yk.setCompoundDrawableTintBlendMode(new Object[]{ykVar2, "If-Modified-Since"}, 1273556189, -1273556181, System.identityHashCode(ykVar2))) == null) {
                            if (((String) yk.setCompoundDrawableTintBlendMode(new Object[]{ykVar2, EtagInterceptor.HEADER_IF_NONE_MATCH}, 1273556189, -1273556181, System.identityHashCode(ykVar2))) == null) {
                                int i64 = f62222n;
                                i13 = ((i64 ^ 38) + ((i64 & 38) << 1)) - 1;
                                m = i13 % 128;
                                if (i13 % 2 == 0) {
                                    return Boolean.FALSE;
                                }
                                throw null;
                            }
                        }
                    } else if (((String) yk.setCompoundDrawableTintBlendMode(new Object[]{ykVar2, "If-Modified-Since"}, 1273556189, -1273556181, System.identityHashCode(ykVar2))) == null) {
                        if (((String) yk.setCompoundDrawableTintBlendMode(new Object[]{ykVar2, EtagInterceptor.HEADER_IF_NONE_MATCH}, 1273556189, -1273556181, System.identityHashCode(ykVar2))) == null) {
                            int i65 = f62222n;
                            i13 = ((i65 ^ 38) + ((i65 & 38) << 1)) - 1;
                            m = i13 % 128;
                            if (i13 % 2 == 0) {
                                return Boolean.FALSE;
                            }
                            throw null;
                        }
                    }
                    int i66 = f62222n + 53;
                    m = i66 % 128;
                    int i67 = i66 % 2;
                    return Boolean.TRUE;
                }
                setDividerPadding setdividerpadding3 = (setDividerPadding) objArr[0];
                int i68 = m;
                int i69 = i68 ^ 67;
                int i70 = ((i68 & 67) | i69) << 1;
                int i71 = -i69;
                int i72 = (i70 & i71) + (i71 | i70);
                f62222n = i72 % 128;
                if (i72 % 2 == 0) {
                    Date date = setdividerpadding3.f62226d;
                    throw null;
                }
                Date date2 = setdividerpadding3.f62226d;
                long j10 = setdividerpadding3.f62232j;
                if (date2 != null) {
                    int i73 = i68 ^ 29;
                    int i74 = ((i68 & 29) | i73) << 1;
                    int i75 = -i73;
                    int i76 = ((i74 | i75) << 1) - (i74 ^ i75);
                    f62222n = i76 % 128;
                    jMax = Math.max(0L, i76 % 2 == 0 ? j10 / date2.getTime() : j10 - date2.getTime());
                } else {
                    int i77 = i68 - (-1);
                    f62222n = i77 % 128;
                    int i78 = i77 % 2;
                }
                int i79 = setdividerpadding3.f62234l;
                if (i79 != -1) {
                    int i80 = m;
                    int i81 = ((i80 ^ 74) + ((i80 & 74) << 1)) - 1;
                    f62222n = i81 % 128;
                    int i82 = i81 % 2;
                    jMax = Math.max(jMax, TimeUnit.SECONDS.toMillis(i79));
                    int i83 = f62222n;
                    int i84 = i83 & 87;
                    int i85 = ((i83 ^ 87) | i84) << 1;
                    int i86 = -((i83 | 87) & (~i84));
                    i14 = (i85 ^ i86) + ((i86 & i85) << 1);
                } else {
                    int i87 = f62222n;
                    int i88 = i87 & 29;
                    int i89 = ((i87 ^ 29) | i88) << 1;
                    int i90 = -((i87 | 29) & (~i88));
                    i14 = ((i89 | i90) << 1) - (i90 ^ i89);
                }
                m = i14 % 128;
                int i91 = i14 % 2;
                long j11 = jMax + (j10 - setdividerpadding3.f62231i) + (setdividerpadding3.f62223a - j10);
                int i92 = m;
                int i93 = i92 & 3;
                int i94 = (((i92 | 3) & (~i93)) - (~(-(-(i93 << 1))))) - 1;
                f62222n = i94 % 128;
                if (i94 % 2 != 0) {
                    return Long.valueOf(j11);
                }
                throw null;
            }
            setDividerPadding setdividerpadding4 = (setDividerPadding) objArr[0];
            int i95 = m + 107;
            f62222n = i95 % 128;
            int i96 = i95 % 2;
            yr yrVar2 = setdividerpadding4.f62225c;
            Intrinsics.checkNotNull(yrVar2);
            xq xqVar3 = (xq) yr.setX(new Object[]{yrVar2}, 1413319215, -1413319212, System.identityHashCode(yrVar2));
            if (((Integer) xq.setX(new Object[]{xqVar3}, -782682580, 782682589, System.identityHashCode(xqVar3))).intValue() != -1) {
                int i97 = f62222n;
                int i98 = i97 & 101;
                int i99 = i98 + ((i97 ^ 101) | i98);
                m = i99 % 128;
                if (i99 % 2 != 0) {
                    millis = TimeUnit.SECONDS.toMillis(((Integer) xq.setX(new Object[]{xqVar3}, -782682580, 782682589, System.identityHashCode(xqVar3))).intValue());
                    int i100 = 15 / 0;
                } else {
                    millis = TimeUnit.SECONDS.toMillis(((Integer) xq.setX(new Object[]{xqVar3}, -782682580, 782682589, System.identityHashCode(xqVar3))).intValue());
                }
            } else {
                Date date3 = setdividerpadding4.f62226d;
                Date date4 = setdividerpadding4.f62230h;
                if (date4 != null) {
                    int i101 = f62222n;
                    int i102 = ((i101 ^ 62) + ((i101 & 62) << 1)) - 1;
                    int i103 = i102 % 128;
                    m = i103;
                    int i104 = i102 % 2;
                    if (date3 == null) {
                        int i105 = i103 & 119;
                        int i106 = -(-((i103 ^ 119) | i105));
                        int i107 = (i105 ^ i106) + ((i106 & i105) << 1);
                        int i108 = i107 % 128;
                        f62222n = i108;
                        int i109 = i107 % 2;
                        int i110 = i108 + 119;
                        m = i110 % 128;
                        int i111 = i110 % 2;
                    } else {
                        lValueOf2 = Long.valueOf(date3.getTime());
                        int i112 = m;
                        int i113 = (i112 | 123) << 1;
                        int i114 = -(((~i112) & 123) | (i112 & (-124)));
                        int i115 = ((i113 | i114) << 1) - (i114 ^ i113);
                        f62222n = i115 % 128;
                        int i116 = i115 % 2;
                    }
                    if (lValueOf2 == null) {
                        int i117 = f62222n;
                        int i118 = i117 & 95;
                        int i119 = i117 | 95;
                        int i120 = (i118 ^ i119) + ((i119 & i118) << 1);
                        int i121 = i120 % 128;
                        m = i121;
                        int i122 = i120 % 2;
                        int i123 = i121 & 17;
                        int i124 = ((i121 | 17) & (~i123)) + (i123 << 1);
                        f62222n = i124 % 128;
                        int i125 = i124 % 2;
                        jLongValue2 = setdividerpadding4.f62232j;
                    } else {
                        jLongValue2 = lValueOf2.longValue();
                        int i126 = m;
                        int i127 = (-2) - (((i126 & 64) + (i126 | 64)) ^ (-1));
                        f62222n = i127 % 128;
                        int i128 = i127 % 2;
                    }
                    long time = date4.getTime() - jLongValue2;
                    if (time <= 0) {
                        int i129 = f62222n;
                        int i130 = ((i129 & 106) + (i129 | 106)) - 1;
                        m = i130 % 128;
                        int i131 = i130 % 2;
                        return 0L;
                    }
                    int i132 = m;
                    int i133 = (i132 & (-60)) | ((~i132) & 59);
                    int i134 = (i132 & 59) << 1;
                    int i135 = (i133 & i134) + (i134 | i133);
                    int i136 = i135 % 128;
                    f62222n = i136;
                    int i137 = i135 % 2;
                    int i138 = i136 ^ 29;
                    int i139 = (((i136 & 29) | i138) << 1) - i138;
                    m = i139 % 128;
                    int i140 = i139 % 2;
                    return Long.valueOf(time);
                }
                Date date5 = setdividerpadding4.f62228f;
                if (date5 != null) {
                    int i141 = f62222n;
                    int i142 = i141 & 27;
                    int i143 = i142 + ((i141 ^ 27) | i142);
                    m = i143 % 128;
                    int i144 = i143 % 2;
                    yr yrVar3 = setdividerpadding4.f62225c;
                    if (i144 != 0) {
                        yk ykVar3 = (yk) yr.setX(new Object[]{yrVar3}, -504719753, 504719763, System.identityHashCode(yrVar3));
                        yg ygVar = (yg) yk.setCompoundDrawableTintBlendMode(new Object[]{ykVar3}, -534472234, 534472239, System.identityHashCode(ykVar3));
                        throw null;
                    }
                    yk ykVar4 = (yk) yr.setX(new Object[]{yrVar3}, -504719753, 504719763, System.identityHashCode(yrVar3));
                    yg ygVar2 = (yg) yk.setCompoundDrawableTintBlendMode(new Object[]{ykVar4}, -534472234, 534472239, System.identityHashCode(ykVar4));
                    if (((String) yg.setOnFocusChangeListener(new Object[]{ygVar2}, 986177680, -986177662, System.identityHashCode(ygVar2))) == null) {
                        if (date3 == null) {
                            int i145 = f62222n;
                            int i146 = i145 & 77;
                            int i147 = (i146 - (~(-(-((i145 ^ 77) | i146))))) - 1;
                            int i148 = i147 % 128;
                            m = i148;
                            if (i147 % 2 != 0) {
                                throw null;
                            }
                            int i149 = i148 & 91;
                            int i150 = i148 | 91;
                            int i151 = ((i149 | i150) << 1) - (i150 ^ i149);
                            f62222n = i151 % 128;
                            int i152 = i151 % 2;
                            lValueOf = null;
                        } else {
                            lValueOf = Long.valueOf(date3.getTime());
                            int i153 = f62222n;
                            int i154 = (i153 & 117) + (i153 | 117);
                            m = i154 % 128;
                            int i155 = i154 % 2;
                        }
                        if (lValueOf == null) {
                            int i156 = f62222n;
                            int i157 = i156 ^ 55;
                            int i158 = ((((i156 & 55) | i157) << 1) - (~(-i157))) - 1;
                            int i159 = i158 % 128;
                            m = i159;
                            int i160 = i158 % 2;
                            int i161 = i159 + 55;
                            f62222n = i161 % 128;
                            int i162 = i161 % 2;
                            jLongValue = setdividerpadding4.f62231i;
                        } else {
                            jLongValue = lValueOf.longValue();
                            int i163 = m;
                            int i164 = (((i163 ^ 75) | (i163 & 75)) << 1) - (((~i163) & 75) | (i163 & (-76)));
                            f62222n = i164 % 128;
                            int i165 = i164 % 2;
                        }
                        Intrinsics.checkNotNull(date5);
                        long time2 = jLongValue - date5.getTime();
                        if (time2 <= 0) {
                            int i166 = f62222n;
                            int i167 = ((i166 | 27) << 1) - (i166 ^ 27);
                            m = i167 % 128;
                            if (i167 % 2 == 0) {
                                return 0L;
                            }
                            throw null;
                        }
                        int i168 = m;
                        int i169 = (-2) - ((-1) ^ (((i168 | 82) << 1) - (i168 ^ 82)));
                        int i170 = i169 % 128;
                        f62222n = i170;
                        long j12 = i169 % 2 == 0 ? time2 + 10 : time2 / 10;
                        int i171 = i170 & 51;
                        int i172 = (i170 | 51) & (~i171);
                        int i173 = i171 << 1;
                        int i174 = (i172 & i173) + (i173 | i172);
                        m = i174 % 128;
                        int i175 = i174 % 2;
                        return Long.valueOf(j12);
                    }
                }
                int i176 = f62222n;
                int i177 = i176 & 95;
                int i178 = (i176 ^ 95) | i177;
                int i179 = (i177 & i178) + (i178 | i177);
                m = i179 % 128;
                int i180 = i179 % 2;
                millis = 0;
            }
            return Long.valueOf(millis);
        }

        @NotNull
        public final yx setY() {
            return (yx) setDividerPadding(new Object[]{this}, 1300170220, -1300170219, System.identityHashCode(this));
        }
    }

    /* JADX INFO: renamed from: com.mypinpad.tsdk.i.yx$setOnFocusChangeListener, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/mypinpad/tsdk/i/yx$setOnFocusChangeListener;", "", "Lcom/mypinpad/tsdk/i/yr;", "p0", "Lcom/mypinpad/tsdk/i/yk;", "p1", "", "setX", "(Lcom/mypinpad/tsdk/i/yr;Lcom/mypinpad/tsdk/i/yk;)Z", "<init>", "()V"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static int f62235a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static int f62236b = 1;

        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Code duplicated, block: B:28:0x0083  */
        /* JADX WARN: Code duplicated, block: B:30:0x009e  */
        /* JADX WARN: Code duplicated, block: B:32:0x00df  */
        /* JADX WARN: Code duplicated, block: B:34:0x0116  */
        /* JADX WARN: Code duplicated, block: B:36:0x014f  */
        /* JADX WARN: Code duplicated, block: B:39:0x0170  */
        /* JADX WARN: Code duplicated, block: B:42:0x0184  */
        /* JADX WARN: Code duplicated, block: B:44:0x01ac  */
        /* JADX WARN: Code duplicated, block: B:47:0x01e3  */
        /* JADX WARN: Code duplicated, block: B:50:0x020c  */
        public static /* synthetic */ Object setCompoundDrawableTintBlendMode(Object[] objArr, int i10, int i11, int i12) {
            xq xqVar;
            int i13;
            int i14;
            xq xqVar2;
            xq xqVar3;
            xq xqVar4;
            xq xqVar5;
            int i15;
            yr yrVar = (yr) objArr[0];
            yk ykVar = (yk) objArr[1];
            int i16 = f62236b + 119;
            f62235a = i16 % 128;
            int i17 = i16 % 2;
            Intrinsics.checkNotNullParameter(yrVar, "");
            Intrinsics.checkNotNullParameter(ykVar, "");
            int iIntValue = ((Integer) yr.setX(new Object[]{yrVar}, 151122101, -151122100, System.identityHashCode(yrVar))).intValue();
            if (iIntValue == 200 || iIntValue == 410 || iIntValue == 414 || iIntValue == 501 || iIntValue == 203 || iIntValue == 204) {
                int i18 = f62236b;
                int i19 = i18 & 3;
                int i20 = -(-(i18 | 3));
                int i21 = ((i19 | i20) << 1) - (i20 ^ i19);
                f62235a = i21 % 128;
                int i22 = i21 % 2;
                xqVar = (xq) yr.setX(new Object[]{yrVar}, 1413319215, -1413319212, System.identityHashCode(yrVar));
                if (!((Boolean) xq.setX(new Object[]{xqVar}, 1922756639, -1922756639, System.identityHashCode(xqVar))).booleanValue()) {
                    int i23 = f62236b;
                    int i24 = (i23 ^ 21) + ((i23 & 21) << 1);
                    f62235a = i24 % 128;
                    int i25 = i24 % 2;
                    xqVar2 = (xq) yk.setCompoundDrawableTintBlendMode(new Object[]{ykVar}, -1948025153, 1948025159, System.identityHashCode(ykVar));
                    if (!((Boolean) xq.setX(new Object[]{xqVar2}, 1922756639, -1922756639, System.identityHashCode(xqVar2))).booleanValue()) {
                        int i26 = f62236b;
                        int i27 = ((i26 | 110) << 1) - (i26 ^ 110);
                        int i28 = (i27 ^ (-1)) + (i27 << 1);
                        f62235a = i28 % 128;
                        int i29 = i28 % 2;
                        return Boolean.TRUE;
                    }
                }
                int i30 = f62236b;
                int i31 = i30 & 97;
                int i32 = (i30 | 97) & (~i31);
                int i33 = i31 << 1;
                i13 = (i32 ^ i33) + ((i32 & i33) << 1);
                f62235a = i13 % 128;
                if (i13 % 2 != 0) {
                    i14 = 9;
                    int i34 = i14 / 0;
                }
            } else if (iIntValue != 307) {
                if (iIntValue != 308 && iIntValue != 404 && iIntValue != 405) {
                    switch (iIntValue) {
                        case 300:
                        case 301:
                            break;
                        case 302:
                            if (((String) yr.setX(new Object[]{yrVar, "Expires"}, 401167373, -401167369, (int) System.currentTimeMillis())) != null) {
                                xqVar = (xq) yr.setX(new Object[]{yrVar}, 1413319215, -1413319212, System.identityHashCode(yrVar));
                                if (!((Boolean) xq.setX(new Object[]{xqVar}, 1922756639, -1922756639, System.identityHashCode(xqVar))).booleanValue()) {
                                    int i210 = f62236b;
                                    int i211 = (i210 ^ 21) + ((i210 & 21) << 1);
                                    f62235a = i211 % 128;
                                    int i212 = i211 % 2;
                                    xqVar2 = (xq) yk.setCompoundDrawableTintBlendMode(new Object[]{ykVar}, -1948025153, 1948025159, System.identityHashCode(ykVar));
                                    if (!((Boolean) xq.setX(new Object[]{xqVar2}, 1922756639, -1922756639, System.identityHashCode(xqVar2))).booleanValue()) {
                                        int i213 = f62236b;
                                        int i214 = ((i213 | 110) << 1) - (i213 ^ 110);
                                        int i215 = (i214 ^ (-1)) + (i214 << 1);
                                        f62235a = i215 % 128;
                                        int i216 = i215 % 2;
                                        return Boolean.TRUE;
                                    }
                                }
                                int i35 = f62236b;
                                int i36 = i35 & 97;
                                int i37 = (i35 | 97) & (~i36);
                                int i38 = i36 << 1;
                                i13 = (i37 ^ i38) + ((i37 & i38) << 1);
                                f62235a = i13 % 128;
                                if (i13 % 2 != 0) {
                                    i14 = 9;
                                    int i39 = i14 / 0;
                                }
                            } else {
                                int i40 = f62236b;
                                int i41 = ((i40 ^ 73) | (i40 & 73)) << 1;
                                int i42 = -(((~i40) & 73) | (i40 & (-74)));
                                int i43 = (i41 & i42) + (i42 | i41);
                                f62235a = i43 % 128;
                                int i44 = i43 % 2;
                                xqVar3 = (xq) yr.setX(new Object[]{yrVar}, 1413319215, -1413319212, System.identityHashCode(yrVar));
                                if (((Integer) xq.setX(new Object[]{xqVar3}, -782682580, 782682589, System.identityHashCode(xqVar3))).intValue() != -1) {
                                    xqVar = (xq) yr.setX(new Object[]{yrVar}, 1413319215, -1413319212, System.identityHashCode(yrVar));
                                    if (!((Boolean) xq.setX(new Object[]{xqVar}, 1922756639, -1922756639, System.identityHashCode(xqVar))).booleanValue()) {
                                        int i217 = f62236b;
                                        int i218 = (i217 ^ 21) + ((i217 & 21) << 1);
                                        f62235a = i218 % 128;
                                        int i219 = i218 % 2;
                                        xqVar2 = (xq) yk.setCompoundDrawableTintBlendMode(new Object[]{ykVar}, -1948025153, 1948025159, System.identityHashCode(ykVar));
                                        if (!((Boolean) xq.setX(new Object[]{xqVar2}, 1922756639, -1922756639, System.identityHashCode(xqVar2))).booleanValue()) {
                                            int i2110 = f62236b;
                                            int i2111 = ((i2110 | 110) << 1) - (i2110 ^ 110);
                                            int i2112 = (i2111 ^ (-1)) + (i2111 << 1);
                                            f62235a = i2112 % 128;
                                            int i2113 = i2112 % 2;
                                            return Boolean.TRUE;
                                        }
                                    }
                                    int i310 = f62236b;
                                    int i311 = i310 & 97;
                                    int i312 = (i310 | 97) & (~i311);
                                    int i313 = i311 << 1;
                                    i13 = (i312 ^ i313) + ((i312 & i313) << 1);
                                    f62235a = i13 % 128;
                                    if (i13 % 2 != 0) {
                                        i14 = 9;
                                        int i314 = i14 / 0;
                                    }
                                } else {
                                    int i45 = f62236b;
                                    int i46 = ((i45 ^ 89) - (~((i45 & 89) << 1))) - 1;
                                    f62235a = i46 % 128;
                                    int i47 = i46 % 2;
                                    xqVar4 = (xq) yr.setX(new Object[]{yrVar}, 1413319215, -1413319212, System.identityHashCode(yrVar));
                                    if (!((Boolean) xq.setX(new Object[]{xqVar4}, -171833678, 171833681, System.identityHashCode(xqVar4))).booleanValue()) {
                                        int i48 = f62236b;
                                        int i49 = i48 & 57;
                                        int i50 = (i48 ^ 57) | i49;
                                        int i51 = (i49 & i50) + (i50 | i49);
                                        f62235a = i51 % 128;
                                        int i52 = i51 % 2;
                                        xqVar5 = (xq) yr.setX(new Object[]{yrVar}, 1413319215, -1413319212, System.identityHashCode(yrVar));
                                        if (!(!((Boolean) xq.setX(new Object[]{xqVar5}, 2021832796, -2021832792, System.identityHashCode(xqVar5))).booleanValue())) {
                                            xqVar = (xq) yr.setX(new Object[]{yrVar}, 1413319215, -1413319212, System.identityHashCode(yrVar));
                                            if (!((Boolean) xq.setX(new Object[]{xqVar}, 1922756639, -1922756639, System.identityHashCode(xqVar))).booleanValue()) {
                                                int i2114 = f62236b;
                                                int i2115 = (i2114 ^ 21) + ((i2114 & 21) << 1);
                                                f62235a = i2115 % 128;
                                                int i2116 = i2115 % 2;
                                                xqVar2 = (xq) yk.setCompoundDrawableTintBlendMode(new Object[]{ykVar}, -1948025153, 1948025159, System.identityHashCode(ykVar));
                                                if (!((Boolean) xq.setX(new Object[]{xqVar2}, 1922756639, -1922756639, System.identityHashCode(xqVar2))).booleanValue()) {
                                                    int i2117 = f62236b;
                                                    int i2118 = ((i2117 | 110) << 1) - (i2117 ^ 110);
                                                    int i2119 = (i2118 ^ (-1)) + (i2118 << 1);
                                                    f62235a = i2119 % 128;
                                                    int i21110 = i2119 % 2;
                                                    return Boolean.TRUE;
                                                }
                                            }
                                            int i315 = f62236b;
                                            int i316 = i315 & 97;
                                            int i317 = (i315 | 97) & (~i316);
                                            int i318 = i316 << 1;
                                            i13 = (i317 ^ i318) + ((i317 & i318) << 1);
                                            f62235a = i13 % 128;
                                            if (i13 % 2 != 0) {
                                                i14 = 9;
                                                int i319 = i14 / 0;
                                            }
                                        } else {
                                            int i53 = f62235a;
                                            int i54 = i53 & 3;
                                            int i55 = -(-((i53 ^ 3) | i54));
                                            int i56 = (i54 ^ i55) + ((i55 & i54) << 1);
                                            int i57 = i56 % 128;
                                            f62236b = i57;
                                            int i58 = i56 % 2;
                                            i15 = (i57 & 107) + (i57 | 107);
                                            f62235a = i15 % 128;
                                            if (i15 % 2 != 0) {
                                                throw null;
                                            }
                                        }
                                    } else {
                                        xqVar = (xq) yr.setX(new Object[]{yrVar}, 1413319215, -1413319212, System.identityHashCode(yrVar));
                                        if (!((Boolean) xq.setX(new Object[]{xqVar}, 1922756639, -1922756639, System.identityHashCode(xqVar))).booleanValue()) {
                                            int i21111 = f62236b;
                                            int i21112 = (i21111 ^ 21) + ((i21111 & 21) << 1);
                                            f62235a = i21112 % 128;
                                            int i21113 = i21112 % 2;
                                            xqVar2 = (xq) yk.setCompoundDrawableTintBlendMode(new Object[]{ykVar}, -1948025153, 1948025159, System.identityHashCode(ykVar));
                                            if (!((Boolean) xq.setX(new Object[]{xqVar2}, 1922756639, -1922756639, System.identityHashCode(xqVar2))).booleanValue()) {
                                                int i21114 = f62236b;
                                                int i21115 = ((i21114 | 110) << 1) - (i21114 ^ 110);
                                                int i21116 = (i21115 ^ (-1)) + (i21115 << 1);
                                                f62235a = i21116 % 128;
                                                int i21117 = i21116 % 2;
                                                return Boolean.TRUE;
                                            }
                                        }
                                        int i3110 = f62236b;
                                        int i3111 = i3110 & 97;
                                        int i3112 = (i3110 | 97) & (~i3111);
                                        int i3113 = i3111 << 1;
                                        i13 = (i3112 ^ i3113) + ((i3112 & i3113) << 1);
                                        f62235a = i13 % 128;
                                        if (i13 % 2 != 0) {
                                            i14 = 9;
                                            int i3114 = i14 / 0;
                                        }
                                    }
                                }
                            }
                            break;
                        default:
                            int i59 = f62235a;
                            int i60 = (((i59 ^ 23) | (i59 & 23)) << 1) - (((~i59) & 23) | (i59 & (-24)));
                            f62236b = i60 % 128;
                            if (i60 % 2 == 0) {
                                i14 = 54;
                                int i3115 = i14 / 0;
                            }
                            break;
                    }
                }
                int i110 = f62236b;
                int i111 = i110 & 3;
                int i220 = -(-(i110 | 3));
                int i221 = ((i111 | i220) << 1) - (i220 ^ i111);
                f62235a = i221 % 128;
                int i222 = i221 % 2;
                xqVar = (xq) yr.setX(new Object[]{yrVar}, 1413319215, -1413319212, System.identityHashCode(yrVar));
                if (!((Boolean) xq.setX(new Object[]{xqVar}, 1922756639, -1922756639, System.identityHashCode(xqVar))).booleanValue()) {
                    int i21118 = f62236b;
                    int i21119 = (i21118 ^ 21) + ((i21118 & 21) << 1);
                    f62235a = i21119 % 128;
                    int i211110 = i21119 % 2;
                    xqVar2 = (xq) yk.setCompoundDrawableTintBlendMode(new Object[]{ykVar}, -1948025153, 1948025159, System.identityHashCode(ykVar));
                    if (!((Boolean) xq.setX(new Object[]{xqVar2}, 1922756639, -1922756639, System.identityHashCode(xqVar2))).booleanValue()) {
                        int i211111 = f62236b;
                        int i211112 = ((i211111 | 110) << 1) - (i211111 ^ 110);
                        int i211113 = (i211112 ^ (-1)) + (i211112 << 1);
                        f62235a = i211113 % 128;
                        int i211114 = i211113 % 2;
                        return Boolean.TRUE;
                    }
                }
                int i3116 = f62236b;
                int i3117 = i3116 & 97;
                int i3118 = (i3116 | 97) & (~i3117);
                int i3119 = i3117 << 1;
                i13 = (i3118 ^ i3119) + ((i3118 & i3119) << 1);
                f62235a = i13 % 128;
                if (i13 % 2 != 0) {
                    i14 = 9;
                    int i31110 = i14 / 0;
                }
            } else if (((String) yr.setX(new Object[]{yrVar, "Expires"}, 401167373, -401167369, (int) System.currentTimeMillis())) != null) {
                int i410 = f62236b;
                int i411 = ((i410 ^ 73) | (i410 & 73)) << 1;
                int i412 = -(((~i410) & 73) | (i410 & (-74)));
                int i413 = (i411 & i412) + (i412 | i411);
                f62235a = i413 % 128;
                int i414 = i413 % 2;
                xqVar3 = (xq) yr.setX(new Object[]{yrVar}, 1413319215, -1413319212, System.identityHashCode(yrVar));
                if (((Integer) xq.setX(new Object[]{xqVar3}, -782682580, 782682589, System.identityHashCode(xqVar3))).intValue() != -1) {
                    int i415 = f62236b;
                    int i416 = ((i415 ^ 89) - (~((i415 & 89) << 1))) - 1;
                    f62235a = i416 % 128;
                    int i417 = i416 % 2;
                    xqVar4 = (xq) yr.setX(new Object[]{yrVar}, 1413319215, -1413319212, System.identityHashCode(yrVar));
                    if (!((Boolean) xq.setX(new Object[]{xqVar4}, -171833678, 171833681, System.identityHashCode(xqVar4))).booleanValue()) {
                        int i418 = f62236b;
                        int i419 = i418 & 57;
                        int i510 = (i418 ^ 57) | i419;
                        int i511 = (i419 & i510) + (i510 | i419);
                        f62235a = i511 % 128;
                        int i512 = i511 % 2;
                        xqVar5 = (xq) yr.setX(new Object[]{yrVar}, 1413319215, -1413319212, System.identityHashCode(yrVar));
                        if (!(!((Boolean) xq.setX(new Object[]{xqVar5}, 2021832796, -2021832792, System.identityHashCode(xqVar5))).booleanValue())) {
                            int i513 = f62235a;
                            int i514 = i513 & 3;
                            int i515 = -(-((i513 ^ 3) | i514));
                            int i516 = (i514 ^ i515) + ((i515 & i514) << 1);
                            int i517 = i516 % 128;
                            f62236b = i517;
                            int i518 = i516 % 2;
                            i15 = (i517 & 107) + (i517 | 107);
                            f62235a = i15 % 128;
                            if (i15 % 2 != 0) {
                                throw null;
                            }
                        } else {
                            xqVar = (xq) yr.setX(new Object[]{yrVar}, 1413319215, -1413319212, System.identityHashCode(yrVar));
                            if (!((Boolean) xq.setX(new Object[]{xqVar}, 1922756639, -1922756639, System.identityHashCode(xqVar))).booleanValue()) {
                                int i211115 = f62236b;
                                int i211116 = (i211115 ^ 21) + ((i211115 & 21) << 1);
                                f62235a = i211116 % 128;
                                int i211117 = i211116 % 2;
                                xqVar2 = (xq) yk.setCompoundDrawableTintBlendMode(new Object[]{ykVar}, -1948025153, 1948025159, System.identityHashCode(ykVar));
                                if (!((Boolean) xq.setX(new Object[]{xqVar2}, 1922756639, -1922756639, System.identityHashCode(xqVar2))).booleanValue()) {
                                    int i211118 = f62236b;
                                    int i211119 = ((i211118 | 110) << 1) - (i211118 ^ 110);
                                    int i2111110 = (i211119 ^ (-1)) + (i211119 << 1);
                                    f62235a = i2111110 % 128;
                                    int i2111111 = i2111110 % 2;
                                    return Boolean.TRUE;
                                }
                            }
                            int i31111 = f62236b;
                            int i31112 = i31111 & 97;
                            int i31113 = (i31111 | 97) & (~i31112);
                            int i31114 = i31112 << 1;
                            i13 = (i31113 ^ i31114) + ((i31113 & i31114) << 1);
                            f62235a = i13 % 128;
                            if (i13 % 2 != 0) {
                                i14 = 9;
                                int i31115 = i14 / 0;
                            }
                        }
                    } else {
                        xqVar = (xq) yr.setX(new Object[]{yrVar}, 1413319215, -1413319212, System.identityHashCode(yrVar));
                        if (!((Boolean) xq.setX(new Object[]{xqVar}, 1922756639, -1922756639, System.identityHashCode(xqVar))).booleanValue()) {
                            int i2111112 = f62236b;
                            int i2111113 = (i2111112 ^ 21) + ((i2111112 & 21) << 1);
                            f62235a = i2111113 % 128;
                            int i2111114 = i2111113 % 2;
                            xqVar2 = (xq) yk.setCompoundDrawableTintBlendMode(new Object[]{ykVar}, -1948025153, 1948025159, System.identityHashCode(ykVar));
                            if (!((Boolean) xq.setX(new Object[]{xqVar2}, 1922756639, -1922756639, System.identityHashCode(xqVar2))).booleanValue()) {
                                int i2111115 = f62236b;
                                int i2111116 = ((i2111115 | 110) << 1) - (i2111115 ^ 110);
                                int i2111117 = (i2111116 ^ (-1)) + (i2111116 << 1);
                                f62235a = i2111117 % 128;
                                int i2111118 = i2111117 % 2;
                                return Boolean.TRUE;
                            }
                        }
                        int i31116 = f62236b;
                        int i31117 = i31116 & 97;
                        int i31118 = (i31116 | 97) & (~i31117);
                        int i31119 = i31117 << 1;
                        i13 = (i31118 ^ i31119) + ((i31118 & i31119) << 1);
                        f62235a = i13 % 128;
                        if (i13 % 2 != 0) {
                            i14 = 9;
                            int i311110 = i14 / 0;
                        }
                    }
                } else {
                    xqVar = (xq) yr.setX(new Object[]{yrVar}, 1413319215, -1413319212, System.identityHashCode(yrVar));
                    if (!((Boolean) xq.setX(new Object[]{xqVar}, 1922756639, -1922756639, System.identityHashCode(xqVar))).booleanValue()) {
                        int i2111119 = f62236b;
                        int i21111110 = (i2111119 ^ 21) + ((i2111119 & 21) << 1);
                        f62235a = i21111110 % 128;
                        int i21111111 = i21111110 % 2;
                        xqVar2 = (xq) yk.setCompoundDrawableTintBlendMode(new Object[]{ykVar}, -1948025153, 1948025159, System.identityHashCode(ykVar));
                        if (!((Boolean) xq.setX(new Object[]{xqVar2}, 1922756639, -1922756639, System.identityHashCode(xqVar2))).booleanValue()) {
                            int i21111112 = f62236b;
                            int i21111113 = ((i21111112 | 110) << 1) - (i21111112 ^ 110);
                            int i21111114 = (i21111113 ^ (-1)) + (i21111113 << 1);
                            f62235a = i21111114 % 128;
                            int i21111115 = i21111114 % 2;
                            return Boolean.TRUE;
                        }
                    }
                    int i311111 = f62236b;
                    int i311112 = i311111 & 97;
                    int i311113 = (i311111 | 97) & (~i311112);
                    int i311114 = i311112 << 1;
                    i13 = (i311113 ^ i311114) + ((i311113 & i311114) << 1);
                    f62235a = i13 % 128;
                    if (i13 % 2 != 0) {
                        i14 = 9;
                        int i311115 = i14 / 0;
                    }
                }
            } else {
                xqVar = (xq) yr.setX(new Object[]{yrVar}, 1413319215, -1413319212, System.identityHashCode(yrVar));
                if (!((Boolean) xq.setX(new Object[]{xqVar}, 1922756639, -1922756639, System.identityHashCode(xqVar))).booleanValue()) {
                    int i21111116 = f62236b;
                    int i21111117 = (i21111116 ^ 21) + ((i21111116 & 21) << 1);
                    f62235a = i21111117 % 128;
                    int i21111118 = i21111117 % 2;
                    xqVar2 = (xq) yk.setCompoundDrawableTintBlendMode(new Object[]{ykVar}, -1948025153, 1948025159, System.identityHashCode(ykVar));
                    if (!((Boolean) xq.setX(new Object[]{xqVar2}, 1922756639, -1922756639, System.identityHashCode(xqVar2))).booleanValue()) {
                        int i21111119 = f62236b;
                        int i211111110 = ((i21111119 | 110) << 1) - (i21111119 ^ 110);
                        int i211111111 = (i211111110 ^ (-1)) + (i211111110 << 1);
                        f62235a = i211111111 % 128;
                        int i211111112 = i211111111 % 2;
                        return Boolean.TRUE;
                    }
                }
                int i311116 = f62236b;
                int i311117 = i311116 & 97;
                int i311118 = (i311116 | 97) & (~i311117);
                int i311119 = i311117 << 1;
                i13 = (i311118 ^ i311119) + ((i311118 & i311119) << 1);
                f62235a = i13 % 128;
                if (i13 % 2 != 0) {
                    i14 = 9;
                    int i3111110 = i14 / 0;
                }
            }
            return Boolean.FALSE;
        }

        public static boolean setX(@NotNull yr p4, @NotNull yk p10) {
            return ((Boolean) setCompoundDrawableTintBlendMode(new Object[]{p4, p10}, -977183789, 977183789, (int) System.currentTimeMillis())).booleanValue();
        }
    }

    static {
        int i10 = f62219c + 35;
        int i11 = i10 % 128;
        if (i10 % 2 != 0) {
            throw null;
        }
    }

    public yx(@Nullable yk ykVar, @Nullable yr yrVar) {
        this.setCompoundDrawableTintBlendMode = ykVar;
        this.setDividerPadding = yrVar;
    }

    public static /* synthetic */ Object setOnFocusChangeListener(Object[] objArr, int i10, int i11, int i12) {
        Object obj;
        int i13 = (i11 * Opcodes.INSTANCEOF) + (i10 * Opcodes.INSTANCEOF);
        int i14 = ~i12;
        int i15 = ~i10;
        int i16 = (((~(i15 | i11)) | i14) * (-192)) + i13;
        int i17 = ~i11;
        int i18 = i15 | i17;
        int i19 = i14 | i17;
        if ((((~(i10 | i11 | i12)) | (~(i19 | i10)) | (~(i18 | i12))) * 192) + (((~i19) | (~i18)) * (-384)) + i16 != 1) {
            yx yxVar = (yx) objArr[0];
            int i20 = f62219c;
            int i21 = ((i20 ^ 19) | (i20 & 19)) << 1;
            int i22 = -((i20 & (-20)) | ((~i20) & 19));
            int i23 = ((i21 | i22) << 1) - (i21 ^ i22);
            int i24 = i23 % 128;
            int i25 = i23 % 2;
            obj = yxVar.setCompoundDrawableTintBlendMode;
            int i26 = ((i20 ^ 10) + ((i20 & 10) << 1)) - 1;
            int i27 = i26 % 128;
            if (i26 % 2 != 0) {
                throw null;
            }
        } else {
            yx yxVar2 = (yx) objArr[0];
            int i28 = f62219c;
            int i29 = (((i28 ^ 43) | (i28 & 43)) << 1) - (((~i28) & 43) | (i28 & (-44)));
            int i30 = i29 % 128;
            int i31 = i29 % 2;
            obj = yxVar2.setDividerPadding;
            if (i31 != 0) {
                throw null;
            }
            int i32 = i30 + 109;
            f62219c = i32 % 128;
            int i33 = i32 % 2;
        }
        return obj;
    }

    @JvmName(name = "setCompoundDrawableTintBlendMode")
    @Nullable
    public final yr setCompoundDrawableTintBlendMode() {
        return (yr) setOnFocusChangeListener(new Object[]{this}, 981102324, -981102323, System.identityHashCode(this));
    }

    @JvmName(name = "setY")
    @Nullable
    public final yk setY() {
        return (yk) setOnFocusChangeListener(new Object[]{this}, 381874110, -381874110, System.identityHashCode(this));
    }
}
