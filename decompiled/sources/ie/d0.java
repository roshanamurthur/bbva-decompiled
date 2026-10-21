package ie;

import com.google.android.material.color.utilities.DynamicScheme;
import com.google.android.material.color.utilities.MaterialDynamicColors;
import java.util.function.Function;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class d0 implements Function {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f69606a;

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        switch (this.f69606a) {
            case 0:
                return ((DynamicScheme) obj).primaryPalette;
            case 1:
                return ((DynamicScheme) obj).neutralVariantPalette;
            case 2:
                return Double.valueOf(MaterialDynamicColors.b((DynamicScheme) obj) ? 90.0d : 30.0d);
            default:
                return Double.valueOf(((DynamicScheme) obj).isDark ? 22.0d : 90.0d);
        }
    }
}
