package com.bbva.ethermobilesdk.devicemanager.model.output;

import androidx.annotation.Keep;
import androidx.appcompat.app.i;
import androidx.camera.core.impl.a;
import com.bbva.ethermobile.help.kit.result.Result;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: DeviceCheckerResponse.kt */
/* JADX INFO: loaded from: classes5.dex */
@Keep
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B¯\u0001\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00124\u0010\u0007\u001a0\u0012,\u0012*\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\bj\u0014\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003`\n0\u0003\u00128\u0010\u000b\u001a4\u00120\u0012.\u0012\u0004\u0012\u00020\t\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u00030\bj\u0016\u0012\u0004\u0012\u00020\t\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u0003`\n0\u0003\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J7\u0010\u0013\u001a0\u0012,\u0012*\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\bj\u0014\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003`\n0\u0003HÆ\u0003J;\u0010\u0014\u001a4\u00120\u0012.\u0012\u0004\u0012\u00020\t\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u00030\bj\u0016\u0012\u0004\u0012\u00020\t\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u0003`\n0\u0003HÆ\u0003J\u000f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J½\u0001\u0010\u0016\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u000326\b\u0002\u0010\u0007\u001a0\u0012,\u0012*\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\bj\u0014\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003`\n0\u00032:\b\u0002\u0010\u000b\u001a4\u00120\u0012.\u0012\u0004\u0012\u00020\t\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u00030\bj\u0016\u0012\u0004\u0012\u00020\t\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u0003`\n0\u00032\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00042\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\tHÖ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u000fR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u000fR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u000fR?\u0010\u0007\u001a0\u0012,\u0012*\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\bj\u0014\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003`\n0\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u000fRC\u0010\u000b\u001a4\u00120\u0012.\u0012\u0004\u0012\u00020\t\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u00030\bj\u0016\u0012\u0004\u0012\u00020\t\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u0003`\n0\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u000fR\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000f¨\u0006\u001c"}, d2 = {"Lcom/bbva/ethermobilesdk/devicemanager/model/output/DeviceCheckerResponse;", "", "isDebuggable", "Lcom/bbva/ethermobile/help/kit/result/Result;", "", "isDeveloperModeEnabled", "isEmulator", "isFridaCompleteDetected", "Ljava/util/HashMap;", "", "Lkotlin/collections/HashMap;", "isMagiskCompleteDetected", "isRoot", "<init>", "(Lcom/bbva/ethermobile/help/kit/result/Result;Lcom/bbva/ethermobile/help/kit/result/Result;Lcom/bbva/ethermobile/help/kit/result/Result;Lcom/bbva/ethermobile/help/kit/result/Result;Lcom/bbva/ethermobile/help/kit/result/Result;Lcom/bbva/ethermobile/help/kit/result/Result;)V", "()Lcom/bbva/ethermobile/help/kit/result/Result;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", GenerateActivationFormCommand.HASH_CODE, "toString", "", "devicemanager_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class DeviceCheckerResponse {

    @NotNull
    private final Result<Boolean> isDebuggable;

    @NotNull
    private final Result<Boolean> isDeveloperModeEnabled;

    @NotNull
    private final Result<Boolean> isEmulator;

    @NotNull
    private final Result<HashMap<Integer, Result<Boolean>>> isFridaCompleteDetected;

    @NotNull
    private final Result<HashMap<Integer, Result<? extends Object>>> isMagiskCompleteDetected;

    @NotNull
    private final Result<Boolean> isRoot;

    public DeviceCheckerResponse(@NotNull Result<Boolean> isDebuggable, @NotNull Result<Boolean> isDeveloperModeEnabled, @NotNull Result<Boolean> isEmulator, @NotNull Result<HashMap<Integer, Result<Boolean>>> isFridaCompleteDetected, @NotNull Result<HashMap<Integer, Result<? extends Object>>> isMagiskCompleteDetected, @NotNull Result<Boolean> isRoot) {
        Intrinsics.checkNotNullParameter(isDebuggable, "isDebuggable");
        Intrinsics.checkNotNullParameter(isDeveloperModeEnabled, "isDeveloperModeEnabled");
        Intrinsics.checkNotNullParameter(isEmulator, "isEmulator");
        Intrinsics.checkNotNullParameter(isFridaCompleteDetected, "isFridaCompleteDetected");
        Intrinsics.checkNotNullParameter(isMagiskCompleteDetected, "isMagiskCompleteDetected");
        Intrinsics.checkNotNullParameter(isRoot, "isRoot");
        this.isDebuggable = isDebuggable;
        this.isDeveloperModeEnabled = isDeveloperModeEnabled;
        this.isEmulator = isEmulator;
        this.isFridaCompleteDetected = isFridaCompleteDetected;
        this.isMagiskCompleteDetected = isMagiskCompleteDetected;
        this.isRoot = isRoot;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DeviceCheckerResponse copy$default(DeviceCheckerResponse deviceCheckerResponse, Result result, Result result2, Result result3, Result result4, Result result5, Result result6, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            result = deviceCheckerResponse.isDebuggable;
        }
        if ((i10 & 2) != 0) {
            result2 = deviceCheckerResponse.isDeveloperModeEnabled;
        }
        Result result7 = result2;
        if ((i10 & 4) != 0) {
            result3 = deviceCheckerResponse.isEmulator;
        }
        Result result8 = result3;
        if ((i10 & 8) != 0) {
            result4 = deviceCheckerResponse.isFridaCompleteDetected;
        }
        Result result9 = result4;
        if ((i10 & 16) != 0) {
            result5 = deviceCheckerResponse.isMagiskCompleteDetected;
        }
        Result result10 = result5;
        if ((i10 & 32) != 0) {
            result6 = deviceCheckerResponse.isRoot;
        }
        return deviceCheckerResponse.copy(result, result7, result8, result9, result10, result6);
    }

    @NotNull
    public final Result<Boolean> component1() {
        return this.isDebuggable;
    }

    @NotNull
    public final Result<Boolean> component2() {
        return this.isDeveloperModeEnabled;
    }

    @NotNull
    public final Result<Boolean> component3() {
        return this.isEmulator;
    }

    @NotNull
    public final Result<HashMap<Integer, Result<Boolean>>> component4() {
        return this.isFridaCompleteDetected;
    }

    @NotNull
    public final Result<HashMap<Integer, Result<? extends Object>>> component5() {
        return this.isMagiskCompleteDetected;
    }

    @NotNull
    public final Result<Boolean> component6() {
        return this.isRoot;
    }

    @NotNull
    public final DeviceCheckerResponse copy(@NotNull Result<Boolean> isDebuggable, @NotNull Result<Boolean> isDeveloperModeEnabled, @NotNull Result<Boolean> isEmulator, @NotNull Result<HashMap<Integer, Result<Boolean>>> isFridaCompleteDetected, @NotNull Result<HashMap<Integer, Result<? extends Object>>> isMagiskCompleteDetected, @NotNull Result<Boolean> isRoot) {
        Intrinsics.checkNotNullParameter(isDebuggable, "isDebuggable");
        Intrinsics.checkNotNullParameter(isDeveloperModeEnabled, "isDeveloperModeEnabled");
        Intrinsics.checkNotNullParameter(isEmulator, "isEmulator");
        Intrinsics.checkNotNullParameter(isFridaCompleteDetected, "isFridaCompleteDetected");
        Intrinsics.checkNotNullParameter(isMagiskCompleteDetected, "isMagiskCompleteDetected");
        Intrinsics.checkNotNullParameter(isRoot, "isRoot");
        return new DeviceCheckerResponse(isDebuggable, isDeveloperModeEnabled, isEmulator, isFridaCompleteDetected, isMagiskCompleteDetected, isRoot);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DeviceCheckerResponse)) {
            return false;
        }
        DeviceCheckerResponse deviceCheckerResponse = (DeviceCheckerResponse) other;
        return Intrinsics.areEqual(this.isDebuggable, deviceCheckerResponse.isDebuggable) && Intrinsics.areEqual(this.isDeveloperModeEnabled, deviceCheckerResponse.isDeveloperModeEnabled) && Intrinsics.areEqual(this.isEmulator, deviceCheckerResponse.isEmulator) && Intrinsics.areEqual(this.isFridaCompleteDetected, deviceCheckerResponse.isFridaCompleteDetected) && Intrinsics.areEqual(this.isMagiskCompleteDetected, deviceCheckerResponse.isMagiskCompleteDetected) && Intrinsics.areEqual(this.isRoot, deviceCheckerResponse.isRoot);
    }

    public int hashCode() {
        return this.isRoot.hashCode() + a.b(this.isMagiskCompleteDetected, a.b(this.isFridaCompleteDetected, a.b(this.isEmulator, a.b(this.isDeveloperModeEnabled, this.isDebuggable.hashCode() * 31, 31), 31), 31), 31);
    }

    @NotNull
    public final Result<Boolean> isDebuggable() {
        return this.isDebuggable;
    }

    @NotNull
    public final Result<Boolean> isDeveloperModeEnabled() {
        return this.isDeveloperModeEnabled;
    }

    @NotNull
    public final Result<Boolean> isEmulator() {
        return this.isEmulator;
    }

    @NotNull
    public final Result<HashMap<Integer, Result<Boolean>>> isFridaCompleteDetected() {
        return this.isFridaCompleteDetected;
    }

    @NotNull
    public final Result<HashMap<Integer, Result<? extends Object>>> isMagiskCompleteDetected() {
        return this.isMagiskCompleteDetected;
    }

    @NotNull
    public final Result<Boolean> isRoot() {
        return this.isRoot;
    }

    @NotNull
    public String toString() {
        Result<Boolean> result = this.isDebuggable;
        Result<Boolean> result2 = this.isDeveloperModeEnabled;
        Result<Boolean> result3 = this.isEmulator;
        Result<HashMap<Integer, Result<Boolean>>> result4 = this.isFridaCompleteDetected;
        Result<HashMap<Integer, Result<? extends Object>>> result5 = this.isMagiskCompleteDetected;
        Result<Boolean> result6 = this.isRoot;
        StringBuilder sb2 = new StringBuilder("DeviceCheckerResponse(isDebuggable=");
        sb2.append(result);
        sb2.append(", isDeveloperModeEnabled=");
        sb2.append(result2);
        sb2.append(", isEmulator=");
        i.g(sb2, result3, ", isFridaCompleteDetected=", result4, ", isMagiskCompleteDetected=");
        sb2.append(result5);
        sb2.append(", isRoot=");
        sb2.append(result6);
        sb2.append(")");
        return sb2.toString();
    }
}
