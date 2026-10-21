package com.sun.mail.util;

import java.io.InputStream;
import javax.mail.MessagingException;

/* JADX INFO: loaded from: classes9.dex */
public interface ReadableMime {
    InputStream getMimeStream() throws MessagingException;
}
