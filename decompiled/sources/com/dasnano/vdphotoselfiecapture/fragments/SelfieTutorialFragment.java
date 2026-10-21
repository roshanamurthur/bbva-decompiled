package com.dasnano.vdphotoselfiecapture.fragments;

import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.core.text.HtmlCompat;
import androidx.viewpager.widget.ViewPager;
import com.bbva.androidtoolkit.utils.PluginUtils;
import com.dasnano.vdphotoselfiecapture.R;
import com.dasnano.vdphotoselfiecapture.TutorialAdapter;
import com.dasnano.vdphotoselfiecapture.TutorialItem;
import com.dasnano.vdphotoselfiecapture.config.VDPhotoSelfieConfiguration;
import com.dasnano.vdphotoselfiecapture.model.VDPhotoSelfieViewModel;
import com.veridas.config.IllegalColorValueException;
import com.veridas.config.PropertyNameNotFoundException;
import com.veridas.display.DisplayOrientation;
import com.veridas.fragment.DasFragment;
import com.veridas.fragment.FragmentLifecycleAdapter;
import com.veridas.log.Log;
import com.veridas.logger.Logger;
import com.veridas.logger.VDLogger;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes9.dex */
public class SelfieTutorialFragment extends DasFragment<VDPhotoSelfieConfiguration, VDPhotoSelfieViewModel> {
    public static final String TUTORIAL_FINISHED = "com.veridas.selfieCapture.selfieTutorialFragment.tutorialFinished";
    public boolean E0;
    public boolean F0;
    public boolean G0;
    public boolean H0;
    public boolean I0;
    public int J0;
    public int K0;
    public int L0;
    public int M0;
    public int N0;
    public String O0;
    public String P0;
    public String Q0;
    public String R0;
    public String S0;
    public String T0;
    public String U0;
    public String V0;
    public String W0;
    public String X0;
    public String Y0;
    public int Z0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public TutorialAdapter f39634u0;
    public ViewPager v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public LinearLayout f39635w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public volatile Point f39636x0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public ImageButton f39632s0 = null;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public boolean f39633t0 = false;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public final a f39637y0 = new a();

    public class b extends FragmentLifecycleAdapter {
        public b() {
        }

        @Override // com.veridas.fragment.FragmentLifecycleAdapter, com.veridas.fragment.FragmentLifecycleListener
        public final void onBeforeCreated(DasFragment dasFragment, Bundle bundle) {
            SelfieTutorialFragment selfieTutorialFragment = SelfieTutorialFragment.this;
            selfieTutorialFragment.f39636x0 = selfieTutorialFragment.getDisplaySize();
        }

        @Override // com.veridas.fragment.FragmentLifecycleAdapter, com.veridas.fragment.FragmentLifecycleListener
        public final void onCreated(DasFragment dasFragment, Bundle bundle) {
            SelfieTutorialFragment.a(SelfieTutorialFragment.this);
        }

        @Override // com.veridas.fragment.FragmentLifecycleAdapter, com.veridas.fragment.FragmentLifecycleListener
        public final void onDestroyed(DasFragment dasFragment) {
            SelfieTutorialFragment selfieTutorialFragment = SelfieTutorialFragment.this;
            selfieTutorialFragment.f39632s0 = null;
            selfieTutorialFragment.f39634u0 = null;
            selfieTutorialFragment.v0 = null;
            selfieTutorialFragment.f39635w0 = null;
        }

        @Override // com.veridas.fragment.FragmentLifecycleAdapter, com.veridas.fragment.FragmentLifecycleListener
        public final void onPaused(DasFragment dasFragment) {
            Logger.Tag tag = Logger.Tag.ON_PAUSE;
            String str = SelfieTutorialFragment.TUTORIAL_FINISHED;
            VDLogger.log(tag, "On paused called in: %s", "SelfieTutorialFragment");
        }

        @Override // com.veridas.fragment.FragmentLifecycleAdapter, com.veridas.fragment.FragmentLifecycleListener
        public final void onResumed(DasFragment dasFragment) {
            Logger.Tag tag = Logger.Tag.ON_RESUME;
            String str = SelfieTutorialFragment.TUTORIAL_FINISHED;
            VDLogger.log(tag, "On resumed called in: %s", "SelfieTutorialFragment");
        }
    }

    public class c implements View.OnClickListener {
        public c() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            ViewPager viewPager = SelfieTutorialFragment.this.v0;
            viewPager.setCurrentItem(viewPager.getCurrentItem() + 1, true);
        }
    }

    public class d implements View.OnClickListener {
        public d() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            ViewPager viewPager = SelfieTutorialFragment.this.v0;
            viewPager.setCurrentItem(viewPager.getCurrentItem() - 1, true);
        }
    }

    public class e implements View.OnClickListener {
        public e() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            String str = SelfieTutorialFragment.TUTORIAL_FINISHED;
            SelfieTutorialFragment selfieTutorialFragment = SelfieTutorialFragment.this;
            selfieTutorialFragment.getClass();
            Intent intent = new Intent("com.veridas.selfieCapture.selfieTutorialFragment.tutorialFinished");
            intent.putExtra("com.veridas.selfieCapture.selfieTutorialFragment.tutorialFinished", true);
            selfieTutorialFragment.broadcastIntent(intent);
        }
    }

    public SelfieTutorialFragment() {
        addLifecycleListener(new b());
    }

    public static void a(SelfieTutorialFragment selfieTutorialFragment) {
        VDPhotoSelfieConfiguration configuration = selfieTutorialFragment.getConfiguration();
        try {
            selfieTutorialFragment.O0 = configuration.getString("closebuttonimage");
            selfieTutorialFragment.E0 = configuration.getString("closebutton").equalsIgnoreCase("YES");
            selfieTutorialFragment.F0 = !configuration.getString("closebuttonimage").equals("undefined");
            selfieTutorialFragment.J0 = configuration.getColor(VDPhotoSelfieConfiguration.SELFIE_TUTORIAL_BACKGROUND_COLOR);
            selfieTutorialFragment.K0 = configuration.getColor(VDPhotoSelfieConfiguration.SELFIE_TUTORIAL_CONTINUE_BUTTON_TEXT_COLOR);
            selfieTutorialFragment.P0 = configuration.getString(VDPhotoSelfieConfiguration.SELFIE_TUTORIAL_CONTINUE_BUTTON_TEXT);
            selfieTutorialFragment.Q0 = configuration.getString(VDPhotoSelfieConfiguration.SELFIE_TUTORIAL_STEP1_TITLE);
            selfieTutorialFragment.R0 = configuration.getString(VDPhotoSelfieConfiguration.SELFIE_TUTORIAL_STEP2_TITLE);
            selfieTutorialFragment.S0 = configuration.getString(VDPhotoSelfieConfiguration.SELFIE_NGAS_TUTORIAL_STEP3_TITLE);
            selfieTutorialFragment.T0 = configuration.getString(VDPhotoSelfieConfiguration.SELFIE_SMILE_TUTORIAL_STEP3_TITLE);
            selfieTutorialFragment.U0 = configuration.getString(VDPhotoSelfieConfiguration.SELFIE_TUTORIAL_STEP1_DESCRIPTION);
            selfieTutorialFragment.V0 = configuration.getString(VDPhotoSelfieConfiguration.SELFIE_TUTORIAL_STEP2_DESCRIPTION);
            selfieTutorialFragment.W0 = configuration.getString(VDPhotoSelfieConfiguration.SELFIE_NGAS_TUTORIAL_STEP3_DESCRIPTION);
            selfieTutorialFragment.X0 = configuration.getString(VDPhotoSelfieConfiguration.SELFIE_SMILE_TUTORIAL_STEP3_DESCRIPTION);
            selfieTutorialFragment.Y0 = configuration.getString(VDPhotoSelfieConfiguration.SELFIE_TUTORIAL_GENERAL_TITLE);
            selfieTutorialFragment.Z0 = configuration.getColor(VDPhotoSelfieConfiguration.SELFIE_TUTORIAL_GENERAL_TITLE_COLOR);
            selfieTutorialFragment.G0 = configuration.getBoolean(VDPhotoSelfieConfiguration.VERIDAS_LOGO_SHOW);
            selfieTutorialFragment.L0 = configuration.getColor(VDPhotoSelfieConfiguration.SELFIE_TUTORIAL_CURRENT_POINT_COLOR);
            selfieTutorialFragment.M0 = configuration.getColor(VDPhotoSelfieConfiguration.SELFIE_TUTORIAL_CONTINUE_BUTTON_FIRST_GRADIENT_COLOR);
            selfieTutorialFragment.N0 = configuration.getColor(VDPhotoSelfieConfiguration.SELFIE_TUTORIAL_CONTINUE_BUTTON_SECOND_GRADIENT_COLOR);
            boolean z10 = configuration.getBoolean(VDPhotoSelfieConfiguration.LIVE_PHOTO);
            selfieTutorialFragment.H0 = z10;
            selfieTutorialFragment.I0 = z10 && !configuration.getString(VDPhotoSelfieConfiguration.JWS_TOKEN).isEmpty();
        } catch (IllegalColorValueException e5) {
            e = e5;
            Log.e("SelfieTutorialFragment", e);
        } catch (PropertyNameNotFoundException e7) {
            e = e7;
            Log.e("SelfieTutorialFragment", e);
        }
        selfieTutorialFragment.f39633t0 = ((VDPhotoSelfieViewModel) selfieTutorialFragment.viewModel).getDisplayOrientation() == DisplayOrientation.LANDSCAPE;
    }

    public final void b(int i10) {
        ArrayList arrayList = new ArrayList();
        this.f39635w0.removeAllViews();
        Resources resources = getResources();
        DisplayMetrics displayMetrics = resources.getDisplayMetrics();
        int iApplyDimension = (int) TypedValue.applyDimension(1, 8.0f, displayMetrics);
        int iApplyDimension2 = (int) TypedValue.applyDimension(1, 14.0f, displayMetrics);
        int i11 = R.drawable.vd_photo_slide_circle;
        Drawable drawable = resources.getDrawable(i11);
        int color = resources.getColor(R.color.vd_photo_gray_tutorial_points_color);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        drawable.setColorFilter(color, mode);
        Drawable drawable2 = resources.getDrawable(i11);
        drawable2.setColorFilter(this.L0, mode);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(iApplyDimension, iApplyDimension);
        layoutParams.setMargins(4, 4, 4, 4);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(iApplyDimension2, iApplyDimension2);
        layoutParams2.setMargins(4, 4, 4, 4);
        for (int i12 = 0; i12 < this.f39634u0.getCount(); i12++) {
            arrayList.add(new View(getContext()));
            ((View) arrayList.get(i12)).setBackground(drawable);
            ((View) arrayList.get(i12)).setLayoutParams(layoutParams);
            this.f39635w0.addView((View) arrayList.get(i12));
        }
        if (arrayList.isEmpty()) {
            return;
        }
        ((View) arrayList.get(i10)).setBackground(drawable2);
        ((View) arrayList.get(i10)).setLayoutParams(layoutParams2);
    }

    @Override // com.veridas.fragment.DasFragment
    public Class<VDPhotoSelfieConfiguration> getConfigurationClass() {
        return VDPhotoSelfieConfiguration.class;
    }

    @Override // com.veridas.fragment.DasFragment
    public Class<VDPhotoSelfieViewModel> getViewModelClass() {
        return VDPhotoSelfieViewModel.class;
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, Bundle bundle) {
        Bitmap bitmapDecodeResource;
        View viewInflate = layoutInflater.inflate(R.layout.fragment_selfie_tutorial, viewGroup, false);
        viewInflate.setBackgroundColor(this.J0);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new TutorialItem(R.drawable.vd_photo_tutorial1, this.Q0, this.U0));
        arrayList.add(new TutorialItem(R.drawable.vd_photo_tutorial2, this.R0, this.V0));
        if (this.I0) {
            arrayList.add(new TutorialItem(R.drawable.vd_photo_tutorial3_ngas, this.S0, this.W0));
        } else if (this.H0) {
            arrayList.add(new TutorialItem(R.drawable.vd_photo_tutorial3_smile, this.T0, this.X0));
        }
        this.f39634u0 = new TutorialAdapter(arrayList, getContext(), getConfiguration());
        if (!this.G0) {
            ((ImageView) viewInflate.findViewById(R.id.vd_photo_veridas_logo)).setVisibility(4);
        }
        this.f39635w0 = (LinearLayout) viewInflate.findViewById(R.id.linearPoints);
        ViewPager viewPager = (ViewPager) viewInflate.findViewById(R.id.vd_photo_tutorial_view_pager);
        this.v0 = viewPager;
        viewPager.setAdapter(this.f39634u0);
        b(0);
        this.v0.addOnPageChangeListener(this.f39637y0);
        this.f39634u0.setNextButtonListener(new c());
        this.f39634u0.setPreviousButtonListener(new d());
        TextView textView = (TextView) viewInflate.findViewById(R.id.vd_photo_tutorial_general_title);
        textView.setText(HtmlCompat.fromHtml(this.Y0, 0));
        textView.setTextColor(this.Z0);
        Button button = (Button) viewInflate.findViewById(R.id.vd_photo_tutorial_continue_button);
        button.setText(HtmlCompat.fromHtml(this.P0, 0));
        GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, new int[]{this.M0, this.N0});
        gradientDrawable.setCornerRadius((int) TypedValue.applyDimension(1, 8.0f, getResources().getDisplayMetrics()));
        button.setBackground(gradientDrawable);
        button.setOnClickListener(new e());
        button.setTextColor(this.K0);
        if (this.E0) {
            this.f39632s0 = (ImageButton) viewInflate.findViewById(R.id.vd_photo_close_button);
            int i10 = (int) (((double) (this.f39633t0 ? this.f39636x0.y : this.f39636x0.x)) * 0.09d);
            this.f39632s0.setLayoutParams(new LinearLayout.LayoutParams(i10, i10));
            if (this.F0) {
                bitmapDecodeResource = BitmapFactory.decodeResource(getResources(), getResources().getIdentifier(this.O0, PluginUtils.IDENTIFIER_DRAWABLE, getActivity().getPackageName()));
            } else {
                bitmapDecodeResource = BitmapFactory.decodeResource(getResources(), R.drawable.vd_photo_closebutton);
            }
            Bitmap bitmap = bitmapDecodeResource;
            this.f39632s0.setVisibility(0);
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            float f6 = this.f39632s0.getLayoutParams().width / width;
            float f10 = this.f39632s0.getLayoutParams().height / height;
            Matrix matrix = new Matrix();
            matrix.postScale(f6, f10);
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap, 0, 0, width, height, matrix, true);
            this.f39632s0.setBackgroundColor(0);
            this.f39632s0.setImageBitmap(bitmapCreateBitmap);
            this.f39632s0.setOnClickListener(new o(this));
        }
        return viewInflate;
    }

    public class a implements ViewPager.OnPageChangeListener {
        public a() {
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public final void onPageSelected(int i10) {
            String str = SelfieTutorialFragment.TUTORIAL_FINISHED;
            SelfieTutorialFragment.this.b(i10);
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public final void onPageScrollStateChanged(int i10) {
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public final void onPageScrolled(int i10, float f6, int i11) {
        }
    }
}
