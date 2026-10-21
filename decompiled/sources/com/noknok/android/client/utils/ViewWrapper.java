package com.noknok.android.client.utils;

import android.R;
import android.annotation.SuppressLint;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.URLUtil;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.Switch;
import android.widget.TextView;
import androidx.core.graphics.drawable.DrawableCompat;
import com.bbva.androidtoolkit.utils.PluginUtils;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

/* JADX INFO: loaded from: classes11.dex */
public class ViewWrapper {
    public static final String AUTHENTICATOR_MAP = "authenticatorMap";
    public static final String POLICY_MAP = "policyMap";
    public static final String REASONCODE_MAP = "reasonCodeMap";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final View f63490a;

    public ViewWrapper(View view) {
        this.f63490a = view;
    }

    private void a(JsonWrapper jsonWrapper) {
        Tag tag = new Tag((String) this.f63490a.getTag());
        JsonWrapper level = jsonWrapper.getLevel(tag.getValue(JsonWrapper.Key.level));
        if (level != null) {
            jsonWrapper = level;
        }
        JsonWrapper.Key key = JsonWrapper.Key.styles;
        JsonElement jsonElementSearchUp = jsonWrapper.searchUp(key.name(), tag.getValue(key));
        if (jsonElementSearchUp != null) {
            View view = this.f63490a;
            JsonObject asJsonObject = jsonElementSearchUp.getAsJsonObject();
            try {
                if (view instanceof TextView) {
                    a((TextView) view, asJsonObject);
                } else if (view instanceof ViewGroup) {
                    a((ViewGroup) view, asJsonObject);
                } else if (view instanceof ProgressBar) {
                    a((ProgressBar) view, asJsonObject);
                }
            } catch (RuntimeException e5) {
                Logger.e("ViewWrapper", "Something went wrong while applying JSON styles to the views", e5);
            }
        }
        JsonWrapper.Key key2 = JsonWrapper.Key.strings;
        JsonElement jsonElementSearchUp2 = jsonWrapper.searchUp(key2.name(), tag.getValue(key2));
        if (jsonElementSearchUp2 != null) {
            View view2 = this.f63490a;
            String asString = jsonElementSearchUp2.getAsString();
            if (view2 instanceof EditText) {
                ((EditText) view2).setHint(asString);
            } else if (view2 instanceof TextView) {
                ((TextView) view2).setText(asString);
            }
        }
        JsonWrapper.Key key3 = JsonWrapper.Key.images;
        JsonElement jsonElementSearchUp3 = jsonWrapper.searchUp(key3.name(), tag.getValue(key3));
        if (jsonElementSearchUp3 != null) {
            JsonElement jsonElementSearchUp4 = jsonWrapper.searchUp(key3.name(), "dark_" + tag.getValue(key3));
            if (!isDarkModeEnabled() || jsonElementSearchUp4 == null) {
                a(this.f63490a, jsonElementSearchUp3.getAsString());
            } else {
                a(this.f63490a, jsonElementSearchUp4.getAsString());
            }
        }
        View view3 = this.f63490a;
        if (view3 instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view3;
            for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                new ViewWrapper(viewGroup.getChildAt(i10)).a(jsonWrapper);
            }
        }
    }

    public void downloadImage(View view, String str) {
        new Thread(new com.dasnano.vddocumentcapture.managers.e(str, view, 2)).start();
    }

    public boolean isDarkModeEnabled() {
        return (this.f63490a.getContext().getResources().getConfiguration().uiMode & 48) == 32;
    }

    public void onShow() {
        if (UiConfig.getJsonWrapper(this.f63490a.getContext()) != null) {
            a(UiConfig.getJsonWrapper(this.f63490a.getContext()));
        }
    }

    /* JADX WARN: Code duplicated, block: B:63:? A[RETURN, SYNTHETIC] */
    @SuppressLint({"DiscouragedApi"})
    private void a(View view, String str) {
        InputStream inputStreamOpenFileInput;
        InputStream inputStream = null;
        try {
            try {
                if (URLUtil.isValidUrl(str)) {
                    downloadImage(view, str);
                    return;
                }
                if (str.contains("/")) {
                    str = str.substring(str.lastIndexOf("/") + 1);
                }
                try {
                    if (view.getContext().getAssets().list("img").length > 0) {
                        inputStreamOpenFileInput = view.getContext().getAssets().open("img/" + str);
                    } else {
                        inputStreamOpenFileInput = view.getContext().openFileInput(str);
                    }
                    inputStream = inputStreamOpenFileInput;
                } catch (FileNotFoundException unused) {
                    Logger.w("ViewWrapper", "image file " + str + "not found neither in assets nor in data folder will try to use resources");
                }
                if (inputStream != null) {
                    Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(inputStream);
                    if (bitmapDecodeStream != null) {
                        if (view instanceof ImageView) {
                            ((ImageView) view).setImageBitmap(bitmapDecodeStream);
                        }
                        if (view instanceof Button) {
                            BitmapDrawable bitmapDrawable = new BitmapDrawable(view.getResources(), bitmapDecodeStream);
                            Drawable[] compoundDrawablesRelative = ((Button) view).getCompoundDrawablesRelative();
                            for (int i10 = 0; i10 < compoundDrawablesRelative.length; i10++) {
                                if (compoundDrawablesRelative[i10] != null) {
                                    compoundDrawablesRelative[i10] = bitmapDrawable;
                                }
                            }
                            ((Button) view).setCompoundDrawablesRelativeWithIntrinsicBounds(compoundDrawablesRelative[0], compoundDrawablesRelative[1], compoundDrawablesRelative[2], compoundDrawablesRelative[3]);
                        }
                    }
                } else if (view.getContext().getResources().getIdentifier(str, PluginUtils.IDENTIFIER_DRAWABLE, view.getContext().getPackageName()) != 0) {
                    ((ImageView) view).setImageResource(view.getContext().getResources().getIdentifier(str, PluginUtils.IDENTIFIER_DRAWABLE, view.getContext().getPackageName()));
                }
                if (inputStream == null) {
                    return;
                }
                try {
                    inputStream.close();
                } catch (IOException unused2) {
                }
            } catch (Throwable th2) {
                if (0 != 0) {
                    try {
                        inputStream.close();
                    } catch (IOException unused3) {
                    }
                }
                throw th2;
            }
        } catch (IOException e5) {
            e = e5;
            Logger.e("ViewWrapper", "Something went wrong while applying an image to the view", e);
            if (0 == 0) {
            }
        } catch (RuntimeException e7) {
            e = e7;
            Logger.e("ViewWrapper", "Something went wrong while applying an image to the view", e);
            if (0 == 0) {
            }
        }
    }

    private void a(TextView textView, JsonObject jsonObject) {
        int i10;
        String asString;
        String asString2;
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        if (jsonObject.has("corner_radius")) {
            gradientDrawable.setCornerRadius(a(jsonObject.get("corner_radius").getAsInt()));
        }
        if (jsonObject.has("background_color")) {
            if (isDarkModeEnabled() && jsonObject.has("dark_background_color")) {
                asString2 = jsonObject.get("dark_background_color").getAsString();
            } else {
                asString2 = jsonObject.get("background_color").getAsString();
            }
            gradientDrawable.setColor(new ColorStateList(new int[][]{new int[]{R.attr.state_enabled}, new int[]{-16842910}}, new int[]{Color.parseColor(asString2), Color.parseColor(jsonObject.has("disable_color") ? jsonObject.get("disable_color").getAsString() : asString2)}));
        }
        if (jsonObject.has("text_color")) {
            if (isDarkModeEnabled() && jsonObject.has("dark_text_color")) {
                asString = jsonObject.get("dark_text_color").getAsString();
            } else {
                asString = jsonObject.get("text_color").getAsString();
            }
            textView.setTextColor(Color.parseColor(asString));
        }
        if (jsonObject.has("border_size")) {
            gradientDrawable.setStroke(a(jsonObject.get("border_size").getAsInt()), jsonObject.has("border_color") ? Color.parseColor(jsonObject.get("border_color").getAsString()) : -7829368);
        }
        if (jsonObject.has("text_alignment")) {
            String asString3 = jsonObject.get("text_alignment").getAsString();
            asString3.getClass();
            switch (asString3) {
                case "center":
                    i10 = 17;
                    break;
                case "left":
                    i10 = 8388627;
                    break;
                case "right":
                    i10 = 8388629;
                    break;
                default:
                    i10 = 0;
                    break;
            }
            if (i10 != 0) {
                textView.setGravity(i10);
            }
        }
        if (textView instanceof Switch) {
            Switch r3 = (Switch) textView;
            int[][] iArr = {new int[]{R.attr.state_checked}, new int[]{-16842912}};
            if (jsonObject.has("thumb_enable_color") && jsonObject.has("thumb_disable_color")) {
                DrawableCompat.setTintList(DrawableCompat.wrap(r3.getThumbDrawable()), new ColorStateList(iArr, new int[]{Color.parseColor(jsonObject.get("thumb_enable_color").getAsString()), Color.parseColor(jsonObject.get("thumb_disable_color").getAsString())}));
            }
            if (jsonObject.has("track_enable_color") && jsonObject.has("track_disable_color")) {
                DrawableCompat.setTintList(DrawableCompat.wrap(r3.getTrackDrawable()), new ColorStateList(iArr, new int[]{Color.parseColor(jsonObject.get("track_enable_color").getAsString()), Color.parseColor(jsonObject.get("track_disable_color").getAsString())}));
            }
        }
        textView.setBackground(gradientDrawable);
    }

    private void a(ViewGroup viewGroup, JsonObject jsonObject) {
        String asString;
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        if (jsonObject.has("corner_radius")) {
            gradientDrawable.setCornerRadius(a(jsonObject.get("corner_radius").getAsInt()));
        }
        if (jsonObject.has("background_color")) {
            if (isDarkModeEnabled() && jsonObject.has("dark_background_color")) {
                asString = jsonObject.get("dark_background_color").getAsString();
            } else {
                asString = jsonObject.get("background_color").getAsString();
            }
            gradientDrawable.setColor(Color.parseColor(asString));
        }
        viewGroup.setBackground(gradientDrawable);
    }

    private void a(ProgressBar progressBar, JsonObject jsonObject) {
        String asString;
        if (jsonObject.has("progress_bar_color")) {
            if (isDarkModeEnabled() && jsonObject.has("dark_progress_bar_color")) {
                asString = jsonObject.get("dark_progress_bar_color").getAsString();
            } else {
                asString = jsonObject.get("progress_bar_color").getAsString();
            }
            progressBar.setIndeterminateTintList(ColorStateList.valueOf(Color.parseColor(asString)));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(String str, View view) {
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
            httpURLConnection.setDoInput(true);
            httpURLConnection.connect();
            ((ImageView) view).setImageBitmap(BitmapFactory.decodeStream(httpURLConnection.getInputStream()));
        } catch (Exception e5) {
            Logger.e("ViewWrapper", "Error downloading image: " + e5.getMessage());
        }
    }

    private static int a(int i10) {
        return (int) (i10 * Resources.getSystem().getDisplayMetrics().density);
    }
}
