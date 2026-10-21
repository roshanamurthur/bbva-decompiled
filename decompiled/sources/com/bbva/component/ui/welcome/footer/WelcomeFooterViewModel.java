package com.bbva.component.ui.welcome.footer;

import android.app.Application;
import com.bbva.cells.component.kit.model.ActionSpec;
import com.bbva.cells.component.kit.ui.viewmodel.ViewModel;
import com.bbva.nativesettings.common.Constants;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: WelcomeFooterViewModel.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\u0015\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0000¢\u0006\u0002\b\u000bJ\u0015\u0010\f\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0000¢\u0006\u0002\b\rJ\u0015\u0010\u000e\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0000¢\u0006\u0002\b\u000f¨\u0006\u0011"}, d2 = {"Lcom/bbva/component/ui/welcome/footer/WelcomeFooterViewModel;", "Lcom/bbva/cells/component/kit/ui/viewmodel/ViewModel;", Constants.APPLICATION, "Landroid/app/Application;", "(Landroid/app/Application;)V", "getId", "", "onBottomButtonClick", "", "buttonConfig", "Lcom/bbva/component/ui/welcome/footer/ButtonConfig;", "onBottomButtonClick$component_ui_welcome_release", "onTermsButtonClick", "onTermsButtonClick$component_ui_welcome_release", "onTopButtonClick", "onTopButtonClick$component_ui_welcome_release", "Companion", "component-ui-welcome_release"}, k = 1, mv = {1, 4, 0})
public final class WelcomeFooterViewModel extends ViewModel {

    @NotNull
    public static final String ID = "welcome-footer-viewmodel";

    @JvmField
    @NotNull
    public static final ActionSpec<ButtonConfig> ACTION_TOP_BUTTON_CLICK = new ActionSpec<>("top-button-click");

    @JvmField
    @NotNull
    public static final ActionSpec<ButtonConfig> ACTION_BOTTOM_BUTTON_CLICK = new ActionSpec<>("bottom-button-click");

    @JvmField
    @NotNull
    public static final ActionSpec<ButtonConfig> ACTION_TERMS_BUTTON_CLICK = new ActionSpec<>("terms-button-click");

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WelcomeFooterViewModel(@NotNull Application application) {
        super(application);
        Intrinsics.checkNotNullParameter(application, "application");
    }

    @Override // com.bbva.cells.component.kit.ui.viewmodel.ViewModel, com.bbva.cells.component.kit.common.Component
    @NotNull
    /* JADX INFO: renamed from: getId */
    public String getK0() {
        return ID;
    }

    public final void onBottomButtonClick$component_ui_welcome_release(@NotNull ButtonConfig buttonConfig) {
        Intrinsics.checkNotNullParameter(buttonConfig, "buttonConfig");
        fire(ACTION_BOTTOM_BUTTON_CLICK, buttonConfig);
    }

    public final void onTermsButtonClick$component_ui_welcome_release(@NotNull ButtonConfig buttonConfig) {
        Intrinsics.checkNotNullParameter(buttonConfig, "buttonConfig");
        fire(ACTION_TERMS_BUTTON_CLICK, buttonConfig);
    }

    public final void onTopButtonClick$component_ui_welcome_release(@NotNull ButtonConfig buttonConfig) {
        Intrinsics.checkNotNullParameter(buttonConfig, "buttonConfig");
        fire(ACTION_TOP_BUTTON_CLICK, buttonConfig);
    }
}
