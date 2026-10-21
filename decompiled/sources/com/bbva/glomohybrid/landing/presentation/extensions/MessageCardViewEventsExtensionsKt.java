package com.bbva.glomohybrid.landing.presentation.extensions;

import com.bbva.component.ui.message.card.MessageCardViewModel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: MessageCardViewEventsExtensions.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"isInteractionEvent", "", "Lcom/bbva/component/ui/message/card/MessageCardViewModel$Event;", "Landing_mexicoRelease"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class MessageCardViewEventsExtensionsKt {
    public static final boolean isInteractionEvent(@NotNull MessageCardViewModel.Event event) {
        Intrinsics.checkNotNullParameter(event, "<this>");
        return event.getType() == MessageCardViewModel.Type.ON_BUTTON_CLICK || event.getType() == MessageCardViewModel.Type.ON_CLOSE_BUTTON_CLICK;
    }
}
