package fg;

import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import java.io.IOException;
import java.util.Map;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class b implements ObjectEncoder {
    @Override // com.google.firebase.encoders.ObjectEncoder
    public final void encode(Object obj, Object obj2) throws IOException {
        Map.Entry entry = (Map.Entry) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        objectEncoderContext.add(com.google.firebase.encoders.proto.a.f48386g, entry.getKey());
        objectEncoderContext.add(com.google.firebase.encoders.proto.a.f48387h, entry.getValue());
    }
}
