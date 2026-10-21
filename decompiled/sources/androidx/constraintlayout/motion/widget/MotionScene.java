package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.RectF;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.AnticipateInterpolator;
import android.view.animation.BounceInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.OvershootInterpolator;
import androidx.camera.camera2.internal.compat.u;
import androidx.constraintlayout.core.motion.utils.Easing;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.widget.ConstraintSet;
import androidx.constraintlayout.widget.R;
import androidx.constraintlayout.widget.StateSet;
import com.bbva.androidtoolkit.utils.PluginUtils;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public class MotionScene {
    public static final int LAYOUT_CALL_MEASURE = 2;
    public static final int LAYOUT_HONOR_REQUEST = 1;
    public static final int LAYOUT_IGNORE_REQUEST = 0;
    public static final int UNSET = -1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MotionLayout f19485a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final StateSet f19486b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Transition f19487c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f19488d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayList<Transition> f19489e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Transition f19490f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ArrayList<Transition> f19491g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final SparseArray<ConstraintSet> f19492h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final HashMap<String, Integer> f19493i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final SparseIntArray f19494j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f19495k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f19496l;
    public MotionEvent m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f19497n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f19498o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public MotionLayout.MotionTracker f19499p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f19500q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final ViewTransitionController f19501r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public float f19502s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public float f19503t;

    public class a implements Interpolator {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Easing f19524a;

        public a(Easing easing) {
            this.f19524a = easing;
        }

        @Override // android.animation.TimeInterpolator
        public final float getInterpolation(float f6) {
            return (float) this.f19524a.get(f6);
        }
    }

    public MotionScene(MotionLayout motionLayout) {
        this.f19486b = null;
        this.f19487c = null;
        this.f19488d = false;
        this.f19489e = new ArrayList<>();
        this.f19490f = null;
        this.f19491g = new ArrayList<>();
        this.f19492h = new SparseArray<>();
        this.f19493i = new HashMap<>();
        this.f19494j = new SparseIntArray();
        this.f19495k = 400;
        this.f19496l = 0;
        this.f19497n = false;
        this.f19498o = false;
        this.f19485a = motionLayout;
        this.f19501r = new ViewTransitionController(motionLayout);
    }

    public static int c(Context context, String str) {
        int identifier;
        if (str.contains("/")) {
            identifier = context.getResources().getIdentifier(str.substring(str.indexOf(47) + 1), "id", context.getPackageName());
        } else {
            identifier = -1;
        }
        return (identifier != -1 || str.length() <= 1) ? identifier : Integer.parseInt(str.substring(1));
    }

    public static String stripID(String str) {
        if (str == null) {
            return "";
        }
        int iIndexOf = str.indexOf(47);
        return iIndexOf < 0 ? str : str.substring(iIndexOf + 1);
    }

    public final boolean a(MotionLayout motionLayout, int i10) {
        Transition transition;
        int i11;
        int i12;
        if (this.f19499p != null || this.f19488d) {
            return false;
        }
        for (Transition transition2 : this.f19489e) {
            if (transition2.f19516n != 0 && ((transition = this.f19487c) != transition2 || !transition.isTransitionFlag(2))) {
                if (i10 == transition2.f19507d && ((i12 = transition2.f19516n) == 4 || i12 == 2)) {
                    MotionLayout.j jVar = MotionLayout.j.FINISHED;
                    motionLayout.setState(jVar);
                    motionLayout.setTransition(transition2);
                    if (transition2.f19516n == 4) {
                        motionLayout.transitionToEnd();
                        motionLayout.setState(MotionLayout.j.SETUP);
                        motionLayout.setState(MotionLayout.j.MOVING);
                    } else {
                        motionLayout.setProgress(1.0f);
                        motionLayout.h(true);
                        motionLayout.setState(MotionLayout.j.SETUP);
                        motionLayout.setState(MotionLayout.j.MOVING);
                        motionLayout.setState(jVar);
                        motionLayout.m();
                    }
                    return true;
                }
                if (i10 == transition2.f19506c && ((i11 = transition2.f19516n) == 3 || i11 == 1)) {
                    MotionLayout.j jVar2 = MotionLayout.j.FINISHED;
                    motionLayout.setState(jVar2);
                    motionLayout.setTransition(transition2);
                    if (transition2.f19516n == 3) {
                        motionLayout.transitionToStart();
                        motionLayout.setState(MotionLayout.j.SETUP);
                        motionLayout.setState(MotionLayout.j.MOVING);
                    } else {
                        motionLayout.setProgress(0.0f);
                        motionLayout.h(true);
                        motionLayout.setState(MotionLayout.j.SETUP);
                        motionLayout.setState(MotionLayout.j.MOVING);
                        motionLayout.setState(jVar2);
                        motionLayout.m();
                    }
                    return true;
                }
            }
        }
        return false;
    }

    public void addOnClickListeners(MotionLayout motionLayout, int i10) {
        ArrayList<Transition> arrayList = this.f19489e;
        for (Transition transition : arrayList) {
            if (transition.m.size() > 0) {
                Iterator<Transition.TransitionOnClick> it = transition.m.iterator();
                while (it.hasNext()) {
                    it.next().removeOnClickListeners(motionLayout);
                }
            }
        }
        ArrayList<Transition> arrayList2 = this.f19491g;
        for (Transition transition2 : arrayList2) {
            if (transition2.m.size() > 0) {
                Iterator<Transition.TransitionOnClick> it2 = transition2.m.iterator();
                while (it2.hasNext()) {
                    it2.next().removeOnClickListeners(motionLayout);
                }
            }
        }
        for (Transition transition3 : arrayList) {
            if (transition3.m.size() > 0) {
                Iterator<Transition.TransitionOnClick> it3 = transition3.m.iterator();
                while (it3.hasNext()) {
                    it3.next().addOnClickListeners(motionLayout, i10, transition3);
                }
            }
        }
        for (Transition transition4 : arrayList2) {
            if (transition4.m.size() > 0) {
                Iterator<Transition.TransitionOnClick> it4 = transition4.m.iterator();
                while (it4.hasNext()) {
                    it4.next().addOnClickListeners(motionLayout, i10, transition4);
                }
            }
        }
    }

    public void addTransition(Transition transition) {
        int iD = d(transition);
        ArrayList<Transition> arrayList = this.f19489e;
        if (iD == -1) {
            arrayList.add(transition);
        } else {
            arrayList.set(iD, transition);
        }
    }

    public boolean applyViewTransition(int i10, MotionController motionController) {
        for (ViewTransition viewTransition : this.f19501r.f19577b) {
            if (viewTransition.f19543a == i10) {
                viewTransition.f19548f.addAllFrames(motionController);
                return true;
            }
        }
        return false;
    }

    public final ConstraintSet b(int i10) {
        int iStateGetConstraintID;
        StateSet stateSet = this.f19486b;
        if (stateSet != null && (iStateGetConstraintID = stateSet.stateGetConstraintID(i10, -1, -1)) != -1) {
            i10 = iStateGetConstraintID;
        }
        SparseArray<ConstraintSet> sparseArray = this.f19492h;
        if (sparseArray.get(i10) != null) {
            return sparseArray.get(i10);
        }
        Debug.getName(this.f19485a.getContext(), i10);
        return sparseArray.get(sparseArray.keyAt(0));
    }

    public Transition bestTransitionFor(int i10, float f6, float f10, MotionEvent motionEvent) {
        g gVar;
        if (i10 == -1) {
            return this.f19487c;
        }
        List<Transition> transitionsWithState = getTransitionsWithState(i10);
        RectF rectF = new RectF();
        float f11 = 0.0f;
        Transition transition = null;
        for (Transition transition2 : transitionsWithState) {
            if (!transition2.f19517o && (gVar = transition2.f19515l) != null) {
                gVar.c(this.f19500q);
                g gVar2 = transition2.f19515l;
                MotionLayout motionLayout = this.f19485a;
                RectF rectFB = gVar2.b(motionLayout, rectF);
                if (rectFB == null || motionEvent == null || rectFB.contains(motionEvent.getX(), motionEvent.getY())) {
                    RectF rectFA = transition2.f19515l.a(motionLayout, rectF);
                    if (rectFA == null || motionEvent == null || rectFA.contains(motionEvent.getX(), motionEvent.getY())) {
                        g gVar3 = transition2.f19515l;
                        float fAtan2 = (gVar3.f19613l * f10) + (gVar3.f19612k * f6);
                        if (gVar3.f19611j && motionEvent != null) {
                            float x4 = motionEvent.getX();
                            transition2.f19515l.getClass();
                            float f12 = x4 - 0.5f;
                            float y7 = motionEvent.getY();
                            transition2.f19515l.getClass();
                            float f13 = y7 - 0.5f;
                            fAtan2 = ((float) (Math.atan2(f10 + f13, f6 + f12) - Math.atan2(f12, f13))) * 10.0f;
                        }
                        float f14 = fAtan2 * (transition2.f19506c == i10 ? -1.0f : 1.1f);
                        if (f14 > f11) {
                            transition = transition2;
                            f11 = f14;
                        }
                    }
                }
            }
        }
        return transition;
    }

    public final int d(Transition transition) {
        int i10 = transition.f19504a;
        if (i10 == -1) {
            throw new IllegalArgumentException("The transition must have an id");
        }
        int i11 = 0;
        while (true) {
            ArrayList<Transition> arrayList = this.f19489e;
            if (i11 >= arrayList.size()) {
                return -1;
            }
            if (arrayList.get(i11).f19504a == i10) {
                return i11;
            }
            i11++;
        }
    }

    public void disableAutoTransition(boolean z10) {
        this.f19488d = z10;
    }

    public final Key e(int i10, int i11, int i12) {
        Transition transition = this.f19487c;
        if (transition == null) {
            return null;
        }
        for (KeyFrames keyFrames : transition.f19514k) {
            for (Integer num : keyFrames.getKeys()) {
                if (i11 == num.intValue()) {
                    for (Key key : keyFrames.getKeyFramesForView(num.intValue())) {
                        if (key.f19300a == i12 && key.mType == i10) {
                            return key;
                        }
                    }
                }
            }
        }
        return null;
    }

    public void enableViewTransition(int i10, boolean z10) {
        for (ViewTransition viewTransition : this.f19501r.f19577b) {
            if (viewTransition.f19543a == i10) {
                viewTransition.f19545c = !z10;
                return;
            }
        }
    }

    public final float f() {
        g gVar;
        Transition transition = this.f19487c;
        if (transition == null || (gVar = transition.f19515l) == null) {
            return 0.0f;
        }
        return gVar.f19620t;
    }

    public final int g() {
        Transition transition = this.f19487c;
        if (transition == null) {
            return -1;
        }
        return transition.f19507d;
    }

    public int gatPathMotionArc() {
        Transition transition = this.f19487c;
        if (transition != null) {
            return transition.f19518p;
        }
        return -1;
    }

    public ConstraintSet getConstraintSet(Context context, String str) {
        int i10 = 0;
        while (true) {
            SparseArray<ConstraintSet> sparseArray = this.f19492h;
            if (i10 >= sparseArray.size()) {
                return null;
            }
            int iKeyAt = sparseArray.keyAt(i10);
            if (str.equals(context.getResources().getResourceName(iKeyAt))) {
                return sparseArray.get(iKeyAt);
            }
            i10++;
        }
    }

    public int[] getConstraintSetIds() {
        SparseArray<ConstraintSet> sparseArray = this.f19492h;
        int size = sparseArray.size();
        int[] iArr = new int[size];
        for (int i10 = 0; i10 < size; i10++) {
            iArr[i10] = sparseArray.keyAt(i10);
        }
        return iArr;
    }

    public ArrayList<Transition> getDefinedTransitions() {
        return this.f19489e;
    }

    public int getDuration() {
        Transition transition = this.f19487c;
        return transition != null ? transition.f19511h : this.f19495k;
    }

    public Interpolator getInterpolator() {
        Transition transition = this.f19487c;
        int i10 = transition.f19508e;
        if (i10 == -2) {
            return AnimationUtils.loadInterpolator(this.f19485a.getContext(), this.f19487c.f19510g);
        }
        if (i10 == -1) {
            return new a(Easing.getInterpolator(transition.f19509f));
        }
        if (i10 == 0) {
            return new AccelerateDecelerateInterpolator();
        }
        if (i10 == 1) {
            return new AccelerateInterpolator();
        }
        if (i10 == 2) {
            return new DecelerateInterpolator();
        }
        if (i10 == 4) {
            return new BounceInterpolator();
        }
        if (i10 == 5) {
            return new OvershootInterpolator();
        }
        if (i10 != 6) {
            return null;
        }
        return new AnticipateInterpolator();
    }

    public void getKeyFrames(MotionController motionController) {
        Transition transition = this.f19487c;
        if (transition != null) {
            Iterator<KeyFrames> it = transition.f19514k.iterator();
            while (it.hasNext()) {
                it.next().addFrames(motionController);
            }
        } else {
            Transition transition2 = this.f19490f;
            if (transition2 != null) {
                Iterator<KeyFrames> it2 = transition2.f19514k.iterator();
                while (it2.hasNext()) {
                    it2.next().addFrames(motionController);
                }
            }
        }
    }

    public int[] getMatchingStateLabels(String... strArr) {
        SparseArray<ConstraintSet> sparseArray = this.f19492h;
        int size = sparseArray.size();
        int[] iArr = new int[size];
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            ConstraintSet constraintSetValueAt = sparseArray.valueAt(i11);
            int iKeyAt = sparseArray.keyAt(i11);
            if (constraintSetValueAt.matchesLabels(strArr)) {
                constraintSetValueAt.getStateLabels();
                iArr[i10] = iKeyAt;
                i10++;
            }
        }
        return Arrays.copyOf(iArr, i10);
    }

    public float getPathPercent(View view, int i10) {
        return 0.0f;
    }

    public float getStaggered() {
        Transition transition = this.f19487c;
        if (transition != null) {
            return transition.f19512i;
        }
        return 0.0f;
    }

    public Transition getTransitionById(int i10) {
        for (Transition transition : this.f19489e) {
            if (transition.f19504a == i10) {
                return transition;
            }
        }
        return null;
    }

    public List<Transition> getTransitionsWithState(int i10) {
        int iStateGetConstraintID;
        StateSet stateSet = this.f19486b;
        if (stateSet != null && (iStateGetConstraintID = stateSet.stateGetConstraintID(i10, -1, -1)) != -1) {
            i10 = iStateGetConstraintID;
        }
        ArrayList arrayList = new ArrayList();
        for (Transition transition : this.f19489e) {
            if (transition.f19507d == i10 || transition.f19506c == i10) {
                arrayList.add(transition);
            }
        }
        return arrayList;
    }

    public final int h(Context context, XmlResourceParser xmlResourceParser) {
        ConstraintSet constraintSet = new ConstraintSet();
        constraintSet.setForceId(false);
        int attributeCount = xmlResourceParser.getAttributeCount();
        int iC = -1;
        int iC2 = -1;
        for (int i10 = 0; i10 < attributeCount; i10++) {
            String attributeName = xmlResourceParser.getAttributeName(i10);
            String attributeValue = xmlResourceParser.getAttributeValue(i10);
            attributeName.getClass();
            switch (attributeName) {
                case "deriveConstraintsFrom":
                    iC2 = c(context, attributeValue);
                    break;
                case "constraintRotate":
                    try {
                        constraintSet.mRotate = Integer.parseInt(attributeValue);
                        break;
                    } catch (NumberFormatException unused) {
                        attributeValue.getClass();
                        switch (attributeValue) {
                            case "x_left":
                                constraintSet.mRotate = 4;
                                break;
                            case "left":
                                constraintSet.mRotate = 2;
                                break;
                            case "none":
                                constraintSet.mRotate = 0;
                                break;
                            case "right":
                                constraintSet.mRotate = 1;
                                break;
                            case "x_right":
                                constraintSet.mRotate = 3;
                                break;
                        }
                    }
                    break;
                case "id":
                    iC = c(context, attributeValue);
                    this.f19493i.put(stripID(attributeValue), Integer.valueOf(iC));
                    constraintSet.mIdString = Debug.getName(context, iC);
                    break;
                case "stateLabels":
                    constraintSet.setStateLabels(attributeValue);
                    break;
            }
        }
        if (iC != -1) {
            if (this.f19485a.O0 != 0) {
                constraintSet.setValidateOnParse(true);
            }
            constraintSet.load(context, xmlResourceParser);
            if (iC2 != -1) {
                this.f19494j.put(iC, iC2);
            }
            this.f19492h.put(iC, constraintSet);
        }
        return iC;
    }

    public final int i(Context context, int i10) {
        XmlResourceParser xml = context.getResources().getXml(i10);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                String name = xml.getName();
                if (2 == eventType && "ConstraintSet".equals(name)) {
                    return h(context, xml);
                }
            }
            return -1;
        } catch (IOException | XmlPullParserException unused) {
            return -1;
        }
    }

    public boolean isViewTransitionEnabled(int i10) {
        for (ViewTransition viewTransition : this.f19501r.f19577b) {
            if (viewTransition.f19543a == i10) {
                return !viewTransition.f19545c;
            }
        }
        return false;
    }

    public final void j(Context context, XmlResourceParser xmlResourceParser) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), R.styleable.include);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i10 = 0; i10 < indexCount; i10++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i10);
            if (index == R.styleable.include_constraintSet) {
                i(context, typedArrayObtainStyledAttributes.getResourceId(index, -1));
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public final void k(Context context, XmlResourceParser xmlResourceParser) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), R.styleable.MotionScene);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i10 = 0; i10 < indexCount; i10++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i10);
            if (index == R.styleable.MotionScene_defaultDuration) {
                int i11 = typedArrayObtainStyledAttributes.getInt(index, this.f19495k);
                this.f19495k = i11;
                if (i11 < 8) {
                    this.f19495k = 8;
                }
            } else if (index == R.styleable.MotionScene_layoutDuringTransition) {
                this.f19496l = typedArrayObtainStyledAttributes.getInteger(index, 0);
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public final void l(MotionLayout motionLayout, int i10) {
        SparseArray<ConstraintSet> sparseArray = this.f19492h;
        ConstraintSet constraintSet = sparseArray.get(i10);
        constraintSet.derivedState = constraintSet.mIdString;
        int i11 = this.f19494j.get(i10);
        if (i11 > 0) {
            l(motionLayout, i11);
            ConstraintSet constraintSet2 = sparseArray.get(i11);
            if (constraintSet2 == null) {
                Debug.getName(this.f19485a.getContext(), i11);
                return;
            }
            constraintSet.derivedState += "/" + constraintSet2.derivedState;
            constraintSet.readFallback(constraintSet2);
        } else {
            constraintSet.derivedState = ad.d.f(new StringBuilder(), constraintSet.derivedState, "  layout");
            constraintSet.readFallback(motionLayout);
        }
        constraintSet.applyDeltaFrom(constraintSet);
    }

    public int lookUpConstraintId(String str) {
        Integer num = this.f19493i.get(str);
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    public String lookUpConstraintName(int i10) {
        for (Map.Entry<String, Integer> entry : this.f19493i.entrySet()) {
            Integer value = entry.getValue();
            if (value != null && value.intValue() == i10) {
                return entry.getKey();
            }
        }
        return null;
    }

    public final void m(MotionLayout motionLayout) {
        int i10 = 0;
        while (true) {
            SparseArray<ConstraintSet> sparseArray = this.f19492h;
            if (i10 >= sparseArray.size()) {
                return;
            }
            int iKeyAt = sparseArray.keyAt(i10);
            SparseIntArray sparseIntArray = this.f19494j;
            int i11 = sparseIntArray.get(iKeyAt);
            int size = sparseIntArray.size();
            while (i11 > 0) {
                if (i11 == iKeyAt) {
                    return;
                }
                int i12 = size - 1;
                if (size < 0) {
                    return;
                }
                i11 = sparseIntArray.get(i11);
                size = i12;
            }
            l(motionLayout, iKeyAt);
            i10++;
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0033  */
    /* JADX WARN: Code duplicated, block: B:32:0x004d  */
    /* JADX WARN: Code duplicated, block: B:37:0x0061  */
    /* JADX WARN: Code duplicated, block: B:42:0x0078  */
    /* JADX WARN: Code duplicated, block: B:45:0x0053 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:53:0x006b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:55:0x005b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:57:? A[RETURN, SYNTHETIC] */
    public final void n(int i10, int i11) {
        int iStateGetConstraintID;
        int iStateGetConstraintID2;
        Transition transition;
        ArrayList<Transition> arrayList;
        Iterator<Transition> it;
        Transition transition2;
        Transition transition3;
        Transition next;
        int i12;
        g gVar;
        StateSet stateSet = this.f19486b;
        if (stateSet != null) {
            iStateGetConstraintID = stateSet.stateGetConstraintID(i10, -1, -1);
            if (iStateGetConstraintID == -1) {
                iStateGetConstraintID = i10;
            }
            iStateGetConstraintID2 = this.f19486b.stateGetConstraintID(i11, -1, -1);
            if (iStateGetConstraintID2 == -1) {
            }
            transition = this.f19487c;
            if (transition == null && transition.f19506c == i11 && transition.f19507d == i10) {
                return;
            }
            arrayList = this.f19489e;
            it = arrayList.iterator();
            while (true) {
                if (it.hasNext()) {
                    transition2 = this.f19490f;
                    for (Transition transition4 : this.f19491g) {
                        if (transition4.f19506c == i11) {
                            transition2 = transition4;
                        }
                    }
                    transition3 = new Transition(this, transition2);
                    transition3.f19507d = iStateGetConstraintID;
                    transition3.f19506c = iStateGetConstraintID2;
                    if (iStateGetConstraintID != -1) {
                        arrayList.add(transition3);
                    }
                    this.f19487c = transition3;
                    return;
                }
                next = it.next();
                i12 = next.f19506c;
                if ((i12 != iStateGetConstraintID2 && next.f19507d == iStateGetConstraintID) || (i12 == i11 && next.f19507d == i10)) {
                    break;
                }
            }
            this.f19487c = next;
            gVar = next.f19515l;
            if (gVar != null) {
                gVar.c(this.f19500q);
            }
        }
        iStateGetConstraintID = i10;
        iStateGetConstraintID2 = i11;
        transition = this.f19487c;
        if (transition == null) {
        }
        arrayList = this.f19489e;
        it = arrayList.iterator();
        while (true) {
            if (it.hasNext()) {
                transition2 = this.f19490f;
                while (r4.hasNext()) {
                    if (transition4.f19506c == i11) {
                        transition2 = transition4;
                    }
                }
                transition3 = new Transition(this, transition2);
                transition3.f19507d = iStateGetConstraintID;
                transition3.f19506c = iStateGetConstraintID2;
                if (iStateGetConstraintID != -1) {
                    arrayList.add(transition3);
                }
                this.f19487c = transition3;
                return;
            }
            next = it.next();
            i12 = next.f19506c;
            if (i12 != iStateGetConstraintID2) {
            }
        }
        this.f19487c = next;
        gVar = next.f19515l;
        if (gVar != null) {
            gVar.c(this.f19500q);
        }
    }

    public final boolean o() {
        Iterator<Transition> it = this.f19489e.iterator();
        while (it.hasNext()) {
            if (it.next().f19515l != null) {
                return true;
            }
        }
        Transition transition = this.f19487c;
        return (transition == null || transition.f19515l == null) ? false : true;
    }

    public void removeTransition(Transition transition) {
        int iD = d(transition);
        if (iD != -1) {
            this.f19489e.remove(iD);
        }
    }

    public void setConstraintSet(int i10, ConstraintSet constraintSet) {
        this.f19492h.put(i10, constraintSet);
    }

    public void setDuration(int i10) {
        Transition transition = this.f19487c;
        if (transition != null) {
            transition.setDuration(i10);
        } else {
            this.f19495k = i10;
        }
    }

    public void setKeyframe(View view, int i10, String str, Object obj) {
        Transition transition = this.f19487c;
        if (transition == null) {
            return;
        }
        Iterator<KeyFrames> it = transition.f19514k.iterator();
        while (it.hasNext()) {
            Iterator<Key> it2 = it.next().getKeyFramesForView(view.getId()).iterator();
            while (it2.hasNext()) {
                if (it2.next().f19300a == i10 && obj != null) {
                    ((Float) obj).floatValue();
                }
            }
        }
    }

    public void setRtl(boolean z10) {
        g gVar;
        this.f19500q = z10;
        Transition transition = this.f19487c;
        if (transition == null || (gVar = transition.f19515l) == null) {
            return;
        }
        gVar.c(z10);
    }

    public void setTransition(Transition transition) {
        g gVar;
        this.f19487c = transition;
        if (transition == null || (gVar = transition.f19515l) == null) {
            return;
        }
        gVar.c(this.f19500q);
    }

    public boolean validateLayout(MotionLayout motionLayout) {
        return motionLayout == this.f19485a && motionLayout.f19431p0 == this;
    }

    public void viewTransition(int i10, View... viewArr) {
        ViewTransitionController viewTransitionController = this.f19501r;
        viewTransitionController.getClass();
        ArrayList arrayList = new ArrayList();
        for (ViewTransition viewTransition : viewTransitionController.f19577b) {
            if (viewTransition.f19543a == i10) {
                for (View view : viewArr) {
                    if (viewTransition.b(view)) {
                        arrayList.add(view);
                    }
                }
                if (!arrayList.isEmpty()) {
                    View[] viewArr2 = (View[]) arrayList.toArray(new View[0]);
                    MotionLayout motionLayout = viewTransitionController.f19576a;
                    int currentState = motionLayout.getCurrentState();
                    if (viewTransition.f19547e == 2) {
                        viewTransition.a(viewTransitionController, viewTransitionController.f19576a, currentState, null, viewArr2);
                    } else if (currentState == -1) {
                        Log.w(viewTransitionController.f19579d, "No support for ViewTransition within transition yet. Currently: " + motionLayout.toString());
                    } else {
                        ConstraintSet constraintSet = motionLayout.getConstraintSet(currentState);
                        if (constraintSet != null) {
                            viewTransition.a(viewTransitionController, viewTransitionController.f19576a, currentState, constraintSet, viewArr2);
                        }
                    }
                    arrayList.clear();
                }
            }
        }
    }

    public static class Transition {
        public static final int AUTO_ANIMATE_TO_END = 4;
        public static final int AUTO_ANIMATE_TO_START = 3;
        public static final int AUTO_JUMP_TO_END = 2;
        public static final int AUTO_JUMP_TO_START = 1;
        public static final int AUTO_NONE = 0;
        public static final int INTERPOLATE_ANTICIPATE = 6;
        public static final int INTERPOLATE_BOUNCE = 4;
        public static final int INTERPOLATE_EASE_IN = 1;
        public static final int INTERPOLATE_EASE_IN_OUT = 0;
        public static final int INTERPOLATE_EASE_OUT = 2;
        public static final int INTERPOLATE_LINEAR = 3;
        public static final int INTERPOLATE_OVERSHOOT = 5;
        public static final int INTERPOLATE_REFERENCE_ID = -2;
        public static final int INTERPOLATE_SPLINE_STRING = -1;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f19504a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f19505b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f19506c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f19507d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f19508e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public String f19509f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f19510g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f19511h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public float f19512i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final MotionScene f19513j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final ArrayList<KeyFrames> f19514k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public g f19515l;
        public final ArrayList<TransitionOnClick> m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public int f19516n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public boolean f19517o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public int f19518p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public int f19519q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f19520r;

        public Transition(MotionScene motionScene, Transition transition) {
            this.f19504a = -1;
            this.f19505b = false;
            this.f19506c = -1;
            this.f19507d = -1;
            this.f19508e = 0;
            this.f19509f = null;
            this.f19510g = -1;
            this.f19511h = 400;
            this.f19512i = 0.0f;
            this.f19514k = new ArrayList<>();
            this.f19515l = null;
            this.m = new ArrayList<>();
            this.f19516n = 0;
            this.f19517o = false;
            this.f19518p = -1;
            this.f19519q = 0;
            this.f19520r = 0;
            this.f19513j = motionScene;
            this.f19511h = motionScene.f19495k;
            if (transition != null) {
                this.f19518p = transition.f19518p;
                this.f19508e = transition.f19508e;
                this.f19509f = transition.f19509f;
                this.f19510g = transition.f19510g;
                this.f19511h = transition.f19511h;
                this.f19514k = transition.f19514k;
                this.f19512i = transition.f19512i;
                this.f19519q = transition.f19519q;
            }
        }

        public void addKeyFrame(KeyFrames keyFrames) {
            this.f19514k.add(keyFrames);
        }

        public void addOnClick(int i10, int i11) {
            ArrayList<TransitionOnClick> arrayList = this.m;
            for (TransitionOnClick transitionOnClick : arrayList) {
                if (transitionOnClick.f19522q0 == i10) {
                    transitionOnClick.f19523r0 = i11;
                    return;
                }
            }
            arrayList.add(new TransitionOnClick(this, i10, i11));
        }

        public String debugString(Context context) {
            String resourceEntryName = this.f19507d == -1 ? AbstractJsonLexerKt.NULL : context.getResources().getResourceEntryName(this.f19507d);
            if (this.f19506c == -1) {
                return u.f(resourceEntryName, " -> null");
            }
            StringBuilder sbE = androidx.camera.core.processing.f.e(resourceEntryName, " -> ");
            sbE.append(context.getResources().getResourceEntryName(this.f19506c));
            return sbE.toString();
        }

        public int getAutoTransition() {
            return this.f19516n;
        }

        public int getDuration() {
            return this.f19511h;
        }

        public int getEndConstraintSetId() {
            return this.f19506c;
        }

        public int getId() {
            return this.f19504a;
        }

        public List<KeyFrames> getKeyFrameList() {
            return this.f19514k;
        }

        public int getLayoutDuringTransition() {
            return this.f19519q;
        }

        public List<TransitionOnClick> getOnClickList() {
            return this.m;
        }

        public int getPathMotionArc() {
            return this.f19518p;
        }

        public float getStagger() {
            return this.f19512i;
        }

        public int getStartConstraintSetId() {
            return this.f19507d;
        }

        public g getTouchResponse() {
            return this.f19515l;
        }

        public boolean isEnabled() {
            return !this.f19517o;
        }

        public boolean isTransitionFlag(int i10) {
            return (i10 & this.f19520r) != 0;
        }

        public void removeOnClick(int i10) {
            TransitionOnClick next;
            ArrayList<TransitionOnClick> arrayList = this.m;
            Iterator<TransitionOnClick> it = arrayList.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (next.f19522q0 != i10);
            if (next != null) {
                arrayList.remove(next);
            }
        }

        public void setAutoTransition(int i10) {
            this.f19516n = i10;
        }

        public void setDuration(int i10) {
            this.f19511h = Math.max(i10, 8);
        }

        public void setEnabled(boolean z10) {
            this.f19517o = !z10;
        }

        public void setInterpolatorInfo(int i10, String str, int i11) {
            this.f19508e = i10;
            this.f19509f = str;
            this.f19510g = i11;
        }

        public void setLayoutDuringTransition(int i10) {
            this.f19519q = i10;
        }

        public void setOnSwipe(OnSwipe onSwipe) {
            this.f19515l = onSwipe == null ? null : new g(this.f19513j.f19485a, onSwipe);
        }

        public void setOnTouchUp(int i10) {
            g touchResponse = getTouchResponse();
            if (touchResponse != null) {
                touchResponse.f19604c = i10;
            }
        }

        public void setPathMotionArc(int i10) {
            this.f19518p = i10;
        }

        public void setStagger(float f6) {
            this.f19512i = f6;
        }

        public void setTransitionFlag(int i10) {
            this.f19520r = i10;
        }

        public void addOnClick(Context context, XmlPullParser xmlPullParser) {
            this.m.add(new TransitionOnClick(context, this, xmlPullParser));
        }

        public static class TransitionOnClick implements View.OnClickListener {
            public static final int ANIM_TOGGLE = 17;
            public static final int ANIM_TO_END = 1;
            public static final int ANIM_TO_START = 16;
            public static final int JUMP_TO_END = 256;
            public static final int JUMP_TO_START = 4096;

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public final Transition f19521p0;

            /* JADX INFO: renamed from: q0, reason: collision with root package name */
            public final int f19522q0;

            /* JADX INFO: renamed from: r0, reason: collision with root package name */
            public int f19523r0;

            public TransitionOnClick(Context context, Transition transition, XmlPullParser xmlPullParser) {
                this.f19522q0 = -1;
                this.f19523r0 = 17;
                this.f19521p0 = transition;
                TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), R.styleable.OnClick);
                int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
                for (int i10 = 0; i10 < indexCount; i10++) {
                    int index = typedArrayObtainStyledAttributes.getIndex(i10);
                    if (index == R.styleable.OnClick_targetId) {
                        this.f19522q0 = typedArrayObtainStyledAttributes.getResourceId(index, this.f19522q0);
                    } else if (index == R.styleable.OnClick_clickAction) {
                        this.f19523r0 = typedArrayObtainStyledAttributes.getInt(index, this.f19523r0);
                    }
                }
                typedArrayObtainStyledAttributes.recycle();
            }

            public void addOnClickListeners(MotionLayout motionLayout, int i10, Transition transition) {
                boolean z10;
                View viewFindViewById;
                int i11 = this.f19522q0;
                View view = motionLayout;
                if (i11 != -1) {
                    viewFindViewById = motionLayout.findViewById(i11);
                }
                if (view == null) {
                    view = viewFindViewById;
                    return;
                }
                int i12 = transition.f19507d;
                int i13 = transition.f19506c;
                if (i12 == -1) {
                    view = viewFindViewById;
                    view.setOnClickListener(this);
                    return;
                }
                int i14 = this.f19523r0;
                boolean z11 = false;
                if ((i14 & 1) == 0 || i10 != i12) {
                    view = viewFindViewById;
                    z10 = false;
                } else {
                    z10 = true;
                }
                boolean z12 = ((i14 & 1) != 0 && i10 == i12) | z10 | ((i14 & 256) != 0 && i10 == i12) | ((i14 & 16) != 0 && i10 == i13);
                if ((i14 & 4096) != 0 && i10 == i13) {
                    z11 = true;
                }
                if (z12 || z11) {
                    view.setOnClickListener(this);
                }
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                Transition transition = this.f19521p0;
                MotionLayout motionLayout = transition.f19513j.f19485a;
                if (motionLayout.isInteractionEnabled()) {
                    if (transition.f19507d == -1) {
                        int currentState = motionLayout.getCurrentState();
                        if (currentState == -1) {
                            motionLayout.transitionToState(transition.f19506c);
                            return;
                        }
                        Transition transition2 = new Transition(transition.f19513j, transition);
                        transition2.f19507d = currentState;
                        transition2.f19506c = transition.f19506c;
                        motionLayout.setTransition(transition2);
                        motionLayout.transitionToEnd();
                        return;
                    }
                    Transition transition3 = transition.f19513j.f19487c;
                    int i10 = this.f19523r0;
                    boolean z10 = false;
                    boolean z11 = ((i10 & 1) == 0 && (i10 & 256) == 0) ? false : true;
                    boolean z12 = ((i10 & 16) == 0 && (i10 & 4096) == 0) ? false : true;
                    if (z11 && z12) {
                        if (transition3 != transition) {
                            motionLayout.setTransition(transition);
                        }
                        if (motionLayout.getCurrentState() != motionLayout.getEndState() && motionLayout.getProgress() <= 0.5f) {
                            z12 = false;
                            z10 = z11;
                        }
                    } else {
                        z10 = z11;
                    }
                    if (transition != transition3) {
                        int i11 = transition.f19506c;
                        int i12 = transition.f19507d;
                        if (i12 != -1) {
                            int i13 = motionLayout.f19440u0;
                            if (i13 != i12 && i13 != i11) {
                                return;
                            }
                        } else if (motionLayout.f19440u0 == i11) {
                            return;
                        }
                    }
                    if (z10 && (this.f19523r0 & 1) != 0) {
                        motionLayout.setTransition(transition);
                        motionLayout.transitionToEnd();
                        return;
                    }
                    if (z12 && (this.f19523r0 & 16) != 0) {
                        motionLayout.setTransition(transition);
                        motionLayout.transitionToStart();
                    } else if (z10 && (this.f19523r0 & 256) != 0) {
                        motionLayout.setTransition(transition);
                        motionLayout.setProgress(1.0f);
                    } else {
                        if (!z12 || (this.f19523r0 & 4096) == 0) {
                            return;
                        }
                        motionLayout.setTransition(transition);
                        motionLayout.setProgress(0.0f);
                    }
                }
            }

            public void removeOnClickListeners(MotionLayout motionLayout) {
                View viewFindViewById;
                int i10 = this.f19522q0;
                if (i10 == -1 || (viewFindViewById = motionLayout.findViewById(i10)) == null) {
                    return;
                }
                viewFindViewById.setOnClickListener(null);
            }

            public TransitionOnClick(Transition transition, int i10, int i11) {
                this.f19521p0 = transition;
                this.f19522q0 = i10;
                this.f19523r0 = i11;
            }
        }

        public Transition(int i10, MotionScene motionScene, int i11, int i12) {
            this.f19504a = -1;
            this.f19505b = false;
            this.f19506c = -1;
            this.f19507d = -1;
            this.f19508e = 0;
            this.f19509f = null;
            this.f19510g = -1;
            this.f19511h = 400;
            this.f19512i = 0.0f;
            this.f19514k = new ArrayList<>();
            this.f19515l = null;
            this.m = new ArrayList<>();
            this.f19516n = 0;
            this.f19517o = false;
            this.f19518p = -1;
            this.f19519q = 0;
            this.f19520r = 0;
            this.f19504a = i10;
            this.f19513j = motionScene;
            this.f19507d = i11;
            this.f19506c = i12;
            this.f19511h = motionScene.f19495k;
            this.f19519q = motionScene.f19496l;
        }

        public Transition(MotionScene motionScene, Context context, XmlResourceParser xmlResourceParser) {
            this.f19504a = -1;
            this.f19505b = false;
            this.f19506c = -1;
            this.f19507d = -1;
            this.f19508e = 0;
            this.f19509f = null;
            this.f19510g = -1;
            this.f19511h = 400;
            this.f19512i = 0.0f;
            this.f19514k = new ArrayList<>();
            this.f19515l = null;
            this.m = new ArrayList<>();
            this.f19516n = 0;
            this.f19517o = false;
            this.f19518p = -1;
            this.f19519q = 0;
            this.f19520r = 0;
            this.f19511h = motionScene.f19495k;
            this.f19519q = motionScene.f19496l;
            this.f19513j = motionScene;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), R.styleable.Transition);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i10);
                int i11 = R.styleable.Transition_constraintSetEnd;
                SparseArray<ConstraintSet> sparseArray = motionScene.f19492h;
                if (index == i11) {
                    this.f19506c = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.f19506c);
                    if (PluginUtils.IDENTIFIER_LAYOUT.equals(resourceTypeName)) {
                        ConstraintSet constraintSet = new ConstraintSet();
                        constraintSet.load(context, this.f19506c);
                        sparseArray.append(this.f19506c, constraintSet);
                    } else if ("xml".equals(resourceTypeName)) {
                        this.f19506c = motionScene.i(context, this.f19506c);
                    }
                } else if (index == R.styleable.Transition_constraintSetStart) {
                    this.f19507d = typedArrayObtainStyledAttributes.getResourceId(index, this.f19507d);
                    String resourceTypeName2 = context.getResources().getResourceTypeName(this.f19507d);
                    if (PluginUtils.IDENTIFIER_LAYOUT.equals(resourceTypeName2)) {
                        ConstraintSet constraintSet2 = new ConstraintSet();
                        constraintSet2.load(context, this.f19507d);
                        sparseArray.append(this.f19507d, constraintSet2);
                    } else if ("xml".equals(resourceTypeName2)) {
                        this.f19507d = motionScene.i(context, this.f19507d);
                    }
                } else if (index == R.styleable.Transition_motionInterpolator) {
                    int i12 = typedArrayObtainStyledAttributes.peekValue(index).type;
                    if (i12 == 1) {
                        int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                        this.f19510g = resourceId;
                        if (resourceId != -1) {
                            this.f19508e = -2;
                        }
                    } else if (i12 == 3) {
                        String string = typedArrayObtainStyledAttributes.getString(index);
                        this.f19509f = string;
                        if (string != null) {
                            if (string.indexOf("/") > 0) {
                                this.f19510g = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                                this.f19508e = -2;
                            } else {
                                this.f19508e = -1;
                            }
                        }
                    } else {
                        this.f19508e = typedArrayObtainStyledAttributes.getInteger(index, this.f19508e);
                    }
                } else if (index == R.styleable.Transition_duration) {
                    int i13 = typedArrayObtainStyledAttributes.getInt(index, this.f19511h);
                    this.f19511h = i13;
                    if (i13 < 8) {
                        this.f19511h = 8;
                    }
                } else if (index == R.styleable.Transition_staggered) {
                    this.f19512i = typedArrayObtainStyledAttributes.getFloat(index, this.f19512i);
                } else if (index == R.styleable.Transition_autoTransition) {
                    this.f19516n = typedArrayObtainStyledAttributes.getInteger(index, this.f19516n);
                } else if (index == R.styleable.Transition_android_id) {
                    this.f19504a = typedArrayObtainStyledAttributes.getResourceId(index, this.f19504a);
                } else if (index == R.styleable.Transition_transitionDisable) {
                    this.f19517o = typedArrayObtainStyledAttributes.getBoolean(index, this.f19517o);
                } else if (index == R.styleable.Transition_pathMotionArc) {
                    this.f19518p = typedArrayObtainStyledAttributes.getInteger(index, -1);
                } else if (index == R.styleable.Transition_layoutDuringTransition) {
                    this.f19519q = typedArrayObtainStyledAttributes.getInteger(index, 0);
                } else if (index == R.styleable.Transition_transitionFlags) {
                    this.f19520r = typedArrayObtainStyledAttributes.getInteger(index, 0);
                }
            }
            if (this.f19507d == -1) {
                this.f19505b = true;
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00cb  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public MotionScene(Context context, MotionLayout motionLayout, int i10) {
        Transition transition = null;
        this.f19486b = null;
        this.f19487c = null;
        this.f19488d = false;
        ArrayList<Transition> arrayList = new ArrayList<>();
        this.f19489e = arrayList;
        this.f19490f = null;
        this.f19491g = new ArrayList<>();
        this.f19492h = new SparseArray<>();
        this.f19493i = new HashMap<>();
        this.f19494j = new SparseIntArray();
        this.f19495k = 400;
        this.f19496l = 0;
        this.f19497n = false;
        this.f19498o = false;
        this.f19485a = motionLayout;
        this.f19501r = new ViewTransitionController(motionLayout);
        XmlResourceParser xml = context.getResources().getXml(i10);
        try {
            int eventType = xml.getEventType();
            while (true) {
                byte b10 = 1;
                if (eventType != 1) {
                    if (eventType == 2) {
                        String name = xml.getName();
                        switch (name.hashCode()) {
                            case -1349929691:
                                if (!name.equals("ConstraintSet")) {
                                    b10 = -1;
                                } else {
                                    b10 = 5;
                                }
                                break;
                            case -1239391468:
                                if (!name.equals(ViewTransition.KEY_FRAME_SET_TAG)) {
                                    b10 = -1;
                                } else {
                                    b10 = 8;
                                }
                                break;
                            case -687739768:
                                if (!name.equals("Include")) {
                                    b10 = -1;
                                } else {
                                    b10 = 7;
                                }
                                break;
                            case 61998586:
                                if (!name.equals(ViewTransition.VIEW_TRANSITION_TAG)) {
                                    b10 = -1;
                                } else {
                                    b10 = 9;
                                }
                                break;
                            case 269306229:
                                if (!name.equals("Transition")) {
                                    b10 = -1;
                                }
                                break;
                            case 312750793:
                                if (!name.equals("OnClick")) {
                                    b10 = -1;
                                } else {
                                    b10 = 3;
                                }
                                break;
                            case 327855227:
                                if (!name.equals("OnSwipe")) {
                                    b10 = -1;
                                } else {
                                    b10 = 2;
                                }
                                break;
                            case 793277014:
                                if (!name.equals(TypedValues.MotionScene.NAME)) {
                                    b10 = -1;
                                } else {
                                    b10 = 0;
                                }
                                break;
                            case 1382829617:
                                if (!name.equals("StateSet")) {
                                    b10 = -1;
                                } else {
                                    b10 = 4;
                                }
                                break;
                            case 1942574248:
                                if (!name.equals("include")) {
                                    b10 = -1;
                                } else {
                                    b10 = 6;
                                }
                                break;
                            default:
                                b10 = -1;
                                break;
                        }
                        MotionLayout motionLayout2 = this.f19485a;
                        switch (b10) {
                            case 0:
                                k(context, xml);
                                break;
                            case 1:
                                transition = new Transition(this, context, xml);
                                arrayList.add(transition);
                                if (this.f19487c == null && !transition.f19505b) {
                                    this.f19487c = transition;
                                    g gVar = transition.f19515l;
                                    if (gVar != null) {
                                        gVar.c(this.f19500q);
                                    }
                                }
                                if (transition.f19505b) {
                                    if (transition.f19506c == -1) {
                                        this.f19490f = transition;
                                    } else {
                                        this.f19491g.add(transition);
                                    }
                                    arrayList.remove(transition);
                                }
                                break;
                            case 2:
                                if (transition == null) {
                                    context.getResources().getResourceEntryName(i10);
                                    xml.getLineNumber();
                                }
                                if (transition != null) {
                                    transition.f19515l = new g(context, motionLayout2, xml);
                                }
                                break;
                            case 3:
                                if (transition != null && !motionLayout2.isInEditMode()) {
                                    transition.addOnClick(context, xml);
                                }
                                break;
                            case 4:
                                this.f19486b = new StateSet(context, xml);
                                break;
                            case 5:
                                h(context, xml);
                                break;
                            case 6:
                            case 7:
                                j(context, xml);
                                break;
                            case 8:
                                KeyFrames keyFrames = new KeyFrames(context, xml);
                                if (transition != null) {
                                    transition.f19514k.add(keyFrames);
                                }
                                break;
                            case 9:
                                this.f19501r.add(new ViewTransition(context, xml));
                                break;
                        }
                    }
                    eventType = xml.next();
                }
                SparseArray<ConstraintSet> sparseArray = this.f19492h;
                int i11 = R.id.motion_base;
                sparseArray.put(i11, new ConstraintSet());
                this.f19493i.put("motion_base", Integer.valueOf(i11));
                return;
            }
        } catch (IOException | XmlPullParserException unused) {
        }
    }

    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
    }
}
