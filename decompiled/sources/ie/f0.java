package ie;

import com.google.android.material.color.utilities.DynamicScheme;
import com.google.android.material.color.utilities.MaterialDynamicColors;
import java.util.function.Function;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class f0 implements Function {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f69613a;

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        switch (this.f69613a) {
            case 0:
                return ((DynamicScheme) obj).primaryPalette;
            case 1:
                DynamicScheme dynamicScheme = (DynamicScheme) obj;
                if (MaterialDynamicColors.b(dynamicScheme)) {
                    return Double.valueOf(dynamicScheme.isDark ? 10.0d : 100.0d);
                }
                return Double.valueOf(dynamicScheme.isDark ? 20.0d : 100.0d);
            case 2:
                return Double.valueOf(MaterialDynamicColors.b((DynamicScheme) obj) ? 40.0d : 90.0d);
            case 3:
                return Double.valueOf(((DynamicScheme) obj).isDark ? 6.0d : 87.0d);
            default:
                return ((DynamicScheme) obj).tertiaryPalette;
        }
    }
}
