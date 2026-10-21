package com.bbva.glomo.user.repository.datasource;

import com.bbva.glomo.localstorage.LocalStorageConstantsKt;
import com.bbva.glomo.storage.MainStorage;
import com.bbva.glomo.storage.TargetStorage;
import com.bbva.plugin.localstorage.command.ClearCommand;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: UserSharedPrefDataSource.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u001f\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0016\u0010\u0006\u001a\u00020\u00052\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002J\u0013\u0010\u0007\u001a\u00020\u0005H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000e"}, d2 = {"Lcom/bbva/glomo/user/repository/datasource/UserSharedPrefDataSource;", "Lcom/bbva/glomo/user/repository/datasource/UserDataStore;", "", "", "safeKeyList", "", "clearAll", ClearCommand.ID, "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/bbva/glomo/storage/MainStorage;", "storage", "<init>", "(Lcom/bbva/glomo/storage/MainStorage;Ljava/util/List;)V", "Companion", "gl-user-domain_release"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nUserSharedPrefDataSource.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UserSharedPrefDataSource.kt\ncom/bbva/glomo/user/repository/datasource/UserSharedPrefDataSource\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,59:1\n819#2:60\n847#2,2:61\n1#3:63\n37#4,2:64\n*S KotlinDebug\n*F\n+ 1 UserSharedPrefDataSource.kt\ncom/bbva/glomo/user/repository/datasource/UserSharedPrefDataSource\n*L\n29#1:60\n29#1:61,2\n30#1:64,2\n*E\n"})
public final class UserSharedPrefDataSource implements UserDataStore {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final List<String> f30892c = CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{LocalStorageConstantsKt.KEY_REMEMBERED_VERSION_WITH_TIMES, LocalStorageConstantsKt.KEY_APP_SETTINGS, "termsAndConditions", LocalStorageConstantsKt.KEY_REMINDED, "user-is-logged", LocalStorageConstantsKt.KEY_REMEMBERED_VERSION_CODE, LocalStorageConstantsKt.KEY_REMEMBERED_VERSION_NAME, LocalStorageConstantsKt.KEY_MENU_ITEMS, LocalStorageConstantsKt.ETAG_APPSETTINGS, LocalStorageConstantsKt.ETAG_FEATUREFLAGS, LocalStorageConstantsKt.SELECTOR_ACTIVE_KEY, LocalStorageConstantsKt.KEY_IS_ROOT_ENABLED, LocalStorageConstantsKt.MOBILE_SERVICES_KEY, LocalStorageConstantsKt.KEY_FEATURE_FLAGS, "deviceId"});

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final MainStorage f30893a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final List<String> f30894b;

    /* JADX INFO: compiled from: UserSharedPrefDataSource.kt */
    @DebugMetadata(c = "com.bbva.glomo.user.repository.datasource.UserSharedPrefDataSource", f = "UserSharedPrefDataSource.kt", i = {0}, l = {34}, m = ClearCommand.ID, n = {"this"}, s = {"L$0"})
    public static final class a extends ContinuationImpl {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public UserSharedPrefDataSource f30895p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public /* synthetic */ Object f30896q0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public int f30898s0;

        public a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f30896q0 = obj;
            this.f30898s0 |= Integer.MIN_VALUE;
            return UserSharedPrefDataSource.this.clear(this);
        }
    }

    public UserSharedPrefDataSource(@NotNull MainStorage storage, @NotNull List<String> safeKeyList) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(safeKeyList, "safeKeyList");
        this.f30893a = storage;
        this.f30894b = safeKeyList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void clearAll$default(UserSharedPrefDataSource userSharedPrefDataSource, List list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = Collections.emptyList();
            Intrinsics.checkNotNullExpressionValue(list, "emptyList(...)");
        }
        userSharedPrefDataSource.clearAll(list);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.bbva.glomo.user.repository.datasource.UserDataStore
    @Nullable
    public Object clear(@NotNull Continuation<? super Unit> continuation) {
        a aVar;
        UserSharedPrefDataSource userSharedPrefDataSource;
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i10 = aVar.f30898s0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                aVar.f30898s0 = i10 - Integer.MIN_VALUE;
            } else {
                aVar = new a(continuation);
            }
        } else {
            aVar = new a(continuation);
        }
        Object obj = aVar.f30896q0;
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i11 = aVar.f30898s0;
        if (i11 == 0) {
            ResultKt.throwOnFailure(obj);
            aVar.f30895p0 = this;
            aVar.f30898s0 = 1;
            if (UserDataStore.DefaultImpls.clear(this, aVar) == coroutine_suspended) {
                return coroutine_suspended;
            }
            userSharedPrefDataSource = this;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            userSharedPrefDataSource = aVar.f30895p0;
            ResultKt.throwOnFailure(obj);
        }
        userSharedPrefDataSource.clearAll(userSharedPrefDataSource.f30894b);
        return Unit.INSTANCE;
    }

    public final void clearAll(@NotNull List<String> safeKeyList) {
        Intrinsics.checkNotNullParameter(safeKeyList, "safeKeyList");
        TargetStorage targetStorage = TargetStorage.Local;
        MainStorage mainStorage = this.f30893a;
        List<String> listKeys = mainStorage.keys(targetStorage);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listKeys) {
            if (!safeKeyList.contains((String) obj)) {
                arrayList.add(obj);
            }
        }
        TargetStorage targetStorage2 = TargetStorage.Local;
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        mainStorage.remove(targetStorage2, (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    public /* synthetic */ UserSharedPrefDataSource(MainStorage mainStorage, List list, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(mainStorage, (i10 & 2) != 0 ? f30892c : list);
    }
}
