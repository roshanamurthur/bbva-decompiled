package com.bbva.glomohybrid.infoscreen.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.bbva.component.dm.analytics.constants.AnalyticsConstants;
import com.bbva.glomohybrid.base.extensions.ViewExtensionsKt;
import com.bbva.glomohybrid.infoscreen.R;
import com.bbva.glomohybrid.infoscreen.data.InfoScreenDataFactory;
import com.bbva.glomohybrid.infoscreen.data.model.InfoScreenData;
import com.bbva.glomohybrid.infoscreen.data.model.InfoScreenStyle;
import com.bbva.glomohybrid.infoscreen.databinding.FragmentInfoScreenBinding;
import com.google.android.material.appbar.AppBarLayout;
import hc.a;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Unit;
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
import y8.b;

/* JADX INFO: compiled from: InfoScreenDialogFragment.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010#\u001a\u00020\u001e\u0012\b\b\u0002\u0010i\u001a\u00020h¢\u0006\u0004\bj\u0010kJ&\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J\b\u0010\u000b\u001a\u00020\nH\u0014J\b\u0010\r\u001a\u00020\fH\u0016J\u0010\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0016J\u001a\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J\u000e\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u0010J\b\u0010\u0016\u001a\u00020\nH\u0014J\b\u0010\u0017\u001a\u00020\nH\u0016J\b\u0010\u0018\u001a\u00020\nH\u0016J\b\u0010\u0019\u001a\u00020\nH\u0016J\u0010\u0010\u001c\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\u001aH\u0014J\b\u0010\u001d\u001a\u00020\nH\u0016R\u0017\u0010#\u001a\u00020\u001e8\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R*\u0010+\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010$8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R$\u00103\u001a\u0004\u0018\u00010,8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b-\u0010.\u001a\u0004\b/\u00100\"\u0004\b1\u00102R$\u00107\u001a\u0004\u0018\u00010,8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b4\u0010.\u001a\u0004\b5\u00100\"\u0004\b6\u00102R$\u0010?\u001a\u0004\u0018\u0001088\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R$\u0010C\u001a\u0004\u0018\u00010,8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b@\u0010.\u001a\u0004\bA\u00100\"\u0004\bB\u00102R$\u0010K\u001a\u0004\u0018\u00010D8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\bE\u0010F\u001a\u0004\bG\u0010H\"\u0004\bI\u0010JR$\u0010O\u001a\u0004\u0018\u00010D8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\bL\u0010F\u001a\u0004\bM\u0010H\"\u0004\bN\u0010JR$\u0010W\u001a\u0004\u0018\u00010P8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\bQ\u0010R\u001a\u0004\bS\u0010T\"\u0004\bU\u0010VR$\u0010_\u001a\u0004\u0018\u00010X8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\bY\u0010Z\u001a\u0004\b[\u0010\\\"\u0004\b]\u0010^R$\u0010g\u001a\u0004\u0018\u00010`8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\ba\u0010b\u001a\u0004\bc\u0010d\"\u0004\be\u0010f¨\u0006l"}, d2 = {"Lcom/bbva/glomohybrid/infoscreen/fragment/InfoScreenDialogFragment;", "Landroidx/fragment/app/DialogFragment;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "", "bindViews", "", "getTheme", "Landroid/view/MenuItem;", AnalyticsConstants.Key.ITEM, "", "onOptionsItemSelected", "view", "onViewCreated", "isVisible", "setCloseToolbarOptionVisibility", "configureToolbar", "onPositiveButtonClick", "onCancelButtonClick", "onBackButtonClick", "Lcom/bbva/glomohybrid/infoscreen/data/model/InfoScreenStyle;", "style", "setStyle", "onDestroy", "Lcom/bbva/glomohybrid/infoscreen/fragment/InfoScreenType;", "p0", "Lcom/bbva/glomohybrid/infoscreen/fragment/InfoScreenType;", "getType", "()Lcom/bbva/glomohybrid/infoscreen/fragment/InfoScreenType;", "type", "Lkotlin/Function0;", "r0", "Lkotlin/jvm/functions/Function0;", "getOnPositiveButtonClickListener", "()Lkotlin/jvm/functions/Function0;", "setOnPositiveButtonClickListener", "(Lkotlin/jvm/functions/Function0;)V", "onPositiveButtonClickListener", "Landroid/widget/TextView;", "u0", "Landroid/widget/TextView;", "getTitleLabel", "()Landroid/widget/TextView;", "setTitleLabel", "(Landroid/widget/TextView;)V", "titleLabel", "v0", "getToolbarTitleLabel", "setToolbarTitleLabel", "toolbarTitleLabel", "Landroidx/appcompat/widget/AppCompatImageView;", "w0", "Landroidx/appcompat/widget/AppCompatImageView;", "getHeaderImage", "()Landroidx/appcompat/widget/AppCompatImageView;", "setHeaderImage", "(Landroidx/appcompat/widget/AppCompatImageView;)V", "headerImage", "x0", "getDescriptionLabel", "setDescriptionLabel", "descriptionLabel", "Landroidx/appcompat/widget/AppCompatButton;", "y0", "Landroidx/appcompat/widget/AppCompatButton;", "getPositiveButton", "()Landroidx/appcompat/widget/AppCompatButton;", "setPositiveButton", "(Landroidx/appcompat/widget/AppCompatButton;)V", "positiveButton", "E0", "getNegativeButton", "setNegativeButton", "negativeButton", "Landroidx/appcompat/widget/Toolbar;", "F0", "Landroidx/appcompat/widget/Toolbar;", "getInfoScreenToolbar", "()Landroidx/appcompat/widget/Toolbar;", "setInfoScreenToolbar", "(Landroidx/appcompat/widget/Toolbar;)V", "infoScreenToolbar", "Landroidx/constraintlayout/widget/ConstraintLayout;", "G0", "Landroidx/constraintlayout/widget/ConstraintLayout;", "getConstraintLayout", "()Landroidx/constraintlayout/widget/ConstraintLayout;", "setConstraintLayout", "(Landroidx/constraintlayout/widget/ConstraintLayout;)V", "constraintLayout", "Lcom/google/android/material/appbar/AppBarLayout;", "H0", "Lcom/google/android/material/appbar/AppBarLayout;", "getAppBarLayout", "()Lcom/google/android/material/appbar/AppBarLayout;", "setAppBarLayout", "(Lcom/google/android/material/appbar/AppBarLayout;)V", "appBarLayout", "Lcom/bbva/glomohybrid/infoscreen/data/model/InfoScreenData;", "data", "<init>", "(Lcom/bbva/glomohybrid/infoscreen/fragment/InfoScreenType;Lcom/bbva/glomohybrid/infoscreen/data/model/InfoScreenData;)V", "info-modal_mexicoRelease"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nInfoScreenDialogFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InfoScreenDialogFragment.kt\ncom/bbva/glomohybrid/infoscreen/fragment/InfoScreenDialogFragment\n+ 2 FragmentVM.kt\norg/koin/androidx/viewmodel/ext/android/FragmentVMKt\n*L\n1#1,170:1\n43#2,7:171\n*S KotlinDebug\n*F\n+ 1 InfoScreenDialogFragment.kt\ncom/bbva/glomohybrid/infoscreen/fragment/InfoScreenDialogFragment\n*L\n35#1:171,7\n*E\n"})
public class InfoScreenDialogFragment extends DialogFragment {
    public static final /* synthetic */ int I0 = 0;

    /* JADX INFO: renamed from: E0, reason: from kotlin metadata */
    @Nullable
    public AppCompatButton negativeButton;

    /* JADX INFO: renamed from: F0, reason: from kotlin metadata */
    @Nullable
    public Toolbar infoScreenToolbar;

    /* JADX INFO: renamed from: G0, reason: from kotlin metadata */
    @Nullable
    public ConstraintLayout constraintLayout;

    /* JADX INFO: renamed from: H0, reason: from kotlin metadata */
    @Nullable
    public AppBarLayout appBarLayout;

    /* JADX INFO: renamed from: p0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final InfoScreenType type;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    @NotNull
    public final InfoScreenData f32306q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public Function0<Unit> onPositiveButtonClickListener;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    @Nullable
    public FragmentInfoScreenBinding f32308s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    @NotNull
    public final Lazy f32309t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public TextView titleLabel;

    /* JADX INFO: renamed from: v0, reason: from kotlin metadata */
    @Nullable
    public TextView toolbarTitleLabel;

    /* JADX INFO: renamed from: w0, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public AppCompatImageView headerImage;

    /* JADX INFO: renamed from: x0, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public TextView descriptionLabel;

    /* JADX INFO: renamed from: y0, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public AppCompatButton positiveButton;

    public /* synthetic */ InfoScreenDialogFragment(InfoScreenType infoScreenType, InfoScreenData infoScreenData, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(infoScreenType, (i10 & 2) != 0 ? InfoScreenDataFactory.INSTANCE.getData(infoScreenType) : infoScreenData);
    }

    public void bindViews() {
        FragmentInfoScreenBinding fragmentInfoScreenBinding = this.f32308s0;
        this.titleLabel = fragmentInfoScreenBinding != null ? fragmentInfoScreenBinding.titleLabel : null;
        this.toolbarTitleLabel = fragmentInfoScreenBinding != null ? fragmentInfoScreenBinding.toolbarTitleLabel : null;
        this.headerImage = fragmentInfoScreenBinding != null ? fragmentInfoScreenBinding.headerImage : null;
        this.descriptionLabel = fragmentInfoScreenBinding != null ? fragmentInfoScreenBinding.descriptionLabel : null;
        this.positiveButton = fragmentInfoScreenBinding != null ? fragmentInfoScreenBinding.positiveButton : null;
        this.negativeButton = fragmentInfoScreenBinding != null ? fragmentInfoScreenBinding.negativeButton : null;
        this.infoScreenToolbar = fragmentInfoScreenBinding != null ? fragmentInfoScreenBinding.infoScreenToolbar : null;
        this.constraintLayout = fragmentInfoScreenBinding != null ? fragmentInfoScreenBinding.constraintLayout : null;
    }

    public void configureToolbar() {
        Toolbar toolbar = this.infoScreenToolbar;
        if (toolbar != null) {
            toolbar.inflateMenu(R.menu.toolbar_menu);
        }
        Toolbar toolbar2 = this.infoScreenToolbar;
        if (toolbar2 != null) {
            toolbar2.setOnMenuItemClickListener(new a(this));
        }
    }

    @Nullable
    public final AppBarLayout getAppBarLayout() {
        return this.appBarLayout;
    }

    @Nullable
    public final ConstraintLayout getConstraintLayout() {
        return this.constraintLayout;
    }

    @Nullable
    public final TextView getDescriptionLabel() {
        return this.descriptionLabel;
    }

    @Nullable
    public final AppCompatImageView getHeaderImage() {
        return this.headerImage;
    }

    @Nullable
    public final Toolbar getInfoScreenToolbar() {
        return this.infoScreenToolbar;
    }

    @Nullable
    public final AppCompatButton getNegativeButton() {
        return this.negativeButton;
    }

    @Nullable
    public final Function0<Unit> getOnPositiveButtonClickListener() {
        return this.onPositiveButtonClickListener;
    }

    @Nullable
    public final AppCompatButton getPositiveButton() {
        return this.positiveButton;
    }

    @Override // androidx.fragment.app.DialogFragment
    public int getTheme() {
        return R.style.InfoScreenDialogFragmentTheme;
    }

    @Nullable
    public final TextView getTitleLabel() {
        return this.titleLabel;
    }

    @Nullable
    public final TextView getToolbarTitleLabel() {
        return this.toolbarTitleLabel;
    }

    @NotNull
    public final InfoScreenType getType() {
        return this.type;
    }

    public void onBackButtonClick() {
        dismiss();
    }

    public void onCancelButtonClick() {
        ((InfoScreenViewModel) this.f32309t0.getValue()).onCancelButtonClick();
        dismiss();
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        setCancelable(false);
        FragmentInfoScreenBinding fragmentInfoScreenBindingInflate = FragmentInfoScreenBinding.inflate(inflater, container, false);
        this.f32308s0 = fragmentInfoScreenBindingInflate;
        if (fragmentInfoScreenBindingInflate != null) {
            return fragmentInfoScreenBindingInflate.getRoot();
        }
        return null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        this.f32308s0 = null;
    }

    @Override // androidx.fragment.app.Fragment
    public boolean onOptionsItemSelected(@NotNull MenuItem item) {
        Intrinsics.checkNotNullParameter(item, "item");
        if (item.getItemId() != R.id.action_close) {
            return false;
        }
        dismiss();
        return true;
    }

    public void onPositiveButtonClick() {
        ((InfoScreenViewModel) this.f32309t0.getValue()).onAcceptButtonClick();
        dismiss();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        AppCompatImageButton appCompatImageButton;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        bindViews();
        TextView textView = this.toolbarTitleLabel;
        InfoScreenData infoScreenData = this.f32306q0;
        if (textView != null) {
            textView.setText(infoScreenData.getToolbarTitle());
        }
        AppCompatImageView appCompatImageView = this.headerImage;
        if (appCompatImageView != null) {
            appCompatImageView.setImageResource(infoScreenData.getHeaderImage());
        }
        TextView textView2 = this.descriptionLabel;
        if (textView2 != null) {
            textView2.setText(infoScreenData.getDescription());
        }
        AppCompatButton appCompatButton = this.positiveButton;
        if (appCompatButton != null) {
            appCompatButton.setText(infoScreenData.getPositiveButton());
        }
        TextView textView3 = this.titleLabel;
        if (textView3 != null) {
            textView3.setText(infoScreenData.getTitle());
        }
        Integer negativeButton = infoScreenData.getNegativeButton();
        if (negativeButton != null) {
            int iIntValue = negativeButton.intValue();
            AppCompatButton appCompatButton2 = this.negativeButton;
            if (appCompatButton2 != null) {
                appCompatButton2.setVisibility(0);
            }
            AppCompatButton appCompatButton3 = this.negativeButton;
            if (appCompatButton3 != null) {
                appCompatButton3.setText(iIntValue);
            }
        }
        setStyle(infoScreenData.getStyle());
        AppCompatButton appCompatButton4 = this.positiveButton;
        if (appCompatButton4 != null) {
            appCompatButton4.setOnClickListener(new y8.a(this, 0));
        }
        AppCompatButton appCompatButton5 = this.negativeButton;
        if (appCompatButton5 != null) {
            appCompatButton5.setOnClickListener(new b(this, 0));
        }
        FragmentInfoScreenBinding fragmentInfoScreenBinding = this.f32308s0;
        if (fragmentInfoScreenBinding == null || (appCompatImageButton = fragmentInfoScreenBinding.closeMenuButton) == null) {
            return;
        }
        appCompatImageButton.setOnClickListener(new p5.a(this, 1));
    }

    public final void setAppBarLayout(@Nullable AppBarLayout appBarLayout) {
        this.appBarLayout = appBarLayout;
    }

    public final void setCloseToolbarOptionVisibility(boolean isVisible) {
        View viewFindViewById;
        Toolbar toolbar = this.infoScreenToolbar;
        if (toolbar == null || (viewFindViewById = toolbar.findViewById(R.id.action_close)) == null) {
            return;
        }
        ViewExtensionsKt.show(viewFindViewById, isVisible);
    }

    public final void setConstraintLayout(@Nullable ConstraintLayout constraintLayout) {
        this.constraintLayout = constraintLayout;
    }

    public final void setDescriptionLabel(@Nullable TextView textView) {
        this.descriptionLabel = textView;
    }

    public final void setHeaderImage(@Nullable AppCompatImageView appCompatImageView) {
        this.headerImage = appCompatImageView;
    }

    public final void setInfoScreenToolbar(@Nullable Toolbar toolbar) {
        this.infoScreenToolbar = toolbar;
    }

    public final void setNegativeButton(@Nullable AppCompatButton appCompatButton) {
        this.negativeButton = appCompatButton;
    }

    public final void setOnPositiveButtonClickListener(@Nullable Function0<Unit> function0) {
        this.onPositiveButtonClickListener = function0;
    }

    public final void setPositiveButton(@Nullable AppCompatButton appCompatButton) {
        this.positiveButton = appCompatButton;
    }

    public void setStyle(@NotNull InfoScreenStyle style) {
        Intrinsics.checkNotNullParameter(style, "style");
        TextView textView = this.titleLabel;
        if (textView != null) {
            textView.setTextColor(ContextCompat.getColor(requireContext(), style.getTitleColor()));
        }
        TextView textView2 = this.descriptionLabel;
        if (textView2 != null) {
            textView2.setTextColor(ContextCompat.getColor(requireContext(), style.getDescriptionLabelColor()));
        }
        ConstraintLayout constraintLayout = this.constraintLayout;
        if (constraintLayout != null) {
            constraintLayout.setBackgroundColor(ContextCompat.getColor(requireContext(), style.getBackgroundColor()));
        }
    }

    public final void setTitleLabel(@Nullable TextView textView) {
        this.titleLabel = textView;
    }

    public final void setToolbarTitleLabel(@Nullable TextView textView) {
        this.toolbarTitleLabel = textView;
    }

    public InfoScreenDialogFragment(@NotNull InfoScreenType type, @NotNull InfoScreenData data) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(data, "data");
        this.type = type;
        this.f32306q0 = data;
        final StringQualifier stringQualifierNamed = QualifierKt.named(type.getId());
        final Function0<Fragment> function0 = new Function0<Fragment>() { // from class: com.bbva.glomohybrid.infoscreen.fragment.InfoScreenDialogFragment$special$$inlined$viewModel$default$1
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
        this.f32309t0 = LazyKt__LazyJVMKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new Function0<InfoScreenViewModel>() { // from class: com.bbva.glomohybrid.infoscreen.fragment.InfoScreenDialogFragment$special$$inlined$viewModel$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            /* JADX WARN: Type inference failed for: r0v6, types: [androidx.lifecycle.ViewModel, com.bbva.glomohybrid.infoscreen.fragment.InfoScreenViewModel] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final InfoScreenViewModel invoke() {
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
                return GetViewModelKt.resolveViewModel(Reflection.getOrCreateKotlinClass(InfoScreenViewModel.class), viewModelStore, (4 & 4) != 0 ? null : null, defaultViewModelCreationExtras, (4 & 16) != 0 ? null : qualifier, AndroidKoinScopeExtKt.getKoinScope(fragment), (4 & 64) != 0 ? null : function3);
            }
        });
    }
}
