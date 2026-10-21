package ie;

import com.google.android.material.color.utilities.DynamicScheme;
import com.google.android.material.color.utilities.MaterialDynamicColors;
import com.google.android.material.color.utilities.ToneDeltaPair;
import com.google.android.material.color.utilities.TonePolarity;
import java.util.function.Function;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class r implements Function {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f69645a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MaterialDynamicColors f69646b;

    public /* synthetic */ r(MaterialDynamicColors materialDynamicColors, int i10) {
        this.f69645a = i10;
        this.f69646b = materialDynamicColors;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        switch (this.f69645a) {
            case 0:
                return this.f69646b.highestSurface((DynamicScheme) obj);
            case 1:
                MaterialDynamicColors materialDynamicColors = this.f69646b;
                return new ToneDeltaPair(materialDynamicColors.primaryContainer(), materialDynamicColors.primary(), 15.0d, TonePolarity.NEARER, false);
            default:
                return this.f69646b.background();
        }
    }
}
