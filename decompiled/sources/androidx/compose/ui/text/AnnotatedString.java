package androidx.compose.ui.text;

import androidx.collection.g;
import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.exifinterface.media.ExifInterface;
import com.adobe.marketing.mobile.EventDataKeys;
import com.bbva.cellscore.web.constant.NavigationOperations;
import com.bbva.component.dm.analytics.constants.AnalyticsConstants;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.glomohybrid.logs.LogKeysKt;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.mypinpad.tsdk.isolation.y2;
import dk.e;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: AnnotatedString.kt */
/* JADX INFO: loaded from: classes.dex */
@Immutable
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\f\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0007\u0018\u00002\u00020\u0001:\u0002<=B[\b\u0000\u0012\u0006\u0010$\u001a\u00020\u000f\u0012\u0016\b\u0002\u0010*\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020%0\u0014\u0018\u00010\u0013\u0012\u0016\b\u0002\u0010.\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020+0\u0014\u0018\u00010\u0013\u0012\u0018\b\u0002\u00101\u001a\u0012\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u001c0\u0014\u0018\u00010\u0013¢\u0006\u0004\b9\u0010:B=\b\u0016\u0012\u0006\u0010$\u001a\u00020\u000f\u0012\u0014\b\u0002\u00103\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020%0\u00140\u0013\u0012\u0014\b\u0002\u00105\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020+0\u00140\u0013¢\u0006\u0004\b9\u0010;J\u0011\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0096\u0002J\u0018\u0010\b\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016J\u001b\u0010\b\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\tø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0011\u0010\u000e\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u0000H\u0087\u0002J*\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u00140\u00132\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0002J\u001e\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0002J\"\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u00140\u00132\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0002J\"\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u00140\u00132\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0002J$\u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\u00140\u00132\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0002H\u0007J\u0013\u0010\u001d\u001a\u00020\u00162\b\u0010\r\u001a\u0004\u0018\u00010\u001cH\u0096\u0002J\b\u0010\u001e\u001a\u00020\u0002H\u0016J\b\u0010\u001f\u001a\u00020\u000fH\u0016R\u0017\u0010$\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R(\u0010*\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020%0\u0014\u0018\u00010\u00138\u0000X\u0080\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R(\u0010.\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020+0\u0014\u0018\u00010\u00138\u0000X\u0080\u0004¢\u0006\f\n\u0004\b,\u0010'\u001a\u0004\b-\u0010)R*\u00101\u001a\u0012\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u001c0\u0014\u0018\u00010\u00138\u0000X\u0080\u0004¢\u0006\f\n\u0004\b/\u0010'\u001a\u0004\b0\u0010)R\u001d\u00103\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020%0\u00140\u00138F¢\u0006\u0006\u001a\u0004\b2\u0010)R\u001d\u00105\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020+0\u00140\u00138F¢\u0006\u0006\u001a\u0004\b4\u0010)R\u0014\u00108\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b6\u00107\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006>"}, d2 = {"Landroidx/compose/ui/text/AnnotatedString;", "", "", FirebaseAnalytics.Param.INDEX, "", "get", "startIndex", "endIndex", "subSequence", "Landroidx/compose/ui/text/TextRange;", "range", "subSequence-5zc-tL8", "(J)Landroidx/compose/ui/text/AnnotatedString;", "other", "plus", "", LogKeysKt.TAG, EventDataKeys.Lifecycle.LIFECYCLE_START, "end", "", "Landroidx/compose/ui/text/AnnotatedString$Range;", "getStringAnnotations", "", "hasStringAnnotations", "Landroidx/compose/ui/text/TtsAnnotation;", "getTtsAnnotations", "Landroidx/compose/ui/text/UrlAnnotation;", "getUrlAnnotations", "", "equals", GenerateActivationFormCommand.HASH_CODE, "toString", "p0", "Ljava/lang/String;", "getText", "()Ljava/lang/String;", "text", "Landroidx/compose/ui/text/SpanStyle;", "q0", "Ljava/util/List;", "getSpanStylesOrNull$ui_text_release", "()Ljava/util/List;", "spanStylesOrNull", "Landroidx/compose/ui/text/ParagraphStyle;", "r0", "getParagraphStylesOrNull$ui_text_release", "paragraphStylesOrNull", "s0", "getAnnotations$ui_text_release", "annotations", "getSpanStyles", "spanStyles", "getParagraphStyles", "paragraphStyles", "getLength", "()I", "length", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "(Ljava/lang/String;Ljava/util/List;Ljava/util/List;)V", "Builder", "Range", "ui-text_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nAnnotatedString.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnnotatedString.kt\nandroidx/compose/ui/text/AnnotatedString\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 TempListUtils.kt\nandroidx/compose/ui/text/TempListUtilsKt\n*L\n1#1,1126:1\n1045#2:1127\n33#3,6:1128\n33#3,4:1138\n38#3:1144\n101#3,2:1146\n33#3,6:1148\n103#3:1154\n33#3,4:1158\n38#3:1164\n33#3,4:1169\n38#3:1175\n33#3,4:1180\n38#3:1186\n1#4:1134\n35#5,3:1135\n38#5,2:1142\n40#5:1145\n35#5,3:1155\n38#5,2:1162\n40#5:1165\n35#5,3:1166\n38#5,2:1173\n40#5:1176\n35#5,3:1177\n38#5,2:1184\n40#5:1187\n*S KotlinDebug\n*F\n+ 1 AnnotatedString.kt\nandroidx/compose/ui/text/AnnotatedString\n*L\n86#1:1127\n86#1:1128,6\n159#1:1138,4\n159#1:1144\n167#1:1146,2\n167#1:1148,6\n167#1:1154\n182#1:1158,4\n182#1:1164\n197#1:1169,4\n197#1:1175\n213#1:1180,4\n213#1:1186\n159#1:1135,3\n159#1:1142,2\n159#1:1145\n182#1:1155,3\n182#1:1162,2\n182#1:1165\n197#1:1166,3\n197#1:1173,2\n197#1:1176\n213#1:1177,3\n213#1:1184,2\n213#1:1187\n*E\n"})
public final class AnnotatedString implements CharSequence {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String text;

    /* JADX INFO: renamed from: q0, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final List<Range<SpanStyle>> spanStylesOrNull;

    /* JADX INFO: renamed from: r0, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final List<Range<ParagraphStyle>> paragraphStylesOrNull;

    /* JADX INFO: renamed from: s0, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final List<Range<? extends Object>> annotations;

    /* JADX INFO: compiled from: AnnotatedString.kt */
    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\f\n\u0002\b\u0003\n\u0002\u0010\r\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0007\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0001,B\u0011\u0012\b\b\u0002\u0010'\u001a\u00020\f¢\u0006\u0004\b(\u0010)B\u0011\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b(\u0010*B\u0011\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u000f¢\u0006\u0004\b(\u0010+J\u000e\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003J\u0017\u0010\n\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\u0006\u0010\tJ\u0012\u0010\u0006\u001a\u00020\u00002\b\u0010\u0004\u001a\u0004\u0018\u00010\u000bH\u0016J\"\u0010\u0006\u001a\u00020\u00002\b\u0010\u0004\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\fH\u0016J\u0010\u0010\u0006\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0007H\u0016J\u000e\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u000fJ\u001e\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\fJ\u001e\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\fJ\u001e\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u00132\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\fJ&\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\fJ \u0010\u0019\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\fH\u0007J \u0010\u001c\u001a\u00020\u00052\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\fH\u0007J\u000e\u0010\u001d\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u0010J\u000e\u0010\u001d\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u0013J\u0016\u0010\u001e\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u0003J\u000e\u0010\u001f\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u0017J\u0010\u0010 \u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\u001aH\u0007J\u0006\u0010!\u001a\u00020\u0005J\u000e\u0010!\u001a\u00020\u00052\u0006\u0010\"\u001a\u00020\fJ\u0006\u0010#\u001a\u00020\u000fR\u0011\u0010&\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b$\u0010%¨\u0006-"}, d2 = {"Landroidx/compose/ui/text/AnnotatedString$Builder;", "Ljava/lang/Appendable;", "Lkotlin/text/Appendable;", "", "text", "", "append", "", "char", "(C)V", "deprecated_append_returning_void", "", "", EventDataKeys.Lifecycle.LIFECYCLE_START, "end", "Landroidx/compose/ui/text/AnnotatedString;", "Landroidx/compose/ui/text/SpanStyle;", "style", "addStyle", "Landroidx/compose/ui/text/ParagraphStyle;", LogKeysKt.TAG, "annotation", "addStringAnnotation", "Landroidx/compose/ui/text/TtsAnnotation;", "ttsAnnotation", "addTtsAnnotation", "Landroidx/compose/ui/text/UrlAnnotation;", "urlAnnotation", "addUrlAnnotation", "pushStyle", "pushStringAnnotation", "pushTtsAnnotation", "pushUrlAnnotation", NavigationOperations.POP, FirebaseAnalytics.Param.INDEX, "toAnnotatedString", "getLength", "()I", "length", "capacity", "<init>", "(I)V", "(Ljava/lang/String;)V", "(Landroidx/compose/ui/text/AnnotatedString;)V", "a", "ui-text_release"}, k = 1, mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nAnnotatedString.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnnotatedString.kt\nandroidx/compose/ui/text/AnnotatedString$Builder\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1126:1\n33#2,6:1127\n33#2,6:1133\n33#2,6:1139\n33#2,6:1145\n33#2,6:1151\n33#2,6:1157\n151#2,3:1164\n33#2,4:1167\n154#2,2:1171\n38#2:1173\n156#2:1174\n151#2,3:1175\n33#2,4:1178\n154#2,2:1182\n38#2:1184\n156#2:1185\n151#2,3:1186\n33#2,4:1189\n154#2,2:1193\n38#2:1195\n156#2:1196\n1#3:1163\n*S KotlinDebug\n*F\n+ 1 AnnotatedString.kt\nandroidx/compose/ui/text/AnnotatedString$Builder\n*L\n396#1:1127,6\n399#1:1133,6\n403#1:1139,6\n423#1:1145,6\n426#1:1151,6\n430#1:1157,6\n640#1:1164,3\n640#1:1167,4\n640#1:1171,2\n640#1:1173\n640#1:1174\n643#1:1175,3\n643#1:1178,4\n643#1:1182,2\n643#1:1184\n643#1:1185\n646#1:1186,3\n646#1:1189,4\n646#1:1193,2\n646#1:1195\n646#1:1196\n*E\n"})
    public static final class Builder implements Appendable {
        public static final int $stable = 8;

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        @NotNull
        public final StringBuilder f17584p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        @NotNull
        public final ArrayList f17585q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        @NotNull
        public final ArrayList f17586r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        @NotNull
        public final ArrayList f17587s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        @NotNull
        public final ArrayList f17588t0;

        public Builder() {
            this(0, 1, null);
        }

        public final void addStringAnnotation(@NotNull String tag, @NotNull String annotation, int start, int end) {
            Intrinsics.checkNotNullParameter(tag, "tag");
            Intrinsics.checkNotNullParameter(annotation, "annotation");
            this.f17587s0.add(new a(annotation, start, end, tag));
        }

        public final void addStyle(@NotNull SpanStyle style, int start, int end) {
            Intrinsics.checkNotNullParameter(style, "style");
            this.f17585q0.add(new a(style, start, end, null, 8));
        }

        @ExperimentalTextApi
        public final void addTtsAnnotation(@NotNull TtsAnnotation ttsAnnotation, int start, int end) {
            Intrinsics.checkNotNullParameter(ttsAnnotation, "ttsAnnotation");
            this.f17587s0.add(new a(ttsAnnotation, start, end, null, 8));
        }

        @ExperimentalTextApi
        public final void addUrlAnnotation(@NotNull UrlAnnotation urlAnnotation, int start, int end) {
            Intrinsics.checkNotNullParameter(urlAnnotation, "urlAnnotation");
            this.f17587s0.add(new a(urlAnnotation, start, end, null, 8));
        }

        public final int getLength() {
            return this.f17584p0.length();
        }

        public final void pop() {
            ArrayList arrayList = this.f17588t0;
            if (!(!arrayList.isEmpty())) {
                throw new IllegalStateException("Nothing to pop.".toString());
            }
            ((a) arrayList.remove(arrayList.size() - 1)).f17591c = this.f17584p0.length();
        }

        public final int pushStringAnnotation(@NotNull String tag, @NotNull String annotation) {
            Intrinsics.checkNotNullParameter(tag, "tag");
            Intrinsics.checkNotNullParameter(annotation, "annotation");
            a aVar = new a(annotation, this.f17584p0.length(), 0, tag, 4);
            ArrayList arrayList = this.f17588t0;
            arrayList.add(aVar);
            this.f17587s0.add(aVar);
            return arrayList.size() - 1;
        }

        public final int pushStyle(@NotNull SpanStyle style) {
            Intrinsics.checkNotNullParameter(style, "style");
            a aVar = new a(style, this.f17584p0.length(), 0, null, 12);
            ArrayList arrayList = this.f17588t0;
            arrayList.add(aVar);
            this.f17585q0.add(aVar);
            return arrayList.size() - 1;
        }

        public final int pushTtsAnnotation(@NotNull TtsAnnotation ttsAnnotation) {
            Intrinsics.checkNotNullParameter(ttsAnnotation, "ttsAnnotation");
            a aVar = new a(ttsAnnotation, this.f17584p0.length(), 0, null, 12);
            ArrayList arrayList = this.f17588t0;
            arrayList.add(aVar);
            this.f17587s0.add(aVar);
            return arrayList.size() - 1;
        }

        @ExperimentalTextApi
        public final int pushUrlAnnotation(@NotNull UrlAnnotation urlAnnotation) {
            Intrinsics.checkNotNullParameter(urlAnnotation, "urlAnnotation");
            a aVar = new a(urlAnnotation, this.f17584p0.length(), 0, null, 12);
            ArrayList arrayList = this.f17588t0;
            arrayList.add(aVar);
            this.f17587s0.add(aVar);
            return arrayList.size() - 1;
        }

        @NotNull
        public final AnnotatedString toAnnotatedString() {
            StringBuilder sb2 = this.f17584p0;
            String string = sb2.toString();
            Intrinsics.checkNotNullExpressionValue(string, "text.toString()");
            ArrayList arrayList = this.f17585q0;
            ArrayList arrayList2 = new ArrayList(arrayList.size());
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                arrayList2.add(((a) arrayList.get(i10)).a(sb2.length()));
            }
            if (arrayList2.isEmpty()) {
                arrayList2 = null;
            }
            ArrayList arrayList3 = this.f17586r0;
            ArrayList arrayList4 = new ArrayList(arrayList3.size());
            int size2 = arrayList3.size();
            for (int i11 = 0; i11 < size2; i11++) {
                arrayList4.add(((a) arrayList3.get(i11)).a(sb2.length()));
            }
            if (arrayList4.isEmpty()) {
                arrayList4 = null;
            }
            ArrayList arrayList5 = this.f17587s0;
            ArrayList arrayList6 = new ArrayList(arrayList5.size());
            int size3 = arrayList5.size();
            for (int i12 = 0; i12 < size3; i12++) {
                arrayList6.add(((a) arrayList5.get(i12)).a(sb2.length()));
            }
            return new AnnotatedString(string, arrayList2, arrayList4, arrayList6.isEmpty() ? null : arrayList6);
        }

        public Builder(int i10) {
            this.f17584p0 = new StringBuilder(i10);
            this.f17585q0 = new ArrayList();
            this.f17586r0 = new ArrayList();
            this.f17587s0 = new ArrayList();
            this.f17588t0 = new ArrayList();
        }

        public final void addStyle(@NotNull ParagraphStyle style, int start, int end) {
            Intrinsics.checkNotNullParameter(style, "style");
            this.f17586r0.add(new a(style, start, end, null, 8));
        }

        public final void append(@NotNull String text) {
            Intrinsics.checkNotNullParameter(text, "text");
            this.f17584p0.append(text);
        }

        /* JADX INFO: compiled from: AnnotatedString.kt */
        @SourceDebugExtension({"SMAP\nAnnotatedString.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnnotatedString.kt\nandroidx/compose/ui/text/AnnotatedString$Builder$MutableRange\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1126:1\n1#2:1127\n*E\n"})
        public static final class a<T> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final T f17589a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final int f17590b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public int f17591c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            @NotNull
            public final String f17592d;

            public a(T t10, int i10, int i11, @NotNull String tag) {
                Intrinsics.checkNotNullParameter(tag, "tag");
                this.f17589a = t10;
                this.f17590b = i10;
                this.f17591c = i11;
                this.f17592d = tag;
            }

            @NotNull
            public final Range<T> a(int i10) {
                int i11 = this.f17591c;
                if (i11 != Integer.MIN_VALUE) {
                    i10 = i11;
                }
                if (i10 == Integer.MIN_VALUE) {
                    throw new IllegalStateException("Item.end should be set first".toString());
                }
                return new Range<>(this.f17589a, this.f17590b, i10, this.f17592d);
            }

            public final boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return Intrinsics.areEqual(this.f17589a, aVar.f17589a) && this.f17590b == aVar.f17590b && this.f17591c == aVar.f17591c && Intrinsics.areEqual(this.f17592d, aVar.f17592d);
            }

            public final int hashCode() {
                T t10 = this.f17589a;
                return this.f17592d.hashCode() + ((((((t10 == null ? 0 : t10.hashCode()) * 31) + this.f17590b) * 31) + this.f17591c) * 31);
            }

            @NotNull
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("MutableRange(item=");
                sb2.append(this.f17589a);
                sb2.append(", start=");
                sb2.append(this.f17590b);
                sb2.append(", end=");
                sb2.append(this.f17591c);
                sb2.append(", tag=");
                return y2.b(sb2, this.f17592d, RootService.CLOSE_BRACKET);
            }

            public /* synthetic */ a(Object obj, int i10, int i11, String str, int i12) {
                this(obj, i10, (i12 & 4) != 0 ? Integer.MIN_VALUE : i11, (i12 & 8) != 0 ? "" : str);
            }
        }

        public final int pushStyle(@NotNull ParagraphStyle style) {
            Intrinsics.checkNotNullParameter(style, "style");
            a aVar = new a(style, this.f17584p0.length(), 0, null, 12);
            ArrayList arrayList = this.f17588t0;
            arrayList.add(aVar);
            this.f17586r0.add(aVar);
            return arrayList.size() - 1;
        }

        @Override // java.lang.Appendable
        @NotNull
        public Builder append(@Nullable CharSequence text) {
            if (text instanceof AnnotatedString) {
                append((AnnotatedString) text);
            } else {
                this.f17584p0.append(text);
            }
            return this;
        }

        public final void pop(int index) {
            ArrayList arrayList = this.f17588t0;
            if (index < arrayList.size()) {
                while (arrayList.size() - 1 >= index) {
                    pop();
                }
            } else {
                throw new IllegalStateException((index + " should be less than " + arrayList.size()).toString());
            }
        }

        public /* synthetic */ Builder(int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? 16 : i10);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Builder(@NotNull String text) {
            this(0, 1, null);
            Intrinsics.checkNotNullParameter(text, "text");
            append(text);
        }

        @Override // java.lang.Appendable
        @NotNull
        public Builder append(@Nullable CharSequence text, int start, int end) {
            if (text instanceof AnnotatedString) {
                append((AnnotatedString) text, start, end);
            } else {
                this.f17584p0.append(text, start, end);
            }
            return this;
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Builder(@NotNull AnnotatedString text) {
            this(0, 1, null);
            Intrinsics.checkNotNullParameter(text, "text");
            append(text);
        }

        @Override // java.lang.Appendable
        @NotNull
        public Builder append(char c10) {
            this.f17584p0.append(c10);
            return this;
        }

        public final void append(@NotNull AnnotatedString text) {
            Intrinsics.checkNotNullParameter(text, "text");
            StringBuilder sb2 = this.f17584p0;
            int length = sb2.length();
            sb2.append(text.getText());
            List<Range<SpanStyle>> spanStylesOrNull$ui_text_release = text.getSpanStylesOrNull$ui_text_release();
            if (spanStylesOrNull$ui_text_release != null) {
                int size = spanStylesOrNull$ui_text_release.size();
                for (int i10 = 0; i10 < size; i10++) {
                    Range<SpanStyle> range = spanStylesOrNull$ui_text_release.get(i10);
                    addStyle(range.getItem(), range.getStart() + length, range.getEnd() + length);
                }
            }
            List<Range<ParagraphStyle>> paragraphStylesOrNull$ui_text_release = text.getParagraphStylesOrNull$ui_text_release();
            if (paragraphStylesOrNull$ui_text_release != null) {
                int size2 = paragraphStylesOrNull$ui_text_release.size();
                for (int i11 = 0; i11 < size2; i11++) {
                    Range<ParagraphStyle> range2 = paragraphStylesOrNull$ui_text_release.get(i11);
                    addStyle(range2.getItem(), range2.getStart() + length, range2.getEnd() + length);
                }
            }
            List<Range<? extends Object>> annotations$ui_text_release = text.getAnnotations$ui_text_release();
            if (annotations$ui_text_release != null) {
                int size3 = annotations$ui_text_release.size();
                for (int i12 = 0; i12 < size3; i12++) {
                    Range<? extends Object> range3 = annotations$ui_text_release.get(i12);
                    this.f17587s0.add(new a(range3.getItem(), range3.getStart() + length, range3.getEnd() + length, range3.getTag()));
                }
            }
        }

        public final void append(@NotNull AnnotatedString text, int start, int end) {
            Intrinsics.checkNotNullParameter(text, "text");
            StringBuilder sb2 = this.f17584p0;
            int length = sb2.length();
            sb2.append((CharSequence) text.getText(), start, end);
            List listA = AnnotatedStringKt.a(text, start, end);
            if (listA != null) {
                int size = listA.size();
                for (int i10 = 0; i10 < size; i10++) {
                    Range range = (Range) listA.get(i10);
                    addStyle((SpanStyle) range.getItem(), range.getStart() + length, range.getEnd() + length);
                }
            }
            List listAccess$getLocalParagraphStyles = AnnotatedStringKt.access$getLocalParagraphStyles(text, start, end);
            if (listAccess$getLocalParagraphStyles != null) {
                int size2 = listAccess$getLocalParagraphStyles.size();
                for (int i11 = 0; i11 < size2; i11++) {
                    Range range2 = (Range) listAccess$getLocalParagraphStyles.get(i11);
                    addStyle((ParagraphStyle) range2.getItem(), range2.getStart() + length, range2.getEnd() + length);
                }
            }
            List listAccess$getLocalAnnotations = AnnotatedStringKt.access$getLocalAnnotations(text, start, end);
            if (listAccess$getLocalAnnotations != null) {
                int size3 = listAccess$getLocalAnnotations.size();
                for (int i12 = 0; i12 < size3; i12++) {
                    Range range3 = (Range) listAccess$getLocalAnnotations.get(i12);
                    this.f17587s0.add(new a(range3.getItem(), range3.getStart() + length, range3.getEnd() + length, range3.getTag()));
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AnnotatedString(@NotNull String text, @Nullable List<Range<SpanStyle>> list, @Nullable List<Range<ParagraphStyle>> list2, @Nullable List<? extends Range<? extends Object>> list3) {
        List listSortedWith;
        Intrinsics.checkNotNullParameter(text, "text");
        this.text = text;
        this.spanStylesOrNull = list;
        this.paragraphStylesOrNull = list2;
        this.annotations = list3;
        if (list2 == null || (listSortedWith = CollectionsKt___CollectionsKt.sortedWith(list2, new Comparator() { // from class: androidx.compose.ui.text.AnnotatedString$special$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t10, T t11) {
                return e.compareValues(Integer.valueOf(((AnnotatedString.Range) t10).getStart()), Integer.valueOf(((AnnotatedString.Range) t11).getStart()));
            }
        })) == null) {
            return;
        }
        int size = listSortedWith.size();
        int end = -1;
        for (int i10 = 0; i10 < size; i10++) {
            Range range = (Range) listSortedWith.get(i10);
            if (range.getStart() < end) {
                throw new IllegalArgumentException("ParagraphStyle should not overlap".toString());
            }
            if (range.getEnd() > this.text.length()) {
                throw new IllegalArgumentException(("ParagraphStyle range [" + range.getStart() + ", " + range.getEnd() + ") is out of boundary").toString());
            }
            end = range.getEnd();
        }
    }

    @Override // java.lang.CharSequence
    public final /* bridge */ char charAt(int i10) {
        return get(i10);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AnnotatedString)) {
            return false;
        }
        AnnotatedString annotatedString = (AnnotatedString) other;
        return Intrinsics.areEqual(this.text, annotatedString.text) && Intrinsics.areEqual(this.spanStylesOrNull, annotatedString.spanStylesOrNull) && Intrinsics.areEqual(this.paragraphStylesOrNull, annotatedString.paragraphStylesOrNull) && Intrinsics.areEqual(this.annotations, annotatedString.annotations);
    }

    public char get(int index) {
        return this.text.charAt(index);
    }

    @Nullable
    public final List<Range<? extends Object>> getAnnotations$ui_text_release() {
        return this.annotations;
    }

    public int getLength() {
        return this.text.length();
    }

    @NotNull
    public final List<Range<ParagraphStyle>> getParagraphStyles() {
        List<Range<ParagraphStyle>> list = this.paragraphStylesOrNull;
        return list == null ? CollectionsKt__CollectionsKt.emptyList() : list;
    }

    @Nullable
    public final List<Range<ParagraphStyle>> getParagraphStylesOrNull$ui_text_release() {
        return this.paragraphStylesOrNull;
    }

    @NotNull
    public final List<Range<SpanStyle>> getSpanStyles() {
        List<Range<SpanStyle>> list = this.spanStylesOrNull;
        return list == null ? CollectionsKt__CollectionsKt.emptyList() : list;
    }

    @Nullable
    public final List<Range<SpanStyle>> getSpanStylesOrNull$ui_text_release() {
        return this.spanStylesOrNull;
    }

    @NotNull
    public final List<Range<String>> getStringAnnotations(@NotNull String tag, int start, int end) {
        List listEmptyList;
        Intrinsics.checkNotNullParameter(tag, "tag");
        List<Range<? extends Object>> list = this.annotations;
        if (list != null) {
            listEmptyList = new ArrayList(list.size());
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                Range<? extends Object> range = list.get(i10);
                Range<? extends Object> range2 = range;
                if ((range2.getItem() instanceof String) && Intrinsics.areEqual(tag, range2.getTag()) && AnnotatedStringKt.intersect(start, end, range2.getStart(), range2.getEnd())) {
                    listEmptyList.add(range);
                }
            }
        } else {
            listEmptyList = CollectionsKt__CollectionsKt.emptyList();
        }
        Intrinsics.checkNotNull(listEmptyList, "null cannot be cast to non-null type kotlin.collections.List<androidx.compose.ui.text.AnnotatedString.Range<kotlin.String>>");
        return listEmptyList;
    }

    @NotNull
    public final String getText() {
        return this.text;
    }

    @NotNull
    public final List<Range<TtsAnnotation>> getTtsAnnotations(int start, int end) {
        List listEmptyList;
        List<Range<? extends Object>> list = this.annotations;
        if (list != null) {
            listEmptyList = new ArrayList(list.size());
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                Range<? extends Object> range = list.get(i10);
                Range<? extends Object> range2 = range;
                if ((range2.getItem() instanceof TtsAnnotation) && AnnotatedStringKt.intersect(start, end, range2.getStart(), range2.getEnd())) {
                    listEmptyList.add(range);
                }
            }
        } else {
            listEmptyList = CollectionsKt__CollectionsKt.emptyList();
        }
        Intrinsics.checkNotNull(listEmptyList, "null cannot be cast to non-null type kotlin.collections.List<androidx.compose.ui.text.AnnotatedString.Range<androidx.compose.ui.text.TtsAnnotation>>");
        return listEmptyList;
    }

    @ExperimentalTextApi
    @NotNull
    public final List<Range<UrlAnnotation>> getUrlAnnotations(int start, int end) {
        List listEmptyList;
        List<Range<? extends Object>> list = this.annotations;
        if (list != null) {
            listEmptyList = new ArrayList(list.size());
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                Range<? extends Object> range = list.get(i10);
                Range<? extends Object> range2 = range;
                if ((range2.getItem() instanceof UrlAnnotation) && AnnotatedStringKt.intersect(start, end, range2.getStart(), range2.getEnd())) {
                    listEmptyList.add(range);
                }
            }
        } else {
            listEmptyList = CollectionsKt__CollectionsKt.emptyList();
        }
        Intrinsics.checkNotNull(listEmptyList, "null cannot be cast to non-null type kotlin.collections.List<androidx.compose.ui.text.AnnotatedString.Range<androidx.compose.ui.text.UrlAnnotation>>");
        return listEmptyList;
    }

    public final boolean hasStringAnnotations(@NotNull String tag, int start, int end) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        List<Range<? extends Object>> list = this.annotations;
        if (list == null) {
            return false;
        }
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            Range<? extends Object> range = list.get(i10);
            if ((range.getItem() instanceof String) && Intrinsics.areEqual(tag, range.getTag()) && AnnotatedStringKt.intersect(start, end, range.getStart(), range.getEnd())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = this.text.hashCode() * 31;
        List<Range<SpanStyle>> list = this.spanStylesOrNull;
        int iHashCode2 = (iHashCode + (list != null ? list.hashCode() : 0)) * 31;
        List<Range<ParagraphStyle>> list2 = this.paragraphStylesOrNull;
        int iHashCode3 = (iHashCode2 + (list2 != null ? list2.hashCode() : 0)) * 31;
        List<Range<? extends Object>> list3 = this.annotations;
        return iHashCode3 + (list3 != null ? list3.hashCode() : 0);
    }

    @Override // java.lang.CharSequence
    public final /* bridge */ int length() {
        return getLength();
    }

    @Stable
    @NotNull
    public final AnnotatedString plus(@NotNull AnnotatedString other) {
        Intrinsics.checkNotNullParameter(other, "other");
        Builder builder = new Builder(this);
        builder.append(other);
        return builder.toAnnotatedString();
    }

    @NotNull
    /* JADX INFO: renamed from: subSequence-5zc-tL8, reason: not valid java name */
    public final AnnotatedString m3857subSequence5zctL8(long range) {
        return subSequence(TextRange.m3965getMinimpl(range), TextRange.m3964getMaximpl(range));
    }

    @Override // java.lang.CharSequence
    @NotNull
    public String toString() {
        return this.text;
    }

    @Override // java.lang.CharSequence
    @NotNull
    public AnnotatedString subSequence(int startIndex, int endIndex) {
        if (startIndex > endIndex) {
            throw new IllegalArgumentException(g.b("start (", startIndex, ") should be less or equal to end (", endIndex, RootService.CLOSE_BRACKET).toString());
        }
        String str = this.text;
        if (startIndex == 0 && endIndex == str.length()) {
            return this;
        }
        String strSubstring = str.substring(startIndex, endIndex);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return new AnnotatedString(strSubstring, AnnotatedStringKt.access$filterRanges(this.spanStylesOrNull, startIndex, endIndex), AnnotatedStringKt.access$filterRanges(this.paragraphStylesOrNull, startIndex, endIndex), AnnotatedStringKt.access$filterRanges(this.annotations, startIndex, endIndex));
    }

    /* JADX INFO: compiled from: AnnotatedString.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0087\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B'\u0012\u0006\u0010\n\u001a\u00028\u0000\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\u0005\u0012\u0006\u0010\r\u001a\u00020\b¢\u0006\u0004\b\"\u0010#B!\b\u0016\u0012\u0006\u0010\n\u001a\u00028\u0000\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\u0005¢\u0006\u0004\b\"\u0010$J\u0010\u0010\u0003\u001a\u00028\u0000HÆ\u0003¢\u0006\u0004\b\u0003\u0010\u0004J\t\u0010\u0006\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0005HÆ\u0003J\t\u0010\t\u001a\u00020\bHÆ\u0003J>\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0002\u0010\n\u001a\u00028\u00002\b\b\u0002\u0010\u000b\u001a\u00020\u00052\b\b\u0002\u0010\f\u001a\u00020\u00052\b\b\u0002\u0010\r\u001a\u00020\bHÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u0010\u001a\u00020\bHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0005HÖ\u0001J\u0013\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0002HÖ\u0003R\u0017\u0010\n\u001a\u00028\u00008\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0004R\u0017\u0010\u000b\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\f\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0019\u001a\u0004\b\u001d\u0010\u001bR\u0017\u0010\r\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!¨\u0006%"}, d2 = {"Landroidx/compose/ui/text/AnnotatedString$Range;", ExifInterface.GPS_DIRECTION_TRUE, "", "component1", "()Ljava/lang/Object;", "", "component2", "component3", "", "component4", AnalyticsConstants.Key.ITEM, EventDataKeys.Lifecycle.LIFECYCLE_START, "end", LogKeysKt.TAG, "copy", "(Ljava/lang/Object;IILjava/lang/String;)Landroidx/compose/ui/text/AnnotatedString$Range;", "toString", GenerateActivationFormCommand.HASH_CODE, "other", "", "equals", "a", "Ljava/lang/Object;", "getItem", "b", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getStart", "()I", "c", "getEnd", "d", "Ljava/lang/String;", "getTag", "()Ljava/lang/String;", "<init>", "(Ljava/lang/Object;IILjava/lang/String;)V", "(Ljava/lang/Object;II)V", "ui-text_release"}, k = 1, mv = {1, 8, 0})
    @Immutable
    @SourceDebugExtension({"SMAP\nAnnotatedString.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnnotatedString.kt\nandroidx/compose/ui/text/AnnotatedString$Range\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1126:1\n1#2:1127\n*E\n"})
    public static final /* data */ class Range<T> {
        public static final int $stable = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        public final T item;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        public final int start;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        public final int end;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final String tag;

        public Range(T t10, int i10, int i11, @NotNull String tag) {
            Intrinsics.checkNotNullParameter(tag, "tag");
            this.item = t10;
            this.start = i10;
            this.end = i11;
            this.tag = tag;
            if (i10 > i11) {
                throw new IllegalArgumentException("Reversed range is not supported".toString());
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Range copy$default(Range range, Object obj, int i10, int i11, String str, int i12, Object obj2) {
            if ((i12 & 1) != 0) {
                obj = range.item;
            }
            if ((i12 & 2) != 0) {
                i10 = range.start;
            }
            if ((i12 & 4) != 0) {
                i11 = range.end;
            }
            if ((i12 & 8) != 0) {
                str = range.tag;
            }
            return range.copy(obj, i10, i11, str);
        }

        public final T component1() {
            return this.item;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final int getStart() {
            return this.start;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final int getEnd() {
            return this.end;
        }

        @NotNull
        /* JADX INFO: renamed from: component4, reason: from getter */
        public final String getTag() {
            return this.tag;
        }

        @NotNull
        public final Range<T> copy(T item, int start, int end, @NotNull String tag) {
            Intrinsics.checkNotNullParameter(tag, "tag");
            return new Range<>(item, start, end, tag);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Range)) {
                return false;
            }
            Range range = (Range) other;
            return Intrinsics.areEqual(this.item, range.item) && this.start == range.start && this.end == range.end && Intrinsics.areEqual(this.tag, range.tag);
        }

        public final int getEnd() {
            return this.end;
        }

        public final T getItem() {
            return this.item;
        }

        public final int getStart() {
            return this.start;
        }

        @NotNull
        public final String getTag() {
            return this.tag;
        }

        public int hashCode() {
            T t10 = this.item;
            return this.tag.hashCode() + ((((((t10 == null ? 0 : t10.hashCode()) * 31) + this.start) * 31) + this.end) * 31);
        }

        @NotNull
        public String toString() {
            StringBuilder sb2 = new StringBuilder("Range(item=");
            sb2.append(this.item);
            sb2.append(", start=");
            sb2.append(this.start);
            sb2.append(", end=");
            sb2.append(this.end);
            sb2.append(", tag=");
            return y2.b(sb2, this.tag, RootService.CLOSE_BRACKET);
        }

        public Range(T t10, int i10, int i11) {
            this(t10, i10, i11, "");
        }
    }

    @NotNull
    public final List<Range<String>> getStringAnnotations(int start, int end) {
        List listEmptyList;
        List<Range<? extends Object>> list = this.annotations;
        if (list != null) {
            listEmptyList = new ArrayList(list.size());
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                Range<? extends Object> range = list.get(i10);
                Range<? extends Object> range2 = range;
                if ((range2.getItem() instanceof String) && AnnotatedStringKt.intersect(start, end, range2.getStart(), range2.getEnd())) {
                    listEmptyList.add(range);
                }
            }
        } else {
            listEmptyList = CollectionsKt__CollectionsKt.emptyList();
        }
        Intrinsics.checkNotNull(listEmptyList, "null cannot be cast to non-null type kotlin.collections.List<androidx.compose.ui.text.AnnotatedString.Range<kotlin.String>>");
        return listEmptyList;
    }

    public /* synthetic */ AnnotatedString(String str, List list, List list2, List list3, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i10 & 2) != 0 ? null : list, (i10 & 4) != 0 ? null : list2, (i10 & 8) != 0 ? null : list3);
    }

    public /* synthetic */ AnnotatedString(String str, List list, List list2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i10 & 2) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list, (i10 & 4) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list2);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public AnnotatedString(@NotNull String text, @NotNull List<Range<SpanStyle>> spanStyles, @NotNull List<Range<ParagraphStyle>> paragraphStyles) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(spanStyles, "spanStyles");
        Intrinsics.checkNotNullParameter(paragraphStyles, "paragraphStyles");
        List<Range<SpanStyle>> list = spanStyles;
        List<Range<ParagraphStyle>> list2 = paragraphStyles;
        this(text, list.isEmpty() ? null : list, list2.isEmpty() ? null : list2, null);
    }
}
