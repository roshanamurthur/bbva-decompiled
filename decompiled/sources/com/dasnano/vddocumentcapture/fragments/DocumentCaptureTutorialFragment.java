package com.dasnano.vddocumentcapture.fragments;

import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.core.text.HtmlCompat;
import androidx.fragment.app.FragmentActivity;
import com.bbva.androidtoolkit.utils.PluginUtils;
import com.bumptech.glide.Glide;
import com.dasnano.vddocumentcapture.R;
import com.dasnano.vddocumentcapture.config.VDDocumentConfiguration;
import com.veridas.config.IllegalColorValueException;
import com.veridas.config.PropertyNameNotFoundException;
import com.veridas.display.DisplayUtils;
import com.veridas.fragment.DasFragment;
import com.veridas.fragment.FragmentLifecycleAdapter;
import com.veridas.log.Log;
import com.veridas.misc.AssetsInfo;

/* JADX INFO: loaded from: classes9.dex */
public class DocumentCaptureTutorialFragment extends AbstractFragment {
    public static final String TUTORIAL_FINISHED = "com.veridas.documentCapture.documentTutorialFragment.tutorialFinished";
    public String E0;
    public String F0;
    public String G0;
    public String H0;
    public String I0;
    public String J0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public boolean f39327s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public boolean f39328t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public int f39329u0;
    public int v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public int f39330w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public int f39331x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public int f39332y0;

    public class a extends FragmentLifecycleAdapter {
        public a() {
        }

        @Override // com.veridas.fragment.FragmentLifecycleAdapter, com.veridas.fragment.FragmentLifecycleListener
        public final void onCreated(DasFragment dasFragment, Bundle bundle) {
            String str = DocumentCaptureTutorialFragment.TUTORIAL_FINISHED;
            DocumentCaptureTutorialFragment documentCaptureTutorialFragment = DocumentCaptureTutorialFragment.this;
            VDDocumentConfiguration configuration = documentCaptureTutorialFragment.getConfiguration();
            try {
                documentCaptureTutorialFragment.J0 = configuration.getString("closebuttonimage");
                documentCaptureTutorialFragment.f39327s0 = configuration.getBoolean("closebutton");
                documentCaptureTutorialFragment.f39328t0 = !configuration.getString("closebuttonimage").equalsIgnoreCase("undefined");
                documentCaptureTutorialFragment.f39329u0 = configuration.getColor("tutorialbackgroundcolor");
                documentCaptureTutorialFragment.G0 = configuration.getString("tutorialalternativepath");
                documentCaptureTutorialFragment.F0 = configuration.getString("tutorialgifpath");
                documentCaptureTutorialFragment.f39330w0 = configuration.getColor("tutorialtextcolor");
                documentCaptureTutorialFragment.f39331x0 = configuration.getColor("tutorialcontinuebuttoncolor");
                documentCaptureTutorialFragment.I0 = configuration.getString("tutorialcontinuebuttontext");
                documentCaptureTutorialFragment.f39332y0 = configuration.getColor("tutorialcontinuebuttontextcolor");
                documentCaptureTutorialFragment.H0 = configuration.getString("tutorialtext");
                documentCaptureTutorialFragment.E0 = configuration.getString("tutorialtitle");
                documentCaptureTutorialFragment.v0 = configuration.getColor("tutorialtitlecolor");
            } catch (IllegalColorValueException | PropertyNameNotFoundException e5) {
                Log.e("DocumentCaptureTutorialFragment", e5);
            }
        }
    }

    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            String str = DocumentCaptureTutorialFragment.TUTORIAL_FINISHED;
            DocumentCaptureTutorialFragment documentCaptureTutorialFragment = DocumentCaptureTutorialFragment.this;
            FragmentActivity activity = documentCaptureTutorialFragment.getActivity();
            Intent intent = new Intent("com.veridas.documentCapture.documentTutorialFragment.tutorialFinished");
            intent.putExtra("com.veridas.documentCapture.documentTutorialFragment.tutorialFinished", true);
            documentCaptureTutorialFragment.broadcastIntent(intent, new c(activity));
        }
    }

    public DocumentCaptureTutorialFragment() {
        addLifecycleListener(new a());
    }

    public boolean hasNavBar() {
        Resources resources = getResources();
        int identifier = resources.getIdentifier("config_showNavigationBar", "bool", "android");
        return identifier > 0 && resources.getBoolean(identifier);
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, Bundle bundle) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_document_capture_tutorial, viewGroup, false);
        viewInflate.setBackgroundColor(this.f39329u0);
        TextView textView = (TextView) viewInflate.findViewById(R.id.vd_document_tutorial_title);
        textView.setText(HtmlCompat.fromHtml(this.E0, 0));
        textView.setTextColor(this.v0);
        ImageView imageView = (ImageView) viewInflate.findViewById(R.id.vd_document_document_gif);
        Resources resources = getResources();
        AssetsInfo assetsInfo = new AssetsInfo(this.F0);
        AssetsInfo assetsInfo2 = new AssetsInfo(this.G0);
        boolean zExists = assetsInfo.exists(resources);
        boolean zExists2 = assetsInfo2.exists(resources);
        if (zExists || zExists2) {
            if (!zExists) {
                assetsInfo = assetsInfo2;
            }
            imageView.setBackgroundColor(0);
            Glide.with(requireActivity()).mo4916load(assetsInfo.getF67265b()).into(imageView);
        } else {
            imageView.setVisibility(8);
        }
        TextView textView2 = (TextView) viewInflate.findViewById(R.id.vd_document_document_steps);
        textView2.setText(HtmlCompat.fromHtml(this.H0, 0));
        textView2.setTextColor(this.f39330w0);
        Button button = (Button) viewInflate.findViewById(R.id.vd_document_document_continue_button);
        button.setText(HtmlCompat.fromHtml(this.I0, 0));
        button.setOnClickListener(new b());
        button.setBackgroundColor(this.f39331x0);
        button.setTextColor(this.f39332y0);
        if (hasNavBar()) {
            ((ViewGroup.MarginLayoutParams) ((LinearLayout) viewInflate.findViewById(R.id.vd_document_second_linear)).getLayoutParams()).setMargins(0, 0, 0, (int) TypedValue.applyDimension(1, 50.0f, getResources().getDisplayMetrics()));
        }
        if (this.f39327s0) {
            ImageButton imageButton = new ImageButton(getActivity());
            FragmentActivity activity = getActivity();
            Resources resources2 = activity.getResources();
            int sizeInPixels = DisplayUtils.getSizeInPixels(activity.getApplicationContext(), resources2.getDimension(R.dimen.vd_document_close_button_size));
            imageButton.setLayoutParams(new RelativeLayout.LayoutParams(sizeInPixels, sizeInPixels));
            Bitmap bitmapDecodeResource = this.f39328t0 ? BitmapFactory.decodeResource(resources2, resources2.getIdentifier(this.J0, PluginUtils.IDENTIFIER_DRAWABLE, activity.getPackageName())) : BitmapFactory.decodeResource(resources2, R.drawable.vd_document_closebutton);
            int width = bitmapDecodeResource.getWidth();
            int height = bitmapDecodeResource.getHeight();
            float f6 = imageButton.getLayoutParams().width / width;
            float f10 = imageButton.getLayoutParams().height / height;
            Matrix matrix = new Matrix();
            matrix.postScale(f6, f10);
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmapDecodeResource, 0, 0, width, height, matrix, true);
            imageButton.setBackgroundColor(0);
            imageButton.setImageBitmap(bitmapCreateBitmap);
            float f11 = (float) (((double) sizeInPixels) * 0.2d);
            imageButton.setX(f11);
            imageButton.setY(f11);
            imageButton.setOnClickListener(new com.dasnano.vddocumentcapture.fragments.b(this));
            ((RelativeLayout) viewInflate).addView(imageButton);
        }
        return viewInflate;
    }
}
