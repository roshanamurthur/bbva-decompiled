package com.dasnano.vddocumentcapture.other;

import android.app.Activity;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RotateDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.core.text.HtmlCompat;
import androidx.core.view.GravityCompat;
import com.dasnano.vddocumentcapture.R;
import com.dasnano.vddocumentcapture.config.VDDocumentConfiguration;
import com.veridas.config.Configuration;
import com.veridas.config.IllegalColorValueException;
import com.veridas.config.PropertyNameNotFoundException;
import com.veridas.log.Log;

/* JADX INFO: loaded from: classes9.dex */
public class BubbleWindow extends PopupWindow {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextView f39473a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ImageView f39474b;

    public BubbleWindow(Activity activity, Configuration configuration) {
        int color;
        int color2;
        String string;
        try {
            color = configuration.getColor(VDDocumentConfiguration.SHUTTER_BUTTON_MESSAGE_BACKGROUND_COLOR);
            try {
                color2 = configuration.getColor(VDDocumentConfiguration.SHUTTER_BUTTON_MESSAGE_TEXT_COLOR);
                try {
                    string = configuration.getString(VDDocumentConfiguration.SHUTTER_BUTTON_MESSAGE);
                } catch (IllegalColorValueException e5) {
                    e = e5;
                    Log.e(getClass().getSimpleName(), e);
                    string = null;
                } catch (PropertyNameNotFoundException e7) {
                    e = e7;
                    Log.e(getClass().getSimpleName(), e);
                    string = null;
                }
            } catch (IllegalColorValueException | PropertyNameNotFoundException e10) {
                e = e10;
                color2 = 0;
            }
        } catch (IllegalColorValueException | PropertyNameNotFoundException e11) {
            e = e11;
            color = 0;
            color2 = 0;
        }
        View viewInflate = ((LayoutInflater) activity.getApplicationContext().getSystemService("layout_inflater")).inflate(R.layout.bubble_popup, (ViewGroup) null);
        TextView textView = (TextView) viewInflate.findViewById(R.id.vd_document_bubble_text);
        this.f39473a = textView;
        textView.setTextColor(color2);
        this.f39474b = (ImageView) viewInflate.findViewById(R.id.vd_document_bubble_arrow);
        setBackgroundColor(color);
        setText(string);
        setHeight(-2);
        setWidth(-2);
        setOutsideTouchable(false);
        setTouchable(false);
        setFocusable(false);
        setBackgroundDrawable(new BitmapDrawable());
        setContentView(viewInflate);
    }

    public void setBackgroundColor(int i10) {
        ((GradientDrawable) ((RotateDrawable) ((LayerDrawable) this.f39474b.getBackground()).findDrawableByLayerId(R.id.vd_document_bubble_arrow_drawable)).getDrawable()).setColor(i10);
        ((GradientDrawable) this.f39473a.getBackground()).setColor(i10);
    }

    public void setText(String str) {
        this.f39473a.setText(HtmlCompat.fromHtml(str, 0));
    }

    public void setVisible(View view, int i10, int i11) {
        showAtLocation(view, GravityCompat.END, i10, i11);
    }
}
