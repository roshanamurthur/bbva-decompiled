package com.bbva.glomohybrid.dynamicmodules;

import android.content.Context;
import com.adobe.marketing.mobile.EventDataKeys;
import com.bbva.glomohybrid.DynamicModulesBase;
import com.google.android.play.core.splitcompat.SplitCompat;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: DynamicModules.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, d2 = {"Lcom/bbva/glomohybrid/dynamicmodules/DynamicModules;", "Lcom/bbva/glomohybrid/DynamicModulesBase;", "()V", EventDataKeys.Acquisition.ACQUISITION_TYPE_INSTALL, "", "context", "Landroid/content/Context;", "app_mexicoProdGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class DynamicModules implements DynamicModulesBase {
    @Override // com.bbva.glomohybrid.DynamicModulesBase
    public void install(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        SplitCompat.install(context);
    }
}
