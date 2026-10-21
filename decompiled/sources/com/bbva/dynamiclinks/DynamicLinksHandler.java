package com.bbva.dynamiclinks;

import android.content.Intent;
import android.net.Uri;
import com.bbva.dynamiclinks.DynamicLinksHandler;
import com.bbva.dynamiclinks.extensions.DynamicLinksExtensionsKt;
import com.bbva.dynamiclinks.model.DynamicLinkData;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.dynamiclinks.PendingDynamicLinkData;
import com.google.firebase.dynamiclinks.ktx.FirebaseDynamicLinksKt;
import com.google.firebase.ktx.Firebase;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import t6.b;

/* JADX INFO: compiled from: DynamicLinksHandler.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J@\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0018\u0010\u0007\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\t\u0012\u0004\u0012\u00020\u00040\bj\u0002`\n2\u0016\u0010\u000b\u001a\u0012\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00040\bj\u0002`\rJ@\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u000f2\u0018\u0010\u0007\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\t\u0012\u0004\u0012\u00020\u00040\bj\u0002`\n2\u0016\u0010\u000b\u001a\u0012\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00040\bj\u0002`\r¨\u0006\u0010"}, d2 = {"Lcom/bbva/dynamiclinks/DynamicLinksHandler;", "", "()V", "handle", "", "intent", "Landroid/content/Intent;", "onSuccess", "Lkotlin/Function1;", "Lcom/bbva/dynamiclinks/model/DynamicLinkData;", "Lcom/bbva/dynamiclinks/OnSuccess;", "onError", "", "Lcom/bbva/dynamiclinks/OnError;", "uri", "Landroid/net/Uri;", "dynamiclinks_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class DynamicLinksHandler {

    @NotNull
    public static final DynamicLinksHandler INSTANCE = new DynamicLinksHandler();

    public final void handle(@NotNull Intent intent, @NotNull Function1<? super DynamicLinkData, Unit> onSuccess, @NotNull final Function1<? super Throwable, Unit> onError) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        Intrinsics.checkNotNullParameter(onSuccess, "onSuccess");
        Intrinsics.checkNotNullParameter(onError, "onError");
        FirebaseDynamicLinksKt.getDynamicLinks(Firebase.INSTANCE).getDynamicLink(intent).addOnFailureListener(new OnFailureListener() { // from class: t6.a
            @Override // com.google.android.gms.tasks.OnFailureListener
            public final void onFailure(Exception it) {
                DynamicLinksHandler dynamicLinksHandler = DynamicLinksHandler.INSTANCE;
                Function1 onError2 = onError;
                Intrinsics.checkNotNullParameter(onError2, "$onError");
                Intrinsics.checkNotNullExpressionValue(it, "it");
                onError2.invoke(it);
            }
        }).addOnSuccessListener(new b(onSuccess, 0));
    }

    public final void handle(@NotNull Uri uri, @NotNull final Function1<? super DynamicLinkData, Unit> onSuccess, @NotNull final Function1<? super Throwable, Unit> onError) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        Intrinsics.checkNotNullParameter(onSuccess, "onSuccess");
        Intrinsics.checkNotNullParameter(onError, "onError");
        FirebaseDynamicLinksKt.getDynamicLinks(Firebase.INSTANCE).getDynamicLink(uri).addOnFailureListener(new OnFailureListener() { // from class: t6.c
            @Override // com.google.android.gms.tasks.OnFailureListener
            public final void onFailure(Exception it) {
                DynamicLinksHandler dynamicLinksHandler = DynamicLinksHandler.INSTANCE;
                Function1 onError2 = onError;
                Intrinsics.checkNotNullParameter(onError2, "$onError");
                Intrinsics.checkNotNullExpressionValue(it, "it");
                onError2.invoke(it);
            }
        }).addOnSuccessListener(new OnSuccessListener() { // from class: t6.d
            @Override // com.google.android.gms.tasks.OnSuccessListener
            public final void onSuccess(Object obj) {
                DynamicLinksHandler dynamicLinksHandler = DynamicLinksHandler.INSTANCE;
                Function1 onSuccess2 = onSuccess;
                Intrinsics.checkNotNullParameter(onSuccess2, "$onSuccess");
                onSuccess2.invoke(DynamicLinksExtensionsKt.toModel((PendingDynamicLinkData) obj));
            }
        });
    }
}
