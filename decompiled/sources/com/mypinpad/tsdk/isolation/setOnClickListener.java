package com.mypinpad.tsdk.isolation;

import android.app.Activity;
import android.os.Build;
import android.view.WindowInsets;
import android.view.WindowInsetsController;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class setOnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f60202a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f60203b = 1;

    public static final void q_(@NotNull Activity activity) {
        setY(new Object[]{activity}, 2067758989, -2067758988, (int) System.currentTimeMillis());
    }

    public static final void r_(@NotNull Activity activity) {
        setY(new Object[]{activity}, 2105355722, -2105355722, (int) System.currentTimeMillis());
    }

    public static /* synthetic */ Object setY(Object[] objArr, int i10, int i11, int i12) {
        int i13 = ~i10;
        int i14 = ~(i13 | i11);
        int i15 = ~(i13 | i12);
        int i16 = ((i14 | i15) * (-280)) + (i11 * (-139)) + (i10 * 141);
        int i17 = ~i11;
        int i18 = ((i15 | (~(i17 | i12))) * 140) + i16;
        int i19 = ~(i13 | i17 | i12);
        int i20 = ~i12;
        if ((((~(i10 | i20 | i17)) | (~(i11 | i13 | i20)) | i19) * 140) + i18 != 1) {
            Activity activity = (Activity) objArr[0];
            int i21 = f60203b;
            int i22 = i21 & 59;
            int i23 = (i21 | 59) & (~i22);
            int i24 = -(-(i22 << 1));
            int i25 = (i23 ^ i24) + ((i23 & i24) << 1);
            f60202a = i25 % 128;
            int i26 = i25 % 2;
            Intrinsics.checkNotNullParameter(activity, "");
            if (Build.VERSION.SDK_INT >= 30) {
                int i27 = f60203b;
                int i28 = (i27 & 95) + (i27 | 95);
                f60202a = i28 % 128;
                if (i28 % 2 != 0) {
                    activity.getWindow().getInsetsController();
                    throw null;
                }
                WindowInsetsController insetsController = activity.getWindow().getInsetsController();
                if (insetsController != null) {
                    insetsController.setSystemBarsBehavior(2);
                    insetsController.hide(WindowInsets.Type.systemBars());
                    int i29 = f60202a;
                    int i30 = i29 & 11;
                    int i31 = ((((i29 ^ 11) | i30) << 1) - (~(-((i29 | 11) & (~i30))))) - 1;
                    f60203b = i31 % 128;
                    int i32 = i31 % 2;
                } else {
                    int i33 = f60202a;
                    int i34 = (i33 & 15) + (i33 | 15);
                    f60203b = i34 % 128;
                    if (i34 % 2 == 0) {
                        int i35 = 34 / 0;
                    }
                }
            } else {
                activity.getWindow().getDecorView().setSystemUiVisibility(5638);
                activity.getWindow().addFlags(134217728);
                int i36 = f60202a;
                int i37 = i36 & 85;
                int i38 = (((i36 | 85) & (~i37)) - (~(-(-(i37 << 1))))) - 1;
                f60203b = i38 % 128;
                if (i38 % 2 == 0) {
                    throw null;
                }
            }
        } else {
            Activity activity2 = (Activity) objArr[0];
            int i39 = f60203b;
            int i40 = i39 & 25;
            int i41 = -(-(i39 | 25));
            int i42 = (i40 & i41) + (i41 | i40);
            f60202a = i42 % 128;
            if (i42 % 2 != 0) {
                Intrinsics.checkNotNullParameter(activity2, "");
                activity2.getWindow().getAttributes().layoutInDisplayCutoutMode = 3;
            } else {
                Intrinsics.checkNotNullParameter(activity2, "");
                activity2.getWindow().getAttributes().layoutInDisplayCutoutMode = 2;
            }
        }
        return null;
    }
}
