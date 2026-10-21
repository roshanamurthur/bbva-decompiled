package ie;

import com.google.android.material.color.utilities.DynamicScheme;
import com.google.android.material.color.utilities.MaterialDynamicColors;
import com.google.android.material.color.utilities.ToneDeltaPair;
import com.google.android.material.color.utilities.TonePolarity;
import java.util.function.Function;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class c0 implements Function {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f69602a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MaterialDynamicColors f69603b;

    public /* synthetic */ c0(MaterialDynamicColors materialDynamicColors, int i10) {
        this.f69602a = i10;
        this.f69603b = materialDynamicColors;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        switch (this.f69602a) {
            case 0:
                return this.f69603b.highestSurface((DynamicScheme) obj);
            default:
                MaterialDynamicColors materialDynamicColors = this.f69603b;
                return new ToneDeltaPair(materialDynamicColors.tertiaryContainer(), materialDynamicColors.tertiary(), 15.0d, TonePolarity.NEARER, false);
        }
    }
}
