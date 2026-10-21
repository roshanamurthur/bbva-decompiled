package com.bbva.glomohybrid.documents.plugin;

import com.bbva.actionlauncher.ActionLauncher;
import com.bbva.glomohybrid.documents.common.FileUseCaseFactory;
import com.bbva.glomoutils.scheduler.DefaultThreadDispatchers;
import com.bbva.glomoutils.scheduler.ThreadDispatchers;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Injector.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J(\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\n2\b\b\u0002\u0010\u001e\u001a\u00020\u0010R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0010X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u00020\u0016X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a¨\u0006\u001f"}, d2 = {"Lcom/bbva/glomohybrid/documents/plugin/Injector;", "", "()V", "actionLauncher", "Lcom/bbva/actionlauncher/ActionLauncher;", "getActionLauncher", "()Lcom/bbva/actionlauncher/ActionLauncher;", "setActionLauncher", "(Lcom/bbva/actionlauncher/ActionLauncher;)V", "fileExporter", "Lcom/bbva/glomohybrid/documents/plugin/UriExporter;", "getFileExporter", "()Lcom/bbva/glomohybrid/documents/plugin/UriExporter;", "setFileExporter", "(Lcom/bbva/glomohybrid/documents/plugin/UriExporter;)V", "threadDispatcher", "Lcom/bbva/glomoutils/scheduler/ThreadDispatchers;", "getThreadDispatcher", "()Lcom/bbva/glomoutils/scheduler/ThreadDispatchers;", "setThreadDispatcher", "(Lcom/bbva/glomoutils/scheduler/ThreadDispatchers;)V", "useCaseFactory", "Lcom/bbva/glomohybrid/documents/common/FileUseCaseFactory;", "getUseCaseFactory", "()Lcom/bbva/glomohybrid/documents/common/FileUseCaseFactory;", "setUseCaseFactory", "(Lcom/bbva/glomohybrid/documents/common/FileUseCaseFactory;)V", "init", "", "uriExporter", "threadDispatchers", "gl-documents_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class Injector {

    @NotNull
    public static final Injector INSTANCE = new Injector();
    public static ActionLauncher actionLauncher;
    public static UriExporter fileExporter;
    public static ThreadDispatchers threadDispatcher;
    public static FileUseCaseFactory useCaseFactory;

    public static /* synthetic */ void init$default(Injector injector, FileUseCaseFactory fileUseCaseFactory, ActionLauncher actionLauncher2, UriExporter uriExporter, ThreadDispatchers threadDispatchers, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            threadDispatchers = new DefaultThreadDispatchers();
        }
        injector.init(fileUseCaseFactory, actionLauncher2, uriExporter, threadDispatchers);
    }

    @NotNull
    public final ActionLauncher getActionLauncher() {
        ActionLauncher actionLauncher2 = actionLauncher;
        if (actionLauncher2 != null) {
            return actionLauncher2;
        }
        Intrinsics.throwUninitializedPropertyAccessException("actionLauncher");
        return null;
    }

    @NotNull
    public final UriExporter getFileExporter() {
        UriExporter uriExporter = fileExporter;
        if (uriExporter != null) {
            return uriExporter;
        }
        Intrinsics.throwUninitializedPropertyAccessException("fileExporter");
        return null;
    }

    @NotNull
    public final ThreadDispatchers getThreadDispatcher() {
        ThreadDispatchers threadDispatchers = threadDispatcher;
        if (threadDispatchers != null) {
            return threadDispatchers;
        }
        Intrinsics.throwUninitializedPropertyAccessException("threadDispatcher");
        return null;
    }

    @NotNull
    public final FileUseCaseFactory getUseCaseFactory() {
        FileUseCaseFactory fileUseCaseFactory = useCaseFactory;
        if (fileUseCaseFactory != null) {
            return fileUseCaseFactory;
        }
        Intrinsics.throwUninitializedPropertyAccessException("useCaseFactory");
        return null;
    }

    public final void init(@NotNull FileUseCaseFactory useCaseFactory2, @NotNull ActionLauncher actionLauncher2, @NotNull UriExporter uriExporter, @NotNull ThreadDispatchers threadDispatchers) {
        Intrinsics.checkNotNullParameter(useCaseFactory2, "useCaseFactory");
        Intrinsics.checkNotNullParameter(actionLauncher2, "actionLauncher");
        Intrinsics.checkNotNullParameter(uriExporter, "uriExporter");
        Intrinsics.checkNotNullParameter(threadDispatchers, "threadDispatchers");
        setUseCaseFactory(useCaseFactory2);
        setActionLauncher(actionLauncher2);
        setFileExporter(uriExporter);
        setThreadDispatcher(threadDispatchers);
    }

    public final void setActionLauncher(@NotNull ActionLauncher actionLauncher2) {
        Intrinsics.checkNotNullParameter(actionLauncher2, "<set-?>");
        actionLauncher = actionLauncher2;
    }

    public final void setFileExporter(@NotNull UriExporter uriExporter) {
        Intrinsics.checkNotNullParameter(uriExporter, "<set-?>");
        fileExporter = uriExporter;
    }

    public final void setThreadDispatcher(@NotNull ThreadDispatchers threadDispatchers) {
        Intrinsics.checkNotNullParameter(threadDispatchers, "<set-?>");
        threadDispatcher = threadDispatchers;
    }

    public final void setUseCaseFactory(@NotNull FileUseCaseFactory fileUseCaseFactory) {
        Intrinsics.checkNotNullParameter(fileUseCaseFactory, "<set-?>");
        useCaseFactory = fileUseCaseFactory;
    }
}
