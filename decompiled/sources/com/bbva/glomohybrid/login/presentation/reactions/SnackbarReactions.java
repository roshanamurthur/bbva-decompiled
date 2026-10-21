package com.bbva.glomohybrid.login.presentation.reactions;

import com.bbva.cellscore.web.model.channel.WebChannel;
import com.bbva.glomohybrid.base.cells.BaseReaction;
import com.bbva.glomohybrid.base.cells.channels.CellsChannels;
import com.bbva.glomohybrid.base.cells.channels.SnackbarChannels;
import com.bbva.glomohybrid.base.cells.helper.PageReactionDelegator;
import com.bbva.glomohybrid.base.snackbar.SnackBarDelegate;
import com.bbva.glomohybrid.base.snackbar.SnackbarSpec;
import i8.g;
import i8.h;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: SnackbarReactions.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\b"}, d2 = {"Lcom/bbva/glomohybrid/login/presentation/reactions/SnackbarReactions;", "Lcom/bbva/glomohybrid/base/cells/helper/PageReactionDelegator;", "", "configure", "Lcom/bbva/glomohybrid/base/cells/BaseReaction;", "baseReaction", "<init>", "(Lcom/bbva/glomohybrid/base/cells/BaseReaction;)V", "Login_mexicoGoogleRelease"}, k = 1, mv = {1, 9, 0})
public final class SnackbarReactions implements PageReactionDelegator {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NotNull
    public final BaseReaction f33502p0;

    public SnackbarReactions(@NotNull BaseReaction baseReaction) {
        Intrinsics.checkNotNullParameter(baseReaction, "baseReaction");
        this.f33502p0 = baseReaction;
    }

    @Override // com.bbva.glomohybrid.base.cells.helper.PageReactionDelegator
    public void configure() {
        WebChannel<SnackbarSpec> snackbarChannel = SnackbarChannels.INSTANCE.getSnackbarChannel();
        BaseReaction baseReaction = this.f33502p0;
        baseReaction.reactTo(snackbarChannel).then().inside("login-view-model", SnackBarDelegate.class).doReactionAndCleanChannel(new g(1));
        baseReaction.reactTo(CellsChannels.INSTANCE.getInactiveChannel()).then().inside("login-view-model", SnackBarDelegate.class).doReactionAndCleanChannel(new h(1));
    }
}
