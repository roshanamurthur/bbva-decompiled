package ie;

import com.google.android.material.color.utilities.DynamicScheme;
import com.google.android.material.color.utilities.MaterialDynamicColors;
import java.util.function.Function;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class i implements Function {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f69620a;

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        switch (this.f69620a) {
            case 0:
                return Double.valueOf(((DynamicScheme) obj).isDark ? 90.0d : 10.0d);
            case 1:
                return Double.valueOf(((DynamicScheme) obj).isDark ? 30.0d : 90.0d);
            case 2:
                return ((DynamicScheme) obj).neutralPalette;
            case 3:
                return ((DynamicScheme) obj).tertiaryPalette;
            case 4:
                return ((DynamicScheme) obj).neutralPalette;
            default:
                return Double.valueOf(MaterialDynamicColors.b((DynamicScheme) obj) ? 90.0d : 30.0d);
        }
    }
}
