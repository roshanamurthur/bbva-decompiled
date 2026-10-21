package com.bbva.glomohybrid.base.delegates.glomo.features;

import com.bbva.glomo.user.domain.model.UserProfileConfiguration;
import com.google.android.gms.common.Scopes;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: ActiveUserFeaturesDelegate.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\n\u0010\u000bJ\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\f"}, d2 = {"Lcom/bbva/glomohybrid/base/delegates/glomo/features/DefaultActiveUserFeatureDelegate;", "Lcom/bbva/glomohybrid/base/delegates/glomo/features/ActiveUserFeaturesDelegate;", "Lcom/bbva/glomo/user/domain/model/UserProfileConfiguration;", Scopes.PROFILE, "", "Lcom/bbva/glomohybrid/base/delegates/glomo/features/GlomoFeature;", "getActiveFeatures", "", "isAnyFeatureActive", "features", "<init>", "(Ljava/util/List;)V", "Base_release"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nActiveUserFeaturesDelegate.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ActiveUserFeaturesDelegate.kt\ncom/bbva/glomohybrid/base/delegates/glomo/features/DefaultActiveUserFeatureDelegate\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,27:1\n766#2:28\n857#2,2:29\n*S KotlinDebug\n*F\n+ 1 ActiveUserFeaturesDelegate.kt\ncom/bbva/glomohybrid/base/delegates/glomo/features/DefaultActiveUserFeatureDelegate\n*L\n10#1:28\n10#1:29,2\n*E\n"})
public final class DefaultActiveUserFeatureDelegate implements ActiveUserFeaturesDelegate {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final List<GlomoFeature> f31304a;

    /* JADX WARN: Multi-variable type inference failed */
    public DefaultActiveUserFeatureDelegate(@NotNull List<? extends GlomoFeature> features) {
        Intrinsics.checkNotNullParameter(features, "features");
        this.f31304a = features;
    }

    @Override // com.bbva.glomohybrid.base.delegates.glomo.features.ActiveUserFeaturesDelegate
    @NotNull
    public List<GlomoFeature> getActiveFeatures(@NotNull UserProfileConfiguration profile) {
        Intrinsics.checkNotNullParameter(profile, "profile");
        List<GlomoFeature> list = this.f31304a;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((GlomoFeature) obj).isActive(profile)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    @Override // com.bbva.glomohybrid.base.delegates.glomo.features.ActiveUserFeaturesDelegate
    public boolean isAnyFeatureActive(@NotNull UserProfileConfiguration profile) {
        Intrinsics.checkNotNullParameter(profile, "profile");
        return !getActiveFeatures(profile).isEmpty();
    }
}
