package eg;

import com.google.firebase.encoders.ValueEncoder;
import com.google.firebase.encoders.ValueEncoderContext;
import com.google.firebase.encoders.json.JsonDataEncoderBuilder;
import java.io.IOException;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class b implements ValueEncoder {
    @Override // com.google.firebase.encoders.ValueEncoder
    public final void encode(Object obj, Object obj2) throws IOException {
        a aVar = JsonDataEncoderBuilder.f48364e;
        ((ValueEncoderContext) obj2).add((String) obj);
    }
}
