package com.dasnano.vdvideoselfiecapture.fragments;

import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.Point;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.core.text.HtmlCompat;
import androidx.fragment.app.FragmentActivity;
import com.bbva.androidtoolkit.utils.PluginUtils;
import com.bumptech.glide.Glide;
import com.dasnano.vdvideoselfiecapture.R;
import com.dasnano.vdvideoselfiecapture.config.VDVideoSelfieConfiguration;
import com.dasnano.vdvideoselfiecapture.model.VDVideoSelfieViewModel;
import com.veridas.config.IllegalColorValueException;
import com.veridas.config.InvalidDisplayOrientationException;
import com.veridas.config.PropertyNameNotFoundException;
import com.veridas.display.DisplayOrientation;
import com.veridas.fragment.DasFragment;
import com.veridas.fragment.FragmentLifecycleAdapter;
import com.veridas.lib.entities.resources.Document;
import com.veridas.log.Log;
import com.veridas.logger.Logger;
import com.veridas.logger.VDLogger;
import com.veridas.misc.AssetsInfo;

/* JADX INFO: loaded from: classes9.dex */
public class VideoTutorialFragment extends DasFragment<VDVideoSelfieConfiguration, VDVideoSelfieViewModel> {
    public static final String TUTORIAL_FRAGMENT_FINISHED = "com.veridas.videoSelfieCapture.videoTutorialFragment.TUTORIAL_FINISHED";
    public int E0;
    public int F0;
    public int G0;
    public String H0;
    public String I0;
    public String J0;
    public String K0;
    public String L0;
    public String M0;
    public String N0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public ImageButton f39819s0 = null;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public boolean f39820t0 = false;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public volatile Point f39821u0;
    public boolean v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public boolean f39822w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public int f39823x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public int f39824y0;

    public class a extends FragmentLifecycleAdapter {
        public a() {
        }

        @Override // com.veridas.fragment.FragmentLifecycleAdapter, com.veridas.fragment.FragmentLifecycleListener
        public final void onBeforeCreated(DasFragment dasFragment, Bundle bundle) {
            VideoTutorialFragment videoTutorialFragment = VideoTutorialFragment.this;
            videoTutorialFragment.f39821u0 = videoTutorialFragment.getDisplaySize();
        }

        @Override // com.veridas.fragment.FragmentLifecycleAdapter, com.veridas.fragment.FragmentLifecycleListener
        public final void onCreated(DasFragment dasFragment, Bundle bundle) {
            String str = VideoTutorialFragment.TUTORIAL_FRAGMENT_FINISHED;
            VideoTutorialFragment videoTutorialFragment = VideoTutorialFragment.this;
            VDVideoSelfieConfiguration configuration = videoTutorialFragment.getConfiguration();
            try {
                videoTutorialFragment.H0 = configuration.getString("closebuttonimage");
                videoTutorialFragment.f39823x0 = configuration.getColor("tutorialbackgroundcolor");
                videoTutorialFragment.N0 = configuration.getString("tutorialtitle");
                videoTutorialFragment.G0 = configuration.getColor("tutorialtitlecolor");
                videoTutorialFragment.K0 = configuration.getString("tutorialgifpath");
                videoTutorialFragment.I0 = configuration.getString("tutorialalternativepath");
                videoTutorialFragment.L0 = configuration.getString(VDVideoSelfieConfiguration.TUTORIAL_PASSPORT_TEXT);
                videoTutorialFragment.M0 = configuration.getString("tutorialtext");
                videoTutorialFragment.F0 = configuration.getColor("tutorialtextcolor");
                videoTutorialFragment.J0 = configuration.getString("tutorialcontinuebuttontext");
                videoTutorialFragment.f39824y0 = configuration.getColor("tutorialcontinuebuttoncolor");
                videoTutorialFragment.E0 = configuration.getColor("tutorialcontinuebuttontextcolor");
                videoTutorialFragment.v0 = configuration.getString("closebuttonimage").equals("undefined");
                videoTutorialFragment.f39822w0 = configuration.getBoolean("closebutton");
                videoTutorialFragment.f39820t0 = configuration.getDisplayOrientation("screenorientation") == DisplayOrientation.LANDSCAPE;
            } catch (IllegalColorValueException | InvalidDisplayOrientationException | PropertyNameNotFoundException e5) {
                Log.e("VideoTutorialFragment", e5);
            }
        }

        @Override // com.veridas.fragment.FragmentLifecycleAdapter, com.veridas.fragment.FragmentLifecycleListener
        public final void onDestroyed(DasFragment dasFragment) {
            VideoTutorialFragment.this.f39819s0 = null;
        }

        @Override // com.veridas.fragment.FragmentLifecycleAdapter, com.veridas.fragment.FragmentLifecycleListener
        public final void onPaused(DasFragment dasFragment) {
            String str = VideoTutorialFragment.TUTORIAL_FRAGMENT_FINISHED;
            VideoTutorialFragment.this.getClass();
            VDLogger.log(Logger.Tag.ON_PAUSE, "On paused called in: %s", "VideoTutorialFragment");
        }

        @Override // com.veridas.fragment.FragmentLifecycleAdapter, com.veridas.fragment.FragmentLifecycleListener
        public final void onResumed(DasFragment dasFragment) {
            String str = VideoTutorialFragment.TUTORIAL_FRAGMENT_FINISHED;
            VideoTutorialFragment.this.getClass();
            VDLogger.log(Logger.Tag.ON_RESUME, "On resumed called in: %s", "VideoTutorialFragment");
        }
    }

    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            String str = VideoTutorialFragment.TUTORIAL_FRAGMENT_FINISHED;
            FragmentActivity activity = VideoTutorialFragment.this.getActivity();
            Intent intent = new Intent("com.veridas.videoSelfieCapture.videoTutorialFragment.TUTORIAL_FINISHED");
            intent.putExtra("com.veridas.videoSelfieCapture.videoTutorialFragment.TUTORIAL_FINISHED", true);
            if (activity != null) {
                activity.runOnUiThread(new s(activity, intent));
            }
        }
    }

    public VideoTutorialFragment() {
        addLifecycleListener(new a());
    }

    @Override // com.veridas.fragment.DasFragment
    public Class<VDVideoSelfieConfiguration> getConfigurationClass() {
        return VDVideoSelfieConfiguration.class;
    }

    @Override // com.veridas.fragment.DasFragment
    public Class<VDVideoSelfieViewModel> getViewModelClass() {
        return VDVideoSelfieViewModel.class;
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, Bundle bundle) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_video_tutorial, viewGroup, false);
        viewInflate.setBackgroundColor(this.f39823x0);
        TextView textView = (TextView) viewInflate.findViewById(R.id.vd_video_title);
        textView.setText(HtmlCompat.fromHtml(this.N0, 0));
        textView.setTextColor(this.G0);
        ImageView imageView = (ImageView) viewInflate.findViewById(R.id.vd_video_video_gif);
        Resources resources = getResources();
        AssetsInfo assetsInfo = new AssetsInfo(this.K0);
        AssetsInfo assetsInfo2 = new AssetsInfo(this.I0);
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
        boolean zIsPassport = Document.isPassport(((VDVideoSelfieViewModel) this.viewModel).getDocumentType());
        TextView textView2 = (TextView) viewInflate.findViewById(R.id.vd_video_steps);
        textView2.setTextColor(-1);
        if (zIsPassport) {
            textView2.setText(HtmlCompat.fromHtml(this.L0, 0));
        } else {
            textView2.setText(HtmlCompat.fromHtml(this.M0, 0));
        }
        textView2.setTextColor(this.F0);
        Button button = (Button) viewInflate.findViewById(R.id.vd_video_continue);
        button.setText(HtmlCompat.fromHtml(this.J0, 0));
        button.setOnClickListener(new b());
        button.setBackgroundColor(this.f39824y0);
        button.setTextColor(this.E0);
        if (this.f39822w0) {
            FragmentActivity fragmentActivityRequireActivity = requireActivity();
            Resources resources2 = fragmentActivityRequireActivity.getResources();
            int i10 = (int) (((double) (this.f39820t0 ? this.f39821u0.y : this.f39821u0.x)) * 0.09d);
            ImageButton imageButton = new ImageButton(fragmentActivityRequireActivity);
            this.f39819s0 = imageButton;
            imageButton.setLayoutParams(new RelativeLayout.LayoutParams(i10, i10));
            Bitmap bitmapDecodeResource = !this.v0 ? BitmapFactory.decodeResource(resources2, resources2.getIdentifier(this.H0, PluginUtils.IDENTIFIER_DRAWABLE, fragmentActivityRequireActivity.getPackageName())) : BitmapFactory.decodeResource(resources2, R.drawable.vd_video_close_button);
            int width = bitmapDecodeResource.getWidth();
            int height = bitmapDecodeResource.getHeight();
            float f6 = this.f39819s0.getLayoutParams().width / width;
            float f10 = this.f39819s0.getLayoutParams().height / height;
            Matrix matrix = new Matrix();
            matrix.postScale(f6, f10);
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmapDecodeResource, 0, 0, width, height, matrix, true);
            this.f39819s0.setBackgroundColor(0);
            this.f39819s0.setImageBitmap(bitmapCreateBitmap);
            float f11 = (float) (((double) i10) * 0.2d);
            this.f39819s0.setX(f11);
            this.f39819s0.setY(f11);
            this.f39819s0.setOnClickListener(new r(this));
            ((RelativeLayout) viewInflate).addView(this.f39819s0);
        }
        return viewInflate;
    }
}
