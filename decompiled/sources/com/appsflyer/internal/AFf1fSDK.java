package com.appsflyer.internal;

import com.bbva.appsflyer.DeepLinkListenerAdapter;
import java.text.ParseException;
import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u0000 \u00012\u00020\u0004:\u0001\u0001J\u001b\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H'¢\u0006\u0004\b\u0005\u0010\u0006J\u001b\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H'¢\u0006\u0004\b\u0007\u0010\u0006J\u000f\u0010\t\u001a\u00020\bH&¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH&¢\u0006\u0004\b\u000b\u0010\n"}, d2 = {"Lcom/appsflyer/internal/AFf1fSDK;", "AFa1xSDK", "", "", "", DeepLinkListenerAdapter.Constants.STATUS_VALUE_OF, "()Ljava/util/Map;", DeepLinkListenerAdapter.Constants.ERROR_AF_KEYSTORE_WRAPPER, "", "AFInAppEventType", "()V", "values"}, k = 1, mv = {1, 6, 0}, xi = 48)
public interface AFf1fSDK {

    /* JADX INFO: renamed from: AFa1xSDK, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.AFInAppEventParameterName;

    /* JADX INFO: renamed from: com.appsflyer.internal.AFf1fSDK$AFa1xSDK, reason: from kotlin metadata */
    public static final class Companion {
        static final /* synthetic */ Companion AFInAppEventParameterName = new Companion();

        private Companion() {
        }
    }

    void AFInAppEventType();

    @NotNull
    Map<String, Object> AFKeystoreWrapper();

    @NotNull
    Map<String, Object> valueOf() throws ParseException;

    void values();
}
