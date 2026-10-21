package com.bbva.ui.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;
import android.os.Build;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.DrawableRes;
import androidx.annotation.StringRes;
import androidx.camera.core.impl.utils.a;
import androidx.camera.core.processing.f;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.bbva.ethermobilesdk.tokencompat.storage.local.UUIDPreferences;
import com.bbva.ui.R;
import com.bbva.ui.extensions.ContextKt;
import com.bbva.ui.extensions.FloatKt;
import com.bbva.ui.widget.BbvaTextInputLayout;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.l;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: BbvaTextInputLayout.kt */
/* JADX INFO: loaded from: classes9.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001:\u000278B1\b\u0007\u0012\u0006\u00100\u001a\u00020/\u0012\n\b\u0002\u00102\u001a\u0004\u0018\u000101\u0012\b\b\u0002\u00103\u001a\u00020\u0002\u0012\b\b\u0002\u00104\u001a\u00020\u0002¢\u0006\u0004\b5\u00106J\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0014J\u0010\u0010\t\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0007J)\u0010\u0010\u001a\u00020\u00052!\u0010\u000f\u001a\u001d\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\u00050\nJ+\u0010\u0013\u001a\u00020\u00052#\u0010\u000f\u001a\u001f\u0012\u0013\u0012\u00110\u0011¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u0012\u0012\u0004\u0012\u00020\u0005\u0018\u00010\nJ\u000e\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u0014J\u0006\u0010\u0016\u001a\u00020\u0005J\u0014\u0010\u0018\u001a\u00020\u00052\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\u0017J\u000e\u0010\u001a\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u0011J\u0006\u0010\u001b\u001a\u00020\u0011J\u000e\u0010\u001d\u001a\u00020\u00052\u0006\u0010\u001c\u001a\u00020\u0011J\u0006\u0010\u001e\u001a\u00020\u0005J\u0010\u0010 \u001a\u00020\u00052\b\b\u0001\u0010\u001f\u001a\u00020\u0002J\u000e\u0010 \u001a\u00020\u00052\u0006\u0010\u001c\u001a\u00020\u0011J\u0006\u0010!\u001a\u00020\u0005J\u0010\u0010\"\u001a\u00020\u00052\b\b\u0001\u0010\u001f\u001a\u00020\u0002J\u000e\u0010\"\u001a\u00020\u00052\u0006\u0010\u001c\u001a\u00020\u0011J\u0006\u0010#\u001a\u00020\u0005J\u000e\u0010%\u001a\u00020\u00052\u0006\u0010$\u001a\u00020\u000bJ\u000e\u0010'\u001a\u00020\u00052\u0006\u0010&\u001a\u00020\u0002J\u000e\u0010)\u001a\u00020\u00052\u0006\u0010(\u001a\u00020\u0011J\u000e\u0010+\u001a\u00020\u00052\u0006\u0010*\u001a\u00020\u0002J\b\u0010,\u001a\u00020\u0011H\u0002J\n\u0010-\u001a\u0004\u0018\u00010\u0011H\u0002J\n\u0010.\u001a\u0004\u0018\u00010\u0011H\u0002¨\u00069"}, d2 = {"Lcom/bbva/ui/widget/BbvaTextInputLayout;", "Landroid/widget/FrameLayout;", "", "widthMeasureSpec", "heightMeasureSpec", "", "onMeasure", "Landroid/view/View$OnClickListener;", "l", "setEditTextOnClickListener", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "hasFocus", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setOnFocusChangedListener", "", "sequence", "setTextChangedListener", "Landroid/text/TextWatcher;", "textWatcher", "clearTextChangedListeners", "Lkotlin/Function0;", "setOnDoneKeyPressedListener", "hint", "setHint", "getText", "text", "setText", "clearText", "resourceId", "setError", "clearError", "setInfo", "clearInfo", "clearFocus", "setMustClearFocusOnBackKey", "maxLength", "setMaxLength", "contentDescription", "setClearContentDescription", "inputType", "setInputType", "getClearContentDescription", "getIconContentDescription", "getIconToggledContentDescription", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "defStyle", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", AndroidComposeViewAccessibilityDelegateCompat.LogTag, UUIDPreferences.TYPE_KEY, "ui_release"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nBbvaTextInputLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BbvaTextInputLayout.kt\ncom/bbva/ui/widget/BbvaTextInputLayout\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 View.kt\nandroidx/core/view/ViewKt\n+ 4 TypedArray.kt\nandroidx/core/content/res/TypedArrayKt\n*L\n1#1,577:1\n1#2:578\n68#3,4:579\n40#3:583\n56#3:584\n75#3:585\n233#4,3:586\n*S KotlinDebug\n*F\n+ 1 BbvaTextInputLayout.kt\ncom/bbva/ui/widget/BbvaTextInputLayout\n*L\n119#1:579,4\n119#1:583\n119#1:584\n119#1:585\n130#1:586,3\n*E\n"})
public final class BbvaTextInputLayout extends FrameLayout {
    public static final int $stable = 8;

    @NotNull
    public final Type E0;
    public boolean F0;
    public boolean G0;

    @Nullable
    public String H0;

    @Nullable
    public final String I0;

    @Nullable
    public final String J0;
    public float K0;
    public float L0;

    @Nullable
    public TextWatcher M0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NotNull
    public final ConstraintLayout f37670p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    @NotNull
    public final TextView f37671q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    @NotNull
    public final BbvaEditText f37672r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    @NotNull
    public final ImageView f37673s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    @NotNull
    public final ImageView f37674t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    @NotNull
    public final View f37675u0;

    @NotNull
    public final ViewGroup v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    @NotNull
    public final TextView f37676w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    @NotNull
    public final ViewGroup f37677x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    @NotNull
    public final TextView f37678y0;

    /* JADX INFO: compiled from: BbvaTextInputLayout.kt */
    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\u0015"}, d2 = {"Lcom/bbva/ui/widget/BbvaTextInputLayout$AccessibilityDelegate;", "Landroidx/core/view/AccessibilityDelegateCompat;", "Landroid/view/View;", "host", "Landroidx/core/view/accessibility/AccessibilityNodeInfoCompat;", "info", "", "onInitializeAccessibilityNodeInfo", "Landroid/content/Context;", "context", "Landroid/widget/EditText;", "inputEditText", "Landroid/widget/TextView;", "hintTextView", "errorTextView", "", "isMandatory", "", "maxLength", "<init>", "(Landroid/content/Context;Landroid/widget/EditText;Landroid/widget/TextView;Landroid/widget/TextView;ZI)V", "ui_release"}, k = 1, mv = {1, 9, 0})
    @SourceDebugExtension({"SMAP\nBbvaTextInputLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BbvaTextInputLayout.kt\ncom/bbva/ui/widget/BbvaTextInputLayout$AccessibilityDelegate\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,577:1\n766#2:578\n857#2,2:579\n*S KotlinDebug\n*F\n+ 1 BbvaTextInputLayout.kt\ncom/bbva/ui/widget/BbvaTextInputLayout$AccessibilityDelegate\n*L\n542#1:578\n542#1:579,2\n*E\n"})
    public static final class AccessibilityDelegate extends AccessibilityDelegateCompat {
        public static final int $stable = 8;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final Context f37680a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final EditText f37681b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public final TextView f37682c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @Nullable
        public final TextView f37683d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final boolean f37684e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f37685f;

        public /* synthetic */ AccessibilityDelegate(Context context, EditText editText, TextView textView, TextView textView2, boolean z10, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(context, editText, textView, (i11 & 8) != 0 ? null : textView2, (i11 & 16) != 0 ? false : z10, (i11 & 32) != 0 ? -1 : i10);
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public void onInitializeAccessibilityNodeInfo(@NotNull View host, @NotNull AccessibilityNodeInfoCompat info) {
            CharSequence text;
            Intrinsics.checkNotNullParameter(host, "host");
            Intrinsics.checkNotNullParameter(info, "info");
            super.onInitializeAccessibilityNodeInfo(host, info);
            EditText editText = this.f37681b;
            String string = editText.getText().toString();
            boolean z10 = string.length() > 0;
            String strD = (this.f37684e && string.length() == 0) ? f.d(", ", this.f37680a.getString(R.string.ui_mandatory_field)) : "";
            boolean zIsPassword = info.isPassword();
            TextView textView = this.f37682c;
            if (!zIsPassword) {
                strD = ((Object) textView.getText()) + strD;
            }
            TextView textView2 = this.f37683d;
            List listListOf = CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{strD, (textView2 == null || (text = textView2.getText()) == null) ? null : text.toString()});
            ArrayList arrayList = new ArrayList();
            for (Object obj : listListOf) {
                String str = (String) obj;
                if (!(str == null || l.isBlank(str))) {
                    arrayList.add(obj);
                }
            }
            String strJoinToString$default = CollectionsKt___CollectionsKt.joinToString$default(arrayList, ". ", null, null, 0, null, null, 62, null);
            boolean z11 = strJoinToString$default.length() > 0;
            if (z10) {
                info.setText(string);
            } else if (z11) {
                info.setText(strJoinToString$default);
            }
            if (z11) {
                if (Build.VERSION.SDK_INT >= 26) {
                    info.setHintText(strJoinToString$default);
                } else {
                    if (z10) {
                        strJoinToString$default = a.b(string, ", ", strJoinToString$default);
                    }
                    info.setText(strJoinToString$default);
                }
                info.setShowingHintText(!z10);
            }
            int length = string.length();
            int i10 = this.f37685f;
            if (length != i10) {
                i10 = -1;
            }
            info.setMaxTextLength(i10);
            editText.setLabelFor(textView.getId());
        }

        public AccessibilityDelegate(@NotNull Context context, @NotNull EditText inputEditText, @NotNull TextView hintTextView, @Nullable TextView textView, boolean z10, int i10) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(inputEditText, "inputEditText");
            Intrinsics.checkNotNullParameter(hintTextView, "hintTextView");
            this.f37680a = context;
            this.f37681b = inputEditText;
            this.f37682c = hintTextView;
            this.f37683d = textView;
            this.f37684e = z10;
            this.f37685f = i10;
        }
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r2v2 com.bbva.ui.widget.BbvaTextInputLayout$Type[], still in use, count: 1, list:
      (r2v2 com.bbva.ui.widget.BbvaTextInputLayout$Type[]) from 0x0055: INVOKE (r2v2 com.bbva.ui.widget.BbvaTextInputLayout$Type[]) STATIC call: kotlin.enums.EnumEntriesKt.enumEntries(java.lang.Enum[]):kotlin.enums.EnumEntries A[MD:<E extends java.lang.Enum<E>>:(E extends java.lang.Enum<E>[]):kotlin.enums.EnumEntries<E extends java.lang.Enum<E>> (m), WRAPPED] (LINE:86)
    	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
    	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
    	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
    	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:257)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:187)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX INFO: compiled from: BbvaTextInputLayout.kt */
    public static final class Type {
        TEXT(0, 0, null, 62),
        PASSWORD(1, R.drawable.ic_eye, Integer.valueOf(R.drawable.ic_eye_closed), Integer.valueOf(R.string.ui_show_password), Integer.valueOf(R.string.ui_hide_password), IconType.ACTIONABLE_ALWAYS_VISIBLE),
        SEARCH(2, R.drawable.ic_search, IconType.DECORATIVE, 28);

        private static final /* synthetic */ EnumEntries $ENTRIES;

        @NotNull
        public static final Companion Companion = new Companion(null);

        @Nullable
        private final Integer iconContentDescriptionResId;
        private final int iconResId;

        @Nullable
        private final Integer iconToggledContentDescriptionResId;

        @Nullable
        private final Integer iconToggledResId;

        @Nullable
        private final IconType iconType;
        private final int value;

        /* JADX INFO: compiled from: BbvaTextInputLayout.kt */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/bbva/ui/widget/BbvaTextInputLayout$Type$Companion;", "", "()V", "fromInt", "Lcom/bbva/ui/widget/BbvaTextInputLayout$Type;", "value", "", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        @SourceDebugExtension({"SMAP\nBbvaTextInputLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BbvaTextInputLayout.kt\ncom/bbva/ui/widget/BbvaTextInputLayout$Type$Companion\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,577:1\n288#2,2:578\n*S KotlinDebug\n*F\n+ 1 BbvaTextInputLayout.kt\ncom/bbva/ui/widget/BbvaTextInputLayout$Type$Companion\n*L\n515#1:578,2\n*E\n"})
        public static final class Companion {
            public Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @NotNull
            public final Type fromInt(int value) {
                Type next;
                Iterator<Type> it = Type.a().iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (next.g() != value);
                Type type = next;
                return type == null ? Type.TEXT : type;
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* JADX INFO: compiled from: BbvaTextInputLayout.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/bbva/ui/widget/BbvaTextInputLayout$Type$IconType;", "", "ACTIONABLE", "ACTIONABLE_ALWAYS_VISIBLE", "DECORATIVE", "ui_release"}, k = 1, mv = {1, 9, 0})
        public static final class IconType {
            private static final /* synthetic */ EnumEntries $ENTRIES;
            private static final /* synthetic */ IconType[] $VALUES;
            public static final IconType ACTIONABLE;
            public static final IconType ACTIONABLE_ALWAYS_VISIBLE;
            public static final IconType DECORATIVE;

            static {
                IconType iconType = new IconType("ACTIONABLE", 0);
                ACTIONABLE = iconType;
                IconType iconType2 = new IconType("ACTIONABLE_ALWAYS_VISIBLE", 1);
                ACTIONABLE_ALWAYS_VISIBLE = iconType2;
                IconType iconType3 = new IconType("DECORATIVE", 2);
                DECORATIVE = iconType3;
                IconType[] iconTypeArr = {iconType, iconType2, iconType3};
                $VALUES = iconTypeArr;
                $ENTRIES = EnumEntriesKt.enumEntries(iconTypeArr);
            }

            public IconType() {
                throw null;
            }

            @NotNull
            public static EnumEntries<IconType> getEntries() {
                return $ENTRIES;
            }

            public static IconType valueOf(String str) {
                return (IconType) Enum.valueOf(IconType.class, str);
            }

            public static IconType[] values() {
                return (IconType[]) $VALUES.clone();
            }
        }

        static {
            $ENTRIES = EnumEntriesKt.enumEntries(new Type[]{r7, r0, r1});
        }

        public /* synthetic */ Type(int i10, int i11, IconType iconType, int i12) {
            this(i10, (i12 & 2) != 0 ? 0 : i11, null, null, null, (i12 & 32) != 0 ? null : iconType);
        }

        @NotNull
        public static EnumEntries<Type> a() {
            return $ENTRIES;
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) $VALUES.clone();
        }

        @Nullable
        public final Integer b() {
            return this.iconContentDescriptionResId;
        }

        public final int c() {
            return this.iconResId;
        }

        @Nullable
        public final Integer d() {
            return this.iconToggledContentDescriptionResId;
        }

        @Nullable
        public final Integer e() {
            return this.iconToggledResId;
        }

        @Nullable
        public final IconType f() {
            return this.iconType;
        }

        public final int g() {
            return this.value;
        }

        public Type(@DrawableRes int i10, @StringRes int i11, @StringRes Integer num, Integer num2, Integer num3, IconType iconType) {
            super(str, i);
            this.value = i10;
            this.iconResId = i11;
            this.iconToggledResId = num;
            this.iconContentDescriptionResId = num2;
            this.iconToggledContentDescriptionResId = num3;
            this.iconType = iconType;
        }
    }

    /* JADX INFO: compiled from: BbvaTextInputLayout.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[Type.values().length];
            try {
                iArr[Type.TEXT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Type.PASSWORD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Type.SEARCH.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[Type.IconType.values().length];
            try {
                iArr2[Type.IconType.ACTIONABLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[Type.IconType.ACTIONABLE_ALWAYS_VISIBLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[Type.IconType.DECORATIVE.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public BbvaTextInputLayout(@NotNull Context context) {
        this(context, null, 0, 0, 14, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public static void a(BbvaTextInputLayout this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Integer numE = this$0.E0.e();
        if (numE != null) {
            int iIntValue = numE.intValue();
            boolean z10 = !this$0.G0;
            this$0.G0 = z10;
            this$0.setInputType((z10 ? 144 : 128) | 1);
            if (!this$0.G0) {
                iIntValue = this$0.E0.c();
            }
            ImageView imageView = this$0.f37673s0;
            imageView.setImageResource(iIntValue);
            imageView.setContentDescription(!this$0.G0 ? this$0.getIconContentDescription() : this$0.getIconToggledContentDescription());
        }
    }

    public static final void access$onTextChanged(BbvaTextInputLayout bbvaTextInputLayout, CharSequence charSequence, boolean z10) {
        bbvaTextInputLayout.getClass();
        int length = charSequence.length();
        ImageView imageView = bbvaTextInputLayout.f37673s0;
        ImageView imageView2 = bbvaTextInputLayout.f37674t0;
        if (length == 0) {
            imageView2.setClickable(false);
            imageView2.animate().setDuration(150L).alpha(0.0f);
            if (bbvaTextInputLayout.E0.f() == Type.IconType.ACTIONABLE) {
                imageView.setClickable(false);
                imageView.animate().setDuration(150L).alpha(0.0f);
                return;
            }
            return;
        }
        imageView2.setClickable(true);
        if (z10) {
            imageView2.animate().setDuration(150L).alpha(1.0f);
        }
        if (bbvaTextInputLayout.E0.f() == Type.IconType.ACTIONABLE) {
            imageView.setClickable(true);
            if (z10) {
                imageView.animate().setDuration(150L).alpha(1.0f);
            }
        }
    }

    private final String getClearContentDescription() {
        String str = this.H0;
        if (str != null) {
            return str;
        }
        String string = getContext().getString(R.string.ui_clear_text);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        return string;
    }

    private final String getIconContentDescription() {
        String str = this.I0;
        if (str != null) {
            return str;
        }
        Integer numB = this.E0.b();
        if (numB == null) {
            return null;
        }
        return getContext().getString(numB.intValue());
    }

    private final String getIconToggledContentDescription() {
        String str = this.J0;
        if (str != null) {
            return str;
        }
        Integer numD = this.E0.d();
        if (numD == null) {
            return null;
        }
        return getContext().getString(numD.intValue());
    }

    public final void b() {
        Editable text;
        BbvaEditText bbvaEditText = this.f37672r0;
        boolean zHasFocus = bbvaEditText.hasFocus();
        TextView textView = this.f37671q0;
        if (zHasFocus || !((text = bbvaEditText.getText()) == null || text.length() == 0)) {
            textView.animate().setDuration(200L).translationY(-this.K0).scaleX(0.75f).scaleY(0.75f);
            bbvaEditText.animate().setDuration(200L).translationY(this.L0);
        } else {
            textView.animate().setDuration(200L).translationY(0.0f).scaleX(1.0f).scaleY(1.0f);
            bbvaEditText.animate().setDuration(200L).translationY(0.0f);
        }
    }

    public final void clearError() {
        int iThemeColor;
        boolean z10 = this.F0;
        this.F0 = false;
        this.f37676w0.setText("");
        this.v0.setVisibility(8);
        if (z10) {
            Drawable background = this.f37670p0.getBackground();
            TransitionDrawable transitionDrawable = background instanceof TransitionDrawable ? (TransitionDrawable) background : null;
            if (transitionDrawable != null) {
                transitionDrawable.reverseTransition(150);
            }
            Drawable background2 = this.f37675u0.getBackground();
            TransitionDrawable transitionDrawable2 = background2 instanceof TransitionDrawable ? (TransitionDrawable) background2 : null;
            if (transitionDrawable2 != null) {
                transitionDrawable2.reverseTransition(150);
            }
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            this.f37671q0.setTextColor(ContextKt.themeColor(context, R.attr.form_input_placeholder_default));
            Context context2 = getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            this.f37672r0.setTextColor(ContextKt.themeColor(context2, R.attr.form_input_field_text_default));
            Context context3 = getContext();
            Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
            int i10 = R.attr.form_input_icon_default;
            this.f37674t0.setColorFilter(ContextKt.themeColor(context3, i10));
            if (this.E0.f() == Type.IconType.DECORATIVE) {
                Context context4 = getContext();
                Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
                iThemeColor = ContextKt.themeColor(context4, R.attr.form_input_icon_read_only);
            } else {
                Context context5 = getContext();
                Intrinsics.checkNotNullExpressionValue(context5, "getContext(...)");
                iThemeColor = ContextKt.themeColor(context5, i10);
            }
            this.f37673s0.setColorFilter(iThemeColor);
        }
    }

    public final void clearInfo() {
        this.f37677x0.setVisibility(8);
        this.f37678y0.setText("");
    }

    public final void clearText() {
        this.f37672r0.setText("");
        b();
    }

    public final synchronized void clearTextChangedListeners() {
        this.f37672r0.removeTextChangedListener(this.M0);
        this.M0 = null;
    }

    @NotNull
    public final String getText() {
        return String.valueOf(this.f37672r0.getText());
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        if (this.K0 == Float.MIN_VALUE) {
            TextView textView = this.f37671q0;
            this.K0 = textView.getMeasuredHeight() / 2.0f;
            textView.setPivotX(0.0f);
        }
        if (this.L0 == Float.MIN_VALUE) {
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            this.L0 = FloatKt.toPx(4.0f, context);
            b();
        }
    }

    public final void setClearContentDescription(@NotNull String contentDescription) {
        Intrinsics.checkNotNullParameter(contentDescription, "contentDescription");
        this.H0 = contentDescription;
        this.f37674t0.setContentDescription(contentDescription);
    }

    public final void setEditTextOnClickListener(@Nullable View.OnClickListener l6) {
        BbvaEditText bbvaEditText = this.f37672r0;
        bbvaEditText.setFocusable(false);
        bbvaEditText.setOnClickListener(l6);
    }

    public final void setError(@StringRes int resourceId) {
        Resources resources = getResources();
        String string = resources != null ? resources.getString(resourceId) : null;
        if (string == null) {
            string = "";
        }
        setError(string);
    }

    public final void setHint(@NotNull String hint) {
        Intrinsics.checkNotNullParameter(hint, "hint");
        this.f37671q0.setText(hint);
    }

    public final void setInfo(@StringRes int resourceId) {
        Resources resources = getResources();
        String string = resources != null ? resources.getString(resourceId) : null;
        if (string == null) {
            string = "";
        }
        setError(string);
    }

    public final void setInputType(int inputType) {
        BbvaEditText bbvaEditText = this.f37672r0;
        int selectionStart = bbvaEditText.getSelectionStart();
        bbvaEditText.setInputType(inputType);
        bbvaEditText.setSelection(selectionStart);
    }

    public final void setMaxLength(int maxLength) {
        if (maxLength > 0) {
            BbvaEditText bbvaEditText = this.f37672r0;
            InputFilter[] filters = bbvaEditText.getFilters();
            Intrinsics.checkNotNullExpressionValue(filters, "getFilters(...)");
            bbvaEditText.setFilters((InputFilter[]) ArraysKt___ArraysJvmKt.plus((InputFilter.LengthFilter[]) filters, new InputFilter.LengthFilter(maxLength)));
        }
    }

    public final void setMustClearFocusOnBackKey(boolean clearFocus) {
        this.f37672r0.setMustClearFocusOnBackKey(clearFocus);
    }

    public final void setOnDoneKeyPressedListener(@NotNull final Function0<Unit> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f37672r0.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: lc.e
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
                int i11 = BbvaTextInputLayout.$stable;
                Function0 listener2 = listener;
                Intrinsics.checkNotNullParameter(listener2, "$listener");
                if (i10 != 6) {
                    return false;
                }
                listener2.invoke();
                return true;
            }
        });
    }

    public final void setOnFocusChangedListener(@NotNull final Function1<? super Boolean, Unit> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f37672r0.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: lc.d
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z10) {
                int i10 = BbvaTextInputLayout.$stable;
                BbvaTextInputLayout this$0 = this.f83179a;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Function1 listener2 = listener;
                Intrinsics.checkNotNullParameter(listener2, "$listener");
                this$0.b();
                listener2.invoke(Boolean.valueOf(z10));
            }
        });
    }

    public final void setText(@NotNull String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.f37672r0.setText(text);
        b();
    }

    public final void setTextChangedListener(@Nullable final Function1<? super String, Unit> listener) {
        if (listener == null) {
            clearTextChangedListeners();
        } else {
            setTextChangedListener(new DefaultTextWatcher() { // from class: com.bbva.ui.widget.BbvaTextInputLayout.setTextChangedListener.1
                @Override // com.bbva.ui.widget.DefaultTextWatcher, android.text.TextWatcher
                public void afterTextChanged(@NotNull Editable editable) {
                    Intrinsics.checkNotNullParameter(editable, "editable");
                    listener.invoke(editable.toString());
                }
            });
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public BbvaTextInputLayout(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public BbvaTextInputLayout(@NotNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, 0, 8, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final void setError(@NotNull String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        boolean z10 = this.F0;
        this.F0 = true;
        this.f37676w0.setText(text);
        this.v0.setVisibility(0);
        if (z10) {
            return;
        }
        Drawable background = this.f37670p0.getBackground();
        TransitionDrawable transitionDrawable = background instanceof TransitionDrawable ? (TransitionDrawable) background : null;
        if (transitionDrawable != null) {
            transitionDrawable.startTransition(150);
        }
        Drawable background2 = this.f37675u0.getBackground();
        TransitionDrawable transitionDrawable2 = background2 instanceof TransitionDrawable ? (TransitionDrawable) background2 : null;
        if (transitionDrawable2 != null) {
            transitionDrawable2.startTransition(150);
        }
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        this.f37671q0.setTextColor(ContextKt.themeColor(context, R.attr.form_input_placeholder_error));
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        this.f37672r0.setTextColor(ContextKt.themeColor(context2, R.attr.form_input_field_text_error));
        Context context3 = getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        int i10 = R.attr.form_input_icon_error;
        this.f37674t0.setColorFilter(ContextKt.themeColor(context3, i10));
        Context context4 = getContext();
        Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
        this.f37673s0.setColorFilter(ContextKt.themeColor(context4, i10));
        announceForAccessibility(text);
    }

    public final void setInfo(@NotNull String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.f37677x0.setVisibility(0);
        this.f37678y0.setText(text);
    }

    public final synchronized void setTextChangedListener(@NotNull TextWatcher textWatcher) {
        Intrinsics.checkNotNullParameter(textWatcher, "textWatcher");
        this.f37672r0.addTextChangedListener(textWatcher);
        this.M0 = textWatcher;
    }

    public /* synthetic */ BbvaTextInputLayout(Context context, AttributeSet attributeSet, int i10, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i10, (i12 & 8) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r12v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r12v5 */
    @JvmOverloads
    public BbvaTextInputLayout(@NotNull Context context, @Nullable AttributeSet attributeSet, int i10, int i11) {
        ImageView imageView;
        ?? r12;
        String str;
        int i12;
        super(context, attributeSet, i10, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        this.E0 = Type.TEXT;
        this.K0 = Float.MIN_VALUE;
        this.L0 = Float.MIN_VALUE;
        View.inflate(context, R.layout.ui_bbva_text_input_layout, this);
        View viewFindViewById = findViewById(R.id.constraintLayout);
        ConstraintLayout constraintLayout = (ConstraintLayout) viewFindViewById;
        constraintLayout.setClipToOutline(true);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "apply(...)");
        this.f37670p0 = constraintLayout;
        View viewFindViewById2 = findViewById(R.id.hintTextView);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        TextView textView = (TextView) viewFindViewById2;
        this.f37671q0 = textView;
        View viewFindViewById3 = findViewById(R.id.editText);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        BbvaEditText bbvaEditText = (BbvaEditText) viewFindViewById3;
        this.f37672r0 = bbvaEditText;
        View viewFindViewById4 = findViewById(R.id.iconImageView);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
        ImageView imageView2 = (ImageView) viewFindViewById4;
        this.f37673s0 = imageView2;
        View viewFindViewById5 = findViewById(R.id.clearImageView);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "findViewById(...)");
        ImageView imageView3 = (ImageView) viewFindViewById5;
        this.f37674t0 = imageView3;
        View viewFindViewById6 = findViewById(R.id.lineView);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById6, "findViewById(...)");
        this.f37675u0 = viewFindViewById6;
        View viewFindViewById7 = findViewById(R.id.errorLayout);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById7, "findViewById(...)");
        ViewGroup viewGroup = (ViewGroup) viewFindViewById7;
        this.v0 = viewGroup;
        View viewFindViewById8 = findViewById(R.id.errorImageView);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById8, "findViewById(...)");
        View viewFindViewById9 = findViewById(R.id.errorTextView);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById9, "findViewById(...)");
        TextView textView2 = (TextView) viewFindViewById9;
        this.f37676w0 = textView2;
        View viewFindViewById10 = findViewById(R.id.infoLayout);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById10, "findViewById(...)");
        ViewGroup viewGroup2 = (ViewGroup) viewFindViewById10;
        this.f37677x0 = viewGroup2;
        View viewFindViewById11 = findViewById(R.id.infoTextView);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById11, "findViewById(...)");
        this.f37678y0 = (TextView) viewFindViewById11;
        if (attributeSet == null) {
            str = "getContext(...)";
            imageView = imageView2;
            r12 = 0;
        } else {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R.styleable.BbvaTextInputLayout);
            Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
            CharSequence text = typedArrayObtainStyledAttributes.getText(R.styleable.BbvaTextInputLayout_hint);
            int i13 = typedArrayObtainStyledAttributes.getInt(R.styleable.BbvaTextInputLayout_android_inputType, 0);
            int i14 = typedArrayObtainStyledAttributes.getInt(R.styleable.BbvaTextInputLayout_minLines, 0);
            int i15 = typedArrayObtainStyledAttributes.getInt(R.styleable.BbvaTextInputLayout_maxLines, 0);
            int i16 = typedArrayObtainStyledAttributes.getInt(R.styleable.BbvaTextInputLayout_maxLength, -1);
            imageView = imageView2;
            r12 = 0;
            r12 = 0;
            boolean z10 = typedArrayObtainStyledAttributes.getBoolean(R.styleable.BbvaTextInputLayout_isMandatory, false);
            this.E0 = Type.Companion.fromInt(typedArrayObtainStyledAttributes.getInt(R.styleable.BbvaTextInputLayout_inputType, 0));
            this.H0 = typedArrayObtainStyledAttributes.getString(R.styleable.BbvaTextInputLayout_clearContentDescription);
            this.I0 = typedArrayObtainStyledAttributes.getString(R.styleable.BbvaTextInputLayout_iconContentDescription);
            this.J0 = typedArrayObtainStyledAttributes.getString(R.styleable.BbvaTextInputLayout_iconToggledContentDescription);
            textView.setText(text);
            if (i13 > 0) {
                bbvaEditText.setInputType(i13);
            }
            if (i14 > 0) {
                bbvaEditText.setMinLines(i14);
            }
            if (i15 > 0) {
                bbvaEditText.setMaxLines(i15);
            }
            setMaxLength(i16);
            Context context2 = getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            str = "getContext(...)";
            ViewCompat.setAccessibilityDelegate(bbvaEditText, new AccessibilityDelegate(context2, bbvaEditText, textView, textView2, z10, i16));
            Unit unit = Unit.INSTANCE;
            typedArrayObtainStyledAttributes.recycle();
            if (isInEditMode()) {
                bbvaEditText.setVisibility(8);
                imageView3.setVisibility(8);
                viewGroup2.setVisibility(8);
                viewGroup.setVisibility(8);
            }
        }
        imageView3.setOnClickListener(new c9.a(this, 1));
        imageView3.setClickable(r12);
        Context context3 = getContext();
        Intrinsics.checkNotNullExpressionValue(context3, str);
        int i17 = R.attr.form_input_icon_default;
        imageView3.setColorFilter(ContextKt.themeColor(context3, i17));
        imageView3.setContentDescription(getClearContentDescription());
        if (this.E0.c() != 0) {
            ImageView imageView4 = imageView;
            imageView4.setVisibility(r12);
            imageView4.setImageResource(this.E0.c());
            if (WhenMappings.$EnumSwitchMapping$0[this.E0.ordinal()] != 2) {
                i12 = 1;
            } else {
                i12 = 1;
                setInputType((this.G0 ? 144 : 128) | 1);
                imageView4.setOnClickListener(new zb.a(this, 1));
            }
            Type.IconType iconTypeF = this.E0.f();
            int i18 = iconTypeF == null ? -1 : WhenMappings.$EnumSwitchMapping$1[iconTypeF.ordinal()];
            if (i18 == i12) {
                imageView4.setAlpha(0.0f);
                imageView4.setClickable(r12);
                Context context4 = getContext();
                Intrinsics.checkNotNullExpressionValue(context4, str);
                imageView4.setColorFilter(ContextKt.themeColor(context4, i17));
                imageView4.setContentDescription(getIconContentDescription());
            } else if (i18 == 2) {
                imageView4.setAlpha(1.0f);
                imageView4.setClickable(true);
                Context context5 = getContext();
                Intrinsics.checkNotNullExpressionValue(context5, str);
                imageView4.setColorFilter(ContextKt.themeColor(context5, i17));
                imageView4.setContentDescription(getIconContentDescription());
            } else if (i18 == 3) {
                imageView4.setAlpha(1.0f);
                imageView4.setClickable(r12);
                Context context6 = getContext();
                Intrinsics.checkNotNullExpressionValue(context6, str);
                imageView4.setColorFilter(ContextKt.themeColor(context6, R.attr.form_input_icon_read_only));
            }
        }
        bbvaEditText.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: lc.f
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z11) {
                int i19 = BbvaTextInputLayout.$stable;
                BbvaTextInputLayout this$0 = this.f83182a;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.b();
            }
        });
        bbvaEditText.addTextChangedListener(new DefaultTextWatcher() { // from class: com.bbva.ui.widget.BbvaTextInputLayout.3
            @Override // com.bbva.ui.widget.DefaultTextWatcher, android.text.TextWatcher
            public void onTextChanged(@NotNull CharSequence sequence, int start, int before, int count) {
                Intrinsics.checkNotNullParameter(sequence, "sequence");
                BbvaTextInputLayout bbvaTextInputLayout = BbvaTextInputLayout.this;
                bbvaTextInputLayout.clearError();
                BbvaTextInputLayout.access$onTextChanged(bbvaTextInputLayout, sequence, before == 0 && count == sequence.length());
                if (count > 1) {
                    bbvaTextInputLayout.b();
                }
            }
        });
        if (ViewCompat.isLaidOut(this) && !isLayoutRequested()) {
            Rect rect = new Rect();
            this.f37670p0.getHitRect(rect);
            this.f37670p0.setTouchDelegate(new TouchDelegate(rect, this.f37672r0));
            return;
        }
        addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.bbva.ui.widget.BbvaTextInputLayout$special$$inlined$doOnLayout$1
            @Override // android.view.View.OnLayoutChangeListener
            public void onLayoutChange(@NotNull View view, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
                Intrinsics.checkNotNullParameter(view, "view");
                view.removeOnLayoutChangeListener(this);
                Rect rect2 = new Rect();
                BbvaTextInputLayout bbvaTextInputLayout = this.f37687a;
                bbvaTextInputLayout.f37670p0.getHitRect(rect2);
                bbvaTextInputLayout.f37670p0.setTouchDelegate(new TouchDelegate(rect2, bbvaTextInputLayout.f37672r0));
            }
        });
    }
}
