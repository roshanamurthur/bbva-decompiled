package com.bbva.cellscore.reactor;

import android.os.Bundle;
import com.bbva.cells.components.type.CellsComponent;
import com.bbva.cellscore.channel.model.Reaction;
import com.bbva.component.dm.headers.interceptor.AccessToken;
import com.bbva.glomohybrid.AppReaction;
import com.bbva.glomohybrid.base.session.AuthTokenDispatcher;
import com.bbva.glomohybrid.base.session.Session;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class c implements Reaction.ReactionExecution {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ int f27045p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ Object f27046q0;

    public /* synthetic */ c(Object obj, int i10) {
        this.f27045p0 = i10;
        this.f27046q0 = obj;
    }

    @Override // com.bbva.cellscore.channel.model.Reaction.ReactionExecution
    public final void execute(Object obj, Object obj2) {
        int i10 = this.f27045p0;
        Object obj3 = this.f27046q0;
        switch (i10) {
            case 0:
                ((CellsComponent) obj).onMessage((String) obj3, (Bundle) obj2);
                break;
            default:
                AppReaction this$0 = (AppReaction) obj3;
                AccessToken accessToken = (AccessToken) obj2;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Session session = this$0.J0;
                Intrinsics.checkNotNull(accessToken);
                session.addAccessToken(accessToken);
                ((AuthTokenDispatcher) obj).sendAccessTokenToWeb(accessToken);
                break;
        }
    }
}
