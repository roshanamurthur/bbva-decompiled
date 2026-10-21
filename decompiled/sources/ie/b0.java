package ie;

import com.google.android.material.color.utilities.DislikeAnalyzer;
import com.google.android.material.color.utilities.DynamicScheme;
import com.google.android.material.color.utilities.MaterialDynamicColors;
import java.util.function.Function;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class b0 implements Function {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f69600a;

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        switch (this.f69600a) {
            case 0:
                return ((DynamicScheme) obj).primaryPalette;
            case 1:
                return Double.valueOf(((DynamicScheme) obj).isDark ? 12.0d : 94.0d);
            case 2:
                DynamicScheme dynamicScheme = (DynamicScheme) obj;
                if (MaterialDynamicColors.b(dynamicScheme)) {
                    return Double.valueOf(dynamicScheme.isDark ? 60.0d : 49.0d);
                }
                if (MaterialDynamicColors.a(dynamicScheme)) {
                    return Double.valueOf(DislikeAnalyzer.fixIfDisliked(dynamicScheme.tertiaryPalette.getHct(MaterialDynamicColors.c(dynamicScheme.tertiaryPalette.getHct(dynamicScheme.sourceColorHct.getTone()), dynamicScheme))).getTone());
                }
                return Double.valueOf(dynamicScheme.isDark ? 30.0d : 90.0d);
            default:
                return Double.valueOf(((DynamicScheme) obj).isDark ? 17.0d : 92.0d);
        }
    }
}
