package androidx.compose.runtime.internal;

import androidx.compose.runtime.ComposeCompilerApi;
import androidx.compose.runtime.InternalComposeApi;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.exifinterface.media.ExifInterface;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: LiveLiteral.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\u001a\b\u0010\u0001\u001a\u00020\u0000H\u0007\u001a+\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00028\u0000H\u0007¢\u0006\u0004\b\u0007\u0010\b\u001a\u001a\u0010\n\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\tH\u0007\"*\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b8\u0006@BX\u0087\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u0012\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, d2 = {"", "enableLiveLiterals", ExifInterface.GPS_DIRECTION_TRUE, "", "key", "value", "Landroidx/compose/runtime/State;", "liveLiteral", "(Ljava/lang/String;Ljava/lang/Object;)Landroidx/compose/runtime/State;", "", "updateLiveLiteralValue", "", "<set-?>", "b", "Z", "isLiveLiteralsEnabled", "()Z", "isLiveLiteralsEnabled$annotations", "()V", "runtime_release"}, k = 2, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nLiveLiteral.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LiveLiteral.kt\nandroidx/compose/runtime/internal/LiveLiteralKt\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,100:1\n361#2,7:101\n361#2,7:108\n*S KotlinDebug\n*F\n+ 1 LiveLiteral.kt\nandroidx/compose/runtime/internal/LiveLiteralKt\n*L\n81#1:101,7\n92#1:108,7\n*E\n"})
public final class LiveLiteralKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final HashMap<String, MutableState<Object>> f15182a = new HashMap<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static boolean f15183b;

    @InternalComposeApi
    public static final void enableLiveLiterals() {
        f15183b = true;
    }

    public static final boolean isLiveLiteralsEnabled() {
        return f15183b;
    }

    @ComposeCompilerApi
    @InternalComposeApi
    @NotNull
    public static final <T> State<T> liveLiteral(@NotNull String str, T t10) {
        HashMap<String, MutableState<Object>> map = f15182a;
        MutableState<Object> mutableStateMutableStateOf$default = map.get(str);
        if (mutableStateMutableStateOf$default == null) {
            mutableStateMutableStateOf$default = SnapshotStateKt.mutableStateOf$default(t10, null, 2, null);
            map.put(str, mutableStateMutableStateOf$default);
        }
        Intrinsics.checkNotNull(mutableStateMutableStateOf$default, "null cannot be cast to non-null type androidx.compose.runtime.State<T of androidx.compose.runtime.internal.LiveLiteralKt.liveLiteral>");
        return mutableStateMutableStateOf$default;
    }

    @InternalComposeApi
    public static final void updateLiveLiteralValue(@NotNull String str, @Nullable Object obj) {
        boolean z10;
        HashMap<String, MutableState<Object>> map = f15182a;
        MutableState<Object> mutableStateMutableStateOf$default = map.get(str);
        if (mutableStateMutableStateOf$default == null) {
            mutableStateMutableStateOf$default = SnapshotStateKt.mutableStateOf$default(obj, null, 2, null);
            map.put(str, mutableStateMutableStateOf$default);
            z10 = false;
        } else {
            z10 = true;
        }
        MutableState<Object> mutableState = mutableStateMutableStateOf$default;
        if (z10) {
            mutableState.setValue(obj);
        }
    }

    @ComposeCompilerApi
    @InternalComposeApi
    public static /* synthetic */ void isLiveLiteralsEnabled$annotations() {
    }
}
