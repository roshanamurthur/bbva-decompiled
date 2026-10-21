package com.bumptech.glide.manager;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestManager;
import com.bumptech.glide.util.Util;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: LifecycleRequestManagerRetriever.java */
/* JADX INFO: loaded from: classes9.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f38706a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final RequestManagerRetriever.RequestManagerFactory f38707b;

    /* JADX INFO: renamed from: com.bumptech.glide.manager.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: LifecycleRequestManagerRetriever.java */
    public final class C0177b implements RequestManagerTreeNode {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final FragmentManager f38710a;

        public C0177b(FragmentManager fragmentManager) {
            this.f38710a = fragmentManager;
        }

        public final void a(FragmentManager fragmentManager, HashSet hashSet) {
            List<Fragment> fragments = fragmentManager.getFragments();
            int size = fragments.size();
            for (int i10 = 0; i10 < size; i10++) {
                Fragment fragment = fragments.get(i10);
                a(fragment.getChildFragmentManager(), hashSet);
                androidx.lifecycle.Lifecycle lifecycle = fragment.getLifecycle();
                b bVar = b.this;
                bVar.getClass();
                Util.assertMainThread();
                RequestManager requestManager = (RequestManager) bVar.f38706a.get(lifecycle);
                if (requestManager != null) {
                    hashSet.add(requestManager);
                }
            }
        }

        @Override // com.bumptech.glide.manager.RequestManagerTreeNode
        @NonNull
        public final Set<RequestManager> getDescendants() {
            HashSet hashSet = new HashSet();
            a(this.f38710a, hashSet);
            return hashSet;
        }
    }

    public b(@NonNull RequestManagerRetriever.RequestManagerFactory requestManagerFactory) {
        this.f38707b = requestManagerFactory;
    }

    public final RequestManager a(Context context, Glide glide, androidx.lifecycle.Lifecycle lifecycle, FragmentManager fragmentManager, boolean z10) {
        Util.assertMainThread();
        Util.assertMainThread();
        HashMap map = this.f38706a;
        RequestManager requestManager = (RequestManager) map.get(lifecycle);
        if (requestManager != null) {
            return requestManager;
        }
        zc.e eVar = new zc.e(lifecycle);
        RequestManager requestManagerBuild = this.f38707b.build(glide, eVar, new C0177b(fragmentManager), context);
        map.put(lifecycle, requestManagerBuild);
        eVar.addListener(new a(lifecycle));
        if (z10) {
            requestManagerBuild.onStart();
        }
        return requestManagerBuild;
    }

    /* JADX INFO: compiled from: LifecycleRequestManagerRetriever.java */
    public class a implements LifecycleListener {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ androidx.lifecycle.Lifecycle f38708p0;

        public a(androidx.lifecycle.Lifecycle lifecycle) {
            this.f38708p0 = lifecycle;
        }

        @Override // com.bumptech.glide.manager.LifecycleListener
        public final void onDestroy() {
            b.this.f38706a.remove(this.f38708p0);
        }

        @Override // com.bumptech.glide.manager.LifecycleListener
        public final void onStart() {
        }

        @Override // com.bumptech.glide.manager.LifecycleListener
        public final void onStop() {
        }
    }
}
