package androidx.dynamicanimation.animation;

import android.util.FloatProperty;
import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: classes2.dex */
public abstract class FloatPropertyCompat<T> {

    public static class a extends FloatPropertyCompat<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ FloatProperty f21215a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, FloatProperty floatProperty) {
            super(str);
            this.f21215a = floatProperty;
        }

        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        public final float getValue(T t10) {
            return ((Float) this.f21215a.get(t10)).floatValue();
        }

        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        public final void setValue(T t10, float f6) {
            this.f21215a.setValue(t10, f6);
        }
    }

    public FloatPropertyCompat(String str) {
    }

    @RequiresApi(24)
    public static <T> FloatPropertyCompat<T> createFloatPropertyCompat(FloatProperty<T> floatProperty) {
        return new a(floatProperty.getName(), floatProperty);
    }

    public abstract float getValue(T t10);

    public abstract void setValue(T t10, float f6);
}
