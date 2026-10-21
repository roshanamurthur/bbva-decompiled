package com.bbva.ethermobilesdk.tokencompat.extension;

import android.content.Context;
import android.content.Intent;
import androidx.camera.camera2.internal.compat.u;
import com.bbva.ethermobilesdk.sharedstorage.model.StorageEntry;
import com.bbva.ethermobilesdk.sharedstorage.model.entry.EntryType;
import com.bbva.ethermobilesdk.tokencompat.service.RelayedService;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.l;
import mx.openpay.library.domain.util.Constant;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.simpleframework.xml.strategy.Name;

/* JADX INFO: compiled from: Pair.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0001*\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\u0000\u001a0\u0010\t\u001a\u00020\b*\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00002\u0006\u0010\u0005\u001a\u00020\u00042\f\b\u0002\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u0006H\u0000\"\u001a\u0010\u000e\u001a\u00020\u00018\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Lkotlin/Pair;", "", "Lcom/bbva/ethermobilesdk/sharedstorage/model/StorageEntry;", "etherTokenKeyOrNull", "Landroid/content/Context;", "context", "Ljava/lang/Class;", Name.LABEL, "Landroid/content/Intent;", "toIntent", "a", "Ljava/lang/String;", "getENTRY_PREFIX", "()Ljava/lang/String;", "ENTRY_PREFIX", "ethertoken-compat_release"}, k = 2, mv = {1, 8, 0})
public final class PairKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final String f30472a = u.f(EntryType.EtherToken.getId(), Constant.DOT_STRING);

    @Nullable
    public static final String etherTokenKeyOrNull(@NotNull Pair<String, StorageEntry> pair) {
        Intrinsics.checkNotNullParameter(pair, "<this>");
        String first = pair.getFirst();
        if (first == null) {
            return null;
        }
        String str = f30472a;
        if (!l.startsWith$default(first, str, false, 2, null) || StringsKt__StringsKt.substringAfter$default(first, str, (String) null, 2, (Object) null).length() <= 0) {
            return null;
        }
        return StringsKt__StringsKt.substringAfter$default(first, str, (String) null, 2, (Object) null);
    }

    @NotNull
    public static final String getENTRY_PREFIX() {
        return f30472a;
    }

    @NotNull
    public static final Intent toIntent(@NotNull Pair<String, String> pair, @NotNull Context context, @NotNull Class<?> cls) {
        Intrinsics.checkNotNullParameter(pair, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(cls, "class");
        Intent intent = new Intent(context, cls);
        intent.putExtra(u.f(context.getPackageName(), ".X19rX18"), StringKt.wrapped(pair.getFirst()));
        String strF = u.f(context.getPackageName(), ".X192X18");
        String second = pair.getSecond();
        intent.putExtra(strF, second != null ? StringKt.wrapped(second) : null);
        return intent;
    }

    public static /* synthetic */ Intent toIntent$default(Pair pair, Context context, Class cls, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            cls = RelayedService.class;
        }
        return toIntent(pair, context, cls);
    }
}
