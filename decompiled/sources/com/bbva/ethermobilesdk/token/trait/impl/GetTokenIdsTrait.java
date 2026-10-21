package com.bbva.ethermobilesdk.token.trait.impl;

import androidx.core.app.NotificationCompat;
import com.bbva.ethermobilesdk.token.storage.TokenStorage;
import com.bbva.ethermobilesdk.token.trait.Trait;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: GetTokenIdsTrait.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0001B\u000f\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ!\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u0002H\u0094@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\f"}, d2 = {"Lcom/bbva/ethermobilesdk/token/trait/impl/GetTokenIdsTrait;", "Lcom/bbva/ethermobilesdk/token/trait/Trait;", "", "", "", "request", NotificationCompat.CATEGORY_CALL, "(Lkotlin/Unit;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/bbva/ethermobilesdk/token/storage/TokenStorage;", "tokenStorage", "<init>", "(Lcom/bbva/ethermobilesdk/token/storage/TokenStorage;)V", "ethertoken_release"}, k = 1, mv = {1, 8, 0})
public final class GetTokenIdsTrait extends Trait<Unit, Set<? extends String>> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final TokenStorage f30296b;

    public GetTokenIdsTrait(@NotNull TokenStorage tokenStorage) {
        Intrinsics.checkNotNullParameter(tokenStorage, "tokenStorage");
        this.f30296b = tokenStorage;
    }

    @Override // com.bbva.ethermobilesdk.token.trait.Trait
    public /* bridge */ /* synthetic */ Object call(Unit unit, Continuation<? super Set<? extends String>> continuation) {
        return call2(unit, (Continuation<? super Set<String>>) continuation);
    }

    @Nullable
    /* JADX INFO: renamed from: call, reason: avoid collision after fix types in other method */
    public Object call2(@NotNull Unit unit, @NotNull Continuation<? super Set<String>> continuation) {
        return this.f30296b.getTokenIds(continuation);
    }
}
