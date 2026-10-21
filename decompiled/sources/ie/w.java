package ie;

import com.google.android.material.color.utilities.MaterialDynamicColors;
import com.google.android.material.color.utilities.ToneDeltaPair;
import com.google.android.material.color.utilities.TonePolarity;
import java.util.function.Function;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class w implements Function {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f69659a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MaterialDynamicColors f69660b;

    public /* synthetic */ w(MaterialDynamicColors materialDynamicColors, int i10) {
        this.f69659a = i10;
        this.f69660b = materialDynamicColors;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        switch (this.f69659a) {
            case 0:
                MaterialDynamicColors materialDynamicColors = this.f69660b;
                return new ToneDeltaPair(materialDynamicColors.errorContainer(), materialDynamicColors.error(), 15.0d, TonePolarity.NEARER, false);
            default:
                return this.f69660b.secondaryContainer();
        }
    }
}
