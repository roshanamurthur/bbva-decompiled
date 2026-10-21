package com.bbva.ethermobilesdk.plugin.devicemanager.model.response;

import androidx.annotation.Keep;
import androidx.camera.camera2.internal.h0;
import com.bbva.androidtoolkit.plugin.postmessage.PayloadDTO;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: PhoneCallState.kt */
/* JADX INFO: loaded from: classes5.dex */
@Keep
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/bbva/ethermobilesdk/plugin/devicemanager/model/response/PhoneCallState;", "Lcom/bbva/androidtoolkit/plugin/postmessage/PayloadDTO;", "phoneCallState", "", "<init>", "(Ljava/lang/String;)V", "getPhoneCallState", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", GenerateActivationFormCommand.HASH_CODE, "", "toString", "devicemanager-plugin_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class PhoneCallState extends PayloadDTO {

    @NotNull
    private final String phoneCallState;

    public PhoneCallState(@NotNull String phoneCallState) {
        Intrinsics.checkNotNullParameter(phoneCallState, "phoneCallState");
        this.phoneCallState = phoneCallState;
    }

    public static /* synthetic */ PhoneCallState copy$default(PhoneCallState phoneCallState, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = phoneCallState.phoneCallState;
        }
        return phoneCallState.copy(str);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getPhoneCallState() {
        return this.phoneCallState;
    }

    @NotNull
    public final PhoneCallState copy(@NotNull String phoneCallState) {
        Intrinsics.checkNotNullParameter(phoneCallState, "phoneCallState");
        return new PhoneCallState(phoneCallState);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof PhoneCallState) && Intrinsics.areEqual(this.phoneCallState, ((PhoneCallState) other).phoneCallState);
    }

    @NotNull
    public final String getPhoneCallState() {
        return this.phoneCallState;
    }

    public int hashCode() {
        return this.phoneCallState.hashCode();
    }

    @NotNull
    public String toString() {
        return h0.b("PhoneCallState(phoneCallState=", this.phoneCallState, ")");
    }
}
