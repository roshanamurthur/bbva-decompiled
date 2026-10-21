package androidx.appcompat.widget;

import android.R;
import android.graphics.Insets;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.core.graphics.drawable.DrawableCompat;
import com.dasnano.vdphotoselfiecapture.api.model.Parameters;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public class DrawableUtils {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int[] f1288a = {R.attr.state_checked};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int[] f1289b = new int[0];
    public static final Rect INSETS_NONE = new Rect();

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final boolean f1290a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final Method f1291b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final Field f1292c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final Field f1293d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final Field f1294e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final Field f1295f;

        /* JADX WARN: Code duplicated, block: B:25:0x004d  */
        /* JADX WARN: Code duplicated, block: B:26:0x005a  */
        static {
            Method method;
            Field field;
            Field field2;
            Field field3;
            Field field4;
            boolean z10;
            try {
                Class<?> cls = Class.forName("android.graphics.Insets");
                method = Drawable.class.getMethod("getOpticalInsets", new Class[0]);
                try {
                    field = cls.getField(Parameters.DIRECTION.LEFT);
                    try {
                        field2 = cls.getField("top");
                        try {
                            field3 = cls.getField(Parameters.DIRECTION.RIGHT);
                            try {
                                field4 = cls.getField("bottom");
                                z10 = true;
                            } catch (ClassNotFoundException | NoSuchFieldException | NoSuchMethodException unused) {
                                field4 = null;
                                z10 = false;
                            }
                        } catch (ClassNotFoundException | NoSuchFieldException | NoSuchMethodException unused2) {
                            field3 = null;
                        }
                    } catch (ClassNotFoundException unused3) {
                        field2 = null;
                        field3 = field2;
                        field4 = null;
                        z10 = false;
                        if (z10) {
                            f1291b = method;
                            f1292c = field;
                            f1293d = field2;
                            f1294e = field3;
                            f1295f = field4;
                            f1290a = true;
                            return;
                        }
                        f1291b = null;
                        f1292c = null;
                        f1293d = null;
                        f1294e = null;
                        f1295f = null;
                        f1290a = false;
                    } catch (NoSuchFieldException unused4) {
                        field2 = null;
                        field3 = field2;
                        field4 = null;
                        z10 = false;
                        if (z10) {
                            f1291b = method;
                            f1292c = field;
                            f1293d = field2;
                            f1294e = field3;
                            f1295f = field4;
                            f1290a = true;
                            return;
                        }
                        f1291b = null;
                        f1292c = null;
                        f1293d = null;
                        f1294e = null;
                        f1295f = null;
                        f1290a = false;
                    } catch (NoSuchMethodException unused5) {
                        field2 = null;
                        field3 = field2;
                        field4 = null;
                        z10 = false;
                        if (z10) {
                            f1291b = method;
                            f1292c = field;
                            f1293d = field2;
                            f1294e = field3;
                            f1295f = field4;
                            f1290a = true;
                            return;
                        }
                        f1291b = null;
                        f1292c = null;
                        f1293d = null;
                        f1294e = null;
                        f1295f = null;
                        f1290a = false;
                    }
                } catch (ClassNotFoundException unused6) {
                    field = null;
                    field2 = field;
                    field3 = field2;
                    field4 = null;
                    z10 = false;
                    if (z10) {
                        f1291b = method;
                        f1292c = field;
                        f1293d = field2;
                        f1294e = field3;
                        f1295f = field4;
                        f1290a = true;
                        return;
                    }
                    f1291b = null;
                    f1292c = null;
                    f1293d = null;
                    f1294e = null;
                    f1295f = null;
                    f1290a = false;
                } catch (NoSuchFieldException unused7) {
                    field = null;
                    field2 = field;
                    field3 = field2;
                    field4 = null;
                    z10 = false;
                    if (z10) {
                        f1291b = method;
                        f1292c = field;
                        f1293d = field2;
                        f1294e = field3;
                        f1295f = field4;
                        f1290a = true;
                        return;
                    }
                    f1291b = null;
                    f1292c = null;
                    f1293d = null;
                    f1294e = null;
                    f1295f = null;
                    f1290a = false;
                } catch (NoSuchMethodException unused8) {
                    field = null;
                    field2 = field;
                    field3 = field2;
                    field4 = null;
                    z10 = false;
                    if (z10) {
                        f1291b = method;
                        f1292c = field;
                        f1293d = field2;
                        f1294e = field3;
                        f1295f = field4;
                        f1290a = true;
                        return;
                    }
                    f1291b = null;
                    f1292c = null;
                    f1293d = null;
                    f1294e = null;
                    f1295f = null;
                    f1290a = false;
                }
            } catch (ClassNotFoundException unused9) {
                method = null;
                field = null;
            } catch (NoSuchFieldException unused10) {
                method = null;
                field = null;
            } catch (NoSuchMethodException unused11) {
                method = null;
                field = null;
            }
            if (z10) {
                f1291b = method;
                f1292c = field;
                f1293d = field2;
                f1294e = field3;
                f1295f = field4;
                f1290a = true;
                return;
            }
            f1291b = null;
            f1292c = null;
            f1293d = null;
            f1294e = null;
            f1295f = null;
            f1290a = false;
        }
    }

    @RequiresApi(29)
    public static class b {
        @DoNotInline
        public static Insets a(Drawable drawable) {
            return drawable.getOpticalInsets();
        }
    }

    public static void a(@NonNull Drawable drawable) {
        String name = drawable.getClass().getName();
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 29 || i10 >= 31 || !"android.graphics.drawable.ColorStateListDrawable".equals(name)) {
            return;
        }
        int[] state = drawable.getState();
        if (state == null || state.length == 0) {
            drawable.setState(f1288a);
        } else {
            drawable.setState(f1289b);
        }
        drawable.setState(state);
    }

    @Deprecated
    public static boolean canSafelyMutateDrawable(@NonNull Drawable drawable) {
        return true;
    }

    @NonNull
    public static Rect getOpticalBounds(@NonNull Drawable drawable) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 29) {
            Insets insetsA = b.a(drawable);
            return new Rect(insetsA.left, insetsA.top, insetsA.right, insetsA.bottom);
        }
        Drawable drawableUnwrap = DrawableCompat.unwrap(drawable);
        if (i10 >= 29) {
            boolean z10 = a.f1290a;
        } else if (a.f1290a) {
            try {
                Object objInvoke = a.f1291b.invoke(drawableUnwrap, new Object[0]);
                if (objInvoke != null) {
                    return new Rect(a.f1292c.getInt(objInvoke), a.f1293d.getInt(objInvoke), a.f1294e.getInt(objInvoke), a.f1295f.getInt(objInvoke));
                }
            } catch (IllegalAccessException | InvocationTargetException unused) {
            }
        }
        return INSETS_NONE;
    }

    public static PorterDuff.Mode parseTintMode(int i10, PorterDuff.Mode mode) {
        if (i10 == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i10 == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i10 == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i10) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }
}
