package com.sun.mail.imap.protocol;

import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.sun.mail.iap.ProtocolException;
import com.sun.mail.iap.Response;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes9.dex */
public class Namespaces {
    public Namespace[] otherUsers;
    public Namespace[] personal;
    public Namespace[] shared;

    public static class Namespace {
        public char delimiter;
        public String prefix;

        public Namespace(Response response) throws ProtocolException {
            if (!response.isNextNonSpace(RootService.OPEN_BRACKET)) {
                throw new ProtocolException("Missing '(' at start of Namespace");
            }
            this.prefix = response.readString();
            if (!response.supportsUtf8()) {
                this.prefix = BASE64MailboxDecoder.decode(this.prefix);
            }
            response.skipSpaces();
            if (response.peekByte() == 34) {
                response.readByte();
                char c10 = (char) response.readByte();
                this.delimiter = c10;
                if (c10 == '\\') {
                    this.delimiter = (char) response.readByte();
                }
                if (response.readByte() != 34) {
                    throw new ProtocolException("Missing '\"' at end of QUOTED_CHAR");
                }
            } else {
                String atom = response.readAtom();
                if (atom == null) {
                    throw new ProtocolException("Expected NIL, got null");
                }
                if (!atom.equalsIgnoreCase("NIL")) {
                    throw new ProtocolException("Expected NIL, got ".concat(atom));
                }
                this.delimiter = (char) 0;
            }
            if (response.isNextNonSpace(RootService.CLOSE_BRACKET)) {
                return;
            }
            response.readString();
            response.skipSpaces();
            response.readStringList();
            if (!response.isNextNonSpace(RootService.CLOSE_BRACKET)) {
                throw new ProtocolException("Missing ')' at end of Namespace");
            }
        }
    }

    public Namespaces(Response response) throws ProtocolException {
        this.personal = a(response);
        this.otherUsers = a(response);
        this.shared = a(response);
    }

    public static Namespace[] a(Response response) throws ProtocolException {
        if (response.isNextNonSpace(RootService.OPEN_BRACKET)) {
            ArrayList arrayList = new ArrayList();
            do {
                arrayList.add(new Namespace(response));
            } while (!response.isNextNonSpace(RootService.CLOSE_BRACKET));
            return (Namespace[]) arrayList.toArray(new Namespace[arrayList.size()]);
        }
        String atom = response.readAtom();
        if (atom == null) {
            throw new ProtocolException("Expected NIL, got null");
        }
        if (atom.equalsIgnoreCase("NIL")) {
            return null;
        }
        throw new ProtocolException("Expected NIL, got ".concat(atom));
    }
}
