package com.dasnano.vdphotoselfiecapture;

import android.app.Dialog;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.core.text.HtmlCompat;
import com.dasnano.vdphotoselfiecapture.config.VDPhotoSelfieConfiguration;
import com.veridas.config.Configuration;
import com.veridas.config.IllegalColorValueException;
import com.veridas.config.PropertyNameNotFoundException;
import com.veridas.log.Log;

/* JADX INFO: loaded from: classes9.dex */
public class CustomAlertDialog extends Dialog {
    public int E0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final Configuration f39515p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public View.OnClickListener f39516q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final boolean f39517r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public String f39518s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public String f39519t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public String f39520u0;
    public String v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public String f39521w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public String f39522x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public String f39523y0;

    public CustomAlertDialog(@NonNull Context context, Boolean bool, Configuration configuration) {
        super(context);
        this.f39516q0 = null;
        this.f39517r0 = bool.booleanValue();
        this.f39515p0 = configuration;
        setCancelable(false);
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.alert_alive_selfie_error);
        Configuration configuration = this.f39515p0;
        try {
            this.f39518s0 = configuration.getString(VDPhotoSelfieConfiguration.SELFIE_NGAS_ERROR_ALERT_TITLE);
            this.f39519t0 = configuration.getString(VDPhotoSelfieConfiguration.SELFIE_NGAS_ERROR_ALERT_BUTTON_TEXT);
            this.f39520u0 = configuration.getString(VDPhotoSelfieConfiguration.SELFIE_NGAS_ERROR_ALERT_DESCRIPTION);
            this.v0 = configuration.getString(VDPhotoSelfieConfiguration.SELFIE_NGAS_ERROR_ALERT_STEP1);
            this.f39521w0 = configuration.getString(VDPhotoSelfieConfiguration.SELFIE_NGAS_ERROR_ALERT_STEP2);
            this.f39522x0 = configuration.getString(VDPhotoSelfieConfiguration.SELFIE_NGAS_ERROR_ALERT_STEP3);
            this.E0 = configuration.getColor(VDPhotoSelfieConfiguration.SELFIE_NGAS_ERROR_ALERT_TITLE_COLOR);
            this.f39523y0 = configuration.getString(VDPhotoSelfieConfiguration.SMILE_TIMEOUT_MESSAGE);
        } catch (IllegalColorValueException | PropertyNameNotFoundException e5) {
            Log.e("ContentValues", e5);
        }
        if (!this.f39517r0) {
            TextView textView = (TextView) findViewById(R.id.alert_error_title);
            textView.setText(HtmlCompat.fromHtml(this.f39518s0, 0));
            textView.setTextColor(this.E0);
            findViewById(R.id.alert_error_title_line).setBackgroundColor(this.E0);
            Button button = (Button) findViewById(R.id.alert_error_button);
            button.setText(HtmlCompat.fromHtml(this.f39519t0, 0));
            button.setTextColor(this.E0);
            button.setOnClickListener(this.f39516q0);
            ((TextView) findViewById(R.id.alert_error_description)).setText(HtmlCompat.fromHtml(this.f39523y0, 0));
            return;
        }
        TextView textView2 = (TextView) findViewById(R.id.alert_error_title);
        textView2.setText(HtmlCompat.fromHtml(this.f39518s0, 0));
        textView2.setTextColor(this.E0);
        findViewById(R.id.alert_error_title_line).setBackgroundColor(this.E0);
        Button button2 = (Button) findViewById(R.id.alert_error_button);
        button2.setText(HtmlCompat.fromHtml(this.f39519t0, 0));
        button2.setTextColor(this.E0);
        button2.getBackground().setTint(this.E0);
        button2.setOnClickListener(this.f39516q0);
        ((TextView) findViewById(R.id.alert_error_description)).setText(HtmlCompat.fromHtml(this.f39520u0, 0));
        TextView textView3 = (TextView) findViewById(R.id.alert_error_step1);
        TextView textView4 = (TextView) findViewById(R.id.alert_error_step2);
        TextView textView5 = (TextView) findViewById(R.id.alert_error_step3);
        textView3.setText(HtmlCompat.fromHtml(this.v0, 0));
        textView4.setText(HtmlCompat.fromHtml(this.f39521w0, 0));
        textView5.setText(HtmlCompat.fromHtml(this.f39522x0, 0));
        textView3.setVisibility(0);
        textView4.setVisibility(0);
        textView5.setVisibility(0);
        ImageView imageView = (ImageView) findViewById(R.id.alert_error_step1_image);
        ImageView imageView2 = (ImageView) findViewById(R.id.alert_error_step2_image);
        ImageView imageView3 = (ImageView) findViewById(R.id.alert_error_step3_image);
        imageView.setVisibility(0);
        imageView2.setVisibility(0);
        imageView3.setVisibility(0);
        Resources resources = getContext().getResources();
        imageView.setImageDrawable(resources.getDrawable(R.drawable.vd_photo_error1));
        imageView2.setImageDrawable(resources.getDrawable(R.drawable.vd_photo_error2));
        imageView3.setImageDrawable(resources.getDrawable(R.drawable.vd_photo_error3));
        getWindow().setBackgroundDrawable(new ColorDrawable(0));
    }

    public void setButtonListener(View.OnClickListener onClickListener) {
        this.f39516q0 = onClickListener;
    }
}
