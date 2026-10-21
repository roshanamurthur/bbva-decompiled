package androidx.constraintlayout.core.motion.utils;

/* JADX INFO: compiled from: TypedValues.java */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class g {
    public static int a(String str) {
        str.getClass();
        switch (str) {
            case "transitionFlags":
                return TypedValues.TransitionType.TYPE_TRANSITION_FLAGS;
            case "duration":
                return 700;
            case "motionInterpolator":
                return TypedValues.TransitionType.TYPE_INTERPOLATOR;
            case "autoTransition":
                return TypedValues.TransitionType.TYPE_AUTO_TRANSITION;
            case "to":
                return 702;
            case "from":
                return 701;
            case "pathMotionArc":
                return 509;
            case "staggered":
                return TypedValues.TransitionType.TYPE_STAGGERED;
            default:
                return -1;
        }
    }

    public static int b(int i10) {
        if (i10 == 509) {
            return 2;
        }
        switch (i10) {
            case 700:
                return 2;
            case 701:
            case 702:
                return 8;
            default:
                switch (i10) {
                    case TypedValues.TransitionType.TYPE_INTERPOLATOR /* 705 */:
                    case TypedValues.TransitionType.TYPE_TRANSITION_FLAGS /* 707 */:
                        return 8;
                    case TypedValues.TransitionType.TYPE_STAGGERED /* 706 */:
                        return 4;
                    default:
                        return -1;
                }
        }
    }
}
