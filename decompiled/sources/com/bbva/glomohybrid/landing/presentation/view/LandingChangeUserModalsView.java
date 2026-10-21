package com.bbva.glomohybrid.landing.presentation.view;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.bbva.cellswidgets.CellsButton;
import com.bbva.component.ui.modal.halfmodal.HalfModalComponent;
import com.bbva.ethermobilesdk.geolocation.utils.ConstantsKt;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.glomoconfig.factory.HalfModalComponentFactory;
import com.bbva.glomohybrid.base.models.ModalType;
import com.bbva.glomohybrid.landing.R;
import com.bbva.glomohybrid.ui.modals.FullScreenModal;
import com.bbva.glomohybrid.ui.modals.changeuser.ChangeUserFullScreenModalFactory;
import com.google.firebase.dynamiclinks.DynamicLink;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: LandingChangeUserModalsView.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0002\u0019\u001aB\u001f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\u0010\u001a\u00020\r8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, d2 = {"Lcom/bbva/glomohybrid/landing/presentation/view/LandingChangeUserModalsView;", "Lkotlinx/coroutines/CoroutineScope;", "Lcom/bbva/glomohybrid/base/models/ModalType;", "modal", "", "show", "Lkotlinx/coroutines/flow/Flow;", "Lcom/bbva/glomohybrid/landing/presentation/view/LandingChangeUserModalsView$Intent;", "v0", "Lkotlinx/coroutines/flow/Flow;", "getIntents", "()Lkotlinx/coroutines/flow/Flow;", "intents", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "Landroidx/fragment/app/FragmentActivity;", ConstantsKt.DETECTED_ACTIVITY_EXTRA_ID, "Lcom/bbva/glomohybrid/ui/modals/changeuser/ChangeUserFullScreenModalFactory;", "modalChangeUser", "Lcom/bbva/component/ui/modal/halfmodal/HalfModalComponent;", "halfModalComponent", "<init>", "(Landroidx/fragment/app/FragmentActivity;Lcom/bbva/glomohybrid/ui/modals/changeuser/ChangeUserFullScreenModalFactory;Lcom/bbva/component/ui/modal/halfmodal/HalfModalComponent;)V", "Intent", "Modal", "Landing_mexicoRelease"}, k = 1, mv = {1, 9, 0})
public final class LandingChangeUserModalsView implements CoroutineScope {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NotNull
    public final FragmentActivity f33089p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    @NotNull
    public final ChangeUserFullScreenModalFactory f33090q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    @NotNull
    public final HalfModalComponent f33091r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final /* synthetic */ CoroutineScope f33092s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    @NotNull
    public final List<String> f33093t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    @NotNull
    public final Channel<Intent> f33094u0;

    /* JADX INFO: renamed from: v0, reason: from kotlin metadata */
    @NotNull
    public final Flow<Intent> intents;

    /* JADX INFO: compiled from: LandingChangeUserModalsView.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/bbva/glomohybrid/landing/presentation/view/LandingChangeUserModalsView$Intent;", "", "()V", "ConfirmChangeUser", "OpenExternalLink", "Lcom/bbva/glomohybrid/landing/presentation/view/LandingChangeUserModalsView$Intent$ConfirmChangeUser;", "Lcom/bbva/glomohybrid/landing/presentation/view/LandingChangeUserModalsView$Intent$OpenExternalLink;", "Landing_mexicoRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class Intent {

        /* JADX INFO: compiled from: LandingChangeUserModalsView.kt */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, d2 = {"Lcom/bbva/glomohybrid/landing/presentation/view/LandingChangeUserModalsView$Intent$ConfirmChangeUser;", "Lcom/bbva/glomohybrid/landing/presentation/view/LandingChangeUserModalsView$Intent;", "()V", "equals", "", "other", "", GenerateActivationFormCommand.HASH_CODE, "", "toString", "", "Landing_mexicoRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class ConfirmChangeUser extends Intent {

            @NotNull
            public static final ConfirmChangeUser INSTANCE = new ConfirmChangeUser();

            public ConfirmChangeUser() {
                super(null);
            }

            public boolean equals(@Nullable Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof ConfirmChangeUser)) {
                    return false;
                }
                return true;
            }

            public int hashCode() {
                return -609097950;
            }

            @NotNull
            public String toString() {
                return "ConfirmChangeUser";
            }
        }

        /* JADX INFO: compiled from: LandingChangeUserModalsView.kt */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u0013\u0010\u0005\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001J\t\u0010\u0006\u001a\u00020\u0002HÖ\u0001J\t\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0013\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tHÖ\u0003R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, d2 = {"Lcom/bbva/glomohybrid/landing/presentation/view/LandingChangeUserModalsView$Intent$OpenExternalLink;", "Lcom/bbva/glomohybrid/landing/presentation/view/LandingChangeUserModalsView$Intent;", "", "component1", DynamicLink.Builder.KEY_LINK, "copy", "toString", "", GenerateActivationFormCommand.HASH_CODE, "", "other", "", "equals", "a", "Ljava/lang/String;", "getLink", "()Ljava/lang/String;", "<init>", "(Ljava/lang/String;)V", "Landing_mexicoRelease"}, k = 1, mv = {1, 9, 0})
        public static final /* data */ class OpenExternalLink extends Intent {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            @NotNull
            public final String link;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OpenExternalLink(@NotNull String link) {
                super(null);
                Intrinsics.checkNotNullParameter(link, "link");
                this.link = link;
            }

            public static /* synthetic */ OpenExternalLink copy$default(OpenExternalLink openExternalLink, String str, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = openExternalLink.link;
                }
                return openExternalLink.copy(str);
            }

            @NotNull
            /* JADX INFO: renamed from: component1, reason: from getter */
            public final String getLink() {
                return this.link;
            }

            @NotNull
            public final OpenExternalLink copy(@NotNull String link) {
                Intrinsics.checkNotNullParameter(link, "link");
                return new OpenExternalLink(link);
            }

            public boolean equals(@Nullable Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof OpenExternalLink) && Intrinsics.areEqual(this.link, ((OpenExternalLink) other).link);
            }

            @NotNull
            public final String getLink() {
                return this.link;
            }

            public int hashCode() {
                return this.link.hashCode();
            }

            @NotNull
            public String toString() {
                return ad.d.f(new StringBuilder("OpenExternalLink(link="), this.link, ")");
            }
        }

        public Intent() {
        }

        public /* synthetic */ Intent(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: compiled from: LandingChangeUserModalsView.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0001\nJ\u000f\u0010\u0005\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0003\u0010\u0004R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\u0004\u0082\u0001\u0001\u000b¨\u0006\f"}, d2 = {"Lcom/bbva/glomohybrid/landing/presentation/view/LandingChangeUserModalsView$Modal;", "", "", "getFragmentTag$Landing_mexicoRelease", "()Ljava/lang/String;", "getFragmentTag", "a", "Ljava/lang/String;", "getId", "id", "Simple", "Lcom/bbva/glomohybrid/landing/presentation/view/LandingChangeUserModalsView$Modal$Simple;", "Landing_mexicoRelease"}, k = 1, mv = {1, 9, 0})
    public static abstract class Modal {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final String id;

        /* JADX INFO: compiled from: LandingChangeUserModalsView.kt */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, d2 = {"Lcom/bbva/glomohybrid/landing/presentation/view/LandingChangeUserModalsView$Modal$Simple;", "Lcom/bbva/glomohybrid/landing/presentation/view/LandingChangeUserModalsView$Modal;", "()V", "equals", "", "other", "", GenerateActivationFormCommand.HASH_CODE, "", "toString", "", "Landing_mexicoRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class Simple extends Modal {

            @NotNull
            public static final Simple INSTANCE = new Simple();

            public Simple() {
                super("change_user_half_modal", null);
            }

            public boolean equals(@Nullable Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Simple)) {
                    return false;
                }
                return true;
            }

            public int hashCode() {
                return 1174014284;
            }

            @NotNull
            public String toString() {
                return "Simple";
            }
        }

        public Modal(String str, DefaultConstructorMarker defaultConstructorMarker) {
            this.id = str;
        }

        @NotNull
        public final String getFragmentTag$Landing_mexicoRelease() {
            return ad.d.f(new StringBuilder(), this.id, "-fragment");
        }

        @NotNull
        public final String getId() {
            return this.id;
        }
    }

    public LandingChangeUserModalsView(@NotNull FragmentActivity activity, @NotNull ChangeUserFullScreenModalFactory modalChangeUser, @NotNull HalfModalComponent halfModalComponent) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(modalChangeUser, "modalChangeUser");
        Intrinsics.checkNotNullParameter(halfModalComponent, "halfModalComponent");
        this.f33089p0 = activity;
        this.f33090q0 = modalChangeUser;
        this.f33091r0 = halfModalComponent;
        this.f33092s0 = CoroutineScopeKt.MainScope();
        this.f33093t0 = bk.d.listOf(Modal.Simple.INSTANCE.getFragmentTag$Landing_mexicoRelease());
        Channel<Intent> channelChannel$default = ChannelKt.Channel$default(0, null, null, 7, null);
        this.f33094u0 = channelChannel$default;
        this.intents = FlowKt.consumeAsFlow(channelChannel$default);
        activity.getSupportFragmentManager().registerFragmentLifecycleCallbacks(new FragmentManager.FragmentLifecycleCallbacks() { // from class: com.bbva.glomohybrid.landing.presentation.view.LandingChangeUserModalsView$lifecycleCallback$1
            @Override // androidx.fragment.app.FragmentManager.FragmentLifecycleCallbacks
            public void onFragmentViewCreated(@NotNull FragmentManager fm, @NotNull Fragment f6, @NotNull View v3, @Nullable Bundle b10) {
                Intrinsics.checkNotNullParameter(fm, "fm");
                Intrinsics.checkNotNullParameter(f6, "f");
                Intrinsics.checkNotNullParameter(v3, "v");
                LandingChangeUserModalsView.access$handleFragmentViewCreated(this.f33097p0, (DialogFragment) f6, v3);
            }
        }, false);
    }

    public static final void access$emitOpenLinkListener(LandingChangeUserModalsView landingChangeUserModalsView, String str) {
        landingChangeUserModalsView.getClass();
        BuildersKt__Builders_commonKt.launch$default(landingChangeUserModalsView, null, null, new a(landingChangeUserModalsView, str, null), 3, null);
    }

    public static final void access$emitPositiveIntent(LandingChangeUserModalsView landingChangeUserModalsView, Intent intent) {
        landingChangeUserModalsView.getClass();
        BuildersKt__Builders_commonKt.launch$default(landingChangeUserModalsView, null, null, new b(landingChangeUserModalsView, intent, null), 3, null);
    }

    public static final void access$handleFragmentViewCreated(LandingChangeUserModalsView landingChangeUserModalsView, DialogFragment dialogFragment, View view) {
        CellsButton cellsButton;
        landingChangeUserModalsView.getClass();
        String tag = dialogFragment.getTag();
        if (tag == null || !landingChangeUserModalsView.f33093t0.contains(tag) || (cellsButton = (CellsButton) view.findViewById(R.id.positiveButton)) == null) {
            return;
        }
        CellsButton.setOnClickListenerBlocked$default(cellsButton, 0L, new c(dialogFragment, landingChangeUserModalsView), 1, null);
    }

    public final void a(String str) {
        BuildersKt__Builders_commonKt.launch$default(this, null, null, new d(this.f33091r0.configure(HalfModalComponentFactory.INSTANCE.changeUser(str)).show(this.f33089p0), this, null), 3, null);
    }

    @Override // kotlinx.coroutines.CoroutineScope
    @NotNull
    public CoroutineContext getCoroutineContext() {
        return this.f33092s0.getCoroutineContext();
    }

    @NotNull
    public final Flow<Intent> getIntents() {
        return this.intents;
    }

    public final void show(@NotNull ModalType modal) {
        Intrinsics.checkNotNullParameter(modal, "modal");
        if (!(modal instanceof ModalType.ChangeUserWithFeaturesList) && !(modal instanceof ModalType.ChangeUserWithSigning)) {
            if (modal instanceof ModalType.ChangeUser) {
                a(((ModalType.ChangeUser) modal).getUserName());
                return;
            } else {
                a("");
                return;
            }
        }
        ChangeUserFullScreenModalFactory changeUserFullScreenModalFactory = this.f33090q0;
        FragmentActivity fragmentActivity = this.f33089p0;
        FullScreenModal.FullScreenModalConfig fullScreenModalConfigCreate = changeUserFullScreenModalFactory.create(fragmentActivity, modal);
        if (fullScreenModalConfigCreate != null) {
            FullScreenModal companion = FullScreenModal.INSTANCE.getInstance(fullScreenModalConfigCreate);
            companion.setConfirmListener(new e(this));
            companion.setOpenLinkListener(new n9.a(this));
            companion.show(fragmentActivity.getSupportFragmentManager(), fullScreenModalConfigCreate.getId());
        }
    }
}
