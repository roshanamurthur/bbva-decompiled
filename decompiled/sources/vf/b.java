package vf;

import android.os.Bundle;
import androidx.annotation.Nullable;
import com.google.firebase.analytics.connector.AnalyticsConnector;
import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.crashlytics.internal.analytics.AnalyticsEventReceiver;
import java.util.Locale;

/* JADX INFO: compiled from: CrashlyticsAnalyticsListener.java */
/* JADX INFO: loaded from: classes10.dex */
public final class b implements AnalyticsConnector.AnalyticsConnectorListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public AnalyticsEventReceiver f94047a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public AnalyticsEventReceiver f94048b;

    @Override // com.google.firebase.analytics.connector.AnalyticsConnector.AnalyticsConnectorListener
    public final void onMessageTriggered(int i10, @Nullable Bundle bundle) {
        String string;
        Logger.getLogger().v(String.format(Locale.US, "Analytics listener received message. ID: %d, Extras: %s", Integer.valueOf(i10), bundle));
        if (bundle == null || (string = bundle.getString("name")) == null) {
            return;
        }
        Bundle bundle2 = bundle.getBundle("params");
        if (bundle2 == null) {
            bundle2 = new Bundle();
        }
        AnalyticsEventReceiver analyticsEventReceiver = "clx".equals(bundle2.getString("_o")) ? this.f94047a : this.f94048b;
        if (analyticsEventReceiver == null) {
            return;
        }
        analyticsEventReceiver.onEvent(string, bundle2);
    }
}
