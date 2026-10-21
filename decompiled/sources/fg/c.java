package fg;

import com.google.firebase.encoders.EncodingException;
import com.google.firebase.encoders.ObjectEncoder;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class c implements ObjectEncoder {
    @Override // com.google.firebase.encoders.ObjectEncoder
    public final void encode(Object obj, Object obj2) {
        throw new EncodingException("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
    }
}
