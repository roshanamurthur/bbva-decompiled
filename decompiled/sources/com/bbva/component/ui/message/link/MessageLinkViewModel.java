package com.bbva.component.ui.message.link;

import com.bbva.cells.componentkit.ActionSpec;
import com.bbva.cells.componentkit.JsonDeserializer;
import com.bbva.cells.componentkit.ViewModel;
import com.bbva.component.ui.message.link.model.MessageLinkState;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: MessageLinkViewModel.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 \u000f2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u000f\u0010B\u0007¢\u0006\u0004\b\u000e\u0010\u0005J\u000f\u0010\u0006\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0004\u0010\u0005R\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u0011"}, d2 = {"Lcom/bbva/component/ui/message/link/MessageLinkViewModel;", "Lcom/bbva/cells/componentkit/ViewModel;", "Lcom/bbva/component/ui/message/link/model/MessageLinkState;", "", "onMessageLinkButtonClick$component_ui_message_link_release", "()V", "onMessageLinkButtonClick", "Lkotlinx/coroutines/flow/Flow;", "Lcom/bbva/component/ui/message/link/MessageLinkViewModel$Event;", "w0", "Lkotlinx/coroutines/flow/Flow;", "getOnEvents", "()Lkotlinx/coroutines/flow/Flow;", "onEvents", "<init>", "Companion", "Event", "component-ui-message-link_release"}, k = 1, mv = {1, 8, 0})
public final class MessageLinkViewModel extends ViewModel<MessageLinkState> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    @NotNull
    public static final ActionSpec<Event> f28658x0 = new ActionSpec<>("message-link-event");

    /* JADX INFO: renamed from: w0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Flow<Event> onEvents;

    /* JADX INFO: compiled from: MessageLinkViewModel.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/bbva/component/ui/message/link/MessageLinkViewModel$Companion;", "", "()V", "onItemTapped", "Lcom/bbva/cells/componentkit/ActionSpec;", "Lcom/bbva/component/ui/message/link/MessageLinkViewModel$Event;", "getOnItemTapped", "()Lcom/bbva/cells/componentkit/ActionSpec;", "component-ui-message-link_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final ActionSpec<Event> getOnItemTapped() {
            return MessageLinkViewModel.f28658x0;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: MessageLinkViewModel.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002¨\u0006\u0003"}, d2 = {"Lcom/bbva/component/ui/message/link/MessageLinkViewModel$Event;", "", "ON_LINK_BUTTON_CLICK", "component-ui-message-link_release"}, k = 1, mv = {1, 8, 0})
    public static final class Event {
        private static final /* synthetic */ Event[] $VALUES;
        public static final Event ON_LINK_BUTTON_CLICK;

        static {
            Event event = new Event("ON_LINK_BUTTON_CLICK", 0);
            ON_LINK_BUTTON_CLICK = event;
            $VALUES = new Event[]{event};
        }

        public Event() {
            throw null;
        }

        public static Event valueOf(String str) {
            return (Event) Enum.valueOf(Event.class, str);
        }

        public static Event[] values() {
            return (Event[]) $VALUES.clone();
        }
    }

    public MessageLinkViewModel() {
        super(new JsonDeserializer(MessageLinkState.INSTANCE.serializer()));
        this.onEvents = events(f28658x0);
    }

    @NotNull
    public final Flow<Event> getOnEvents() {
        return this.onEvents;
    }

    public final void onMessageLinkButtonClick$component_ui_message_link_release() {
        fire(f28658x0, Event.ON_LINK_BUTTON_CLICK);
    }
}
