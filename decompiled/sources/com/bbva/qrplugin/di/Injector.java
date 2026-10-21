package com.bbva.qrplugin.di;

import com.bbva.androidtoolkit.plugin.activity.result.ActivityCreatorRequest;
import com.bbva.androidtoolkit.plugin.activity.result.ActivityLauncher;
import com.bbva.qr.decoder.BarcodeImageDecoder;
import com.bbva.qr.decoder.ImageDecoder;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Injector.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0012\u0010\u0013R\"\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\u0011\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u0014"}, d2 = {"Lcom/bbva/qrplugin/di/Injector;", "", "Lcom/bbva/androidtoolkit/plugin/activity/result/ActivityCreatorRequest;", "a", "Lcom/bbva/androidtoolkit/plugin/activity/result/ActivityCreatorRequest;", "getActivityLauncher", "()Lcom/bbva/androidtoolkit/plugin/activity/result/ActivityCreatorRequest;", "setActivityLauncher", "(Lcom/bbva/androidtoolkit/plugin/activity/result/ActivityCreatorRequest;)V", "activityLauncher", "Lcom/bbva/qr/decoder/ImageDecoder;", "b", "Lcom/bbva/qr/decoder/ImageDecoder;", "getDecoder", "()Lcom/bbva/qr/decoder/ImageDecoder;", "setDecoder", "(Lcom/bbva/qr/decoder/ImageDecoder;)V", "decoder", "<init>", "()V", "qr-plugin_release"}, k = 1, mv = {1, 8, 0})
public final class Injector {

    @NotNull
    public static final Injector INSTANCE = new Injector();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static ActivityCreatorRequest activityLauncher = new ActivityLauncher();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static ImageDecoder decoder = BarcodeImageDecoder.INSTANCE;

    @NotNull
    public final ActivityCreatorRequest getActivityLauncher() {
        return activityLauncher;
    }

    @NotNull
    public final ImageDecoder getDecoder() {
        return decoder;
    }

    public final void setActivityLauncher(@NotNull ActivityCreatorRequest activityCreatorRequest) {
        Intrinsics.checkNotNullParameter(activityCreatorRequest, "<set-?>");
        activityLauncher = activityCreatorRequest;
    }

    public final void setDecoder(@NotNull ImageDecoder imageDecoder) {
        Intrinsics.checkNotNullParameter(imageDecoder, "<set-?>");
        decoder = imageDecoder;
    }
}
