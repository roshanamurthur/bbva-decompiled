package ie;

import com.google.android.material.color.utilities.DynamicScheme;
import java.util.function.Function;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class u implements Function {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f69652a;

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        switch (this.f69652a) {
            case 0:
                return Double.valueOf(((DynamicScheme) obj).isDark ? 80.0d : 40.0d);
            case 1:
                return Double.valueOf(((DynamicScheme) obj).isDark ? 4.0d : 100.0d);
            case 2:
                return Double.valueOf(((DynamicScheme) obj).isDark ? 60.0d : 50.0d);
            default:
                return ((DynamicScheme) obj).secondaryPalette;
        }
    }
}
