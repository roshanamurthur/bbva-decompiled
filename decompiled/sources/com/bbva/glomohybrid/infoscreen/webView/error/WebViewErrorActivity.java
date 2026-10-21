package com.bbva.glomohybrid.infoscreen.webView.error;

import com.bbva.glomohybrid.base.cells.CellsReactor;
import com.bbva.glomohybrid.base.extensions.ContextExtensionKt;
import com.bbva.glomohybrid.base.router.Route;
import com.bbva.glomohybrid.base.router.Router;
import com.bbva.glomohybrid.infoscreen.InfoScreenActivity;
import com.bbva.glomohybrid.splash.presentation.view.SplashActivity;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: WebViewErrorActivity.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u0000 \n2\u00020\u0001:\u0001\nB\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u0003\u001a\u00020\u0002H\u0014R\u0014\u0010\u0007\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000b"}, d2 = {"Lcom/bbva/glomohybrid/infoscreen/webView/error/WebViewErrorActivity;", "Lcom/bbva/glomohybrid/infoscreen/InfoScreenActivity;", "", "onStart", "", "getId", "()Ljava/lang/String;", "id", "<init>", "()V", "Companion", "info-modal_mexicoRelease"}, k = 1, mv = {1, 9, 0})
public final class WebViewErrorActivity extends InfoScreenActivity {

    @NotNull
    public static final String ID = "webview-error";

    @NotNull
    public static final String WEB_VIEW_PACKAGE_NAME = "com.google.android.webview";

    @Override // com.bbva.glomohybrid.infoscreen.InfoScreenActivity
    @NotNull
    public String getId() {
        return "webview-error";
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
        if (ContextExtensionKt.isAndroidWebViewAvailable(this)) {
            finish();
            CellsReactor.fire("webview-error", Router.INSTANCE.getACTION_NAVIGATE(), new Route(SplashActivity.ID, null, null, 6, null));
        }
    }
}
