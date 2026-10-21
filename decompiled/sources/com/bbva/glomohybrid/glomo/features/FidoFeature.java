package com.bbva.glomohybrid.glomo.features;

import android.content.Context;
import com.bancomer.mbanking.R;
import com.bbva.component.dm.biometriclogin.data.repository.datasource.BiometricDatasource;
import com.bbva.glomo.user.domain.model.UserProfileConfiguration;
import com.bbva.glomohybrid.base.delegates.glomo.features.GlomoFeature;
import com.google.android.gms.common.Scopes;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: FidoFeature.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u000b\u001a\u00020\u0006\u0012\u0006\u0010\u0011\u001a\u00020\f¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0017\u0010\u000b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0011\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0015\u001a\u00020\u00128VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0018"}, d2 = {"Lcom/bbva/glomohybrid/glomo/features/FidoFeature;", "Lcom/bbva/glomohybrid/base/delegates/glomo/features/GlomoFeature;", "Lcom/bbva/glomo/user/domain/model/UserProfileConfiguration;", Scopes.PROFILE, "", "isActive", "Landroid/content/Context;", "a", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "context", "Lcom/bbva/component/dm/biometriclogin/data/repository/datasource/BiometricDatasource;", "b", "Lcom/bbva/component/dm/biometriclogin/data/repository/datasource/BiometricDatasource;", "getBiometricDatasource", "()Lcom/bbva/component/dm/biometriclogin/data/repository/datasource/BiometricDatasource;", "biometricDatasource", "", "getShortDescription", "()Ljava/lang/String;", "shortDescription", "<init>", "(Landroid/content/Context;Lcom/bbva/component/dm/biometriclogin/data/repository/datasource/BiometricDatasource;)V", "app_mexicoProdGoogleRelease"}, k = 1, mv = {1, 9, 0})
public final class FidoFeature implements GlomoFeature {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Context context;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final BiometricDatasource biometricDatasource;

    public FidoFeature(@NotNull Context context, @NotNull BiometricDatasource biometricDatasource) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(biometricDatasource, "biometricDatasource");
        this.context = context;
        this.biometricDatasource = biometricDatasource;
    }

    @NotNull
    public final BiometricDatasource getBiometricDatasource() {
        return this.biometricDatasource;
    }

    @NotNull
    public final Context getContext() {
        return this.context;
    }

    @Override // com.bbva.glomohybrid.base.delegates.glomo.features.GlomoFeature
    @NotNull
    public String getShortDescription() {
        String string = this.context.getResources().getString(R.string.modal_full_changeuser_fido_enrolled);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        return string;
    }

    @Override // com.bbva.glomohybrid.base.delegates.glomo.features.GlomoFeature
    public boolean isActive(@NotNull UserProfileConfiguration profile) {
        Intrinsics.checkNotNullParameter(profile, "profile");
        return this.biometricDatasource.isFidoEnrolled();
    }
}
