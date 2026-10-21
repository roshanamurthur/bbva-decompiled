package com.bbva.softtokenbase.ethertoken;

import bk.w;
import com.bbva.ethermobilesdk.tokencompat.TokenCompat;
import com.bbva.ethermobilesdk.tokencompat.contract.SoftTokenClient;
import com.bbva.ethermobilesdk.tokencompat.model.legacy.STArray;
import com.bbva.ethermobilesdk.tokencompat.model.legacy.TokenPub;
import com.bbva.ethermobilesdk.tokencompat.model.legacy.TokenType;
import com.bbva.ethermobilesdk.tokencompat.model.legacy.impl.STArrayImpl;
import com.bbva.softtokenbase.SoftToken;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: GlomoEtherTokenCompat.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\u0007\u001a\u00020\u0006H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\u0005\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\f"}, d2 = {"Lcom/bbva/softtokenbase/ethertoken/GlomoEtherTokenCompat;", "Lcom/bbva/softtokenbase/SoftToken;", "", "", "getTokenList", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "deleteAllTokenList", "Lcom/bbva/ethermobilesdk/tokencompat/TokenCompat;", "tokenCompat", "<init>", "(Lcom/bbva/ethermobilesdk/tokencompat/TokenCompat;)V", "softtokenbase_release"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nGlomoEtherTokenCompat.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GlomoEtherTokenCompat.kt\ncom/bbva/softtokenbase/ethertoken/GlomoEtherTokenCompat\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,25:1\n1549#2:26\n1620#2,3:27\n*S KotlinDebug\n*F\n+ 1 GlomoEtherTokenCompat.kt\ncom/bbva/softtokenbase/ethertoken/GlomoEtherTokenCompat\n*L\n15#1:26\n15#1:27,3\n*E\n"})
public final class GlomoEtherTokenCompat implements SoftToken {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final TokenCompat f36866a;

    public GlomoEtherTokenCompat(@NotNull TokenCompat tokenCompat) {
        Intrinsics.checkNotNullParameter(tokenCompat, "tokenCompat");
        this.f36866a = tokenCompat;
    }

    @Override // com.bbva.softtokenbase.SoftToken
    @Nullable
    public Object deleteAllTokenList(@NotNull Continuation<? super Unit> continuation) {
        SoftTokenClient.DefaultImpls.deleteTokens$default(this.f36866a, null, 1, null);
        return Unit.INSTANCE;
    }

    @Override // com.bbva.softtokenbase.SoftToken
    @Nullable
    public Object getTokenList(@NotNull Continuation<? super Set<String>> continuation) {
        STArray tokenList = this.f36866a.getTokenList(TokenType.TOTP);
        if (!(tokenList instanceof STArrayImpl.ValidTokenResult)) {
            return w.emptySet();
        }
        List<TokenPub> value = tokenList.getValue();
        if (value != null) {
            List<TokenPub> list = value;
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((TokenPub) it.next()).getSerial());
            }
            Set set = CollectionsKt___CollectionsKt.toSet(arrayList);
            if (set != null) {
                return set;
            }
        }
        return w.emptySet();
    }
}
