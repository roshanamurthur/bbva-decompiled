package com.bbva.glomohybrid.cellsweb.presentation.reactions;

import android.app.Activity;
import androidx.appcompat.widget.g0;
import com.bbva.cellscore.channel.builder.refactor.ReactorCoreBuilder;
import com.bbva.cellscore.channel.builder.refactor.WriteOnBuilder;
import com.bbva.cellscore.channel.model.Channel;
import com.bbva.cellscore.channel.model.Reaction;
import com.bbva.component.dm.anonymous.AnonymousInterceptorReactions;
import com.bbva.component.dm.header.customers.CustomerInterceptorDataManager;
import com.bbva.component.ic.security.SecurityDataManager;
import com.bbva.component.ic.security.utils.SecurityType;
import com.bbva.ethermobilesdk.geolocation.utils.ConstantsKt;
import com.bbva.glomohybrid.base.cells.BaseReaction;
import com.bbva.glomohybrid.base.cells.channels.CustomerContractsChannels;
import com.bbva.glomohybrid.base.cells.channels.EnrollmentChannels;
import com.bbva.glomohybrid.base.cells.channels.SigningChannels;
import com.bbva.glomohybrid.base.cells.constants.ActionConstants;
import com.bbva.glomohybrid.base.cells.helper.PageReactionDelegator;
import com.bbva.glomohybrid.base.extensions.PageDelegatorExtensionsKt;
import com.bbva.glomohybrid.cellsweb.presentation.channels.AppLifecycleChannels;
import com.bbva.glomohybrid.cellsweb.presentation.channels.CellsWebChannels;
import com.bbva.glomohybrid.cellsweb.presentation.verishow.reactions.HearingDisabilitiesReactions;
import com.bbva.glomohybrid.cellsweb.presentation.viewmodel.CellsWebViewModel;
import com.bbva.smartassistance.channels.SmartAssistanceChannels;
import i8.e;
import i8.f;
import i8.g;
import i8.h;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: CountryPageReactionDelegate.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\u000e"}, d2 = {"Lcom/bbva/glomohybrid/cellsweb/presentation/reactions/CountryPageReactionDelegate;", "Lcom/bbva/glomohybrid/base/cells/helper/PageReactionDelegator;", "", "configure", "Landroid/app/Activity;", "q0", "Landroid/app/Activity;", "getActivity", "()Landroid/app/Activity;", ConstantsKt.DETECTED_ACTIVITY_EXTRA_ID, "Lcom/bbva/glomohybrid/base/cells/BaseReaction;", "pageReaction", "<init>", "(Lcom/bbva/glomohybrid/base/cells/BaseReaction;Landroid/app/Activity;)V", "CellsWeb_mexicoRelease"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nCountryPageReactionDelegate.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CountryPageReactionDelegate.kt\ncom/bbva/glomohybrid/cellsweb/presentation/reactions/CountryPageReactionDelegate\n+ 2 CellsReactor.kt\ncom/bbva/glomohybrid/base/cells/CellsReactor\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,158:1\n34#2,7:159\n25#2,8:166\n34#2,7:174\n34#2,7:181\n25#2,8:188\n25#2,8:196\n1#3:204\n*S KotlinDebug\n*F\n+ 1 CountryPageReactionDelegate.kt\ncom/bbva/glomohybrid/cellsweb/presentation/reactions/CountryPageReactionDelegate\n*L\n62#1:159,7\n107#1:166,8\n128#1:174,7\n135#1:181,7\n149#1:188,8\n154#1:196,8\n*E\n"})
public final class CountryPageReactionDelegate implements PageReactionDelegator {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NotNull
    public final BaseReaction f31680p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Activity activity;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    @NotNull
    public final List<PageReactionDelegator> f31682r0;

    public CountryPageReactionDelegate(@NotNull BaseReaction pageReaction, @NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(pageReaction, "pageReaction");
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f31680p0 = pageReaction;
        this.activity = activity;
        this.f31682r0 = CollectionsKt__CollectionsKt.listOf((Object[]) new PageReactionDelegator[]{new AnonymousInterceptorReactions(pageReaction), new HearingDisabilitiesReactions(pageReaction), new UserTypeWebReactions(pageReaction, activity), new DynamicModulesReactions(pageReaction)});
    }

    @Override // com.bbva.glomohybrid.base.cells.helper.PageReactionDelegator
    public void configure() {
        EnrollmentChannels enrollmentChannels = EnrollmentChannels.INSTANCE;
        Channel<List<SecurityType>> naturalAuthSignRequest = enrollmentChannels.getNaturalAuthSignRequest();
        BaseReaction baseReaction = this.f31680p0;
        WriteOnBuilder.WritableActionBuilder writableActionBuilderWhen = baseReaction.writeOn(naturalAuthSignRequest).when(SecurityDataManager.ID);
        SecurityDataManager.Companion companion = SecurityDataManager.INSTANCE;
        writableActionBuilderWhen.doAction(companion.getOTP_ADDITIONAL_SECURITY_OPERATION());
        SigningChannels signingChannels = SigningChannels.INSTANCE;
        baseReaction.writeOn(signingChannels.getNaturalHeadersSignRequest()).when(SecurityDataManager.ID).doAction(companion.getOTP_HEADERS_SECURITY_OPERATION());
        ReactorCoreBuilder.ReactionBuilder reactionBuilderThen = baseReaction.reactTo(enrollmentChannels.getNaturalAuthSignResponse()).then();
        Intrinsics.checkNotNullExpressionValue(reactionBuilderThen, "then(...)");
        ReactorCoreBuilder.AndReactionBuilder andReactionBuilderDoReaction = reactionBuilderThen.inside(SecurityDataManager.ID, SecurityDataManager.class).delay(0L).doReaction(new Reaction.ReactionExecution() { // from class: com.bbva.glomohybrid.cellsweb.presentation.reactions.CountryPageReactionDelegate$setSecurityCode$$inlined$reactIn$default$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.bbva.cellscore.channel.model.Reaction.ReactionExecution
            public final void execute(P p4, Map<String, ? extends String> map) {
                Intrinsics.checkNotNull(p4);
                ((SecurityDataManager) p4).setAdditionalSecurityRequired(map);
            }
        });
        Intrinsics.checkNotNullExpressionValue(andReactionBuilderDoReaction, "doReaction(...)");
        ReactorCoreBuilder.ReactionBuilder reactionBuilderAnd = andReactionBuilderDoReaction.and();
        Intrinsics.checkNotNullExpressionValue(reactionBuilderAnd, "and(...)");
        ReactorCoreBuilder.ReactionBuilder reactionBuilderAnd2 = baseReaction.cleanChannel(reactionBuilderAnd, enrollmentChannels.getNaturalAuthSignResponse()).and();
        Intrinsics.checkNotNullExpressionValue(reactionBuilderAnd2, "and(...)");
        ReactorCoreBuilder.ReactionBuilder reactionBuilderAnd3 = baseReaction.cleanChannel(reactionBuilderAnd2, enrollmentChannels.getNaturalAuthSignRequest()).and();
        Intrinsics.checkNotNullExpressionValue(reactionBuilderAnd3, "and(...)");
        baseReaction.cleanChannel(reactionBuilderAnd3, signingChannels.getNaturalHeadersSignRequest());
        ReactorCoreBuilder.ReactionBuilder reactionBuilderThen2 = baseReaction.whenever(CustomerInterceptorDataManager.ID).doAction(CustomerInterceptorDataManager.INSTANCE.getACCESS_TOKEN_CHANGE()).then();
        Intrinsics.checkNotNullExpressionValue(reactionBuilderThen2, "then(...)");
        reactionBuilderThen2.inside("cells-web-view-model", CellsWebViewModel.class).delay(0L).doReactionAndCleanChannel(new Reaction.ReactionExecution() { // from class: com.bbva.glomohybrid.cellsweb.presentation.reactions.CountryPageReactionDelegate$setupChannels$lambda$10$$inlined$reactAndClean$default$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.bbva.cellscore.channel.model.Reaction.ReactionExecution
            public final void execute(P p4, String str) {
                Intrinsics.checkNotNull(p4);
                ((CellsWebViewModel) p4).storeToken(str);
            }
        });
        SmartAssistanceChannels smartAssistanceChannels = SmartAssistanceChannels.INSTANCE;
        baseReaction.reactTo(smartAssistanceChannels.getAskToSmartAssistance()).then().inside("cells-web-view-model", CellsWebViewModel.class).doReactionAndCleanChannel(new g0());
        baseReaction.reactTo(smartAssistanceChannels.getInitializeSmartAssistance()).then().inside("cells-web-view-model", CellsWebViewModel.class).doReactionAndCleanChannel(new e(0));
        baseReaction.reactTo(smartAssistanceChannels.getLogoutSmartAssistance()).then().inside("cells-web-view-model", CellsWebViewModel.class).doReaction(new f(0));
        baseReaction.reactTo(smartAssistanceChannels.getUpdateSmartAssistanceFlags()).then().inside("cells-web-view-model", CellsWebViewModel.class).doReaction(new g(0));
        CustomerContractsChannels customerContractsChannels = CustomerContractsChannels.INSTANCE;
        baseReaction.writeOn(customerContractsChannels.getRequestOtpForCustomerContractsChannel()).when(SecurityDataManager.ID).doAction(companion.getOTP_ADDITIONAL_SECURITY_OPERATION());
        ReactorCoreBuilder.ReactionBuilder reactionBuilderThen3 = baseReaction.reactTo(customerContractsChannels.getResponseOtpForCustomerContractsChannel()).then();
        Intrinsics.checkNotNullExpressionValue(reactionBuilderThen3, "then(...)");
        ReactorCoreBuilder.AndReactionBuilder andReactionBuilderDoReaction2 = reactionBuilderThen3.inside(SecurityDataManager.ID, SecurityDataManager.class).delay(0L).doReaction(new Reaction.ReactionExecution() { // from class: com.bbva.glomohybrid.cellsweb.presentation.reactions.CountryPageReactionDelegate$setSecurityCode$$inlined$reactIn$default$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.bbva.cellscore.channel.model.Reaction.ReactionExecution
            public final void execute(P p4, Map<String, ? extends String> map) {
                Intrinsics.checkNotNull(p4);
                ((SecurityDataManager) p4).setAdditionalSecurityRequired(map);
            }
        });
        Intrinsics.checkNotNullExpressionValue(andReactionBuilderDoReaction2, "doReaction(...)");
        ReactorCoreBuilder.ReactionBuilder reactionBuilderAnd4 = andReactionBuilderDoReaction2.and();
        Intrinsics.checkNotNullExpressionValue(reactionBuilderAnd4, "and(...)");
        baseReaction.cleanChannel(reactionBuilderAnd4, customerContractsChannels.getResponseOtpForCustomerContractsChannel());
        ReactorCoreBuilder.ReactionBuilder reactionBuilderThen4 = baseReaction.reactTo(customerContractsChannels.getCancelOperationCustomerContractsChannel()).then();
        Intrinsics.checkNotNullExpressionValue(reactionBuilderThen4, "then(...)");
        ReactorCoreBuilder.AndReactionBuilder andReactionBuilderDoReaction3 = reactionBuilderThen4.inside(SecurityDataManager.ID, SecurityDataManager.class).delay(0L).doReaction(new Reaction.ReactionExecution() { // from class: com.bbva.glomohybrid.cellsweb.presentation.reactions.CountryPageReactionDelegate$setupChannels$lambda$10$$inlined$reactIn$default$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.bbva.cellscore.channel.model.Reaction.ReactionExecution
            public final void execute(P p4, Object obj) {
                Intrinsics.checkNotNull(p4);
                ((SecurityDataManager) p4).cancelSecurityRequest();
            }
        });
        Intrinsics.checkNotNullExpressionValue(andReactionBuilderDoReaction3, "doReaction(...)");
        ReactorCoreBuilder.ReactionBuilder reactionBuilderAnd5 = andReactionBuilderDoReaction3.and();
        Intrinsics.checkNotNullExpressionValue(reactionBuilderAnd5, "and(...)");
        baseReaction.cleanChannel(reactionBuilderAnd5, customerContractsChannels.getCancelOperationCustomerContractsChannel());
        ReactorCoreBuilder.ReactionBuilder reactionBuilderThen5 = baseReaction.reactTo(CellsWebChannels.INSTANCE.getBackToWelcomeVideo()).then();
        Intrinsics.checkNotNullExpressionValue(reactionBuilderThen5, "then(...)");
        ReactorCoreBuilder.ReactionBuilder reactionBuilderAnd6 = baseReaction.closeScreen(reactionBuilderThen5).and();
        Intrinsics.checkNotNullExpressionValue(reactionBuilderAnd6, "and(...)");
        baseReaction.cleanChannel(reactionBuilderAnd6, new Channel[0]);
        baseReaction.reactTo(AppLifecycleChannels.INSTANCE.getInitializeLifecycleObserverChannel()).then().inside("cells-web-view-model", CellsWebViewModel.class).doReactionAndCleanChannel(new h(0));
        ReactorCoreBuilder.PlainActionBuilder plainActionBuilderWhenever = baseReaction.whenever("cells-web-view-model");
        ActionConstants actionConstants = ActionConstants.INSTANCE;
        ReactorCoreBuilder.ReactionBuilder reactionBuilderThen6 = plainActionBuilderWhenever.doAction(actionConstants.getACTION_SAVE_GLOMO_TOKEN()).then();
        Intrinsics.checkNotNullExpressionValue(reactionBuilderThen6, "then(...)");
        reactionBuilderThen6.inside("cells-web-view-model", CellsWebViewModel.class).delay(0L).doReactionAndCleanChannel(new Reaction.ReactionExecution() { // from class: com.bbva.glomohybrid.cellsweb.presentation.reactions.CountryPageReactionDelegate$setupChannels$lambda$10$$inlined$reactAndClean$default$2
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.bbva.cellscore.channel.model.Reaction.ReactionExecution
            public final void execute(P p4, String str) {
                Intrinsics.checkNotNull(p4);
                ((CellsWebViewModel) p4).saveGlomoToken(str);
            }
        });
        ReactorCoreBuilder.ReactionBuilder reactionBuilderThen7 = baseReaction.whenever("cells-web-view-model").doAction(actionConstants.getACTION_RESTORE_GLOMO_TOKEN()).then();
        Intrinsics.checkNotNullExpressionValue(reactionBuilderThen7, "then(...)");
        reactionBuilderThen7.inside("cells-web-view-model", CellsWebViewModel.class).delay(0L).doReactionAndCleanChannel(new Reaction.ReactionExecution() { // from class: com.bbva.glomohybrid.cellsweb.presentation.reactions.CountryPageReactionDelegate$setupChannels$lambda$10$$inlined$reactAndClean$default$3
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.bbva.cellscore.channel.model.Reaction.ReactionExecution
            public final void execute(P p4, Void r3) {
                Intrinsics.checkNotNull(p4);
                ((CellsWebViewModel) p4).restoreGlomoToken();
            }
        });
        ReactorCoreBuilder.ReactionBuilder reactionBuilderThen8 = baseReaction.reactTo(enrollmentChannels.getNaturalAuthSignCancelRequest()).then();
        Intrinsics.checkNotNullExpressionValue(reactionBuilderThen8, "then(...)");
        ReactorCoreBuilder.AndReactionBuilder andReactionBuilderDoReaction4 = reactionBuilderThen8.inside(SecurityDataManager.ID, SecurityDataManager.class).delay(0L).doReaction(new Reaction.ReactionExecution() { // from class: com.bbva.glomohybrid.cellsweb.presentation.reactions.CountryPageReactionDelegate$onCancelOTPRequest$$inlined$reactIn$default$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.bbva.cellscore.channel.model.Reaction.ReactionExecution
            public final void execute(P p4, Object obj) {
                Intrinsics.checkNotNull(p4);
                ((SecurityDataManager) p4).cancelSecurityRequest();
            }
        });
        Intrinsics.checkNotNullExpressionValue(andReactionBuilderDoReaction4, "doReaction(...)");
        ReactorCoreBuilder.ReactionBuilder reactionBuilderAnd7 = andReactionBuilderDoReaction4.and();
        Intrinsics.checkNotNullExpressionValue(reactionBuilderAnd7, "and(...)");
        ReactorCoreBuilder.ReactionBuilder reactionBuilderAnd8 = baseReaction.cleanChannel(reactionBuilderAnd7, enrollmentChannels.getNaturalAuthSignCancelRequest()).and();
        Intrinsics.checkNotNullExpressionValue(reactionBuilderAnd8, "and(...)");
        baseReaction.cleanChannel(reactionBuilderAnd8, enrollmentChannels.getNaturalAuthSignRequest());
        PageDelegatorExtensionsKt.configureAll(this.f31682r0);
    }

    @NotNull
    public final Activity getActivity() {
        return this.activity;
    }
}
