package androidx.core.view;

import android.annotation.SuppressLint;
import android.app.UiModeManager;
import android.content.Context;
import android.graphics.Point;
import android.os.Build;
import android.text.TextUtils;
import android.view.Display;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.core.util.Preconditions;

/* JADX INFO: loaded from: classes2.dex */
public final class DisplayCompat {

    @RequiresApi(23)
    public static class a {
        public static boolean a(Display.Mode mode, Point point) {
            return (mode.getPhysicalWidth() == point.x && mode.getPhysicalHeight() == point.y) || (mode.getPhysicalWidth() == point.y && mode.getPhysicalHeight() == point.x);
        }
    }

    public static Point a(@NonNull Context context, @NonNull Display display) {
        Point pointB = Build.VERSION.SDK_INT < 28 ? b("sys.display-size", display) : b("vendor.display-size", display);
        if (pointB != null) {
            return pointB;
        }
        UiModeManager uiModeManager = (UiModeManager) context.getSystemService("uimode");
        if (uiModeManager == null || uiModeManager.getCurrentModeType() != 4 || !"Sony".equals(Build.MANUFACTURER) || !Build.MODEL.startsWith("BRAVIA") || !context.getPackageManager().hasSystemFeature("com.sony.dtv.hardware.panel.qfhd")) {
            return null;
        }
        Display.Mode mode = display.getMode();
        for (Display.Mode mode2 : display.getSupportedModes()) {
            if (mode.getPhysicalHeight() < mode2.getPhysicalHeight() || mode.getPhysicalWidth() < mode2.getPhysicalWidth()) {
                return null;
            }
        }
        return new Point(3840, 2160);
    }

    @Nullable
    public static Point b(@NonNull String str, @NonNull Display display) {
        String str2;
        if (display.getDisplayId() != 0) {
            return null;
        }
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            str2 = (String) cls.getMethod("get", String.class).invoke(cls, str);
        } catch (Exception unused) {
            str2 = null;
        }
        if (!TextUtils.isEmpty(str2) && str2 != null) {
            try {
                String[] strArrSplit = str2.trim().split("x", -1);
                if (strArrSplit.length == 2) {
                    int i10 = Integer.parseInt(strArrSplit[0]);
                    int i11 = Integer.parseInt(strArrSplit[1]);
                    if (i10 > 0 && i11 > 0) {
                        return new Point(i10, i11);
                    }
                }
                throw new NumberFormatException();
            } catch (NumberFormatException unused2) {
            }
        }
        return null;
    }

    @NonNull
    public static ModeCompat getMode(@NonNull Context context, @NonNull Display display) {
        Display.Mode mode = display.getMode();
        Point pointA = a(context, display);
        return (pointA == null || a.a(mode, pointA)) ? new ModeCompat(mode, true) : new ModeCompat(mode, pointA);
    }

    @NonNull
    @SuppressLint({"ArrayReturn"})
    public static ModeCompat[] getSupportedModes(@NonNull Context context, @NonNull Display display) {
        Display.Mode[] supportedModes = display.getSupportedModes();
        ModeCompat[] modeCompatArr = new ModeCompat[supportedModes.length];
        Display.Mode mode = display.getMode();
        Point pointA = a(context, display);
        if (pointA == null || a.a(mode, pointA)) {
            for (int i10 = 0; i10 < supportedModes.length; i10++) {
                Display.Mode mode2 = supportedModes[i10];
                modeCompatArr[i10] = new ModeCompat(supportedModes[i10], mode2.getPhysicalWidth() == mode.getPhysicalWidth() && mode2.getPhysicalHeight() == mode.getPhysicalHeight());
            }
        } else {
            for (int i11 = 0; i11 < supportedModes.length; i11++) {
                Display.Mode mode3 = supportedModes[i11];
                modeCompatArr[i11] = (mode3.getPhysicalWidth() == mode.getPhysicalWidth() && mode3.getPhysicalHeight() == mode.getPhysicalHeight()) ? new ModeCompat(supportedModes[i11], pointA) : new ModeCompat(supportedModes[i11], false);
            }
        }
        return modeCompatArr;
    }

    public static final class ModeCompat {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Display.Mode f20187a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Point f20188b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f20189c;

        @RequiresApi(23)
        public static class a {
            @DoNotInline
            public static int a(Display.Mode mode) {
                return mode.getPhysicalHeight();
            }

            @DoNotInline
            public static int b(Display.Mode mode) {
                return mode.getPhysicalWidth();
            }
        }

        @RequiresApi(23)
        public ModeCompat(@NonNull Display.Mode mode, boolean z10) {
            Preconditions.checkNotNull(mode, "mode == null, can't wrap a null reference");
            this.f20188b = new Point(a.b(mode), a.a(mode));
            this.f20187a = mode;
            this.f20189c = z10;
        }

        public int getPhysicalHeight() {
            return this.f20188b.y;
        }

        public int getPhysicalWidth() {
            return this.f20188b.x;
        }

        @Deprecated
        public boolean isNative() {
            return this.f20189c;
        }

        @Nullable
        @RequiresApi(23)
        public Display.Mode toMode() {
            return this.f20187a;
        }

        @RequiresApi(23)
        public ModeCompat(@NonNull Display.Mode mode, @NonNull Point point) {
            Preconditions.checkNotNull(mode, "mode == null, can't wrap a null reference");
            Preconditions.checkNotNull(point, "physicalSize == null");
            this.f20188b = point;
            this.f20187a = mode;
            this.f20189c = true;
        }
    }
}
