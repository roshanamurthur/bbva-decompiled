package com.mypinpad.tsdk.isolation;

import com.bbva.plugin.push.command.TrackMessageOpenedCommand;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/mypinpad/tsdk/i/abf;", "", "", "p0", "setDividerPadding", "(Ljava/lang/String;)Ljava/lang/Object;", "", "setOnFocusChangeListener", "(Ljava/lang/Object;)Z", "Ljava/lang/reflect/Method;", "p1", "p2", "<init>", "(Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;)V", "setY"}, k = 1, mv = {1, 6, 0})
public final class abf {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static int f52290d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static int f52291e = 1;

    /* JADX INFO: renamed from: setY, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final Method f52292a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final Method f52293b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final Method f52294c;

    /* JADX INFO: renamed from: com.mypinpad.tsdk.i.abf$setY, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/mypinpad/tsdk/i/abf$setY;", "", "Lcom/mypinpad/tsdk/i/abf;", "setCompoundDrawableTintBlendMode", "()Lcom/mypinpad/tsdk/i/abf;", "<init>", "()V"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public static abf setCompoundDrawableTintBlendMode() {
            return (abf) setDividerPadding(new Object[0], -1832712743, 1832712743, (int) System.currentTimeMillis());
        }

        public static /* synthetic */ Object setDividerPadding(Object[] objArr, int i10, int i11, int i12) {
            Method method;
            Method method2;
            Method method3;
            System.currentTimeMillis();
            System.currentTimeMillis();
            try {
                Class<?> cls = Class.forName("dalvik.system.CloseGuard");
                method = cls.getMethod("get", new Class[0]);
                method3 = cls.getMethod(TrackMessageOpenedCommand.ACTION, String.class);
                method2 = cls.getMethod("warnIfOpen", new Class[0]);
            } catch (Exception unused) {
                method = null;
                method2 = null;
                method3 = null;
            }
            return new abf(method, method3, method2);
        }
    }

    static {
        int i10 = f52290d;
        int i11 = ((i10 | 21) << 1) - (i10 ^ 21);
        f52291e = i11 % 128;
        int i12 = i11 % 2;
    }

    public abf(@Nullable Method method, @Nullable Method method2, @Nullable Method method3) {
        this.f52292a = method;
        this.f52293b = method2;
        this.f52294c = method3;
    }

    public static /* synthetic */ Object setX(Object[] objArr, int i10, int i11, int i12) {
        int i13 = ~i11;
        int i14 = ~i10;
        int i15 = ~i12;
        int i16 = (((~(i10 | i11)) | (~(i15 | i11)) | (~(i13 | i14))) * 494) + ((i11 | i14 | i15) * 494) + ((i10 | i13) * (-988)) + (i11 * (-493)) + (i10 * 495);
        boolean z10 = false;
        if (i16 != 1) {
            abf abfVar = (abf) objArr[0];
            Object obj = objArr[1];
            int i17 = f52291e;
            int i18 = (i17 | 47) << 1;
            int i19 = -(i17 ^ 47);
            int i20 = ((i18 | i19) << 1) - (i18 ^ i19);
            f52290d = i20 % 128;
            if (i20 % 2 == 0 ? obj != null : obj != null) {
                int i21 = i17 & 7;
                int i22 = -(-((i17 ^ 7) | i21));
                int i23 = ((i21 | i22) << 1) - (i22 ^ i21);
                f52290d = i23 % 128;
                int i24 = i23 % 2;
                try {
                    Method method = abfVar.f52294c;
                    Intrinsics.checkNotNull(method);
                    method.invoke(obj, new Object[0]);
                    int i25 = f52291e;
                    int i26 = i25 & 35;
                    int i27 = (i25 | 35) & (~i26);
                    int i28 = -(-(i26 << 1));
                    int i29 = (i27 ^ i28) + ((i27 & i28) << 1);
                    f52290d = i29 % 128;
                    int i30 = i29 % 2;
                    z10 = true;
                } catch (Exception unused) {
                }
            }
            int i31 = f52291e;
            int i32 = i31 & 89;
            int i33 = i32 + ((i31 ^ 89) | i32);
            f52290d = i33 % 128;
            int i34 = i33 % 2;
            return Boolean.valueOf(z10);
        }
        abf abfVar2 = (abf) objArr[0];
        String str = (String) objArr[1];
        int i35 = f52290d;
        int i36 = i35 | 87;
        int i37 = i36 << 1;
        int i38 = -((~(i35 & 87)) & i36);
        int i39 = ((i37 | i38) << 1) - (i38 ^ i37);
        f52291e = i39 % 128;
        int i40 = i39 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Method method2 = abfVar2.f52292a;
        if (method2 != null) {
            int i41 = f52291e;
            int i42 = i41 & 9;
            int i43 = -(-((i41 ^ 9) | i42));
            int i44 = ((i42 | i43) << 1) - (i43 ^ i42);
            f52290d = i44 % 128;
            int i45 = i44 % 2;
            try {
                Object objInvoke = method2.invoke(null, new Object[0]);
                Method method3 = abfVar2.f52293b;
                Intrinsics.checkNotNull(method3);
                method3.invoke(objInvoke, str);
                int i46 = f52291e;
                int i47 = i46 & 95;
                int i48 = (i46 ^ 95) | i47;
                int i49 = ((i47 | i48) << 1) - (i48 ^ i47);
                f52290d = i49 % 128;
                int i50 = i49 % 2;
                return objInvoke;
            } catch (Exception unused2) {
            }
        }
        int i51 = f52291e;
        int i52 = (i51 & 3) + (i51 | 3);
        f52290d = i52 % 128;
        if (i52 % 2 == 0) {
            return null;
        }
        throw null;
    }

    @Nullable
    public final Object setDividerPadding(@NotNull String p4) {
        return setX(new Object[]{this, p4}, 1668011896, -1668011895, System.identityHashCode(this));
    }

    public final boolean setOnFocusChangeListener(@Nullable Object p4) {
        return ((Boolean) setX(new Object[]{this, p4}, 476197562, -476197562, System.identityHashCode(this))).booleanValue();
    }
}
