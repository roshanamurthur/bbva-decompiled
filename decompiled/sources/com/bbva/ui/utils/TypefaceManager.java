package com.bbva.ui.utils;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.widget.TextView;
import androidx.annotation.StyleableRes;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.content.res.ResourcesCompat;
import com.bbva.ui.R;
import java.util.HashMap;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: TypefaceManager.kt */
/* JADX INFO: loaded from: classes9.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/bbva/ui/utils/TypefaceManager;", "", "<init>", "()V", "Companion", "ui_release"}, k = 1, mv = {1, 9, 0})
public final class TypefaceManager {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @StyleableRes
    @NotNull
    public static final int[] f37645b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final Lazy<TypefaceManager> f37646c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Lazy f37647a = LazyKt__LazyJVMKt.lazy(b.f37649p0);

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: compiled from: TypefaceManager.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0015\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0001\u000fB\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004R\u001a\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u0010"}, d2 = {"Lcom/bbva/ui/utils/TypefaceManager$Companion;", "", "Landroid/widget/TextView;", "textView", "Landroid/content/res/TypedArray;", "typedArray", "", "applyTypeface", "", "ATTRS", "[I", "getATTRS", "()[I", "<init>", "()V", "a", "ui_release"}, k = 1, mv = {1, 9, 0})
    public static final class Companion {

        /* JADX WARN: Enum visitor error
        jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'STAG_SANS' uses external variables
        	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
        	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
        	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
        	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
        	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:160)
        	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
         */
        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX INFO: compiled from: TypefaceManager.kt */
        public static final class a {
            private static final /* synthetic */ EnumEntries $ENTRIES;
            private static final /* synthetic */ a[] $VALUES;
            public static final a BENTON_SANS;
            public static final a STAG_SANS;
            public static final a TIEMPOS_TEXT;
            private final int bold;
            private final int italic;
            private final int normal;

            static {
                a aVar = new a("BENTON_SANS", 0, R.font.benton_sans_bbva_medium, R.font.benton_sans_bbva_bold, R.font.benton_sans_bbva_book);
                BENTON_SANS = aVar;
                int i10 = R.font.stag_sans_app_book;
                a aVar2 = new a("STAG_SANS", 1, i10, i10, R.font.stag_sans_app_light);
                STAG_SANS = aVar2;
                int i11 = R.font.tiempos_text_regular_italic;
                a aVar3 = new a("TIEMPOS_TEXT", 2, i11, i11, i11);
                TIEMPOS_TEXT = aVar3;
                a[] aVarArr = {aVar, aVar2, aVar3};
                $VALUES = aVarArr;
                $ENTRIES = EnumEntriesKt.enumEntries(aVarArr);
            }

            public a(String str, int i10, int i11, int i12, int i13) {
                super(str, i10);
                this.normal = i11;
                this.bold = i12;
                this.italic = i13;
            }

            @NotNull
            public static EnumEntries<a> b() {
                return $ENTRIES;
            }

            public static a valueOf(String str) {
                return (a) Enum.valueOf(a.class, str);
            }

            public static a[] values() {
                return (a[]) $VALUES.clone();
            }

            public final int a() {
                return this.bold;
            }

            public final int c() {
                return this.italic;
            }

            public final int d() {
                return this.normal;
            }
        }

        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void applyTypeface(@NotNull TextView textView, @NotNull TypedArray typedArray) {
            Intrinsics.checkNotNullParameter(textView, "textView");
            Intrinsics.checkNotNullParameter(typedArray, "typedArray");
            int integer = typedArray.getInteger(R.styleable.CustomTypeface_customFontName, 0);
            int integer2 = typedArray.getInteger(R.styleable.CustomTypeface_customFontStyle, 0);
            if (typedArray.getBoolean(R.styleable.CustomTypeface_customForceItalic, false)) {
                TypefaceManager typefaceManager = (TypefaceManager) TypefaceManager.f37646c.getValue();
                Context context = textView.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                textView.setTypeface(TypefaceManager.access$getTypeface(typefaceManager, context, integer, integer2), 2);
                return;
            }
            TypefaceManager typefaceManager2 = (TypefaceManager) TypefaceManager.f37646c.getValue();
            Context context2 = textView.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            textView.setTypeface(TypefaceManager.access$getTypeface(typefaceManager2, context2, integer, integer2));
        }

        @NotNull
        public final int[] getATTRS() {
            return TypefaceManager.f37645b;
        }
    }

    /* JADX INFO: compiled from: TypefaceManager.kt */
    public static final class a extends Lambda implements Function0<TypefaceManager> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final a f37648p0 = new a(0);

        @Override // kotlin.jvm.functions.Function0
        public final TypefaceManager invoke() {
            return new TypefaceManager();
        }
    }

    /* JADX INFO: compiled from: TypefaceManager.kt */
    public static final class b extends Lambda implements Function0<HashMap<Integer, Typeface>> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final b f37649p0 = new b(0);

        @Override // kotlin.jvm.functions.Function0
        public final HashMap<Integer, Typeface> invoke() {
            return new HashMap<>();
        }
    }

    static {
        int[] CustomTypeface = R.styleable.CustomTypeface;
        Intrinsics.checkNotNullExpressionValue(CustomTypeface, "CustomTypeface");
        f37645b = CustomTypeface;
        f37646c = LazyKt__LazyJVMKt.lazy(a.f37648p0);
    }

    public static final Typeface access$getTypeface(TypefaceManager typefaceManager, Context context, int i10, int i11) {
        int iA;
        Typeface font;
        typefaceManager.getClass();
        Companion.a aVar = Companion.a.b().get(i10);
        if (i11 != 1) {
            iA = i11 != 2 ? aVar.d() : aVar.c();
        } else {
            iA = aVar.a();
        }
        Lazy lazy = typefaceManager.f37647a;
        Object obj = ((HashMap) lazy.getValue()).get(Integer.valueOf(iA));
        if (obj == null && (font = ResourcesCompat.getFont(context, iA)) != null) {
            ((HashMap) lazy.getValue()).put(Integer.valueOf(iA), font);
            obj = font;
        }
        return (Typeface) obj;
    }
}
