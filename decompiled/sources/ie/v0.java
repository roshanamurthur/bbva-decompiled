package ie;

import com.google.android.material.color.utilities.MaterialDynamicColors;
import com.google.android.material.color.utilities.ToneDeltaPair;
import com.google.android.material.color.utilities.TonePolarity;
import com.mypinpad.tsdk.isolation.ti;
import java.util.function.Function;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class v0 implements Function {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f69657a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f69658b;

    public /* synthetic */ v0(Object obj, int i10) {
        this.f69657a = i10;
        this.f69658b = obj;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        switch (this.f69657a) {
            case 0:
                MaterialDynamicColors materialDynamicColors = (MaterialDynamicColors) this.f69658b;
                return new ToneDeltaPair(materialDynamicColors.secondaryContainer(), materialDynamicColors.secondary(), 15.0d, TonePolarity.NEARER, false);
            default:
                Function1 function1 = (Function1) this.f69658b;
                int i10 = ti.f61068j + 13;
                ti.f61067i = i10 % 128;
                int i11 = i10 % 2;
                Intrinsics.checkNotNullParameter(function1, "");
                ti.setOnFocusChangeListener setonfocuschangelistener = (ti.setOnFocusChangeListener) function1.invoke(obj);
                int i12 = ti.f61068j + 55;
                ti.f61067i = i12 % 128;
                if (i12 % 2 == 0) {
                    return setonfocuschangelistener;
                }
                throw null;
        }
    }
}
