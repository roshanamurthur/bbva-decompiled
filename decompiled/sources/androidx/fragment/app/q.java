package androidx.fragment.app;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: FragmentLifecycleCallbacksDispatcher.java */
/* JADX INFO: loaded from: classes2.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public final CopyOnWriteArrayList<a> f21743a = new CopyOnWriteArrayList<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final FragmentManager f21744b;

    /* JADX INFO: compiled from: FragmentLifecycleCallbacksDispatcher.java */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NonNull
        public final FragmentManager.FragmentLifecycleCallbacks f21745a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f21746b;

        public a(@NonNull FragmentManager.FragmentLifecycleCallbacks fragmentLifecycleCallbacks, boolean z10) {
            this.f21745a = fragmentLifecycleCallbacks;
            this.f21746b = z10;
        }
    }

    public q(@NonNull FragmentManager fragmentManager) {
        this.f21744b = fragmentManager;
    }

    public final void a(@NonNull Fragment fragment, @Nullable Bundle bundle, boolean z10) {
        FragmentManager fragmentManager = this.f21744b;
        Fragment fragment2 = fragmentManager.f21543s;
        if (fragment2 != null) {
            fragment2.getParentFragmentManager().f21538n.a(fragment, bundle, true);
        }
        for (a aVar : this.f21743a) {
            if (!z10 || aVar.f21746b) {
                aVar.f21745a.onFragmentActivityCreated(fragmentManager, fragment, bundle);
            }
        }
    }

    public final void b(@NonNull Fragment fragment, boolean z10) {
        FragmentManager fragmentManager = this.f21744b;
        Context context = fragmentManager.getHost().f21522q0;
        Fragment fragment2 = fragmentManager.f21543s;
        if (fragment2 != null) {
            fragment2.getParentFragmentManager().f21538n.b(fragment, true);
        }
        for (a aVar : this.f21743a) {
            if (!z10 || aVar.f21746b) {
                aVar.f21745a.onFragmentAttached(fragmentManager, fragment, context);
            }
        }
    }

    public final void c(@NonNull Fragment fragment, @Nullable Bundle bundle, boolean z10) {
        FragmentManager fragmentManager = this.f21744b;
        Fragment fragment2 = fragmentManager.f21543s;
        if (fragment2 != null) {
            fragment2.getParentFragmentManager().f21538n.c(fragment, bundle, true);
        }
        for (a aVar : this.f21743a) {
            if (!z10 || aVar.f21746b) {
                aVar.f21745a.onFragmentCreated(fragmentManager, fragment, bundle);
            }
        }
    }

    public final void d(@NonNull Fragment fragment, boolean z10) {
        FragmentManager fragmentManager = this.f21744b;
        Fragment fragment2 = fragmentManager.f21543s;
        if (fragment2 != null) {
            fragment2.getParentFragmentManager().f21538n.d(fragment, true);
        }
        for (a aVar : this.f21743a) {
            if (!z10 || aVar.f21746b) {
                aVar.f21745a.onFragmentDestroyed(fragmentManager, fragment);
            }
        }
    }

    public final void e(@NonNull Fragment fragment, boolean z10) {
        FragmentManager fragmentManager = this.f21744b;
        Fragment fragment2 = fragmentManager.f21543s;
        if (fragment2 != null) {
            fragment2.getParentFragmentManager().f21538n.e(fragment, true);
        }
        for (a aVar : this.f21743a) {
            if (!z10 || aVar.f21746b) {
                aVar.f21745a.onFragmentDetached(fragmentManager, fragment);
            }
        }
    }

    public final void f(@NonNull Fragment fragment, boolean z10) {
        FragmentManager fragmentManager = this.f21744b;
        Fragment fragment2 = fragmentManager.f21543s;
        if (fragment2 != null) {
            fragment2.getParentFragmentManager().f21538n.f(fragment, true);
        }
        for (a aVar : this.f21743a) {
            if (!z10 || aVar.f21746b) {
                aVar.f21745a.onFragmentPaused(fragmentManager, fragment);
            }
        }
    }

    public final void g(@NonNull Fragment fragment, boolean z10) {
        FragmentManager fragmentManager = this.f21744b;
        Context context = fragmentManager.getHost().f21522q0;
        Fragment fragment2 = fragmentManager.f21543s;
        if (fragment2 != null) {
            fragment2.getParentFragmentManager().f21538n.g(fragment, true);
        }
        for (a aVar : this.f21743a) {
            if (!z10 || aVar.f21746b) {
                aVar.f21745a.onFragmentPreAttached(fragmentManager, fragment, context);
            }
        }
    }

    public final void h(@NonNull Fragment fragment, @Nullable Bundle bundle, boolean z10) {
        FragmentManager fragmentManager = this.f21744b;
        Fragment fragment2 = fragmentManager.f21543s;
        if (fragment2 != null) {
            fragment2.getParentFragmentManager().f21538n.h(fragment, bundle, true);
        }
        for (a aVar : this.f21743a) {
            if (!z10 || aVar.f21746b) {
                aVar.f21745a.onFragmentPreCreated(fragmentManager, fragment, bundle);
            }
        }
    }

    public final void i(@NonNull Fragment fragment, boolean z10) {
        FragmentManager fragmentManager = this.f21744b;
        Fragment fragment2 = fragmentManager.f21543s;
        if (fragment2 != null) {
            fragment2.getParentFragmentManager().f21538n.i(fragment, true);
        }
        for (a aVar : this.f21743a) {
            if (!z10 || aVar.f21746b) {
                aVar.f21745a.onFragmentResumed(fragmentManager, fragment);
            }
        }
    }

    public final void j(@NonNull Fragment fragment, @NonNull Bundle bundle, boolean z10) {
        FragmentManager fragmentManager = this.f21744b;
        Fragment fragment2 = fragmentManager.f21543s;
        if (fragment2 != null) {
            fragment2.getParentFragmentManager().f21538n.j(fragment, bundle, true);
        }
        for (a aVar : this.f21743a) {
            if (!z10 || aVar.f21746b) {
                aVar.f21745a.onFragmentSaveInstanceState(fragmentManager, fragment, bundle);
            }
        }
    }

    public final void k(@NonNull Fragment fragment, boolean z10) {
        FragmentManager fragmentManager = this.f21744b;
        Fragment fragment2 = fragmentManager.f21543s;
        if (fragment2 != null) {
            fragment2.getParentFragmentManager().f21538n.k(fragment, true);
        }
        for (a aVar : this.f21743a) {
            if (!z10 || aVar.f21746b) {
                aVar.f21745a.onFragmentStarted(fragmentManager, fragment);
            }
        }
    }

    public final void l(@NonNull Fragment fragment, boolean z10) {
        FragmentManager fragmentManager = this.f21744b;
        Fragment fragment2 = fragmentManager.f21543s;
        if (fragment2 != null) {
            fragment2.getParentFragmentManager().f21538n.l(fragment, true);
        }
        for (a aVar : this.f21743a) {
            if (!z10 || aVar.f21746b) {
                aVar.f21745a.onFragmentStopped(fragmentManager, fragment);
            }
        }
    }

    public final void m(@NonNull Fragment fragment, @NonNull View view, @Nullable Bundle bundle, boolean z10) {
        FragmentManager fragmentManager = this.f21744b;
        Fragment fragment2 = fragmentManager.f21543s;
        if (fragment2 != null) {
            fragment2.getParentFragmentManager().f21538n.m(fragment, view, bundle, true);
        }
        for (a aVar : this.f21743a) {
            if (!z10 || aVar.f21746b) {
                aVar.f21745a.onFragmentViewCreated(fragmentManager, fragment, view, bundle);
            }
        }
    }

    public final void n(@NonNull Fragment fragment, boolean z10) {
        FragmentManager fragmentManager = this.f21744b;
        Fragment fragment2 = fragmentManager.f21543s;
        if (fragment2 != null) {
            fragment2.getParentFragmentManager().f21538n.n(fragment, true);
        }
        for (a aVar : this.f21743a) {
            if (!z10 || aVar.f21746b) {
                aVar.f21745a.onFragmentViewDestroyed(fragmentManager, fragment);
            }
        }
    }
}
