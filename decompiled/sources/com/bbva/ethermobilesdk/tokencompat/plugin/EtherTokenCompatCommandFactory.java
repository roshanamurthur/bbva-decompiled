package com.bbva.ethermobilesdk.tokencompat.plugin;

import c4.i;
import com.bbva.androidtoolkit.plugin.command.AbstractCommand;
import com.bbva.androidtoolkit.plugin.command.factory.CommandFactory;
import com.bbva.androidtoolkit.plugin.command.factory.CommandProvider;
import com.bbva.ethermobilesdk.tokencompat.TokenCompat;
import com.bbva.ethermobilesdk.tokencompat.TokenCompatConfig;
import com.bbva.ethermobilesdk.tokencompat.plugin.command.ChangePasswordCommand;
import com.bbva.ethermobilesdk.tokencompat.plugin.command.DeleteTokensCommand;
import com.bbva.ethermobilesdk.tokencompat.plugin.command.GenerateNextOtpCommand;
import com.bbva.ethermobilesdk.tokencompat.plugin.command.GenerateOtpCommand;
import com.bbva.ethermobilesdk.tokencompat.plugin.command.GetAppReportCommand;
import com.bbva.ethermobilesdk.tokencompat.plugin.command.GetRemainingTimeCommand;
import com.bbva.ethermobilesdk.tokencompat.plugin.command.GetTokenListCommand;
import com.bbva.ethermobilesdk.tokencompat.plugin.command.GetTokenOathCommand;
import com.bbva.ethermobilesdk.tokencompat.plugin.command.RegisterTokenCommand;
import com.bbva.ethermobilesdk.tokencompat.plugin.command.SetTokenDescriptionCommand;
import com.bbva.ethermobilesdk.tokencompat.plugin.command.SetTokenOathCommand;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r7.b;
import r7.c;
import r7.d;
import r7.e;
import r7.f;
import r7.h;
import z6.g;
import z6.v;

/* JADX INFO: compiled from: EtherTokenCompatCommandFactory.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0016\b\u0002\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005¢\u0006\u0002\u0010\b¨\u0006\t"}, d2 = {"Lcom/bbva/ethermobilesdk/tokencompat/plugin/EtherTokenCompatCommandFactory;", "Lcom/bbva/androidtoolkit/plugin/command/factory/CommandFactory;", "tokenCompatConfig", "Lcom/bbva/ethermobilesdk/tokencompat/TokenCompatConfig;", "onCreated", "Lkotlin/Function1;", "Lcom/bbva/ethermobilesdk/tokencompat/TokenCompat;", "", "(Lcom/bbva/ethermobilesdk/tokencompat/TokenCompatConfig;Lkotlin/jvm/functions/Function1;)V", "ethertoken-compat-plugin_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nEtherTokenCompatCommandFactory.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EtherTokenCompatCommandFactory.kt\ncom/bbva/ethermobilesdk/tokencompat/plugin/EtherTokenCompatCommandFactory\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,48:1\n1#2:49\n*E\n"})
public final class EtherTokenCompatCommandFactory extends CommandFactory {
    public /* synthetic */ EtherTokenCompatCommandFactory(TokenCompatConfig tokenCompatConfig, Function1 function1, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(tokenCompatConfig, (i10 & 2) != 0 ? null : function1);
    }

    public EtherTokenCompatCommandFactory(@NotNull TokenCompatConfig tokenCompatConfig, @Nullable Function1<? super TokenCompat, Unit> function1) {
        Intrinsics.checkNotNullParameter(tokenCompatConfig, "tokenCompatConfig");
        final TokenCompat tokenCompatCreateClient = Injector.INSTANCE.createClient(tokenCompatConfig);
        addCommandProvider(ChangePasswordCommand.ID, new v(2));
        int i10 = 0;
        addCommandProvider("delete", new b(tokenCompatCreateClient, i10));
        addCommandProvider(DeleteTokensCommand.ID, new c(tokenCompatCreateClient, i10));
        addCommandProvider(GenerateNextOtpCommand.ID, new d(tokenCompatCreateClient, i10));
        addCommandProvider(GenerateOtpCommand.ID, new e(tokenCompatCreateClient, i10));
        addCommandProvider(GetAppReportCommand.ID, new g(2));
        addCommandProvider(GetRemainingTimeCommand.ID, new f(tokenCompatCreateClient, i10));
        addCommandProvider("get", new r7.g(tokenCompatCreateClient, i10));
        addCommandProvider(GetTokenListCommand.ID, new h(tokenCompatCreateClient, i10));
        addCommandProvider(GetTokenOathCommand.ID, new j6.b(2));
        addCommandProvider(RegisterTokenCommand.ID, new i(tokenCompatCreateClient, 1));
        addCommandProvider(SetTokenDescriptionCommand.ID, new CommandProvider() { // from class: r7.a
            @Override // com.bbva.androidtoolkit.plugin.command.factory.CommandProvider
            public final AbstractCommand create() {
                TokenCompat this_apply = tokenCompatCreateClient;
                Intrinsics.checkNotNullParameter(this_apply, "$this_apply");
                return new SetTokenDescriptionCommand(this_apply);
            }
        });
        addCommandProvider(SetTokenOathCommand.ID, new q6.b(3));
        if (function1 != null) {
            function1.invoke(tokenCompatCreateClient);
        }
    }
}
