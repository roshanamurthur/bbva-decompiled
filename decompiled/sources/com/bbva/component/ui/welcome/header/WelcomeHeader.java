package com.bbva.component.ui.welcome.header;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import com.bbva.cells.component.kit.ui.property.UIComponentConfigurator;
import com.bbva.cells.component.kit.ui.viewmodel.ViewModel;
import com.bbva.cellscore.app.CellsViewModelProviders;
import com.bbva.cellswidgets.ThemeUtilsKt;
import com.bbva.component.ui.welcome.R;
import com.bbva.component.ui.welcome.databinding.ComponentWelcomeHeaderBinding;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: WelcomeHeader.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fB\u001b\b\u0016\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000b\u0010\u000fB#\b\u0016\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u000b\u0010\u0012J&\u0010\u0006\u001a\u00020\u00052\u001e\u0010\u0004\u001a\u001a\u0012\u0004\u0012\u00020\u0003\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00020\u0002J&\u0010\u0007\u001a\u00020\u00052\u001e\u0010\u0004\u001a\u001a\u0012\u0004\u0012\u00020\u0003\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00020\u0002J&\u0010\b\u001a\u00020\u00052\u001e\u0010\u0004\u001a\u001a\u0012\u0004\u0012\u00020\u0003\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00020\u0002¨\u0006\u0013"}, d2 = {"Lcom/bbva/component/ui/welcome/header/WelcomeHeader;", "Landroid/widget/LinearLayout;", "", "", "value", "", "setWelcomeHeaderTitle", "setWelcomeHeaderDescription", "setWelcomeHeaderUsername", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "component-ui-welcome_release"}, k = 1, mv = {1, 4, 0})
public final class WelcomeHeader extends LinearLayout {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final ComponentWelcomeHeaderBinding f28792p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WelcomeHeader(@NotNull Context context) {
        super(ThemeUtilsKt.withDefaultStyle(context, R.style.WelcomePager));
        Intrinsics.checkNotNullParameter(context, "context");
        ComponentWelcomeHeaderBinding componentWelcomeHeaderBindingInflate = ComponentWelcomeHeaderBinding.inflate(LayoutInflater.from(getContext()), this);
        Intrinsics.checkNotNullExpressionValue(componentWelcomeHeaderBindingInflate, "ComponentWelcomeHeaderBi…ater.from(context), this)");
        this.f28792p0 = componentWelcomeHeaderBindingInflate;
        setOrientation(1);
        ViewModel viewModelOf = CellsViewModelProviders.of(getId(), getContext(), WelcomeHeaderViewModel.class);
        Intrinsics.checkNotNullExpressionValue(viewModelOf, "CellsViewModelProviders.…derViewModel::class.java)");
        WelcomeHeaderDynamicPropertyBinder.a(this, (WelcomeHeaderViewModel) viewModelOf);
    }

    public final void setWelcomeHeaderDescription(@NotNull Map<String, ? extends Map<String, String>> value) {
        Intrinsics.checkNotNullParameter(value, "value");
        UIComponentConfigurator.configureTextView(getContext(), this.f28792p0.welcomeHeaderDescription, value);
    }

    public final void setWelcomeHeaderTitle(@NotNull Map<String, ? extends Map<String, String>> value) {
        Intrinsics.checkNotNullParameter(value, "value");
        UIComponentConfigurator.configureTextView(getContext(), this.f28792p0.welcomeHeaderTitle, value);
    }

    public final void setWelcomeHeaderUsername(@NotNull Map<String, ? extends Map<String, String>> value) {
        Intrinsics.checkNotNullParameter(value, "value");
        UIComponentConfigurator.configureTextView(getContext(), this.f28792p0.welcomeHeaderUserName, value);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WelcomeHeader(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(ThemeUtilsKt.withDefaultStyle(context, R.style.WelcomePager), attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        ComponentWelcomeHeaderBinding componentWelcomeHeaderBindingInflate = ComponentWelcomeHeaderBinding.inflate(LayoutInflater.from(getContext()), this);
        Intrinsics.checkNotNullExpressionValue(componentWelcomeHeaderBindingInflate, "ComponentWelcomeHeaderBi…ater.from(context), this)");
        this.f28792p0 = componentWelcomeHeaderBindingInflate;
        setOrientation(1);
        ViewModel viewModelOf = CellsViewModelProviders.of(getId(), getContext(), WelcomeHeaderViewModel.class);
        Intrinsics.checkNotNullExpressionValue(viewModelOf, "CellsViewModelProviders.…derViewModel::class.java)");
        WelcomeHeaderDynamicPropertyBinder.a(this, (WelcomeHeaderViewModel) viewModelOf);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WelcomeHeader(@NotNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(ThemeUtilsKt.withDefaultStyle(context, R.style.WelcomePager), attributeSet, i10);
        Intrinsics.checkNotNullParameter(context, "context");
        ComponentWelcomeHeaderBinding componentWelcomeHeaderBindingInflate = ComponentWelcomeHeaderBinding.inflate(LayoutInflater.from(getContext()), this);
        Intrinsics.checkNotNullExpressionValue(componentWelcomeHeaderBindingInflate, "ComponentWelcomeHeaderBi…ater.from(context), this)");
        this.f28792p0 = componentWelcomeHeaderBindingInflate;
        setOrientation(1);
        ViewModel viewModelOf = CellsViewModelProviders.of(getId(), getContext(), WelcomeHeaderViewModel.class);
        Intrinsics.checkNotNullExpressionValue(viewModelOf, "CellsViewModelProviders.…derViewModel::class.java)");
        WelcomeHeaderDynamicPropertyBinder.a(this, (WelcomeHeaderViewModel) viewModelOf);
    }
}
