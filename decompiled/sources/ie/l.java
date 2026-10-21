package ie;

import com.google.android.material.color.utilities.DynamicScheme;
import com.google.android.material.color.utilities.MaterialDynamicColors;
import java.util.function.Function;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class l implements Function {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f69629a;

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        switch (this.f69629a) {
            case 0:
                return Double.valueOf(MaterialDynamicColors.b((DynamicScheme) obj) ? 40.0d : 90.0d);
            case 1:
                return Double.valueOf(((DynamicScheme) obj).isDark ? 20.0d : 100.0d);
            case 2:
                return Double.valueOf(((DynamicScheme) obj).isDark ? 6.0d : 98.0d);
            default:
                return ((DynamicScheme) obj).primaryPalette;
        }
    }
}
