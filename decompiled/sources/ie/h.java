package ie;

import com.google.android.material.color.utilities.DynamicScheme;
import java.util.function.Function;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class h implements Function {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f69618a;

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        switch (this.f69618a) {
            case 0:
                return ((DynamicScheme) obj).errorPalette;
            case 1:
                return ((DynamicScheme) obj).primaryPalette;
            case 2:
                return Double.valueOf(((DynamicScheme) obj).isDark ? 10.0d : 96.0d);
            case 3:
                return Double.valueOf(((DynamicScheme) obj).isDark ? 24.0d : 98.0d);
            default:
                return ((DynamicScheme) obj).tertiaryPalette;
        }
    }
}
