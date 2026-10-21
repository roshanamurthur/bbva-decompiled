package com.bbva.dcaptureplugin.di;

import com.bbva.dcaptureplugin.DocumentCaptureController;
import com.bbva.dcaptureplugin.command.DocumentCapturable;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Injector.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\f\u0010\rJ\u0006\u0010\u0003\u001a\u00020\u0002R$\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\u000e"}, d2 = {"Lcom/bbva/dcaptureplugin/di/Injector;", "", "", "create", "Lcom/bbva/dcaptureplugin/command/DocumentCapturable;", "a", "Lcom/bbva/dcaptureplugin/command/DocumentCapturable;", "getDcapture$document_capture_plugin_release", "()Lcom/bbva/dcaptureplugin/command/DocumentCapturable;", "setDcapture$document_capture_plugin_release", "(Lcom/bbva/dcaptureplugin/command/DocumentCapturable;)V", "dcapture", "<init>", "()V", "document-capture-plugin_release"}, k = 1, mv = {2, 0, 0})
public final class Injector {

    @NotNull
    public static final Injector INSTANCE = new Injector();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public static DocumentCapturable dcapture;

    public final void create() {
        dcapture = new DocumentCaptureController();
    }

    @Nullable
    public final DocumentCapturable getDcapture$document_capture_plugin_release() {
        return dcapture;
    }

    public final void setDcapture$document_capture_plugin_release(@Nullable DocumentCapturable documentCapturable) {
        dcapture = documentCapturable;
    }
}
