package com.salesforce.marketingcloud.events;

import com.salesforce.marketingcloud.MarketingCloudSdk;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class i {
    @NotNull
    public static com.salesforce.marketingcloud.sfmcsdk.components.events.Event.Producer a(Event event) {
        return com.salesforce.marketingcloud.sfmcsdk.components.events.Event.Producer.PUSH;
    }

    public static void b(Event event) {
        MarketingCloudSdk.requestSdk(new z0.d(event));
    }

    public static void c(Event this$0, MarketingCloudSdk it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        it.getEventManager().track(this$0);
    }
}
