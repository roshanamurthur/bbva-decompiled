package androidx.compose.ui.text;

import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.compose.runtime.saveable.SaverScope;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.intl.Locale;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextDirection;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.text.style.TextIndent;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.compose.ui.unit.TextUnitType;
import androidx.exifinterface.media.ExifInterface;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.ULong;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Savers.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000ª\u0001\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aK\u0010\t\u001a\u00020\b\"\u0014\b\u0000\u0010\u0001*\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0000\"\u0004\b\u0001\u0010\u0002\"\u0004\b\u0002\u0010\u00032\b\u0010\u0004\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0005\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\t\u0010\n\u001aN\u0010\f\u001a\u0004\u0018\u00018\u0003\"\u0014\b\u0000\u0010\u0001*\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0000\"\u0004\b\u0001\u0010\u0002\"\u0004\b\u0002\u0010\u0003\"\u0006\b\u0003\u0010\u000b\u0018\u00012\b\u0010\u0004\u001a\u0004\u0018\u00018\u00022\u0006\u0010\u0005\u001a\u00028\u0000H\u0080\b¢\u0006\u0004\b\f\u0010\r\u001a!\u0010\t\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u00012\b\u0010\u0004\u001a\u0004\u0018\u00018\u0000H\u0000¢\u0006\u0004\b\t\u0010\u000e\u001a$\u0010\f\u001a\u0004\u0018\u00018\u0000\"\u0006\b\u0000\u0010\u000b\u0018\u00012\b\u0010\u0004\u001a\u0004\u0018\u00010\bH\u0080\b¢\u0006\u0004\b\f\u0010\u000e\"&\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\b0\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"&\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\b0\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0011\u001a\u0004\b\u0017\u0010\u0013\"&\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\b0\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u0011\u001a\u0004\b\u001b\u0010\u0013\"$\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\b0\u0000*\u00020\u001d8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 \"$\u0010!\u001a\u000e\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020\b0\u0000*\u00020\"8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010$\"$\u0010!\u001a\u000e\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020\b0\u0000*\u00020%8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010'\"$\u0010!\u001a\u000e\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020\b0\u0000*\u00020(8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010*\"'\u0010!\u001a\u000e\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020\b0\u0000*\u00020+8@X\u0080\u0004ø\u0001\u0000¢\u0006\u0006\u001a\u0004\b\u001f\u0010-\"'\u0010!\u001a\u000e\u0012\u0004\u0012\u00020/\u0012\u0004\u0012\u00020\b0\u0000*\u00020.8@X\u0080\u0004ø\u0001\u0000¢\u0006\u0006\u001a\u0004\b\u001f\u00100\"$\u0010!\u001a\u000e\u0012\u0004\u0012\u000202\u0012\u0004\u0012\u00020\b0\u0000*\u0002018@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u00103\"'\u0010!\u001a\u000e\u0012\u0004\u0012\u000205\u0012\u0004\u0012\u00020\b0\u0000*\u0002048@X\u0080\u0004ø\u0001\u0000¢\u0006\u0006\u001a\u0004\b\u001f\u00106\"'\u0010!\u001a\u000e\u0012\u0004\u0012\u000208\u0012\u0004\u0012\u00020\b0\u0000*\u0002078@X\u0080\u0004ø\u0001\u0000¢\u0006\u0006\u001a\u0004\b\u001f\u00109\"'\u0010!\u001a\u000e\u0012\u0004\u0012\u00020;\u0012\u0004\u0012\u00020\b0\u0000*\u00020:8@X\u0080\u0004ø\u0001\u0000¢\u0006\u0006\u001a\u0004\b\u001f\u0010<\"$\u0010!\u001a\u000e\u0012\u0004\u0012\u00020>\u0012\u0004\u0012\u00020\b0\u0000*\u00020=8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010?\"$\u0010!\u001a\u000e\u0012\u0004\u0012\u00020A\u0012\u0004\u0012\u00020\b0\u0000*\u00020@8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010B\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006C"}, d2 = {"Landroidx/compose/runtime/saveable/Saver;", ExifInterface.GPS_DIRECTION_TRUE, "Original", "Saveable", "value", "saver", "Landroidx/compose/runtime/saveable/SaverScope;", "scope", "", "save", "(Ljava/lang/Object;Landroidx/compose/runtime/saveable/Saver;Landroidx/compose/runtime/saveable/SaverScope;)Ljava/lang/Object;", "Result", "restore", "(Ljava/lang/Object;Landroidx/compose/runtime/saveable/Saver;)Ljava/lang/Object;", "(Ljava/lang/Object;)Ljava/lang/Object;", "Landroidx/compose/ui/text/AnnotatedString;", "a", "Landroidx/compose/runtime/saveable/Saver;", "getAnnotatedStringSaver", "()Landroidx/compose/runtime/saveable/Saver;", "AnnotatedStringSaver", "Landroidx/compose/ui/text/ParagraphStyle;", "f", "getParagraphStyleSaver", "ParagraphStyleSaver", "Landroidx/compose/ui/text/SpanStyle;", "g", "getSpanStyleSaver", "SpanStyleSaver", "Landroidx/compose/ui/text/style/TextDecoration$Companion;", "Landroidx/compose/ui/text/style/TextDecoration;", "getSaver", "(Landroidx/compose/ui/text/style/TextDecoration$Companion;)Landroidx/compose/runtime/saveable/Saver;", "Saver", "Landroidx/compose/ui/text/style/TextGeometricTransform$Companion;", "Landroidx/compose/ui/text/style/TextGeometricTransform;", "(Landroidx/compose/ui/text/style/TextGeometricTransform$Companion;)Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/ui/text/style/TextIndent$Companion;", "Landroidx/compose/ui/text/style/TextIndent;", "(Landroidx/compose/ui/text/style/TextIndent$Companion;)Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/ui/text/font/FontWeight$Companion;", "Landroidx/compose/ui/text/font/FontWeight;", "(Landroidx/compose/ui/text/font/FontWeight$Companion;)Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/ui/text/style/BaselineShift$Companion;", "Landroidx/compose/ui/text/style/BaselineShift;", "(Landroidx/compose/ui/text/style/BaselineShift$Companion;)Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/ui/text/TextRange$Companion;", "Landroidx/compose/ui/text/TextRange;", "(Landroidx/compose/ui/text/TextRange$Companion;)Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/ui/graphics/Shadow$Companion;", "Landroidx/compose/ui/graphics/Shadow;", "(Landroidx/compose/ui/graphics/Shadow$Companion;)Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/ui/graphics/Color$Companion;", "Landroidx/compose/ui/graphics/Color;", "(Landroidx/compose/ui/graphics/Color$Companion;)Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/ui/unit/TextUnit$Companion;", "Landroidx/compose/ui/unit/TextUnit;", "(Landroidx/compose/ui/unit/TextUnit$Companion;)Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/ui/geometry/Offset$Companion;", "Landroidx/compose/ui/geometry/Offset;", "(Landroidx/compose/ui/geometry/Offset$Companion;)Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/ui/text/intl/LocaleList$Companion;", "Landroidx/compose/ui/text/intl/LocaleList;", "(Landroidx/compose/ui/text/intl/LocaleList$Companion;)Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/ui/text/intl/Locale$Companion;", "Landroidx/compose/ui/text/intl/Locale;", "(Landroidx/compose/ui/text/intl/Locale$Companion;)Landroidx/compose/runtime/saveable/Saver;", "ui-text_release"}, k = 2, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nSavers.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Savers.kt\nandroidx/compose/ui/text/SaversKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,421:1\n1#2:422\n*E\n"})
public final class SaversKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final Saver<AnnotatedString, Object> f17668a = SaverKt.Saver(a.f17688p0, b.f17690p0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final Saver<List<AnnotatedString.Range<? extends Object>>, Object> f17669b = SaverKt.Saver(c.f17692p0, d.f17694p0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final Saver<AnnotatedString.Range<? extends Object>, Object> f17670c = SaverKt.Saver(SaversKt$AnnotationRangeSaver$1.f17686p0, SaversKt$AnnotationRangeSaver$2.f17687p0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final Saver<VerbatimTtsAnnotation, Object> f17671d = SaverKt.Saver(i0.f17705p0, j0.f17707p0);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final Saver<UrlAnnotation, Object> f17672e = SaverKt.Saver(g0.f17701p0, h0.f17703p0);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public static final Saver<ParagraphStyle, Object> f17673f = SaverKt.Saver(q.f17714p0, r.f17715p0);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public static final Saver<SpanStyle, Object> f17674g = SaverKt.Saver(u.f17718p0, v.f17719p0);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public static final Saver<TextDecoration, Object> f17675h = SaverKt.Saver(w.f17720p0, x.f17721p0);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public static final Saver<TextGeometricTransform, Object> f17676i = SaverKt.Saver(y.f17722p0, z.f17723p0);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public static final Saver<TextIndent, Object> f17677j = SaverKt.Saver(a0.f17689p0, b0.f17691p0);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public static final Saver<FontWeight, Object> f17678k = SaverKt.Saver(i.f17704p0, j.f17706p0);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public static final Saver<BaselineShift, Object> f17679l = SaverKt.Saver(e.f17696p0, f.f17698p0);

    @NotNull
    public static final Saver<TextRange, Object> m = SaverKt.Saver(c0.f17693p0, d0.f17695p0);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public static final Saver<Shadow, Object> f17680n = SaverKt.Saver(s.f17716p0, t.f17717p0);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    public static final Saver<Color, Object> f17681o = SaverKt.Saver(g.f17700p0, h.f17702p0);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NotNull
    public static final Saver<TextUnit, Object> f17682p = SaverKt.Saver(e0.f17697p0, f0.f17699p0);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @NotNull
    public static final Saver<Offset, Object> f17683q = SaverKt.Saver(o.f17712p0, p.f17713p0);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @NotNull
    public static final Saver<LocaleList, Object> f17684r = SaverKt.Saver(k.f17708p0, l.f17709p0);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NotNull
    public static final Saver<Locale, Object> f17685s = SaverKt.Saver(m.f17710p0, n.f17711p0);

    /* JADX INFO: compiled from: Savers.kt */
    public static final class a extends Lambda implements Function2<SaverScope, AnnotatedString, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final a f17688p0 = new a(2);

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(SaverScope saverScope, AnnotatedString annotatedString) {
            SaverScope Saver = saverScope;
            AnnotatedString it = annotatedString;
            Intrinsics.checkNotNullParameter(Saver, "$this$Saver");
            Intrinsics.checkNotNullParameter(it, "it");
            return CollectionsKt__CollectionsKt.arrayListOf(SaversKt.save(it.getText()), SaversKt.save(it.getSpanStyles(), SaversKt.f17669b, Saver), SaversKt.save(it.getParagraphStyles(), SaversKt.f17669b, Saver), SaversKt.save(it.getAnnotations$ui_text_release(), SaversKt.f17669b, Saver));
        }
    }

    /* JADX INFO: compiled from: Savers.kt */
    public static final class a0 extends Lambda implements Function2<SaverScope, TextIndent, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final a0 f17689p0 = new a0(2);

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(SaverScope saverScope, TextIndent textIndent) {
            SaverScope Saver = saverScope;
            TextIndent it = textIndent;
            Intrinsics.checkNotNullParameter(Saver, "$this$Saver");
            Intrinsics.checkNotNullParameter(it, "it");
            TextUnit textUnitM4560boximpl = TextUnit.m4560boximpl(it.getFirstLine());
            TextUnit.Companion companion = TextUnit.INSTANCE;
            return CollectionsKt__CollectionsKt.arrayListOf(SaversKt.save(textUnitM4560boximpl, SaversKt.getSaver(companion), Saver), SaversKt.save(TextUnit.m4560boximpl(it.getRestLine()), SaversKt.getSaver(companion), Saver));
        }
    }

    /* JADX INFO: compiled from: Savers.kt */
    @SourceDebugExtension({"SMAP\nSavers.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Savers.kt\nandroidx/compose/ui/text/SaversKt$AnnotatedStringSaver$2\n+ 2 Savers.kt\nandroidx/compose/ui/text/SaversKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,421:1\n55#2,2:422\n55#2,2:425\n70#2:428\n55#2,2:431\n1#3:424\n1#3:427\n1#3:429\n1#3:430\n1#3:433\n*S KotlinDebug\n*F\n+ 1 Savers.kt\nandroidx/compose/ui/text/SaversKt$AnnotatedStringSaver$2\n*L\n86#1:422,2\n88#1:425,2\n90#1:428\n93#1:431,2\n86#1:424\n88#1:427\n90#1:429\n93#1:433\n*E\n"})
    public static final class b extends Lambda implements Function1<Object, AnnotatedString> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final b f17690p0 = new b(1);

        @Override // kotlin.jvm.functions.Function1
        public final AnnotatedString invoke(Object it) {
            List list;
            List list2;
            Intrinsics.checkNotNullParameter(it, "it");
            List list3 = (List) it;
            Object obj = list3.get(1);
            Saver saver = SaversKt.f17669b;
            Boolean bool = Boolean.FALSE;
            List list4 = null;
            List list5 = (Intrinsics.areEqual(obj, bool) || obj == null) ? null : (List) saver.restore(obj);
            Object obj2 = list3.get(2);
            List list6 = (Intrinsics.areEqual(obj2, bool) || obj2 == null) ? null : (List) SaversKt.f17669b.restore(obj2);
            Object obj3 = list3.get(0);
            String str = obj3 != null ? (String) obj3 : null;
            Intrinsics.checkNotNull(str);
            if (list5 != null) {
                List list7 = list5;
                if (list7.isEmpty()) {
                    list7 = null;
                }
                list = list7;
            } else {
                list = null;
            }
            if (list6 != null) {
                List list8 = list6;
                if (list8.isEmpty()) {
                    list8 = null;
                }
                list2 = list8;
            } else {
                list2 = null;
            }
            Object obj4 = list3.get(3);
            Saver saver2 = SaversKt.f17669b;
            if (!Intrinsics.areEqual(obj4, bool) && obj4 != null) {
                list4 = (List) saver2.restore(obj4);
            }
            return new AnnotatedString(str, list, list2, list4);
        }
    }

    /* JADX INFO: compiled from: Savers.kt */
    @SourceDebugExtension({"SMAP\nSavers.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Savers.kt\nandroidx/compose/ui/text/SaversKt$TextIndentSaver$2\n+ 2 Savers.kt\nandroidx/compose/ui/text/SaversKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,421:1\n55#2,2:422\n55#2,2:425\n1#3:424\n1#3:427\n*S KotlinDebug\n*F\n+ 1 Savers.kt\nandroidx/compose/ui/text/SaversKt$TextIndentSaver$2\n*L\n295#1:422,2\n296#1:425,2\n295#1:424\n296#1:427\n*E\n"})
    public static final class b0 extends Lambda implements Function1<Object, TextIndent> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final b0 f17691p0 = new b0(1);

        @Override // kotlin.jvm.functions.Function1
        public final TextIndent invoke(Object it) {
            Intrinsics.checkNotNullParameter(it, "it");
            List list = (List) it;
            Object obj = list.get(0);
            TextUnit.Companion companion = TextUnit.INSTANCE;
            Saver<TextUnit, Object> saver = SaversKt.getSaver(companion);
            Boolean bool = Boolean.FALSE;
            TextUnit textUnitRestore = null;
            TextUnit textUnitRestore2 = (Intrinsics.areEqual(obj, bool) || obj == null) ? null : saver.restore(obj);
            Intrinsics.checkNotNull(textUnitRestore2);
            long f18322a = textUnitRestore2.getF18322a();
            Object obj2 = list.get(1);
            Saver<TextUnit, Object> saver2 = SaversKt.getSaver(companion);
            if (!Intrinsics.areEqual(obj2, bool) && obj2 != null) {
                textUnitRestore = saver2.restore(obj2);
            }
            Intrinsics.checkNotNull(textUnitRestore);
            return new TextIndent(f18322a, textUnitRestore.getF18322a(), null);
        }
    }

    /* JADX INFO: compiled from: Savers.kt */
    @SourceDebugExtension({"SMAP\nSavers.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Savers.kt\nandroidx/compose/ui/text/SaversKt$AnnotationRangeListSaver$1\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,421:1\n151#2,3:422\n33#2,4:425\n154#2,2:429\n38#2:431\n156#2:432\n*S KotlinDebug\n*F\n+ 1 Savers.kt\nandroidx/compose/ui/text/SaversKt$AnnotationRangeListSaver$1\n*L\n100#1:422,3\n100#1:425,4\n100#1:429,2\n100#1:431\n100#1:432\n*E\n"})
    public static final class c extends Lambda implements Function2<SaverScope, List<? extends AnnotatedString.Range<? extends Object>>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final c f17692p0 = new c(2);

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(SaverScope saverScope, List<? extends AnnotatedString.Range<? extends Object>> list) {
            SaverScope Saver = saverScope;
            List<? extends AnnotatedString.Range<? extends Object>> it = list;
            Intrinsics.checkNotNullParameter(Saver, "$this$Saver");
            Intrinsics.checkNotNullParameter(it, "it");
            ArrayList arrayList = new ArrayList(it.size());
            int size = it.size();
            for (int i10 = 0; i10 < size; i10++) {
                arrayList.add(SaversKt.save(it.get(i10), SaversKt.f17670c, Saver));
            }
            return arrayList;
        }
    }

    /* JADX INFO: compiled from: Savers.kt */
    public static final class c0 extends Lambda implements Function2<SaverScope, TextRange, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final c0 f17693p0 = new c0(2);

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(SaverScope saverScope, TextRange textRange) {
            SaverScope Saver = saverScope;
            long f17768a = textRange.getF17768a();
            Intrinsics.checkNotNullParameter(Saver, "$this$Saver");
            return CollectionsKt__CollectionsKt.arrayListOf(SaversKt.save(Integer.valueOf(TextRange.m3967getStartimpl(f17768a))), SaversKt.save(Integer.valueOf(TextRange.m3962getEndimpl(f17768a))));
        }
    }

    /* JADX INFO: compiled from: Savers.kt */
    @SourceDebugExtension({"SMAP\nSavers.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Savers.kt\nandroidx/compose/ui/text/SaversKt$AnnotationRangeListSaver$2\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 Savers.kt\nandroidx/compose/ui/text/SaversKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,421:1\n151#2,3:422\n33#2,4:425\n154#2:429\n155#2:433\n38#2:434\n156#2:435\n55#3,2:430\n1#4:432\n*S KotlinDebug\n*F\n+ 1 Savers.kt\nandroidx/compose/ui/text/SaversKt$AnnotationRangeListSaver$2\n*L\n107#1:422,3\n107#1:425,4\n107#1:429\n107#1:433\n107#1:434\n107#1:435\n108#1:430,2\n108#1:432\n*E\n"})
    public static final class d extends Lambda implements Function1<Object, List<? extends AnnotatedString.Range<? extends Object>>> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final d f17694p0 = new d(1);

        @Override // kotlin.jvm.functions.Function1
        public final List<? extends AnnotatedString.Range<? extends Object>> invoke(Object it) {
            Intrinsics.checkNotNullParameter(it, "it");
            List list = (List) it;
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                Object obj = list.get(i10);
                Saver saver = SaversKt.f17670c;
                AnnotatedString.Range range = null;
                if (!Intrinsics.areEqual(obj, Boolean.FALSE) && obj != null) {
                    range = (AnnotatedString.Range) saver.restore(obj);
                }
                Intrinsics.checkNotNull(range);
                arrayList.add(range);
            }
            return arrayList;
        }
    }

    /* JADX INFO: compiled from: Savers.kt */
    @SourceDebugExtension({"SMAP\nSavers.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Savers.kt\nandroidx/compose/ui/text/SaversKt$TextRangeSaver$2\n+ 2 Savers.kt\nandroidx/compose/ui/text/SaversKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,421:1\n70#2:422\n1#3:423\n*S KotlinDebug\n*F\n+ 1 Savers.kt\nandroidx/compose/ui/text/SaversKt$TextRangeSaver$2\n*L\n329#1:422\n329#1:423\n*E\n"})
    public static final class d0 extends Lambda implements Function1<Object, TextRange> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final d0 f17695p0 = new d0(1);

        @Override // kotlin.jvm.functions.Function1
        public final TextRange invoke(Object it) {
            Intrinsics.checkNotNullParameter(it, "it");
            List list = (List) it;
            Object obj = list.get(0);
            Integer num = obj != null ? (Integer) obj : null;
            Intrinsics.checkNotNull(num);
            int iIntValue = num.intValue();
            Object obj2 = list.get(1);
            Integer num2 = obj2 != null ? (Integer) obj2 : null;
            Intrinsics.checkNotNull(num2);
            return TextRange.m3955boximpl(TextRangeKt.TextRange(iIntValue, num2.intValue()));
        }
    }

    /* JADX INFO: compiled from: Savers.kt */
    public static final class e extends Lambda implements Function2<SaverScope, BaselineShift, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final e f17696p0 = new e(2);

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(SaverScope saverScope, BaselineShift baselineShift) {
            SaverScope Saver = saverScope;
            float fM4203unboximpl = baselineShift.m4203unboximpl();
            Intrinsics.checkNotNullParameter(Saver, "$this$Saver");
            return Float.valueOf(fM4203unboximpl);
        }
    }

    /* JADX INFO: compiled from: Savers.kt */
    public static final class e0 extends Lambda implements Function2<SaverScope, TextUnit, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final e0 f17697p0 = new e0(2);

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(SaverScope saverScope, TextUnit textUnit) {
            SaverScope Saver = saverScope;
            long f18322a = textUnit.getF18322a();
            Intrinsics.checkNotNullParameter(Saver, "$this$Saver");
            return CollectionsKt__CollectionsKt.arrayListOf(SaversKt.save(Float.valueOf(TextUnit.m4570getValueimpl(f18322a))), SaversKt.save(TextUnitType.m4595boximpl(TextUnit.m4569getTypeUIouoOA(f18322a))));
        }
    }

    /* JADX INFO: compiled from: Savers.kt */
    public static final class f extends Lambda implements Function1<Object, BaselineShift> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final f f17698p0 = new f(1);

        @Override // kotlin.jvm.functions.Function1
        public final BaselineShift invoke(Object it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return BaselineShift.m4197boximpl(BaselineShift.m4198constructorimpl(((Float) it).floatValue()));
        }
    }

    /* JADX INFO: compiled from: Savers.kt */
    @SourceDebugExtension({"SMAP\nSavers.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Savers.kt\nandroidx/compose/ui/text/SaversKt$TextUnitSaver$2\n+ 2 Savers.kt\nandroidx/compose/ui/text/SaversKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,421:1\n70#2:422\n1#3:423\n*S KotlinDebug\n*F\n+ 1 Savers.kt\nandroidx/compose/ui/text/SaversKt$TextUnitSaver$2\n*L\n374#1:422\n374#1:423\n*E\n"})
    public static final class f0 extends Lambda implements Function1<Object, TextUnit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final f0 f17699p0 = new f0(1);

        @Override // kotlin.jvm.functions.Function1
        public final TextUnit invoke(Object it) {
            Intrinsics.checkNotNullParameter(it, "it");
            List list = (List) it;
            Object obj = list.get(0);
            Float f6 = obj != null ? (Float) obj : null;
            Intrinsics.checkNotNull(f6);
            float fFloatValue = f6.floatValue();
            Object obj2 = list.get(1);
            TextUnitType textUnitType = obj2 != null ? (TextUnitType) obj2 : null;
            Intrinsics.checkNotNull(textUnitType);
            return TextUnit.m4560boximpl(TextUnitKt.m4582TextUnitanM5pPY(fFloatValue, textUnitType.getF18326a()));
        }
    }

    /* JADX INFO: compiled from: Savers.kt */
    public static final class g extends Lambda implements Function2<SaverScope, Color, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final g f17700p0 = new g(2);

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(SaverScope saverScope, Color color) {
            SaverScope Saver = saverScope;
            long jM2518unboximpl = color.m2518unboximpl();
            Intrinsics.checkNotNullParameter(Saver, "$this$Saver");
            return ULong.m5594boximpl(jM2518unboximpl);
        }
    }

    /* JADX INFO: compiled from: Savers.kt */
    public static final class g0 extends Lambda implements Function2<SaverScope, UrlAnnotation, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final g0 f17701p0 = new g0(2);

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(SaverScope saverScope, UrlAnnotation urlAnnotation) {
            SaverScope Saver = saverScope;
            UrlAnnotation it = urlAnnotation;
            Intrinsics.checkNotNullParameter(Saver, "$this$Saver");
            Intrinsics.checkNotNullParameter(it, "it");
            return SaversKt.save(it.getUrl());
        }
    }

    /* JADX INFO: compiled from: Savers.kt */
    public static final class h extends Lambda implements Function1<Object, Color> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final h f17702p0 = new h(1);

        @Override // kotlin.jvm.functions.Function1
        public final Color invoke(Object it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Color.m2498boximpl(Color.m2504constructorimpl(((ULong) it).getF79403p0()));
        }
    }

    /* JADX INFO: compiled from: Savers.kt */
    @SourceDebugExtension({"SMAP\nSavers.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Savers.kt\nandroidx/compose/ui/text/SaversKt$UrlAnnotationSaver$2\n+ 2 Savers.kt\nandroidx/compose/ui/text/SaversKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,421:1\n70#2:422\n1#3:423\n*S KotlinDebug\n*F\n+ 1 Savers.kt\nandroidx/compose/ui/text/SaversKt$UrlAnnotationSaver$2\n*L\n198#1:422\n198#1:423\n*E\n"})
    public static final class h0 extends Lambda implements Function1<Object, UrlAnnotation> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final h0 f17703p0 = new h0(1);

        @Override // kotlin.jvm.functions.Function1
        public final UrlAnnotation invoke(Object it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return new UrlAnnotation((String) it);
        }
    }

    /* JADX INFO: compiled from: Savers.kt */
    public static final class i extends Lambda implements Function2<SaverScope, FontWeight, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final i f17704p0 = new i(2);

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(SaverScope saverScope, FontWeight fontWeight) {
            SaverScope Saver = saverScope;
            FontWeight it = fontWeight;
            Intrinsics.checkNotNullParameter(Saver, "$this$Saver");
            Intrinsics.checkNotNullParameter(it, "it");
            return Integer.valueOf(it.getWeight());
        }
    }

    /* JADX INFO: compiled from: Savers.kt */
    public static final class i0 extends Lambda implements Function2<SaverScope, VerbatimTtsAnnotation, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final i0 f17705p0 = new i0(2);

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(SaverScope saverScope, VerbatimTtsAnnotation verbatimTtsAnnotation) {
            SaverScope Saver = saverScope;
            VerbatimTtsAnnotation it = verbatimTtsAnnotation;
            Intrinsics.checkNotNullParameter(Saver, "$this$Saver");
            Intrinsics.checkNotNullParameter(it, "it");
            return SaversKt.save(it.getVerbatim());
        }
    }

    /* JADX INFO: compiled from: Savers.kt */
    public static final class j extends Lambda implements Function1<Object, FontWeight> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final j f17706p0 = new j(1);

        @Override // kotlin.jvm.functions.Function1
        public final FontWeight invoke(Object it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return new FontWeight(((Integer) it).intValue());
        }
    }

    /* JADX INFO: compiled from: Savers.kt */
    @SourceDebugExtension({"SMAP\nSavers.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Savers.kt\nandroidx/compose/ui/text/SaversKt$VerbatimTtsAnnotationSaver$2\n+ 2 Savers.kt\nandroidx/compose/ui/text/SaversKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,421:1\n70#2:422\n1#3:423\n*S KotlinDebug\n*F\n+ 1 Savers.kt\nandroidx/compose/ui/text/SaversKt$VerbatimTtsAnnotationSaver$2\n*L\n192#1:422\n192#1:423\n*E\n"})
    public static final class j0 extends Lambda implements Function1<Object, VerbatimTtsAnnotation> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final j0 f17707p0 = new j0(1);

        @Override // kotlin.jvm.functions.Function1
        public final VerbatimTtsAnnotation invoke(Object it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return new VerbatimTtsAnnotation((String) it);
        }
    }

    /* JADX INFO: compiled from: Savers.kt */
    @SourceDebugExtension({"SMAP\nSavers.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Savers.kt\nandroidx/compose/ui/text/SaversKt$LocaleListSaver$1\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,421:1\n151#2,3:422\n33#2,4:425\n154#2,2:429\n38#2:431\n156#2:432\n*S KotlinDebug\n*F\n+ 1 Savers.kt\nandroidx/compose/ui/text/SaversKt$LocaleListSaver$1\n*L\n404#1:422,3\n404#1:425,4\n404#1:429,2\n404#1:431\n404#1:432\n*E\n"})
    public static final class k extends Lambda implements Function2<SaverScope, LocaleList, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final k f17708p0 = new k(2);

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(SaverScope saverScope, LocaleList localeList) {
            SaverScope Saver = saverScope;
            LocaleList it = localeList;
            Intrinsics.checkNotNullParameter(Saver, "$this$Saver");
            Intrinsics.checkNotNullParameter(it, "it");
            List<Locale> localeList2 = it.getLocaleList();
            ArrayList arrayList = new ArrayList(localeList2.size());
            int size = localeList2.size();
            for (int i10 = 0; i10 < size; i10++) {
                arrayList.add(SaversKt.save(localeList2.get(i10), SaversKt.getSaver(Locale.INSTANCE), Saver));
            }
            return arrayList;
        }
    }

    /* JADX INFO: compiled from: Savers.kt */
    @SourceDebugExtension({"SMAP\nSavers.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Savers.kt\nandroidx/compose/ui/text/SaversKt$LocaleListSaver$2\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 Savers.kt\nandroidx/compose/ui/text/SaversKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,421:1\n151#2,3:422\n33#2,4:425\n154#2:429\n155#2:433\n38#2:434\n156#2:435\n55#3,2:430\n1#4:432\n*S KotlinDebug\n*F\n+ 1 Savers.kt\nandroidx/compose/ui/text/SaversKt$LocaleListSaver$2\n*L\n411#1:422,3\n411#1:425,4\n411#1:429\n411#1:433\n411#1:434\n411#1:435\n411#1:430,2\n411#1:432\n*E\n"})
    public static final class l extends Lambda implements Function1<Object, LocaleList> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final l f17709p0 = new l(1);

        @Override // kotlin.jvm.functions.Function1
        public final LocaleList invoke(Object it) {
            Intrinsics.checkNotNullParameter(it, "it");
            List list = (List) it;
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                Object obj = list.get(i10);
                Saver<Locale, Object> saver = SaversKt.getSaver(Locale.INSTANCE);
                Locale localeRestore = null;
                if (!Intrinsics.areEqual(obj, Boolean.FALSE) && obj != null) {
                    localeRestore = saver.restore(obj);
                }
                Intrinsics.checkNotNull(localeRestore);
                arrayList.add(localeRestore);
            }
            return new LocaleList(arrayList);
        }
    }

    /* JADX INFO: compiled from: Savers.kt */
    public static final class m extends Lambda implements Function2<SaverScope, Locale, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final m f17710p0 = new m(2);

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(SaverScope saverScope, Locale locale) {
            SaverScope Saver = saverScope;
            Locale it = locale;
            Intrinsics.checkNotNullParameter(Saver, "$this$Saver");
            Intrinsics.checkNotNullParameter(it, "it");
            return it.toLanguageTag();
        }
    }

    /* JADX INFO: compiled from: Savers.kt */
    public static final class n extends Lambda implements Function1<Object, Locale> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final n f17711p0 = new n(1);

        @Override // kotlin.jvm.functions.Function1
        public final Locale invoke(Object it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return new Locale((String) it);
        }
    }

    /* JADX INFO: compiled from: Savers.kt */
    public static final class o extends Lambda implements Function2<SaverScope, Offset, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final o f17712p0 = new o(2);

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(SaverScope saverScope, Offset offset) {
            SaverScope Saver = saverScope;
            long f15533a = offset.getF15533a();
            Intrinsics.checkNotNullParameter(Saver, "$this$Saver");
            return Offset.m2272equalsimpl0(f15533a, Offset.INSTANCE.m2290getUnspecifiedF1C5BW0()) ? Boolean.FALSE : CollectionsKt__CollectionsKt.arrayListOf(SaversKt.save(Float.valueOf(Offset.m2275getXimpl(f15533a))), SaversKt.save(Float.valueOf(Offset.m2276getYimpl(f15533a))));
        }
    }

    /* JADX INFO: compiled from: Savers.kt */
    @SourceDebugExtension({"SMAP\nSavers.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Savers.kt\nandroidx/compose/ui/text/SaversKt$OffsetSaver$2\n+ 2 Savers.kt\nandroidx/compose/ui/text/SaversKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,421:1\n70#2:422\n1#3:423\n*S KotlinDebug\n*F\n+ 1 Savers.kt\nandroidx/compose/ui/text/SaversKt$OffsetSaver$2\n*L\n394#1:422\n394#1:423\n*E\n"})
    public static final class p extends Lambda implements Function1<Object, Offset> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final p f17713p0 = new p(1);

        @Override // kotlin.jvm.functions.Function1
        public final Offset invoke(Object it) {
            Intrinsics.checkNotNullParameter(it, "it");
            if (Intrinsics.areEqual(it, Boolean.FALSE)) {
                return Offset.m2264boximpl(Offset.INSTANCE.m2290getUnspecifiedF1C5BW0());
            }
            List list = (List) it;
            Object obj = list.get(0);
            Float f6 = obj != null ? (Float) obj : null;
            Intrinsics.checkNotNull(f6);
            float fFloatValue = f6.floatValue();
            Object obj2 = list.get(1);
            Float f10 = obj2 != null ? (Float) obj2 : null;
            Intrinsics.checkNotNull(f10);
            return Offset.m2264boximpl(OffsetKt.Offset(fFloatValue, f10.floatValue()));
        }
    }

    /* JADX INFO: compiled from: Savers.kt */
    public static final class q extends Lambda implements Function2<SaverScope, ParagraphStyle, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final q f17714p0 = new q(2);

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(SaverScope saverScope, ParagraphStyle paragraphStyle) {
            SaverScope Saver = saverScope;
            ParagraphStyle it = paragraphStyle;
            Intrinsics.checkNotNullParameter(Saver, "$this$Saver");
            Intrinsics.checkNotNullParameter(it, "it");
            return CollectionsKt__CollectionsKt.arrayListOf(SaversKt.save(it.getTextAlign()), SaversKt.save(it.getTextDirection()), SaversKt.save(TextUnit.m4560boximpl(it.getLineHeight()), SaversKt.getSaver(TextUnit.INSTANCE), Saver), SaversKt.save(it.getTextIndent(), SaversKt.getSaver(TextIndent.INSTANCE), Saver));
        }
    }

    /* JADX INFO: compiled from: Savers.kt */
    @SourceDebugExtension({"SMAP\nSavers.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Savers.kt\nandroidx/compose/ui/text/SaversKt$ParagraphStyleSaver$2\n+ 2 Savers.kt\nandroidx/compose/ui/text/SaversKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,421:1\n70#2:422\n70#2:424\n55#2,2:426\n55#2,2:429\n1#3:423\n1#3:425\n1#3:428\n1#3:431\n*S KotlinDebug\n*F\n+ 1 Savers.kt\nandroidx/compose/ui/text/SaversKt$ParagraphStyleSaver$2\n*L\n213#1:422\n214#1:424\n215#1:426,2\n216#1:429,2\n213#1:423\n214#1:425\n215#1:428\n216#1:431\n*E\n"})
    public static final class r extends Lambda implements Function1<Object, ParagraphStyle> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final r f17715p0 = new r(1);

        @Override // kotlin.jvm.functions.Function1
        public final ParagraphStyle invoke(Object it) {
            Intrinsics.checkNotNullParameter(it, "it");
            List list = (List) it;
            Object obj = list.get(0);
            TextAlign textAlign = obj != null ? (TextAlign) obj : null;
            Object obj2 = list.get(1);
            TextDirection textDirection = obj2 != null ? (TextDirection) obj2 : null;
            Object obj3 = list.get(2);
            Saver<TextUnit, Object> saver = SaversKt.getSaver(TextUnit.INSTANCE);
            Boolean bool = Boolean.FALSE;
            TextUnit textUnitRestore = (Intrinsics.areEqual(obj3, bool) || obj3 == null) ? null : saver.restore(obj3);
            Intrinsics.checkNotNull(textUnitRestore);
            long f18322a = textUnitRestore.getF18322a();
            Object obj4 = list.get(3);
            return new ParagraphStyle(textAlign, textDirection, f18322a, (Intrinsics.areEqual(obj4, bool) || obj4 == null) ? null : SaversKt.getSaver(TextIndent.INSTANCE).restore(obj4), null, null, null, null, null, 496, null);
        }
    }

    /* JADX INFO: compiled from: Savers.kt */
    public static final class s extends Lambda implements Function2<SaverScope, Shadow, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final s f17716p0 = new s(2);

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(SaverScope saverScope, Shadow shadow) {
            SaverScope Saver = saverScope;
            Shadow it = shadow;
            Intrinsics.checkNotNullParameter(Saver, "$this$Saver");
            Intrinsics.checkNotNullParameter(it, "it");
            return CollectionsKt__CollectionsKt.arrayListOf(SaversKt.save(Color.m2498boximpl(it.getColor()), SaversKt.getSaver(Color.INSTANCE), Saver), SaversKt.save(Offset.m2264boximpl(it.getAndroidx.constraintlayout.core.motion.utils.TypedValues.CycleType.S_WAVE_OFFSET java.lang.String()), SaversKt.getSaver(Offset.INSTANCE), Saver), SaversKt.save(Float.valueOf(it.getBlurRadius())));
        }
    }

    /* JADX INFO: compiled from: Savers.kt */
    @SourceDebugExtension({"SMAP\nSavers.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Savers.kt\nandroidx/compose/ui/text/SaversKt$ShadowSaver$2\n+ 2 Savers.kt\nandroidx/compose/ui/text/SaversKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,421:1\n55#2,2:422\n55#2,2:425\n70#2:428\n1#3:424\n1#3:427\n1#3:429\n*S KotlinDebug\n*F\n+ 1 Savers.kt\nandroidx/compose/ui/text/SaversKt$ShadowSaver$2\n*L\n348#1:422,2\n349#1:425,2\n350#1:428\n348#1:424\n349#1:427\n350#1:429\n*E\n"})
    public static final class t extends Lambda implements Function1<Object, Shadow> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final t f17717p0 = new t(1);

        @Override // kotlin.jvm.functions.Function1
        public final Shadow invoke(Object it) {
            Intrinsics.checkNotNullParameter(it, "it");
            List list = (List) it;
            Object obj = list.get(0);
            Saver<Color, Object> saver = SaversKt.getSaver(Color.INSTANCE);
            Boolean bool = Boolean.FALSE;
            Color colorRestore = (Intrinsics.areEqual(obj, bool) || obj == null) ? null : saver.restore(obj);
            Intrinsics.checkNotNull(colorRestore);
            long jM2518unboximpl = colorRestore.m2518unboximpl();
            Object obj2 = list.get(1);
            Offset offsetRestore = (Intrinsics.areEqual(obj2, bool) || obj2 == null) ? null : SaversKt.getSaver(Offset.INSTANCE).restore(obj2);
            Intrinsics.checkNotNull(offsetRestore);
            long f15533a = offsetRestore.getF15533a();
            Object obj3 = list.get(2);
            Float f6 = obj3 != null ? (Float) obj3 : null;
            Intrinsics.checkNotNull(f6);
            return new Shadow(jM2518unboximpl, f15533a, f6.floatValue(), null);
        }
    }

    /* JADX INFO: compiled from: Savers.kt */
    public static final class u extends Lambda implements Function2<SaverScope, SpanStyle, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final u f17718p0 = new u(2);

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(SaverScope saverScope, SpanStyle spanStyle) {
            SaverScope Saver = saverScope;
            SpanStyle it = spanStyle;
            Intrinsics.checkNotNullParameter(Saver, "$this$Saver");
            Intrinsics.checkNotNullParameter(it, "it");
            Color colorM2498boximpl = Color.m2498boximpl(it.m3927getColor0d7_KjU());
            Color.Companion companion = Color.INSTANCE;
            TextUnit textUnitM4560boximpl = TextUnit.m4560boximpl(it.getFontSize());
            TextUnit.Companion companion2 = TextUnit.INSTANCE;
            return CollectionsKt__CollectionsKt.arrayListOf(SaversKt.save(colorM2498boximpl, SaversKt.getSaver(companion), Saver), SaversKt.save(textUnitM4560boximpl, SaversKt.getSaver(companion2), Saver), SaversKt.save(it.getFontWeight(), SaversKt.getSaver(FontWeight.INSTANCE), Saver), SaversKt.save(it.getFontStyle()), SaversKt.save(it.getFontSynthesis()), SaversKt.save(-1), SaversKt.save(it.getFontFeatureSettings()), SaversKt.save(TextUnit.m4560boximpl(it.getLetterSpacing()), SaversKt.getSaver(companion2), Saver), SaversKt.save(it.getBaselineShift(), SaversKt.getSaver(BaselineShift.INSTANCE), Saver), SaversKt.save(it.getTextGeometricTransform(), SaversKt.getSaver(TextGeometricTransform.INSTANCE), Saver), SaversKt.save(it.getLocaleList(), SaversKt.getSaver(LocaleList.INSTANCE), Saver), SaversKt.save(Color.m2498boximpl(it.getBackground()), SaversKt.getSaver(companion), Saver), SaversKt.save(it.getTextDecoration(), SaversKt.getSaver(TextDecoration.INSTANCE), Saver), SaversKt.save(it.getShadow(), SaversKt.getSaver(Shadow.INSTANCE), Saver));
        }
    }

    /* JADX INFO: compiled from: Savers.kt */
    @SourceDebugExtension({"SMAP\nSavers.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Savers.kt\nandroidx/compose/ui/text/SaversKt$SpanStyleSaver$2\n+ 2 Savers.kt\nandroidx/compose/ui/text/SaversKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,421:1\n55#2,2:422\n55#2,2:425\n55#2,2:428\n70#2:431\n70#2:433\n70#2:435\n55#2,2:437\n55#2,2:440\n55#2,2:443\n55#2,2:446\n55#2,2:449\n55#2,2:452\n55#2,2:455\n1#3:424\n1#3:427\n1#3:430\n1#3:432\n1#3:434\n1#3:436\n1#3:439\n1#3:442\n1#3:445\n1#3:448\n1#3:451\n1#3:454\n1#3:457\n*S KotlinDebug\n*F\n+ 1 Savers.kt\nandroidx/compose/ui/text/SaversKt$SpanStyleSaver$2\n*L\n243#1:422,2\n244#1:425,2\n245#1:428,2\n246#1:431\n247#1:433\n249#1:435\n250#1:437,2\n251#1:440,2\n252#1:443,2\n253#1:446,2\n254#1:449,2\n255#1:452,2\n256#1:455,2\n243#1:424\n244#1:427\n245#1:430\n246#1:432\n247#1:434\n249#1:436\n250#1:439\n251#1:442\n252#1:445\n253#1:448\n254#1:451\n255#1:454\n256#1:457\n*E\n"})
    public static final class v extends Lambda implements Function1<Object, SpanStyle> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final v f17719p0 = new v(1);

        @Override // kotlin.jvm.functions.Function1
        public final SpanStyle invoke(Object it) {
            Intrinsics.checkNotNullParameter(it, "it");
            List list = (List) it;
            Object obj = list.get(0);
            Color.Companion companion = Color.INSTANCE;
            Saver<Color, Object> saver = SaversKt.getSaver(companion);
            Boolean bool = Boolean.FALSE;
            Color colorRestore = (Intrinsics.areEqual(obj, bool) || obj == null) ? null : saver.restore(obj);
            Intrinsics.checkNotNull(colorRestore);
            long jM2518unboximpl = colorRestore.m2518unboximpl();
            Object obj2 = list.get(1);
            TextUnit.Companion companion2 = TextUnit.INSTANCE;
            TextUnit textUnitRestore = (Intrinsics.areEqual(obj2, bool) || obj2 == null) ? null : SaversKt.getSaver(companion2).restore(obj2);
            Intrinsics.checkNotNull(textUnitRestore);
            long f18322a = textUnitRestore.getF18322a();
            Object obj3 = list.get(2);
            FontWeight fontWeightRestore = (Intrinsics.areEqual(obj3, bool) || obj3 == null) ? null : SaversKt.getSaver(FontWeight.INSTANCE).restore(obj3);
            Object obj4 = list.get(3);
            FontStyle fontStyle = obj4 != null ? (FontStyle) obj4 : null;
            Object obj5 = list.get(4);
            FontSynthesis fontSynthesis = obj5 != null ? (FontSynthesis) obj5 : null;
            FontFamily fontFamily = null;
            Object obj6 = list.get(6);
            String str = obj6 != null ? (String) obj6 : null;
            Object obj7 = list.get(7);
            TextUnit textUnitRestore2 = (Intrinsics.areEqual(obj7, bool) || obj7 == null) ? null : SaversKt.getSaver(companion2).restore(obj7);
            Intrinsics.checkNotNull(textUnitRestore2);
            long f18322a2 = textUnitRestore2.getF18322a();
            Object obj8 = list.get(8);
            BaselineShift baselineShiftRestore = (Intrinsics.areEqual(obj8, bool) || obj8 == null) ? null : SaversKt.getSaver(BaselineShift.INSTANCE).restore(obj8);
            Object obj9 = list.get(9);
            TextGeometricTransform textGeometricTransformRestore = (Intrinsics.areEqual(obj9, bool) || obj9 == null) ? null : SaversKt.getSaver(TextGeometricTransform.INSTANCE).restore(obj9);
            Object obj10 = list.get(10);
            LocaleList localeListRestore = (Intrinsics.areEqual(obj10, bool) || obj10 == null) ? null : SaversKt.getSaver(LocaleList.INSTANCE).restore(obj10);
            Object obj11 = list.get(11);
            Color colorRestore2 = (Intrinsics.areEqual(obj11, bool) || obj11 == null) ? null : SaversKt.getSaver(companion).restore(obj11);
            Intrinsics.checkNotNull(colorRestore2);
            long jM2518unboximpl2 = colorRestore2.m2518unboximpl();
            Object obj12 = list.get(12);
            TextDecoration textDecorationRestore = (Intrinsics.areEqual(obj12, bool) || obj12 == null) ? null : SaversKt.getSaver(TextDecoration.INSTANCE).restore(obj12);
            Object obj13 = list.get(13);
            return new SpanStyle(jM2518unboximpl, f18322a, fontWeightRestore, fontStyle, fontSynthesis, fontFamily, str, f18322a2, baselineShiftRestore, textGeometricTransformRestore, localeListRestore, jM2518unboximpl2, textDecorationRestore, (Intrinsics.areEqual(obj13, bool) || obj13 == null) ? null : SaversKt.getSaver(Shadow.INSTANCE).restore(obj13), (PlatformSpanStyle) null, (DrawStyle) null, 49184, (DefaultConstructorMarker) null);
        }
    }

    /* JADX INFO: compiled from: Savers.kt */
    public static final class w extends Lambda implements Function2<SaverScope, TextDecoration, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final w f17720p0 = new w(2);

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(SaverScope saverScope, TextDecoration textDecoration) {
            SaverScope Saver = saverScope;
            TextDecoration it = textDecoration;
            Intrinsics.checkNotNullParameter(Saver, "$this$Saver");
            Intrinsics.checkNotNullParameter(it, "it");
            return Integer.valueOf(it.getMask());
        }
    }

    /* JADX INFO: compiled from: Savers.kt */
    public static final class x extends Lambda implements Function1<Object, TextDecoration> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final x f17721p0 = new x(1);

        @Override // kotlin.jvm.functions.Function1
        public final TextDecoration invoke(Object it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return new TextDecoration(((Integer) it).intValue());
        }
    }

    /* JADX INFO: compiled from: Savers.kt */
    public static final class y extends Lambda implements Function2<SaverScope, TextGeometricTransform, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final y f17722p0 = new y(2);

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(SaverScope saverScope, TextGeometricTransform textGeometricTransform) {
            SaverScope Saver = saverScope;
            TextGeometricTransform it = textGeometricTransform;
            Intrinsics.checkNotNullParameter(Saver, "$this$Saver");
            Intrinsics.checkNotNullParameter(it, "it");
            return CollectionsKt__CollectionsKt.arrayListOf(Float.valueOf(it.getScaleX()), Float.valueOf(it.getSkewX()));
        }
    }

    /* JADX INFO: compiled from: Savers.kt */
    public static final class z extends Lambda implements Function1<Object, TextGeometricTransform> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final z f17723p0 = new z(1);

        @Override // kotlin.jvm.functions.Function1
        public final TextGeometricTransform invoke(Object it) {
            Intrinsics.checkNotNullParameter(it, "it");
            List list = (List) it;
            return new TextGeometricTransform(((Number) list.get(0)).floatValue(), ((Number) list.get(1)).floatValue());
        }
    }

    @NotNull
    public static final Saver<AnnotatedString, Object> getAnnotatedStringSaver() {
        return f17668a;
    }

    @NotNull
    public static final Saver<ParagraphStyle, Object> getParagraphStyleSaver() {
        return f17673f;
    }

    @NotNull
    public static final Saver<TextDecoration, Object> getSaver(@NotNull TextDecoration.Companion companion) {
        Intrinsics.checkNotNullParameter(companion, "<this>");
        return f17675h;
    }

    @NotNull
    public static final Saver<SpanStyle, Object> getSpanStyleSaver() {
        return f17674g;
    }

    public static final /* synthetic */ <T extends Saver<Original, Saveable>, Original, Saveable, Result> Result restore(Saveable saveable, T saver) {
        Intrinsics.checkNotNullParameter(saver, "saver");
        if (Intrinsics.areEqual(saveable, Boolean.FALSE) || saveable == null) {
            return null;
        }
        Result result = (Result) saver.restore(saveable);
        Intrinsics.reifiedOperationMarker(1, "Result");
        return result;
    }

    @Nullable
    public static final <T> T save(@Nullable T t10) {
        return t10;
    }

    @NotNull
    public static final Saver<TextGeometricTransform, Object> getSaver(@NotNull TextGeometricTransform.Companion companion) {
        Intrinsics.checkNotNullParameter(companion, "<this>");
        return f17676i;
    }

    @NotNull
    public static final <T extends Saver<Original, Saveable>, Original, Saveable> Object save(@Nullable Original original, @NotNull T saver, @NotNull SaverScope scope) {
        Object objSave;
        Intrinsics.checkNotNullParameter(saver, "saver");
        Intrinsics.checkNotNullParameter(scope, "scope");
        return (original == null || (objSave = saver.save(scope, original)) == null) ? Boolean.FALSE : objSave;
    }

    @NotNull
    public static final Saver<TextIndent, Object> getSaver(@NotNull TextIndent.Companion companion) {
        Intrinsics.checkNotNullParameter(companion, "<this>");
        return f17677j;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ <Result> Result restore(Object obj) {
        if (obj == 0) {
            return null;
        }
        Intrinsics.reifiedOperationMarker(1, "Result");
        return obj;
    }

    @NotNull
    public static final Saver<FontWeight, Object> getSaver(@NotNull FontWeight.Companion companion) {
        Intrinsics.checkNotNullParameter(companion, "<this>");
        return f17678k;
    }

    @NotNull
    public static final Saver<BaselineShift, Object> getSaver(@NotNull BaselineShift.Companion companion) {
        Intrinsics.checkNotNullParameter(companion, "<this>");
        return f17679l;
    }

    @NotNull
    public static final Saver<TextRange, Object> getSaver(@NotNull TextRange.Companion companion) {
        Intrinsics.checkNotNullParameter(companion, "<this>");
        return m;
    }

    @NotNull
    public static final Saver<Shadow, Object> getSaver(@NotNull Shadow.Companion companion) {
        Intrinsics.checkNotNullParameter(companion, "<this>");
        return f17680n;
    }

    @NotNull
    public static final Saver<Color, Object> getSaver(@NotNull Color.Companion companion) {
        Intrinsics.checkNotNullParameter(companion, "<this>");
        return f17681o;
    }

    @NotNull
    public static final Saver<TextUnit, Object> getSaver(@NotNull TextUnit.Companion companion) {
        Intrinsics.checkNotNullParameter(companion, "<this>");
        return f17682p;
    }

    @NotNull
    public static final Saver<Offset, Object> getSaver(@NotNull Offset.Companion companion) {
        Intrinsics.checkNotNullParameter(companion, "<this>");
        return f17683q;
    }

    @NotNull
    public static final Saver<LocaleList, Object> getSaver(@NotNull LocaleList.Companion companion) {
        Intrinsics.checkNotNullParameter(companion, "<this>");
        return f17684r;
    }

    @NotNull
    public static final Saver<Locale, Object> getSaver(@NotNull Locale.Companion companion) {
        Intrinsics.checkNotNullParameter(companion, "<this>");
        return f17685s;
    }
}
