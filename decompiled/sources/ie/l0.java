package ie;

import com.google.android.material.color.utilities.DynamicScheme;
import com.google.android.material.color.utilities.Hct;
import com.google.android.material.color.utilities.MaterialDynamicColors;
import com.google.android.material.color.utilities.TemperatureCache;
import java.util.HashMap;
import java.util.function.Function;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class l0 implements Function {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f69630a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f69631b;

    public /* synthetic */ l0(Object obj, int i10) {
        this.f69630a = i10;
        this.f69631b = obj;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        switch (this.f69630a) {
            case 0:
                return ((MaterialDynamicColors) this.f69631b).tertiary();
            case 1:
                return ((MaterialDynamicColors) this.f69631b).highestSurface((DynamicScheme) obj);
            case 2:
                return ((MaterialDynamicColors) this.f69631b).inverseSurface();
            default:
                return (Double) ((HashMap) ((TemperatureCache) this.f69631b).c()).get((Hct) obj);
        }
    }
}
