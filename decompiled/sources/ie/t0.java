package ie;

import com.google.android.material.color.utilities.DynamicScheme;
import java.util.function.Function;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class t0 implements Function {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f69651a;

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        switch (this.f69651a) {
            case 0:
                return Double.valueOf(((DynamicScheme) obj).isDark ? 80.0d : 40.0d);
            case 1:
                return Double.valueOf(((DynamicScheme) obj).secondaryPalette.getKeyColor().getTone());
            default:
                return Double.valueOf(((DynamicScheme) obj).neutralVariantPalette.getKeyColor().getTone());
        }
    }
}
