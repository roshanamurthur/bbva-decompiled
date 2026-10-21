package com.dasnano.vdphotoselfiecapture.model;

import androidx.annotation.Keep;
import androidx.lifecycle.SavedStateHandle;
import com.dasnano.vdphotoselfiecapture.api.model.Token;
import com.dasnano.vdphotoselfiecapture.config.VDPhotoSelfieConfiguration;
import com.veridas.lifecycle.DasViewModel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: VDPhotoSelfieViewModel.kt */
/* JADX INFO: loaded from: classes9.dex */
@Keep
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\t\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010.\u001a\u00020\u0002¢\u0006\u0004\b/\u00100R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R(\u0010\f\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00068F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR(\u0010\u0012\u001a\u0004\u0018\u00010\r2\b\u0010\u0007\u001a\u0004\u0018\u00010\r8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R(\u0010\u0015\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00068F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0013\u0010\t\"\u0004\b\u0014\u0010\u000bR(\u0010\u0018\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00068F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0016\u0010\t\"\u0004\b\u0017\u0010\u000bR(\u0010\u001b\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00068F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0019\u0010\t\"\u0004\b\u001a\u0010\u000bR0\u0010!\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u001c2\f\u0010\u0007\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u001c8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R(\u0010$\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00068F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\"\u0010\t\"\u0004\b#\u0010\u000bR(\u0010'\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00068F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b%\u0010\t\"\u0004\b&\u0010\u000bR$\u0010-\u001a\u00020(2\u0006\u0010\u0007\u001a\u00020(8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,¨\u00061"}, d2 = {"Lcom/dasnano/vdphotoselfiecapture/model/VDPhotoSelfieViewModel;", "Lcom/veridas/lifecycle/DasViewModel;", "Lcom/dasnano/vdphotoselfiecapture/config/VDPhotoSelfieConfiguration;", "Landroidx/lifecycle/SavedStateHandle;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "", "value", "getChallengeJWSToken", "()Ljava/lang/String;", "setChallengeJWSToken", "(Ljava/lang/String;)V", "challengeJWSToken", "Lcom/dasnano/vdphotoselfiecapture/api/model/Token;", "getChallengeToken", "()Lcom/dasnano/vdphotoselfiecapture/api/model/Token;", "setChallengeToken", "(Lcom/dasnano/vdphotoselfiecapture/api/model/Token;)V", "challengeToken", "getChallengeVideoPath", "setChallengeVideoPath", "challengeVideoPath", "getCroppedFrameImagePath", "setCroppedFrameImagePath", "croppedFrameImagePath", "getCroppedFullImagePath", "setCroppedFullImagePath", "croppedFullImagePath", "Ljava/lang/Class;", "getCurrentAction", "()Ljava/lang/Class;", "setCurrentAction", "(Ljava/lang/Class;)V", "currentAction", "getFrameImagePath", "setFrameImagePath", "frameImagePath", "getFullImagePath", "setFullImagePath", "fullImagePath", "", "getScreenOrientation", "()I", "setScreenOrientation", "(I)V", "screenOrientation", "configuration", "<init>", "(Landroidx/lifecycle/SavedStateHandle;Lcom/dasnano/vdphotoselfiecapture/config/VDPhotoSelfieConfiguration;)V", "photo-selfie-capture_release"}, k = 1, mv = {1, 9, 0})
public final class VDPhotoSelfieViewModel extends DasViewModel<VDPhotoSelfieConfiguration> {

    @NotNull
    private final SavedStateHandle savedStateHandle;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VDPhotoSelfieViewModel(@NotNull SavedStateHandle savedStateHandle, @NotNull VDPhotoSelfieConfiguration configuration) {
        super(savedStateHandle, configuration);
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        this.savedStateHandle = savedStateHandle;
    }

    @Nullable
    public final String getChallengeJWSToken() {
        return (String) this.savedStateHandle.get("CHALLENGE_JWS_TOKEN");
    }

    @Nullable
    public final Token getChallengeToken() {
        return (Token) this.savedStateHandle.get("CHALLENGE_TOKEN");
    }

    @Nullable
    public final String getChallengeVideoPath() {
        return (String) this.savedStateHandle.get("CHALLENGE_VIDEO_PATH");
    }

    @Nullable
    public final String getCroppedFrameImagePath() {
        return (String) this.savedStateHandle.get("CROPPED_FRAME_IMAGE_PATH");
    }

    @Nullable
    public final String getCroppedFullImagePath() {
        return (String) this.savedStateHandle.get("CROPPED_FULL_IMAGE_PATH");
    }

    @Nullable
    public final Class<?> getCurrentAction() {
        return (Class) this.savedStateHandle.get("CURRENT_ACTION");
    }

    @Nullable
    public final String getFrameImagePath() {
        return (String) this.savedStateHandle.get("FRAME_IMAGE_PATH");
    }

    @Nullable
    public final String getFullImagePath() {
        return (String) this.savedStateHandle.get("FULL_IMAGE_PATH");
    }

    public final int getScreenOrientation() {
        Integer num = (Integer) this.savedStateHandle.get("SCREEN_ORIENTATION");
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    public final void setChallengeJWSToken(@Nullable String str) {
        this.savedStateHandle.set("CHALLENGE_JWS_TOKEN", str);
    }

    public final void setChallengeToken(@Nullable Token token) {
        this.savedStateHandle.set("CHALLENGE_TOKEN", token);
    }

    public final void setChallengeVideoPath(@Nullable String str) {
        this.savedStateHandle.set("CHALLENGE_VIDEO_PATH", str);
    }

    public final void setCroppedFrameImagePath(@Nullable String str) {
        this.savedStateHandle.set("CROPPED_FRAME_IMAGE_PATH", str);
    }

    public final void setCroppedFullImagePath(@Nullable String str) {
        this.savedStateHandle.set("CROPPED_FULL_IMAGE_PATH", str);
    }

    public final void setCurrentAction(@Nullable Class<?> cls) {
        this.savedStateHandle.set("CURRENT_ACTION", cls);
    }

    public final void setFrameImagePath(@Nullable String str) {
        this.savedStateHandle.set("FRAME_IMAGE_PATH", str);
    }

    public final void setFullImagePath(@Nullable String str) {
        this.savedStateHandle.set("FULL_IMAGE_PATH", str);
    }

    public final void setScreenOrientation(int i10) {
        this.savedStateHandle.set("SCREEN_ORIENTATION", Integer.valueOf(i10));
    }
}
