package com.mypinpad.tsdk.isolation;

import bk.q;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001a\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00062\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010J \u0010\u0011\u001a\u00020\r2\u0010\b\u0002\u0010\u0012\u001a\n\u0018\u00010\u0013j\u0004\u0018\u0001`\u00142\u0006\u0010\u000e\u001a\u00020\u0006J&\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\u00052\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010J\u000e\u0010\u0019\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\tJ\u000e\u0010\u001a\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u000bJ\u001a\u0010\u001b\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00062\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010R\"\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0005\u0012\f\u0012\n \u0007*\u0004\u0018\u00010\u00060\u00060\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082.¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lcom/mypinpad/softpos/emv/terminal/common/utils/log/SecureLog;", "", "()V", "debugRmap", "", "", "", "kotlin.jvm.PlatformType", "logger", "Lcom/mypinpad/softpos/emv/terminal/common/utils/log/Logger;", "redactedLogger", "Lcom/mypinpad/softpos/emv/terminal/common/utils/log/RedactedLogger;", "d", "", "message", "throwable", "", "e", "exception", "Ljava/lang/Exception;", "Lkotlin/Exception;", "r", "opCode", "redactedMessage", "Lcom/mypinpad/softpos/emv/terminal/common/utils/log/Redactable;", "setLogger", "setRedactedLogger", "w", "common"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class SouthPacificEndpoint {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public static setTranslationX f51809a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f51810b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static int f51811c = 1;

    @NotNull
    public static final SouthPacificEndpoint setX = new SouthPacificEndpoint();

    static {
        q.emptyMap();
        setRenderEffect setrendereffect = setRenderEffect.INSTANCE;
        int i10 = f51810b;
        int i11 = ((i10 | 59) << 1) - (i10 ^ 59);
        f51811c = i11 % 128;
        int i12 = i11 % 2;
    }

    public static void setDividerPadding(@NotNull String str) {
        setX(new Object[]{str}, -1166612213, 1166612217, (int) System.currentTimeMillis());
    }

    public static /* synthetic */ Object setX(Object[] objArr, int i10, int i11, int i12) {
        String compoundDrawableTintBlendMode;
        switch ((((~(i10 | i12)) | (~i11)) * 529) + (((~((~i12) | i10)) | (~(i10 | i11))) * 529) + (i11 * 530) + (i10 * 530) + 1058) {
            case 1:
                String str = (String) objArr[0];
                int i13 = f51810b + 45;
                f51811c = i13 % 128;
                if (i13 % 2 == 0) {
                    setX(new Object[]{str}, -1166612213, 1166612217, (int) System.currentTimeMillis());
                    throw null;
                }
                setX(new Object[]{str}, -1166612213, 1166612217, (int) System.currentTimeMillis());
                int i14 = f51811c + 5;
                f51810b = i14 % 128;
                int i15 = i14 % 2;
                return null;
            case 2:
                String str2 = (String) objArr[0];
                int i16 = f51811c + 74;
                int i17 = (i16 ^ (-1)) + (i16 << 1);
                f51810b = i17 % 128;
                if (i17 % 2 != 0) {
                    Intrinsics.checkNotNullParameter(str2, "");
                    Unit unit = Unit.INSTANCE;
                    setRenderEffect setrendereffect = setRenderEffect.INSTANCE;
                    int i18 = 87 / 0;
                } else {
                    Intrinsics.checkNotNullParameter(str2, "");
                    Unit unit2 = Unit.INSTANCE;
                    setRenderEffect setrendereffect2 = setRenderEffect.INSTANCE;
                }
                int i19 = f51810b;
                int i20 = (((i19 | 112) << 1) - (i19 ^ 112)) - 1;
                f51811c = i20 % 128;
                int i21 = i20 % 2;
                return null;
            case 3:
                setTranslationX settranslationx = (setTranslationX) objArr[0];
                int i22 = f51811c;
                int i23 = i22 ^ 37;
                int i24 = ((i22 & 37) | i23) << 1;
                int i25 = -i23;
                int i26 = ((i24 | i25) << 1) - (i24 ^ i25);
                f51810b = i26 % 128;
                if (i26 % 2 == 0) {
                    Intrinsics.checkNotNullParameter(settranslationx, "");
                    f51809a = settranslationx;
                    return null;
                }
                Intrinsics.checkNotNullParameter(settranslationx, "");
                f51809a = settranslationx;
                throw null;
            case 4:
                String str3 = (String) objArr[0];
                int i27 = f51810b;
                int i28 = i27 & 49;
                int i29 = (i27 ^ 49) | i28;
                int i30 = (i28 & i29) + (i29 | i28);
                f51811c = i30 % 128;
                int i31 = i30 % 2;
                Intrinsics.checkNotNullParameter(str3, "");
                Unit unit3 = Unit.INSTANCE;
                setRenderEffect setrendereffect3 = setRenderEffect.INSTANCE;
                int i32 = f51811c;
                int i33 = i32 ^ 25;
                int i34 = -(-((i32 & 25) << 1));
                int i35 = ((i33 | i34) << 1) - (i34 ^ i33);
                f51810b = i35 % 128;
                int i36 = i35 % 2;
                return null;
            case 5:
                String str4 = (String) objArr[0];
                int i37 = f51811c;
                int i38 = i37 & 37;
                int i39 = i38 + ((i37 ^ 37) | i38);
                f51810b = i39 % 128;
                if (i39 % 2 == 0) {
                    setX(new Object[]{str4}, 1234366077, -1234366075, (int) System.currentTimeMillis());
                    return null;
                }
                setX(new Object[]{str4}, 1234366077, -1234366075, (int) System.currentTimeMillis());
                throw null;
            case 6:
                int iIntValue = ((Number) objArr[0]).intValue();
                getDetailsFieldTextSizeSp getdetailsfieldtextsizesp = (getDetailsFieldTextSizeSp) objArr[1];
                int iIntValue2 = ((Number) objArr[2]).intValue();
                int i40 = f51810b;
                int i41 = (i40 ^ 1) + ((i40 & 1) << 1);
                f51811c = i41 % 128;
                int i42 = i41 % 2;
                if ((iIntValue2 & 2) != 0) {
                    int i43 = (((i40 ^ 97) | (i40 & 97)) << 1) - ((i40 & (-98)) | ((~i40) & 97));
                    int i44 = i43 % 128;
                    f51811c = i44;
                    int i45 = i43 % 2;
                    int i46 = i44 + 65;
                    f51810b = i46 % 128;
                    int i47 = i46 % 2;
                    getdetailsfieldtextsizesp = null;
                }
                setX(new Object[]{Integer.valueOf(iIntValue), getdetailsfieldtextsizesp, null}, 1008224929, -1008224920, iIntValue);
                int i48 = f51811c;
                int i49 = i48 | 93;
                int i50 = (i49 << 1) - ((~(i48 & 93)) & i49);
                f51810b = i50 % 128;
                int i51 = i50 % 2;
                return null;
            case 7:
                String str5 = (String) objArr[0];
                int i52 = f51811c;
                int i53 = ((i52 ^ 93) - (~(-(-((i52 & 93) << 1))))) - 1;
                f51810b = i53 % 128;
                int i54 = i53 % 2;
                Intrinsics.checkNotNullParameter(str5, "");
                Unit unit4 = Unit.INSTANCE;
                setRenderEffect setrendereffect4 = setRenderEffect.INSTANCE;
                int i55 = f51810b;
                int i56 = (((i55 | 107) << 1) - (~(-(((~i55) & 107) | (i55 & (-108)))))) - 1;
                f51811c = i56 % 128;
                if (i56 % 2 == 0) {
                    int i57 = 1 / 0;
                }
                return null;
            case 8:
                setElevation setelevation = (setElevation) objArr[0];
                int i58 = f51810b;
                int i59 = (i58 ^ 33) + ((i58 & 33) << 1);
                f51811c = i59 % 128;
                if (i59 % 2 == 0) {
                    Intrinsics.checkNotNullParameter(setelevation, "");
                    throw null;
                }
                Intrinsics.checkNotNullParameter(setelevation, "");
                int i60 = f51811c;
                int i61 = ((i60 ^ 30) + ((i60 & 30) << 1)) - 1;
                f51810b = i61 % 128;
                if (i61 % 2 != 0) {
                    throw null;
                }
                return null;
            case 9:
                int iIntValue3 = ((Number) objArr[0]).intValue();
                getDetailsFieldTextSizeSp getdetailsfieldtextsizesp2 = (getDetailsFieldTextSizeSp) objArr[1];
                Throwable th2 = (Throwable) objArr[2];
                int i62 = f51811c + 45;
                int i63 = i62 % 128;
                f51810b = i63;
                int i64 = i62 % 2;
                if (getdetailsfieldtextsizesp2 == null) {
                    int i65 = i63 & 43;
                    int i66 = -(-(i63 | 43));
                    int i67 = (i65 ^ i66) + ((i65 & i66) << 1);
                    int i68 = i67 % 128;
                    f51811c = i68;
                    int i69 = i67 % 2;
                    int i70 = i68 | 65;
                    int i71 = i70 << 1;
                    int i72 = -((~(i68 & 65)) & i70);
                    int i73 = (i71 ^ i72) + ((i72 & i71) << 1);
                    f51810b = i73 % 128;
                    int i74 = i73 % 2;
                    compoundDrawableTintBlendMode = null;
                } else {
                    compoundDrawableTintBlendMode = getdetailsfieldtextsizesp2.setCompoundDrawableTintBlendMode();
                    int i75 = f51811c;
                    int i76 = i75 & 67;
                    int i77 = i76 + ((i75 ^ 67) | i76);
                    f51810b = i77 % 128;
                    int i78 = i77 % 2;
                }
                Unit unit5 = Unit.INSTANCE;
                setRenderEffect setrendereffect5 = setRenderEffect.INSTANCE;
                setTranslationX settranslationx2 = f51809a;
                if (settranslationx2 != null) {
                    int i79 = f51811c;
                    int i80 = i79 & 35;
                    int i81 = (i79 ^ 35) | i80;
                    int i82 = ((i80 | i81) << 1) - (i81 ^ i80);
                    f51810b = i82 % 128;
                    int i83 = i82 % 2;
                    settranslationx2.setOnFocusChangeListener(iIntValue3, compoundDrawableTintBlendMode, th2);
                    int i84 = f51811c;
                    int i85 = i84 & 33;
                    int i86 = ((((i84 ^ 33) | i85) << 1) - (~(-((i84 | 33) & (~i85))))) - 1;
                    f51810b = i86 % 128;
                    int i87 = i86 % 2;
                }
                int i88 = f51811c;
                int i89 = i88 & 19;
                int i90 = (i88 | 19) & (~i89);
                int i91 = i89 << 1;
                int i92 = (i90 ^ i91) + ((i90 & i91) << 1);
                f51810b = i92 % 128;
                if (i92 % 2 != 0) {
                    throw null;
                }
                return null;
            default:
                String str6 = (String) objArr[0];
                int i93 = f51811c;
                int i94 = (((i93 | 107) << 1) - (~(-(i93 ^ 107)))) - 1;
                f51810b = i94 % 128;
                int i95 = i94 % 2;
                setX(new Object[]{str6}, -1543927628, 1543927635, (int) System.currentTimeMillis());
                int i96 = f51811c;
                int i97 = (i96 & 107) + (i96 | 107);
                f51810b = i97 % 128;
                int i98 = i97 % 2;
                return null;
        }
    }

    public static void setCompoundDrawableTintBlendMode(int i10, @Nullable getDetailsFieldTextSizeSp getdetailsfieldtextsizesp, @Nullable Throwable th2) {
        setX(new Object[]{Integer.valueOf(i10), getdetailsfieldtextsizesp, th2}, 1008224929, -1008224920, i10);
    }

    public static void setDividerPadding(@NotNull setElevation setelevation) {
        setX(new Object[]{setelevation}, 517903768, -517903760, (int) System.currentTimeMillis());
    }

    public static void setOnFocusChangeListener(@NotNull setTranslationX settranslationx) {
        setX(new Object[]{settranslationx}, 1401860534, -1401860531, (int) System.currentTimeMillis());
    }

    public static void setX(@NotNull String str) {
        setX(new Object[]{str}, -1543927628, 1543927635, (int) System.currentTimeMillis());
    }
}
