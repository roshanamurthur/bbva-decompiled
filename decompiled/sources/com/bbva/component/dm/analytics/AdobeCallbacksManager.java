package com.bbva.component.dm.analytics;

import com.adobe.marketing.mobile.Identity;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: AdobeCallbacksManager.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001c\u0010\u0003\u001a\u00020\u00042\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00040\u0006¨\u0006\b"}, d2 = {"Lcom/bbva/component/dm/analytics/AdobeCallbacksManager;", "", "()V", "getExperienceCloudId", "", "callback", "Lkotlin/Function1;", "", "component-dm-analytics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class AdobeCallbacksManager {

    @NotNull
    public static final AdobeCallbacksManager INSTANCE = new AdobeCallbacksManager();

    /* JADX INFO: compiled from: AdobeCallbacksManager.kt */
    public static final class a extends Lambda implements Function1<String, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final a f27404p0 = new a(1);

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(String str) {
            String it = str;
            Intrinsics.checkNotNullParameter(it, "it");
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void getExperienceCloudId$default(AdobeCallbacksManager adobeCallbacksManager, Function1 function1, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            function1 = a.f27404p0;
        }
        adobeCallbacksManager.getExperienceCloudId(function1);
    }

    public final void getExperienceCloudId(@NotNull Function1<? super String, Unit> callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        Identity.getExperienceCloudId(new gb.a(callback));
    }
}
