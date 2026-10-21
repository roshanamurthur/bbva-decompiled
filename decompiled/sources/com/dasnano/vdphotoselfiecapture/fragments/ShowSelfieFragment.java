package com.dasnano.vdphotoselfiecapture.fragments;

import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.util.Base64;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.core.text.HtmlCompat;
import com.bbva.androidtoolkit.utils.PluginUtils;
import com.dasnano.vdphotoselfiecapture.R;
import com.dasnano.vdphotoselfiecapture.config.VDPhotoSelfieConfiguration;
import com.dasnano.vdphotoselfiecapture.model.VDPhotoSelfieViewModel;
import com.veridas.config.IllegalColorValueException;
import com.veridas.config.PropertyNameNotFoundException;
import com.veridas.fragment.DasFragment;
import com.veridas.fragment.FragmentLifecycleAdapter;
import com.veridas.log.Log;
import com.veridas.util.Util;
import java.io.File;
import java.io.IOException;

/* JADX INFO: loaded from: classes9.dex */
public class ShowSelfieFragment extends DasFragment<VDPhotoSelfieConfiguration, VDPhotoSelfieViewModel> {
    public static final String CHECK_SELFIE_FINISHED = "com.dasnano.selfieCapture.showSelfieFragment.finished";
    public int E0;
    public int F0;
    public int G0;
    public int H0;
    public int I0;
    public int J0;
    public int K0;
    public String L0;
    public String M0;
    public String N0;
    public String O0;
    public String P0;
    public String Q0;
    public String R0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public Button f39643s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public Button f39644t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public PopupWindow f39645u0;
    public View v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public boolean f39646w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public boolean f39647x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public boolean f39648y0;

    public class a extends FragmentLifecycleAdapter {
        public a() {
        }

        @Override // com.veridas.fragment.FragmentLifecycleAdapter, com.veridas.fragment.FragmentLifecycleListener
        public final void onCreated(DasFragment dasFragment, Bundle bundle) {
            String str = ShowSelfieFragment.CHECK_SELFIE_FINISHED;
            ShowSelfieFragment showSelfieFragment = ShowSelfieFragment.this;
            VDPhotoSelfieConfiguration configuration = showSelfieFragment.getConfiguration();
            try {
                showSelfieFragment.K0 = configuration.getColor(VDPhotoSelfieConfiguration.CHECK_SELFIE_BACKGROUND_COLOR);
                showSelfieFragment.Q0 = configuration.getString(VDPhotoSelfieConfiguration.CHECK_SELFIE_TEXT);
                showSelfieFragment.E0 = configuration.getColor(VDPhotoSelfieConfiguration.CHECK_SELFIE_TEXT_COLOR);
                showSelfieFragment.G0 = configuration.getColor("continuebuttonbackgroundcolor");
                showSelfieFragment.L0 = configuration.getString("continuebuttonicon");
                showSelfieFragment.M0 = configuration.getString("continuebuttontext");
                showSelfieFragment.F0 = configuration.getColor("continuebuttontextcolor");
                boolean z10 = true;
                showSelfieFragment.f39646w0 = !configuration.getString("continuebuttonicon").equals("undefined");
                showSelfieFragment.f39647x0 = !configuration.getString("repeatbuttonicon").equals("undefined");
                showSelfieFragment.H0 = configuration.getColor("popupvalidationbackgroundcolor");
                showSelfieFragment.N0 = configuration.getString("popupvalidationtextcolor");
                showSelfieFragment.J0 = configuration.getColor("repeatbuttonbackgroundcolor");
                showSelfieFragment.P0 = configuration.getString("repeatbuttonicon");
                showSelfieFragment.O0 = configuration.getString("repeatbuttontext");
                showSelfieFragment.I0 = configuration.getColor("repeatbuttontextcolor");
                showSelfieFragment.R0 = configuration.getString("userinfo");
                if (!configuration.isSelfieAlive() && !configuration.isSelfieAlivePro()) {
                    z10 = false;
                }
                showSelfieFragment.f39648y0 = z10;
            } catch (IllegalColorValueException e5) {
                e = e5;
                Log.e("com.dasnano.vdphotoselfiecapture.fragments.ShowSelfieFragment", e);
            } catch (PropertyNameNotFoundException e7) {
                e = e7;
                Log.e("com.dasnano.vdphotoselfiecapture.fragments.ShowSelfieFragment", e);
            }
        }

        @Override // com.veridas.fragment.FragmentLifecycleAdapter, com.veridas.fragment.FragmentLifecycleListener
        public final void onDestroyed(DasFragment dasFragment) {
            ShowSelfieFragment showSelfieFragment = ShowSelfieFragment.this;
            showSelfieFragment.f39643s0 = null;
            showSelfieFragment.f39644t0 = null;
            showSelfieFragment.f39645u0 = null;
            showSelfieFragment.v0 = null;
        }
    }

    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            String str = ShowSelfieFragment.CHECK_SELFIE_FINISHED;
            ShowSelfieFragment showSelfieFragment = ShowSelfieFragment.this;
            showSelfieFragment.getClass();
            showSelfieFragment.runOnUiThread(new t(showSelfieFragment));
        }
    }

    public ShowSelfieFragment() {
        addLifecycleListener(new a());
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
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_show_selfie, viewGroup, false);
        this.v0 = viewInflate;
        viewInflate.setBackgroundColor(this.K0);
        String fullImagePath = ((VDPhotoSelfieViewModel) this.viewModel).getFullImagePath();
        String croppedFullImagePath = ((VDPhotoSelfieViewModel) this.viewModel).getCroppedFullImagePath();
        if (this.f39648y0) {
            fullImagePath = ((VDPhotoSelfieViewModel) this.viewModel).getFrameImagePath();
            croppedFullImagePath = ((VDPhotoSelfieViewModel) this.viewModel).getCroppedFrameImagePath();
        }
        File file = new File(croppedFullImagePath);
        if (!file.exists()) {
            file = new File(fullImagePath);
        }
        try {
            byte[] bArrFileToByteArray = Util.fileToByteArray(file);
            ((ImageView) this.v0.findViewById(R.id.vd_photo_image)).setImageBitmap(BitmapFactory.decodeByteArray(bArrFileToByteArray, 0, bArrFileToByteArray.length));
        } catch (IOException e5) {
            Log.e("com.dasnano.vdphotoselfiecapture.fragments.ShowSelfieFragment", e5);
        }
        Button button = (Button) this.v0.findViewById(R.id.vd_photo_positive_button);
        this.f39643s0 = button;
        button.setText(HtmlCompat.fromHtml(this.M0, 0));
        this.f39643s0.setTextColor(this.F0);
        this.f39643s0.setBackgroundColor(this.G0);
        if (this.f39646w0) {
            this.f39643s0.setCompoundDrawablesWithIntrinsicBounds(getResources().getIdentifier(this.L0, PluginUtils.IDENTIFIER_DRAWABLE, getActivity().getPackageName()), 0, 0, 0);
        }
        this.f39643s0.setOnClickListener(new r(this));
        Button button2 = (Button) this.v0.findViewById(R.id.vd_photo_negative_button);
        this.f39644t0 = button2;
        button2.setText(HtmlCompat.fromHtml(this.O0, 0));
        this.f39644t0.setTextColor(this.I0);
        this.f39644t0.setBackgroundColor(this.J0);
        if (this.f39647x0) {
            this.f39644t0.setCompoundDrawablesWithIntrinsicBounds(getResources().getIdentifier(this.P0, PluginUtils.IDENTIFIER_DRAWABLE, getActivity().getPackageName()), 0, 0, 0);
        }
        this.f39644t0.setOnClickListener(new q(this));
        TextView textView = (TextView) this.v0.findViewById(R.id.vd_photo_check_selfie_text);
        textView.setText(HtmlCompat.fromHtml(this.Q0, 0));
        textView.setTextColor(this.E0);
        View viewInflate2 = layoutInflater.inflate(R.layout.vd_photo_popup_window, viewGroup, false);
        viewInflate2.setOnTouchListener(new p(this));
        WebView webView = (WebView) viewInflate2.findViewById(R.id.vd_photo_popup);
        String strEncodeToString = Base64.encodeToString(String.format("<string name=\"help\">\n<html>\n <head></head>\n <body style=\"text-align:justify;color:%s;font-size:20px;background-color:transparent;margin-left:30px;margin-right:30px;margin-top:20px;margin-bottom:20px;\">\n%s\n </body>\n</html>\n</string>", this.N0, this.R0).getBytes(), 1);
        webView.setVerticalScrollBarEnabled(false);
        webView.loadData(strEncodeToString, "text/html; charset=utf-8", "base64");
        webView.setBackgroundColor(this.H0);
        this.f39645u0 = new PopupWindow(viewInflate2, -2, -2, true);
        ((ImageButton) this.v0.findViewById(R.id.vd_photo_information)).setOnClickListener(new b());
        return this.v0;
    }
}
