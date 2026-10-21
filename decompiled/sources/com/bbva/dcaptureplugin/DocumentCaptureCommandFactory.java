package com.bbva.dcaptureplugin;

import com.bbva.androidtoolkit.plugin.command.factory.CommandFactory;
import j6.a;
import j6.b;
import j6.c;
import j6.d;
import j6.e;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: DocumentCaptureCommandFactory.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/bbva/dcaptureplugin/DocumentCaptureCommandFactory;", "Lcom/bbva/androidtoolkit/plugin/command/factory/CommandFactory;", "<init>", "()V", "Companion", "document-capture-plugin_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class DocumentCaptureCommandFactory extends CommandFactory {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final String PROVIDER_GET_CONFIGURATION_KEYS = "getconfigurationkeys";

    @NotNull
    public static final String PROVIDER_GET_COUNTRY_DOCUMENTS = "getcountrydocuments";

    @NotNull
    public static final String PROVIDER_GET_VERSION = "getversion";

    @NotNull
    public static final String PROVIDER_LAUNCH_DOCUMENT_CAPTURE = "launchdocumentcapture";

    @NotNull
    public static final String PROVIDER_STOP_DOCUMENT_CAPTURE = "stopdocumentcapture";

    /* JADX INFO: compiled from: DocumentCaptureCommandFactory.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/bbva/dcaptureplugin/DocumentCaptureCommandFactory$Companion;", "", "<init>", "()V", "PROVIDER_LAUNCH_DOCUMENT_CAPTURE", "", "PROVIDER_STOP_DOCUMENT_CAPTURE", "PROVIDER_GET_VERSION", "PROVIDER_GET_CONFIGURATION_KEYS", "PROVIDER_GET_COUNTRY_DOCUMENTS", "document-capture-plugin_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public DocumentCaptureCommandFactory() {
        int i10 = 0;
        addCommandProvider(PROVIDER_LAUNCH_DOCUMENT_CAPTURE, new a(i10));
        addCommandProvider(PROVIDER_STOP_DOCUMENT_CAPTURE, new b(i10));
        addCommandProvider("getversion", new c(i10));
        addCommandProvider("getconfigurationkeys", new d(i10));
        addCommandProvider(PROVIDER_GET_COUNTRY_DOCUMENTS, new e(i10));
    }
}
