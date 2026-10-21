package com.bbva.component.ui.loader.behavior;

import android.animation.Animator;
import android.content.Context;
import com.airbnb.lottie.LottieAnimationView;
import com.bbva.component.ui.loader.LoaderViewModel;
import com.bbva.component.ui.loader.R;
import com.bbva.component.ui.loader.config.ViewConfiguration;
import com.bbva.component.ui.loader.databinding.LayoutLoaderviewBinding;
import com.bbva.component.ui.loader.extensions.AnimationExtensionsKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: LoaderBehavior.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\"\u0010\n\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016J\u0018\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\u0010"}, d2 = {"Lcom/bbva/component/ui/loader/behavior/LoaderBehavior;", "Lcom/bbva/component/ui/loader/behavior/ViewBehavior;", "Lcom/bbva/component/ui/loader/databinding/LayoutLoaderviewBinding;", "binding", "Lcom/bbva/component/ui/loader/config/ViewConfiguration;", "configuration", "", "configure", "", "message", "show", "lastStep", "Lcom/bbva/component/ui/loader/LoaderViewModel;", "viewModel", "<init>", "(Lcom/bbva/component/ui/loader/LoaderViewModel;)V", "component-ui-loader_release"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nLoaderBehavior.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LoaderBehavior.kt\ncom/bbva/component/ui/loader/behavior/LoaderBehavior\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 AnimationExtensions.kt\ncom/bbva/component/ui/loader/extensions/AnimationExtensionsKt\n*L\n1#1,52:1\n1#2:53\n138#3,9:54\n*S KotlinDebug\n*F\n+ 1 LoaderBehavior.kt\ncom/bbva/component/ui/loader/behavior/LoaderBehavior\n*L\n23#1:54,9\n*E\n"})
public final class LoaderBehavior implements ViewBehavior {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final LoaderViewModel f28445a;

    public LoaderBehavior(@NotNull LoaderViewModel viewModel) {
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        this.f28445a = viewModel;
    }

    @Override // com.bbva.component.ui.loader.behavior.ViewBehavior
    public void configure(@NotNull LayoutLoaderviewBinding binding, @NotNull ViewConfiguration configuration) {
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        LottieAnimationView lottieAnimationView = binding.loaderLottieView;
        Context context = lottieAnimationView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        lottieAnimationView.setAnimation(isNightMode(context) ? R.raw.lock : R.raw.spinner_core_blue_dark);
        LottieAnimationView lottieAnimationView2 = binding.lockLottieView;
        Intrinsics.checkNotNull(lottieAnimationView2);
        lottieAnimationView2.addAnimatorListener(new Animator.AnimatorListener() { // from class: com.bbva.component.ui.loader.behavior.LoaderBehavior$configure$lambda$3$lambda$2$$inlined$onEnd$1
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(@NotNull Animator animation) {
                Intrinsics.checkNotNullParameter(animation, "animation");
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(@NotNull Animator animation) {
                Intrinsics.checkNotNullParameter(animation, "animation");
                this.f28446a.f28445a.lastStepFinish$component_ui_loader_release();
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(@NotNull Animator animation) {
                Intrinsics.checkNotNullParameter(animation, "animation");
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(@NotNull Animator animation) {
                Intrinsics.checkNotNullParameter(animation, "animation");
            }
        });
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
        AnimationExtensionsKt.playLockLottie(binding, this.f28445a);
        AnimationExtensionsKt.hideLabel(binding);
    }

    @Override // com.bbva.component.ui.loader.behavior.ViewBehavior
    public void nextStep(@NotNull LayoutLoaderviewBinding layoutLoaderviewBinding, @NotNull ViewConfiguration viewConfiguration, @NotNull String str) {
        ViewBehavior.DefaultImpls.nextStep(this, layoutLoaderviewBinding, viewConfiguration, str);
    }

    @Override // com.bbva.component.ui.loader.behavior.ViewBehavior
    public void show(@NotNull LayoutLoaderviewBinding binding, @NotNull ViewConfiguration configuration, @Nullable String message) {
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        AnimationExtensionsKt.resetConstraints(binding);
        ViewBehavior.DefaultImpls.show(this, binding, configuration, message);
    }

    @Override // com.bbva.component.ui.loader.behavior.ViewBehavior
    public void showSecondaryMessage(@NotNull LayoutLoaderviewBinding layoutLoaderviewBinding, @NotNull String str) {
        ViewBehavior.DefaultImpls.showSecondaryMessage(this, layoutLoaderviewBinding, str);
    }
}
