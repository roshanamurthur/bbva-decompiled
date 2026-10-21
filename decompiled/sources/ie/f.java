package ie;

import com.google.android.material.color.utilities.DynamicScheme;
import com.google.android.material.color.utilities.MaterialDynamicColors;
import com.google.android.material.color.utilities.ToneDeltaPair;
import com.google.android.material.color.utilities.TonePolarity;
import java.util.function.Function;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class f implements Function {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f69611a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MaterialDynamicColors f69612b;

    public /* synthetic */ f(MaterialDynamicColors materialDynamicColors, int i10) {
        this.f69611a = i10;
        this.f69612b = materialDynamicColors;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        switch (this.f69611a) {
            case 0:
                return this.f69612b.secondaryFixedDim();
            case 1:
                return this.f69612b.highestSurface((DynamicScheme) obj);
            case 2:
                MaterialDynamicColors materialDynamicColors = this.f69612b;
                return new ToneDeltaPair(materialDynamicColors.secondaryContainer(), materialDynamicColors.secondary(), 15.0d, TonePolarity.NEARER, false);
            default:
                return this.f69612b.highestSurface((DynamicScheme) obj);
        }
    }
}
