package h3;

import android.animation.PropertyValuesHolder;
import android.animation.TypeConverter;
import android.graphics.Path;
import android.util.Property;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;

/* JADX INFO: compiled from: PropertyValuesHolderUtils.java */
/* JADX INFO: loaded from: classes2.dex */
@RequiresApi(21)
public final class i {
    @DoNotInline
    public static <V> PropertyValuesHolder a(Property<?, V> property, Path path) {
        return PropertyValuesHolder.ofObject(property, (TypeConverter) null, path);
    }
}
