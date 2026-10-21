package t9;

import android.view.MotionEvent;
import android.view.View;
import com.bbva.glomohybrid.login.presentation.view.LoginActivity;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: LoginActivity.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class e extends Lambda implements Function2<View, MotionEvent, Boolean> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ LoginActivity f93481p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(LoginActivity loginActivity) {
        super(2);
        this.f93481p0 = loginActivity;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Boolean invoke(View view, MotionEvent motionEvent) {
        MotionEvent event = motionEvent;
        Intrinsics.checkNotNullParameter(view, "<anonymous parameter 0>");
        Intrinsics.checkNotNullParameter(event, "event");
        int actionMasked = event.getActionMasked();
        boolean z10 = true;
        if (actionMasked == 0 || actionMasked == 1) {
            this.f93481p0.hideKeyboard$Login_mexicoGoogleRelease();
        } else {
            z10 = false;
        }
        return Boolean.valueOf(z10);
    }
}
