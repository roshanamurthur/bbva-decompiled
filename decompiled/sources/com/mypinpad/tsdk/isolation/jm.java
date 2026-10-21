package com.mypinpad.tsdk.isolation;

import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
public final class jm extends jk {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static int f56651h = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static int f56652i = 1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final setFontFeatureSettings f56653f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final getValue f56654g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jm(@NotNull iv ivVar, @NotNull setTextKeepState settextkeepstate, @NotNull kc kcVar, @NotNull setFontFeatureSettings setfontfeaturesettings, @NotNull getValue getvalue) {
        super(ivVar, settextkeepstate, kcVar);
        Intrinsics.checkNotNullParameter(ivVar, "");
        Intrinsics.checkNotNullParameter(settextkeepstate, "");
        Intrinsics.checkNotNullParameter(kcVar, "");
        Intrinsics.checkNotNullParameter(setfontfeaturesettings, "");
        Intrinsics.checkNotNullParameter(getvalue, "");
        this.f56653f = setfontfeaturesettings;
        this.f56654g = getvalue;
    }

    public static /* synthetic */ Object setDividerPadding(Object[] objArr, int i10, int i11, int i12) {
        Object obj;
        int i13 = (i11 * (-929)) + (i10 * (-464));
        int i14 = ~i10;
        int i15 = i11 | i12;
        int i16 = ((i14 | i15) * 465) + ((i11 | (~(i12 | i14))) * 930) + (((~i15) | i14) * (-465)) + i13;
        if (i16 == 1) {
            jm jmVar = (jm) objArr[0];
            int i17 = f56652i;
            int i18 = ((i17 & (-28)) | ((~i17) & 27)) + ((i17 & 27) << 1);
            int i19 = i18 % 128;
            f56651h = i19;
            int i20 = i18 % 2;
            obj = jmVar.f56653f;
            int i21 = i19 & 25;
            int i22 = i21 + ((i19 ^ 25) | i21);
            f56652i = i22 % 128;
            if (i22 % 2 == 0) {
                throw null;
            }
        } else {
            if (i16 == 2) {
                jm jmVar2 = (jm) objArr[0];
                int i23 = f56652i;
                int i24 = i23 & 25;
                int i25 = (i24 - (~((i23 ^ 25) | i24))) - 1;
                f56651h = i25 % 128;
                int i26 = i25 % 2;
                iv onFocusChangeListener = jmVar2.setOnFocusChangeListener();
                int i27 = f56651h;
                int i28 = ((i27 & (-46)) | ((~i27) & 45)) + ((i27 & 45) << 1);
                f56652i = i28 % 128;
                int i29 = i28 % 2;
                return onFocusChangeListener;
            }
            if (i16 != 3) {
                jm jmVar3 = (jm) objArr[0];
                jd jdVar = new jd(jmVar3.setOnFocusChangeListener());
                int i30 = f56652i + 7;
                f56651h = i30 % 128;
                if (i30 % 2 == 0) {
                    return null;
                }
                int i31 = 43 / 0;
                return null;
            }
            jm jmVar4 = (jm) objArr[0];
            setDividerPadding(new Object[]{jmVar4}, -71166486, 71166486, System.identityHashCode(jmVar4));
            iv onFocusChangeListener2 = jmVar4.setOnFocusChangeListener();
            jmVar4.f56654g.setOnFocusChangeListener(new setTitleTextAppearance((getBeepOnFailure) iv.setCompoundDrawableTintBlendMode(new Object[]{onFocusChangeListener2}, -1595973242, 1595973242, System.identityHashCode(onFocusChangeListener2))));
            obj = fk.setDividerPadding;
            int i32 = f56651h;
            int i33 = ((i32 ^ 43) | (i32 & 43)) << 1;
            int i34 = -(((~i32) & 43) | (i32 & (-44)));
            int i35 = ((i33 | i34) << 1) - (i34 ^ i33);
            f56652i = i35 % 128;
            if (i35 % 2 == 0) {
                throw null;
            }
        }
        return obj;
    }

    public static final /* synthetic */ iv setOnFocusChangeListener(jm jmVar) {
        return (iv) setDividerPadding(new Object[]{jmVar}, -118876338, 118876340, (int) System.currentTimeMillis());
    }

    public static final /* synthetic */ setFontFeatureSettings setY(jm jmVar) {
        return (setFontFeatureSettings) setDividerPadding(new Object[]{jmVar}, 201210026, -201210025, (int) System.currentTimeMillis());
    }

    @Override // com.mypinpad.tsdk.isolation.ec
    @Nullable
    public final Object setDividerPadding(@NotNull Continuation<? super fk> continuation) {
        return setDividerPadding(new Object[]{this, continuation}, 543286320, -543286317, System.identityHashCode(this));
    }
}
