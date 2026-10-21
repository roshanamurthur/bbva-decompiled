package j;

import androidx.activity.result.ActivityResultCallback;
import androidx.compose.runtime.State;
import androidx.compose.ui.graphics.colorspace.ColorSpaceKt;
import androidx.compose.ui.graphics.colorspace.DoubleFunction;
import androidx.compose.ui.graphics.colorspace.Rgb;
import androidx.compose.ui.graphics.colorspace.TransferParameters;
import com.dasnano.vddocumentcapture.managers.CameraManagerBase;
import com.veridas.camera.CameraAction;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements ActivityResultCallback, DoubleFunction, CameraAction {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ Object f78715p0;

    public /* synthetic */ a(Object obj) {
        this.f78715p0 = obj;
    }

    @Override // com.veridas.camera.CameraAction
    public final void execute(boolean z10) {
        CameraManagerBase.e((CameraManagerBase) this.f78715p0);
    }

    @Override // androidx.compose.ui.graphics.colorspace.DoubleFunction
    public final double invoke(double d2) {
        TransferParameters function = (TransferParameters) this.f78715p0;
        Rgb.Companion companion = Rgb.INSTANCE;
        Intrinsics.checkNotNullParameter(function, "$function");
        return ColorSpaceKt.rcpResponse(d2, function.getA(), function.getB(), function.getC(), function.getD(), function.getGamma());
    }

    @Override // androidx.activity.result.ActivityResultCallback
    public final void onActivityResult(Object obj) {
        ((Function1) ((State) this.f78715p0).getValue()).invoke(obj);
    }
}
