package androidx.core.view;

import android.annotation.SuppressLint;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import androidx.annotation.NonNull;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes2.dex */
public class MenuHostHelper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Runnable f20206a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CopyOnWriteArrayList<MenuProvider> f20207b = new CopyOnWriteArrayList<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f20208c = new HashMap();

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Lifecycle f20209a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public LifecycleEventObserver f20210b;

        public a(@NonNull Lifecycle lifecycle, @NonNull LifecycleEventObserver lifecycleEventObserver) {
            this.f20209a = lifecycle;
            this.f20210b = lifecycleEventObserver;
            lifecycle.addObserver(lifecycleEventObserver);
        }
    }

    public MenuHostHelper(@NonNull Runnable runnable) {
        this.f20206a = runnable;
    }

    public void addMenuProvider(@NonNull MenuProvider menuProvider) {
        this.f20207b.add(menuProvider);
        this.f20206a.run();
    }

    public void onCreateMenu(@NonNull Menu menu, @NonNull MenuInflater menuInflater) {
        Iterator<MenuProvider> it = this.f20207b.iterator();
        while (it.hasNext()) {
            it.next().onCreateMenu(menu, menuInflater);
        }
    }

    public void onMenuClosed(@NonNull Menu menu) {
        Iterator<MenuProvider> it = this.f20207b.iterator();
        while (it.hasNext()) {
            it.next().onMenuClosed(menu);
        }
    }

    public boolean onMenuItemSelected(@NonNull MenuItem menuItem) {
        Iterator<MenuProvider> it = this.f20207b.iterator();
        while (it.hasNext()) {
            if (it.next().onMenuItemSelected(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public void onPrepareMenu(@NonNull Menu menu) {
        Iterator<MenuProvider> it = this.f20207b.iterator();
        while (it.hasNext()) {
            it.next().onPrepareMenu(menu);
        }
    }

    public void removeMenuProvider(@NonNull MenuProvider menuProvider) {
        this.f20207b.remove(menuProvider);
        a aVar = (a) this.f20208c.remove(menuProvider);
        if (aVar != null) {
            aVar.f20209a.removeObserver(aVar.f20210b);
            aVar.f20210b = null;
        }
        this.f20206a.run();
    }

    public void addMenuProvider(@NonNull final MenuProvider menuProvider, @NonNull LifecycleOwner lifecycleOwner) {
        addMenuProvider(menuProvider);
        Lifecycle lifecycle = lifecycleOwner.getLifecycle();
        HashMap map = this.f20208c;
        a aVar = (a) map.remove(menuProvider);
        if (aVar != null) {
            aVar.f20209a.removeObserver(aVar.f20210b);
            aVar.f20210b = null;
        }
        map.put(menuProvider, new a(lifecycle, new LifecycleEventObserver() { // from class: androidx.core.view.t
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner lifecycleOwner2, Lifecycle.Event event) {
                MenuHostHelper menuHostHelper = this.f20408p0;
                menuHostHelper.getClass();
                if (event == Lifecycle.Event.ON_DESTROY) {
                    menuHostHelper.removeMenuProvider(menuProvider);
                }
            }
        }));
    }

    @SuppressLint({"LambdaLast"})
    public void addMenuProvider(@NonNull final MenuProvider menuProvider, @NonNull LifecycleOwner lifecycleOwner, @NonNull final Lifecycle.State state) {
        Lifecycle lifecycle = lifecycleOwner.getLifecycle();
        HashMap map = this.f20208c;
        a aVar = (a) map.remove(menuProvider);
        if (aVar != null) {
            aVar.f20209a.removeObserver(aVar.f20210b);
            aVar.f20210b = null;
        }
        map.put(menuProvider, new a(lifecycle, new LifecycleEventObserver() { // from class: androidx.core.view.u
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner lifecycleOwner2, Lifecycle.Event event) {
                MenuHostHelper menuHostHelper = this.f20410p0;
                menuHostHelper.getClass();
                Lifecycle.State state2 = state;
                Lifecycle.Event eventUpTo = Lifecycle.Event.upTo(state2);
                MenuProvider menuProvider2 = menuProvider;
                if (event == eventUpTo) {
                    menuHostHelper.addMenuProvider(menuProvider2);
                    return;
                }
                if (event == Lifecycle.Event.ON_DESTROY) {
                    menuHostHelper.removeMenuProvider(menuProvider2);
                } else if (event == Lifecycle.Event.downFrom(state2)) {
                    menuHostHelper.f20207b.remove(menuProvider2);
                    menuHostHelper.f20206a.run();
                }
            }
        }));
    }
}
