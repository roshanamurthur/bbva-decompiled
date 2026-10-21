package com.bbva.component.ui.message.card;

import com.bbva.cells.componentkit.ActionSpec;
import com.bbva.cells.componentkit.JsonDeserializer;
import com.bbva.cells.componentkit.ViewModel;
import com.bbva.component.ui.message.card.model.MessageCardState;
import com.bbva.ethermobilesdk.tokencompat.storage.local.UUIDPreferences;
import com.bbva.glomohybrid.cellsweb.presentation.verishow.constants.HearingDisabilitiesConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: MessageCardViewModel.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 \u00162\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u0016\u0017\u0018B\u0007¢\u0006\u0004\b\u0015\u0010\nJ\u0017\u0010\b\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\u000b\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\r\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\f\u0010\nR\u001d\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0019"}, d2 = {"Lcom/bbva/component/ui/message/card/MessageCardViewModel;", "Lcom/bbva/cells/componentkit/ViewModel;", "Lcom/bbva/component/ui/message/card/model/MessageCardState;", "", "id", "", "onMessageCardButtonClick$component_ui_message_card_release", "(Ljava/lang/String;)V", "onMessageCardButtonClick", "onMessageCloseButtonClick$component_ui_message_card_release", "()V", "onMessageCloseButtonClick", "onMessageFullyLoaded$component_ui_message_card_release", "onMessageFullyLoaded", "Lkotlinx/coroutines/flow/Flow;", "Lcom/bbva/component/ui/message/card/MessageCardViewModel$Event;", "w0", "Lkotlinx/coroutines/flow/Flow;", "getOnEvents", "()Lkotlinx/coroutines/flow/Flow;", "onEvents", "<init>", "Companion", "Event", UUIDPreferences.TYPE_KEY, "component-ui-message-card_release"}, k = 1, mv = {1, 8, 0})
public final class MessageCardViewModel extends ViewModel<MessageCardState> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    @NotNull
    public static final ActionSpec<Event> f28629x0 = new ActionSpec<>("message-card-event");

    /* JADX INFO: renamed from: w0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Flow<Event> onEvents;

    /* JADX INFO: compiled from: MessageCardViewModel.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/bbva/component/ui/message/card/MessageCardViewModel$Companion;", "", "()V", "onItemTapped", "Lcom/bbva/cells/componentkit/ActionSpec;", "Lcom/bbva/component/ui/message/card/MessageCardViewModel$Event;", "getOnItemTapped", "()Lcom/bbva/cells/componentkit/ActionSpec;", "component-ui-message-card_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final ActionSpec<Event> getOnItemTapped() {
            return MessageCardViewModel.f28629x0;
        }
    }

    /* JADX INFO: compiled from: MessageCardViewModel.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001B!\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\r\u001a\u00020\b\u0012\u0006\u0010\u0010\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\r\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0010\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0004\u001a\u0004\b\u000f\u0010\u0006¨\u0006\u0013"}, d2 = {"Lcom/bbva/component/ui/message/card/MessageCardViewModel$Event;", "", "", "a", "Ljava/lang/String;", "getViewId", "()Ljava/lang/String;", "viewId", "Lcom/bbva/component/ui/message/card/MessageCardViewModel$Type;", "b", "Lcom/bbva/component/ui/message/card/MessageCardViewModel$Type;", "getType", "()Lcom/bbva/component/ui/message/card/MessageCardViewModel$Type;", "type", "c", "getButtonId", "buttonId", "<init>", "(Ljava/lang/String;Lcom/bbva/component/ui/message/card/MessageCardViewModel$Type;Ljava/lang/String;)V", "component-ui-message-card_release"}, k = 1, mv = {1, 8, 0})
    public static final class Event {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public final String viewId;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final Type type;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final String buttonId;

        public Event(@Nullable String str, @NotNull Type type, @NotNull String buttonId) {
            Intrinsics.checkNotNullParameter(type, "type");
            Intrinsics.checkNotNullParameter(buttonId, "buttonId");
            this.viewId = str;
            this.type = type;
            this.buttonId = buttonId;
        }

        @NotNull
        public final String getButtonId() {
            return this.buttonId;
        }

        @NotNull
        public final Type getType() {
            return this.type;
        }

        @Nullable
        public final String getViewId() {
            return this.viewId;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: MessageCardViewModel.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/bbva/component/ui/message/card/MessageCardViewModel$Type;", "", "ON_BUTTON_CLICK", "ON_CLOSE_BUTTON_CLICK", "ON_MESSAGE_FULLY_LOADED", "component-ui-message-card_release"}, k = 1, mv = {1, 8, 0})
    public static final class Type {
        private static final /* synthetic */ Type[] $VALUES;
        public static final Type ON_BUTTON_CLICK;
        public static final Type ON_CLOSE_BUTTON_CLICK;
        public static final Type ON_MESSAGE_FULLY_LOADED;

        static {
            Type type = new Type("ON_BUTTON_CLICK", 0);
            ON_BUTTON_CLICK = type;
            Type type2 = new Type("ON_CLOSE_BUTTON_CLICK", 1);
            ON_CLOSE_BUTTON_CLICK = type2;
            Type type3 = new Type("ON_MESSAGE_FULLY_LOADED", 2);
            ON_MESSAGE_FULLY_LOADED = type3;
            $VALUES = new Type[]{type, type2, type3};
        }

        public Type() {
            throw null;
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) $VALUES.clone();
        }
    }

    public MessageCardViewModel() {
        super(new JsonDeserializer(MessageCardState.INSTANCE.serializer()));
        this.onEvents = events(f28629x0);
    }

    @NotNull
    public final Flow<Event> getOnEvents() {
        return this.onEvents;
    }

    public final void onMessageCardButtonClick$component_ui_message_card_release(@NotNull String id) {
        Intrinsics.checkNotNullParameter(id, "id");
        MessageCardState model = getModel();
        fire(f28629x0, new Event(model != null ? model.getId() : null, Type.ON_BUTTON_CLICK, id));
    }

    public final void onMessageCloseButtonClick$component_ui_message_card_release() {
        MessageCardState model = getModel();
        fire(f28629x0, new Event(model != null ? model.getId() : null, Type.ON_CLOSE_BUTTON_CLICK, HearingDisabilitiesConstants.CLOSE_MODAL));
    }

    public final void onMessageFullyLoaded$component_ui_message_card_release() {
        MessageCardState model = getModel();
        fire(f28629x0, new Event(model != null ? model.getId() : null, Type.ON_MESSAGE_FULLY_LOADED, ""));
    }
}
