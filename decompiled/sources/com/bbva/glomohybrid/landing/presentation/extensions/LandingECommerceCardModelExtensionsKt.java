package com.bbva.glomohybrid.landing.presentation.extensions;

import android.content.Context;
import bk.p;
import com.bbva.glomoconfig.constants.RouteConstants;
import com.bbva.glomoconfig.landing.Landing;
import com.bbva.glomohybrid.base.models.DeepLinkModel;
import com.bbva.glomohybrid.landing.R;
import com.bbva.glomohybrid.landing.domain.sections.model.LandingECommerceCardModel;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt___StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: LandingECommerceCardModelExtensions.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a$\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0000\u001a\u0010\u0010\b\u001a\u0004\u0018\u00010\t*\u0004\u0018\u00010\u0002H\u0000¨\u0006\n"}, d2 = {"accessibilityLabelForItem", "", "Lcom/bbva/glomohybrid/landing/domain/sections/model/LandingECommerceCardModel;", "context", "Landroid/content/Context;", "position", "", "itemsCount", "toDeepLink", "Lcom/bbva/glomohybrid/base/models/DeepLinkModel;", "Landing_mexicoRelease"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class LandingECommerceCardModelExtensionsKt {
    @NotNull
    public static final String accessibilityLabelForItem(@NotNull LandingECommerceCardModel landingECommerceCardModel, @NotNull Context context, int i10, int i11) {
        Intrinsics.checkNotNullParameter(landingECommerceCardModel, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        if (i11 == 1) {
            String string = context.getString(R.string.label_ecommerce_cards_item_single_accessibility, StringsKt___StringsKt.takeLast(landingECommerceCardModel.getPan(), 2));
            Intrinsics.checkNotNull(string);
            return string;
        }
        String string2 = context.getString(R.string.label_ecommerce_cards_item_accessibility, Integer.valueOf(i10 + 1), Integer.valueOf(i11), StringsKt___StringsKt.takeLast(landingECommerceCardModel.getPan(), 2));
        Intrinsics.checkNotNull(string2);
        return string2;
    }

    @Nullable
    public static final DeepLinkModel toDeepLink(@Nullable LandingECommerceCardModel landingECommerceCardModel) {
        if (landingECommerceCardModel == null) {
            return null;
        }
        return new DeepLinkModel(null, RouteConstants.CARD_CVV, null, p.mapOf(TuplesKt.to(Landing.ECommerce.INSTANCE.getLABEL_PARAMS_ID(), landingECommerceCardModel.getId())), 4, null);
    }
}
