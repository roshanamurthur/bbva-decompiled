package ie;

import com.google.android.material.color.utilities.DynamicScheme;
import java.util.function.Function;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class r0 implements Function {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f69647a;

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        switch (this.f69647a) {
            case 0:
                return Double.valueOf(((DynamicScheme) obj).isDark ? 30.0d : 80.0d);
            case 1:
                return Double.valueOf(((DynamicScheme) obj).isDark ? 10.0d : 90.0d);
            case 2:
                return ((DynamicScheme) obj).tertiaryPalette;
            case 3:
                return ((DynamicScheme) obj).tertiaryPalette;
            default:
                return ((DynamicScheme) obj).neutralPalette;
        }
    }
}
