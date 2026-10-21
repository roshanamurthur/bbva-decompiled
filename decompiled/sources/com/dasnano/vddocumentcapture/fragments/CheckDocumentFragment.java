package com.dasnano.vddocumentcapture.fragments;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.BitmapFactory;
import android.graphics.Point;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;
import androidx.core.text.HtmlCompat;
import androidx.fragment.app.FragmentActivity;
import com.bbva.androidtoolkit.utils.PluginUtils;
import com.dasnano.vddocumentcapture.R;
import com.dasnano.vddocumentcapture.config.VDDocumentConfiguration;
import com.dasnano.vddocumentcapture.model.DocumentClassificationViewModel;
import com.veridas.config.IllegalColorValueException;
import com.veridas.config.PropertyNameNotFoundException;
import com.veridas.display.DisplayUtils;
import com.veridas.fragment.DasFragment;
import com.veridas.fragment.FragmentLifecycleAdapter;
import com.veridas.log.Log;
import com.veridas.util.Util;
import java.io.File;
import java.io.IOException;

/* JADX INFO: loaded from: classes9.dex */
public class CheckDocumentFragment extends AbstractFragment {
    public static final String DOCUMENT_VALIDATED = "com.veridas.documentCapture.checkDocument.documentValidated";
    public View G0;
    public int H0;
    public boolean I0;
    public boolean J0;
    public boolean K0;
    public float L0;
    public int M0;
    public int N0;
    public int O0;
    public int P0;
    public int Q0;
    public int R0;
    public int S0;
    public String T0;
    public String U0;
    public String V0;
    public String W0;
    public String X0;
    public String Y0;
    public String Z0;

    /* JADX INFO: renamed from: a1, reason: collision with root package name */
    public String f39313a1;

    /* JADX INFO: renamed from: b1, reason: collision with root package name */
    public String f39314b1;

    /* JADX INFO: renamed from: c1, reason: collision with root package name */
    public String f39315c1;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public volatile Point f39321y0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public ProgressBar f39316s0 = null;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public ImageView f39317t0 = null;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public Button f39318u0 = null;
    public Button v0 = null;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public ImageButton f39319w0 = null;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public TextView f39320x0 = null;
    public boolean E0 = false;
    public boolean F0 = false;

    public class a extends FragmentLifecycleAdapter {
        public a() {
        }

        @Override // com.veridas.fragment.FragmentLifecycleAdapter, com.veridas.fragment.FragmentLifecycleListener
        public final void onCreated(DasFragment dasFragment, Bundle bundle) {
            CheckDocumentFragment.this.created();
        }

        @Override // com.veridas.fragment.FragmentLifecycleAdapter, com.veridas.fragment.FragmentLifecycleListener
        public final void onResumed(DasFragment dasFragment) {
            CheckDocumentFragment.this.resumed();
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                CheckDocumentFragment.this.f39319w0.performClick();
            } catch (Exception unused) {
            }
        }
    }

    public class c implements View.OnClickListener {
        public c() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            String str = CheckDocumentFragment.DOCUMENT_VALIDATED;
            CheckDocumentFragment checkDocumentFragment = CheckDocumentFragment.this;
            checkDocumentFragment.getClass();
            Intent intent = new Intent("com.veridas.documentCapture.checkDocument.documentValidated");
            intent.putExtra("com.veridas.documentCapture.checkDocument.documentValidated", false);
            checkDocumentFragment.broadcastIntent(intent, new com.dasnano.vddocumentcapture.fragments.a(checkDocumentFragment));
        }
    }

    public class d implements View.OnClickListener {
        public d() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            String str = CheckDocumentFragment.DOCUMENT_VALIDATED;
            CheckDocumentFragment checkDocumentFragment = CheckDocumentFragment.this;
            checkDocumentFragment.getClass();
            Intent intent = new Intent("com.veridas.documentCapture.checkDocument.documentValidated");
            intent.putExtra("com.veridas.documentCapture.checkDocument.documentValidated", true);
            checkDocumentFragment.broadcastIntent(intent, new com.dasnano.vddocumentcapture.fragments.a(checkDocumentFragment));
        }
    }

    public class e implements ViewTreeObserver.OnGlobalLayoutListener {
        public e() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public final void onGlobalLayout() {
            CheckDocumentFragment checkDocumentFragment = CheckDocumentFragment.this;
            int width = (int) (checkDocumentFragment.f39317t0.getWidth() / checkDocumentFragment.L0);
            checkDocumentFragment.v0.setWidth(width);
            checkDocumentFragment.v0.invalidate();
            checkDocumentFragment.v0.requestLayout();
            checkDocumentFragment.f39318u0.setWidth(width);
            checkDocumentFragment.f39318u0.invalidate();
            checkDocumentFragment.f39318u0.requestLayout();
            checkDocumentFragment.v0.setVisibility(0);
            checkDocumentFragment.f39318u0.setVisibility(0);
            checkDocumentFragment.v0.setEnabled(true);
            checkDocumentFragment.f39318u0.setEnabled(true);
            checkDocumentFragment.G0.getViewTreeObserver().removeGlobalOnLayoutListener(this);
        }
    }

    public CheckDocumentFragment() {
        addLifecycleListener(new a());
    }

    public static void a(CheckDocumentFragment checkDocumentFragment, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        String str;
        checkDocumentFragment.popupWindowRegistry.discard();
        FragmentActivity fragmentActivityRequireActivity = checkDocumentFragment.requireActivity();
        if (checkDocumentFragment.E0) {
            str = checkDocumentFragment.T0;
        } else {
            str = checkDocumentFragment.F0 ? checkDocumentFragment.U0 : checkDocumentFragment.f39314b1;
        }
        PopupWindow popupWindowBuild = checkDocumentFragment.popupWindowRegistry.createPopupWindowBuilder().context(fragmentActivityRequireActivity).layoutInflater(layoutInflater).container(viewGroup).popupViewId(R.layout.popup_window).popupTextViewId(R.id.vd_document_popup_id).textColor(checkDocumentFragment.Y0).message(str).focusable(true).verticalScrollbarEnabled(false).backgroundColor(ContextCompat.getColor(fragmentActivityRequireActivity, R.color.vd_document_transparent)).width(Math.round(checkDocumentFragment.f39321y0.x * 0.6667f)).height(-2).touchable(true).outsideTouchable(true).backgroundDrawable(new ColorDrawable(checkDocumentFragment.P0)).build();
        if (popupWindowBuild.isShowing()) {
            return;
        }
        popupWindowBuild.showAtLocation(checkDocumentFragment.G0, 17, 0, 0);
    }

    public final void c() {
        Context context = getContext();
        int navBarHeight = DisplayUtils.getNavBarHeight(DisplayUtils.getDefaultDisplay(context));
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.G0.findViewById(R.id.vd_document_content_panel).getLayoutParams();
        layoutParams.setMargins(layoutParams.leftMargin, layoutParams.topMargin, layoutParams.rightMargin, Math.round(DisplayUtils.getSizeInDp(context, navBarHeight)) + this.H0);
        this.G0.invalidate();
    }

    public void created() {
        this.f39321y0 = getDisplaySize();
        VDDocumentConfiguration configuration = getConfiguration();
        try {
            this.T0 = configuration.getString(VDDocumentConfiguration.BAD_QUALITY_PICTURE_INFO);
            this.U0 = configuration.getString(VDDocumentConfiguration.CAPTURE_BRIGHTS_DETECTION_INFO_TEXT);
            this.V0 = configuration.getString(VDDocumentConfiguration.CHECK_DOCUMENT_TEXT);
            this.M0 = configuration.getColor(VDDocumentConfiguration.CHECK_DOCUMENT_TEXT_COLOR);
            this.N0 = configuration.getColor("continuebuttonbackgroundcolor");
            this.W0 = configuration.getString("continuebuttonicon");
            this.X0 = configuration.getString("continuebuttontext");
            this.O0 = configuration.getColor("continuebuttontextcolor");
            this.I0 = !configuration.getString("continuebuttonicon").equals("undefined");
            this.J0 = !configuration.getString("repeatbuttonicon").equals("undefined");
            this.P0 = configuration.getColor("popupvalidationbackgroundcolor");
            this.Y0 = configuration.getString("popupvalidationtextcolor");
            this.Q0 = configuration.getColor("repeatbuttonbackgroundcolor");
            this.Z0 = configuration.getString("repeatbuttonicon");
            this.f39313a1 = configuration.getString("repeatbuttontext");
            this.R0 = configuration.getColor("repeatbuttontextcolor");
            this.f39314b1 = configuration.getString("userinfo");
            this.L0 = configuration.getFloat(VDDocumentConfiguration.VALIDATE_DOCUMENT_BUTTONS_WIDTH_DIVISOR);
            this.S0 = configuration.getColor(VDDocumentConfiguration.VALIDATION_BACKGROUND_COLOR);
            this.f39315c1 = configuration.getString(VDDocumentConfiguration.INFORMATION_BUTTON_ICON);
            this.K0 = !configuration.getString(VDDocumentConfiguration.INFORMATION_BUTTON_ICON).equals("undefined");
        } catch (IllegalColorValueException | PropertyNameNotFoundException e5) {
            Log.e("CheckDocumentFragment", e5);
        }
        this.E0 = ((DocumentClassificationViewModel) this.viewModel).isBlurry();
        this.F0 = ((DocumentClassificationViewModel) this.viewModel).getHasBrights();
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public void onConfigurationChanged(@NonNull Configuration configuration) {
        super.onConfigurationChanged(configuration);
        c();
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, Bundle bundle) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_ckeck_document, viewGroup, false);
        this.G0 = viewInflate;
        View viewFindViewById = viewInflate.findViewById(R.id.vd_document_fullScreen);
        View viewFindViewById2 = this.G0.findViewById(R.id.vd_document_content_panel);
        viewFindViewById.setBackgroundColor(this.S0);
        Button button = (Button) this.G0.findViewById(R.id.vd_document_repeat_button);
        this.f39318u0 = button;
        button.setText(HtmlCompat.fromHtml(this.f39313a1, 0));
        this.f39318u0.setTextColor(this.R0);
        this.f39318u0.setBackgroundColor(this.Q0);
        this.f39318u0.setEnabled(false);
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Resources resources = fragmentActivityRequireActivity.getResources();
        if (this.J0) {
            this.f39318u0.setCompoundDrawablesWithIntrinsicBounds(resources.getIdentifier(this.Z0, PluginUtils.IDENTIFIER_DRAWABLE, fragmentActivityRequireActivity.getPackageName()), 0, 0, 0);
        }
        this.f39318u0.setOnClickListener(new c());
        Button button2 = (Button) this.G0.findViewById(R.id.vd_document_like_button);
        this.v0 = button2;
        button2.setText(HtmlCompat.fromHtml(this.X0, 0));
        this.v0.setTextColor(this.O0);
        this.v0.setBackgroundColor(this.N0);
        this.v0.setEnabled(false);
        if (this.I0) {
            this.v0.setCompoundDrawablesWithIntrinsicBounds(resources.getIdentifier(this.W0, PluginUtils.IDENTIFIER_DRAWABLE, fragmentActivityRequireActivity.getPackageName()), 0, 0, 0);
        }
        this.v0.setOnClickListener(new d());
        ProgressBar progressBar = (ProgressBar) this.G0.findViewById(R.id.vd_document_loading);
        this.f39316s0 = progressBar;
        progressBar.setVisibility(0);
        ImageView imageView = (ImageView) this.G0.findViewById(R.id.vd_document_document_image);
        this.f39317t0 = imageView;
        int i10 = 1;
        imageView.setAdjustViewBounds(true);
        this.f39317t0.setVisibility(0);
        this.f39316s0.setVisibility(8);
        String checkImagePath = ((DocumentClassificationViewModel) this.viewModel).getCheckImagePath();
        if (checkImagePath != null) {
            File file = new File(checkImagePath);
            try {
                if (file.exists()) {
                    byte[] bArrFileToByteArray = Util.fileToByteArray(file);
                    this.f39317t0.setImageBitmap(BitmapFactory.decodeByteArray(bArrFileToByteArray, 0, bArrFileToByteArray.length));
                } else {
                    Log.e("CheckDocumentFragment", "File does not exist.");
                }
            } catch (IOException e5) {
                Log.e("CheckDocumentFragment", e5);
            }
        } else {
            Log.e("CheckDocumentFragment", "File path is empty.");
        }
        Button button3 = this.v0;
        if (button3 != null) {
            button3.setEnabled(true);
            this.f39318u0.setEnabled(true);
        }
        this.H0 = ((RelativeLayout.LayoutParams) viewFindViewById2.getLayoutParams()).bottomMargin;
        c();
        this.G0.getViewTreeObserver().addOnGlobalLayoutListener(new e());
        TextView textView = (TextView) this.G0.findViewById(R.id.vd_document_confirmation_text);
        this.f39320x0 = textView;
        textView.setTextColor(this.M0);
        this.f39320x0.setText(HtmlCompat.fromHtml(this.V0, 0));
        this.f39319w0 = (ImageButton) this.G0.findViewById(R.id.vd_document_information);
        if (this.K0) {
            this.f39319w0.setImageResource(resources.getIdentifier(this.f39315c1, PluginUtils.IDENTIFIER_DRAWABLE, fragmentActivityRequireActivity.getPackageName()));
        }
        this.f39319w0.setOnClickListener(new ic.c(this, layoutInflater, i10, viewGroup));
        return this.G0;
    }

    public void resumed() {
        if (this.E0 || this.F0) {
            new Handler().postDelayed(new b(), 300L);
        }
        c();
    }
}
