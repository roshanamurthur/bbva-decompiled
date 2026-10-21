package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import androidx.annotation.ColorInt;
import androidx.annotation.DimenRes;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.appcompat.R;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.core.graphics.ColorUtils;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public final class AppCompatDrawableManager {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final PorterDuff.Mode f1165b = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static AppCompatDrawableManager f1166c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ResourceManagerInternal f1167a;

    public class a implements ResourceManagerInternal.ResourceManagerHooks {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int[] f1168a = {R.drawable.abc_textfield_search_default_mtrl_alpha, R.drawable.abc_textfield_default_mtrl_alpha, R.drawable.abc_ab_share_pack_mtrl_alpha};

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int[] f1169b = {R.drawable.abc_ic_commit_search_api_mtrl_alpha, R.drawable.abc_seekbar_tick_mark_material, R.drawable.abc_ic_menu_share_mtrl_alpha, R.drawable.abc_ic_menu_copy_mtrl_am_alpha, R.drawable.abc_ic_menu_cut_mtrl_alpha, R.drawable.abc_ic_menu_selectall_mtrl_alpha, R.drawable.abc_ic_menu_paste_mtrl_am_alpha};

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int[] f1170c = {R.drawable.abc_textfield_activated_mtrl_alpha, R.drawable.abc_textfield_search_activated_mtrl_alpha, R.drawable.abc_cab_background_top_mtrl_alpha, R.drawable.abc_text_cursor_material, R.drawable.abc_text_select_handle_left_mtrl, R.drawable.abc_text_select_handle_middle_mtrl, R.drawable.abc_text_select_handle_right_mtrl};

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int[] f1171d = {R.drawable.abc_popup_background_mtrl_mult, R.drawable.abc_cab_background_internal_bg, R.drawable.abc_menu_hardkey_panel_mtrl_mult};

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int[] f1172e = {R.drawable.abc_tab_indicator_material, R.drawable.abc_textfield_search_material};

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int[] f1173f = {R.drawable.abc_btn_check_material, R.drawable.abc_btn_radio_material, R.drawable.abc_btn_check_material_anim, R.drawable.abc_btn_radio_material_anim};

        public static boolean a(int i10, int[] iArr) {
            for (int i11 : iArr) {
                if (i11 == i10) {
                    return true;
                }
            }
            return false;
        }

        public static ColorStateList b(@NonNull Context context, @ColorInt int i10) {
            int themeAttrColor = ThemeUtils.getThemeAttrColor(context, R.attr.colorControlHighlight);
            return new ColorStateList(new int[][]{ThemeUtils.f1487b, ThemeUtils.f1489d, ThemeUtils.f1488c, ThemeUtils.f1491f}, new int[]{ThemeUtils.getDisabledThemeAttrColor(context, R.attr.colorButtonNormal), ColorUtils.compositeColors(themeAttrColor, i10), ColorUtils.compositeColors(themeAttrColor, i10), i10});
        }

        public static LayerDrawable c(@NonNull ResourceManagerInternal resourceManagerInternal, @NonNull Context context, @DimenRes int i10) {
            BitmapDrawable bitmapDrawable;
            BitmapDrawable bitmapDrawable2;
            BitmapDrawable bitmapDrawable3;
            int dimensionPixelSize = context.getResources().getDimensionPixelSize(i10);
            Drawable drawable = resourceManagerInternal.getDrawable(context, R.drawable.abc_star_black_48dp);
            Drawable drawable2 = resourceManagerInternal.getDrawable(context, R.drawable.abc_star_half_black_48dp);
            if ((drawable instanceof BitmapDrawable) && drawable.getIntrinsicWidth() == dimensionPixelSize && drawable.getIntrinsicHeight() == dimensionPixelSize) {
                bitmapDrawable = (BitmapDrawable) drawable;
                bitmapDrawable2 = new BitmapDrawable(bitmapDrawable.getBitmap());
            } else {
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(bitmapCreateBitmap);
                drawable.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
                drawable.draw(canvas);
                bitmapDrawable = new BitmapDrawable(bitmapCreateBitmap);
                bitmapDrawable2 = new BitmapDrawable(bitmapCreateBitmap);
            }
            bitmapDrawable2.setTileModeX(Shader.TileMode.REPEAT);
            if ((drawable2 instanceof BitmapDrawable) && drawable2.getIntrinsicWidth() == dimensionPixelSize && drawable2.getIntrinsicHeight() == dimensionPixelSize) {
                bitmapDrawable3 = (BitmapDrawable) drawable2;
            } else {
                Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
                Canvas canvas2 = new Canvas(bitmapCreateBitmap2);
                drawable2.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
                drawable2.draw(canvas2);
                bitmapDrawable3 = new BitmapDrawable(bitmapCreateBitmap2);
            }
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{bitmapDrawable, bitmapDrawable3, bitmapDrawable2});
            layerDrawable.setId(0, android.R.id.background);
            layerDrawable.setId(1, android.R.id.secondaryProgress);
            layerDrawable.setId(2, android.R.id.progress);
            return layerDrawable;
        }

        public static void d(Drawable drawable, int i10, PorterDuff.Mode mode) {
            Drawable drawableMutate = drawable.mutate();
            if (mode == null) {
                mode = AppCompatDrawableManager.f1165b;
            }
            drawableMutate.setColorFilter(AppCompatDrawableManager.getPorterDuffColorFilter(i10, mode));
        }

        @Override // androidx.appcompat.widget.ResourceManagerInternal.ResourceManagerHooks
        public final Drawable createDrawableFor(@NonNull ResourceManagerInternal resourceManagerInternal, @NonNull Context context, int i10) {
            if (i10 == R.drawable.abc_cab_background_top_material) {
                return new LayerDrawable(new Drawable[]{resourceManagerInternal.getDrawable(context, R.drawable.abc_cab_background_internal_bg), resourceManagerInternal.getDrawable(context, R.drawable.abc_cab_background_top_mtrl_alpha)});
            }
            if (i10 == R.drawable.abc_ratingbar_material) {
                return c(resourceManagerInternal, context, R.dimen.abc_star_big);
            }
            if (i10 == R.drawable.abc_ratingbar_indicator_material) {
                return c(resourceManagerInternal, context, R.dimen.abc_star_medium);
            }
            if (i10 == R.drawable.abc_ratingbar_small_material) {
                return c(resourceManagerInternal, context, R.dimen.abc_star_small);
            }
            return null;
        }

        @Override // androidx.appcompat.widget.ResourceManagerInternal.ResourceManagerHooks
        public final ColorStateList getTintListForDrawableRes(@NonNull Context context, int i10) {
            if (i10 == R.drawable.abc_edit_text_material) {
                return AppCompatResources.getColorStateList(context, R.color.abc_tint_edittext);
            }
            if (i10 == R.drawable.abc_switch_track_mtrl_alpha) {
                return AppCompatResources.getColorStateList(context, R.color.abc_tint_switch_track);
            }
            if (i10 != R.drawable.abc_switch_thumb_material) {
                if (i10 == R.drawable.abc_btn_default_mtrl_shape) {
                    return b(context, ThemeUtils.getThemeAttrColor(context, R.attr.colorButtonNormal));
                }
                if (i10 == R.drawable.abc_btn_borderless_material) {
                    return b(context, 0);
                }
                if (i10 == R.drawable.abc_btn_colored_material) {
                    return b(context, ThemeUtils.getThemeAttrColor(context, R.attr.colorAccent));
                }
                if (i10 == R.drawable.abc_spinner_mtrl_am_alpha || i10 == R.drawable.abc_spinner_textfield_background_material) {
                    return AppCompatResources.getColorStateList(context, R.color.abc_tint_spinner);
                }
                if (a(i10, this.f1169b)) {
                    return ThemeUtils.getThemeAttrColorStateList(context, R.attr.colorControlNormal);
                }
                if (a(i10, this.f1172e)) {
                    return AppCompatResources.getColorStateList(context, R.color.abc_tint_default);
                }
                if (a(i10, this.f1173f)) {
                    return AppCompatResources.getColorStateList(context, R.color.abc_tint_btn_checkable);
                }
                if (i10 == R.drawable.abc_seekbar_thumb_material) {
                    return AppCompatResources.getColorStateList(context, R.color.abc_tint_seek_thumb);
                }
                return null;
            }
            int[][] iArr = new int[3][];
            int[] iArr2 = new int[3];
            int i11 = R.attr.colorSwitchThumbNormal;
            ColorStateList themeAttrColorStateList = ThemeUtils.getThemeAttrColorStateList(context, i11);
            if (themeAttrColorStateList == null || !themeAttrColorStateList.isStateful()) {
                iArr[0] = ThemeUtils.f1487b;
                iArr2[0] = ThemeUtils.getDisabledThemeAttrColor(context, i11);
                iArr[1] = ThemeUtils.f1490e;
                iArr2[1] = ThemeUtils.getThemeAttrColor(context, R.attr.colorControlActivated);
                iArr[2] = ThemeUtils.f1491f;
                iArr2[2] = ThemeUtils.getThemeAttrColor(context, i11);
            } else {
                int[] iArr3 = ThemeUtils.f1487b;
                iArr[0] = iArr3;
                iArr2[0] = themeAttrColorStateList.getColorForState(iArr3, 0);
                iArr[1] = ThemeUtils.f1490e;
                iArr2[1] = ThemeUtils.getThemeAttrColor(context, R.attr.colorControlActivated);
                iArr[2] = ThemeUtils.f1491f;
                iArr2[2] = themeAttrColorStateList.getDefaultColor();
            }
            return new ColorStateList(iArr, iArr2);
        }

        @Override // androidx.appcompat.widget.ResourceManagerInternal.ResourceManagerHooks
        public final PorterDuff.Mode getTintModeForDrawableRes(int i10) {
            if (i10 == R.drawable.abc_switch_thumb_material) {
                return PorterDuff.Mode.MULTIPLY;
            }
            return null;
        }

        @Override // androidx.appcompat.widget.ResourceManagerInternal.ResourceManagerHooks
        public final boolean tintDrawable(@NonNull Context context, int i10, @NonNull Drawable drawable) {
            if (i10 == R.drawable.abc_seekbar_track_material) {
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                Drawable drawableFindDrawableByLayerId = layerDrawable.findDrawableByLayerId(android.R.id.background);
                int i11 = R.attr.colorControlNormal;
                int themeAttrColor = ThemeUtils.getThemeAttrColor(context, i11);
                PorterDuff.Mode mode = AppCompatDrawableManager.f1165b;
                d(drawableFindDrawableByLayerId, themeAttrColor, mode);
                d(layerDrawable.findDrawableByLayerId(android.R.id.secondaryProgress), ThemeUtils.getThemeAttrColor(context, i11), mode);
                d(layerDrawable.findDrawableByLayerId(android.R.id.progress), ThemeUtils.getThemeAttrColor(context, R.attr.colorControlActivated), mode);
                return true;
            }
            if (i10 != R.drawable.abc_ratingbar_material && i10 != R.drawable.abc_ratingbar_indicator_material && i10 != R.drawable.abc_ratingbar_small_material) {
                return false;
            }
            LayerDrawable layerDrawable2 = (LayerDrawable) drawable;
            Drawable drawableFindDrawableByLayerId2 = layerDrawable2.findDrawableByLayerId(android.R.id.background);
            int disabledThemeAttrColor = ThemeUtils.getDisabledThemeAttrColor(context, R.attr.colorControlNormal);
            PorterDuff.Mode mode2 = AppCompatDrawableManager.f1165b;
            d(drawableFindDrawableByLayerId2, disabledThemeAttrColor, mode2);
            Drawable drawableFindDrawableByLayerId3 = layerDrawable2.findDrawableByLayerId(android.R.id.secondaryProgress);
            int i12 = R.attr.colorControlActivated;
            d(drawableFindDrawableByLayerId3, ThemeUtils.getThemeAttrColor(context, i12), mode2);
            d(layerDrawable2.findDrawableByLayerId(android.R.id.progress), ThemeUtils.getThemeAttrColor(context, i12), mode2);
            return true;
        }

        /* JADX WARN: Code duplicated, block: B:22:0x004e  */
        /* JADX WARN: Code duplicated, block: B:24:0x005f  */
        /* JADX WARN: Code duplicated, block: B:26:0x0063 A[RETURN] */
        @Override // androidx.appcompat.widget.ResourceManagerInternal.ResourceManagerHooks
        public final boolean tintDrawableUsingColorFilter(@NonNull Context context, int i10, @NonNull Drawable drawable) {
            PorterDuff.Mode mode;
            int i11;
            boolean z10;
            Drawable drawableMutate;
            PorterDuff.Mode mode2 = AppCompatDrawableManager.f1165b;
            int iRound = -1;
            if (!a(i10, this.f1168a)) {
                if (a(i10, this.f1170c)) {
                    i11 = R.attr.colorControlActivated;
                } else {
                    if (a(i10, this.f1171d)) {
                        mode2 = PorterDuff.Mode.MULTIPLY;
                    } else if (i10 == R.drawable.abc_list_divider_mtrl_alpha) {
                        z10 = true;
                        iRound = Math.round(40.8f);
                        i11 = 16842800;
                        mode = mode2;
                    } else if (i10 != R.drawable.abc_dialog_material_background) {
                        mode = mode2;
                        iRound = -1;
                        i11 = 0;
                        z10 = false;
                    }
                    mode = mode2;
                    i11 = 16842801;
                    z10 = true;
                }
                if (z10) {
                    return false;
                }
                drawableMutate = drawable.mutate();
                drawableMutate.setColorFilter(AppCompatDrawableManager.getPorterDuffColorFilter(ThemeUtils.getThemeAttrColor(context, i11), mode));
                if (iRound != -1) {
                    drawableMutate.setAlpha(iRound);
                }
                return true;
            }
            i11 = R.attr.colorControlNormal;
            mode = mode2;
            z10 = true;
            if (z10) {
                return false;
            }
            drawableMutate = drawable.mutate();
            drawableMutate.setColorFilter(AppCompatDrawableManager.getPorterDuffColorFilter(ThemeUtils.getThemeAttrColor(context, i11), mode));
            if (iRound != -1) {
                drawableMutate.setAlpha(iRound);
            }
            return true;
        }
    }

    public static void a(Drawable drawable, TintInfo tintInfo, int[] iArr) {
        PorterDuff.Mode mode = ResourceManagerInternal.f1357h;
        int[] state = drawable.getState();
        if (drawable.mutate() == drawable) {
            if ((drawable instanceof LayerDrawable) && drawable.isStateful()) {
                drawable.setState(new int[0]);
                drawable.setState(state);
            }
            boolean z10 = tintInfo.mHasTintList;
            if (z10 || tintInfo.mHasTintMode) {
                PorterDuffColorFilter porterDuffColorFilter = null;
                ColorStateList colorStateList = z10 ? tintInfo.mTintList : null;
                PorterDuff.Mode mode2 = tintInfo.mHasTintMode ? tintInfo.mTintMode : ResourceManagerInternal.f1357h;
                if (colorStateList != null && mode2 != null) {
                    porterDuffColorFilter = ResourceManagerInternal.getPorterDuffColorFilter(colorStateList.getColorForState(iArr, 0), mode2);
                }
                drawable.setColorFilter(porterDuffColorFilter);
            } else {
                drawable.clearColorFilter();
            }
            if (Build.VERSION.SDK_INT <= 23) {
                drawable.invalidateSelf();
            }
        }
    }

    public static synchronized AppCompatDrawableManager get() {
        try {
            if (f1166c == null) {
                preload();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f1166c;
    }

    public static synchronized PorterDuffColorFilter getPorterDuffColorFilter(int i10, PorterDuff.Mode mode) {
        return ResourceManagerInternal.getPorterDuffColorFilter(i10, mode);
    }

    public static synchronized void preload() {
        if (f1166c == null) {
            AppCompatDrawableManager appCompatDrawableManager = new AppCompatDrawableManager();
            f1166c = appCompatDrawableManager;
            appCompatDrawableManager.f1167a = ResourceManagerInternal.get();
            f1166c.f1167a.setHooks(new a());
        }
    }

    public synchronized Drawable getDrawable(@NonNull Context context, @DrawableRes int i10) {
        return this.f1167a.getDrawable(context, i10);
    }

    public synchronized void onConfigurationChanged(@NonNull Context context) {
        this.f1167a.onConfigurationChanged(context);
    }
}
