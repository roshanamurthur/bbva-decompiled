package com.bbva.plugin.naturalauthentication.command;

import bk.p;
import com.bbva.androidtoolkit.plugin.command.AbstractCommand;
import com.bbva.androidtoolkit.plugin.command.callback.CommandCallback;
import com.bbva.androidtoolkit.plugin.response.SimpleResponse;
import com.bbva.ethermobilesdk.naturalauthentication.NaturalAuthentication;
import ib.r;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: GetFacetsUrlCommand.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0014¨\u0006\n"}, d2 = {"Lcom/bbva/plugin/naturalauthentication/command/GetFacetsUrlCommand;", "Lcom/bbva/androidtoolkit/plugin/command/AbstractCommand;", "", "params", "Lcom/bbva/androidtoolkit/plugin/command/callback/CommandCallback;", "callback", "", "execute", "<init>", "()V", "naturalauthentication-plugin_release"}, k = 1, mv = {2, 0, 0})
public final class GetFacetsUrlCommand extends AbstractCommand {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NotNull
    public final Lazy f35870p0;

    public GetFacetsUrlCommand() {
        super(Void.class);
        this.f35870p0 = LazyKt__LazyJVMKt.lazy(new r());
    }

    @Override // com.bbva.androidtoolkit.plugin.command.AbstractCommand
    public void execute(@Nullable Void params, @NotNull CommandCallback callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        try {
            String facetsUrl = ((NaturalAuthentication) this.f35870p0.getValue()).getFacetsUrl();
            if (facetsUrl == null) {
                facetsUrl = "";
            }
            callback.sendEvent(SimpleResponse.toJson(p.mapOf(TuplesKt.to("url", facetsUrl))));
        } catch (Exception unused) {
            callback.sendError(CommandError.ErrorGetFacetsUrl);
        }
    }
}
