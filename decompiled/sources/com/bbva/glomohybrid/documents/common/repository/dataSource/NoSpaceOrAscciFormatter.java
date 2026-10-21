package com.bbva.glomohybrid.documents.common.repository.dataSource;

import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: NoSpaceOrAscciFormatter.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB'\u0012\u001e\b\u0002\u0010\b\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0006j\u0002`\u00070\u0005¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\f"}, d2 = {"Lcom/bbva/glomohybrid/documents/common/repository/dataSource/NoSpaceOrAscciFormatter;", "Lcom/bbva/glomohybrid/documents/common/repository/dataSource/FilenameFormatter;", "", "fileName", "format", "", "Lkotlin/Function1;", "Lcom/bbva/glomohybrid/documents/common/repository/dataSource/StringDecorator;", "decorators", "<init>", "(Ljava/util/List;)V", "Companion", "gl-documents_release"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nNoSpaceOrAscciFormatter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NoSpaceOrAscciFormatter.kt\ncom/bbva/glomohybrid/documents/common/repository/dataSource/NoSpaceOrAscciFormatter\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,35:1\n1789#2,3:36\n*S KotlinDebug\n*F\n+ 1 NoSpaceOrAscciFormatter.kt\ncom/bbva/glomohybrid/documents/common/repository/dataSource/NoSpaceOrAscciFormatter\n*L\n11#1:36,3\n*E\n"})
public final class NoSpaceOrAscciFormatter implements FilenameFormatter {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final String ID = "no-space-or-ascci";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final List<Function1<String, String>> f32084b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final List<Function1<String, String>> f32085a;

    /* JADX INFO: compiled from: NoSpaceOrAscciFormatter.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R'\u0010\u0003\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0005j\u0002`\u00070\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u000e\u0010\n\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/bbva/glomohybrid/documents/common/repository/dataSource/NoSpaceOrAscciFormatter$Companion;", "", "()V", "DEFAULT_DECORATORS", "", "Lkotlin/Function1;", "", "Lcom/bbva/glomohybrid/documents/common/repository/dataSource/StringDecorator;", "getDEFAULT_DECORATORS", "()Ljava/util/List;", "ID", "gl-documents_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final List<Function1<String, String>> getDEFAULT_DECORATORS() {
            return NoSpaceOrAscciFormatter.f32084b;
        }
    }

    static {
        FilenameDecorators filenameDecorators = FilenameDecorators.INSTANCE;
        f32084b = CollectionsKt__CollectionsKt.listOf((Object[]) new Function1[]{filenameDecorators.getReplaceWhitespaces(), filenameDecorators.getRemoveSpecialCharacters()});
    }

    /* JADX WARN: Multi-variable type inference failed */
    public NoSpaceOrAscciFormatter() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // com.bbva.glomohybrid.documents.common.repository.dataSource.FilenameFormatter
    @NotNull
    public String format(@NotNull String fileName) {
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        Iterator<T> it = this.f32085a.iterator();
        while (it.hasNext()) {
            fileName = (String) ((Function1) it.next()).invoke(fileName);
        }
        return fileName;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public NoSpaceOrAscciFormatter(@NotNull List<? extends Function1<? super String, String>> decorators) {
        Intrinsics.checkNotNullParameter(decorators, "decorators");
        this.f32085a = decorators;
    }

    public /* synthetic */ NoSpaceOrAscciFormatter(List list, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? f32084b : list);
    }
}
