package com.bbva.videocapture;

import com.bbva.androidtoolkit.plugin.command.factory.CommandFactory;
import j6.c;
import j6.d;
import j6.e;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import z6.j;

/* JADX INFO: compiled from: VideoCaptureCommandFactory.kt */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/bbva/videocapture/VideoCaptureCommandFactory;", "Lcom/bbva/androidtoolkit/plugin/command/factory/CommandFactory;", "<init>", "()V", "Companion", "video-capture-plugin_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class VideoCaptureCommandFactory extends CommandFactory {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final String PROVIDER_GET_CONFIGURATION_KEYS = "getconfigurationkeys";

    @NotNull
    public static final String PROVIDER_GET_VERSION = "getversion";

    @NotNull
    public static final String PROVIDER_LAUNCH_VIDEO_CAPTURE = "launchvideocapture";

    @NotNull
    public static final String PROVIDER_STOP_VIDEO_CAPTURE = "stopvideocapture";

    /* JADX INFO: compiled from: VideoCaptureCommandFactory.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/bbva/videocapture/VideoCaptureCommandFactory$Companion;", "", "<init>", "()V", "PROVIDER_LAUNCH_VIDEO_CAPTURE", "", "PROVIDER_STOP_VIDEO_CAPTURE", "PROVIDER_GET_VERSION", "PROVIDER_GET_CONFIGURATION_KEYS", "video-capture-plugin_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public VideoCaptureCommandFactory() {
        addCommandProvider(PROVIDER_LAUNCH_VIDEO_CAPTURE, new c(7));
        int i10 = 6;
        addCommandProvider(PROVIDER_STOP_VIDEO_CAPTURE, new d(i10));
        addCommandProvider("getversion", new e(i10));
        addCommandProvider("getconfigurationkeys", new j(5));
    }
}
