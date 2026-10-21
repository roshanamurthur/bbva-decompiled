package com.bbva.glomohybrid.documents.common.repository.dataSource;

import com.bbva.notifications.constants.PushConstants;
import java.text.Normalizer;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.Regex;
import kotlin.text.l;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: NoSpaceOrAscciFormatter.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u000b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eR'\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002j\u0002`\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR'\u0010\f\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002j\u0002`\u00048\u0006¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\u000b\u0010\b¨\u0006\u000f"}, d2 = {"Lcom/bbva/glomohybrid/documents/common/repository/dataSource/FilenameDecorators;", "", "Lkotlin/Function1;", "", "Lcom/bbva/glomohybrid/documents/common/repository/dataSource/StringDecorator;", "a", "Lkotlin/jvm/functions/Function1;", "getReplaceWhitespaces", "()Lkotlin/jvm/functions/Function1;", "replaceWhitespaces", "b", "getRemoveSpecialCharacters", "removeSpecialCharacters", "<init>", "()V", "gl-documents_release"}, k = 1, mv = {1, 9, 0})
public final class FilenameDecorators {

    @NotNull
    public static final FilenameDecorators INSTANCE = new FilenameDecorators();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final b f32078a = b.f32081p0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final a f32079b = a.f32080p0;

    /* JADX INFO: compiled from: NoSpaceOrAscciFormatter.kt */
    public static final class a extends Lambda implements Function1<String, String> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final a f32080p0 = new a(1);

        @Override // kotlin.jvm.functions.Function1
        public final String invoke(String str) {
            String it = str;
            Intrinsics.checkNotNullParameter(it, "it");
            String strNormalize = Normalizer.normalize(it, Normalizer.Form.NFD);
            Intrinsics.checkNotNullExpressionValue(strNormalize, "normalize(...)");
            return new Regex("[^\\p{ASCII}]").replace(strNormalize, "");
        }
    }

    /* JADX INFO: compiled from: NoSpaceOrAscciFormatter.kt */
    public static final class b extends Lambda implements Function1<String, String> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final b f32081p0 = new b(1);

        @Override // kotlin.jvm.functions.Function1
        public final String invoke(String str) {
            String it = str;
            Intrinsics.checkNotNullParameter(it, "it");
            return l.replace$default(it, " ", PushConstants.GE_PARAMS_SEPARATOR, false, 4, (Object) null);
        }
    }

    @NotNull
    public final Function1<String, String> getRemoveSpecialCharacters() {
        return f32079b;
    }

    @NotNull
    public final Function1<String, String> getReplaceWhitespaces() {
        return f32078a;
    }
}
