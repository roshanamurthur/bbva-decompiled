package com.dasnano.vdphotoselfiecapture.fragments;

import android.os.Handler;
import android.view.View;
import androidx.core.text.HtmlCompat;
import com.dasnano.vdphotoselfiecapture.CustomAlertDialog;
import com.veridas.logger.Logger;
import com.veridas.logger.VDLogger;
import com.veridas.util.AppUtil;

/* JADX INFO: compiled from: SelfieFragment.java */
/* JADX INFO: loaded from: classes9.dex */
public final class k implements Runnable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ Boolean f39669p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ SelfieFragment f39670q0;

    /* JADX INFO: compiled from: SelfieFragment.java */
    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            k kVar = k.this;
            SelfieFragment selfieFragment = kVar.f39670q0;
            if (!selfieFragment.f39585n2) {
                selfieFragment.s();
                kVar.f39670q0.t(true);
                return;
            }
            selfieFragment.Y0.setRect(-1, selfieFragment.W0, selfieFragment.X0);
            kVar.f39670q0.D();
            kVar.f39670q0.J();
            SelfieFragment selfieFragment2 = kVar.f39670q0;
            selfieFragment2.f39565d1.setText(HtmlCompat.fromHtml(selfieFragment2.f39580l1, 0));
            kVar.f39670q0.f39566e1.setVisibility(0);
            kVar.f39670q0.B1.setVisibility(8);
            kVar.f39670q0.f39568f1.setVisibility(8);
            kVar.f39670q0.f39570g1.setVisibility(8);
            kVar.f39670q0.setMaxSmileValue(0.0d);
            kVar.f39670q0.setMinSmileValue(1.0d);
            VDLogger.log(Logger.Tag.ERROR, "Smile not detected error. Restart.");
            kVar.f39670q0.V0.dismiss();
            kVar.f39670q0.restartCamera();
        }
    }

    public k(SelfieFragment selfieFragment, Boolean bool) {
        this.f39670q0 = selfieFragment;
        this.f39669p0 = bool;
    }

    /* JADX WARN: Type inference failed for: r2v7, types: [com.veridas.config.Configuration] */
    @Override // java.lang.Runnable
    public final void run() {
        SelfieFragment.SelfieState selfieState = SelfieFragment.SelfieState.SELFIE_WAITING_FOR_CONFIRMATION;
        SelfieFragment selfieFragment = this.f39670q0;
        selfieFragment.setSelfieState(selfieState);
        selfieFragment.z(null, false);
        selfieFragment.f39566e1.setVisibility(4);
        selfieFragment.f39563c1.setVisibility(4);
        selfieFragment.f39572h1.setVisibility(4);
        selfieFragment.f39574i1.setVisibility(4);
        selfieFragment.f39578k1.setVisibility(4);
        selfieFragment.f39576j1.setVisibility(4);
        ?? configuration = selfieFragment.getConfiguration();
        selfieFragment.setSelfieState(selfieState);
        if (selfieFragment.f39590q2) {
            selfieFragment.V0 = (CustomAlertDialog) AppUtil.dismiss(selfieFragment.V0);
            CustomAlertDialog customAlertDialog = new CustomAlertDialog(selfieFragment.getContext(), this.f39669p0, configuration);
            selfieFragment.V0 = customAlertDialog;
            customAlertDialog.setButtonListener(new a());
            selfieFragment.V0.show();
            return;
        }
        if (selfieFragment.o2) {
            new Handler().postDelayed(new androidx.compose.ui.platform.j(this, 6), 1000L);
        } else {
            selfieFragment.s();
            selfieFragment.t(true);
        }
    }
}
