package androidx.preference;

import androidx.annotation.NonNull;

/* JADX INFO: compiled from: PreferenceGroupAdapter.java */
/* JADX INFO: loaded from: classes2.dex */
public final class e implements Preference.OnPreferenceClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ PreferenceGroup f22451a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ PreferenceGroupAdapter f22452b;

    public e(PreferenceGroupAdapter preferenceGroupAdapter, PreferenceGroup preferenceGroup) {
        this.f22452b = preferenceGroupAdapter;
        this.f22451a = preferenceGroup;
    }

    @Override // androidx.preference.Preference.OnPreferenceClickListener
    public final boolean onPreferenceClick(@NonNull Preference preference) {
        PreferenceGroup preferenceGroup = this.f22451a;
        preferenceGroup.setInitialExpandedChildrenCount(Integer.MAX_VALUE);
        this.f22452b.onPreferenceHierarchyChange(preference);
        PreferenceGroup.OnExpandButtonClickListener onExpandButtonClickListener = preferenceGroup.getOnExpandButtonClickListener();
        if (onExpandButtonClickListener == null) {
            return true;
        }
        onExpandButtonClickListener.onExpandButtonClick();
        return true;
    }
}
