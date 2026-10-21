package com.bbva.glomohybrid.login.presentation.viewmodel.handler;

import com.bbva.component.dm.login.datamanager.model.LoginException;
import com.bbva.glomoutils.StringExtensionsKt;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt___StringsKt;
import kotlin.text.l;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: LoginAnalytics.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bJ\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0016J\u0010\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u001c\u0010\b\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003H&¨\u0006\f"}, d2 = {"Lcom/bbva/glomohybrid/login/presentation/viewmodel/handler/LoginAnalytics;", "", "format", "", "message", "formatException", "error", "Lcom/bbva/component/dm/login/datamanager/model/LoginException;", "trackLoginError", "", "modalId", "Companion", "Login_mexicoGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface LoginAnalytics {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.f33773a;

    @NotNull
    public static final String MESSAGE_NOT_AVAILABLE = "message not available";

    /* JADX INFO: compiled from: LoginAnalytics.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/bbva/glomohybrid/login/presentation/viewmodel/handler/LoginAnalytics$Companion;", "", "", "MESSAGE_NOT_AVAILABLE", "Ljava/lang/String;", "<init>", "()V", "Login_mexicoGoogleRelease"}, k = 1, mv = {1, 9, 0})
    public static final class Companion {

        @NotNull
        public static final String MESSAGE_NOT_AVAILABLE = "message not available";

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ Companion f33773a = new Companion();
    }

    /* JADX INFO: compiled from: LoginAnalytics.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nLoginAnalytics.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LoginAnalytics.kt\ncom/bbva/glomohybrid/login/presentation/viewmodel/handler/LoginAnalytics$DefaultImpls\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,42:1\n766#2:43\n857#2,2:44\n*S KotlinDebug\n*F\n+ 1 LoginAnalytics.kt\ncom/bbva/glomohybrid/login/presentation/viewmodel/handler/LoginAnalytics$DefaultImpls\n*L\n28#1:43\n28#1:44,2\n*E\n"})
    public static final class DefaultImpls {

        /* JADX INFO: compiled from: LoginAnalytics.kt */
        public static final class a extends Lambda implements Function0<String> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public static final a f33774p0 = new a(0);

            @Override // kotlin.jvm.functions.Function0
            public final /* bridge */ /* synthetic */ String invoke() {
                return "message not available";
            }
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0020  */
        @NotNull
        public static String format(@NotNull LoginAnalytics loginAnalytics, @Nullable String str) {
            String strRemoveExtraBlankChars;
            String strNormalize;
            String strRemoveSpecialCharacters;
            if (str != null) {
                String lowerCase = str.toLowerCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                if (lowerCase == null || (strNormalize = StringExtensionsKt.normalize(lowerCase)) == null || (strRemoveSpecialCharacters = StringExtensionsKt.removeSpecialCharacters(strNormalize)) == null) {
                    strRemoveExtraBlankChars = null;
                } else {
                    strRemoveExtraBlankChars = StringExtensionsKt.removeExtraBlankChars(strRemoveSpecialCharacters);
                }
            } else {
                strRemoveExtraBlankChars = null;
            }
            return StringExtensionsKt.orElse(strRemoveExtraBlankChars, a.f33774p0);
        }

        @NotNull
        public static String formatException(@NotNull LoginAnalytics loginAnalytics, @NotNull LoginException error) {
            Intrinsics.checkNotNullParameter(error, "error");
            String[] strArr = new String[3];
            Integer statusCode = error.getStatusCode();
            String string = statusCode != null ? statusCode.toString() : null;
            if (string == null) {
                string = "";
            }
            strArr[0] = string;
            strArr[1] = error.getCode();
            strArr[2] = loginAnalytics.format(error.getDetailMessage());
            List listListOf = CollectionsKt__CollectionsKt.listOf((Object[]) strArr);
            ArrayList arrayList = new ArrayList();
            for (Object obj : listListOf) {
                if (!l.isBlank((String) obj)) {
                    arrayList.add(obj);
                }
            }
            return StringsKt___StringsKt.take(CollectionsKt___CollectionsKt.joinToString$default(arrayList, " ", null, null, 0, null, null, 62, null), 90);
        }

        public static /* synthetic */ void trackLoginError$default(LoginAnalytics loginAnalytics, LoginException loginException, String str, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: trackLoginError");
            }
            if ((i10 & 2) != 0) {
                str = null;
            }
            loginAnalytics.trackLoginError(loginException, str);
        }
    }

    @NotNull
    String format(@Nullable String message);

    @NotNull
    String formatException(@NotNull LoginException error);

    void trackLoginError(@NotNull LoginException error, @Nullable String modalId);
}
