package com.bbva.component.dm.biometriclogin.presentation.reactions;

import android.app.Activity;
import androidx.databinding.f;
import androidx.fragment.app.FragmentActivity;
import com.bbva.cells.component.kit.model.ActionSpec;
import com.bbva.cellscore.channel.builder.refactor.ReactorCoreBuilder;
import com.bbva.cellscore.channel.model.Channel;
import com.bbva.cellscore.channel.model.Reaction;
import com.bbva.component.dm.analytics.AnalyticsManager;
import com.bbva.component.dm.biometriclogin.BiometricAuthenticationDataManager;
import com.bbva.component.dm.biometriclogin.domain.model.BiometricErrorNavigation;
import com.bbva.component.dm.biometriclogin.domain.model.BiometryAuthResult;
import com.bbva.component.dm.biometriclogin.domain.model.BiometryAuthState;
import com.bbva.component.dm.biometriclogin.presentation.model.BiometricLoginConstants;
import com.bbva.component.dm.biometriclogin.presentation.reactions.BiometricLoginReactions;
import com.bbva.component.dm.biometriclogin.presentation.view.DefaultErrorScreenUtils;
import com.bbva.component.dm.biometriclogin.presentation.view.ErrorScreenUtils;
import com.bbva.component.dm.biometriclogin.presentation.viewmodel.BiometricLoginViewModel;
import com.bbva.component.ui.loader.LoaderViewModel;
import com.bbva.component.ui.modal.halfmodal.HalfModalComponent;
import com.bbva.ethermobilesdk.geolocation.utils.ConstantsKt;
import com.bbva.glomoconfig.factory.GlobalHalfModalComponentFactory;
import com.bbva.glomoconfig.factory.HalfModalComponentFactory;
import com.bbva.glomohybrid.base.Animation;
import com.bbva.glomohybrid.base.cells.BaseReaction;
import com.bbva.glomohybrid.base.cells.channels.BiometricAuthenticationChannels;
import com.bbva.glomohybrid.base.cells.channels.CellsChannels;
import com.bbva.glomohybrid.base.cells.constants.ActionConstants;
import com.bbva.glomohybrid.base.cells.helper.PageReactionDelegator;
import com.bbva.glomohybrid.base.router.Router;
import j4.b;
import k4.d;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import w4.h;
import w4.i;
import w4.j;
import w4.k;
import w4.l;
import w4.n;
import w4.o;
import w4.q;
import w4.r;
import w4.s;
import z0.a;

/* JADX INFO: compiled from: BiometricLoginReactions.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u000f"}, d2 = {"Lcom/bbva/component/dm/biometriclogin/presentation/reactions/BiometricLoginReactions;", "Lcom/bbva/glomohybrid/base/cells/helper/PageReactionDelegator;", "", "configure", "Lcom/bbva/glomohybrid/base/cells/BaseReaction;", "baseReaction", "Landroid/app/Activity;", ConstantsKt.DETECTED_ACTIVITY_EXTRA_ID, "", "viewModelId", "loaderViewId", "Lcom/bbva/component/dm/biometriclogin/presentation/view/ErrorScreenUtils;", "errorScreenUtils", "<init>", "(Lcom/bbva/glomohybrid/base/cells/BaseReaction;Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Lcom/bbva/component/dm/biometriclogin/presentation/view/ErrorScreenUtils;)V", "BiometricAuthentication_mexicoRelease"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nBiometricLoginReactions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BiometricLoginReactions.kt\ncom/bbva/component/dm/biometriclogin/presentation/reactions/BiometricLoginReactions\n+ 2 CellsReactor.kt\ncom/bbva/glomohybrid/base/cells/CellsReactor\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,303:1\n25#2,8:304\n25#2,8:312\n1#3:320\n*S KotlinDebug\n*F\n+ 1 BiometricLoginReactions.kt\ncom/bbva/component/dm/biometriclogin/presentation/reactions/BiometricLoginReactions\n*L\n276#1:304,8\n283#1:312,8\n*E\n"})
public final class BiometricLoginReactions implements PageReactionDelegator {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NotNull
    public final BaseReaction f27501p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    @NotNull
    public final Activity f27502q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    @NotNull
    public final String f27503r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    @NotNull
    public final String f27504s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    @NotNull
    public final ErrorScreenUtils f27505t0;

    public BiometricLoginReactions(@NotNull BaseReaction baseReaction, @NotNull Activity activity, @NotNull String viewModelId, @NotNull String loaderViewId, @NotNull ErrorScreenUtils errorScreenUtils) {
        Intrinsics.checkNotNullParameter(baseReaction, "baseReaction");
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(viewModelId, "viewModelId");
        Intrinsics.checkNotNullParameter(loaderViewId, "loaderViewId");
        Intrinsics.checkNotNullParameter(errorScreenUtils, "errorScreenUtils");
        this.f27501p0 = baseReaction;
        this.f27502q0 = activity;
        this.f27503r0 = viewModelId;
        this.f27504s0 = loaderViewId;
        this.f27505t0 = errorScreenUtils;
    }

    public static ReactorCoreBuilder.ReactionExecutionBuilder a(ReactorCoreBuilder.ReactionBuilder reactionBuilder) {
        return reactionBuilder.inside(BiometricAuthenticationDataManager.ID, BiometricAuthenticationDataManager.class);
    }

    public static ReactorCoreBuilder.ReactionExecutionBuilder b(ReactorCoreBuilder.ReactionBuilder reactionBuilder) {
        return reactionBuilder.inside(Router.ID, Router.class);
    }

    @Override // com.bbva.glomohybrid.base.cells.helper.PageReactionDelegator
    public void configure() {
        Channel<Void> changeUserChannel = CellsChannels.INSTANCE.getChangeUserChannel();
        BaseReaction baseReaction = this.f27501p0;
        ReactorCoreBuilder.ReactionBuilder reactionBuilderThen = baseReaction.reactTo(changeUserChannel).then();
        Intrinsics.checkNotNullExpressionValue(reactionBuilderThen, "then(...)");
        ReactorCoreBuilder.AndReactionBuilder andReactionBuilderDoReaction = reactionBuilderThen.inside(BiometricAuthenticationDataManager.ID, BiometricAuthenticationDataManager.class).delay(0L).doReaction(new Reaction.ReactionExecution() { // from class: com.bbva.component.dm.biometriclogin.presentation.reactions.BiometricLoginReactions$deleteAuthenticators$$inlined$reactIn$default$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.bbva.cellscore.channel.model.Reaction.ReactionExecution
            public final void execute(P p4, Object obj) {
                Intrinsics.checkNotNull(p4);
                ((BiometricAuthenticationDataManager) p4).deleteAuthenticators(this.f27506p0.f27502q0);
            }
        });
        Intrinsics.checkNotNullExpressionValue(andReactionBuilderDoReaction, "doReaction(...)");
        ReactorCoreBuilder.ReactionBuilder reactionBuilderAnd = andReactionBuilderDoReaction.and();
        String str = this.f27503r0;
        final int i10 = 0;
        reactionBuilderAnd.inside(str, BiometricLoginViewModel.class).doReactionAndCleanChannel(new k(0));
        BiometricAuthenticationChannels biometricAuthenticationChannels = BiometricAuthenticationChannels.INSTANCE;
        final int i11 = 1;
        baseReaction.reactTo(biometricAuthenticationChannels.getRetryAuthChannel()).then().onlyIf(new d(1)).inside(str, BiometricLoginViewModel.class).doReactionAndCleanChannel(new l(0));
        ReactorCoreBuilder.ReactionBuilder reactionBuilderOnlyIf = baseReaction.reactTo(biometricAuthenticationChannels.getRetryAuthChannel()).then().onlyIf(new a(2));
        Intrinsics.checkNotNullExpressionValue(reactionBuilderOnlyIf, "onlyIf(...)");
        a(reactionBuilderOnlyIf).doReactionAndCleanChannel(new n(0));
        ReactorCoreBuilder.PlainActionBuilder plainActionBuilderWhenever = baseReaction.whenever(str);
        BiometricLoginViewModel.Companion companion = BiometricLoginViewModel.INSTANCE;
        ReactorCoreBuilder.ReactionBuilder reactionBuilderThen2 = plainActionBuilderWhenever.doAction(companion.getACTION_BIOMETRIC_AUTH()).then();
        Intrinsics.checkNotNullExpressionValue(reactionBuilderThen2, "then(...)");
        reactionBuilderThen2.inside(BiometricAuthenticationDataManager.ID, BiometricAuthenticationDataManager.class).doReactionAndCleanChannel(new o(this, 0));
        baseReaction.whenever(BiometricAuthenticationDataManager.ID).doAction(BiometricAuthenticationDataManager.ACTION_AUTHENTICATION_POSSIBLE).then().inside(str, BiometricLoginViewModel.class).doReactionAndCleanChannel(new Reaction.ReactionExecution(this) { // from class: w4.d

            /* JADX INFO: renamed from: q0, reason: collision with root package name */
            public final /* synthetic */ BiometricLoginReactions f94138q0;

            {
                this.f94138q0 = this;
            }

            @Override // com.bbva.cellscore.channel.model.Reaction.ReactionExecution
            public final void execute(Object obj, Object obj2) {
                int i12 = i10;
                BiometricLoginReactions this$0 = this.f94138q0;
                switch (i12) {
                    case 0:
                        BiometryAuthState biometryAuthState = (BiometryAuthState) obj2;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNull(biometryAuthState);
                        ((BiometricLoginViewModel) obj).updateBiometricAuthentication(biometryAuthState, this$0.f27502q0);
                        break;
                    default:
                        Router router = (Router) obj;
                        BiometricErrorNavigation biometricErrorNavigation = (BiometricErrorNavigation) obj2;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNull(router);
                        Activity activity = this$0.f27502q0;
                        Intrinsics.checkNotNull(biometricErrorNavigation);
                        Router.navigate$default(router, activity, this$0.f27505t0.errorScreenOf("biometry-error-retry", biometricErrorNavigation), Animation.SlideUp.INSTANCE, null, null, false, 56, null);
                        break;
                }
            }
        });
        ReactorCoreBuilder.ReactionBuilder reactionBuilderThen3 = baseReaction.whenever(str).doAction(companion.getACTION_BIOMETRIC_CHECK()).then();
        Intrinsics.checkNotNullExpressionValue(reactionBuilderThen3, "then(...)");
        a(reactionBuilderThen3).doReactionAndCleanChannel(new Reaction.ReactionExecution() { // from class: w4.u
            @Override // com.bbva.cellscore.channel.model.Reaction.ReactionExecution
            public final void execute(Object obj, Object obj2) {
                BiometricLoginReactions this$0 = this.f94157p0;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                ((BiometricAuthenticationDataManager) obj).checkIsAuthenticationAvailable(this$0.f27502q0, false);
            }
        });
        ReactorCoreBuilder.PlainActionBuilder plainActionBuilderWhenever2 = baseReaction.whenever(BiometricAuthenticationDataManager.ID);
        ActionSpec<BiometryAuthResult> actionSpec = BiometricAuthenticationDataManager.ACTION_BIOMETRICS_AUTHENTICATE;
        ReactorCoreBuilder.ReactionBuilder reactionBuilderOnlyIf2 = plainActionBuilderWhenever2.doAction(actionSpec).then().onlyIf(new i(0));
        Intrinsics.checkNotNullExpressionValue(reactionBuilderOnlyIf2, "onlyIf(...)");
        ReactorCoreBuilder.AndReactionBuilder andReactionBuilderDoReaction2 = reactionBuilderOnlyIf2.inside(this.f27504s0, LoaderViewModel.class).delay(0L).doReaction(new Reaction.ReactionExecution() { // from class: com.bbva.component.dm.biometriclogin.presentation.reactions.BiometricLoginReactions$showLoader$$inlined$reactIn$default$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.bbva.cellscore.channel.model.Reaction.ReactionExecution
            public final void execute(P p4, Object obj) {
                Intrinsics.checkNotNull(p4);
                LoaderViewModel loaderViewModel = (LoaderViewModel) p4;
                loaderViewModel.show();
                loaderViewModel.nextStep();
            }
        });
        Intrinsics.checkNotNullExpressionValue(andReactionBuilderDoReaction2, "doReaction(...)");
        andReactionBuilderDoReaction2.and().onlyIf(new f()).inside(str, BiometricLoginViewModel.class).doReactionAndCleanChannel(new u4.f(1));
        baseReaction.whenever(BiometricAuthenticationDataManager.ID).doAction(actionSpec).then().onlyIf(new w4.a(1)).inside(str, BiometricLoginViewModel.class).doReactionAndCleanChannel(new b(1));
        ReactorCoreBuilder.ReactionBuilder reactionBuilderOnlyIf3 = baseReaction.whenever(str).doAction(companion.getACTION_BIOMETRIC_ERROR()).then().onlyIf(new i8.d(1));
        Intrinsics.checkNotNullExpressionValue(reactionBuilderOnlyIf3, "onlyIf(...)");
        b(reactionBuilderOnlyIf3).doReactionAndCleanChannel(new Reaction.ReactionExecution(this) { // from class: w4.d

            /* JADX INFO: renamed from: q0, reason: collision with root package name */
            public final /* synthetic */ BiometricLoginReactions f94138q0;

            {
                this.f94138q0 = this;
            }

            @Override // com.bbva.cellscore.channel.model.Reaction.ReactionExecution
            public final void execute(Object obj, Object obj2) {
                int i12 = i11;
                BiometricLoginReactions this$0 = this.f94138q0;
                switch (i12) {
                    case 0:
                        BiometryAuthState biometryAuthState = (BiometryAuthState) obj2;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNull(biometryAuthState);
                        ((BiometricLoginViewModel) obj).updateBiometricAuthentication(biometryAuthState, this$0.f27502q0);
                        break;
                    default:
                        Router router = (Router) obj;
                        BiometricErrorNavigation biometricErrorNavigation = (BiometricErrorNavigation) obj2;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNull(router);
                        Activity activity = this$0.f27502q0;
                        Intrinsics.checkNotNull(biometricErrorNavigation);
                        Router.navigate$default(router, activity, this$0.f27505t0.errorScreenOf("biometry-error-retry", biometricErrorNavigation), Animation.SlideUp.INSTANCE, null, null, false, 56, null);
                        break;
                }
            }
        });
        ReactorCoreBuilder.ReactionBuilder reactionBuilderOnlyIf4 = baseReaction.whenever(str).doAction(companion.getACTION_BIOMETRIC_ERROR()).then().onlyIf(new j(0));
        Intrinsics.checkNotNullExpressionValue(reactionBuilderOnlyIf4, "onlyIf(...)");
        a(reactionBuilderOnlyIf4).doReactionAndCleanChannel(new Reaction.ReactionExecution() { // from class: w4.m
            @Override // com.bbva.cellscore.channel.model.Reaction.ReactionExecution
            public final void execute(Object obj, Object obj2) {
                BiometricLoginReactions this$0 = this.f94148p0;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                HalfModalComponent halfModalComponentConfigure = HalfModalComponent.INSTANCE.getInstance().configure(GlobalHalfModalComponentFactory.INSTANCE.userLockOut());
                Activity activity = this$0.f27502q0;
                Intrinsics.checkNotNull(activity, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
                halfModalComponentConfigure.show((FragmentActivity) activity);
            }
        });
        ReactorCoreBuilder.ReactionBuilder reactionBuilderOnlyIf5 = baseReaction.whenever(str).doAction(companion.getACTION_BIOMETRIC_ERROR()).then().onlyIf(new com.google.android.gms.internal.mlkit_common.a());
        Intrinsics.checkNotNullExpressionValue(reactionBuilderOnlyIf5, "onlyIf(...)");
        ReactorCoreBuilder.ReactionBuilder reactionBuilderOnlyIf6 = b(reactionBuilderOnlyIf5).doReaction(new Reaction.ReactionExecution() { // from class: w4.p
            @Override // com.bbva.cellscore.channel.model.Reaction.ReactionExecution
            public final void execute(Object obj, Object obj2) {
                Router router = (Router) obj;
                BiometricErrorNavigation biometricErrorNavigation = (BiometricErrorNavigation) obj2;
                BiometricLoginReactions this$0 = this.f94152p0;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNull(router);
                Activity activity = this$0.f27502q0;
                Intrinsics.checkNotNull(biometricErrorNavigation);
                Router.navigate$default(router, activity, this$0.f27505t0.errorScreenOf("biometry-error", biometricErrorNavigation), Animation.SlideUp.INSTANCE, null, null, false, 56, null);
            }
        }).and().onlyIf(new q());
        Intrinsics.checkNotNullExpressionValue(reactionBuilderOnlyIf6, "onlyIf(...)");
        a(reactionBuilderOnlyIf6).doReactionAndCleanChannel(new r(this, 0));
        ReactorCoreBuilder.ReactionBuilder reactionBuilderOnlyIf7 = baseReaction.whenever(str).doAction(companion.getACTION_BIOMETRIC_ERROR()).then().onlyIf(new z0.b(2)).inside(AnalyticsManager.ID, AnalyticsManager.class).doReaction(new s(0)).and().onlyIf(new ai.a());
        Intrinsics.checkNotNullExpressionValue(reactionBuilderOnlyIf7, "onlyIf(...)");
        a(reactionBuilderOnlyIf7).doReactionAndCleanChannel(new Reaction.ReactionExecution() { // from class: w4.t
            @Override // com.bbva.cellscore.channel.model.Reaction.ReactionExecution
            public final void execute(Object obj, Object obj2) {
                BiometricLoginReactions this$0 = this.f94156p0;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                HalfModalComponent halfModalComponentConfigure = HalfModalComponent.INSTANCE.getInstance().configure(HalfModalComponentFactory.INSTANCE.biometricHalfModalFatalError());
                Activity activity = this$0.f27502q0;
                Intrinsics.checkNotNull(activity, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
                halfModalComponentConfigure.show((FragmentActivity) activity);
            }
        });
        ReactorCoreBuilder.ReactionBuilder reactionBuilderOnlyIf8 = baseReaction.whenever(str).doAction(companion.getACTION_BIOMETRIC_ERROR()).then().onlyIf(new b2.a(1));
        Intrinsics.checkNotNullExpressionValue(reactionBuilderOnlyIf8, "onlyIf(...)");
        b(reactionBuilderOnlyIf8).doReactionAndCleanChannel(new Reaction.ReactionExecution() { // from class: w4.v
            @Override // com.bbva.cellscore.channel.model.Reaction.ReactionExecution
            public final void execute(Object obj, Object obj2) {
                Router router = (Router) obj;
                BiometricErrorNavigation biometricErrorNavigation = (BiometricErrorNavigation) obj2;
                BiometricLoginReactions this$0 = this.f94158p0;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNull(router);
                Activity activity = this$0.f27502q0;
                Intrinsics.checkNotNull(biometricErrorNavigation);
                Router.navigate$default(router, activity, this$0.f27505t0.errorScreenOf("biometry-friendly-fraud", biometricErrorNavigation), Animation.SlideUp.INSTANCE, null, null, false, 56, null);
            }
        });
        ReactorCoreBuilder.ReactionBuilder reactionBuilderOnlyIf9 = baseReaction.whenever(str).doAction(companion.getACTION_BIOMETRIC_ERROR()).then().onlyIf(new androidx.camera.core.imagecapture.a());
        Intrinsics.checkNotNullExpressionValue(reactionBuilderOnlyIf9, "onlyIf(...)");
        b(reactionBuilderOnlyIf9).doReactionAndCleanChannel(new Reaction.ReactionExecution() { // from class: w4.e
            @Override // com.bbva.cellscore.channel.model.Reaction.ReactionExecution
            public final void execute(Object obj, Object obj2) {
                Router router = (Router) obj;
                BiometricLoginReactions this$0 = this.f94139p0;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNull(router);
                Router.navigate$default(router, this$0.f27502q0, this$0.f27505t0.errorScreenOf(BiometricLoginConstants.ERROR_EXPIRED_PASSWORD_YEARLY, ((BiometricErrorNavigation) obj2).getCom.bbva.component.dm.biometriclogin.presentation.reactions.BiometricLoginAnalyticsReactions.BIOMETRIC_TYPE java.lang.String()), Animation.SlideUp.INSTANCE, null, null, false, 56, null);
            }
        });
        ReactorCoreBuilder.ReactionBuilder reactionBuilderOnlyIf10 = baseReaction.whenever(str).doAction(companion.getACTION_BIOMETRIC_ERROR()).then().onlyIf(new ad.d());
        Intrinsics.checkNotNullExpressionValue(reactionBuilderOnlyIf10, "onlyIf(...)");
        b(reactionBuilderOnlyIf10).doReactionAndCleanChannel(new Reaction.ReactionExecution() { // from class: w4.f
            @Override // com.bbva.cellscore.channel.model.Reaction.ReactionExecution
            public final void execute(Object obj, Object obj2) {
                Router router = (Router) obj;
                BiometricLoginReactions this$0 = this.f94140p0;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNull(router);
                Router.navigate$default(router, this$0.f27502q0, this$0.f27505t0.errorScreenOf(BiometricLoginConstants.INACTIVE_ACCOUNT, ((BiometricErrorNavigation) obj2).getCom.bbva.component.dm.biometriclogin.presentation.reactions.BiometricLoginAnalyticsReactions.BIOMETRIC_TYPE java.lang.String()), Animation.SlideUp.INSTANCE, null, null, false, 56, null);
            }
        });
        ReactorCoreBuilder.ReactionBuilder reactionBuilderOnlyIf11 = baseReaction.whenever(str).doAction(companion.getACTION_BIOMETRIC_ERROR()).then().onlyIf(new androidx.camera.core.impl.utils.b());
        Intrinsics.checkNotNullExpressionValue(reactionBuilderOnlyIf11, "onlyIf(...)");
        b(reactionBuilderOnlyIf11).doReactionAndCleanChannel(new Reaction.ReactionExecution() { // from class: w4.g
            @Override // com.bbva.cellscore.channel.model.Reaction.ReactionExecution
            public final void execute(Object obj, Object obj2) {
                Router router = (Router) obj;
                BiometricLoginReactions this$0 = this.f94141p0;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNull(router);
                Router.navigate$default(router, this$0.f27502q0, this$0.f27505t0.errorScreenOf(BiometricLoginConstants.BLOCKED_PASSWORD, ((BiometricErrorNavigation) obj2).getCom.bbva.component.dm.biometriclogin.presentation.reactions.BiometricLoginAnalyticsReactions.BIOMETRIC_TYPE java.lang.String()), Animation.SlideUp.INSTANCE, null, null, false, 56, null);
            }
        });
        ReactorCoreBuilder.ReactionBuilder reactionBuilderOnlyIf12 = baseReaction.whenever(str).doAction(companion.getACTION_BIOMETRIC_ERROR()).then().onlyIf(new androidx.collection.k());
        Intrinsics.checkNotNullExpressionValue(reactionBuilderOnlyIf12, "onlyIf(...)");
        a(reactionBuilderOnlyIf12).doReactionAndCleanChannel(new h(this, 0));
        ReactorCoreBuilder.ReactionBuilder reactionBuilderThen4 = baseReaction.whenever(str).doAction(ActionConstants.INSTANCE.getACTION_REMEMBER_USER_COMPLETED()).then();
        Intrinsics.checkNotNullExpressionValue(reactionBuilderThen4, "then(...)");
        a(reactionBuilderThen4).doReactionAndCleanChannel(new androidx.constraintlayout.core.state.a());
        ReactorCoreBuilder.ReactionBuilder reactionBuilderThen5 = baseReaction.whenever(str).doAction(companion.getACTION_CLEAR_BIOMETRIC_AVAILABLE_STATE()).then();
        Intrinsics.checkNotNullExpressionValue(reactionBuilderThen5, "then(...)");
        a(reactionBuilderThen5).doReactionAndCleanChannel(new u4.d(1));
    }

    public /* synthetic */ BiometricLoginReactions(BaseReaction baseReaction, Activity activity, String str, String str2, ErrorScreenUtils errorScreenUtils, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(baseReaction, activity, str, str2, (i10 & 16) != 0 ? new DefaultErrorScreenUtils() : errorScreenUtils);
    }
}
