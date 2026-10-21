package p5;

import com.bbva.component.ui.login.credentials.LoginCredentialsView;
import com.bbva.component.ui.login.model.DocumentSelector;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: LoginCredentialsView.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class e extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ LoginCredentialsView f92567p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ DocumentSelector f92568q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(LoginCredentialsView loginCredentialsView, DocumentSelector documentSelector) {
        super(0);
        this.f92567p0 = loginCredentialsView;
        this.f92568q0 = documentSelector;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        this.f92567p0.getViewModel().onDocumentSelectorTapped(this.f92568q0);
        return Unit.INSTANCE;
    }
}
