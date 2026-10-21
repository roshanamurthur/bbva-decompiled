package i3;

import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager2.adapter.FragmentStateAdapter;

/* JADX INFO: compiled from: FragmentStateAdapter.java */
/* JADX INFO: loaded from: classes2.dex */
public final class a extends FragmentManager.FragmentLifecycleCallbacks {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ Fragment f69497p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ FrameLayout f69498q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ FragmentStateAdapter f69499r0;

    public a(FragmentStateAdapter fragmentStateAdapter, Fragment fragment, FrameLayout frameLayout) {
        this.f69499r0 = fragmentStateAdapter;
        this.f69497p0 = fragment;
        this.f69498q0 = frameLayout;
    }

    @Override // androidx.fragment.app.FragmentManager.FragmentLifecycleCallbacks
    public final void onFragmentViewCreated(@NonNull FragmentManager fragmentManager, @NonNull Fragment fragment, @NonNull View view, @Nullable Bundle bundle) {
        if (fragment == this.f69497p0) {
            fragmentManager.unregisterFragmentLifecycleCallbacks(this);
            this.f69499r0.getClass();
            FragmentStateAdapter.a(view, this.f69498q0);
        }
    }
}
