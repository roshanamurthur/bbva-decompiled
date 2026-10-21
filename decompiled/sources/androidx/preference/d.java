package androidx.preference;

import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: compiled from: PreferenceFragmentCompat.java */
/* JADX INFO: loaded from: classes2.dex */
public final class d implements Runnable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ Preference f22448p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ String f22449q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ PreferenceFragmentCompat f22450r0;

    public d(PreferenceFragmentCompat preferenceFragmentCompat, Preference preference, String str) {
        this.f22450r0 = preferenceFragmentCompat;
        this.f22448p0 = preference;
        this.f22449q0 = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        PreferenceFragmentCompat preferenceFragmentCompat = this.f22450r0;
        RecyclerView.Adapter adapter = preferenceFragmentCompat.f22351r0.getAdapter();
        if (!(adapter instanceof PreferenceGroup.PreferencePositionCallback)) {
            if (adapter != 0) {
                throw new IllegalStateException("Adapter must implement PreferencePositionCallback");
            }
            return;
        }
        String str = this.f22449q0;
        Preference preference = this.f22448p0;
        int preferenceAdapterPosition = preference != null ? ((PreferenceGroup.PreferencePositionCallback) adapter).getPreferenceAdapterPosition(preference) : ((PreferenceGroup.PreferencePositionCallback) adapter).getPreferenceAdapterPosition(str);
        if (preferenceAdapterPosition != -1) {
            preferenceFragmentCompat.f22351r0.scrollToPosition(preferenceAdapterPosition);
        } else {
            adapter.registerAdapterDataObserver(new PreferenceFragmentCompat.d(adapter, preferenceFragmentCompat.f22351r0, preference, str));
        }
    }
}
