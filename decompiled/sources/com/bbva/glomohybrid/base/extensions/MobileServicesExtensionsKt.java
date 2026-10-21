package com.bbva.glomohybrid.base.extensions;

import com.bbva.actionlauncher.model.PlatformType;
import com.bbva.glomoutils.mobileservices.MobileServices;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: MobileServicesExtensions.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"getPlatformType", "Lcom/bbva/actionlauncher/model/PlatformType;", "Lcom/bbva/glomoutils/mobileservices/MobileServices;", "Base_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class MobileServicesExtensionsKt {
    @NotNull
    public static final PlatformType getPlatformType(@NotNull MobileServices mobileServices) {
        Intrinsics.checkNotNullParameter(mobileServices, "<this>");
        return mobileServices.getIsGoogle() ? PlatformType.GMS : PlatformType.HMS;
    }
}
