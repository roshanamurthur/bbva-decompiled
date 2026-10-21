package ie;

import com.google.android.material.color.utilities.DynamicScheme;
import com.google.android.material.color.utilities.MaterialDynamicColors;
import java.util.function.Function;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class s0 implements Function {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f69649a;

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        switch (this.f69649a) {
            case 0:
                return ((DynamicScheme) obj).secondaryPalette;
            case 1:
                return ((DynamicScheme) obj).secondaryPalette;
            case 2:
                return ((DynamicScheme) obj).neutralVariantPalette;
            case 3:
                DynamicScheme dynamicScheme = (DynamicScheme) obj;
                if (MaterialDynamicColors.b(dynamicScheme)) {
                    return Double.valueOf(dynamicScheme.isDark ? 10.0d : 90.0d);
                }
                return Double.valueOf(dynamicScheme.isDark ? 20.0d : 100.0d);
            case 4:
                DynamicScheme dynamicScheme2 = (DynamicScheme) obj;
                if (MaterialDynamicColors.b(dynamicScheme2)) {
                    return Double.valueOf(dynamicScheme2.isDark ? 90.0d : 25.0d);
                }
                return Double.valueOf(dynamicScheme2.isDark ? 80.0d : 40.0d);
            default:
                return Double.valueOf(((DynamicScheme) obj).isDark ? 20.0d : 95.0d);
        }
    }
}
