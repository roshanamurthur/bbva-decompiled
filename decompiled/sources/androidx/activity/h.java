package androidx.activity;

import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.widget.TextView;
import androidx.camera.core.impl.DeferrableSurface;
import androidx.camera.core.processing.SettableSurface;
import com.airbnb.lottie.LottieCompositionFactory;
import com.airbnb.lottie.utils.Utils;
import com.dasnano.vddocumentcapture.fragments.DocumentFragment;
import com.google.android.material.animation.AnimatableView;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.internal.MultiViewUpdateListener;
import com.google.android.material.internal.ToolbarUtils;
import com.google.android.material.search.SearchBar;
import com.mypinpad.tsdk.isolation.ve;
import java.util.HashMap;
import java.util.Iterator;
import java.util.zip.ZipInputStream;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class h implements Runnable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ int f450p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ Object f451q0;

    public /* synthetic */ h(Object obj, int i10) {
        this.f450p0 = i10;
        this.f451q0 = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f450p0;
        int i11 = 2;
        Object obj = this.f451q0;
        switch (i10) {
            case 0:
                ComponentDialog.a((ComponentDialog) obj);
                break;
            case 1:
                SettableSurface.lambda$setProvider$1((DeferrableSurface) obj);
                break;
            case 2:
                HashMap map = LottieCompositionFactory.f25604a;
                Utils.closeQuietly((ZipInputStream) obj);
                break;
            case 3:
                DocumentFragment.m mVar = (DocumentFragment.m) obj;
                mVar.getClass();
                String str = DocumentFragment.CAMERA_FAILURE;
                DocumentFragment documentFragment = DocumentFragment.this;
                documentFragment.getClass();
                documentFragment.runOnUiThread(new androidx.lifecycle.k(documentFragment, i11));
                break;
            case 4:
                SearchBar searchBar = (SearchBar) obj;
                com.google.android.material.search.l lVar = searchBar.r1;
                Iterator it = lVar.f45163a.iterator();
                while (it.hasNext()) {
                    ((SearchBar.OnLoadAnimationCallback) it.next()).onAnimationStart();
                }
                TextView textView = searchBar.getTextView();
                View centerView = searchBar.getCenterView();
                View secondaryActionMenuItemView = ToolbarUtils.getSecondaryActionMenuItemView(searchBar);
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.setStartDelay(250L);
                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                valueAnimatorOfFloat.addUpdateListener(MultiViewUpdateListener.alphaListener(textView));
                TimeInterpolator timeInterpolator = AnimationUtils.LINEAR_INTERPOLATOR;
                valueAnimatorOfFloat.setInterpolator(timeInterpolator);
                valueAnimatorOfFloat.setDuration(250L);
                animatorSet.play(valueAnimatorOfFloat);
                if (secondaryActionMenuItemView != null) {
                    ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
                    valueAnimatorOfFloat2.addUpdateListener(MultiViewUpdateListener.alphaListener(secondaryActionMenuItemView));
                    valueAnimatorOfFloat2.setInterpolator(timeInterpolator);
                    valueAnimatorOfFloat2.setDuration(250L);
                    animatorSet.play(valueAnimatorOfFloat2);
                }
                animatorSet.addListener(new com.google.android.material.search.f(lVar));
                lVar.f45166d = animatorSet;
                textView.setAlpha(0.0f);
                if (secondaryActionMenuItemView != null) {
                    secondaryActionMenuItemView.setAlpha(0.0f);
                }
                if (centerView instanceof AnimatableView) {
                    ((AnimatableView) centerView).startAnimation(new androidx.camera.camera2.interop.c(animatorSet));
                } else if (centerView == 0) {
                    animatorSet.start();
                } else {
                    centerView.setAlpha(0.0f);
                    centerView.setVisibility(0);
                    ValueAnimator valueAnimatorOfFloat3 = ValueAnimator.ofFloat(0.0f, 1.0f);
                    valueAnimatorOfFloat3.addUpdateListener(MultiViewUpdateListener.alphaListener(centerView));
                    valueAnimatorOfFloat3.setInterpolator(timeInterpolator);
                    valueAnimatorOfFloat3.setDuration(lVar.f45170h ? 250L : 0L);
                    valueAnimatorOfFloat3.setStartDelay(lVar.f45170h ? 500L : 0L);
                    ValueAnimator valueAnimatorOfFloat4 = ValueAnimator.ofFloat(1.0f, 0.0f);
                    valueAnimatorOfFloat4.addUpdateListener(MultiViewUpdateListener.alphaListener(centerView));
                    valueAnimatorOfFloat4.setInterpolator(timeInterpolator);
                    valueAnimatorOfFloat4.setDuration(250L);
                    valueAnimatorOfFloat4.setStartDelay(750L);
                    AnimatorSet animatorSet2 = new AnimatorSet();
                    animatorSet2.playSequentially(valueAnimatorOfFloat3, valueAnimatorOfFloat4);
                    lVar.f45167e = animatorSet2;
                    animatorSet2.addListener(new com.google.android.material.search.g(centerView, animatorSet));
                    animatorSet2.start();
                }
                break;
            default:
                ve.a((Runnable) obj);
                break;
        }
    }
}
