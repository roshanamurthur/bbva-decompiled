package io.card.payment;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Debug;
import android.os.Handler;
import android.util.Log;
import android.view.OrientationEventListener;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.RotateAnimation;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.Toast;
import androidx.core.view.ViewCompat;
import io.card.payment.i18n.LocalizedStrings;
import io.card.payment.i18n.StringKey;
import io.card.payment.ui.ActivityHelper;
import io.card.payment.ui.ViewUtil;
import java.io.ByteArrayInputStream;
import java.util.Date;
import java.util.Objects;

/* JADX INFO: loaded from: classes7.dex */
public final class CardIOActivity extends Activity {
    public static final String EXTRA_CAPTURED_CARD_IMAGE = "io.card.payment.capturedCardImage";
    public static final String EXTRA_GUIDE_COLOR = "io.card.payment.guideColor";
    public static final String EXTRA_HIDE_CARDIO_LOGO = "io.card.payment.hideLogo";
    public static final String EXTRA_KEEP_APPLICATION_THEME = "io.card.payment.keepApplicationTheme";
    public static final String EXTRA_LANGUAGE_OR_LOCALE = "io.card.payment.languageOrLocale";
    public static final String EXTRA_NO_CAMERA = "io.card.payment.noCamera";
    public static final String EXTRA_REQUIRE_CARDHOLDER_NAME = "io.card.payment.requireCardholderName";
    public static final String EXTRA_REQUIRE_CVV = "io.card.payment.requireCVV";
    public static final String EXTRA_REQUIRE_EXPIRY = "io.card.payment.requireExpiry";
    public static final String EXTRA_REQUIRE_POSTAL_CODE = "io.card.payment.requirePostalCode";
    public static final String EXTRA_RESTRICT_POSTAL_CODE_TO_NUMERIC_ONLY = "io.card.payment.restrictPostalCodeToNumericOnly";
    public static final String EXTRA_RETURN_CARD_IMAGE = "io.card.payment.returnCardImage";
    public static final String EXTRA_SCAN_EXPIRY = "io.card.payment.scanExpiry";
    public static final String EXTRA_SCAN_INSTRUCTIONS = "io.card.payment.scanInstructions";
    public static final String EXTRA_SCAN_OVERLAY_LAYOUT_ID = "io.card.payment.scanOverlayLayoutId";
    public static final String EXTRA_SCAN_RESULT = "io.card.payment.scanResult";
    public static final String EXTRA_SUPPRESS_CONFIRMATION = "io.card.payment.suppressConfirmation";
    public static final String EXTRA_SUPPRESS_MANUAL_ENTRY = "io.card.payment.suppressManual";
    public static final String EXTRA_SUPPRESS_SCAN = "io.card.payment.suppressScan";
    public static final String EXTRA_UNBLUR_DIGITS = "io.card.payment.unblurDigits";
    public static final String EXTRA_USE_CARDIO_LOGO = "io.card.payment.useCardIOLogo";
    public static final String EXTRA_USE_PAYPAL_ACTIONBAR_ICON = "io.card.payment.intentSenderIsPayPal";
    public static int L0 = 0;
    public static final int RESULT_CARD_INFO = 13274384;
    public static final int RESULT_CONFIRMATION_SUPPRESSED = 13274388;
    public static final int RESULT_ENTRY_CANCELED = 13274385;
    public static final int RESULT_SCAN_NOT_AVAILABLE = 13274386;
    public static final int RESULT_SCAN_SUPPRESSED = 13274387;
    public boolean E0;
    public RelativeLayout F0;
    public FrameLayout G0;
    public boolean H0;
    public CardScanner I0;
    public boolean J0 = false;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public g f69730p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public a f69731q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public h f69732r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public CreditCard f69733s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public Rect f69734t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public int f69735u0;
    public int v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public boolean f69736w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public boolean f69737x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public LinearLayout f69738y0;
    public static final long[] K0 = {0, 70, 10, 40};
    public static Bitmap M0 = null;

    public class a extends OrientationEventListener {
        public a(Context context) {
            super(context, 2);
        }

        @Override // android.view.OrientationEventListener
        public final void onOrientationChanged(int i10) {
            String str = CardIOActivity.EXTRA_NO_CAMERA;
            CardIOActivity.this.a(i10);
        }
    }

    public class b implements Runnable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Intent f69740p0;

        public b(Intent intent) {
            this.f69740p0 = intent;
        }

        @Override // java.lang.Runnable
        public final void run() {
            Bitmap bitmapCreateBitmap;
            String str = CardIOActivity.EXTRA_NO_CAMERA;
            CardIOActivity cardIOActivity = CardIOActivity.this;
            cardIOActivity.getWindow().clearFlags(1024);
            cardIOActivity.getWindow().addFlags(512);
            Intent intent = new Intent(cardIOActivity, (Class<?>) DataEntryActivity.class);
            j.d(this.f69740p0, intent, cardIOActivity.f69730p0);
            g gVar = cardIOActivity.f69730p0;
            if (gVar != null) {
                if (gVar.f69782r0 != null) {
                    if (gVar.f69784t0.flipped) {
                        Matrix matrix = new Matrix();
                        matrix.setRotate(180.0f, gVar.f69782r0.getWidth() / 2, gVar.f69782r0.getHeight() / 2);
                        Bitmap bitmap = gVar.f69782r0;
                        gVar.f69782r0 = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), gVar.f69782r0.getHeight(), matrix, false);
                    }
                    Canvas canvas = new Canvas(gVar.f69782r0);
                    Paint paint = new Paint();
                    j.c(paint);
                    paint.setTextSize(gVar.O0 * 28.0f);
                    int length = gVar.f69784t0.cardNumber.length();
                    float width = gVar.f69782r0.getWidth() / 428.0f;
                    int i10 = (int) ((gVar.f69784t0.yoff * width) - 6.0f);
                    for (int i11 = 0; i11 < length; i11++) {
                        canvas.drawText("" + gVar.f69784t0.cardNumber.charAt(i11), (int) (gVar.f69784t0.xoff[i11] * width), i10, paint);
                    }
                }
                Bitmap bitmap2 = CardIOActivity.M0;
                if (bitmap2 != null && !bitmap2.isRecycled()) {
                    CardIOActivity.M0.recycle();
                }
                g gVar2 = cardIOActivity.f69730p0;
                Bitmap bitmap3 = gVar2.f69782r0;
                if (bitmap3 == null || bitmap3.isRecycled()) {
                    bitmapCreateBitmap = null;
                } else {
                    Bitmap bitmap4 = gVar2.f69782r0;
                    bitmapCreateBitmap = Bitmap.createBitmap(bitmap4, 0, 0, bitmap4.getWidth(), gVar2.f69782r0.getHeight());
                }
                CardIOActivity.M0 = bitmapCreateBitmap;
            }
            CreditCard creditCard = cardIOActivity.f69733s0;
            if (creditCard != null) {
                intent.putExtra(CardIOActivity.EXTRA_SCAN_RESULT, creditCard);
                cardIOActivity.f69733s0 = null;
            } else {
                intent.putExtra("io.card.payment.manualEntryScanResult", true);
            }
            intent.putExtras(cardIOActivity.getIntent());
            intent.addFlags(1082195968);
            cardIOActivity.startActivityForResult(intent, 10);
        }
    }

    public class c implements View.OnClickListener {
        public c() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            String str = CardIOActivity.EXTRA_NO_CAMERA;
            CardIOActivity.this.b();
        }
    }

    public static boolean canReadCardWithCamera() {
        try {
            return j.a();
        } catch (CameraUnavailableException unused) {
            return false;
        } catch (RuntimeException unused2) {
            Log.w("CardIOActivity", "RuntimeException accessing Util.hardwareSupported()");
            return false;
        }
    }

    public static Bitmap getCapturedCardImage(Intent intent) {
        if (intent == null || !intent.hasExtra(EXTRA_CAPTURED_CARD_IMAGE)) {
            return null;
        }
        return BitmapFactory.decodeStream(new ByteArrayInputStream(intent.getByteArrayExtra(EXTRA_CAPTURED_CARD_IMAGE)), null, new BitmapFactory.Options());
    }

    public static Date sdkBuildDate() {
        return new Date(BuildConfig.BUILD_TIME);
    }

    public static String sdkVersion() {
        return BuildConfig.PRODUCT_VERSION;
    }

    public final void a(int i10) {
        CardScanner cardScanner;
        int i11;
        if (i10 < 0 || (cardScanner = this.I0) == null) {
            return;
        }
        int iC = i10 + cardScanner.c();
        if (iC > 360) {
            iC -= 360;
        }
        if (iC < 15 || iC > 345) {
            this.v0 = 1;
            i11 = 0;
        } else if (iC > 75 && iC < 105) {
            this.v0 = 4;
            i11 = 90;
        } else if (iC > 165 && iC < 195) {
            this.v0 = 2;
            i11 = 180;
        } else if (iC <= 255 || iC >= 285) {
            i11 = -1;
        } else {
            this.v0 = 3;
            i11 = 270;
        }
        if (i11 < 0 || i11 == this.f69735u0) {
            return;
        }
        this.I0.f69749u0 = this.v0;
        d(i11);
        if (i11 == 90) {
            c(270.0f);
        } else if (i11 == 270) {
            c(90.0f);
        } else {
            c(i11);
        }
    }

    public final void b() {
        Intent intent = getIntent();
        if (intent == null || !intent.getBooleanExtra(EXTRA_SUPPRESS_CONFIRMATION, false)) {
            new Handler().post(new b(intent));
            return;
        }
        Intent intent2 = new Intent(this, (Class<?>) DataEntryActivity.class);
        CreditCard creditCard = this.f69733s0;
        if (creditCard != null) {
            intent2.putExtra(EXTRA_SCAN_RESULT, creditCard);
            this.f69733s0 = null;
        }
        j.d(intent, intent2, this.f69730p0);
        setResult(RESULT_CONFIRMATION_SUPPRESSED, intent2);
        M0 = null;
        finish();
    }

    public final void c(float f6) {
        LinearLayout linearLayout = this.f69738y0;
        if (linearLayout != null) {
            RotateAnimation rotateAnimation = new RotateAnimation(0.0f, f6, linearLayout.getWidth() / 2, this.f69738y0.getHeight() / 2);
            rotateAnimation.setDuration(0L);
            rotateAnimation.setRepeatCount(0);
            rotateAnimation.setFillAfter(true);
            this.f69738y0.setAnimation(rotateAnimation);
        }
    }

    public final void d(int i10) {
        SurfaceView surfaceView = this.f69732r0.f69791r0;
        if (surfaceView == null) {
            Log.wtf("card.io", "surface view is null.. recovering... rotation might be weird.");
            return;
        }
        Rect rectB = this.I0.b(surfaceView.getWidth(), surfaceView.getHeight());
        this.f69734t0 = rectB;
        rectB.top = surfaceView.getTop() + rectB.top;
        Rect rect = this.f69734t0;
        rect.bottom = surfaceView.getTop() + rect.bottom;
        this.f69730p0.setGuideAndRotation(this.f69734t0, i10);
        this.f69735u0 = i10;
    }

    public final void e(boolean z10) {
        if (this.f69732r0 == null || this.f69730p0 == null || !this.I0.i(z10)) {
            return;
        }
        this.f69730p0.setTorchOn(z10);
    }

    public final void f() {
        FrameLayout frameLayout = new FrameLayout(this);
        this.G0 = frameLayout;
        frameLayout.setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
        this.G0.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        FrameLayout frameLayout2 = new FrameLayout(this);
        frameLayout2.setId(1);
        this.I0.getClass();
        this.I0.getClass();
        h hVar = new h(this, null);
        hVar.f69789p0 = 480;
        hVar.f69790q0 = 640;
        SurfaceView surfaceView = new SurfaceView(this);
        hVar.f69791r0 = surfaceView;
        hVar.addView(surfaceView);
        this.f69732r0 = hVar;
        hVar.setLayoutParams(new FrameLayout.LayoutParams(-1, -1, 48));
        frameLayout2.addView(this.f69732r0);
        g gVar = new g(this, !j.f69854a && getPackageManager().hasSystemFeature("android.hardware.camera.flash"));
        this.f69730p0 = gVar;
        gVar.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        if (getIntent() != null) {
            this.f69730p0.setUseCardIOLogo(getIntent().getBooleanExtra(EXTRA_USE_CARDIO_LOGO, false));
            int intExtra = getIntent().getIntExtra(EXTRA_GUIDE_COLOR, 0);
            if (intExtra != 0) {
                int i10 = (-16777216) | intExtra;
                if (intExtra != i10) {
                    Log.w("card.io", "Removing transparency from provided guide color.");
                }
                this.f69730p0.setGuideColor(i10);
            } else {
                this.f69730p0.setGuideColor(-16711936);
            }
            this.f69730p0.setHideCardIOLogo(getIntent().getBooleanExtra(EXTRA_HIDE_CARDIO_LOGO, false));
            String stringExtra = getIntent().getStringExtra(EXTRA_SCAN_INSTRUCTIONS);
            if (stringExtra != null) {
                this.f69730p0.setScanInstructions(stringExtra);
            }
        }
        frameLayout2.addView(this.f69730p0);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(10);
        layoutParams.addRule(2, 2);
        this.G0.addView(frameLayout2, layoutParams);
        RelativeLayout relativeLayout = new RelativeLayout(this);
        this.F0 = relativeLayout;
        relativeLayout.setGravity(80);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(12);
        this.F0.setLayoutParams(layoutParams2);
        this.F0.setId(2);
        this.F0.setGravity(85);
        if (!this.f69736w0) {
            Button button = new Button(this);
            button.setId(3);
            button.setText(LocalizedStrings.getString(StringKey.KEYBOARD));
            button.setOnClickListener(new c());
            this.F0.addView(button);
            ViewUtil.styleAsButton(button, false, this, this.H0);
            if (!this.H0) {
                button.setTextSize(14.0f);
            }
            button.setMinimumHeight(ViewUtil.typedDimensionValueToPixelsInt("42dip", this));
            RelativeLayout.LayoutParams layoutParams3 = (RelativeLayout.LayoutParams) button.getLayoutParams();
            layoutParams3.width = -2;
            layoutParams3.height = -2;
            layoutParams3.addRule(12);
            ViewUtil.setPadding(button, "16dip", null, "16dip", null);
            ViewUtil.setMargins(button, "4dip", "4dip", "4dip", "4dip");
        }
        RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams4.addRule(12);
        int i11 = (int) ((getResources().getDisplayMetrics().density * 15.0f) + 0.5f);
        layoutParams4.setMargins(0, i11, 0, i11);
        this.G0.addView(this.F0, layoutParams4);
        if (getIntent() != null) {
            LinearLayout linearLayout = this.f69738y0;
            if (linearLayout != null) {
                this.G0.removeView(linearLayout);
                this.f69738y0 = null;
            }
            int intExtra2 = getIntent().getIntExtra(EXTRA_SCAN_OVERLAY_LAYOUT_ID, -1);
            if (intExtra2 != -1) {
                LinearLayout linearLayout2 = new LinearLayout(this);
                this.f69738y0 = linearLayout2;
                linearLayout2.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                getLayoutInflater().inflate(intExtra2, this.f69738y0);
                this.G0.addView(this.f69738y0);
            }
        }
        setContentView(this.G0);
    }

    public final void g() {
        getWindow().getDecorView().setSystemUiVisibility(4);
        ActionBar actionBar = getActionBar();
        if (actionBar != null) {
            actionBar.hide();
        }
        try {
            this.f69734t0 = new Rect();
            this.v0 = 1;
            if (!getIntent().getBooleanExtra("io.card.payment.cameraBypassTestMode", false)) {
                this.I0 = new CardScanner(this, this.v0);
            } else {
                if (!getPackageName().contentEquals("io.card.development")) {
                    getPackageName();
                    throw new IllegalStateException("illegal access of private extra");
                }
                this.I0 = (CardScanner) Class.forName("io.card.payment.CardScannerTester").getConstructor(CardIOActivity.class, Integer.TYPE).newInstance(this, Integer.valueOf(this.v0));
            }
            this.I0.g();
            f();
            this.f69731q0 = new a(this);
        } catch (Exception unused) {
            Toast toastMakeText = Toast.makeText(this, LocalizedStrings.getString(StringKey.ERROR_CAMERA_UNEXPECTED_FAIL), 1);
            toastMakeText.setGravity(17, 0, -75);
            toastMakeText.show();
            this.J0 = true;
        }
    }

    public Rect getTorchRect() {
        g gVar = this.f69730p0;
        if (gVar == null) {
            return null;
        }
        return gVar.K0;
    }

    @Override // android.app.Activity
    public void onActivityResult(int i10, int i11, Intent intent) {
        super.onActivityResult(i10, i11, intent);
        String.format("onActivityResult(requestCode:%d, resultCode:%d, ...", Integer.valueOf(i10), Integer.valueOf(i11));
        if (i10 == 10 && i11 != 0) {
            if (i11 != RESULT_CARD_INFO && i11 != RESULT_ENTRY_CANCELED && !this.J0) {
                RelativeLayout relativeLayout = this.F0;
                if (relativeLayout != null) {
                    relativeLayout.setVisibility(0);
                    return;
                }
                return;
            }
            if (intent != null && intent.hasExtra(EXTRA_SCAN_RESULT)) {
                Objects.toString(intent.getParcelableExtra(EXTRA_SCAN_RESULT));
            }
            setResult(i11, intent);
            M0 = null;
            finish();
        }
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        if (!this.J0) {
            this.f69730p0.getClass();
        }
        if (this.I0 != null) {
            super.onBackPressed();
        }
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        String strConcat;
        super.onCreate(bundle);
        int i10 = L0 + 1;
        L0 = i10;
        if (i10 != 1) {
            String.format("INTERNAL WARNING: There are %d (not 1) CardIOActivity allocations!", Integer.valueOf(i10));
        }
        Intent intent = getIntent();
        boolean booleanExtra = getIntent().getBooleanExtra(EXTRA_KEEP_APPLICATION_THEME, false);
        this.H0 = booleanExtra;
        ActivityHelper.setActivityTheme(this, booleanExtra);
        LocalizedStrings.setLanguage(intent);
        this.f69737x0 = intent.getBooleanExtra(EXTRA_SUPPRESS_SCAN, false);
        ResolveInfo resolveInfoResolveActivity = getPackageManager().resolveActivity(intent, 65536);
        boolean z10 = j.f69854a;
        if (resolveInfoResolveActivity == null) {
            strConcat = String.format("Didn't find %s in the AndroidManifest.xml", CardIOActivity.class.getName());
        } else {
            strConcat = (resolveInfoResolveActivity.activityInfo.configChanges & 128) == 128 ? null : CardIOActivity.class.getName().concat(" requires attribute android:configChanges=\"orientation\"");
        }
        if (strConcat != null) {
            throw new RuntimeException(strConcat);
        }
        this.f69736w0 = intent.getBooleanExtra(EXTRA_SUPPRESS_MANUAL_ENTRY, false);
        if (bundle != null) {
            this.E0 = bundle.getBoolean("io.card.payment.waitingForPermission");
        }
        if (intent.getBooleanExtra("io.card.payment.noCamera", false)) {
            this.J0 = true;
            return;
        }
        if (CardScanner.G0 || !(CardScanner.nUseNeon() || CardScanner.nUseTegra() || CardScanner.nUseX86())) {
            this.J0 = true;
            return;
        }
        try {
            if (this.E0) {
                return;
            }
            if (checkSelfPermission("android.permission.CAMERA") == -1) {
                this.E0 = true;
                requestPermissions(new String[]{"android.permission.CAMERA"}, 11);
                return;
            }
            try {
                if (!j.a()) {
                    StringKey stringKey = StringKey.ERROR_NO_DEVICE_SUPPORT;
                    Log.w("card.io", stringKey + ": " + LocalizedStrings.getString(stringKey));
                    this.J0 = true;
                }
            } catch (CameraUnavailableException unused) {
                StringKey stringKey2 = StringKey.ERROR_CAMERA_CONNECT_FAIL;
                String string = LocalizedStrings.getString(stringKey2);
                Objects.toString(stringKey2);
                Toast toastMakeText = Toast.makeText(this, string, 1);
                toastMakeText.setGravity(17, 0, -75);
                toastMakeText.show();
                this.J0 = true;
            }
            if (!this.J0) {
                g();
            } else if (this.f69736w0) {
                setResult(RESULT_SCAN_NOT_AVAILABLE, null);
                M0 = null;
                finish();
            }
        } catch (Exception unused2) {
            Toast toastMakeText2 = Toast.makeText(this, LocalizedStrings.getString(StringKey.ERROR_CAMERA_UNEXPECTED_FAIL), 1);
            toastMakeText2.setGravity(17, 0, -75);
            toastMakeText2.show();
            this.J0 = true;
        }
    }

    @Override // android.app.Activity
    public void onDestroy() {
        this.f69730p0 = null;
        L0--;
        a aVar = this.f69731q0;
        if (aVar != null) {
            aVar.disable();
        }
        e(false);
        CardScanner cardScanner = this.I0;
        if (cardScanner != null) {
            cardScanner.a();
            this.I0 = null;
        }
        super.onDestroy();
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        a aVar = this.f69731q0;
        if (aVar != null) {
            aVar.disable();
        }
        e(false);
        CardScanner cardScanner = this.I0;
        if (cardScanner != null) {
            cardScanner.f();
        }
    }

    @Override // android.app.Activity
    public void onRequestPermissionsResult(int i10, String[] strArr, int[] iArr) {
        if (i10 != 11) {
            return;
        }
        this.E0 = false;
        if (iArr.length <= 0 || iArr[0] != 0) {
            this.J0 = true;
        } else {
            g();
        }
        onResume();
    }

    @Override // android.app.Activity
    public void onResume() {
        super.onResume();
        if (this.E0) {
            return;
        }
        if (this.J0) {
            b();
            return;
        }
        boolean z10 = j.f69854a;
        Debug.getNativeHeapFreeSize();
        Debug.getNativeHeapAllocatedSize();
        Debug.getNativeHeapSize();
        getWindow().addFlags(1024);
        getWindow().addFlags(128);
        ActivityHelper.setFlagSecure(this);
        setRequestedOrientation(1);
        this.f69731q0.enable();
        this.f69733s0 = null;
        boolean zH = this.I0.h(this.f69732r0.f69791r0.getHolder());
        if (zH) {
            this.F0.setVisibility(0);
        }
        if (zH) {
            e(false);
        } else {
            Toast.makeText(this, LocalizedStrings.getString(StringKey.ERROR_CAMERA_UNEXPECTED_FAIL), 1).show();
            b();
        }
        a(this.f69735u0);
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("io.card.payment.waitingForPermission", this.E0);
    }
}
