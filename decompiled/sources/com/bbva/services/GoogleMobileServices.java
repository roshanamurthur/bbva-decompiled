package com.bbva.services;

import com.bbva.glomohybrid.landing.domain.aem.filters.LandingIsGoogleConditionFilter;
import com.bbva.glomoutils.mobileservices.MobileServices;
import kotlin.Metadata;

/* JADX INFO: compiled from: GoogleMobileServices.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00028\u0016X\u0096D¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0007\u001a\u00020\u00028\u0016X\u0096D¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u001a\u0004\b\u0007\u0010\u0006R\u001a\u0010\b\u001a\u00020\u00028\u0016X\u0096D¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\b\u0010\u0006¨\u0006\u000b"}, d2 = {"Lcom/bbva/services/GoogleMobileServices;", "Lcom/bbva/glomoutils/mobileservices/MobileServices;", "", "a", "Z", LandingIsGoogleConditionFilter.ID, "()Z", "isHuawei", "isHuaweiOnly", "<init>", "()V", "gl-mobile-services_googleRelease"}, k = 1, mv = {1, 9, 0})
public final class GoogleMobileServices implements MobileServices {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final boolean isGoogle = true;

    @Override // com.bbva.glomoutils.mobileservices.MobileServices
    /* JADX INFO: renamed from: isGoogle, reason: from getter */
    public boolean getIsGoogle() {
        return this.isGoogle;
    }

    @Override // com.bbva.glomoutils.mobileservices.MobileServices
    public boolean isHuawei() {
        return false;
    }

    @Override // com.bbva.glomoutils.mobileservices.MobileServices
    public boolean isHuaweiOnly() {
        return false;
    }
}
