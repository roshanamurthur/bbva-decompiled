package com.bumptech.glide.manager;

import androidx.annotation.NonNull;
import com.bumptech.glide.request.target.Target;
import com.bumptech.glide.util.Util;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes9.dex */
public final class TargetTracker implements LifecycleListener {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final Set<Target<?>> f38703p0 = Collections.newSetFromMap(new WeakHashMap());

    public void clear() {
        this.f38703p0.clear();
    }

    @NonNull
    public List<Target<?>> getAll() {
        return Util.getSnapshot(this.f38703p0);
    }

    @Override // com.bumptech.glide.manager.LifecycleListener
    public void onDestroy() {
        Iterator it = Util.getSnapshot(this.f38703p0).iterator();
        while (it.hasNext()) {
            ((Target) it.next()).onDestroy();
        }
    }

    @Override // com.bumptech.glide.manager.LifecycleListener
    public void onStart() {
        Iterator it = Util.getSnapshot(this.f38703p0).iterator();
        while (it.hasNext()) {
            ((Target) it.next()).onStart();
        }
    }

    @Override // com.bumptech.glide.manager.LifecycleListener
    public void onStop() {
        Iterator it = Util.getSnapshot(this.f38703p0).iterator();
        while (it.hasNext()) {
            ((Target) it.next()).onStop();
        }
    }

    public void track(@NonNull Target<?> target) {
        this.f38703p0.add(target);
    }

    public void untrack(@NonNull Target<?> target) {
        this.f38703p0.remove(target);
    }
}
