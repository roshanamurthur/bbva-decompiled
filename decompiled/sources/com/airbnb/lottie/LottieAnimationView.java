package com.airbnb.lottie;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.ColorFilter;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.AttrRes;
import androidx.annotation.DrawableRes;
import androidx.annotation.FloatRange;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RawRes;
import androidx.annotation.RequiresApi;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.appcompat.widget.AppCompatImageView;
import com.airbnb.lottie.model.KeyPath;
import com.airbnb.lottie.value.LottieFrameInfo;
import com.airbnb.lottie.value.LottieValueCallback;
import com.airbnb.lottie.value.SimpleLottieValueCallback;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.zip.ZipInputStream;

/* JADX INFO: loaded from: classes2.dex */
public class LottieAnimationView extends AppCompatImageView {
    public static final com.airbnb.lottie.b K0 = new com.airbnb.lottie.b();
    public boolean E0;
    public boolean F0;
    public boolean G0;
    public final HashSet H0;
    public final HashSet I0;

    @Nullable
    public LottieTask<LottieComposition> J0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final d f25570s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final c f25571t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    @Nullable
    public LottieListener<Throwable> f25572u0;

    @DrawableRes
    public int v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public final LottieDrawable f25573w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public String f25574x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    @RawRes
    public int f25575y0;

    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public String f25576p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public int f25577q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public float f25578r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public boolean f25579s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public String f25580t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public int f25581u0;
        public int v0;

        public class a implements Parcelable.Creator<SavedState> {
            @Override // android.os.Parcelable.Creator
            public final SavedState createFromParcel(Parcel parcel) {
                SavedState savedState = new SavedState(parcel);
                savedState.f25576p0 = parcel.readString();
                savedState.f25578r0 = parcel.readFloat();
                savedState.f25579s0 = parcel.readInt() == 1;
                savedState.f25580t0 = parcel.readString();
                savedState.f25581u0 = parcel.readInt();
                savedState.v0 = parcel.readInt();
                return savedState;
            }

            @Override // android.os.Parcelable.Creator
            public final SavedState[] newArray(int i10) {
                return new SavedState[i10];
            }
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeString(this.f25576p0);
            parcel.writeFloat(this.f25578r0);
            parcel.writeInt(this.f25579s0 ? 1 : 0);
            parcel.writeString(this.f25580t0);
            parcel.writeInt(this.f25581u0);
            parcel.writeInt(this.v0);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    public class a<T> extends LottieValueCallback<T> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ SimpleLottieValueCallback f25582c;

        public a(SimpleLottieValueCallback simpleLottieValueCallback) {
            this.f25582c = simpleLottieValueCallback;
        }

        @Override // com.airbnb.lottie.value.LottieValueCallback
        public final T getValue(LottieFrameInfo<T> lottieFrameInfo) {
            return (T) this.f25582c.getValue(lottieFrameInfo);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class b {
        private static final /* synthetic */ b[] $VALUES;
        public static final b PLAY_OPTION;
        public static final b SET_ANIMATION;
        public static final b SET_IMAGE_ASSETS;
        public static final b SET_PROGRESS;
        public static final b SET_REPEAT_COUNT;
        public static final b SET_REPEAT_MODE;

        static {
            b bVar = new b("SET_ANIMATION", 0);
            SET_ANIMATION = bVar;
            b bVar2 = new b("SET_PROGRESS", 1);
            SET_PROGRESS = bVar2;
            b bVar3 = new b("SET_REPEAT_MODE", 2);
            SET_REPEAT_MODE = bVar3;
            b bVar4 = new b("SET_REPEAT_COUNT", 3);
            SET_REPEAT_COUNT = bVar4;
            b bVar5 = new b("SET_IMAGE_ASSETS", 4);
            SET_IMAGE_ASSETS = bVar5;
            b bVar6 = new b("PLAY_OPTION", 5);
            PLAY_OPTION = bVar6;
            $VALUES = new b[]{bVar, bVar2, bVar3, bVar4, bVar5, bVar6};
        }

        public b() {
            throw null;
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) $VALUES.clone();
        }
    }

    public static class c implements LottieListener<Throwable> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final WeakReference<LottieAnimationView> f25583a;

        public c(LottieAnimationView lottieAnimationView) {
            this.f25583a = new WeakReference<>(lottieAnimationView);
        }

        @Override // com.airbnb.lottie.LottieListener
        public final void onResult(Throwable th2) {
            Throwable th3 = th2;
            LottieAnimationView lottieAnimationView = this.f25583a.get();
            if (lottieAnimationView == null) {
                return;
            }
            int i10 = lottieAnimationView.v0;
            if (i10 != 0) {
                lottieAnimationView.setImageResource(i10);
            }
            LottieListener lottieListener = lottieAnimationView.f25572u0;
            if (lottieListener == null) {
                lottieListener = LottieAnimationView.K0;
            }
            lottieListener.onResult(th3);
        }
    }

    public static class d implements LottieListener<LottieComposition> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final WeakReference<LottieAnimationView> f25584a;

        public d(LottieAnimationView lottieAnimationView) {
            this.f25584a = new WeakReference<>(lottieAnimationView);
        }

        @Override // com.airbnb.lottie.LottieListener
        public final void onResult(LottieComposition lottieComposition) {
            LottieComposition lottieComposition2 = lottieComposition;
            LottieAnimationView lottieAnimationView = this.f25584a.get();
            if (lottieAnimationView == null) {
                return;
            }
            lottieAnimationView.setComposition(lottieComposition2);
        }
    }

    public LottieAnimationView(Context context) {
        super(context);
        this.f25570s0 = new d(this);
        this.f25571t0 = new c(this);
        this.v0 = 0;
        this.f25573w0 = new LottieDrawable();
        this.E0 = false;
        this.F0 = false;
        this.G0 = true;
        this.H0 = new HashSet();
        this.I0 = new HashSet();
        b(null, R.attr.lottieAnimationViewStyle);
    }

    private void setCompositionTask(LottieTask<LottieComposition> lottieTask) {
        LottieResult<LottieComposition> result = lottieTask.getResult();
        LottieDrawable lottieDrawable = this.f25573w0;
        if (result != null && lottieDrawable == getDrawable() && lottieDrawable.getComposition() == result.getValue()) {
            return;
        }
        this.H0.add(b.SET_ANIMATION);
        lottieDrawable.clearComposition();
        a();
        this.J0 = lottieTask.addListener(this.f25570s0).addFailureListener(this.f25571t0);
    }

    public final void a() {
        LottieTask<LottieComposition> lottieTask = this.J0;
        if (lottieTask != null) {
            lottieTask.removeListener(this.f25570s0);
            this.J0.removeFailureListener(this.f25571t0);
        }
    }

    public void addAnimatorListener(Animator.AnimatorListener animatorListener) {
        this.f25573w0.addAnimatorListener(animatorListener);
    }

    @RequiresApi(api = 19)
    public void addAnimatorPauseListener(Animator.AnimatorPauseListener animatorPauseListener) {
        this.f25573w0.addAnimatorPauseListener(animatorPauseListener);
    }

    public void addAnimatorUpdateListener(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.f25573w0.addAnimatorUpdateListener(animatorUpdateListener);
    }

    public boolean addLottieOnCompositionLoadedListener(@NonNull LottieOnCompositionLoadedListener lottieOnCompositionLoadedListener) {
        LottieComposition composition = getComposition();
        if (composition != null) {
            lottieOnCompositionLoadedListener.onCompositionLoaded(composition);
        }
        return this.I0.add(lottieOnCompositionLoadedListener);
    }

    public <T> void addValueCallback(KeyPath keyPath, T t10, LottieValueCallback<T> lottieValueCallback) {
        this.f25573w0.addValueCallback(keyPath, t10, lottieValueCallback);
    }

    public final void b(@Nullable AttributeSet attributeSet, @AttrRes int i10) {
        String string;
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R.styleable.LottieAnimationView, i10, 0);
        this.G0 = typedArrayObtainStyledAttributes.getBoolean(R.styleable.LottieAnimationView_lottie_cacheComposition, true);
        int i11 = R.styleable.LottieAnimationView_lottie_rawRes;
        boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(i11);
        int i12 = R.styleable.LottieAnimationView_lottie_fileName;
        boolean zHasValue2 = typedArrayObtainStyledAttributes.hasValue(i12);
        int i13 = R.styleable.LottieAnimationView_lottie_url;
        boolean zHasValue3 = typedArrayObtainStyledAttributes.hasValue(i13);
        if (zHasValue && zHasValue2) {
            throw new IllegalArgumentException("lottie_rawRes and lottie_fileName cannot be used at the same time. Please use only one at once.");
        }
        if (zHasValue) {
            int resourceId = typedArrayObtainStyledAttributes.getResourceId(i11, 0);
            if (resourceId != 0) {
                setAnimation(resourceId);
            }
        } else if (zHasValue2) {
            String string2 = typedArrayObtainStyledAttributes.getString(i12);
            if (string2 != null) {
                setAnimation(string2);
            }
        } else if (zHasValue3 && (string = typedArrayObtainStyledAttributes.getString(i13)) != null) {
            setAnimationFromUrl(string);
        }
        setFallbackResource(typedArrayObtainStyledAttributes.getResourceId(R.styleable.LottieAnimationView_lottie_fallbackRes, 0));
        if (typedArrayObtainStyledAttributes.getBoolean(R.styleable.LottieAnimationView_lottie_autoPlay, false)) {
            this.F0 = true;
        }
        boolean z10 = typedArrayObtainStyledAttributes.getBoolean(R.styleable.LottieAnimationView_lottie_loop, false);
        LottieDrawable lottieDrawable = this.f25573w0;
        if (z10) {
            lottieDrawable.setRepeatCount(-1);
        }
        int i14 = R.styleable.LottieAnimationView_lottie_repeatMode;
        if (typedArrayObtainStyledAttributes.hasValue(i14)) {
            setRepeatMode(typedArrayObtainStyledAttributes.getInt(i14, 1));
        }
        int i15 = R.styleable.LottieAnimationView_lottie_repeatCount;
        if (typedArrayObtainStyledAttributes.hasValue(i15)) {
            setRepeatCount(typedArrayObtainStyledAttributes.getInt(i15, -1));
        }
        int i16 = R.styleable.LottieAnimationView_lottie_speed;
        if (typedArrayObtainStyledAttributes.hasValue(i16)) {
            setSpeed(typedArrayObtainStyledAttributes.getFloat(i16, 1.0f));
        }
        int i17 = R.styleable.LottieAnimationView_lottie_clipToCompositionBounds;
        if (typedArrayObtainStyledAttributes.hasValue(i17)) {
            setClipToCompositionBounds(typedArrayObtainStyledAttributes.getBoolean(i17, true));
        }
        int i18 = R.styleable.LottieAnimationView_lottie_clipTextToBoundingBox;
        if (typedArrayObtainStyledAttributes.hasValue(i18)) {
            setClipTextToBoundingBox(typedArrayObtainStyledAttributes.getBoolean(i18, false));
        }
        int i19 = R.styleable.LottieAnimationView_lottie_defaultFontFileExtension;
        if (typedArrayObtainStyledAttributes.hasValue(i19)) {
            setDefaultFontFileExtension(typedArrayObtainStyledAttributes.getString(i19));
        }
        setImageAssetsFolder(typedArrayObtainStyledAttributes.getString(R.styleable.LottieAnimationView_lottie_imageAssetsFolder));
        int i20 = R.styleable.LottieAnimationView_lottie_progress;
        boolean zHasValue4 = typedArrayObtainStyledAttributes.hasValue(i20);
        float f6 = typedArrayObtainStyledAttributes.getFloat(i20, 0.0f);
        if (zHasValue4) {
            this.H0.add(b.SET_PROGRESS);
        }
        lottieDrawable.setProgress(f6);
        enableMergePathsForKitKatAndAbove(typedArrayObtainStyledAttributes.getBoolean(R.styleable.LottieAnimationView_lottie_enableMergePathsForKitKatAndAbove, false));
        int i21 = R.styleable.LottieAnimationView_lottie_colorFilter;
        if (typedArrayObtainStyledAttributes.hasValue(i21)) {
            addValueCallback(new KeyPath("**"), LottieProperty.COLOR_FILTER, (LottieValueCallback<ColorFilter>) new LottieValueCallback(new SimpleColorFilter(AppCompatResources.getColorStateList(getContext(), typedArrayObtainStyledAttributes.getResourceId(i21, -1)).getDefaultColor())));
        }
        int i22 = R.styleable.LottieAnimationView_lottie_renderMode;
        if (typedArrayObtainStyledAttributes.hasValue(i22)) {
            RenderMode renderMode = RenderMode.AUTOMATIC;
            int iOrdinal = typedArrayObtainStyledAttributes.getInt(i22, renderMode.ordinal());
            if (iOrdinal >= RenderMode.values().length) {
                iOrdinal = renderMode.ordinal();
            }
            setRenderMode(RenderMode.values()[iOrdinal]);
        }
        int i23 = R.styleable.LottieAnimationView_lottie_asyncUpdates;
        if (typedArrayObtainStyledAttributes.hasValue(i23)) {
            AsyncUpdates asyncUpdates = AsyncUpdates.AUTOMATIC;
            int iOrdinal2 = typedArrayObtainStyledAttributes.getInt(i23, asyncUpdates.ordinal());
            if (iOrdinal2 >= RenderMode.values().length) {
                iOrdinal2 = asyncUpdates.ordinal();
            }
            setAsyncUpdates(AsyncUpdates.values()[iOrdinal2]);
        }
        setIgnoreDisabledSystemAnimations(typedArrayObtainStyledAttributes.getBoolean(R.styleable.LottieAnimationView_lottie_ignoreDisabledSystemAnimations, false));
        int i24 = R.styleable.LottieAnimationView_lottie_useCompositionFrameRate;
        if (typedArrayObtainStyledAttributes.hasValue(i24)) {
            setUseCompositionFrameRate(typedArrayObtainStyledAttributes.getBoolean(i24, false));
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    @MainThread
    public void cancelAnimation() {
        this.F0 = false;
        this.H0.add(b.PLAY_OPTION);
        this.f25573w0.cancelAnimation();
    }

    public <T> void clearValueCallback(KeyPath keyPath, T t10) {
        this.f25573w0.addValueCallback(keyPath, t10, (LottieValueCallback) null);
    }

    @Deprecated
    public void disableExtraScaleModeInFitXY() {
        this.f25573w0.disableExtraScaleModeInFitXY();
    }

    public void enableFeatureFlag(LottieFeatureFlag lottieFeatureFlag, boolean z10) {
        this.f25573w0.enableFeatureFlag(lottieFeatureFlag, z10);
    }

    public void enableMergePathsForKitKatAndAbove(boolean z10) {
        this.f25573w0.enableFeatureFlag(LottieFeatureFlag.MergePathsApi19, z10);
    }

    public AsyncUpdates getAsyncUpdates() {
        return this.f25573w0.getAsyncUpdates();
    }

    public boolean getAsyncUpdatesEnabled() {
        return this.f25573w0.getAsyncUpdatesEnabled();
    }

    public boolean getClipTextToBoundingBox() {
        return this.f25573w0.getClipTextToBoundingBox();
    }

    public boolean getClipToCompositionBounds() {
        return this.f25573w0.getClipToCompositionBounds();
    }

    @Nullable
    public LottieComposition getComposition() {
        Drawable drawable = getDrawable();
        LottieDrawable lottieDrawable = this.f25573w0;
        if (drawable == lottieDrawable) {
            return lottieDrawable.getComposition();
        }
        return null;
    }

    public long getDuration() {
        LottieComposition composition = getComposition();
        if (composition != null) {
            return (long) composition.getDuration();
        }
        return 0L;
    }

    public int getFrame() {
        return this.f25573w0.getFrame();
    }

    @Nullable
    public String getImageAssetsFolder() {
        return this.f25573w0.getImageAssetsFolder();
    }

    public boolean getMaintainOriginalImageBounds() {
        return this.f25573w0.getMaintainOriginalImageBounds();
    }

    public float getMaxFrame() {
        return this.f25573w0.getMaxFrame();
    }

    public float getMinFrame() {
        return this.f25573w0.getMinFrame();
    }

    @Nullable
    public PerformanceTracker getPerformanceTracker() {
        return this.f25573w0.getPerformanceTracker();
    }

    @FloatRange(from = 0.0d, to = 1.0d)
    public float getProgress() {
        return this.f25573w0.getProgress();
    }

    public RenderMode getRenderMode() {
        return this.f25573w0.getRenderMode();
    }

    public int getRepeatCount() {
        return this.f25573w0.getRepeatCount();
    }

    public int getRepeatMode() {
        return this.f25573w0.getRepeatMode();
    }

    public float getSpeed() {
        return this.f25573w0.getSpeed();
    }

    public boolean hasMasks() {
        return this.f25573w0.hasMasks();
    }

    public boolean hasMatte() {
        return this.f25573w0.hasMatte();
    }

    @Override // android.view.View
    public void invalidate() {
        super.invalidate();
        Drawable drawable = getDrawable();
        if ((drawable instanceof LottieDrawable) && ((LottieDrawable) drawable).getRenderMode() == RenderMode.SOFTWARE) {
            this.f25573w0.invalidateSelf();
        }
    }

    @Override // android.widget.ImageView, android.view.View, android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(@NonNull Drawable drawable) {
        Drawable drawable2 = getDrawable();
        LottieDrawable lottieDrawable = this.f25573w0;
        if (drawable2 == lottieDrawable) {
            super.invalidateDrawable(lottieDrawable);
        } else {
            super.invalidateDrawable(drawable);
        }
    }

    public boolean isAnimating() {
        return this.f25573w0.isAnimating();
    }

    public boolean isFeatureFlagEnabled(LottieFeatureFlag lottieFeatureFlag) {
        return this.f25573w0.isFeatureFlagEnabled(lottieFeatureFlag);
    }

    public boolean isMergePathsEnabledForKitKatAndAbove() {
        return this.f25573w0.isFeatureFlagEnabled(LottieFeatureFlag.MergePathsApi19);
    }

    @Deprecated
    public void loop(boolean z10) {
        this.f25573w0.setRepeatCount(z10 ? -1 : 0);
    }

    @Override // android.widget.ImageView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (isInEditMode() || !this.F0) {
            return;
        }
        this.f25573w0.playAnimation();
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        int i10;
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.f25574x0 = savedState.f25576p0;
        HashSet hashSet = this.H0;
        b bVar = b.SET_ANIMATION;
        if (!hashSet.contains(bVar) && !TextUtils.isEmpty(this.f25574x0)) {
            setAnimation(this.f25574x0);
        }
        this.f25575y0 = savedState.f25577q0;
        if (!hashSet.contains(bVar) && (i10 = this.f25575y0) != 0) {
            setAnimation(i10);
        }
        if (!hashSet.contains(b.SET_PROGRESS)) {
            this.f25573w0.setProgress(savedState.f25578r0);
        }
        if (!hashSet.contains(b.PLAY_OPTION) && savedState.f25579s0) {
            playAnimation();
        }
        if (!hashSet.contains(b.SET_IMAGE_ASSETS)) {
            setImageAssetsFolder(savedState.f25580t0);
        }
        if (!hashSet.contains(b.SET_REPEAT_MODE)) {
            setRepeatMode(savedState.f25581u0);
        }
        if (hashSet.contains(b.SET_REPEAT_COUNT)) {
            return;
        }
        setRepeatCount(savedState.v0);
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        boolean zIsRunning;
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f25576p0 = this.f25574x0;
        savedState.f25577q0 = this.f25575y0;
        LottieDrawable lottieDrawable = this.f25573w0;
        savedState.f25578r0 = lottieDrawable.getProgress();
        if (lottieDrawable.isVisible()) {
            zIsRunning = lottieDrawable.f25642q0.isRunning();
        } else {
            LottieDrawable.c cVar = lottieDrawable.f25646u0;
            zIsRunning = cVar == LottieDrawable.c.PLAY || cVar == LottieDrawable.c.RESUME;
        }
        savedState.f25579s0 = zIsRunning;
        savedState.f25580t0 = lottieDrawable.getImageAssetsFolder();
        savedState.f25581u0 = lottieDrawable.getRepeatMode();
        savedState.v0 = lottieDrawable.getRepeatCount();
        return savedState;
    }

    @MainThread
    public void pauseAnimation() {
        this.F0 = false;
        this.f25573w0.pauseAnimation();
    }

    @MainThread
    public void playAnimation() {
        this.H0.add(b.PLAY_OPTION);
        this.f25573w0.playAnimation();
    }

    public void removeAllAnimatorListeners() {
        this.f25573w0.removeAllAnimatorListeners();
    }

    public void removeAllLottieOnCompositionLoadedListener() {
        this.I0.clear();
    }

    public void removeAllUpdateListeners() {
        this.f25573w0.removeAllUpdateListeners();
    }

    public void removeAnimatorListener(Animator.AnimatorListener animatorListener) {
        this.f25573w0.removeAnimatorListener(animatorListener);
    }

    @RequiresApi(api = 19)
    public void removeAnimatorPauseListener(Animator.AnimatorPauseListener animatorPauseListener) {
        this.f25573w0.removeAnimatorPauseListener(animatorPauseListener);
    }

    public boolean removeLottieOnCompositionLoadedListener(@NonNull LottieOnCompositionLoadedListener lottieOnCompositionLoadedListener) {
        return this.I0.remove(lottieOnCompositionLoadedListener);
    }

    public void removeUpdateListener(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.f25573w0.removeAnimatorUpdateListener(animatorUpdateListener);
    }

    public List<KeyPath> resolveKeyPath(KeyPath keyPath) {
        return this.f25573w0.resolveKeyPath(keyPath);
    }

    @MainThread
    public void resumeAnimation() {
        this.H0.add(b.PLAY_OPTION);
        this.f25573w0.resumeAnimation();
    }

    public void reverseAnimationSpeed() {
        this.f25573w0.reverseAnimationSpeed();
    }

    public void setAnimation(@RawRes final int i10) {
        LottieTask<LottieComposition> lottieTaskFromRawRes;
        this.f25575y0 = i10;
        this.f25574x0 = null;
        if (isInEditMode()) {
            lottieTaskFromRawRes = new LottieTask<>(new Callable() { // from class: com.airbnb.lottie.a
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    LottieAnimationView lottieAnimationView = this.f25673p0;
                    boolean z10 = lottieAnimationView.G0;
                    int i11 = i10;
                    return z10 ? LottieCompositionFactory.fromRawResSync(lottieAnimationView.getContext(), i11) : LottieCompositionFactory.fromRawResSync(lottieAnimationView.getContext(), i11, null);
                }
            }, true);
        } else {
            lottieTaskFromRawRes = this.G0 ? LottieCompositionFactory.fromRawRes(getContext(), i10) : LottieCompositionFactory.fromRawRes(getContext(), i10, null);
        }
        setCompositionTask(lottieTaskFromRawRes);
    }

    @Deprecated
    public void setAnimationFromJson(String str) {
        setAnimationFromJson(str, null);
    }

    public void setAnimationFromUrl(String str) {
        setCompositionTask(this.G0 ? LottieCompositionFactory.fromUrl(getContext(), str) : LottieCompositionFactory.fromUrl(getContext(), str, null));
    }

    public void setApplyingOpacityToLayersEnabled(boolean z10) {
        this.f25573w0.setApplyingOpacityToLayersEnabled(z10);
    }

    public void setAsyncUpdates(AsyncUpdates asyncUpdates) {
        this.f25573w0.setAsyncUpdates(asyncUpdates);
    }

    public void setCacheComposition(boolean z10) {
        this.G0 = z10;
    }

    public void setClipTextToBoundingBox(boolean z10) {
        this.f25573w0.setClipTextToBoundingBox(z10);
    }

    public void setClipToCompositionBounds(boolean z10) {
        this.f25573w0.setClipToCompositionBounds(z10);
    }

    public void setComposition(@NonNull LottieComposition lottieComposition) {
        if (L.DBG) {
            Objects.toString(lottieComposition);
        }
        LottieDrawable lottieDrawable = this.f25573w0;
        lottieDrawable.setCallback(this);
        this.E0 = true;
        boolean composition = lottieDrawable.setComposition(lottieComposition);
        if (this.F0) {
            lottieDrawable.playAnimation();
        }
        this.E0 = false;
        if (getDrawable() != lottieDrawable || composition) {
            if (!composition) {
                boolean zIsAnimating = isAnimating();
                setImageDrawable(null);
                setImageDrawable(lottieDrawable);
                if (zIsAnimating) {
                    lottieDrawable.resumeAnimation();
                }
            }
            onVisibilityChanged(this, getVisibility());
            requestLayout();
            Iterator it = this.I0.iterator();
            while (it.hasNext()) {
                ((LottieOnCompositionLoadedListener) it.next()).onCompositionLoaded(lottieComposition);
            }
        }
    }

    public void setDefaultFontFileExtension(String str) {
        this.f25573w0.setDefaultFontFileExtension(str);
    }

    public void setFailureListener(@Nullable LottieListener<Throwable> lottieListener) {
        this.f25572u0 = lottieListener;
    }

    public void setFallbackResource(@DrawableRes int i10) {
        this.v0 = i10;
    }

    public void setFontAssetDelegate(FontAssetDelegate fontAssetDelegate) {
        this.f25573w0.setFontAssetDelegate(fontAssetDelegate);
    }

    public void setFontMap(@Nullable Map<String, Typeface> map) {
        this.f25573w0.setFontMap(map);
    }

    public void setFrame(int i10) {
        this.f25573w0.setFrame(i10);
    }

    @Deprecated
    public void setIgnoreDisabledSystemAnimations(boolean z10) {
        this.f25573w0.setIgnoreDisabledSystemAnimations(z10);
    }

    public void setImageAssetDelegate(ImageAssetDelegate imageAssetDelegate) {
        this.f25573w0.setImageAssetDelegate(imageAssetDelegate);
    }

    public void setImageAssetsFolder(String str) {
        this.f25573w0.setImagesAssetsFolder(str);
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        this.f25575y0 = 0;
        this.f25574x0 = null;
        a();
        super.setImageBitmap(bitmap);
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        this.f25575y0 = 0;
        this.f25574x0 = null;
        a();
        super.setImageDrawable(drawable);
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageResource(int i10) {
        this.f25575y0 = 0;
        this.f25574x0 = null;
        a();
        super.setImageResource(i10);
    }

    public void setMaintainOriginalImageBounds(boolean z10) {
        this.f25573w0.setMaintainOriginalImageBounds(z10);
    }

    public void setMaxFrame(int i10) {
        this.f25573w0.setMaxFrame(i10);
    }

    public void setMaxProgress(@FloatRange(from = 0.0d, to = 1.0d) float f6) {
        this.f25573w0.setMaxProgress(f6);
    }

    public void setMinAndMaxFrame(String str) {
        this.f25573w0.setMinAndMaxFrame(str);
    }

    public void setMinAndMaxProgress(@FloatRange(from = 0.0d, to = 1.0d) float f6, @FloatRange(from = 0.0d, to = 1.0d) float f10) {
        this.f25573w0.setMinAndMaxProgress(f6, f10);
    }

    public void setMinFrame(int i10) {
        this.f25573w0.setMinFrame(i10);
    }

    public void setMinProgress(float f6) {
        this.f25573w0.setMinProgress(f6);
    }

    public void setOutlineMasksAndMattes(boolean z10) {
        this.f25573w0.setOutlineMasksAndMattes(z10);
    }

    public void setPerformanceTrackingEnabled(boolean z10) {
        this.f25573w0.setPerformanceTrackingEnabled(z10);
    }

    public void setProgress(@FloatRange(from = 0.0d, to = 1.0d) float f6) {
        this.H0.add(b.SET_PROGRESS);
        this.f25573w0.setProgress(f6);
    }

    public void setRenderMode(RenderMode renderMode) {
        this.f25573w0.setRenderMode(renderMode);
    }

    public void setRepeatCount(int i10) {
        this.H0.add(b.SET_REPEAT_COUNT);
        this.f25573w0.setRepeatCount(i10);
    }

    public void setRepeatMode(int i10) {
        this.H0.add(b.SET_REPEAT_MODE);
        this.f25573w0.setRepeatMode(i10);
    }

    public void setSafeMode(boolean z10) {
        this.f25573w0.setSafeMode(z10);
    }

    public void setSpeed(float f6) {
        this.f25573w0.setSpeed(f6);
    }

    public void setTextDelegate(TextDelegate textDelegate) {
        this.f25573w0.setTextDelegate(textDelegate);
    }

    public void setUseCompositionFrameRate(boolean z10) {
        this.f25573w0.setUseCompositionFrameRate(z10);
    }

    @Override // android.view.View
    public void unscheduleDrawable(Drawable drawable) {
        LottieDrawable lottieDrawable;
        if (!this.E0 && drawable == (lottieDrawable = this.f25573w0) && lottieDrawable.isAnimating()) {
            pauseAnimation();
        } else if (!this.E0 && (drawable instanceof LottieDrawable)) {
            LottieDrawable lottieDrawable2 = (LottieDrawable) drawable;
            if (lottieDrawable2.isAnimating()) {
                lottieDrawable2.pauseAnimation();
            }
        }
        super.unscheduleDrawable(drawable);
    }

    @Nullable
    public Bitmap updateBitmap(String str, @Nullable Bitmap bitmap) {
        return this.f25573w0.updateBitmap(str, bitmap);
    }

    public <T> void addValueCallback(KeyPath keyPath, T t10, SimpleLottieValueCallback<T> simpleLottieValueCallback) {
        this.f25573w0.addValueCallback(keyPath, t10, new a(simpleLottieValueCallback));
    }

    public void setAnimationFromJson(String str, @Nullable String str2) {
        setAnimation(new ByteArrayInputStream(str.getBytes()), str2);
    }

    public void setMaxFrame(String str) {
        this.f25573w0.setMaxFrame(str);
    }

    public void setMinAndMaxFrame(String str, String str2, boolean z10) {
        this.f25573w0.setMinAndMaxFrame(str, str2, z10);
    }

    public void setMinFrame(String str) {
        this.f25573w0.setMinFrame(str);
    }

    public void setMinAndMaxFrame(int i10, int i11) {
        this.f25573w0.setMinAndMaxFrame(i10, i11);
    }

    public void setAnimationFromUrl(String str, @Nullable String str2) {
        setCompositionTask(LottieCompositionFactory.fromUrl(getContext(), str, str2));
    }

    public void setAnimation(final String str) {
        LottieTask<LottieComposition> lottieTaskFromAsset;
        this.f25574x0 = str;
        this.f25575y0 = 0;
        if (isInEditMode()) {
            lottieTaskFromAsset = new LottieTask<>(new Callable() { // from class: com.airbnb.lottie.c
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    LottieAnimationView lottieAnimationView = this.f25893p0;
                    boolean z10 = lottieAnimationView.G0;
                    String str2 = str;
                    return z10 ? LottieCompositionFactory.fromAssetSync(lottieAnimationView.getContext(), str2) : LottieCompositionFactory.fromAssetSync(lottieAnimationView.getContext(), str2, null);
                }
            }, true);
        } else {
            lottieTaskFromAsset = this.G0 ? LottieCompositionFactory.fromAsset(getContext(), str) : LottieCompositionFactory.fromAsset(getContext(), str, null);
        }
        setCompositionTask(lottieTaskFromAsset);
    }

    public LottieAnimationView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f25570s0 = new d(this);
        this.f25571t0 = new c(this);
        this.v0 = 0;
        this.f25573w0 = new LottieDrawable();
        this.E0 = false;
        this.F0 = false;
        this.G0 = true;
        this.H0 = new HashSet();
        this.I0 = new HashSet();
        b(attributeSet, R.attr.lottieAnimationViewStyle);
    }

    public void setAnimation(InputStream inputStream, @Nullable String str) {
        setCompositionTask(LottieCompositionFactory.fromJsonInputStream(inputStream, str));
    }

    public void setAnimation(ZipInputStream zipInputStream, @Nullable String str) {
        setCompositionTask(LottieCompositionFactory.fromZipStream(zipInputStream, str));
    }

    public LottieAnimationView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f25570s0 = new d(this);
        this.f25571t0 = new c(this);
        this.v0 = 0;
        this.f25573w0 = new LottieDrawable();
        this.E0 = false;
        this.F0 = false;
        this.G0 = true;
        this.H0 = new HashSet();
        this.I0 = new HashSet();
        b(attributeSet, i10);
    }
}
