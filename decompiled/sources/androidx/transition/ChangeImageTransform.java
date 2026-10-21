package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.TypeEvaluator;
import android.content.Context;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import h3.f;
import h3.g;
import h3.n;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class ChangeImageTransform extends Transition {

    /* JADX INFO: renamed from: j1, reason: collision with root package name */
    public static final String[] f23577j1 = {"android:changeImageTransform:matrix", "android:changeImageTransform:bounds"};

    /* JADX INFO: renamed from: k1, reason: collision with root package name */
    public static final a f23578k1 = new a();

    /* JADX INFO: renamed from: l1, reason: collision with root package name */
    public static final b f23579l1 = new b(Matrix.class, "animatedTransform");

    public class a implements TypeEvaluator<Matrix> {
        @Override // android.animation.TypeEvaluator
        public final /* bridge */ /* synthetic */ Matrix evaluate(float f6, Matrix matrix, Matrix matrix2) {
            return null;
        }
    }

    public class b extends Property<ImageView, Matrix> {
        @Override // android.util.Property
        public final /* bridge */ /* synthetic */ Matrix get(ImageView imageView) {
            return null;
        }

        @Override // android.util.Property
        public final void set(ImageView imageView, Matrix matrix) {
            f.a(imageView, matrix);
        }
    }

    public static /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f23580a;

        static {
            int[] iArr = new int[ImageView.ScaleType.values().length];
            f23580a = iArr;
            try {
                iArr[ImageView.ScaleType.FIT_XY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f23580a[ImageView.ScaleType.CENTER_CROP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public static class d extends AnimatorListenerAdapter implements Transition.TransitionListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ImageView f23581a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Matrix f23582b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Matrix f23583c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f23584d = true;

        public d(ImageView imageView, Matrix matrix, Matrix matrix2) {
            this.f23581a = imageView;
            this.f23582b = matrix;
            this.f23583c = matrix2;
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(@NonNull Animator animator, boolean z10) {
            this.f23584d = z10;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public final void onAnimationPause(Animator animator) {
            Matrix matrix = (Matrix) ((ObjectAnimator) animator).getAnimatedValue();
            int i10 = R.id.transition_image_transform;
            ImageView imageView = this.f23581a;
            imageView.setTag(i10, matrix);
            f.a(imageView, this.f23583c);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public final void onAnimationResume(Animator animator) {
            int i10 = R.id.transition_image_transform;
            ImageView imageView = this.f23581a;
            Matrix matrix = (Matrix) imageView.getTag(i10);
            if (matrix != null) {
                f.a(imageView, matrix);
                imageView.setTag(i10, null);
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationStart(@NonNull Animator animator, boolean z10) {
            this.f23584d = false;
        }

        @Override // androidx.transition.Transition.TransitionListener
        public final void onTransitionEnd(@NonNull Transition transition) {
        }

        @Override // androidx.transition.Transition.TransitionListener
        public final void onTransitionPause(@NonNull Transition transition) {
            if (this.f23584d) {
                int i10 = R.id.transition_image_transform;
                ImageView imageView = this.f23581a;
                imageView.setTag(i10, this.f23582b);
                f.a(imageView, this.f23583c);
            }
        }

        @Override // androidx.transition.Transition.TransitionListener
        public final void onTransitionResume(@NonNull Transition transition) {
            int i10 = R.id.transition_image_transform;
            ImageView imageView = this.f23581a;
            Matrix matrix = (Matrix) imageView.getTag(i10);
            if (matrix != null) {
                f.a(imageView, matrix);
                imageView.setTag(i10, null);
            }
        }

        @Override // androidx.transition.Transition.TransitionListener
        public final void onTransitionStart(@NonNull Transition transition) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            this.f23584d = false;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
            this.f23584d = false;
        }

        @Override // androidx.transition.Transition.TransitionListener
        public final /* synthetic */ void onTransitionEnd(Transition transition, boolean z10) {
            n.a(this, transition, z10);
        }

        @Override // androidx.transition.Transition.TransitionListener
        public final /* synthetic */ void onTransitionStart(Transition transition, boolean z10) {
            n.b(this, transition, z10);
        }

        @Override // androidx.transition.Transition.TransitionListener
        public final void onTransitionCancel(@NonNull Transition transition) {
        }
    }

    public ChangeImageTransform() {
    }

    public static void q(TransitionValues transitionValues, boolean z10) {
        Matrix matrix;
        View view = transitionValues.view;
        if ((view instanceof ImageView) && view.getVisibility() == 0) {
            ImageView imageView = (ImageView) view;
            if (imageView.getDrawable() == null) {
                return;
            }
            Map<String, Object> map = transitionValues.values;
            map.put("android:changeImageTransform:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
            Matrix matrix2 = z10 ? (Matrix) imageView.getTag(R.id.transition_image_transform) : null;
            if (matrix2 == null) {
                Drawable drawable = imageView.getDrawable();
                if (drawable.getIntrinsicWidth() <= 0 || drawable.getIntrinsicHeight() <= 0) {
                    matrix2 = new Matrix(imageView.getImageMatrix());
                } else {
                    int i10 = c.f23580a[imageView.getScaleType().ordinal()];
                    if (i10 == 1) {
                        Drawable drawable2 = imageView.getDrawable();
                        matrix = new Matrix();
                        matrix.postScale(imageView.getWidth() / drawable2.getIntrinsicWidth(), imageView.getHeight() / drawable2.getIntrinsicHeight());
                    } else if (i10 != 2) {
                        matrix2 = new Matrix(imageView.getImageMatrix());
                    } else {
                        Drawable drawable3 = imageView.getDrawable();
                        int intrinsicWidth = drawable3.getIntrinsicWidth();
                        float width = imageView.getWidth();
                        float f6 = intrinsicWidth;
                        int intrinsicHeight = drawable3.getIntrinsicHeight();
                        float height = imageView.getHeight();
                        float f10 = intrinsicHeight;
                        float fMax = Math.max(width / f6, height / f10);
                        int iRound = Math.round((width - (f6 * fMax)) / 2.0f);
                        int iRound2 = Math.round((height - (f10 * fMax)) / 2.0f);
                        matrix = new Matrix();
                        matrix.postScale(fMax, fMax);
                        matrix.postTranslate(iRound, iRound2);
                    }
                    matrix2 = matrix;
                }
            }
            map.put("android:changeImageTransform:matrix", matrix2);
        }
    }

    @Override // androidx.transition.Transition
    public void captureEndValues(@NonNull TransitionValues transitionValues) {
        q(transitionValues, false);
    }

    @Override // androidx.transition.Transition
    public void captureStartValues(@NonNull TransitionValues transitionValues) {
        q(transitionValues, true);
    }

    @Override // androidx.transition.Transition
    @Nullable
    public Animator createAnimator(@NonNull ViewGroup viewGroup, @Nullable TransitionValues transitionValues, @Nullable TransitionValues transitionValues2) {
        if (transitionValues != null && transitionValues2 != null) {
            Rect rect = (Rect) transitionValues.values.get("android:changeImageTransform:bounds");
            Rect rect2 = (Rect) transitionValues2.values.get("android:changeImageTransform:bounds");
            if (rect != null && rect2 != null) {
                Matrix matrix = (Matrix) transitionValues.values.get("android:changeImageTransform:matrix");
                Matrix matrix2 = (Matrix) transitionValues2.values.get("android:changeImageTransform:matrix");
                boolean z10 = (matrix == null && matrix2 == null) || (matrix != null && matrix.equals(matrix2));
                if (rect.equals(rect2) && z10) {
                    return null;
                }
                ImageView imageView = (ImageView) transitionValues2.view;
                Drawable drawable = imageView.getDrawable();
                int intrinsicWidth = drawable.getIntrinsicWidth();
                int intrinsicHeight = drawable.getIntrinsicHeight();
                b bVar = f23579l1;
                if (intrinsicWidth <= 0 || intrinsicHeight <= 0) {
                    a aVar = f23578k1;
                    g.a aVar2 = g.f69313a;
                    return ObjectAnimator.ofObject(imageView, bVar, aVar, aVar2, aVar2);
                }
                if (matrix == null) {
                    matrix = g.f69313a;
                }
                if (matrix2 == null) {
                    matrix2 = g.f69313a;
                }
                bVar.set(imageView, matrix);
                ObjectAnimator objectAnimatorOfObject = ObjectAnimator.ofObject(imageView, bVar, new androidx.transition.c.b(), matrix, matrix2);
                d dVar = new d(imageView, matrix, matrix2);
                objectAnimatorOfObject.addListener(dVar);
                objectAnimatorOfObject.addPauseListener(dVar);
                addListener(dVar);
                return objectAnimatorOfObject;
            }
        }
        return null;
    }

    @Override // androidx.transition.Transition
    @NonNull
    public String[] getTransitionProperties() {
        return f23577j1;
    }

    @Override // androidx.transition.Transition
    public boolean isSeekingSupported() {
        return true;
    }

    public ChangeImageTransform(@NonNull Context context, @NonNull AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
