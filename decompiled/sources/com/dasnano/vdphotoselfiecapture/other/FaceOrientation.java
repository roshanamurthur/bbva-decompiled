package com.dasnano.vdphotoselfiecapture.other;

import com.dasnano.vdphotoselfiecapture.api.model.Parameters;

/* JADX INFO: loaded from: classes9.dex */
public class FaceOrientation {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FaceOrientationState f39685a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f39686b;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class FaceOrientationState {
        private static final /* synthetic */ FaceOrientationState[] $VALUES;
        public static final FaceOrientationState BOTTOM_CENTER;
        public static final FaceOrientationState BOTTOM_LEFT;
        public static final FaceOrientationState BOTTOM_RIGHT;
        public static final FaceOrientationState CENTER_CENTER;
        public static final FaceOrientationState CENTER_CENTER_SMILE;
        public static final FaceOrientationState CENTER_LEFT;
        public static final FaceOrientationState CENTER_RIGHT;
        public static final FaceOrientationState CENTER_UNKNOWN;
        public static final FaceOrientationState DEAD_ZONE;
        public static final FaceOrientationState ERROR_DISTANCES_BASE_UNKNOWN;
        public static final FaceOrientationState ERROR_TOO_FAR;
        public static final FaceOrientationState ERROR_TOO_NEAR;
        public static final FaceOrientationState ERROR_UNKNOWN;
        public static final FaceOrientationState INCLINE_LEFT;
        public static final FaceOrientationState INCLINE_RIGHT;
        public static final FaceOrientationState TOP_CENTER;
        public static final FaceOrientationState TOP_LEFT;
        public static final FaceOrientationState TOP_RIGHT;

        static {
            FaceOrientationState faceOrientationState = new FaceOrientationState("CENTER_UNKNOWN", 0);
            CENTER_UNKNOWN = faceOrientationState;
            FaceOrientationState faceOrientationState2 = new FaceOrientationState("TOP_LEFT", 1);
            TOP_LEFT = faceOrientationState2;
            FaceOrientationState faceOrientationState3 = new FaceOrientationState("TOP_CENTER", 2);
            TOP_CENTER = faceOrientationState3;
            FaceOrientationState faceOrientationState4 = new FaceOrientationState("TOP_RIGHT", 3);
            TOP_RIGHT = faceOrientationState4;
            FaceOrientationState faceOrientationState5 = new FaceOrientationState("CENTER_LEFT", 4);
            CENTER_LEFT = faceOrientationState5;
            FaceOrientationState faceOrientationState6 = new FaceOrientationState("CENTER_CENTER", 5);
            CENTER_CENTER = faceOrientationState6;
            FaceOrientationState faceOrientationState7 = new FaceOrientationState("CENTER_RIGHT", 6);
            CENTER_RIGHT = faceOrientationState7;
            FaceOrientationState faceOrientationState8 = new FaceOrientationState("BOTTOM_LEFT", 7);
            BOTTOM_LEFT = faceOrientationState8;
            FaceOrientationState faceOrientationState9 = new FaceOrientationState("BOTTOM_CENTER", 8);
            BOTTOM_CENTER = faceOrientationState9;
            FaceOrientationState faceOrientationState10 = new FaceOrientationState("BOTTOM_RIGHT", 9);
            BOTTOM_RIGHT = faceOrientationState10;
            FaceOrientationState faceOrientationState11 = new FaceOrientationState("INCLINE_RIGHT", 10);
            INCLINE_RIGHT = faceOrientationState11;
            FaceOrientationState faceOrientationState12 = new FaceOrientationState("INCLINE_LEFT", 11);
            INCLINE_LEFT = faceOrientationState12;
            FaceOrientationState faceOrientationState13 = new FaceOrientationState("CENTER_CENTER_SMILE", 12);
            CENTER_CENTER_SMILE = faceOrientationState13;
            FaceOrientationState faceOrientationState14 = new FaceOrientationState("DEAD_ZONE", 13);
            DEAD_ZONE = faceOrientationState14;
            FaceOrientationState faceOrientationState15 = new FaceOrientationState("ERROR_UNKNOWN", 14);
            ERROR_UNKNOWN = faceOrientationState15;
            FaceOrientationState faceOrientationState16 = new FaceOrientationState("ERROR_TOO_NEAR", 15);
            ERROR_TOO_NEAR = faceOrientationState16;
            FaceOrientationState faceOrientationState17 = new FaceOrientationState("ERROR_TOO_FAR", 16);
            ERROR_TOO_FAR = faceOrientationState17;
            FaceOrientationState faceOrientationState18 = new FaceOrientationState("ERROR_DISTANCES_BASE_UNKNOWN", 17);
            ERROR_DISTANCES_BASE_UNKNOWN = faceOrientationState18;
            $VALUES = new FaceOrientationState[]{faceOrientationState, faceOrientationState2, faceOrientationState3, faceOrientationState4, faceOrientationState5, faceOrientationState6, faceOrientationState7, faceOrientationState8, faceOrientationState9, faceOrientationState10, faceOrientationState11, faceOrientationState12, faceOrientationState13, faceOrientationState14, faceOrientationState15, faceOrientationState16, faceOrientationState17, faceOrientationState18};
        }

        public FaceOrientationState() {
            throw null;
        }

        public static FaceOrientationState valueOf(String str) {
            return (FaceOrientationState) Enum.valueOf(FaceOrientationState.class, str);
        }

        public static FaceOrientationState[] values() {
            return (FaceOrientationState[]) $VALUES.clone();
        }
    }

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f39687a;

        static {
            int[] iArr = new int[FaceOrientationState.values().length];
            f39687a = iArr;
            try {
                iArr[FaceOrientationState.TOP_CENTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f39687a[FaceOrientationState.CENTER_LEFT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f39687a[FaceOrientationState.CENTER_RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f39687a[FaceOrientationState.BOTTOM_CENTER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public FaceOrientation(FaceOrientationState faceOrientationState, int i10) {
        this.f39685a = faceOrientationState;
        this.f39686b = i10;
    }

    public int getCurrentMovementAchievement() {
        return this.f39686b;
    }

    public FaceOrientationState getCurrentOrientation() {
        return this.f39685a;
    }

    public String getCurrentOrientationAsString() {
        int i10 = a.f39687a[this.f39685a.ordinal()];
        if (i10 == 1) {
            return "top";
        }
        if (i10 == 2) {
            return Parameters.DIRECTION.LEFT;
        }
        if (i10 != 3) {
            return i10 != 4 ? "" : "bottom";
        }
        return Parameters.DIRECTION.RIGHT;
    }

    public void setCurrentMovementAchievement(int i10) {
        this.f39686b = i10;
    }
}
