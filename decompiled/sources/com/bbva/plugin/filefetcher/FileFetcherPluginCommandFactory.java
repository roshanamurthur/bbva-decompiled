package com.bbva.plugin.filefetcher;

import com.bbva.androidtoolkit.plugin.activity.result.ActivityLauncher;
import com.bbva.androidtoolkit.plugin.command.AbstractCommand;
import com.bbva.androidtoolkit.plugin.command.factory.CommandFactory;
import com.bbva.androidtoolkit.plugin.command.factory.CommandProvider;
import com.bbva.plugin.filefetcher.command.FetchCommand;
import kotlin.Metadata;

/* JADX INFO: compiled from: FileFetcherPlugin.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/bbva/plugin/filefetcher/FileFetcherPluginCommandFactory;", "Lcom/bbva/androidtoolkit/plugin/command/factory/CommandFactory;", "()V", "filefetcher-plugin_release"}, k = 1, mv = {1, 1, 16})
public final class FileFetcherPluginCommandFactory extends CommandFactory {

    /* JADX INFO: compiled from: FileFetcherPlugin.kt */
    public static final class a implements CommandProvider {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f35631a = new a();

        @Override // com.bbva.androidtoolkit.plugin.command.factory.CommandProvider
        public final AbstractCommand create() {
            return new FetchCommand(new ActivityLauncher());
        }
    }

    public FileFetcherPluginCommandFactory() {
        addCommandProvider(FetchCommand.ID, a.f35631a);
    }
}
