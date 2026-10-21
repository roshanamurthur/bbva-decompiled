package com.mypinpad.tsdk.isolation;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
public final class setScrollbarFadingEnabled {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f60512a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f60513b = 1;

    @NotNull
    public static final initCause setCompoundDrawableTintBlendMode(@NotNull Context context, @NotNull getException getexception, @NotNull setPivotX setpivotx, @NotNull setTextSelectHandleLeft settextselecthandleleft, @NotNull setProgressBackgroundTintBlendMode setprogressbackgroundtintblendmode, @NotNull getScope getscope, @NotNull setColorFilter setcolorfilter, @Nullable getClientSecret getclientsecret) {
        return (initCause) setY(new Object[]{context, getexception, setpivotx, settextselecthandleleft, setprogressbackgroundtintblendmode, getscope, setcolorfilter, getclientsecret}, -1201402949, 1201402949, (int) System.currentTimeMillis());
    }

    public static /* synthetic */ Object setY(Object[] objArr, int i10, int i11, int i12) {
        Context context = (Context) objArr[0];
        getException getexception = (getException) objArr[1];
        setPivotX setpivotx = (setPivotX) objArr[2];
        setTextSelectHandleLeft settextselecthandleleft = (setTextSelectHandleLeft) objArr[3];
        setProgressBackgroundTintBlendMode setprogressbackgroundtintblendmode = (setProgressBackgroundTintBlendMode) objArr[4];
        getScope getscope = (getScope) objArr[5];
        setColorFilter setcolorfilter = (setColorFilter) objArr[6];
        getClientSecret getclientsecret = (getClientSecret) objArr[7];
        int i13 = f60513b + 31;
        f60512a = i13 % 128;
        int i14 = i13 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(getexception, "");
        Intrinsics.checkNotNullParameter(setpivotx, "");
        Intrinsics.checkNotNullParameter(settextselecthandleleft, "");
        Intrinsics.checkNotNullParameter(setprogressbackgroundtintblendmode, "");
        Intrinsics.checkNotNullParameter(getscope, "");
        Intrinsics.checkNotNullParameter(setcolorfilter, "");
        Boolean bool = component25.setY;
        Intrinsics.checkNotNullExpressionValue(bool, "");
        if (bool.booleanValue()) {
            initCause initcause = new initCause(context, getexception, setpivotx, settextselecthandleleft, setprogressbackgroundtintblendmode, getscope, setcolorfilter, getclientsecret);
            int i15 = f60512a + 87;
            f60513b = i15 % 128;
            int i16 = i15 % 2;
            return initcause;
        }
        notify notifyVar = new notify(context, (onContextItemSelected) getexception, setpivotx, settextselecthandleleft, setprogressbackgroundtintblendmode, getscope, setcolorfilter);
        int i17 = f60512a + 63;
        f60513b = i17 % 128;
        if (i17 % 2 != 0) {
            return notifyVar;
        }
        throw null;
    }
}
