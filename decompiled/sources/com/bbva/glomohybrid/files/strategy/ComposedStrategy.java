package com.bbva.glomohybrid.files.strategy;

import android.content.Context;
import android.net.Uri;
import com.bbva.glomohybrid.files.PathStrategy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: compiled from: ComposedStrategy.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0005\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u0015\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\u000e"}, d2 = {"Lcom/bbva/glomohybrid/files/strategy/ComposedStrategy;", "Lcom/bbva/glomohybrid/files/PathStrategy;", "Landroid/net/Uri;", "uri", "", "getName", "", "getLength", "(Landroid/net/Uri;)Ljava/lang/Long;", "", "strategies", "<init>", "(Ljava/util/List;)V", "Companion", "app_mexicoProdGoogleRelease"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nComposedStrategy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ComposedStrategy.kt\ncom/bbva/glomohybrid/files/strategy/ComposedStrategy\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,27:1\n1603#2,9:28\n1855#2:37\n1856#2:39\n1612#2:40\n1603#2,9:41\n1855#2:50\n1856#2:52\n1612#2:53\n1#3:38\n1#3:51\n*S KotlinDebug\n*F\n+ 1 ComposedStrategy.kt\ncom/bbva/glomohybrid/files/strategy/ComposedStrategy\n*L\n10#1:28,9\n10#1:37\n10#1:39\n10#1:40\n15#1:41,9\n15#1:50\n15#1:52\n15#1:53\n10#1:38\n15#1:51\n*E\n"})
public final class ComposedStrategy implements PathStrategy {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final List<PathStrategy> f32167a;

    /* JADX INFO: compiled from: ComposedStrategy.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b¨\u0006\t"}, d2 = {"Lcom/bbva/glomohybrid/files/strategy/ComposedStrategy$Companion;", "", "()V", "from", "Lcom/bbva/glomohybrid/files/strategy/ComposedStrategy;", "context", "Landroid/content/Context;", "xmlParser", "Lorg/xmlpull/v1/XmlPullParser;", "app_mexicoProdGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final ComposedStrategy from(@NotNull Context context, @NotNull XmlPullParser xmlParser) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(xmlParser, "xmlParser");
            return new ComposedStrategy(new StrategyXmlReader().read(context, xmlParser));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ComposedStrategy(@NotNull List<? extends PathStrategy> strategies) {
        Intrinsics.checkNotNullParameter(strategies, "strategies");
        this.f32167a = strategies;
    }

    @Override // com.bbva.glomohybrid.files.PathStrategy
    @Nullable
    public Long getLength(@NotNull Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        List<PathStrategy> list = this.f32167a;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            Long length = ((PathStrategy) it.next()).getLength(uri);
            if (length != null) {
                arrayList.add(length);
            }
        }
        return (Long) CollectionsKt___CollectionsKt.maxOrNull((Iterable) arrayList);
    }

    @Override // com.bbva.glomohybrid.files.PathStrategy
    @Nullable
    public String getName(@NotNull Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        List<PathStrategy> list = this.f32167a;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            String name = ((PathStrategy) it.next()).getName(uri);
            if (name != null) {
                arrayList.add(name);
            }
        }
        return (String) CollectionsKt___CollectionsKt.firstOrNull((List) arrayList);
    }
}
