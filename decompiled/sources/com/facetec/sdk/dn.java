package com.facetec.sdk;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.content.Context;
import android.content.SharedPreferences;
import android.media.MediaPlayer;
import android.os.Handler;
import android.speech.tts.TextToSpeech;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import com.bbva.nativesettings.common.Constants;
import com.bbva.tohu.android.product.valkyria.sdk.constants.NotifyProvisionResult;
import java.util.Iterator;

/* JADX INFO: loaded from: classes9.dex */
final class dn {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static MediaPlayer f41286a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static SharedPreferences f41287b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static Object f41288c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static boolean f41289d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static Handler f41290e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static MediaPlayer f41291f = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static MediaPlayer f41292g = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static MediaPlayer f41293h = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static MediaPlayer f41294i = null;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static MediaPlayer f41295j = null;
    private static TextToSpeech m = null;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static int f41296n = 0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static boolean f41297o = false;

    /* JADX INFO: renamed from: com.facetec.sdk.dn$3, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass3 {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        static final /* synthetic */ int[] f41298e;

        static {
            int[] iArr = new int[b.values().length];
            f41298e = iArr;
            try {
                iArr[b.GET_READY_PRESS_BUTTON_TAPPING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f41298e[b.GET_READY_PRESS_BUTTON_DELAYED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f41298e[b.RETRY_PRESS_BUTTON_TAPPING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f41298e[b.GET_READY_FRAME_YOUR_FACE_TAPPING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f41298e[b.GET_READY_FRAME_YOUR_FACE_AUTOMATIC.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f41298e[b.FACE_CAPTURE_UNZOOMED_FRAME_YOUR_FACE_TAPPING.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f41298e[b.FACE_CAPTURE_FRAME_YOUR_FACE_DELAYED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f41298e[b.FACE_CAPTURE_ZOOMED_PLEASE_FRAME_YOUR_FACE_TAPPING.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f41298e[b.FACE_CAPTURE_ZOOMED_MOVE_CLOSER_TAPPING.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f41298e[b.FACE_CAPTURE_MOVE_CLOSER_AUTOMATIC.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f41298e[b.FACE_CAPTURE_MOVE_CLOSER_DELAYED.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f41298e[b.SUCCESS.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f41298e[b.UPLOADING.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f41298e[b.RETRY.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f41298e[b.BLIND_USER_ASSIST_TAP_PROMPT.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f41298e[b.BLIND_USER_ASSIST_FACESCAN_FEEDBACK.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
        }
    }

    public enum b {
        GET_READY_PRESS_BUTTON_TAPPING("GET_READY_PRESS_BUTTON_TAPPING"),
        GET_READY_FRAME_YOUR_FACE_TAPPING("GET_READY_FRAME_YOUR_FACE_TAPPING"),
        GET_READY_PRESS_BUTTON_DELAYED("GET_READY_PRESS_BUTTON_DELAYED"),
        GET_READY_FRAME_YOUR_FACE_AUTOMATIC("GET_READY_FRAME_YOUR_FACE_AUTOMATIC"),
        RETRY_PRESS_BUTTON_TAPPING("RETRY_PRESS_BUTTON_TAPPING"),
        FACE_CAPTURE_UNZOOMED_FRAME_YOUR_FACE_TAPPING("FACE_CAPTURE_UNZOOMED_FRAME_YOUR_FACE_TAPPING"),
        FACE_CAPTURE_FRAME_YOUR_FACE_DELAYED("FACE_CAPTURE_FRAME_YOUR_FACE_DELAYED"),
        FACE_CAPTURE_ZOOMED_MOVE_CLOSER_TAPPING("FACE_CAPTURE_ZOOMED_MOVE_CLOSER_TAPPING"),
        FACE_CAPTURE_ZOOMED_PLEASE_FRAME_YOUR_FACE_TAPPING("FACE_CAPTURE_ZOOMED_PLEASE_FRAME_YOUR_FACE_TAPPING"),
        FACE_CAPTURE_MOVE_CLOSER_AUTOMATIC("FACE_CAPTURE_MOVE_CLOSER_AUTOMATIC"),
        FACE_CAPTURE_MOVE_CLOSER_DELAYED("FACE_CAPTURE_MOVE_CLOSER_DELAYED"),
        BLIND_USER_ASSIST_TAP_PROMPT("BLIND_USER_ASSIST_TAP_PROMPT"),
        BLIND_USER_ASSIST_FACESCAN_FEEDBACK("BLIND_USER_ASSIST_FACESCAN_FEEDBACK"),
        SUCCESS(NotifyProvisionResult.SUCCESS_RESULT),
        UPLOADING("UPLOADING"),
        RETRY("RETRY");


        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final String f41315q;

        b(String str) {
            this.f41315q = str;
        }
    }

    public static void a(Context context, b bVar) {
        if (f41297o || !(ag.f40233d || c() || j() || FaceTecSDK.f40106a.vocalGuidanceCustomization.mode == FaceTecVocalGuidanceCustomization.VocalGuidanceMode.NO_VOCAL_GUIDANCE)) {
            switch (AnonymousClass3.f41298e[bVar.ordinal()]) {
                case 1:
                case 2:
                case 3:
                    bY_(context, f41294i);
                    break;
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                    bY_(context, f41286a);
                    break;
                case 9:
                case 10:
                case 11:
                    bY_(context, f41291f);
                    break;
                case 12:
                    bY_(context, f41295j);
                    break;
                case 13:
                    bY_(context, f41293h);
                    break;
                case 14:
                    bY_(context, f41292g);
                    break;
                case 15:
                    d(context, context.getString(R.string.FaceTec_accessibility_tap_guidance));
                    break;
                case 16:
                    d(context, context.getString(f41296n));
                    break;
            }
            t.d(context, bVar);
        }
    }

    public static void b() {
        TextToSpeech textToSpeech = m;
        if (textToSpeech == null || !textToSpeech.isSpeaking()) {
            return;
        }
        m.stop();
    }

    private static MediaPlayer bX_(Context context, int i10) {
        if (i10 == -1) {
            return null;
        }
        return MediaPlayer.create(context, i10);
    }

    private static void bY_(Context context, MediaPlayer mediaPlayer) throws Throwable {
        if (d()) {
            return;
        }
        try {
            mediaPlayer.start();
        } catch (Throwable th2) {
            t.c(context, e.VG_PLAY_SOUND_ERROR, th2.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean bZ_(be beVar, Context context, View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1) {
            if (beVar.getFragmentManager().findFragmentByTag("PreEnroll") != null) {
                a aVar = ((ba) beVar.getFragmentManager().findFragmentByTag("PreEnroll")).f40460e;
                if (aVar == null || bo.f40683n) {
                    return true;
                }
                if (aVar.isEnabled()) {
                    a(context, b.GET_READY_PRESS_BUTTON_TAPPING);
                } else {
                    a(context, b.FACE_CAPTURE_UNZOOMED_FRAME_YOUR_FACE_TAPPING);
                }
            } else if (beVar.getFragmentManager().findFragmentByTag("RetryZoom") != null) {
                ba baVar = (ba) beVar.getFragmentManager().findFragmentByTag("RetryZoom");
                a aVar2 = baVar.f40460e;
                if (aVar2 == null || cn.f40916k) {
                    return true;
                }
                if (aVar2.isEnabled()) {
                    a(context, b.GET_READY_PRESS_BUTTON_TAPPING);
                } else if (((cn) baVar).f40918n == 1) {
                    a(context, b.FACE_CAPTURE_UNZOOMED_FRAME_YOUR_FACE_TAPPING);
                }
            } else if (beVar.getFragmentManager().findFragmentByTag("Zoom") != null) {
                if (beVar.f40525v != be.c.FACESCAN_SESSION_STARTED) {
                    if (((az) beVar.getFragmentManager().findFragmentByTag("Zoom")).f40417b == ck.FRAME_YOUR_FACE) {
                        a(context, b.FACE_CAPTURE_ZOOMED_PLEASE_FRAME_YOUR_FACE_TAPPING);
                    }
                } else if (ch.h() == cj.ZOOM_CLOSE) {
                    if (ch.p() == cg.MOVE_FACE_CLOSER) {
                        a(context, b.FACE_CAPTURE_ZOOMED_MOVE_CLOSER_TAPPING);
                    } else if (ch.p() != cg.HOLD_STEADY) {
                        a(context, b.FACE_CAPTURE_ZOOMED_PLEASE_FRAME_YOUR_FACE_TAPPING);
                    }
                } else if (ch.h() == cj.ZOOM_FAR && ch.p() != cg.HOLD_STEADY) {
                    a(context, b.FACE_CAPTURE_UNZOOMED_FRAME_YOUR_FACE_TAPPING);
                }
            }
        }
        return true;
    }

    private static boolean c() {
        return f41286a == null || f41291f == null || f41292g == null || f41293h == null || f41295j == null || f41294i == null;
    }

    public static boolean d() {
        return f41297o;
    }

    private static boolean j() {
        return f41286a.isPlaying() || f41291f.isPlaying() || f41292g.isPlaying() || f41293h.isPlaying() || f41295j.isPlaying() || f41294i.isPlaying();
    }

    public static void c(int i10) {
        f41296n = i10;
    }

    public static void d(Context context, String str) {
        try {
            TextToSpeech textToSpeech = m;
            if (textToSpeech != null) {
                textToSpeech.speak(str, 0, null);
            }
        } catch (Throwable th2) {
            t.c(context, e.VG_PLAY_SOUND_ERROR, th2.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void e(int i10) {
    }

    public static void b(Context context) {
        FaceTecVocalGuidanceCustomization faceTecVocalGuidanceCustomization = FaceTecSDK.f40106a.vocalGuidanceCustomization;
        AccessibilityManager accessibilityManager = (AccessibilityManager) context.getApplicationContext().getSystemService(Constants.ACCESSIBILITY);
        if (accessibilityManager != null && accessibilityManager.isEnabled()) {
            Iterator<AccessibilityServiceInfo> it = accessibilityManager.getEnabledAccessibilityServiceList(1).iterator();
            while (it.hasNext()) {
                if (it.next().getId().contains("TalkBackService")) {
                    f41297o = true;
                }
            }
        }
        if (f41297o) {
            ch.X();
            m = new TextToSpeech(context, new s7());
        }
        f41286a = bX_(context, faceTecVocalGuidanceCustomization.pleaseFrameYourFaceInTheOvalSoundFile);
        f41291f = bX_(context, faceTecVocalGuidanceCustomization.pleaseMoveCloserSoundFile);
        f41292g = bX_(context, faceTecVocalGuidanceCustomization.pleaseRetrySoundFile);
        f41293h = bX_(context, faceTecVocalGuidanceCustomization.uploadingSoundFile);
        f41295j = bX_(context, faceTecVocalGuidanceCustomization.facescanSuccessfulSoundFile);
        f41294i = bX_(context, faceTecVocalGuidanceCustomization.pleasePressTheButtonToStartSoundFile);
        if (c()) {
            FaceTecSDK.f40106a.vocalGuidanceCustomization.mode = FaceTecVocalGuidanceCustomization.VocalGuidanceMode.NO_VOCAL_GUIDANCE;
        }
        SharedPreferences sharedPreferences = (SharedPreferences) bg.a(new Object[]{context}, 1435759663, -1435759656, (int) System.currentTimeMillis());
        f41287b = sharedPreferences;
        f41289d = sharedPreferences.getBoolean("facetecMoveCloserSoundHasBeenPlayed", false);
    }

    public static void c(Context context) {
        f41290e = new Handler();
        n6 n6Var = new n6(context, 1);
        if (FaceTecSDK.f40106a.vocalGuidanceCustomization.mode == FaceTecVocalGuidanceCustomization.VocalGuidanceMode.FULL_VOCAL_GUIDANCE) {
            f41290e.postDelayed(n6Var, 4500L);
        } else if (FaceTecSDK.f40106a.vocalGuidanceCustomization.mode == FaceTecVocalGuidanceCustomization.VocalGuidanceMode.MINIMAL_VOCAL_GUIDANCE) {
            f41290e.postDelayed(n6Var, 15000L);
        }
    }

    public static void e() {
        synchronized (f41288c) {
            try {
                Handler handler = f41290e;
                if (handler != null) {
                    handler.removeCallbacksAndMessages(null);
                    f41290e = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static void d(final Context context) {
        final be beVar = (be) context;
        if (FaceTecSDK.f40106a.vocalGuidanceCustomization.mode != FaceTecVocalGuidanceCustomization.VocalGuidanceMode.NO_VOCAL_GUIDANCE) {
            beVar.f40528y.setOnTouchListener(new View.OnTouchListener() { // from class: com.facetec.sdk.t7
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    return dn.bZ_(beVar, context, view, motionEvent);
                }
            });
        }
    }

    public static void a() {
        MediaPlayer mediaPlayer = f41286a;
        if (mediaPlayer != null) {
            mediaPlayer.release();
            f41286a = null;
        }
        MediaPlayer mediaPlayer2 = f41291f;
        if (mediaPlayer2 != null) {
            mediaPlayer2.release();
            f41291f = null;
        }
        MediaPlayer mediaPlayer3 = f41292g;
        if (mediaPlayer3 != null) {
            mediaPlayer3.release();
            f41292g = null;
        }
        MediaPlayer mediaPlayer4 = f41294i;
        if (mediaPlayer4 != null) {
            mediaPlayer4.release();
            f41294i = null;
        }
        MediaPlayer mediaPlayer5 = f41293h;
        if (mediaPlayer5 != null) {
            mediaPlayer5.release();
            f41293h = null;
        }
        MediaPlayer mediaPlayer6 = f41295j;
        if (mediaPlayer6 != null) {
            mediaPlayer6.release();
            f41295j = null;
        }
        if (f41287b != null) {
            f41295j = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(Context context) {
        if (ch.h() == cj.ZOOM_FAR) {
            a(context, b.FACE_CAPTURE_FRAME_YOUR_FACE_DELAYED);
        }
    }
}
