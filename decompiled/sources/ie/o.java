package ie;

import com.google.android.material.color.utilities.MaterialDynamicColors;
import com.google.android.material.color.utilities.TonalPalette;
import com.google.android.material.color.utilities.ToneDeltaPair;
import com.google.android.material.color.utilities.TonePolarity;
import java.util.function.Function;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class o implements Function {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f69637a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f69638b;

    public /* synthetic */ o(Object obj, int i10) {
        this.f69637a = i10;
        this.f69638b = obj;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        switch (this.f69637a) {
            case 0:
                MaterialDynamicColors materialDynamicColors = (MaterialDynamicColors) this.f69638b;
                return new ToneDeltaPair(materialDynamicColors.primaryFixed(), materialDynamicColors.primaryFixedDim(), 10.0d, TonePolarity.LIGHTER, true);
            case 1:
                return ((MaterialDynamicColors) this.f69638b).primaryContainer();
            default:
                return (TonalPalette) this.f69638b;
        }
    }
}
