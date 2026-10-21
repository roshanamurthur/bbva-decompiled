package ie;

import com.google.android.material.color.utilities.DynamicScheme;
import com.google.android.material.color.utilities.MaterialDynamicColors;
import com.viergegroup.sdk.taptophone.vierge.SdkTapOnPhone.TsdkLogger;
import io.reactivex.rxjava3.core.Observable;
import java.util.function.Function;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class b implements Function {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f69599a;

    public /* synthetic */ b(int i10) {
        this.f69599a = i10;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        switch (this.f69599a) {
            case 0:
                return ((DynamicScheme) obj).primaryPalette;
            case 1:
                return ((DynamicScheme) obj).neutralPalette;
            case 2:
                DynamicScheme dynamicScheme = (DynamicScheme) obj;
                if (MaterialDynamicColors.b(dynamicScheme)) {
                    return Double.valueOf(dynamicScheme.isDark ? 10.0d : 90.0d);
                }
                return Double.valueOf(dynamicScheme.isDark ? 20.0d : 100.0d);
            case 3:
                return ((DynamicScheme) obj).neutralPalette;
            case 4:
                return Double.valueOf(((DynamicScheme) obj).tertiaryPalette.getKeyColor().getTone());
            case 5:
                String str = TsdkLogger.f67745a;
                return null;
            default:
                return Observable.just(obj);
        }
    }
}
