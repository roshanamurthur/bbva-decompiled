package com.bbva.glomo.user.repository.datasource;

import androidx.autofill.HintConstants;
import com.bbva.component.dm.customer.data.repository.response.customer.CustomerLoginsParser;
import com.bbva.component.request.header.customerid.CustomerIdInterceptor;
import com.bbva.glomo.localstorage.LocalStorageConstantsKt;
import com.bbva.glomo.storage.MainStorage;
import com.bbva.glomo.storage.TargetStorage;
import com.bbva.glomo.user.domain.model.RememberedUser;
import com.bbva.plugin.localstorage.command.ClearCommand;
import com.bbva.plugin.localstorage.command.RemoveCommand;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: RememberedUserDataSource.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB\u000f\u0012\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\u001e\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005J\u000e\u0010\t\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\n\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0002J\u000e\u0010\f\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u0002J\u000e\u0010\r\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005J\u000e\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u0002J\u000e\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u0002J\u0006\u0010\u0012\u001a\u00020\u0007J\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013J\u0013\u0010\u0015\u001a\u00020\u0007H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0004\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001e"}, d2 = {"Lcom/bbva/glomo/user/repository/datasource/RememberedUserDataSource;", "Lcom/bbva/glomo/user/repository/datasource/UserDataStore;", "", HintConstants.AUTOFILL_HINT_USERNAME, "document", "", LocalStorageConstantsKt.IS_BUSINESS_USER_KEY, "", "storeRememberedUser", "storeUsername", "storeDocument", CustomerLoginsParser.LAST_NAME, "storeLastName", "storeBusinessUser", CustomerIdInterceptor.FAKE_CUSTOMER_ID, "storeCustomerId", "avatarUrl", "storeAvatarUrl", RemoveCommand.ID, "Lcom/bbva/glomo/user/domain/model/RememberedUser;", "get", ClearCommand.ID, "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getDocument", "()Ljava/lang/String;", "Lcom/bbva/glomo/storage/MainStorage;", "storage", "<init>", "(Lcom/bbva/glomo/storage/MainStorage;)V", "Companion", "gl-user-domain_release"}, k = 1, mv = {1, 9, 0})
public final class RememberedUserDataSource implements UserDataStore {

    @NotNull
    public static final String AVATAR_URL = "avatar_url";

    @NotNull
    public static final String REMEMBERED_CUSTOMER_ID = "remembered_customer_id";

    @NotNull
    public static final String REMEMBERED_IS_BUSINESS_USER = "remembered_is_business_user";

    @NotNull
    public static final String REMEMBERED_LAST_NAME = "remembered_last_name";

    @NotNull
    public static final String REMEMBERED_USER_DOCUMENT = "remembered_user_document";

    @NotNull
    public static final String REMEMBERED_USER_NAME = "remembered_username";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final MainStorage f30883a;

    /* JADX INFO: compiled from: RememberedUserDataSource.kt */
    @DebugMetadata(c = "com.bbva.glomo.user.repository.datasource.RememberedUserDataSource", f = "RememberedUserDataSource.kt", i = {0}, l = {115}, m = ClearCommand.ID, n = {"this"}, s = {"L$0"})
    public static final class a extends ContinuationImpl {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public RememberedUserDataSource f30884p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public /* synthetic */ Object f30885q0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public int f30887s0;

        public a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f30885q0 = obj;
            this.f30887s0 |= Integer.MIN_VALUE;
            return RememberedUserDataSource.this.clear(this);
        }
    }

    public RememberedUserDataSource(@NotNull MainStorage storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        this.f30883a = storage;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.bbva.glomo.user.repository.datasource.UserDataStore
    @Nullable
    public Object clear(@NotNull Continuation<? super Unit> continuation) {
        a aVar;
        RememberedUserDataSource rememberedUserDataSource;
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i10 = aVar.f30887s0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                aVar.f30887s0 = i10 - Integer.MIN_VALUE;
            } else {
                aVar = new a(continuation);
            }
        } else {
            aVar = new a(continuation);
        }
        Object obj = aVar.f30885q0;
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i11 = aVar.f30887s0;
        if (i11 == 0) {
            ResultKt.throwOnFailure(obj);
            aVar.f30884p0 = this;
            aVar.f30887s0 = 1;
            if (UserDataStore.DefaultImpls.clear(this, aVar) == coroutine_suspended) {
                return coroutine_suspended;
            }
            rememberedUserDataSource = this;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            rememberedUserDataSource = aVar.f30884p0;
            ResultKt.throwOnFailure(obj);
        }
        rememberedUserDataSource.remove();
        return Unit.INSTANCE;
    }

    @Nullable
    public final RememberedUser get() {
        TargetStorage targetStorage = TargetStorage.Local;
        String string$default = MainStorage.getString$default(this.f30883a, "remembered_username", null, true, targetStorage, 2, null);
        String string$default2 = MainStorage.getString$default(this.f30883a, "remembered_user_document", null, true, targetStorage, 2, null);
        String string$default3 = MainStorage.getString$default(this.f30883a, REMEMBERED_LAST_NAME, null, true, targetStorage, 2, null);
        boolean zAreEqual = Intrinsics.areEqual(MainStorage.getString$default(this.f30883a, REMEMBERED_IS_BUSINESS_USER, null, true, targetStorage, 2, null), "1");
        String string$default4 = MainStorage.getString$default(this.f30883a, REMEMBERED_CUSTOMER_ID, null, true, targetStorage, 2, null);
        String string$default5 = MainStorage.getString$default(this.f30883a, AVATAR_URL, null, true, targetStorage, 2, null);
        if (string$default == null || string$default.length() == 0 || string$default2 == null || string$default2.length() == 0) {
            return null;
        }
        return new RememberedUser(string$default, string$default2, string$default3, zAreEqual, string$default4, string$default5);
    }

    @NotNull
    public final String getDocument() {
        String string$default = MainStorage.getString$default(this.f30883a, "remembered_user_document", null, false, TargetStorage.Local, 6, null);
        return string$default == null ? "" : string$default;
    }

    public final void remove() {
        TargetStorage targetStorage = TargetStorage.Shared;
        String[] strArr = {AVATAR_URL, "remembered_username", "remembered_user_document", REMEMBERED_LAST_NAME, REMEMBERED_IS_BUSINESS_USER, REMEMBERED_CUSTOMER_ID};
        MainStorage mainStorage = this.f30883a;
        mainStorage.remove(targetStorage, strArr);
        mainStorage.remove(TargetStorage.Local, AVATAR_URL, "remembered_username", "remembered_user_document", REMEMBERED_LAST_NAME, REMEMBERED_IS_BUSINESS_USER, REMEMBERED_CUSTOMER_ID);
    }

    public final void storeAvatarUrl(@NotNull String avatarUrl) {
        Intrinsics.checkNotNullParameter(avatarUrl, "avatarUrl");
        this.f30883a.put(AVATAR_URL, avatarUrl, true, TargetStorage.All);
    }

    public final void storeBusinessUser(boolean isBusinessUser) {
        this.f30883a.put(REMEMBERED_IS_BUSINESS_USER, isBusinessUser ? "1" : "0", true, TargetStorage.All);
    }

    public final void storeCustomerId(@NotNull String customerId) {
        Intrinsics.checkNotNullParameter(customerId, "customerId");
        this.f30883a.put(REMEMBERED_CUSTOMER_ID, customerId, true, TargetStorage.All);
    }

    public final void storeDocument(@NotNull String document) {
        Intrinsics.checkNotNullParameter(document, "document");
        this.f30883a.put("remembered_user_document", document, true, TargetStorage.All);
    }

    public final void storeLastName(@NotNull String lastName) {
        Intrinsics.checkNotNullParameter(lastName, "lastName");
        this.f30883a.put(REMEMBERED_LAST_NAME, lastName, true, TargetStorage.All);
    }

    public final void storeRememberedUser(@NotNull String username, @NotNull String document, boolean isBusinessUser) {
        Intrinsics.checkNotNullParameter(username, "username");
        Intrinsics.checkNotNullParameter(document, "document");
        storeUsername(username);
        storeDocument(document);
        storeBusinessUser(isBusinessUser);
    }

    public final void storeUsername(@NotNull String username) {
        Intrinsics.checkNotNullParameter(username, "username");
        this.f30883a.put("remembered_username", username, true, TargetStorage.All);
    }
}
