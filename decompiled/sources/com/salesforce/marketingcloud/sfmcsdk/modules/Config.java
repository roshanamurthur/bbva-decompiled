package com.salesforce.marketingcloud.sfmcsdk.modules;

import android.content.Context;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.salesforce.marketingcloud.sfmcsdk.SFMCSdkComponents;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Config.kt */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J \u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H&J\b\u0010\u001a\u001a\u00020\u001bH\u0016R\u001a\u0010\u0002\u001a\u00020\u00038VX\u0096\u0004¢\u0006\f\u0012\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u0012\u0010\b\u001a\u00020\tX¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0012\u0010\f\u001a\u00020\rX¦\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0012\u0010\u0010\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0007ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u001cÀ\u0006\u0001"}, d2 = {"Lcom/salesforce/marketingcloud/sfmcsdk/modules/Config;", "", "MAX_SUPPORTED_VERSION", "", "getMAX_SUPPORTED_VERSION$annotations", "()V", "getMAX_SUPPORTED_VERSION", "()I", "moduleApplicationId", "", "getModuleApplicationId", "()Ljava/lang/String;", "moduleIdentifier", "Lcom/salesforce/marketingcloud/sfmcsdk/modules/ModuleIdentifier;", "getModuleIdentifier", "()Lcom/salesforce/marketingcloud/sfmcsdk/modules/ModuleIdentifier;", "version", "getVersion", "init", "", "context", "Landroid/content/Context;", "components", "Lcom/salesforce/marketingcloud/sfmcsdk/SFMCSdkComponents;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/salesforce/marketingcloud/sfmcsdk/modules/ModuleReadyListener;", "isModuleCompatible", "", "sfmcsdk_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public interface Config {
    int getMAX_SUPPORTED_VERSION();

    @NotNull
    String getModuleApplicationId();

    @NotNull
    ModuleIdentifier getModuleIdentifier();

    int getVersion();

    void init(@NotNull Context context, @NotNull SFMCSdkComponents components, @NotNull ModuleReadyListener listener);

    boolean isModuleCompatible();
}
