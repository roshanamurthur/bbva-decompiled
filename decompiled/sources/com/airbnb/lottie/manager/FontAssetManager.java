package com.airbnb.lottie.manager;

import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.annotation.Nullable;
import com.airbnb.lottie.FontAssetDelegate;
import com.airbnb.lottie.model.Font;
import com.airbnb.lottie.model.MutablePair;
import com.airbnb.lottie.utils.Logger;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public class FontAssetManager {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AssetManager f25939d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public FontAssetDelegate f25940e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MutablePair<String> f25936a = new MutablePair<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f25937b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f25938c = new HashMap();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f25941f = ".ttf";

    public FontAssetManager(Drawable.Callback callback, @Nullable FontAssetDelegate fontAssetDelegate) {
        this.f25940e = fontAssetDelegate;
        if (callback instanceof View) {
            this.f25939d = ((View) callback).getContext().getAssets();
        } else {
            Logger.warning("LottieDrawable must be inside of a view for images to work.");
            this.f25939d = null;
        }
    }

    public Typeface getTypeface(Font font) {
        int i10;
        Typeface typefaceCreateFromAsset;
        String family = font.getFamily();
        String style = font.getStyle();
        MutablePair<String> mutablePair = this.f25936a;
        mutablePair.set(family, style);
        HashMap map = this.f25937b;
        Typeface typeface = (Typeface) map.get(mutablePair);
        if (typeface != null) {
            return typeface;
        }
        String family2 = font.getFamily();
        HashMap map2 = this.f25938c;
        Typeface typefaceCreate = (Typeface) map2.get(family2);
        if (typefaceCreate == null) {
            String style2 = font.getStyle();
            String name = font.getName();
            FontAssetDelegate fontAssetDelegate = this.f25940e;
            if (fontAssetDelegate != null) {
                typefaceCreateFromAsset = fontAssetDelegate.fetchFont(family2, style2, name);
                if (typefaceCreateFromAsset == null) {
                    typefaceCreateFromAsset = this.f25940e.fetchFont(family2);
                }
            } else {
                typefaceCreateFromAsset = null;
            }
            FontAssetDelegate fontAssetDelegate2 = this.f25940e;
            AssetManager assetManager = this.f25939d;
            if (fontAssetDelegate2 != null && typefaceCreateFromAsset == null) {
                String fontPath = fontAssetDelegate2.getFontPath(family2, style2, name);
                if (fontPath == null) {
                    fontPath = this.f25940e.getFontPath(family2);
                }
                if (fontPath != null) {
                    typefaceCreateFromAsset = Typeface.createFromAsset(assetManager, fontPath);
                }
            }
            if (font.getTypeface() != null) {
                typefaceCreate = font.getTypeface();
            } else {
                if (typefaceCreateFromAsset == null) {
                    typefaceCreate = Typeface.createFromAsset(assetManager, "fonts/" + family2 + this.f25941f);
                } else {
                    typefaceCreate = typefaceCreateFromAsset;
                }
                map2.put(family2, typefaceCreate);
            }
        }
        String style3 = font.getStyle();
        boolean zContains = style3.contains("Italic");
        boolean zContains2 = style3.contains("Bold");
        if (zContains && zContains2) {
            i10 = 3;
        } else if (zContains) {
            i10 = 2;
        } else {
            i10 = zContains2 ? 1 : 0;
        }
        if (typefaceCreate.getStyle() != i10) {
            typefaceCreate = Typeface.create(typefaceCreate, i10);
        }
        map.put(mutablePair, typefaceCreate);
        return typefaceCreate;
    }

    public void setDefaultFontFileExtension(String str) {
        this.f25941f = str;
    }

    public void setDelegate(@Nullable FontAssetDelegate fontAssetDelegate) {
        this.f25940e = fontAssetDelegate;
    }
}
