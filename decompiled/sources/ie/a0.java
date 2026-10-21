package ie;

import com.google.android.material.color.utilities.DynamicScheme;
import com.google.android.material.color.utilities.MaterialDynamicColors;
import java.util.function.Function;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class a0 implements Function {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f69598a;

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        switch (this.f69598a) {
            case 0:
                return Double.valueOf(((DynamicScheme) obj).isDark ? 90.0d : 10.0d);
            default:
                return Double.valueOf(MaterialDynamicColors.b((DynamicScheme) obj) ? 30.0d : 80.0d);
        }
    }
}
