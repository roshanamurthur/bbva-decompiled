package u5;

import android.view.KeyEvent;
import android.view.View;
import com.bbva.component.ui.message.link.MessageLinkView;
import com.bbva.glomohybrid.welcome.presentation.view.WelcomeActivityPager;
import kotlin.jvm.internal.Intrinsics;
import mx.openpay.library.ui.signature.DigitalSignatureComponentActivity;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class a implements View.OnClickListener {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ int f93726p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ KeyEvent.Callback f93727q0;

    public /* synthetic */ a(KeyEvent.Callback callback, int i10) {
        this.f93726p0 = i10;
        this.f93727q0 = callback;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i10 = this.f93726p0;
        KeyEvent.Callback callback = this.f93727q0;
        switch (i10) {
            case 0:
                MessageLinkView this$0 = (MessageLinkView) callback;
                int i11 = MessageLinkView.f28654s0;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.f28656q0.onMessageLinkButtonClick$component_ui_message_link_release();
                break;
            case 1:
                WelcomeActivityPager this$1 = (WelcomeActivityPager) callback;
                WelcomeActivityPager.Companion companion = WelcomeActivityPager.INSTANCE;
                Intrinsics.checkNotNullParameter(this$1, "this$0");
                this$1.j().onEnterButtonClick();
                break;
            default:
                DigitalSignatureComponentActivity.c((DigitalSignatureComponentActivity) callback, view);
                break;
        }
    }
}
