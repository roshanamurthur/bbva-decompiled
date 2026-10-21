package com.bbva.glomohybrid.infoscreen.root;

import android.os.Bundle;
import android.view.View;
import androidx.core.app.ActivityCompat;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.bbva.component.dm.analytics.model.AnalyticsEvent;
import com.bbva.glomohybrid.infoscreen.data.InfoScreenDataFactory;
import com.bbva.glomohybrid.infoscreen.data.model.InfoScreenData;
import com.bbva.glomohybrid.infoscreen.fragment.InfoScreenDialogFragment;
import com.bbva.glomohybrid.infoscreen.fragment.InfoScreenType;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.android.ext.android.AndroidKoinScopeExtKt;
import org.koin.androidx.viewmodel.GetViewModelKt;
import org.koin.core.qualifier.Qualifier;
import org.koin.core.qualifier.QualifierKt;
import org.koin.core.qualifier.StringQualifier;

/* JADX INFO: compiled from: RootFragment.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u0019\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016J\b\u0010\b\u001a\u00020\u0006H\u0016J\b\u0010\t\u001a\u00020\u0006H\u0016R\u001b\u0010\u000f\u001a\u00020\n8DX\u0084\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0017"}, d2 = {"Lcom/bbva/glomohybrid/infoscreen/root/RootFragment;", "Lcom/bbva/glomohybrid/infoscreen/fragment/InfoScreenDialogFragment;", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "", "onViewCreated", "onCancelButtonClick", "onBackButtonClick", "Lcom/bbva/glomohybrid/infoscreen/root/RootViewModel;", "J0", "Lkotlin/Lazy;", "getViewModel", "()Lcom/bbva/glomohybrid/infoscreen/root/RootViewModel;", "viewModel", "Lcom/bbva/glomohybrid/infoscreen/fragment/InfoScreenType;", "infoScreenType", "Lcom/bbva/glomohybrid/infoscreen/data/model/InfoScreenData;", "data", "<init>", "(Lcom/bbva/glomohybrid/infoscreen/fragment/InfoScreenType;Lcom/bbva/glomohybrid/infoscreen/data/model/InfoScreenData;)V", "Companion", "info-modal_mexicoRelease"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nRootFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RootFragment.kt\ncom/bbva/glomohybrid/infoscreen/root/RootFragment\n+ 2 FragmentVM.kt\norg/koin/androidx/viewmodel/ext/android/FragmentVMKt\n*L\n1#1,40:1\n43#2,7:41\n*S KotlinDebug\n*F\n+ 1 RootFragment.kt\ncom/bbva/glomohybrid/infoscreen/root/RootFragment\n*L\n19#1:41,7\n*E\n"})
public abstract class RootFragment extends InfoScreenDialogFragment {

    @NotNull
    public static final String KEY_ROOT_FRAGMENT = "key_root_fragment";

    @NotNull
    public static final String SHOULD_CONTINUE = "should_continue";

    /* JADX INFO: renamed from: J0, reason: from kotlin metadata */
    @NotNull
    public final Lazy viewModel;

    public /* synthetic */ RootFragment(InfoScreenType infoScreenType, InfoScreenData infoScreenData, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(infoScreenType, (i10 & 2) != 0 ? InfoScreenDataFactory.INSTANCE.getData(infoScreenType) : infoScreenData);
    }

    @NotNull
    public final RootViewModel getViewModel() {
        return (RootViewModel) this.viewModel.getValue();
    }

    @Override // com.bbva.glomohybrid.infoscreen.fragment.InfoScreenDialogFragment
    public void onBackButtonClick() {
        ActivityCompat.finishAffinity(requireActivity());
    }

    @Override // com.bbva.glomohybrid.infoscreen.fragment.InfoScreenDialogFragment
    public void onCancelButtonClick() {
        ActivityCompat.finishAffinity(requireActivity());
    }

    @Override // com.bbva.glomohybrid.infoscreen.fragment.InfoScreenDialogFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        getViewModel().sendAnalytics(AnalyticsEvent.ROOT_SCREEN, getType().getId());
        setCloseToolbarOptionVisibility(false);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RootFragment(@NotNull InfoScreenType infoScreenType, @NotNull InfoScreenData data) {
        super(infoScreenType, data);
        Intrinsics.checkNotNullParameter(infoScreenType, "infoScreenType");
        Intrinsics.checkNotNullParameter(data, "data");
        final StringQualifier stringQualifierNamed = QualifierKt.named(getType().getId());
        final Function0<Fragment> function0 = new Function0<Fragment>() { // from class: com.bbva.glomohybrid.infoscreen.root.RootFragment$special$$inlined$viewModel$default$1
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final Fragment invoke() {
                return this;
            }
        };
        final Function0 function1 = null;
        final Function0 function2 = null;
        this.viewModel = LazyKt__LazyJVMKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new Function0<RootViewModel>() { // from class: com.bbva.glomohybrid.infoscreen.root.RootFragment$special$$inlined$viewModel$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            /* JADX WARN: Type inference failed for: r0v6, types: [androidx.lifecycle.ViewModel, com.bbva.glomohybrid.infoscreen.root.RootViewModel] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final RootViewModel invoke() {
                CreationExtras defaultViewModelCreationExtras;
                Qualifier qualifier = stringQualifierNamed;
                Function0 function3 = function2;
                ViewModelStore viewModelStore = ((ViewModelStoreOwner) function0.invoke()).getViewModelStore();
                Fragment fragment = this;
                Function0 function4 = function1;
                if (function4 == null || (defaultViewModelCreationExtras = (CreationExtras) function4.invoke()) == null) {
                    defaultViewModelCreationExtras = fragment.getDefaultViewModelCreationExtras();
                    Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "this.defaultViewModelCreationExtras");
                }
                return GetViewModelKt.resolveViewModel(Reflection.getOrCreateKotlinClass(RootViewModel.class), viewModelStore, (4 & 4) != 0 ? null : null, defaultViewModelCreationExtras, (4 & 16) != 0 ? null : qualifier, AndroidKoinScopeExtKt.getKoinScope(fragment), (4 & 64) != 0 ? null : function3);
            }
        });
    }
}
