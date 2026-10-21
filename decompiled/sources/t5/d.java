package t5;

import com.bbva.component.ui.message.card.MessageCardView;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: MessageCardView.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class d extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ MessageCardView f93458p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(MessageCardView messageCardView) {
        super(0);
        this.f93458p0 = messageCardView;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        this.f93458p0.getViewModel().onMessageFullyLoaded$component_ui_message_card_release();
        return Unit.INSTANCE;
    }
}
