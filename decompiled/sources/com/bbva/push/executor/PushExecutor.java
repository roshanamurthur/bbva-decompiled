package com.bbva.push.executor;

import android.content.Context;
import androidx.core.app.NotificationCompat;
import com.bbva.push.model.Push;
import com.bbva.push.model.TokenResult;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: PushExecutor.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J.\u0010\u0002\u001a\u00020\u00032\u001c\u0010\u0004\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00030\u0006j\u0002`\b0\u00052\u0006\u0010\t\u001a\u00020\u0007H\u0016J\u001c\u0010\n\u001a\u00020\u00032\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00030\u0006H&J \u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u0007H&¨\u0006\u0012"}, d2 = {"Lcom/bbva/push/executor/PushExecutor;", "", "callObservers", "", "pushObservers", "", "Lkotlin/Function1;", "Lcom/bbva/push/model/Push;", "Lcom/bbva/push/bus/PushObserver;", "push", "requestToken", "callback", "Lcom/bbva/push/model/TokenResult;", "showNotification", "context", "Landroid/content/Context;", "builder", "Landroidx/core/app/NotificationCompat$Builder;", "push_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface PushExecutor {

    /* JADX INFO: compiled from: PushExecutor.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nPushExecutor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PushExecutor.kt\ncom/bbva/push/executor/PushExecutor$DefaultImpls\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,19:1\n1851#2,2:20\n*S KotlinDebug\n*F\n+ 1 PushExecutor.kt\ncom/bbva/push/executor/PushExecutor$DefaultImpls\n*L\n16#1:20,2\n*E\n"})
    public static final class DefaultImpls {
        public static void callObservers(@NotNull PushExecutor pushExecutor, @NotNull List<Function1<Push, Unit>> pushObservers, @NotNull Push push) {
            Intrinsics.checkNotNullParameter(pushObservers, "pushObservers");
            Intrinsics.checkNotNullParameter(push, "push");
            Iterator<T> it = pushObservers.iterator();
            while (it.hasNext()) {
                ((Function1) it.next()).invoke(push);
            }
        }
    }

    void callObservers(@NotNull List<Function1<Push, Unit>> pushObservers, @NotNull Push push);

    void requestToken(@NotNull Function1<? super TokenResult, Unit> callback);

    void showNotification(@NotNull Context context, @NotNull NotificationCompat.Builder builder, @NotNull Push push);
}
