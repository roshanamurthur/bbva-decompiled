package com.facetec.sdk;

import android.app.Activity;
import android.app.Fragment;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.Base64;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.annotation.Nullable;
import androidx.core.view.InputDeviceCompat;
import androidx.core.view.PointerIconCompat;
import com.bbva.ocrcard.command.ScanCommand;
import com.bbva.sl.ar.android.libkeymanagement.exception.ReturnCode;
import com.bbva.sl.ar.core.libmcrypt.exception.ErrorCodes;
import com.bbva.tohu.android.product.valkyria.sdk.payments.paywave.Constants;
import com.esotericsoftware.asm.Opcodes;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.UUID;

/* JADX INFO: loaded from: classes9.dex */
final class t {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static cu f42830a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static int f42831b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static boolean f42832c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static String f42833d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static String f42834e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static /* synthetic */ boolean f42835f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static long f42836g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static long f42837h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static char[] f42838i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static int f42839j;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static int f42840l;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static int f42841n;

    /* JADX INFO: renamed from: com.facetec.sdk.t$2, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass2 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f42842b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        static final /* synthetic */ int[] f42843c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        static final /* synthetic */ int[] f42844e;

        static {
            int[] iArr = new int[cu.values().length];
            f42842b = iArr;
            try {
                iArr[cu.CAMERA_PERMISSION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f42842b[cu.INITIAL_FACE_SCAN_GET_READY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f42842b[cu.FACE_SCAN_ZOOMED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f42842b[cu.FACE_SCAN_UNZOOMED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f42842b[cu.RETRY_SIDE_BY_SIDE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f42842b[cu.RETRY_GET_READY.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f42842b[cu.RESULT_UPLOAD.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f42842b[cu.ID_SCAN_START.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f42842b[cu.NFC_START.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f42842b[cu.RESULT_OCR.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            int[] iArr2 = new int[dt.values().length];
            f42844e = iArr2;
            try {
                iArr2[dt.Unknown.ordinal()] = 1;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f42844e[dt.InvalidMrzKey.ordinal()] = 2;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f42844e[dt.ResponseError.ordinal()] = 3;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f42844e[dt.ConnectionError.ordinal()] = 4;
            } catch (NoSuchFieldError unused14) {
            }
            int[] iArr3 = new int[com.facetec.sdk.e.values().length];
            f42843c = iArr3;
            try {
                iArr3[com.facetec.sdk.e.FACESCAN_CALLBACK_CALLED.ordinal()] = 1;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f42843c[com.facetec.sdk.e.ID_SCAN_CALLBACK_CALLED.ordinal()] = 2;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f42843c[com.facetec.sdk.e.DEVELOPER_USED_FACESCAN_CALLBACK.ordinal()] = 3;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f42843c[com.facetec.sdk.e.DEVELOPER_USED_ID_SCAN_CALLBACK.ordinal()] = 4;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                f42843c[com.facetec.sdk.e.DOCUMENT_TYPE_PRESSED.ordinal()] = 5;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f42843c[com.facetec.sdk.e.FULL_SESSION_START.ordinal()] = 6;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                f42843c[com.facetec.sdk.e.GET_READY_IM_READY_SHOWN_AND_READY.ordinal()] = 7;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                f42843c[com.facetec.sdk.e.GET_READY_IM_READY_PRESSED.ordinal()] = 8;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                f42843c[com.facetec.sdk.e.GET_READY_IM_READY_SHOWN_AND_READY_RETRY.ordinal()] = 9;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                f42843c[com.facetec.sdk.e.GET_READY_IM_READY_PRESSED_RETY.ordinal()] = 10;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                f42843c[com.facetec.sdk.e.CAMERA2_ERROR.ordinal()] = 11;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                f42843c[com.facetec.sdk.e.NON_FATAL_ERROR.ordinal()] = 12;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                f42843c[com.facetec.sdk.e.SEVERE_ERROR.ordinal()] = 13;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                f42843c[com.facetec.sdk.e.VOCAL_GUIDANCE_STARTED.ordinal()] = 14;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                f42843c[com.facetec.sdk.e.CAMERA_LEGACY_ERROR.ordinal()] = 15;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                f42843c[com.facetec.sdk.e.CAMERA_ERROR.ordinal()] = 16;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                f42843c[com.facetec.sdk.e.NFC_ERROR.ordinal()] = 17;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                f42843c[com.facetec.sdk.e.NFC_USER_MOVED_DEVICE.ordinal()] = 18;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                f42843c[com.facetec.sdk.e.DEFINITELY_BUG_IF_SEEN.ordinal()] = 19;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                f42843c[com.facetec.sdk.e.STARTPREVIEW_EXCEPTION.ordinal()] = 20;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                f42843c[com.facetec.sdk.e.UNEXPECTED_NULL.ordinal()] = 21;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                f42843c[com.facetec.sdk.e.EXIT_SCREEN_TYPE.ordinal()] = 22;
            } catch (NoSuchFieldError unused36) {
            }
            try {
                f42843c[com.facetec.sdk.e.EXIT_SCREEN_ELAPSED_TIME.ordinal()] = 23;
            } catch (NoSuchFieldError unused37) {
            }
            try {
                f42843c[com.facetec.sdk.e.SESSION_RESULT_UNEXPECTED_NULL.ordinal()] = 24;
            } catch (NoSuchFieldError unused38) {
            }
            try {
                f42843c[com.facetec.sdk.e.PHOENIX_HANDLER_UNEXPECTED_NULL.ordinal()] = 25;
            } catch (NoSuchFieldError unused39) {
            }
            try {
                f42843c[com.facetec.sdk.e.ROOT_DEVICE_DETECTED.ordinal()] = 26;
            } catch (NoSuchFieldError unused40) {
            }
            try {
                f42843c[com.facetec.sdk.e.DEVICE_SYSTEM_PROPERTY_ANNOTATION_ERROR.ordinal()] = 27;
            } catch (NoSuchFieldError unused41) {
            }
            try {
                f42843c[com.facetec.sdk.e.CANCEL_BUTTON_RESOURCE_ID_ERROR.ordinal()] = 28;
            } catch (NoSuchFieldError unused42) {
            }
            try {
                f42843c[com.facetec.sdk.e.LOW_MEMORY_ERROR.ordinal()] = 29;
            } catch (NoSuchFieldError unused43) {
            }
            try {
                f42843c[com.facetec.sdk.e.LOW_MEMORY_WARNING.ordinal()] = 30;
            } catch (NoSuchFieldError unused44) {
            }
            try {
                f42843c[com.facetec.sdk.e.CAMERA_ALREADY_CLOSED.ordinal()] = 31;
            } catch (NoSuchFieldError unused45) {
            }
            try {
                f42843c[com.facetec.sdk.e.F2F_ERROR.ordinal()] = 32;
            } catch (NoSuchFieldError unused46) {
            }
            try {
                f42843c[com.facetec.sdk.e.IMAGE_DATA_UNEXPECTED_NULL.ordinal()] = 33;
            } catch (NoSuchFieldError unused47) {
            }
            try {
                f42843c[com.facetec.sdk.e.ON_RESUME_ERROR.ordinal()] = 34;
            } catch (NoSuchFieldError unused48) {
            }
            try {
                f42843c[com.facetec.sdk.e.UNEXPECTED_EARLY_EXIT_FACESCAN.ordinal()] = 35;
            } catch (NoSuchFieldError unused49) {
            }
            try {
                f42843c[com.facetec.sdk.e.UNEXPECTED_EARLY_EXIT_IDSCAN.ordinal()] = 36;
            } catch (NoSuchFieldError unused50) {
            }
            try {
                f42843c[com.facetec.sdk.e.SCAN_RESULT_BLOB_DECODE_ERROR.ordinal()] = 37;
            } catch (NoSuchFieldError unused51) {
            }
            try {
                f42843c[com.facetec.sdk.e.ASYNC_FACE_SCAN_SUCCESS_TASK_ERROR.ordinal()] = 38;
            } catch (NoSuchFieldError unused52) {
            }
            try {
                f42843c[com.facetec.sdk.e.LOG_SUCCESSFUL_ENROLLMENT_ERROR.ordinal()] = 39;
            } catch (NoSuchFieldError unused53) {
            }
            try {
                f42843c[com.facetec.sdk.e.VG_PLAY_SOUND_ERROR.ordinal()] = 40;
            } catch (NoSuchFieldError unused54) {
            }
            try {
                f42843c[com.facetec.sdk.e.VG_TEXT_TO_SPEECH_ERROR.ordinal()] = 41;
            } catch (NoSuchFieldError unused55) {
            }
            try {
                f42843c[com.facetec.sdk.e.UNEXPECTED_HOOK_CHECK_ERROR.ordinal()] = 42;
            } catch (NoSuchFieldError unused56) {
            }
            try {
                f42843c[com.facetec.sdk.e.ID_SCAN_BACK_CAMERA_TAKEPHOTO_API_RESOLUTION.ordinal()] = 43;
            } catch (NoSuchFieldError unused57) {
            }
            try {
                f42843c[com.facetec.sdk.e.ID_SCAN_BACK_CAMERA_TAKEPHOTO_API_ELAPSED_TIME.ordinal()] = 44;
            } catch (NoSuchFieldError unused58) {
            }
        }
    }

    public enum b {
        USER_CANCELLED,
        USER_FAILED,
        USER_WAS_SUCCESSFUL,
        PRE_SESSION_PHASE_1_TIMEOUT,
        PRE_SESSION_PHASE_2_TIMEOUT,
        SESSION_TIMEOUT,
        SESSION_CONTEXT_SWITCH,
        WAYPOINT_UPLOAD
    }

    public static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        String f42855a;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f42856d;

        private d() {
        }

        public /* synthetic */ d(byte b10) {
            this();
        }
    }

    public static class e extends at.b {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Context f42857c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final m f42858e;

        public e(Context context, m mVar) {
            this.f42857c = context.getApplicationContext();
            this.f42858e = mVar;
        }

        @Override // com.facetec.sdk.at.b
        public final void d(boolean z10) {
            m mVar = this.f42858e;
            int i10 = mVar.f42390i + 1;
            mVar.f42390i = i10;
            if (i10 < 3) {
                t.c(this.f42857c, z10, mVar);
            } else {
                if (z10) {
                    return;
                }
                t.c(this.f42857c, mVar);
            }
        }

        @Override // com.facetec.sdk.at.b
        public final void e() throws Throwable {
            t.e(new Object[]{this.f42857c}, -1334501404, 1334501406, (int) System.currentTimeMillis());
        }
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        f42841n = 0;
        f42840l = 1;
        e();
        a();
        KeyEvent.getModifierMetaStateMask();
        ViewConfiguration.getGlobalActionKeyTimeout();
        View.MeasureSpec.getMode(0);
        int i10 = f42841n + 7;
        f42840l = i10 % 128;
        int i11 = i10 % 2;
        f42835f = true;
        f42830a = cu.CAMERA_PERMISSION;
        f42836g = 0L;
        f42833d = "";
        f42834e = ak.f40298p;
        f42832c = false;
        f42831b = 0;
        int i12 = f42841n + 79;
        f42840l = i12 % 128;
        if (i12 % 2 == 0) {
            int i13 = 30 / 0;
        }
    }

    public static /* synthetic */ Object e(Object[] objArr, int i10, int i11, int i12) throws Throwable {
        String strIntern;
        int i13;
        int i14 = ~i10;
        int i15 = ~i12;
        int i16 = ~(i14 | i15);
        int i17 = ~i11;
        int i18 = i14 | i17;
        int i19 = (((~(i10 | i17 | i12)) | (~(i11 | i14 | i12)) | (~(i18 | i15))) * 867) + (((~i18) | (~(i14 | i12)) | (~(i17 | i12))) * (-1734)) + ((i16 | (~(i17 | i15))) * (-867)) + (i11 * 868) + (i10 * 868);
        if (i19 == 1) {
            Context context = (Context) objArr[0];
            int i20 = f42841n;
            int i21 = i20 + 63;
            f42840l = i21 % 128;
            int i22 = i21 % 2;
            if (!f42835f) {
                int i23 = i20 + 93;
                f42840l = i23 % 128;
                int i24 = i23 % 2;
                if (context == null) {
                    throw new AssertionError();
                }
            }
            Context applicationContext = context.getApplicationContext();
            m mVarA = a(applicationContext);
            if (mVarA != null) {
                int i25 = f42841n + 19;
                f42840l = i25 % 128;
                int i26 = i25 % 2;
                e(applicationContext, true, mVarA);
            }
            return null;
        }
        if (i19 == 2) {
            return a(objArr);
        }
        if (i19 != 3) {
            return i19 != 4 ? e(objArr) : c(objArr);
        }
        cu cuVar = (cu) objArr[0];
        int i27 = f42840l + 121;
        f42841n = i27 % 128;
        int i28 = i27 % 2;
        switch (AnonymousClass2.f42842b[cuVar.ordinal()]) {
            case 1:
                Object[] objArr2 = new Object[1];
                k((char) (48930 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1))), 373 - Color.green(0), 15 - TextUtils.indexOf((CharSequence) "", '0'), objArr2);
                strIntern = ((String) objArr2[0]).intern();
                i13 = f42840l + 123;
                f42841n = i13 % 128;
                int i29 = i13 % 2;
                return strIntern;
            case 2:
                Object[] objArr3 = new Object[1];
                k((char) (ViewConfiguration.getTapTimeout() >> 16), 390 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), 23 - (Process.myPid() >> 22), objArr3);
                return ((String) objArr3[0]).intern();
            case 3:
                Object[] objArr4 = new Object[1];
                k((char) (44162 - ((Process.getThreadPriority(0) + 20) >> 6)), 411 - ImageFormat.getBitsPerPixel(0), ImageFormat.getBitsPerPixel(0) + 15, objArr4);
                strIntern = ((String) objArr4[0]).intern();
                i13 = f42840l + 47;
                f42841n = i13 % 128;
                int i210 = i13 % 2;
                return strIntern;
            case 4:
                Object[] objArr5 = new Object[1];
                k((char) (26796 - (KeyEvent.getMaxKeyCode() >> 16)), 425 - ExpandableListView.getPackedPositionChild(0L), TextUtils.getOffsetAfter("", 0) + 16, objArr5);
                return ((String) objArr5[0]).intern();
            case 5:
                Object[] objArr6 = new Object[1];
                k((char) ((-16760928) - Color.rgb(0, 0, 0)), 442 - (ViewConfiguration.getPressedStateDuration() >> 16), 15 - ExpandableListView.getPackedPositionGroup(0L), objArr6);
                strIntern = ((String) objArr6[0]).intern();
                i13 = f42841n + 9;
                f42840l = i13 % 128;
                int i211 = i13 % 2;
                return strIntern;
            case 6:
                Object[] objArr7 = new Object[1];
                k((char) (Color.alpha(0) + 61241), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 458, ExpandableListView.getPackedPositionGroup(0L) + 13, objArr7);
                return ((String) objArr7[0]).intern();
            case 7:
                Object[] objArr8 = new Object[1];
                k((char) (5448 - View.resolveSize(0, 0)), Process.getGidForName("") + 471, 12 - View.getDefaultSize(0, 0), objArr8);
                return ((String) objArr8[0]).intern();
            case 8:
                Object[] objArr9 = new Object[1];
                k((char) Color.argb(0, 0, 0, 0), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 482, TextUtils.lastIndexOf("", '0', 0) + 12, objArr9);
                return ((String) objArr9[0]).intern();
            case 9:
                Object[] objArr10 = new Object[1];
                k((char) (ViewConfiguration.getTapTimeout() >> 16), 493 - TextUtils.indexOf("", "", 0, 0), KeyEvent.getDeadChar(0, 0) + 8, objArr10);
                return ((String) objArr10[0]).intern();
            case 10:
                Object[] objArr11 = new Object[1];
                k((char) View.getDefaultSize(0, 0), ExpandableListView.getPackedPositionType(0L) + 501, 9 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), objArr11);
                return ((String) objArr11[0]).intern();
            default:
                return "";
        }
    }

    public static void init$0() {
        $$a = new byte[]{81, Constants.CVR_B2b87_11_RFU, -34, -26};
        $$b = 160;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:39:0x01d1  */
    private static void k(char c10, int i10, int i11, Object[] objArr) throws Throwable {
        Throwable cause;
        gt gtVar = new gt();
        long[] jArr = new long[i11];
        gtVar.f41826d = 0;
        while (true) {
            int i12 = gtVar.f41826d;
            if (i12 >= i11) {
                break;
            }
            int i13 = $11 + 9;
            $10 = i13 % 128;
            int i14 = i13 % 2;
            try {
                Object[] objArr2 = {Integer.valueOf(f42838i[i10 + i12])};
                Map map = bp.f40694x;
                Object method = map.get(-167668390);
                if (method == null) {
                    method = ((Class) bp.a((KeyEvent.getMaxKeyCode() >> 16) + 24, 245 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), (char) (ViewConfiguration.getMaximumFlingVelocity() >> 16))).getMethod("d", Integer.TYPE);
                    map.put(-167668390, method);
                }
                Object[] objArr3 = {Long.valueOf(((Long) ((Method) method).invoke(null, objArr2)).longValue()), Long.valueOf(gtVar.f41826d), Long.valueOf(f42837h), Integer.valueOf(c10)};
                Object method2 = map.get(-1565725271);
                if (method2 == null) {
                    Class cls = (Class) bp.a(24 - TextUtils.indexOf("", "", 0, 0), 1672 - (ViewConfiguration.getFadingEdgeLength() >> 16), (char) (58390 - (ViewConfiguration.getKeyRepeatDelay() >> 16)));
                    byte b10 = (byte) 0;
                    Object[] objArr4 = new Object[1];
                    o(b10, (byte) (b10 | 7), (byte) (-1), objArr4);
                    String str = (String) objArr4[0];
                    Class<?> cls2 = Long.TYPE;
                    method2 = cls.getMethod(str, cls2, cls2, cls2, Integer.TYPE);
                    map.put(-1565725271, method2);
                }
                jArr[i12] = ((Long) ((Method) method2).invoke(null, objArr3)).longValue();
                Object[] objArr5 = {gtVar, gtVar};
                Object method3 = map.get(453950717);
                if (method3 == null) {
                    method3 = ((Class) bp.a(ExpandableListView.getPackedPositionChild(0L) + 25, 268 - TextUtils.lastIndexOf("", '0'), (char) (25686 - Color.green(0)))).getMethod("b", Object.class, Object.class);
                    map.put(453950717, method3);
                }
                ((Method) method3).invoke(null, objArr5);
            } catch (Throwable th2) {
                cause = th2.getCause();
                if (cause != null) {
                    throw th2;
                }
                throw cause;
            }
            cause = th2.getCause();
            if (cause != null) {
                throw th2;
            }
            throw cause;
        }
        char[] cArr = new char[i11];
        gtVar.f41826d = 0;
        while (true) {
            int i15 = gtVar.f41826d;
            if (i15 >= i11) {
                objArr[0] = new String(cArr);
                return;
            }
            int i16 = $11 + 33;
            $10 = i16 % 128;
            int i17 = i16 % 2;
            cArr[i15] = (char) jArr[i15];
            Object[] objArr6 = {gtVar, gtVar};
            Map map2 = bp.f40694x;
            Object method4 = map2.get(453950717);
            if (method4 == null) {
                method4 = ((Class) bp.a((ViewConfiguration.getPressedStateDuration() >> 16) + 24, (ViewConfiguration.getEdgeSlop() >> 16) + 269, (char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 25687))).getMethod("b", Object.class, Object.class);
                map2.put(453950717, method4);
            }
            ((Method) method4).invoke(null, objArr6);
        }
    }

    /* JADX WARN: Code duplicated, block: B:39:0x0199  */
    /* JADX WARN: Code duplicated, block: B:40:0x019a  */
    private static void m(int i10, int i11, int i12, String str, boolean z10, Object[] objArr) throws Throwable {
        Throwable cause;
        char[] charArray = str != null ? str.toCharArray() : str;
        gz gzVar = new gz();
        char[] cArr = new char[i12];
        gzVar.f41846c = 0;
        while (true) {
            int i13 = gzVar.f41846c;
            if (i13 >= i12) {
                break;
            }
            char c10 = charArray[i13];
            gzVar.f41844a = c10;
            char c11 = (char) (i10 + c10);
            cArr[i13] = c11;
            try {
                Object[] objArr2 = {Integer.valueOf(c11), Integer.valueOf(f42839j)};
                Map map = bp.f40694x;
                Object method = map.get(1917901234);
                if (method == null) {
                    Class cls = (Class) bp.a(23 - TextUtils.getTrimmedLength(""), (ViewConfiguration.getWindowTouchSlop() >> 8) + InputDeviceCompat.SOURCE_GAMEPAD, (char) (38453 - Color.argb(0, 0, 0, 0)));
                    byte b10 = (byte) 0;
                    Object[] objArr3 = new Object[1];
                    o(b10, (byte) (b10 + 5), (byte) (-1), objArr3);
                    String str2 = (String) objArr3[0];
                    Class<?> cls2 = Integer.TYPE;
                    method = cls.getMethod(str2, cls2, cls2);
                    map.put(1917901234, method);
                }
                cArr[i13] = ((Character) ((Method) method).invoke(null, objArr2)).charValue();
                Object[] objArr4 = {gzVar, gzVar};
                Object method2 = map.get(-1709307603);
                if (method2 == null) {
                    Class cls3 = (Class) bp.a(24 - (ViewConfiguration.getScrollDefaultDelay() >> 16), 766 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (char) (36773 - (ViewConfiguration.getEdgeSlop() >> 16)));
                    byte b11 = (byte) 0;
                    byte b12 = b11;
                    Object[] objArr5 = new Object[1];
                    o(b11, b12, (byte) (b12 - 1), objArr5);
                    method2 = cls3.getMethod((String) objArr5[0], Object.class, Object.class);
                    map.put(-1709307603, method2);
                }
                ((Method) method2).invoke(null, objArr4);
            } catch (Throwable th2) {
                cause = th2.getCause();
                if (cause != null) {
                    throw th2;
                }
                throw cause;
            }
            cause = th2.getCause();
            if (cause != null) {
                throw th2;
            }
            throw cause;
        }
        if (i11 > 0) {
            gzVar.f41845b = i11;
            char[] cArr2 = new char[i12];
            System.arraycopy(cArr, 0, cArr2, 0, i12);
            int i14 = gzVar.f41845b;
            System.arraycopy(cArr2, 0, cArr, i12 - i14, i14);
            int i15 = gzVar.f41845b;
            System.arraycopy(cArr2, i15, cArr, 0, i12 - i15);
        }
        if (z10) {
            char[] cArr3 = new char[i12];
            gzVar.f41846c = 0;
            while (true) {
                int i16 = gzVar.f41846c;
                if (i16 >= i12) {
                    break;
                }
                cArr3[i16] = cArr[(i12 - i16) - 1];
                Object[] objArr6 = {gzVar, gzVar};
                Map map2 = bp.f40694x;
                Object method3 = map2.get(-1709307603);
                if (method3 == null) {
                    Class cls4 = (Class) bp.a(24 - KeyEvent.getDeadChar(0, 0), (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 764, (char) (36772 - TextUtils.lastIndexOf("", '0')));
                    byte b13 = (byte) 0;
                    byte b14 = b13;
                    Object[] objArr7 = new Object[1];
                    o(b13, b14, (byte) (b14 - 1), objArr7);
                    method3 = cls4.getMethod((String) objArr7[0], Object.class, Object.class);
                    map2.put(-1709307603, method3);
                }
                ((Method) method3).invoke(null, objArr6);
            }
            cArr = cArr3;
        }
        objArr[0] = new String(cArr);
    }

    private static Bitmap m_(Bitmap bitmap, float f6) {
        Matrix matrix = new Matrix();
        matrix.postRotate(f6);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
        int i10 = f42840l + 21;
        f42841n = i10 % 128;
        if (i10 % 2 == 0) {
            return bitmapCreateBitmap;
        }
        throw null;
    }

    private static void o(int i10, short s4, byte b10, Object[] objArr) {
        int i11 = b10 + 4;
        byte[] bArr = $$a;
        int i12 = 106 - s4;
        int i13 = i10 * 3;
        byte[] bArr2 = new byte[i13 + 1];
        int i14 = -1;
        if (bArr == null) {
            i12 += -i11;
            i11 = i11;
            objArr = objArr;
            bArr = bArr;
            bArr2 = bArr2;
            i14 = -1;
        }
        while (true) {
            int i15 = i14 + 1;
            bArr2[i15] = (byte) i12;
            if (i15 == i13) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            int i16 = i11 + 1;
            Object[] objArr2 = objArr;
            byte[] bArr3 = bArr2;
            byte[] bArr4 = bArr;
            i12 += -bArr[i16];
            i11 = i16;
            objArr = objArr2;
            bArr = bArr4;
            bArr2 = bArr3;
            i14 = i15;
        }
    }

    private static String a(dt dtVar) throws Throwable {
        int i10 = f42840l + 99;
        f42841n = i10 % 128;
        int i11 = i10 % 2;
        int i12 = AnonymousClass2.f42844e[dtVar.ordinal()];
        if (i12 == 1) {
            Object[] objArr = new Object[1];
            k((char) (ExpandableListView.getPackedPositionChild(0L) + 1), (ViewConfiguration.getTapTimeout() >> 16) + 112, 7 - (Process.myTid() >> 22), objArr);
            return ((String) objArr[0]).intern();
        }
        if (i12 == 2) {
            Object[] objArr2 = new Object[1];
            k((char) (1 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 118, TextUtils.lastIndexOf("", '0', 0) + 14, objArr2);
            String strIntern = ((String) objArr2[0]).intern();
            int i13 = f42840l + 61;
            f42841n = i13 % 128;
            if (i13 % 2 == 0) {
                return strIntern;
            }
            throw null;
        }
        if (i12 != 3) {
            if (i12 != 4) {
                return "";
            }
            Object[] objArr3 = new Object[1];
            k((char) ((Process.myTid() >> 22) + 53701), 146 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), 15 - (ViewConfiguration.getDoubleTapTimeout() >> 16), objArr3);
            return ((String) objArr3[0]).intern();
        }
        Object[] objArr4 = new Object[1];
        k((char) (TextUtils.lastIndexOf("", '0') + 1), 132 - Color.green(0), 13 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr4);
        return ((String) objArr4[0]).intern();
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x003a, code lost:
    
        if (r0 != 5) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0040, code lost:
    
        return c(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0041, code lost:
    
        r2 = new java.lang.Object[1];
        k((char) (57638 - android.view.View.combineMeasuredStates(0, 0)), 70 - (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16), 13 - (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0067, code lost:
    
        return ((java.lang.String) r2[0]).intern();
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0027, code lost:
    
        if (r0 != 5) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String b(com.facetec.sdk.e r10) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 262
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facetec.sdk.t.b(com.facetec.sdk.e):java.lang.String");
    }

    public static /* synthetic */ void c(Context context, m mVar) {
        int i10 = f42840l + 65;
        f42841n = i10 % 128;
        int i11 = i10 % 2;
        a(context, mVar);
        int i12 = f42840l + 47;
        f42841n = i12 % 128;
        if (i12 % 2 != 0) {
            int i13 = 6 / 0;
        }
    }

    public static void d(Context context, dn.b bVar) throws Throwable {
        eh ehVar = new eh();
        Object[] objArr = new Object[1];
        k((char) View.MeasureSpec.makeMeasureSpec(0, 0), 82 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), 14 - View.resolveSize(0, 0), objArr);
        ehVar.a(((String) objArr[0]).intern(), bVar.f41315q);
        Object[] objArr2 = new Object[1];
        k((char) (TextUtils.lastIndexOf("", '0') + 22361), Color.green(0) + 96, Drawable.resolveOpacity(0, 0) + 11, objArr2);
        ehVar.a(((String) objArr2[0]).intern(), FaceTecSDK.f40106a.vocalGuidanceCustomization.mode.toString());
        e(context, com.facetec.sdk.e.VOCAL_GUIDANCE_STARTED, ehVar);
        int i10 = f42841n + 15;
        f42840l = i10 % 128;
        if (i10 % 2 == 0) {
            throw null;
        }
    }

    public static /* synthetic */ void c(Context context, boolean z10, m mVar) {
        int i10 = f42840l + 67;
        f42841n = i10 % 128;
        int i11 = i10 % 2;
        e(context, z10, mVar);
        int i12 = f42841n + 71;
        f42840l = i12 % 128;
        int i13 = i12 % 2;
    }

    public static void c(Context context, com.facetec.sdk.e eVar, @Nullable String str) throws Throwable {
        int i10 = f42841n + 85;
        f42840l = i10 % 128;
        eh ehVar = null;
        if (i10 % 2 != 0) {
            if (bg.d()) {
                if (str != null) {
                    ehVar = new eh();
                    ehVar.a(b(eVar), str);
                    int i11 = f42840l + 87;
                    f42841n = i11 % 128;
                    int i12 = i11 % 2;
                }
                e(context, eVar, ehVar);
                return;
            }
            return;
        }
        bg.d();
        throw null;
    }

    private static /* synthetic */ Object a(Object[] objArr) {
        Context context = (Context) objArr[0];
        int i10 = f42840l + 1;
        f42841n = i10 % 128;
        int i11 = i10 % 2;
        cx.b(new b1(context, 3));
        int i12 = f42841n + 39;
        f42840l = i12 % 128;
        if (i12 % 2 != 0) {
            return null;
        }
        throw null;
    }

    public static void d(Context context, b bVar) throws Throwable {
        int i10 = f42841n + 11;
        f42840l = i10 % 128;
        int i11 = i10 % 2;
        if (bVar != b.USER_WAS_SUCCESSFUL) {
            int i12 = f42841n + 19;
            f42840l = i12 % 128;
            int i13 = i12 % 2;
            try {
                Object[] objArr = new Object[1];
                m(220 - Process.getGidForName(""), KeyEvent.normalizeMetaState(0) + 15, 15 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), "\uffff\u0014\uffffￌ\n\uffff\f\u0005ￌ\ufff1\u0017\u0011\u0012\u0003\u000b\b", false, objArr);
                Class<?> cls = Class.forName((String) objArr[0]);
                Object[] objArr2 = new Object[1];
                m((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 229, (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 3, 17 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), "\t\f\ufffa\n\u0000\u0003\u0003\u0000￤￼\u0004\u0000￫\u000b\u0005￼\t", true, objArr2);
                double dLongValue = (((Long) cls.getMethod((String) objArr2[0], null).invoke(null, null)).longValue() - f42836g) / 1000.0d;
                c(context, com.facetec.sdk.e.EXIT_SCREEN_TYPE, (String) e(new Object[]{f42830a}, 235000786, -235000783, (int) System.currentTimeMillis()));
                c(context, com.facetec.sdk.e.EXIT_SCREEN_ELAPSED_TIME, String.valueOf(dLongValue));
            } catch (Throwable th2) {
                Throwable cause = th2.getCause();
                if (cause == null) {
                    throw th2;
                }
                throw cause;
            }
        }
    }

    public static void b(Context context, an anVar, boolean z10, bj.c cVar, String str) throws Throwable {
        boolean zBooleanValue;
        String strIntern;
        byte[][] bArrY;
        if (context != null) {
            int i10 = f42840l + 33;
            f42841n = i10 % 128;
            boolean z11 = true;
            byte b10 = 0;
            if (i10 % 2 != 0) {
                int i11 = 56 / 0;
                if (!b()) {
                    return;
                }
            } else if (!b()) {
                return;
            }
            if (anVar == null) {
                return;
            }
            int i12 = anVar.f40333a;
            int i13 = anVar.f40334c;
            eh ehVar = new eh();
            char c10 = '0';
            if (z10) {
                try {
                    zBooleanValue = ag.d(context).booleanValue();
                } catch (am e5) {
                    e5.printStackTrace();
                    com.facetec.sdk.e eVar = com.facetec.sdk.e.CAMERA_ERROR;
                    StringBuilder sb2 = new StringBuilder();
                    Object[] objArr = new Object[1];
                    k((char) (ViewConfiguration.getTapTimeout() >> 16), 160 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), (ViewConfiguration.getEdgeSlop() >> 16) + 38, objArr);
                    sb2.append(((String) objArr[0]).intern());
                    sb2.append(e5.toString());
                    c(context, eVar, sb2.toString());
                    zBooleanValue = true;
                }
                Object[] objArr2 = new Object[1];
                k((char) (55498 - KeyEvent.normalizeMetaState(0)), TextUtils.lastIndexOf("", '0', 0) + Opcodes.IFNONNULL, TextUtils.getOffsetBefore("", 0) + 5, objArr2);
                strIntern = ((String) objArr2[0]).intern();
                bArrY = ch.Y(zBooleanValue, i12, i13);
                int i14 = f42841n + 55;
                f42840l = i14 % 128;
                int i15 = i14 % 2;
            } else {
                i12 = anVar.f40334c;
                i13 = anVar.f40333a;
                Object[] objArr3 = new Object[1];
                k((char) TextUtils.getCapsMode("", 0, 0), (ViewConfiguration.getFadingEdgeLength() >> 16) + 203, (ViewConfiguration.getKeyRepeatDelay() >> 16) + 11, objArr3);
                strIntern = ((String) objArr3[0]).intern();
                if (cVar == bj.c.FRONT) {
                    int i16 = f42841n + 47;
                    f42840l = i16 % 128;
                    if (i16 % 2 == 0) {
                        ch.r();
                        throw null;
                    }
                    bArrY = ch.r();
                } else {
                    bArrY = ch.q();
                }
            }
            if (bArrY.length == 0) {
                return;
            }
            if (!f42835f) {
                int i17 = f42841n + 121;
                f42840l = i17 % 128;
                int i18 = i17 % 2;
                if (bArrY[0].length != ((i12 * i13) << 2)) {
                    throw new AssertionError();
                }
            }
            Object[] objArr4 = new Object[1];
            k((char) (ViewConfiguration.getLongPressTimeout() >> 16), TextUtils.indexOf("", "") + ErrorCodes.ERR_CRY_PROPERTIES_KEYTAG_NOT_FOUND, 2 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), objArr4);
            String strIntern2 = ((String) objArr4[0]).intern();
            Object[] objArr5 = new Object[1];
            k((char) (View.combineMeasuredStates(0, 0) + 60135), 215 - ImageFormat.getBitsPerPixel(0), 2 - (ViewConfiguration.getScrollDefaultDelay() >> 16), objArr5);
            ehVar.a(strIntern2, ((String) objArr5[0]).intern());
            Object[] objArr6 = new Object[1];
            k((char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 60548), 218 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), Drawable.resolveOpacity(0, 0) + 9, objArr6);
            ehVar.a(((String) objArr6[0]).intern(), strIntern);
            Object[] objArr7 = new Object[1];
            k((char) ((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 38969), TextUtils.indexOf("", "", 0) + 227, (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 14, objArr7);
            ehVar.a(((String) objArr7[0]).intern(), bg.b(context, false));
            Object[] objArr8 = new Object[1];
            k((char) (25096 - TextUtils.indexOf((CharSequence) "", '0', 0)), 240 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), 12 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr8);
            ehVar.a(((String) objArr8[0]).intern(), str);
            eh ehVar2 = new eh();
            Object[] objArr9 = new Object[1];
            k((char) (40180 - View.MeasureSpec.getSize(0)), 252 - MotionEvent.axisFromString(""), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), objArr9);
            ehVar2.a(((String) objArr9[0]).intern(), Integer.valueOf(i12));
            Object[] objArr10 = new Object[1];
            k((char) ((ViewConfiguration.getScrollDefaultDelay() >> 16) + 11349), 254 - Color.blue(0), 1 - KeyEvent.getDeadChar(0, 0), objArr10);
            ehVar2.a(((String) objArr10[0]).intern(), Integer.valueOf(i13));
            Object[] objArr11 = new Object[1];
            k((char) (View.MeasureSpec.getSize(0) + 18745), 256 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), (Process.myPid() >> 22) + 2, objArr11);
            ehVar.b(((String) objArr11[0]).intern(), ehVar2);
            ArrayList<d> arrayList = new ArrayList();
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i12, i13, Bitmap.Config.ARGB_8888);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            int length = bArrY.length;
            int i19 = 0;
            while (i19 < length) {
                bitmapCreateBitmap.copyPixelsFromBuffer(ByteBuffer.wrap(bArrY[i19]));
                byteArrayOutputStream.reset();
                if ((!z10) != z11) {
                    m_(bitmapCreateBitmap, ag.f40238i).compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
                } else {
                    bitmapCreateBitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
                }
                String strEncodeToString = Base64.encodeToString(byteArrayOutputStream.toByteArray(), 2);
                d dVar = new d(b10);
                int i20 = f42841n + 29;
                f42840l = i20 % 128;
                int i21 = i20 % 2;
                try {
                    Object[] objArr12 = new Object[1];
                    m(TextUtils.getTrimmedLength("") + 221, 14 - TextUtils.lastIndexOf("", c10, b10, b10), Color.alpha((int) b10) + 16, "\uffff\u0014\uffffￌ\n\uffff\f\u0005ￌ\ufff1\u0017\u0011\u0012\u0003\u000b\b", false, objArr12);
                    Class<?> cls = Class.forName((String) objArr12[b10]);
                    Object[] objArr13 = new Object[1];
                    m(228 - KeyEvent.normalizeMetaState(b10), (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 2, (ExpandableListView.getPackedPositionForChild(b10, b10) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(b10, b10) == 0L ? 0 : -1)) + 18, "\t\f\ufffa\n\u0000\u0003\u0003\u0000￤￼\u0004\u0000￫\u000b\u0005￼\t", true, objArr13);
                    dVar.f42856d = (int) (((Long) cls.getMethod((String) objArr13[b10], null).invoke(null, null)).longValue() / 1000);
                    dVar.f42855a = strEncodeToString;
                    arrayList.add(dVar);
                    i19++;
                    byteArrayOutputStream = byteArrayOutputStream;
                    z11 = true;
                    b10 = 0;
                    c10 = '0';
                } catch (Throwable th2) {
                    Throwable cause = th2.getCause();
                    if (cause == null) {
                        throw th2;
                    }
                    throw cause;
                }
            }
            ee eeVar = new ee();
            for (d dVar2 : arrayList) {
                eh ehVar3 = new eh();
                Object[] objArr14 = new Object[1];
                k((char) (ViewConfiguration.getJumpTapTimeout() >> 16), 257 - TextUtils.getOffsetAfter("", 0), 5 - View.resolveSize(0, 0), objArr14);
                ehVar3.a(((String) objArr14[0]).intern(), dVar2.f42855a);
                Object[] objArr15 = new Object[1];
                k((char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 1), View.MeasureSpec.getMode(0) + 262, 10 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), objArr15);
                ehVar3.a(((String) objArr15[0]).intern(), Integer.valueOf(dVar2.f42856d));
                eeVar.a(ehVar3);
            }
            Object[] objArr16 = new Object[1];
            k((char) Color.red(0), (Process.myTid() >> 22) + 271, Color.alpha(0) + 4, objArr16);
            ehVar.b(((String) objArr16[0]).intern(), eeVar);
            kl klVarE = at.e(context);
            Object[] objArr17 = new Object[1];
            k((char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), 275 - (ViewConfiguration.getTapTimeout() >> 16), 47 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), objArr17);
            try {
                klVarE.c(f.e(context, ((String) objArr17[0]).intern(), ehVar)).e(new jy() { // from class: com.facetec.sdk.t.3
                    @Override // com.facetec.sdk.jy
                    public final void e(kq kqVar) throws IOException {
                        kqVar.d();
                    }

                    @Override // com.facetec.sdk.jy
                    public final void a() {
                    }
                });
            } catch (f.a e7) {
                e7.printStackTrace();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void c(com.facetec.sdk.e eVar, ec ecVar, Context context) throws Throwable {
        Object obj;
        eh ehVar = new eh();
        Object[] objArr = new Object[1];
        k((char) (1 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))), 214 - Color.argb(0, 0, 0, 0), (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 2, objArr);
        String strIntern = ((String) objArr[0]).intern();
        Object[] objArr2 = new Object[1];
        k((char) ((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 51706), 1441 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), TextUtils.getCapsMode("", 0, 0) + 2, objArr2);
        ehVar.a(strIntern, ((String) objArr2[0]).intern());
        Object[] objArr3 = new Object[1];
        k((char) (40713 - TextUtils.indexOf("", "")), 1442 - View.getDefaultSize(0, 0), 9 - (ViewConfiguration.getWindowTouchSlop() >> 8), objArr3);
        ehVar.a(((String) objArr3[0]).intern(), f42833d);
        Object[] objArr4 = new Object[1];
        k((char) (ViewConfiguration.getEdgeSlop() >> 16), 1451 - Color.alpha(0), 7 - Color.blue(0), objArr4);
        ehVar.a(((String) objArr4[0]).intern(), UUID.randomUUID().toString());
        Object[] objArr5 = new Object[1];
        k((char) (ViewConfiguration.getScrollDefaultDelay() >> 16), 1458 - View.combineMeasuredStates(0, 0), 18 - ExpandableListView.getPackedPositionChild(0L), objArr5);
        ehVar.a(((String) objArr5[0]).intern(), cc.f40801a);
        Object[] objArr6 = new Object[1];
        k((char) (16310 - (ViewConfiguration.getMinimumFlingVelocity() >> 16)), 1476 - TextUtils.lastIndexOf("", '0', 0), 1 - Drawable.resolveOpacity(0, 0), objArr6);
        ehVar.a(((String) objArr6[0]).intern(), c(eVar));
        Object[] objArr7 = new Object[1];
        k((char) Color.alpha(0), (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 261, View.MeasureSpec.makeMeasureSpec(0, 0) + 9, objArr7);
        String strIntern2 = ((String) objArr7[0]).intern();
        int i10 = f42841n + 27;
        f42840l = i10 % 128;
        int i11 = i10 % 2;
        try {
            Object[] objArr8 = new Object[1];
            m(221 - Color.blue(0), 15 - (ViewConfiguration.getTouchSlop() >> 8), (-16777200) - Color.rgb(0, 0, 0), "\uffff\u0014\uffffￌ\n\uffff\f\u0005ￌ\ufff1\u0017\u0011\u0012\u0003\u000b\b", false, objArr8);
            Class<?> cls = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            m((ViewConfiguration.getScrollDefaultDelay() >> 16) + 228, 3 - KeyEvent.getDeadChar(0, 0), TextUtils.lastIndexOf("", '0', 0, 0) + 18, "\t\f\ufffa\n\u0000\u0003\u0003\u0000￤￼\u0004\u0000￫\u000b\u0005￼\t", true, objArr9);
            ehVar.a(strIntern2, Integer.valueOf((int) (((Long) cls.getMethod((String) objArr9[0], null).invoke(null, null)).longValue() / 1000)));
            Object[] objArr10 = new Object[1];
            k((char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 63203), 1478 - TextUtils.getOffsetBefore("", 0), AndroidCharacter.getMirror('0') - '\'', objArr10);
            String strIntern3 = ((String) objArr10[0]).intern();
            int i12 = f42840l + 117;
            f42841n = i12 % 128;
            int i13 = i12 % 2;
            Object[] objArr11 = new Object[1];
            m(221 - TextUtils.indexOf("", "", 0), 16 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), View.resolveSizeAndState(0, 0, 0) + 16, "\uffff\u0014\uffffￌ\n\uffff\f\u0005ￌ\ufff1\u0017\u0011\u0012\u0003\u000b\b", false, objArr11);
            Class<?> cls2 = Class.forName((String) objArr11[0]);
            Object[] objArr12 = new Object[1];
            m(Gravity.getAbsoluteGravity(0, 0) + 228, (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 3, 18 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), "\t\f\ufffa\n\u0000\u0003\u0003\u0000￤￼\u0004\u0000￫\u000b\u0005￼\t", true, objArr12);
            ehVar.a(strIntern3, Long.valueOf(((Long) cls2.getMethod((String) objArr12[0], null).invoke(null, null)).longValue()));
            if (ecVar != null) {
                int i14 = f42840l + 69;
                f42841n = i14 % 128;
                if (i14 % 2 != 0) {
                    Object[] objArr13 = new Object[1];
                    k((char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 1.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 1.0f ? 0 : -1)), 24500 / (AudioTrack.getMaxVolume() > 2.0f ? 1 : (AudioTrack.getMaxVolume() == 2.0f ? 0 : -1)), 4 >> Drawable.resolveOpacity(1, 0), objArr13);
                    obj = objArr13[0];
                } else {
                    Object[] objArr14 = new Object[1];
                    k((char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 1486, 4 - Drawable.resolveOpacity(0, 0), objArr14);
                    obj = objArr14[0];
                }
                ehVar.b(((String) obj).intern(), ecVar);
            }
            kl klVarE = at.e(context);
            Object[] objArr15 = new Object[1];
            k((char) ((-1) - TextUtils.lastIndexOf("", '0', 0, 0)), 323 - AndroidCharacter.getMirror('0'), 47 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), objArr15);
            try {
                klVarE.c(f.e(context, ((String) objArr15[0]).intern(), ehVar)).e(new jy() { // from class: com.facetec.sdk.t.1
                    @Override // com.facetec.sdk.jy
                    public final void e(kq kqVar) throws IOException {
                        kqVar.d();
                    }

                    @Override // com.facetec.sdk.jy
                    public final void a() {
                    }
                });
            } catch (f.a e5) {
                e5.printStackTrace();
            }
        } catch (Throwable th2) {
            Throwable cause = th2.getCause();
            if (cause == null) {
                throw th2;
            }
            throw cause;
        }
    }

    private static void a(Context context, m mVar) {
        int i10 = f42841n + 47;
        f42840l = i10 % 128;
        int i11 = 2;
        if (i10 % 2 != 0) {
            cx.b(new k1(context, mVar, 4));
        } else {
            cx.b(new a1(context, mVar, i11));
            throw null;
        }
    }

    private static synchronized m a(Context context) {
        m mVarC;
        File file;
        try {
            File[] fileArrListFiles = context.getCacheDir().listFiles();
            mVarC = null;
            if (fileArrListFiles == null) {
                file = null;
                break;
            }
            int length = fileArrListFiles.length;
            int i10 = f42841n + 33;
            f42840l = i10 % 128;
            int i11 = i10 % 2;
            int i12 = 0;
            while (true) {
                if (i12 >= length) {
                    file = null;
                    break;
                }
                int i13 = f42840l + 91;
                f42841n = i13 % 128;
                int i14 = i13 % 2;
                file = fileArrListFiles[i12];
                String name = file.getName();
                Object[] objArr = new Object[1];
                k((char) (TextUtils.lastIndexOf("", '0') + 43270), KeyEvent.keyCodeFromString("") + 335, (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 16, objArr);
                if (name.startsWith(((String) objArr[0]).intern())) {
                    int i15 = f42840l + 85;
                    f42841n = i15 % 128;
                    if (i15 % 2 == 0) {
                        break;
                    }
                    throw null;
                    throw th;
                }
                i12++;
                int i16 = f42841n + 115;
                f42840l = i16 % 128;
                int i17 = i16 % 2;
            }
            if (file != null) {
                int i18 = f42840l + 11;
                f42841n = i18 % 128;
                int i19 = i18 % 2;
                try {
                    try {
                        mVarC = m.c(bf.d(file, b(context, file.getName())));
                    } catch (Throwable th2) {
                        file.delete();
                        throw th2;
                    }
                } catch (Exception e5) {
                    e5.printStackTrace();
                }
                file.delete();
            }
        } catch (Throwable th3) {
            throw th3;
        }
        return mVarC;
    }

    public static void d(Context context, Throwable th2, com.facetec.sdk.e eVar, String str, boolean z10) throws Throwable {
        int i10 = f42841n + 7;
        f42840l = i10 % 128;
        if (i10 % 2 != 0) {
            if (th2 != null) {
                k.c(th2);
            }
            c(context, eVar, str);
            if (z10) {
                int i11 = f42841n + 17;
                f42840l = i11 % 128;
                if (i11 % 2 != 0) {
                    c(context, com.facetec.sdk.e.UNEXPECTED_EARLY_EXIT_FACESCAN, str);
                    return;
                } else {
                    c(context, com.facetec.sdk.e.UNEXPECTED_EARLY_EXIT_FACESCAN, str);
                    throw null;
                }
            }
            c(context, com.facetec.sdk.e.UNEXPECTED_EARLY_EXIT_IDSCAN, str);
            return;
        }
        throw null;
    }

    private static void d(final Runnable runnable) {
        Thread thread = new Thread() { // from class: com.facetec.sdk.t.4
            @Override // java.lang.Thread, java.lang.Runnable
            public final void run() {
                setPriority(1);
                Process.setThreadPriority(19);
                runnable.run();
            }
        };
        thread.setPriority(1);
        thread.start();
        int i10 = f42841n + 19;
        f42840l = i10 % 128;
        int i11 = i10 % 2;
    }

    public static void e(Context context, dt dtVar, String str) throws Throwable {
        com.facetec.sdk.e eVar;
        int i10 = f42841n + 51;
        f42840l = i10 % 128;
        if (i10 % 2 != 0) {
            if (dtVar == dt.ConnectionError) {
                eVar = com.facetec.sdk.e.NFC_USER_MOVED_DEVICE;
                int i11 = f42840l + 99;
                f42841n = i11 % 128;
                int i12 = i11 % 2;
            } else {
                eVar = com.facetec.sdk.e.NFC_ERROR;
            }
            eh ehVar = new eh();
            ehVar.a(b(eVar), a(dtVar));
            Object[] objArr = new Object[1];
            k((char) (1 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), 107 - TextUtils.indexOf("", "", 0), 5 - View.MeasureSpec.getSize(0), objArr);
            ehVar.a(((String) objArr[0]).intern(), str);
            e(context, eVar, ehVar);
            return;
        }
        dt dtVar2 = dt.Unknown;
        throw null;
    }

    private static ArrayList<String> d(ArrayList<String> arrayList) {
        ArrayList<String> arrayList2 = new ArrayList<>();
        Iterator<String> it = arrayList.iterator();
        int i10 = f42840l + 17;
        f42841n = i10 % 128;
        int i11 = i10 % 2;
        while (it.hasNext()) {
            arrayList2.add(bx.a(it.next()));
        }
        int i12 = f42841n + 13;
        f42840l = i12 % 128;
        if (i12 % 2 != 0) {
            return arrayList2;
        }
        throw null;
    }

    private static String c() throws Throwable {
        String strE = ay.e(22, 22);
        StringBuilder sb2 = new StringBuilder();
        Object[] objArr = new Object[1];
        k((char) ((ViewConfiguration.getScrollBarSize() >> 8) + 43269), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 335, 15 - (ViewConfiguration.getWindowTouchSlop() >> 8), objArr);
        sb2.append(((String) objArr[0]).intern());
        sb2.append(strE);
        String string = sb2.toString();
        int i10 = f42841n + 93;
        f42840l = i10 % 128;
        int i11 = i10 % 2;
        return string;
    }

    public static void a() {
        char[] cArr = new char[1491];
        ByteBuffer.wrap("9Î\u009a\u0096\u007fuÓÐ´\u0087\t\u0010íóN_#\u0013\u0087\u009eXn<É\u0091©r\tÖÿ«k\f=à\u0094Es\u0019Éú°\u0080\u0084#ÖÆ\u0000j\u0093\rð°XT\u0094÷\u0015\u009ae>Îá.\u0085\u008a(üËloº\u0012\u000fµhYÎü7z<Ùd<\u0087\u0090\"÷uJâ®\u0001\r\u00ad`áÄl\u001b\u0080\u007f#ÒL1è\u0095\u000bè \u0080\u0084#ÖÆ\u0000j\u0093\rð°XT\u0094÷\u0015\u009ay>Öá9\u0085\u0099(úËUa¯Âû'\u0016\u008b£ìÚQuµ\u009f\u0016&{gßå\u0000\rd»\u0080\u009e#ÝÆ&j\u009e\rõ°wT¹÷\u0010\u009aT>Ùá/\u0085\u0091(öËP×Öt\u009f\u0091y=ÚZ¬ç\u0000\u0003û aÍ\"i\u0086¶f\u0080\u0089#×Æ1j\u0085\rö\u0080¸#ÜÆ8j\u009e\rþ°AT¹\u0080¤#ÜÆ%j\u0091\rý°_T³÷9\u009ag>Àá\u0010\u0085\u009d(à\u0080¿#×Æ j\u0080\rþ°XT¤÷\u0011\u009aP>Èá)\u0085\u0097(ëQkò\u0018\u0017ø»[Ü1a\u0090\u0085f&ØK¿ï\u00110ÛTOù.\u001a\u0094¾h\u0080¨#ÀÆ!j\u009f\rã°\u0016T°÷\u0011\u009aa>Îá2\u0085\u0096(þË\u001eo\u009c\u0012\u001dµpYÇü1 \u0081C³æ\u0006\u008a´-\u0011ÐutÚ\u0017$»\u009a^ý\u0001\u000e¥¼H\u0018ël\u008f¦2\u0006Õcy\u008b\u001cvXAû\u000b\u001eé²TÕ<\u0080\u008b#ÁÆ\u001aj´\rÂ°UT¶÷\u001a\u009ae>Ôá<\u0080\u009f#ÆjcÉ6l\u0001ÏZ*·\u0086\u0012áq\\ç¸+\u001b\u0081võ\u0018½»å^\u0019ò½\u0095É(cÌ\u0082o,\u0002X¦êy\r\u001d¯°éScâ\u0080AÒ¤;\b\u009eoöÒP6\u00ad\u0095\tøu\\Ð\u0083\u001bç\u0095\u001cn¬ÐÉ§jñ\u0080\u0084#ßÆ2j\u0097\rô\u0080\u0099#ÛÆ>j\u0095\râ°BT¶÷\u0019\u009ae\u0080\u008b#ÁÆ:j\u0094\u0080\u0085#ÆÆ'j\u0080\râ°\fTø÷[\u009at>Êá2\u0085Ö(ãËQo°\u0012\u0011µ|Y×ü7 \u0088C¯æE\u008a¨-\tÐ*tË\u0017;»\u0081^¦\u0001X¥þHBë<\u008fý2\tÕ\u007fyÞ\u001c;ÀØcç\u0006Pª©M\bðq\u0094Ö70~\fÝB8»\u0094\róoNÆª\"\t³dáÀY\u001f¹{\u0000Ög5Á)\u009c\u008aÒo;Ã\u0085¤Ë\u0019^ý»^\u001f3b\u0097\u0086H6,É\u0081¥b\bÆ¬ãD@9¥Ú\trn\u001eÓ¸7\u001d\u0094øù\u0096]<\u0082Ôæ2K\u0000¨±\fVqäÖ\u0092:<\u009f\u0089Ãl \u0004\u0085¾é\r?¬\u009cñy\u001cÕ·²Á\u000fuë¥H3%E\u0081õ^\u0010:©\u0097ÈtuÐ\u0092\u00ad0\u0080\u0084#ÜÆ:j\u0084\rø°WT»÷2\u009at>Ùá>\u0085«(úË_o±\u0012;µxYÖü\u0011 \u0085CàæB\u008a¾,\t\u008fQj²Æ\u0017¡@\u001c×ø4[\u00986Í\u0092WM¶)\u0017\u0084~gØè'K\u007f®\u009c\u00029enØù<\u001a\u009f¶òìVx\u0089\u008dí;@Z£ÿ\u0007\u0016z´¿?\u001cwù\u0087U\"2H\u008fÅk\u001eÈ°¥Ð\u0001XÞ\u0082º\u000b\u0017PôúP\u001ao¦Ìî)\u001e\u0085»âÑ_H»\u008b\u00189u~Ñæ\u000e\u0003j¥ÇÙ\u0095×6\u009fÓh\u007fÍ\u0018µ¥\nAÊâL\u008f1+\u009dôr\u0090Ô\u0080\u0084#ÖÆ\u0000j\u0093\rð°XT\u0084÷\u0000\u009at>Èá/\u0080\u0083#ÔÆ0j£\rå°WT¥÷\u0000\u0080\u009f#×Æ j\u0085\rý°BT\u0098÷7\u009aG\u0006æ¥ª@Rìñ\u008b¯6>ÒÉqj\u001c\u0011¸¸gX\u0003Æ®\u0080M2éÀ\u0094e¬\b\u000fUê¥F !v\u009cÕx1Û\u008f¶Þ\u0012UÍ\u008b©\u001f\u0004zçØC$>\u00ad\u0099÷uOÐ¶\u008c\foBÊÊ¦!\u0001´üâXI;\u00ad\u0097\u0013\u0080\u008a#×Æ'j¢\rô°WT³÷\r\u009a\\>×á\t\u0085\u009d(øËZo¦\u0012,µoYÇü0 \u0093CäæBþ)]q¸\u0092\u00147s`Î÷*\u0014\u0089¸äô@y\u009f\u0095û6VYµý\u0011\u001elµËü'a\u0082\u008dÞ.=F\u0098à\u0080\u008a#×Æ'j¢\rô°WT³÷\r\u009a\\>×á\t\u0085\u009d(øËZo¦\u0012/µuYÍü4 \u008eCÀæH\u008a£-6Ð`tË\u0017/»\u0091^Û\u0001K¥»H\u001eëtÀüc¡\u0086Q*ÔM\u0082ð!\u0014Å·{Ú*~¡¡\u007fÅëh\u008e\u008b,/ÐRZõ\u0019\u0019±¼Fàå\u0003\u0092¦4Êãmw\u0090\u00074®WDë½Hã\u00ad\u0011\u0001¡fÉÛm?\u0093\u009c%ñSUÛ\u008a\u001cî©CÉ L\u0004\u008ay+ÞL2Å\u0097\u0014Ëµ(Û\u008dQá\u0092F<»]\u001fü|\u001eÐ¿5Ö\u0007©¤ýA\u0010í¥\u008aÜ7sÓ\u0099p \u001da¹ãf\u000b\u0002½¯éLlè\u009a\u0095/2NÞç{\u0007Ù´zæ\u009f03£TÀéh\r¤®%ÃIgæ¸\tÜ©qÊ\u0092e6¬K-ìA\u0000þ¥\u0016ù´E\u000fæQ\u0003£¯\u0013È{uß\u0091!2\u0097_áûi$®@\u001bí{\u000eñª\u001d×©pø\u009cE9«e%\u0086f#ÌO-è\u0080\u0015â±OÒ¦\u0013\u0004°YU´ù\u001f\u009ei#ÝÇod»\tí\u00adBr¾\u0016\u0000\u009093gÖ\u0087z\f\u001dJ øD\fç¢\u008aê.rñ\u0093\u0095-8Qt\u0086×Ï2=\u009e\u008dùûDK \u008a\u0003\u001en\u007fÊÍ\u00151\u0080\u009b#ÝÆ0j\u0091\rý°qT¢÷\u001d\u009aq>Ûá5\u0085\u009b(üËmo«\u0012\u001dµoYÖü& \u0084û&X{½\u0096\u0011=vKËÿ/3\u008c¹áÚEs\u009a\u0090þ)St°ä\u0014\u0005i»ÎÇ \u0003\u0003^æ³J\u0018-n\u0090Út\u001f×\u008bºê\u001eXÁ¤\u009ap9'ÜÃpF\u0017\u0010ª·NKíõ\u0080\u0083#ÔÆ0j¥\râ°ST¥÷9\u009az>Ìá>\u0085\u009c(ÝË[o©\u0012\u0015µ~YÇ\u0080\u0089#×Æ5j\u0099\rÿ°_T£÷\u0011\u009ay>Ãá\u0019\u0085\u008d(þËwo¹\u0012/µxYÇü-\u0080\u009e#ÆÆ2j\u0082\rå°fT¥÷\u0011\u009ac>Óá>\u0085\u008f(ÜËFo¼\u0012\u0019µmYÖü* \u008fCïÝ\f~H\u009b¢7\u001cPuíÇ\t ª\u0094ÇäcJ¼\u0081Ø\u0019ua\u0096ÆJóé±\fA ÿÇ¹z.\u009eÞ=jP\u000bô¯+tOúâ\u0092\u0001 \u0080\u0088#ÊÆ:j\u0084\rÂ°UT¥÷\u0011\u009ap>Ôá\u001e\u0085\u0094(øËNo¬\u0012\u0019µyYöü* \u008dCä\u0080\u009e#×Æ j\u0083\rø°YT¹÷&\u009ap>Éá.\u0085\u0094(íËko±\u0012\u0019µeYÒü& \u0083CõæC\u008a£-*ÐptÆ\u0017'\u0080\u009d#ÚÆ<j\u0095\rÿ°_T¯÷<\u009at>Ôá?\u0085\u0094(üËLo\u008a\u0012\u0012µxYÚü3 \u0085CâæR\u008a¢-\u0000ÐKtß\u0017'»\u0084kØÈ\u008e-u\u0081ÀsjÐ!5Õ£¼\u0000âå\u0013I«.Æ\u0080\u0081#ßÆ6Í¨nö\u008b\r\u0080\u008e#ÓÆ0\u0098\u000b;\u0000Þµr5\u0015c¨ÄL8ï\u0086\u001eb½9XÒôR\u0093\u0016.¤ÊPiÇ\u0004\u009d 9\u007fÅ\u001bn¶\u001aU»ñM\u008cÿ+\u009fÇ\nbÐ>jÝ\u000b\u0080\u0082#ÀÆ6\u0004E§!BËîu\u0089\u001c4®ÐIsý\u001e\u008dº#eã\u0001d¬\u0016O¯ë[\u0096Ä1\u0098Ý6xÊ$[Ç\u001db¸\u000e_©ÊT\u009bð6\u0093Ø?TÚ\u001a\u0085·!@Ìþo\u0099\u000bK ç\u0003\u0083æiJ×-¾\u0090\ftë×_º/\u001e\u0081ÁA¥Æ\b´ë\rOù2f\u0095:y\u0094Üh\u0080öc\u009aÆ*ªû\rZð4T´7z\u009bÓ~¤!\u001e\u0085ùhW¥~\u0006\u0011ãòO^(\u0003\u0095\u0093qdÒÁ¿¹\u001b\u000eÄÙ T\r6î\u009cJ[7Ù\u0090¾|\rÙç\u0085Ef\u0004Ã\u0094¯u\bËõ·\u0080¬#ÁÆ*j\u009e\rò°pT¶÷\u0017\u009ap>éá8\u0085\u0099(÷Ëmoª\u0012\u001fµ~YÇü0 \u0093CÕæG\u008a´-\u000fÐ@tØ\u00179»\u0087^ûµq\u0016\róä_s84\u0085\u0085adÂÁ¯¶\u000b\u0019Ôí°]\u001d%þ«Za'Þ\u0080¢l\u001eÉÿ\u0095]v4Ó\u0098¿c\u0018ñå§A\b\"ô\u008eJ\u0080»#õÆ\u0003j\u009c\rð°OT\u0084÷\u001b\u009a`>Ôá?\u0085½(ëËLo°\u0012\u000e\u0080»#õÆ\u0007j\u0095\ré°BT\u0083÷\u001b\u009aF>Êá>\u0085\u009d(úËVo\u009a\u0012\u000eµoYÍü1Nþí\u008e\be¤ÐÃ¬~\r\u009aá9sT)ð\u008d/qKÚæ®\u0005\u000f¡ùÜK{+\u0097¸2~nÝ\u008d¸(7DýãS\u001e4º\u0093Ù\\uÈ\u0090©Ï\u0013kï\u001fú¼¨Y^õÍ\u0092®/\u0006ËËhK\u0005(¡\u008f~F\u001aÇ·ªT\u0005ðó\u008dC*\u0017Æ\u009dcv?ÛÜ\u008fy\u0010\u0015ö²NO4ëµ\u0088E$ÿÁ\u0085\u009e\u0015:â×]t?\u0010ù\u00adYJ'æ\u0080\u0083fDTç\u0006\u0002ð®cÉ\u0000t¨\u0090e3å^\u0086ú!%èAiì\u0004\u000f««]Öíq¹\u009d38Ødu\u0087!\"¾NXéà\u0014\u009a°\u001bÓë\u007fQ\u009a<Å²a^\u008cì/\u008eKGöç\u0011´½(ØË\u0004bÌ\u0085oÁ\u008a9&\u009a\u0080\u0096#\u0092Æsj±\rò°BT¾÷\u0002\u009a|>Îá\"\u0085Ø(ÊËJo¾\u0012\bµxY\u0082ü\n \u008eCçæI\u008aç-IÐ(t\u008a\u0017\"»\u009b^Ï\u0001G¥¡H\u0005ë~\u008fº2\u001aÕ~yÖ\u001clÀ×\u0080\u0099#ÀÆ&j\u0095\u0080\u008b#ÓÆ?j\u0083\rô\u0080Í#\u0092Æ/jÐ\r±°^T¶÷\u0007\u009aB>Óá5\u0085\u009c(öËIo\u0099\u0012\u0013µ~Y×ü0 ÚC¡/ð\u008cóiNÅ«¢Þ\u001fjû\u008dX$5M\u0091éN\u0012*ÿ\u0087\u0084\u0080Í#\u0092Æ.Iaêz\u001f\u0094¼ÞY(õµ\u0092÷/^Ëºh4\u0005X\u0080\u0088#ÄÆ6j\u009e\rå°\u007fT\u0093\u0080\u009d#×Æ!j¶\rð°UT²÷ \u009ap>Ùá\b\u0085\u009d(êËMo¶\u0012\u0013µsYëü\u0007¿>vlÕ 0Ò\u009czû\u0001F\u0096¢R\u0001äl\u0094\u0080\u0089#ÓÆ'j\u0091".getBytes("ISO-8859-1")).asCharBuffer().get(cArr, 0, 1491);
        f42838i = cArr;
        f42837h = -914125791364439118L;
    }

    private static /* synthetic */ Object c(Object[] objArr) throws Throwable {
        cu cuVar = (cu) objArr[0];
        int i10 = f42840l + 111;
        int i11 = i10 % 128;
        f42841n = i11;
        int i12 = i10 % 2;
        f42830a = cuVar;
        int i13 = i11 + 125;
        f42840l = i13 % 128;
        int i14 = i13 % 2;
        try {
            Object[] objArr2 = new Object[1];
            m(221 - View.resolveSize(0, 0), 14 - TextUtils.indexOf((CharSequence) "", '0'), KeyEvent.getDeadChar(0, 0) + 16, "\uffff\u0014\uffffￌ\n\uffff\f\u0005ￌ\ufff1\u0017\u0011\u0012\u0003\u000b\b", false, objArr2);
            Class<?> cls = Class.forName((String) objArr2[0]);
            Object[] objArr3 = new Object[1];
            m(View.MeasureSpec.getSize(0) + 228, 2 - ExpandableListView.getPackedPositionChild(0L), 17 - (ViewConfiguration.getTouchSlop() >> 8), "\t\f\ufffa\n\u0000\u0003\u0003\u0000￤￼\u0004\u0000￫\u000b\u0005￼\t", true, objArr3);
            f42836g = ((Long) cls.getMethod((String) objArr3[0], null).invoke(null, null)).longValue();
            int i15 = f42840l + 69;
            f42841n = i15 % 128;
            int i16 = i15 % 2;
            return null;
        } catch (Throwable th2) {
            Throwable cause = th2.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th2;
        }
    }

    private static String a(cu cuVar) {
        return (String) e(new Object[]{cuVar}, 235000786, -235000783, (int) System.currentTimeMillis());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void d(Context context, Context context2, m mVar, boolean z10) throws Throwable {
        e(new Object[]{context, context2, mVar, Boolean.valueOf(z10)}, 1439633976, -1439633976, (int) System.currentTimeMillis());
    }

    public static void d(Context context) throws Throwable {
        e(new Object[]{context}, -1334501404, 1334501406, (int) System.currentTimeMillis());
    }

    private static void e(Context context, com.facetec.sdk.e eVar, @Nullable ec ecVar) {
        int i10 = f42841n + 13;
        f42840l = i10 % 128;
        if (i10 % 2 == 0) {
            int i11 = 52 / 0;
            if (context == null) {
                return;
            }
        } else if (context == null) {
            return;
        }
        if (b()) {
            cx.d(new x4(eVar, ecVar, context));
            int i12 = f42840l + 111;
            f42841n = i12 % 128;
            int i13 = i12 % 2;
        }
    }

    private static String c(com.facetec.sdk.e eVar) throws Throwable {
        int i10 = f42841n + 117;
        f42840l = i10 % 128;
        int i11 = i10 % 2;
        switch (AnonymousClass2.f42843c[eVar.ordinal()]) {
            case 1:
                Object[] objArr = new Object[1];
                k((char) (32418 - (ViewConfiguration.getTapTimeout() >> 16)), 624 - AndroidCharacter.getMirror('0'), (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 22, objArr);
                String strIntern = ((String) objArr[0]).intern();
                int i12 = f42840l + 59;
                f42841n = i12 % 128;
                int i13 = i12 % 2;
                return strIntern;
            case 2:
                Object[] objArr2 = new Object[1];
                k((char) (AndroidCharacter.getMirror('0') + 22784), 706 - (ViewConfiguration.getFadingEdgeLength() >> 16), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 20, objArr2);
                return ((String) objArr2[0]).intern();
            case 3:
                Object[] objArr3 = new Object[1];
                k((char) ((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 27444), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 658, Gravity.getAbsoluteGravity(0, 0) + 29, objArr3);
                return ((String) objArr3[0]).intern();
            case 4:
                Object[] objArr4 = new Object[1];
                k((char) (50566 - KeyEvent.keyCodeFromString("")), 726 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 26, objArr4);
                return ((String) objArr4[0]).intern();
            case 5:
                Object[] objArr5 = new Object[1];
                k((char) ((ViewConfiguration.getKeyRepeatDelay() >> 16) + 34592), 687 - ExpandableListView.getPackedPositionType(0L), (-16777197) - Color.rgb(0, 0, 0), objArr5);
                return ((String) objArr5[0]).intern();
            case 6:
                Object[] objArr6 = new Object[1];
                k((char) (34413 - (ViewConfiguration.getTouchSlop() >> 8)), 510 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), 16 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), objArr6);
                String strIntern2 = ((String) objArr6[0]).intern();
                int i14 = f42841n + 15;
                f42840l = i14 % 128;
                if (i14 % 2 != 0) {
                    return strIntern2;
                }
                throw null;
            case 7:
                Object[] objArr7 = new Object[1];
                k((char) (11394 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1))), (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 526, 27 - TextUtils.indexOf((CharSequence) "", '0'), objArr7);
                return ((String) objArr7[0]).intern();
            case 8:
                Object[] objArr8 = new Object[1];
                k((char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1), (ViewConfiguration.getScrollBarSize() >> 8) + 554, 23 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), objArr8);
                return ((String) objArr8[0]).intern();
            case 9:
                Object[] objArr9 = new Object[1];
                k((char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1), 598 - (ViewConfiguration.getTapTimeout() >> 16), (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 34, objArr9);
                return ((String) objArr9[0]).intern();
            case 10:
                Object[] objArr10 = new Object[1];
                k((char) (16503 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), 631 - KeyEvent.normalizeMetaState(0), 27 - (ViewConfiguration.getScrollBarSize() >> 8), objArr10);
                return ((String) objArr10[0]).intern();
            case 11:
                Object[] objArr11 = new Object[1];
                k((char) (37770 - Drawable.resolveOpacity(0, 0)), 752 - ExpandableListView.getPackedPositionChild(0L), ((Process.getThreadPriority(0) + 20) >> 6) + 12, objArr11);
                return ((String) objArr11[0]).intern();
            case 12:
                Object[] objArr12 = new Object[1];
                k((char) ((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 4282), (ViewConfiguration.getLongPressTimeout() >> 16) + 765, 13 - (ViewConfiguration.getScrollDefaultDelay() >> 16), objArr12);
                return ((String) objArr12[0]).intern();
            case 13:
                Object[] objArr13 = new Object[1];
                k((char) (62488 - TextUtils.getTrimmedLength("")), ExpandableListView.getPackedPositionType(0L) + 778, ';' - AndroidCharacter.getMirror('0'), objArr13);
                return ((String) objArr13[0]).intern();
            case 14:
                Object[] objArr14 = new Object[1];
                k((char) (1 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))), 790 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), 20 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), objArr14);
                return ((String) objArr14[0]).intern();
            case 15:
                Object[] objArr15 = new Object[1];
                k((char) (TextUtils.indexOf((CharSequence) "", '0', 0) + 31657), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 809, 17 - (Process.myPid() >> 22), objArr15);
                return ((String) objArr15[0]).intern();
            case 16:
                Object[] objArr16 = new Object[1];
                k((char) (View.combineMeasuredStates(0, 0) + 8333), (ViewConfiguration.getPressedStateDuration() >> 16) + 826, 12 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), objArr16);
                return ((String) objArr16[0]).intern();
            case 17:
                Object[] objArr17 = new Object[1];
                k((char) (Color.blue(0) + 6899), 837 - View.MeasureSpec.makeMeasureSpec(0, 0), 8 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), objArr17);
                return ((String) objArr17[0]).intern();
            case 18:
                Object[] objArr18 = new Object[1];
                k((char) (ViewConfiguration.getKeyRepeatDelay() >> 16), 844 - TextUtils.lastIndexOf("", '0', 0), 18 - View.resolveSizeAndState(0, 0, 0), objArr18);
                return ((String) objArr18[0]).intern();
            case 19:
                Object[] objArr19 = new Object[1];
                k((char) Color.green(0), KeyEvent.keyCodeFromString("") + 863, View.resolveSize(0, 0) + 19, objArr19);
                return ((String) objArr19[0]).intern();
            case 20:
                Object[] objArr20 = new Object[1];
                k((char) View.combineMeasuredStates(0, 0), (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 882, ((byte) KeyEvent.getModifierMetaStateMask()) + 22, objArr20);
                return ((String) objArr20[0]).intern();
            case 21:
                Object[] objArr21 = new Object[1];
                k((char) ((ViewConfiguration.getDoubleTapTimeout() >> 16) + 23956), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 903, Color.rgb(0, 0, 0) + 16777230, objArr21);
                return ((String) objArr21[0]).intern();
            case 22:
                Object[] objArr22 = new Object[1];
                k((char) (ImageFormat.getBitsPerPixel(0) + 51836), TextUtils.getOffsetBefore("", 0) + 917, 14 - (ViewConfiguration.getDoubleTapTimeout() >> 16), objArr22);
                return ((String) objArr22[0]).intern();
            case 23:
                Object[] objArr23 = new Object[1];
                k((char) KeyEvent.getDeadChar(0, 0), TextUtils.lastIndexOf("", '0', 0, 0) + 932, 21 - TextUtils.indexOf("", "", 0, 0), objArr23);
                return ((String) objArr23[0]).intern();
            case 24:
                Object[] objArr24 = new Object[1];
                k((char) Gravity.getAbsoluteGravity(0, 0), 952 - (ViewConfiguration.getWindowTouchSlop() >> 8), 26 - ImageFormat.getBitsPerPixel(0), objArr24);
                return ((String) objArr24[0]).intern();
            case 25:
                Object[] objArr25 = new Object[1];
                k((char) (ViewConfiguration.getMinimumFlingVelocity() >> 16), 980 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), 27 - Process.getGidForName(""), objArr25);
                return ((String) objArr25[0]).intern();
            case 26:
                Object[] objArr26 = new Object[1];
                k((char) ((ViewConfiguration.getKeyRepeatDelay() >> 16) + 60244), 1007 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), (ViewConfiguration.getLongPressTimeout() >> 16) + 4, objArr26);
                return ((String) objArr26[0]).intern();
            case 27:
                Object[] objArr27 = new Object[1];
                k((char) (62435 - KeyEvent.normalizeMetaState(0)), View.resolveSizeAndState(0, 0, 0) + PointerIconCompat.TYPE_COPY, 3 - View.MeasureSpec.getSize(0), objArr27);
                return ((String) objArr27[0]).intern();
            case 28:
                Object[] objArr28 = new Object[1];
                k((char) (TextUtils.getOffsetBefore("", 0) + 9010), TextUtils.getTrimmedLength("") + PointerIconCompat.TYPE_HORIZONTAL_DOUBLE_ARROW, 4 - TextUtils.lastIndexOf("", '0'), objArr28);
                return ((String) objArr28[0]).intern();
            case 29:
                Object[] objArr29 = new Object[1];
                k((char) (ViewConfiguration.getScrollBarSize() >> 8), 1019 - TextUtils.getOffsetBefore("", 0), 3 - (ViewConfiguration.getTapTimeout() >> 16), objArr29);
                return ((String) objArr29[0]).intern();
            case 30:
                Object[] objArr30 = new Object[1];
                k((char) (19752 - TextUtils.lastIndexOf("", '0')), View.MeasureSpec.makeMeasureSpec(0, 0) + 1022, 2 - TextUtils.indexOf((CharSequence) "", '0'), objArr30);
                return ((String) objArr30[0]).intern();
            case 31:
                Object[] objArr31 = new Object[1];
                k((char) (ViewConfiguration.getPressedStateDuration() >> 16), Color.green(0) + InputDeviceCompat.SOURCE_GAMEPAD, 3 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), objArr31);
                return ((String) objArr31[0]).intern();
            case 32:
                Object[] objArr32 = new Object[1];
                k((char) (TextUtils.lastIndexOf("", '0', 0, 0) + 6273), 1029 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), 7 - ((byte) KeyEvent.getModifierMetaStateMask()), objArr32);
                return ((String) objArr32[0]).intern();
            case 33:
                Object[] objArr33 = new Object[1];
                k((char) (40677 - TextUtils.indexOf((CharSequence) "", '0', 0, 0)), 1084 - AndroidCharacter.getMirror('0'), View.MeasureSpec.getSize(0) + 21, objArr33);
                return ((String) objArr33[0]).intern();
            case 34:
                Object[] objArr34 = new Object[1];
                k((char) (ViewConfiguration.getScrollDefaultDelay() >> 16), (ViewConfiguration.getEdgeSlop() >> 16) + 1057, ((Process.getThreadPriority(0) + 20) >> 6) + 3, objArr34);
                return ((String) objArr34[0]).intern();
            case 35:
                Object[] objArr35 = new Object[1];
                k((char) (34045 - Drawable.resolveOpacity(0, 0)), 1061 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), KeyEvent.normalizeMetaState(0) + 34, objArr35);
                return ((String) objArr35[0]).intern();
            case 36:
                Object[] objArr36 = new Object[1];
                k((char) (8287 - TextUtils.getCapsMode("", 0, 0)), 1142 - AndroidCharacter.getMirror('0'), 32 - (ViewConfiguration.getDoubleTapTimeout() >> 16), objArr36);
                return ((String) objArr36[0]).intern();
            case 37:
                Object[] objArr37 = new Object[1];
                k((char) (9664 - Color.alpha(0)), (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + ScanCommand.REQUEST_SCAN, 26 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), objArr37);
                return ((String) objArr37[0]).intern();
            case 38:
                Object[] objArr38 = new Object[1];
                k((char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), TextUtils.indexOf((CharSequence) "", '0', 0) + 1152, 29 - Color.red(0), objArr38);
                return ((String) objArr38[0]).intern();
            case 39:
                Object[] objArr39 = new Object[1];
                k((char) (13776 - (ViewConfiguration.getLongPressTimeout() >> 16)), 1179 - ImageFormat.getBitsPerPixel(0), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 28, objArr39);
                return ((String) objArr39[0]).intern();
            case 40:
                Object[] objArr40 = new Object[1];
                k((char) ((-1) - TextUtils.lastIndexOf("", '0', 0, 0)), TextUtils.lastIndexOf("", '0', 0) + ReturnCode.ERR_CRY_DECRYPT, (ViewConfiguration.getWindowTouchSlop() >> 8) + 16, objArr40);
                return ((String) objArr40[0]).intern();
            case 41:
                Object[] objArr41 = new Object[1];
                k((char) KeyEvent.normalizeMetaState(0), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 1224, View.MeasureSpec.makeMeasureSpec(0, 0) + 19, objArr41);
                return ((String) objArr41[0]).intern();
            case 42:
                Object[] objArr42 = new Object[1];
                k((char) (52819 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), KeyEvent.normalizeMetaState(0) + 1243, 31 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), objArr42);
                return ((String) objArr42[0]).intern();
            case 43:
                Object[] objArr43 = new Object[1];
                k((char) ((ViewConfiguration.getScrollBarSize() >> 8) + 40798), 1273 - TextUtils.lastIndexOf("", '0', 0, 0), ExpandableListView.getPackedPositionGroup(0L) + 38, objArr43);
                return ((String) objArr43[0]).intern();
            case 44:
                Object[] objArr44 = new Object[1];
                k((char) (50416 - View.MeasureSpec.getSize(0)), 1312 - (ViewConfiguration.getLongPressTimeout() >> 16), 39 - Drawable.resolveOpacity(0, 0), objArr44);
                return ((String) objArr44[0]).intern();
            default:
                return String.valueOf(eVar);
        }
    }

    private static /* synthetic */ Object e(Object[] objArr) {
        Context context = (Context) objArr[0];
        Context context2 = (Context) objArr[1];
        m mVar = (m) objArr[2];
        at.d(context).e(context2, mVar, ((Boolean) objArr[3]).booleanValue(), new e(context, mVar));
        int i10 = f42840l + 33;
        f42841n = i10 % 128;
        if (i10 % 2 != 0) {
            int i11 = 10 / 0;
        }
        return null;
    }

    private static void e(final Context context, final boolean z10, final m mVar) {
        int i10 = f42841n + 125;
        f42840l = i10 % 128;
        int i11 = i10 % 2;
        final Context applicationContext = context.getApplicationContext();
        d(new Runnable() { // from class: com.facetec.sdk.z7
            @Override // java.lang.Runnable
            public final void run() throws Throwable {
                t.d(applicationContext, context, mVar, z10);
            }
        });
        int i12 = f42840l + 1;
        f42841n = i12 % 128;
        if (i12 % 2 != 0) {
            int i13 = 99 / 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void e(Context context, m mVar) throws Throwable {
        if (!f42835f) {
            int i10 = f42840l + 69;
            f42841n = i10 % 128;
            int i11 = i10 % 2;
            if (context == null) {
                throw new AssertionError();
            }
        }
        String strC = c();
        try {
            bf.c(new File(context.getCacheDir(), strC), b(context, strC), mVar.c());
            int i12 = f42841n + 45;
            f42840l = i12 % 128;
            if (i12 % 2 == 0) {
                throw null;
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    public static void e() {
        f42839j = -1817348545;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0027, code lost:
    
        if ((r0 % 2) == 0) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0029, code lost:
    
        r0 = 10 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x002c, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x002d, code lost:
    
        r5 = new java.lang.Object[1];
        k((char) ((android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0 ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0 ? 0 : -1)) + 65170), 322 - (android.os.SystemClock.elapsedRealtime() > 0 ? 1 : (android.os.SystemClock.elapsedRealtime() == 0 ? 0 : -1)), 13 - android.graphics.ImageFormat.getBitsPerPixel(0), r5);
        com.facetec.sdk.ch.G(((java.lang.String) r5[0]).intern(), 1);
        r6 = com.facetec.sdk.ch.x(((java.lang.Integer) com.facetec.sdk.d.b(new java.lang.Object[0], 1657849494, -1657849494, (int) java.lang.System.currentTimeMillis())).intValue());
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x007b, code lost:
    
        if ((!r6.equals("")) == true) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0083, code lost:
    
        if (r17.equals("") == false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0089, code lost:
    
        if (r18 != com.facetec.sdk.s.f42813e) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x008b, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0092, code lost:
    
        e(r14.getApplicationContext(), false, new com.facetec.sdk.m(r6, r18, d(r16), r15, r17, com.facetec.sdk.cc.f40801a, com.facetec.sdk.cc.f40802c, r19));
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00ae, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0014, code lost:
    
        if (b() == false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001b, code lost:
    
        if (b() == false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001d, code lost:
    
        r0 = com.facetec.sdk.t.f42840l + 19;
        com.facetec.sdk.t.f42841n = r0 % 128;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void b(android.content.Context r14, java.lang.String r15, java.util.ArrayList<java.lang.String> r16, java.lang.String r17, com.facetec.sdk.s r18, java.lang.String r19) throws java.lang.Throwable {
        /*
            int r0 = com.facetec.sdk.t.f42840l
            int r0 = r0 + 115
            int r1 = r0 % 128
            com.facetec.sdk.t.f42841n = r1
            int r0 = r0 % 2
            r1 = 0
            if (r0 == 0) goto L17
            boolean r0 = b()
            r2 = 35
            int r2 = r2 / r1
            if (r0 != 0) goto L2d
            goto L1d
        L17:
            boolean r0 = b()
            if (r0 != 0) goto L2d
        L1d:
            int r0 = com.facetec.sdk.t.f42840l
            int r0 = r0 + 19
            int r2 = r0 % 128
            com.facetec.sdk.t.f42841n = r2
            int r0 = r0 % 2
            if (r0 == 0) goto L2c
            r0 = 10
            int r0 = r0 / r1
        L2c:
            return
        L2d:
            long r2 = android.widget.ExpandableListView.getPackedPositionForChild(r1, r1)
            r4 = 0
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            r2 = 65170(0xfe92, float:9.1323E-41)
            int r0 = r0 + r2
            char r0 = (char) r0
            long r2 = android.os.SystemClock.elapsedRealtime()
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            int r2 = 322 - r2
            int r3 = android.graphics.ImageFormat.getBitsPerPixel(r1)
            int r3 = 13 - r3
            r4 = 1
            java.lang.Object[] r5 = new java.lang.Object[r4]
            k(r0, r2, r3, r5)
            r0 = r5[r1]
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r0 = r0.intern()
            com.facetec.sdk.ch.G(r0, r4)
            java.lang.Object[] r0 = new java.lang.Object[r1]
            long r2 = java.lang.System.currentTimeMillis()
            int r2 = (int) r2
            r3 = 1657849494(0x62d0c696, float:1.9256162E21)
            r5 = -1657849494(0xffffffff9d2f396a, float:-2.319074E-21)
            java.lang.Object r0 = com.facetec.sdk.d.b(r0, r3, r5, r2)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            java.lang.String r6 = com.facetec.sdk.ch.x(r0)
            java.lang.String r0 = ""
            boolean r2 = r6.equals(r0)
            r2 = r2 ^ r4
            if (r2 == r4) goto L8f
            r2 = r17
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L8c
            com.facetec.sdk.s r0 = com.facetec.sdk.s.FACE_SCAN
            r3 = r18
            if (r3 != r0) goto L92
            return
        L8c:
            r3 = r18
            goto L92
        L8f:
            r2 = r17
            goto L8c
        L92:
            java.util.ArrayList r8 = d(r16)
            com.facetec.sdk.m r0 = new com.facetec.sdk.m
            java.lang.String r11 = com.facetec.sdk.cc.f40801a
            java.lang.String r12 = com.facetec.sdk.cc.f40802c
            r5 = r0
            r7 = r18
            r9 = r15
            r10 = r17
            r13 = r19
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13)
            android.content.Context r2 = r14.getApplicationContext()
            e(r2, r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facetec.sdk.t.b(android.content.Context, java.lang.String, java.util.ArrayList, java.lang.String, com.facetec.sdk.s, java.lang.String):void");
    }

    public static boolean b() {
        int i10 = f42841n + 85;
        f42840l = i10 % 128;
        int i11 = i10 % 2;
        boolean zA = com.facetec.sdk.d.a();
        int i12 = f42840l + 63;
        f42841n = i12 % 128;
        if (i12 % 2 == 0) {
            return zA;
        }
        throw null;
    }

    private static byte[] b(Context context, String str) throws Exception {
        byte[] bArrC = com.facetec.sdk.d.c(context);
        StringBuilder sb2 = new StringBuilder();
        Object[] objArr = new Object[1];
        k((char) (Color.rgb(0, 0, 0) + 16802794), 349 - ((byte) KeyEvent.getModifierMetaStateMask()), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 23, objArr);
        sb2.append(((String) objArr[0]).intern());
        sb2.append(str);
        byte[] bArrC2 = bi.c(bArrC, sb2.toString());
        int i10 = f42840l + 77;
        f42841n = i10 % 128;
        int i11 = i10 % 2;
        return bArrC2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void b(Context context) throws Throwable {
        e(new Object[]{context}, 1328479196, -1328479195, (int) System.currentTimeMillis());
    }

    /* JADX WARN: Code duplicated, block: B:11:0x002d A[PHI: r0
      0x002d: PHI (r0v4 android.app.Fragment) = (r0v3 android.app.Fragment), (r0v16 android.app.Fragment) binds: [B:10:0x002b, B:7:0x0024] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:12:0x0032  */
    public static String c(Activity activity) throws Throwable {
        Fragment fragmentZ_;
        String tag;
        String strIntern;
        String strIntern2;
        int i10 = f42840l;
        int i11 = i10 + 5;
        f42841n = i11 % 128;
        int i12 = i11 % 2;
        if (activity == null) {
            return "";
        }
        int i13 = i10 + 79;
        f42841n = i13 % 128;
        if (i13 % 2 != 0) {
            fragmentZ_ = ay.Z_(activity);
            int i14 = 14 / 0;
            if (fragmentZ_ != null) {
                tag = fragmentZ_.getTag();
            } else {
                Object[] objArr = new Object[1];
                k((char) (19462 - View.getDefaultSize(0, 0)), 1351 - (ViewConfiguration.getWindowTouchSlop() >> 8), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 3, objArr);
                tag = ((String) objArr[0]).intern();
            }
        } else {
            fragmentZ_ = ay.Z_(activity);
            if (fragmentZ_ != null) {
                tag = fragmentZ_.getTag();
            } else {
                Object[] objArr2 = new Object[1];
                k((char) (19462 - View.getDefaultSize(0, 0)), 1351 - (ViewConfiguration.getWindowTouchSlop() >> 8), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 3, objArr2);
                tag = ((String) objArr2[0]).intern();
            }
        }
        StringBuilder sb2 = new StringBuilder();
        Object[] objArr3 = new Object[1];
        k((char) (ViewConfiguration.getDoubleTapTimeout() >> 16), 1355 - KeyEvent.keyCodeFromString(""), 39 - Color.green(0), objArr3);
        sb2.append(((String) objArr3[0]).intern());
        if (activity.isFinishing()) {
            int i15 = f42840l + 43;
            f42841n = i15 % 128;
            if (i15 % 2 != 0) {
                Object[] objArr4 = new Object[1];
                k((char) (ViewConfiguration.getTouchSlop() - 105), 4794 - Color.argb(0, 1, 1, 0), 3 / TextUtils.indexOf((CharSequence) "", '0', 0), objArr4);
                strIntern = ((String) objArr4[0]).intern();
            } else {
                Object[] objArr5 = new Object[1];
                k((char) (ViewConfiguration.getTouchSlop() >> 8), 1394 - Color.argb(0, 0, 0, 0), 3 - TextUtils.indexOf((CharSequence) "", '0', 0), objArr5);
                strIntern = ((String) objArr5[0]).intern();
            }
        } else {
            Object[] objArr6 = new Object[1];
            k((char) TextUtils.getCapsMode("", 0, 0), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 1397, (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 4, objArr6);
            strIntern = ((String) objArr6[0]).intern();
            int i16 = f42841n + 59;
            f42840l = i16 % 128;
            int i17 = i16 % 2;
        }
        sb2.append(strIntern);
        Object[] objArr7 = new Object[1];
        k((char) (TextUtils.lastIndexOf("", '0') + 1), (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + ReturnCode.ERR_PAY_PUTTING_DATA, 20 - TextUtils.lastIndexOf("", '0'), objArr7);
        sb2.append(((String) objArr7[0]).intern());
        if (activity.hasWindowFocus()) {
            Object[] objArr8 = new Object[1];
            k((char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 1393, (KeyEvent.getMaxKeyCode() >> 16) + 4, objArr8);
            strIntern2 = ((String) objArr8[0]).intern();
            int i18 = f42841n + 119;
            f42840l = i18 % 128;
            int i19 = i18 % 2;
        } else {
            Object[] objArr9 = new Object[1];
            k((char) (ViewConfiguration.getWindowTouchSlop() >> 8), Drawable.resolveOpacity(0, 0) + 1398, ((byte) KeyEvent.getModifierMetaStateMask()) + 6, objArr9);
            strIntern2 = ((String) objArr9[0]).intern();
        }
        sb2.append(strIntern2);
        Object[] objArr10 = new Object[1];
        k((char) (44861 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1))), TextUtils.lastIndexOf("", '0', 0) + 1425, 13 - KeyEvent.getDeadChar(0, 0), objArr10);
        sb2.append(((String) objArr10[0]).intern());
        sb2.append(tag);
        Object[] objArr11 = new Object[1];
        k((char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 1), 1437 - View.MeasureSpec.makeMeasureSpec(0, 0), 3 - Color.green(0), objArr11);
        sb2.append(((String) objArr11[0]).intern());
        return sb2.toString();
    }

    public static void c(cu cuVar) throws Throwable {
        e(new Object[]{cuVar}, -590439926, 590439930, (int) System.currentTimeMillis());
    }
}
