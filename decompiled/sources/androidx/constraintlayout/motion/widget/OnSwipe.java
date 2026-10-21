package androidx.constraintlayout.motion.widget;

/* JADX INFO: loaded from: classes.dex */
public class OnSwipe {
    public static final int COMPLETE_MODE_CONTINUOUS_VELOCITY = 0;
    public static final int COMPLETE_MODE_SPRING = 1;
    public static final int DRAG_ANTICLOCKWISE = 7;
    public static final int DRAG_CLOCKWISE = 6;
    public static final int DRAG_DOWN = 1;
    public static final int DRAG_END = 5;
    public static final int DRAG_LEFT = 2;
    public static final int DRAG_RIGHT = 3;
    public static final int DRAG_START = 4;
    public static final int DRAG_UP = 0;
    public static final int FLAG_DISABLE_POST_SCROLL = 1;
    public static final int FLAG_DISABLE_SCROLL = 2;
    public static final int ON_UP_AUTOCOMPLETE = 0;
    public static final int ON_UP_AUTOCOMPLETE_TO_END = 2;
    public static final int ON_UP_AUTOCOMPLETE_TO_START = 1;
    public static final int ON_UP_DECELERATE = 4;
    public static final int ON_UP_DECELERATE_AND_COMPLETE = 5;
    public static final int ON_UP_NEVER_TO_END = 7;
    public static final int ON_UP_NEVER_TO_START = 6;
    public static final int ON_UP_STOP = 3;
    public static final int SIDE_BOTTOM = 3;
    public static final int SIDE_END = 6;
    public static final int SIDE_LEFT = 1;
    public static final int SIDE_MIDDLE = 4;
    public static final int SIDE_RIGHT = 2;
    public static final int SIDE_START = 5;
    public static final int SIDE_TOP = 0;
    public static final int SPRING_BOUNDARY_BOUNCEBOTH = 3;
    public static final int SPRING_BOUNDARY_BOUNCEEND = 2;
    public static final int SPRING_BOUNDARY_BOUNCESTART = 1;
    public static final int SPRING_BOUNDARY_OVERSHOOT = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f19525a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f19526b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f19527c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f19528d = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f19529e = -1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f19530f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f19531g = -1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f19532h = 4.0f;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f19533i = 1.2f;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f19534j = true;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float f19535k = 1.0f;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f19536l = 0;
    public float m = 10.0f;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public float f19537n = Float.NaN;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public float f19538o = 1.0f;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public float f19539p = Float.NaN;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public float f19540q = Float.NaN;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f19541r = 0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f19542s = 0;

    public int getAutoCompleteMode() {
        return this.f19542s;
    }

    public int getDragDirection() {
        return this.f19525a;
    }

    public float getDragScale() {
        return this.f19535k;
    }

    public float getDragThreshold() {
        return this.m;
    }

    public int getLimitBoundsTo() {
        return this.f19529e;
    }

    public float getMaxAcceleration() {
        return this.f19533i;
    }

    public float getMaxVelocity() {
        return this.f19532h;
    }

    public boolean getMoveWhenScrollAtTop() {
        return this.f19534j;
    }

    public int getNestedScrollFlags() {
        return this.f19536l;
    }

    public int getOnTouchUp() {
        return this.f19530f;
    }

    public int getRotationCenterId() {
        return this.f19531g;
    }

    public int getSpringBoundary() {
        return this.f19541r;
    }

    public float getSpringDamping() {
        return this.f19537n;
    }

    public float getSpringMass() {
        return this.f19538o;
    }

    public float getSpringStiffness() {
        return this.f19539p;
    }

    public float getSpringStopThreshold() {
        return this.f19540q;
    }

    public int getTouchAnchorId() {
        return this.f19527c;
    }

    public int getTouchAnchorSide() {
        return this.f19526b;
    }

    public int getTouchRegionId() {
        return this.f19528d;
    }

    public void setAutoCompleteMode(int i10) {
        this.f19542s = i10;
    }

    public OnSwipe setDragDirection(int i10) {
        this.f19525a = i10;
        return this;
    }

    public OnSwipe setDragScale(int i10) {
        this.f19535k = i10;
        return this;
    }

    public OnSwipe setDragThreshold(int i10) {
        this.m = i10;
        return this;
    }

    public OnSwipe setLimitBoundsTo(int i10) {
        this.f19529e = i10;
        return this;
    }

    public OnSwipe setMaxAcceleration(int i10) {
        this.f19533i = i10;
        return this;
    }

    public OnSwipe setMaxVelocity(int i10) {
        this.f19532h = i10;
        return this;
    }

    public OnSwipe setMoveWhenScrollAtTop(boolean z10) {
        this.f19534j = z10;
        return this;
    }

    public OnSwipe setNestedScrollFlags(int i10) {
        this.f19536l = i10;
        return this;
    }

    public OnSwipe setOnTouchUp(int i10) {
        this.f19530f = i10;
        return this;
    }

    public OnSwipe setRotateCenter(int i10) {
        this.f19531g = i10;
        return this;
    }

    public OnSwipe setSpringBoundary(int i10) {
        this.f19541r = i10;
        return this;
    }

    public OnSwipe setSpringDamping(float f6) {
        this.f19537n = f6;
        return this;
    }

    public OnSwipe setSpringMass(float f6) {
        this.f19538o = f6;
        return this;
    }

    public OnSwipe setSpringStiffness(float f6) {
        this.f19539p = f6;
        return this;
    }

    public OnSwipe setSpringStopThreshold(float f6) {
        this.f19540q = f6;
        return this;
    }

    public OnSwipe setTouchAnchorId(int i10) {
        this.f19527c = i10;
        return this;
    }

    public OnSwipe setTouchAnchorSide(int i10) {
        this.f19526b = i10;
        return this;
    }

    public OnSwipe setTouchRegionId(int i10) {
        this.f19528d = i10;
        return this;
    }
}
