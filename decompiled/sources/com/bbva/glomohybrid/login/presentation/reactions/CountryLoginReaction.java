package com.bbva.glomohybrid.login.presentation.reactions;

import android.app.Activity;
import com.bbva.akamaibase.AkamaiReactions;
import com.bbva.cellscore.channel.builder.refactor.ReactorCoreBuilder;
import com.bbva.cellscore.channel.model.Reaction;
import com.bbva.component.dm.biometriclogin.presentation.reactions.BiometricLoginAnalyticsReactions;
import com.bbva.component.dm.biometriclogin.presentation.reactions.BiometricLoginReactions;
import com.bbva.ethermobilesdk.geolocation.utils.ConstantsKt;
import com.bbva.glomohybrid.base.cells.BaseReaction;
import com.bbva.glomohybrid.base.cells.helper.PageReactionDelegator;
import com.bbva.glomohybrid.base.extensions.PageDelegatorExtensionsKt;
import com.bbva.glomohybrid.login.R;
import com.bbva.glomohybrid.login.channels.MagicLogChannels;
import com.bbva.glomohybrid.login.domain.model.CustomerIndicatorsLogins;
import com.bbva.glomohybrid.login.domain.usecase.GetCustomerLoginsUseCase;
import com.bbva.glomohybrid.login.presentation.viewmodel.LoginGlobalViewModel;
import com.bbva.glomohybrid.login.presentation.viewmodel.LoginViewModel;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import u4.d;
import u4.e;

/* JADX INFO: compiled from: CountryLoginReaction.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\n"}, d2 = {"Lcom/bbva/glomohybrid/login/presentation/reactions/CountryLoginReaction;", "Lcom/bbva/glomohybrid/base/cells/helper/PageReactionDelegator;", "", "configure", "Lcom/bbva/glomohybrid/base/cells/BaseReaction;", "pageReaction", "Landroid/app/Activity;", ConstantsKt.DETECTED_ACTIVITY_EXTRA_ID, "<init>", "(Lcom/bbva/glomohybrid/base/cells/BaseReaction;Landroid/app/Activity;)V", "Login_mexicoGoogleRelease"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nCountryLoginReaction.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CountryLoginReaction.kt\ncom/bbva/glomohybrid/login/presentation/reactions/CountryLoginReaction\n+ 2 CellsReactor.kt\ncom/bbva/glomohybrid/base/cells/CellsReactor\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,67:1\n25#2,8:68\n1#3:76\n*S KotlinDebug\n*F\n+ 1 CountryLoginReaction.kt\ncom/bbva/glomohybrid/login/presentation/reactions/CountryLoginReaction\n*L\n61#1:68,8\n*E\n"})
public final class CountryLoginReaction implements PageReactionDelegator {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NotNull
    public final BaseReaction f33483p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    @NotNull
    public final Activity f33484q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    @NotNull
    public final Lazy f33485r0;

    /* JADX INFO: compiled from: CountryLoginReaction.kt */
    public static final class a extends Lambda implements Function0<List<? extends PageReactionDelegator>> {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final List<? extends PageReactionDelegator> invoke() {
            CountryLoginReaction countryLoginReaction = CountryLoginReaction.this;
            return CollectionsKt__CollectionsKt.listOf((Object[]) new PageReactionDelegator[]{new AkamaiReactions(countryLoginReaction.f33483p0, countryLoginReaction.f33484q0), new AnalyticsLoginReaction(countryLoginReaction.f33483p0, null, 2, null), new BiometricLoginReactions(countryLoginReaction.f33483p0, countryLoginReaction.f33484q0, "login-view-model", String.valueOf(R.id.loaderView), null, 16, null), new BiometricLoginAnalyticsReactions(countryLoginReaction.f33483p0)});
        }
    }

    public CountryLoginReaction(@NotNull BaseReaction pageReaction, @NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(pageReaction, "pageReaction");
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f33483p0 = pageReaction;
        this.f33484q0 = activity;
        this.f33485r0 = LazyKt__LazyJVMKt.lazy(new a());
    }

    @Override // com.bbva.glomohybrid.base.cells.helper.PageReactionDelegator
    public void configure() {
        PageDelegatorExtensionsKt.configureAll((List) this.f33485r0.getValue());
        BaseReaction baseReaction = this.f33483p0;
        ReactorCoreBuilder.ReactionBuilder reactionBuilderAnd = baseReaction.whenever(GetCustomerLoginsUseCase.ID).doAction(GetCustomerLoginsUseCase.ACTION_GET_CUSTOMER_INDICATORS_LOGINS_SUCCESS).then().inside("login-view-model", LoginGlobalViewModel.class).doReaction(new d(3)).and();
        Intrinsics.checkNotNullExpressionValue(reactionBuilderAnd, "and(...)");
        Intrinsics.checkNotNullExpressionValue(reactionBuilderAnd.inside("login-view-model", LoginViewModel.class).delay(0L).doReaction(new Reaction.ReactionExecution() { // from class: com.bbva.glomohybrid.login.presentation.reactions.CountryLoginReaction$notifyRememberedUserIsSetCustomerLogins$$inlined$reactIn$default$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.bbva.cellscore.channel.model.Reaction.ReactionExecution
            public final void execute(P p4, CustomerIndicatorsLogins customerIndicatorsLogins) {
                Intrinsics.checkNotNull(p4);
                ((LoginViewModel) p4).saveUserDataAndNotifyRememberedUserCustomerLogins(customerIndicatorsLogins);
            }
        }), "doReaction(...)");
        baseReaction.reactTo(MagicLogChannels.INSTANCE.getMagicLogDataChannel()).then().inside("login-view-model", LoginViewModel.class).doReactionAndCleanChannel(new e(2));
    }
}
