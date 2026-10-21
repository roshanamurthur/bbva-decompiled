package androidx.webkit.internal;

import androidx.annotation.NonNull;
import androidx.webkit.WebMessagePortCompat;
import java.lang.reflect.InvocationHandler;
import org.chromium.support_lib_boundary.WebMessageBoundaryInterface;
import org.chromium.support_lib_boundary.WebMessageCallbackBoundaryInterface;
import org.chromium.support_lib_boundary.util.BoundaryInterfaceReflectionUtil;

/* JADX INFO: loaded from: classes2.dex */
public class WebMessageCallbackAdapter implements WebMessageCallbackBoundaryInterface {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WebMessagePortCompat.WebMessageCallbackCompat f24073a;

    public WebMessageCallbackAdapter(@NonNull WebMessagePortCompat.WebMessageCallbackCompat webMessageCallbackCompat) {
        this.f24073a = webMessageCallbackCompat;
    }

    @Override // org.chromium.support_lib_boundary.FeatureFlagHolderBoundaryInterface
    @NonNull
    public String[] getSupportedFeatures() {
        return new String[]{"WEB_MESSAGE_CALLBACK_ON_MESSAGE"};
    }

    @Override // org.chromium.support_lib_boundary.WebMessageCallbackBoundaryInterface
    public void onMessage(@NonNull InvocationHandler invocationHandler, @NonNull InvocationHandler invocationHandler2) {
        this.f24073a.onMessage(new WebMessagePortImpl(invocationHandler), WebMessageAdapter.webMessageCompatFromBoundaryInterface((WebMessageBoundaryInterface) BoundaryInterfaceReflectionUtil.castToSuppLibClass(WebMessageBoundaryInterface.class, invocationHandler2)));
    }
}
