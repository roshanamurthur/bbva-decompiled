package e2;

import android.animation.Animator;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import kotlin.jvm.JvmStatic;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Animator.kt */
/* JADX INFO: loaded from: classes.dex */
@RequiresApi(19)
public final class a {
    @JvmStatic
    @DoNotInline
    public static final void a(@NotNull Animator animator, @NotNull Animator.AnimatorPauseListener animatorPauseListener) {
        animator.addPauseListener(animatorPauseListener);
    }
}
