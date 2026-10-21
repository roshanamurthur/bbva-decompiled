package androidx.compose.ui.text.platform;

import android.content.Context;
import android.graphics.Typeface;
import androidx.compose.ui.text.TempListUtilsKt;
import androidx.compose.ui.text.font.Font;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontListFontFamily;
import androidx.compose.ui.text.font.FontLoadingStrategy;
import androidx.compose.ui.text.font.FontMatcher;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis_androidKt;
import androidx.compose.ui.text.font.FontWeight;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: AndroidFontListTypeface.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Deprecated(message = "This is not supported after downloadable fonts.")
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001BB\u0012\u0006\u0010\u0017\u001a\u00020\u0018\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\u001c\b\u0002\u0010\u001d\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\u001c\u0018\u00010\u001b\u0012\b\b\u0002\u0010\u0011\u001a\u00020\fø\u0001\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ-\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u0011\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0017\u001a\u00020\u00128\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006 "}, d2 = {"Landroidx/compose/ui/text/platform/AndroidFontListTypeface;", "Landroidx/compose/ui/text/platform/AndroidTypeface;", "Landroidx/compose/ui/text/font/FontWeight;", "fontWeight", "Landroidx/compose/ui/text/font/FontStyle;", "fontStyle", "Landroidx/compose/ui/text/font/FontSynthesis;", "synthesis", "Landroid/graphics/Typeface;", "getNativeTypeface-PYhJU0U", "(Landroidx/compose/ui/text/font/FontWeight;II)Landroid/graphics/Typeface;", "getNativeTypeface", "Landroidx/compose/ui/text/font/FontMatcher;", "a", "Landroidx/compose/ui/text/font/FontMatcher;", "getFontMatcher", "()Landroidx/compose/ui/text/font/FontMatcher;", "fontMatcher", "Landroidx/compose/ui/text/font/FontFamily;", "c", "Landroidx/compose/ui/text/font/FontFamily;", "getFontFamily", "()Landroidx/compose/ui/text/font/FontFamily;", "fontFamily", "Landroidx/compose/ui/text/font/FontListFontFamily;", "Landroid/content/Context;", "context", "", "Lkotlin/Pair;", "necessaryStyles", "<init>", "(Landroidx/compose/ui/text/font/FontListFontFamily;Landroid/content/Context;Ljava/util/List;Landroidx/compose/ui/text/font/FontMatcher;)V", "ui-text_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nAndroidFontListTypeface.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidFontListTypeface.android.kt\nandroidx/compose/ui/text/platform/AndroidFontListTypeface\n+ 2 TempListUtils.kt\nandroidx/compose/ui/text/TempListUtilsKt\n+ 3 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,173:1\n35#2,3:174\n38#2,2:181\n40#2:184\n56#2,4:196\n60#2,3:204\n63#2:208\n33#3,4:177\n38#3:183\n151#3,3:185\n33#3,4:188\n154#3,2:192\n38#3:194\n156#3:195\n33#3,4:200\n38#3:207\n33#3,6:209\n*S KotlinDebug\n*F\n+ 1 AndroidFontListTypeface.android.kt\nandroidx/compose/ui/text/platform/AndroidFontListTypeface\n*L\n66#1:174,3\n66#1:181,2\n66#1:184\n71#1:196,4\n71#1:204,3\n71#1:208\n66#1:177,4\n66#1:183\n69#1:185,3\n69#1:188,4\n69#1:192,2\n69#1:194\n69#1:195\n71#1:200,4\n71#1:207\n79#1:209,6\n*E\n"})
public final class AndroidFontListTypeface implements AndroidTypeface {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final FontMatcher f18180d = new FontMatcher();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final FontMatcher fontMatcher;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final LinkedHashMap f18182b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final FontListFontFamily f18183c;

    /* JADX WARN: Code duplicated, block: B:20:0x00b2  */
    public AndroidFontListTypeface(@NotNull FontListFontFamily fontFamily, @NotNull Context context, @Nullable List<Pair<FontWeight, FontStyle>> list, @NotNull FontMatcher fontMatcher) {
        ArrayList arrayList;
        Intrinsics.checkNotNullParameter(fontFamily, "fontFamily");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(fontMatcher, "fontMatcher");
        this.fontMatcher = fontMatcher;
        List<Font> fonts = fontFamily.getFonts();
        ArrayList arrayList2 = new ArrayList(fonts.size());
        int size = fonts.size();
        for (int i10 = 0; i10 < size; i10++) {
            Font font = fonts.get(i10);
            if (FontLoadingStrategy.m4049equalsimpl0(font.getLoadingStrategy(), FontLoadingStrategy.INSTANCE.m4054getBlockingPKNRLFQ())) {
                arrayList2.add(font);
            }
        }
        if (list != null) {
            ArrayList arrayList3 = new ArrayList(list.size());
            int size2 = list.size();
            for (int i11 = 0; i11 < size2; i11++) {
                Pair<FontWeight, FontStyle> pair = list.get(i11);
                arrayList3.add((Font) CollectionsKt___CollectionsKt.firstOrNull((List) this.fontMatcher.m4058matchFontRetOiIg(arrayList2, pair.component1(), pair.component2().m4065unboximpl())));
            }
            List listFastFilterNotNull = TempListUtilsKt.fastFilterNotNull(arrayList3);
            if (listFastFilterNotNull != null) {
                HashSet hashSet = new HashSet(listFastFilterNotNull.size());
                arrayList = new ArrayList(listFastFilterNotNull.size());
                int size3 = listFastFilterNotNull.size();
                for (int i12 = 0; i12 < size3; i12++) {
                    Object obj = listFastFilterNotNull.get(i12);
                    if (hashSet.add((Font) obj)) {
                        arrayList.add(obj);
                    }
                }
            } else {
                arrayList = null;
            }
        } else {
            arrayList = null;
        }
        arrayList2 = arrayList != null ? arrayList : arrayList2;
        if (arrayList2.isEmpty()) {
            throw new IllegalStateException("Could not match font");
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int size4 = arrayList2.size();
        for (int i13 = 0; i13 < size4; i13++) {
            Font font2 = (Font) arrayList2.get(i13);
            try {
                linkedHashMap.put(font2, AndroidTypefaceCache.INSTANCE.getOrCreate(context, font2));
            } catch (Exception unused) {
                throw new IllegalStateException("Cannot create Typeface from " + font2);
            }
        }
        this.f18182b = linkedHashMap;
        this.f18183c = fontFamily;
    }

    @Override // androidx.compose.ui.text.font.Typeface
    @NotNull
    public FontFamily getFontFamily() {
        return this.f18183c;
    }

    @NotNull
    public final FontMatcher getFontMatcher() {
        return this.fontMatcher;
    }

    @Override // androidx.compose.ui.text.platform.AndroidTypeface
    @NotNull
    /* JADX INFO: renamed from: getNativeTypeface-PYhJU0U */
    public Typeface mo4177getNativeTypefacePYhJU0U(@NotNull FontWeight fontWeight, int fontStyle, int synthesis) {
        Intrinsics.checkNotNullParameter(fontWeight, "fontWeight");
        LinkedHashMap linkedHashMap = this.f18182b;
        Font font = (Font) CollectionsKt___CollectionsKt.firstOrNull((List) this.fontMatcher.m4058matchFontRetOiIg(new ArrayList(linkedHashMap.keySet()), fontWeight, fontStyle));
        if (font == null) {
            throw new IllegalStateException("Could not load font");
        }
        Typeface typeface = (Typeface) linkedHashMap.get(font);
        if (typeface == null) {
            throw new IllegalArgumentException("Required value was null.".toString());
        }
        Object objM4081synthesizeTypefaceFxwP2eA = FontSynthesis_androidKt.m4081synthesizeTypefaceFxwP2eA(synthesis, typeface, font, fontWeight, fontStyle);
        Intrinsics.checkNotNull(objM4081synthesizeTypefaceFxwP2eA, "null cannot be cast to non-null type android.graphics.Typeface");
        return (Typeface) objM4081synthesizeTypefaceFxwP2eA;
    }

    public /* synthetic */ AndroidFontListTypeface(FontListFontFamily fontListFontFamily, Context context, List list, FontMatcher fontMatcher, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(fontListFontFamily, context, (i10 & 4) != 0 ? null : list, (i10 & 8) != 0 ? f18180d : fontMatcher);
    }
}
