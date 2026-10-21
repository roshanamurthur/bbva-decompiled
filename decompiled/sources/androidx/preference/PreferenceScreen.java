package androidx.preference;

import android.content.Context;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.core.content.res.TypedArrayUtils;

/* JADX INFO: loaded from: classes2.dex */
public final class PreferenceScreen extends PreferenceGroup {

    /* JADX INFO: renamed from: u1, reason: collision with root package name */
    public boolean f22411u1;

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public PreferenceScreen(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet, TypedArrayUtils.getAttr(context, R.attr.preferenceScreenStyle, android.R.attr.preferenceScreenStyle));
        this.f22411u1 = true;
    }

    @Override // androidx.preference.PreferenceGroup
    public boolean isOnSameScreenAsChildren() {
        return false;
    }

    @Override // androidx.preference.Preference
    public void onClick() {
        PreferenceManager.OnNavigateToScreenListener onNavigateToScreenListener;
        if (getIntent() != null || getFragment() != null || getPreferenceCount() == 0 || (onNavigateToScreenListener = getPreferenceManager().getOnNavigateToScreenListener()) == null) {
            return;
        }
        onNavigateToScreenListener.onNavigateToScreen(this);
    }

    public void setShouldUseGeneratedIds(boolean z10) {
        if (isAttached()) {
            throw new IllegalStateException("Cannot change the usage of generated IDs while attached to the preference hierarchy");
        }
        this.f22411u1 = z10;
    }

    public boolean shouldUseGeneratedIds() {
        return this.f22411u1;
    }
}
