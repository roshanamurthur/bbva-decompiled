package androidx.datastore.preferences.core;

import androidx.datastore.core.CorruptionException;
import androidx.datastore.core.Serializer;
import androidx.datastore.preferences.PreferencesMapCompat;
import androidx.datastore.preferences.PreferencesProto;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: PreferencesSerializer.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u001b\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006J#\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u0012\u001a\u00020\r8\u0006X\u0086D¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0015\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0018"}, d2 = {"Landroidx/datastore/preferences/core/PreferencesSerializer;", "Landroidx/datastore/core/Serializer;", "Landroidx/datastore/preferences/core/Preferences;", "Ljava/io/InputStream;", "input", "readFrom", "(Ljava/io/InputStream;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "t", "Ljava/io/OutputStream;", "output", "", "writeTo", "(Landroidx/datastore/preferences/core/Preferences;Ljava/io/OutputStream;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "a", "Ljava/lang/String;", "getFileExtension", "()Ljava/lang/String;", "fileExtension", "getDefaultValue", "()Landroidx/datastore/preferences/core/Preferences;", "defaultValue", "<init>", "()V", "datastore-preferences-core"}, k = 1, mv = {1, 5, 1})
public final class PreferencesSerializer implements Serializer<Preferences> {

    @NotNull
    public static final PreferencesSerializer INSTANCE = new PreferencesSerializer();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final String fileExtension = "preferences_pb";

    /* JADX INFO: compiled from: PreferencesSerializer.kt */
    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PreferencesProto.Value.ValueCase.values().length];
            iArr[PreferencesProto.Value.ValueCase.BOOLEAN.ordinal()] = 1;
            iArr[PreferencesProto.Value.ValueCase.FLOAT.ordinal()] = 2;
            iArr[PreferencesProto.Value.ValueCase.DOUBLE.ordinal()] = 3;
            iArr[PreferencesProto.Value.ValueCase.INTEGER.ordinal()] = 4;
            iArr[PreferencesProto.Value.ValueCase.LONG.ordinal()] = 5;
            iArr[PreferencesProto.Value.ValueCase.STRING.ordinal()] = 6;
            iArr[PreferencesProto.Value.ValueCase.STRING_SET.ordinal()] = 7;
            iArr[PreferencesProto.Value.ValueCase.VALUE_NOT_SET.ordinal()] = 8;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @NotNull
    public final String getFileExtension() {
        return fileExtension;
    }

    @Override // androidx.datastore.core.Serializer
    @Nullable
    public Object readFrom(@NotNull InputStream inputStream, @NotNull Continuation<? super Preferences> continuation) throws IOException {
        PreferencesProto.PreferenceMap from = PreferencesMapCompat.INSTANCE.readFrom(inputStream);
        MutablePreferences mutablePreferencesCreateMutable = PreferencesFactory.createMutable(new Preferences.Pair[0]);
        Map<String, PreferencesProto.Value> preferencesMap = from.getPreferencesMap();
        Intrinsics.checkNotNullExpressionValue(preferencesMap, "preferencesProto.preferencesMap");
        for (Map.Entry<String, PreferencesProto.Value> entry : preferencesMap.entrySet()) {
            String name = entry.getKey();
            PreferencesProto.Value value = entry.getValue();
            PreferencesSerializer preferencesSerializer = INSTANCE;
            Intrinsics.checkNotNullExpressionValue(name, "name");
            Intrinsics.checkNotNullExpressionValue(value, "value");
            preferencesSerializer.getClass();
            PreferencesProto.Value.ValueCase valueCase = value.getValueCase();
            switch (valueCase == null ? -1 : WhenMappings.$EnumSwitchMapping$0[valueCase.ordinal()]) {
                case -1:
                    throw new CorruptionException("Value case is null.", null, 2, null);
                case 0:
                default:
                    throw new NoWhenBranchMatchedException();
                case 1:
                    mutablePreferencesCreateMutable.set(PreferencesKeys.booleanKey(name), Boolean.valueOf(value.getBoolean()));
                    break;
                case 2:
                    mutablePreferencesCreateMutable.set(PreferencesKeys.floatKey(name), Float.valueOf(value.getFloat()));
                    break;
                case 3:
                    mutablePreferencesCreateMutable.set(PreferencesKeys.doubleKey(name), Double.valueOf(value.getDouble()));
                    break;
                case 4:
                    mutablePreferencesCreateMutable.set(PreferencesKeys.intKey(name), Integer.valueOf(value.getInteger()));
                    break;
                case 5:
                    mutablePreferencesCreateMutable.set(PreferencesKeys.longKey(name), Long.valueOf(value.getLong()));
                    break;
                case 6:
                    Preferences.Key<String> keyStringKey = PreferencesKeys.stringKey(name);
                    String string = value.getString();
                    Intrinsics.checkNotNullExpressionValue(string, "value.string");
                    mutablePreferencesCreateMutable.set(keyStringKey, string);
                    break;
                case 7:
                    Preferences.Key<Set<String>> keyStringSetKey = PreferencesKeys.stringSetKey(name);
                    List<String> stringsList = value.getStringSet().getStringsList();
                    Intrinsics.checkNotNullExpressionValue(stringsList, "value.stringSet.stringsList");
                    mutablePreferencesCreateMutable.set(keyStringSetKey, CollectionsKt___CollectionsKt.toSet(stringsList));
                    break;
                case 8:
                    throw new CorruptionException("Value not set.", null, 2, null);
            }
        }
        return mutablePreferencesCreateMutable.toPreferences();
    }

    @Override // androidx.datastore.core.Serializer
    public /* bridge */ /* synthetic */ Object writeTo(Preferences preferences, OutputStream outputStream, Continuation continuation) {
        return writeTo2(preferences, outputStream, (Continuation<? super Unit>) continuation);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.datastore.core.Serializer
    @NotNull
    public Preferences getDefaultValue() {
        return PreferencesFactory.createEmpty();
    }

    @Nullable
    /* JADX INFO: renamed from: writeTo, reason: avoid collision after fix types in other method */
    public Object writeTo2(@NotNull Preferences preferences, @NotNull OutputStream outputStream, @NotNull Continuation<? super Unit> continuation) throws IOException {
        PreferencesProto.Value valueBuild;
        Map<Preferences.Key<?>, Object> mapAsMap = preferences.asMap();
        PreferencesProto.PreferenceMap.Builder builderNewBuilder = PreferencesProto.PreferenceMap.newBuilder();
        for (Map.Entry<Preferences.Key<?>, Object> entry : mapAsMap.entrySet()) {
            Preferences.Key<?> key = entry.getKey();
            Object value = entry.getValue();
            String name = key.getName();
            if (value instanceof Boolean) {
                valueBuild = PreferencesProto.Value.newBuilder().setBoolean(((Boolean) value).booleanValue()).build();
                Intrinsics.checkNotNullExpressionValue(valueBuild, "newBuilder().setBoolean(value).build()");
            } else if (value instanceof Float) {
                valueBuild = PreferencesProto.Value.newBuilder().setFloat(((Number) value).floatValue()).build();
                Intrinsics.checkNotNullExpressionValue(valueBuild, "newBuilder().setFloat(value).build()");
            } else if (value instanceof Double) {
                valueBuild = PreferencesProto.Value.newBuilder().setDouble(((Number) value).doubleValue()).build();
                Intrinsics.checkNotNullExpressionValue(valueBuild, "newBuilder().setDouble(value).build()");
            } else if (value instanceof Integer) {
                valueBuild = PreferencesProto.Value.newBuilder().setInteger(((Number) value).intValue()).build();
                Intrinsics.checkNotNullExpressionValue(valueBuild, "newBuilder().setInteger(value).build()");
            } else if (value instanceof Long) {
                valueBuild = PreferencesProto.Value.newBuilder().setLong(((Number) value).longValue()).build();
                Intrinsics.checkNotNullExpressionValue(valueBuild, "newBuilder().setLong(value).build()");
            } else if (value instanceof String) {
                valueBuild = PreferencesProto.Value.newBuilder().setString((String) value).build();
                Intrinsics.checkNotNullExpressionValue(valueBuild, "newBuilder().setString(value).build()");
            } else {
                if (!(value instanceof Set)) {
                    throw new IllegalStateException(Intrinsics.stringPlus("PreferencesSerializer does not support type: ", value.getClass().getName()));
                }
                valueBuild = PreferencesProto.Value.newBuilder().setStringSet(PreferencesProto.StringSet.newBuilder().addAllStrings((Set) value)).build();
                Intrinsics.checkNotNullExpressionValue(valueBuild, "newBuilder().setStringSet(\n                    StringSet.newBuilder().addAllStrings(value as Set<String>)\n                ).build()");
            }
            builderNewBuilder.putPreferences(name, valueBuild);
        }
        builderNewBuilder.build().writeTo(outputStream);
        return Unit.INSTANCE;
    }
}
