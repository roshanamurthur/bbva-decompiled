package com.facetec.sdk;

import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.PorterDuff;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.graphics.drawable.RoundedBitmapDrawable;
import androidx.core.graphics.drawable.RoundedBitmapDrawableFactory;
import com.bbva.androidtoolkit.utils.PluginUtils;
import java.util.Locale;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public final class ct extends aq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    TextView f41032a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    ImageView f41033b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    LinearLayout f41034c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    LinearLayout f41035d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    TextView f41036e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    Bitmap f41037f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    TextView f41038g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    cy f41039h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private ImageView f41040i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    TextView f41041j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private LinearLayout f41042k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private ImageView f41043l;
    private ImageView m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private ImageView f41044n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private LinearLayout f41045o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private TextView f41046p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private TextView f41047q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private TextView f41048r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private RoundedBitmapDrawable f41049s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private LinearLayout f41050t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private boolean f41051u = false;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private GradientDrawable f41052y;

    /* JADX INFO: renamed from: com.facetec.sdk.ct$2, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass2 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f41053b;

        static {
            int[] iArr = new int[cv.values().length];
            f41053b = iArr;
            try {
                iArr[cv.LIGHTING_AND_NEUTRAL_EXPRESSION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f41053b[cv.LIGHTING_ONLY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f41053b[cv.NEUTRAL_EXPRESSION_ONLY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f41053b[cv.BLURRY_ONLY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    private static boolean b(df dfVar) {
        for (int i10 = 0; i10 < dc.f41159c.length(); i10++) {
            try {
                JSONObject jSONObject = dc.f41159c.getJSONObject(i10);
                String string = jSONObject.getString("overrideKey");
                df dfVar2 = (df) jSONObject.get("type");
                if (FaceTecSDK.f40106a.f40094t.get(string) != null && FaceTecSDK.f40106a.f40094t.get(string).equals(jSONObject.getString("overrideValue")) && dfVar2 == dfVar) {
                    return true;
                }
            } catch (Exception unused) {
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void bk_(ValueAnimator valueAnimator) {
        if (isAdded()) {
            this.m.setColorFilter(((Integer) valueAnimator.getAnimatedValue()).intValue(), PorterDuff.Mode.SRC_IN);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void bl_(ValueAnimator valueAnimator) {
        if (isAdded()) {
            this.f41052y.setStroke(db.k(), ((Integer) valueAnimator.getAnimatedValue()).intValue());
            this.f41040i.setBackground(this.f41052y);
            this.f41043l.setBackground(this.f41052y);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void bm_(ValueAnimator valueAnimator) {
        if (isAdded()) {
            this.f41032a.setTextColor(((Integer) valueAnimator.getAnimatedValue()).intValue());
            this.f41038g.setTextColor(((Integer) valueAnimator.getAnimatedValue()).intValue());
            this.f41041j.setTextColor(((Integer) valueAnimator.getAnimatedValue()).intValue());
            this.f41047q.setTextColor(((Integer) valueAnimator.getAnimatedValue()).intValue());
            this.f41048r.setTextColor(((Integer) valueAnimator.getAnimatedValue()).intValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void bn_(ValueAnimator valueAnimator) {
        if (isAdded()) {
            this.f41036e.setTextColor(((Integer) valueAnimator.getAnimatedValue()).intValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d(final int i10, final int i11, final Runnable runnable) {
        this.f41034c.animate().alpha(1.0f).setDuration(i10).setStartDelay(i11).setListener(null).withEndAction(new aq.b(new Runnable() { // from class: com.facetec.sdk.m7
            @Override // java.lang.Runnable
            public final void run() {
                this.f42406p0.b(i10, i11, runnable);
            }
        })).start();
    }

    public final void a() {
        Resources resources;
        int identifier;
        Bitmap bitmap = this.f41037f;
        if (bitmap != null) {
            float height = bitmap.getHeight() / this.f41037f.getWidth();
            if (height <= 1.776f) {
                float height2 = this.f41037f.getHeight() / 1.776f;
                if (this.f41037f.getWidth() - height2 > 0.0f) {
                    Bitmap bitmap2 = this.f41037f;
                    this.f41037f = Bitmap.createBitmap(bitmap2, (int) ((bitmap2.getWidth() - height2) / 2.0f), 0, (int) height2, this.f41037f.getHeight());
                }
            } else if (height > 1.776f) {
                float width = this.f41037f.getWidth() * 1.776f;
                if (this.f41037f.getHeight() - width > 0.0f) {
                    Bitmap bitmap3 = this.f41037f;
                    this.f41037f = Bitmap.createBitmap(bitmap3, 0, (int) ((bitmap3.getHeight() - width) / 2.0f), this.f41037f.getWidth(), (int) width);
                }
            }
            int width2 = (int) (((double) this.f41037f.getWidth()) * 0.75d);
            int height3 = (int) (((double) this.f41037f.getHeight()) * 0.75d);
            Bitmap bitmap4 = this.f41037f;
            this.f41037f = Bitmap.createBitmap(bitmap4, (bitmap4.getWidth() - width2) / 2, (this.f41037f.getHeight() - height3) / 2, width2, height3);
            this.f41049s = RoundedBitmapDrawableFactory.create(getResources(), this.f41037f);
        }
        if (b(df.YOUR_ZOOM_IMAGE_OVERRIDE) && (identifier = (resources = getResources()).getIdentifier("zoom_your_zoom_image_override", PluginUtils.IDENTIFIER_DRAWABLE, getActivity().getPackageName())) != 0) {
            Bitmap bitmapDecodeResource = BitmapFactory.decodeResource(resources, identifier);
            this.f41037f = bitmapDecodeResource;
            this.f41049s = RoundedBitmapDrawableFactory.create(resources, bitmapDecodeResource);
        }
        if (!bd.f40494c) {
            this.f41033b.setScaleX(-1.0f);
        }
        this.f41033b.setImageDrawable(this.f41049s);
    }

    public final TextView bj_() {
        return this.f41036e;
    }

    @Override // com.facetec.sdk.aq, android.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    @Override // android.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.facetec_retry_screen_center_content_fragment, viewGroup, false);
    }

    @Override // android.app.Fragment
    public final void onStart() {
        super.onStart();
        b(new y5(this, 3), 100L);
    }

    @Override // android.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f41042k = (LinearLayout) view.findViewById(R.id.contentLayout);
        this.f41036e = (TextView) view.findViewById(R.id.headerTextView);
        this.f41032a = (TextView) view.findViewById(R.id.messageTextView);
        this.f41038g = (TextView) view.findViewById(R.id.instructionMessage1TextView);
        this.f41041j = (TextView) view.findViewById(R.id.instructionMessage2TextView);
        this.f41048r = (TextView) view.findViewById(R.id.yourZoomSubimageTextView);
        this.f41047q = (TextView) view.findViewById(R.id.idealZoomSubimageTextView);
        this.f41033b = (ImageView) view.findViewById(R.id.yourZoomImage);
        this.f41044n = (ImageView) view.findViewById(R.id.idealZoomImage);
        this.f41043l = (ImageView) view.findViewById(R.id.idealZoomImageBorder);
        this.f41040i = (ImageView) view.findViewById(R.id.yourZoomImageBorder);
        this.m = (ImageView) view.findViewById(R.id.idealOval);
        this.f41039h = (cy) view.findViewById(R.id.idealImageSlideshowView);
        this.f41046p = (TextView) view.findViewById(R.id.cancelButtonSpacer);
        this.f41035d = (LinearLayout) view.findViewById(R.id.idealZoomLayout);
        this.f41034c = (LinearLayout) view.findViewById(R.id.yourZoomLayout);
        this.f41050t = (LinearLayout) view.findViewById(R.id.sideBySideLayout);
        this.f41045o = (LinearLayout) view.findViewById(R.id.headerAndSubheaderLayout);
        this.f41032a.setImportantForAccessibility(1);
        this.f41038g.setImportantForAccessibility(1);
        this.f41041j.setImportantForAccessibility(1);
        if (db.aQ().length != 0) {
            this.f41044n.setVisibility(4);
        }
        db.c(new Object[]{this.f41036e, db.e(true, false)}, 338356619, -338356598, (int) System.currentTimeMillis());
        TextView textView = this.f41032a;
        Boolean bool = Boolean.TRUE;
        db.c(new Object[]{textView, (String) db.c(new Object[]{bool, Boolean.FALSE}, 583844572, -583844543, (int) System.currentTimeMillis())}, 338356619, -338356598, (int) System.currentTimeMillis());
        String strB = db.b(true);
        String strC = db.c(true);
        int i10 = AnonymousClass2.f41053b[ch.t().ordinal()];
        if (i10 != 2) {
            if (i10 == 3) {
                this.f41041j.setVisibility(8);
            } else if (i10 == 4) {
                strB = db.e(true);
                this.f41041j.setVisibility(8);
            }
            strC = "";
        } else {
            this.f41038g.setVisibility(8);
            strB = "";
        }
        this.f41038g.setText(strB);
        this.f41041j.setText(strC);
        this.f41048r.setText((String) db.c(new Object[]{bool}, -1974881617, 1974881650, (int) System.currentTimeMillis()));
        this.f41047q.setText(db.d(true));
        this.f41048r.setImportantForAccessibility(2);
        this.f41047q.setImportantForAccessibility(2);
        this.f41034c.setImportantForAccessibility(1);
        this.f41034c.setContentDescription(this.f41048r.getText());
        this.f41035d.setImportantForAccessibility(1);
        this.f41035d.setContentDescription(this.f41047q.getText());
        this.f41036e.setTypeface(db.bA_());
        this.f41032a.setTypeface(db.bz_());
        this.f41038g.setTypeface(db.bB_());
        this.f41041j.setTypeface(db.bB_());
        this.f41048r.setTypeface(db.bB_());
        this.f41047q.setTypeface(db.bB_());
        this.f41036e.setLineSpacing(0.0f, 1.1f);
        this.f41032a.setLineSpacing(0.0f, 1.1f);
        this.f41038g.setLineSpacing(0.0f, 1.1f);
        this.f41041j.setLineSpacing(0.0f, 1.1f);
        this.f41036e.setTextColor(db.j(getActivity()));
        this.f41032a.setTextColor(db.h(getActivity()));
        this.f41038g.setTextColor(db.h(getActivity()));
        this.f41041j.setTextColor(db.h(getActivity()));
        this.f41048r.setTextColor(db.h(getActivity()));
        this.f41047q.setTextColor(db.h(getActivity()));
        float fC = db.c() * db.d();
        float f6 = 28.0f * fC;
        float f10 = fC * 20.0f;
        this.f41036e.setTextSize(2, f6);
        this.f41032a.setTextSize(2, f10);
        this.f41038g.setTextSize(2, f10);
        this.f41041j.setTextSize(2, f10);
        this.f41048r.setTextSize(2, f10);
        this.f41047q.setTextSize(2, f10);
        this.f41037f = null;
        this.f41049s = null;
        FaceTecSessionActivity faceTecSessionActivity = (FaceTecSessionActivity) getActivity();
        if (faceTecSessionActivity == null) {
            return;
        }
        Bitmap bitmap = faceTecSessionActivity.f40523t;
        if (bitmap != null) {
            this.f41037f = bitmap;
        }
        Resources resources = getResources();
        getActivity();
        Bitmap bitmapDecodeResource = BitmapFactory.decodeResource(resources, db.aM());
        a();
        this.f41044n.setImageDrawable(RoundedBitmapDrawableFactory.create(resources, bitmapDecodeResource));
        GradientDrawable gradientDrawable = new GradientDrawable();
        this.f41052y = gradientDrawable;
        gradientDrawable.setCornerRadius(ay.e((int) (db.z() * db.d())));
        this.f41052y.setStroke((int) ay.e(Math.max(db.k() == 0 ? 0 : 1, (int) (db.k() * db.d()))), ((Integer) db.c(new Object[]{getActivity()}, -188757680, 188757724, (int) System.currentTimeMillis())).intValue());
        this.f41052y.setColor(0);
        RoundedBitmapDrawable roundedBitmapDrawableCreate = RoundedBitmapDrawableFactory.create(resources, bitmapDecodeResource);
        roundedBitmapDrawableCreate.setAlpha(0);
        this.f41043l.setImageDrawable(roundedBitmapDrawableCreate);
        this.f41043l.setBackground(this.f41052y);
        this.f41040i.setImageDrawable(roundedBitmapDrawableCreate);
        this.f41040i.setBackground(this.f41052y);
        this.f41033b.setBackground(this.f41052y);
        this.f41044n.setBackground(this.f41052y);
        this.f41033b.setClipToOutline(true);
        this.f41044n.setClipToOutline(true);
        ImageView imageView = this.f41033b;
        ViewOutlineProvider viewOutlineProvider = ViewOutlineProvider.BACKGROUND;
        imageView.setOutlineProvider(viewOutlineProvider);
        this.f41044n.setOutlineProvider(viewOutlineProvider);
        this.m.setColorFilter(db.q(getActivity()), PorterDuff.Mode.SRC_IN);
        float fC2 = db.c() * db.d();
        int iE = db.e();
        float f11 = iE;
        int iRound = Math.round(f11 / 2.0f);
        int iRound2 = (int) Math.round(((double) faceTecSessionActivity.f40517n) * 0.45d);
        Bitmap bitmap2 = this.f41037f;
        if (bitmap2 != null) {
            float height = bitmap2.getHeight() / this.f41037f.getWidth();
            if (db.a() >= height) {
                iRound2 = Math.round((Math.round(Math.round(faceTecSessionActivity.f40511g) - (f11 * 3.0f)) / 2.0f) * height);
            }
        }
        ((ViewGroup.MarginLayoutParams) ((LinearLayout.LayoutParams) this.f41036e.getLayoutParams())).bottomMargin = Math.round(ay.e(5) * fC2);
        int iRound3 = Math.round(ay.e(5) * fC2);
        ((ViewGroup.MarginLayoutParams) ((LinearLayout.LayoutParams) this.f41047q.getLayoutParams())).topMargin = iRound3;
        ((ViewGroup.MarginLayoutParams) ((LinearLayout.LayoutParams) this.f41048r.getLayoutParams())).topMargin = iRound3;
        ((ViewGroup.MarginLayoutParams) ((LinearLayout.LayoutParams) this.f41050t.getLayoutParams())).topMargin = Math.round(ay.e(5) * fC2);
        ((FrameLayout) view.findViewById(R.id.idealZoomImageContainer)).getLayoutParams().height = iRound2;
        ((FrameLayout) view.findViewById(R.id.yourZoomImageContainer)).getLayoutParams().height = iRound2;
        ((LinearLayout.LayoutParams) this.f41034c.getLayoutParams()).setMarginEnd(iRound);
        ((LinearLayout.LayoutParams) this.f41035d.getLayoutParams()).setMarginStart(iRound);
        view.setPadding(iE, iE, iE, 0);
    }

    private void c() {
        float f6;
        float f10;
        float fD = db.d() * db.c();
        int iRound = Math.round(db.e() * db.d());
        int measuredHeight = this.f41042k.getMeasuredHeight();
        if (Locale.getDefault().getLanguage().equals("ar")) {
            f6 = 0.08f;
            f10 = 0.09f;
        } else {
            f6 = 0.06f;
            f10 = 0.07f;
        }
        float f11 = measuredHeight;
        int iRound2 = Math.round(f6 * f11);
        if (db.a() < 1.4d && Resources.getSystem().getDisplayMetrics().heightPixels < 900) {
            iRound2 = Math.round(f11 * f10);
        }
        int iRound3 = (int) Math.round(((double) iRound2) * 0.85d);
        int iRound4 = (int) Math.round(((double) iRound3) * 0.85d);
        int height = this.f41044n.getHeight() + iRound4 + ((ViewGroup.MarginLayoutParams) ((LinearLayout.LayoutParams) this.f41047q.getLayoutParams())).topMargin;
        this.f41045o.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f41050t.getLayoutParams();
        ((ViewGroup.LayoutParams) layoutParams).height = height;
        layoutParams.weight = 0.0f;
        this.f41050t.setLayoutParams(layoutParams);
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f41036e.getLayoutParams();
        ((ViewGroup.LayoutParams) layoutParams2).height = iRound2;
        layoutParams2.weight = 0.0f;
        this.f41036e.setLayoutParams(layoutParams2);
        LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) this.f41032a.getLayoutParams();
        ((ViewGroup.LayoutParams) layoutParams3).height = iRound3;
        layoutParams3.weight = 0.0f;
        this.f41032a.setLayoutParams(layoutParams3);
        this.f41038g.setLayoutParams(layoutParams3);
        this.f41041j.setLayoutParams(layoutParams3);
        LinearLayout.LayoutParams layoutParams4 = (LinearLayout.LayoutParams) this.f41047q.getLayoutParams();
        ((ViewGroup.LayoutParams) layoutParams4).height = iRound4;
        this.f41047q.setLayoutParams(layoutParams4);
        this.f41048r.setLayoutParams(layoutParams4);
        int width = this.f41036e.getWidth();
        if (db.bj()) {
            int iRound5 = Math.round(ay.e(35) * fD);
            int[] iArr = new int[2];
            this.f41046p.getLocationInWindow(iArr);
            int iRound6 = (int) (((long) (iArr[1] + iRound5)) - Math.round(((double) iRound) / 2.0d));
            int[] iArr2 = new int[2];
            this.f41036e.getLocationInWindow(iArr2);
            if (iArr2[1] < iRound6) {
                width -= iRound5 << 1;
            }
        }
        ay.b bVar = new ay.b(width, iRound2);
        ay.b bVar2 = new ay.b(this.f41032a.getWidth(), iRound3);
        ay.b bVar3 = new ay.b(this.f41038g.getWidth(), iRound3);
        ay.b bVar4 = new ay.b(this.f41041j.getWidth(), iRound3);
        ay.b bVar5 = new ay.b(this.f41047q.getWidth(), iRound4);
        ay.b bVar6 = new ay.b(this.f41048r.getWidth(), iRound4);
        int iRound7 = Math.round(ay.c(8));
        int iRound8 = Math.round(ay.c(40));
        int iRound9 = Math.round(ay.c(5));
        int iRound10 = Math.round(ay.c(36));
        int iY_ = ay.Y_(this.f41036e, bVar, iRound7, iRound8);
        int iY_2 = ay.Y_(this.f41032a, bVar2, iRound9, iRound10);
        int iY_3 = ay.Y_(this.f41038g, bVar3, iRound9, iRound10);
        int iY_4 = ay.Y_(this.f41041j, bVar4, iRound9, iRound10);
        int iY_5 = ay.Y_(this.f41047q, bVar5, iRound9, iRound10);
        int iY_6 = ay.Y_(this.f41048r, bVar6, iRound9, iRound10);
        int iRound11 = (int) Math.round(((double) iY_) * 0.85d);
        if (iY_2 >= iRound11) {
            iY_2 = iRound11;
        }
        if (this.f41038g.getText().toString().isEmpty() || iY_3 >= iY_2) {
            iY_3 = iY_2;
        }
        if (this.f41041j.getText().toString().isEmpty() || iY_4 >= iY_3) {
            iY_4 = iY_3;
        }
        int iRound12 = (int) Math.round(((double) iY_4) * 0.85d);
        if (iY_5 >= iY_4) {
            iY_5 = iRound12;
        }
        if (iY_6 >= iY_4) {
            iY_6 = iY_5;
        }
        this.f41036e.setTextSize(0, iY_);
        float f12 = iY_4;
        this.f41032a.setTextSize(0, f12);
        this.f41038g.setTextSize(0, f12);
        this.f41041j.setTextSize(0, f12);
        float f13 = iY_6;
        this.f41047q.setTextSize(0, f13);
        this.f41048r.setTextSize(0, f13);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e() {
        c();
        this.f41036e.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.facetec.sdk.g7
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                this.f41743p0.f();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void f() {
        if (this.f41051u) {
            return;
        }
        this.f41051u = true;
        c();
    }

    public final void e(final Runnable runnable) {
        if (dn.d()) {
            this.f41032a.setAlpha(1.0f);
            this.f41036e.setAlpha(1.0f);
            this.f41034c.setAlpha(1.0f);
            this.f41035d.setAlpha(1.0f);
            this.f41041j.setAlpha(1.0f);
            this.f41038g.setAlpha(1.0f);
            new aq.b(runnable).run();
            return;
        }
        this.f41032a.animate().alpha(1.0f).setDuration(500L).setListener(null).start();
        this.f41036e.animate().alpha(1.0f).setDuration(500L).setListener(null).withEndAction(new aq.b(new Runnable() { // from class: com.facetec.sdk.l7
            @Override // java.lang.Runnable
            public final void run() {
                this.f42247p0.d(500, 300, runnable);
            }
        })).start();
    }

    public final void b() {
        ValueAnimator valueAnimatorOfObject = ValueAnimator.ofObject(new ArgbEvaluator(), Integer.valueOf(this.f41036e.getCurrentTextColor()), Integer.valueOf(db.j(getActivity())));
        valueAnimatorOfObject.setDuration(1000L);
        valueAnimatorOfObject.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.facetec.sdk.h7
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f41862a.bn_(valueAnimator);
            }
        });
        valueAnimatorOfObject.start();
        ValueAnimator valueAnimatorOfObject2 = ValueAnimator.ofObject(new ArgbEvaluator(), Integer.valueOf(this.f41032a.getCurrentTextColor()), Integer.valueOf(db.h(getActivity())));
        valueAnimatorOfObject2.setDuration(1000L);
        valueAnimatorOfObject2.addUpdateListener(new k0(this, 2));
        valueAnimatorOfObject2.start();
        ValueAnimator valueAnimatorOfObject3 = ValueAnimator.ofObject(new ArgbEvaluator(), Integer.valueOf(db.e(getActivity(), FaceTecSDK.f40106a.f40086i.retryScreenImageBorderColor)), Integer.valueOf(((Integer) db.c(new Object[]{getActivity()}, -188757680, 188757724, (int) System.currentTimeMillis())).intValue()));
        valueAnimatorOfObject3.setDuration(1000L);
        valueAnimatorOfObject3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.facetec.sdk.i7
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f41879a.bl_(valueAnimator);
            }
        });
        valueAnimatorOfObject3.start();
        ValueAnimator valueAnimatorOfObject4 = ValueAnimator.ofObject(new ArgbEvaluator(), Integer.valueOf(db.e(getActivity(), FaceTecSDK.f40106a.f40086i.retryScreenOvalStrokeColor)), Integer.valueOf(db.q(getActivity())));
        valueAnimatorOfObject4.setDuration(1000L);
        valueAnimatorOfObject4.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.facetec.sdk.j7
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f41897a.bk_(valueAnimator);
            }
        });
        valueAnimatorOfObject4.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e(int i10, int i11, Runnable runnable) {
        long j10 = i10;
        long j11 = i11;
        this.f41041j.animate().alpha(1.0f).setDuration(j10).setStartDelay(j11).setListener(null).start();
        this.f41038g.animate().alpha(1.0f).setDuration(j10).setStartDelay(j11).setListener(null).withEndAction(new aq.b(runnable));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(final int i10, final int i11, final Runnable runnable) {
        this.f41035d.animate().alpha(1.0f).setDuration(i10).setStartDelay(i11).setListener(null).withEndAction(new aq.b(new Runnable() { // from class: com.facetec.sdk.k7
            @Override // java.lang.Runnable
            public final void run() {
                this.f41976p0.e(i10, i11, runnable);
            }
        })).start();
    }
}
