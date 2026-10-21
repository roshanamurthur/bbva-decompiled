package com.mypinpad.tsdk.isolation;

import android.content.Context;
import android.content.pm.PackageManager;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0010\u0010\u0011J?\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\u000e\u0010\u000f"}, d2 = {"Lcom/mypinpad/tsdk/i/setNextFocusDownId;", "", "Landroid/content/Context;", "p0", "Lcom/mypinpad/tsdk/i/setColorFilter;", "p1", "", "p2", "p3", "", "p4", "Lcom/mypinpad/tsdk/i/TerminalCallbackKt;", "p5", "Lcom/mypinpad/tsdk/i/getValueQualifier;", "setDividerPadding", "(Landroid/content/Context;Lcom/mypinpad/tsdk/i/setColorFilter;Ljava/lang/String;Ljava/lang/String;Lcom/mypinpad/tsdk/i/TerminalCallbackKt;)Lcom/mypinpad/tsdk/i/getValueQualifier;", "<init>", "()V"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class setNextFocusDownId {

    @NotNull
    public static final setNextFocusDownId INSTANCE = new setNextFocusDownId();

    static {
        int i10 = ((-1) << 1) - ((1 - (-38)) ^ (-1));
        int i11 = i10 % 128;
        int i12 = i10 % 2;
    }

    @NotNull
    public static getValueQualifier setDividerPadding(@NotNull Context context, @NotNull setColorFilter setcolorfilter, @NotNull String str, @NotNull String str2, @NotNull TerminalCallbackKt terminalCallbackKt) {
        return (getValueQualifier) setY(new Object[]{context, setcolorfilter, str, str2, terminalCallbackKt}, 1254842923, -1254842923, (int) System.currentTimeMillis());
    }

    public static /* synthetic */ Object setY(Object[] objArr, int i10, int i11, int i12) {
        Context context = (Context) objArr[0];
        setColorFilter setcolorfilter = (setColorFilter) objArr[1];
        String str = (String) objArr[2];
        String str2 = (String) objArr[3];
        TerminalCallbackKt terminalCallbackKt = (TerminalCallbackKt) objArr[4];
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(setcolorfilter, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(terminalCallbackKt, "");
        Context applicationContext = context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "");
        TerminalErrorCodes terminalErrorCodes = new TerminalErrorCodes(setcolorfilter, new setTransformationMethod(setcolorfilter, 28, context), terminalCallbackKt);
        setTouchscreenBlocksFocus settouchscreenblocksfocus = new setTouchscreenBlocksFocus(null, 1, null);
        setIndeterminateTintList setindeterminatetintlist = new setIndeterminateTintList(context);
        setHttpAuthUsernamePassword sethttpauthusernamepassword = new setHttpAuthUsernamePassword();
        UiMessage uiMessage = new UiMessage(context, setcolorfilter);
        Context applicationContext2 = context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext2, "");
        setFocusableInTouchMode setfocusableintouchmode = new setFocusableInTouchMode(applicationContext2, str, str2);
        junkify junkifyVar = new junkify(new CurrencyKt());
        getView getview = new getView();
        PackageManager packageManager = context.getPackageManager();
        Intrinsics.checkNotNullExpressionValue(packageManager, "");
        TerminalSessionDefaultImpls terminalSessionDefaultImpls = new TerminalSessionDefaultImpls(applicationContext, terminalErrorCodes, setcolorfilter, new setContentInsetStartWithNavigation(setcolorfilter, settouchscreenblocksfocus, new setCameraDistance(setcolorfilter, setindeterminatetintlist, sethttpauthusernamepassword, uiMessage, setfocusableintouchmode, junkifyVar, getview, new setOnGroupClickListener(packageManager), new TsdkManualInitializer(), new getCurrencyCustomFormatting(str), new TransactionErrorCause(), new setPointerIcon(TransactionType.INSTANCE), new setMin()), new getHoldTime(setcolorfilter)));
        int iCurrentTimeMillis = (int) System.currentTimeMillis();
        int i13 = 771540401 & iCurrentTimeMillis;
        int i14 = (~i13) & (771540401 | iCurrentTimeMillis);
        int i15 = ~iCurrentTimeMillis;
        int i16 = (i13 & i14) | (i14 ^ i13);
        int i17 = ~i16;
        int i18 = ((i16 | i17) & i17) | (-2147284472);
        int i19 = (iCurrentTimeMillis | i15) & i15;
        int i20 = i19 & (-1979725160);
        int i21 = (~i20) & (i19 | (-1979725160));
        int i22 = (i20 & i21) | (i21 ^ i20);
        int i23 = (771540401 & i22) | ((~i22) & (-771540402));
        int i24 = i22 & (-771540402);
        int i25 = ~((i23 & i24) | (i23 ^ i24));
        int i26 = ((i25 & i18) | (i18 ^ i25)) * 886;
        int i27 = ~((i19 & (-771540402)) | (i19 ^ (-771540402)));
        int i28 = ((((-1150972142) & i26) + (i26 | (-1150972142))) - (~(-(~(((i27 & (-1979725160)) | ((-1979725160) ^ i27)) * (-1772)))))) - 2;
        int i29 = (1979725159 & i15) | ((~i15) & (-1979725160));
        int i30 = i15 & (-1979725160);
        int i31 = (i29 & i30) | (i29 ^ i30);
        int i32 = ~i31;
        int i33 = -(-(((i31 | i32) & i32) * 886));
        int i34 = i28 & i33;
        int i35 = ((i28 ^ i33) | i34) << 1;
        int i36 = -((i33 | i28) & (~i34));
        int i37 = (i35 & i36) + (i36 | i35);
        int i38 = ~((int) System.currentTimeMillis());
        int i39 = (-1019455146) ^ i38;
        int i40 = (-1019455146) & i38;
        int i41 = (i40 & i39) | (i39 ^ i40);
        int i42 = ~i41;
        int i43 = (i41 | i42) & i42;
        int i44 = 1110979242 & i43;
        int i45 = (((i43 | 1110979242) & (~i44)) | i44) * (-983);
        int i46 = (-656380616) & i45;
        int i47 = -(-((i45 ^ (-656380616)) | i46));
        int i48 = (i46 ^ i47) + ((i47 & i46) << 1);
        int i49 = ~((i38 & 1110979242) | (1110979242 ^ i38));
        int i50 = i49 ^ (-2130425516);
        int i51 = i49 & (-2130425516);
        int i52 = ((i51 & i50) | (i50 ^ i51)) * 983;
        if (i37 > ((i48 | i52) << 1) - (i52 ^ i48)) {
            return terminalSessionDefaultImpls;
        }
        throw null;
    }
}
