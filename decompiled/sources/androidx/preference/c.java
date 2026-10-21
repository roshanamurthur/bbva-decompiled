package androidx.preference;

import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: compiled from: PreferenceFragment.java */
/* JADX INFO: loaded from: classes2.dex */
public final class c implements Runnable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ Preference f22445p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ String f22446q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ PreferenceFragment f22447r0;

    public c(PreferenceFragment preferenceFragment, Preference preference, String str) {
        this.f22447r0 = preferenceFragment;
        this.f22445p0 = preference;
        this.f22446q0 = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        PreferenceFragment preferenceFragment = this.f22447r0;
        RecyclerView.Adapter adapter = preferenceFragment.f22332r0.getAdapter();
        if (!(adapter instanceof PreferenceGroup.PreferencePositionCallback)) {
            if (adapter != 0) {
                throw new IllegalStateException("Adapter must implement PreferencePositionCallback");
            }
            return;
        }
        String str = this.f22446q0;
        Preference preference = this.f22445p0;
        int preferenceAdapterPosition = preference != null ? ((PreferenceGroup.PreferencePositionCallback) adapter).getPreferenceAdapterPosition(preference) : ((PreferenceGroup.PreferencePositionCallback) adapter).getPreferenceAdapterPosition(str);
        if (preferenceAdapterPosition != -1) {
            preferenceFragment.f22332r0.scrollToPosition(preferenceAdapterPosition);
        } else {
            adapter.registerAdapterDataObserver(new PreferenceFragment.d(adapter, preferenceFragment.f22332r0, preference, str));
        }
    }
}
