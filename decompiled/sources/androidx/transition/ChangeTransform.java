package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.res.TypedArrayUtils;
import androidx.core.view.ViewCompat;
import h3.g;
import h3.i;
import h3.k;
import h3.q;
import h3.r;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: loaded from: classes2.dex */
public class ChangeTransform extends Transition {

    /* JADX INFO: renamed from: m1, reason: collision with root package name */
    public static final String[] f23586m1 = {"android:changeTransform:matrix", "android:changeTransform:transforms", "android:changeTransform:parentMatrix"};

    /* JADX INFO: renamed from: n1, reason: collision with root package name */
    public static final a f23587n1 = new a(float[].class, "nonTranslations");

    /* JADX INFO: renamed from: o1, reason: collision with root package name */
    public static final b f23588o1 = new b(PointF.class, "translations");

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    public static final boolean f23589p1 = true;

    /* JADX INFO: renamed from: j1, reason: collision with root package name */
    public boolean f23590j1;

    /* JADX INFO: renamed from: k1, reason: collision with root package name */
    public boolean f23591k1;

    /* JADX INFO: renamed from: l1, reason: collision with root package name */
    public final Matrix f23592l1;

    public class a extends Property<e, float[]> {
        @Override // android.util.Property
        public final /* bridge */ /* synthetic */ float[] get(e eVar) {
            return null;
        }

        @Override // android.util.Property
        public final void set(e eVar, float[] fArr) {
            e eVar2 = eVar;
            float[] fArr2 = fArr;
            eVar2.getClass();
            System.arraycopy(fArr2, 0, eVar2.f23605c, 0, fArr2.length);
            eVar2.a();
        }
    }

    public class b extends Property<e, PointF> {
        @Override // android.util.Property
        public final /* bridge */ /* synthetic */ PointF get(e eVar) {
            return null;
        }

        @Override // android.util.Property
        public final void set(e eVar, PointF pointF) {
            e eVar2 = eVar;
            PointF pointF2 = pointF;
            eVar2.getClass();
            eVar2.f23606d = pointF2.x;
            eVar2.f23607e = pointF2.y;
            eVar2.a();
        }
    }

    public static class c extends TransitionListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public View f23593a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public h3.d f23594b;

        @Override // androidx.transition.TransitionListenerAdapter, androidx.transition.Transition.TransitionListener
        public final void onTransitionEnd(@NonNull Transition transition) {
            transition.removeListener(this);
            int i10 = Build.VERSION.SDK_INT;
            View view = this.f23593a;
            if (i10 == 28) {
                if (!h3.e.v0) {
                    try {
                        if (!h3.e.f69307r0) {
                            try {
                                h3.e.f69306q0 = Class.forName("android.view.GhostView");
                            } catch (ClassNotFoundException unused) {
                            }
                            h3.e.f69307r0 = true;
                        }
                        Method declaredMethod = h3.e.f69306q0.getDeclaredMethod("removeGhost", View.class);
                        h3.e.f69310u0 = declaredMethod;
                        declaredMethod.setAccessible(true);
                    } catch (NoSuchMethodException unused2) {
                    }
                    h3.e.v0 = true;
                }
                Method method = h3.e.f69310u0;
                if (method != null) {
                    try {
                        method.invoke(null, view);
                    } catch (IllegalAccessException unused3) {
                    } catch (InvocationTargetException e5) {
                        throw new RuntimeException(e5.getCause());
                    }
                }
            } else {
                int i11 = androidx.transition.b.v0;
                androidx.transition.b bVar = (androidx.transition.b) view.getTag(R.id.ghost_view);
                if (bVar != null) {
                    int i12 = bVar.f23737s0 - 1;
                    bVar.f23737s0 = i12;
                    if (i12 <= 0) {
                        ((androidx.transition.a) bVar.getParent()).removeView(bVar);
                    }
                }
            }
            view.setTag(R.id.transition_transform, null);
            view.setTag(R.id.parent_matrix, null);
        }

        @Override // androidx.transition.TransitionListenerAdapter, androidx.transition.Transition.TransitionListener
        public final void onTransitionPause(@NonNull Transition transition) {
            this.f23594b.setVisibility(4);
        }

        @Override // androidx.transition.TransitionListenerAdapter, androidx.transition.Transition.TransitionListener
        public final void onTransitionResume(@NonNull Transition transition) {
            this.f23594b.setVisibility(0);
        }
    }

    public static class d extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f23595a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Matrix f23596b = new Matrix();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f23597c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final boolean f23598d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final View f23599e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final f f23600f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final e f23601g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final Matrix f23602h;

        public d(View view, f fVar, e eVar, Matrix matrix, boolean z10, boolean z11) {
            this.f23597c = z10;
            this.f23598d = z11;
            this.f23599e = view;
            this.f23600f = fVar;
            this.f23601g = eVar;
            this.f23602h = matrix;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(Animator animator) {
            this.f23595a = true;
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            boolean z10 = this.f23595a;
            f fVar = this.f23600f;
            View view = this.f23599e;
            if (!z10) {
                if (this.f23597c && this.f23598d) {
                    Matrix matrix = this.f23596b;
                    matrix.set(this.f23602h);
                    view.setTag(R.id.transition_transform, matrix);
                    fVar.getClass();
                    String[] strArr = ChangeTransform.f23586m1;
                    view.setTranslationX(fVar.f23608a);
                    view.setTranslationY(fVar.f23609b);
                    ViewCompat.setTranslationZ(view, fVar.f23610c);
                    view.setScaleX(fVar.f23611d);
                    view.setScaleY(fVar.f23612e);
                    view.setRotationX(fVar.f23613f);
                    view.setRotationY(fVar.f23614g);
                    view.setRotation(fVar.f23615h);
                } else {
                    view.setTag(R.id.transition_transform, null);
                    view.setTag(R.id.parent_matrix, null);
                }
            }
            r.f69339a.d(view, null);
            fVar.getClass();
            String[] strArr2 = ChangeTransform.f23586m1;
            view.setTranslationX(fVar.f23608a);
            view.setTranslationY(fVar.f23609b);
            ViewCompat.setTranslationZ(view, fVar.f23610c);
            view.setScaleX(fVar.f23611d);
            view.setScaleY(fVar.f23612e);
            view.setRotationX(fVar.f23613f);
            view.setRotationY(fVar.f23614g);
            view.setRotation(fVar.f23615h);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public final void onAnimationPause(Animator animator) {
            Matrix matrix = this.f23601g.f23603a;
            Matrix matrix2 = this.f23596b;
            matrix2.set(matrix);
            int i10 = R.id.transition_transform;
            View view = this.f23599e;
            view.setTag(i10, matrix2);
            f fVar = this.f23600f;
            fVar.getClass();
            String[] strArr = ChangeTransform.f23586m1;
            view.setTranslationX(fVar.f23608a);
            view.setTranslationY(fVar.f23609b);
            ViewCompat.setTranslationZ(view, fVar.f23610c);
            view.setScaleX(fVar.f23611d);
            view.setScaleY(fVar.f23612e);
            view.setRotationX(fVar.f23613f);
            view.setRotationY(fVar.f23614g);
            view.setRotation(fVar.f23615h);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public final void onAnimationResume(Animator animator) {
            String[] strArr = ChangeTransform.f23586m1;
            View view = this.f23599e;
            view.setTranslationX(0.0f);
            view.setTranslationY(0.0f);
            ViewCompat.setTranslationZ(view, 0.0f);
            view.setScaleX(1.0f);
            view.setScaleY(1.0f);
            view.setRotationX(0.0f);
            view.setRotationY(0.0f);
            view.setRotation(0.0f);
        }
    }

    public static class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Matrix f23603a = new Matrix();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final View f23604b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final float[] f23605c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public float f23606d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public float f23607e;

        public e(View view, float[] fArr) {
            this.f23604b = view;
            float[] fArr2 = (float[]) fArr.clone();
            this.f23605c = fArr2;
            this.f23606d = fArr2[2];
            this.f23607e = fArr2[5];
            a();
        }

        public final void a() {
            float f6 = this.f23606d;
            float[] fArr = this.f23605c;
            fArr[2] = f6;
            fArr[5] = this.f23607e;
            Matrix matrix = this.f23603a;
            matrix.setValues(fArr);
            r.f69339a.d(this.f23604b, matrix);
        }
    }

    public static class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final float f23608a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final float f23609b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final float f23610c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final float f23611d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final float f23612e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final float f23613f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final float f23614g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final float f23615h;

        public f(View view) {
            this.f23608a = view.getTranslationX();
            this.f23609b = view.getTranslationY();
            this.f23610c = ViewCompat.getTranslationZ(view);
            this.f23611d = view.getScaleX();
            this.f23612e = view.getScaleY();
            this.f23613f = view.getRotationX();
            this.f23614g = view.getRotationY();
            this.f23615h = view.getRotation();
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return fVar.f23608a == this.f23608a && fVar.f23609b == this.f23609b && fVar.f23610c == this.f23610c && fVar.f23611d == this.f23611d && fVar.f23612e == this.f23612e && fVar.f23613f == this.f23613f && fVar.f23614g == this.f23614g && fVar.f23615h == this.f23615h;
        }

        public final int hashCode() {
            float f6 = this.f23608a;
            int iFloatToIntBits = (f6 != 0.0f ? Float.floatToIntBits(f6) : 0) * 31;
            float f10 = this.f23609b;
            int iFloatToIntBits2 = (iFloatToIntBits + (f10 != 0.0f ? Float.floatToIntBits(f10) : 0)) * 31;
            float f11 = this.f23610c;
            int iFloatToIntBits3 = (iFloatToIntBits2 + (f11 != 0.0f ? Float.floatToIntBits(f11) : 0)) * 31;
            float f12 = this.f23611d;
            int iFloatToIntBits4 = (iFloatToIntBits3 + (f12 != 0.0f ? Float.floatToIntBits(f12) : 0)) * 31;
            float f13 = this.f23612e;
            int iFloatToIntBits5 = (iFloatToIntBits4 + (f13 != 0.0f ? Float.floatToIntBits(f13) : 0)) * 31;
            float f14 = this.f23613f;
            int iFloatToIntBits6 = (iFloatToIntBits5 + (f14 != 0.0f ? Float.floatToIntBits(f14) : 0)) * 31;
            float f15 = this.f23614g;
            int iFloatToIntBits7 = (iFloatToIntBits6 + (f15 != 0.0f ? Float.floatToIntBits(f15) : 0)) * 31;
            float f16 = this.f23615h;
            return iFloatToIntBits7 + (f16 != 0.0f ? Float.floatToIntBits(f16) : 0);
        }
    }

    public ChangeTransform() {
        this.f23590j1 = true;
        this.f23591k1 = true;
        this.f23592l1 = new Matrix();
    }

    @Override // androidx.transition.Transition
    public void captureEndValues(@NonNull TransitionValues transitionValues) {
        q(transitionValues);
    }

    @Override // androidx.transition.Transition
    public void captureStartValues(@NonNull TransitionValues transitionValues) {
        q(transitionValues);
        if (f23589p1) {
            return;
        }
        ((ViewGroup) transitionValues.view.getParent()).startViewTransition(transitionValues.view);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 2 */
    @Override // androidx.transition.Transition
    @Nullable
    public Animator createAnimator(@NonNull ViewGroup viewGroup, @Nullable TransitionValues transitionValues, @Nullable TransitionValues transitionValues2) {
        ObjectAnimator objectAnimatorOfPropertyValuesHolder;
        Object obj;
        ObjectAnimator objectAnimator;
        int i10;
        androidx.transition.b bVar;
        String str;
        View view;
        boolean z10;
        androidx.transition.b bVar2;
        androidx.transition.a aVar;
        ArrayList arrayList;
        ObjectAnimator objectAnimator2;
        String str2;
        boolean z11;
        int i11;
        int iIntValue;
        androidx.transition.a aVar2;
        h3.d dVar;
        char c10;
        h3.e eVar;
        TransitionValues transitionValuesH;
        if (transitionValues == null || transitionValues2 == null) {
            return null;
        }
        String str3 = "android:changeTransform:parent";
        if (!transitionValues.values.containsKey("android:changeTransform:parent") || !transitionValues2.values.containsKey("android:changeTransform:parent")) {
            return null;
        }
        ViewGroup viewGroup2 = (ViewGroup) transitionValues.values.get("android:changeTransform:parent");
        ViewGroup viewGroup3 = (ViewGroup) transitionValues2.values.get("android:changeTransform:parent");
        boolean z12 = this.f23591k1 && (!(k(viewGroup2) && k(viewGroup3)) ? viewGroup2 == viewGroup3 : !((transitionValuesH = h(viewGroup2, true)) == null || viewGroup3 != transitionValuesH.view));
        Matrix matrix = (Matrix) transitionValues.values.get("android:changeTransform:intermediateMatrix");
        if (matrix != null) {
            transitionValues.values.put("android:changeTransform:matrix", matrix);
        }
        Matrix matrix2 = (Matrix) transitionValues.values.get("android:changeTransform:intermediateParentMatrix");
        if (matrix2 != null) {
            transitionValues.values.put("android:changeTransform:parentMatrix", matrix2);
        }
        if (z12) {
            Matrix matrix3 = (Matrix) transitionValues2.values.get("android:changeTransform:parentMatrix");
            transitionValues2.view.setTag(R.id.parent_matrix, matrix3);
            Matrix matrix4 = this.f23592l1;
            matrix4.reset();
            matrix3.invert(matrix4);
            Matrix matrix5 = (Matrix) transitionValues.values.get("android:changeTransform:matrix");
            if (matrix5 == null) {
                matrix5 = new Matrix();
                transitionValues.values.put("android:changeTransform:matrix", matrix5);
            }
            matrix5.postConcat((Matrix) transitionValues.values.get("android:changeTransform:parentMatrix"));
            matrix5.postConcat(matrix4);
        }
        Matrix matrix6 = (Matrix) transitionValues.values.get("android:changeTransform:matrix");
        Matrix matrix7 = (Matrix) transitionValues2.values.get("android:changeTransform:matrix");
        if (matrix6 == null) {
            matrix6 = g.f69313a;
        }
        if (matrix7 == null) {
            matrix7 = g.f69313a;
        }
        Matrix matrix8 = matrix7;
        if (matrix6.equals(matrix8)) {
            obj = "android:changeTransform:parentMatrix";
            objectAnimatorOfPropertyValuesHolder = null;
        } else {
            f fVar = (f) transitionValues2.values.get("android:changeTransform:transforms");
            View view2 = transitionValues2.view;
            view2.setTranslationX(0.0f);
            view2.setTranslationY(0.0f);
            ViewCompat.setTranslationZ(view2, 0.0f);
            view2.setScaleX(1.0f);
            view2.setScaleY(1.0f);
            view2.setRotationX(0.0f);
            view2.setRotationY(0.0f);
            view2.setRotation(0.0f);
            float[] fArr = new float[9];
            matrix6.getValues(fArr);
            float[] fArr2 = new float[9];
            matrix8.getValues(fArr2);
            e eVar2 = new e(view2, fArr);
            h3.b bVar3 = new h3.b();
            bVar3.f69302a = new float[9];
            objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(eVar2, PropertyValuesHolder.ofObject(f23587n1, bVar3, fArr, fArr2), i.a(f23588o1, getPathMotion().getPath(fArr[2], fArr[5], fArr2[2], fArr2[5])));
            obj = "android:changeTransform:parentMatrix";
            d dVar2 = new d(view2, fVar, eVar2, matrix8, z12, this.f23590j1);
            objectAnimatorOfPropertyValuesHolder.addListener(dVar2);
            objectAnimatorOfPropertyValuesHolder.addPauseListener(dVar2);
        }
        boolean z13 = f23589p1;
        if (z12 && objectAnimatorOfPropertyValuesHolder != null && this.f23590j1) {
            View view3 = transitionValues2.view;
            Matrix matrix9 = new Matrix((Matrix) transitionValues2.values.get(obj));
            r.f69339a.f(viewGroup, matrix9);
            if (Build.VERSION.SDK_INT == 28) {
                if (h3.e.f69309t0) {
                    c10 = 1;
                } else {
                    try {
                        if (!h3.e.f69307r0) {
                            try {
                                h3.e.f69306q0 = Class.forName("android.view.GhostView");
                            } catch (ClassNotFoundException unused) {
                            }
                            h3.e.f69307r0 = true;
                        }
                        Method declaredMethod = h3.e.f69306q0.getDeclaredMethod("addGhost", View.class, ViewGroup.class, Matrix.class);
                        h3.e.f69308s0 = declaredMethod;
                        declaredMethod.setAccessible(true);
                    } catch (NoSuchMethodException unused2) {
                    }
                    c10 = 1;
                    h3.e.f69309t0 = true;
                }
                Method method = h3.e.f69308s0;
                if (method != null) {
                    try {
                        Object[] objArr = new Object[3];
                        objArr[0] = view3;
                        objArr[c10] = viewGroup;
                        objArr[2] = matrix9;
                        eVar = new h3.e((View) method.invoke(null, objArr));
                    } catch (IllegalAccessException unused3) {
                        eVar = null;
                    } catch (InvocationTargetException e5) {
                        throw new RuntimeException(e5.getCause());
                    }
                } else {
                    eVar = null;
                }
                objectAnimator = objectAnimatorOfPropertyValuesHolder;
                str = "android:changeTransform:parent";
                view = view3;
                z10 = z13;
                dVar = eVar;
            } else {
                int i12 = androidx.transition.b.v0;
                if (!(view3.getParent() instanceof ViewGroup)) {
                    throw new IllegalArgumentException("Ghosted views must be parented by a ViewGroup");
                }
                int i13 = androidx.transition.a.f23731r0;
                int i14 = R.id.ghost_view_holder;
                androidx.transition.a aVar3 = (androidx.transition.a) viewGroup.getTag(i14);
                androidx.transition.b bVar4 = (androidx.transition.b) view3.getTag(R.id.ghost_view);
                if (bVar4 == null || (aVar2 = (androidx.transition.a) bVar4.getParent()) == aVar3) {
                    i10 = 0;
                    bVar = bVar4;
                } else {
                    i10 = bVar4.f23737s0;
                    aVar2.removeView(bVar4);
                    bVar = null;
                }
                if (bVar == null) {
                    androidx.transition.b bVar5 = new androidx.transition.b(view3);
                    bVar5.f23738t0 = matrix9;
                    if (aVar3 == null) {
                        androidx.transition.a aVar4 = new androidx.transition.a(viewGroup.getContext());
                        aVar4.setClipChildren(false);
                        aVar4.f23732p0 = viewGroup;
                        viewGroup.setTag(i14, aVar4);
                        viewGroup.getOverlay().add(aVar4);
                        aVar4.f23733q0 = true;
                        aVar = aVar4;
                    } else {
                        if (!aVar3.f23733q0) {
                            throw new IllegalStateException("This GhostViewHolder is detached!");
                        }
                        ViewGroup viewGroup4 = aVar3.f23732p0;
                        viewGroup4.getOverlay().remove(aVar3);
                        viewGroup4.getOverlay().add(aVar3);
                        aVar = aVar3;
                    }
                    r.a(aVar, aVar.getLeft(), aVar.getTop(), viewGroup.getWidth() + aVar.getLeft(), viewGroup.getHeight() + aVar.getTop());
                    r.a(bVar5, bVar5.getLeft(), bVar5.getTop(), viewGroup.getWidth() + bVar5.getLeft(), viewGroup.getHeight() + bVar5.getTop());
                    ArrayList arrayList2 = new ArrayList();
                    androidx.transition.a.a(bVar5.f23736r0, arrayList2);
                    ArrayList arrayList3 = new ArrayList();
                    int childCount = aVar.getChildCount() - 1;
                    int i15 = 0;
                    while (i15 <= childCount) {
                        int i16 = (i15 + childCount) / 2;
                        androidx.transition.a.a(((androidx.transition.b) aVar.getChildAt(i16)).f23736r0, arrayList3);
                        if (arrayList2.isEmpty() || arrayList3.isEmpty()) {
                            arrayList = arrayList2;
                            objectAnimator2 = objectAnimatorOfPropertyValuesHolder;
                            str2 = str3;
                            view3 = view3;
                            z11 = z13;
                            i11 = childCount;
                        } else {
                            i11 = childCount;
                            objectAnimator2 = objectAnimatorOfPropertyValuesHolder;
                            if (arrayList2.get(0) != arrayList3.get(0)) {
                                arrayList = arrayList2;
                            } else {
                                int iMin = Math.min(arrayList2.size(), arrayList3.size());
                                int i17 = 1;
                                while (true) {
                                    if (i17 < iMin) {
                                        View view4 = (View) arrayList2.get(i17);
                                        arrayList = arrayList2;
                                        View view5 = (View) arrayList3.get(i17);
                                        if (view4 != view5) {
                                            ViewGroup viewGroup5 = (ViewGroup) view4.getParent();
                                            int childCount2 = viewGroup5.getChildCount();
                                            if (androidx.transition.a.C0106a.a(view4) == androidx.transition.a.C0106a.a(view5)) {
                                                int i18 = 0;
                                                while (true) {
                                                    if (i18 < childCount2) {
                                                        int i19 = childCount2;
                                                        z11 = z13;
                                                        if (Build.VERSION.SDK_INT >= 29) {
                                                            iIntValue = q.a.a(viewGroup5, i18);
                                                            str2 = str3;
                                                            view3 = view3;
                                                        } else {
                                                            if (q.f69338c) {
                                                                str2 = str3;
                                                            } else {
                                                                try {
                                                                    Class[] clsArr = new Class[2];
                                                                    Class cls = Integer.TYPE;
                                                                    clsArr[0] = cls;
                                                                    str2 = str3;
                                                                    try {
                                                                        clsArr[1] = cls;
                                                                        Method declaredMethod2 = ViewGroup.class.getDeclaredMethod("getChildDrawingOrder", clsArr);
                                                                        q.f69337b = declaredMethod2;
                                                                        declaredMethod2.setAccessible(true);
                                                                    } catch (NoSuchMethodException unused4) {
                                                                    }
                                                                } catch (NoSuchMethodException unused5) {
                                                                    str2 = str3;
                                                                }
                                                                q.f69338c = true;
                                                            }
                                                            Method method2 = q.f69337b;
                                                            if (method2 != null) {
                                                                try {
                                                                    Object[] objArr2 = new Object[2];
                                                                    try {
                                                                        objArr2[0] = Integer.valueOf(viewGroup5.getChildCount());
                                                                        objArr2[1] = Integer.valueOf(i18);
                                                                        iIntValue = ((Integer) method2.invoke(viewGroup5, objArr2)).intValue();
                                                                    } catch (IllegalAccessException | InvocationTargetException unused6) {
                                                                        iIntValue = i18;
                                                                    }
                                                                } catch (IllegalAccessException | InvocationTargetException unused7) {
                                                                }
                                                            }
                                                            iIntValue = i18;
                                                        }
                                                        View childAt = viewGroup5.getChildAt(iIntValue);
                                                        if (childAt == view4) {
                                                            childCount = i16 - 1;
                                                        } else if (childAt != view5) {
                                                            i18++;
                                                            childCount2 = i19;
                                                            view3 = view3;
                                                            z13 = z11;
                                                            str3 = str2;
                                                        }
                                                    }
                                                }
                                            } else if (androidx.transition.a.C0106a.a(view4) <= androidx.transition.a.C0106a.a(view5)) {
                                                str2 = str3;
                                                view3 = view3;
                                                z11 = z13;
                                                childCount = i16 - 1;
                                            }
                                            i15 = i16 + 1;
                                            childCount = i11;
                                        } else {
                                            i17++;
                                            arrayList2 = arrayList;
                                            str3 = str3;
                                        }
                                    } else {
                                        arrayList = arrayList2;
                                        str2 = str3;
                                        view3 = view3;
                                        z11 = z13;
                                        if (arrayList3.size() == iMin) {
                                            i15 = i16 + 1;
                                            childCount = i11;
                                        } else {
                                            childCount = i16 - 1;
                                        }
                                    }
                                    arrayList3.clear();
                                    arrayList2 = arrayList;
                                    objectAnimatorOfPropertyValuesHolder = objectAnimator2;
                                    view3 = view3;
                                    z13 = z11;
                                    str3 = str2;
                                }
                            }
                            str2 = str3;
                            view3 = view3;
                            z11 = z13;
                        }
                        i15 = i16 + 1;
                        childCount = i11;
                        arrayList3.clear();
                        arrayList2 = arrayList;
                        objectAnimatorOfPropertyValuesHolder = objectAnimator2;
                        view3 = view3;
                        z13 = z11;
                        str3 = str2;
                    }
                    objectAnimator = objectAnimatorOfPropertyValuesHolder;
                    str = str3;
                    view = view3;
                    z10 = z13;
                    if (i15 < 0 || i15 >= aVar.getChildCount()) {
                        aVar.addView(bVar5);
                    } else {
                        aVar.addView(bVar5, i15);
                    }
                    bVar5.f23737s0 = i10;
                    bVar2 = bVar5;
                } else {
                    objectAnimator = objectAnimatorOfPropertyValuesHolder;
                    str = "android:changeTransform:parent";
                    view = view3;
                    z10 = z13;
                    bVar.f23738t0 = matrix9;
                    bVar2 = bVar;
                }
                bVar2.f23737s0++;
                dVar = bVar2;
            }
            if (dVar != null) {
                dVar.a((ViewGroup) transitionValues.values.get(str), transitionValues.view);
                Transition transition = this;
                while (true) {
                    TransitionSet transitionSet = transition.L0;
                    if (transitionSet == null) {
                        break;
                    }
                    transition = transitionSet;
                }
                c cVar = new c();
                View view6 = view;
                cVar.f23593a = view6;
                cVar.f23594b = dVar;
                transition.addListener(cVar);
                if (z10) {
                    View view7 = transitionValues.view;
                    if (view7 != transitionValues2.view) {
                        r.b(view7, 0.0f);
                    }
                    r.b(view6, 1.0f);
                }
            }
        } else {
            objectAnimator = objectAnimatorOfPropertyValuesHolder;
            if (!z13) {
                viewGroup2.endViewTransition(transitionValues.view);
            }
        }
        return objectAnimator;
    }

    public boolean getReparent() {
        return this.f23591k1;
    }

    public boolean getReparentWithOverlay() {
        return this.f23590j1;
    }

    @Override // androidx.transition.Transition
    @NonNull
    public String[] getTransitionProperties() {
        return f23586m1;
    }

    public final void q(TransitionValues transitionValues) {
        View view = transitionValues.view;
        if (view.getVisibility() == 8) {
            return;
        }
        transitionValues.values.put("android:changeTransform:parent", view.getParent());
        transitionValues.values.put("android:changeTransform:transforms", new f(view));
        Matrix matrix = view.getMatrix();
        transitionValues.values.put("android:changeTransform:matrix", (matrix == null || matrix.isIdentity()) ? null : new Matrix(matrix));
        if (this.f23591k1) {
            Matrix matrix2 = new Matrix();
            ViewGroup viewGroup = (ViewGroup) view.getParent();
            r.f69339a.e(viewGroup, matrix2);
            matrix2.preTranslate(-viewGroup.getScrollX(), -viewGroup.getScrollY());
            transitionValues.values.put("android:changeTransform:parentMatrix", matrix2);
            transitionValues.values.put("android:changeTransform:intermediateMatrix", view.getTag(R.id.transition_transform));
            transitionValues.values.put("android:changeTransform:intermediateParentMatrix", view.getTag(R.id.parent_matrix));
        }
    }

    public void setReparent(boolean z10) {
        this.f23591k1 = z10;
    }

    public void setReparentWithOverlay(boolean z10) {
        this.f23590j1 = z10;
    }

    public ChangeTransform(@NonNull Context context, @NonNull AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f23590j1 = true;
        this.f23591k1 = true;
        this.f23592l1 = new Matrix();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, k.f69321g);
        XmlPullParser xmlPullParser = (XmlPullParser) attributeSet;
        this.f23590j1 = TypedArrayUtils.getNamedBoolean(typedArrayObtainStyledAttributes, xmlPullParser, "reparentWithOverlay", 1, true);
        this.f23591k1 = TypedArrayUtils.getNamedBoolean(typedArrayObtainStyledAttributes, xmlPullParser, "reparent", 0, true);
        typedArrayObtainStyledAttributes.recycle();
    }
}
