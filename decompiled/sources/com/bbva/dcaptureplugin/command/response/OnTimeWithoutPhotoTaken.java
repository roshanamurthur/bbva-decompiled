package com.bbva.dcaptureplugin.command.response;

import androidx.annotation.Keep;
import com.bbva.androidtoolkit.plugin.postmessage.PayloadDTO;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.mypinpad.tsdk.isolation.z1;
import com.noknok.android.client.utils.UIConfigTags;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: LaunchDocumentCaptureResponse.kt */
/* JADX INFO: loaded from: classes3.dex */
@Keep
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/bbva/dcaptureplugin/command/response/OnTimeWithoutPhotoTaken;", "Lcom/bbva/androidtoolkit/plugin/postmessage/PayloadDTO;", UIConfigTags.TAG_SECONDS, "", "captureTypeName", "", "<init>", "(ILjava/lang/String;)V", "getSeconds", "()I", "getCaptureTypeName", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "", GenerateActivationFormCommand.HASH_CODE, "toString", "document-capture-plugin_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class OnTimeWithoutPhotoTaken extends PayloadDTO {

    @NotNull
    private final String captureTypeName;
    private final int seconds;

    public OnTimeWithoutPhotoTaken(int i10, @NotNull String captureTypeName) {
        Intrinsics.checkNotNullParameter(captureTypeName, "captureTypeName");
        this.seconds = i10;
        this.captureTypeName = captureTypeName;
    }

    public static /* synthetic */ OnTimeWithoutPhotoTaken copy$default(OnTimeWithoutPhotoTaken onTimeWithoutPhotoTaken, int i10, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = onTimeWithoutPhotoTaken.seconds;
        }
        if ((i11 & 2) != 0) {
            str = onTimeWithoutPhotoTaken.captureTypeName;
        }
        return onTimeWithoutPhotoTaken.copy(i10, str);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getSeconds() {
        return this.seconds;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getCaptureTypeName() {
        return this.captureTypeName;
    }

    @NotNull
    public final OnTimeWithoutPhotoTaken copy(int seconds, @NotNull String captureTypeName) {
        Intrinsics.checkNotNullParameter(captureTypeName, "captureTypeName");
        return new OnTimeWithoutPhotoTaken(seconds, captureTypeName);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OnTimeWithoutPhotoTaken)) {
            return false;
        }
        OnTimeWithoutPhotoTaken onTimeWithoutPhotoTaken = (OnTimeWithoutPhotoTaken) other;
        return this.seconds == onTimeWithoutPhotoTaken.seconds && Intrinsics.areEqual(this.captureTypeName, onTimeWithoutPhotoTaken.captureTypeName);
    }

    @NotNull
    public final String getCaptureTypeName() {
        return this.captureTypeName;
    }

    public final int getSeconds() {
        return this.seconds;
    }

    public int hashCode() {
        return this.captureTypeName.hashCode() + (this.seconds * 31);
    }

    @NotNull
    public String toString() {
        return z1.c("OnTimeWithoutPhotoTaken(seconds=", this.seconds, ", captureTypeName=", this.captureTypeName, ")");
    }
}
