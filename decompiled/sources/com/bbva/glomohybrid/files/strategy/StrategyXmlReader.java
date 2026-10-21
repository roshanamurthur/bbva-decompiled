package com.bbva.glomohybrid.files.strategy;

import android.content.Context;
import androidx.camera.camera2.internal.h0;
import com.bbva.glomohybrid.files.PathStrategy;
import java.io.File;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.sequences.SequencesKt__SequencesKt;
import kotlin.sequences.SequencesKt___SequencesKt;
import org.jetbrains.annotations.NotNull;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: compiled from: StrategyXmlReader.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\u0007¢\u0006\u0004\b\t\u0010\nJ\u001c\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004¨\u0006\f"}, d2 = {"Lcom/bbva/glomohybrid/files/strategy/StrategyXmlReader;", "", "Landroid/content/Context;", "context", "Lorg/xmlpull/v1/XmlPullParser;", "xmlParser", "", "Lcom/bbva/glomohybrid/files/PathStrategy;", "read", "<init>", "()V", "Companion", "app_mexicoProdGoogleRelease"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nStrategyXmlReader.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StrategyXmlReader.kt\ncom/bbva/glomohybrid/files/strategy/StrategyXmlReader\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,55:1\n1#2:56\n*E\n"})
public final class StrategyXmlReader {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final List<String> f32171a = CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{"files-path", "cache-path", "external-path"});

    /* JADX INFO: compiled from: StrategyXmlReader.kt */
    public static final class a extends Lambda implements Function0<Integer> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ XmlPullParser f32172p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(XmlPullParser xmlPullParser) {
            super(0);
            this.f32172p0 = xmlPullParser;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Integer invoke() {
            return Integer.valueOf(this.f32172p0.next());
        }
    }

    /* JADX INFO: compiled from: StrategyXmlReader.kt */
    public static final class b extends Lambda implements Function1<Integer, Boolean> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final b f32173p0 = new b(1);

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(Integer num) {
            return Boolean.valueOf(num.intValue() != 1);
        }
    }

    /* JADX INFO: compiled from: StrategyXmlReader.kt */
    public static final class c extends Lambda implements Function1<Integer, Boolean> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final c f32174p0 = new c(1);

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(Integer num) {
            return Boolean.valueOf(num.intValue() == 2);
        }
    }

    /* JADX INFO: compiled from: StrategyXmlReader.kt */
    public static final class d extends Lambda implements Function1<Integer, Boolean> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ XmlPullParser f32175p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(XmlPullParser xmlPullParser) {
            super(1);
            this.f32175p0 = xmlPullParser;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(Integer num) {
            num.intValue();
            return Boolean.valueOf(StrategyXmlReader.f32171a.contains(this.f32175p0.getName()));
        }
    }

    /* JADX INFO: compiled from: StrategyXmlReader.kt */
    public static final class e extends Lambda implements Function1<Integer, PathStrategy> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ XmlPullParser f32176p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ StrategyXmlReader f32177q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ Context f32178r0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(StrategyXmlReader strategyXmlReader, Context context, XmlPullParser xmlPullParser) {
            super(1);
            this.f32176p0 = xmlPullParser;
            this.f32177q0 = strategyXmlReader;
            this.f32178r0 = context;
        }

        @Override // kotlin.jvm.functions.Function1
        public final PathStrategy invoke(Integer num) {
            num.intValue();
            XmlPullParser xmlPullParser = this.f32176p0;
            String name = xmlPullParser.getName();
            if (name != null) {
                int iHashCode = name.hashCode();
                Context context = this.f32178r0;
                StrategyXmlReader strategyXmlReader = this.f32177q0;
                if (iHashCode != -1642807877) {
                    if (iHashCode != -50149145) {
                        if (iHashCode == -17221744 && name.equals("cache-path")) {
                            return StrategyXmlReader.access$strategyOf(strategyXmlReader, xmlPullParser, context.getCacheDir());
                        }
                    } else if (name.equals("external-path")) {
                        return StrategyXmlReader.access$externalPathStrategy(strategyXmlReader, context, xmlPullParser);
                    }
                } else if (name.equals("files-path")) {
                    return StrategyXmlReader.access$strategyOf(strategyXmlReader, xmlPullParser, context.getFilesDir());
                }
            }
            return null;
        }
    }

    public static final PathStrategy access$externalPathStrategy(StrategyXmlReader strategyXmlReader, Context context, XmlPullParser xmlPullParser) {
        strategyXmlReader.getClass();
        File externalFilesDir = context.getExternalFilesDir(xmlPullParser.getAttributeValue(null, "path"));
        if (externalFilesDir != null) {
            return new ExternalPathStrategy(externalFilesDir);
        }
        return null;
    }

    public static final PathStrategy access$strategyOf(StrategyXmlReader strategyXmlReader, XmlPullParser xmlPullParser, File file) {
        strategyXmlReader.getClass();
        if (file == null) {
            return null;
        }
        String attributeValue = xmlPullParser.getAttributeValue(null, "name");
        File file2 = new File(file, xmlPullParser.getAttributeValue(null, "path"));
        if (!(!Intrinsics.areEqual(file2, file))) {
            throw new IllegalArgumentException(h0.b("Cannot expose files from \"", file.getName(), "\" dir publicly").toString());
        }
        Intrinsics.checkNotNull(attributeValue);
        return new LocalPathStrategy(file2, attributeValue);
    }

    @NotNull
    public final List<PathStrategy> read(@NotNull Context context, @NotNull XmlPullParser xmlParser) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(xmlParser, "xmlParser");
        return SequencesKt___SequencesKt.toList(SequencesKt___SequencesKt.filterNotNull(SequencesKt___SequencesKt.map(SequencesKt___SequencesKt.filter(SequencesKt___SequencesKt.filter(SequencesKt___SequencesKt.takeWhile(SequencesKt__SequencesKt.generateSequence(new a(xmlParser)), b.f32173p0), c.f32174p0), new d(xmlParser)), new e(this, context, xmlParser))));
    }
}
