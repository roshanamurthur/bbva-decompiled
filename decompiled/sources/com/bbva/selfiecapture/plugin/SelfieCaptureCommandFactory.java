package com.bbva.selfiecapture.plugin;

import com.bbva.androidtoolkit.plugin.command.factory.CommandFactory;
import j6.b;
import j6.c;
import j6.d;
import j6.e;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import z6.j;
import z6.k;

/* JADX INFO: compiled from: SelfieCaptureCommandFactory.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/bbva/selfiecapture/plugin/SelfieCaptureCommandFactory;", "Lcom/bbva/androidtoolkit/plugin/command/factory/CommandFactory;", "<init>", "()V", "Companion", "selfie-capture-plugin_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SelfieCaptureCommandFactory extends CommandFactory {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final String PROVIDER_GET_CONFIGURATION_KEYS = "getconfigurationkeys";

    @NotNull
    public static final String PROVIDER_GET_NEXT_CHALLENGE = "getnextchallenge";

    @NotNull
    public static final String PROVIDER_GET_VERSION = "getversion";

    @NotNull
    public static final String PROVIDER_LAUNCH_SELFIE_CAPTURE = "launchselfiecapture";

    @NotNull
    public static final String PROVIDER_STOP_SELFIE_CAPTURE = "stopselfiecapture";

    @NotNull
    public static final String PROVIDER_UPDATE_CHALLENGE = "updatechallenge";

    /* JADX INFO: compiled from: SelfieCaptureCommandFactory.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/bbva/selfiecapture/plugin/SelfieCaptureCommandFactory$Companion;", "", "<init>", "()V", "PROVIDER_LAUNCH_SELFIE_CAPTURE", "", "PROVIDER_STOP_SELFIE_CAPTURE", "PROVIDER_GET_VERSION", "PROVIDER_GET_CONFIGURATION_KEYS", "PROVIDER_GET_NEXT_CHALLENGE", "PROVIDER_UPDATE_CHALLENGE", "selfie-capture-plugin_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public SelfieCaptureCommandFactory() {
        addCommandProvider(PROVIDER_LAUNCH_SELFIE_CAPTURE, new b(7));
        addCommandProvider(PROVIDER_STOP_SELFIE_CAPTURE, new c(6));
        int i10 = 5;
        addCommandProvider("getversion", new d(i10));
        addCommandProvider("getconfigurationkeys", new e(i10));
        int i11 = 4;
        addCommandProvider(PROVIDER_GET_NEXT_CHALLENGE, new j(i11));
        addCommandProvider(PROVIDER_UPDATE_CHALLENGE, new k(i11));
    }
}
