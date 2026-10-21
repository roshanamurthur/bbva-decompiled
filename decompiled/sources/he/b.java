package he;

import android.os.Build;
import androidx.annotation.Nullable;
import com.google.android.material.color.ColorResourcesOverride;

/* JADX INFO: compiled from: ColorResourcesOverride.java */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class b {
    @Nullable
    public static ColorResourcesOverride a() {
        int i10 = Build.VERSION.SDK_INT;
        d dVar = d.a.f69416a;
        if ((30 > i10 || i10 > 33) && i10 < 34) {
            return null;
        }
        return dVar;
    }
}
