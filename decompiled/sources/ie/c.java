package ie;

import com.google.android.material.color.utilities.DynamicScheme;
import java.util.function.Function;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class c implements Function {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f69601a;

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        switch (this.f69601a) {
            case 0:
                return ((DynamicScheme) obj).secondaryPalette;
            case 1:
                return ((DynamicScheme) obj).primaryPalette;
            case 2:
                return ((DynamicScheme) obj).primaryPalette;
            case 3:
                return ((DynamicScheme) obj).neutralPalette;
            case 4:
                return Double.valueOf(((DynamicScheme) obj).isDark ? 80.0d : 30.0d);
            default:
                return ((DynamicScheme) obj).secondaryPalette;
        }
    }
}
