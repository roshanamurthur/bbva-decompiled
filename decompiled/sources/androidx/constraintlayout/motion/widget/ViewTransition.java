package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Rect;
import android.util.Xml;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.AnticipateInterpolator;
import android.view.animation.BounceInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.OvershootInterpolator;
import androidx.camera.core.o1;
import androidx.constraintlayout.core.motion.utils.Easing;
import androidx.constraintlayout.core.motion.utils.KeyCache;
import androidx.constraintlayout.widget.ConstraintAttribute;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;
import androidx.constraintlayout.widget.R;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public class ViewTransition {
    public static final String CONSTRAINT_OVERRIDE = "ConstraintOverride";
    public static final String CUSTOM_ATTRIBUTE = "CustomAttribute";
    public static final String CUSTOM_METHOD = "CustomMethod";
    public static final String KEY_FRAME_SET_TAG = "KeyFrameSet";
    public static final int ONSTATE_ACTION_DOWN = 1;
    public static final int ONSTATE_ACTION_DOWN_UP = 3;
    public static final int ONSTATE_ACTION_UP = 2;
    public static final int ONSTATE_SHARED_VALUE_SET = 4;
    public static final int ONSTATE_SHARED_VALUE_UNSET = 5;
    public static final String VIEW_TRANSITION_TAG = "ViewTransition";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f19543a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f19547e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final KeyFrames f19548f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ConstraintSet.Constraint f19549g;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f19552j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f19553k;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Context f19556o;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f19544b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f19545c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f19546d = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f19550h = -1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f19551i = -1;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f19554l = 0;
    public String m = null;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f19555n = -1;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f19557p = -1;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f19558q = -1;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f19559r = -1;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f19560s = -1;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f19561t = -1;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f19562u = -1;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f19563v = -1;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f19564a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f19565b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final MotionController f19566c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f19567d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final ViewTransitionController f19569f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final Interpolator f19570g;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public float f19572i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public float f19573j;
        public final boolean m;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final KeyCache f19568e = new KeyCache();

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public boolean f19571h = false;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final Rect f19575l = new Rect();

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public long f19574k = System.nanoTime();

        public a(ViewTransitionController viewTransitionController, MotionController motionController, int i10, int i11, int i12, Interpolator interpolator, int i13, int i14) {
            this.m = false;
            this.f19569f = viewTransitionController;
            this.f19566c = motionController;
            this.f19567d = i11;
            if (viewTransitionController.f19580e == null) {
                viewTransitionController.f19580e = new ArrayList<>();
            }
            viewTransitionController.f19580e.add(this);
            this.f19570g = interpolator;
            this.f19564a = i13;
            this.f19565b = i14;
            if (i12 == 3) {
                this.m = true;
            }
            this.f19573j = i10 == 0 ? Float.MAX_VALUE : 1.0f / i10;
            a();
        }

        /* JADX WARN: Code duplicated, block: B:39:0x00df  */
        public final void a() {
            ViewTransitionController viewTransitionController;
            boolean z10 = this.f19571h;
            ViewTransitionController viewTransitionController2 = this.f19569f;
            Interpolator interpolator = this.f19570g;
            MotionController motionController = this.f19566c;
            int i10 = this.f19565b;
            int i11 = this.f19564a;
            if (z10) {
                long jNanoTime = System.nanoTime();
                long j10 = jNanoTime - this.f19574k;
                this.f19574k = jNanoTime;
                float f6 = this.f19572i - (((float) (j10 * 1.0E-6d)) * this.f19573j);
                this.f19572i = f6;
                if (f6 < 0.0f) {
                    this.f19572i = 0.0f;
                }
                boolean zG = motionController.g(motionController.f19389b, interpolator == null ? this.f19572i : interpolator.getInterpolation(this.f19572i), jNanoTime, this.f19568e);
                if (this.f19572i <= 0.0f) {
                    if (i11 != -1) {
                        motionController.getView().setTag(i11, Long.valueOf(System.nanoTime()));
                    }
                    if (i10 != -1) {
                        motionController.getView().setTag(i10, null);
                    }
                    viewTransitionController2.f19581f.add(this);
                }
                if (this.f19572i > 0.0f || zG) {
                    viewTransitionController2.f19576a.invalidate();
                    return;
                }
                return;
            }
            long jNanoTime2 = System.nanoTime();
            long j11 = jNanoTime2 - this.f19574k;
            this.f19574k = jNanoTime2;
            float f10 = (((float) (j11 * 1.0E-6d)) * this.f19573j) + this.f19572i;
            this.f19572i = f10;
            if (f10 >= 1.0f) {
                this.f19572i = 1.0f;
            }
            boolean zG2 = motionController.g(motionController.f19389b, interpolator == null ? this.f19572i : interpolator.getInterpolation(this.f19572i), jNanoTime2, this.f19568e);
            if (this.f19572i < 1.0f) {
                viewTransitionController = viewTransitionController2;
            } else {
                if (i11 != -1) {
                    motionController.getView().setTag(i11, Long.valueOf(System.nanoTime()));
                }
                if (i10 != -1) {
                    motionController.getView().setTag(i10, null);
                }
                if (this.m) {
                    viewTransitionController = viewTransitionController2;
                } else {
                    viewTransitionController = viewTransitionController2;
                    viewTransitionController.f19581f.add(this);
                }
            }
            if (this.f19572i < 1.0f || zG2) {
                viewTransitionController.f19576a.invalidate();
            }
        }

        public final void b() {
            this.f19571h = true;
            int i10 = this.f19567d;
            if (i10 != -1) {
                this.f19573j = i10 == 0 ? Float.MAX_VALUE : 1.0f / i10;
            }
            this.f19569f.f19576a.invalidate();
            this.f19574k = System.nanoTime();
        }
    }

    /* JADX WARN: Code duplicated, block: B:31:0x007f  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public ViewTransition(Context context, XmlResourceParser xmlResourceParser) {
        byte b10;
        this.f19556o = context;
        try {
            int eventType = xmlResourceParser.getEventType();
            while (eventType != 1) {
                if (eventType == 2) {
                    String name = xmlResourceParser.getName();
                    switch (name.hashCode()) {
                        case -1962203927:
                            if (!name.equals(CONSTRAINT_OVERRIDE)) {
                                b10 = -1;
                            } else {
                                b10 = 2;
                            }
                            break;
                        case -1239391468:
                            if (!name.equals(KEY_FRAME_SET_TAG)) {
                                b10 = -1;
                            } else {
                                b10 = 1;
                            }
                            break;
                        case 61998586:
                            if (!name.equals(VIEW_TRANSITION_TAG)) {
                                b10 = -1;
                            } else {
                                b10 = 0;
                            }
                            break;
                        case 366511058:
                            if (!name.equals(CUSTOM_METHOD)) {
                                b10 = -1;
                            } else {
                                b10 = 4;
                            }
                            break;
                        case 1791837707:
                            if (!name.equals(CUSTOM_ATTRIBUTE)) {
                                b10 = -1;
                            } else {
                                b10 = 3;
                            }
                            break;
                        default:
                            b10 = -1;
                            break;
                    }
                    if (b10 == 0) {
                        d(context, xmlResourceParser);
                    } else if (b10 == 1) {
                        this.f19548f = new KeyFrames(context, xmlResourceParser);
                    } else if (b10 == 2) {
                        this.f19549g = ConstraintSet.buildDelta(context, xmlResourceParser);
                    } else if (b10 == 3 || b10 == 4) {
                        ConstraintAttribute.parse(context, xmlResourceParser, this.f19549g.mCustomConstraints);
                    } else {
                        Debug.getLoc();
                        xmlResourceParser.getLineNumber();
                    }
                } else if (eventType == 3 && VIEW_TRANSITION_TAG.equals(xmlResourceParser.getName())) {
                    return;
                }
                eventType = xmlResourceParser.next();
            }
        } catch (IOException | XmlPullParserException unused) {
        }
    }

    public final void a(ViewTransitionController viewTransitionController, MotionLayout motionLayout, int i10, ConstraintSet constraintSet, View... viewArr) {
        Interpolator interpolatorLoadInterpolator;
        Interpolator hVar;
        if (this.f19545c) {
            return;
        }
        int i11 = this.f19547e;
        KeyFrames keyFrames = this.f19548f;
        int i12 = 0;
        if (i11 == 2) {
            View view = viewArr[0];
            MotionController motionController = new MotionController(view);
            d dVar = motionController.f19393f;
            dVar.f19595r0 = 0.0f;
            dVar.f19596s0 = 0.0f;
            motionController.H = true;
            dVar.f(view.getX(), view.getY(), view.getWidth(), view.getHeight());
            motionController.f19394g.f(view.getX(), view.getY(), view.getWidth(), view.getHeight());
            b bVar = motionController.f19395h;
            bVar.getClass();
            view.getX();
            view.getY();
            view.getWidth();
            view.getHeight();
            bVar.b(view);
            b bVar2 = motionController.f19396i;
            bVar2.getClass();
            view.getX();
            view.getY();
            view.getWidth();
            view.getHeight();
            bVar2.b(view);
            keyFrames.addAllFrames(motionController);
            motionController.setup(motionLayout.getWidth(), motionLayout.getHeight(), this.f19550h, System.nanoTime());
            int i13 = this.f19550h;
            int i14 = this.f19551i;
            int i15 = this.f19544b;
            Context context = motionLayout.getContext();
            int i16 = this.f19554l;
            if (i16 != -2) {
                if (i16 == -1) {
                    hVar = new h(Easing.getInterpolator(this.m));
                } else if (i16 == 0) {
                    interpolatorLoadInterpolator = new AccelerateDecelerateInterpolator();
                } else if (i16 == 1) {
                    interpolatorLoadInterpolator = new AccelerateInterpolator();
                } else if (i16 == 2) {
                    interpolatorLoadInterpolator = new DecelerateInterpolator();
                } else if (i16 == 4) {
                    interpolatorLoadInterpolator = new BounceInterpolator();
                } else if (i16 != 5) {
                    interpolatorLoadInterpolator = i16 != 6 ? null : new AnticipateInterpolator();
                } else {
                    interpolatorLoadInterpolator = new OvershootInterpolator();
                }
                new a(viewTransitionController, motionController, i13, i14, i15, hVar, this.f19557p, this.f19558q);
                return;
            }
            interpolatorLoadInterpolator = AnimationUtils.loadInterpolator(context, this.f19555n);
            hVar = interpolatorLoadInterpolator;
            new a(viewTransitionController, motionController, i13, i14, i15, hVar, this.f19557p, this.f19558q);
            return;
        }
        ConstraintSet.Constraint constraint = this.f19549g;
        if (i11 == 1) {
            int[] constraintSetIds = motionLayout.getConstraintSetIds();
            int i17 = 0;
            while (i17 < constraintSetIds.length) {
                int i18 = constraintSetIds[i17];
                if (i18 != i10) {
                    ConstraintSet constraintSet2 = motionLayout.getConstraintSet(i18);
                    int length = viewArr.length;
                    for (int i19 = i12; i19 < length; i19++) {
                        ConstraintSet.Constraint constraint2 = constraintSet2.getConstraint(viewArr[i19].getId());
                        if (constraint != null) {
                            constraint.applyDelta(constraint2);
                            constraint2.mCustomConstraints.putAll(constraint.mCustomConstraints);
                        }
                    }
                }
                i17++;
                i12 = 0;
            }
        }
        ConstraintSet constraintSet3 = new ConstraintSet();
        constraintSet3.clone(constraintSet);
        for (View view2 : viewArr) {
            ConstraintSet.Constraint constraint3 = constraintSet3.getConstraint(view2.getId());
            if (constraint != null) {
                constraint.applyDelta(constraint3);
                constraint3.mCustomConstraints.putAll(constraint.mCustomConstraints);
            }
        }
        motionLayout.updateState(i10, constraintSet3);
        int i20 = R.id.view_transition;
        motionLayout.updateState(i20, constraintSet);
        motionLayout.setState(i20, -1, -1);
        MotionScene.Transition transition = new MotionScene.Transition(-1, motionLayout.f19431p0, i20, i10);
        for (View view3 : viewArr) {
            int i21 = this.f19550h;
            if (i21 != -1) {
                transition.setDuration(i21);
            }
            transition.setPathMotionArc(this.f19546d);
            transition.setInterpolatorInfo(this.f19554l, this.m, this.f19555n);
            int id = view3.getId();
            if (keyFrames != null) {
                ArrayList<Key> keyFramesForView = keyFrames.getKeyFramesForView(-1);
                KeyFrames keyFrames2 = new KeyFrames();
                Iterator<Key> it = keyFramesForView.iterator();
                while (it.hasNext()) {
                    keyFrames2.addKey(it.next().mo4634clone().setViewId(id));
                }
                transition.addKeyFrame(keyFrames2);
            }
        }
        motionLayout.setTransition(transition);
        motionLayout.transitionToEnd(new o1(this, viewArr, 2));
    }

    public final boolean b(View view) {
        int i10 = this.f19559r;
        boolean z10 = i10 == -1 || view.getTag(i10) != null;
        int i11 = this.f19560s;
        return z10 && (i11 == -1 || view.getTag(i11) == null);
    }

    public final boolean c(View view) {
        String str;
        if (view == null) {
            return false;
        }
        if ((this.f19552j == -1 && this.f19553k == null) || !b(view)) {
            return false;
        }
        if (view.getId() == this.f19552j) {
            return true;
        }
        return this.f19553k != null && (view.getLayoutParams() instanceof ConstraintLayout.LayoutParams) && (str = ((ConstraintLayout.LayoutParams) view.getLayoutParams()).constraintTag) != null && str.matches(this.f19553k);
    }

    public final void d(Context context, XmlResourceParser xmlResourceParser) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), R.styleable.ViewTransition);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i10 = 0; i10 < indexCount; i10++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i10);
            if (index == R.styleable.ViewTransition_android_id) {
                this.f19543a = typedArrayObtainStyledAttributes.getResourceId(index, this.f19543a);
            } else if (index == R.styleable.ViewTransition_motionTarget) {
                if (MotionLayout.IS_IN_EDIT_MODE) {
                    int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, this.f19552j);
                    this.f19552j = resourceId;
                    if (resourceId == -1) {
                        this.f19553k = typedArrayObtainStyledAttributes.getString(index);
                    }
                } else if (typedArrayObtainStyledAttributes.peekValue(index).type == 3) {
                    this.f19553k = typedArrayObtainStyledAttributes.getString(index);
                } else {
                    this.f19552j = typedArrayObtainStyledAttributes.getResourceId(index, this.f19552j);
                }
            } else if (index == R.styleable.ViewTransition_onStateTransition) {
                this.f19544b = typedArrayObtainStyledAttributes.getInt(index, this.f19544b);
            } else if (index == R.styleable.ViewTransition_transitionDisable) {
                this.f19545c = typedArrayObtainStyledAttributes.getBoolean(index, this.f19545c);
            } else if (index == R.styleable.ViewTransition_pathMotionArc) {
                this.f19546d = typedArrayObtainStyledAttributes.getInt(index, this.f19546d);
            } else if (index == R.styleable.ViewTransition_duration) {
                this.f19550h = typedArrayObtainStyledAttributes.getInt(index, this.f19550h);
            } else if (index == R.styleable.ViewTransition_upDuration) {
                this.f19551i = typedArrayObtainStyledAttributes.getInt(index, this.f19551i);
            } else if (index == R.styleable.ViewTransition_viewTransitionMode) {
                this.f19547e = typedArrayObtainStyledAttributes.getInt(index, this.f19547e);
            } else if (index == R.styleable.ViewTransition_motionInterpolator) {
                int i11 = typedArrayObtainStyledAttributes.peekValue(index).type;
                if (i11 == 1) {
                    int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                    this.f19555n = resourceId2;
                    if (resourceId2 != -1) {
                        this.f19554l = -2;
                    }
                } else if (i11 == 3) {
                    String string = typedArrayObtainStyledAttributes.getString(index);
                    this.m = string;
                    if (string == null || string.indexOf("/") <= 0) {
                        this.f19554l = -1;
                    } else {
                        this.f19555n = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                        this.f19554l = -2;
                    }
                } else {
                    this.f19554l = typedArrayObtainStyledAttributes.getInteger(index, this.f19554l);
                }
            } else if (index == R.styleable.ViewTransition_setsTag) {
                this.f19557p = typedArrayObtainStyledAttributes.getResourceId(index, this.f19557p);
            } else if (index == R.styleable.ViewTransition_clearsTag) {
                this.f19558q = typedArrayObtainStyledAttributes.getResourceId(index, this.f19558q);
            } else if (index == R.styleable.ViewTransition_ifTagSet) {
                this.f19559r = typedArrayObtainStyledAttributes.getResourceId(index, this.f19559r);
            } else if (index == R.styleable.ViewTransition_ifTagNotSet) {
                this.f19560s = typedArrayObtainStyledAttributes.getResourceId(index, this.f19560s);
            } else if (index == R.styleable.ViewTransition_SharedValueId) {
                this.f19562u = typedArrayObtainStyledAttributes.getResourceId(index, this.f19562u);
            } else if (index == R.styleable.ViewTransition_SharedValue) {
                this.f19561t = typedArrayObtainStyledAttributes.getInteger(index, this.f19561t);
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public int getSharedValue() {
        return this.f19561t;
    }

    public int getSharedValueCurrent() {
        return this.f19563v;
    }

    public int getSharedValueID() {
        return this.f19562u;
    }

    public int getStateTransition() {
        return this.f19544b;
    }

    public void setSharedValue(int i10) {
        this.f19561t = i10;
    }

    public void setSharedValueCurrent(int i10) {
        this.f19563v = i10;
    }

    public void setSharedValueID(int i10) {
        this.f19562u = i10;
    }

    public void setStateTransition(int i10) {
        this.f19544b = i10;
    }

    public String toString() {
        return "ViewTransition(" + Debug.getName(this.f19556o, this.f19543a) + ")";
    }
}
