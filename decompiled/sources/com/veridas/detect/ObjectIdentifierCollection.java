package com.veridas.detect;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: ObjectIdentifierCollection.kt */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u001a\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0014\u0010\u0005\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002R\u0017\u0010\u000b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u0017\u0010\u000e\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\f\u0010\b\u001a\u0004\b\r\u0010\nR\u0017\u0010\u0011\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u000f\u0010\b\u001a\u0004\b\u0010\u0010\nR\u0017\u0010\u0014\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0012\u0010\b\u001a\u0004\b\u0013\u0010\nR\u0017\u0010\u0017\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0015\u0010\b\u001a\u0004\b\u0016\u0010\nR\u001d\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006 "}, d2 = {"Lcom/veridas/detect/ObjectIdentifierCollection;", "", "", "", "identifiers", "subset", "", "a", "Z", "getContainsAnything", "()Z", "containsAnything", "b", "getContainsMoreThanOne", "containsMoreThanOne", "c", "getContainsNothing", "containsNothing", "d", "getContainsOne", "containsOne", "e", "getContainsSimilarMxDocuments", "containsSimilarMxDocuments", "f", "Ljava/util/List;", "getElements", "()Ljava/util/List;", "elements", "objectIdentifiers", "<init>", "(Ljava/util/List;)V", "common-image-processing_release"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nObjectIdentifierCollection.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ObjectIdentifierCollection.kt\ncom/veridas/detect/ObjectIdentifierCollection\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,38:1\n766#2:39\n857#2,2:40\n*S KotlinDebug\n*F\n+ 1 ObjectIdentifierCollection.kt\ncom/veridas/detect/ObjectIdentifierCollection\n*L\n32#1:39\n32#1:40,2\n*E\n"})
public final class ObjectIdentifierCollection {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final boolean containsAnything;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final boolean containsMoreThanOne;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final boolean containsNothing;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public final boolean containsOne;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public final boolean containsSimilarMxDocuments;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final List<String> elements;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final List<String> f66771g;

    public ObjectIdentifierCollection(@NotNull List<String> objectIdentifiers) {
        Intrinsics.checkNotNullParameter(objectIdentifiers, "objectIdentifiers");
        List<String> listListOf = CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{"MX_IDCard_2019", "MX_IDCard_2014"});
        this.f66771g = listListOf;
        List<String> listDistinct = CollectionsKt___CollectionsKt.distinct(objectIdentifiers);
        this.elements = listDistinct;
        int size = listDistinct.size();
        this.containsAnything = !listDistinct.isEmpty();
        this.containsMoreThanOne = size > 1;
        this.containsNothing = listDistinct.isEmpty();
        this.containsOne = size == 1;
        this.containsSimilarMxDocuments = !CollectionsKt___CollectionsKt.intersect(listDistinct, listListOf).isEmpty();
    }

    public final boolean getContainsAnything() {
        return this.containsAnything;
    }

    public final boolean getContainsMoreThanOne() {
        return this.containsMoreThanOne;
    }

    public final boolean getContainsNothing() {
        return this.containsNothing;
    }

    public final boolean getContainsOne() {
        return this.containsOne;
    }

    public final boolean getContainsSimilarMxDocuments() {
        return this.containsSimilarMxDocuments;
    }

    @NotNull
    public final List<String> getElements() {
        return this.elements;
    }

    @NotNull
    public final ObjectIdentifierCollection subset(@NotNull List<String> identifiers) {
        Intrinsics.checkNotNullParameter(identifiers, "identifiers");
        List<String> list = this.elements;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (identifiers.contains((String) obj)) {
                arrayList.add(obj);
            }
        }
        return new ObjectIdentifierCollection(arrayList);
    }
}
