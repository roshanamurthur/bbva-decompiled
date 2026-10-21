package h3;

import android.graphics.Rect;
import android.os.Build;
import android.util.Property;
import android.view.View;
import androidx.annotation.NonNull;

/* JADX INFO: compiled from: ViewUtils.java */
/* JADX INFO: loaded from: classes2.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final v f69339a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f69340b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b f69341c;

    /* JADX INFO: compiled from: ViewUtils.java */
    public class a extends Property<View, Float> {
        @Override // android.util.Property
        public final Float get(View view) {
            return Float.valueOf(r.f69339a.a(view));
        }

        @Override // android.util.Property
        public final void set(View view, Float f6) {
            r.b(view, f6.floatValue());
        }
    }

    /* JADX INFO: compiled from: ViewUtils.java */
    public class b extends Property<View, Rect> {
        @Override // android.util.Property
        public final Rect get(View view) {
            return view.getClipBounds();
        }

        @Override // android.util.Property
        public final void set(View view, Rect rect) {
            view.setClipBounds(rect);
        }
    }

    static {
        if (Build.VERSION.SDK_INT >= 29) {
            f69339a = new w();
        } else {
            f69339a = new v();
        }
        f69340b = new a(Float.class, "translationAlpha");
        f69341c = new b(Rect.class, "clipBounds");
    }

    public static void a(@NonNull View view, int i10, int i11, int i12, int i13) {
        f69339a.g(view, i10, i11, i12, i13);
    }

    public static void b(@NonNull View view, float f6) {
        f69339a.b(view, f6);
    }

    public static void c(@NonNull View view, int i10) {
        f69339a.c(view, i10);
    }
}
