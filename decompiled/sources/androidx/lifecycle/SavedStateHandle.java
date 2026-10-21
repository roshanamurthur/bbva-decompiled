package androidx.lifecycle;

import android.os.Binder;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import androidx.annotation.MainThread;
import androidx.annotation.RestrictTo;
import androidx.core.os.BundleKt;
import androidx.exifinterface.media.ExifInterface;
import androidx.savedstate.SavedStateRegistry;
import bk.q;
import bk.x;
import com.bbva.plugin.localstorage.command.RemoveCommand;
import com.bbva.plugin.localstorage.command.SetCommand;
import com.bbva.securesharing.plugin.SecureSharingCommandFactory;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: SavedStateHandle.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\b\u0007\u0018\u0000 !2\u00020\u0001:\u0002!\"B\u001f\b\u0016\u0012\u0014\u0010\u001d\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u001c¢\u0006\u0004\b\u001e\u0010\u001fB\t\b\u0016¢\u0006\u0004\b\u001e\u0010 J\b\u0010\u0003\u001a\u00020\u0002H\u0007J\u0011\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0087\u0002J\u001c\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t\"\u0004\b\u0000\u0010\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007J+\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t\"\u0004\b\u0000\u0010\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00028\u0000H\u0007¢\u0006\u0004\b\n\u0010\fJ+\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\r\"\u0004\b\u0000\u0010\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00028\u0000H\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u000e\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\u0010H\u0007J \u0010\u0012\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0087\u0002¢\u0006\u0004\b\u0012\u0010\u0013J(\u0010\u0016\u001a\u00020\u0015\"\u0004\b\u0000\u0010\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0014\u001a\u0004\u0018\u00018\u0000H\u0087\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u0018\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0018\u0010\u0013J\u0018\u0010\u001a\u001a\u00020\u00152\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u0002H\u0007J\u0010\u0010\u001b\u001a\u00020\u00152\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¨\u0006#"}, d2 = {"Landroidx/lifecycle/SavedStateHandle;", "", "Landroidx/savedstate/SavedStateRegistry$SavedStateProvider;", "savedStateProvider", "", "key", "", SecureSharingCommandFactory.ACTION_CONTAINS_VALUE, ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/lifecycle/MutableLiveData;", "getLiveData", "initialValue", "(Ljava/lang/String;Ljava/lang/Object;)Landroidx/lifecycle/MutableLiveData;", "Lkotlinx/coroutines/flow/StateFlow;", "getStateFlow", "(Ljava/lang/String;Ljava/lang/Object;)Lkotlinx/coroutines/flow/StateFlow;", "", "keys", "get", "(Ljava/lang/String;)Ljava/lang/Object;", "value", "", SetCommand.ID, "(Ljava/lang/String;Ljava/lang/Object;)V", RemoveCommand.ID, "provider", "setSavedStateProvider", "clearSavedStateProvider", "", "initialState", "<init>", "(Ljava/util/Map;)V", "()V", "Companion", "SavingStateLiveData", "lifecycle-viewmodel-savedstate_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nSavedStateHandle.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SavedStateHandle.kt\nandroidx/lifecycle/SavedStateHandle\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,489:1\n361#2,3:490\n364#2,4:494\n1#3:493\n*S KotlinDebug\n*F\n+ 1 SavedStateHandle.kt\nandroidx/lifecycle/SavedStateHandle\n*L\n227#1:490,3\n227#1:494,4\n*E\n"})
public final class SavedStateHandle {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public static final Class<? extends Object>[] f21980f = {Boolean.TYPE, boolean[].class, Double.TYPE, double[].class, Integer.TYPE, int[].class, Long.TYPE, long[].class, String.class, String[].class, Binder.class, Bundle.class, Byte.TYPE, byte[].class, Character.TYPE, char[].class, CharSequence.class, CharSequence[].class, ArrayList.class, Float.TYPE, float[].class, Parcelable.class, Parcelable[].class, Serializable.class, Short.TYPE, short[].class, SparseArray.class, Size.class, SizeF.class};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final LinkedHashMap f21981a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final LinkedHashMap f21982b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final LinkedHashMap f21983c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final LinkedHashMap f21984d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final SavedStateRegistry.SavedStateProvider f21985e;

    /* JADX INFO: compiled from: SavedStateHandle.kt */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001c\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0007J\u0012\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001H\u0007R \u0010\u0003\u001a\u0012\u0012\u000e\u0012\f\u0012\u0006\b\u0001\u0012\u00020\u0001\u0018\u00010\u00050\u0004X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0006R\u000e\u0010\u0007\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Landroidx/lifecycle/SavedStateHandle$Companion;", "", "()V", "ACCEPTABLE_CLASSES", "", "Ljava/lang/Class;", "[Ljava/lang/Class;", "KEYS", "", "VALUES", "createHandle", "Landroidx/lifecycle/SavedStateHandle;", "restoredState", "Landroid/os/Bundle;", "defaultState", "validateValue", "", "value", "lifecycle-viewmodel-savedstate_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        @NotNull
        public final SavedStateHandle createHandle(@Nullable Bundle restoredState, @Nullable Bundle defaultState) {
            if (restoredState == null) {
                if (defaultState == null) {
                    return new SavedStateHandle();
                }
                HashMap map = new HashMap();
                for (String key : defaultState.keySet()) {
                    Intrinsics.checkNotNullExpressionValue(key, "key");
                    map.put(key, defaultState.get(key));
                }
                return new SavedStateHandle(map);
            }
            ClassLoader classLoader = SavedStateHandle.class.getClassLoader();
            Intrinsics.checkNotNull(classLoader);
            restoredState.setClassLoader(classLoader);
            ArrayList parcelableArrayList = restoredState.getParcelableArrayList("keys");
            ArrayList parcelableArrayList2 = restoredState.getParcelableArrayList("values");
            if (parcelableArrayList == null || parcelableArrayList2 == null || parcelableArrayList.size() != parcelableArrayList2.size()) {
                throw new IllegalStateException("Invalid bundle passed as restored state".toString());
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            int size = parcelableArrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                Object obj = parcelableArrayList.get(i10);
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.String");
                linkedHashMap.put((String) obj, parcelableArrayList2.get(i10));
            }
            return new SavedStateHandle(linkedHashMap);
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public final boolean validateValue(@Nullable Object value) {
            if (value == null) {
                return true;
            }
            for (Class cls : SavedStateHandle.f21980f) {
                Intrinsics.checkNotNull(cls);
                if (cls.isInstance(value)) {
                    return true;
                }
            }
            return false;
        }
    }

    public SavedStateHandle(@NotNull Map<String, ? extends Object> initialState) {
        Intrinsics.checkNotNullParameter(initialState, "initialState");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.f21981a = linkedHashMap;
        this.f21982b = new LinkedHashMap();
        this.f21983c = new LinkedHashMap();
        this.f21984d = new LinkedHashMap();
        this.f21985e = new SavedStateRegistry.SavedStateProvider() { // from class: androidx.lifecycle.m
            @Override // androidx.savedstate.SavedStateRegistry.SavedStateProvider
            public final Bundle saveState() {
                return SavedStateHandle.a(this.f22184a);
            }
        };
        linkedHashMap.putAll(initialState);
    }

    public static Bundle a(SavedStateHandle this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        for (Map.Entry entry : q.toMap(this$0.f21982b).entrySet()) {
            this$0.set((String) entry.getKey(), ((SavedStateRegistry.SavedStateProvider) entry.getValue()).saveState());
        }
        LinkedHashMap linkedHashMap = this$0.f21981a;
        Set<String> setKeySet = linkedHashMap.keySet();
        ArrayList arrayList = new ArrayList(setKeySet.size());
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        for (String str : setKeySet) {
            arrayList.add(str);
            arrayList2.add(linkedHashMap.get(str));
        }
        return BundleKt.bundleOf(TuplesKt.to("keys", arrayList), TuplesKt.to("values", arrayList2));
    }

    @JvmStatic
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @NotNull
    public static final SavedStateHandle createHandle(@Nullable Bundle bundle, @Nullable Bundle bundle2) {
        return INSTANCE.createHandle(bundle, bundle2);
    }

    public final MutableLiveData b(Object obj, String str, boolean z10) {
        SavingStateLiveData savingStateLiveData;
        LinkedHashMap linkedHashMap = this.f21983c;
        Object obj2 = linkedHashMap.get(str);
        MutableLiveData mutableLiveData = obj2 instanceof MutableLiveData ? (MutableLiveData) obj2 : null;
        if (mutableLiveData != null) {
            return mutableLiveData;
        }
        LinkedHashMap linkedHashMap2 = this.f21981a;
        if (linkedHashMap2.containsKey(str)) {
            savingStateLiveData = new SavingStateLiveData(this, str, linkedHashMap2.get(str));
        } else if (z10) {
            linkedHashMap2.put(str, obj);
            savingStateLiveData = new SavingStateLiveData(this, str, obj);
        } else {
            savingStateLiveData = new SavingStateLiveData(this, str);
        }
        linkedHashMap.put(str, savingStateLiveData);
        return savingStateLiveData;
    }

    @MainThread
    public final void clearSavedStateProvider(@NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.f21982b.remove(key);
    }

    @MainThread
    public final boolean contains(@NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return this.f21981a.containsKey(key);
    }

    @MainThread
    @Nullable
    public final <T> T get(@NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        try {
            return (T) this.f21981a.get(key);
        } catch (ClassCastException unused) {
            remove(key);
            return null;
        }
    }

    @MainThread
    @NotNull
    public final <T> MutableLiveData<T> getLiveData(@NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        MutableLiveData<T> mutableLiveDataB = b(null, key, false);
        Intrinsics.checkNotNull(mutableLiveDataB, "null cannot be cast to non-null type androidx.lifecycle.MutableLiveData<T of androidx.lifecycle.SavedStateHandle.getLiveData>");
        return mutableLiveDataB;
    }

    @MainThread
    @NotNull
    public final <T> StateFlow<T> getStateFlow(@NotNull String key, T initialValue) {
        Intrinsics.checkNotNullParameter(key, "key");
        LinkedHashMap linkedHashMap = this.f21984d;
        Object objMutableStateFlow = linkedHashMap.get(key);
        if (objMutableStateFlow == null) {
            LinkedHashMap linkedHashMap2 = this.f21981a;
            if (!linkedHashMap2.containsKey(key)) {
                linkedHashMap2.put(key, initialValue);
            }
            objMutableStateFlow = StateFlowKt.MutableStateFlow(linkedHashMap2.get(key));
            linkedHashMap.put(key, objMutableStateFlow);
            linkedHashMap.put(key, objMutableStateFlow);
        }
        StateFlow<T> stateFlowAsStateFlow = FlowKt.asStateFlow((MutableStateFlow) objMutableStateFlow);
        Intrinsics.checkNotNull(stateFlowAsStateFlow, "null cannot be cast to non-null type kotlinx.coroutines.flow.StateFlow<T of androidx.lifecycle.SavedStateHandle.getStateFlow>");
        return stateFlowAsStateFlow;
    }

    @MainThread
    @NotNull
    public final Set<String> keys() {
        return x.plus(x.plus(this.f21981a.keySet(), (Iterable) this.f21982b.keySet()), (Iterable) this.f21983c.keySet());
    }

    @MainThread
    @Nullable
    public final <T> T remove(@NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        T t10 = (T) this.f21981a.remove(key);
        SavingStateLiveData savingStateLiveData = (SavingStateLiveData) this.f21983c.remove(key);
        if (savingStateLiveData != null) {
            savingStateLiveData.detach();
        }
        this.f21984d.remove(key);
        return t10;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @NotNull
    /* JADX INFO: renamed from: savedStateProvider, reason: from getter */
    public final SavedStateRegistry.SavedStateProvider getF21985e() {
        return this.f21985e;
    }

    @MainThread
    public final <T> void set(@NotNull String key, @Nullable T value) {
        Intrinsics.checkNotNullParameter(key, "key");
        if (!INSTANCE.validateValue(value)) {
            StringBuilder sb2 = new StringBuilder("Can't put value with type ");
            Intrinsics.checkNotNull(value);
            sb2.append(value.getClass());
            sb2.append(" into saved state");
            throw new IllegalArgumentException(sb2.toString());
        }
        Object obj = this.f21983c.get(key);
        MutableLiveData mutableLiveData = obj instanceof MutableLiveData ? (MutableLiveData) obj : null;
        if (mutableLiveData != null) {
            mutableLiveData.setValue(value);
        } else {
            this.f21981a.put(key, value);
        }
        MutableStateFlow mutableStateFlow = (MutableStateFlow) this.f21984d.get(key);
        if (mutableStateFlow == null) {
            return;
        }
        mutableStateFlow.setValue(value);
    }

    @MainThread
    public final void setSavedStateProvider(@NotNull String key, @NotNull SavedStateRegistry.SavedStateProvider provider) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(provider, "provider");
        this.f21982b.put(key, provider);
    }

    @MainThread
    @NotNull
    public final <T> MutableLiveData<T> getLiveData(@NotNull String key, T initialValue) {
        Intrinsics.checkNotNullParameter(key, "key");
        return b(initialValue, key, true);
    }

    /* JADX INFO: compiled from: SavedStateHandle.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B#\b\u0016\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\u0003\u001a\u00028\u0000¢\u0006\u0004\b\f\u0010\rB\u001b\b\u0016\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\u000eJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0006\u0010\u0007\u001a\u00020\u0004¨\u0006\u000f"}, d2 = {"Landroidx/lifecycle/SavedStateHandle$SavingStateLiveData;", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/lifecycle/MutableLiveData;", "value", "", "setValue", "(Ljava/lang/Object;)V", "detach", "Landroidx/lifecycle/SavedStateHandle;", "handle", "", "key", "<init>", "(Landroidx/lifecycle/SavedStateHandle;Ljava/lang/String;Ljava/lang/Object;)V", "(Landroidx/lifecycle/SavedStateHandle;Ljava/lang/String;)V", "lifecycle-viewmodel-savedstate_release"}, k = 1, mv = {1, 8, 0})
    public static final class SavingStateLiveData<T> extends MutableLiveData<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final String f21986a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        public SavedStateHandle f21987b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SavingStateLiveData(@Nullable SavedStateHandle savedStateHandle, @NotNull String key, T t10) {
            super(t10);
            Intrinsics.checkNotNullParameter(key, "key");
            this.f21986a = key;
            this.f21987b = savedStateHandle;
        }

        public final void detach() {
            this.f21987b = null;
        }

        @Override // androidx.lifecycle.MutableLiveData, androidx.lifecycle.LiveData
        public void setValue(T value) {
            SavedStateHandle savedStateHandle = this.f21987b;
            if (savedStateHandle != null) {
                Map map = savedStateHandle.f21981a;
                String str = this.f21986a;
                map.put(str, value);
                MutableStateFlow mutableStateFlow = (MutableStateFlow) savedStateHandle.f21984d.get(str);
                if (mutableStateFlow != null) {
                    mutableStateFlow.setValue(value);
                }
            }
            super.setValue(value);
        }

        public SavingStateLiveData(@Nullable SavedStateHandle savedStateHandle, @NotNull String key) {
            Intrinsics.checkNotNullParameter(key, "key");
            this.f21986a = key;
            this.f21987b = savedStateHandle;
        }
    }

    public SavedStateHandle() {
        this.f21981a = new LinkedHashMap();
        this.f21982b = new LinkedHashMap();
        this.f21983c = new LinkedHashMap();
        this.f21984d = new LinkedHashMap();
        this.f21985e = new SavedStateRegistry.SavedStateProvider() { // from class: androidx.lifecycle.m
            @Override // androidx.savedstate.SavedStateRegistry.SavedStateProvider
            public final Bundle saveState() {
                return SavedStateHandle.a(this.f22184a);
            }
        };
    }
}
