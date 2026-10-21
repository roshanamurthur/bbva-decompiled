package com.appsflyer.internal;

import android.app.Activity;
import android.content.Context;
import com.bbva.appsflyer.DeepLinkListenerAdapter;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\bf\u0018\u0000 \u00012\u00020\u000f:\u0002\u0001\u000eJ\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\f\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\f\u0010\r"}, d2 = {"Lcom/appsflyer/internal/AFb1iSDK;", "AFa1zSDK", "", DeepLinkListenerAdapter.Constants.ERROR_AF_KEYSTORE_WRAPPER, "()Z", "Landroid/content/Context;", "p0", "Lcom/appsflyer/internal/AFb1iSDK$AFa1wSDK;", "p1", "", "AFInAppEventParameterName", "(Landroid/content/Context;Lcom/appsflyer/internal/AFb1iSDK$AFa1wSDK;)V", DeepLinkListenerAdapter.Constants.STATUS_VALUE_OF, "(Landroid/content/Context;)V", "AFa1wSDK", ""}, k = 1, mv = {1, 6, 0}, xi = 48)
public interface AFb1iSDK {

    /* JADX INFO: renamed from: AFa1zSDK, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.values;

    public interface AFa1wSDK {
        void AFKeystoreWrapper(@NotNull Context context);

        void values(@NotNull Activity activity);
    }

    /* JADX INFO: renamed from: com.appsflyer.internal.AFb1iSDK$AFa1zSDK, reason: from kotlin metadata */
    public static final class Companion {
        static final /* synthetic */ Companion values = new Companion();
        private static long AFKeystoreWrapper = 500;

        private Companion() {
        }

        public static long valueOf() {
            return AFKeystoreWrapper;
        }
    }

    void AFInAppEventParameterName(@NotNull Context p4, @NotNull AFa1wSDK p10);

    boolean AFKeystoreWrapper();

    void valueOf(@NotNull Context p4);
}
