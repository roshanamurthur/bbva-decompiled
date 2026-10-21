package com.bbva.document.scanner.plugin;

import com.bbva.document.scanner.plugin.launcher.DocumentScannerActivityLauncher;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Injector.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0004R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\f"}, d2 = {"Lcom/bbva/document/scanner/plugin/Injector;", "", "()V", "launcherLauncher", "Lcom/bbva/document/scanner/plugin/launcher/DocumentScannerActivityLauncher;", "getLauncherLauncher", "()Lcom/bbva/document/scanner/plugin/launcher/DocumentScannerActivityLauncher;", "setLauncherLauncher", "(Lcom/bbva/document/scanner/plugin/launcher/DocumentScannerActivityLauncher;)V", "initialize", "", "launcher", "document-scanner-plugin_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class Injector {

    @NotNull
    public static final Injector INSTANCE = new Injector();
    public static DocumentScannerActivityLauncher launcherLauncher;

    @NotNull
    public final DocumentScannerActivityLauncher getLauncherLauncher() {
        DocumentScannerActivityLauncher documentScannerActivityLauncher = launcherLauncher;
        if (documentScannerActivityLauncher != null) {
            return documentScannerActivityLauncher;
        }
        Intrinsics.throwUninitializedPropertyAccessException("launcherLauncher");
        return null;
    }

    public final void initialize(@NotNull DocumentScannerActivityLauncher launcher) {
        Intrinsics.checkNotNullParameter(launcher, "launcher");
        setLauncherLauncher(launcher);
    }

    public final void setLauncherLauncher(@NotNull DocumentScannerActivityLauncher documentScannerActivityLauncher) {
        Intrinsics.checkNotNullParameter(documentScannerActivityLauncher, "<set-?>");
        launcherLauncher = documentScannerActivityLauncher;
    }
}
