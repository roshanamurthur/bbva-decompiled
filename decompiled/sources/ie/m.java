package ie;

import com.google.android.material.color.utilities.DynamicScheme;
import com.google.android.material.color.utilities.MaterialDynamicColors;
import java.util.function.Function;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class m implements Function {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f69632a;

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        switch (this.f69632a) {
            case 0:
                DynamicScheme dynamicScheme = (DynamicScheme) obj;
                if (MaterialDynamicColors.a(dynamicScheme)) {
                    return Double.valueOf(MaterialDynamicColors.c(dynamicScheme.sourceColorHct, dynamicScheme));
                }
                if (MaterialDynamicColors.b(dynamicScheme)) {
                    return Double.valueOf(dynamicScheme.isDark ? 85.0d : 25.0d);
                }
                return Double.valueOf(dynamicScheme.isDark ? 30.0d : 90.0d);
            case 1:
                return Double.valueOf(((DynamicScheme) obj).isDark ? 90.0d : 20.0d);
            case 2:
                return ((DynamicScheme) obj).tertiaryPalette;
            case 3:
                return Double.valueOf(((DynamicScheme) obj).neutralPalette.getKeyColor().getTone());
            default:
                return ((DynamicScheme) obj).neutralVariantPalette;
        }
    }
}
