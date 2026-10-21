package com.bbva.component.ui.loader.behavior;

import android.content.Context;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import com.bbva.component.ui.loader.config.ViewConfiguration;
import com.bbva.component.ui.loader.databinding.LayoutLoaderviewBinding;
import com.bbva.component.ui.loader.extensions.AnimationExtensionsKt;
import com.bbva.plugin.showinfo.command.HideCommand;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: ViewBehavior.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0018\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016J\u0018\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J \u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\"\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0016J\u0018\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u0011H\u0016¨\u0006\u0014"}, d2 = {"Lcom/bbva/component/ui/loader/behavior/ViewBehavior;", "", "configure", "", "binding", "Lcom/bbva/component/ui/loader/databinding/LayoutLoaderviewBinding;", "configuration", "Lcom/bbva/component/ui/loader/config/ViewConfiguration;", HideCommand.ID, "hideSecondaryMessage", "isNightMode", "", "context", "Landroid/content/Context;", "lastStep", "nextStep", "message", "", "show", "showSecondaryMessage", "component-ui-loader_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface ViewBehavior {

    /* JADX INFO: compiled from: ViewBehavior.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nViewBehavior.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ViewBehavior.kt\ncom/bbva/component/ui/loader/behavior/ViewBehavior$DefaultImpls\n+ 2 AnimationExtensions.kt\ncom/bbva/component/ui/loader/extensions/AnimationExtensionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,83:1\n148#2,9:84\n1#3:93\n*S KotlinDebug\n*F\n+ 1 ViewBehavior.kt\ncom/bbva/component/ui/loader/behavior/ViewBehavior$DefaultImpls\n*L\n56#1:84,9\n*E\n"})
    public static final class DefaultImpls {
        public static void hide(@NotNull ViewBehavior viewBehavior, @NotNull final LayoutLoaderviewBinding binding, @NotNull ViewConfiguration configuration) {
            Object objM5535constructorimpl;
            Intrinsics.checkNotNullParameter(binding, "binding");
            Intrinsics.checkNotNullParameter(configuration, "configuration");
            try {
                Result.Companion companion = Result.INSTANCE;
                objM5535constructorimpl = Result.m5535constructorimpl(AnimationUtils.loadAnimation(binding.getRoot().getContext(), configuration.getExitAnimation()));
            } catch (Throwable th2) {
                Result.Companion companion2 = Result.INSTANCE;
                objM5535constructorimpl = Result.m5535constructorimpl(ResultKt.createFailure(th2));
            }
            if (Result.m5541isSuccessimpl(objM5535constructorimpl)) {
                Animation animation = (Animation) objM5535constructorimpl;
                View root = binding.getRoot();
                Intrinsics.checkNotNull(animation);
                animation.setAnimationListener(new Animation.AnimationListener() { // from class: com.bbva.component.ui.loader.behavior.ViewBehavior$DefaultImpls$hide$lambda$8$lambda$6$$inlined$onEnd$1
                    @Override // android.view.animation.Animation.AnimationListener
                    public void onAnimationEnd(@Nullable Animation animation2) {
                        LayoutLoaderviewBinding layoutLoaderviewBinding = binding;
                        AnimationExtensionsKt.interceptTouches(layoutLoaderviewBinding, false);
                        AnimationExtensionsKt.hideNow(layoutLoaderviewBinding);
                    }

                    @Override // android.view.animation.Animation.AnimationListener
                    public void onAnimationRepeat(@Nullable Animation animation2) {
                    }

                    @Override // android.view.animation.Animation.AnimationListener
                    public void onAnimationStart(@Nullable Animation animation2) {
                    }
                });
                root.startAnimation(animation);
            }
            if (Result.m5538exceptionOrNullimpl(objM5535constructorimpl) != null) {
                AnimationExtensionsKt.hideNow(binding);
            }
        }

        public static void hideSecondaryMessage(@NotNull ViewBehavior viewBehavior, @NotNull LayoutLoaderviewBinding binding) {
            Intrinsics.checkNotNullParameter(binding, "binding");
            AnimationExtensionsKt.hideSecondaryMessage(binding);
        }

        public static boolean isNightMode(@NotNull ViewBehavior viewBehavior, @NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            return (context.getResources().getConfiguration().uiMode & 48) == 32;
        }

        public static void nextStep(@NotNull ViewBehavior viewBehavior, @NotNull LayoutLoaderviewBinding binding, @NotNull ViewConfiguration configuration, @NotNull String message) {
            Intrinsics.checkNotNullParameter(binding, "binding");
            Intrinsics.checkNotNullParameter(configuration, "configuration");
            Intrinsics.checkNotNullParameter(message, "message");
            AnimationExtensionsKt.animateNextMessage$default(binding, message, null, 2, null);
        }

        public static void show(@NotNull ViewBehavior viewBehavior, @NotNull LayoutLoaderviewBinding binding, @NotNull ViewConfiguration configuration, @Nullable String str) {
            Object objM5535constructorimpl;
            Intrinsics.checkNotNullParameter(binding, "binding");
            Intrinsics.checkNotNullParameter(configuration, "configuration");
            AnimationExtensionsKt.nextMessageNow(binding, str);
            try {
                Result.Companion companion = Result.INSTANCE;
                objM5535constructorimpl = Result.m5535constructorimpl(AnimationUtils.loadAnimation(binding.getRoot().getContext(), configuration.getEnterAnimation()));
            } catch (Throwable th2) {
                Result.Companion companion2 = Result.INSTANCE;
                objM5535constructorimpl = Result.m5535constructorimpl(ResultKt.createFailure(th2));
            }
            if (Result.m5541isSuccessimpl(objM5535constructorimpl)) {
                AnimationExtensionsKt.interceptTouches(binding, true);
                binding.getRoot().setVisibility(0);
                binding.getRoot().startAnimation((Animation) objM5535constructorimpl);
            }
            if (Result.m5538exceptionOrNullimpl(objM5535constructorimpl) != null) {
                AnimationExtensionsKt.showNow(binding);
            }
        }

        public static void showSecondaryMessage(@NotNull ViewBehavior viewBehavior, @NotNull LayoutLoaderviewBinding binding, @NotNull String message) {
            Intrinsics.checkNotNullParameter(binding, "binding");
            Intrinsics.checkNotNullParameter(message, "message");
            AnimationExtensionsKt.showSecondaryMessage(binding, message);
        }
    }

    void configure(@NotNull LayoutLoaderviewBinding binding, @NotNull ViewConfiguration configuration);

    void hide(@NotNull LayoutLoaderviewBinding binding, @NotNull ViewConfiguration configuration);

    void hideSecondaryMessage(@NotNull LayoutLoaderviewBinding binding);

    boolean isNightMode(@NotNull Context context);

    void lastStep(@NotNull LayoutLoaderviewBinding binding, @NotNull ViewConfiguration configuration);

    void nextStep(@NotNull LayoutLoaderviewBinding binding, @NotNull ViewConfiguration configuration, @NotNull String message);

    void show(@NotNull LayoutLoaderviewBinding binding, @NotNull ViewConfiguration configuration, @Nullable String message);

    void showSecondaryMessage(@NotNull LayoutLoaderviewBinding binding, @NotNull String message);
}
