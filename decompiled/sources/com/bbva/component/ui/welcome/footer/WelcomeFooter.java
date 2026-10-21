package com.bbva.component.ui.welcome.footer;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bbva.cells.component.kit.ui.property.UIComponentConfigurator;
import com.bbva.cells.component.kit.ui.viewmodel.ViewModel;
import com.bbva.cellscore.app.CellsViewModelProviders;
import com.bbva.cellswidgets.CellsButton;
import com.bbva.cellswidgets.ThemeUtilsKt;
import com.bbva.component.ui.welcome.R;
import com.bbva.component.ui.welcome.databinding.ComponentWelcomeFooterBinding;
import defpackage.androidVisibility;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: WelcomeFooter.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fB\u001b\b\u0016\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000b\u0010\u000fB#\b\u0016\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u000b\u0010\u0012J&\u0010\u0006\u001a\u00020\u00052\u001e\u0010\u0004\u001a\u001a\u0012\u0004\u0012\u00020\u0003\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00020\u0002J&\u0010\u0007\u001a\u00020\u00052\u001e\u0010\u0004\u001a\u001a\u0012\u0004\u0012\u00020\u0003\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00020\u0002J&\u0010\b\u001a\u00020\u00052\u001e\u0010\u0004\u001a\u001a\u0012\u0004\u0012\u00020\u0003\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00020\u0002¨\u0006\u0013"}, d2 = {"Lcom/bbva/component/ui/welcome/footer/WelcomeFooter;", "Landroid/widget/LinearLayout;", "", "", "config", "", "setTopButtonConfig", "setBottomButtonConfig", "setTermsAndConditions", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "component-ui-welcome_release"}, k = 1, mv = {1, 4, 0})
public final class WelcomeFooter extends LinearLayout {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final WelcomeFooterViewModel f28782p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final ComponentWelcomeFooterBinding f28783q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WelcomeFooter(@NotNull Context context) {
        super(ThemeUtilsKt.withDefaultStyle(context, R.style.WelcomeFooter));
        Intrinsics.checkNotNullParameter(context, "context");
        ComponentWelcomeFooterBinding componentWelcomeFooterBindingInflate = ComponentWelcomeFooterBinding.inflate(LayoutInflater.from(getContext()), this);
        Intrinsics.checkNotNullExpressionValue(componentWelcomeFooterBindingInflate, "ComponentWelcomeFooterBi…ater.from(context), this)");
        this.f28783q0 = componentWelcomeFooterBindingInflate;
        setOrientation(1);
        setGravity(1);
        ViewModel viewModelOf = CellsViewModelProviders.of(getId(), getContext(), WelcomeFooterViewModel.class);
        Intrinsics.checkNotNullExpressionValue(viewModelOf, "CellsViewModelProviders.…terViewModel::class.java)");
        WelcomeFooterViewModel welcomeFooterViewModel = (WelcomeFooterViewModel) viewModelOf;
        this.f28782p0 = welcomeFooterViewModel;
        WelcomeFooterDynamicPropertyBinder.a(this, welcomeFooterViewModel);
    }

    public static final void access$config(WelcomeFooter welcomeFooter, View view, ButtonConfig buttonConfig) {
        welcomeFooter.getClass();
        view.setVisibility(androidVisibility.androidVisibility(buttonConfig));
        UIComponentConfigurator.configureView(view.getContext(), view, buttonConfig.getTitle());
    }

    public final void setBottomButtonConfig(@NotNull Map<String, ? extends Map<String, String>> config) {
        Intrinsics.checkNotNullParameter(config, "config");
        CellsButton cellsButton = this.f28783q0.welcomeFooterBottomButton;
        Intrinsics.checkNotNullExpressionValue(cellsButton, "binding.welcomeFooterBottomButton");
        final ButtonConfig buttonConfig = new ButtonConfig(config);
        access$config(this, cellsButton, buttonConfig);
        cellsButton.setOnClickListener(new View.OnClickListener() { // from class: com.bbva.component.ui.welcome.footer.WelcomeFooter$setBottomButtonConfig$$inlined$configure$1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f28782p0.onBottomButtonClick$component_ui_welcome_release(buttonConfig);
            }
        });
    }

    public final void setTermsAndConditions(@NotNull Map<String, ? extends Map<String, String>> config) {
        Intrinsics.checkNotNullParameter(config, "config");
        TextView textView = this.f28783q0.welcomeFooterTerms;
        Intrinsics.checkNotNullExpressionValue(textView, "binding.welcomeFooterTerms");
        final ButtonConfig buttonConfig = new ButtonConfig(config);
        access$config(this, textView, buttonConfig);
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.bbva.component.ui.welcome.footer.WelcomeFooter$setTermsAndConditions$$inlined$configure$1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f28782p0.onTermsButtonClick$component_ui_welcome_release(buttonConfig);
            }
        });
    }

    public final void setTopButtonConfig(@NotNull Map<String, ? extends Map<String, String>> config) {
        Intrinsics.checkNotNullParameter(config, "config");
        CellsButton cellsButton = this.f28783q0.welcomeFooterTopButton;
        Intrinsics.checkNotNullExpressionValue(cellsButton, "binding.welcomeFooterTopButton");
        final ButtonConfig buttonConfig = new ButtonConfig(config);
        access$config(this, cellsButton, buttonConfig);
        cellsButton.setOnClickListener(new View.OnClickListener() { // from class: com.bbva.component.ui.welcome.footer.WelcomeFooter$setTopButtonConfig$$inlined$configure$1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f28782p0.onTopButtonClick$component_ui_welcome_release(buttonConfig);
            }
        });
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WelcomeFooter(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(ThemeUtilsKt.withDefaultStyle(context, R.style.WelcomeFooter), attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        ComponentWelcomeFooterBinding componentWelcomeFooterBindingInflate = ComponentWelcomeFooterBinding.inflate(LayoutInflater.from(getContext()), this);
        Intrinsics.checkNotNullExpressionValue(componentWelcomeFooterBindingInflate, "ComponentWelcomeFooterBi…ater.from(context), this)");
        this.f28783q0 = componentWelcomeFooterBindingInflate;
        setOrientation(1);
        setGravity(1);
        ViewModel viewModelOf = CellsViewModelProviders.of(getId(), getContext(), WelcomeFooterViewModel.class);
        Intrinsics.checkNotNullExpressionValue(viewModelOf, "CellsViewModelProviders.…terViewModel::class.java)");
        WelcomeFooterViewModel welcomeFooterViewModel = (WelcomeFooterViewModel) viewModelOf;
        this.f28782p0 = welcomeFooterViewModel;
        WelcomeFooterDynamicPropertyBinder.a(this, welcomeFooterViewModel);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WelcomeFooter(@NotNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(ThemeUtilsKt.withDefaultStyle(context, R.style.WelcomeFooter), attributeSet, i10);
        Intrinsics.checkNotNullParameter(context, "context");
        ComponentWelcomeFooterBinding componentWelcomeFooterBindingInflate = ComponentWelcomeFooterBinding.inflate(LayoutInflater.from(getContext()), this);
        Intrinsics.checkNotNullExpressionValue(componentWelcomeFooterBindingInflate, "ComponentWelcomeFooterBi…ater.from(context), this)");
        this.f28783q0 = componentWelcomeFooterBindingInflate;
        setOrientation(1);
        setGravity(1);
        ViewModel viewModelOf = CellsViewModelProviders.of(getId(), getContext(), WelcomeFooterViewModel.class);
        Intrinsics.checkNotNullExpressionValue(viewModelOf, "CellsViewModelProviders.…terViewModel::class.java)");
        WelcomeFooterViewModel welcomeFooterViewModel = (WelcomeFooterViewModel) viewModelOf;
        this.f28782p0 = welcomeFooterViewModel;
        WelcomeFooterDynamicPropertyBinder.a(this, welcomeFooterViewModel);
    }
}
