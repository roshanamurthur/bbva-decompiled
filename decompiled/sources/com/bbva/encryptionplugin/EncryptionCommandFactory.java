package com.bbva.encryptionplugin;

import com.bbva.androidtoolkit.plugin.command.AbstractCommand;
import com.bbva.androidtoolkit.plugin.command.factory.CommandFactory;
import com.bbva.androidtoolkit.plugin.command.factory.CommandProvider;
import com.bbva.encryptionplugin.command.DecryptCommand;
import com.bbva.encryptionplugin.command.EncryptCommand;
import com.bbva.encryptionplugin.command.GenerateKPubCommand;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: EncryptionCommandFactory.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/bbva/encryptionplugin/EncryptionCommandFactory;", "Lcom/bbva/androidtoolkit/plugin/command/factory/CommandFactory;", "()V", "Companion", "encryption_plugin_release"}, k = 1, mv = {1, 1, 16})
public final class EncryptionCommandFactory extends CommandFactory {

    @NotNull
    public static final String ACTION_DECRYPT = "decrypt";

    @NotNull
    public static final String ACTION_ENCRYPT = "encrypt";

    @NotNull
    public static final String ACTION_GENERATE_K_PUB = "generatekpub";

    /* JADX INFO: compiled from: EncryptionCommandFactory.kt */
    public static final class a implements CommandProvider {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f29227a = new a();

        @Override // com.bbva.androidtoolkit.plugin.command.factory.CommandProvider
        public final AbstractCommand create() {
            return new GenerateKPubCommand();
        }
    }

    /* JADX INFO: compiled from: EncryptionCommandFactory.kt */
    public static final class b implements CommandProvider {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f29228a = new b();

        @Override // com.bbva.androidtoolkit.plugin.command.factory.CommandProvider
        public final AbstractCommand create() {
            return new EncryptCommand();
        }
    }

    /* JADX INFO: compiled from: EncryptionCommandFactory.kt */
    public static final class c implements CommandProvider {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f29229a = new c();

        @Override // com.bbva.androidtoolkit.plugin.command.factory.CommandProvider
        public final AbstractCommand create() {
            return new DecryptCommand();
        }
    }

    public EncryptionCommandFactory() {
        addCommandProvider(ACTION_GENERATE_K_PUB, a.f29227a);
        addCommandProvider("encrypt", b.f29228a);
        addCommandProvider("decrypt", c.f29229a);
    }
}
