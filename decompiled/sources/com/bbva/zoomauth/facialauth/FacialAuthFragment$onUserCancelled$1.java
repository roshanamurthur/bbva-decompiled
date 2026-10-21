package com.bbva.zoomauth.facialauth;

import androidx.fragment.app.FragmentActivity;
import java.util.TimerTask;
import k0.e;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: FacialAuthFragment.kt */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004"}, d2 = {"com/bbva/zoomauth/facialauth/FacialAuthFragment$onUserCancelled$1", "Ljava/util/TimerTask;", "", "run", "zoomauth_release"}, k = 1, mv = {1, 5, 1})
public final class FacialAuthFragment$onUserCancelled$1 extends TimerTask {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public static final /* synthetic */ int f37789q0 = 0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ FacialAuthFragment f37790p0;

    public FacialAuthFragment$onUserCancelled$1(FacialAuthFragment facialAuthFragment) {
        this.f37790p0 = facialAuthFragment;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public void run() {
        FacialAuthFragment facialAuthFragment = this.f37790p0;
        FragmentActivity activity = facialAuthFragment.getActivity();
        Intrinsics.checkNotNull(activity);
        activity.runOnUiThread(new e(facialAuthFragment, 3));
    }
}
