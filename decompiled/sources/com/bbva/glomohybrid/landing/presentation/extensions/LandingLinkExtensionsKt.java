package com.bbva.glomohybrid.landing.presentation.extensions;

import com.bbva.glomohybrid.base.models.DeepLinkModel;
import com.bbva.glomohybrid.landing.presentation.model.LandingLink;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: LandingLinkExtensions.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"toDeepLink", "Lcom/bbva/glomohybrid/base/models/DeepLinkModel;", "Lcom/bbva/glomohybrid/landing/presentation/model/LandingLink;", "Landing_mexicoRelease"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nLandingLinkExtensions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LandingLinkExtensions.kt\ncom/bbva/glomohybrid/landing/presentation/extensions/LandingLinkExtensionsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,9:1\n1#2:10\n*E\n"})
public final class LandingLinkExtensionsKt {
    @Nullable
    public static final DeepLinkModel toDeepLink(@NotNull LandingLink landingLink) {
        Intrinsics.checkNotNullParameter(landingLink, "<this>");
        DeepLinkModel deepLinkModel = new DeepLinkModel(null, landingLink.getRoute(), null, null, 12, null);
        if (landingLink.isInApp() && landingLink.isPrivate()) {
            return deepLinkModel;
        }
        return null;
    }
}
