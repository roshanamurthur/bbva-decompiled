package com.mypinpad.tsdk.isolation;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Process;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.ExpandableListView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.activity.ComponentActivity;
import androidx.camera.camera2.internal.n1;
import androidx.camera.core.b0;
import androidx.core.content.res.ResourcesCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.ViewGroupKt;
import com.google.android.play.core.splitcompat.SplitCompat;
import com.mastercard.mpsdk.mcbp.mcmlite.apdu.emv.GetProcessingOptionsCommandApdu;
import com.mypinpad.tsdk.R;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import mk.c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u0000 $2\u00020\u0001:\u0001$B\u0007¢\u0006\u0004\b3\u0010\bJ\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0015¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\t\u0010\bJ\u0019\u0010\u000b\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\nH\u0014¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\r\u0010\bJ\u0017\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u000eH\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\r\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0011H\u0000¢\u0006\u0004\b\r\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0013\u0010\bR(\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00040\u00148\u0007@\u0007X\u0087.¢\u0006\u0012\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\r\u0010\u0018R(\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00040\u00148\u0007@\u0007X\u0087.¢\u0006\u0012\n\u0004\b\u001a\u0010\u0015\u001a\u0004\b\u001b\u0010\u0017\"\u0004\b\u0016\u0010\u0018RR\u0010(\u001a2\u0012\u0013\u0012\u00110\u0011¢\u0006\f\b\u001e\u0012\b\b\u001f\u0012\u0004\b\b( \u0012\u0013\u0012\u00110\u0011¢\u0006\f\b\u001e\u0012\b\b\u001f\u0012\u0004\b\b(!\u0012\u0004\u0012\u00020\u00040\u001d8\u0007@\u0007X\u0087.¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'RR\u0010\u0013\u001a2\u0012\u0013\u0012\u00110)¢\u0006\f\b\u001e\u0012\b\b\u001f\u0012\u0004\b\b(*\u0012\u0013\u0012\u00110)¢\u0006\f\b\u001e\u0012\b\b\u001f\u0012\u0004\b\b(+\u0012\u0004\u0012\u00020\u00040\u001d8\u0007@\u0007X\u0087.¢\u0006\u0012\n\u0004\b,\u0010#\u001a\u0004\b&\u0010%\"\u0004\b$\u0010'R\"\u0010$\u001a\u00020-8\u0001@\u0001X\u0080.¢\u0006\u0012\n\u0004\b.\u0010/\u001a\u0004\b0\u00101\"\u0004\b$\u00102"}, d2 = {"Lcom/mypinpad/tsdk/i/setLastBaselineToBottomHeight;", "Landroidx/activity/ComponentActivity;", "Landroid/os/Bundle;", "p0", "", "onCreate", "(Landroid/os/Bundle;)V", "onResume", "()V", "onPause", "Landroid/content/Context;", "attachBaseContext", "(Landroid/content/Context;)V", "setOnFocusChangeListener", "Landroid/graphics/Bitmap;", "p_", "(Landroid/graphics/Bitmap;)V", "", "(I)V", "setOnLongClickListener", "Lkotlin/Function0;", "Lkotlin/jvm/functions/Function0;", "setCompoundDrawableTintBlendMode", "()Lkotlin/jvm/functions/Function0;", "(Lkotlin/jvm/functions/Function0;)V", "setNavigationOnClickListener", "q0", "setX", "setLayoutAnimation", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "width", "height", "r0", "Lkotlin/jvm/functions/Function2;", "setDividerPadding", "()Lkotlin/jvm/functions/Function2;", "setY", "(Lkotlin/jvm/functions/Function2;)V", "UiMessageCallbackKtWhenMappings", "", "x", "y", "s0", "Lcom/mypinpad/tsdk/i/component32;", "t0", "Lcom/mypinpad/tsdk/i/component32;", "j", "()Lcom/mypinpad/tsdk/i/component32;", "(Lcom/mypinpad/tsdk/i/component32;)V", "<init>"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nPinActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PinActivity.kt\ncom/mypinpad/pin/implementation/ui/PinActivity\n+ 2 View.kt\nandroidx/core/view/ViewKt\n+ 3 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n*L\n1#1,369:1\n66#2,4:370\n38#2:374\n54#2:375\n73#2:376\n123#3,2:377\n*S KotlinDebug\n*F\n+ 1 PinActivity.kt\ncom/mypinpad/pin/implementation/ui/PinActivity\n*L\n169#1:370,4\n169#1:374\n169#1:375\n169#1:376\n286#1:377,2\n*E\n"})
public final class setLastBaselineToBottomHeight extends ComponentActivity {
    public static long I0;
    public static int J0;
    public static int K0;
    public static int L0;
    public static int M0;
    public static final byte[] N0 = null;
    public ViewGroup E0;
    public ProgressBar F0;
    public setExtractedText G0;

    @Nullable
    public setLongClickable H0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name and from kotlin metadata */
    public Function0<Unit> setNavigationOnClickListener;

    /* JADX INFO: renamed from: q0, reason: collision with root package name and from kotlin metadata */
    public Function0<Unit> setLayoutAnimation;

    /* JADX INFO: renamed from: r0, reason: collision with root package name and from kotlin metadata */
    public Function2<? super Integer, ? super Integer, Unit> UiMessageCallbackKtWhenMappings;

    /* JADX INFO: renamed from: s0, reason: collision with root package name and from kotlin metadata */
    public Function2<? super Float, ? super Float, Unit> setOnLongClickListener;

    /* JADX INFO: renamed from: t0, reason: collision with root package name and from kotlin metadata */
    public component32 setDividerPadding;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public ViewGroup f59944u0;
    public TextView v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public ViewGroup f59945w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public TextView f59946x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public TextView f59947y0;

    public /* synthetic */ class setCompoundDrawableTintBlendMode {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int f59948a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f59949b;
        public static final /* synthetic */ int[] setCompoundDrawableTintBlendMode;

        static {
            int[] iArr = new int[setExtractedText.values().length];
            try {
                iArr[setExtractedText.setCompoundDrawableTintBlendMode.ordinal()] = 1;
                int i10 = 1 & 29;
                int i11 = -(-(1 | 29));
                int i12 = ((i10 | i11) << 1) - (i10 ^ i11);
                f59948a = i12 % 128;
                int i13 = i12 % 2;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[setExtractedText.setDividerPadding.ordinal()] = 2;
                int i14 = f59948a;
                int i15 = ((-1) << 1) - (((i14 ^ 96) + ((i14 & 96) << 1)) ^ (-1));
                f59949b = i15 % 128;
                int i16 = i15 % 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[setExtractedText.setX.ordinal()] = 3;
                int i17 = f59948a;
                int i18 = (((i17 | 84) << 1) - (i17 ^ 84)) - 1;
                f59949b = i18 % 128;
                int i19 = i18 % 2;
            } catch (NoSuchFieldError unused3) {
            }
            setCompoundDrawableTintBlendMode = iArr;
            int i20 = f59949b + 1;
            f59948a = i20 % 128;
            int i21 = i20 % 2;
        }
    }

    public static final class setOnFocusChangeListener implements setTransitionGroup {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static int f59950c = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static int f59951d = 1;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ setLastBaselineToBottomHeight f59952a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ String f59953b;

        public static /* synthetic */ Object setDividerPadding(Object[] objArr, int i10, int i11, int i12) {
            Toast toastMakeText;
            int i13 = ~i10;
            int i14 = ~i12;
            int i15 = ~(i13 | i14);
            int i16 = ~i11;
            int i17 = ((i15 | (~(i16 | i14))) * (-867)) + (i11 * 868) + (i10 * 868);
            int i18 = i13 | i16;
            if ((((~(i10 | i16 | i12)) | (~(i11 | i13 | i12)) | (~(i18 | i14))) * 867) + (((~i18) | (~(i13 | i12)) | (~(i16 | i12))) * (-1734)) + i17 != 1) {
                setLastBaselineToBottomHeight setlastbaselinetobottomheight = (setLastBaselineToBottomHeight) objArr[0];
                String str = (String) objArr[1];
                int i19 = f59950c;
                int i20 = (i19 ^ 35) + ((i19 & 35) << 1);
                f59951d = i20 % 128;
                if (i20 % 2 == 0) {
                    Intrinsics.checkNotNullParameter(setlastbaselinetobottomheight, "");
                    Intrinsics.checkNotNullParameter(str, "");
                    toastMakeText = Toast.makeText(setlastbaselinetobottomheight, str, 1);
                } else {
                    Intrinsics.checkNotNullParameter(setlastbaselinetobottomheight, "");
                    Intrinsics.checkNotNullParameter(str, "");
                    toastMakeText = Toast.makeText(setlastbaselinetobottomheight, str, 0);
                }
                toastMakeText.show();
            } else {
                setOnFocusChangeListener setonfocuschangelistener = (setOnFocusChangeListener) objArr[0];
                int i21 = (-2) - ((f59950c + 50) ^ (-1));
                f59951d = i21 % 128;
                int i22 = i21 % 2;
                setLastBaselineToBottomHeight setlastbaselinetobottomheight2 = setonfocuschangelistener.f59952a;
                setlastbaselinetobottomheight2.runOnUiThread(new b0(setlastbaselinetobottomheight2, setonfocuschangelistener.f59953b, 5));
                int i23 = f59951d;
                int i24 = (i23 & 53) + (i23 | 53);
                f59950c = i24 % 128;
                if (i24 % 2 != 0) {
                    throw null;
                }
            }
            return null;
        }

        @Override // com.mypinpad.tsdk.isolation.setTransitionGroup
        public final void setY() {
            setDividerPadding(new Object[]{this}, -714657930, 714657931, System.identityHashCode(this));
        }
    }

    @SourceDebugExtension({"SMAP\nView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 View.kt\nandroidx/core/view/ViewKt$doOnNextLayout$1\n+ 2 View.kt\nandroidx/core/view/ViewKt\n+ 3 PinActivity.kt\ncom/mypinpad/pin/implementation/ui/PinActivity\n*L\n1#1,411:1\n70#2:412\n71#2:418\n170#3,5:413\n*E\n"})
    public final class setY implements View.OnLayoutChangeListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static int f59957b = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static int f59958c = 1;

        public setY() {
        }

        public static /* synthetic */ Object setOnFocusChangeListener(Object[] objArr, int i10, int i11, int i12) {
            setY sety = (setY) objArr[0];
            View view = (View) objArr[1];
            ((Number) objArr[2]).intValue();
            ((Number) objArr[3]).intValue();
            ((Number) objArr[4]).intValue();
            ((Number) objArr[5]).intValue();
            ((Number) objArr[6]).intValue();
            ((Number) objArr[7]).intValue();
            ((Number) objArr[8]).intValue();
            ((Number) objArr[9]).intValue();
            int i13 = f59958c + 91;
            f59957b = i13 % 128;
            if (i13 % 2 != 0) {
                Intrinsics.checkNotNullParameter(view, "");
                view.removeOnLayoutChangeListener(sety);
                setLastBaselineToBottomHeight setlastbaselinetobottomheight = setLastBaselineToBottomHeight.this;
                ((Function2) setLastBaselineToBottomHeight.setDividerPadding(new Object[]{setlastbaselinetobottomheight}, -1433164136, 1433164137, System.identityHashCode(setlastbaselinetobottomheight))).invoke(Integer.valueOf(view.getWidth()), Integer.valueOf(view.getHeight()));
                throw null;
            }
            Intrinsics.checkNotNullParameter(view, "");
            view.removeOnLayoutChangeListener(sety);
            setLastBaselineToBottomHeight setlastbaselinetobottomheight2 = setLastBaselineToBottomHeight.this;
            ((Function2) setLastBaselineToBottomHeight.setDividerPadding(new Object[]{setlastbaselinetobottomheight2}, -1433164136, 1433164137, System.identityHashCode(setlastbaselinetobottomheight2))).invoke(Integer.valueOf(view.getWidth()), Integer.valueOf(view.getHeight()));
            int i14 = f59957b;
            int i15 = i14 & 95;
            int i16 = (i14 | 95) & (~i15);
            int i17 = -(-(i15 << 1));
            int i18 = ((i16 | i17) << 1) - (i16 ^ i17);
            f59958c = i18 % 128;
            int i19 = i18 % 2;
            return null;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public final void onLayoutChange(@NotNull View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
            setOnFocusChangeListener(new Object[]{this, view, Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13), Integer.valueOf(i14), Integer.valueOf(i15), Integer.valueOf(i16), Integer.valueOf(i17)}, -98895931, 98895931, i10);
        }
    }

    static {
        k();
        L0 = 0;
        M0 = 1;
        J0 = 0;
        K0 = 1;
        l();
        INSTANCE = new Companion(null);
        int i10 = J0 + 51;
        K0 = i10 % 128;
        int i11 = i10 % 2;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0027  */
    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static void d(int r6, byte r7, int r8, java.lang.Object[] r9) {
        /*
            int r8 = r8 + 4
            int r7 = r7 * 3
            int r7 = 110 - r7
            int r6 = r6 * 3
            int r0 = r6 + 1
            byte[] r0 = new byte[r0]
            byte[] r1 = com.mypinpad.tsdk.isolation.setLastBaselineToBottomHeight.N0
            r2 = 0
            if (r1 != 0) goto L15
            r3 = r7
            r4 = r2
            r7 = r6
            goto L2c
        L15:
            r3 = r2
        L16:
            byte r4 = (byte) r7
            int r8 = r8 + 1
            r0[r3] = r4
            int r4 = r3 + 1
            if (r3 != r6) goto L27
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L27:
            r3 = r1[r8]
            r5 = r7
            r7 = r6
            r6 = r5
        L2c:
            int r6 = r6 + r3
            r3 = r4
            r5 = r7
            r7 = r6
            r6 = r5
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.setLastBaselineToBottomHeight.d(int, byte, int, java.lang.Object[]):void");
    }

    public static void k() {
        N0 = new byte[]{46, -94, 74, GetProcessingOptionsCommandApdu.COMMAND_TEMPLATE_TAG};
    }

    public static void l() {
        I0 = 5386838255171527104L;
    }

    /* JADX WARN: Code duplicated, block: B:64:0x022a  */
    public static Object setDividerPadding(Object[] objArr, int i10, int i11, int i12) {
        int i13 = ~i10;
        int i14 = ~(i13 | i11);
        int i15 = ~(i13 | i12);
        int i16 = ~i11;
        int i17 = ((i15 | (~(i16 | i12))) * 140) + ((i14 | i15) * (-280)) + (i11 * (-139)) + (i10 * 141);
        int i18 = ~(i13 | i16 | i12);
        int i19 = ~i12;
        int i20 = (((~(i10 | i19 | i16)) | (~(i11 | i13 | i19)) | i18) * 140) + i17;
        if (i20 == 1) {
            setLastBaselineToBottomHeight setlastbaselinetobottomheight = (setLastBaselineToBottomHeight) objArr[0];
            int i21 = J0 + 45;
            K0 = i21 % 128;
            int i22 = i21 % 2;
            Function2<? super Integer, ? super Integer, Unit> function2 = setlastbaselinetobottomheight.UiMessageCallbackKtWhenMappings;
            if (i22 == 0) {
                throw null;
            }
            if (function2 != null) {
                return function2;
            }
            Intrinsics.throwUninitializedPropertyAccessException("");
            int i23 = K0 + 105;
            J0 = i23 % 128;
            if (i23 % 2 == 0) {
                return null;
            }
            int i24 = 22 / 0;
            return null;
        }
        if (i20 == 2) {
            setLastBaselineToBottomHeight setlastbaselinetobottomheight2 = (setLastBaselineToBottomHeight) objArr[0];
            super.onCreate((Bundle) objArr[1]);
            setExtractedText setextractedtext = (setExtractedText) setScrollCaptureHint.setDividerPadding(new Object[]{setlastbaselinetobottomheight2}, -273529248, 273529249, (int) System.currentTimeMillis());
            setlastbaselinetobottomheight2.G0 = setextractedtext;
            if (setextractedtext == null) {
                int i25 = K0 + 97;
                J0 = i25 % 128;
                if (i25 % 2 != 0) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                    throw null;
                }
                Intrinsics.throwUninitializedPropertyAccessException("");
                setextractedtext = null;
            }
            if (setextractedtext == setExtractedText.setCompoundDrawableTintBlendMode) {
                setlastbaselinetobottomheight2.setRequestedOrientation(12);
            } else {
                setExtractedText setextractedtext2 = setlastbaselinetobottomheight2.G0;
                if (setextractedtext2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                    setextractedtext2 = null;
                }
                if (setextractedtext2 == setExtractedText.setDividerPadding) {
                    setlastbaselinetobottomheight2.setRequestedOrientation(12);
                }
            }
            setlastbaselinetobottomheight2.setContentView(R.layout.mpp_pin_activity);
            int i26 = K0 + 39;
            J0 = i26 % 128;
            if (i26 % 2 == 0) {
                return null;
            }
            int i27 = 35 / 0;
            return null;
        }
        if (i20 != 3) {
            if (i20 == 4) {
                setLastBaselineToBottomHeight setlastbaselinetobottomheight3 = (setLastBaselineToBottomHeight) objArr[0];
                int i28 = J0 + 43;
                K0 = i28 % 128;
                if (i28 % 2 == 0) {
                    super.onPause();
                    setlastbaselinetobottomheight3.H0 = null;
                    throw null;
                }
                super.onPause();
                setlastbaselinetobottomheight3.H0 = null;
                int i29 = K0 + 31;
                J0 = i29 % 128;
                if (i29 % 2 == 0) {
                    return null;
                }
                int i30 = 38 / 0;
                return null;
            }
            if (i20 == 5) {
                setLastBaselineToBottomHeight setlastbaselinetobottomheight4 = (setLastBaselineToBottomHeight) objArr[0];
                int i31 = J0 + 87;
                K0 = i31 % 128;
                if (i31 % 2 == 0) {
                    setlastbaselinetobottomheight4.getWindow().setStatusBarColor(setlastbaselinetobottomheight4.j().setX());
                    int i32 = 22 / 0;
                } else {
                    setlastbaselinetobottomheight4.getWindow().setStatusBarColor(setlastbaselinetobottomheight4.j().setX());
                }
                int i33 = J0 + 1;
                K0 = i33 % 128;
                int i34 = i33 % 2;
                return null;
            }
            setLastBaselineToBottomHeight setlastbaselinetobottomheight5 = (setLastBaselineToBottomHeight) objArr[0];
            Function0<Unit> function0 = (Function0) objArr[1];
            int i35 = K0 + 31;
            J0 = i35 % 128;
            if (i35 % 2 != 0) {
                Intrinsics.checkNotNullParameter(function0, "");
                setlastbaselinetobottomheight5.setLayoutAnimation = function0;
                int i36 = 93 / 0;
            } else {
                Intrinsics.checkNotNullParameter(function0, "");
                setlastbaselinetobottomheight5.setLayoutAnimation = function0;
            }
            int i37 = K0 + 15;
            J0 = i37 % 128;
            if (i37 % 2 == 0) {
                return null;
            }
            int i38 = 89 / 0;
            return null;
        }
        setLastBaselineToBottomHeight setlastbaselinetobottomheight6 = (setLastBaselineToBottomHeight) objArr[0];
        View viewFindViewById = setlastbaselinetobottomheight6.findViewById(R.id.root_view);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "");
        setlastbaselinetobottomheight6.f59944u0 = (ViewGroup) viewFindViewById;
        View viewFindViewById2 = setlastbaselinetobottomheight6.findViewById(R.id.nav_title);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "");
        setlastbaselinetobottomheight6.v0 = (TextView) viewFindViewById2;
        View viewFindViewById3 = setlastbaselinetobottomheight6.findViewById(R.id.amount);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "");
        setlastbaselinetobottomheight6.f59946x0 = (TextView) viewFindViewById3;
        View viewFindViewById4 = setlastbaselinetobottomheight6.findViewById(R.id.details);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "");
        setlastbaselinetobottomheight6.f59947y0 = (TextView) viewFindViewById4;
        View viewFindViewById5 = setlastbaselinetobottomheight6.findViewById(R.id.digits_container);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "");
        setlastbaselinetobottomheight6.f59945w0 = (ViewGroup) viewFindViewById5;
        View viewFindViewById6 = setlastbaselinetobottomheight6.findViewById(R.id.pin_pad_container);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById6, "");
        setlastbaselinetobottomheight6.E0 = (ViewGroup) viewFindViewById6;
        View viewFindViewById7 = setlastbaselinetobottomheight6.findViewById(R.id.progress);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById7, "");
        setlastbaselinetobottomheight6.F0 = (ProgressBar) viewFindViewById7;
        setIndicatorBoundsRelative setindicatorboundsrelative = new setIndicatorBoundsRelative(setlastbaselinetobottomheight6, setlastbaselinetobottomheight6.H0);
        setX setx = new setX();
        setx.f59956a = setlastbaselinetobottomheight6;
        setindicatorboundsrelative.setPadViewListener(setx);
        setindicatorboundsrelative.setFilterTouchesWhenObscured(true);
        ViewGroup viewGroup = setlastbaselinetobottomheight6.E0;
        if (viewGroup == null) {
            int i39 = J0 + 125;
            K0 = i39 % 128;
            int i40 = i39 % 2;
            Intrinsics.throwUninitializedPropertyAccessException("");
            viewGroup = null;
        }
        viewGroup.addView(setindicatorboundsrelative, new ViewGroup.LayoutParams(-1, -1));
        ViewGroup viewGroup2 = setlastbaselinetobottomheight6.E0;
        if (viewGroup2 == null) {
            int i41 = K0 + 123;
            J0 = i41 % 128;
            if (i41 % 2 != 0) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                throw null;
            }
            Intrinsics.throwUninitializedPropertyAccessException("");
            viewGroup2 = null;
        }
        if (!ViewCompat.isLaidOut(viewGroup2) || viewGroup2.isLayoutRequested()) {
            viewGroup2.addOnLayoutChangeListener(setlastbaselinetobottomheight6.new setY());
            return null;
        }
        int i42 = K0 + 115;
        J0 = i42 % 128;
        if (i42 % 2 == 0) {
            ((Function2) setDividerPadding(new Object[]{setlastbaselinetobottomheight6}, -1433164136, 1433164137, System.identityHashCode(setlastbaselinetobottomheight6))).invoke(Integer.valueOf(viewGroup2.getWidth()), Integer.valueOf(viewGroup2.getHeight()));
            return null;
        }
        ((Function2) setDividerPadding(new Object[]{setlastbaselinetobottomheight6}, -1433164136, 1433164137, System.identityHashCode(setlastbaselinetobottomheight6))).invoke(Integer.valueOf(viewGroup2.getWidth()), Integer.valueOf(viewGroup2.getHeight()));
        throw null;
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(@Nullable Context p4) {
        int i10 = K0 + 39;
        J0 = i10 % 128;
        int i11 = i10 % 2;
        super.attachBaseContext(p4);
        SplitCompat.installActivity(this);
        int i12 = K0 + 101;
        J0 = i12 % 128;
        if (i12 % 2 != 0) {
            throw null;
        }
    }

    public final boolean i() {
        int i10 = K0 + 59;
        J0 = i10 % 128;
        if (i10 % 2 == 0 ? getResources().getConfiguration().orientation == 1 : getResources().getConfiguration().orientation == 1) {
            return true;
        }
        int i11 = J0 + 15;
        K0 = i11 % 128;
        if (i11 % 2 != 0) {
            return false;
        }
        throw null;
    }

    @JvmName(name = "getNavBarTitleString")
    @NotNull
    public final component32 j() {
        int i10 = J0 + 63;
        int i11 = i10 % 128;
        K0 = i11;
        int i12 = i10 % 2;
        component32 component32Var = this.setDividerPadding;
        if (component32Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            return null;
        }
        int i13 = i11 + 99;
        J0 = i13 % 128;
        int i14 = i13 % 2;
        return component32Var;
    }

    public final void m() {
        int i10 = K0 + 111;
        J0 = i10 % 128;
        if (i10 % 2 != 0) {
            j().setImageResource();
            throw null;
        }
        String imageResource = j().setImageResource();
        if (imageResource == null) {
            int i11 = J0 + 115;
            K0 = i11 % 128;
            int i12 = i11 % 2;
        } else {
            setOnFocusChangeListener setonfocuschangelistener = new setOnFocusChangeListener();
            setonfocuschangelistener.f59952a = this;
            setonfocuschangelistener.f59953b = imageResource;
            setLongClickable setlongclickable = new setLongClickable(this, setonfocuschangelistener);
            getWindow().getDecorView().getRootView().setOnTouchListener(setlongclickable);
            this.H0 = setlongclickable;
        }
    }

    public final void n() {
        int i10 = J0 + 93;
        K0 = i10 % 128;
        int i11 = i10 % 2;
        setOnClickListener.setY(new Object[]{this}, 2067758989, -2067758988, (int) System.currentTimeMillis());
        setOnClickListener.setY(new Object[]{this}, 2105355722, -2105355722, (int) System.currentTimeMillis());
        int i12 = J0 + 105;
        K0 = i12 % 128;
        if (i12 % 2 == 0) {
            throw null;
        }
    }

    public final void o(ViewGroup viewGroup) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(j().getAmountFieldTextColor());
        gradientDrawable.setStroke(j().setTextScaleX(), j().setLayoutDirection());
        viewGroup.setBackground(gradientDrawable);
        int i10 = K0 + 95;
        J0 = i10 % 128;
        if (i10 % 2 != 0) {
            throw null;
        }
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    @SuppressLint({"SourceLockedOrientationActivity"})
    public final void onCreate(@Nullable Bundle p4) {
        setDividerPadding(new Object[]{this, p4}, 377925137, -377925135, System.identityHashCode(this));
    }

    @Override // android.app.Activity
    public final void onPause() {
        setDividerPadding(new Object[]{this}, -1415366204, 1415366208, System.identityHashCode(this));
    }

    /* JADX WARN: Code duplicated, block: B:112:0x04ae A[PHI: r1
      0x04ae: PHI (r1v75 int) = (r1v74 int), (r1v79 int) binds: [B:111:0x04ac, B:107:0x049d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:14:0x0058  */
    @Override // android.app.Activity
    public final void onResume() {
        Pair pair;
        int compoundDrawablePadding;
        ProgressBar progressBar;
        super.onResume();
        int i10 = 2;
        if (isInMultiWindowMode() || isInPictureInPictureMode()) {
            if (this.setNavigationOnClickListener != null) {
                setCompoundDrawableTintBlendMode().invoke();
                return;
            }
            finishAndRemoveTask();
            int i11 = J0 + 105;
            K0 = i11 % 128;
            if (i11 % 2 == 0) {
                int i12 = 61 / 0;
                return;
            }
            return;
        }
        setRequestedOrientation(14);
        int i13 = K0 + 1;
        J0 = i13 % 128;
        if (i13 % 2 != 0) {
            getWindow().setFlags(28370, 22596);
            getWindow().addFlags(3924);
            if (Build.VERSION.SDK_INT >= 92) {
                getWindow().setHideOverlayWindows(true);
            }
        } else {
            getWindow().setFlags(8192, 8192);
            getWindow().addFlags(128);
            if (Build.VERSION.SDK_INT >= 31) {
                getWindow().setHideOverlayWindows(true);
            }
        }
        int i14 = K0 + 97;
        J0 = i14 % 128;
        int i15 = i14 % 2;
        if (this.setDividerPadding == null) {
            return;
        }
        if (j().setMaxEms()) {
            int i16 = J0 + 111;
            K0 = i16 % 128;
            if (i16 % 2 == 0) {
                m();
                n();
                throw null;
            }
            m();
            n();
        }
        setDividerPadding(new Object[]{this}, -2028478008, 2028478011, System.identityHashCode(this));
        setDividerPadding(new Object[]{this}, -1922527233, 1922527238, System.identityHashCode(this));
        ViewGroup viewGroup = this.f59944u0;
        if (viewGroup == null) {
            int i17 = J0 + 93;
            K0 = i17 % 128;
            int i18 = i17 % 2;
            Intrinsics.throwUninitializedPropertyAccessException("");
            viewGroup = null;
        }
        viewGroup.setBackgroundColor(j().setY());
        ViewGroup viewGroup2 = this.f59945w0;
        if (viewGroup2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            viewGroup2 = null;
        }
        viewGroup2.setBackgroundColor(j().getNavBarTitleString());
        int i19 = K0 + 7;
        int i20 = i19 % 128;
        J0 = i20;
        int i21 = i19 % 2;
        setExtractedText setextractedtext = this.G0;
        if (setextractedtext == null) {
            int i22 = i20 + 21;
            K0 = i22 % 128;
            int i23 = i22 % 2;
            Intrinsics.throwUninitializedPropertyAccessException("");
            setextractedtext = null;
        }
        int i24 = setCompoundDrawableTintBlendMode.setCompoundDrawableTintBlendMode[setextractedtext.ordinal()];
        if (i24 == 2 || i24 == 3) {
            ViewGroup viewGroup3 = (ViewGroup) findViewById(R.id.tx_container);
            ViewGroup viewGroup4 = (ViewGroup) findViewById(R.id.pin_pad_container);
            setIndeterminateTintBlendMode suppressed = j().getSuppressed();
            if (suppressed != null) {
                int i25 = J0 + 75;
                K0 = i25 % 128;
                if (i25 % 2 == 0) {
                    i();
                    throw null;
                }
                if (i()) {
                    pair = new Pair((setEnabled) setIndeterminateTintBlendMode.setCompoundDrawableTintBlendMode(new Object[]{suppressed}, 1683462130, -1683462127, System.identityHashCode(suppressed)), (setEnabled) setIndeterminateTintBlendMode.setCompoundDrawableTintBlendMode(new Object[]{suppressed}, 169008367, -169008365, System.identityHashCode(suppressed)));
                    int i26 = K0 + 85;
                    J0 = i26 % 128;
                    if (i26 % 2 != 0) {
                        int i27 = 33 / 0;
                    }
                } else {
                    pair = new Pair((setEnabled) setIndeterminateTintBlendMode.setCompoundDrawableTintBlendMode(new Object[]{suppressed}, 1192711893, -1192711893, System.identityHashCode(suppressed)), (setEnabled) setIndeterminateTintBlendMode.setCompoundDrawableTintBlendMode(new Object[]{suppressed}, -1166597743, 1166597744, System.identityHashCode(suppressed)));
                }
                ViewGroup viewGroup5 = this.f59944u0;
                if (viewGroup5 == null) {
                    int i28 = K0 + 115;
                    J0 = i28 % 128;
                    int i29 = i28 % 2;
                    Intrinsics.throwUninitializedPropertyAccessException("");
                    viewGroup5 = null;
                }
                Intrinsics.checkNotNull(viewGroup5, "");
                ((RelativeLayout) viewGroup5).setGravity(0);
                setEnabled setenabled = (setEnabled) pair.getFirst();
                int iP = p(((Float) setEnabled.setOnFocusChangeListener(new Object[]{setenabled}, -2145506247, 2145506247, System.identityHashCode(setenabled))).floatValue());
                setEnabled setenabled2 = (setEnabled) pair.getFirst();
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(iP, p(((Float) setEnabled.setOnFocusChangeListener(new Object[]{setenabled2}, -119010684, 119010686, System.identityHashCode(setenabled2))).floatValue()));
                setEnabled setenabled3 = (setEnabled) pair.getFirst();
                int iP2 = p(((Float) setEnabled.setOnFocusChangeListener(new Object[]{setenabled3}, -333010703, 333010706, System.identityHashCode(setenabled3))).floatValue());
                setEnabled setenabled4 = (setEnabled) pair.getFirst();
                layoutParams.setMargins(iP2, p(((Float) setEnabled.setOnFocusChangeListener(new Object[]{setenabled4}, -1092152098, 1092152099, System.identityHashCode(setenabled4))).floatValue()), 0, 0);
                viewGroup3.setLayoutParams(layoutParams);
                setEnabled setenabled5 = (setEnabled) pair.getSecond();
                int iP3 = p(((Float) setEnabled.setOnFocusChangeListener(new Object[]{setenabled5}, -2145506247, 2145506247, System.identityHashCode(setenabled5))).floatValue());
                setEnabled setenabled6 = (setEnabled) pair.getSecond();
                RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(iP3, p(((Float) setEnabled.setOnFocusChangeListener(new Object[]{setenabled6}, -119010684, 119010686, System.identityHashCode(setenabled6))).floatValue()));
                setEnabled setenabled7 = (setEnabled) pair.getSecond();
                int iP4 = p(((Float) setEnabled.setOnFocusChangeListener(new Object[]{setenabled7}, -333010703, 333010706, System.identityHashCode(setenabled7))).floatValue());
                setEnabled setenabled8 = (setEnabled) pair.getSecond();
                layoutParams2.setMargins(iP4, p(((Float) setEnabled.setOnFocusChangeListener(new Object[]{setenabled8}, -1092152098, 1092152099, System.identityHashCode(setenabled8))).floatValue()), 0, 0);
                viewGroup4.setLayoutParams(layoutParams2);
            }
            Intrinsics.checkNotNullExpressionValue(viewGroup3, "");
            o(viewGroup3);
            Intrinsics.checkNotNullExpressionValue(viewGroup4, "");
            o(viewGroup4);
            int i30 = K0 + 99;
            J0 = i30 % 128;
            i10 = 2;
            int i31 = i30 % 2;
        }
        int i32 = J0 + 9;
        K0 = i32 % 128;
        int i33 = i32 % i10;
        component32 component32VarJ = j();
        TextView textView = this.v0;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            int i34 = K0 + 95;
            J0 = i34 % 128;
            int i35 = i34 % 2;
            textView = null;
        }
        textView.setText((String) component32.setY(new Object[]{component32VarJ}, -158889338, 158889338, System.identityHashCode(component32VarJ)));
        TextView textView2 = this.v0;
        if (textView2 == null) {
            int i36 = J0 + 3;
            K0 = i36 % 128;
            int i37 = i36 % 2;
            Intrinsics.throwUninitializedPropertyAccessException("");
            textView2 = null;
        }
        textView2.setTextSize(component32VarJ.setLayoutAnimation());
        TextView textView3 = this.v0;
        if (textView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            textView3 = null;
        }
        textView3.setTextColor(component32VarJ.setOnFocusChangeListener());
        findViewById(R.id.nav_bar).setBackgroundColor(component32VarJ.setCompoundDrawableTintBlendMode());
        int i38 = K0;
        int i39 = i38 + 117;
        J0 = i39 % 128;
        int i40 = i39 % 2;
        int i41 = i38 + 29;
        J0 = i41 % 128;
        int i42 = i41 % 2;
        component32 component32VarJ2 = j();
        TextView textView4 = this.f59946x0;
        if (textView4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            textView4 = null;
        }
        textView4.setText((String) component32.setY(new Object[]{component32VarJ2}, 144493983, -144493982, System.identityHashCode(component32VarJ2)));
        TextView textView5 = this.f59946x0;
        if (textView5 == null) {
            int i43 = K0 + 47;
            J0 = i43 % 128;
            int i44 = i43 % 2;
            Intrinsics.throwUninitializedPropertyAccessException("");
            int i45 = K0 + 43;
            J0 = i45 % 128;
            int i46 = i45 % 2;
            textView5 = null;
        }
        textView5.setTextSize(component32VarJ2.setTextAlignment());
        TextView textView6 = this.f59946x0;
        if (textView6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            textView6 = null;
        }
        textView6.setTextColor(component32VarJ2.setIncludeFontPadding());
        TextView textView7 = this.f59946x0;
        if (textView7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            textView7 = null;
        }
        textView7.setBackgroundColor(component32VarJ2.setOnDragListener());
        int i47 = J0 + 65;
        K0 = i47 % 128;
        if (i47 % 2 == 0) {
            j().setAlwaysDrawnWithCacheEnabled();
            throw null;
        }
        component32 component32VarJ3 = j();
        if (component32VarJ3.setAlwaysDrawnWithCacheEnabled() == null) {
            TextView textView8 = this.f59947y0;
            if (textView8 == null) {
                int i48 = J0 + 13;
                K0 = i48 % 128;
                int i49 = i48 % 2;
                Intrinsics.throwUninitializedPropertyAccessException("");
                textView8 = null;
            }
            textView8.setVisibility(8);
        } else {
            TextView textView9 = this.f59947y0;
            if (textView9 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                textView9 = null;
            }
            textView9.setText(component32VarJ3.setAlwaysDrawnWithCacheEnabled());
            TextView textView10 = this.f59947y0;
            if (textView10 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                textView10 = null;
            }
            textView10.setTextSize(((Float) component32.setY(new Object[]{component32VarJ3}, 48233972, -48233968, System.identityHashCode(component32VarJ3))).floatValue());
            TextView textView11 = this.f59947y0;
            if (textView11 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                int i50 = J0 + 5;
                K0 = i50 % 128;
                int i51 = i50 % 2;
                textView11 = null;
            }
            textView11.setTextColor(component32VarJ3.setZ());
            TextView textView12 = this.f59947y0;
            if (textView12 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                textView12 = null;
            }
            textView12.setBackgroundColor(((Integer) component32.setY(new Object[]{component32VarJ3}, -1008439229, 1008439231, System.identityHashCode(component32VarJ3))).intValue());
            TextView textView13 = this.f59947y0;
            if (textView13 == null) {
                int i52 = K0 + 121;
                J0 = i52 % 128;
                if (i52 % 2 != 0) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                    throw null;
                }
                Intrinsics.throwUninitializedPropertyAccessException("");
                textView13 = null;
            }
            textView13.setVisibility(0);
        }
        int i53 = J0 + 29;
        K0 = i53 % 128;
        if (i53 % 2 == 0) {
            compoundDrawablePadding = j().setCompoundDrawablePadding();
            ProgressBar progressBar2 = this.F0;
            int i54 = 69 / 0;
            if (progressBar2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                int i55 = J0 + 11;
                K0 = i55 % 128;
                int i56 = i55 % 2;
                progressBar = null;
            } else {
                progressBar = progressBar2;
            }
        } else {
            compoundDrawablePadding = j().setCompoundDrawablePadding();
            ProgressBar progressBar3 = this.F0;
            if (progressBar3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                int i57 = J0 + 11;
                K0 = i57 % 128;
                int i58 = i57 % 2;
                progressBar = null;
            } else {
                progressBar = progressBar3;
            }
        }
        progressBar.setIndeterminateTintList(ColorStateList.valueOf(compoundDrawablePadding));
    }

    public final int p(float f6) {
        int i10 = K0 + 21;
        J0 = i10 % 128;
        int i11 = i10 % 2;
        int iRoundToInt = c.roundToInt(getResources().getDisplayMetrics().density * f6);
        int i12 = J0 + 105;
        K0 = i12 % 128;
        int i13 = i12 % 2;
        return iRoundToInt;
    }

    /* JADX WARN: Code duplicated, block: B:42:0x01f4  */
    /* JADX WARN: Code duplicated, block: B:43:0x01f5  */
    public final void p_(@NotNull Bitmap p4) throws Throwable {
        char c10;
        Throwable cause;
        int i10 = J0 + 25;
        K0 = i10 % 128;
        char c11 = 2;
        int i11 = i10 % 2;
        Intrinsics.checkNotNullParameter(p4, "");
        ViewGroup viewGroup = this.E0;
        if (viewGroup == null) {
            int i12 = K0 + 43;
            J0 = i12 % 128;
            int i13 = i12 % 2;
            Intrinsics.throwUninitializedPropertyAccessException("");
            viewGroup = null;
        }
        for (View view : ViewGroupKt.getChildren(viewGroup)) {
            if (view instanceof ImageView) {
                int i14 = J0;
                int i15 = i14 + 15;
                K0 = i15 % 128;
                int i16 = i15 % 2;
                int i17 = i14 + 9;
                K0 = i17 % 128;
                int i18 = i17 % 2;
                Intrinsics.checkNotNull(view, "");
                ((ImageView) view).setImageBitmap(p4);
                return;
            }
        }
        int iIndexOf = 36151 - TextUtils.indexOf("", "");
        int i19 = M0 + 61;
        L0 = i19 % 128;
        int i20 = i19 % 2;
        char[] charArray = "Ȅ輅ᡈꖇ㛮쀪䵾\udeb3每\uf4db蘞፤鲷⧽물䐀텔拐\uefe7礭\u0a3b鞱₁귃㼒졭喯\ue6ee灳ﴁ蹄ᮊꓔ㘨썰䲼\ud98c檄\uf409腞ኪ龸⤡먘䝆킘巜\uef2d硦֤隌⎌".toCharArray();
        int i21 = M0 + 65;
        L0 = i21 % 128;
        int i22 = i21 % 2;
        setLayoutAnimation setlayoutanimation = new setLayoutAnimation();
        setlayoutanimation.setOnFocusChangeListener = iIndexOf;
        int length = charArray.length;
        long[] jArr = new long[length];
        int i23 = 0;
        setlayoutanimation.setCompoundDrawableTintBlendMode = 0;
        while (true) {
            int i24 = setlayoutanimation.setCompoundDrawableTintBlendMode;
            c10 = '0';
            if (i24 >= charArray.length) {
                break;
            }
            char c12 = charArray[i24];
            try {
                Object[] objArr = new Object[3];
                objArr[c11] = setlayoutanimation;
                objArr[1] = setlayoutanimation;
                objArr[i23] = Integer.valueOf(c12);
                Map map = setTextScaleX.setMaxEms;
                Object method = map.get(-764403778);
                if (method == null) {
                    Class cls = (Class) setTextScaleX.setX((char) ExpandableListView.getPackedPositionType(0L), 32 - TextUtils.indexOf((CharSequence) "", '0', i23, i23), 1194 - TextUtils.indexOf((CharSequence) "", '0', i23));
                    byte b10 = (byte) i23;
                    byte b11 = (byte) (b10 - 1);
                    Object[] objArr2 = new Object[1];
                    d(b10, (byte) (b11 + 1), b11, objArr2);
                    method = cls.getMethod((String) objArr2[0], Integer.TYPE, Object.class, Object.class);
                    map.put(-764403778, method);
                }
                jArr[i24] = ((Long) ((Method) method).invoke(null, objArr)).longValue() ^ (I0 ^ 1779209353347916695L);
                Object[] objArr3 = {setlayoutanimation, setlayoutanimation};
                Object method2 = map.get(645183118);
                if (method2 == null) {
                    Class cls2 = (Class) setTextScaleX.setX((char) ((-1) - MotionEvent.axisFromString("")), TextUtils.getOffsetAfter("", 0) + 44, (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 728);
                    byte b12 = (byte) 0;
                    byte b13 = (byte) (b12 - 1);
                    Object[] objArr4 = new Object[1];
                    d(b12, (byte) (-b13), b13, objArr4);
                    method2 = cls2.getMethod((String) objArr4[0], Object.class, Object.class);
                    map.put(645183118, method2);
                }
                ((Method) method2).invoke(null, objArr3);
                c11 = 2;
                i23 = 0;
            } catch (Throwable th2) {
                cause = th2.getCause();
                if (cause != null) {
                    throw th2;
                }
                throw cause;
            }
            cause = th2.getCause();
            if (cause != null) {
                throw th2;
            }
            throw cause;
        }
        char[] cArr = new char[length];
        setlayoutanimation.setCompoundDrawableTintBlendMode = 0;
        while (true) {
            int i25 = setlayoutanimation.setCompoundDrawableTintBlendMode;
            if (i25 >= charArray.length) {
                throw new NoSuchElementException(n1.f(cArr));
            }
            int i26 = L0 + 69;
            M0 = i26 % 128;
            int i27 = i26 % 2;
            cArr[i25] = (char) jArr[i25];
            Object[] objArr5 = {setlayoutanimation, setlayoutanimation};
            Map map2 = setTextScaleX.setMaxEms;
            Object method3 = map2.get(645183118);
            if (method3 == null) {
                Class cls3 = (Class) setTextScaleX.setX((char) (ViewConfiguration.getMinimumFlingVelocity() >> 16), (Process.myTid() >> 22) + 44, TextUtils.lastIndexOf("", c10, 0) + 729);
                byte b14 = (byte) 0;
                byte b15 = (byte) (b14 - 1);
                Object[] objArr6 = new Object[1];
                d(b14, (byte) (-b15), b15, objArr6);
                method3 = cls3.getMethod((String) objArr6[0], Object.class, Object.class);
                map2.put(645183118, method3);
            }
            ((Method) method3).invoke(null, objArr5);
            c10 = '0';
        }
    }

    @JvmName(name = "setCompoundDrawableTintBlendMode")
    @NotNull
    public final Function0<Unit> setCompoundDrawableTintBlendMode() {
        int i10 = K0 + 97;
        J0 = i10 % 128;
        if (i10 % 2 != 0) {
            throw null;
        }
        Function0<Unit> function0 = this.setNavigationOnClickListener;
        if (function0 != null) {
            return function0;
        }
        Intrinsics.throwUninitializedPropertyAccessException("");
        int i11 = J0 + 31;
        K0 = i11 % 128;
        int i12 = i11 % 2;
        return null;
    }

    @JvmName(name = "setOnFocusChangeListener")
    public final void setOnFocusChangeListener(@NotNull Function0<Unit> function0) {
        int i10 = K0 + 75;
        J0 = i10 % 128;
        if (i10 % 2 != 0) {
            Intrinsics.checkNotNullParameter(function0, "");
            this.setNavigationOnClickListener = function0;
            int i11 = 75 / 0;
        } else {
            Intrinsics.checkNotNullParameter(function0, "");
            this.setNavigationOnClickListener = function0;
        }
        int i12 = K0 + 23;
        J0 = i12 % 128;
        if (i12 % 2 != 0) {
            throw null;
        }
    }

    public final void setOnLongClickListener() {
        int i10 = J0 + 109;
        K0 = i10 % 128;
        int i11 = i10 % 2;
        Toast.makeText(this, j().setChildDivider(), 1).show();
    }

    @JvmName(name = "setX")
    @NotNull
    public final Function0<Unit> setX() {
        int i10 = J0 + 63;
        K0 = i10 % 128;
        int i11 = i10 % 2;
        Function0<Unit> function0 = this.setLayoutAnimation;
        if (function0 != null) {
            return function0;
        }
        Intrinsics.throwUninitializedPropertyAccessException("");
        int i12 = J0 + 83;
        K0 = i12 % 128;
        int i13 = i12 % 2;
        return null;
    }

    @JvmName(name = "setY")
    public final void setY(@NotNull Function2<? super Integer, ? super Integer, Unit> function2) {
        int i10 = K0 + 57;
        J0 = i10 % 128;
        int i11 = i10 % 2;
        Intrinsics.checkNotNullParameter(function2, "");
        this.UiMessageCallbackKtWhenMappings = function2;
        int i12 = J0 + 11;
        K0 = i12 % 128;
        int i13 = i12 % 2;
    }

    @JvmName(name = "setCompoundDrawableTintBlendMode")
    public final void setCompoundDrawableTintBlendMode(@NotNull Function0<Unit> function0) {
        setDividerPadding(new Object[]{this, function0}, 941984570, -941984570, System.identityHashCode(this));
    }

    public final void setOnFocusChangeListener() {
        int i10 = K0 + 9;
        J0 = i10 % 128;
        if (i10 % 2 == 0) {
            finishAndRemoveTask();
        } else {
            finishAndRemoveTask();
            throw null;
        }
    }

    @JvmName(name = "setY")
    @NotNull
    public final Function2<Float, Float, Unit> setY() {
        int i10 = K0 + 67;
        J0 = i10 % 128;
        int i11 = i10 % 2;
        Function2 function2 = this.setOnLongClickListener;
        if (function2 != null) {
            return function2;
        }
        Intrinsics.throwUninitializedPropertyAccessException("");
        int i12 = J0 + 3;
        K0 = i12 % 128;
        if (i12 % 2 == 0) {
            int i13 = 4 / 0;
        }
        return null;
    }

    public final void setOnFocusChangeListener(int p4) {
        ViewGroup viewGroup = this.f59945w0;
        ViewGroup viewGroup2 = null;
        if (viewGroup == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            viewGroup = null;
        }
        if (viewGroup.getChildCount() != p4) {
            ViewGroup viewGroup3 = this.f59945w0;
            if (viewGroup3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                viewGroup3 = null;
            }
            viewGroup3.removeAllViews();
            if (p4 <= 0) {
                ViewGroup viewGroup4 = this.f59945w0;
                if (viewGroup4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                } else {
                    viewGroup2 = viewGroup4;
                }
                viewGroup2.invalidate();
                return;
            }
            float f6 = getResources().getDisplayMetrics().density;
            int iRoundToInt = c.roundToInt(10.0f * f6);
            int iRoundToInt2 = c.roundToInt(28.0f * f6);
            int iRoundToInt3 = c.roundToInt(f6 * 22.0f);
            ViewGroup viewGroup5 = this.f59945w0;
            if (viewGroup5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                viewGroup5 = null;
            }
            int i10 = p4 - 1;
            int width = (((viewGroup5.getWidth() - viewGroup5.getPaddingLeft()) - viewGroup5.getPaddingRight()) - (i10 * iRoundToInt)) / p4;
            if (width < iRoundToInt2) {
                iRoundToInt2 = width >= iRoundToInt3 ? iRoundToInt3 : width;
            }
            for (int i11 = 0; i11 < p4; i11++) {
                ViewGroup viewGroup6 = this.f59945w0;
                if (viewGroup6 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                    viewGroup6 = null;
                }
                ImageView imageView = new ImageView(viewGroup6.getContext());
                Drawable drawable = ResourcesCompat.getDrawable(viewGroup5.getResources(), R.drawable.mpp_pin_module_pin_digit_filled, null);
                if (drawable != null) {
                    drawable.setTint(j().setOnLongClickListener());
                    imageView.setImageDrawable(drawable);
                    ViewGroup viewGroup7 = this.f59945w0;
                    if (viewGroup7 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("");
                        viewGroup7 = null;
                    }
                    int iMin = Math.min(iRoundToInt2, viewGroup7.getHeight());
                    ViewGroup viewGroup8 = this.f59945w0;
                    if (viewGroup8 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("");
                        viewGroup8 = null;
                    }
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(iMin, Math.min(iRoundToInt2, viewGroup8.getHeight()));
                    if (i11 < i10) {
                        layoutParams.setMarginEnd(iRoundToInt);
                    } else {
                        layoutParams.setMarginEnd(0);
                    }
                    imageView.setLayoutParams(layoutParams);
                    ViewGroup viewGroup9 = this.f59945w0;
                    if (viewGroup9 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("");
                        viewGroup9 = null;
                    }
                    viewGroup9.addView(imageView);
                }
            }
            ViewGroup viewGroup10 = this.f59945w0;
            if (viewGroup10 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            } else {
                viewGroup2 = viewGroup10;
            }
            viewGroup2.invalidate();
        }
    }

    public final class setX implements setIndicatorBoundsRelative.setCompoundDrawableTintBlendMode {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static int f59954b = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static int f59955c = 1;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ setLastBaselineToBottomHeight f59956a;

        public static /* synthetic */ Object setOnFocusChangeListener(Object[] objArr, int i10, int i11, int i12) {
            int i13 = (i11 * (-667)) + (i10 * (-1335));
            int i14 = ~i11;
            int i15 = i10 | i12;
            int i16 = ((i14 | i15) * 668) + ((i10 | (~(i12 | i14))) * 1336) + (((~i15) | i14) * (-668)) + i13;
            if (i16 == 1) {
                setX setx = (setX) objArr[0];
                float fFloatValue = ((Number) objArr[1]).floatValue();
                float fFloatValue2 = ((Number) objArr[2]).floatValue();
                int i17 = f59954b;
                int i18 = i17 ^ 73;
                int i19 = ((i17 & 73) | i18) << 1;
                int i20 = -i18;
                int i21 = ((i19 | i20) << 1) - (i19 ^ i20);
                f59955c = i21 % 128;
                int i22 = i21 % 2;
                setx.f59956a.setY().invoke(Float.valueOf(fFloatValue), Float.valueOf(fFloatValue2));
                int i23 = f59955c;
                int i24 = ((i23 | 105) << 1) - (i23 ^ 105);
                f59954b = i24 % 128;
                if (i24 % 2 != 0) {
                    throw null;
                }
            } else if (i16 != 2) {
                setX setx2 = (setX) objArr[0];
                int i25 = f59955c + 7;
                f59954b = i25 % 128;
                int i26 = i25 % 2;
                setx2.f59956a.setCompoundDrawableTintBlendMode().invoke();
                int i27 = f59954b;
                int i28 = (i27 & 49) + (i27 | 49);
                f59955c = i28 % 128;
                if (i28 % 2 == 0) {
                    int i29 = 13 / 0;
                }
            } else {
                setX setx3 = (setX) objArr[0];
                int i30 = f59955c + 29;
                f59954b = i30 % 128;
                if (i30 % 2 != 0) {
                    setx3.f59956a.setX().invoke();
                    throw null;
                }
                setx3.f59956a.setX().invoke();
                int i31 = f59954b;
                int i32 = i31 & 81;
                int i33 = -(-(i31 | 81));
                int i34 = (i32 & i33) + (i33 | i32);
                f59955c = i34 % 128;
                int i35 = i34 % 2;
            }
            return null;
        }

        @Override // com.mypinpad.tsdk.i.setIndicatorBoundsRelative.setCompoundDrawableTintBlendMode
        public final void setCompoundDrawableTintBlendMode() {
            setOnFocusChangeListener(new Object[]{this}, -1437770233, 1437770235, System.identityHashCode(this));
        }

        @Override // com.mypinpad.tsdk.i.setIndicatorBoundsRelative.setCompoundDrawableTintBlendMode
        public final void setOnFocusChangeListener() {
            setOnFocusChangeListener(new Object[]{this}, -1730749428, 1730749428, System.identityHashCode(this));
        }

        @Override // com.mypinpad.tsdk.i.setIndicatorBoundsRelative.setCompoundDrawableTintBlendMode
        public final void setOnFocusChangeListener(float f6, float f10) {
            setOnFocusChangeListener(new Object[]{this, Float.valueOf(f6), Float.valueOf(f10)}, -69716119, 69716120, System.identityHashCode(this));
        }
    }

    @JvmName(name = "setDividerPadding")
    public final void setDividerPadding(@NotNull Function2<? super Float, ? super Float, Unit> function2) {
        int i10 = J0 + 77;
        K0 = i10 % 128;
        if (i10 % 2 == 0) {
            Intrinsics.checkNotNullParameter(function2, "");
            this.setOnLongClickListener = function2;
            throw null;
        }
        Intrinsics.checkNotNullParameter(function2, "");
        this.setOnLongClickListener = function2;
        int i11 = K0 + 53;
        J0 = i11 % 128;
        int i12 = i11 % 2;
    }

    @JvmName(name = "setDividerPadding")
    public final void setDividerPadding(@NotNull component32 component32Var) {
        int i10 = J0 + 45;
        K0 = i10 % 128;
        int i11 = i10 % 2;
        Intrinsics.checkNotNullParameter(component32Var, "");
        this.setDividerPadding = component32Var;
        int i12 = K0 + 97;
        J0 = i12 % 128;
        if (i12 % 2 != 0) {
            throw null;
        }
    }

    @JvmName(name = "setDividerPadding")
    @NotNull
    public final Function2<Integer, Integer, Unit> setDividerPadding() {
        return (Function2) setDividerPadding(new Object[]{this}, -1433164136, 1433164137, System.identityHashCode(this));
    }
}
