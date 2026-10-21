package com.bbva.component.ui.loader.behavior;

import android.content.Context;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;
import com.airbnb.lottie.LottieAnimationView;
import com.bbva.component.ui.loader.LoaderViewModel;
import com.bbva.component.ui.loader.R;
import com.bbva.component.ui.loader.config.ViewConfiguration;
import com.bbva.component.ui.loader.databinding.LayoutLoaderviewBinding;
import com.bbva.component.ui.loader.extensions.AnimationExtensionsKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: SpinnerBehavior.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ \u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0018\u0010\n\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0018\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\u0010"}, d2 = {"Lcom/bbva/component/ui/loader/behavior/SpinnerBehavior;", "Lcom/bbva/component/ui/loader/behavior/ViewBehavior;", "Lcom/bbva/component/ui/loader/databinding/LayoutLoaderviewBinding;", "binding", "Lcom/bbva/component/ui/loader/config/ViewConfiguration;", "configuration", "", "message", "", "nextStep", "configure", "lastStep", "Lcom/bbva/component/ui/loader/LoaderViewModel;", "viewModel", "<init>", "(Lcom/bbva/component/ui/loader/LoaderViewModel;)V", "component-ui-loader_release"}, k = 1, mv = {1, 9, 0})
public final class SpinnerBehavior implements ViewBehavior {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final LoaderViewModel f28447a;

    public SpinnerBehavior(@NotNull LoaderViewModel viewModel) {
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        this.f28447a = viewModel;
    }

    @Override // com.bbva.component.ui.loader.behavior.ViewBehavior
    public void configure(@NotNull LayoutLoaderviewBinding binding, @NotNull ViewConfiguration configuration) {
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        binding.messageLabel.setGravity(1);
        binding.secondaryMessageLabel.setGravity(1);
        binding.lockLottieView.setVisibility(8);
        ConstraintLayout constraintLayout = binding.lightBackground;
        constraintLayout.setMinHeight(0);
        constraintLayout.setBackground(null);
        LottieAnimationView lottieAnimationView = binding.loaderLottieView;
        Context context = binding.getRoot().getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        lottieAnimationView.setAnimation(isNightMode(context) ? R.raw.spinner_white_dark : R.raw.spinner_white);
        ConstraintSet constraintSet = new ConstraintSet();
        View root = binding.getRoot();
        Intrinsics.checkNotNull(root, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout");
        constraintSet.clone((ConstraintLayout) root);
        constraintSet.clear(binding.lockLottieView.getId(), 4);
        constraintSet.clear(binding.lightBackground.getId(), 3);
        constraintSet.clear(binding.lightBackground.getId(), 4);
        constraintSet.clear(binding.messageLabel.getId(), 3);
        constraintSet.clear(binding.nextMessageLabel.getId(), 3);
        constraintSet.connect(binding.lightBackground.getId(), 3, binding.loaderLottieView.getId(), 4);
        constraintSet.connect(binding.messageLabel.getId(), 3, binding.lightBackground.getId(), 4);
        constraintSet.connect(binding.nextMessageLabel.getId(), 3, binding.lightBackground.getId(), 4);
        View root2 = binding.getRoot();
        Intrinsics.checkNotNull(root2, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout");
        constraintSet.applyTo((ConstraintLayout) root2);
    }

    @Override // com.bbva.component.ui.loader.behavior.ViewBehavior
    public void hide(@NotNull LayoutLoaderviewBinding layoutLoaderviewBinding, @NotNull ViewConfiguration viewConfiguration) {
        ViewBehavior.DefaultImpls.hide(this, layoutLoaderviewBinding, viewConfiguration);
    }

    @Override // com.bbva.component.ui.loader.behavior.ViewBehavior
    public void hideSecondaryMessage(@NotNull LayoutLoaderviewBinding layoutLoaderviewBinding) {
        ViewBehavior.DefaultImpls.hideSecondaryMessage(this, layoutLoaderviewBinding);
    }

    @Override // com.bbva.component.ui.loader.behavior.ViewBehavior
    public boolean isNightMode(@NotNull Context context) {
        return ViewBehavior.DefaultImpls.isNightMode(this, context);
    }

    @Override // com.bbva.component.ui.loader.behavior.ViewBehavior
    public void lastStep(@NotNull LayoutLoaderviewBinding binding, @NotNull ViewConfiguration configuration) {
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        this.f28447a.lastStepFinish$component_ui_loader_release();
    }

    @Override // com.bbva.component.ui.loader.behavior.ViewBehavior
    public void nextStep(@NotNull LayoutLoaderviewBinding binding, @NotNull ViewConfiguration configuration, @NotNull String message) {
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(message, "message");
        AnimationExtensionsKt.animateNextMessage(binding, message, this);
    }

    @Override // com.bbva.component.ui.loader.behavior.ViewBehavior
    public void show(@NotNull LayoutLoaderviewBinding layoutLoaderviewBinding, @NotNull ViewConfiguration viewConfiguration, @Nullable String str) {
        ViewBehavior.DefaultImpls.show(this, layoutLoaderviewBinding, viewConfiguration, str);
    }

    @Override // com.bbva.component.ui.loader.behavior.ViewBehavior
    public void showSecondaryMessage(@NotNull LayoutLoaderviewBinding layoutLoaderviewBinding, @NotNull String str) {
        ViewBehavior.DefaultImpls.showSecondaryMessage(this, layoutLoaderviewBinding, str);
    }
}
