package androidx.preference;

import androidx.annotation.NonNull;

/* JADX INFO: compiled from: ExpandButton.java */
/* JADX INFO: loaded from: classes2.dex */
public final class a extends Preference {

    /* JADX INFO: renamed from: l1, reason: collision with root package name */
    public long f22444l1;

    @Override // androidx.preference.Preference
    public final long a() {
        return this.f22444l1;
    }

    @Override // androidx.preference.Preference
    public final void onBindViewHolder(@NonNull PreferenceViewHolder preferenceViewHolder) {
        super.onBindViewHolder(preferenceViewHolder);
        preferenceViewHolder.setDividerAllowedAbove(false);
    }
}
