package ie;

import com.google.android.material.color.utilities.DynamicScheme;
import com.google.android.material.color.utilities.MaterialDynamicColors;
import java.util.function.Function;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class t implements Function {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f69650a;

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        switch (this.f69650a) {
            case 0:
                return ((DynamicScheme) obj).errorPalette;
            case 1:
                return ((DynamicScheme) obj).neutralPalette;
            case 2:
                return Double.valueOf(MaterialDynamicColors.b((DynamicScheme) obj) ? 100.0d : 10.0d);
            case 3:
                return ((DynamicScheme) obj).tertiaryPalette;
            case 4:
                return ((DynamicScheme) obj).neutralVariantPalette;
            default:
                return Double.valueOf(((DynamicScheme) obj).isDark ? 30.0d : 90.0d);
        }
    }
}
