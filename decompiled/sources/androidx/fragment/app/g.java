package androidx.fragment.app;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import java.util.Objects;

/* JADX INFO: compiled from: DefaultSpecialEffectsController.java */
/* JADX INFO: loaded from: classes2.dex */
public final class g implements Animation.AnimationListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b0.e f21712a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f21713b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f21714c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ c.b f21715d;

    /* JADX INFO: compiled from: DefaultSpecialEffectsController.java */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            g gVar = g.this;
            gVar.f21713b.endViewTransition(gVar.f21714c);
            gVar.f21715d.a();
        }
    }

    public g(View view, ViewGroup viewGroup, c.b bVar, b0.e eVar) {
        this.f21712a = eVar;
        this.f21713b = viewGroup;
        this.f21714c = view;
        this.f21715d = bVar;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        this.f21713b.post(new a());
        if (FragmentManager.isLoggingEnabled(2)) {
            Objects.toString(this.f21712a);
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
        if (FragmentManager.isLoggingEnabled(2)) {
            Objects.toString(this.f21712a);
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }
}
