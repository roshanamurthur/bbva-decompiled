package androidx.collection;

import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.proto.AtProtobuf;
import com.sun.mail.util.PropUtil;
import java.util.Properties;
import kotlin.ULong;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class f {
    public static long a(long j10, long j11) {
        return ULong.m5595constructorimpl(ULong.m5595constructorimpl(j10) * j11);
    }

    public static FieldDescriptor b(int i10, FieldDescriptor.Builder builder) {
        return builder.withProperty(AtProtobuf.builder().tag(i10).build()).build();
    }

    public static String c(StringBuilder sb2, String str, String str2, String str3) {
        sb2.append(str);
        sb2.append(str2);
        sb2.append(str3);
        return sb2.toString();
    }

    public static boolean d(String str, String str2, String str3, Properties properties, boolean z10) {
        return PropUtil.getBooleanProperty(properties, str + str2 + str3, z10);
    }
}
