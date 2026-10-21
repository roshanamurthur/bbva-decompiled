package com.facetec.sdk;

/* JADX INFO: loaded from: classes9.dex */
enum cg {
    HOLD_STEADY(0),
    FACE_NOT_FOUND(1),
    MOVE_FACE_CLOSER(2),
    MOVE_FACE_EVEN_CLOSER(3),
    MOVE_FACE_FURTHER_AWAY(4),
    MOVE_FACE_AWAY_A_LITTLE(5),
    FACE_CENTERED_TOO_FAR_TOP(6),
    FACE_CENTERED_TOO_FAR_BOTTOM(7),
    FACE_CENTERED_TOO_FAR_LEFT(8),
    FACE_CENTERED_TOO_FAR_RIGHT(9),
    FACE_ROTATED_TOO_FAR_LEFT(10),
    FACE_ROTATED_TOO_FAR_RIGHT(11),
    MOVE_PHONE_TO_EYE_LEVEL(12),
    FACE_NOT_LOOKING_STRAIGHT_AHEAD(13),
    FACE_LOOKING_TOO_FAR_LEFT(14),
    FACE_LOOKING_TOO_FAR_RIGHT(15),
    USE_EVEN_LIGHTING(16);


    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final int f40866p;

    cg(int i10) {
        this.f40866p = i10;
    }
}
