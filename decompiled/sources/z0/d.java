package z0;

import android.app.Activity;
import androidx.compose.ui.graphics.colorspace.DoubleFunction;
import androidx.compose.ui.graphics.colorspace.Rgb;
import androidx.constraintlayout.core.motion.utils.Easing;
import androidx.constraintlayout.core.state.Interpolator;
import com.bbva.cellscore.channel.model.Reaction;
import com.bbva.cellscore.web.WebController;
import com.bbva.cellscore.web.model.to_web.WebNavigation;
import com.bbva.ui.widget.topsnackbar.TSnackbar;
import com.dasnano.vddocumentcapture.managers.CameraManagerBase;
import com.salesforce.marketingcloud.MarketingCloudSdk;
import com.salesforce.marketingcloud.events.Event;
import com.salesforce.marketingcloud.events.i;
import com.veridas.camera.CameraAction;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d implements DoubleFunction, Interpolator, Reaction.NavigationExecution, TSnackbar.SnackbarLayout.b, CameraAction, MarketingCloudSdk.WhenReadyListener {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ Object f94924p0;

    public /* synthetic */ d(Object obj) {
        this.f94924p0 = obj;
    }

    @Override // com.veridas.camera.CameraAction
    public final void execute(boolean z10) {
        CameraManagerBase.b((CameraManagerBase) this.f94924p0);
    }

    @Override // androidx.constraintlayout.core.state.Interpolator
    public final float getInterpolation(float f6) {
        return (float) Easing.getInterpolator((String) this.f94924p0).get(f6);
    }

    @Override // androidx.compose.ui.graphics.colorspace.DoubleFunction
    public final double invoke(double d2) {
        Rgb this$0 = (Rgb) this.f94924p0;
        Rgb.Companion companion = Rgb.INSTANCE;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        return kotlin.ranges.c.coerceIn(this$0.oetfOrig.invoke(d2), this$0.f15825e, this$0.f15826f);
    }

    @Override // com.salesforce.marketingcloud.MarketingCloudSdk.WhenReadyListener
    public final void ready(MarketingCloudSdk marketingCloudSdk) {
        i.c((Event) this.f94924p0, marketingCloudSdk);
    }

    @Override // com.bbva.cellscore.channel.model.Reaction.NavigationExecution
    public final void execute(Activity activity, Object obj, Object obj2) {
        ((WebController) obj).openWeb(activity, (WebNavigation) this.f94924p0, obj2);
    }
}
