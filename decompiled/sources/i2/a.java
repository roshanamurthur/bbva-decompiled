package i2;

import java.io.FileDescriptor;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.Socket;
import java.net.SocketAddress;
import java.net.SocketException;
import java.net.SocketImpl;

/* JADX INFO: compiled from: DatagramSocketWrapper.java */
/* JADX INFO: loaded from: classes2.dex */
public final class a extends Socket {

    /* JADX INFO: renamed from: i2.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: DatagramSocketWrapper.java */
    public static class C0293a extends SocketImpl {
        public C0293a(DatagramSocket datagramSocket, FileDescriptor fileDescriptor) {
            ((SocketImpl) this).localport = datagramSocket.getLocalPort();
            ((SocketImpl) this).fd = fileDescriptor;
        }

        @Override // java.net.SocketImpl
        public final void accept(SocketImpl socketImpl) throws IOException {
            throw new UnsupportedOperationException();
        }

        @Override // java.net.SocketImpl
        public final int available() throws IOException {
            throw new UnsupportedOperationException();
        }

        @Override // java.net.SocketImpl
        public final void bind(InetAddress inetAddress, int i10) throws IOException {
            throw new UnsupportedOperationException();
        }

        @Override // java.net.SocketImpl
        public final void close() throws IOException {
            throw new UnsupportedOperationException();
        }

        @Override // java.net.SocketImpl
        public final void connect(String str, int i10) throws IOException {
            throw new UnsupportedOperationException();
        }

        @Override // java.net.SocketImpl
        public final void create(boolean z10) throws IOException {
            throw new UnsupportedOperationException();
        }

        @Override // java.net.SocketImpl
        public final InputStream getInputStream() throws IOException {
            throw new UnsupportedOperationException();
        }

        @Override // java.net.SocketOptions
        public final Object getOption(int i10) throws SocketException {
            throw new UnsupportedOperationException();
        }

        @Override // java.net.SocketImpl
        public final OutputStream getOutputStream() throws IOException {
            throw new UnsupportedOperationException();
        }

        @Override // java.net.SocketImpl
        public final void listen(int i10) throws IOException {
            throw new UnsupportedOperationException();
        }

        @Override // java.net.SocketImpl
        public final void sendUrgentData(int i10) throws IOException {
            throw new UnsupportedOperationException();
        }

        @Override // java.net.SocketOptions
        public final void setOption(int i10, Object obj) throws SocketException {
            throw new UnsupportedOperationException();
        }

        @Override // java.net.SocketImpl
        public final void connect(InetAddress inetAddress, int i10) throws IOException {
            throw new UnsupportedOperationException();
        }

        @Override // java.net.SocketImpl
        public final void connect(SocketAddress socketAddress, int i10) throws IOException {
            throw new UnsupportedOperationException();
        }
    }

    public a(DatagramSocket datagramSocket, FileDescriptor fileDescriptor) throws SocketException {
        super(new C0293a(datagramSocket, fileDescriptor));
    }
}
