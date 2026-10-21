package com.mypinpad.tsdk.isolation;

import com.bbva.sl.ar.android.libkeymanagement.exception.ReturnCode;
import java.io.Closeable;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
public final class yr implements Closeable {
    public static int I0 = 0;
    public static int J0 = 1;
    public final long E0;
    public final long F0;

    @Nullable
    public final zg G0;

    @Nullable
    public xq H0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NotNull
    public final yk f62177p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    @NotNull
    public final yi f62178q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    @NotNull
    public final String f62179r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final int f62180s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    @Nullable
    public final yf f62181t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    @NotNull
    public final ye f62182u0;

    @Nullable
    public final yn v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    @Nullable
    public final yr f62183w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    @Nullable
    public final yr f62184x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    @Nullable
    public final yr f62185y0;

    public static class setDividerPadding {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static int f62186n = 0;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public static int f62187o = 1;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        public yk f62188a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        public yi f62189b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f62190c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @Nullable
        public String f62191d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @Nullable
        public yf f62192e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @NotNull
        public ye.setOnFocusChangeListener f62193f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @Nullable
        public yn f62194g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        @Nullable
        public yr f62195h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        @Nullable
        public yr f62196i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        @Nullable
        public yr f62197j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public long f62198k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public long f62199l;

        @Nullable
        public zg m;

        public setDividerPadding() {
            this.f62190c = -1;
            this.f62193f = new ye.setOnFocusChangeListener();
        }

        public static /* synthetic */ void a(Object[] objArr) {
            setDividerPadding setdividerpadding = (setDividerPadding) objArr[0];
            yf yfVar = (yf) objArr[1];
            int i10 = f62186n;
            int i11 = (i10 & (-40)) | ((~i10) & 39);
            int i12 = (i10 & 39) << 1;
            int i13 = ((i11 | i12) << 1) - (i12 ^ i11);
            int i14 = i13 % 128;
            f62187o = i14;
            int i15 = i13 % 2;
            setdividerpadding.f62192e = yfVar;
            if (i15 == 0) {
                int i16 = 35 / 0;
            }
            int i17 = i14 & 117;
            int i18 = i17 + ((i14 ^ 117) | i17);
            f62186n = i18 % 128;
            int i19 = i18 % 2;
        }

        public static /* synthetic */ setDividerPadding b(Object[] objArr) {
            setDividerPadding setdividerpadding = (setDividerPadding) objArr[0];
            String str = (String) objArr[1];
            String str2 = (String) objArr[2];
            int i10 = f62186n + 84;
            int i11 = (i10 ^ (-1)) + (i10 << 1);
            f62187o = i11 % 128;
            if (i11 % 2 == 0) {
                Intrinsics.checkNotNullParameter(str, "");
                Intrinsics.checkNotNullParameter(str2, "");
                ye.setOnFocusChangeListener setonfocuschangelistener = (ye.setOnFocusChangeListener) setDividerPadding(new Object[]{setdividerpadding}, -977469659, 977469671, System.identityHashCode(setdividerpadding));
                throw null;
            }
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            ye.setOnFocusChangeListener setonfocuschangelistener2 = (ye.setOnFocusChangeListener) setDividerPadding(new Object[]{setdividerpadding}, -977469659, 977469671, System.identityHashCode(setdividerpadding));
            int i12 = f62186n;
            int i13 = i12 & 45;
            int i14 = ((((i12 ^ 45) | i13) << 1) - (~(-((i12 | 45) & (~i13))))) - 1;
            f62187o = i14 % 128;
            if (i14 % 2 != 0) {
                return setdividerpadding;
            }
            throw null;
        }

        public static /* synthetic */ setDividerPadding c(Object[] objArr) {
            setDividerPadding setdividerpadding = (setDividerPadding) objArr[0];
            yr yrVar = (yr) objArr[1];
            int i10 = f62186n + 47;
            f62187o = i10 % 128;
            int i11 = i10 % 2;
            setDividerPadding(new Object[]{yrVar}, -1045245782, 1045245808, (int) System.currentTimeMillis());
            setDividerPadding(new Object[]{setdividerpadding, yrVar}, 1887441621, -1887441611, System.identityHashCode(setdividerpadding));
            int i12 = f62186n;
            int i13 = ((i12 ^ 40) + ((i12 & 40) << 1)) - 1;
            f62187o = i13 % 128;
            if (i13 % 2 != 0) {
                return setdividerpadding;
            }
            throw null;
        }

        public static /* synthetic */ setDividerPadding d(Object[] objArr) {
            setDividerPadding setdividerpadding = (setDividerPadding) objArr[0];
            yk ykVar = (yk) objArr[1];
            int i10 = f62186n;
            int i11 = i10 & 7;
            int i12 = (i10 | 7) & (~i11);
            int i13 = i11 << 1;
            int i14 = (i12 & i13) + (i12 | i13);
            f62187o = i14 % 128;
            if (i14 % 2 == 0) {
                Intrinsics.checkNotNullParameter(ykVar, "");
                setDividerPadding(new Object[]{setdividerpadding, ykVar}, 2021675739, -2021675725, System.identityHashCode(setdividerpadding));
                throw null;
            }
            Intrinsics.checkNotNullParameter(ykVar, "");
            setDividerPadding(new Object[]{setdividerpadding, ykVar}, 2021675739, -2021675725, System.identityHashCode(setdividerpadding));
            int i15 = f62186n + 101;
            f62187o = i15 % 128;
            int i16 = i15 % 2;
            return setdividerpadding;
        }

        public static /* synthetic */ void e(Object[] objArr) {
            setDividerPadding setdividerpadding = (setDividerPadding) objArr[0];
            yi yiVar = (yi) objArr[1];
            int i10 = f62187o;
            int i11 = ((i10 & (-56)) | ((~i10) & 55)) + ((i10 & 55) << 1);
            f62186n = i11 % 128;
            int i12 = i11 % 2;
            setdividerpadding.f62189b = yiVar;
            if (i12 != 0) {
                throw null;
            }
        }

        public static /* synthetic */ void f(Object[] objArr) {
            setDividerPadding setdividerpadding = (setDividerPadding) objArr[0];
            String str = (String) objArr[1];
            int i10 = f62187o;
            int i11 = i10 & 125;
            int i12 = (((i10 ^ 125) | i11) << 1) - ((i10 | 125) & (~i11));
            int i13 = i12 % 128;
            f62186n = i13;
            int i14 = i12 % 2;
            setdividerpadding.f62191d = str;
            if (i14 != 0) {
                int i15 = 9 / 0;
            }
            int i16 = (i13 & (-116)) | ((~i13) & 115);
            int i17 = -(-((i13 & 115) << 1));
            int i18 = ((i16 | i17) << 1) - (i16 ^ i17);
            f62187o = i18 % 128;
            if (i18 % 2 == 0) {
                throw null;
            }
        }

        public static /* synthetic */ setDividerPadding g(Object[] objArr) {
            setDividerPadding setdividerpadding = (setDividerPadding) objArr[0];
            String str = (String) objArr[1];
            int i10 = f62187o;
            int i11 = ((i10 & (-68)) | ((~i10) & 67)) + ((i10 & 67) << 1);
            f62186n = i11 % 128;
            if (i11 % 2 != 0) {
                Intrinsics.checkNotNullParameter(str, "");
                setDividerPadding(new Object[]{setdividerpadding, str}, -916755168, 916755186, System.identityHashCode(setdividerpadding));
                int i12 = 66 / 0;
            } else {
                Intrinsics.checkNotNullParameter(str, "");
                setDividerPadding(new Object[]{setdividerpadding, str}, -916755168, 916755186, System.identityHashCode(setdividerpadding));
            }
            int i13 = f62186n;
            int i14 = i13 & 55;
            int i15 = ((i13 | 55) & (~i14)) + (i14 << 1);
            f62187o = i15 % 128;
            int i16 = i15 % 2;
            return setdividerpadding;
        }

        public static /* synthetic */ setDividerPadding h(Object[] objArr) {
            setDividerPadding setdividerpadding = (setDividerPadding) objArr[0];
            long jLongValue = ((Number) objArr[1]).longValue();
            int i10 = f62187o;
            int i11 = (i10 & 77) + (i10 | 77);
            f62186n = i11 % 128;
            if (i11 % 2 != 0) {
                setDividerPadding(new Object[]{setdividerpadding, Long.valueOf(jLongValue)}, 2111881981, -2111881961, System.identityHashCode(setdividerpadding));
                throw null;
            }
            setDividerPadding(new Object[]{setdividerpadding, Long.valueOf(jLongValue)}, 2111881981, -2111881961, System.identityHashCode(setdividerpadding));
            int i12 = f62186n;
            int i13 = i12 & 27;
            int i14 = ((i12 ^ 27) | i13) << 1;
            int i15 = -((i12 | 27) & (~i13));
            int i16 = (i14 ^ i15) + ((i15 & i14) << 1);
            f62187o = i16 % 128;
            int i17 = i16 % 2;
            return setdividerpadding;
        }

        public static /* synthetic */ ye.setOnFocusChangeListener i(Object[] objArr) {
            setDividerPadding setdividerpadding = (setDividerPadding) objArr[0];
            int i10 = f62187o;
            int i11 = i10 & 37;
            int i12 = (i10 ^ 37) | i11;
            int i13 = (i11 & i12) + (i11 | i12);
            f62186n = i13 % 128;
            int i14 = i13 % 2;
            ye.setOnFocusChangeListener setonfocuschangelistener = setdividerpadding.f62193f;
            int i15 = i10 & 85;
            int i16 = (i10 | 85) & (~i15);
            int i17 = -(-(i15 << 1));
            int i18 = (i16 & i17) + (i16 | i17);
            f62186n = i18 % 128;
            if (i18 % 2 == 0) {
                return setonfocuschangelistener;
            }
            throw null;
        }

        public static /* synthetic */ void j(Object[] objArr) {
            setDividerPadding setdividerpadding = (setDividerPadding) objArr[0];
            yr yrVar = (yr) objArr[1];
            int i10 = f62186n;
            int i11 = i10 & 39;
            int i12 = ((i10 ^ 39) | i11) << 1;
            int i13 = -((i10 | 39) & (~i11));
            int i14 = ((i12 | i13) << 1) - (i13 ^ i12);
            f62187o = i14 % 128;
            int i15 = i14 % 2;
            setdividerpadding.f62197j = yrVar;
            if (i15 == 0) {
                throw null;
            }
        }

        public static /* synthetic */ void k(Object[] objArr) {
            yr yrVar = (yr) objArr[0];
            int i10 = f62187o;
            int i11 = i10 & 113;
            int i12 = (~i11) & (i10 | 113);
            int i13 = -(-(i11 << 1));
            int i14 = (i12 & i13) + (i13 | i12);
            f62186n = i14 % 128;
            int i15 = i14 % 2;
            if (yrVar == null) {
                int i16 = i10 + 63;
                f62186n = i16 % 128;
                if (i16 % 2 != 0) {
                    throw null;
                }
                return;
            }
            if (((yn) yr.setX(new Object[]{yrVar}, -428621868, 428621887, System.identityHashCode(yrVar))) == null) {
                int i17 = f62186n;
                int i18 = i17 ^ 15;
                int i19 = (((i17 & 15) | i18) << 1) - i18;
                int i20 = i19 % 128;
                f62187o = i20;
                if (i19 % 2 != 0) {
                    int i21 = (-2) - ((i20 + 6) ^ (-1));
                    f62186n = i21 % 128;
                    if (i21 % 2 != 0) {
                        throw null;
                    }
                    return;
                }
            } else {
                int i22 = f62187o;
                int i23 = (i22 ^ 111) + ((i22 & 111) << 1);
                f62186n = i23 % 128;
                int i24 = i23 % 2;
            }
            throw new IllegalArgumentException("priorResponse.body != null".toString());
        }

        public static /* synthetic */ setDividerPadding l(Object[] objArr) {
            setDividerPadding setdividerpadding = (setDividerPadding) objArr[0];
            yi yiVar = (yi) objArr[1];
            int i10 = f62186n;
            int i11 = (i10 & (-10)) | ((~i10) & 9);
            int i12 = -(-((i10 & 9) << 1));
            int i13 = ((i11 | i12) << 1) - (i12 ^ i11);
            f62187o = i13 % 128;
            if (i13 % 2 == 0) {
                Intrinsics.checkNotNullParameter(yiVar, "");
                setDividerPadding(new Object[]{setdividerpadding, yiVar}, 341829118, -341829102, System.identityHashCode(setdividerpadding));
                throw null;
            }
            Intrinsics.checkNotNullParameter(yiVar, "");
            setDividerPadding(new Object[]{setdividerpadding, yiVar}, 341829118, -341829102, System.identityHashCode(setdividerpadding));
            int i14 = f62187o + 113;
            f62186n = i14 % 128;
            if (i14 % 2 == 0) {
                return setdividerpadding;
            }
            throw null;
        }

        public static /* synthetic */ setDividerPadding m(Object[] objArr) {
            setDividerPadding setdividerpadding = (setDividerPadding) objArr[0];
            yf yfVar = (yf) objArr[1];
            int i10 = f62186n;
            int i11 = i10 & 13;
            int i12 = -(-((i10 ^ 13) | i11));
            int i13 = (i11 ^ i12) + ((i12 & i11) << 1);
            f62187o = i13 % 128;
            if (i13 % 2 == 0) {
                setDividerPadding(new Object[]{setdividerpadding, yfVar}, 1988401718, -1988401707, System.identityHashCode(setdividerpadding));
                throw null;
            }
            setDividerPadding(new Object[]{setdividerpadding, yfVar}, 1988401718, -1988401707, System.identityHashCode(setdividerpadding));
            int i14 = f62186n;
            int i15 = ((i14 ^ 67) | (i14 & 67)) << 1;
            int i16 = -(((~i14) & 67) | (i14 & (-68)));
            int i17 = (i15 ^ i16) + ((i16 & i15) << 1);
            f62187o = i17 % 128;
            if (i17 % 2 != 0) {
                return setdividerpadding;
            }
            throw null;
        }

        public static /* synthetic */ Integer n(Object[] objArr) {
            setDividerPadding setdividerpadding = (setDividerPadding) objArr[0];
            int i10 = f62187o;
            int i11 = ((i10 | 87) << 1) - (i10 ^ 87);
            f62186n = i11 % 128;
            int i12 = i11 % 2;
            int i13 = setdividerpadding.f62190c;
            if (i12 != 0) {
                int i14 = 15 / 0;
            }
            int i15 = i10 + 63;
            f62186n = i15 % 128;
            int i16 = i15 % 2;
            return Integer.valueOf(i13);
        }

        public static /* synthetic */ void o(Object[] objArr) {
            setDividerPadding setdividerpadding = (setDividerPadding) objArr[0];
            long jLongValue = ((Number) objArr[1]).longValue();
            int i10 = f62186n + 23;
            int i11 = i10 % 128;
            f62187o = i11;
            int i12 = i10 % 2;
            setdividerpadding.f62199l = jLongValue;
            int i13 = ((i11 | 109) << 1) - (i11 ^ 109);
            f62186n = i13 % 128;
            if (i13 % 2 != 0) {
                throw null;
            }
        }

        public static /* synthetic */ void p(Object[] objArr) {
            setDividerPadding setdividerpadding = (setDividerPadding) objArr[0];
            yr yrVar = (yr) objArr[1];
            int i10 = f62187o;
            int i11 = (((i10 ^ 39) | (i10 & 39)) << 1) - (((~i10) & 39) | (i10 & (-40)));
            f62186n = i11 % 128;
            int i12 = i11 % 2;
            setdividerpadding.f62195h = yrVar;
            if (i12 != 0) {
                int i13 = 65 / 0;
            }
        }

        public static /* synthetic */ void q(Object[] objArr) {
            setDividerPadding setdividerpadding = (setDividerPadding) objArr[0];
            yn ynVar = (yn) objArr[1];
            int i10 = f62187o;
            int i11 = i10 & 81;
            int i12 = (i11 - (~(-(-((i10 ^ 81) | i11))))) - 1;
            f62186n = i12 % 128;
            int i13 = i12 % 2;
            setdividerpadding.f62194g = ynVar;
            if (i13 != 0) {
                throw null;
            }
            int i14 = (i10 & (-88)) | ((~i10) & 87);
            int i15 = -(-((i10 & 87) << 1));
            int i16 = (i14 ^ i15) + ((i14 & i15) << 1);
            f62186n = i16 % 128;
            if (i16 % 2 != 0) {
                throw null;
            }
        }

        public static /* synthetic */ setDividerPadding r(Object[] objArr) {
            setDividerPadding setdividerpadding = (setDividerPadding) objArr[0];
            yn ynVar = (yn) objArr[1];
            int i10 = f62186n;
            int i11 = (i10 & (-14)) | ((~i10) & 13);
            int i12 = (i10 & 13) << 1;
            int i13 = ((i11 | i12) << 1) - (i12 ^ i11);
            f62187o = i13 % 128;
            int i14 = i13 % 2;
            setDividerPadding(new Object[]{setdividerpadding, ynVar}, -783795991, 783795999, System.identityHashCode(setdividerpadding));
            int i15 = f62186n;
            int i16 = (i15 | 27) << 1;
            int i17 = -(((~i15) & 27) | (i15 & (-28)));
            int i18 = (i16 & i17) + (i17 | i16);
            f62187o = i18 % 128;
            if (i18 % 2 != 0) {
                return setdividerpadding;
            }
            throw null;
        }

        public static /* synthetic */ setDividerPadding s(Object[] objArr) {
            setDividerPadding setdividerpadding = (setDividerPadding) objArr[0];
            long jLongValue = ((Number) objArr[1]).longValue();
            int i10 = f62186n + 25;
            f62187o = i10 % 128;
            int i11 = i10 % 2;
            setDividerPadding(new Object[]{setdividerpadding, Long.valueOf(jLongValue)}, -2072066040, 2072066055, System.identityHashCode(setdividerpadding));
            int i12 = f62187o;
            int i13 = ((i12 ^ 115) - (~(-(-((i12 & 115) << 1))))) - 1;
            f62186n = i13 % 128;
            if (i13 % 2 == 0) {
                return setdividerpadding;
            }
            throw null;
        }

        public static /* synthetic */ Object setDividerPadding(Object[] objArr, int i10, int i11, int i12) {
            setDividerPadding setdividerpadding;
            int i13 = (i11 * (-667)) + (i10 * (-1335));
            int i14 = ~i11;
            int i15 = i10 | i12;
            switch (((i14 | i15) * 668) + ((i10 | (~(i12 | i14))) * 1336) + (((~i15) | i14) * (-668)) + i13) {
                case 1:
                    return h(objArr);
                case 2:
                    t(objArr);
                    return null;
                case 3:
                    setDividerPadding setdividerpadding2 = (setDividerPadding) objArr[0];
                    int iIntValue = ((Number) objArr[1]).intValue();
                    int i16 = f62186n;
                    int i17 = (((i16 & (-60)) | ((~i16) & 59)) - (~(-(-((i16 & 59) << 1))))) - 1;
                    f62187o = i17 % 128;
                    int i18 = i17 % 2;
                    setdividerpadding2.f62190c = iIntValue;
                    int i19 = (-2) - (((i16 & 70) + (i16 | 70)) ^ (-1));
                    f62187o = i19 % 128;
                    int i20 = i19 % 2;
                    return null;
                case 4:
                    p(objArr);
                    return null;
                case 5:
                    u(objArr);
                    return null;
                case 6:
                    return c(objArr);
                case 7:
                    return m(objArr);
                case 8:
                    q(objArr);
                    return null;
                case 9:
                    return n(objArr);
                case 10:
                    j(objArr);
                    return null;
                case 11:
                    a(objArr);
                    return null;
                case 12:
                    return i(objArr);
                case 13:
                    return r(objArr);
                case 14:
                    setDividerPadding setdividerpadding3 = (setDividerPadding) objArr[0];
                    yk ykVar = (yk) objArr[1];
                    int i21 = f62186n;
                    int i22 = (i21 ^ 73) + ((i21 & 73) << 1);
                    f62187o = i22 % 128;
                    int i23 = i22 % 2;
                    setdividerpadding3.f62188a = ykVar;
                    int i24 = ((i21 & 109) - (~(i21 | 109))) - 1;
                    f62187o = i24 % 128;
                    int i25 = i24 % 2;
                    return null;
                case 15:
                    setDividerPadding setdividerpadding4 = (setDividerPadding) objArr[0];
                    long jLongValue = ((Number) objArr[1]).longValue();
                    int i26 = f62187o;
                    int i27 = i26 & 3;
                    int i28 = -(-((i26 ^ 3) | i27));
                    int i29 = (i27 ^ i28) + ((i27 & i28) << 1);
                    f62186n = i29 % 128;
                    int i30 = i29 % 2;
                    setdividerpadding4.f62198k = jLongValue;
                    int i31 = i26 & 113;
                    int i32 = (i26 ^ 113) | i31;
                    int i33 = (i31 & i32) + (i32 | i31);
                    f62186n = i33 % 128;
                    int i34 = i33 % 2;
                    return null;
                case 16:
                    e(objArr);
                    return null;
                case 17:
                    return v(objArr);
                case 18:
                    f(objArr);
                    return null;
                case 19:
                    return g(objArr);
                case 20:
                    o(objArr);
                    return null;
                case 21:
                    return b(objArr);
                case 22:
                    return s(objArr);
                case 23:
                    return d(objArr);
                case 24:
                    setDividerPadding setdividerpadding5 = (setDividerPadding) objArr[0];
                    ye yeVar = (ye) objArr[1];
                    int i35 = f62187o;
                    int i36 = i35 & 35;
                    int i37 = ((i35 | 35) & (~i36)) + (i36 << 1);
                    f62186n = i37 % 128;
                    int i38 = i37 % 2;
                    Intrinsics.checkNotNullParameter(yeVar, "");
                    setDividerPadding(new Object[]{setdividerpadding5, (ye.setOnFocusChangeListener) ye.setCompoundDrawableTintBlendMode(new Object[]{yeVar}, -1528950893, 1528950899, System.identityHashCode(yeVar))}, -76178164, 76178192, System.identityHashCode(setdividerpadding5));
                    System.identityHashCode(setdividerpadding5);
                    System.identityHashCode(setdividerpadding5);
                    return setdividerpadding5;
                case 25:
                    setdividerpadding = (setDividerPadding) objArr[0];
                    yr yrVar = (yr) objArr[1];
                    int i39 = f62187o;
                    int i40 = ((i39 | 93) << 1) - (i39 ^ 93);
                    f62186n = i40 % 128;
                    if (i40 % 2 != 0) {
                        setDividerPadding(new Object[]{"networkResponse", yrVar}, -1242394603, 1242394608, (int) System.currentTimeMillis());
                        setDividerPadding(new Object[]{setdividerpadding, yrVar}, -1030380012, 1030380016, System.identityHashCode(setdividerpadding));
                        throw null;
                    }
                    setDividerPadding(new Object[]{"networkResponse", yrVar}, -1242394603, 1242394608, (int) System.currentTimeMillis());
                    setDividerPadding(new Object[]{setdividerpadding, yrVar}, -1030380012, 1030380016, System.identityHashCode(setdividerpadding));
                    break;
                    break;
                case 26:
                    k(objArr);
                    return null;
                case 27:
                    return l(objArr);
                case 28:
                    setDividerPadding setdividerpadding6 = (setDividerPadding) objArr[0];
                    ye.setOnFocusChangeListener setonfocuschangelistener = (ye.setOnFocusChangeListener) objArr[1];
                    int i41 = f62187o;
                    int i42 = (i41 & (-10)) | ((~i41) & 9);
                    int i43 = (i41 & 9) << 1;
                    int i44 = ((i42 | i43) << 1) - (i43 ^ i42);
                    f62186n = i44 % 128;
                    int i45 = i44 % 2;
                    Intrinsics.checkNotNullParameter(setonfocuschangelistener, "");
                    setdividerpadding6.f62193f = setonfocuschangelistener;
                    int i46 = f62187o;
                    int i47 = (-2) - (((i46 & 36) + (i46 | 36)) ^ (-1));
                    f62186n = i47 % 128;
                    int i48 = i47 % 2;
                    return null;
                case 29:
                    setDividerPadding setdividerpadding7 = (setDividerPadding) objArr[0];
                    int iIntValue2 = ((Number) objArr[1]).intValue();
                    int i49 = f62186n;
                    int i50 = i49 & 37;
                    int i51 = ((i49 ^ 37) | i50) << 1;
                    int i52 = -((i49 | 37) & (~i50));
                    int i53 = (i51 & i52) + (i52 | i51);
                    f62187o = i53 % 128;
                    int i54 = i53 % 2;
                    setDividerPadding(new Object[]{setdividerpadding7, Integer.valueOf(iIntValue2)}, 102905151, -102905148, iIntValue2);
                    int i55 = f62187o;
                    int i56 = i55 & 113;
                    int i57 = (i56 - (~(-(-((i55 ^ 113) | i56))))) - 1;
                    f62186n = i57 % 128;
                    if (i57 % 2 == 0) {
                        return setdividerpadding7;
                    }
                    int i58 = 58 / 0;
                    return setdividerpadding7;
                case 30:
                    setDividerPadding setdividerpadding8 = (setDividerPadding) objArr[0];
                    String str = (String) objArr[1];
                    String str2 = (String) objArr[2];
                    int i59 = f62186n;
                    int i60 = ((i59 & (-46)) | ((~i59) & 45)) + ((i59 & 45) << 1);
                    f62187o = i60 % 128;
                    int i61 = i60 % 2;
                    Intrinsics.checkNotNullParameter(str, "");
                    Intrinsics.checkNotNullParameter(str2, "");
                    ye.setOnFocusChangeListener setonfocuschangelistener2 = (ye.setOnFocusChangeListener) setDividerPadding(new Object[]{setdividerpadding8}, -977469659, 977469671, System.identityHashCode(setdividerpadding8));
                    int i62 = f62186n;
                    int i63 = i62 & 3;
                    int i64 = ((i62 | 3) & (~i63)) + (i63 << 1);
                    f62187o = i64 % 128;
                    int i65 = i64 % 2;
                    return setdividerpadding8;
                case 31:
                    setDividerPadding setdividerpadding9 = (setDividerPadding) objArr[0];
                    yr yrVar2 = (yr) objArr[1];
                    int i66 = f62187o;
                    int i67 = (i66 ^ 55) + ((i66 & 55) << 1);
                    f62186n = i67 % 128;
                    int i68 = i67 % 2;
                    setdividerpadding9.f62196i = yrVar2;
                    if (i68 != 0) {
                        int i69 = 41 / 0;
                    }
                    int i70 = i66 & 33;
                    int i71 = (i70 - (~((i66 ^ 33) | i70))) - 1;
                    f62186n = i71 % 128;
                    if (i71 % 2 == 0) {
                        return null;
                    }
                    throw null;
                default:
                    setdividerpadding = (setDividerPadding) objArr[0];
                    yr yrVar3 = (yr) objArr[1];
                    int i72 = f62187o;
                    int i73 = (i72 ^ 67) + ((i72 & 67) << 1);
                    f62186n = i73 % 128;
                    if (i73 % 2 != 0) {
                        setDividerPadding(new Object[]{"cacheResponse", yrVar3}, -1242394603, 1242394608, (int) System.currentTimeMillis());
                        setDividerPadding(new Object[]{setdividerpadding, yrVar3}, -2064493590, 2064493621, System.identityHashCode(setdividerpadding));
                        throw null;
                    }
                    setDividerPadding(new Object[]{"cacheResponse", yrVar3}, -1242394603, 1242394608, (int) System.currentTimeMillis());
                    setDividerPadding(new Object[]{setdividerpadding, yrVar3}, -2064493590, 2064493621, System.identityHashCode(setdividerpadding));
                    int i74 = f62187o;
                    int i75 = ((i74 & 28) + (i74 | 28)) - 1;
                    f62186n = i75 % 128;
                    int i76 = i75 % 2;
                    break;
                    break;
            }
            return setdividerpadding;
        }

        public static /* synthetic */ void t(Object[] objArr) {
            setDividerPadding setdividerpadding = (setDividerPadding) objArr[0];
            zg zgVar = (zg) objArr[1];
            int i10 = f62186n;
            int i11 = ((i10 | 85) << 1) - (i10 ^ 85);
            f62187o = i11 % 128;
            if (i11 % 2 != 0) {
                Intrinsics.checkNotNullParameter(zgVar, "");
                setdividerpadding.m = zgVar;
            } else {
                Intrinsics.checkNotNullParameter(zgVar, "");
                setdividerpadding.m = zgVar;
                int i12 = 17 / 0;
            }
        }

        public static /* synthetic */ void u(Object[] objArr) {
            String str = (String) objArr[0];
            yr yrVar = (yr) objArr[1];
            int i10 = f62187o;
            int i11 = i10 & 17;
            int i12 = ((~i11) & (i10 | 17)) + (i11 << 1);
            f62186n = i12 % 128;
            int i13 = i12 % 2;
            if (yrVar == null) {
                int i14 = (i10 & 29) + (i10 | 29);
                f62186n = i14 % 128;
                if (i14 % 2 != 0) {
                    int i15 = 30 / 0;
                }
                int i16 = (((i10 | 8) << 1) - (i10 ^ 8)) - 1;
                f62186n = i16 % 128;
                int i17 = i16 % 2;
                return;
            }
            if (((yn) yr.setX(new Object[]{yrVar}, -428621868, 428621887, System.identityHashCode(yrVar))) == null) {
                int i18 = f62187o;
                int i19 = (i18 & 63) + (i18 | 63);
                f62186n = i19 % 128;
                if (i19 % 2 == 0) {
                    if (((yr) yr.setX(new Object[]{yrVar}, 1382857161, -1382857143, System.identityHashCode(yrVar))) != null) {
                        int i20 = f62186n;
                        int i21 = ((i20 | 118) << 1) - (i20 ^ 118);
                        int i22 = (i21 ^ (-1)) + (i21 << 1);
                        f62187o = i22 % 128;
                        int i23 = i22 % 2;
                        throw new IllegalArgumentException(Intrinsics.stringPlus(str, ".networkResponse != null").toString());
                    }
                    int i24 = f62186n;
                    int i25 = ((i24 | 85) << 1) - (i24 ^ 85);
                    f62187o = i25 % 128;
                    int i26 = i25 % 2;
                    int i27 = ((i24 ^ 61) | (i24 & 61)) << 1;
                    int i28 = -(((~i24) & 61) | (i24 & (-62)));
                    int i29 = ((i27 | i28) << 1) - (i28 ^ i27);
                    f62187o = i29 % 128;
                    int i30 = i29 % 2;
                    if (((yr) yr.setX(new Object[]{yrVar}, 1387574357, -1387574349, System.identityHashCode(yrVar))) != null) {
                        int i31 = f62187o;
                        int i32 = i31 & 103;
                        int i33 = i32 + ((i31 ^ 103) | i32);
                        f62186n = i33 % 128;
                        int i34 = i33 % 2;
                        throw new IllegalArgumentException(Intrinsics.stringPlus(str, ".cacheResponse != null").toString());
                    }
                    int i35 = f62186n;
                    int i36 = (((i35 & (-84)) | ((~i35) & 83)) - (~((i35 & 83) << 1))) - 1;
                    int i37 = i36 % 128;
                    f62187o = i37;
                    int i38 = i36 % 2;
                    int i39 = i37 ^ 59;
                    int i40 = (i37 & 59) << 1;
                    int i41 = ((i39 | i40) << 1) - (i40 ^ i39);
                    f62186n = i41 % 128;
                    int i42 = i41 % 2;
                    if (((yr) yr.setX(new Object[]{yrVar}, 2003566487, -2003566470, System.identityHashCode(yrVar))) != null) {
                        int i43 = (-2) - ((f62187o + 68) ^ (-1));
                        f62186n = i43 % 128;
                        int i44 = i43 % 2;
                        throw new IllegalArgumentException(Intrinsics.stringPlus(str, ".priorResponse != null").toString());
                    }
                    int i45 = f62187o;
                    int i46 = i45 + 21;
                    f62186n = i46 % 128;
                    int i47 = i46 % 2;
                    int i48 = (i45 ^ 73) + ((i45 & 73) << 1);
                    f62186n = i48 % 128;
                    int i49 = i48 % 2;
                    return;
                }
            } else {
                int i50 = f62186n;
                int i51 = i50 & 43;
                int i52 = (((i50 | 43) & (~i51)) - (~(i51 << 1))) - 1;
                f62187o = i52 % 128;
                int i53 = i52 % 2;
            }
            throw new IllegalArgumentException(Intrinsics.stringPlus(str, ".body != null").toString());
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0033, code lost:
        
            if (r6 == null) goto L21;
         */
        /* JADX WARN: Code restructure failed: missing block: B:11:0x0035, code lost:
        
            r7 = r1.f62189b;
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x0037, code lost:
        
            if (r7 == null) goto L19;
         */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x0039, code lost:
        
            r8 = r1.f62191d;
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x003b, code lost:
        
            if (r8 == null) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x003d, code lost:
        
            r9 = r1.f62190c;
            r10 = r1.f62192e;
            r2 = r1.f62193f;
            r1 = new com.mypinpad.tsdk.isolation.yr(r6, r7, r8, r9, r10, (com.mypinpad.tsdk.isolation.ye) com.mypinpad.tsdk.i.ye.setOnFocusChangeListener.setOnFocusChangeListener(new java.lang.Object[]{r2}, -1008790874, 1008790879, java.lang.System.identityHashCode(r2)), r1.f62194g, r1.f62195h, r1.f62196i, r1.f62197j, r1.f62198k, r1.f62199l, r1.m);
            r0 = com.mypinpad.tsdk.i.yr.setDividerPadding.f62187o;
            r2 = r0 & 51;
            r0 = -(-((r0 ^ 51) | r2));
            r3 = (r2 ^ r0) + ((r0 & r2) << 1);
            com.mypinpad.tsdk.i.yr.setDividerPadding.f62186n = r3 % 128;
            r3 = r3 % 2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x0087, code lost:
        
            return r1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x0093, code lost:
        
            throw new java.lang.IllegalStateException("message == null".toString());
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x009f, code lost:
        
            throw new java.lang.IllegalStateException("protocol == null".toString());
         */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x00ab, code lost:
        
            throw new java.lang.IllegalStateException("request == null".toString());
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x00ac, code lost:
        
            r3 = ((r2 | 7) << 1) - (r2 ^ 7);
            com.mypinpad.tsdk.i.yr.setDividerPadding.f62186n = r3 % 128;
            r3 = r3 % 2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x00e4, code lost:
        
            throw new java.lang.IllegalStateException(kotlin.jvm.internal.Intrinsics.stringPlus("code < 0: ", java.lang.Integer.valueOf(((java.lang.Integer) setDividerPadding(new java.lang.Object[]{r1}, -314644963, 314644972, java.lang.System.identityHashCode(r1))).intValue())).toString());
         */
        /* JADX WARN: Code restructure failed: missing block: B:5:0x0022, code lost:
        
            if (r1.f62190c >= 0) goto L9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x0027, code lost:
        
            if (r1.f62190c >= 0) goto L9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x0029, code lost:
        
            r2 = r2 + 101;
            com.mypinpad.tsdk.i.yr.setDividerPadding.f62186n = r2 % 128;
            r2 = r2 % 2;
            r6 = r1.f62188a;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public static /* synthetic */ com.mypinpad.tsdk.isolation.yr v(java.lang.Object[] r21) {
            /*
                Method dump skipped, instruction units count: 229
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.i.yr.setDividerPadding.v(java.lang.Object[]):com.mypinpad.tsdk.i.yr");
        }

        public final void setCompoundDrawableTintBlendMode(@NotNull zg zgVar) {
            setDividerPadding(new Object[]{this, zgVar}, 705345493, -705345491, System.identityHashCode(this));
        }

        @NotNull
        public final yr setOnFocusChangeListener() {
            return (yr) setDividerPadding(new Object[]{this}, -92684172, 92684189, System.identityHashCode(this));
        }

        @NotNull
        public final setDividerPadding setX(@Nullable yr yrVar) {
            return (setDividerPadding) setDividerPadding(new Object[]{this, yrVar}, -66560998, 66561004, System.identityHashCode(this));
        }

        @NotNull
        public final setDividerPadding setY(long j10) {
            return (setDividerPadding) setDividerPadding(new Object[]{this, Long.valueOf(j10)}, -790912778, 790912800, System.identityHashCode(this));
        }

        @NotNull
        public final setDividerPadding setCompoundDrawableTintBlendMode(long j10) {
            return (setDividerPadding) setDividerPadding(new Object[]{this, Long.valueOf(j10)}, 485790072, -485790071, System.identityHashCode(this));
        }

        @NotNull
        public final setDividerPadding setOnFocusChangeListener(@NotNull String str, @NotNull String str2) {
            return (setDividerPadding) setDividerPadding(new Object[]{this, str, str2}, -718206307, 718206337, System.identityHashCode(this));
        }

        @NotNull
        public final setDividerPadding setX(@NotNull yk ykVar) {
            return (setDividerPadding) setDividerPadding(new Object[]{this, ykVar}, 1035005502, -1035005479, System.identityHashCode(this));
        }

        @NotNull
        public final setDividerPadding setY(@NotNull ye yeVar) {
            return (setDividerPadding) setDividerPadding(new Object[]{this, yeVar}, 1273569601, -1273569577, System.identityHashCode(this));
        }

        @NotNull
        public final setDividerPadding setCompoundDrawableTintBlendMode(@Nullable yr yrVar) {
            return (setDividerPadding) setDividerPadding(new Object[]{this, yrVar}, 1518624621, -1518624621, System.identityHashCode(this));
        }

        @NotNull
        public final setDividerPadding setY(@NotNull String str, @NotNull String str2) {
            return (setDividerPadding) setDividerPadding(new Object[]{this, str, str2}, -979970500, 979970521, System.identityHashCode(this));
        }

        public setDividerPadding(@NotNull yr yrVar) {
            Intrinsics.checkNotNullParameter(yrVar, "");
            this.f62190c = -1;
            this.f62188a = (yk) yr.setX(new Object[]{yrVar}, -504719753, 504719763, System.identityHashCode(yrVar));
            this.f62189b = (yi) yr.setX(new Object[]{yrVar}, -134305925, 134305938, System.identityHashCode(yrVar));
            this.f62190c = ((Integer) yr.setX(new Object[]{yrVar}, 151122101, -151122100, System.identityHashCode(yrVar))).intValue();
            this.f62191d = (String) yr.setX(new Object[]{yrVar}, -171382441, 171382457, System.identityHashCode(yrVar));
            this.f62192e = (yf) yr.setX(new Object[]{yrVar}, 339520473, -339520467, System.identityHashCode(yrVar));
            ye yeVar = (ye) yr.setX(new Object[]{yrVar}, 1547100838, -1547100838, System.identityHashCode(yrVar));
            this.f62193f = (ye.setOnFocusChangeListener) ye.setCompoundDrawableTintBlendMode(new Object[]{yeVar}, -1528950893, 1528950899, System.identityHashCode(yeVar));
            this.f62194g = (yn) yr.setX(new Object[]{yrVar}, -428621868, 428621887, System.identityHashCode(yrVar));
            this.f62195h = (yr) yr.setX(new Object[]{yrVar}, 1382857161, -1382857143, System.identityHashCode(yrVar));
            this.f62196i = (yr) yr.setX(new Object[]{yrVar}, 1387574357, -1387574349, System.identityHashCode(yrVar));
            this.f62197j = (yr) yr.setX(new Object[]{yrVar}, 2003566487, -2003566470, System.identityHashCode(yrVar));
            this.f62198k = ((Long) yr.setX(new Object[]{yrVar}, -1353479930, 1353479935, System.identityHashCode(yrVar))).longValue();
            this.f62199l = ((Long) yr.setX(new Object[]{yrVar}, -144747726, 144747740, System.identityHashCode(yrVar))).longValue();
            this.m = (zg) yr.setX(new Object[]{yrVar}, -1378120774, 1378120785, System.identityHashCode(yrVar));
        }

        @NotNull
        public final setDividerPadding setCompoundDrawableTintBlendMode(@NotNull yi yiVar) {
            return (setDividerPadding) setDividerPadding(new Object[]{this, yiVar}, 1826457204, -1826457177, System.identityHashCode(this));
        }

        @NotNull
        public final setDividerPadding setY(@NotNull String str) {
            return (setDividerPadding) setDividerPadding(new Object[]{this, str}, 176587316, -176587297, System.identityHashCode(this));
        }

        public final int setY() {
            return ((Integer) setDividerPadding(new Object[]{this}, -314644963, 314644972, System.identityHashCode(this))).intValue();
        }

        @NotNull
        public final setDividerPadding setDividerPadding(@Nullable yr yrVar) {
            return (setDividerPadding) setDividerPadding(new Object[]{this, yrVar}, 874392842, -874392817, System.identityHashCode(this));
        }

        @NotNull
        public final setDividerPadding setDividerPadding(@Nullable yn ynVar) {
            return (setDividerPadding) setDividerPadding(new Object[]{this, ynVar}, 637562883, -637562870, System.identityHashCode(this));
        }

        @NotNull
        public final setDividerPadding setDividerPadding(@Nullable yf yfVar) {
            return (setDividerPadding) setDividerPadding(new Object[]{this, yfVar}, 2113773491, -2113773484, System.identityHashCode(this));
        }

        @NotNull
        public final setDividerPadding setDividerPadding(int i10) {
            return (setDividerPadding) setDividerPadding(new Object[]{this, Integer.valueOf(i10)}, 784510625, -784510596, i10);
        }
    }

    public yr(@NotNull yk ykVar, @NotNull yi yiVar, @NotNull String str, int i10, @Nullable yf yfVar, @NotNull ye yeVar, @Nullable yn ynVar, @Nullable yr yrVar, @Nullable yr yrVar2, @Nullable yr yrVar3, long j10, long j11, @Nullable zg zgVar) {
        Intrinsics.checkNotNullParameter(ykVar, "");
        Intrinsics.checkNotNullParameter(yiVar, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(yeVar, "");
        this.f62177p0 = ykVar;
        this.f62178q0 = yiVar;
        this.f62179r0 = str;
        this.f62180s0 = i10;
        this.f62181t0 = yfVar;
        this.f62182u0 = yeVar;
        this.v0 = ynVar;
        this.f62183w0 = yrVar;
        this.f62184x0 = yrVar2;
        this.f62185y0 = yrVar3;
        this.E0 = j10;
        this.F0 = j11;
        this.G0 = zgVar;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0037  */
    /* JADX WARN: Code duplicated, block: B:12:0x0062  */
    /* JADX WARN: Code duplicated, block: B:9:0x0024  */
    public static /* synthetic */ xq a(Object[] objArr) {
        xq xqVar;
        int i10;
        yr yrVar = (yr) objArr[0];
        int i11 = I0;
        int i12 = ((i11 & 66) + (i11 | 66)) - 1;
        J0 = i12 % 128;
        if (i12 % 2 == 0) {
            xqVar = yrVar.H0;
            int i13 = 80 / 0;
            if (xqVar == null) {
                i10 = (i11 & 81) + (i11 | 81);
                J0 = i10 % 128;
                if (i10 % 2 != 0) {
                    xq.Companion companion = xq.INSTANCE;
                    yrVar.H0 = (xq) xq.Companion.setDividerPadding(new Object[]{yrVar.f62182u0}, 1821148600, -1821148599, (int) System.currentTimeMillis());
                    throw null;
                }
                xq.Companion companion2 = xq.INSTANCE;
                xqVar = (xq) xq.Companion.setDividerPadding(new Object[]{yrVar.f62182u0}, 1821148600, -1821148599, (int) System.currentTimeMillis());
                yrVar.H0 = xqVar;
                int i14 = I0;
                int i15 = i14 & 93;
                int i16 = -(-((i14 ^ 93) | i15));
                int i17 = ((i15 | i16) << 1) - (i16 ^ i15);
                J0 = i17 % 128;
                int i18 = i17 % 2;
            }
        } else {
            xqVar = yrVar.H0;
            if (xqVar == null) {
                i10 = (i11 & 81) + (i11 | 81);
                J0 = i10 % 128;
                if (i10 % 2 != 0) {
                    xq.Companion companion3 = xq.INSTANCE;
                    yrVar.H0 = (xq) xq.Companion.setDividerPadding(new Object[]{yrVar.f62182u0}, 1821148600, -1821148599, (int) System.currentTimeMillis());
                    throw null;
                }
                xq.Companion companion4 = xq.INSTANCE;
                xqVar = (xq) xq.Companion.setDividerPadding(new Object[]{yrVar.f62182u0}, 1821148600, -1821148599, (int) System.currentTimeMillis());
                yrVar.H0 = xqVar;
                int i19 = I0;
                int i110 = i19 & 93;
                int i111 = -(-((i19 ^ 93) | i110));
                int i112 = ((i110 | i111) << 1) - (i111 ^ i110);
                J0 = i112 % 128;
                int i113 = i112 % 2;
            }
        }
        int i20 = I0;
        int i21 = i20 & 107;
        int i22 = ((i20 ^ 107) | i21) << 1;
        int i23 = -((i20 | 107) & (~i21));
        int i24 = (i22 ^ i23) + ((i23 & i22) << 1);
        J0 = i24 % 128;
        if (i24 % 2 != 0) {
            return xqVar;
        }
        throw null;
    }

    public static /* synthetic */ List b(Object[] objArr) {
        String str;
        yr yrVar = (yr) objArr[0];
        int i10 = I0;
        int i11 = (-2) - ((i10 + 26) ^ (-1));
        int i12 = i11 % 128;
        J0 = i12;
        if (i11 % 2 == 0) {
            ye yeVar = yrVar.f62182u0;
            throw null;
        }
        ye yeVar2 = yrVar.f62182u0;
        int i13 = yrVar.f62180s0;
        if (i13 == 401) {
            int i14 = ((i12 & 66) + (i12 | 66)) - 1;
            I0 = i14 % 128;
            int i15 = i14 % 2;
            str = "WWW-Authenticate";
        } else {
            if (i13 != 407) {
                List listEmptyList = CollectionsKt__CollectionsKt.emptyList();
                int i16 = J0 + 117;
                I0 = i16 % 128;
                if (i16 % 2 == 0) {
                    return listEmptyList;
                }
                throw null;
            }
            int i17 = (i10 ^ 33) + ((i10 & 33) << 1);
            J0 = i17 % 128;
            int i18 = i17 % 2;
            str = "Proxy-Authenticate";
        }
        List list = (List) zt.setX(new Object[]{yeVar2, str}, -1009300189, 1009300193, (int) System.currentTimeMillis());
        int i19 = I0;
        int i20 = (i19 & (-116)) | ((~i19) & 115);
        int i21 = -(-((i19 & 115) << 1));
        int i22 = (i20 ^ i21) + ((i21 & i20) << 1);
        J0 = i22 % 128;
        if (i22 % 2 != 0) {
            return list;
        }
        throw null;
    }

    public static /* synthetic */ String c(Object[] objArr) {
        yr yrVar = (yr) objArr[0];
        String str = (String) objArr[1];
        int i10 = I0;
        int i11 = i10 & 27;
        int i12 = (i10 | 27) & (~i11);
        int i13 = i11 << 1;
        int i14 = (i12 ^ i13) + ((i12 & i13) << 1);
        J0 = i14 % 128;
        if (i14 % 2 != 0) {
            return (String) setX(new Object[]{yrVar, str, null}, -629038889, 629038904, System.identityHashCode(yrVar));
        }
        throw null;
    }

    public static /* synthetic */ String setCompoundDrawableTintBlendMode(yr yrVar, String str) {
        return (String) setX(new Object[]{yrVar, str}, 401167373, -401167369, (int) System.currentTimeMillis());
    }

    public static /* synthetic */ Object setX(Object[] objArr, int i10, int i11, int i12) {
        Object objValueOf;
        int i13 = ~i10;
        int i14 = ~(i13 | i11);
        int i15 = ~i12;
        int i16 = ((i14 | (~(i15 | i11))) * (-108)) + (i11 * (-107)) + (i10 * 55);
        int i17 = ~(i13 | i12);
        int i18 = ~((~i11) | i10);
        String str = null;
        switch (((i18 | i12) * 54) + (((~(i10 | i15)) | i17 | i18) * 54) + i16) {
            case 1:
                yr yrVar = (yr) objArr[0];
                int i19 = J0;
                int i20 = ((i19 & 3) - (~(i19 | 3))) - 1;
                I0 = i20 % 128;
                int i21 = i20 % 2;
                int i22 = yrVar.f62180s0;
                int i23 = (i19 & 13) + (i19 | 13);
                I0 = i23 % 128;
                int i24 = i23 % 2;
                return Integer.valueOf(i22);
            case 2:
                return b(objArr);
            case 3:
                return a(objArr);
            case 4:
                return c(objArr);
            case 5:
                yr yrVar2 = (yr) objArr[0];
                int i25 = J0;
                int i26 = (-2) - ((i25 + 112) ^ (-1));
                I0 = i26 % 128;
                int i27 = i26 % 2;
                long j10 = yrVar2.E0;
                int i28 = i25 & 55;
                int i29 = ((i25 | 55) & (~i28)) + (i28 << 1);
                I0 = i29 % 128;
                if (i29 % 2 != 0) {
                    int i30 = 74 / 0;
                }
                objValueOf = Long.valueOf(j10);
                break;
            case 6:
                yr yrVar3 = (yr) objArr[0];
                int i31 = I0;
                int i32 = ((((i31 ^ 113) | (i31 & 113)) << 1) - (~(-((113 & (~i31)) | (i31 & (-114)))))) - 1;
                J0 = i32 % 128;
                int i33 = i32 % 2;
                objValueOf = yrVar3.f62181t0;
                int i34 = i31 + 45;
                J0 = i34 % 128;
                if (i34 % 2 == 0) {
                    throw null;
                }
                break;
            case 7:
                yr yrVar4 = (yr) objArr[0];
                StringBuilder sb2 = new StringBuilder("Response{protocol=");
                sb2.append(yrVar4.f62178q0);
                sb2.append(", code=");
                sb2.append(yrVar4.f62180s0);
                sb2.append(", message=");
                sb2.append(yrVar4.f62179r0);
                sb2.append(", url=");
                yk ykVar = yrVar4.f62177p0;
                sb2.append((yg) yk.setCompoundDrawableTintBlendMode(new Object[]{ykVar}, -534472234, 534472239, System.identityHashCode(ykVar)));
                sb2.append(AbstractJsonLexerKt.END_OBJ);
                String string = sb2.toString();
                int i35 = J0;
                int i36 = (i35 & (-68)) | ((~i35) & 67);
                int i37 = -(-((i35 & 67) << 1));
                int i38 = (i36 ^ i37) + ((i37 & i36) << 1);
                I0 = i38 % 128;
                int i39 = i38 % 2;
                return string;
            case 8:
                yr yrVar5 = (yr) objArr[0];
                int i40 = I0;
                int i41 = ((i40 ^ 31) | (i40 & 31)) << 1;
                int i42 = ~i40;
                int i43 = -((i40 & (-32)) | (i42 & 31));
                int i44 = ((i41 | i43) << 1) - (i41 ^ i43);
                J0 = i44 % 128;
                if (i44 % 2 == 0) {
                    yr yrVar6 = yrVar5.f62184x0;
                    throw null;
                }
                yr yrVar7 = yrVar5.f62184x0;
                int i45 = (((i40 & (-42)) | (41 & i42)) - (~(-(-((i40 & 41) << 1))))) - 1;
                J0 = i45 % 128;
                if (i45 % 2 != 0) {
                    return yrVar7;
                }
                int i46 = 39 / 0;
                return yrVar7;
            case 9:
                yr yrVar8 = (yr) objArr[0];
                int i47 = I0 + 118;
                int i48 = (i47 ^ (-1)) + (i47 << 1);
                J0 = i48 % 128;
                int i49 = i48 % 2;
                yn ynVar = yrVar8.v0;
                if (ynVar == null) {
                    throw new IllegalStateException("response is not eligible for a body and must not be closed".toString());
                }
                ynVar.close();
                int i50 = I0;
                int i51 = ((i50 | 113) << 1) - (((~i50) & 113) | (i50 & (-114)));
                J0 = i51 % 128;
                if (i51 % 2 != 0) {
                    return null;
                }
                throw null;
            case 10:
                yr yrVar9 = (yr) objArr[0];
                int i52 = J0;
                int i53 = ((i52 | 111) << 1) - (i52 ^ 111);
                I0 = i53 % 128;
                if (i53 % 2 == 0) {
                    return yrVar9.f62177p0;
                }
                yk ykVar2 = yrVar9.f62177p0;
                throw null;
            case 11:
                yr yrVar10 = (yr) objArr[0];
                int iIdentityHashCode = System.identityHashCode(yrVar10);
                int i54 = ~iIdentityHashCode;
                int i55 = (1454941803 & i54) | ((-1454941804) & iIdentityHashCode);
                int i56 = 1454941803 & iIdentityHashCode;
                int i57 = ~((i56 & i55) | (i55 ^ i56));
                int i58 = -(-(((i57 & 151345552) | (151345552 ^ i57)) * ReturnCode.ERR_CONN_IO));
                int i59 = 1655594749 & i58;
                int i60 = -(-((i58 ^ 1655594749) | i59));
                int i61 = (((i59 ^ i60) + ((i60 & i59) << 1)) - (~(-(~(-(-((~((iIdentityHashCode & 1606287355) | ((i54 & 1606287355) | ((-1606287356) & iIdentityHashCode)))) * (-1504)))))))) - 2;
                int i62 = i61 & 1725965872;
                int i63 = i62 + ((1725965872 ^ i61) | i62);
                int iIdentityHashCode2 = System.identityHashCode(yrVar10);
                int i64 = (-500643095) | iIdentityHashCode2;
                int i65 = ~i64;
                int i66 = i65 & (i65 | i64);
                int i67 = (-1385762673) & i66;
                int i68 = (i66 | (-1385762673)) & (~i67);
                int i69 = ((i68 & i67) | (i68 ^ i67)) * (-220);
                int i70 = (((-461084585) & i69) - (~(-(-(i69 | (-461084585)))))) - 1;
                int i71 = iIdentityHashCode2 & (-500643095);
                int i72 = (~i71) & i64;
                int i73 = ~((i71 & i72) | (i72 ^ i71));
                int i74 = 222703622 & i73;
                int i75 = (i73 | 222703622) & (~i74);
                int i76 = (-2) - (((i70 - (~(-(~(-(-(((i75 & i74) | (i75 ^ i74)) * 220))))))) - 1) ^ (-1));
                int i77 = (329062465 & i76) | ((~i76) & (-329062466));
                int i78 = -(-((i76 & (-329062466)) << 1));
                int i79 = (i77 ^ i78) + ((i78 & i77) << 1);
                objValueOf = yrVar10.G0;
                if (i63 > i79) {
                    throw null;
                }
                int i80 = J0;
                int i81 = ((i80 & 60) + (i80 | 60)) - 1;
                I0 = i81 % 128;
                if (i81 % 2 != 0) {
                    throw null;
                }
                break;
            case 12:
                setDividerPadding setdividerpadding = new setDividerPadding((yr) objArr[0]);
                int i82 = I0;
                int i83 = ((i82 & 12) + (i82 | 12)) - 1;
                J0 = i83 % 128;
                int i84 = i83 % 2;
                return setdividerpadding;
            case 13:
                yr yrVar11 = (yr) objArr[0];
                int i85 = J0;
                int i86 = i85 & 17;
                int i87 = (i85 | 17) & (~i86);
                int i88 = -(-(i86 << 1));
                int i89 = (i87 ^ i88) + ((i87 & i88) << 1);
                I0 = i89 % 128;
                if (i89 % 2 == 0) {
                    return yrVar11.f62178q0;
                }
                yi yiVar = yrVar11.f62178q0;
                throw null;
            case 14:
                yr yrVar12 = (yr) objArr[0];
                int i90 = J0;
                int i91 = (i90 & 99) + (i90 | 99);
                I0 = i91 % 128;
                if (i91 % 2 != 0) {
                    long j11 = yrVar12.F0;
                    throw null;
                }
                long j12 = yrVar12.F0;
                int i92 = i90 & 39;
                int i93 = i90 | 39;
                int i94 = (i92 & i93) + (i92 | i93);
                I0 = i94 % 128;
                if (i94 % 2 != 0) {
                    int i95 = 68 / 0;
                }
                objValueOf = Long.valueOf(j12);
                break;
                break;
            case 15:
                yr yrVar13 = (yr) objArr[0];
                String str2 = (String) objArr[1];
                int i96 = I0;
                int i97 = i96 & 3;
                int i98 = ((i96 ^ 3) | i97) << 1;
                int i99 = -((i96 | 3) & (~i97));
                int i100 = ((i98 | i99) << 1) - (i99 ^ i98);
                J0 = i100 % 128;
                int i101 = i100 % 2;
                Intrinsics.checkNotNullParameter(str2, "");
                ye yeVar = yrVar13.f62182u0;
                String str3 = (String) ye.setCompoundDrawableTintBlendMode(new Object[]{yeVar, str2}, 914142416, -914142409, System.identityHashCode(yeVar));
                if (str3 == null) {
                    int i102 = I0;
                    int i103 = i102 & 47;
                    int i104 = (i102 | 47) & (~i103);
                    int i105 = i103 << 1;
                    int i106 = (i104 & i105) + (i104 | i105);
                    J0 = i106 % 128;
                    if (i106 % 2 == 0) {
                        int i107 = 13 / 0;
                    }
                } else {
                    str = str3;
                }
                int i108 = I0;
                int i109 = (i108 ^ 111) + ((i108 & 111) << 1);
                J0 = i109 % 128;
                if (i109 % 2 != 0) {
                    return str;
                }
                int i110 = 25 / 0;
                return str;
            case 16:
                yr yrVar14 = (yr) objArr[0];
                int i111 = I0;
                int i112 = ((i111 ^ 79) | (i111 & 79)) << 1;
                int i113 = -(((~i111) & 79) | (i111 & (-80)));
                int i114 = (i112 ^ i113) + ((i113 & i112) << 1);
                int i115 = i114 % 128;
                J0 = i115;
                int i116 = i114 % 2;
                String str4 = yrVar14.f62179r0;
                int i117 = ((i115 ^ 81) - (~((i115 & 81) << 1))) - 1;
                I0 = i117 % 128;
                int i118 = i117 % 2;
                return str4;
            case 17:
                yr yrVar15 = (yr) objArr[0];
                int i119 = I0;
                int i120 = (i119 & 59) + (i119 | 59);
                J0 = i120 % 128;
                int i121 = i120 % 2;
                yr yrVar16 = yrVar15.f62185y0;
                System.identityHashCode(yrVar15);
                System.identityHashCode(yrVar15);
                return yrVar16;
            case 18:
                yr yrVar17 = (yr) objArr[0];
                int i122 = J0;
                int i123 = (i122 ^ 68) + ((68 & i122) << 1);
                int i124 = (i123 ^ (-1)) + (i123 << 1);
                int i125 = i124 % 128;
                I0 = i125;
                int i126 = i124 % 2;
                yr yrVar18 = yrVar17.f62183w0;
                int i127 = (((i125 | 24) << 1) - (i125 ^ 24)) - 1;
                J0 = i127 % 128;
                int i128 = i127 % 2;
                return yrVar18;
            case 19:
                yr yrVar19 = (yr) objArr[0];
                int i129 = I0;
                int i130 = i129 & 9;
                int i131 = ((~i130) & (i129 | 9)) + (i130 << 1);
                J0 = i131 % 128;
                int i132 = i131 % 2;
                yn ynVar2 = yrVar19.v0;
                int i133 = (i129 | 39) << 1;
                int i134 = -(((~i129) & 39) | (i129 & (-40)));
                int i135 = (i133 & i134) + (i133 | i134);
                J0 = i135 % 128;
                if (i135 % 2 != 0) {
                    return ynVar2;
                }
                int i136 = 44 / 0;
                return ynVar2;
            default:
                yr yrVar20 = (yr) objArr[0];
                int i137 = J0;
                int i138 = (-2) - (((i137 & 52) + (i137 | 52)) ^ (-1));
                I0 = i138 % 128;
                if (i138 % 2 != 0) {
                    ye yeVar2 = yrVar20.f62182u0;
                    throw null;
                }
                ye yeVar3 = yrVar20.f62182u0;
                int i139 = (((i137 & (-122)) | ((~i137) & 121)) - (~(-(-((i137 & 121) << 1))))) - 1;
                I0 = i139 % 128;
                int i140 = i139 % 2;
                return yeVar3;
        }
        return objValueOf;
    }

    @JvmName(name = "sentRequestAtMillis")
    public final long UiMessageCallbackKtWhenMappings() {
        return ((Long) setX(new Object[]{this}, -1353479930, 1353479935, System.identityHashCode(this))).longValue();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        setX(new Object[]{this}, -537350290, 537350299, System.identityHashCode(this));
    }

    @JvmName(name = "cacheControl")
    @NotNull
    public final xq getAmountFieldTextColor() {
        return (xq) setX(new Object[]{this}, 1413319215, -1413319212, System.identityHashCode(this));
    }

    @JvmName(name = "networkResponse")
    @Nullable
    public final yr getNavBarTitleString() {
        return (yr) setX(new Object[]{this}, 1382857161, -1382857143, System.identityHashCode(this));
    }

    @NotNull
    public final List<xv> setAlwaysDrawnWithCacheEnabled() {
        return (List) setX(new Object[]{this}, 1766995847, -1766995845, System.identityHashCode(this));
    }

    @JvmName(name = "code")
    public final int setDividerPadding() {
        return ((Integer) setX(new Object[]{this}, 151122101, -151122100, System.identityHashCode(this))).intValue();
    }

    @JvmName(name = "receivedResponseAtMillis")
    public final long setIncludeFontPadding() {
        return ((Long) setX(new Object[]{this}, -144747726, 144747740, System.identityHashCode(this))).longValue();
    }

    @JvmName(name = "body")
    @Nullable
    public final yn setLayoutAnimation() {
        return (yn) setX(new Object[]{this}, -428621868, 428621887, System.identityHashCode(this));
    }

    @JvmName(name = "cacheResponse")
    @Nullable
    public final yr setNavigationOnClickListener() {
        return (yr) setX(new Object[]{this}, 1387574357, -1387574349, System.identityHashCode(this));
    }

    @JvmName(name = "priorResponse")
    @Nullable
    public final yr setOnDragListener() {
        return (yr) setX(new Object[]{this}, 2003566487, -2003566470, System.identityHashCode(this));
    }

    @JvmName(name = "request")
    @NotNull
    public final yk setOnFocusChangeListener() {
        return (yk) setX(new Object[]{this}, -504719753, 504719763, System.identityHashCode(this));
    }

    @JvmName(name = "headers")
    @NotNull
    public final ye setOnLongClickListener() {
        return (ye) setX(new Object[]{this}, 1547100838, -1547100838, System.identityHashCode(this));
    }

    @NotNull
    public final setDividerPadding setTextAlignment() {
        return (setDividerPadding) setX(new Object[]{this}, 142679588, -142679576, System.identityHashCode(this));
    }

    @JvmName(name = "protocol")
    @NotNull
    public final yi setY() {
        return (yi) setX(new Object[]{this}, -134305925, 134305938, System.identityHashCode(this));
    }

    @JvmName(name = "exchange")
    @Nullable
    public final zg setZ() {
        return (zg) setX(new Object[]{this}, -1378120774, 1378120785, System.identityHashCode(this));
    }

    @NotNull
    public final String toString() {
        return (String) setX(new Object[]{this}, 580794109, -580794102, System.identityHashCode(this));
    }

    @JvmName(name = "handshake")
    @Nullable
    public final yf setCompoundDrawableTintBlendMode() {
        return (yf) setX(new Object[]{this}, 339520473, -339520467, System.identityHashCode(this));
    }

    @JvmName(name = "message")
    @NotNull
    public final String setX() {
        return (String) setX(new Object[]{this}, -171382441, 171382457, System.identityHashCode(this));
    }
}
