package ie;

import com.google.android.material.color.utilities.DynamicColor;
import com.google.android.material.color.utilities.DynamicScheme;
import com.google.android.material.color.utilities.MaterialDynamicColors;
import java.util.function.Function;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class v implements Function {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f69655a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MaterialDynamicColors f69656b;

    public /* synthetic */ v(MaterialDynamicColors materialDynamicColors, int i10) {
        this.f69655a = i10;
        this.f69656b = materialDynamicColors;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        switch (this.f69655a) {
            case 0:
                return this.f69656b.highestSurface((DynamicScheme) obj);
            case 1:
                return this.f69656b.tertiaryFixed();
            case 2:
                return this.f69656b.tertiaryContainer();
            case 3:
                return this.f69656b.highestSurface((DynamicScheme) obj);
            default:
                MaterialDynamicColors materialDynamicColors = this.f69656b;
                DynamicScheme dynamicScheme = (DynamicScheme) obj;
                materialDynamicColors.getClass();
                if (MaterialDynamicColors.a(dynamicScheme)) {
                    return Double.valueOf(DynamicColor.foregroundTone(((Double) materialDynamicColors.secondaryContainer().tone.apply(dynamicScheme)).doubleValue(), 4.5d));
                }
                return Double.valueOf(dynamicScheme.isDark ? 90.0d : 10.0d);
        }
    }
}
