package com.dasnano.vdphotoselfiecapture;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.core.text.HtmlCompat;
import androidx.viewpager.widget.PagerAdapter;
import com.dasnano.vdphotoselfiecapture.config.VDPhotoSelfieConfiguration;
import com.veridas.config.Configuration;
import com.veridas.config.IllegalColorValueException;
import com.veridas.config.PropertyNameNotFoundException;
import com.veridas.log.Log;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public class TutorialAdapter extends PagerAdapter {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List<TutorialItem> f39524c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Configuration f39525d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Context f39526e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public View.OnClickListener f39527f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public View.OnClickListener f39528g;

    public TutorialAdapter(List<TutorialItem> list, Context context, Configuration configuration) {
        this.f39524c = list;
        this.f39526e = context;
        this.f39525d = configuration;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void destroyItem(@NonNull ViewGroup viewGroup, int i10, @NonNull Object obj) {
        viewGroup.removeView((View) obj);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public int getCount() {
        return this.f39524c.size();
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:41:0x0107  */
    /* JADX WARN: Code duplicated, block: B:43:0x010f  */
    /* JADX WARN: Code duplicated, block: B:44:0x0116  */
    @Override // androidx.viewpager.widget.PagerAdapter
    @NonNull
    public Object instantiateItem(@NonNull ViewGroup viewGroup, int i10) {
        int color;
        int color2;
        int color3;
        String string;
        String string2;
        int color4;
        Button button;
        Button button2;
        List<TutorialItem> list;
        Configuration configuration = this.f39525d;
        Context context = this.f39526e;
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.tutorial_item, viewGroup, false);
        try {
            string = configuration.getString(VDPhotoSelfieConfiguration.SELFIE_TUTORIAL_STEP_BUTTON_NEXT_TEXT);
            try {
                string2 = configuration.getString(VDPhotoSelfieConfiguration.SELFIE_TUTORIAL_STEP_BUTTON_PREVIOUS_TEXT);
                try {
                    color = configuration.getColor(VDPhotoSelfieConfiguration.SELFIE_TUTORIAL_STEP_TITLE_COLOR);
                    try {
                        color2 = configuration.getColor(VDPhotoSelfieConfiguration.SELFIE_TUTORIAL_STEP_DESCRIPTION_COLOR);
                        try {
                            color3 = configuration.getColor(VDPhotoSelfieConfiguration.SELFIE_TUTORIAL_STEP_BUTTON_NEXT_COLOR);
                            try {
                                color4 = configuration.getColor(VDPhotoSelfieConfiguration.SELFIE_TUTORIAL_STEP_BUTTON_PREVIOUS_COLOR);
                            } catch (IllegalColorValueException e5) {
                                e = e5;
                                Log.e("TutorialAdapter", e);
                                color4 = 0;
                            } catch (PropertyNameNotFoundException e7) {
                                e = e7;
                                Log.e("TutorialAdapter", e);
                                color4 = 0;
                            }
                        } catch (IllegalColorValueException | PropertyNameNotFoundException e10) {
                            e = e10;
                            color3 = 0;
                        }
                    } catch (IllegalColorValueException | PropertyNameNotFoundException e11) {
                        e = e11;
                        color2 = 0;
                        color3 = color2;
                        Log.e("TutorialAdapter", e);
                        color4 = 0;
                        ImageView imageView = (ImageView) viewInflate.findViewById(R.id.imagetutorial);
                        TextView textView = (TextView) viewInflate.findViewById(R.id.tutorialtitle);
                        TextView textView2 = (TextView) viewInflate.findViewById(R.id.tutorialsteps);
                        button = (Button) viewInflate.findViewById(R.id.nextButton);
                        button2 = (Button) viewInflate.findViewById(R.id.previousButton);
                        button.setOnClickListener(this.f39527f);
                        button2.setOnClickListener(this.f39528g);
                        list = this.f39524c;
                        TutorialItem tutorialItem = list.get(i10);
                        imageView.setImageResource(tutorialItem.getImage());
                        textView.setText(HtmlCompat.fromHtml(tutorialItem.getTitle(), 0));
                        textView2.setText(HtmlCompat.fromHtml(tutorialItem.getDescription(), 0));
                        textView.setTextColor(color);
                        textView2.setTextColor(color2);
                        button.setText(HtmlCompat.fromHtml(string, 0));
                        button.setTextColor(color3);
                        Drawable drawable = context.getResources().getDrawable(R.drawable.vd_photo_nextbuttonarrow2);
                        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                        drawable.setColorFilter(color3, mode);
                        button.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, drawable, (Drawable) null);
                        button2.setText(HtmlCompat.fromHtml(string2, 0));
                        button2.setTextColor(color4);
                        Drawable drawable2 = context.getResources().getDrawable(R.drawable.vd_photo_previousbuttonarrow2);
                        drawable2.setColorFilter(color4, mode);
                        button2.setCompoundDrawablesWithIntrinsicBounds(drawable2, (Drawable) null, (Drawable) null, (Drawable) null);
                        if (i10 == 0) {
                            button.setVisibility(0);
                            button2.setVisibility(8);
                        } else if (i10 == list.size() - 1) {
                            button.setVisibility(8);
                            button2.setVisibility(0);
                        } else {
                            button.setVisibility(0);
                            button2.setVisibility(0);
                        }
                        viewGroup.addView(viewInflate, 0);
                        return viewInflate;
                    }
                } catch (IllegalColorValueException | PropertyNameNotFoundException e12) {
                    e = e12;
                    color = 0;
                    color2 = 0;
                }
            } catch (IllegalColorValueException | PropertyNameNotFoundException e13) {
                e = e13;
                color = 0;
                color2 = 0;
                color3 = 0;
                string2 = null;
                Log.e("TutorialAdapter", e);
                color4 = 0;
                ImageView imageView2 = (ImageView) viewInflate.findViewById(R.id.imagetutorial);
                TextView textView3 = (TextView) viewInflate.findViewById(R.id.tutorialtitle);
                TextView textView4 = (TextView) viewInflate.findViewById(R.id.tutorialsteps);
                button = (Button) viewInflate.findViewById(R.id.nextButton);
                button2 = (Button) viewInflate.findViewById(R.id.previousButton);
                button.setOnClickListener(this.f39527f);
                button2.setOnClickListener(this.f39528g);
                list = this.f39524c;
                TutorialItem tutorialItem2 = list.get(i10);
                imageView2.setImageResource(tutorialItem2.getImage());
                textView3.setText(HtmlCompat.fromHtml(tutorialItem2.getTitle(), 0));
                textView4.setText(HtmlCompat.fromHtml(tutorialItem2.getDescription(), 0));
                textView3.setTextColor(color);
                textView4.setTextColor(color2);
                button.setText(HtmlCompat.fromHtml(string, 0));
                button.setTextColor(color3);
                Drawable drawable3 = context.getResources().getDrawable(R.drawable.vd_photo_nextbuttonarrow2);
                PorterDuff.Mode mode2 = PorterDuff.Mode.MULTIPLY;
                drawable3.setColorFilter(color3, mode2);
                button.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, drawable3, (Drawable) null);
                button2.setText(HtmlCompat.fromHtml(string2, 0));
                button2.setTextColor(color4);
                Drawable drawable4 = context.getResources().getDrawable(R.drawable.vd_photo_previousbuttonarrow2);
                drawable4.setColorFilter(color4, mode2);
                button2.setCompoundDrawablesWithIntrinsicBounds(drawable4, (Drawable) null, (Drawable) null, (Drawable) null);
                if (i10 == 0) {
                    button.setVisibility(0);
                    button2.setVisibility(8);
                } else if (i10 == list.size() - 1) {
                    button.setVisibility(8);
                    button2.setVisibility(0);
                } else {
                    button.setVisibility(0);
                    button2.setVisibility(0);
                }
                viewGroup.addView(viewInflate, 0);
                return viewInflate;
            }
        } catch (IllegalColorValueException | PropertyNameNotFoundException e14) {
            e = e14;
            color = 0;
            color2 = 0;
            color3 = 0;
            string = null;
        }
        ImageView imageView3 = (ImageView) viewInflate.findViewById(R.id.imagetutorial);
        TextView textView5 = (TextView) viewInflate.findViewById(R.id.tutorialtitle);
        TextView textView6 = (TextView) viewInflate.findViewById(R.id.tutorialsteps);
        button = (Button) viewInflate.findViewById(R.id.nextButton);
        button2 = (Button) viewInflate.findViewById(R.id.previousButton);
        button.setOnClickListener(this.f39527f);
        button2.setOnClickListener(this.f39528g);
        list = this.f39524c;
        TutorialItem tutorialItem3 = list.get(i10);
        imageView3.setImageResource(tutorialItem3.getImage());
        textView5.setText(HtmlCompat.fromHtml(tutorialItem3.getTitle(), 0));
        textView6.setText(HtmlCompat.fromHtml(tutorialItem3.getDescription(), 0));
        textView5.setTextColor(color);
        textView6.setTextColor(color2);
        button.setText(HtmlCompat.fromHtml(string, 0));
        button.setTextColor(color3);
        Drawable drawable5 = context.getResources().getDrawable(R.drawable.vd_photo_nextbuttonarrow2);
        PorterDuff.Mode mode3 = PorterDuff.Mode.MULTIPLY;
        drawable5.setColorFilter(color3, mode3);
        button.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, drawable5, (Drawable) null);
        button2.setText(HtmlCompat.fromHtml(string2, 0));
        button2.setTextColor(color4);
        Drawable drawable6 = context.getResources().getDrawable(R.drawable.vd_photo_previousbuttonarrow2);
        drawable6.setColorFilter(color4, mode3);
        button2.setCompoundDrawablesWithIntrinsicBounds(drawable6, (Drawable) null, (Drawable) null, (Drawable) null);
        if (i10 == 0) {
            button.setVisibility(0);
            button2.setVisibility(8);
        } else if (i10 == list.size() - 1) {
            button.setVisibility(8);
            button2.setVisibility(0);
        } else {
            button.setVisibility(0);
            button2.setVisibility(0);
        }
        viewGroup.addView(viewInflate, 0);
        return viewInflate;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public boolean isViewFromObject(@NonNull View view, @NonNull Object obj) {
        return view.equals(obj);
    }

    public void setNextButtonListener(View.OnClickListener onClickListener) {
        this.f39527f = onClickListener;
    }

    public void setPreviousButtonListener(View.OnClickListener onClickListener) {
        this.f39528g = onClickListener;
    }
}
