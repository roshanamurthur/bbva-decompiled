package k;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import androidx.activity.result.ActivityResultCallback;
import androidx.arch.core.util.Function;
import androidx.camera.core.CameraX;
import androidx.camera.lifecycle.ProcessCameraProvider;
import androidx.compose.ui.graphics.colorspace.ColorSpaceKt;
import androidx.compose.ui.graphics.colorspace.DoubleFunction;
import androidx.compose.ui.graphics.colorspace.Rgb;
import androidx.compose.ui.graphics.colorspace.TransferParameters;
import androidx.fragment.app.FragmentResultListener;
import com.bbva.cellscore.channel.builder.refactor.WebNavigationDecision;
import com.bbva.cellscore.channel.model.Reaction;
import com.bbva.cellscore.web.WebController;
import com.dasnano.vddocumentcapture.managers.CameraManagerBase;
import com.veridas.camera.CameraAction;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements ActivityResultCallback, Function, DoubleFunction, FragmentResultListener, Reaction.NavigationExecution, CameraAction {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ Object f79142p0;

    public /* synthetic */ a(Object obj) {
        this.f79142p0 = obj;
    }

    @Override // androidx.arch.core.util.Function
    public final Object apply(Object obj) {
        return ProcessCameraProvider.lambda$getInstance$0((Context) this.f79142p0, (CameraX) obj);
    }

    @Override // com.veridas.camera.CameraAction
    public final void execute(boolean z10) {
        CameraManagerBase.d((CameraManagerBase) this.f79142p0, z10);
    }

    @Override // androidx.compose.ui.graphics.colorspace.DoubleFunction
    public final double invoke(double d2) {
        TransferParameters function = (TransferParameters) this.f79142p0;
        Rgb.Companion companion = Rgb.INSTANCE;
        Intrinsics.checkNotNullParameter(function, "$function");
        return ColorSpaceKt.response(d2, function.getA(), function.getB(), function.getC(), function.getD(), function.getGamma());
    }

    @Override // androidx.activity.result.ActivityResultCallback
    public final void onActivityResult(Object obj) {
        ((Function1) this.f79142p0).invoke(obj);
    }

    @Override // androidx.fragment.app.FragmentResultListener
    public final void onFragmentResult(String p4, Bundle p10) {
        Function2 tmp0 = (Function2) this.f79142p0;
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        Intrinsics.checkNotNullParameter(p4, "p0");
        Intrinsics.checkNotNullParameter(p10, "p1");
        tmp0.invoke(p4, p10);
    }

    @Override // com.bbva.cellscore.channel.model.Reaction.NavigationExecution
    public final void execute(Activity activity, Object obj, Object obj2) {
        ((WebController) obj).openWeb(activity, ((WebNavigationDecision) this.f79142p0).choice(obj2), null);
    }
}
