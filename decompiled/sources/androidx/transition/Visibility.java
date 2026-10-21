package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Picture;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.core.content.res.TypedArrayUtils;
import h3.k;
import h3.n;
import h3.q;
import h3.r;
import h3.v;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes2.dex */
public abstract class Visibility extends Transition {
    public static final int MODE_IN = 1;
    public static final int MODE_OUT = 2;

    /* JADX INFO: renamed from: k1, reason: collision with root package name */
    public static final String[] f23711k1 = {"android:visibility:visibility", "android:visibility:parent"};

    /* JADX INFO: renamed from: j1, reason: collision with root package name */
    public int f23712j1;

    @SuppressLint({"UniqueConstants"})
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public @interface Mode {
    }

    public static class a extends AnimatorListenerAdapter implements Transition.TransitionListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final View f23713a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f23714b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final ViewGroup f23715c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f23717e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f23718f = false;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final boolean f23716d = true;

        public a(View view, int i10) {
            this.f23713a = view;
            this.f23714b = i10;
            this.f23715c = (ViewGroup) view.getParent();
            a(true);
        }

        public final void a(boolean z10) {
            ViewGroup viewGroup;
            if (!this.f23716d || this.f23717e == z10 || (viewGroup = this.f23715c) == null) {
                return;
            }
            this.f23717e = z10;
            q.a(viewGroup, z10);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(Animator animator) {
            this.f23718f = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            if (!this.f23718f) {
                r.c(this.f23713a, this.f23714b);
                ViewGroup viewGroup = this.f23715c;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                }
            }
            a(false);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
        }

        @Override // androidx.transition.Transition.TransitionListener
        public final /* synthetic */ void onTransitionEnd(Transition transition, boolean z10) {
            n.a(this, transition, z10);
        }

        @Override // androidx.transition.Transition.TransitionListener
        public final void onTransitionPause(@NonNull Transition transition) {
            a(false);
            if (this.f23718f) {
                return;
            }
            r.c(this.f23713a, this.f23714b);
        }

        @Override // androidx.transition.Transition.TransitionListener
        public final void onTransitionResume(@NonNull Transition transition) {
            a(true);
            if (this.f23718f) {
                return;
            }
            r.c(this.f23713a, 0);
        }

        @Override // androidx.transition.Transition.TransitionListener
        public final void onTransitionStart(@NonNull Transition transition) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationStart(@NonNull Animator animator, boolean z10) {
            if (z10) {
                r.c(this.f23713a, 0);
                ViewGroup viewGroup = this.f23715c;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                }
            }
        }

        @Override // androidx.transition.Transition.TransitionListener
        public final void onTransitionEnd(@NonNull Transition transition) {
            transition.removeListener(this);
        }

        @Override // androidx.transition.Transition.TransitionListener
        public final /* synthetic */ void onTransitionStart(Transition transition, boolean z10) {
            n.b(this, transition, z10);
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(@NonNull Animator animator, boolean z10) {
            if (z10) {
                return;
            }
            if (!this.f23718f) {
                r.c(this.f23713a, this.f23714b);
                ViewGroup viewGroup = this.f23715c;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                }
            }
            a(false);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationRepeat(Animator animator) {
        }

        @Override // androidx.transition.Transition.TransitionListener
        public final void onTransitionCancel(@NonNull Transition transition) {
        }
    }

    public class b extends AnimatorListenerAdapter implements Transition.TransitionListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ViewGroup f23719a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final View f23720b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final View f23721c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f23722d = true;

        public b(ViewGroup viewGroup, View view, View view2) {
            this.f23719a = viewGroup;
            this.f23720b = view;
            this.f23721c = view2;
        }

        public final void a() {
            this.f23721c.setTag(R.id.save_overlay_view, null);
            this.f23719a.getOverlay().remove(this.f23720b);
            this.f23722d = false;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            a();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public final void onAnimationPause(Animator animator) {
            this.f23719a.getOverlay().remove(this.f23720b);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public final void onAnimationResume(Animator animator) {
            View view = this.f23720b;
            if (view.getParent() == null) {
                this.f23719a.getOverlay().add(view);
            } else {
                Visibility.this.cancel();
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationStart(@NonNull Animator animator, boolean z10) {
            if (z10) {
                View view = this.f23721c;
                int i10 = R.id.save_overlay_view;
                View view2 = this.f23720b;
                view.setTag(i10, view2);
                this.f23719a.getOverlay().add(view2);
                this.f23722d = true;
            }
        }

        @Override // androidx.transition.Transition.TransitionListener
        public final void onTransitionCancel(@NonNull Transition transition) {
            if (this.f23722d) {
                a();
            }
        }

        @Override // androidx.transition.Transition.TransitionListener
        public final /* synthetic */ void onTransitionEnd(Transition transition, boolean z10) {
            n.a(this, transition, z10);
        }

        @Override // androidx.transition.Transition.TransitionListener
        public final void onTransitionStart(@NonNull Transition transition) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(@NonNull Animator animator, boolean z10) {
            if (z10) {
                return;
            }
            a();
        }

        @Override // androidx.transition.Transition.TransitionListener
        public final void onTransitionEnd(@NonNull Transition transition) {
            transition.removeListener(this);
        }

        @Override // androidx.transition.Transition.TransitionListener
        public final /* synthetic */ void onTransitionStart(Transition transition, boolean z10) {
            n.b(this, transition, z10);
        }

        @Override // androidx.transition.Transition.TransitionListener
        public final void onTransitionPause(@NonNull Transition transition) {
        }

        @Override // androidx.transition.Transition.TransitionListener
        public final void onTransitionResume(@NonNull Transition transition) {
        }
    }

    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f23724a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f23725b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f23726c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f23727d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public ViewGroup f23728e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public ViewGroup f23729f;
    }

    public Visibility() {
        this.f23712j1 = 3;
    }

    public static void q(TransitionValues transitionValues) {
        transitionValues.values.put("android:visibility:visibility", Integer.valueOf(transitionValues.view.getVisibility()));
        transitionValues.values.put("android:visibility:parent", transitionValues.view.getParent());
        int[] iArr = new int[2];
        transitionValues.view.getLocationOnScreen(iArr);
        transitionValues.values.put("android:visibility:screenLocation", iArr);
    }

    public static c r(TransitionValues transitionValues, TransitionValues transitionValues2) {
        c cVar = new c();
        cVar.f23724a = false;
        cVar.f23725b = false;
        if (transitionValues == null || !transitionValues.values.containsKey("android:visibility:visibility")) {
            cVar.f23726c = -1;
            cVar.f23728e = null;
        } else {
            cVar.f23726c = ((Integer) transitionValues.values.get("android:visibility:visibility")).intValue();
            cVar.f23728e = (ViewGroup) transitionValues.values.get("android:visibility:parent");
        }
        if (transitionValues2 == null || !transitionValues2.values.containsKey("android:visibility:visibility")) {
            cVar.f23727d = -1;
            cVar.f23729f = null;
        } else {
            cVar.f23727d = ((Integer) transitionValues2.values.get("android:visibility:visibility")).intValue();
            cVar.f23729f = (ViewGroup) transitionValues2.values.get("android:visibility:parent");
        }
        if (transitionValues != null && transitionValues2 != null) {
            int i10 = cVar.f23726c;
            int i11 = cVar.f23727d;
            if (i10 == i11 && cVar.f23728e == cVar.f23729f) {
                return cVar;
            }
            if (i10 != i11) {
                if (i10 == 0) {
                    cVar.f23725b = false;
                    cVar.f23724a = true;
                } else if (i11 == 0) {
                    cVar.f23725b = true;
                    cVar.f23724a = true;
                }
            } else if (cVar.f23729f == null) {
                cVar.f23725b = false;
                cVar.f23724a = true;
            } else if (cVar.f23728e == null) {
                cVar.f23725b = true;
                cVar.f23724a = true;
            }
        } else if (transitionValues == null && cVar.f23727d == 0) {
            cVar.f23725b = true;
            cVar.f23724a = true;
        } else if (transitionValues2 == null && cVar.f23726c == 0) {
            cVar.f23725b = false;
            cVar.f23724a = true;
        }
        return cVar;
    }

    @Override // androidx.transition.Transition
    public void captureEndValues(@NonNull TransitionValues transitionValues) {
        q(transitionValues);
    }

    @Override // androidx.transition.Transition
    public void captureStartValues(@NonNull TransitionValues transitionValues) {
        q(transitionValues);
    }

    @Override // androidx.transition.Transition
    @Nullable
    public Animator createAnimator(@NonNull ViewGroup viewGroup, @Nullable TransitionValues transitionValues, @Nullable TransitionValues transitionValues2) {
        c cVarR = r(transitionValues, transitionValues2);
        if (!cVarR.f23724a) {
            return null;
        }
        if (cVarR.f23728e == null && cVarR.f23729f == null) {
            return null;
        }
        return cVarR.f23725b ? onAppear(viewGroup, transitionValues, cVarR.f23726c, transitionValues2, cVarR.f23727d) : onDisappear(viewGroup, transitionValues, cVarR.f23726c, transitionValues2, cVarR.f23727d);
    }

    public int getMode() {
        return this.f23712j1;
    }

    @Override // androidx.transition.Transition
    @Nullable
    public String[] getTransitionProperties() {
        return f23711k1;
    }

    @Override // androidx.transition.Transition
    public boolean isTransitionRequired(@Nullable TransitionValues transitionValues, @Nullable TransitionValues transitionValues2) {
        if (transitionValues == null && transitionValues2 == null) {
            return false;
        }
        if (transitionValues != null && transitionValues2 != null && transitionValues2.values.containsKey("android:visibility:visibility") != transitionValues.values.containsKey("android:visibility:visibility")) {
            return false;
        }
        c cVarR = r(transitionValues, transitionValues2);
        if (cVarR.f23724a) {
            return cVarR.f23726c == 0 || cVarR.f23727d == 0;
        }
        return false;
    }

    public boolean isVisible(@Nullable TransitionValues transitionValues) {
        if (transitionValues == null) {
            return false;
        }
        return ((Integer) transitionValues.values.get("android:visibility:visibility")).intValue() == 0 && ((View) transitionValues.values.get("android:visibility:parent")) != null;
    }

    @Nullable
    public Animator onAppear(@NonNull ViewGroup viewGroup, @NonNull View view, @Nullable TransitionValues transitionValues, @Nullable TransitionValues transitionValues2) {
        return null;
    }

    @Nullable
    public Animator onDisappear(@NonNull ViewGroup viewGroup, @NonNull View view, @Nullable TransitionValues transitionValues, @Nullable TransitionValues transitionValues2) {
        return null;
    }

    public void setMode(int i10) {
        if ((i10 & (-4)) != 0) {
            throw new IllegalArgumentException("Only MODE_IN and MODE_OUT flags are allowed");
        }
        this.f23712j1 = i10;
    }

    @Nullable
    public Animator onAppear(@NonNull ViewGroup viewGroup, @Nullable TransitionValues transitionValues, int i10, @Nullable TransitionValues transitionValues2, int i11) {
        if ((this.f23712j1 & 1) != 1 || transitionValues2 == null) {
            return null;
        }
        if (transitionValues == null) {
            View view = (View) transitionValues2.view.getParent();
            if (r(h(view, false), getTransitionValues(view, false)).f23724a) {
                return null;
            }
        }
        return onAppear(viewGroup, transitionValues2.view, transitionValues, transitionValues2);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x003f  */
    /* JADX WARN: Code duplicated, block: B:56:0x0181  */
    /* JADX WARN: Code duplicated, block: B:69:0x01c1  */
    @Nullable
    public Animator onDisappear(@NonNull ViewGroup viewGroup, @Nullable TransitionValues transitionValues, int i10, @Nullable TransitionValues transitionValues2, int i11) {
        View view;
        boolean z10;
        int i12;
        int i13;
        ViewGroup viewGroup2;
        Bitmap bitmapCreateBitmap;
        Visibility visibility = this;
        View view2 = null;
        if ((visibility.f23712j1 & 2) != 2 || transitionValues == null) {
            return null;
        }
        View view3 = transitionValues.view;
        View view4 = transitionValues2 != null ? transitionValues2.view : null;
        int i14 = R.id.save_overlay_view;
        View view5 = (View) view3.getTag(i14);
        boolean z11 = true;
        if (view5 != null) {
            i12 = i14;
        } else {
            if (view4 == null || view4.getParent() == null) {
                if (view4 != null) {
                    view = null;
                    z10 = false;
                } else {
                    view4 = null;
                    view = null;
                    z10 = true;
                }
            } else if (i11 == 4 || view3 == view4) {
                view = view4;
                z10 = false;
                view4 = null;
            } else {
                view4 = null;
                view = null;
                z10 = true;
            }
            if (z10) {
                if (view3.getParent() == null) {
                    i12 = i14;
                    view = view;
                } else {
                    if (view3.getParent() instanceof View) {
                        View view6 = (View) view3.getParent();
                        if (r(visibility.getTransitionValues(view6, true), visibility.h(view6, true)).f23724a) {
                            i12 = i14;
                            view = view;
                            int id = view6.getId();
                            if (view6.getParent() != null || id == -1 || viewGroup.findViewById(id) == null) {
                                visibility = this;
                            } else {
                                visibility = this;
                                if (visibility.Q0) {
                                }
                            }
                        } else {
                            boolean z12 = androidx.transition.c.f23741a;
                            Matrix matrix = new Matrix();
                            matrix.setTranslate(-view6.getScrollX(), -view6.getScrollY());
                            v vVar = r.f69339a;
                            vVar.e(view3, matrix);
                            vVar.f(viewGroup, matrix);
                            RectF rectF = new RectF(0.0f, 0.0f, view3.getWidth(), view3.getHeight());
                            matrix.mapRect(rectF);
                            int iRound = Math.round(rectF.left);
                            int iRound2 = Math.round(rectF.top);
                            int iRound3 = Math.round(rectF.right);
                            int iRound4 = Math.round(rectF.bottom);
                            ImageView imageView = new ImageView(view3.getContext());
                            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
                            boolean z13 = !view3.isAttachedToWindow();
                            boolean z14 = viewGroup != null && viewGroup.isAttachedToWindow();
                            if (z13) {
                                if (z14) {
                                    ViewGroup viewGroup3 = (ViewGroup) view3.getParent();
                                    int iIndexOfChild = viewGroup3.indexOfChild(view3);
                                    viewGroup.getOverlay().add(view3);
                                    i13 = iIndexOfChild;
                                    viewGroup2 = viewGroup3;
                                } else {
                                    i12 = i14;
                                    view = view;
                                    bitmapCreateBitmap = null;
                                }
                                if (bitmapCreateBitmap != null) {
                                    imageView.setImageBitmap(bitmapCreateBitmap);
                                }
                                imageView.measure(View.MeasureSpec.makeMeasureSpec(iRound3 - iRound, 1073741824), View.MeasureSpec.makeMeasureSpec(iRound4 - iRound2, 1073741824));
                                imageView.layout(iRound, iRound2, iRound3, iRound4);
                                visibility = this;
                                view5 = imageView;
                            } else {
                                i13 = 0;
                                viewGroup2 = null;
                            }
                            i12 = i14;
                            int iRound5 = Math.round(rectF.width());
                            int iRound6 = Math.round(rectF.height());
                            if (iRound5 <= 0 || iRound6 <= 0) {
                                bitmapCreateBitmap = null;
                            } else {
                                float fMin = Math.min(1.0f, 1048576.0f / (iRound5 * iRound6));
                                int iRound7 = Math.round(iRound5 * fMin);
                                int iRound8 = Math.round(iRound6 * fMin);
                                matrix.postTranslate(-rectF.left, -rectF.top);
                                matrix.postScale(fMin, fMin);
                                if (androidx.transition.c.f23741a) {
                                    Picture picture = new Picture();
                                    Canvas canvasBeginRecording = picture.beginRecording(iRound7, iRound8);
                                    canvasBeginRecording.concat(matrix);
                                    view3.draw(canvasBeginRecording);
                                    picture.endRecording();
                                    bitmapCreateBitmap = androidx.transition.c.a.a(picture);
                                } else {
                                    bitmapCreateBitmap = Bitmap.createBitmap(iRound7, iRound8, Bitmap.Config.ARGB_8888);
                                    Canvas canvas = new Canvas(bitmapCreateBitmap);
                                    canvas.concat(matrix);
                                    view3.draw(canvas);
                                }
                            }
                            if (z13) {
                                viewGroup.getOverlay().remove(view3);
                                viewGroup2.addView(view3, i13);
                            }
                            if (bitmapCreateBitmap != null) {
                                imageView.setImageBitmap(bitmapCreateBitmap);
                            }
                            imageView.measure(View.MeasureSpec.makeMeasureSpec(iRound3 - iRound, 1073741824), View.MeasureSpec.makeMeasureSpec(iRound4 - iRound2, 1073741824));
                            imageView.layout(iRound, iRound2, iRound3, iRound4);
                            visibility = this;
                            view5 = imageView;
                        }
                    } else {
                        i12 = i14;
                        view = view;
                    }
                    view5 = view4;
                }
                view5 = view3;
            } else {
                i12 = i14;
                view = view;
                view5 = view4;
            }
            view2 = view;
            z11 = false;
        }
        if (view5 == null) {
            if (view2 == null) {
                return null;
            }
            int visibility2 = view2.getVisibility();
            r.c(view2, 0);
            Animator animatorOnDisappear = visibility.onDisappear(viewGroup, view2, transitionValues, transitionValues2);
            if (animatorOnDisappear != null) {
                a aVar = new a(view2, i11);
                animatorOnDisappear.addListener(aVar);
                getRootTransition().addListener(aVar);
            } else {
                r.c(view2, visibility2);
            }
            return animatorOnDisappear;
        }
        if (!z11) {
            int[] iArr = (int[]) transitionValues.values.get("android:visibility:screenLocation");
            int i15 = iArr[0];
            int i16 = iArr[1];
            int[] iArr2 = new int[2];
            viewGroup.getLocationOnScreen(iArr2);
            view5.offsetLeftAndRight((i15 - iArr2[0]) - view5.getLeft());
            view5.offsetTopAndBottom((i16 - iArr2[1]) - view5.getTop());
            viewGroup.getOverlay().add(view5);
        }
        Animator animatorOnDisappear2 = visibility.onDisappear(viewGroup, view5, transitionValues, transitionValues2);
        if (!z11) {
            if (animatorOnDisappear2 == null) {
                viewGroup.getOverlay().remove(view5);
            } else {
                view3.setTag(i12, view5);
                b bVar = visibility.new b(viewGroup, view5, view3);
                animatorOnDisappear2.addListener(bVar);
                animatorOnDisappear2.addPauseListener(bVar);
                getRootTransition().addListener(bVar);
            }
        }
        return animatorOnDisappear2;
    }

    public Visibility(@NonNull Context context, @NonNull AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f23712j1 = 3;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, k.f69319e);
        int namedInt = TypedArrayUtils.getNamedInt(typedArrayObtainStyledAttributes, (XmlResourceParser) attributeSet, "transitionVisibilityMode", 0, 0);
        typedArrayObtainStyledAttributes.recycle();
        if (namedInt != 0) {
            setMode(namedInt);
        }
    }
}
