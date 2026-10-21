package com.bbva.component.dm.settings;

import com.bbva.component.dm.settings.domain.model.Configuration;
import com.bbva.component.dm.settings.domain.model.Exceptions;
import com.bbva.component.dm.settings.domain.model.WhenClause;
import com.bbva.glomoutils.StringExtensionsKt;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: ConfigurationExtensions.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0014\u0010\u0004\u001a\u0004\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¨\u0006\u0005"}, d2 = {"Lcom/bbva/component/dm/settings/domain/model/Configuration;", "", "userDocument", "Lcom/bbva/component/dm/settings/domain/model/Exceptions;", "findExceptionWithDocumentId", "cmp-dm-appsettings_release"}, k = 2, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nConfigurationExtensions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConfigurationExtensions.kt\ncom/bbva/component/dm/settings/ConfigurationExtensionsKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,23:1\n288#2,2:24\n288#2,2:26\n*S KotlinDebug\n*F\n+ 1 ConfigurationExtensions.kt\ncom/bbva/component/dm/settings/ConfigurationExtensionsKt\n*L\n8#1:24,2\n19#1:26,2\n*E\n"})
public final class ConfigurationExtensionsKt {
    @Nullable
    public static final Exceptions findExceptionWithDocumentId(@NotNull Configuration configuration, @NotNull String userDocument) {
        Object next;
        List<String> includes;
        Intrinsics.checkNotNullParameter(configuration, "<this>");
        Intrinsics.checkNotNullParameter(userDocument, "userDocument");
        List<Exceptions> exceptions = configuration.getExceptions();
        Object obj = null;
        if (exceptions == null) {
            return null;
        }
        for (Object obj2 : exceptions) {
            Exceptions exceptions2 = (Exceptions) obj2;
            WhenClause whenClause = exceptions2.getWhenClause();
            boolean zContains = (whenClause == null || (includes = whenClause.getIncludes()) == null) ? false : includes.contains(userDocument);
            WhenClause whenClause2 = exceptions2.getWhenClause();
            List<String> inClause = whenClause2 != null ? whenClause2.getInClause() : null;
            if (inClause != null) {
                Iterator<T> it = inClause.iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!StringExtensionsKt.applyRegex(userDocument, (String) next));
                String str = (String) next;
                if (str == null || str.length() <= 0) {
                }
                obj = obj2;
                break;
            }
            if (zContains) {
                obj = obj2;
                break;
            }
        }
        return (Exceptions) obj;
    }
}
