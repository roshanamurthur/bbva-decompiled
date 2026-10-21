package com.bbva.akamaibase;

import android.app.Activity;
import com.bbva.cells.component.kit.model.ActionSpec;
import com.bbva.cellscore.channel.builder.refactor.WriteOnBuilder;
import com.bbva.cellscore.channel.model.Channel;
import com.bbva.component.dm.akamai.interceptor.AkamaiInterceptorDataManager;
import com.bbva.ethermobilesdk.geolocation.utils.ConstantsKt;
import com.bbva.glomohybrid.base.cells.BaseReaction;
import com.bbva.glomohybrid.base.cells.channels.CellsChannels;
import com.bbva.glomohybrid.base.cells.helper.PageReactionDelegator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: AkamaiReactions.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\u000e"}, d2 = {"Lcom/bbva/akamaibase/AkamaiReactions;", "Lcom/bbva/glomohybrid/base/cells/helper/PageReactionDelegator;", "", "configure", "Landroid/app/Activity;", "q0", "Landroid/app/Activity;", "getActivity", "()Landroid/app/Activity;", ConstantsKt.DETECTED_ACTIVITY_EXTRA_ID, "Lcom/bbva/glomohybrid/base/cells/BaseReaction;", "pageReaction", "<init>", "(Lcom/bbva/glomohybrid/base/cells/BaseReaction;Landroid/app/Activity;)V", "akamaibase_release"}, k = 1, mv = {1, 9, 0})
public class AkamaiReactions implements PageReactionDelegator {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NotNull
    public final BaseReaction f26469p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Activity activity;

    public AkamaiReactions(@NotNull BaseReaction pageReaction, @NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(pageReaction, "pageReaction");
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f26469p0 = pageReaction;
        this.activity = activity;
    }

    @Override // com.bbva.glomohybrid.base.cells.helper.PageReactionDelegator
    public void configure() {
        CellsChannels cellsChannels = CellsChannels.INSTANCE;
        Channel<Object> logoutSuccessChannel = cellsChannels.getLogoutSuccessChannel();
        BaseReaction baseReaction = this.f26469p0;
        WriteOnBuilder.WritableActionBuilder writableActionBuilderWhen = baseReaction.writeOn(logoutSuccessChannel).when(AkamaiInterceptorDataManager.ID);
        ActionSpec<Object> actionSpec = AkamaiInterceptorDataManager.AKAMAI_BOT_ERROR;
        writableActionBuilderWhen.doAction(actionSpec);
        baseReaction.writeOn(cellsChannels.getShowGenericErrorChannel()).when(AkamaiInterceptorDataManager.ID).doAction(actionSpec);
    }

    @NotNull
    public final Activity getActivity() {
        return this.activity;
    }
}
