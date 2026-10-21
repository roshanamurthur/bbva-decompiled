package com.bbva.glomohybrid.biometric.migration;

import android.content.SharedPreferences;
import com.bbva.component.dm.biometriclogin.data.repository.datasource.FidoSettingsAdapter;
import com.bbva.component.dm.biometriclogin.domain.handler.BiometricMigratorHandler;
import com.bbva.glomo.storage.MainStorage;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: FidoLocalStorageMigrator.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u001f\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\r"}, d2 = {"Lcom/bbva/glomohybrid/biometric/migration/FidoLocalStorageMigrator;", "Lcom/bbva/component/dm/biometriclogin/domain/handler/BiometricMigratorHandler;", "", "execute", "Landroid/content/SharedPreferences;", "preferences", "Lcom/bbva/component/dm/biometriclogin/data/repository/datasource/FidoSettingsAdapter;", "fidoAdapter", "Lcom/bbva/glomo/storage/MainStorage;", "storage", "<init>", "(Landroid/content/SharedPreferences;Lcom/bbva/component/dm/biometriclogin/data/repository/datasource/FidoSettingsAdapter;Lcom/bbva/glomo/storage/MainStorage;)V", "Companion", "app_mexicoProdGoogleRelease"}, k = 1, mv = {1, 9, 0})
public final class FidoLocalStorageMigrator implements BiometricMigratorHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final SharedPreferences f31628a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final FidoSettingsAdapter f31629b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final MainStorage f31630c;

    public FidoLocalStorageMigrator(@NotNull SharedPreferences preferences, @NotNull FidoSettingsAdapter fidoAdapter, @NotNull MainStorage storage) {
        Intrinsics.checkNotNullParameter(preferences, "preferences");
        Intrinsics.checkNotNullParameter(fidoAdapter, "fidoAdapter");
        Intrinsics.checkNotNullParameter(storage, "storage");
        this.f31628a = preferences;
        this.f31629b = fidoAdapter;
        this.f31630c = storage;
    }

    @Override // com.bbva.component.dm.biometriclogin.domain.handler.BiometricMigratorHandler
    public void execute() {
        SharedPreferences sharedPreferences = this.f31628a;
        Boolean boolValueOf = !sharedPreferences.contains("userWantsToUseFido") ? null : Boolean.valueOf(sharedPreferences.getBoolean("userWantsToUseFido", false));
        FidoSettingsAdapter fidoSettingsAdapter = this.f31629b;
        if (boolValueOf != null) {
            fidoSettingsAdapter.setAccessEnabled(boolValueOf.booleanValue());
            sharedPreferences.edit().remove("userWantsToUseFido").apply();
        }
        Boolean boolValueOf2 = !sharedPreferences.contains("isUserFidoEnrolled") ? null : Boolean.valueOf(sharedPreferences.getBoolean("isUserFidoEnrolled", false));
        if (boolValueOf2 != null) {
            fidoSettingsAdapter.setFidoEnrolled(boolValueOf2.booleanValue());
            sharedPreferences.edit().remove("isUserFidoEnrolled").apply();
        }
        Boolean boolValueOf3 = sharedPreferences.contains("userHasSeenFidoInvite") ? Boolean.valueOf(sharedPreferences.getBoolean("userHasSeenFidoInvite", false)) : null;
        if (boolValueOf3 != null) {
            boolean zBooleanValue = boolValueOf3.booleanValue();
            MainStorage.put$default(this.f31630c, "fido_info_register", "{\"status\": " + zBooleanValue + "}", false, null, 12, null);
            sharedPreferences.edit().remove("userHasSeenFidoInvite").apply();
        }
    }
}
