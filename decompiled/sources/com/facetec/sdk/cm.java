package com.facetec.sdk;

import android.animation.Animator;
import android.content.Context;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.ScaleAnimation;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.StringRes;

/* JADX INFO: loaded from: classes9.dex */
class cm extends LinearLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    cg f40902a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @StringRes
    int f40903b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    TextView f40904c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    ck f40905d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    View f40906e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    Handler f40907f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    boolean f40908g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final b f40909h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    Animator f40910i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    Animator f40911j;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final int f40912l;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private Animation f40913o;

    /* JADX INFO: renamed from: com.facetec.sdk.cm$4, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass4 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f40914a;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        static final /* synthetic */ int[] f40915e;

        static {
            int[] iArr = new int[cg.values().length];
            f40914a = iArr;
            try {
                iArr[cg.HOLD_STEADY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f40914a[cg.FACE_NOT_FOUND.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f40914a[cg.MOVE_FACE_CLOSER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f40914a[cg.MOVE_FACE_EVEN_CLOSER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f40914a[cg.MOVE_FACE_FURTHER_AWAY.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f40914a[cg.MOVE_FACE_AWAY_A_LITTLE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f40914a[cg.FACE_CENTERED_TOO_FAR_TOP.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f40914a[cg.FACE_CENTERED_TOO_FAR_BOTTOM.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f40914a[cg.FACE_CENTERED_TOO_FAR_LEFT.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f40914a[cg.FACE_CENTERED_TOO_FAR_RIGHT.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f40914a[cg.FACE_ROTATED_TOO_FAR_LEFT.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f40914a[cg.FACE_ROTATED_TOO_FAR_RIGHT.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f40914a[cg.MOVE_PHONE_TO_EYE_LEVEL.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f40914a[cg.FACE_LOOKING_TOO_FAR_LEFT.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f40914a[cg.FACE_LOOKING_TOO_FAR_RIGHT.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f40914a[cg.FACE_NOT_LOOKING_STRAIGHT_AHEAD.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f40914a[cg.USE_EVEN_LIGHTING.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            int[] iArr2 = new int[ck.values().length];
            f40915e = iArr2;
            try {
                iArr2[ck.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                f40915e[ck.FRAME_YOUR_FACE.ordinal()] = 2;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f40915e[ck.WEARING_SUNGLASSES.ordinal()] = 3;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                f40915e[ck.BAD_POSE.ordinal()] = 4;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                f40915e[ck.TOO_BRIGHT.ordinal()] = 5;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                f40915e[ck.TOO_DARK.ordinal()] = 6;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                f40915e[ck.MAKING_FACE.ordinal()] = 7;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                f40915e[ck.HOLD_STEADY_3.ordinal()] = 8;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                f40915e[ck.HOLD_STEADY_2.ordinal()] = 9;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                f40915e[ck.HOLD_STEADY_1.ordinal()] = 10;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                f40915e[ck.MOVE_CLOSER.ordinal()] = 11;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                f40915e[ck.MOVE_AWAY.ordinal()] = 12;
            } catch (NoSuchFieldError unused29) {
            }
        }
    }

    public cm(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f40912l = 400;
        this.f40902a = cg.FACE_NOT_FOUND;
        this.f40905d = ck.FRAME_YOUR_FACE;
        this.f40903b = 0;
        this.f40908g = false;
        this.f40909h = new b() { // from class: com.facetec.sdk.q6
            @Override // com.facetec.sdk.b, android.animation.Animator.AnimatorListener
            public final /* synthetic */ void onAnimationCancel(Animator animator) {
                v1.a(this, animator);
            }

            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
                this.f42783a.bb_(animator);
            }

            @Override // com.facetec.sdk.b, android.animation.Animator.AnimatorListener
            public final /* synthetic */ void onAnimationRepeat(Animator animator) {
                v1.b(this, animator);
            }

            @Override // com.facetec.sdk.b, android.animation.Animator.AnimatorListener
            public final /* synthetic */ void onAnimationStart(Animator animator) {
                v1.c(this, animator);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void bb_(Animator animator) {
        dd.bv_(this.f40904c, this.f40903b);
        Animation animation = this.f40913o;
        if (animation != null) {
            animation.cancel();
            this.f40913o = null;
            this.f40904c.setScaleX(1.0f);
            this.f40904c.setScaleY(1.0f);
        }
        this.f40910i.start();
    }

    public final void e() {
        if (this.f40903b == R.string.FaceTec_feedback_move_phone_closer) {
            ScaleAnimation scaleAnimation = new ScaleAnimation(1.0f, 1.15f, 1.0f, 1.15f, 1, 0.5f, 1, 0.5f);
            this.f40913o = scaleAnimation;
            scaleAnimation.setDuration(800L);
            this.f40913o.setRepeatMode(2);
            this.f40913o.setRepeatCount(-1);
            this.f40904c.startAnimation(this.f40913o);
            if (FaceTecSDK.f40106a.vocalGuidanceCustomization.mode == FaceTecVocalGuidanceCustomization.VocalGuidanceMode.FULL_VOCAL_GUIDANCE || FaceTecSDK.f40106a.vocalGuidanceCustomization.mode == FaceTecVocalGuidanceCustomization.VocalGuidanceMode.NO_VOCAL_GUIDANCE) {
                return;
            }
            Handler handler = new Handler();
            this.f40907f = handler;
            handler.postDelayed(new f1(this, 3), 1000L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a() {
        this.f40908g = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(int i10) {
        float y7 = getY();
        setVisibility(0);
        setAlpha(0.0f);
        setY(y7 - (this.f40906e.getHeight() / 2));
        animate().setDuration(i10).alpha(1.0f).y(y7).setListener(null).start();
    }

    public static int d(cg cgVar) {
        boolean zD = dn.d();
        switch (AnonymousClass4.f40914a[cgVar.ordinal()]) {
            case 1:
                return R.string.FaceTec_feedback_hold_steady;
            case 2:
                return zD ? R.string.FaceTec_accessibility_feedback_face_not_on_camera : R.string.FaceTec_feedback_face_not_found;
            case 3:
                return zD ? R.string.FaceTec_accessibility_feedback_move_phone_closer : R.string.FaceTec_feedback_move_phone_closer;
            case 4:
                return zD ? R.string.FaceTec_accessibility_feedback_move_phone_closer : R.string.FaceTec_feedback_move_phone_closer;
            case 5:
                return zD ? R.string.FaceTec_accessibility_feedback_move_phone_away : R.string.FaceTec_feedback_move_phone_away;
            case 6:
                return zD ? R.string.FaceTec_accessibility_feedback_move_phone_away : R.string.FaceTec_feedback_move_phone_away;
            case 7:
                return zD ? R.string.FaceTec_accessibility_feedback_face_too_high : R.string.FaceTec_feedback_center_face;
            case 8:
                return zD ? R.string.FaceTec_accessibility_feedback_face_too_low : R.string.FaceTec_feedback_center_face;
            case 9:
                return zD ? R.string.FaceTec_accessibility_feedback_face_too_far_left : R.string.FaceTec_feedback_center_face;
            case 10:
                return zD ? R.string.FaceTec_accessibility_feedback_face_too_far_right : R.string.FaceTec_feedback_center_face;
            case 11:
                return zD ? R.string.FaceTec_accessibility_feedback_face_rotated_too_far_left : R.string.FaceTec_feedback_face_not_upright;
            case 12:
                return zD ? R.string.FaceTec_accessibility_feedback_face_rotated_too_far_right : R.string.FaceTec_feedback_face_not_upright;
            case 13:
                return zD ? R.string.FaceTec_accessibility_feedback_hold_device_to_eye_level : R.string.FaceTec_feedback_move_phone_to_eye_level;
            case 14:
                return zD ? R.string.FaceTec_accessibility_feedback_face_pointing_too_far_left : R.string.FaceTec_feedback_face_not_looking_straight_ahead;
            case 15:
                return zD ? R.string.FaceTec_accessibility_feedback_face_pointing_too_far_right : R.string.FaceTec_feedback_face_not_looking_straight_ahead;
            case 16:
                return R.string.FaceTec_feedback_face_not_looking_straight_ahead;
            case 17:
                return R.string.FaceTec_feedback_use_even_lighting;
            default:
                return R.string.FaceTec_feedback_face_not_found;
        }
    }

    public final void c() {
        postDelayed(new Runnable() { // from class: com.facetec.sdk.r6
            @Override // java.lang.Runnable
            public final void run() {
                this.f42808p0.b(500);
            }
        }, 50L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b() {
        if (dn.f41289d || this.f40903b != R.string.FaceTec_feedback_move_phone_closer) {
            return;
        }
        dn.a(getContext(), dn.b.FACE_CAPTURE_MOVE_CLOSER_DELAYED);
    }

    public static int b(ck ckVar) {
        switch (AnonymousClass4.f40915e[ckVar.ordinal()]) {
            case 1:
                return R.string.FaceTec_presession_frame_your_face;
            case 2:
                return R.string.FaceTec_presession_frame_your_face;
            case 3:
                return R.string.FaceTec_presession_remove_dark_glasses;
            case 4:
                return R.string.FaceTec_presession_position_face_straight_in_oval;
            case 5:
                return R.string.FaceTec_presession_conditions_too_bright;
            case 6:
                return R.string.FaceTec_presession_brighten_your_environment;
            case 7:
                return R.string.FaceTec_presession_neutral_expression;
            case 8:
                return R.string.FaceTec_presession_hold_steady_3;
            case 9:
                return R.string.FaceTec_presession_hold_steady_2;
            case 10:
                return R.string.FaceTec_presession_hold_steady_1;
            case 11:
                return R.string.FaceTec_feedback_move_phone_closer;
            case 12:
                return R.string.FaceTec_feedback_move_phone_away;
            default:
                return R.string.FaceTec_presession_frame_your_face;
        }
    }

    public final void e(@StringRes int i10) {
        if (this.f40908g || i10 == this.f40903b) {
            return;
        }
        this.f40903b = i10;
        this.f40908g = true;
        dn.c(i10);
        this.f40911j.start();
        postDelayed(new g1(this, 2), 800L);
    }
}
