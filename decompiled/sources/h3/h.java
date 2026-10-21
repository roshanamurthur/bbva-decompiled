package h3;

import android.animation.ObjectAnimator;
import android.animation.TypeConverter;
import android.graphics.Path;
import android.util.Property;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;

/* JADX INFO: compiled from: ObjectAnimatorUtils.java */
/* JADX INFO: loaded from: classes2.dex */
@RequiresApi(21)
public final class h {
    @DoNotInline
    public static <T, V> ObjectAnimator a(T t10, Property<T, V> property, Path path) {
        return ObjectAnimator.ofObject(t10, property, (TypeConverter) null, path);
    }
}
