package com.bbva.push.firebase;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;
import com.bbva.push.executor.PushExecutor;
import com.bbva.push.model.Push;
import com.bbva.push.model.TokenResult;
import com.google.firebase.messaging.FirebaseMessaging;
import java.util.List;
import java.util.Random;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: FirebasePushExecutor.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J.\u0010\u0003\u001a\u00020\u00042\u001c\u0010\u0005\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00040\u0007j\u0002`\t0\u00062\u0006\u0010\n\u001a\u00020\bH\u0016J\u001c\u0010\u000b\u001a\u00020\u00042\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00040\u0007H\u0016J \u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\n\u001a\u00020\bH\u0016¨\u0006\u0013"}, d2 = {"Lcom/bbva/push/firebase/FirebasePushExecutor;", "Lcom/bbva/push/executor/PushExecutor;", "()V", "callObservers", "", "pushObservers", "", "Lkotlin/Function1;", "Lcom/bbva/push/model/Push;", "Lcom/bbva/push/bus/PushObserver;", "push", "requestToken", "callback", "Lcom/bbva/push/model/TokenResult;", "showNotification", "context", "Landroid/content/Context;", "builder", "Landroidx/core/app/NotificationCompat$Builder;", "firebase-push_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nFirebasePushExecutor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FirebasePushExecutor.kt\ncom/bbva/push/firebase/FirebasePushExecutor\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,66:1\n1851#2,2:67\n*S KotlinDebug\n*F\n+ 1 FirebasePushExecutor.kt\ncom/bbva/push/firebase/FirebasePushExecutor\n*L\n62#1:67,2\n*E\n"})
public final class FirebasePushExecutor implements PushExecutor {
    @Override // com.bbva.push.executor.PushExecutor
    public void callObservers(@NotNull List<Function1<Push, Unit>> pushObservers, @NotNull Push push) {
        Intrinsics.checkNotNullParameter(pushObservers, "pushObservers");
        Intrinsics.checkNotNullParameter(push, "push");
        new Handler(Looper.getMainLooper()).post(new androidx.camera.view.a(pushObservers, push, 3));
    }

    @Override // com.bbva.push.executor.PushExecutor
    public void requestToken(@NotNull Function1<? super TokenResult, Unit> callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        FirebaseMessaging.getInstance().getToken().addOnCompleteListener(new pb.a(callback, 0));
    }

    @Override // com.bbva.push.executor.PushExecutor
    public void showNotification(@NotNull Context context, @NotNull NotificationCompat.Builder builder, @NotNull Push push) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(builder, "builder");
        Intrinsics.checkNotNullParameter(push, "push");
        NotificationManagerCompat.from(context).notify(new Random().nextInt(), builder.build());
    }
}
