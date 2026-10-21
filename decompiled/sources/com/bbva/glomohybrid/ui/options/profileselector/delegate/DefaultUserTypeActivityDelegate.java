package com.bbva.glomohybrid.ui.options.profileselector.delegate;

import androidx.appcompat.app.AppCompatActivity;
import androidx.camera.core.imagecapture.a;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import com.bbva.ethermobilesdk.geolocation.utils.ConstantsKt;
import com.bbva.glomo.user.domain.model.RememberedUser;
import com.bbva.glomohybrid.ui.options.ListOptionFactory;
import com.bbva.glomohybrid.ui.options.profileselector.delegate.DefaultUserTypeActivityDelegate;
import com.bbva.glomohybrid.ui.options.profileselector.model.ProfileSelectorDialogState;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.koin.core.Koin;
import org.koin.core.component.KoinComponent;
import org.koin.core.component.KoinScopeComponent;
import org.koin.core.qualifier.QualifierKt;
import org.koin.core.qualifier.StringQualifier;
import org.koin.mp.KoinPlatformTools;

/* JADX INFO: compiled from: DefaultUserTypeActivityDelegate.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¨\u0006\r"}, d2 = {"Lcom/bbva/glomohybrid/ui/options/profileselector/delegate/DefaultUserTypeActivityDelegate;", "Lcom/bbva/glomohybrid/ui/options/profileselector/delegate/UserTypeActivityDelegate;", "Lorg/koin/core/component/KoinComponent;", "Landroidx/lifecycle/LifecycleOwner;", "owner", "", "registerObservers", "Landroidx/appcompat/app/AppCompatActivity;", ConstantsKt.DETECTED_ACTIVITY_EXTRA_ID, "Lcom/bbva/glomohybrid/ui/options/profileselector/delegate/UserTypeViewModelDelegate;", "viewModel", "<init>", "(Landroidx/appcompat/app/AppCompatActivity;Lcom/bbva/glomohybrid/ui/options/profileselector/delegate/UserTypeViewModelDelegate;)V", "gl-ui_mexicoRelease"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nDefaultUserTypeActivityDelegate.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DefaultUserTypeActivityDelegate.kt\ncom/bbva/glomohybrid/ui/options/profileselector/delegate/DefaultUserTypeActivityDelegate\n+ 2 KoinComponent.kt\norg/koin/core/component/KoinComponentKt\n*L\n1#1,64:1\n56#2,6:65\n*S KotlinDebug\n*F\n+ 1 DefaultUserTypeActivityDelegate.kt\ncom/bbva/glomohybrid/ui/options/profileselector/delegate/DefaultUserTypeActivityDelegate\n*L\n18#1:65,6\n*E\n"})
public final class DefaultUserTypeActivityDelegate implements UserTypeActivityDelegate, KoinComponent {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NotNull
    public final AppCompatActivity f34673p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    @NotNull
    public final UserTypeViewModelDelegate f34674q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    @NotNull
    public final Lazy f34675r0;

    public DefaultUserTypeActivityDelegate(@NotNull AppCompatActivity activity, @NotNull UserTypeViewModelDelegate viewModel) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        this.f34673p0 = activity;
        this.f34674q0 = viewModel;
        final StringQualifier stringQualifierNamed = QualifierKt.named(ListOptionFactory.ID);
        final Function0 function0 = null;
        this.f34675r0 = LazyKt__LazyJVMKt.lazy(KoinPlatformTools.INSTANCE.defaultLazyMode(), (Function0) new Function0<ListOptionFactory>() { // from class: com.bbva.glomohybrid.ui.options.profileselector.delegate.DefaultUserTypeActivityDelegate$special$$inlined$inject$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [com.bbva.glomohybrid.ui.options.ListOptionFactory, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ListOptionFactory invoke() {
                KoinComponent koinComponent = this;
                boolean z10 = koinComponent instanceof KoinScopeComponent;
                return (z10 ? ((KoinScopeComponent) koinComponent).getScope() : a.e(koinComponent)).get(Reflection.getOrCreateKotlinClass(ListOptionFactory.class), stringQualifierNamed, function0);
            }
        });
    }

    @Override // org.koin.core.component.KoinComponent
    @NotNull
    public Koin getKoin() {
        return KoinComponent.DefaultImpls.getKoin(this);
    }

    @Override // com.bbva.glomohybrid.ui.options.profileselector.delegate.UserTypeActivityDelegate
    public void registerObservers(@NotNull LifecycleOwner owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        this.f34674q0.getProfileSelectorDialogState().observe(owner, new Observer() { // from class: ha.a
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                ProfileSelectorDialogState profileSelectorDialogState = (ProfileSelectorDialogState) obj;
                DefaultUserTypeActivityDelegate this$0 = this.f69356a;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                if (profileSelectorDialogState instanceof ProfileSelectorDialogState.UserRemembered) {
                    Intrinsics.checkNotNull(profileSelectorDialogState);
                    ProfileSelectorDialogState.UserRemembered userRemembered = (ProfileSelectorDialogState.UserRemembered) profileSelectorDialogState;
                    ListOptionFactory listOptionFactory = (ListOptionFactory) this$0.f34675r0.getValue();
                    RememberedUser user = userRemembered.getUser();
                    String selectedOption = userRemembered.getSelectedOption();
                    AppCompatActivity appCompatActivity = this$0.f34673p0;
                    listOptionFactory.rememberedUserTypeModal(appCompatActivity, user, selectedOption).addFooterAction(new c(this$0)).addItemClicked(new d(this$0)).show(appCompatActivity.getSupportFragmentManager(), "rememberedModal");
                    return;
                }
                if (profileSelectorDialogState instanceof ProfileSelectorDialogState.UserNew) {
                    Intrinsics.checkNotNull(profileSelectorDialogState);
                    ListOptionFactory listOptionFactory2 = (ListOptionFactory) this$0.f34675r0.getValue();
                    String selectedOption2 = ((ProfileSelectorDialogState.UserNew) profileSelectorDialogState).getSelectedOption();
                    AppCompatActivity appCompatActivity2 = this$0.f34673p0;
                    listOptionFactory2.newUserTypeModal(appCompatActivity2, selectedOption2).addItemClicked(new b(this$0)).show(appCompatActivity2.getSupportFragmentManager(), "newUserModal");
                }
            }
        });
    }
}
