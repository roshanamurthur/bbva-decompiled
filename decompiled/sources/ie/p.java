package ie;

import com.google.android.material.color.utilities.DynamicScheme;
import com.google.android.material.color.utilities.MaterialDynamicColors;
import java.util.function.Function;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class p implements Function {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f69641a;

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        switch (this.f69641a) {
            case 0:
                return ((DynamicScheme) obj).secondaryPalette;
            case 1:
                DynamicScheme dynamicScheme = (DynamicScheme) obj;
                if (MaterialDynamicColors.b(dynamicScheme)) {
                    return Double.valueOf(dynamicScheme.isDark ? 100.0d : 0.0d);
                }
                return Double.valueOf(dynamicScheme.isDark ? 80.0d : 40.0d);
            case 2:
                return Double.valueOf(((DynamicScheme) obj).isDark ? 80.0d : 30.0d);
            case 3:
                return ((DynamicScheme) obj).neutralPalette;
            default:
                return ((DynamicScheme) obj).neutralPalette;
        }
    }
}
