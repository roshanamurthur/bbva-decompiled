package com.bbva.selfiecapture.plugin.command;

import android.content.Context;
import com.dasnano.vdphotoselfiecapture.VDPhotoSelfieCapture;
import com.google.android.gms.fido.u2f.api.common.ClientData;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: SelfieCapturable.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J.\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tH&J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H&J\b\u0010\f\u001a\u00020\nH&J \u0010\r\u001a\u0012\u0012\u0004\u0012\u00020\n0\u000ej\b\u0012\u0004\u0012\u00020\n`\u000f2\u0006\u0010\u0006\u001a\u00020\u0007H&J\b\u0010\u0010\u001a\u00020\nH&J\u0010\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\nH&¨\u0006\u0013"}, d2 = {"Lcom/bbva/selfiecapture/plugin/command/SelfieCapturable;", "", "startSelfieCapture", "", "delegate", "Lcom/dasnano/vdphotoselfiecapture/VDPhotoSelfieCapture$IVDPhotoSelfieCapture;", "context", "Landroid/content/Context;", "configuration", "", "", "stopSelfieCaptureProcess", "getVersion", "getConfigurationKeys", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "getNextChallenge", "updateChallenge", ClientData.KEY_CHALLENGE, "selfie-capture-plugin_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface SelfieCapturable {
    @NotNull
    ArrayList<String> getConfigurationKeys(@NotNull Context context);

    @NotNull
    String getNextChallenge();

    @NotNull
    String getVersion();

    void startSelfieCapture(@NotNull VDPhotoSelfieCapture.IVDPhotoSelfieCapture delegate, @NotNull Context context, @Nullable Map<String, String> configuration);

    void stopSelfieCaptureProcess(@NotNull Context context);

    void updateChallenge(@NotNull String challenge);
}
