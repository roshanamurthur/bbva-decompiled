package com.dasnano.vdvideoselfiecapture.model;

import androidx.annotation.Keep;
import androidx.lifecycle.SavedStateHandle;
import com.dasnano.vdvideoselfiecapture.config.VDVideoSelfieConfiguration;
import com.veridas.lifecycle.DasViewModel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: VDVideoSelfieViewModel.kt */
/* JADX INFO: loaded from: classes9.dex */
@Keep
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0012\u001a\u00020\u0002¢\u0006\u0004\b\u0013\u0010\u0014R(\u0010\t\u001a\u0004\u0018\u00010\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00038F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR(\u0010\u000f\u001a\u0004\u0018\u00010\n2\b\u0010\u0004\u001a\u0004\u0018\u00010\n8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0015"}, d2 = {"Lcom/dasnano/vdvideoselfiecapture/model/VDVideoSelfieViewModel;", "Lcom/veridas/lifecycle/DasViewModel;", "Lcom/dasnano/vdvideoselfiecapture/config/VDVideoSelfieConfiguration;", "", "value", "getDocumentType", "()Ljava/lang/String;", "setDocumentType", "(Ljava/lang/String;)V", "documentType", "", "getSmartVideo", "()Ljava/lang/Boolean;", "setSmartVideo", "(Ljava/lang/Boolean;)V", "smartVideo", "Landroidx/lifecycle/SavedStateHandle;", "state", "configuration", "<init>", "(Landroidx/lifecycle/SavedStateHandle;Lcom/dasnano/vdvideoselfiecapture/config/VDVideoSelfieConfiguration;)V", "video-selfie-capture_release"}, k = 1, mv = {1, 9, 0})
public final class VDVideoSelfieViewModel extends DasViewModel<VDVideoSelfieConfiguration> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VDVideoSelfieViewModel(@NotNull SavedStateHandle state, @NotNull VDVideoSelfieConfiguration configuration) {
        super(state, configuration);
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
    }

    @Nullable
    public final String getDocumentType() {
        return (String) getState().get("DOCUMENT_TYPE");
    }

    @Nullable
    public final Boolean getSmartVideo() {
        return (Boolean) getState().get("SMART_VIDEO");
    }

    public final void setDocumentType(@Nullable String str) {
        getState().set("DOCUMENT_TYPE", str);
    }

    public final void setSmartVideo(@Nullable Boolean bool) {
        getState().set("SMART_VIDEO", bool);
    }
}
