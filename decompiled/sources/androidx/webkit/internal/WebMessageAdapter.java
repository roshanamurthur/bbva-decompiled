package androidx.webkit.internal;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.webkit.WebMessageCompat;
import androidx.webkit.WebMessagePortCompat;
import java.lang.reflect.InvocationHandler;
import org.chromium.support_lib_boundary.WebMessageBoundaryInterface;

/* JADX INFO: loaded from: classes2.dex */
public class WebMessageAdapter implements WebMessageBoundaryInterface {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WebMessageCompat f24072a;

    public WebMessageAdapter(@NonNull WebMessageCompat webMessageCompat) {
        this.f24072a = webMessageCompat;
    }

    @NonNull
    public static WebMessageCompat webMessageCompatFromBoundaryInterface(@NonNull WebMessageBoundaryInterface webMessageBoundaryInterface) {
        String data = webMessageBoundaryInterface.getData();
        InvocationHandler[] ports = webMessageBoundaryInterface.getPorts();
        WebMessagePortCompat[] webMessagePortCompatArr = new WebMessagePortCompat[ports.length];
        for (int i10 = 0; i10 < ports.length; i10++) {
            webMessagePortCompatArr[i10] = new WebMessagePortImpl(ports[i10]);
        }
        return new WebMessageCompat(data, webMessagePortCompatArr);
    }

    @Override // org.chromium.support_lib_boundary.WebMessageBoundaryInterface
    @Nullable
    public String getData() {
        return this.f24072a.getData();
    }

    @Override // org.chromium.support_lib_boundary.WebMessageBoundaryInterface
    @Nullable
    public InvocationHandler getMessagePayload() {
        throw new UnsupportedOperationException("This method is not yet supported");
    }

    @Override // org.chromium.support_lib_boundary.WebMessageBoundaryInterface
    @Nullable
    public InvocationHandler[] getPorts() {
        WebMessagePortCompat[] ports = this.f24072a.getPorts();
        if (ports == null) {
            return null;
        }
        InvocationHandler[] invocationHandlerArr = new InvocationHandler[ports.length];
        for (int i10 = 0; i10 < ports.length; i10++) {
            invocationHandlerArr[i10] = ports[i10].getInvocationHandler();
        }
        return invocationHandlerArr;
    }

    @Override // org.chromium.support_lib_boundary.FeatureFlagHolderBoundaryInterface
    @NonNull
    public String[] getSupportedFeatures() {
        return new String[0];
    }
}
