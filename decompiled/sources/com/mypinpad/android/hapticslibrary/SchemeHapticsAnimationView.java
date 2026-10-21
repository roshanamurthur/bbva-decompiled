package com.mypinpad.android.hapticslibrary;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.annotation.ColorInt;
import androidx.core.graphics.ColorUtils;
import com.mastercard.sonic.controller.SonicController;
import com.mastercard.sonic.controller.SonicType;
import com.mastercard.sonic.listeners.OnCompleteListener;
import com.mastercard.sonic.listeners.OnPrepareListener;
import com.mastercard.sonic.widget.SonicView;
import com.mypinpad.android.hapticslibrary.SchemeHapticsAnimationView;
import com.visa.CheckmarkMode;
import com.visa.CheckmarkTextOption;
import com.visa.SensoryBrandingView;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: SchemeHapticsAnimationView.kt */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u0002¢\u0006\u0004\b\u001f\u0010 J\b\u0010\u0003\u001a\u00020\u0002H\u0002JZ\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00042\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072+\b\u0002\u0010\u000f\u001a%\u0012\u0013\u0012\u00110\u0000¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\r\u0018\u00010\tj\u0004\u0018\u0001`\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u0002H\u0016R\u001b\u0010\u0019\u001a\u00020\u00148BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006!"}, d2 = {"Lcom/mypinpad/android/hapticslibrary/SchemeHapticsAnimationView;", "Landroid/widget/FrameLayout;", "", "getBackgroundColorFromView", "Lcom/mypinpad/android/hapticslibrary/CardScheme;", "scheme", "backgroundColor", "", "languageCode", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "view", "", "Lcom/mypinpad/android/hapticslibrary/OnAnimationFinishedCallback;", "onFinish", "play", "(Lcom/mypinpad/android/hapticslibrary/CardScheme;Ljava/lang/Integer;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V", "color", "setBackgroundColor", "Lcom/mastercard/sonic/controller/SonicController;", "p0", "Lkotlin/Lazy;", "getSonicController", "()Lcom/mastercard/sonic/controller/SonicController;", "sonicController", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "android-scheme-haptics-library.implementation"}, k = 1, mv = {1, 7, 1})
public final class SchemeHapticsAnimationView extends FrameLayout {

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public static final /* synthetic */ int f51597s0 = 0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Lazy sonicController;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    @NotNull
    public final SensoryBrandingView f51599q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    @NotNull
    public final SonicView f51600r0;

    /* JADX INFO: compiled from: SchemeHapticsAnimationView.kt */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CardScheme.values().length];
            try {
                iArr[CardScheme.MASTERCARD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CardScheme.VISA.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: compiled from: SchemeHapticsAnimationView.kt */
    public static final class a extends Lambda implements Function0<SonicController> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final a f51601p0 = new a(0);

        @Override // kotlin.jvm.functions.Function0
        public final SonicController invoke() {
            return new SonicController();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public SchemeHapticsAnimationView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final int getBackgroundColorFromView() {
        Drawable background = getBackground();
        if (background instanceof ColorDrawable) {
            return ((ColorDrawable) background).getColor();
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SonicController getSonicController() {
        return (SonicController) this.sonicController.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void play$default(SchemeHapticsAnimationView schemeHapticsAnimationView, CardScheme cardScheme, Integer num, String str, Function1 function1, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            num = null;
        }
        if ((i10 & 4) != 0) {
            str = null;
        }
        if ((i10 & 8) != 0) {
            function1 = null;
        }
        schemeHapticsAnimationView.play(cardScheme, num, str, function1);
    }

    public final void a(final Function1<? super SchemeHapticsAnimationView, Unit> function1) {
        if (getSonicController().getIsPlaying()) {
            return;
        }
        SonicController sonicController = getSonicController();
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "this@SchemeHapticsAnimationView.context");
        SonicType sonicType = SonicType.SOUND_AND_ANIMATION;
        final SonicView sonicView = this.f51600r0;
        sonicController.prepare(context, sonicType, new OnPrepareListener() { // from class: com.mypinpad.android.hapticslibrary.SchemeHapticsAnimationView$playMastercardAnimation$1$1
            @Override // com.mastercard.sonic.listeners.OnPrepareListener
            public void onPrepared(int statusCode) {
                if (statusCode != 800) {
                    return;
                }
                final SchemeHapticsAnimationView schemeHapticsAnimationView = this.f51602a;
                SonicController sonicController2 = schemeHapticsAnimationView.getSonicController();
                final Function1<SchemeHapticsAnimationView, Unit> function2 = function1;
                sonicController2.play(new OnCompleteListener() { // from class: com.mypinpad.android.hapticslibrary.SchemeHapticsAnimationView$playMastercardAnimation$1$1$onPrepared$1
                    @Override // com.mastercard.sonic.listeners.OnCompleteListener
                    public void onComplete(int statusCode2) {
                        Function1<SchemeHapticsAnimationView, Unit> function3 = function2;
                        if (function3 != null) {
                            function3.invoke(schemeHapticsAnimationView);
                        }
                    }
                }, sonicView);
            }
        });
    }

    public final void play(@NotNull CardScheme scheme, @ColorInt @Nullable Integer backgroundColor, @Nullable String languageCode, @Nullable final Function1<? super SchemeHapticsAnimationView, Unit> onFinish) {
        Intrinsics.checkNotNullParameter(scheme, "scheme");
        setBackgroundColor(backgroundColor != null ? backgroundColor.intValue() : getBackgroundColorFromView());
        int i10 = WhenMappings.$EnumSwitchMapping$0[scheme.ordinal()];
        SonicView sonicView = this.f51600r0;
        final SensoryBrandingView sensoryBrandingView = this.f51599q0;
        if (i10 == 1) {
            sensoryBrandingView.setVisibility(4);
            sonicView.setVisibility(0);
            a(onFinish);
        } else {
            if (i10 != 2) {
                return;
            }
            sensoryBrandingView.setVisibility(0);
            sonicView.setVisibility(4);
            if (languageCode != null) {
                sensoryBrandingView.setLanguageCode(languageCode);
            }
            sensoryBrandingView.post(new Runnable() { // from class: ei.a
                @Override // java.lang.Runnable
                public final void run() {
                    int i11 = SchemeHapticsAnimationView.f51597s0;
                    SensoryBrandingView this_with = sensoryBrandingView;
                    Intrinsics.checkNotNullParameter(this_with, "$this_with");
                    SchemeHapticsAnimationView this$0 = this;
                    Intrinsics.checkNotNullParameter(this$0, "this$0");
                    this_with.animate(new b(onFinish, this$0));
                }
            });
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int color) {
        int alphaComponent = ColorUtils.setAlphaComponent(color, 255);
        super.setBackgroundColor(alphaComponent);
        this.f51599q0.setBackdropColor(alphaComponent);
        this.f51600r0.setBackgroundColor(alphaComponent);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public SchemeHapticsAnimationView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ SchemeHapticsAnimationView(Context context, AttributeSet attributeSet, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public SchemeHapticsAnimationView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        Intrinsics.checkNotNullParameter(context, "context");
        this.sonicController = LazyKt__LazyJVMKt.lazy(a.f51601p0);
        SensoryBrandingView sensoryBrandingView = new SensoryBrandingView(context, null);
        sensoryBrandingView.setVisibility(4);
        sensoryBrandingView.setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 17));
        sensoryBrandingView.setHapticEnabled(true);
        sensoryBrandingView.setSoundEnabled(true);
        sensoryBrandingView.setCheckmarkMode(CheckmarkMode.CHECKMARK_WITH_TEXT);
        sensoryBrandingView.setCheckmarkText(CheckmarkTextOption.APPROVE);
        this.f51599q0 = sensoryBrandingView;
        SonicView sonicView = new SonicView(context, null, 0, 4, null);
        sonicView.setVisibility(4);
        sonicView.setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 17));
        sonicView.setKeepBackground(false);
        this.f51600r0 = sonicView;
        addView(sensoryBrandingView);
        addView(sonicView);
        TypedArray _init_$lambda$2 = context.getTheme().obtainStyledAttributes(attributeSet, R.styleable.TransactionProcessedView, i10, 0);
        try {
            Intrinsics.checkNotNullExpressionValue(_init_$lambda$2, "_init_$lambda$2");
            int i11 = R.styleable.TransactionProcessedView_cardType;
            CardScheme cardScheme = CardScheme.VISA;
            int i12 = _init_$lambda$2.getInt(i11, -1);
            cardScheme = i12 >= 0 ? CardScheme.values()[i12] : cardScheme;
            if (_init_$lambda$2.getBoolean(R.styleable.TransactionProcessedView_autoPlay, false)) {
                play$default(this, cardScheme, null, null, null, 14, null);
            }
        } finally {
            _init_$lambda$2.recycle();
        }
    }
}
