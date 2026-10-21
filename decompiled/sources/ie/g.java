package ie;

import com.google.android.material.color.utilities.DynamicScheme;
import com.google.android.material.color.utilities.MaterialDynamicColors;
import com.google.android.material.color.utilities.ToneDeltaPair;
import com.google.android.material.color.utilities.TonePolarity;
import java.util.function.Function;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class g implements Function {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f69614a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MaterialDynamicColors f69615b;

    public /* synthetic */ g(MaterialDynamicColors materialDynamicColors, int i10) {
        this.f69614a = i10;
        this.f69615b = materialDynamicColors;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        switch (this.f69614a) {
            case 0:
                return this.f69615b.secondaryFixed();
            case 1:
                return this.f69615b.highestSurface((DynamicScheme) obj);
            case 2:
                return this.f69615b.highestSurface((DynamicScheme) obj);
            default:
                MaterialDynamicColors materialDynamicColors = this.f69615b;
                return new ToneDeltaPair(materialDynamicColors.errorContainer(), materialDynamicColors.error(), 15.0d, TonePolarity.NEARER, false);
        }
    }
}
