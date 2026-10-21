package androidx.fragment.app;

import android.animation.Animator;
import androidx.core.os.CancellationSignal;
import java.util.Objects;

/* JADX INFO: compiled from: DefaultSpecialEffectsController.java */
/* JADX INFO: loaded from: classes2.dex */
public final class f implements CancellationSignal.OnCancelListener {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ Animator f21710p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ b0.e f21711q0;

    public f(Animator animator, b0.e eVar) {
        this.f21710p0 = animator;
        this.f21711q0 = eVar;
    }

    @Override // androidx.core.os.CancellationSignal.OnCancelListener
    public final void onCancel() {
        this.f21710p0.end();
        if (FragmentManager.isLoggingEnabled(2)) {
            Objects.toString(this.f21711q0);
        }
    }
}
