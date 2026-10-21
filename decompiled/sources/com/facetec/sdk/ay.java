package com.facetec.sdk;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageItemInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.os.Build;
import android.util.TypedValue;
import android.view.View;
import android.view.WindowManager;
import android.widget.TextView;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import java.security.SecureRandom;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes9.dex */
class ay {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static /* synthetic */ boolean f40412d = true;

    public static class b {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f40413c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f40414e;

        public b(int i10, int i11) {
            this.f40413c = i10;
            this.f40414e = i11;
        }

        public final int c() {
            return this.f40414e;
        }

        public final int d() {
            return this.f40413c;
        }
    }

    @NonNull
    public static WindowManager V_(Context context) {
        if (context instanceof Activity) {
            return ((Activity) context).getWindowManager();
        }
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        if (f40412d || windowManager != null) {
            return windowManager;
        }
        throw new AssertionError();
    }

    public static b W_(String str, int i10, Typeface typeface) {
        return X_(str, i10, typeface, new Paint());
    }

    private static b X_(String str, int i10, Typeface typeface, Paint paint) {
        paint.setTextSize(i10);
        paint.setTypeface(typeface);
        paint.setFlags(1);
        paint.setTextAlign(Paint.Align.LEFT);
        paint.setAntiAlias(true);
        int iRound = Math.round(paint.measureText(str));
        Paint.FontMetrics fontMetrics = paint.getFontMetrics();
        return new b(iRound, Math.round(fontMetrics.descent - fontMetrics.ascent));
    }

    public static int Y_(TextView textView, b bVar, int i10, int i11) {
        int iCeil;
        Typeface typeface = textView.getTypeface();
        String string = textView.getText().toString();
        if (string.contains(RootService.LINE_BREAK)) {
            string = string.substring(0, string.indexOf(RootService.LINE_BREAK));
        }
        int i12 = i11 - i10;
        Paint paint = new Paint();
        do {
            i12--;
            iCeil = (int) Math.ceil(((double) (i11 + i10)) / 2.0d);
            b bVarX_ = X_(string, iCeil, typeface, paint);
            if (bVarX_.d() > bVar.d() || bVarX_.c() > bVar.c()) {
                i11 = iCeil - 1;
            } else {
                i10 = iCeil;
            }
            if (i10 == i11) {
                break;
            }
        } while (i12 > 0);
        return iCeil - 1;
    }

    public static Fragment Z_(Activity activity) {
        FragmentManager fragmentManager;
        if (activity != null && (fragmentManager = activity.getFragmentManager()) != null) {
            List<Fragment> fragments = Build.VERSION.SDK_INT >= 26 ? fragmentManager.getFragments() : null;
            if (fragments != null) {
                for (Fragment fragment : fragments) {
                    if (fragment != null && fragment.isVisible()) {
                        return fragment;
                    }
                }
            }
        }
        return null;
    }

    @Nullable
    public static String a(@Nullable String str) {
        return str == null ? "Unknown Error" : str;
    }

    public static float b(int i10) {
        return i10 / (Resources.getSystem().getDisplayMetrics().densityDpi / 160.0f);
    }

    public static float c(int i10) {
        return TypedValue.applyDimension(2, i10, Resources.getSystem().getDisplayMetrics());
    }

    @NonNull
    public static String d(@NonNull Context context) {
        ApplicationInfo applicationInfo;
        PackageManager packageManager = context.getPackageManager();
        try {
            applicationInfo = packageManager.getApplicationInfo(((PackageItemInfo) context.getApplicationInfo()).packageName, 0);
        } catch (PackageManager.NameNotFoundException unused) {
            applicationInfo = null;
        }
        return (String) (applicationInfo != null ? packageManager.getApplicationLabel(applicationInfo) : "Unknown");
    }

    public static float e(int i10) {
        return TypedValue.applyDimension(1, i10, Resources.getSystem().getDisplayMetrics());
    }

    public static void a(@NonNull Activity activity) {
        View viewFindViewById = activity.findViewById(R.id.backgroundColor);
        if (viewFindViewById != null) {
            viewFindViewById.setVisibility(4);
        }
    }

    public static void b(View view) {
        ViewCompat.setAccessibilityDelegate(view, new AccessibilityDelegateCompat() { // from class: com.facetec.sdk.ay.1
            @Override // androidx.core.view.AccessibilityDelegateCompat
            public final void onInitializeAccessibilityNodeInfo(View view2, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
                super.onInitializeAccessibilityNodeInfo(view2, accessibilityNodeInfoCompat);
                accessibilityNodeInfoCompat.removeAction(AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_CLICK);
                accessibilityNodeInfoCompat.setClickable(false);
            }
        });
    }

    public static int c(@NonNull Context context) {
        int rotation = V_(context).getDefaultDisplay().getRotation();
        if (rotation == 1) {
            return 0;
        }
        if (rotation != 2) {
            return rotation != 3 ? 1 : 8;
        }
        String str = Build.MODEL;
        return (str.contains("Mi MIX 2") || str.contains("RCT6773W22BM")) ? 1 : 9;
    }

    @NonNull
    public static String e(int i10, int i11) {
        return bi.d(a(i10, i11));
    }

    public static byte[] a(int i10, int i11) {
        SecureRandom secureRandom = new SecureRandom();
        if (i11 != 0) {
            i10 += secureRandom.nextInt(i11 + 1);
        }
        byte[] bArr = new byte[i10];
        secureRandom.nextBytes(bArr);
        return bArr;
    }

    public static boolean d(Activity activity) {
        return (activity == null || activity.isFinishing()) ? false : true;
    }

    public static boolean d(String[] strArr) {
        for (String str : strArr) {
            if (Locale.getDefault().getLanguage().contains(str)) {
                return true;
            }
        }
        return false;
    }

    @NonNull
    public static AnimatedVectorDrawableCompat a(@NonNull Activity activity, @DrawableRes int i10) {
        AnimatedVectorDrawableCompat animatedVectorDrawableCompatCreate = AnimatedVectorDrawableCompat.create(activity, i10);
        if (f40412d || animatedVectorDrawableCompatCreate != null) {
            return (AnimatedVectorDrawableCompat) animatedVectorDrawableCompatCreate.mutate();
        }
        throw new AssertionError();
    }
}
