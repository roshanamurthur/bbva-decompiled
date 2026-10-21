package androidx.compose.ui.text;

import androidx.collection.g;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.exifinterface.media.ExifInterface;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.bbva.glomohybrid.logs.LogKeysKt;
import com.bbva.securesharing.plugin.SecureSharingCommandFactory;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: AnnotatedString.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\b\u001a \u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u00040\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000\u001ad\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012>\b\u0004\u0010\f\u001a8\u0012\u0013\u0012\u00110\u0000¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u00010\u0004¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00028\u00000\u0007H\u0080\bø\u0001\u0000\u001a\u0014\u0010\u0010\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u001a\u0014\u0010\u0011\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u001a\u0014\u0010\u0012\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u001a\u0014\u0010\u0013\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u001aB\u0010\u001b\u001a\u00028\u0000\"\b\b\u0000\u0010\u0015*\u00020\u0014*\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u00172\u0017\u0010\f\u001a\u0013\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00028\u00000\u0019¢\u0006\u0002\b\u001aH\u0086\bø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001c\u001aD\u0010\u001b\u001a\u00028\u0000\"\b\b\u0000\u0010\u0015*\u00020\u0014*\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u00012\u0019\b\u0004\u0010\f\u001a\u0013\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00028\u00000\u0019¢\u0006\u0002\b\u001aH\u0086\bø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001d\u001aL\u0010!\u001a\u00028\u0000\"\b\b\u0000\u0010\u0015*\u00020\u0014*\u00020\u00162\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u001e2\u0019\b\u0004\u0010\f\u001a\u0013\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00028\u00000\u0019¢\u0006\u0002\b\u001aH\u0087\bø\u0001\u0000¢\u0006\u0004\b!\u0010\"\u001aD\u0010!\u001a\u00028\u0000\"\b\b\u0000\u0010\u0015*\u00020\u0014*\u00020\u00162\u0006\u0010$\u001a\u00020#2\u0019\b\u0004\u0010\f\u001a\u0013\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00028\u00000\u0019¢\u0006\u0002\b\u001aH\u0087\bø\u0001\u0000¢\u0006\u0004\b!\u0010%\u001aD\u0010!\u001a\u00028\u0000\"\b\b\u0000\u0010\u0015*\u00020\u0014*\u00020\u00162\u0006\u0010'\u001a\u00020&2\u0019\b\u0004\u0010\f\u001a\u0013\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00028\u00000\u0019¢\u0006\u0002\b\u001aH\u0087\bø\u0001\u0000¢\u0006\u0004\b!\u0010(\u001a\"\u0010+\u001a\u00020\u00002\u0006\u0010)\u001a\u00020\u001e2\u0006\u0010*\u001a\u00020\u00172\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0001\u001a\u0016\u0010+\u001a\u00020\u00002\u0006\u0010)\u001a\u00020\u001e2\u0006\u0010\u000b\u001a\u00020\u0001\u001a%\u0010.\u001a\u00020\u00002\u0017\u0010-\u001a\u0013\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020,0\u0019¢\u0006\u0002\b\u001aH\u0086\bø\u0001\u0000\u001a(\u00105\u001a\u0002042\u0006\u00100\u001a\u00020/2\u0006\u00101\u001a\u00020/2\u0006\u00102\u001a\u00020/2\u0006\u00103\u001a\u00020/H\u0000\u001a(\u0010:\u001a\u0002042\u0006\u00106\u001a\u00020/2\u0006\u00107\u001a\u00020/2\u0006\u00108\u001a\u00020/2\u0006\u00109\u001a\u00020/H\u0000\u001a\b\u0010;\u001a\u00020\u0000H\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006<"}, d2 = {"Landroidx/compose/ui/text/AnnotatedString;", "Landroidx/compose/ui/text/ParagraphStyle;", "defaultParagraphStyle", "", "Landroidx/compose/ui/text/AnnotatedString$Range;", "normalizedParagraphStyles", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "annotatedString", "paragraphStyle", "block", "mapEachParagraphStyle", "Landroidx/compose/ui/text/intl/LocaleList;", "localeList", "toUpperCase", "toLowerCase", "capitalize", "decapitalize", "", "R", "Landroidx/compose/ui/text/AnnotatedString$Builder;", "Landroidx/compose/ui/text/SpanStyle;", "style", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "withStyle", "(Landroidx/compose/ui/text/AnnotatedString$Builder;Landroidx/compose/ui/text/SpanStyle;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "(Landroidx/compose/ui/text/AnnotatedString$Builder;Landroidx/compose/ui/text/ParagraphStyle;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "", LogKeysKt.TAG, "annotation", "withAnnotation", "(Landroidx/compose/ui/text/AnnotatedString$Builder;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "Landroidx/compose/ui/text/TtsAnnotation;", "ttsAnnotation", "(Landroidx/compose/ui/text/AnnotatedString$Builder;Landroidx/compose/ui/text/TtsAnnotation;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "Landroidx/compose/ui/text/UrlAnnotation;", "urlAnnotation", "(Landroidx/compose/ui/text/AnnotatedString$Builder;Landroidx/compose/ui/text/UrlAnnotation;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "text", "spanStyle", "AnnotatedString", "", "builder", "buildAnnotatedString", "", "baseStart", "baseEnd", "targetStart", "targetEnd", "", SecureSharingCommandFactory.ACTION_CONTAINS_VALUE, "lStart", "lEnd", "rStart", "rEnd", "intersect", "emptyAnnotatedString", "ui-text_release"}, k = 2, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nAnnotatedString.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnnotatedString.kt\nandroidx/compose/ui/text/AnnotatedStringKt\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 TempListUtils.kt\nandroidx/compose/ui/text/TempListUtilsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1126:1\n33#2,6:1127\n33#2,4:1136\n38#2:1142\n151#2,3:1144\n33#2,4:1147\n154#2,2:1151\n38#2:1153\n156#2:1154\n33#2,4:1158\n38#2:1164\n151#2,3:1166\n33#2,4:1169\n154#2,2:1173\n38#2:1175\n156#2:1176\n33#2,4:1180\n38#2:1186\n151#2,3:1188\n33#2,4:1191\n154#2,2:1195\n38#2:1197\n156#2:1198\n151#2,3:1199\n33#2,4:1202\n154#2,2:1206\n38#2:1208\n156#2:1209\n33#2,4:1214\n38#2:1220\n151#2,5:1222\n38#2:1227\n156#2:1228\n35#3,3:1133\n38#3,2:1140\n40#3:1143\n35#3,3:1155\n38#3,2:1162\n40#3:1165\n35#3,3:1177\n38#3,2:1184\n40#3:1187\n35#3,3:1211\n38#3,2:1218\n40#3:1221\n1#4:1210\n*S KotlinDebug\n*F\n+ 1 AnnotatedString.kt\nandroidx/compose/ui/text/AnnotatedStringKt\n*L\n676#1:1127,6\n712#1:1136,4\n712#1:1142\n713#1:1144,3\n713#1:1147,4\n713#1:1151,2\n713#1:1153\n713#1:1154\n739#1:1158,4\n739#1:1164\n740#1:1166,3\n740#1:1169,4\n740#1:1173,2\n740#1:1175\n740#1:1176\n766#1:1180,4\n766#1:1186\n767#1:1188,3\n767#1:1191,4\n767#1:1195,2\n767#1:1197\n767#1:1198\n803#1:1199,3\n803#1:1202,4\n803#1:1206,2\n803#1:1208\n803#1:1209\n1049#1:1214,4\n1049#1:1220\n1049#1:1222,5\n1049#1:1227\n1049#1:1228\n712#1:1133,3\n712#1:1140,2\n712#1:1143\n739#1:1155,3\n739#1:1162,2\n739#1:1165\n766#1:1177,3\n766#1:1184,2\n766#1:1187\n1049#1:1211,3\n1049#1:1218,2\n1049#1:1221\n*E\n"})
public final class AnnotatedStringKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final AnnotatedString f17597a = new AnnotatedString("", null, null, 6, null);

    /* JADX INFO: compiled from: AnnotatedString.kt */
    public static final class a extends Lambda implements Function3<String, Integer, Integer, String> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ LocaleList f17598p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(LocaleList localeList) {
            super(3);
            this.f17598p0 = localeList;
        }

        @Override // kotlin.jvm.functions.Function3
        public final String invoke(String str, Integer num, Integer num2) {
            String str2 = str;
            int iIntValue = num.intValue();
            int iIntValue2 = num2.intValue();
            Intrinsics.checkNotNullParameter(str2, "str");
            if (iIntValue == 0) {
                String strSubstring = str2.substring(iIntValue, iIntValue2);
                Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                return StringKt.capitalize(strSubstring, this.f17598p0);
            }
            String strSubstring2 = str2.substring(iIntValue, iIntValue2);
            Intrinsics.checkNotNullExpressionValue(strSubstring2, "this as java.lang.String…ing(startIndex, endIndex)");
            return strSubstring2;
        }
    }

    /* JADX INFO: compiled from: AnnotatedString.kt */
    public static final class b extends Lambda implements Function3<String, Integer, Integer, String> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ LocaleList f17599p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(LocaleList localeList) {
            super(3);
            this.f17599p0 = localeList;
        }

        @Override // kotlin.jvm.functions.Function3
        public final String invoke(String str, Integer num, Integer num2) {
            String str2 = str;
            int iIntValue = num.intValue();
            int iIntValue2 = num2.intValue();
            Intrinsics.checkNotNullParameter(str2, "str");
            if (iIntValue == 0) {
                String strSubstring = str2.substring(iIntValue, iIntValue2);
                Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                return StringKt.decapitalize(strSubstring, this.f17599p0);
            }
            String strSubstring2 = str2.substring(iIntValue, iIntValue2);
            Intrinsics.checkNotNullExpressionValue(strSubstring2, "this as java.lang.String…ing(startIndex, endIndex)");
            return strSubstring2;
        }
    }

    /* JADX INFO: compiled from: AnnotatedString.kt */
    public static final class c extends Lambda implements Function3<String, Integer, Integer, String> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ LocaleList f17600p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(LocaleList localeList) {
            super(3);
            this.f17600p0 = localeList;
        }

        @Override // kotlin.jvm.functions.Function3
        public final String invoke(String str, Integer num, Integer num2) {
            String str2 = str;
            int iIntValue = num.intValue();
            int iIntValue2 = num2.intValue();
            Intrinsics.checkNotNullParameter(str2, "str");
            String strSubstring = str2.substring(iIntValue, iIntValue2);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            return StringKt.toLowerCase(strSubstring, this.f17600p0);
        }
    }

    /* JADX INFO: compiled from: AnnotatedString.kt */
    public static final class d extends Lambda implements Function3<String, Integer, Integer, String> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ LocaleList f17601p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(LocaleList localeList) {
            super(3);
            this.f17601p0 = localeList;
        }

        @Override // kotlin.jvm.functions.Function3
        public final String invoke(String str, Integer num, Integer num2) {
            String str2 = str;
            int iIntValue = num.intValue();
            int iIntValue2 = num2.intValue();
            Intrinsics.checkNotNullParameter(str2, "str");
            String strSubstring = str2.substring(iIntValue, iIntValue2);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            return StringKt.toUpperCase(strSubstring, this.f17601p0);
        }
    }

    @NotNull
    public static final AnnotatedString AnnotatedString(@NotNull String text, @NotNull SpanStyle spanStyle, @Nullable ParagraphStyle paragraphStyle) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(spanStyle, "spanStyle");
        return new AnnotatedString(text, bk.d.listOf(new AnnotatedString.Range(spanStyle, 0, text.length())), paragraphStyle == null ? CollectionsKt__CollectionsKt.emptyList() : bk.d.listOf(new AnnotatedString.Range(paragraphStyle, 0, text.length())));
    }

    public static /* synthetic */ AnnotatedString AnnotatedString$default(String str, SpanStyle spanStyle, ParagraphStyle paragraphStyle, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            paragraphStyle = null;
        }
        return AnnotatedString(str, spanStyle, paragraphStyle);
    }

    public static final List<AnnotatedString.Range<SpanStyle>> a(AnnotatedString annotatedString, int i10, int i11) {
        List<AnnotatedString.Range<SpanStyle>> spanStylesOrNull$ui_text_release;
        if (i10 == i11 || (spanStylesOrNull$ui_text_release = annotatedString.getSpanStylesOrNull$ui_text_release()) == null) {
            return null;
        }
        if (i10 == 0 && i11 >= annotatedString.getText().length()) {
            return spanStylesOrNull$ui_text_release;
        }
        ArrayList arrayList = new ArrayList(spanStylesOrNull$ui_text_release.size());
        int size = spanStylesOrNull$ui_text_release.size();
        for (int i12 = 0; i12 < size; i12++) {
            AnnotatedString.Range<SpanStyle> range = spanStylesOrNull$ui_text_release.get(i12);
            AnnotatedString.Range<SpanStyle> range2 = range;
            if (intersect(i10, i11, range2.getStart(), range2.getEnd())) {
                arrayList.add(range);
            }
        }
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size2 = arrayList.size();
        for (int i13 = 0; i13 < size2; i13++) {
            AnnotatedString.Range range3 = (AnnotatedString.Range) arrayList.get(i13);
            arrayList2.add(new AnnotatedString.Range(range3.getItem(), kotlin.ranges.c.coerceIn(range3.getStart(), i10, i11) - i10, kotlin.ranges.c.coerceIn(range3.getEnd(), i10, i11) - i10));
        }
        return arrayList2;
    }

    public static final List access$filterRanges(List list, int i10, int i11) {
        if (i10 > i11) {
            throw new IllegalArgumentException(g.b("start (", i10, ") should be less than or equal to end (", i11, RootService.CLOSE_BRACKET).toString());
        }
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i12 = 0; i12 < size; i12++) {
            Object obj = list.get(i12);
            AnnotatedString.Range range = (AnnotatedString.Range) obj;
            if (intersect(i10, i11, range.getStart(), range.getEnd())) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size2 = arrayList.size();
        for (int i13 = 0; i13 < size2; i13++) {
            AnnotatedString.Range range2 = (AnnotatedString.Range) arrayList.get(i13);
            arrayList2.add(new AnnotatedString.Range(range2.getItem(), Math.max(i10, range2.getStart()) - i10, Math.min(i11, range2.getEnd()) - i10, range2.getTag()));
        }
        if (arrayList2.isEmpty()) {
            return null;
        }
        return arrayList2;
    }

    public static final List access$getLocalAnnotations(AnnotatedString annotatedString, int i10, int i11) {
        List<AnnotatedString.Range<? extends Object>> annotations$ui_text_release;
        if (i10 == i11 || (annotations$ui_text_release = annotatedString.getAnnotations$ui_text_release()) == null) {
            return null;
        }
        if (i10 == 0 && i11 >= annotatedString.getText().length()) {
            return annotations$ui_text_release;
        }
        ArrayList arrayList = new ArrayList(annotations$ui_text_release.size());
        int size = annotations$ui_text_release.size();
        for (int i12 = 0; i12 < size; i12++) {
            AnnotatedString.Range<? extends Object> range = annotations$ui_text_release.get(i12);
            AnnotatedString.Range<? extends Object> range2 = range;
            if (intersect(i10, i11, range2.getStart(), range2.getEnd())) {
                arrayList.add(range);
            }
        }
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size2 = arrayList.size();
        for (int i13 = 0; i13 < size2; i13++) {
            AnnotatedString.Range range3 = (AnnotatedString.Range) arrayList.get(i13);
            arrayList2.add(new AnnotatedString.Range(range3.getItem(), kotlin.ranges.c.coerceIn(range3.getStart(), i10, i11) - i10, kotlin.ranges.c.coerceIn(range3.getEnd(), i10, i11) - i10, range3.getTag()));
        }
        return arrayList2;
    }

    public static final List access$getLocalParagraphStyles(AnnotatedString annotatedString, int i10, int i11) {
        List<AnnotatedString.Range<ParagraphStyle>> paragraphStylesOrNull$ui_text_release;
        if (i10 == i11 || (paragraphStylesOrNull$ui_text_release = annotatedString.getParagraphStylesOrNull$ui_text_release()) == null) {
            return null;
        }
        if (i10 == 0 && i11 >= annotatedString.getText().length()) {
            return paragraphStylesOrNull$ui_text_release;
        }
        ArrayList arrayList = new ArrayList(paragraphStylesOrNull$ui_text_release.size());
        int size = paragraphStylesOrNull$ui_text_release.size();
        for (int i12 = 0; i12 < size; i12++) {
            AnnotatedString.Range<ParagraphStyle> range = paragraphStylesOrNull$ui_text_release.get(i12);
            AnnotatedString.Range<ParagraphStyle> range2 = range;
            if (intersect(i10, i11, range2.getStart(), range2.getEnd())) {
                arrayList.add(range);
            }
        }
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size2 = arrayList.size();
        for (int i13 = 0; i13 < size2; i13++) {
            AnnotatedString.Range range3 = (AnnotatedString.Range) arrayList.get(i13);
            arrayList2.add(new AnnotatedString.Range(range3.getItem(), kotlin.ranges.c.coerceIn(range3.getStart(), i10, i11) - i10, kotlin.ranges.c.coerceIn(range3.getEnd(), i10, i11) - i10));
        }
        return arrayList2;
    }

    public static final AnnotatedString access$substringWithoutParagraphStyles(AnnotatedString annotatedString, int i10, int i11) {
        String strSubstring;
        if (i10 != i11) {
            strSubstring = annotatedString.getText().substring(i10, i11);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        } else {
            strSubstring = "";
        }
        return new AnnotatedString(strSubstring, a(annotatedString, i10, i11), null, null, 12, null);
    }

    @NotNull
    public static final AnnotatedString buildAnnotatedString(@NotNull Function1<? super AnnotatedString.Builder, Unit> builder) {
        Intrinsics.checkNotNullParameter(builder, "builder");
        AnnotatedString.Builder builder2 = new AnnotatedString.Builder(0, 1, null);
        builder.invoke(builder2);
        return builder2.toAnnotatedString();
    }

    @NotNull
    public static final AnnotatedString capitalize(@NotNull AnnotatedString annotatedString, @NotNull LocaleList localeList) {
        Intrinsics.checkNotNullParameter(annotatedString, "<this>");
        Intrinsics.checkNotNullParameter(localeList, "localeList");
        return JvmAnnotatedString_jvmKt.transform(annotatedString, new a(localeList));
    }

    public static /* synthetic */ AnnotatedString capitalize$default(AnnotatedString annotatedString, LocaleList localeList, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            localeList = LocaleList.INSTANCE.getCurrent();
        }
        return capitalize(annotatedString, localeList);
    }

    public static final boolean contains(int i10, int i11, int i12, int i13) {
        if (i10 > i12 || i13 > i11) {
            return false;
        }
        if (i11 == i13) {
            if ((i12 == i13) != (i10 == i11)) {
                return false;
            }
        }
        return true;
    }

    @NotNull
    public static final AnnotatedString decapitalize(@NotNull AnnotatedString annotatedString, @NotNull LocaleList localeList) {
        Intrinsics.checkNotNullParameter(annotatedString, "<this>");
        Intrinsics.checkNotNullParameter(localeList, "localeList");
        return JvmAnnotatedString_jvmKt.transform(annotatedString, new b(localeList));
    }

    public static /* synthetic */ AnnotatedString decapitalize$default(AnnotatedString annotatedString, LocaleList localeList, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            localeList = LocaleList.INSTANCE.getCurrent();
        }
        return decapitalize(annotatedString, localeList);
    }

    @NotNull
    public static final AnnotatedString emptyAnnotatedString() {
        return f17597a;
    }

    public static final boolean intersect(int i10, int i11, int i12, int i13) {
        return Math.max(i10, i12) < Math.min(i11, i13) || contains(i10, i11, i12, i13) || contains(i12, i13, i10, i11);
    }

    @NotNull
    public static final <T> List<T> mapEachParagraphStyle(@NotNull AnnotatedString annotatedString, @NotNull ParagraphStyle defaultParagraphStyle, @NotNull Function2<? super AnnotatedString, ? super AnnotatedString.Range<ParagraphStyle>, ? extends T> block) {
        Intrinsics.checkNotNullParameter(annotatedString, "<this>");
        Intrinsics.checkNotNullParameter(defaultParagraphStyle, "defaultParagraphStyle");
        Intrinsics.checkNotNullParameter(block, "block");
        List<AnnotatedString.Range<ParagraphStyle>> listNormalizedParagraphStyles = normalizedParagraphStyles(annotatedString, defaultParagraphStyle);
        ArrayList arrayList = new ArrayList(listNormalizedParagraphStyles.size());
        int size = listNormalizedParagraphStyles.size();
        for (int i10 = 0; i10 < size; i10++) {
            AnnotatedString.Range<ParagraphStyle> range = listNormalizedParagraphStyles.get(i10);
            arrayList.add(block.invoke(access$substringWithoutParagraphStyles(annotatedString, range.getStart(), range.getEnd()), range));
        }
        return arrayList;
    }

    @NotNull
    public static final List<AnnotatedString.Range<ParagraphStyle>> normalizedParagraphStyles(@NotNull AnnotatedString annotatedString, @NotNull ParagraphStyle defaultParagraphStyle) {
        Intrinsics.checkNotNullParameter(annotatedString, "<this>");
        Intrinsics.checkNotNullParameter(defaultParagraphStyle, "defaultParagraphStyle");
        int length = annotatedString.getText().length();
        List<AnnotatedString.Range<ParagraphStyle>> paragraphStylesOrNull$ui_text_release = annotatedString.getParagraphStylesOrNull$ui_text_release();
        if (paragraphStylesOrNull$ui_text_release == null) {
            paragraphStylesOrNull$ui_text_release = CollectionsKt__CollectionsKt.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        int size = paragraphStylesOrNull$ui_text_release.size();
        int i10 = 0;
        int i11 = 0;
        while (i10 < size) {
            AnnotatedString.Range<ParagraphStyle> range = paragraphStylesOrNull$ui_text_release.get(i10);
            ParagraphStyle paragraphStyleComponent1 = range.component1();
            int start = range.getStart();
            int end = range.getEnd();
            if (start != i11) {
                arrayList.add(new AnnotatedString.Range(defaultParagraphStyle, i11, start));
            }
            arrayList.add(new AnnotatedString.Range(defaultParagraphStyle.merge(paragraphStyleComponent1), start, end));
            i10++;
            i11 = end;
        }
        if (i11 != length) {
            arrayList.add(new AnnotatedString.Range(defaultParagraphStyle, i11, length));
        }
        if (arrayList.isEmpty()) {
            arrayList.add(new AnnotatedString.Range(defaultParagraphStyle, 0, 0));
        }
        return arrayList;
    }

    @NotNull
    public static final AnnotatedString toLowerCase(@NotNull AnnotatedString annotatedString, @NotNull LocaleList localeList) {
        Intrinsics.checkNotNullParameter(annotatedString, "<this>");
        Intrinsics.checkNotNullParameter(localeList, "localeList");
        return JvmAnnotatedString_jvmKt.transform(annotatedString, new c(localeList));
    }

    public static /* synthetic */ AnnotatedString toLowerCase$default(AnnotatedString annotatedString, LocaleList localeList, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            localeList = LocaleList.INSTANCE.getCurrent();
        }
        return toLowerCase(annotatedString, localeList);
    }

    @NotNull
    public static final AnnotatedString toUpperCase(@NotNull AnnotatedString annotatedString, @NotNull LocaleList localeList) {
        Intrinsics.checkNotNullParameter(annotatedString, "<this>");
        Intrinsics.checkNotNullParameter(localeList, "localeList");
        return JvmAnnotatedString_jvmKt.transform(annotatedString, new d(localeList));
    }

    public static /* synthetic */ AnnotatedString toUpperCase$default(AnnotatedString annotatedString, LocaleList localeList, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            localeList = LocaleList.INSTANCE.getCurrent();
        }
        return toUpperCase(annotatedString, localeList);
    }

    @ExperimentalTextApi
    @NotNull
    public static final <R> R withAnnotation(@NotNull AnnotatedString.Builder builder, @NotNull String tag, @NotNull String annotation, @NotNull Function1<? super AnnotatedString.Builder, ? extends R> block) {
        Intrinsics.checkNotNullParameter(builder, "<this>");
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(annotation, "annotation");
        Intrinsics.checkNotNullParameter(block, "block");
        int iPushStringAnnotation = builder.pushStringAnnotation(tag, annotation);
        try {
            return block.invoke(builder);
        } finally {
            InlineMarker.finallyStart(1);
            builder.pop(iPushStringAnnotation);
            InlineMarker.finallyEnd(1);
        }
    }

    @NotNull
    public static final <R> R withStyle(@NotNull AnnotatedString.Builder builder, @NotNull SpanStyle style, @NotNull Function1<? super AnnotatedString.Builder, ? extends R> block) {
        Intrinsics.checkNotNullParameter(builder, "<this>");
        Intrinsics.checkNotNullParameter(style, "style");
        Intrinsics.checkNotNullParameter(block, "block");
        int iPushStyle = builder.pushStyle(style);
        try {
            return block.invoke(builder);
        } finally {
            InlineMarker.finallyStart(1);
            builder.pop(iPushStyle);
            InlineMarker.finallyEnd(1);
        }
    }

    @ExperimentalTextApi
    @NotNull
    public static final <R> R withAnnotation(@NotNull AnnotatedString.Builder builder, @NotNull TtsAnnotation ttsAnnotation, @NotNull Function1<? super AnnotatedString.Builder, ? extends R> block) {
        Intrinsics.checkNotNullParameter(builder, "<this>");
        Intrinsics.checkNotNullParameter(ttsAnnotation, "ttsAnnotation");
        Intrinsics.checkNotNullParameter(block, "block");
        int iPushTtsAnnotation = builder.pushTtsAnnotation(ttsAnnotation);
        try {
            return block.invoke(builder);
        } finally {
            InlineMarker.finallyStart(1);
            builder.pop(iPushTtsAnnotation);
            InlineMarker.finallyEnd(1);
        }
    }

    @NotNull
    public static final <R> R withStyle(@NotNull AnnotatedString.Builder builder, @NotNull ParagraphStyle style, @NotNull Function1<? super AnnotatedString.Builder, ? extends R> block) {
        Intrinsics.checkNotNullParameter(builder, "<this>");
        Intrinsics.checkNotNullParameter(style, "style");
        Intrinsics.checkNotNullParameter(block, "block");
        int iPushStyle = builder.pushStyle(style);
        try {
            return block.invoke(builder);
        } finally {
            InlineMarker.finallyStart(1);
            builder.pop(iPushStyle);
            InlineMarker.finallyEnd(1);
        }
    }

    @NotNull
    public static final AnnotatedString AnnotatedString(@NotNull String text, @NotNull ParagraphStyle paragraphStyle) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(paragraphStyle, "paragraphStyle");
        return new AnnotatedString(text, CollectionsKt__CollectionsKt.emptyList(), bk.d.listOf(new AnnotatedString.Range(paragraphStyle, 0, text.length())));
    }

    @ExperimentalTextApi
    @NotNull
    public static final <R> R withAnnotation(@NotNull AnnotatedString.Builder builder, @NotNull UrlAnnotation urlAnnotation, @NotNull Function1<? super AnnotatedString.Builder, ? extends R> block) {
        Intrinsics.checkNotNullParameter(builder, "<this>");
        Intrinsics.checkNotNullParameter(urlAnnotation, "urlAnnotation");
        Intrinsics.checkNotNullParameter(block, "block");
        int iPushUrlAnnotation = builder.pushUrlAnnotation(urlAnnotation);
        try {
            return block.invoke(builder);
        } finally {
            InlineMarker.finallyStart(1);
            builder.pop(iPushUrlAnnotation);
            InlineMarker.finallyEnd(1);
        }
    }
}
