package com.mypinpad.tsdk.isolation;

import com.bbva.sl.ar.android.sslpinning.result.ResultCode;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
public final class iv extends TerminalSdkConfigurationCompanion<setWebViewClient> {
    public static int E = 0;
    public static int F = 1;

    @NotNull
    public final byte[] A;
    public final boolean B;

    @NotNull
    public ds C;
    public setFitsSystemWindows D;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/mypinpad/tsdk/i/getBeepOnFailure;", "p0", "", "setX", "(Lcom/mypinpad/tsdk/i/getBeepOnFailure;)V"}, k = 3, mv = {1, 5, 1}, xi = 48)
    public static final class a extends Lambda implements Function1<getBeepOnFailure, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ boolean f56543p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ iv f56544q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(boolean z10, iv ivVar) {
            super(1);
            this.f56543p0 = z10;
            this.f56544q0 = ivVar;
        }

        public static /* synthetic */ Unit a(Object[] objArr, int i10, int i11, int i12) {
            int i13 = (i11 * ResultCode.ERROR_TRUST_CERT_DATE_AFTERVALIDITY) + (i10 * (-519));
            int i14 = ~i10;
            int i15 = ~i11;
            int i16 = ~i12;
            int i17 = (((~(i11 | i12)) | (~(i14 | i15 | i16))) * 520) + i13;
            int i18 = ~(i15 | i16);
            int i19 = ~(i12 | i10);
            if ((((~(i10 | i15)) | (~(i14 | i16)) | i19) * 520) + ((i18 | i19) * (-1040)) + i17 == 1) {
                a aVar = (a) objArr[0];
                a(new Object[]{aVar, (getBeepOnFailure) objArr[1]}, 1007041285, -1007041285, System.identityHashCode(aVar));
                return Unit.INSTANCE;
            }
            a aVar2 = (a) objArr[0];
            getBeepOnFailure getbeeponfailure = (getBeepOnFailure) objArr[1];
            Intrinsics.checkNotNullParameter(getbeeponfailure, "");
            setScrollContainer setscrollcontainer = (setScrollContainer) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure}, 865402441, -865402437, System.identityHashCode(getbeeponfailure));
            String str = (String) setScrollContainer.setOnFocusChangeListener(new Object[]{setscrollcontainer}, -888877733, 888877739, System.identityHashCode(setscrollcontainer));
            setAnimation setanimation = setAnimation.INSTANCE;
            TransactionFailed transactionFailed = (TransactionFailed) setAnimation.setY(new Object[0], -835982431, 835982546, (int) System.currentTimeMillis());
            if (Intrinsics.areEqual(str, (String) TransactionFailed.setX(new Object[]{transactionFailed}, 1914607362, -1914607356, System.identityHashCode(transactionFailed))) && (!aVar2.f56543p0)) {
                TransactionFailed transactionFailed2 = (TransactionFailed) setAnimation.setY(new Object[0], 1939842367, -1939842115, (int) System.currentTimeMillis());
                iv ivVar = aVar2.f56544q0;
                getBeepOnFailure getbeeponfailure2 = (getBeepOnFailure) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{ivVar, transactionFailed2}, 1431838387, -1431838363, System.identityHashCode(ivVar));
                byte[] bArr = (byte[]) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure}, 252497730, -252497710, System.identityHashCode(getbeeponfailure));
                byte b10 = ((byte[]) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure}, 252497730, -252497710, System.identityHashCode(getbeeponfailure)))[0];
                byte b11 = ((byte[]) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure2}, 252497730, -252497710, System.identityHashCode(getbeeponfailure2)))[0];
                bArr[0] = (byte) ((b10 & b11) | (b10 ^ b11));
            }
            return null;
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(getBeepOnFailure getbeeponfailure) {
            return a(new Object[]{this, getbeeponfailure}, -1622941634, 1622941635, System.identityHashCode(this));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iv(@NotNull setBackgroundTintList setbackgroundtintlist, @Nullable di diVar, @NotNull setChildIndicator setchildindicator) {
        super(setbackgroundtintlist, diVar, setchildindicator, Terminal.KERNEL_4);
        Intrinsics.checkNotNullParameter(setbackgroundtintlist, "");
        Intrinsics.checkNotNullParameter(setchildindicator, "");
        setWebViewClient x4 = setX();
        this.A = (byte[]) setInputExtras.setDividerPadding(new Object[]{(String) setWebViewClient.setDividerPadding(new Object[]{x4}, -1332695831, 1332695833, System.identityHashCode(x4)), 5}, -689525923, 689525942, 5);
        setWebViewClient x6 = setX();
        this.B = ((Boolean) setWebViewClient.setDividerPadding(new Object[]{x6}, 922224049, -922224045, System.identityHashCode(x6))).booleanValue();
        this.C = ds.setCompoundDrawableTintBlendMode;
    }

    public static /* synthetic */ Object setCompoundDrawableTintBlendMode(Object[] objArr, int i10, int i11, int i12) throws Exception {
        Object obj;
        int i13 = i10 | i11;
        int i14 = (i13 * (-502)) + (i11 * 503) + (i10 * 503);
        int i15 = ~i10;
        int i16 = ~((~i11) | i15);
        int i17 = i15 | (~i12);
        int i18 = i16 | (~i17);
        int i19 = ~(i12 | i13);
        switch ((((~(i17 | i11)) | i19) * 502) + ((i18 | i19) * (-502)) + i14) {
            case 1:
                iv ivVar = (iv) objArr[0];
                setFitsSystemWindows setfitssystemwindows = (setFitsSystemWindows) objArr[1];
                int i20 = F;
                int i21 = i20 & 89;
                int i22 = (i20 ^ 89) | i21;
                int i23 = (i21 & i22) + (i22 | i21);
                E = i23 % 128;
                int i24 = i23 % 2;
                Intrinsics.checkNotNullParameter(setfitssystemwindows, "");
                ivVar.D = setfitssystemwindows;
                int i25 = F;
                int i26 = i25 & 49;
                int i27 = (i26 - (~(-(-((i25 ^ 49) | i26))))) - 1;
                E = i27 % 128;
                if (i27 % 2 == 0) {
                    return null;
                }
                throw null;
            case 2:
                iv ivVar2 = (iv) objArr[0];
                int i28 = E;
                int i29 = i28 & 55;
                int i30 = (i29 - (~(-(-((i28 ^ 55) | i29))))) - 1;
                int i31 = i30 % 128;
                F = i31;
                int i32 = i30 % 2;
                boolean z10 = ivVar2.B;
                int i33 = i31 & 79;
                int i34 = (i31 | 79) & (~i33);
                int i35 = i33 << 1;
                int i36 = (i34 ^ i35) + ((i34 & i35) << 1);
                E = i36 % 128;
                int i37 = i36 % 2;
                return Boolean.valueOf(z10);
            case 3:
                iv ivVar3 = (iv) objArr[0];
                int i38 = E;
                int i39 = (i38 & 121) + (i38 | 121);
                F = i39 % 128;
                int i40 = i39 % 2;
                setWebViewClient x4 = ivVar3.setX();
                Long l6 = (Long) setWebViewClient.setDividerPadding(new Object[]{x4}, 778609397, -778609397, System.identityHashCode(x4));
                if (l6 != null) {
                    int i41 = F;
                    int i42 = i41 & 95;
                    int i43 = ((i41 ^ 95) | i42) << 1;
                    int i44 = -((i41 | 95) & (~i42));
                    int i45 = ((i43 | i44) << 1) - (i44 ^ i43);
                    E = i45 % 128;
                    int i46 = i45 % 2;
                    long jLongValue = l6.longValue() / 100;
                    if (jLongValue >= 0) {
                        int i47 = F;
                        int i48 = i47 & 33;
                        int i49 = i48 + ((i47 ^ 33) | i48);
                        E = i49 % 128;
                        int i50 = i49 % 2;
                        obj = (byte[]) setInputExtras.setDividerPadding(new Object[]{Long.valueOf(jLongValue), 3}, 672373041, -672373041, 3);
                        int i51 = E;
                        int i52 = ((i51 ^ 123) | (i51 & 123)) << 1;
                        int i53 = -(((~i51) & 123) | (i51 & (-124)));
                        int i54 = (i52 ^ i53) + ((i53 & i52) << 1);
                        F = i54 % 128;
                        if (i54 % 2 == 0) {
                            throw null;
                        }
                    }
                }
                int i55 = F;
                int i56 = (((i55 & (-86)) | ((~i55) & 85)) - (~(-(-((i55 & 85) << 1))))) - 1;
                E = i56 % 128;
                if (i56 % 2 == 0) {
                    return null;
                }
                throw null;
            case 4:
                iv ivVar4 = (iv) objArr[0];
                int i57 = F;
                int i58 = i57 | 119;
                int i59 = (i58 << 1) - ((~(i57 & 119)) & i58);
                E = i59 % 128;
                if (i59 % 2 == 0) {
                    return ivVar4.A;
                }
                byte[] bArr = ivVar4.A;
                throw null;
            case 5:
                iv ivVar5 = (iv) objArr[0];
                ds dsVar = (ds) objArr[1];
                int i60 = F + 46;
                int i61 = (i60 ^ (-1)) + (i60 << 1);
                E = i61 % 128;
                if (i61 % 2 != 0) {
                    Intrinsics.checkNotNullParameter(dsVar, "");
                    ivVar5.C = dsVar;
                    throw null;
                }
                Intrinsics.checkNotNullParameter(dsVar, "");
                ivVar5.C = dsVar;
                int i62 = E;
                int i63 = (i62 & (-62)) | ((~i62) & 61);
                int i64 = -(-((i62 & 61) << 1));
                int i65 = (i63 & i64) + (i64 | i63);
                F = i65 % 128;
                int i66 = i65 % 2;
                return null;
            case 6:
                iv ivVar6 = (iv) objArr[0];
                int i67 = E;
                int i68 = i67 & 1;
                int i69 = ((~i68) & (i67 | 1)) + (i68 << 1);
                F = i69 % 128;
                int i70 = i69 % 2;
                obj = ivVar6.D;
                if (i70 == 0) {
                    throw null;
                }
                if (obj == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                    int i71 = E;
                    int i72 = (i71 & 29) + (i71 | 29);
                    F = i72 % 128;
                    if (i72 % 2 != 0) {
                        return null;
                    }
                    throw null;
                }
                int i73 = (((i67 & (-106)) | ((~i67) & 105)) - (~((i67 & 105) << 1))) - 1;
                F = i73 % 128;
                if (i73 % 2 == 0) {
                    int i74 = 45 / 0;
                }
                break;
                break;
            case 7:
                iv ivVar7 = (iv) objArr[0];
                int i75 = F;
                int i76 = i75 & 69;
                int i77 = (i75 | 69) & (~i76);
                int i78 = i76 << 1;
                int i79 = (i77 ^ i78) + ((i77 & i78) << 1);
                int i80 = i79 % 128;
                E = i80;
                int i81 = i79 % 2;
                obj = ivVar7.C;
                int i82 = ((i80 ^ 39) - (~((i80 & 39) << 1))) - 1;
                F = i82 % 128;
                if (i82 % 2 == 0) {
                    throw null;
                }
                break;
            default:
                iv ivVar8 = (iv) objArr[0];
                bj bjVar = new bj(ivVar8);
                bo boVar = (bo) ((setImageTintList) w.setX(new Object[]{bjVar}, 1693919772, -1693919769, System.identityHashCode(bjVar)));
                setMaxWidth setmaxwidth = (setMaxWidth) ((List) bo.setY(new Object[]{boVar}, -1194860115, 1194860115, System.identityHashCode(boVar)));
                setAnimation setanimation = setAnimation.INSTANCE;
                TransactionFailed transactionFailed = (TransactionFailed) setAnimation.setY(new Object[0], -309520583, 309520724, (int) System.currentTimeMillis());
                ivVar8.setX(ivVar8.setX((List<? extends getBeepOnFailure>) setmaxwidth, true, (Function1<? super getBeepOnFailure, Unit>) new a(((Boolean) setMaxWidth.setX(new Object[]{setmaxwidth, (String) TransactionFailed.setX(new Object[]{transactionFailed}, 1914607362, -1914607356, System.identityHashCode(transactionFailed))}, 420631327, -420631322, System.identityHashCode(setmaxwidth))).booleanValue(), ivVar8)));
                getBeepOnFailure.setCompoundDrawableTintBlendMode setcompounddrawabletintblendmode = getBeepOnFailure.setOnFocusChangeListener;
                TransactionFailed transactionFailed2 = (TransactionFailed) setAnimation.setY(new Object[0], -308641137, 308641263, (int) System.currentTimeMillis());
                getBeepOnFailure getbeeponfailure = (getBeepOnFailure) getBeepOnFailure.setCompoundDrawableTintBlendMode.setDividerPadding(new Object[]{(String) TransactionFailed.setX(new Object[]{transactionFailed2}, 1914607362, -1914607356, System.identityHashCode(transactionFailed2)), ivVar8.setCompoundDrawablePadding(), null, Boolean.FALSE, 28}, -976227287, 976227290, 28);
                int i83 = F;
                int i84 = ((i83 | 3) << 1) - (i83 ^ 3);
                E = i84 % 128;
                int i85 = i84 % 2;
                return getbeeponfailure;
        }
        return obj;
    }

    @NotNull
    public final getBeepOnFailure TransactionResult() {
        return (getBeepOnFailure) setCompoundDrawableTintBlendMode(new Object[]{this}, -1595973242, 1595973242, System.identityHashCode(this));
    }

    @NotNull
    public final byte[] getSuppressed() {
        return (byte[]) setCompoundDrawableTintBlendMode(new Object[]{this}, 722564359, -722564355, System.identityHashCode(this));
    }

    @NotNull
    public final setFitsSystemWindows printStackTrace() {
        return (setFitsSystemWindows) setCompoundDrawableTintBlendMode(new Object[]{this}, -219236292, 219236298, System.identityHashCode(this));
    }

    @NotNull
    public final ds setCursorVisible() {
        return (ds) setCompoundDrawableTintBlendMode(new Object[]{this}, 1118340294, -1118340287, System.identityHashCode(this));
    }

    public final boolean setMaxEms() {
        return ((Boolean) setCompoundDrawableTintBlendMode(new Object[]{this}, -2077543827, 2077543829, System.identityHashCode(this))).booleanValue();
    }

    @Nullable
    public final byte[] setViewTranslationCallback() {
        return (byte[]) setCompoundDrawableTintBlendMode(new Object[]{this}, -1323053543, 1323053546, System.identityHashCode(this));
    }

    public final void setY(@NotNull ds dsVar) throws Exception {
        setCompoundDrawableTintBlendMode(new Object[]{this, dsVar}, -796213226, 796213231, System.identityHashCode(this));
    }

    public final void setCompoundDrawableTintBlendMode(@NotNull setFitsSystemWindows setfitssystemwindows) throws Exception {
        setCompoundDrawableTintBlendMode(new Object[]{this, setfitssystemwindows}, 1845850361, -1845850360, System.identityHashCode(this));
    }
}
