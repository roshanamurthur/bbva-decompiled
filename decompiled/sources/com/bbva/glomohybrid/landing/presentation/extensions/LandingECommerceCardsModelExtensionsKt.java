package com.bbva.glomohybrid.landing.presentation.extensions;

import android.content.Context;
import com.bbva.component.ui.carousel.cards.CarouselCardsContract;
import com.bbva.component.ui.carousel.cards.model.CarouselCardItem;
import com.bbva.glomohybrid.landing.R;
import com.bbva.glomohybrid.landing.domain.sections.model.LandingECommerceCardModel;
import com.bbva.glomohybrid.landing.domain.sections.model.LandingECommerceCardsModel;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: LandingECommerceCardsModelExtensions.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0000¨\u0006\u0005"}, d2 = {"toCarouselState", "Lcom/bbva/component/ui/carousel/cards/CarouselCardsContract$State;", "Lcom/bbva/glomohybrid/landing/domain/sections/model/LandingECommerceCardsModel;", "context", "Landroid/content/Context;", "Landing_mexicoRelease"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nLandingECommerceCardsModelExtensions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LandingECommerceCardsModelExtensions.kt\ncom/bbva/glomohybrid/landing/presentation/extensions/LandingECommerceCardsModelExtensionsKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,32:1\n1559#2:33\n1590#2,4:34\n*S KotlinDebug\n*F\n+ 1 LandingECommerceCardsModelExtensions.kt\ncom/bbva/glomohybrid/landing/presentation/extensions/LandingECommerceCardsModelExtensionsKt\n*L\n17#1:33\n17#1:34,4\n*E\n"})
public final class LandingECommerceCardsModelExtensionsKt {
    @NotNull
    public static final CarouselCardsContract.State toCarouselState(@NotNull LandingECommerceCardsModel landingECommerceCardsModel, @NotNull Context context) {
        Intrinsics.checkNotNullParameter(landingECommerceCardsModel, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        String string = context.getString(R.string.label_ecommerce_cards_header);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        CarouselCardsContract.State.Header header = new CarouselCardsContract.State.Header(string, context.getString(R.string.label_ecommerce_cards_header_link));
        List<LandingECommerceCardModel> items = landingECommerceCardsModel.getItems();
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(items, 10));
        int i10 = 0;
        for (Object obj : items) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            LandingECommerceCardModel landingECommerceCardModel = (LandingECommerceCardModel) obj;
            arrayList.add(new CarouselCardItem(landingECommerceCardModel.getId(), landingECommerceCardModel.getPan(), landingECommerceCardModel.getImage(), context.getString(R.string.label_ecommerce_cards_link), LandingECommerceCardModelExtensionsKt.accessibilityLabelForItem(landingECommerceCardModel, context, i10, landingECommerceCardsModel.getItems().size())));
            i10 = i11;
        }
        return new CarouselCardsContract.State(header, arrayList);
    }
}
