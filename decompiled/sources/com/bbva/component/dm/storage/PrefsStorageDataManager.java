package com.bbva.component.dm.storage;

import android.content.Context;
import androidx.exifinterface.media.ExifInterface;
import com.bbva.cells.component.kit.datamanager.DataManager;
import com.bbva.cells.component.kit.datamanager.domain.usecase.UseCase;
import com.bbva.cells.component.kit.model.ActionSpec;
import com.bbva.component.dm.storage.data.SharedPreferencesRepository;
import com.bbva.component.dm.storage.data.datasource.SharedPreferencesDataSource;
import com.bbva.component.dm.storage.domain.interactor.GetListUseCase;
import com.bbva.component.dm.storage.domain.interactor.GetMapListUseCase;
import com.bbva.component.dm.storage.domain.interactor.GetMapUseCase;
import com.bbva.component.dm.storage.domain.interactor.GetObjectUseCase;
import com.bbva.component.dm.storage.domain.interactor.GetUseCase;
import com.bbva.component.dm.storage.domain.interactor.RemoveEntryUseCase;
import com.bbva.component.dm.storage.domain.interactor.SaveBooleanUseCase;
import com.bbva.component.dm.storage.domain.interactor.SaveFloatUseCase;
import com.bbva.component.dm.storage.domain.interactor.SaveIntUseCase;
import com.bbva.component.dm.storage.domain.interactor.SaveListMapUseCase;
import com.bbva.component.dm.storage.domain.interactor.SaveListMappableUseCase;
import com.bbva.component.dm.storage.domain.interactor.SaveLongUseCase;
import com.bbva.component.dm.storage.domain.interactor.SaveMapUseCase;
import com.bbva.component.dm.storage.domain.interactor.SaveMappableUseCase;
import com.bbva.component.dm.storage.domain.interactor.SaveStringSetUseCase;
import com.bbva.component.dm.storage.domain.interactor.SaveStringUseCase;
import com.bbva.component.dm.storage.domain.model.Entry;
import com.bbva.component.dm.storage.domain.model.EntryKey;
import com.bbva.plugin.localstorage.command.RemoveCommand;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmName;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: PrefsStorageDataManager.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 &2\u00020\u0001:\u0001&B\u0019\u0012\b\b\u0002\u0010!\u001a\u00020\u0002\u0012\u0006\u0010#\u001a\u00020\"¢\u0006\u0004\b$\u0010%J\b\u0010\u0003\u001a\u00020\u0002H\u0016J)\u0010\t\u001a\u00020\b\"\b\b\u0000\u0010\u0005*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00022\b\u0010\u0007\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\t\u0010\nJ*\u0010\t\u001a\u00020\b\"\b\b\u0000\u0010\u0005*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00022\u0010\u0010\u0007\u001a\f\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0018\u00010\u000bJ&\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00022\u0016\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\r\u0018\u00010\fJ7\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00022\u001e\u0010\u0007\u001a\u001a\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\r\u0018\u00010\f\u0018\u00010\u000bH\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002J\u001e\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00022\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0010J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\t\u0010\u0012J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\t\u0010\u0014J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\t\u0010\u0016J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b\t\u0010\u0018J&\u0010\u001b\u001a\u00020\b\"\b\b\u0000\u0010\u0005*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00022\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00000\u0019J&\u0010\u001c\u001a\u00020\b\"\b\b\u0000\u0010\u0005*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00022\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00000\u0019J\u000e\u0010\u001d\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u0002J\u000e\u0010\u001e\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u0002J\u000e\u0010\u001f\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u0002J\u000e\u0010 \u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u0002¨\u0006'"}, d2 = {"Lcom/bbva/component/dm/storage/PrefsStorageDataManager;", "Lcom/bbva/cells/component/kit/datamanager/DataManager;", "", "getId", "Lcom/bbva/component/dm/storage/Mappable;", ExifInterface.GPS_DIRECTION_TRUE, "key", "value", "", "save", "(Ljava/lang/String;Lcom/bbva/component/dm/storage/Mappable;)V", "", "", "", "saveMapList", "(Ljava/lang/String;Ljava/util/List;)V", "", "", "(Ljava/lang/String;Ljava/lang/Integer;)V", "", "(Ljava/lang/String;Ljava/lang/Long;)V", "", "(Ljava/lang/String;Ljava/lang/Float;)V", "", "(Ljava/lang/String;Ljava/lang/Boolean;)V", "Ljava/lang/Class;", "clazz", "getObject", "getList", "getMap", "getMapList", "get", RemoveCommand.ID, "id", "Landroid/content/Context;", "context", "<init>", "(Ljava/lang/String;Landroid/content/Context;)V", "Companion", "component-dm-storage_release"}, k = 1, mv = {1, 4, 0})
public final class PrefsStorageDataManager extends DataManager {

    @NotNull
    public static final String ID = "component-dm-storage-prefs";

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final Lazy f28075p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final String f28076q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f28074r0 = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(PrefsStorageDataManager.class), "repository", "getRepository()Lcom/bbva/component/dm/storage/data/SharedPreferencesRepository;"))};

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: compiled from: PrefsStorageDataManager.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u00060\u0007j\u0002`\b0\u00062\u0006\u0010\t\u001a\u00020\u0004H\u0007J\u001e\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001H\u000b0\u0006\"\u0004\b\u0000\u0010\u000b2\u0006\u0010\t\u001a\u00020\u0004H\u0007J\u001a\u0010\f\u001a\f\u0012\b\u0012\u00060\u0007j\u0002`\b0\u00062\u0006\u0010\t\u001a\u00020\u0004H\u0007J\u0016\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00062\u0006\u0010\t\u001a\u00020\u0004H\u0007J\u001a\u0010\u000f\u001a\f\u0012\b\u0012\u00060\u0007j\u0002`\b0\u00062\u0006\u0010\t\u001a\u00020\u0004H\u0007J\u0016\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00062\u0006\u0010\t\u001a\u00020\u0004H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/bbva/component/dm/storage/PrefsStorageDataManager$Companion;", "", "()V", "ID", "", "ACTION_GET_ERROR", "Lcom/bbva/cells/component/kit/model/ActionSpec;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "key", "ACTION_GET_SUCCESS", ExifInterface.GPS_DIRECTION_TRUE, "ACTION_REMOVE_ERROR", "ACTION_REMOVE_SUCCESS", "Ljava/lang/Void;", "ACTION_SAVE_ERROR", "ACTION_SAVE_SUCCESS", "component-dm-storage_release"}, k = 1, mv = {1, 1, 15})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        public final ActionSpec<Exception> ACTION_GET_ERROR(@NotNull String key) {
            return new ActionSpec<>(androidx.camera.core.processing.f.d("get-error::", key));
        }

        @JvmStatic
        @NotNull
        public final <T> ActionSpec<T> ACTION_GET_SUCCESS(@NotNull String key) {
            return new ActionSpec<>(androidx.camera.core.processing.f.d("get-success::", key));
        }

        @JvmStatic
        @NotNull
        public final ActionSpec<Exception> ACTION_REMOVE_ERROR(@NotNull String key) {
            return new ActionSpec<>(androidx.camera.core.processing.f.d("remove-error::", key));
        }

        @JvmStatic
        @NotNull
        public final ActionSpec<Void> ACTION_REMOVE_SUCCESS(@NotNull String key) {
            return new ActionSpec<>(androidx.camera.core.processing.f.d("remove-success::", key));
        }

        @JvmStatic
        @NotNull
        public final ActionSpec<Exception> ACTION_SAVE_ERROR(@NotNull String key) {
            return new ActionSpec<>(androidx.camera.core.processing.f.d("save-error::", key));
        }

        @JvmStatic
        @NotNull
        public final ActionSpec<Void> ACTION_SAVE_SUCCESS(@NotNull String key) {
            return new ActionSpec<>(androidx.camera.core.processing.f.d("save-success::", key));
        }
    }

    /* JADX INFO: compiled from: PrefsStorageDataManager.kt */
    public static final class a<T> implements UseCase.UseCaseSuccessCallback<Entry<? extends Object>> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f28078b;

        public a(String str) {
            this.f28078b = str;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.bbva.cells.component.kit.datamanager.domain.usecase.UseCase.UseCaseSuccessCallback
        public final void onUseCaseComplete(Entry<? extends Object> entry) {
            PrefsStorageDataManager.this.fire(PrefsStorageDataManager.INSTANCE.ACTION_GET_SUCCESS(this.f28078b), entry.getValue());
        }
    }

    /* JADX INFO: compiled from: PrefsStorageDataManager.kt */
    public static final class a0<T> implements UseCase.UseCaseSuccessCallback<Unit> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f28080b;

        public a0(String str) {
            this.f28080b = str;
        }

        @Override // com.bbva.cells.component.kit.datamanager.domain.usecase.UseCase.UseCaseSuccessCallback
        public final void onUseCaseComplete(Unit unit) {
            PrefsStorageDataManager.this.fire(PrefsStorageDataManager.INSTANCE.ACTION_SAVE_SUCCESS(this.f28080b));
        }
    }

    /* JADX INFO: compiled from: PrefsStorageDataManager.kt */
    public static final class b implements UseCase.UseCaseErrorCallback {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f28082b;

        public b(String str) {
            this.f28082b = str;
        }

        @Override // com.bbva.cells.component.kit.datamanager.domain.usecase.UseCase.UseCaseErrorCallback
        public final void onUseCaseError(Throwable it) {
            ActionSpec<Exception> actionSpecACTION_GET_ERROR = PrefsStorageDataManager.INSTANCE.ACTION_GET_ERROR(this.f28082b);
            Intrinsics.checkExpressionValueIsNotNull(it, "it");
            PrefsStorageDataManager prefsStorageDataManager = PrefsStorageDataManager.this;
            prefsStorageDataManager.fire(actionSpecACTION_GET_ERROR, PrefsStorageDataManager.access$asException(prefsStorageDataManager, it));
        }
    }

    /* JADX INFO: compiled from: PrefsStorageDataManager.kt */
    public static final class b0 implements UseCase.UseCaseErrorCallback {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f28084b;

        public b0(String str) {
            this.f28084b = str;
        }

        @Override // com.bbva.cells.component.kit.datamanager.domain.usecase.UseCase.UseCaseErrorCallback
        public final void onUseCaseError(Throwable it) {
            ActionSpec<Exception> actionSpecACTION_SAVE_ERROR = PrefsStorageDataManager.INSTANCE.ACTION_SAVE_ERROR(this.f28084b);
            Intrinsics.checkExpressionValueIsNotNull(it, "it");
            PrefsStorageDataManager prefsStorageDataManager = PrefsStorageDataManager.this;
            prefsStorageDataManager.fire(actionSpecACTION_SAVE_ERROR, PrefsStorageDataManager.access$asException(prefsStorageDataManager, it));
        }
    }

    /* JADX INFO: compiled from: PrefsStorageDataManager.kt */
    public static final class c<T> implements UseCase.UseCaseSuccessCallback<Entry<? extends List<? extends T>>> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f28086b;

        public c(String str) {
            this.f28086b = str;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.bbva.cells.component.kit.datamanager.domain.usecase.UseCase.UseCaseSuccessCallback
        public final void onUseCaseComplete(Object obj) {
            PrefsStorageDataManager.this.fire(PrefsStorageDataManager.INSTANCE.ACTION_GET_SUCCESS(this.f28086b), ((Entry) obj).getValue());
        }
    }

    /* JADX INFO: compiled from: PrefsStorageDataManager.kt */
    public static final class c0<T> implements UseCase.UseCaseSuccessCallback<Unit> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f28088b;

        public c0(String str) {
            this.f28088b = str;
        }

        @Override // com.bbva.cells.component.kit.datamanager.domain.usecase.UseCase.UseCaseSuccessCallback
        public final void onUseCaseComplete(Unit unit) {
            PrefsStorageDataManager.this.fire(PrefsStorageDataManager.INSTANCE.ACTION_SAVE_SUCCESS(this.f28088b));
        }
    }

    /* JADX INFO: compiled from: PrefsStorageDataManager.kt */
    public static final class d implements UseCase.UseCaseErrorCallback {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f28090b;

        public d(String str) {
            this.f28090b = str;
        }

        @Override // com.bbva.cells.component.kit.datamanager.domain.usecase.UseCase.UseCaseErrorCallback
        public final void onUseCaseError(Throwable it) {
            ActionSpec<Exception> actionSpecACTION_GET_ERROR = PrefsStorageDataManager.INSTANCE.ACTION_GET_ERROR(this.f28090b);
            Intrinsics.checkExpressionValueIsNotNull(it, "it");
            PrefsStorageDataManager prefsStorageDataManager = PrefsStorageDataManager.this;
            prefsStorageDataManager.fire(actionSpecACTION_GET_ERROR, PrefsStorageDataManager.access$asException(prefsStorageDataManager, it));
        }
    }

    /* JADX INFO: compiled from: PrefsStorageDataManager.kt */
    public static final class d0 implements UseCase.UseCaseErrorCallback {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f28092b;

        public d0(String str) {
            this.f28092b = str;
        }

        @Override // com.bbva.cells.component.kit.datamanager.domain.usecase.UseCase.UseCaseErrorCallback
        public final void onUseCaseError(Throwable it) {
            ActionSpec<Exception> actionSpecACTION_SAVE_ERROR = PrefsStorageDataManager.INSTANCE.ACTION_SAVE_ERROR(this.f28092b);
            Intrinsics.checkExpressionValueIsNotNull(it, "it");
            PrefsStorageDataManager prefsStorageDataManager = PrefsStorageDataManager.this;
            prefsStorageDataManager.fire(actionSpecACTION_SAVE_ERROR, PrefsStorageDataManager.access$asException(prefsStorageDataManager, it));
        }
    }

    /* JADX INFO: compiled from: PrefsStorageDataManager.kt */
    public static final class e<T> implements UseCase.UseCaseSuccessCallback<Entry<? extends Map<String, ? extends Object>>> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f28094b;

        public e(String str) {
            this.f28094b = str;
        }

        @Override // com.bbva.cells.component.kit.datamanager.domain.usecase.UseCase.UseCaseSuccessCallback
        public final void onUseCaseComplete(Entry<? extends Map<String, ? extends Object>> entry) {
            PrefsStorageDataManager.this.fire(PrefsStorageDataManager.INSTANCE.ACTION_GET_SUCCESS(this.f28094b), entry.getValue());
        }
    }

    /* JADX INFO: compiled from: PrefsStorageDataManager.kt */
    public static final class e0<T> implements UseCase.UseCaseSuccessCallback<Unit> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f28096b;

        public e0(String str) {
            this.f28096b = str;
        }

        @Override // com.bbva.cells.component.kit.datamanager.domain.usecase.UseCase.UseCaseSuccessCallback
        public final void onUseCaseComplete(Unit unit) {
            PrefsStorageDataManager.this.fire(PrefsStorageDataManager.INSTANCE.ACTION_SAVE_SUCCESS(this.f28096b));
        }
    }

    /* JADX INFO: compiled from: PrefsStorageDataManager.kt */
    public static final class f implements UseCase.UseCaseErrorCallback {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f28098b;

        public f(String str) {
            this.f28098b = str;
        }

        @Override // com.bbva.cells.component.kit.datamanager.domain.usecase.UseCase.UseCaseErrorCallback
        public final void onUseCaseError(Throwable it) {
            ActionSpec<Exception> actionSpecACTION_GET_ERROR = PrefsStorageDataManager.INSTANCE.ACTION_GET_ERROR(this.f28098b);
            Intrinsics.checkExpressionValueIsNotNull(it, "it");
            PrefsStorageDataManager prefsStorageDataManager = PrefsStorageDataManager.this;
            prefsStorageDataManager.fire(actionSpecACTION_GET_ERROR, PrefsStorageDataManager.access$asException(prefsStorageDataManager, it));
        }
    }

    /* JADX INFO: compiled from: PrefsStorageDataManager.kt */
    public static final class f0 implements UseCase.UseCaseErrorCallback {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f28100b;

        public f0(String str) {
            this.f28100b = str;
        }

        @Override // com.bbva.cells.component.kit.datamanager.domain.usecase.UseCase.UseCaseErrorCallback
        public final void onUseCaseError(Throwable it) {
            ActionSpec<Exception> actionSpecACTION_SAVE_ERROR = PrefsStorageDataManager.INSTANCE.ACTION_SAVE_ERROR(this.f28100b);
            Intrinsics.checkExpressionValueIsNotNull(it, "it");
            PrefsStorageDataManager prefsStorageDataManager = PrefsStorageDataManager.this;
            prefsStorageDataManager.fire(actionSpecACTION_SAVE_ERROR, PrefsStorageDataManager.access$asException(prefsStorageDataManager, it));
        }
    }

    /* JADX INFO: compiled from: PrefsStorageDataManager.kt */
    public static final class g<T> implements UseCase.UseCaseSuccessCallback<Entry<? extends List<? extends Map<String, ? extends Object>>>> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f28102b;

        public g(String str) {
            this.f28102b = str;
        }

        @Override // com.bbva.cells.component.kit.datamanager.domain.usecase.UseCase.UseCaseSuccessCallback
        public final void onUseCaseComplete(Entry<? extends List<? extends Map<String, ? extends Object>>> entry) {
            PrefsStorageDataManager.this.fire(PrefsStorageDataManager.INSTANCE.ACTION_GET_SUCCESS(this.f28102b), entry.getValue());
        }
    }

    /* JADX INFO: compiled from: PrefsStorageDataManager.kt */
    public static final class g0<T> implements UseCase.UseCaseSuccessCallback<Unit> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f28104b;

        public g0(String str) {
            this.f28104b = str;
        }

        @Override // com.bbva.cells.component.kit.datamanager.domain.usecase.UseCase.UseCaseSuccessCallback
        public final void onUseCaseComplete(Unit unit) {
            PrefsStorageDataManager.this.fire(PrefsStorageDataManager.INSTANCE.ACTION_SAVE_SUCCESS(this.f28104b));
        }
    }

    /* JADX INFO: compiled from: PrefsStorageDataManager.kt */
    public static final class h implements UseCase.UseCaseErrorCallback {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f28106b;

        public h(String str) {
            this.f28106b = str;
        }

        @Override // com.bbva.cells.component.kit.datamanager.domain.usecase.UseCase.UseCaseErrorCallback
        public final void onUseCaseError(Throwable it) {
            ActionSpec<Exception> actionSpecACTION_GET_ERROR = PrefsStorageDataManager.INSTANCE.ACTION_GET_ERROR(this.f28106b);
            Intrinsics.checkExpressionValueIsNotNull(it, "it");
            PrefsStorageDataManager prefsStorageDataManager = PrefsStorageDataManager.this;
            prefsStorageDataManager.fire(actionSpecACTION_GET_ERROR, PrefsStorageDataManager.access$asException(prefsStorageDataManager, it));
        }
    }

    /* JADX INFO: compiled from: PrefsStorageDataManager.kt */
    public static final class i<T> implements UseCase.UseCaseSuccessCallback<Entry<? extends T>> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f28108b;

        public i(String str) {
            this.f28108b = str;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.bbva.cells.component.kit.datamanager.domain.usecase.UseCase.UseCaseSuccessCallback
        public final void onUseCaseComplete(Object obj) {
            PrefsStorageDataManager.this.fire(PrefsStorageDataManager.INSTANCE.ACTION_GET_SUCCESS(this.f28108b), ((Entry) obj).getValue());
        }
    }

    /* JADX INFO: compiled from: PrefsStorageDataManager.kt */
    public static final class j implements UseCase.UseCaseErrorCallback {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f28110b;

        public j(String str) {
            this.f28110b = str;
        }

        @Override // com.bbva.cells.component.kit.datamanager.domain.usecase.UseCase.UseCaseErrorCallback
        public final void onUseCaseError(Throwable it) {
            ActionSpec<Exception> actionSpecACTION_GET_ERROR = PrefsStorageDataManager.INSTANCE.ACTION_GET_ERROR(this.f28110b);
            Intrinsics.checkExpressionValueIsNotNull(it, "it");
            PrefsStorageDataManager prefsStorageDataManager = PrefsStorageDataManager.this;
            prefsStorageDataManager.fire(actionSpecACTION_GET_ERROR, PrefsStorageDataManager.access$asException(prefsStorageDataManager, it));
        }
    }

    /* JADX INFO: compiled from: PrefsStorageDataManager.kt */
    public static final class k<T> implements UseCase.UseCaseSuccessCallback<Unit> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f28112b;

        public k(String str) {
            this.f28112b = str;
        }

        @Override // com.bbva.cells.component.kit.datamanager.domain.usecase.UseCase.UseCaseSuccessCallback
        public final void onUseCaseComplete(Unit unit) {
            PrefsStorageDataManager.this.fire(PrefsStorageDataManager.INSTANCE.ACTION_REMOVE_SUCCESS(this.f28112b));
        }
    }

    /* JADX INFO: compiled from: PrefsStorageDataManager.kt */
    public static final class l implements UseCase.UseCaseErrorCallback {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f28114b;

        public l(String str) {
            this.f28114b = str;
        }

        @Override // com.bbva.cells.component.kit.datamanager.domain.usecase.UseCase.UseCaseErrorCallback
        public final void onUseCaseError(Throwable it) {
            ActionSpec<Exception> actionSpecACTION_REMOVE_ERROR = PrefsStorageDataManager.INSTANCE.ACTION_REMOVE_ERROR(this.f28114b);
            Intrinsics.checkExpressionValueIsNotNull(it, "it");
            PrefsStorageDataManager prefsStorageDataManager = PrefsStorageDataManager.this;
            prefsStorageDataManager.fire(actionSpecACTION_REMOVE_ERROR, PrefsStorageDataManager.access$asException(prefsStorageDataManager, it));
        }
    }

    /* JADX INFO: compiled from: PrefsStorageDataManager.kt */
    public static final class m extends Lambda implements Function0<SharedPreferencesRepository> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Context f28115p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(Context context) {
            super(0);
            this.f28115p0 = context;
        }

        @Override // kotlin.jvm.functions.Function0
        public final SharedPreferencesRepository invoke() {
            return new SharedPreferencesRepository(new SharedPreferencesDataSource(this.f28115p0));
        }
    }

    /* JADX INFO: compiled from: PrefsStorageDataManager.kt */
    public static final class n implements UseCase.UseCaseErrorCallback {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f28117b;

        public n(String str) {
            this.f28117b = str;
        }

        @Override // com.bbva.cells.component.kit.datamanager.domain.usecase.UseCase.UseCaseErrorCallback
        public final void onUseCaseError(Throwable it) {
            ActionSpec<Exception> actionSpecACTION_SAVE_ERROR = PrefsStorageDataManager.INSTANCE.ACTION_SAVE_ERROR(this.f28117b);
            Intrinsics.checkExpressionValueIsNotNull(it, "it");
            PrefsStorageDataManager prefsStorageDataManager = PrefsStorageDataManager.this;
            prefsStorageDataManager.fire(actionSpecACTION_SAVE_ERROR, PrefsStorageDataManager.access$asException(prefsStorageDataManager, it));
        }
    }

    /* JADX INFO: compiled from: PrefsStorageDataManager.kt */
    public static final class o<T> implements UseCase.UseCaseSuccessCallback<Unit> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f28119b;

        public o(String str) {
            this.f28119b = str;
        }

        @Override // com.bbva.cells.component.kit.datamanager.domain.usecase.UseCase.UseCaseSuccessCallback
        public final void onUseCaseComplete(Unit unit) {
            PrefsStorageDataManager.this.fire(PrefsStorageDataManager.INSTANCE.ACTION_SAVE_SUCCESS(this.f28119b));
        }
    }

    /* JADX INFO: compiled from: PrefsStorageDataManager.kt */
    public static final class p implements UseCase.UseCaseErrorCallback {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f28121b;

        public p(String str) {
            this.f28121b = str;
        }

        @Override // com.bbva.cells.component.kit.datamanager.domain.usecase.UseCase.UseCaseErrorCallback
        public final void onUseCaseError(Throwable it) {
            ActionSpec<Exception> actionSpecACTION_SAVE_ERROR = PrefsStorageDataManager.INSTANCE.ACTION_SAVE_ERROR(this.f28121b);
            Intrinsics.checkExpressionValueIsNotNull(it, "it");
            PrefsStorageDataManager prefsStorageDataManager = PrefsStorageDataManager.this;
            prefsStorageDataManager.fire(actionSpecACTION_SAVE_ERROR, PrefsStorageDataManager.access$asException(prefsStorageDataManager, it));
        }
    }

    /* JADX INFO: compiled from: PrefsStorageDataManager.kt */
    public static final class q<T> implements UseCase.UseCaseSuccessCallback<Unit> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f28123b;

        public q(String str) {
            this.f28123b = str;
        }

        @Override // com.bbva.cells.component.kit.datamanager.domain.usecase.UseCase.UseCaseSuccessCallback
        public final void onUseCaseComplete(Unit unit) {
            PrefsStorageDataManager.this.fire(PrefsStorageDataManager.INSTANCE.ACTION_SAVE_SUCCESS(this.f28123b));
        }
    }

    /* JADX INFO: compiled from: PrefsStorageDataManager.kt */
    public static final class r implements UseCase.UseCaseErrorCallback {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f28125b;

        public r(String str) {
            this.f28125b = str;
        }

        @Override // com.bbva.cells.component.kit.datamanager.domain.usecase.UseCase.UseCaseErrorCallback
        public final void onUseCaseError(Throwable it) {
            ActionSpec<Exception> actionSpecACTION_SAVE_ERROR = PrefsStorageDataManager.INSTANCE.ACTION_SAVE_ERROR(this.f28125b);
            Intrinsics.checkExpressionValueIsNotNull(it, "it");
            PrefsStorageDataManager prefsStorageDataManager = PrefsStorageDataManager.this;
            prefsStorageDataManager.fire(actionSpecACTION_SAVE_ERROR, PrefsStorageDataManager.access$asException(prefsStorageDataManager, it));
        }
    }

    /* JADX INFO: compiled from: PrefsStorageDataManager.kt */
    public static final class s<T> implements UseCase.UseCaseSuccessCallback<Unit> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f28127b;

        public s(String str) {
            this.f28127b = str;
        }

        @Override // com.bbva.cells.component.kit.datamanager.domain.usecase.UseCase.UseCaseSuccessCallback
        public final void onUseCaseComplete(Unit unit) {
            PrefsStorageDataManager.this.fire(PrefsStorageDataManager.INSTANCE.ACTION_SAVE_SUCCESS(this.f28127b));
        }
    }

    /* JADX INFO: compiled from: PrefsStorageDataManager.kt */
    public static final class t implements UseCase.UseCaseErrorCallback {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f28129b;

        public t(String str) {
            this.f28129b = str;
        }

        @Override // com.bbva.cells.component.kit.datamanager.domain.usecase.UseCase.UseCaseErrorCallback
        public final void onUseCaseError(Throwable it) {
            ActionSpec<Exception> actionSpecACTION_SAVE_ERROR = PrefsStorageDataManager.INSTANCE.ACTION_SAVE_ERROR(this.f28129b);
            Intrinsics.checkExpressionValueIsNotNull(it, "it");
            PrefsStorageDataManager prefsStorageDataManager = PrefsStorageDataManager.this;
            prefsStorageDataManager.fire(actionSpecACTION_SAVE_ERROR, PrefsStorageDataManager.access$asException(prefsStorageDataManager, it));
        }
    }

    /* JADX INFO: compiled from: PrefsStorageDataManager.kt */
    public static final class u<T> implements UseCase.UseCaseSuccessCallback<Unit> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f28131b;

        public u(String str) {
            this.f28131b = str;
        }

        @Override // com.bbva.cells.component.kit.datamanager.domain.usecase.UseCase.UseCaseSuccessCallback
        public final void onUseCaseComplete(Unit unit) {
            PrefsStorageDataManager.this.fire(PrefsStorageDataManager.INSTANCE.ACTION_SAVE_SUCCESS(this.f28131b));
        }
    }

    /* JADX INFO: compiled from: PrefsStorageDataManager.kt */
    public static final class v implements UseCase.UseCaseErrorCallback {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f28133b;

        public v(String str) {
            this.f28133b = str;
        }

        @Override // com.bbva.cells.component.kit.datamanager.domain.usecase.UseCase.UseCaseErrorCallback
        public final void onUseCaseError(Throwable it) {
            ActionSpec<Exception> actionSpecACTION_SAVE_ERROR = PrefsStorageDataManager.INSTANCE.ACTION_SAVE_ERROR(this.f28133b);
            Intrinsics.checkExpressionValueIsNotNull(it, "it");
            PrefsStorageDataManager prefsStorageDataManager = PrefsStorageDataManager.this;
            prefsStorageDataManager.fire(actionSpecACTION_SAVE_ERROR, PrefsStorageDataManager.access$asException(prefsStorageDataManager, it));
        }
    }

    /* JADX INFO: compiled from: PrefsStorageDataManager.kt */
    public static final class w<T> implements UseCase.UseCaseSuccessCallback<Unit> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f28135b;

        public w(String str) {
            this.f28135b = str;
        }

        @Override // com.bbva.cells.component.kit.datamanager.domain.usecase.UseCase.UseCaseSuccessCallback
        public final void onUseCaseComplete(Unit unit) {
            PrefsStorageDataManager.this.fire(PrefsStorageDataManager.INSTANCE.ACTION_SAVE_SUCCESS(this.f28135b));
        }
    }

    /* JADX INFO: compiled from: PrefsStorageDataManager.kt */
    public static final class x<T> implements UseCase.UseCaseSuccessCallback<Unit> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f28137b;

        public x(String str) {
            this.f28137b = str;
        }

        @Override // com.bbva.cells.component.kit.datamanager.domain.usecase.UseCase.UseCaseSuccessCallback
        public final void onUseCaseComplete(Unit unit) {
            PrefsStorageDataManager.this.fire(PrefsStorageDataManager.INSTANCE.ACTION_SAVE_SUCCESS(this.f28137b));
        }
    }

    /* JADX INFO: compiled from: PrefsStorageDataManager.kt */
    public static final class y implements UseCase.UseCaseErrorCallback {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f28139b;

        public y(String str) {
            this.f28139b = str;
        }

        @Override // com.bbva.cells.component.kit.datamanager.domain.usecase.UseCase.UseCaseErrorCallback
        public final void onUseCaseError(Throwable it) {
            ActionSpec<Exception> actionSpecACTION_SAVE_ERROR = PrefsStorageDataManager.INSTANCE.ACTION_SAVE_ERROR(this.f28139b);
            Intrinsics.checkExpressionValueIsNotNull(it, "it");
            PrefsStorageDataManager prefsStorageDataManager = PrefsStorageDataManager.this;
            prefsStorageDataManager.fire(actionSpecACTION_SAVE_ERROR, PrefsStorageDataManager.access$asException(prefsStorageDataManager, it));
        }
    }

    /* JADX INFO: compiled from: PrefsStorageDataManager.kt */
    public static final class z implements UseCase.UseCaseErrorCallback {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f28141b;

        public z(String str) {
            this.f28141b = str;
        }

        @Override // com.bbva.cells.component.kit.datamanager.domain.usecase.UseCase.UseCaseErrorCallback
        public final void onUseCaseError(Throwable it) {
            ActionSpec<Exception> actionSpecACTION_SAVE_ERROR = PrefsStorageDataManager.INSTANCE.ACTION_SAVE_ERROR(this.f28141b);
            Intrinsics.checkExpressionValueIsNotNull(it, "it");
            PrefsStorageDataManager prefsStorageDataManager = PrefsStorageDataManager.this;
            prefsStorageDataManager.fire(actionSpecACTION_SAVE_ERROR, PrefsStorageDataManager.access$asException(prefsStorageDataManager, it));
        }
    }

    public /* synthetic */ PrefsStorageDataManager(String str, Context context, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? ID : str, context);
    }

    @JvmStatic
    @NotNull
    public static final ActionSpec<Exception> ACTION_GET_ERROR(@NotNull String str) {
        return INSTANCE.ACTION_GET_ERROR(str);
    }

    @JvmStatic
    @NotNull
    public static final <T> ActionSpec<T> ACTION_GET_SUCCESS(@NotNull String str) {
        return INSTANCE.ACTION_GET_SUCCESS(str);
    }

    @JvmStatic
    @NotNull
    public static final ActionSpec<Exception> ACTION_REMOVE_ERROR(@NotNull String str) {
        return INSTANCE.ACTION_REMOVE_ERROR(str);
    }

    @JvmStatic
    @NotNull
    public static final ActionSpec<Void> ACTION_REMOVE_SUCCESS(@NotNull String str) {
        return INSTANCE.ACTION_REMOVE_SUCCESS(str);
    }

    @JvmStatic
    @NotNull
    public static final ActionSpec<Exception> ACTION_SAVE_ERROR(@NotNull String str) {
        return INSTANCE.ACTION_SAVE_ERROR(str);
    }

    @JvmStatic
    @NotNull
    public static final ActionSpec<Void> ACTION_SAVE_SUCCESS(@NotNull String str) {
        return INSTANCE.ACTION_SAVE_SUCCESS(str);
    }

    public static final Exception access$asException(PrefsStorageDataManager prefsStorageDataManager, Throwable th2) {
        prefsStorageDataManager.getClass();
        Exception exc = (Exception) (!(th2 instanceof Exception) ? null : th2);
        return exc != null ? exc : new Exception(th2);
    }

    public final SharedPreferencesRepository a() {
        KProperty kProperty = f28074r0[0];
        return (SharedPreferencesRepository) this.f28075p0.getValue();
    }

    public final void get(@NotNull String key) {
        new GetUseCase(a()).execute(key, new a(key), new b(key));
    }

    @Override // com.bbva.cells.component.kit.common.Component
    @NotNull
    /* JADX INFO: renamed from: getId, reason: from getter */
    public String getF28076q0() {
        return this.f28076q0;
    }

    public final <T extends Mappable> void getList(@NotNull String key, @NotNull Class<T> clazz) {
        new GetListUseCase(a()).execute(new EntryKey(key, clazz), new c(key), new d(key));
    }

    public final void getMap(@NotNull String key) {
        new GetMapUseCase(a()).execute(key, new e(key), new f(key));
    }

    public final void getMapList(@NotNull String key) {
        new GetMapListUseCase(a()).execute(key, new g(key), new h(key));
    }

    public final <T extends Mappable> void getObject(@NotNull String key, @NotNull Class<T> clazz) {
        new GetObjectUseCase(a()).execute(new EntryKey(key, clazz), new i(key), new j(key));
    }

    public final void remove(@NotNull String key) {
        new RemoveEntryUseCase(a()).execute(key, new k(key), new l(key));
    }

    public final <T extends Mappable> void save(@NotNull String key, @Nullable T value) {
        new SaveMappableUseCase(a()).execute(new Entry(key, value), new x(key), new z(key));
    }

    @JvmName(name = "saveMapList")
    public final void saveMapList(@NotNull String key, @Nullable List<? extends Map<String, ? extends Object>> value) {
        new SaveListMapUseCase(a()).execute(new Entry(key, value), new e0(key), new f0(key));
    }

    public PrefsStorageDataManager(@NotNull String str, @NotNull Context context) {
        this.f28076q0 = str;
        this.f28075p0 = LazyKt__LazyJVMKt.lazy(new m(context));
    }

    public final <T extends Mappable> void save(@NotNull String key, @Nullable List<? extends T> value) {
        new SaveListMappableUseCase(a()).execute(new Entry(key, value), new a0(key), new b0(key));
    }

    public final void save(@NotNull String key, @Nullable Map<String, ? extends Object> value) {
        new SaveMapUseCase(a()).execute(new Entry(key, value), new c0(key), new d0(key));
    }

    public final void save(@NotNull String key, @Nullable String value) {
        new SaveStringUseCase(a()).execute(new Entry(key, value), new g0(key), new n(key));
    }

    public final void save(@NotNull String key, @Nullable Set<String> value) {
        new SaveStringSetUseCase(a()).execute(new Entry(key, value), new o(key), new p(key));
    }

    public final void save(@NotNull String key, @Nullable Integer value) {
        new SaveIntUseCase(a()).execute(new Entry(key, value), new q(key), new r(key));
    }

    public final void save(@NotNull String key, @Nullable Long value) {
        new SaveLongUseCase(a()).execute(new Entry(key, value), new s(key), new t(key));
    }

    public final void save(@NotNull String key, @Nullable Float value) {
        new SaveFloatUseCase(a()).execute(new Entry(key, value), new u(key), new v(key));
    }

    public final void save(@NotNull String key, @Nullable Boolean value) {
        new SaveBooleanUseCase(a()).execute(new Entry(key, value), new w(key), new y(key));
    }
}
