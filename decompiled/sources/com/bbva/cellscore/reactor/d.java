package com.bbva.cellscore.reactor;

import android.app.Activity;
import androidx.camera.core.b0;
import com.bbva.cellscore.channel.model.Reaction;
import com.dasnano.vdphotoselfiecapture.fragments.SelfieFragment;
import com.veridas.camera.CameraAction;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class d implements Reaction.NavigationExecution, CameraAction {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ Object f27047p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ Object f27048q0;

    public /* synthetic */ d(Object obj, Object obj2) {
        this.f27047p0 = obj;
        this.f27048q0 = obj2;
    }

    @Override // com.bbva.cellscore.channel.model.Reaction.NavigationExecution
    public final void execute(Activity activity, Object obj, Object obj2) {
        JsonPageReaction jsonPageReaction = (JsonPageReaction) this.f27047p0;
        jsonPageReaction.J0.dispatch(activity, (String) this.f27048q0);
    }

    @Override // com.veridas.camera.CameraAction
    public final void execute(boolean z10) {
        SelfieFragment selfieFragment = (SelfieFragment) this.f27047p0;
        Runnable runnable = (Runnable) this.f27048q0;
        String str = SelfieFragment.CHALLENGE_TO_BE_REPEATED;
        selfieFragment.getClass();
        selfieFragment.runOnUiThread(new b0(selfieFragment, runnable, 2));
    }
}
