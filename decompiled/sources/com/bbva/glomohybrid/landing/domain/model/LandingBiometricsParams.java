package com.bbva.glomohybrid.landing.domain.model;

import android.app.Activity;
import com.bbva.glomo.user.domain.model.UserProfileConfiguration;
import com.google.android.gms.common.Scopes;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: LandingBiometricsParams.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0006\u0010\u0003\u001a\u00020\u0002J\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004J\u000e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¨\u0006\u000b"}, d2 = {"Lcom/bbva/glomohybrid/landing/domain/model/LandingBiometricsParams;", "", "Landroid/app/Activity;", "get", "Lcom/bbva/glomo/user/domain/model/UserProfileConfiguration;", Scopes.PROFILE, "", "store", "value", "<init>", "(Landroid/app/Activity;)V", "Landing_mexicoRelease"}, k = 1, mv = {1, 9, 0})
public final class LandingBiometricsParams {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public Activity f32665a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public UserProfileConfiguration f32666b;

    public LandingBiometricsParams(@NotNull Activity value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f32665a = value;
    }

    @NotNull
    public final Activity get() throws IllegalAccessException {
        Activity activity = this.f32665a;
        if (activity == null) {
            throw new IllegalAccessException("Value already has been read");
        }
        this.f32665a = null;
        return activity;
    }

    @Nullable
    /* JADX INFO: renamed from: profile, reason: from getter */
    public final UserProfileConfiguration getF32666b() {
        return this.f32666b;
    }

    public final void store(@NotNull UserProfileConfiguration profile) {
        Intrinsics.checkNotNullParameter(profile, "profile");
        this.f32666b = UserProfileConfiguration.copy$default(profile, null, null, 3, null);
    }
}
