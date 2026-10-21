package ie;

import com.google.android.material.color.utilities.DynamicColor;
import com.google.android.material.color.utilities.DynamicScheme;
import com.google.android.material.color.utilities.MaterialDynamicColors;
import com.google.android.material.color.utilities.ToneDeltaPair;
import com.google.android.material.color.utilities.TonePolarity;
import java.util.function.Function;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class i0 implements Function {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f69621a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MaterialDynamicColors f69622b;

    public /* synthetic */ i0(MaterialDynamicColors materialDynamicColors, int i10) {
        this.f69621a = i10;
        this.f69622b = materialDynamicColors;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        switch (this.f69621a) {
            case 0:
                MaterialDynamicColors materialDynamicColors = this.f69622b;
                return new ToneDeltaPair(materialDynamicColors.primaryContainer(), materialDynamicColors.primary(), 15.0d, TonePolarity.NEARER, false);
            case 1:
                return this.f69622b.tertiaryFixedDim();
            default:
                MaterialDynamicColors materialDynamicColors2 = this.f69622b;
                DynamicScheme dynamicScheme = (DynamicScheme) obj;
                materialDynamicColors2.getClass();
                if (MaterialDynamicColors.b(dynamicScheme)) {
                    return Double.valueOf(dynamicScheme.isDark ? 0.0d : 100.0d);
                }
                if (MaterialDynamicColors.a(dynamicScheme)) {
                    return Double.valueOf(DynamicColor.foregroundTone(((Double) materialDynamicColors2.tertiaryContainer().tone.apply(dynamicScheme)).doubleValue(), 4.5d));
                }
                return Double.valueOf(dynamicScheme.isDark ? 90.0d : 10.0d);
        }
    }
}
