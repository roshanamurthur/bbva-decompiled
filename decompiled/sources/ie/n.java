package ie;

import com.google.android.material.color.utilities.DynamicColor;
import com.google.android.material.color.utilities.DynamicScheme;
import com.google.android.material.color.utilities.MaterialDynamicColors;
import com.google.android.material.color.utilities.ToneDeltaPair;
import com.google.android.material.color.utilities.TonePolarity;
import java.util.function.Function;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class n implements Function {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f69634a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MaterialDynamicColors f69635b;

    public /* synthetic */ n(MaterialDynamicColors materialDynamicColors, int i10) {
        this.f69634a = i10;
        this.f69635b = materialDynamicColors;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        switch (this.f69634a) {
            case 0:
                return this.f69635b.highestSurface((DynamicScheme) obj);
            case 1:
                MaterialDynamicColors materialDynamicColors = this.f69635b;
                return new ToneDeltaPair(materialDynamicColors.primaryFixed(), materialDynamicColors.primaryFixedDim(), 10.0d, TonePolarity.LIGHTER, true);
            case 2:
                return this.f69635b.error();
            default:
                MaterialDynamicColors materialDynamicColors2 = this.f69635b;
                DynamicScheme dynamicScheme = (DynamicScheme) obj;
                materialDynamicColors2.getClass();
                if (MaterialDynamicColors.a(dynamicScheme)) {
                    return Double.valueOf(DynamicColor.foregroundTone(((Double) materialDynamicColors2.primaryContainer().tone.apply(dynamicScheme)).doubleValue(), 4.5d));
                }
                if (MaterialDynamicColors.b(dynamicScheme)) {
                    return Double.valueOf(dynamicScheme.isDark ? 0.0d : 100.0d);
                }
                return Double.valueOf(dynamicScheme.isDark ? 90.0d : 10.0d);
        }
    }
}
