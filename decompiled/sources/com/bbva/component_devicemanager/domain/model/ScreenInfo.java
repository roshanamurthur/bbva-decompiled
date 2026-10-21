package com.bbva.component_devicemanager.domain.model;

import androidx.appcompat.widget.a;
import androidx.camera.camera2.internal.n1;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: DeviceManagerData.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0005¢\u0006\u0004\b\u001a\u0010\u001bJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0005HÆ\u0003J'\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u0005HÆ\u0001J\t\u0010\u000b\u001a\u00020\u0002HÖ\u0001J\t\u0010\f\u001a\u00020\u0005HÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0011\u001a\u0004\b\u0015\u0010\u0013R\u0017\u0010\t\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001c"}, d2 = {"Lcom/bbva/component_devicemanager/domain/model/ScreenInfo;", "", "", "component1", "component2", "", "component3", "screenOrientationId", "screenDimensionsType", "screenBrightLevelPercentage", "copy", "toString", GenerateActivationFormCommand.HASH_CODE, "other", "", "equals", "a", "Ljava/lang/String;", "getScreenOrientationId", "()Ljava/lang/String;", "b", "getScreenDimensionsType", "c", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getScreenBrightLevelPercentage", "()I", "<init>", "(Ljava/lang/String;Ljava/lang/String;I)V", "component-devicemanager_mexicoGoogleRelease"}, k = 1, mv = {1, 9, 0})
public final /* data */ class ScreenInfo {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String screenOrientationId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String screenDimensionsType;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final int screenBrightLevelPercentage;

    public ScreenInfo(@NotNull String screenOrientationId, @NotNull String screenDimensionsType, int i10) {
        Intrinsics.checkNotNullParameter(screenOrientationId, "screenOrientationId");
        Intrinsics.checkNotNullParameter(screenDimensionsType, "screenDimensionsType");
        this.screenOrientationId = screenOrientationId;
        this.screenDimensionsType = screenDimensionsType;
        this.screenBrightLevelPercentage = i10;
    }

    public static /* synthetic */ ScreenInfo copy$default(ScreenInfo screenInfo, String str, String str2, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = screenInfo.screenOrientationId;
        }
        if ((i11 & 2) != 0) {
            str2 = screenInfo.screenDimensionsType;
        }
        if ((i11 & 4) != 0) {
            i10 = screenInfo.screenBrightLevelPercentage;
        }
        return screenInfo.copy(str, str2, i10);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getScreenOrientationId() {
        return this.screenOrientationId;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getScreenDimensionsType() {
        return this.screenDimensionsType;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getScreenBrightLevelPercentage() {
        return this.screenBrightLevelPercentage;
    }

    @NotNull
    public final ScreenInfo copy(@NotNull String screenOrientationId, @NotNull String screenDimensionsType, int screenBrightLevelPercentage) {
        Intrinsics.checkNotNullParameter(screenOrientationId, "screenOrientationId");
        Intrinsics.checkNotNullParameter(screenDimensionsType, "screenDimensionsType");
        return new ScreenInfo(screenOrientationId, screenDimensionsType, screenBrightLevelPercentage);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ScreenInfo)) {
            return false;
        }
        ScreenInfo screenInfo = (ScreenInfo) other;
        return Intrinsics.areEqual(this.screenOrientationId, screenInfo.screenOrientationId) && Intrinsics.areEqual(this.screenDimensionsType, screenInfo.screenDimensionsType) && this.screenBrightLevelPercentage == screenInfo.screenBrightLevelPercentage;
    }

    public final int getScreenBrightLevelPercentage() {
        return this.screenBrightLevelPercentage;
    }

    @NotNull
    public final String getScreenDimensionsType() {
        return this.screenDimensionsType;
    }

    @NotNull
    public final String getScreenOrientationId() {
        return this.screenOrientationId;
    }

    public int hashCode() {
        return n1.c(this.screenDimensionsType, this.screenOrientationId.hashCode() * 31, 31) + this.screenBrightLevelPercentage;
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("ScreenInfo(screenOrientationId=");
        sb2.append(this.screenOrientationId);
        sb2.append(", screenDimensionsType=");
        sb2.append(this.screenDimensionsType);
        sb2.append(", screenBrightLevelPercentage=");
        return a.c(sb2, this.screenBrightLevelPercentage, ")");
    }
}
