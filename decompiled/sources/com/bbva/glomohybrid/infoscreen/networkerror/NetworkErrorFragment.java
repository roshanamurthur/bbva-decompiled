package com.bbva.glomohybrid.infoscreen.networkerror;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.core.app.ActivityCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.bbva.glomohybrid.infoscreen.fragment.InfoScreenDialogFragment;
import com.bbva.glomohybrid.infoscreen.fragment.InfoScreenType;
import kotlin.Function;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionAdapter;
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

/* JADX INFO: compiled from: NetworkErrorFragment.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016J\b\u0010\b\u001a\u00020\u0006H\u0016J\b\u0010\t\u001a\u00020\u0006H\u0016J\b\u0010\n\u001a\u00020\u0006H\u0016¨\u0006\u000e"}, d2 = {"Lcom/bbva/glomohybrid/infoscreen/networkerror/NetworkErrorFragment;", "Lcom/bbva/glomohybrid/infoscreen/fragment/InfoScreenDialogFragment;", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "", "onViewCreated", "onBackButtonClick", "onPositiveButtonClick", "onCancelButtonClick", "<init>", "()V", "Companion", "info-modal_mexicoRelease"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nNetworkErrorFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NetworkErrorFragment.kt\ncom/bbva/glomohybrid/infoscreen/networkerror/NetworkErrorFragment\n+ 2 FragmentVM.kt\norg/koin/androidx/viewmodel/ext/android/FragmentVMKt\n*L\n1#1,53:1\n43#2,7:54\n*S KotlinDebug\n*F\n+ 1 NetworkErrorFragment.kt\ncom/bbva/glomohybrid/infoscreen/networkerror/NetworkErrorFragment\n*L\n17#1:54,7\n*E\n"})
public final class NetworkErrorFragment extends InfoScreenDialogFragment {

    @NotNull
    public static final String IS_SUCCESS = "isSuccess";

    @NotNull
    public static final String KEY_NETWORK_ERROR_FRAGMENT = "key_network_error_fragment";

    @NotNull
    public final Lazy J0;

    /* JADX INFO: compiled from: NetworkErrorFragment.kt */
    public static final class a implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Function1 f32359a;

        public a(a9.a function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f32359a = function;
        }

        public final boolean equals(@Nullable Object obj) {
            if (!(obj instanceof Observer) || !(obj instanceof FunctionAdapter)) {
                return false;
            }
            return Intrinsics.areEqual(this.f32359a, ((FunctionAdapter) obj).getFunctionDelegate());
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        @NotNull
        public final Function<?> getFunctionDelegate() {
            return this.f32359a;
        }

        public final int hashCode() {
            return this.f32359a.hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f32359a.invoke(obj);
        }
    }

    public NetworkErrorFragment() {
        super(InfoScreenType.NetworkInfoScreen.INSTANCE, null, 2, null);
        final StringQualifier stringQualifierNamed = QualifierKt.named(getType().getId());
        final Function0<Fragment> function0 = new Function0<Fragment>() { // from class: com.bbva.glomohybrid.infoscreen.networkerror.NetworkErrorFragment$special$$inlined$viewModel$default$1
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
        this.J0 = LazyKt__LazyJVMKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new Function0<NetworkViewModel>() { // from class: com.bbva.glomohybrid.infoscreen.networkerror.NetworkErrorFragment$special$$inlined$viewModel$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            /* JADX WARN: Type inference failed for: r0v6, types: [androidx.lifecycle.ViewModel, com.bbva.glomohybrid.infoscreen.networkerror.NetworkViewModel] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final NetworkViewModel invoke() {
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
                return GetViewModelKt.resolveViewModel(Reflection.getOrCreateKotlinClass(NetworkViewModel.class), viewModelStore, (4 & 4) != 0 ? null : null, defaultViewModelCreationExtras, (4 & 16) != 0 ? null : qualifier, AndroidKoinScopeExtKt.getKoinScope(fragment), (4 & 64) != 0 ? null : function3);
            }
        });
    }

    @Override // com.bbva.glomohybrid.infoscreen.fragment.InfoScreenDialogFragment
    public void onBackButtonClick() {
        ActivityCompat.finishAffinity(requireActivity());
    }

    @Override // com.bbva.glomohybrid.infoscreen.fragment.InfoScreenDialogFragment
    public void onCancelButtonClick() {
        ActivityCompat.finishAffinity(requireActivity());
    }

    @Override // com.bbva.glomohybrid.infoscreen.fragment.InfoScreenDialogFragment
    public void onPositiveButtonClick() {
        startActivity(new Intent("android.settings.SETTINGS"));
    }

    @Override // com.bbva.glomohybrid.infoscreen.fragment.InfoScreenDialogFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        Lazy lazy = this.J0;
        ((NetworkViewModel) lazy.getValue()).startNetworkMonitor(requireActivity().hashCode());
        FragmentActivity activity = getActivity();
        if (activity != null) {
            ((NetworkViewModel) lazy.getValue()).isNetworkAvailable().observe(activity, new a(new a9.a(this)));
        }
    }
}
