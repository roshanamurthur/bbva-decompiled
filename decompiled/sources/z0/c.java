package z0;

import android.view.MenuItem;
import androidx.appcompat.widget.Toolbar;
import androidx.compose.ui.graphics.colorspace.DoubleFunction;
import androidx.compose.ui.graphics.colorspace.Rgb;
import com.bbva.cells.component.kit.model.ActionSpec;
import com.bbva.cellscore.app.Reactor;
import com.bbva.glomohybrid.ui.R;
import com.bbva.glomohybrid.ui.modals.FullScreenModal;
import com.dasnano.vdvideoselfiecapture.fragments.VideoFragment;
import com.google.android.datatransport.runtime.TransportContext;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.WorkInitializer;
import com.google.android.datatransport.runtime.synchronization.SynchronizationGuard;
import com.veridas.camera.CameraAction;
import com.veridas.logger.Logger;
import com.veridas.logger.VDLogger;
import java.util.Iterator;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c implements DoubleFunction, Toolbar.OnMenuItemClickListener, CameraAction, SynchronizationGuard.CriticalSection {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ Object f94923p0;

    public /* synthetic */ c(Object obj) {
        this.f94923p0 = obj;
    }

    @Override // com.google.android.datatransport.runtime.synchronization.SynchronizationGuard.CriticalSection
    public final Object execute() {
        WorkInitializer workInitializer = (WorkInitializer) this.f94923p0;
        Iterator<TransportContext> it = workInitializer.f43848b.loadActiveContexts().iterator();
        while (it.hasNext()) {
            workInitializer.f43849c.schedule(it.next(), 1);
        }
        return null;
    }

    @Override // androidx.compose.ui.graphics.colorspace.DoubleFunction
    public final double invoke(double d2) {
        Function1 oetf = (Function1) this.f94923p0;
        Rgb.Companion companion = Rgb.INSTANCE;
        Intrinsics.checkNotNullParameter(oetf, "$oetf");
        return ((Number) oetf.invoke(Double.valueOf(d2))).doubleValue();
    }

    @Override // androidx.appcompat.widget.Toolbar.OnMenuItemClickListener
    public final boolean onMenuItemClick(MenuItem menuItem) {
        FullScreenModal this$0 = (FullScreenModal) this.f94923p0;
        FullScreenModal.Companion companion = FullScreenModal.INSTANCE;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (menuItem.getItemId() != R.id.action_close) {
            return false;
        }
        ActionSpec<Void> actionSpec = FullScreenModal.f34619x0;
        FullScreenModal.FullScreenModalConfig fullScreenModalConfig = this$0.f34621q0;
        if (fullScreenModalConfig == null) {
            Intrinsics.throwUninitializedPropertyAccessException("config");
            fullScreenModalConfig = null;
        }
        Reactor.inside(fullScreenModalConfig.getId()).doAction(actionSpec).with(null).fire();
        this$0.dismiss();
        return true;
    }

    @Override // com.veridas.camera.CameraAction
    public final void execute(boolean z10) {
        VideoFragment.h hVar = VideoFragment.h.this;
        VideoFragment videoFragment = VideoFragment.this;
        String str = VideoFragment.VIDEO_FRAGMENT_VIDEO_CAPTURED;
        videoFragment.B();
        VideoFragment videoFragment2 = VideoFragment.this;
        videoFragment2.f39729b1.set(true);
        String str2 = videoFragment2.o2;
        String str3 = videoFragment2.f39756p2;
        VDLogger.log(Logger.Tag.ERROR_TIMEOUT, "User has reached max time available");
        videoFragment2.runOnUiThread(new com.dasnano.vdvideoselfiecapture.fragments.d(videoFragment2, str3, str2));
    }
}
