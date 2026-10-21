package androidx.constraintlayout.core.motion.utils;

/* JADX INFO: compiled from: TypedValues.java */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class f {
    public static int a(String str) {
        str.getClass();
        switch (str) {
            case "transitionEasing":
                return 501;
            case "percentWidth":
                return 503;
            case "percentHeight":
                return 504;
            case "drawPath":
                return 502;
            case "sizePercent":
                return TypedValues.PositionType.TYPE_SIZE_PERCENT;
            case "percentX":
                return TypedValues.PositionType.TYPE_PERCENT_X;
            case "percentY":
                return TypedValues.PositionType.TYPE_PERCENT_Y;
            default:
                return -1;
        }
    }

    public static int b(int i10) {
        if (i10 == 100) {
            return 2;
        }
        if (i10 == 101) {
            return 8;
        }
        switch (i10) {
            case 501:
            case 502:
                return 8;
            case 503:
            case 504:
            case TypedValues.PositionType.TYPE_SIZE_PERCENT /* 505 */:
            case TypedValues.PositionType.TYPE_PERCENT_X /* 506 */:
            case TypedValues.PositionType.TYPE_PERCENT_Y /* 507 */:
                return 4;
            case TypedValues.PositionType.TYPE_CURVE_FIT /* 508 */:
                return 2;
            default:
                return -1;
        }
    }
}
