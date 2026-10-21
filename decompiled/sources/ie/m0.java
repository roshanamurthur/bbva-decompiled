package ie;

import com.google.android.material.color.utilities.DynamicScheme;
import java.util.function.Function;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class m0 implements Function {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f69633a;

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        switch (this.f69633a) {
            case 0:
                return ((DynamicScheme) obj).neutralPalette;
            default:
                return Double.valueOf(((DynamicScheme) obj).isDark ? 10.0d : 90.0d);
        }
    }
}
