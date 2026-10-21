package com.bbva.glomohybrid.glomo.features;

import android.content.Context;
import com.bancomer.mbanking.R;
import com.bbva.glomo.user.domain.model.UserProfileConfiguration;
import com.bbva.glomohybrid.base.delegates.glomo.features.GlomoFeature;
import com.google.android.gms.common.Scopes;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: SofttokenFeature.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0017\u0010\u000b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000f\u001a\u00020\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e¨\u0006\u0012"}, d2 = {"Lcom/bbva/glomohybrid/glomo/features/SofttokenFeature;", "Lcom/bbva/glomohybrid/base/delegates/glomo/features/GlomoFeature;", "Lcom/bbva/glomo/user/domain/model/UserProfileConfiguration;", Scopes.PROFILE, "", "isActive", "Landroid/content/Context;", "a", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "context", "", "getShortDescription", "()Ljava/lang/String;", "shortDescription", "<init>", "(Landroid/content/Context;)V", "app_mexicoProdGoogleRelease"}, k = 1, mv = {1, 9, 0})
public final class SofttokenFeature implements GlomoFeature {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Context context;

    public SofttokenFeature(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
    }

    @NotNull
    public final Context getContext() {
        return this.context;
    }

    @Override // com.bbva.glomohybrid.base.delegates.glomo.features.GlomoFeature
    @NotNull
    public String getShortDescription() {
        String string = this.context.getResources().getString(R.string.modal_full_changeuser_softtoken_short_text);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        return string;
    }

    @Override // com.bbva.glomohybrid.base.delegates.glomo.features.GlomoFeature
    public boolean isActive(@NotNull UserProfileConfiguration profile) {
        Intrinsics.checkNotNullParameter(profile, "profile");
        return profile.getIsDigitalTokenEnabled();
    }
}
