package androidx.constraintlayout.motion.widget;

import android.graphics.RectF;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.motion.utils.ViewSpline;
import androidx.constraintlayout.widget.ConstraintSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class DesignTool {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final HashMap<Pair<Integer, Integer>, String> f19293f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final HashMap<String, String> f19294g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MotionLayout f19295a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f19296b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f19297c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f19298d = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f19299e = -1;

    static {
        HashMap<Pair<Integer, Integer>, String> map = new HashMap<>();
        f19293f = map;
        HashMap<String, String> map2 = new HashMap<>();
        f19294g = map2;
        map.put(Pair.create(4, 4), "layout_constraintBottom_toBottomOf");
        map.put(Pair.create(4, 3), "layout_constraintBottom_toTopOf");
        map.put(Pair.create(3, 4), "layout_constraintTop_toBottomOf");
        map.put(Pair.create(3, 3), "layout_constraintTop_toTopOf");
        map.put(Pair.create(6, 6), "layout_constraintStart_toStartOf");
        map.put(Pair.create(6, 7), "layout_constraintStart_toEndOf");
        map.put(Pair.create(7, 6), "layout_constraintEnd_toStartOf");
        map.put(Pair.create(7, 7), "layout_constraintEnd_toEndOf");
        map.put(Pair.create(1, 1), "layout_constraintLeft_toLeftOf");
        map.put(Pair.create(1, 2), "layout_constraintLeft_toRightOf");
        map.put(Pair.create(2, 2), "layout_constraintRight_toRightOf");
        map.put(Pair.create(2, 1), "layout_constraintRight_toLeftOf");
        map.put(Pair.create(5, 5), "layout_constraintBaseline_toBaselineOf");
        map2.put("layout_constraintBottom_toBottomOf", "layout_marginBottom");
        map2.put("layout_constraintBottom_toTopOf", "layout_marginBottom");
        map2.put("layout_constraintTop_toBottomOf", "layout_marginTop");
        map2.put("layout_constraintTop_toTopOf", "layout_marginTop");
        map2.put("layout_constraintStart_toStartOf", "layout_marginStart");
        map2.put("layout_constraintStart_toEndOf", "layout_marginStart");
        map2.put("layout_constraintEnd_toStartOf", "layout_marginEnd");
        map2.put("layout_constraintEnd_toEndOf", "layout_marginEnd");
        map2.put("layout_constraintLeft_toLeftOf", "layout_marginLeft");
        map2.put("layout_constraintLeft_toRightOf", "layout_marginLeft");
        map2.put("layout_constraintRight_toRightOf", "layout_marginRight");
        map2.put("layout_constraintRight_toLeftOf", "layout_marginRight");
    }

    public DesignTool(MotionLayout motionLayout) {
        this.f19295a = motionLayout;
    }

    public static void a(int i10, ConstraintSet constraintSet, View view, HashMap<String, String> map, int i11, int i12) {
        String str = f19293f.get(Pair.create(Integer.valueOf(i11), Integer.valueOf(i12)));
        String str2 = map.get(str);
        if (str2 != null) {
            String str3 = f19294g.get(str);
            constraintSet.connect(view.getId(), i11, Integer.parseInt(str2), i12, str3 != null ? b(i10, map.get(str3)) : 0);
        }
    }

    public static int b(int i10, String str) {
        int iIndexOf;
        if (str == null || (iIndexOf = str.indexOf(100)) == -1) {
            return 0;
        }
        return (int) ((Integer.valueOf(str.substring(0, iIndexOf)).intValue() * i10) / 160.0f);
    }

    public static void c(int i10, View view, ConstraintSet constraintSet, HashMap map) {
        String str = (String) map.get(i10 == 1 ? "layout_constraintVertical_bias" : "layout_constraintHorizontal_bias");
        if (str != null) {
            if (i10 == 0) {
                constraintSet.setHorizontalBias(view.getId(), Float.parseFloat(str));
            } else if (i10 == 1) {
                constraintSet.setVerticalBias(view.getId(), Float.parseFloat(str));
            }
        }
    }

    public static void d(int i10, ConstraintSet constraintSet, View view, HashMap<String, String> map, int i11) {
        String str = map.get(i11 == 1 ? "layout_height" : "layout_width");
        if (str != null) {
            int iB = !str.equalsIgnoreCase("wrap_content") ? b(i10, str) : -2;
            if (i11 == 0) {
                constraintSet.constrainWidth(view.getId(), iB);
            } else {
                constraintSet.constrainHeight(view.getId(), iB);
            }
        }
    }

    public int designAccess(int i10, String str, Object obj, float[] fArr, int i11, float[] fArr2, int i12) {
        MotionController motionController;
        View view = (View) obj;
        MotionLayout motionLayout = this.f19295a;
        if (i10 == 0) {
            motionController = null;
        } else if (motionLayout.f19431p0 == null || view == null || (motionController = motionLayout.E0.get(view)) == null) {
            return -1;
        }
        if (i10 == 0) {
            return 1;
        }
        if (i10 == 1) {
            int duration = motionLayout.f19431p0.getDuration() / 16;
            motionController.b(fArr2, duration);
            return duration;
        }
        if (i10 == 2) {
            int duration2 = motionLayout.f19431p0.getDuration() / 16;
            motionController.a(fArr2, null);
            return duration2;
        }
        if (i10 != 3) {
            return -1;
        }
        int duration3 = motionLayout.f19431p0.getDuration() / 16;
        ViewSpline viewSpline = motionController.f19411y.get(str);
        if (viewSpline == null) {
            return -1;
        }
        for (int i13 = 0; i13 < fArr2.length; i13++) {
            fArr2[i13] = viewSpline.get(i13 / (fArr2.length - 1));
        }
        return fArr2.length;
    }

    public void disableAutoTransition(boolean z10) {
        MotionScene motionScene = this.f19295a.f19431p0;
        if (motionScene == null) {
            return;
        }
        motionScene.disableAutoTransition(z10);
    }

    public void dumpConstraintSet(String str) {
        MotionLayout motionLayout = this.f19295a;
        if (motionLayout.f19431p0 == null) {
            motionLayout.f19431p0 = null;
        }
        MotionScene motionScene = motionLayout.f19431p0;
        int iLookUpConstraintId = motionScene == null ? 0 : motionScene.lookUpConstraintId(str);
        System.out.println(" dumping  " + str + " (" + iLookUpConstraintId + ")");
        try {
            motionLayout.f19431p0.b(iLookUpConstraintId).dump(motionLayout.f19431p0, new int[0]);
        } catch (Exception unused) {
        }
    }

    public int getAnimationKeyFrames(Object obj, float[] fArr) {
        MotionLayout motionLayout = this.f19295a;
        MotionScene motionScene = motionLayout.f19431p0;
        if (motionScene == null) {
            return -1;
        }
        int duration = motionScene.getDuration() / 16;
        MotionController motionController = motionLayout.E0.get(obj);
        if (motionController == null) {
            return 0;
        }
        motionController.a(fArr, null);
        return duration;
    }

    public int getAnimationPath(Object obj, float[] fArr, int i10) {
        MotionLayout motionLayout = this.f19295a;
        if (motionLayout.f19431p0 == null) {
            return -1;
        }
        MotionController motionController = motionLayout.E0.get(obj);
        if (motionController == null) {
            return 0;
        }
        motionController.b(fArr, i10);
        return i10;
    }

    public void getAnimationRectangles(Object obj, float[] fArr) {
        MotionLayout motionLayout = this.f19295a;
        MotionScene motionScene = motionLayout.f19431p0;
        if (motionScene == null) {
            return;
        }
        int duration = motionScene.getDuration() / 16;
        MotionController motionController = motionLayout.E0.get(obj);
        if (motionController == null) {
            return;
        }
        float f6 = 1.0f / (duration - 1);
        for (int i10 = 0; i10 < duration; i10++) {
            motionController.f19397j[0].getPos(motionController.c(i10 * f6, null), motionController.f19402p);
            motionController.f19393f.e(motionController.f19401o, motionController.f19402p, fArr, i10 * 8);
        }
    }

    public String getEndState() {
        MotionLayout motionLayout = this.f19295a;
        int endState = motionLayout.getEndState();
        if (this.f19299e == endState) {
            return this.f19297c;
        }
        MotionScene motionScene = motionLayout.f19431p0;
        String strLookUpConstraintName = motionScene == null ? null : motionScene.lookUpConstraintName(endState);
        if (strLookUpConstraintName != null) {
            this.f19297c = strLookUpConstraintName;
            this.f19299e = endState;
        }
        return strLookUpConstraintName;
    }

    public int getKeyFrameInfo(Object obj, int i10, int[] iArr) {
        MotionController motionController = this.f19295a.E0.get((View) obj);
        if (motionController == null) {
            return 0;
        }
        return motionController.getKeyFrameInfo(i10, iArr);
    }

    public float getKeyFramePosition(Object obj, int i10, float f6, float f10) {
        MotionController motionController;
        if ((obj instanceof View) && (motionController = this.f19295a.E0.get((View) obj)) != null) {
            return motionController.e(f6, f10, i10);
        }
        return 0.0f;
    }

    public int getKeyFramePositions(Object obj, int[] iArr, float[] fArr) {
        MotionController motionController = this.f19295a.E0.get((View) obj);
        if (motionController == null) {
            return 0;
        }
        return motionController.getKeyFramePositions(iArr, fArr);
    }

    public Object getKeyframe(int i10, int i11, int i12) {
        MotionLayout motionLayout = this.f19295a;
        MotionScene motionScene = motionLayout.f19431p0;
        if (motionScene == null) {
            return null;
        }
        motionLayout.getContext();
        return motionScene.e(i10, i11, i12);
    }

    public Object getKeyframeAtLocation(Object obj, float f6, float f10) {
        MotionController motionController;
        View view = (View) obj;
        MotionLayout motionLayout = this.f19295a;
        if (motionLayout.f19431p0 == null) {
            return -1;
        }
        if (view == null || (motionController = motionLayout.E0.get(view)) == null) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        int width = viewGroup.getWidth();
        int height = viewGroup.getHeight();
        RectF rectF = new RectF();
        d dVar = motionController.f19393f;
        float f11 = dVar.f19597t0;
        rectF.left = f11;
        float f12 = dVar.f19598u0;
        rectF.top = f12;
        rectF.right = f11 + dVar.v0;
        rectF.bottom = f12 + dVar.f19599w0;
        RectF rectF2 = new RectF();
        d dVar2 = motionController.f19394g;
        float f13 = dVar2.f19597t0;
        rectF2.left = f13;
        float f14 = dVar2.f19598u0;
        rectF2.top = f14;
        rectF2.right = f13 + dVar2.v0;
        rectF2.bottom = f14 + dVar2.f19599w0;
        for (Key key : motionController.f19409w) {
            if (key instanceof a) {
                a aVar = (a) key;
                if (aVar.intersects(width, height, rectF, rectF2, f6, f10)) {
                    return aVar;
                }
            }
        }
        return null;
    }

    public Boolean getPositionKeyframe(Object obj, Object obj2, float f6, float f10, String[] strArr, float[] fArr) {
        if (!(obj instanceof a)) {
            return Boolean.FALSE;
        }
        a aVar = (a) obj;
        MotionLayout motionLayout = this.f19295a;
        View view = (View) obj2;
        MotionController motionController = motionLayout.E0.get(view);
        motionController.getClass();
        RectF rectF = new RectF();
        d dVar = motionController.f19393f;
        float f11 = dVar.f19597t0;
        rectF.left = f11;
        float f12 = dVar.f19598u0;
        rectF.top = f12;
        rectF.right = f11 + dVar.v0;
        rectF.bottom = f12 + dVar.f19599w0;
        RectF rectF2 = new RectF();
        d dVar2 = motionController.f19394g;
        float f13 = dVar2.f19597t0;
        rectF2.left = f13;
        float f14 = dVar2.f19598u0;
        rectF2.top = f14;
        rectF2.right = f13 + dVar2.v0;
        rectF2.bottom = f14 + dVar2.f19599w0;
        aVar.positionAttributes(view, rectF, rectF2, f6, f10, strArr, fArr);
        motionLayout.rebuildScene();
        motionLayout.M0 = true;
        return Boolean.TRUE;
    }

    public float getProgress() {
        return this.f19295a.getProgress();
    }

    public String getStartState() {
        MotionLayout motionLayout = this.f19295a;
        int startState = motionLayout.getStartState();
        if (this.f19298d == startState) {
            return this.f19296b;
        }
        MotionScene motionScene = motionLayout.f19431p0;
        String strLookUpConstraintName = motionScene == null ? null : motionScene.lookUpConstraintName(startState);
        if (strLookUpConstraintName != null) {
            this.f19296b = strLookUpConstraintName;
            this.f19298d = startState;
        }
        MotionScene motionScene2 = motionLayout.f19431p0;
        if (motionScene2 == null) {
            return null;
        }
        return motionScene2.lookUpConstraintName(startState);
    }

    public String getState() {
        if (this.f19296b != null && this.f19297c != null) {
            float progress = getProgress();
            if (progress <= 0.01f) {
                return this.f19296b;
            }
            if (progress >= 0.99f) {
                return this.f19297c;
            }
        }
        return this.f19296b;
    }

    public long getTransitionTimeMs() {
        return this.f19295a.getTransitionTimeMs();
    }

    public boolean isInTransition() {
        return (this.f19296b == null || this.f19297c == null) ? false : true;
    }

    public void setAttributes(int i10, String str, Object obj, Object obj2) {
        View view = (View) obj;
        HashMap map = obj2 instanceof HashMap ? (HashMap) obj2 : new HashMap();
        MotionLayout motionLayout = this.f19295a;
        MotionScene motionScene = motionLayout.f19431p0;
        int iLookUpConstraintId = motionScene == null ? 0 : motionScene.lookUpConstraintId(str);
        ConstraintSet constraintSetB = motionLayout.f19431p0.b(iLookUpConstraintId);
        if (constraintSetB == null) {
            return;
        }
        constraintSetB.clear(view.getId());
        d(i10, constraintSetB, view, map, 0);
        d(i10, constraintSetB, view, map, 1);
        HashMap map2 = map;
        a(i10, constraintSetB, view, map2, 6, 6);
        a(i10, constraintSetB, view, map2, 6, 7);
        a(i10, constraintSetB, view, map2, 7, 7);
        a(i10, constraintSetB, view, map2, 7, 6);
        a(i10, constraintSetB, view, map2, 1, 1);
        a(i10, constraintSetB, view, map2, 1, 2);
        a(i10, constraintSetB, view, map2, 2, 2);
        a(i10, constraintSetB, view, map2, 2, 1);
        a(i10, constraintSetB, view, map2, 3, 3);
        a(i10, constraintSetB, view, map2, 3, 4);
        a(i10, constraintSetB, view, map2, 4, 3);
        a(i10, constraintSetB, view, map2, 4, 4);
        a(i10, constraintSetB, view, map2, 5, 5);
        c(0, view, constraintSetB, map);
        c(1, view, constraintSetB, map);
        String str2 = (String) map.get("layout_editor_absoluteX");
        if (str2 != null) {
            constraintSetB.setEditorAbsoluteX(view.getId(), b(i10, str2));
        }
        String str3 = (String) map.get("layout_editor_absoluteY");
        if (str3 != null) {
            constraintSetB.setEditorAbsoluteY(view.getId(), b(i10, str3));
        }
        motionLayout.updateState(iLookUpConstraintId, constraintSetB);
        motionLayout.requestLayout();
    }

    public void setKeyFrame(Object obj, int i10, String str, Object obj2) {
        MotionLayout motionLayout = this.f19295a;
        MotionScene motionScene = motionLayout.f19431p0;
        if (motionScene != null) {
            motionScene.setKeyframe((View) obj, i10, str, obj2);
            motionLayout.K0 = i10 / 100.0f;
            motionLayout.I0 = 0.0f;
            motionLayout.rebuildScene();
            motionLayout.h(true);
        }
    }

    public boolean setKeyFramePosition(Object obj, int i10, int i11, float f6, float f10) {
        if (!(obj instanceof View)) {
            return false;
        }
        MotionLayout motionLayout = this.f19295a;
        if (motionLayout.f19431p0 != null) {
            MotionController motionController = motionLayout.E0.get(obj);
            int i12 = (int) (motionLayout.H0 * 100.0f);
            if (motionController != null) {
                View view = (View) obj;
                MotionScene.Transition transition = motionLayout.f19431p0.f19487c;
                if (transition != null) {
                    Iterator<KeyFrames> it = transition.f19514k.iterator();
                    while (it.hasNext()) {
                        Iterator<Key> it2 = it.next().getKeyFramesForView(view.getId()).iterator();
                        while (it2.hasNext()) {
                            if (it2.next().f19300a == i12) {
                                float fE = motionController.e(f6, f10, 2);
                                float fE2 = motionController.e(f6, f10, 5);
                                motionLayout.f19431p0.setKeyframe(view, i12, "motion:percentX", Float.valueOf(fE));
                                motionLayout.f19431p0.setKeyframe(view, i12, "motion:percentY", Float.valueOf(fE2));
                                motionLayout.rebuildScene();
                                motionLayout.h(true);
                                motionLayout.invalidate();
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public void setKeyframe(Object obj, String str, Object obj2) {
        if (obj instanceof Key) {
            ((Key) obj).setValue(str, obj2);
            MotionLayout motionLayout = this.f19295a;
            motionLayout.rebuildScene();
            motionLayout.M0 = true;
        }
    }

    public void setState(String str) {
        if (str == null) {
            str = "motion_base";
        }
        if (Objects.equals(this.f19296b, str)) {
            return;
        }
        this.f19296b = str;
        this.f19297c = null;
        MotionLayout motionLayout = this.f19295a;
        if (motionLayout.f19431p0 == null) {
            motionLayout.f19431p0 = null;
        }
        MotionScene motionScene = motionLayout.f19431p0;
        int iLookUpConstraintId = motionScene == null ? 0 : motionScene.lookUpConstraintId(str);
        this.f19298d = iLookUpConstraintId;
        if (iLookUpConstraintId != 0) {
            if (iLookUpConstraintId == motionLayout.getStartState()) {
                motionLayout.setProgress(0.0f);
            } else if (iLookUpConstraintId == motionLayout.getEndState()) {
                motionLayout.setProgress(1.0f);
            } else {
                motionLayout.transitionToState(iLookUpConstraintId);
                motionLayout.setProgress(1.0f);
            }
        }
        motionLayout.requestLayout();
    }

    public void setToolPosition(float f6) {
        MotionLayout motionLayout = this.f19295a;
        if (motionLayout.f19431p0 == null) {
            motionLayout.f19431p0 = null;
        }
        motionLayout.setProgress(f6);
        motionLayout.h(true);
        motionLayout.requestLayout();
        motionLayout.invalidate();
    }

    public void setTransition(String str, String str2) {
        MotionLayout motionLayout = this.f19295a;
        if (motionLayout.f19431p0 == null) {
            motionLayout.f19431p0 = null;
        }
        MotionScene motionScene = motionLayout.f19431p0;
        int iLookUpConstraintId = motionScene == null ? 0 : motionScene.lookUpConstraintId(str);
        MotionScene motionScene2 = motionLayout.f19431p0;
        int iLookUpConstraintId2 = motionScene2 != null ? motionScene2.lookUpConstraintId(str2) : 0;
        motionLayout.setTransition(iLookUpConstraintId, iLookUpConstraintId2);
        this.f19298d = iLookUpConstraintId;
        this.f19299e = iLookUpConstraintId2;
        this.f19296b = str;
        this.f19297c = str2;
    }

    public void setViewDebug(Object obj, int i10) {
        if (obj instanceof View) {
            MotionLayout motionLayout = this.f19295a;
            MotionController motionController = motionLayout.E0.get(obj);
            if (motionController != null) {
                motionController.setDrawPath(i10);
                motionLayout.invalidate();
            }
        }
    }

    public Object getKeyframe(Object obj, int i10, int i11) {
        MotionLayout motionLayout = this.f19295a;
        if (motionLayout.f19431p0 == null) {
            return null;
        }
        int id = ((View) obj).getId();
        MotionScene motionScene = motionLayout.f19431p0;
        motionLayout.getContext();
        return motionScene.e(i10, id, i11);
    }
}
