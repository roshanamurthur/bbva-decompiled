package com.bbva.plugin.naturalauthentication.command;

import com.bbva.androidtoolkit.plugin.command.AbstractCommand;
import com.bbva.androidtoolkit.plugin.command.callback.CommandCallback;
import com.bbva.ethermobilesdk.naturalauthentication.NaturalAuthentication;
import com.bbva.plugin.naturalauthentication.domain.model.FacetsUrlParams;
import ib.d;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: SetFacetsUrlCommand.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0014¨\u0006\n"}, d2 = {"Lcom/bbva/plugin/naturalauthentication/command/SetFacetsUrlCommand;", "Lcom/bbva/androidtoolkit/plugin/command/AbstractCommand;", "Lcom/bbva/plugin/naturalauthentication/domain/model/FacetsUrlParams;", "params", "Lcom/bbva/androidtoolkit/plugin/command/callback/CommandCallback;", "callback", "", "execute", "<init>", "()V", "naturalauthentication-plugin_release"}, k = 1, mv = {2, 0, 0})
public final class SetFacetsUrlCommand extends AbstractCommand<FacetsUrlParams> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NotNull
    public final Lazy f35880p0;

    public SetFacetsUrlCommand() {
        super(FacetsUrlParams.class);
        this.f35880p0 = LazyKt__LazyJVMKt.lazy(new d(1));
    }

    @Override // com.bbva.androidtoolkit.plugin.command.AbstractCommand
    public void execute(@NotNull FacetsUrlParams params, @NotNull CommandCallback callback) {
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(callback, "callback");
        NaturalAuthentication naturalAuthentication = (NaturalAuthentication) this.f35880p0.getValue();
        if (naturalAuthentication == null) {
            callback.sendError(CommandError.ErrorSettingFacetsUrl);
        } else {
            naturalAuthentication.setFacetsUrl(params.getFacetsUrl());
            callback.sendEvent();
        }
    }
}
