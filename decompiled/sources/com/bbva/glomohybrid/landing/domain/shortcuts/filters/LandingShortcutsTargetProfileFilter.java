package com.bbva.glomohybrid.landing.domain.shortcuts.filters;

import com.bbva.glomo.user.domain.model.UserProfileConfiguration;
import com.bbva.glomohybrid.landing.domain.aem.common.filters.LandingTargetProfileFilter;
import com.bbva.glomohybrid.landing.domain.aem.model.LandingShortcutItemModel;
import com.google.android.gms.common.Scopes;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: LandingShortcutsTargetProfileFilter.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b¨\u0006\t"}, d2 = {"Lcom/bbva/glomohybrid/landing/domain/shortcuts/filters/LandingShortcutsTargetProfileFilter;", "Lcom/bbva/glomohybrid/landing/domain/aem/common/filters/LandingTargetProfileFilter;", "()V", "isTargetProfileAvailable", "", "shortcut", "Lcom/bbva/glomohybrid/landing/domain/aem/model/LandingShortcutItemModel;", Scopes.PROFILE, "Lcom/bbva/glomo/user/domain/model/UserProfileConfiguration;", "Landing_mexicoRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class LandingShortcutsTargetProfileFilter extends LandingTargetProfileFilter {
    public final boolean isTargetProfileAvailable(@NotNull LandingShortcutItemModel shortcut, @NotNull UserProfileConfiguration profile) {
        Intrinsics.checkNotNullParameter(shortcut, "shortcut");
        Intrinsics.checkNotNullParameter(profile, "profile");
        return isTargetProfileAvailable(shortcut.getTargetProfile(), profile);
    }
}
