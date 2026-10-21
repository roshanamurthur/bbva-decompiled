package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import java.util.Objects;

/* JADX INFO: compiled from: DefaultSpecialEffectsController.java */
/* JADX INFO: loaded from: classes2.dex */
public final class e extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f21705a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f21706b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f21707c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ b0.e f21708d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ c.b f21709e;

    public e(ViewGroup viewGroup, View view, boolean z10, b0.e eVar, c.b bVar) {
        this.f21705a = viewGroup;
        this.f21706b = view;
        this.f21707c = z10;
        this.f21708d = eVar;
        this.f21709e = bVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        ViewGroup viewGroup = this.f21705a;
        View view = this.f21706b;
        viewGroup.endViewTransition(view);
        boolean z10 = this.f21707c;
        b0.e eVar = this.f21708d;
        if (z10) {
            eVar.f21685a.a(view);
        }
        this.f21709e.a();
        if (FragmentManager.isLoggingEnabled(2)) {
            Objects.toString(eVar);
        }
    }
}
