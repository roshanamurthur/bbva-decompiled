package com.bbva.glomohybrid.landing.presentation.extensions;

import android.content.Context;
import com.bbva.component.ui.message.card.model.Button;
import com.bbva.component.ui.message.card.model.ButtonStyle;
import com.bbva.component.ui.message.card.model.ImageSize;
import com.bbva.component.ui.message.card.model.MessageCardState;
import com.bbva.component.ui.message.card.model.TypeMessage;
import com.bbva.ethermobilesdk.plugin.command.hash.HashCommand;
import com.bbva.glomohybrid.landing.R;
import com.bbva.glomohybrid.landing.domain.aem.model.LandingMessageCardButtonModel;
import com.bbva.glomohybrid.landing.domain.aem.model.LandingMessageCardModel;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: LandingMessageCardModelExtensions.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000\u001a\u0014\u0010\u0003\u001a\u00020\u0004*\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0000¨\u0006\u0007"}, d2 = {HashCommand.ID, "", "Lcom/bbva/glomohybrid/landing/domain/aem/model/LandingMessageCardModel;", "toMessageCardState", "Lcom/bbva/component/ui/message/card/model/MessageCardState;", "context", "Landroid/content/Context;", "Landing_mexicoRelease"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nLandingMessageCardModelExtensions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LandingMessageCardModelExtensions.kt\ncom/bbva/glomohybrid/landing/presentation/extensions/LandingMessageCardModelExtensionsKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,43:1\n1549#2:44\n1620#2,3:45\n*S KotlinDebug\n*F\n+ 1 LandingMessageCardModelExtensions.kt\ncom/bbva/glomohybrid/landing/presentation/extensions/LandingMessageCardModelExtensionsKt\n*L\n28#1:44\n28#1:45,3\n*E\n"})
public final class LandingMessageCardModelExtensionsKt {
    @NotNull
    public static final String hash(@NotNull LandingMessageCardModel landingMessageCardModel) {
        Intrinsics.checkNotNullParameter(landingMessageCardModel, "<this>");
        return String.valueOf((landingMessageCardModel.getHeader() + landingMessageCardModel.getTitle() + landingMessageCardModel.getDescription()).hashCode());
    }

    @NotNull
    public static final MessageCardState toMessageCardState(@NotNull LandingMessageCardModel landingMessageCardModel, @NotNull Context context) {
        List listEmptyList;
        Intrinsics.checkNotNullParameter(landingMessageCardModel, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        String id = landingMessageCardModel.getId();
        TypeMessage typeMessageValueOf = TypeMessage.valueOf(landingMessageCardModel.getType());
        String url = landingMessageCardModel.getIllustration().getUrl();
        ImageSize imageSizeValueOf = ImageSize.valueOf(landingMessageCardModel.getIllustration().getType());
        String header = landingMessageCardModel.getHeader();
        String title = landingMessageCardModel.getTitle();
        String description = landingMessageCardModel.getDescription();
        LandingMessageCardButtonModel link = landingMessageCardModel.getLink();
        Button button = link != null ? new Button(link.getAction(), link.getText(), ButtonStyle.valueOf(link.getStyle())) : null;
        List<LandingMessageCardButtonModel> buttons = landingMessageCardModel.getButtons();
        if (buttons != null) {
            List<LandingMessageCardButtonModel> list = buttons;
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
            for (LandingMessageCardButtonModel landingMessageCardButtonModel : list) {
                arrayList.add(new Button(landingMessageCardButtonModel.getAction(), landingMessageCardButtonModel.getText(), ButtonStyle.valueOf(landingMessageCardButtonModel.getStyle())));
            }
            listEmptyList = arrayList;
        } else {
            listEmptyList = CollectionsKt__CollectionsKt.emptyList();
        }
        return new MessageCardState(id, typeMessageValueOf, url, imageSizeValueOf, header, title, description, button, listEmptyList, context.getResources().getString(R.string.label_close_message));
    }
}
