package androidx.fragment.app;

import android.view.View;
import android.view.ViewGroup;
import androidx.core.os.CancellationSignal;
import java.util.Objects;

/* JADX INFO: compiled from: DefaultSpecialEffectsController.java */
/* JADX INFO: loaded from: classes2.dex */
public final class h implements CancellationSignal.OnCancelListener {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ View f21717p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f21718q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ c.b f21719r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final /* synthetic */ b0.e f21720s0;

    public h(View view, ViewGroup viewGroup, c.b bVar, b0.e eVar) {
        this.f21717p0 = view;
        this.f21718q0 = viewGroup;
        this.f21719r0 = bVar;
        this.f21720s0 = eVar;
    }

    @Override // androidx.core.os.CancellationSignal.OnCancelListener
    public final void onCancel() {
        View view = this.f21717p0;
        view.clearAnimation();
        this.f21718q0.endViewTransition(view);
        this.f21719r0.a();
        if (FragmentManager.isLoggingEnabled(2)) {
            Objects.toString(this.f21720s0);
        }
    }
}
