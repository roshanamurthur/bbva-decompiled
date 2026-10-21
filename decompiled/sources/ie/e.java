package ie;

import com.google.android.material.color.utilities.MaterialDynamicColors;
import com.google.android.material.color.utilities.ToneDeltaPair;
import com.google.android.material.color.utilities.TonePolarity;
import java.util.function.Function;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class e implements Function {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f69607a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MaterialDynamicColors f69608b;

    public /* synthetic */ e(MaterialDynamicColors materialDynamicColors, int i10) {
        this.f69607a = i10;
        this.f69608b = materialDynamicColors;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        switch (this.f69607a) {
            case 0:
                MaterialDynamicColors materialDynamicColors = this.f69608b;
                return new ToneDeltaPair(materialDynamicColors.secondaryFixed(), materialDynamicColors.secondaryFixedDim(), 10.0d, TonePolarity.LIGHTER, true);
            case 1:
                return this.f69608b.primaryFixed();
            default:
                return this.f69608b.secondaryFixed();
        }
    }
}
