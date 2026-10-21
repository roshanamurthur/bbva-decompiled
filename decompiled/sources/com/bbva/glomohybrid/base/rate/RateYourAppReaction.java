package com.bbva.glomohybrid.base.rate;

import android.app.Activity;
import com.bbva.cellscore.channel.builder.refactor.ReactorCoreBuilder;
import com.bbva.cellscore.channel.model.Reaction;
import com.bbva.component.dm.actionlauncher.ActionLauncherComponent;
import com.bbva.component.dm.actionlauncher.model.Action;
import com.bbva.ethermobilesdk.geolocation.utils.ConstantsKt;
import com.bbva.glomohybrid.base.cells.BaseReaction;
import com.bbva.glomohybrid.base.cells.channels.CellsChannels;
import com.bbva.glomohybrid.base.cells.constants.ActionConstants;
import com.bbva.glomohybrid.base.cells.helper.PageReactionDelegator;
import com.bbva.glomohybrid.base.datasource.RateYourAppDataSource;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: RateYourAppReaction.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\u000e"}, d2 = {"Lcom/bbva/glomohybrid/base/rate/RateYourAppReaction;", "Lcom/bbva/glomohybrid/base/cells/helper/PageReactionDelegator;", "", "configure", "Landroid/app/Activity;", "q0", "Landroid/app/Activity;", "getActivity", "()Landroid/app/Activity;", ConstantsKt.DETECTED_ACTIVITY_EXTRA_ID, "Lcom/bbva/glomohybrid/base/cells/BaseReaction;", "pageReaction", "<init>", "(Lcom/bbva/glomohybrid/base/cells/BaseReaction;Landroid/app/Activity;)V", "Base_release"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nRateYourAppReaction.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RateYourAppReaction.kt\ncom/bbva/glomohybrid/base/rate/RateYourAppReaction\n+ 2 CellsReactor.kt\ncom/bbva/glomohybrid/base/cells/CellsReactor\n*L\n1#1,44:1\n25#2,8:45\n25#2,8:53\n*S KotlinDebug\n*F\n+ 1 RateYourAppReaction.kt\ncom/bbva/glomohybrid/base/rate/RateYourAppReaction\n*L\n35#1:45,8\n40#1:53,8\n*E\n"})
public final class RateYourAppReaction implements PageReactionDelegator {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NotNull
    public final BaseReaction f31474p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Activity activity;

    public RateYourAppReaction(@NotNull BaseReaction pageReaction, @NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(pageReaction, "pageReaction");
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f31474p0 = pageReaction;
        this.activity = activity;
    }

    @Override // com.bbva.glomohybrid.base.cells.helper.PageReactionDelegator
    public void configure() {
        BaseReaction baseReaction = this.f31474p0;
        RateYourAppDataSource rateYourAppDataSource = (RateYourAppDataSource) baseReaction.getComponent(RateYourAppDataSource.ID);
        Intrinsics.checkNotNull(rateYourAppDataSource);
        baseReaction.addComponent(RateYourAppComponent.ID, new RateYourAppComponent(rateYourAppDataSource));
        ReactorCoreBuilder.ReactionBuilder reactionBuilderThen = baseReaction.reactTo(CellsChannels.INSTANCE.getRateYourAppChannel()).then();
        Intrinsics.checkNotNullExpressionValue(reactionBuilderThen, "then(...)");
        Intrinsics.checkNotNullExpressionValue(reactionBuilderThen.inside(RateYourAppComponent.ID, RateYourAppComponent.class).delay(0L).doReaction(new Reaction.ReactionExecution() { // from class: com.bbva.glomohybrid.base.rate.RateYourAppReaction$showRateYourAppDialog$$inlined$reactIn$default$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.bbva.cellscore.channel.model.Reaction.ReactionExecution
            public final void execute(P p4, Object obj) {
                Intrinsics.checkNotNull(p4);
                ((RateYourAppComponent) p4).showDialog(this.f31477p0.getActivity());
            }
        }), "doReaction(...)");
        ReactorCoreBuilder.ReactionBuilder reactionBuilderThen2 = baseReaction.whenever(RateYourAppDialogFragment.ID).doAction(ActionConstants.INSTANCE.getACTION_RATE_APP()).then();
        Intrinsics.checkNotNullExpressionValue(reactionBuilderThen2, "then(...)");
        Intrinsics.checkNotNullExpressionValue(reactionBuilderThen2.inside(ActionLauncherComponent.ID, ActionLauncherComponent.class).delay(0L).doReaction(new Reaction.ReactionExecution() { // from class: com.bbva.glomohybrid.base.rate.RateYourAppReaction$showMarket$$inlined$reactIn$default$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.bbva.cellscore.channel.model.Reaction.ReactionExecution
            public final void execute(P p4, Object obj) {
                Intrinsics.checkNotNull(p4);
                RateYourAppReaction rateYourAppReaction = this.f31476p0;
                Activity activity = rateYourAppReaction.getActivity();
                String packageName = rateYourAppReaction.getActivity().getPackageName();
                Intrinsics.checkNotNullExpressionValue(packageName, "getPackageName(...)");
                ((ActionLauncherComponent) p4).launch(activity, new Action.Market(packageName, null, 2, null));
            }
        }), "doReaction(...)");
    }

    @NotNull
    public final Activity getActivity() {
        return this.activity;
    }
}
