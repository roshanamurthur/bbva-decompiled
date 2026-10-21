package eg;

import com.google.firebase.encoders.EncodingException;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.json.JsonDataEncoderBuilder;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class a implements ObjectEncoder {
    @Override // com.google.firebase.encoders.ObjectEncoder
    public final void encode(Object obj, Object obj2) {
        a aVar = JsonDataEncoderBuilder.f48364e;
        throw new EncodingException("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
    }
}
