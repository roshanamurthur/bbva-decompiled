package ie;

import com.google.android.material.color.utilities.DynamicScheme;
import com.google.android.material.color.utilities.MaterialDynamicColors;
import java.util.function.Function;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class k implements Function {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f69626a;

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        switch (this.f69626a) {
            case 0:
                return ((DynamicScheme) obj).primaryPalette;
            case 1:
                return Double.valueOf(MaterialDynamicColors.b((DynamicScheme) obj) ? 30.0d : 80.0d);
            case 2:
                return ((DynamicScheme) obj).errorPalette;
            default:
                return ((DynamicScheme) obj).neutralPalette;
        }
    }
}
