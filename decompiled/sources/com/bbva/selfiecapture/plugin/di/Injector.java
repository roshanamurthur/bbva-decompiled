package com.bbva.selfiecapture.plugin.di;

import com.bbva.selfiecapture.plugin.SelfieCaptureController;
import com.bbva.selfiecapture.plugin.command.SelfieCapturable;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Injector.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\f\u0010\rJ\u0006\u0010\u0003\u001a\u00020\u0002R$\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\u000e"}, d2 = {"Lcom/bbva/selfiecapture/plugin/di/Injector;", "", "", "create", "Lcom/bbva/selfiecapture/plugin/command/SelfieCapturable;", "a", "Lcom/bbva/selfiecapture/plugin/command/SelfieCapturable;", "getScapture$selfie_capture_plugin_release", "()Lcom/bbva/selfiecapture/plugin/command/SelfieCapturable;", "setScapture$selfie_capture_plugin_release", "(Lcom/bbva/selfiecapture/plugin/command/SelfieCapturable;)V", "scapture", "<init>", "()V", "selfie-capture-plugin_release"}, k = 1, mv = {2, 0, 0})
public final class Injector {

    @NotNull
    public static final Injector INSTANCE = new Injector();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public static SelfieCapturable scapture;

    public final void create() {
        scapture = new SelfieCaptureController();
    }

    @Nullable
    public final SelfieCapturable getScapture$selfie_capture_plugin_release() {
        return scapture;
    }

    public final void setScapture$selfie_capture_plugin_release(@Nullable SelfieCapturable selfieCapturable) {
        scapture = selfieCapturable;
    }
}
