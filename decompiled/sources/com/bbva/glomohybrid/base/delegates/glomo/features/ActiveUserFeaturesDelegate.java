package com.bbva.glomohybrid.base.delegates.glomo.features;

import com.bbva.glomo.user.domain.model.UserProfileConfiguration;
import com.google.android.gms.common.Scopes;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: ActiveUserFeaturesDelegate.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0006H&¨\u0006\t"}, d2 = {"Lcom/bbva/glomohybrid/base/delegates/glomo/features/ActiveUserFeaturesDelegate;", "", "getActiveFeatures", "", "Lcom/bbva/glomohybrid/base/delegates/glomo/features/GlomoFeature;", Scopes.PROFILE, "Lcom/bbva/glomo/user/domain/model/UserProfileConfiguration;", "isAnyFeatureActive", "", "Base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface ActiveUserFeaturesDelegate {
    @NotNull
    List<GlomoFeature> getActiveFeatures(@NotNull UserProfileConfiguration profile);

    boolean isAnyFeatureActive(@NotNull UserProfileConfiguration profile);
}
